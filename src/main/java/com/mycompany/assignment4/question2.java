/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4;

/**
 *
 * @author pypat
 */
public class question2 {
    def sum_multiples_of_seven(n1, n2):
    # Base case: if n1 is greater than n2, return 0
    if n1 > n2:
        return 0
    # Recursive case: add n1 to the sum if it is a multiple of 7 and call the function again with n1+1 and n2
    if n1 % 7 == 0:
        return n1 + sum_multiples_of_seven(n1+1, n2)
    # Recursive case: don't add n1 to the sum if it is not a multiple of 7 and call the function again with n1+1 and n2
    else:
        return sum_multiples_of_seven(n1+1, n2)

}
