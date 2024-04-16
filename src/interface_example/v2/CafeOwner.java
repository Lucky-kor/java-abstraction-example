package interface_example.v2;

public class CafeOwner {
    public void giveItem(Customer customer) {
        System.out.println("Item : " + customer.getOrder());
    }
}
