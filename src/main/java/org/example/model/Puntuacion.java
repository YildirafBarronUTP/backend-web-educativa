import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "puntuaciones")
public class Puntuacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreNino;
    private int estrellas;

    // NUEVA COLUMNA PARA IDENTIFICAR EL JUEGO
    private String juego;

    private LocalDateTime fecha = LocalDateTime.now();

    // Constructores vacíos exigidos por JPA
    public Puntuacion() {}

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombreNino() { return nombreNino; }
    public void setNombreNino(String nombreNino) { this.nombreNino = nombreNino; }

    public int getEstrellas() { return estrellas; }
    public void setEstrellas(int estrellas) { this.estrellas = estrellas; }

    public String getJuego() { return juego; }
    public void setJuego(String juego) { this.juego = juego; }

    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
}