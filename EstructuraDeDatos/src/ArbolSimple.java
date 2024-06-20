public class ArbolSimple extends Arbol {
    @Override
    public void enOrden() {
        if (nodoRaiz != null) {
            nodoRaiz.recorrerNodo();
        }
    }

    @Override
    public void postOrden() {
        // Implementar recorrido postOrden
    }

    @Override
    public void preOrden() {
        // Implementar recorrido preOrden
    }
}
