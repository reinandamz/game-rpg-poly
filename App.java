public class App {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.move();
        hero.move("ke kanan");

        System.out.println();
        Enemy enemy = new Enemy();
        enemy.move();
        enemy.move(5);

        System.out.println();
        Character character1 = new Hero();
        character1.move();

        Character character2 = new Enemy();
        character2.move();

        Character character3 = new Witch();
        character3.move();

        Character character4 = new Fighter();
        character4.move();

        System.out.println();
        Character witch = new Witch();
        witch.move();
        witch = new Fighter();
        witch.move();

        System.out.println();
    }
}
