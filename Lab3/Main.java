import heroes.*;
import things.*;


public class Main {

    public static void main(String[] args) {

        Moon moon = new Moon("Луна",6);
        Rocket rocket = new Rocket("Фуксия и Селедочка", 30, 10, 5);
        Klepka klepka = new Klepka("Клёпка", SkinColor.WHITE,45);
        Kubik kubik = new Kubik("Кубик", SkinColor.WHITE,57);
        Steklyashkin stekl = new Steklyashkin("Стекляшкин", SkinColor.WHITE,59);
        Tybik tybik = new Tybik("Тюбик", SkinColor.WHITE,70);
        Znaika znaika = new Znaika("Знайка", SkinColor.WHITE,60);
        Zvezdochkin zvezd = new Zvezdochkin("Звёздочкин", SkinColor.WHITE,59);

        moon.addItemInSat(rocket);
        moon.addLivingInSat(klepka);
        moon.addLivingInSat(kubik);
        moon.addLivingInSat(stekl);
        moon.addLivingInSat(tybik);
        moon.addLivingInSat(znaika);
        moon.addLivingInSat(zvezd);
        moon.changeGravity(klepka,6);
        moon.changeGravity(kubik,6);
        moon.changeGravity(stekl,6);
        moon.changeGravity(tybik,6);
        moon.changeGravity(znaika,6);
        moon.changeGravity(zvezd,6);

        System.out.println(znaika.move());
        System.out.println(znaika.move());
        System.out.println(znaika.move());

        System.out.println(kubik.move());
        System.out.println(zvezd.move());
        System.out.println(stekl.move());
        System.out.println(tybik.move());

        System.out.println(klepka.jump());
        System.out.println(klepka.jump());
        System.out.println(klepka.jump());
        System.out.println(klepka.wish());
        System.out.println(klepka.jump());
        System.out.println(klepka.jump());

        System.out.println(znaika.giveOrder(klepka));

        System.out.println(klepka.jump());
        System.out.println(klepka.jump());



        //System.out.println(klepka.toString());
        //System.out.println(klepka.hashCode());







    }
}
