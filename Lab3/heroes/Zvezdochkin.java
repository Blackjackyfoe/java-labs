package heroes;

public class Zvezdochkin extends Human implements Move{

    public Zvezdochkin(String name, SkinColor colour, double weight){
        super (name,colour,weight);
    }

    @Override
    public String move(){
        return this.name + " идёт";
    }

    @Override
    public void doSomething(){
        System.out.println("Звездочкин свистит");
    }
}
