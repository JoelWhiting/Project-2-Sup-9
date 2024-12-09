import java.security.NoSuchAlgorithmException;

/**
 * Main class to demonstrate the functionality of StringHasher.
 */
public class Main {

    /**
     * Main method to execute hashing functionalities.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        try {
            String input = "password";
            String salt = "randomSalt";

            System.out.println("### Hashing a String ###");
            String sha256Hash = StringHasher.hashString(input, HashAlgorithm.SHA256);
            System.out.println("SHA-256 Hash: " + sha256Hash);

            System.out.println("\n### Verifying a Hash ###");
            boolean isMatch = StringHasher.verifyHash(input, sha256Hash, HashAlgorithm.SHA256);
            System.out.println("Does the hash match? " + isMatch);

            System.out.println("\n### Generating Salted Hash ###");
            String saltedHash = StringHasher.generateSaltedHash(input, salt, HashAlgorithm.SHA256);
            System.out.println("Salted SHA-256 Hash: " + saltedHash);

        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
