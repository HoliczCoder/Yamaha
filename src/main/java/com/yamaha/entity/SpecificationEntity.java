package com.yamaha.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "product_specification")
public class SpecificationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "engine_id")
    private EngineEntity engine;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "chassis_id")
    private ChassisEntity chassis;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "dimension_id")
    private DimensionEntity dimension;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "other_id")
    private OtherEntity other;




}
