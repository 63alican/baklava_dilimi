package com.alican.baklavaDilimi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BaklavaDilimiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaklavaDilimiApplication.class, args);


		int sayi=11;
		for (int i =1;i<=sayi;i++){
			for (int j = sayi; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}



		for (int i = 1;i<=sayi ; i++) {
			for (int j =0;j<i; j++) {
				System.out.print(" ");

			}
			for (int b =sayi;b>i ; b--) {
				System.out.print("*"+" ");

			}
			System.out.println("");


		}

/**        for (int i =sayi;0<sayi;i--){
 for (int j = sayi; 0<j; j--) {
 System.out.print("*");
 }
 for (int j = 0; j < i; j++) {
 System.out.print("*"+" ");
 }
 System.out.println("");
 }
 **/


	}

}
