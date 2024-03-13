import java.util.Random;

public class RandomNumber {
    private static RandomNumber instance;
    private Random rnd;
    private String traceDepth;

    private RandomNumber() {
        rnd = new Random();
        traceDepth = "";
    }

    public static RandomNumber getInstance() {
        if (instance == null) {
            instance = new RandomNumber();
        }
        return instance;
    }

    public String getPrefixedName(String name) {
        if (!CGOptions.prefixName()) {
            return name;
        }
        if (!CGOptions.sequenceNamePrefix()) {
            AbsProgramGenerator instance = AbsProgramGenerator.getInstance();
            assert instance != null;
            return instance.getCountPrefix(name);
        }
        return rnd.getPrefixedName(name);
    }

    public String randomHexDigits(int num) {
        return rnd.randomHexDigits(num);
    }

    public String randomDigits(int num) {
        return rnd.randomDigits(num);
    }

    public int rndUpto(int n, Filter f, String where) {
        return rnd.rndUpto(n, f, where);
    }

    public boolean rndFlipcoin(int p, Filter f, String where) {
        return rnd.rndFlipcoin(p, f, where);
    }

    public String pureRandomHexDigits(int num) {
        if (!CGOptions.isRandom()) {
            RNDNUM_GENERATOR old = RandomNumber.switchRndNumGenerator(rDefaultRndNumGenerator);
            String rv = randomHexDigits(num);
            RandomNumber.switchRndNumGenerator(old);
            return rv;
        } else {
            return randomHexDigits(num);
        }
    }

    public String pureRandomDigits(int num) {
        if (!CGOptions.isRandom()) {
            RNDNUM_GENERATOR old = RandomNumber.switchRndNumGenerator(rDefaultRndNumGenerator);
            String rv = randomDigits(num);
            RandomNumber.switchRndNumGenerator(old);
            return rv;
        } else {
            return randomDigits(num);
        }
    }

    public int pureRndUpto(int n, Filter f, String where) {
        if (n == 0) return 0;
        if (!CGOptions.isRandom()) {
            RNDNUM_GENERATOR old = RandomNumber.switchRndNumGenerator(rDefaultRndNumGenerator);
            int rv = rndUpto(n, f, where);
            RandomNumber.switchRndNumGenerator(old);
            return rv;
        } else {
            return rndUpto(n, f, where);
        }
    }

    public boolean pureRndFlipcoin(int p, Filter f, String where) {
        if (!CGOptions.isRandom()) {
            RNDNUM_GENERATOR old = RandomNumber.switchRndNumGenerator(rDefaultRndNumGenerator);
            boolean rv = rndFlipcoin(p, f, where);
            RandomNumber.switchRndNumGenerator(old);
            return rv;
        } else {
            return rndFlipcoin(p, f, where);
        }
    }

    public String traceDepth() {
        return traceDepth;
    }

    public void getSequence(StringBuilder sequence) {
        // Implementation of getSequence method
    }

    // Additional methods for switchRndNumGenerator and other functionalities
}