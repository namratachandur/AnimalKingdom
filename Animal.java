public class Animal
{
    private String name;
    private String species;

    public Animal(String name, String species) 
    {
        this.name = name;
        this.species = species;
    }

    public String getName() 
    {
        return name;
    }

    public String getSpecies() 
    {
        return species;
    }

    public void makeSound()
    {
        System.out.println("Animal noises...");
    }
}