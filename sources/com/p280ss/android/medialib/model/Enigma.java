package com.p280ss.android.medialib.model;

/* renamed from: com.ss.android.medialib.model.Enigma */
public class Enigma {
    TdPoint[] points;
    String text;
    int type;

    public TdPoint[] getPoints() {
        return this.points;
    }

    public String getText() {
        return this.text;
    }

    public int getType() {
        return this.type;
    }

    public void setPoints(TdPoint[] tdPointArr) {
        this.points = tdPointArr;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
