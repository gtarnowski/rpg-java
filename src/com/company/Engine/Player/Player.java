package com.company.Engine.Player;


import com.company.Engine.Profession;

import static java.lang.System.out;

public class Player {

    private short lvl;
    private short hp;
    private short mp;

    private short str;
    private short agi;
    private short ene;
    private short vit;

    private short attackMin;
    private short attackMax;

    private short def;
    private String name;
    //Player selected prof
    private String prof;

    private Profession mage = Profession.MAGE;
    private Profession warr = Profession.WARRIOR;
    private Profession arch = Profession.ARCHER;



    void calcMeleeAttack() {

        if (this.prof.equals(String.valueOf(warr))) {
            //DK attack set
            this.attackMin = (short) (this.str / 6);
            this.attackMax = (short) (this.str / 4);
        }else {
            throw new Error("Method: \n" + Thread.currentThread().getStackTrace()[1] + "is unavailable for: " + this.prof + "\n");
        }

    }
    void calcDefense() {

        //SM defense set
        if (this.prof.equals(String.valueOf(mage))) {
            this.def = (short) (this.agi / 4);
        }else if(this.prof.equals(String.valueOf(warr))) {
            this.def = (short) (this.agi / 3);
        }else {
            throw new Error("Method: \n" + Thread.currentThread().getStackTrace()[1] + "is unavailable for: " + this.prof + "\n");
        }
    }
    void calcDefenseAndRange() {

        //ARCH Defense and Attack calc
        if(this.prof.equals(String.valueOf(arch))){
            this.def = (short) (this.agi / 10);
            this.attackMin = (short) ((this.str / 14) + (this.agi / 7));
            this.attackMax = (short) ((this.str / 8) + (this.agi / 4));
        }else {
            throw new Error("Method: \n" + Thread.currentThread().getStackTrace()[1] + "is unavailable for: " + this.prof + "\n");
        }

    }
    void calcHealth() {

        //SM vit set
        //HP = 30+(lvl-1)+vit*2
        if (this.prof.equals(String.valueOf(mage))) {
            this.hp = (short) (30 + (this.lvl - 1) + (this.vit * 2));
        }else if (this.prof.equals(String.valueOf(warr))) {
            //DK vit set
            //HP = 35+(lvl-1)*2+vit*3
            this.hp = (short) (35 + (this.lvl - 1) * 2 + (this.vit * 3));
        }else if (this.prof.equals(String.valueOf(arch))) {
            //ARCH vit set
            //HP = 40+(lvl-1)+vit*2
            this.hp = (short) (40 + (this.lvl - 1) + this.vit * 2);
        }else {
            throw new Error("Method: \n" + Thread.currentThread().getStackTrace()[1] + "is unavailable for: " + this.prof + "\n");
        }
    }
    void calcMana() {

             //DK ene set
        if (this.prof.equals(String.valueOf(warr))) {

            this.mp = (short) (10 + (this.lvl - 1) * 0.5 + this.ene);

        }else if (this.prof.equals(String.valueOf(arch))) {
            //ARCH ene set
            this.mp = (short) (6 + (this.lvl * 1.5) + (this.ene * 1.5));
        }else {
            throw new Error("Method: \n" + Thread.currentThread().getStackTrace()[1] + "is unavailable for: " + this.prof + "\n");
        }

    }
    void calcManaAndMagic() {

        //MAGE Mana and MagicAttack calc
        if (this.prof.equals(String.valueOf(mage))) {
            this.attackMin = (short) (this.ene / 9);
            this.attackMax = (short) (this.ene / 4);
            this.mp = (short) ((this.lvl - 1) * 2 + (this.ene * 2));
        }else {
            throw new Error("Method: \n" + Thread.currentThread().getStackTrace()[1] + "is unavailable for: " + this.prof + "\n");
        }
    }


    public short getLvl() {
        return lvl;
    }

    public void setLvl(short lvl) {
        this.lvl = lvl;
    }



    public short getHp() {
        return hp;
    }

    public void setHp(short hp) {
        this.hp = hp;
    }



    public short getMp() {
        return mp;
    }

    public void setMp(short mp) {
        this.mp = mp;
    }



    public short getStr() {
        return str;
    }

    public void setStr(short str) {
        this.str = str;
    }



    public short getAgi() {
        return agi;
    }

    public void setAgi(short agi) {
        this.agi = agi;
    }



    public short getEne() {
        return ene;
    }

    public void setEne(short ene) {
        this.ene = ene;
    }



    public short getVit() {
        return vit;
    }

    public void setVit(short vit) {
        this.vit = vit;
    }



    public short getAttackMin() {
        return attackMin;
    }

    public void setAttackMin(short attackMin) {
        this.attackMin = attackMin;
    }



    public short getAttackMax() {
        return attackMax;
    }

    public void setAttackMax(short attackMax) {
        this.attackMax = attackMax;
    }



    public short getDef() {
        return def;
    }

    public void setDef(short def) {
        this.def = def;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }
}
