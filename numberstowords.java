package numbers;

import java.io.*;
import java.util.*;

public class numberstowords {
	static boolean space;
	static int xa;
	public static void main (String[] args) throws Exception {
		System.out.println("How many spaces in between words? If you don't know, just say 0");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		xa = Integer.parseInt(br.readLine());
		if (xa == 0) {
			space = false;
		}
		else {
			space = true;
		}
		System.out.println("Type your sentence in numbers here:");
		String num = br.readLine();
		String str1 = wordconvert(num);
		System.out.println(str1);
	}
	public static char numberconvert(int x) {
		x += 48;
		char a = (char) x;
		return a;
	}
	public static String wordconvert (String x) {
		String ret = "";
		int a = x.length();
		char c; char car;
		if (!space) {
			for (int i = 0; i < a; i++) {
				c = x.charAt(i);
				if (c == ' ') {
					if (i == a-1 || x.charAt(i+1) != ' ') {
						continue;
					}
					else {
						ret+= " ";
						char cr = ' ';
						while (cr == ' ' ) {
							cr = x.charAt(i+2);
							i++;
						}
					}
				}
				else if (c == ',' || c == '\'' || c == '.' || c == '!' || c == '?' || c == '*' || c == '(' || c == ')') {
					ret += c;
				}
				else {
					if (i == a-1 || x.charAt(i+1) == ' ') {
						int b = (int) c;
						car = numberconvert(b);
						ret+=car;
					}
					else if (x.charAt(i+1) == ',' || x.charAt(i+1) == '\'' || x.charAt(i+1) == '.' 
							|| x.charAt(i+1) == '!' || x.charAt(i+1) == '?' || x.charAt(i+1) == '*' 
							|| x.charAt(i+1) == '(' || x.charAt(i+1) == ')') {
						int b = (int) c;
						car = numberconvert(b);
						ret+=car;
					}
					else {
						String y = x.substring(i, i+2);
						int b = Integer.parseInt(y);
						b+=96;
						car = (char) b;
						ret+=car;
						i++;
					}
				}
			}
		}
		else {
			for (int i = 0; i < a; i++) {
				c = x.charAt(i);
				if (c == ' ') {
					if (i == a-1 || x.charAt(i+1) != ' ') {
						continue;
					}
					else {
						ret+=" ";
						i+= xa-2;
					}
				}
				else if (c == ',' || c == '\'' || c == '.' || c == '!' || c == '?' || c == '*' || c == '(' || c == ')') {
					ret += c;
				}
				else {
					if (i == a-1 || x.charAt(i+1) == ' ') {
						int b = (int) c;
						car = numberconvert(b);
						ret+=car;
					}
					else if (x.charAt(i+1) == ',' || x.charAt(i+1) == '\'' || x.charAt(i+1) == '.' 
							|| x.charAt(i+1) == '!' || x.charAt(i+1) == '?' || x.charAt(i+1) == '*'
							|| x.charAt(i+1) == '(' || x.charAt(i+1) == ')') {
						int b = (int) c;
						car = numberconvert(b);
						ret+=car;
					}
					else {
						String y = x.substring(i, i+2);
						int br = Integer.parseInt(y);
						br+=96;
						car = (char) br;
						ret+=car;
						i++;
					}
				}
			}
		}
		return ret;
	}
}
