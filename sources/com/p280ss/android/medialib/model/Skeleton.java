package com.p280ss.android.medialib.model;

import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: com.ss.android.medialib.model.Skeleton */
public class Skeleton {

    /* renamed from: ID */
    private int f53604ID;
    private PointF[] points;
    private RectF rect;

    public int getID() {
        return this.f53604ID;
    }

    public PointF[] getPoints() {
        return this.points;
    }

    public RectF getRect() {
        return this.rect;
    }

    public void setID(int i) {
        this.f53604ID = i;
    }

    public void setPoints(PointF[] pointFArr) {
        this.points = pointFArr;
    }

    public void setRect(RectF rectF) {
        this.rect = rectF;
    }
}
