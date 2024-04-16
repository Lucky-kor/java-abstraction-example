package final_example.v2;

// 이 클래스는 Base 클래스를 상속받으려고 시도하지만, Base가 final 클래스이므로 컴파일 에러 발생
// class Derived extends Base { } // 상속 불가: 컴파일 에러

class Main {
    public static void main(String[] args) {
        Base obj = new Base();
        System.out.println(obj.number); // 상수 값 출력
        obj.display(); // final 메서드 호출
    }
}

