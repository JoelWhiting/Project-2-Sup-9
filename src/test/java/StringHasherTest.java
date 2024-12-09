import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.security.NoSuchAlgorithmException;

/**
 * Unit tests for the StringHasher utility class.
 */
public class StringHasherTest {

    /**
     * Tests the hashString function to ensure it generates a valid hash.
     * @throws NoSuchAlgorithmException If the hashing algorithm is not supported.
     */
    @Test
    public void testHashString() throws NoSuchAlgorithmException {
        String input = "password";
        String hash = StringHasher.hashString(input, HashAlgorithm.SHA256);
        assertNotNull(hash);
        assertEquals(64, hash.length()); // SHA-256 generates 64 characters in hex
    }

    /**
     * Tests the verifyHash function to ensure it correctly validates a matching hash.
     * @throws NoSuchAlgorithmException If the hashing algorithm is not supported.
     */
    @Test
    public void testVerifyHash() throws NoSuchAlgorithmException {
        String input = "password";
        String hash = StringHasher.hashString(input, HashAlgorithm.SHA256);
        assertTrue(StringHasher.verifyHash(input, hash, HashAlgorithm.SHA256));
        assertFalse(StringHasher.verifyHash(input, "incorrectHash", HashAlgorithm.SHA256));
    }

    /**
     * Tests the generateSaltedHash function to ensure it correctly generates a salted hash.
     * @throws NoSuchAlgorithmException If the hashing algorithm is not supported.
     */
    @Test
    public void testGenerateSaltedHash() throws NoSuchAlgorithmException {
        String input = "password";
        String salt = "randomSalt";
        String hash = StringHasher.generateSaltedHash(input, salt, HashAlgorithm.SHA256);
        assertNotNull(hash);
        assertEquals(64, hash.length()); // SHA-256 generates 64 characters in hex
    }
}
