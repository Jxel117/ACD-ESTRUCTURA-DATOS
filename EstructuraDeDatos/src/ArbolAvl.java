public class ArbolAvl extends Arbol {
    public String altura;

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

    }

    @Override
    public void preOrden() {

    }
}
