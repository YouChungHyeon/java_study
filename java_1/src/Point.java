public class Point {
    int xpos, ypos;
    void  setPoint(int x, int y) {
        xpos = x;
        ypos = y;
    }

    int getXpos() {
        return xpos;
    }

    int getYpos() {
        return ypos;
    }

    public static void methodTest(Point point) {
        point.setPoint(4,5);
    }


    public static void main(String[] args) {
        Point point = new Point();
        System.out.println("xpos : " + point.getXpos() + ", ypos : " + point.getYpos());
        methodTest(point);
        System.out.println("xpos : " + point.getXpos() + ", ypos : " + point.getYpos());
    }


}
