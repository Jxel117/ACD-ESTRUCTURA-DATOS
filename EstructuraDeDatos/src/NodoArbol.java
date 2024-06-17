public class NodoArbol extends Arbol{
    @Override
    public void enOrden(int dato) {

    }
    @Override
    public void preOrden(int dato) {

    }
    @Override
    public void postOrden(int dato) {

    }

    private Object nodoRaiz;
    private NodoArbol nodoIzquierdo;
    private NodoArbol nodoDerecho;
    private Object dato;

    // Constructor
    public NodoArbol(Object dato) {
        this.dato = dato;
        this.nodoIzquierdo = null;
        this.nodoDerecho = null;
    }

    // Métodos
    public Object obtenerValor() {
        return this.dato;
    }

    public void ingresarValor(Object dato) {
        this.dato = dato;
    }

    public void eliminarValor() {
        this.dato = null;
    }

    public void recorrerNodo() {
        // Implementación del recorrido del nodo
    }

    // Getters y setters para los nodos izquierdo y derecho
    public NodoArbol getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public void setNodoIzquierdo(NodoArbol nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }

    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(NodoArbol nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }
}
