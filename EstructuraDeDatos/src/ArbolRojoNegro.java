public class ArbolRojoNegro extends Arbol {
    public String colorNodo;
    public String altura;

    public void marcarNodoNegro() {
        // Implementar marcar nodo negro
    }

    public void marcarNodoRojo() {
        // Implementar marcar nodo rojo
    }

    public void rotacion() {
        // Implementar rotación
    }

    public void rebalancear() {
        // Implementar rebalanceo
    }

    @Override
    public void enOrden() {
        if (nodoRaiz != null) {
            nodoRaiz.recorrerNodo();
        }
    }

    @Override
    public void postOrden() {
        if (nodoRaiz != null) {
            nodoRaiz.recorrerPostOrden();
        }
    }

    @Override
    public void preOrden() {
        if (nodoRaiz != null) {
            nodoRaiz.recorrerPreOrden();
        }
    }
}
