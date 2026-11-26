public class inheritanceExample3MultiLevelInheritance {
    public static void main(String args[]){
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
class WildAnimal{
    void eat(){
        System.out.println("eating...");
    }
}
class WildDog extends WildAnimal{
    void bark(){
        System.out.println("barking...");
    }
}
class BabyDog extends WildDog{
    void weep(){
        System.out.println("weeping...");
    }
}