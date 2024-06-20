public abstract class Arbol {
    protected NodoArbol nodoRaiz;

    public abstract void enOrden();

    public abstract void postOrden();

    public abstract void preOrden();

    public void ingresarValor(Object valor) {
        if (nodoRaiz == null) {
            nodoRaiz = new NodoArbol(valor);
        } else {
            nodoRaiz.ingresarValor(valor);
        }
    }

    public NodoArbol posicionNodo(Object valor) {
        if (nodoRaiz != null) {
            return nodoRaiz.posicionNodo(valor);
        }
        return null;
    }
}
