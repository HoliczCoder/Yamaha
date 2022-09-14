package com.yamaha.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="product_chassis")
@Entity
@Builder
public class    ChassisEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    // mo ta cua engine viet o duoi day
    private String description;
    @OneToMany(mappedBy = "chassis", cascade = CascadeType.ALL)
    private List<SpecificationEntity> specification;

}
