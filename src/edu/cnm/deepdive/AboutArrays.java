package edu.cnm.deepdive;

import java.util.Arrays;

public class AboutArrays {

  public static void main(String[] args) {
    int[] one = new int[3];//array with three elements set to 0
    int[] two = new int[]{10, 11, 12};//array with three elements but it is initialized
    //double[] a = new double[2.55]; will not compile
    double[] b = new double[4 * 5 / 2];//this is legal

    int x = 4;
    int y = 4;
    double[] c = new double[x * y];//creates empty area with 16 elements.
    int[] three = {10, 11, 12};//this is called an anonymous array because there is no type declared
    //on the right side.
    int[] four = {};//anonymous and empty array with size 0.

    int[] a1;
    int a2[];//is also legal
    int[] ids, types;// creates two one-dimensional arrays
    int ids2[], types2;//will create an int[] ids2 and an int types2 and is bad practice.

    String[] animals = {"parrot", "dog", "cat"};
    String[] myAnimals = animals;//myAnimals and animals are pointing to the same array
    String[] otherAnimals = {"parrot", "dog", "cat"};//this is a different array

    System.out.println(animals.equals(myAnimals));//true
    System.out.println(animals == myAnimals);//true
    System.out.println(Arrays.equals(animals, myAnimals));//true
    System.out.println();
    System.out.println(animals.equals(otherAnimals));//false
    System.out.println(animals == otherAnimals);//false
    System.out.println(Arrays.equals(animals, otherAnimals));//true

  }

}
