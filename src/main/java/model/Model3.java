package model;


import javax.swing.*;

public class Model3 extends MainModel{
    private String[] content={"여행 설명여행 설명 여행 설명 여행 설명 여행 설명 여행 설명 여행 설명 여행 설명 여행 설명 여행 설명  "};
    private ImageIcon[] images= {
            new ImageIcon("src/main/java/images/apple.jpg"),
            new ImageIcon("src/main/java/images/banana.jpg")
    };
    
    
    public String[] getContent() {
        return content;
    }

    public void setContent(String[] content) {
        this.content = content;
    }

    public ImageIcon[] getImages() {
        return images;
    }

    public void setImages(ImageIcon[] images) {
        this.images = images;
    }

    public Model3(String[] name) {
        super(name);
    }

    public Model3(String [] name, String [] content, ImageIcon [] images )
    {
        super(name);
        this.content = content;
        this.images = images;
    }
}
