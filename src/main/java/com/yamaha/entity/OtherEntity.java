package com.yamaha.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_other")
@Data
@Entity
public class OtherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // mo ta cua engine viet o duoi day
    private String description;
    @OneToMany(mappedBy = "engine", cascade = CascadeType.ALL)
    private Collection<SpecificationEntity> specification;

}
