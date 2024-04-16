package abstract_example.v2;

public class Main {
    public static void main(String[] args) {
        AbstractExample abstractExample = new AbstractExample() {
            @Override
            void start() {
                System.out.println("추상 클래스의 메서드를 재 정의합니다(오버라이딩)");
            }
        };
    }
}
