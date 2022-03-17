package heroes;

public class Tybik extends Human implements Move {

    public Tybik(String name, SkinColor colour, double weight){
        super (name,colour,weight);
    }

    @Override
    public String move(){
        return this.name + " идёт";
    }

    @Override
    public void doSomething(){
        System.out.println("Тюбик смотрит под ноги");
    }
}
