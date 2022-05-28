package com.company;

public class Button {
    private String title;
    private onClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setOnClickListener(onClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick(){
        this.onClickListener.onClick(this.title);
    }

    interface onClickListener{
        public void onClick(String text);
    }
}
