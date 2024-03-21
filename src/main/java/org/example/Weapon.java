package org.example;

public enum Weapon {

    SWORD(10, 0.5),
    AXE(15, 0.7),
    DAGGER(5, 1.0),
    MACE(20, 0.9),
    STAFF(25, 1.2),
    SPEAR(30, 1.5),
    BOW(35, 1.8);

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }


    private final int damage;
    private final double attackSpeed;
    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
}


