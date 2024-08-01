package gift.repository;

import gift.option.entity.GiftOption;
import gift.product.entity.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaGiftOptionRepository extends JpaRepository<GiftOption, Long> {

    <S extends GiftOption> S save(S entity);

    Optional<GiftOption> findById(Long id);

    void deleteGiftOptionById(Long id);

    List<GiftOption> findAllByProduct(Product product);


}
