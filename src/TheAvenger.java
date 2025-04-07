public class TheAvenger extends Hero {

    public TheAvenger(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SUPER_ARMOR);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int S = RPG_Game.random.nextInt(1, 6);
        if (S == 5) {
           boss.setSuperArmor(true);
            System.out.println("Суперспособность SUPERARMOR сработал");
        } else {
            boss.setSuperArmor(false);
        }
    }
}
