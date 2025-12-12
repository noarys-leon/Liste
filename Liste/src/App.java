public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nArrayList: ");
        // lista è un oggetto che contiene root, creare una lista significa creare un puntatore al prossimo nodo.
        // cosa sono? una sequenza di nodi in cui ogni nodo è fatto di due elementi, un elemento e un puntatore. Quello dell'inizio si chiama root, quello della fine si chiama null (se non c'e' un nodo successivo).
        // questi nodi sono degli oggetti che hanno un valore e un suggerimento al nodo successivo.
        // ctrl + a --> seleziona tuttio

        Lista lista = new Lista();
        lista.addTail(new Nodo("Mario"));
        lista.addTail(new Nodo("Giulio"));
        lista.addTail(new Nodo("Francesco"));

        System.out.println(lista);
    }
}
