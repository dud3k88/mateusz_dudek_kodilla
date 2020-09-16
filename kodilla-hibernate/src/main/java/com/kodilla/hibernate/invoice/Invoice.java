package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "Invoice")
public class Invoice {
    private int id;
    private String number;
    private List<Item> itemList;

    public Invoice(String number) {
        this.number = number;
    }

    public Invoice() {

    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }
    @Column(name = "Number")
    public String getNumber() {
        return number;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.PERSIST,
            fetch = FetchType.LAZY
    )
    public List<Item> getItemList() {
        return itemList;
    }

    private void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
