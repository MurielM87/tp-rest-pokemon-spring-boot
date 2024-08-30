package tp_group1.spring_boot_pokemon.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private Integer cost;

    @Enumerated(EnumType.STRING)
    private ItemType itemType;

    @OneToMany(mappedBy = "item")
    private Set<Inventory> items = new HashSet<>();

    // Constructeurs
    public Item() {
    }

    public Item(Long id, String itemName, Integer cost, ItemType itemType) {
        this.id = id;
        this.itemName = itemName;
        this.cost = cost;
        this.itemType = itemType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Set<Inventory> getItems() {
        return items;
    }

    public void setItems(Set<Inventory> items) {
        this.items = items;
    }

    //    public Set<Trainer> getTrainers() {
//        return trainers;
//    }
//
//    public void setTrainers(Set<Trainer> trainers) {
//        this.trainers = trainers;
//    }
}
