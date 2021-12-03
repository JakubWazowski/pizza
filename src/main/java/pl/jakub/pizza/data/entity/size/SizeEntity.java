package pl.jakub.pizza.data.entity.size;

@Entity
@Table(name = "sizes")
public class SizeEntity{

    @ID
    @GeneratedValue(strategy = GenerationType.IDENTIFIED)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoniColumn(name = "pizza_id", insertable = false,updatable = false)
    private PizzaEntity pizza;

    @OneToMany(mappedBy = "size")
    private Set<OrderSizeEntity> orderSizes;
}