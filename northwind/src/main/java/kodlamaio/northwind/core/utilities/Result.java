package kodlamaio.northwind.core.utilities;

public class Result {
	private boolean success;
	private String message;
	public Result(boolean success) {
		this.success=success;
	}
	public Result(boolean success,String message) {
		// bu kullanım tekrarlamamak icin önemli.
		this(success);
		this.message=message;
	}
	public boolean isSuccess() {
		return this.success;
	}
	public String getMessage() {
		return this.message;
	}

}
