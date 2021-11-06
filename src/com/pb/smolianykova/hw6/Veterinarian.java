package com.pb.smolianykova.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println(animal.getKind() + "; Еда: " + animal.getFood() + "; Среда обитания: " + animal.getLocation());
    }
}
