import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Utility class for hashing and verifying strings.
 */
public class StringHasher {

    /**
     * Hashes a given input string using the specified hashing algorithm.
     * @param input The input string to hash.
     * @param algorithm The hashing algorithm to use.
     * @return The hashed string in hexadecimal format.
     * @throws NoSuchAlgorithmException If the algorithm is not supported.
     */
    public static String hashString(String input, HashAlgorithm algorithm) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance(algorithm.getAlgorithm());
        byte[] hashBytes = digest.digest(input.getBytes());
        return bytesToHex(hashBytes);
    }

    /**
     * Verifies if a given input string matches the expected hash.
     * @param input The input string to verify.
     * @param expectedHash The expected hash value.
     * @param algorithm The hashing algorithm used.
     * @return True if the input matches the hash, otherwise false.
     * @throws NoSuchAlgorithmException If the algorithm is not supported.
     */
    public static boolean verifyHash(String input, String expectedHash, HashAlgorithm algorithm) throws NoSuchAlgorithmException {
        String computedHash = hashString(input, algorithm);
        return computedHash.equalsIgnoreCase(expectedHash);
    }

    /**
     * Generates a salted hash of the input string.
     * @param input The input string to hash.
     * @param salt The salt value to add to the input.
     * @param algorithm The hashing algorithm to use.
     * @return The salted hash in hexadecimal format.
     * @throws NoSuchAlgorithmException If the algorithm is not supported.
     */
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
