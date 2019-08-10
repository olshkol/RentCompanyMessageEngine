package cars;

import cars.dto.RequestParamCustom;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Collections;

public class Package implements Serializable {

    private ArrayList<Class> paramsClasses;
    private ArrayList<ArrayList<Class>> compositeParamsClasses;
    private ArrayList<ArrayList<String>> compositeParamsNames;

    private ArrayList<ArrayList<Object>> compositeParams;

    public Package() {
        paramsClasses = new ArrayList<>();
        compositeParamsClasses = new ArrayList<>();
        compositeParamsNames = new ArrayList<>();

        compositeParams = new ArrayList<>();
    }

    public void addParamClasses(Class<?> clazz){
        paramsClasses.add(clazz);
        compositeParamsClasses.add(new ArrayList<>());
        compositeParamsNames.add(new ArrayList<>());
    }

    public void addCompositeParamsForMethods(Parameter parameter){
        int index1 = compositeParamsClasses.size() - 1;
        int index2 = compositeParamsNames.size() - 1;
        compositeParamsClasses.get(index1).add(parameter.getType());
        compositeParamsNames.get(index2).add(parameter.getAnnotation(RequestParamCustom.class).value());
    }

    public void addCompositeParamsForConstructors(Parameter parameter){
        Constructor<?>[] declaredConstructors = parameter.getType().getDeclaredConstructors();
        int index1 = compositeParamsClasses.size() - 1;
        int index2 = compositeParamsNames.size() - 1;
        for (int j = 0; j < declaredConstructors.length; j++) {
            if (declaredConstructors[j].getParameterCount() != 0) {
                Collections.addAll(compositeParamsClasses.get(index1), declaredConstructors[j].getParameterTypes());

                Parameter[] parametersConstruct = declaredConstructors[j].getParameters();
                for (int k = 0; k < declaredConstructors[j].getParameterCount(); k++) {
                    compositeParamsNames.get(index2).add(parametersConstruct[k].getAnnotation(RequestParamCustom.class).value());
                }
                break;
            }
        }
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

    public ArrayList<ArrayList<String>> getCompositeParamsNames() {
        return compositeParamsNames;
    }

    public void setCompositeParamsNames(ArrayList<ArrayList<String>> compositeParamsNames) {
        this.compositeParamsNames = compositeParamsNames;
    }

    public int paramsClassesSize(){
        return paramsClasses.size();
    }

    public int compositeParamsClassesSize(){
        return compositeParamsClasses.size();
    }

    public int compositeParamsNamesSize(){
        return compositeParamsNames.size();
    }


    public ArrayList<ArrayList<Object>> getCompositeParams() {
        return compositeParams;
    }

    public void setCompositeParams(ArrayList<ArrayList<Object>> compositeParams) {
        this.compositeParams = compositeParams;
    }
}
