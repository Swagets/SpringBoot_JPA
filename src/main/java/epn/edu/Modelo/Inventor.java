package epn.edu.Modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "inventor")
public class Inventor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String pais;

    private Integer nacimiento;

    private Integer fallecimiento;

    @Column(name = "invento_principal")
    private String inventoPrincipal;

    // Constructores

    public Inventor() {
    }

    public Inventor(String nombre, String pais, Integer nacimiento,
                    Integer fallecimiento, String inventoPrincipal) {
        this.nombre = nombre;
        this.pais = pais;
        this.nacimiento = nacimiento;
        this.fallecimiento = fallecimiento;
        this.inventoPrincipal = inventoPrincipal;
    }

    // Getters y Setters

    public Integer getFallecimiento() {
        return fallecimiento;
    }

    public void setFallecimiento(Integer fallecimiento) {
        this.fallecimiento = fallecimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInventoPrincipal() {
        return inventoPrincipal;
    }

    public void setInventoPrincipal(String inventoPrincipal) {
        this.inventoPrincipal = inventoPrincipal;
    }

    public Integer getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Integer nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
