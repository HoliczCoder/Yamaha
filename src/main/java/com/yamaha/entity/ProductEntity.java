package com.yamaha.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product")
public class ProductEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @OneToOne
    @JoinColumn(name = "specification_id")
    private SpecificationEntity specification;
    @OneToOne
    @JoinColumn(name = "accessories_id")
    // phụ kiện ở đây là set của riêng sản phẩm đó thì nên để là one to one
    private AccessoriesEntity accessories;
    @OneToOne
    @JoinColumn(name = "feature_id")
    private FeatureEntity feature;
    @Column(name = "current_offer")
    private String currentOffer;
    @OneToOne
    @JoinColumn(name = "gallery_id")
    private GalleryEntity gallery;
    @Column (name = "view")
    private String view;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "product_to_year_model", //Tạo ra một join Table tên là "address_person"
            joinColumns = @JoinColumn(name = "product_id"),  // TRong đó, khóa ngoại chính là address_id trỏ tới class hiện tại (Address)
            inverseJoinColumns = @JoinColumn(name = "year_model_id") //Khóa ngoại thứ 2 trỏ tới thuộc tính ở dưới (Person)
    )
    private List<YearModelEntity> yearModel;








}
