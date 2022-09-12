package com.yamaha.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table (name = "year_model")
@Entity
public class YearModelEntity  {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String yearVersion;
    @ManyToMany(mappedBy = "yearModel")
    private List<ProductEntity> productEntities;


}
