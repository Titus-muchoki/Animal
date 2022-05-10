public class Main {
    public static void main(String[] args) {
        Animal Elephant = new Animal();
        Elephant.Species = "Elephant";
        Elephant.Type = "male";
        Elephant.Legs = "4";
        Elephant.Age = 23;

        Animal Lion = new Animal();
        Lion.Species = "canivore";
        Lion.Type = "male";
        Lion.Legs = "four";
        Lion.Age = 12;
        Animal Cat = new Animal();
        Cat.Species = "Cat";
        Cat.Type = "omnivorus";
        Cat.Legs = "four";
        Cat.Age = 10;

        Animal Cow = new Animal();
        Cow.Species = "cow";
        Cow.Type = "harbivorus";
        Cow.Legs = "four";
        Cow.Age = 18;

        Animal[] allAnimals = {Elephant, Lion, Cat, Cow};
        System.out.println("All animals");
        for (Animal myAnimals : allAnimals) {
            System.out.println(myAnimals.Species);
            System.out.println(myAnimals.Type);
            System.out.println(myAnimals.Legs);
            System.out.println(myAnimals.Age);
        }
    }
}
