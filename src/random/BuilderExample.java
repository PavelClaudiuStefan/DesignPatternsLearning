package random;

public class BuilderExample {

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).fat(0).build();
        NutritionFacts fanta = new NutritionFacts.Builder(240, 8).calories(2000).sodium(50).carbohydrate(29).fat(100).build();
        System.out.println("Good = Coca cola: " + cocaCola);
        System.out.println("Bad = Fanta: " + fanta);
    }

}

class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;

        // Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        Builder calories(int val) {
            calories = val;
            return this;
        }
        Builder fat(int val) {
            fat = val;
            return this;
        }
        Builder sodium(int val) {
            sodium = val;
            return this;
        }
        Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFacts {" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat + "%" +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}