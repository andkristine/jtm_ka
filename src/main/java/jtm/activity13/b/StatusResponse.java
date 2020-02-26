package jtm.activity13.b;

public class StatusResponse {

    private Boolean success;
    private String message;
	
    public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "StatusResponse [success=" + success + ", message=" + message + "]";
	}
	
	public StatusResponse(Boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

	public StatusResponse () {
		super();
	}
	
    /*
        TODO
        1. Generate getters and setters
        2. Generate toString
        3. Generate two constructors - one with both fields as parameters,
        other default constructor (with no parameters, that does not set any values to fields)
     */
}
