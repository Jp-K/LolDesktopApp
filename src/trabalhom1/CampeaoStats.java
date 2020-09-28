/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhom1;

/**
 *
 * @author ian
 */
public class CampeaoStats {
    
    private String nome = "";
    private double hp = 0;
    private double mp = 0;
    private double movespeed = 0; 
    private double armor = 0;
    private double spellblock = 0; 
    private double attackrange = 0;
    private double hpregen = 0;
    private double mpregen = 0;
    private double crit = 0;
    private double attackdamage = 0;
    private double attackspeed = 0;
    //relativos a level 
    private double attackspeedperlevel = 0;
    private double critperlevel = 0;
    private double attackdamageperlevel = 0;
    private double mpregenperlevel = 0;
    private double hpregenperlevel = 0;
    private double spellblockperlevel = 0;
    private double armorperlevel = 0;
    private double mpperlevel = 0;
    private double hpperlevel = 0;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the hp
     */
    public double getHp() {
        return hp;
    }

    /**
     * @return the mp
     */
    public double getMp() {
        return mp;
    }

    /**
     * @param mp the mp to set
     */
    public void setMp(double mp) {
        this.mp = mp;
    }

    /**
     * @return the movespeed
     */
    public double getMovespeed() {
        return movespeed;
    }

    /**
     * @param movespeed the movespeed to set
     */
    public void setMovespeed(double movespeed) {
        this.movespeed = movespeed;
    }

    /**
     * @return the armor
     */
    public double getArmor() {
        return armor;
    }

    /**
     * @param armor the armor to set
     */
    public void setArmor(double armor) {
        this.armor = armor;
    }

    /**
     * @return the spellblock
     */
    public double getSpellblock() {
        return spellblock;
    }

    /**
     * @param spellblock the spellblock to set
     */
    public void setSpellblock(double spellblock) {
        this.spellblock = spellblock;
    }

    /**
     * @return the attackrange
     */
    public double getAttackrange() {
        return attackrange;
    }

    /**
     * @param attackrange the attackrange to set
     */
    public void setAttackrange(double attackrange) {
        this.attackrange = attackrange;
    }

    /**
     * @return the hpregen
     */
    public double getHpregen() {
        return hpregen;
    }

    /**
     * @param hpregen the hpregen to set
     */
    public void setHpregen(double hpregen) {
        this.hpregen = hpregen;
    }

    /**
     * @return the mpregen
     */
    public double getMpregen() {
        return mpregen;
    }

    /**
     * @param mpregen the mpregen to set
     */
    public void setMpregen(double mpregen) {
        this.mpregen = mpregen;
    }

    /**
     * @return the crit
     */
    public double getCrit() {
        return crit;
    }

    /**
     * @param crit the crit to set
     */
    public void setCrit(double crit) {
        this.crit = crit;
    }

    /**
     * @return the attackdamage
     */
    public double getAttackdamage() {
        return attackdamage;
    }

    /**
     * @param attackdamage the attackdamage to set
     */
    public void setAttackdamage(double attackdamage) {
        this.attackdamage = attackdamage;
    }

    /**
     * @return the attackspeed
     */
    public double getAttackspeed() {
        return attackspeed;
    }

    /**
     * @param attackspeed the attackspeed to set
     */
    public void setAttackspeed(double attackspeed) {
        this.attackspeed = attackspeed;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(double hp) {
        this.hp = hp;
    }

    /**
     * @return the attackspeedperlevel
     */
    public double getAttackspeedperlevel() {
        return attackspeedperlevel;
    }

    /**
     * @param attackspeedperlevel the attackspeedperlevel to set
     */
    public void setAttackspeedperlevel(double attackspeedperlevel) {
        this.attackspeedperlevel = attackspeedperlevel;
    }

    /**
     * @return the critperlevel
     */
    public double getCritperlevel() {
        return critperlevel;
    }

    /**
     * @param critperlevel the critperlevel to set
     */
    public void setCritperlevel(double critperlevel) {
        this.critperlevel = critperlevel;
    }

    /**
     * @return the attackdamageperlevel
     */
    public double getAttackdamageperlevel() {
        return attackdamageperlevel;
    }

    /**
     * @param attackdamageperlevel the attackdamageperlevel to set
     */
    public void setAttackdamageperlevel(double attackdamageperlevel) {
        this.attackdamageperlevel = attackdamageperlevel;
    }

    /**
     * @return the mpregenperlevel
     */
    public double getMpregenperlevel() {
        return mpregenperlevel;
    }

    /**
     * @param mpregenperlevel the mpregenperlevel to set
     */
    public void setMpregenperlevel(double mpregenperlevel) {
        this.mpregenperlevel = mpregenperlevel;
    }

    /**
     * @return the hpregenperlevel
     */
    public double getHpregenperlevel() {
        return hpregenperlevel;
    }

    /**
     * @param hpregenperlevel the hpregenperlevel to set
     */
    public void setHpregenperlevel(double hpregenperlevel) {
        this.hpregenperlevel = hpregenperlevel;
    }

    /**
     * @return the spellblockperlevel
     */
    public double getSpellblockperlevel() {
        return spellblockperlevel;
    }

    /**
     * @param spellblockperlevel the spellblockperlevel to set
     */
    public void setSpellblockperlevel(double spellblockperlevel) {
        this.spellblockperlevel = spellblockperlevel;
    }

    /**
     * @return the armorperlevel
     */
    public double getArmorperlevel() {
        return armorperlevel;
    }

    /**
     * @param armorperlevel the armorperlevel to set
     */
    public void setArmorperlevel(double armorperlevel) {
        this.armorperlevel = armorperlevel;
    }

    /**
     * @return the mpperlevel
     */
    public double getMpperlevel() {
        return mpperlevel;
    }

    /**
     * @param mpperlevel the mpperlevel to set
     */
    public void setMpperlevel(double mpperlevel) {
        this.mpperlevel = mpperlevel;
    }

    /**
     * @return the hpperlevel
     */
    public double getHpperlevel() {
        return hpperlevel;
    }

    /**
     * @param hpperlevel the hpperlevel to set
     */
    public void setHpperlevel(double hpperlevel) {
        this.hpperlevel = hpperlevel;
    }
}
