/*
 * Copyright (C) 2021 John
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Fiona {
public static String myName = "Fiona";
public static String input;
public static  boolean bn = true;
public static boolean friend = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Fiona codes
       
        if(bn) {
             print("Welcome I am Fiona. How Can I Help You?");
             bn = false;
        }
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        String data = input.toLowerCase();
        if(data.contains("exit") || data.contains("bye") || data.contains("go away")) {
            print("Bye");
            System.exit(0);
        } else if(data.contains("how are you doing") || data.contains("how are you doing today")) {
            print("I'm Fine Thank You And You?");
         
        } else if(data.contains("i'm fine") || data.contains("i am fine") || data.contains("i'm good")) {
            print("That Is Good To Know");
        } else if(data.contains("fuck you") || data.contains("bitch") || data.contains("idiot") || data.contains("stupid")) {
            print("That Is Offensive!!!");
        } else if(data.contains("who cares")) {
            print("I Do");
        } else if(data.contains("that's cool") || data.contains("that is cool") || data.contains("cool")) {
            print("I Agree With You");
        } else if(data.contains("be my friend")) {
            if(friend == true) {
                print("I'm Already Your Friend");
            } else {
            print("I'll be your friend");
            friend = true;
            }
        } else if(data.contains("i wanna talk")) {
            print("I'm All Ears");
        } else if(data.contains("thanks")) {
			print("Anytime");
		}
		else if(data.contains("who are you")) {
            print("I Am Fiona. A Friendly Chat Bot Created With Love By John Oye");
        } else if(data.contains("what can i do with you")) {
            print("You Can Share Your Thoughts With Me. And You Can Ask Me Questions");
        }
        /*unrecognized */ else if(!data.contains("exit") || !data.contains("how are you doing") || !data.contains("how are you doing today") || !data.contains("i'm fine") || !data.contains("i am fine")) {
            print("Oops I Do Not Understand What You Are Saying, We Are Working On That");
        }
        main(new String[]{"Fiona"});
    }
    public static void print(String s) {
        if(friend == false) {
        System.out.println(myName +" :: "+s);
        } else {
             System.out.println(myName +" :: "+s+" Friend");
        }
    }
}