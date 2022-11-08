package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Animal dog1 = new Animal();
        dog1.setName("Cody");
        dog1.setAge(3);
        dog1.setFavfood("Purina");
        dog1.setFavrecreation("Running");
        dog1.setHealth(6);
        dog1.setHungriness(3);
        dog1.setSpirit(9);
        System.out.println("The dog's name is " + dog1.getName());
        System.out.println("The dog's age is " + dog1.getAge() + " years.");
        System.out.println("The dog's favourite food is " + dog1.getFavfood());
        System.out.println("The dog's favourite recreations is " + dog1.getFavrecreation());
        System.out.println("The dog's health level is " + dog1.getHealth());
        System.out.println("The dog's hungriness level is " + dog1.getHungriness());
        System.out.println("The dog's spirit level is " + dog1.getSpirit());
        Rescuer adoptator1 = new Rescuer();
        adoptator1.setName("Bogdan");
        adoptator1.setMoney(300.5);
        System.out.println("The rescuer's name is " + adoptator1.getName());
        System.out.println("The rescuer has this sum of money for adoption: " + adoptator1.getMoney());
        Food food1 = new Food();
        food1.setName("Purina");
        food1.setAvailability(true);
        food1.setPrice(10.5);
        food1.setQuantity(3);
        System.out.println("Animal food: " + food1.getName());
        System.out.println("Food price/kg: " + food1.getPrice());
        System.out.println("Food quantity: " + food1.getQuantity() + " kg");
        System.out.println("Is it available in stock? " + food1.getAvailability());
        Recreation recreation1= new Recreation();
        recreation1.setName("Running");
        System.out.println("Recreation name: " + recreation1.getName());
        Vet vet1= new Vet();
        vet1.setName("Dr. Ioan Pop");
        vet1.setSpecialisation("Surgeon");
        System.out.println("Veterinary: " + vet1.getName());
        System.out.println("Specialisation: " + vet1.getSpecialisation());



    }
}
