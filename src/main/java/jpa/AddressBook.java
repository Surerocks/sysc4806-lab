package jpa; /**
 * Created by craigshorrocks on 1/12/2017.
 */
import javax.persistence.Entity;
import javax.persistence.*;
import java.util.*;

@Entity
public class AddressBook extends Observable{

    private int id;

    private List<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<BuddyInfo>();
    }

    @Id
    @GeneratedValue
    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void addBuddy(BuddyInfo b){
        buddies.add(b);
        this.setChanged();
        this.notifyObservers();
    }

    public void removeBuddy(BuddyInfo b){
        buddies.remove(b);
        this.setChanged();
        this.notifyObservers();
    }

    @OneToMany(cascade = CascadeType.ALL)
    public List<BuddyInfo> getBuddies(){
        return buddies;
    }

    public void setBuddies(List<BuddyInfo> buddies){
        this.buddies = buddies;
        this.setChanged();
        this.notifyObservers();
    }



    public static void main(String[] args){
        AddressBook a = new AddressBook();
        BuddyInfo b1 = new BuddyInfo("Craig", "555");
        BuddyInfo b2 = new BuddyInfo("Bob","666");

        a.addBuddy(b1);
        a.addBuddy(b2);
        List<BuddyInfo> list = a.getBuddies();

        System.out.println("Buddies:");
        for(BuddyInfo b : list){
            System.out.println("Name: " + b.getName() + " Phone Number: "
                    + b.getPhoneNumber());
        }

    }


}
