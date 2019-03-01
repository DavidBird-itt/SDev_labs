package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.products.*;
import models.users.*;

// Product entity managed by Ebean
@Entity
public class Basket extends Model {
    
    @OneToMany(mappedBy = "basket", cascade = CascadeType.PERSIST)
    private List<OrderItem> basketItems;
    @OneToOne
    private Customer customer;

    @Id
    private Long id;
    
    // Default constructor
    public  Basket() {
    }
    
	
   //Generic query helper
    public static Finder<Long,Basket> find = new Finder<Long,Basket>(Basket.class);

    //Find all Products in the database
    public static List<Basket> findAll() {
        return Basket.find.all();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Add item for sale to basket
    // Either update existing order item or ad a new one.
    public void addItemOnSale(ItemOnSale item) {
        
        boolean itemFound = false;
        // Check if product already in this basket
        // Check if item in basket
        // Find orderitem with this product
        // if found increment quantity
        for (OrderItem oi : basketItems) {
            if (oi.getItem().getId() == item.getId()) {
                oi.increaseQty();
                itemFound = true;
                break;
            }
        }
        if (itemFound == false) {
            // Add orderItem to list
            OrderItem newItem = new OrderItem(item);
            // Add to items
            basketItems.add(newItem);
        }

        public double getBasketTotal() {
        
            double total = 0;
            
            for (OrderItem i: basketItems) {
                total += i.getItemTotal();
            }
            return total;
        }

        //getters and setters for mappings
        public List<OrderItem> getBasketItems() {
            return this.basketItems;
        }
    
        public void setBasketItems(List<OrderItem> basketItems) {
            this.basketItems = basketItems;
        }
    
        public Customer getCustomer() {
            return customer;
        }
    
        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        //Remove and item from the basket
        public void removeItem(OrderItem item) {
            //Iterator used for safe removal, works as an index
            for(Iterator<OrderItem> iter = basketItems.iterator(); iter.hasNext();) {
                OrderItem i = iter.next();
                if (i.getId().equals(item.getId())) {
                    //If more than 1: Decrement
                    if(i.getQuantity()>1) {
                        i.decreaseQty();
                    
                    } else{
                        //Only one: Remove
                        //Database
                        i.delete();
                        //List
                        iter.remove();
                        break;
                    }
                }
            }
        }

        public void removeAllItems() {
            for(OrderItem i: this.basketItems) {
                i.delete();
            }
            this.basketItems = null;
        }


    }
}