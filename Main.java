class Hero {
    private int health;
    private int damage;
    private String superPower;

    // Конструктор с тремя параметрами
    public Hero(int health, int damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }

    // Конструктор с двумя параметрами
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superPower = "No superpower";  // Если суперспособность не задана
    }

    // Геттеры
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }
}

class Boss {
    private int health;
    private int damage;
    private String defenseType;

    // Геттеры
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getDefenseType() {
        return defenseType;
    }

    // Сеттеры
    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем босса и устанавливаем его параметры
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setDefenseType("Physical");

        // Выводим информацию о боссе
        System.out.println("Boss Info:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());

        // Создаем героев
        Hero[] heroes = createHeroes();

        // Выводим информацию о героях
        System.out.println("\nHeroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() + ", Damage: " + hero.getDamage() + ", Super Power: " + hero.getSuperPower());
        }
    }

    // Метод для создания героев
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(250, 30, "Invisibility");
        Hero hero2 = new Hero(300, 40);  // без суперспособности
        Hero hero3 = new Hero(280, 35, "Flying");

        // Массив с героями
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}
