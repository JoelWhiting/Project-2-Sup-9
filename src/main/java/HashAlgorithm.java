/**
 * Enumeration of supported hash algorithms.
 */
public enum HashAlgorithm {
    /** MD5 hashing algorithm */
    MD5("MD5"),
    /** SHA-1 hashing algorithm */
    SHA1("SHA-1"),
    /** SHA-256 hashing algorithm */
    SHA256("SHA-256");

    private final String algorithm;

    HashAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * Gets the algorithm name.
     * @return The name of the algorithm.
     */
    public String getAlgorithm() {
        return algorithm;
    }
}
