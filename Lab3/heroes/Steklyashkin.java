package heroes;

public class Steklyashkin extends Human implements Move {

    public Steklyashkin(String name, SkinColor colour, double weight){
        super (name,colour,weight);
    }

    @Override
    public String move(){
        return this.name + " идёт";
    }

    @Override
    public void doSomething(){
        System.out.println("Стекляшкин смотрит вверх");
    }
}
