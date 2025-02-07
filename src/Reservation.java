public class Reservation {
    private int reservationId;  // Identifiant de la réservation
    private String reservationDetails;  // Détails de la réservation (par exemple, type de service)
    private String status;  // Statut de la réservation (par exemple, "confirmée", "annulée", etc.)

    // Constructeur
    public Reservation(int reservationId, String reservationDetails) {
        this.reservationId = reservationId;
        this.reservationDetails = reservationDetails;
        this.status = "confirmée";  // Statut par défaut
    }

    // Getter et Setter pour reservationId
    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    // Getter et Setter pour reservationDetails
    public String getReservationDetails() {
        return reservationDetails;
    }

    public void setReservationDetails(String reservationDetails) {
        this.reservationDetails = reservationDetails;
    }

    // Getter et Setter pour status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Méthode toString pour afficher les informations de la réservation
    @Override
    public String toString() {
        return "Reservation ID: " + reservationId + ", Details: " + reservationDetails + ", Status: " + status;
    }
}
