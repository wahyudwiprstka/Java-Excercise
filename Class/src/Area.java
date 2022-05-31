public class Area {
    private float length;
    private float breadth;

    public void setDim(float l, float b){
        this.length = l;
        this.breadth = b;
    }

    public double getArea(){
        return length * breadth;
    }
}
