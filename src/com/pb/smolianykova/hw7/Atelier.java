package com.pb.smolianykova.hw7;

public class Atelier {
    public static void main(String[] args) {
        Pants pants1 = new Pants();
        Pants pants2 = new Pants("штаны", Size.XXS, "белый", 500, 90);
        Skirt skirt1 = new Skirt();
        Skirt skirt2 = new Skirt("шелк", Size.S, "желтый", 200, 70);
        Tie tie1 = new Tie();
        Tie tie2 = new Tie("горошек", Size.M, "синий", 50, 50);
        Tshirt t1 = new Tshirt();
        Tshirt t2 = new Tshirt("поло", Size.XS, "оранжевый", 150, "длинный");

        Clothes[] clothes = new Clothes[] {pants1, skirt1, tie1, t1, pants2, skirt2, tie2, t2};

        dressMan(clothes);
        dressWoman(clothes);
    }

    static void dressMan (Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                clothe.getInfo();
            }
        }
        System.out.println();
    }

    static void dressWoman (Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomanClothes) {
                clothe.getInfo();
            }
        }
        System.out.println();
    }
}
