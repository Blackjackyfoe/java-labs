package heroes;

public class Znaika extends Human implements Move,HumanSpeaking {

    public Znaika(String name, SkinColor colour, double weight){
        super (name,colour,weight);
    }

    @Override
    public String giveOrder(Human b){
        return this.name + " приказывает остановиться " + b.getName() + " и вернуться в ракету";
    }

    @Override
    public String move(){
        return this.name + " идёт";
    }

    @Override
    public void doSomething(){
        System.out.println("Знайка кричит");
    }
}
