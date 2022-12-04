package _07_Abstrat_class_and_Interface.thuc_hanh_animal_and_interface_edible;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chiken();
        animals[1] = new Tiger();
        for(Animal a : animals){
            System.out.println(a.makeSound());
        }
    }
}
