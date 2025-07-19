package com.merzmostafaei.command;

public class VideoEditor {
    private String text = "";
    private float contrast = 0;

    public void setText(String text) {
        this.text = text;
        System.out.println("Text set to: " + this.text);
    }

    public void setContrast(float contrast) {
        this.contrast = contrast;
        System.out.println("Contrast set to: " + this.contrast);
    }

    public String getText() {
        return text;
    }

    public float getContrast() {
        return contrast;
    }
}
