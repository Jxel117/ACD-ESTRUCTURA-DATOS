public class ListaEnlazada {
    protected NodoLista cabeza;

    public void ingresarDato(Object dato) {
        if (cabeza == null) {
            cabeza = new NodoLista(dato);
        } else {
            NodoLista temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = new NodoLista(dato);
        }
    }

    public NodoLista siguiente() {
        return cabeza != null ? cabeza.siguiente : null;
    }
}
