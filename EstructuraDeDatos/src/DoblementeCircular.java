public class DoblementeCircular extends ListaEnlazada {
    public Object anterior() {
        
        return null;
    }

    public Object primerDato() {
        return cabeza != null ? cabeza.dato : null;
    }

    public Object ultimoDato() {
        if (cabeza == null) {
            return null;
        }
        NodoLista temp = cabeza;
        while (temp.siguiente != null) {
            temp = temp.siguiente;
        }
        return temp.dato;
    }
}
