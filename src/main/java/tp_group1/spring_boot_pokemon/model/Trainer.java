package tp_group1.spring_boot_pokemon.model;

import jakarta.persistence.*;
<<<<<<< HEAD
=======

import java.util.Set;
>>>>>>> 741f41c3892409a9035325026481678a53726732

@Entity
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String username;
//    private String password;

//    private int wallet;

    public Trainer() {

    }
<<<<<<< HEAD
    public Trainer(Long id, String username) {
        this.id = id;
        this.username = username;
//        this.password = password;
//        this.wallet = wallet;
=======
    public Trainer(Long id, String userName, String password, int wallet) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.wallet = wallet;
>>>>>>> 741f41c3892409a9035325026481678a53726732
    }

//    @ManyToMany
//    @JoinTable
//    private Set<Item> items = new HashSet();
//
//    @ManyToOne
//    @JoinColumn(name = "POKEMON_ID")
//    private Set<Pokemon> pokemons;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

<<<<<<< HEAD
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public int getWallet() {
//        return wallet;
//    }
//
//    public void setWallet(int wallet) {
//        this.wallet = wallet;
//    }
=======
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
>>>>>>> 741f41c3892409a9035325026481678a53726732
//
//    public Set<Item> getItems() {
//        return items;
//    }
//
//    public void setItems(Set<Item> items) {
//        this.items = items;
//    }
//
//    public Set<Pokemon> getPokemons() {
//        return pokemons;
//    }
//
//    public void setPokemons(Set<Pokemon> pokemons) {
//        this.pokemons = pokemons;
//    }
}
