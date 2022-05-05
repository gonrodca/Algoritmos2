package grafo;

import lista.*;

public class Grafo {

    private final int tope;
    private String[] vertices;
    private Arista[][] matAdy;


    //Definir atributos

    public Grafo(int unTope) {
       this.vertices = new String[unTope];
       this.matAdy = new Arista[unTope][unTope];
       this.tope = unTope;

       for(int i = 0; i < matAdy.length; i ++){
           for(int j = 0; j < matAdy[i].length; j ++){
               matAdy[i][j] = new Arista();
           }
       }
    }

    public boolean esLleno() {
        //Implementar...
        return false;
    }

    public boolean esVacio() {
        //Implementar...
        return false;
    }

    // PRE: !esLleno()
    private int obtenerPosLibre() {
        //Implementar...
        return -1;
    }

    private int obtenerPos(String vert) {
        //Implementar...
        for(int i = 0; i < vertices.length; i++){
            if(vertices[i].equals(vert)){
                return i;
            }
        }
        return -1;
    }

    // PRE: !esLleno && !existeVertice
    public void agregarVertice(String vert) {
        //Implementar...
    }

    // PRE: existeVertice
    public void borrarVertice(String vert) {
        //Implementar...
    }

    public boolean existeVertice(String vert) {
        //Implementar...
        return false;
    }

    // existeVertice(origen) && existeVertice(destino) && !existeArista
    public void agregarArista(String origen, String destino, int peso) {
        //Implementar...

    }

    // existeVertice(origen) && existeVertice(destino)
    public boolean existerArista(String origen, String destino) {
        //Implementar...
        return false;
    }

    // existeVertice(origen) && existeVertice(destino) && existeArista
    public void borrarArista(String origen, String destino) {
        //Implementar...
    }

    public Lista<String> verticesAdyacentes(String vert) {
        Lista<String> retorno = new ListaImp<>();
        //Implementar...
        return retorno;
    }

    // Pre: existeVertice(vert)
    public Lista<String> verticesIncidentes(String vert) {
        Lista<String> retorno = new ListaImp<>();
        //Implementar...
        return retorno;
    }

}
