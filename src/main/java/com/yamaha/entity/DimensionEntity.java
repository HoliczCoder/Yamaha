package com.yamaha.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Resource;
import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_dimension")
@Data
@Entity
@Builder
public class DimensionEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    // mo ta cua engine viet o duoi day
    private String lwh;
    private String seatHeight;
    private String wheelBase;
    private String rake;
    private String trail;
    private String maximumGroundClearance;
    private String fuelCapacity;
    private String wetWeight;

    @OneToMany(mappedBy = "dimension", cascade = CascadeType.ALL)
    private List<SpecificationEntity> specification;

}
