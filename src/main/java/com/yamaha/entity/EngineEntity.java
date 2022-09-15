package com.yamaha.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table (name="product_engine")
public class EngineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // mo ta cua engine viet o duoi day
    private String engineType;
    private String boreStroke;
    private String compressionRatio;
    private String fuelDelivery;
    private String transmission;
    private String finalDrive;
    @OneToMany(mappedBy = "engine", cascade = CascadeType.ALL)
    private List<SpecificationEntity> specification;



}
