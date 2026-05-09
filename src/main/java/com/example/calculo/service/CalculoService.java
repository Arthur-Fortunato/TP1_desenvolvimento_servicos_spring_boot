package com.example.calculo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculoService {
    public int adicao(int num1, int num2){
        return num1 + num2;
    }

    public int subtracao(int num1, int num2){
        return num1 - num2;
    }

    public int multiplicacao(int num1, int num2){
        return num1 * num2;
    }

    public int divisao(int num1, int num2){
        return num1 / num2;
    }

    public int potenciacao(int num1, int num2){
        return (int) Math.pow(num1, num2);
    }
}
