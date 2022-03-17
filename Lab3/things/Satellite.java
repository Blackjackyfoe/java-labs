package things;
import heroes.Human;

import java.util.ArrayList;
public class Satellite implements Gravity {

    ArrayList<Object> livingOnSatel = new ArrayList<>();
    ArrayList<Object> itemsOnSatel = new ArrayList<>();

    public String name;
    protected int k;
    public Satellite(String name,int k){
        this.name = name;
        this.k = k;
    }

    public void addLivingInSat(Human a) {
        if (a instanceof Human){
            livingOnSatel.add(a.toString());
            System.out.println(a.getName() + " теперь на " + this.name);
        }
    }


    public void deleteLivingFromSat(Human a) {
        if (a instanceof Human){
            livingOnSatel.remove(a.toString());
            System.out.println(a.getName() + " улетел с " + this.name);
        }
    }

    public void addItemInSat(Item a) {
        if (a instanceof Item){
            itemsOnSatel.add(a.toString());
            System.out.println(a.getName() + " теперь на " + this.name);
        }
    }


    public void deleteItemFromSat(Item a) {
        if (a instanceof Item){
            itemsOnSatel.remove(a.toString());
            System.out.println(a.getName() + " исчез с " + this.name);
        }
    }

    @Override
    public double changeGravity(Human a, int k){
        return (a.weight = a.getWeight()/k*1.0);
    }





}
