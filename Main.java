public class Main
{
    public static void main(String[] args) 
    {
        Animal fluf = new Animal("Dogs", "Canis lupus familiaris");
        Animal whsk = new Animal("Cats", "Felis catus");
        Animal spot = new Lion("Lions", "Panthera leo");
        Animal tusk = new Elephant("Indian Elephants", "Elephas maximus indicus");
        Animal trnk = new Elephant("African Forest Elephants", "Loxodonta cyclotis");

        Animal[] animals = {fluf, whsk, spot, tusk, trnk};

        for (Animal animal : animals)
        {
            System.out.println("\n" + animal.getName() + " belongs to the species " + animal.getSpecies() + ".");
            animal.makeSound();
            System.out.println();
        }
    }
}