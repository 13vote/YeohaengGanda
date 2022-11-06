package model;


import java.util.List;

public class MainModel {
    private List<String> name;

    public MainModel(List<String> name) {
        this.name = name;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

}
