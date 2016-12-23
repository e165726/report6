package jp.ac.uryukyu.ie.e165726;


public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name,int hitPoint,int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public int getAttack(){
        return attack;
    }

    public boolean isDead(){
        return dead;
    }

    public String getName(){
        return name;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public void setDead(boolean dead){
        this.dead = dead;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }


    public void attack(LivingThing opponent){
    }

    public void wounded(int damage){
    }
}

