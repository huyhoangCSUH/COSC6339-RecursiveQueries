public class RQ_CALL {

	public static final String dbType = "column";
	public static String O1 = "N";
	public static String O2 = "N";
	public static String O3 = "N";
	public static String O4 = "y";
	public static String intermedProjections = "N";
	public static String createIndex1 = "N";
	public static String createIndex2 = "N";
	//public static final int depth = 2;
	public static void main(String[] args) {
	    	int recursiveDepth = 2;
		String tableName = "webgoogle" + recursiveDepth;
                //O3= args[0];
		
		String inputFile = tableName + "_groupopt.txt";
		String inputArgument = "file=" + inputFile + ",O1=" + O1 + ",O2="
			+ O2 + ",O3=" + O3 + ",O4=" + O4 + "," + "database=" + dbType + ","
			+ "intermediateProjections="+intermedProjections+",createIndex1="+createIndex1+",createIndex2="+createIndex2;
		
		try {
			rq.parser(inputArgument, Integer.parseInt(tableName.substring(tableName.length() - 1)));
		} catch (Exception e) {
			System.out.println("rq parser throws an exception"+e);
		}
		System.out.println(inputArgument);
	}

}
