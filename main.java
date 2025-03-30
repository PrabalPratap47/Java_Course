import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.ChaCha20ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.interfaces.RSAPublicKey;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class main{

    // Function to convert hex string to bytes
    public static byte[] hexToBytes(String hexString) {
        int len = hexString.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4)
                    + Character.digit(hexString.charAt(i + 1), 16));
        }
        return data;
    }

    // Function to calculate entropy
    public static double calculateEntropy(byte[] data) {
        int[] frequency = new int[256];
        for (byte b : data) {
            frequency[b & 0xFF]++;
        }

        double entropy = 0;
        int length = data.length;
        for (int f : frequency) {
            if (f > 0) {
                double probability = (double) f / length;
                entropy += probability * (Math.log(probability) / Math.log(2));
            }
        }

        return -entropy;
    }

    // Function to test against known algorithms
    public static String testKnownAlgorithms(byte[] data) {

        // Test AES
        try {
            SecretKey aesKey = new SecretKeySpec("Sixteen byte key".getBytes(StandardCharsets.UTF_8), "AES");
            Cipher aesCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            aesCipher.init(Cipher.DECRYPT_MODE, aesKey);
            byte[] decrypted = aesCipher.doFinal(data);
            return "AES might be the algorithm.";
        } catch (Exception e) {
            System.out.println("AES decryption failed: " + e.getMessage());
        }

        // Test DES
        try {
            SecretKey desKey = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec("8bytekey".getBytes(StandardCharsets.UTF_8)));
            Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            desCipher.init(Cipher.DECRYPT_MODE, desKey);
            byte[] decrypted = desCipher.doFinal(data);
            return "DES might be the algorithm.";
        } catch (Exception e) {
            System.out.println("DES decryption failed: " + e.getMessage());
        }

        // Test 3DES (DESede)
        try {
            SecretKey des3Key = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec("16bytekey1234".getBytes(StandardCharsets.UTF_8)));
            Cipher des3Cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            des3Cipher.init(Cipher.DECRYPT_MODE, des3Key);
            byte[] decrypted = des3Cipher.doFinal(data);
            return "3DES might be the algorithm.";
        } catch (Exception e) {
            System.out.println("3DES decryption failed: " + e.getMessage());
        }

        // Test Blowfish
        try {
            SecretKey blowfishKey = new SecretKeySpec("8bytekey".getBytes(StandardCharsets.UTF_8), "Blowfish");
            Cipher blowfishCipher = Cipher.getInstance("Blowfish/ECB/PKCS5Padding");
            blowfishCipher.init(Cipher.DECRYPT_MODE, blowfishKey);
            byte[] decrypted = blowfishCipher.doFinal(data);
            return "Blowfish might be the algorithm.";
        } catch (Exception e) {
            System.out.println("Blowfish decryption failed: " + e.getMessage());
        }

        // Test RC4
        try {
            SecretKey rc4Key = new SecretKeySpec("secretkey".getBytes(StandardCharsets.UTF_8), "RC4");
            Cipher rc4Cipher = Cipher.getInstance("RC4");
            rc4Cipher.init(Cipher.DECRYPT_MODE, rc4Key);
            byte[] decrypted = rc4Cipher.doFinal(data);
            return "RC4 might be the algorithm.";
        } catch (Exception e) {
            System.out.println("RC4 decryption failed: " + e.getMessage());
        }

        // Test ChaCha20
        try {
            byte[] nonce = new byte[12];  // ChaCha20 nonce should be 12 bytes
            new SecureRandom().nextBytes(nonce);
            ChaCha20ParameterSpec paramSpec = new ChaCha20ParameterSpec(nonce, 1);
            SecretKey chachaKey = new SecretKeySpec("sixteenbytekey!".getBytes(StandardCharsets.UTF_8), "ChaCha20");
            Cipher chachaCipher = Cipher.getInstance("ChaCha20");
            chachaCipher.init(Cipher.DECRYPT_MODE, chachaKey, paramSpec);
            byte[] decrypted = chachaCipher.doFinal(data);
            return "ChaCha20 might be the algorithm.";
        } catch (Exception e) {
            System.out.println("ChaCha20 decryption failed: " + e.getMessage());
        }

        // Test RSA
        try {
            String publicKeyPEM = "-----BEGIN PUBLIC KEY-----\n...\n-----END PUBLIC KEY-----";  // Placeholder
            byte[] encodedPublicKey = Base64.getDecoder().decode(publicKeyPEM.replaceAll("-----\\w+ PUBLIC KEY-----", "").replaceAll("\\s", ""));
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(encodedPublicKey);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PublicKey rsaKey = keyFactory.generatePublic(keySpec);
            Cipher rsaCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            rsaCipher.init(Cipher.DECRYPT_MODE, rsaKey);
            byte[] decrypted = rsaCipher.doFinal(data);
            return "RSA might be the algorithm.";
        } catch (Exception e) {
            System.out.println("RSA decryption failed: " + e.getMessage());
        }

        return "Algorithm unknown.";
    }

    // Main function to analyze the dataset
    public static void analyzeData(String hexString) {
        byte[] dataBytes = hexToBytes(hexString);

        // Calculate and print entropy
        double entropy = calculateEntropy(dataBytes);
        System.out.printf("Entropy of the data: %.4f%n", entropy);

        // Attempt to identify the algorithm
        String algorithmGuess = testKnownAlgorithms(dataBytes);
        System.out.println(algorithmGuess);
    }

    // Example usage
    public static void main(String[] args) {
        String hexString = "your_hex_string_here";  // Replace with the actual hex string to analyze
        analyzeData(hexString);
    }
}
