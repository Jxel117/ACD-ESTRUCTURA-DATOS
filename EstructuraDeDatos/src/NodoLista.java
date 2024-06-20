public class NodoLista {
    public Object dato;
    public NodoLista siguiente;

    public NodoLista(Object dato) {
        this.dato = dato;
    }

    public Object obtenerDato() {
        return dato;
    }

    public void ingresarDato(Object dato) {
        this.dato = dato;
    }

    public NodoLista recorrerNodo() {
        return siguiente;
    }

    public NodoLista posicionNodo(Object dato) {
        if (this.dato.equals(dato)) {
            return this;
        }
        if (siguiente != null) {
            return siguiente.posicionNodo(dato);
        }
        return null;
    }

    public void eliminarValor(Object dato) {
        //
    }
}