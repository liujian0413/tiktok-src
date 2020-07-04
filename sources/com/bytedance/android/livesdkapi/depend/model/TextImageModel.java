package com.bytedance.android.livesdkapi.depend.model;

import com.bytedance.android.live.base.model.ImageModel;

public class TextImageModel extends ImageModel {

    /* renamed from: a */
    public String f25535a;

    /* renamed from: b */
    public int f25536b;

    /* renamed from: c */
    public int f25537c;

    /* renamed from: d */
    public int f25538d;

    public TextImageModel(int i) {
        this.f25537c = 2;
        this.f25538d = i;
    }

    public TextImageModel(ImageModel imageModel, int i) {
        setAvgColor(imageModel.getAvgColor());
        setUri(imageModel.getUri());
        setUrls(imageModel.getUrls());
        setWidth(imageModel.getWidth());
        setHeight(imageModel.getHeight());
        this.f25536b = 0;
        this.f25537c = i;
    }
}
