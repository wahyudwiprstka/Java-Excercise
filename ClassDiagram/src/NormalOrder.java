public class NormalOrder implements Order{

    @Override
    public void confirm() {
        System.out.println("Confirm to the customer");
    }

    @Override
    public void close() {
        System.out.println("Closing the order");
    }

    public void dispatch(){
        System.out.println("Dispatching the order");
    }

    public void receive(){
        System.out.println("Receiving the order");
    }
}
