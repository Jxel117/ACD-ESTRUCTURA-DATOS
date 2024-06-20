public class NodoArbol {
    public NodoArbol nodoIzquierdo;
    public NodoArbol nodoDerecho;
    public Object dato;

    public NodoArbol(Object dato) {
        this.dato = dato;
    }

    public Object obtenerValor() {
        return dato;
    }

    public void ingresarValor(Object valor) {
        if (valor.toString().compareTo(dato.toString()) < 0) {
            if (nodoIzquierdo == null) {
                nodoIzquierdo = new NodoArbol(valor);
            } else {
                nodoIzquierdo.ingresarValor(valor);
            }
        } else {
            if (nodoDerecho == null) {
                nodoDerecho = new NodoArbol(valor);
            } else {
                nodoDerecho.ingresarValor(valor);
            }
        }
    }

    public void eliminarValor(Object valor) {
        // Implementar eliminación de valor en el árbol
    }

    public NodoArbol posicionNodo(Object valor) {
        if (valor.equals(dato)) {
            return this;
        }
        if (valor.toString().compareTo(dato.toString()) < 0 && nodoIzquierdo != null) {
            return nodoIzquierdo.posicionNodo(valor);
        } else if (nodoDerecho != null) {
            return nodoDerecho.posicionNodo(valor);
        }
        return null;
    }

    public void recorrerNodo() {
        if (nodoIzquierdo != null) {
            nodoIzquierdo.recorrerNodo();
        }
        System.out.print(dato + " ");
        if (nodoDerecho != null) {
            nodoDerecho.recorrerNodo();
        }
    }

    public void recorrerPreOrden() {
        System.out.print(dato + " ");
        if (nodoIzquierdo != null) {
            nodoIzquierdo.recorrerPreOrden();
        }
        if (nodoDerecho != null) {
            nodoDerecho.recorrerPreOrden();
        }
    }

    public void recorrerPostOrden() {
        if (nodoIzquierdo != null) {
            nodoIzquierdo.recorrerPostOrden();
        }
        if (nodoDerecho != null) {
            nodoDerecho.recorrerPostOrden();
        }
        System.out.print(dato + " ");
    }
}
