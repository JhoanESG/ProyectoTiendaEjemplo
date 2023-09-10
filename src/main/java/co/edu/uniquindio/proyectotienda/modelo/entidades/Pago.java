package co.edu.uniquindio.proyectotienda.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pago {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private LocalDateTime fecha;
    private float totalPagado;
    private MedioPago medioDePago;
    private EstadoPago estado;
    @OneToOne(mappedBy = "pago")
    private Transaccion transaccion;
}
