package com.example.bmi;

import java.io.PrintStream;
import java.util.Scanner;

public class BMIModel {
    private double weight;
    private double height;

    public BMIModel(String w, String h){
        this.weight = Double.parseDouble(w);
        this.height = Double.parseDouble(h);
    }

    public String getBMI(){
        double index = this.weight/(this.height*this.height);
        String result = String.format("%.1f", index);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;

        BMIModel myModel = new BMIModel("90", "1.8");
        String myBMI = myModel.getBMI();
        output.println(myBMI);
    }
}
