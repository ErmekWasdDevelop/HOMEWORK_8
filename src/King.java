public class King extends Hero {

    public King(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SUMMON_SAITAMA);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int Saitama = RPG_Game.random.nextInt(1, 101);
       if (Saitama >= 0 && Saitama <=10){
        boss.setHealth(boss.getHealth() - boss.getHealth());
        System.out.println("Saitama Punch the Boss");
       }

    }
}
