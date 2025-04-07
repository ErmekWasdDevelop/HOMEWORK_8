public class LUDAMAN extends Hero{
    public LUDAMAN(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.LUCKSHOOT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int n1= RPG_Game.random.nextInt(1,7);
        int n2= RPG_Game.random.nextInt(1,7);

        if (n1 == n2){
            boss.setHealth(boss.getHealth() - (n1 * n2));
            System.out.println("LUCKY SHOOT :" +n1*n2);}
        else {
            int i = RPG_Game.random.nextInt(heroes.length);
                heroes[i].setHealth(heroes[i].getHealth() - (n1 +n2));
                System.out.println("UNLUCK SHOOT :" +(n1+n2));
        }
    }
}
