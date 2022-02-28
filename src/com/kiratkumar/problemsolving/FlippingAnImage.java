package com.kiratkumar.problemsolving;

import com.kiratkumar.Util;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FlippingAnImage {

    public static void main(String[] args) {
        int[][] image1 = {{1,1,0},{1,0,1},{0,0,0}};
        Util.print2D(flipAndInvertImage(image1));

        int[][] image2 = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        Util.print2D(flipAndInvertImage(image2));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++) {
            for(int j=0; j<image[i].length/2; j++) {
                int first = image[i][j];
                int last = image[i][(image[i].length - 1) - j];

                first = first == 1?0:1;
                last = last == 1?0:1;

                image[i][j] = last;
                image[i][(image[i].length - 1) - j] = first;
            }

            if(image[i].length % 2 != 0) {
                int temp = image[i][(image[i].length/2)];
                temp = temp == 1?0:1;
                image[i][(image[i].length/2)] = temp;
            }

        }
        return image;
    }
}
