package interface_example.v2;

public class OrderExample {
    public static void main(String[] args) throws Exception {
        CafeOwner cafeowner = new CafeOwner();
        Customer cafeCustomerA = new CafeCustomerA();
        Customer cafeCustomerB = new CafeCustomerB();

        cafeowner.giveItem(cafeCustomerA);
        cafeowner.giveItem(cafeCustomerB);
    }
}

// 출력값
// Item : a glass of iced americano
// Item : a glass of strawberry latte