package com.example.BackEndElBuenSabor.domains.entities;

import com.example.BackEndElBuenSabor.enums.FormaPago;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Table(name = "factura_venta")
public class Factura extends BaseEntidad{

    private LocalDate fechaFacturacion;

    private Integer mpPaymentId;

    private Integer mpMerchantOrderId;

    private String mpPreferenceId;

    private String mpPaymentType;

    private FormaPago formaPago;

    private Double totalVenta;

    @OneToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

}


