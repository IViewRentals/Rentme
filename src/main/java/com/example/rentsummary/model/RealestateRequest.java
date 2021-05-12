package com.example.rentsummary.model;

public class RealestateRequest {

    private String operationName;
    private Variables variables;
    private Extensions extensions;
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }
    public String getOperationName() {
        return operationName;
    }

    public void setVariables(Variables variables) {
        this.variables = variables;
    }
    public Variables getVariables() {
        return variables;
    }

    public void setExtensions(Extensions extensions) {
        this.extensions = extensions;
    }
    public Extensions getExtensions() {
        return extensions;
    }

}
