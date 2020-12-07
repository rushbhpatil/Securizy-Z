/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypt;

import encrypt.AESencrypt;
import static encrypt.AESencrypt.name;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.SecureRandom;
import java.security.spec.KeySpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

/**
 *
 * @author Rushi Dada
 */
public class AESdecrypt {
    
    public void AESdecr(File fip, File fop, String pass) throws Exception {

        try{
	String nm = fip.getName();
        String name = nm.substring(0, nm.lastIndexOf("."));
        String password = pass;
                System.out.println("Name:- " + name);

		// reading the salt
		// user should have secure mechanism to transfer the
		// salt, iv and password to the recipient
                String saltnm = ("Keys\\"+name + ".salt.enc");
                String ivnm = ("Keys\\"+name + ".iv.enc");
		FileInputStream saltFis = new FileInputStream(saltnm);
		byte[] salt = new byte[8];
		saltFis.read(salt);
		saltFis.close();

		// reading the iv
		FileInputStream ivFis = new FileInputStream(ivnm);
		byte[] iv = new byte[16];
		ivFis.read(iv);
		ivFis.close();

		SecretKeyFactory factory = SecretKeyFactory
				.getInstance("PBKDF2WithHmacSHA1");
		KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, 65536,
				256);
		SecretKey tmp = factory.generateSecret(keySpec);
		SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");

		// file decryption
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, secret, new IvParameterSpec(iv));
		FileInputStream fis = new FileInputStream(fip);
                
               fop = new File(fop.getParent().concat("\\").concat(name));
               
               
		FileOutputStream fos = new FileOutputStream(fop);
		byte[] in = new byte[64];
		int read;
		while ((read = fis.read(in)) != -1) {
			byte[] output = cipher.update(in, 0, read);
			if (output != null)
				fos.write(output);
		}

		byte[] output = cipher.doFinal();
		if (output != null)
			fos.write(output);
		fis.close();
		fos.flush();
		fos.close();
		System.out.println("File Decrypted.");
	}
    
    catch (IOException e)
		{
			e.printStackTrace();
                         JOptionPane.showMessageDialog(null, e);
		}
        catch (Exception ee)
        {
            ee.printStackTrace();
            JOptionPane.showMessageDialog(null, ee);         
        }
    }
}
