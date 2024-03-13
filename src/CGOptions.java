public class CGOptions {
    // Constants
    public static final int DEFAULT_MAX_FUNCS = 10;
    public static final int DEFAULT_MAX_PARAMS = 5;
    public static final int DEFAULT_FUNC1_MAX_PARAMS = 3;
    public static final int DEFAULT_COVERAGE_TEST_SIZE = 500;
    public static final int DEFAULT_MAX_BLOCK_SIZE = 4;
    public static final int DEFAULT_MAX_BLOCK_DEPTH = 5;
    public static final int DEFAULT_MAX_EXPR_DEPTH = 10;
    public static final int DEFAULT_MAX_STRUCT_FIELDS = 10;
    public static final int DEFAULT_MAX_UNION_FIELDS = 5;
    public static final int DEFAULT_MAX_NESTED_STRUCT_LEVEL = 3;
    public static final int DEFAULT_MAX_INDIRECT_LEVEL = 5;
    public static final int DEFAULT_MAX_ARRAY_DIMENSIONS = 3;
    public static final int DEFAULT_MAX_ARRAY_LENGTH_PER_DIMENSION = 10;
    public static final int DEFAULT_MAX_ARRAY_LENGTH = 256;
    public static final int DEFAULT_MAX_ARRAY_NUM_IN_LOOP = 4;
    public static final int DEFAULT_MAX_EXHAUSTIVE_DEPTH = -1;
    public static final int DEFAULT_MAX_SPLIT_FILES = 0;
    public static final String DEFAULT_SPLIT_FILES_DIR = "./output";
    public static final String DEFAULT_OUTPUT_FILE = "";
    public static final String PLATFORM_CONFIG_FILE = "platform.info";

    // Static variables
    private static boolean computeHash;
    private static boolean depthProtect;
    private static int maxSplitFiles;
    private static String splitFilesDir;
    private static String outputFile;
    private static int maxFuncs;
    private static int maxParams;
    private static int maxBlockSize;
    private static int maxBlkDepth;
    private static int maxExprDepth;
    private static boolean wrapVolatiles;
    private static boolean allowConstVolatile;
    private static boolean avoidSignedOverflow;
    private static int maxStructFields;
    private static int maxUnionFields;
    private static int maxNestedStructLevel;
    private static String structOutput;
    private static boolean fixedStructFields;
    private static boolean expandStruct;
    private static boolean useStruct;
    private static boolean useUnion;
    private static int maxIndirectLevel;
    private static int maxArrayDimensions;
    private static int maxArrayLengthPerDimension;
    private static int maxArrayLength;
    private static boolean compoundAssignment;
    private static int interestedFacts;
    private static boolean paranoid;
    private static boolean quiet;
    private static boolean concise;
    private static boolean noMain;
    private static boolean randomBased;
    private static boolean dfsExhaustive;
    private static String dfsDebugSequence;
    private static int maxExhaustiveDepth;
    private static boolean compactOutput;
    private static int func1MaxParams;
    private static boolean klee;
    private static boolean crest;
    private static boolean ccomp;
    private static boolean coverageTest;
    private static int coverageTestSize;
    private static boolean prefixName;
    private static boolean sequenceNamePrefix;
    private static boolean compatibleCheck;
    private static boolean packedStruct;
    private static boolean bitfields;
    private static String partialExpand;
    private static String deltaMonitor;

    // Getters and setters for each static variable
    // ... (omitted for brevity)
}