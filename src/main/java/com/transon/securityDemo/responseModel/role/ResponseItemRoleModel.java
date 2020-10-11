package com.transon.securityDemo.responseModel.role;


public class ResponseItemRoleModel {

    private Long id;

    private String name;

    private String description;

    public ResponseItemRoleModel(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public ResponseItemRoleModel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ResponseItemRoleModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}