public class Lista {
    Nodo root;

    public Lista() {
        root = null;
    }
    
    public void add(String s) { // si comporta come l'addTail dopo aver creato un nodo 
        Nodo n = new Nodo(s); // crea il nodo lui
        addTail(n); 
    } 

    public void addHead(Nodo n) { // aggiunge un nuovo nodo davanti, nella "head"
        Nodo temp = root;
        root = n;
        n.setNext(temp); // se scrivo questo, sto indicando che root lo sto spostando in un nuovo nodo e facendo setNext(temp) sto dicendo che temp diventa il primo del ramo di nodi principali
    } 
    
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

    // ESERCIZI DA FARE PER LA PROSSIMA VOLTA
    public void remove(String s) { } // eliminare un nodo dalla lista (a bit complicated)
    
    public boolean exists(String s) { // scorrere la lista e controllare se esiste il nodo 
        return true;
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
