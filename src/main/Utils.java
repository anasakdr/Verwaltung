/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import static main.Main.conn;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * Die Klasse Utils enthält verschiedenen Methoden
 *
 * @author anas
 * @version 0.1
 */
public class Utils {

    /**
     * Die Methode stellt eine Verbindung zwischen dem Programm und einer
     * Datenbank her
     *
     * @return Connection mit user Datenbank
     */
    public static Connection getConnection() {

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/generator?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    /**
     * Die Method prüft ob die übergebenen Felder leer sind
     *
     * @param strings Enthält Zeichenkette/n die überprüft werden sollen
     * @return gibt den wahrheitswert zurück
     */
    public static boolean isEmpty(String... strings) {
        for (String s : strings) {
            if (s.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Die Methode gibt den Hashwert des übergebenen Inputs zurück
     *
     * @param input enthält den Wert, weclher gehasht werden soll
     * @return gehashter Wert vom Input
     * @throws NoSuchAlgorithmException
     */
    public static String sha256(String input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA-256");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

    public static String aesEncryption(String pass) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        // Das Passwort bzw der Schluesseltext
        String keyStr = "geheim";
// byte-Array erzeugen
        byte[] key = (keyStr).getBytes("UTF-8");
// aus dem Array einen Hash-Wert erzeugen mit MD5 oder SHA
        MessageDigest sha = MessageDigest.getInstance("SHA-256");
        key = sha.digest(key);
// nur die ersten 128 bit nutzen
        key = Arrays.copyOf(key, 16);
// der fertige Schluessel
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
        String text = pass;

// Verschluesseln
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] encrypted = cipher.doFinal(text.getBytes());

// bytes zu Base64-String konvertieren (dient der Lesbarkeit)
        BASE64Encoder myEncoder = new BASE64Encoder();
        String geheim = myEncoder.encode(encrypted);
        return geheim;
    }

    public static String aesDecryption(String passwortGeheim) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, IOException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

        // Das Passwort bzw der Schluesseltext
        String keyStr = "geheim";
// byte-Array erzeugen
        byte[] key = (keyStr).getBytes("UTF-8");
// aus dem Array einen Hash-Wert erzeugen mit MD5 oder SHA
        MessageDigest sha = MessageDigest.getInstance("SHA-256");
        key = sha.digest(key);
// nur die ersten 128 bit nutzen
        key = Arrays.copyOf(key, 16);
// der fertige Schluessel
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");

        String geheim = passwortGeheim;

// BASE64 String zu Byte-Array konvertieren
        BASE64Decoder myDecoder2 = new BASE64Decoder();
        byte[] crypted2 = myDecoder2.decodeBuffer(geheim);

// Entschluesseln
        Cipher cipher2 = Cipher.getInstance("AES");
        cipher2.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] cipherData2 = cipher2.doFinal(crypted2);
        String erg = new String(cipherData2);
        return erg;
    }

}
