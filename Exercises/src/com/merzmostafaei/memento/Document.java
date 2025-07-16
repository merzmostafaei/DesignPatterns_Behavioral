package com.merzmostafaei.memento;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public void setContent(String content) {
        this.content = content;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }


    public DocumentMemento createMomento() {
        return new DocumentMemento(content, fontName, fontSize);
    }
    public void restore (DocumentMemento documentMemento){
        this.content = documentMemento.getContent();
        this.fontName = documentMemento.getFontName();
        this.fontSize = documentMemento.getFontSize();
    }



    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
