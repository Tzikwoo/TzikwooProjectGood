package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Animal dog1 = new Animal();
        System.out.println("The dog's name is " + dog1.name);
        System.out.println("The dog's age is " + dog1.age + " years.");
        System.out.println("The dog's favourite food is " + dog1.favfood);
        System.out.println("The dog's favourite recreations is " + dog1.favrecreation);
        System.out.println("The dog's health level is " + dog1.health);
        System.out.println("The dog's hungriness level is " + dog1.hungriness);
        System.out.println("The dog's spirit level is " + dog1.spirit);
        Rescuer adoptator1 = new Rescuer();
        System.out.println("The rescuer's name is " + adoptator1.name);
        System.out.println("The rescuer has this sum of money for adoption: " + adoptator1.money);
        Food food1 = new Food();
        System.out.println("Animal food: " + food1.name);
        System.out.println("Food price/kg: " + food1.price);
        System.out.println("Food quantity: " + food1.quantity + " kg");
        System.out.println("Is it available in stock? " + food1.availability);
        Recreation recreation1= new Recreation();
        System.out.println("Recreation name: " + recreation1.name);
        Vet vet1= new Vet();
        System.out.println("Veterinary: " + vet1.name);
        System.out.println("Specialisation: " + vet1.specialisation);



    }
}
