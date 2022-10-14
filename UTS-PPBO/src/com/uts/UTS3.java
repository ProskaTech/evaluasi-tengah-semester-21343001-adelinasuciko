/*
 * Created by: 21343001_ADELINA SUCIKO
 */

package com.uts;

import javax.swing.JOptionPane;

public class UTS3 {

	public static void main(String[] args) {
		String bilangan = "", message = "";
        int angka;

        bilangan = JOptionPane.showInputDialog("Masukkan Nilai : ");
        angka = Integer.parseInt(bilangan);

        if(angka >= 0) {
            message = angka + " merupakan bilangan POSITIF";
        }
        else if(angka < 0) {
            message = angka + " merupakan bilangan NEGATIF";
        }
        else{
            message = " Merupakan bilangan 0";
        }
        JOptionPane.showMessageDialog(null, message);
        System.out.println(message);
        		
	}

}
