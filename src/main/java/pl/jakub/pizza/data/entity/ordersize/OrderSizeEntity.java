package pl.jakub.pizza.data.entity.ordersize;

@Entity
@Table(name = "orders_sizes")
public class OrderSizeEntity{

    @ID
    @GeneratedValue(strategy = GenerationType.IDENTIFIED)
    @Column(name = "id")
    private Integer id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "size_id")
    private Integer sizeId;

    @Column(name = "count")
    private Integer count;
}