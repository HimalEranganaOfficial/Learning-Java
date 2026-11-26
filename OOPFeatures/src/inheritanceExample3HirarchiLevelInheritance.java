class DomesticAnimal{
    void eat(){
        System.out.println("eating...");
    }
}
class DomesticDog extends DomesticAnimal{
    void bark(){System.out.println("barking...");
    }
}
class DomesticCat extends DomesticAnimal{
    void meow(){
        System.out.println("meowing...");
    }
}

class inheritanceExample3HirarchiLevelInheritance{
    public static void main(String args[]){
        DomesticCat c=new DomesticCat();
        c.meow();
        c.eat();
        //c.bark(); Compiler time error
        DomesticDog d = new DomesticDog();
        d.bark();
        d.eat();
    }
}