import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;  // Identifiant du client
    private String name;  // Nom du client
    private List<Order> orders;  // Liste des commandes du client
    private List<Reservation> reservations;  // Liste des réservations du client (par exemple, tickets, etc.)

    // Constructeur
    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();  // Initialisation de la liste des commandes
        this.reservations = new ArrayList<>();  // Initialisation de la liste des réservations
    }
    public void placeOrder(Order order) throws IllegalStateException {
        if (this.reservations.isEmpty()) {
            throw new IllegalStateException("The customer must have a reservation before placing an order.");
        }
        this.orders.add(order);
    }

    // Getter et Setter pour customerId
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    // Getter et Setter pour name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter et Setter pour orders
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    // Getter et Setter pour reservations
    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    // Méthode pour ajouter une commande à la liste
    public void addOrder(Order order) {
        this.orders.add(order);
    }

    // Méthode pour ajouter une réservation à la liste
    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }

    // Méthode toString pour afficher les informations du client
    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name + ", Orders: " + orders.size() + ", Reservations: " + reservations.size();
    }
}
