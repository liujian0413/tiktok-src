package com.p280ss.android.ugc.aweme.utils;

import android.animation.TypeEvaluator;
import android.graphics.PointF;

/* renamed from: com.ss.android.ugc.aweme.utils.t */
public final class C43169t implements TypeEvaluator<PointF> {

    /* renamed from: a */
    PointF f111792a = new PointF();

    /* renamed from: b */
    private float f111793b;

    /* renamed from: c */
    private float f111794c;

    /* renamed from: d */
    private float f111795d;

    /* renamed from: e */
    private float f111796e;

    /* renamed from: f */
    private float f111797f;

    /* renamed from: g */
    private float f111798g;

    public C43169t(PointF pointF, PointF pointF2) {
        float f = pointF.x * 3.0f;
        float f2 = pointF2.x * 3.0f;
        this.f111793b = f - f2;
        this.f111794c = f2 - (f * 2.0f);
        this.f111795d = f;
        float f3 = pointF.y * 3.0f;
        float f4 = pointF2.y * 3.0f;
        this.f111796e = f3 - f4;
        this.f111797f = f4 - (2.0f * f3);
        this.f111798g = f3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public PointF evaluate(float f, PointF pointF, PointF pointF2) {
        float f2 = pointF.x * 3.0f;
        float f3 = pointF.y * 3.0f;
        this.f111792a.x = (((((((((pointF2.x - pointF.x) + this.f111793b) * f) + f2) + this.f111794c) * f) - f2) + this.f111795d) * f) + pointF.x;
        this.f111792a.y = (f * ((((((((pointF2.y - pointF.y) + this.f111796e) * f) + f3) + this.f111797f) * f) - f3) + this.f111798g)) + pointF.y;
        return this.f111792a;
    }
}
