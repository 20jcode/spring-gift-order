# step2

1. step1에서 만든 것에 대해서 정상 동작을 하는 지 테스트를 만들자.

2. 카카오 로그인과 회원가입서비스

3. 관리자 페이지 완성

4. 주문하기 서비스

---

일단 주문하기 서비스에 대해서 테스트를 만들고 테스트를 기반으로 동작을 구현하도록 하겠다.

왜냐하면 너무 느려져서...

---

구조를 생각하다보면 점점 더 시간이 느려진다.
일단 막 구현을 하고 그다음 리펙토링을 생각해보자?

서비스에 인터페이스를 왜 쓰는가??

일단 처음 서비스는 구조 파악을 위해 막 구현하고, 그다음 리펙토링을 하고 싶은데 기존의 코드를 수정하기 시작하면
다음 일정 등에 의해서 작업이 마감되지 않는 경우 점점 꼬이게 되는 것 같다.

그래서 서비스를 인터페이스로 만들고 쉽게 스위칭할 수 있게 하고 싶다.

지금은 하나하나 기프트 옵션, 위시리스트 리포지토리를 전부 접근해서 써야하는데 이게 맞는 방법인지?
