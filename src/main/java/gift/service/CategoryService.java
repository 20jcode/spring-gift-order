package gift.service;

import gift.database.repository.JpaCategoryRepository;
import gift.dto.CategoryRequest;
import gift.dto.CategoryResponse;
import gift.model.Category;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CategoryService{

    private final JpaCategoryRepository jpaCategoryRepository;

    public CategoryService(JpaCategoryRepository jpaCategoryRepository) {
        this.jpaCategoryRepository = jpaCategoryRepository;
    }

    public List<CategoryResponse> readAll() {
        return jpaCategoryRepository.findAll()
            .stream()
            .map(CategoryResponse::new)
            .toList();

    }

    public void create(CategoryRequest categoryRequest) {
        Category category = getCategory(null, categoryRequest);

        jpaCategoryRepository.save(category);
    }


    public void update(long id, CategoryRequest categoryRequest) {
        Category category = getCategory(id, categoryRequest);
        jpaCategoryRepository.save(category);
    }

    public void delete(long id) {
        jpaCategoryRepository.deleteById(id);
    }

    private static Category getCategory(Long id, CategoryRequest categoryRequest) {
        return new Category(id,
            categoryRequest.getName(),
            categoryRequest.getColor(),
            categoryRequest.getDescription(),
            categoryRequest.getImageUrl());
    }

}
