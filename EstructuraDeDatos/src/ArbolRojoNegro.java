public class ArbolRojoNegro extends Arbol {
    public String colorNodo;
    public String altura;

    public void marcarNodoNegro() {

    }

    public void marcarNodoRojo() {

    }

    public void rotacion() {

    }

    public void rebalancear() {

    }

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
