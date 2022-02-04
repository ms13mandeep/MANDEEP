/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modified by Megha Patel
 * @modified by Mandeep Singh
 * @date January 29, 2022
 */
public class CardTrick {
    public static void printInfo(){
        
    }
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Scanner scnr = new Scanner(System.in);
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            c.setValue((int) (1 + Math.random() * 14));
            magicHand[i]=c;
//            System.out.println(c.getSuit() + " " + c.getValue());
        }
        Card userCard= new Card();
        System.out.println("Enter Card number or face of your choice");
        String userNum = scnr.nextLine();
        int userCNum;
        System.out.println("Enter Card suit of your choice");
        String userSuit = scnr.nextLine();
        if (userNum.equals("Ace")) {
            userCNum = 1;
        } else if (userNum.equals("Jack")) {
            userCNum = 11;
        } else if (userNum.equals("Queen")) {
            userCNum = 12;
        } else if (userNum.equals("King")) {
            userCNum = 13;
        }
        else{
            userCNum=Integer.parseInt(userNum);
        }
        userCard.setSuit(userSuit);
        userCard.setValue(userCNum);
        
        for (int i = 0; i < magicHand.length; i++) {
            if(((magicHand[i].getSuit()).equals(userCard.getSuit()))&&((magicHand[i].getValue())==(userCard.getValue()))){
                System.out.println("Congrats! You Won! Your card was in the Magic Hand");
                printInfo();
                break;
            }
            else if(i==(magicHand.length-1)){
                System.out.println("You lost, Try again!");
      
            }
        }
    }

}
