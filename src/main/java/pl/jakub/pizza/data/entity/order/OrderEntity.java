package pl.jakub.pizza.data.entity.order;

@Entity
@Table(name = "orders")
public class PizzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTIFY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "client_name")
    private string clientName;

    @Column(name = "client_address")
    private String clientAddress;

    @Column(name = "client_phone")
    private String clientPddress;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "status")
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "expected_at")
    private Date expectedAt;

    @Column(name = "token")
    private String token;

    @OneToMany(mappedBy = "order")
    private Set<OrderSizeEntity> orderSizes;

}