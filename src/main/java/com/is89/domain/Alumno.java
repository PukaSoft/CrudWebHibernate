
package com.is89.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private Integer idAlumno;
    
    private String nombre;
    
    private String apellido;
    
    @JoinColumn(name = "id_contacto",referencedColumnName = "id_contacto")
    @ManyToOne(cascade = CascadeType.ALL)
    private Contacto contacto;
    
    @JoinColumn(name = "id_domicilio",referencedColumnName = "id_domicilio")
    @ManyToOne(cascade = CascadeType.ALL )
    private Domicilio domicilio;
    
        
    @OneToMany(mappedBy = "alumno")
    private List<Asignacion> asignaciones;
    
     public Alumno() {
    }

    public Alumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }
    
    
}
