public class Rectangle extends Shape {
    private int corner;

    Rectangle(int value){
        corner = value;
    }

    public void setCorner(int value){
        corner = value;
    }
    public int getCorner(){
        return corner;
    }
    public int getParentCorner(){
        return super.getCorner();
    }
}
