package cat.urv.deim.miv.laboratoris;


public class Aresta {
    private Vertex v1, v2;
    private float dx, dy;

    public Aresta(int x1, int y1, int x2, int y2) {
        /* Guardem a v2 el vertex amb la y major i a v1 el vertex amb la y menor, per tal de despres mirar
            si y esta entre y1 i y2 */
        if (y1 > y2) {
            v1 = new Vertex(x2, y2);
            v2 = new Vertex(x1, y1);
        } else {
            v2 = new Vertex(x2, y2);
            v1 = new Vertex(x1, y1);
        }
        // Calculem els diferencials de x i de y
        dx = (float) (v2.getX() - v1.getX());
        dy = (float) (v2.getY() - v1.getY());
    }

    public int intersectionPoint(int y) {
        float x;

        // Treiem la coordenada x pel punt d'intersecció a la aresta, en la coordenada y
        x = (float) (y - v1.getY()) * dx / dy + v1.getX();
        // Descartem la aresta en cas de que y no estigui entre els dos vertex
        if (y < v1.getY() || y > v2.getY() || v1.getY() == v2.getY()) return -1;
        else return (int) x;
    }

    public Vertex getV1() {
        return v1;
    }

    public void setV1(Vertex v1) {
        this.v1 = v1;
    }

    public Vertex getV2() {
        return v2;
    }

    public void setV2(Vertex v2) {
        this.v2 = v2;
    }

    /* Funcio que retorna una llista amb 3 vertex o un valor null, si troba que dos vertex de diferents
        arestes son el mateix retornara a la posicio 0 el vertex equivalent, a la posicio 1 el vertex amb y menor
        i a la posicio 2 el vertex amb y major. */
    public Integer[] comparaVertex(Vertex v12, Vertex v22){
        Integer puntsY[] = null;

        //Miem que les dues arestes comparteixin vertex
        if(v1.equals(v12) || v1.equals(v22)) {
            puntsY = new Integer[3];
            puntsY[0]=v1.getY();
        }
        else if(v2.equals(v12) || v2.equals(v22)){
            puntsY = new Integer[3];
            puntsY[0]=v2.getY();
        }
        /* En cas afirmatiu guardem a una llista la y compartida pels vertex, i quina es la y menor y la y major,
            els dos extrems, daquesta manera podrem identificar si es concau o convexe i actuar de forma diferent */

        if(puntsY!=null){
            Vertex[] aux = {v1, v2, v12, v22};
            for (Vertex v: aux) {
                if(puntsY[1]==null){
                    puntsY[1]=v.getY();
                    puntsY[2]=v.getY();
                }
                else if(v.getY()<puntsY[1]){
                    puntsY[1]=v.getY();
                }
                else if(v.getY()>puntsY[2]){
                    puntsY[2]=v.getY();
                }
            }

        }

        return puntsY;
    }

    @Override
    public String toString() {
        return "Aresta{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", dx=" + dx +
                ", dy=" + dy +
                '}';
    }
}
