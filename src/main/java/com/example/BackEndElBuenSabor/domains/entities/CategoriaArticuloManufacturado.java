package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "categoria_articulo_manufacturado")
public class CategoriaArticuloManufacturado extends BaseEntidad{

    private String denominacion;

}