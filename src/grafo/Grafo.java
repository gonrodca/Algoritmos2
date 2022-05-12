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
        for(int i = 0; i< vertices.length;i++){
            if(vertices[i] == null){ return false; }
        }
        return true;
    }

    public boolean esVacio() {
        //Implementar...
        for(int i = 0; i< vertices.length;i++){
            if(vertices[i] != null){ return false; }
        }
        return true;


    }

    // PRE: !esLleno()
    private int obtenerPosLibre() {
        for(int i = 0; i <vertices.length;i++){
            if(vertices[i] == null) { return i; }
        }
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
        for(int i = 0; i < vertices.length; i++){
            if(vertices[i] == null){
                vertices[i] = vert;
                break;
            }
        }
    }

    // PRE: existeVertice
    public void borrarVertice(String vert) {
        for(int i = 0; i < vertices.length; i ++){
            if(vertices[i] == vert) {
                vertices[i] = null;
            }
        }
        //Implementar...
    }

    public boolean existeVertice(String vert) {
        //Implementar...
        for(int i = 0; i < vertices.length; i ++){
            if(vertices[i] == vert) {
                return true;
            }
        }
        return false;
    }

    // existeVertice(origen) && existeVertice(destino) && !existeArista
    public void agregarArista(String origen, String destino, int peso) {
        //Implementar...

        matAdy[obtenerPos(origen)][obtenerPos(destino)].setPeso(peso);
        matAdy[obtenerPos(origen)][obtenerPos(destino)].setExiste(true);



    }

    // existeVertice(origen) && existeVertice(destino)
    public boolean existerArista(String origen, String destino) {
        int posO = obtenerPos(origen);
        int posD = obtenerPos(destino);

        return matAdy[posO][posD].isExiste() || matAdy[posD][posO].isExiste();

    }


    // existeVertice(origen) && existeVertice(destino) && existeArista
    public void borrarArista(String origen, String destino) {
        //Implementar...
        int posO = obtenerPos(origen);
        int posD = obtenerPos(destino);
        matAdy[posO][posD].setExiste(false);
        matAdy[posO][posD].setPeso(0);
    }

    public Lista<String> verticesAdyacentes(String vert) {
        Lista<String> retorno = new ListaImp<>();
        int ubiV = obtenerPos(vert);
        for(int i = 0; i<vertices.length; i++){
            if(matAdy[ubiV][i].isExiste()){
                retorno.insertar(vertices[i]);
            }
        }
        //Implementar...
        return retorno;
    }

    // Pre: existeVertice(vert)
    public Lista<String> verticesIncidentes(String vert) {
        Lista<String> retorno = new ListaImp<>();
        int ubi = obtenerPos(vert);
        for(int i = 0; i < vertices.length; i++){
            if(matAdy[i][ubi].isExiste()){
                retorno.insertar(vertices[i]);
            }
        }
        //Implementar...
        return retorno;
    }

}
