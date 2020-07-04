package com.p280ss.android.ugc.aweme.sticker.data;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp */
public class NormalTrackTimeStamp extends BaseTrackTimeStamp {
    @C6593c(mo15949a = "h")
    private float height;
    @C6593c(mo15949a = "r")
    private float rotation;
    private Float scale;
    @C6593c(mo15949a = "s")
    private Float scaleForIos;
    @C6593c(mo15949a = "w")
    private float width;

    /* renamed from: x */
    private float f108846x;

    /* renamed from: y */
    private float f108847y;

    public NormalTrackTimeStamp() {
    }

    public float getHeight() {
        return this.height;
    }

    public float getRotation() {
        return this.rotation;
    }

    public Float getScaleForIos() {
        return this.scaleForIos;
    }

    public float getWidth() {
        return this.width;
    }

    public float getX() {
        return this.f108846x;
    }

    public float getY() {
        return this.f108847y;
    }

    public Float getScale() {
        if (this.scale != null) {
            return this.scale;
        }
        if (this.scaleForIos != null) {
            return this.scaleForIos;
        }
        return Float.valueOf(1.0f);
    }

    public void setHeight(float f) {
        this.height = f;
    }

    public void setRotation(float f) {
        this.rotation = f;
    }

    public void setScale(Float f) {
        this.scaleForIos = f;
    }

    public void setScaleForIos(Float f) {
        this.scaleForIos = f;
    }

    public void setWidth(float f) {
        this.width = f;
    }

    public void setX(float f) {
        this.f108846x = f;
    }

    public void setY(float f) {
        this.f108847y = f;
    }

    public NormalTrackTimeStamp(int i) {
        super(i);
    }
}
