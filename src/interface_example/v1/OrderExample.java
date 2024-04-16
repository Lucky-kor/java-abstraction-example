package interface_example.v1;

public class OrderExample {
    public static void main(String[] args) throws Exception {
        CafeOwner cafeowner = new CafeOwner();
        CafeCustomerA a = new CafeCustomerA();
        CafeCustomerB b = new CafeCustomerB();

        cafeowner.giveItem(a);
        cafeowner.giveItem(b);
    }
}

// 출력값
// give a glass of iced americano to CafeCustomer A
// give a glass of strawberry latte to CafeCustomer B
