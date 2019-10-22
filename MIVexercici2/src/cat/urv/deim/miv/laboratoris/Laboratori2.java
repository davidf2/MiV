package cat.urv.deim.miv.laboratoris;

import cat.urv.deim.miv.Application;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Laboratori2 extends Application {

    public static final long serialVersionUID = 1L;

    public Laboratori2() {
        super("Laboratori 2");
    }

    public static void main(String[] args) {
        Laboratori2 example = new Laboratori2();
        example.run();
    }


    // Practica 2, implementa defineDrawPolygon i defineFillPolygon
    // Hint: Pots utilitzar l'algorisme Scan line fill polygon

    // Inici codi de l'alumne

    public void paint() {
        int width = getPanelWidth();
        int height = getPanelHeight();

        // Poligon donat pel professor
        /*setColor(1.0f, 0.0f, 0.0f);
        fillPolygon(
                (int) (0.2f * width), (int) (0.6f * height),
                (int) (0.3f * width), (int) (0.1f * height),
                (int) (0.8f * width), (int) (0.4f * height),
                (int) (0.7f * width), (int) (0.7f * height),
                (int) (0.4f * width), (int) (0.9f * height));

        setColor(0.0f, 1.0f, 0.0f);
        drawPolygon(
                (int) (0.2f * width), (int) (0.6f * height),
                (int) (0.3f * width), (int) (0.1f * height),
                (int) (0.8f * width), (int) (0.4f * height),
                (int) (0.7f * width), (int) (0.7f * height),
                (int) (0.4f * width), (int) (0.9f * height));*/

        // Rectangle
        /*setColor(0.18f,0.15f,0.8f);
        fillPolygon(
                (int) (0.2f * width), (int) (0.2f * width),
                (int) (0.6f * width), (int) (0.2f * width),
                (int) (0.6f * width), (int) (0.4f * width),
                (int) (0.2f * width), (int) (0.4f * width));
        setColor(0.85f,0.57f,0.19f);
        drawPolygon(
                (int) (0.2f * width), (int) (0.2f * width),
                (int) (0.6f * width), (int) (0.2f * width),
                (int) (0.6f * width), (int) (0.4f * width),
                (int) (0.2f * width), (int) (0.4f * width));*/

        // Triangle
        /*setColor(0.93f,0.89f,0.18f);
        fillPolygon(
                (int) (0.2f * width), (int) (0.4f * width),
                (int) (0.4f * width), (int) (0.4f * width),
                (int) (0.3f * width), (int) (0.2f * width));

        setColor(0.18f,0.98f,0.99f);
        drawPolygon(
                (int) (0.2f * width), (int) (0.4f * width),
                (int) (0.4f * width), (int) (0.4f * width),
                (int) (0.3f * width), (int) (0.2f * width));*/

        // Poligon convex de 7 costats
        /*setColor(0.11f,0.79f,0.09f);
        fillPolygon(
                (int) (0.2f * width), (int) (0.3f * height),
                (int) (0.3f * width), (int) (0.2f * height),
                (int) (0.6f * width), (int) (0.3f * height),
                (int) (0.7f * width), (int) (0.5f * height),
                (int) (0.7f * width), (int) (0.7f * height),
                (int) (0.5f * width), (int) (0.9f * height),
                (int) (0.3f * width), (int) (0.7f * height));

        setColor(0.68f,0.15f,0.15f);
        drawPolygon(
                (int) (0.2f * width), (int) (0.3f * height),
                (int) (0.3f * width), (int) (0.2f * height),
                (int) (0.6f * width), (int) (0.3f * height),
                (int) (0.7f * width), (int) (0.5f * height),
                (int) (0.7f * width), (int) (0.7f * height),
                (int) (0.5f * width), (int) (0.9f * height),
                (int) (0.3f * width), (int) (0.7f * height));*/
        /*
        setColor(1.0f, 0.0f, 0.0f);
        fillPolygon(
                (int) (0.2f * width), (int) (0.6f * height),
                (int) (0.3f * width), (int) (0.1f * height),
                (int) (0.3f * width), (int) (0.5f * height),
                (int) (0.6f * width), (int) (0.7f * height),
                (int) (0.2f * width), (int) (0.9f * height));
         */


        setColor(1.0f, 0.0f, 0.0f);
        fillPolygon(
                (int) (0.2f * width), (int) (0.6f * height),
                (int) (0.3f * width), (int) (0.1f * height),
                (int) (0.8f * width), (int) (0.4f * height),
                (int) (0.7f * width), (int) (0.7f * height),
                (int) (0.4f * width), (int) (0.5f * height));

        setColor(0.0f, 1.0f, 0.0f);
        drawPolygon(
                (int) (0.2f * width), (int) (0.6f * height),
                (int) (0.3f * width), (int) (0.1f * height),
                (int) (0.8f * width), (int) (0.4f * height),
                (int) (0.7f * width), (int) (0.7f * height),
                (int) (0.4f * width), (int) (0.5f * height));

        /*setColor(1.0f, 0.0f, 0.0f);
        fillPolygon(
                (int) (0.2f * width), (int) (0.7f * height),
                (int) (0.4f * width), (int) (0.5f * height),
                (int) (0.6f * width), (int) (0.7f * height),
                (int) (0.4f * width), (int) (0.9f * height));

        setColor(0.0f, 1.0f, 0.0f);
        drawPolygon(
                (int) (0.2f * width), (int) (0.7f * height),
                (int) (0.4f * width), (int) (0.5f * height),
                (int) (0.6f * width), (int) (0.7f * height),
                (int) (0.4f * width), (int) (0.9f * height));*/

        /*fillPolygon(
                (int) (0.1f * width), (int) (0.7f * height),
                (int) (0.2f * width), (int) (0.4f * height),
                (int) (0.4f * width), (int) (0.5f * height),
                (int) (0.5f * width), (int) (0.2f * height),
                (int) (0.6f * width), (int) (0.3f * height),
                (int) (0.7f * width), (int) (0.1f * height),
                (int) (0.8f * width), (int) (0.4f * height),
                (int) (0.9f * width), (int) (0.7f * height),
                (int) (0.8f * width), (int) (0.9f * height),
                (int) (0.7f * width), (int) (0.6f * height),
                (int) (0.6f * width), (int) (0.8f * height),
                (int) (0.5f * width), (int) (0.5f * height),
                (int) (0.4f * width), (int) (0.9f * height),
                (int) (0.3f * width), (int) (0.6f * height),
                (int) (0.2f * width), (int) (0.8f * height));

        setColor(1.0f, 0.0f, 0.0f);
        drawPolygon(
                (int) (0.1f * width), (int) (0.7f * height),
                (int) (0.2f * width), (int) (0.4f * height),
                (int) (0.4f * width), (int) (0.5f * height),
                (int) (0.5f * width), (int) (0.2f * height),
                (int) (0.6f * width), (int) (0.3f * height),
                (int) (0.7f * width), (int) (0.1f * height),
                (int) (0.8f * width), (int) (0.4f * height),
                (int) (0.9f * width), (int) (0.7f * height),
                (int) (0.8f * width), (int) (0.9f * height),
                (int) (0.7f * width), (int) (0.6f * height),
                (int) (0.6f * width), (int) (0.8f * height),
                (int) (0.5f * width), (int) (0.5f * height),
                (int) (0.4f * width), (int) (0.9f * height),
                (int) (0.3f * width), (int) (0.6f * height),
                (int) (0.2f * width), (int) (0.8f * height));*/

    }

    public void defineDrawPolygon(Integer... p) {
        // TODO: has de ficar aqui el codi!
        int x1, y1, x2, y2;

        // Controlem que el nombre de parametres sigui correcte
        if (p.length < 6 || p.length % 2 != 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("El nombre de parametres ha de ser parell i major de 6");
            }
        }

        // Recorrem tots els vertes i per cada parell pintem una nova aresta
        x1 = p[0];
        y1 = p[1];
        for (int i = 2; i < p.length; i += 2) {
            x2 = p[i];
            y2 = p[i + 1];
            drawLine(x1, y1, x2, y2);
            x1 = x2;
            y1 = y2;
        }
        drawLine(p[p.length - 2], p[p.length - 1], p[0], p[1]); // Pintem la ultima aresta
    }

    // Fi codi de l'alumne

    public void defineFillPolygon(Integer... p) {
        // TODO: has de ficar aqui el codi!
        int x, y, i, ymin = Integer.MAX_VALUE, ymax = Integer.MIN_VALUE;
        int x1, y1, x2, y2;
        boolean primer = true;
        Vertex v1 = null, v2 = null;
        Aresta aresta;
        List<Aresta> arestas = new LinkedList<>();
        HashMap<Integer, Aresta> interseccionsHash = new HashMap();
        LinkedList<Integer> interseccions = new LinkedList<>();

        // Controlem que el nombre de parametres sigui correcte
        if (p.length < 6 || p.length % 2 != 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("El nombre de parametres ha de ser parell i major de 6");
            }
        }

        // Recorrem tots els vertes i per cada parell afegim una nova aresta
        x1 = p[0];
        y1 = p[1];
        for (i = 2; i < p.length; i += 2) {
            x2 = p[i];
            y2 = p[i + 1];
            aresta = new Aresta(x1, y1, x2, y2);
            arestas.add(new Aresta(x1, y1, x2, y2));
            // Comrpobem si les y que s'estan tractant son major que ymax o menor que ymin
            if (aresta.getV2().getY() > ymax) ymax = aresta.getV2().getY();
            if (aresta.getV1().getY() < ymin) ymin = aresta.getV1().getY();
            x1 = x2;
            y1 = y2;
        }
        aresta = new Aresta(p[p.length - 2], p[p.length - 1], p[0], p[1]);// Afegim la ultima aresta
        arestas.add(aresta);
        // Comrpobem si les y que s'estan tractant son major que ymax o menor que ymin
        if (aresta.getV2().getY() > ymax) ymax = aresta.getV2().getY();
        if (aresta.getV1().getY() < ymin) ymin = aresta.getV1().getY();

        for (y = ymin; y <= ymax; y++) {
            // Netegem la llista i la hash table per cada iteracio de y
            interseccions.clear();
            interseccionsHash.clear();

            /* Per cada aresta mirem si fa interseccio amb la recta y (y esta entre y1 i y2) i en cas afirmatiu
                calculem en quin punt es fa aillant la x amb lequacio de la recta (y-y1)=m(x-x1). Tambe controlem que
                no hi hagin punts dintersecció repetits, per a casos especials, mitjançant una hash table */
            for (Aresta a : arestas) {
                x = a.intersectionPoint(y);
                // Mirem que el resultat sigui positiu (existeix interseccio)
                if (x >= 0) {
                    // Mirem si la interseccio es repetida
                    if(interseccionsHash.containsKey(x)){
                        /* Si la interseccio es repetida mirem si comparteixen vertex, i en cas afirmatiu mirem els
                            extrem de y (y menor i y major)*/
                        interseccionsHash.get(x);
                        Integer[] aux =a.comparaVertex(a.getV1(),a.getV2());
                        if(aux!=null){
                            if(!((aux[1] < aux[0] && aux[2] > aux[0]) || (aux[1] > aux[0] && aux[2] < aux[0]))){
                                interseccions.add(x);
                            }
                        }
                    } else {
                        interseccions.add(x);
                        interseccionsHash.put(x, a); // Afegim el punt de tall a la taula de hash per controlar els punts repetits
                    }

                }
            }

            pintaDintre(interseccions,y);

        }
    }

    public void pintaDintre(LinkedList<Integer> interseccions, int y) {
        int i,x;
        if (interseccions.size() > 1) { // Si es dones que en aquell punt nomes fa una interseccio, la descartem
            interseccions.sort(Integer::compareTo); // Ordenem els punts de menor a major
                if(interseccions.size()%2==0){
                    for (i = 0; i < interseccions.size(); i += 2) { // Per cada parell de interseccions
                        for (x = interseccions.get(i); x < interseccions.get(i + 1); x++) { // Pintem els punts d'interseccio
                            drawPoint(x, y);
                        }
                    }
                }
                else{
                    for (i = 0; i < interseccions.size()-1; i ++) { // Per cada parell de interseccions
                        for (x = interseccions.get(i); x < interseccions.get(i + 1); x++) { // Pintem els punts d'interseccio
                            drawPoint(x, y);
                        }
                    }
                }

        }
    }

}
