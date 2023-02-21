/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment4;

/**
 *
 * @author pypat
 */
public class Assignment4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        def print_hello_world(n):
    # Base case: if n is 0, return and stop recursion
    if n == 0:
        return
    # Recursive case: print "Hello World" and call the function again with n-1
    print("Hello World")
    print_hello_world(n-1)

    }
}
