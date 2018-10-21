package ngan;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class thuchanh {
	Vector list = new Vector();
	public thuchanh() {
		while(true) {
			System.out.println("Quan Ly Ban Nha");
			System.out.println("1. Nhap Thong Tin");
			System.out.println("2. Xem Thong Tin");
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println("Moi ban chon chuc nang: ");
			n = key.nextInt();
			switch(n) {
				case 1: NhapTT();
					break;
				case 2: InTT();
					break;
			}
		}
	}
	public void NhapTT() {
		Scanner key = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong nha: ");
		n =Integer.parseInt(key.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Nhap So Nha: ");
			String so=key.nextLine();
			System.out.println("Nhap Ten Duong: ");
			String duong=key.nextLine();
			System.out.println("Nhap So Phong");
			String phong=key.nextLine();	
			bt2 b = new bt2(so,duong, phong);
			list.add(b);
		}	
		
	}
	public void InTT() {
		Enumeration s = list.elements();
		int i=1;
		while(s.hasMoreElements()) {
			bt2 sa=(bt2)s.nextElement();
			System.out.println("So Nha: "+sa.getSo()+"\nTen Duong: "+sa.getDuong()+"\nSo Phong: "+sa.getPhong());
		}
	}			
	public static void main(String[] args) {
		new thuchanh();
	}

}


