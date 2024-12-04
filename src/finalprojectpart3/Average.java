/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectpart3;
import java.util.Scanner;
/**
 *
 * @author arist
 */
public class Average {
    private double mean;
    private int data[] = new int[5];
    
    public Average() {
        Scanner input = new Scanner(System.in);
        for (int numOfScoresEntered = 1; numOfScoresEntered <= 5; numOfScoresEntered++) {
            System.out.print("enter score number "+numOfScoresEntered+": ");
            int num = input.nextInt();
            data[numOfScoresEntered - 1] = num;
        }
        calculateMean();
        selectionSort();
    }

    public void calculateMean() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            int num = this.data[i - 1];
            sum += num;
        }
        this.mean = sum/5;
    }
    public void selectionSort() {
        //compare two first digits, swap if needed, then continue until done
        int comparedTo = 1;
        for (int i = 0; i <= 3; i++) {
            for (int j = comparedTo; j <= 4; j++) {
                if (this.data[i] < this.data[j]) {
                    int num = this.data[i];
                    this.data[i] = this.data[j];
                    this.data[j] = num;
                }
            }
            comparedTo += 1;
        }
    }
    
    @Override
    public String toString() {
        selectionSort();
        String s = "";
        for (int e : data) {
            s += e + " ";
        }
        return s + "\n" + mean;
    }
}
