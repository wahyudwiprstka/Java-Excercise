import java.util.Date;

public interface Order {
    Date date = new Date();
    String number = new String();

    public void confirm();
    public void close();
}
