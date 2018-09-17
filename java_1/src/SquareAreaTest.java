class Square {
    private int horizonttal;
    private int vertical;
    private int area;
    Square(int h, int v) {
        horizonttal = h;
        vertical = v;
        area = horizonttal * vertical;
    }

    void SquareHV() {
        System.out.println("가로 : " + horizonttal);
        System.out.println("세로 : " + vertical);
    }

    void SquareArea() {
        System.out.print("넓이 : " + area);
    }
    int getArea() {
        return area;
    }
}

class Hexahedron {
    private int height;
    private int area;
    private Square square;
    Hexahedron(int h, int v, int hh) {
        square = new Square(h, v);
        height = hh;
        area = height * square.getArea();
    }

    void HexArea() {
        square.SquareHV();
        System.out.println("높이 : " + height);
        System.out.println("넓이 : " + area);
    }

}

class Figure {
    private Hexahedron hex;
    Figure(int h, int v, int hh) {
        hex = new Hexahedron(h, v, hh);
    }

    void info() {
        hex.HexArea();
    }
}

public class SquareAreaTest {
    public static void main(String[] args) {
        Figure fi = new Figure(3, 5, 9);
        fi.info();
    }
}
