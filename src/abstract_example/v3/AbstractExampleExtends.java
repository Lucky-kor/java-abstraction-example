package abstract_example.v3;

public class AbstractExampleExtends extends AbstractExample{
    @Override
    void start() {
        System.out.println("상속받은 클래스에서 재 정의한 추상메서드입니다.");
    }
}
