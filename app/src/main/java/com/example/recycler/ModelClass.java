package com.example.recycler;


//holding the information of every item in recycler view

 class ModelClass {

    //1.declaring items in the model layout

     String name;
     String definition;
     String example;
     int imageView1;

     //3.create constructor
     public ModelClass(String name, String definition, String example, int imageView1) {
         this.name = name;
         this.definition = definition;
         this.example = example;
         this.imageView1 = imageView1;
     }

    //2.create getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public int getImageView1() {
        return imageView1;
    }

    public void setImageView1(int imageView1) {
        this.imageView1 = imageView1;
    }
}
