import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.security.NoSuchAlgorithmException;

public class StringHasherTest {

    @Test
    public void testHashString() throws NoSuchAlgorithmException {
        String input = "password";
        String hash = StringHasher.hashString(input, HashAlgorithm.SHA256);
        assertNotNull(hash);
        assertEquals(64, hash.length()); // SHA-256 produces 64 hex chars
    }

    @Test
    public void testVerifyHash() throws NoSuchAlgorithmException {
        String input = "password";
        String hash = StringHasher.hashString(input, HashAlgorithm.SHA256);
        assertTrue(StringHasher.verifyHash(input, hash, HashAlgorithm.SHA256));
        assertFalse(StringHasher.verifyHash(input, "wronghash", HashAlgorithm.SHA256));
    }

    @Test
    public void testGenerateSaltedHash() throws NoSuchAlgorithmException {
        String input = "password";
        String salt = "randomSalt";
        String hash = StringHasher.generateSaltedHash(input, salt, HashAlgorithm.SHA256);
        assertNotNull(hash);
        assertEquals(64, hash.length());
    }
}
