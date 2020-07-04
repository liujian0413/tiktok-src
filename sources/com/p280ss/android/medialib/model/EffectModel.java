package com.p280ss.android.medialib.model;

/* renamed from: com.ss.android.medialib.model.EffectModel */
public class EffectModel {
    private int end;
    private int index;
    private int start;

    public EffectModel() {
    }

    public int getEnd() {
        return this.end;
    }

    public int getIndex() {
        return this.index;
    }

    public int getStart() {
        return this.start;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public EffectModel(int i, int i2, int i3) {
        this.index = i;
        this.start = i2;
        this.end = i3;
    }
}
