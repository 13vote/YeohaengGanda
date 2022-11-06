package model;

import javax.swing.*;
import java.util.List;

public class Model3 extends MainModel{
    private List<String> content;
    private List<ImageIcon> images;

    public Model3(List<String> name,List<String> content,List<ImageIcon> images )
    {
        super(name);
        this.content = content;
        this.images = images;
    }
}
