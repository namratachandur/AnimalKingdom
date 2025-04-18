public class Elephant extends Animal 
{
    public Elephant(String name, String species)
    {
        super(name, species);
    }

    @Override
    public void makeSound() 
    {
        System.out.println("Trumpet!");
    }
}