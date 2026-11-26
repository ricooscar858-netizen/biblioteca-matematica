/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecamatematica_ricooscar;

/**
 *
 * @author ciclost
 */
public class Matematicas {
    public static int fibonacci(int n) {
if (n <= 1) {
return n;
}
return fibonacci(n - 1) + fibonacci(n - 2);
}
    public static int maximoComunDivisor(int a, int b) {
while (b != 0) {
int temporal = b;
b = a % b;
a = temporal;
}
return a;
}
    
}
