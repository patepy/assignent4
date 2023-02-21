/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4;

/**
 *
 * @author pypat
 */
public class question3 {
    def binary_search_recursive(arr, target, low, high):
    # Base case: if low is greater than high, the target is not in the array
    if low > high:
        return -1
    # Calculate the middle index and value
    mid = (low + high) // 2
    mid_val = arr[mid]
    # If the middle value is the target, return its index
    if mid_val == target:
        return mid
    # If the middle value is greater than the target, search the left half of the array recursively
    elif mid_val > target:
        return binary_search_recursive(arr, target, low, mid-1)
    # If the middle value is less than the target, search the right half of the array recursively
    else:
        return binary_search_recursive(arr, target, mid+1, high)
}
