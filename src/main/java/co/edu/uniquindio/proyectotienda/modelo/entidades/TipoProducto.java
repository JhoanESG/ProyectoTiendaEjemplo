package co.edu.uniquindio.proyectotienda.modelo.entidades;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;


public enum TipoProducto {
    @Enumerated(EnumType.STRING)
    HOGAR, ELECTRODOMESTICOS, ELECTRONICA, ROPA
}
