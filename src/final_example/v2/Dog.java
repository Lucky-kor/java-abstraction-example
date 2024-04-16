package final_example.v2;

class Dog extends Animal {
    // 다음 메서드는 컴파일 에러를 일으킴, breathe()는 Animal 클래스에서 final로 선언되었으므로
    // void breathe() {
    //     System.out.println("Dog breathing...");
    // }
}