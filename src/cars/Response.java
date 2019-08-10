package cars;

import java.io.Serializable;

public class Response implements Serializable {
    private Serializable body;
    private StatusCode code;

    private Package objPackage;

    public Response(Serializable body, StatusCode code) {
        this.body = body;
        this.code = code;
    }

    public Response(Package objPackage){
        this.objPackage = objPackage;
    }

    public Serializable getBody() {
        return body;
    }

    public void setBody(Serializable body) {
        this.body = body;
    }

    public StatusCode getCode() {
        return code;
    }

    public void setCode(StatusCode code) {
        this.code = code;
    }

    public Package getPackage() {
        return objPackage;
    }

    public void setPackage(Package objPackage) {
        this.objPackage = objPackage;
    }

    @Override
    public String toString() {
        return "Response{" +
                "body=" + body +
                ", code=" + code +
                '}';
    }
}
