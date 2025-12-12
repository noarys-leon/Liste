public class Lista {
    Nodo root;

    public Lista() {
        root = null;
    }

    public void addHead(Nodo n) { } // aggiunge un nuovo nodo davanti, nella "head"

    public void addTail(Nodo n) { // aggiunge un nuovo nodo in fondo alla lista, alla "tail"
        if (root == null) {
            root = n;
            return;
        }
        Nodo temp = root;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(n);
    }

    @Override
    public String toString() {
        String s = "La lista contiene: ";
        Nodo temp = root;
        while (temp != null) {
            s += temp.getValore() + " - ";
            temp = temp.getNext();
        }
        return s;
    }

}
