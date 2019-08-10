package cars;

import java.io.Serializable;
import java.util.ArrayList;

public class Request implements Serializable{
    private String query;
    private Serializable body;

    private ArrayList<Class> paramsClasses;
    private ArrayList<ArrayList<Class>> compositeParamsClasses;
    private ArrayList<ArrayList<Object>> compositeParams;

    public Request(String query, ArrayList<Class> paramsClasses, ArrayList<ArrayList<Class>> compositeParamsClasses,
                   ArrayList<ArrayList<Object>> compositeParams) {
        this.query = query;
        this.paramsClasses = paramsClasses;
        this.compositeParams = compositeParams;
        this.compositeParamsClasses = compositeParamsClasses;
    }

    public Request(String query, Serializable body ) {
        this.query = query;
        this.body = body;
    }

    public Request(String query) {
        this.query = query;
        this.body = new Object[]{};
    }

    public String getQuery() {
        return query;
    }

    public Serializable getBody() {
        return body;
    }


    public ArrayList<Class> getParamsClasses() {
        return paramsClasses;
    }

    public void setParamsClasses(ArrayList<Class> paramsClasses) {
        this.paramsClasses = paramsClasses;
    }

    public ArrayList<ArrayList<Class>> getCompositeParamsClasses() {
        return compositeParamsClasses;
    }

    public void setCompositeParamsClasses(ArrayList<ArrayList<Class>> compositeParamsClasses) {
        this.compositeParamsClasses = compositeParamsClasses;
    }

    public ArrayList<ArrayList<Object>> getCompositeParams() {
        return compositeParams;
    }

    public void setCompositeParams(ArrayList<ArrayList<Object>> compositeParams) {
        this.compositeParams = compositeParams;
    }

    public void setBody(Serializable body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Request{" +
                "query='" + query + '\'' +
                ", body=" + body +
                '}';
    }
}
