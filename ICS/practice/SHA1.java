import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.*;

public class SHA1{
public static void main(String[] args) throws NoSuchAlgorithmException{
Scanner in=new Scanner(System.in);
System.out.print("Enter message: ");
String input=in.nextLine();

MessageDigest md=MessageDigest.getInstance("SHA1");
md.update(input.getBytes());

byte[] digest=md.digest();
StringBuffer sb=new StringBuffer();
for(byte b : digest)
{
sb.append(String.format("%02x",b & 0xff));
}
System.out.println("SHA1 Hash: "+sb.toString());
}
}

Simpler
	