package heroes;

public class Klepka extends Human implements Jump, Move, Wishes {

    public Klepka(String name, SkinColor colour, double weight){
        super (name,colour,weight);
    }

    @Override
    public String wish(){
        return this.name + " желает творить дичь!";
    }
    @Override
    public String jump(){
        return this.name + " прыгает";
    }

    @Override
    public String move(){
        return this.name + " идёт";
    }

    @Override
    public void doSomething(){
        System.out.println("Клёпка свистит");
    }




}
