package cat.urv.deim.miv.laboratoris;

public class Vertex {
    int x, y;

    //Per cada  vertex guardem la seva coordenada x i y.
    public Vertex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public boolean equals(Vertex v) {
        if(x == v.getX() && y == v.getY()) return true;
        else return  false;
    }
    public int compareY(Vertex v) {
        if(y<v.y) return -1;
        else if(y>v.y) return  1;
        return 0;
    }

}
