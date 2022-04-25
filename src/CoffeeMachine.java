public class CoffeeMachine {
    public static void main(String[] args) {
        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1;

        boolean isBlocked = true;

        int cappuchinoMilkRequired = 60; // in grams
        int cappuchinoCoffeeRequired = 15; // in grams

        boolean milkIsEnough = skimmedMilkAmount >= cappuchinoMilkRequired || milkAmount >= cappuchinoMilkRequired;

        //TODO:check another types of coffee
        boolean coffeeIsEnough = coffeeAmount >= cappuchinoCoffeeRequired;
        //TODO:  some action
        boolean hasErrors = false;

        if (isBlocked) {
            System.out.println("Кофемашина заблокирована");
            hasErrors = true;
        }
        if (!coffeeIsEnough) {
            System.out.println("Кофе недостаточно");
            hasErrors = true;
        }

        /*
        Многострочный комментарий с какой-то информацией
         */

        if (!milkIsEnough) {
            System.out.println("Молока недостаточно");
            hasErrors = true;
        }
        if(!hasErrors) {
            System.out.println("Готовим кофе");
        }
    }
}
