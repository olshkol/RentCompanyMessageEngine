package cars;

import java.io.Serializable;
import java.util.ArrayList;

public class Response implements Serializable {
    private Serializable body;
    private StatusCode code;
    private int countParam;
    private ArrayList<Class> paramsClasses;
    private ArrayList<ArrayList<Class>> compositeParamsClasses;
    private ArrayList<ArrayList<String>> compositeParamsNames;


    public Response(Serializable body, StatusCode code) {
        this.body = body;
        this.code = code;
    }

    public Response(int countParam, ArrayList<Class> paramsClasses,
                    ArrayList<ArrayList<Class>> compositeParamsClasses,
                    ArrayList<ArrayList<String>> compositeParamsNames
    ) {
        this.countParam = countParam;
        this.paramsClasses = paramsClasses;
        this.compositeParamsClasses = compositeParamsClasses;
        this.compositeParamsNames = compositeParamsNames;
    }

    public int getCountParam() {
        return countParam;
    }

    public void setCountParam(int countParam) {
        this.countParam = countParam;
    }

    public ArrayList<Class> getParamsClasses() {
        return paramsClasses;
    }

    public void setParamsClasses(ArrayList<Class> paramsClasses) {
        this.paramsClasses = paramsClasses;
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

    public ArrayList<ArrayList<Class>> getCompositeParamsClasses() {
        return compositeParamsClasses;
    }

    public void setCompositeParamsClasses(ArrayList<ArrayList<Class>> compositeParamsClasses) {
        this.compositeParamsClasses = compositeParamsClasses;
    }

    @Override
    public String toString() {
        return "Response{" +
                "body=" + body +
                ", code=" + code +
                '}';
    }

    public ArrayList<ArrayList<String>> getCompositeParamsNames() {
        return compositeParamsNames;
    }

    public void setCompositeParamsNames(ArrayList<ArrayList<String>> compositeParamsNames) {
        this.compositeParamsNames = compositeParamsNames;
    }
}
