package heroes;

public class Kubik extends Human implements Move {

    public Kubik(String name, SkinColor colour, double weight){
        super (name,colour,weight);
    }

    @Override
    public String move(){
        return this.name + " идёт";
    }


    @Override
    public void doSomething(){
        System.out.println("Кубик смотрит");
    }
}
