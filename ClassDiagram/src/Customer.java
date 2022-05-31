public class Customer {
    private String name;
    private String location;

    public Customer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void sendOrder(){
        System.out.println("Sending the order");
    }

    public void receiveOrder(){
        System.out.println("Receiving order");
    }
}
