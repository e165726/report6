package jp.ac.uryukyu.ie.e165726;


public class Hero extends LivingThing{
    public Hero (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
    }

    @Override
    public void attack(LivingThing opponent){
        int damage;
        int criticalProbability;
        if(isDead() == false) {
            criticalProbability = (int)(Math.random()*100) + 1;
            damage = (int) (Math.random() * getAttack()+1);
            if(damage == 0){
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n",getName(), opponent.getName());
            }else{
                if(criticalProbability <= 30){
                    System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージを与えた！！\n",getName(), opponent.getName(), damage * 2);
                    damage = damage * 2;
                }else {
                    System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
                }
            }
        }else{
            damage = 0;
        }
        opponent.wounded(damage);
    }

    public void wounded(int damage) {
        setHitPoint(getHitPoint() - damage);
        if (getHitPoint()  < 0) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n",getName());
        }
    }

}
