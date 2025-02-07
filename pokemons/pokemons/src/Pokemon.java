public class Pokemon {
    private String name;
    private String gender;
    private String type;
    private String weakness;
    private int age;
    private int hp;
    private int attack;
    private int lvl;
    private int fullHp;


    public Pokemon(String name, String gender, String type, String weakness, int age, int hp, int attack, int lvl, int fullHp) {
        this.name = name;
        this.gender = gender;
        this.type = type;
        this.weakness = weakness;
        this.age = age;
        this.hp = hp;
        this.attack = attack;
        this.lvl = lvl;
        this.fullHp = fullHp;
    }


    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public String getType() {
        return this.type;
    }

    public String getWeakness() {
        return this.weakness;
    }

    public int getAge() {
        return this.age;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getHp() {
        return this.hp;
    }

    public int getLvl() {
        return this.lvl;
    }
    public int getFullHp(){
        return this.fullHp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        if (gender == "male" || gender == "female") {
            this.gender = gender;
        } else System.out.println("Invalid gender");
    }

    public void setType(String type) {
        if (type == "fire" || type == "water" || type == "grass") {
            this.type = type;
        } else System.out.println("invalid type");
    }

    public void setWeakness(String weakness) {
        if (type == "fire" || type == "water" || type == "grass") {
            this.weakness = weakness;
        } else System.out.println("invalid type for weakness");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAttack(int attack) {
        if (attack > 0 && attack < 100) {
            this.attack = attack;
        } else System.out.println("invalid value for attack");
    }

    public void setHp(int hp) {
        if (hp > 0 && hp < 100) {
            this.hp = hp;
        } else System.out.println("invalid value for hp");
    }

    public void setFullHp (int fullHp){
        if (fullHp > 0){
            this.fullHp = fullHp;
        }
        if (this.hp > fullHp) {
            this.hp = fullHp;
        }
    }

    public Pokemon levelUp() {
        if (this.lvl < 100) {
            this.hp = this.hp + ((this.hp) / 10);
            this.attack = this.attack + ((this.attack) / 10);
            this.lvl++;
        }
        return this;
    }

    ;

    public int fainted() {
        return 0;
    }

    public Pokemon evolve() {
        this.name = name + " " + "bombado";
        if (this.lvl < 100) {
            this.hp = this.hp + ((this.hp) / 10);
            this.attack = this.attack + ((this.attack) / 10);
            this.lvl = this.lvl++;
        }
        return this;
    }

    public String achievedNirvana() {
        this.weakness = null;
        return weakness;
    }


    public void attacked(Pokemon pal) {
        if (pal.type == "grass" && this.type == "water" || pal.type == "fire" && this.type == "grass" || pal.type == "water" && this.type == "fire") {
            this.hp = this.hp - (2 * pal.attack);
        }
        if (pal.type == "water" && this.type == "grass" || pal.type == "grass" && this.type == "fire" || pal.type == "fire" && this.type == "water") {
            this.hp = this.hp - (2 / pal.attack);
        } else this.hp = this.hp - pal.attack;
    }






}
