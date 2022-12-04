package _07_Abstrat_class_and_Interface.thuc_hanh_animal_and_interface_edible;

public class Chiken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chiken: gâu gâu!!";
    }

    @Override
    public String howToEat() {
        return "Chiên con gà lên để ăn";
    }
}
