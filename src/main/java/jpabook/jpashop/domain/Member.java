package jpabook.jpashop.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member  extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;
    private String City;
    private String Street;
    private String ZipCode;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList();

}
