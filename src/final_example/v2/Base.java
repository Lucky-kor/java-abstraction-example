package final_example.v2;

// final 클래스: 더 이상 상속할 수 없음
final class Base {
    final int number = 42; // final 변수: 값 변경 불가

    // final 메서드: 오버라이딩 불가
    final void display() {
        System.out.println("This is a final method.");
    }
}