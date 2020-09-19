package com.company;

public class Main {

    public static void main(String[] args) {



        
        // Écrire un programme qui retourne le code entier de la lettre 'a'
        char letter = 'a';
        System.out.println((int)letter);



        // Écrire une lettre qui retourne la majuscule d'une lettre minuscule donnée
        String secondLetter = "b";
        System.out.println(secondLetter.toUpperCase());




        // Écrire un programme qui retourne la moyenne de trois entiers donnés en entrée
        int x, y, z;
        x = 12;
        y = 14;
        z = 10;
        System.out.println("moyenne: "+ (x + y + z)/3);




        // Écrire un programme qu retourne la somme et le quotient de deux nombres donnés en entrée
        int c, d;
        c = 21;
        d = 3;
        System.out.println("somme: "+ (c + d));
        System.out.println("quotient: "+ (c / d));




        // Écrire un programme qui permute 5 nombres entrés sous ce format a,b,c,d,e devient d,c,e,b,a
        int value1 = 1, value2 = 2, value3 = 3, value4 = 4, value5 = 5;

        value1 = value4;
        value3 = value2++;
        value5 = value4--;
        value4--;
        value5 = (value1 - 3);
        value3 = (value1 + 1);

        System.out.print(value1+", ");
        System.out.print(value2+", ");
        System.out.print(value3+", ");
        System.out.print(value4+", ");
        System.out.print(value5);

    }
}
