package net.renotekno.rifqi.signalfrommars.model;

public class Page {
    private  int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinish = false;

    public boolean isFinish() {
        return mIsFinish;
    }

    public Page(int image, String text, Choice choice1, Choice choice2){
        mImageId = image;
        mText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public Page(int image, String text){
        mImageId = image;
        mText = text;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinish = true;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }
}
