import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringHasher {

    public static String hashString(String input, HashAlgorithm algorithm) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance(algorithm.getAlgorithm());
        byte[] hashBytes = digest.digest(input.getBytes());
        return bytesToHex(hashBytes);
    }

    public static boolean verifyHash(String input, String expectedHash, HashAlgorithm algorithm) throws NoSuchAlgorithmException {
        String computedHash = hashString(input, algorithm);
        return computedHash.equalsIgnoreCase(expectedHash);
    }

    public static String generateSaltedHash(String input, String salt, HashAlgorithm algorithm) throws NoSuchAlgorithmException {
        String combined = input + salt;
        return hashString(combined, algorithm);
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
