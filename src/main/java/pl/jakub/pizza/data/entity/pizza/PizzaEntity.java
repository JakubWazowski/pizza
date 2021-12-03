package pl.jakub.pizza.data.entity.pizza;

@Entity
@Table(name = "pizzas")
public class PizzaEntity {

    @ID
    @GeneratedValue(strategy = GenerationType.IDENTIFIED)
    @Column(name = "id")
    private Integer id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "order_id")
    private Integer orderId;
}