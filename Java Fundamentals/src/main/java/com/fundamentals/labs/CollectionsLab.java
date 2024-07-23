package com.fundamentals.labs;

import java.util.*;

public class CollectionsLab {

    public void task1() {

        ArrayList<String> pizzaPieces =
                new ArrayList<>();
    /* Add 10 different types of
     pizza pieces based on toppings */

        pizzaPieces.add("Supreme");
        pizzaPieces.add("Pepperoni");
        pizzaPieces.add("BBQ Chicken");
        pizzaPieces.add("Hawaiian");
        pizzaPieces.add("Veggie");
        pizzaPieces.add("Buffalo Chicken");
        pizzaPieces.add("Meat Lovers");
        pizzaPieces.add("Four Cheese");
        pizzaPieces.add("Pesto");
        pizzaPieces.add("Spinach an Feta");

        //Print size of collection
        System.out.println("Size of the" +
                " collection: " + pizzaPieces.size());

        String piece;
        for (String pizzaPiece : pizzaPieces) {

            System.out.println(pizzaPiece);
        }

    }
     public HashSet<Integer>task2(int totalCapacity) {

        HashSet<Integer> resultSet = new HashSet<>();


        for (int i = 0; i <= totalCapacity; i++) {
            if (i % 5 == 0) {
                resultSet.add(i);
            }

        }
        return resultSet;
    }

    public static void main(String[] args) {
        CollectionsLab lab = new CollectionsLab();

    }
   // FavoriteBooks books = new FavoriteBooks();



    //    books.listFavorite books
    public void listFavoriteBooks() {

        Map<Integer, String>
                favoriteBooks = new HashMap<>();

        favoriteBooks.put(Integer.valueOf("0385755886"), "The Book Thief by Markus Zusak");

        favoriteBooks.put(Integer.valueOf("1542005221"), "If You Tell by Gregg Olsen");

        favoriteBooks.put(Integer.valueOf("0316769487"), "TheCatcher in the Rye by J.D. SALINGER");

        favoriteBooks.put(Integer.valueOf("0061120081"), "To Kill a Mockingbird by Harper Lee");

        favoriteBooks.put(Integer.valueOf("0425274861"), "Big Little Lies by Liane Moriarty");

              for (Map.Entry<Integer, String> entry :
              favoriteBooks.entrySet()) {
                  System.out.println("ISBN. 10: " + entry.getKey() + " - Title: " + entry.getValue());
        }



    }




}



