package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

@C6505uv
public abstract class aht extends TextureView implements aio {

    /* renamed from: a */
    protected final aid f40241a = new aid();

    /* renamed from: b */
    protected final ain f40242b;

    public aht(Context context) {
        super(context);
        this.f40242b = new ain(context, this);
    }

    /* renamed from: a */
    public abstract String mo39351a();

    /* renamed from: a */
    public abstract void mo39352a(float f, float f2);

    /* renamed from: a */
    public abstract void mo39353a(int i);

    /* renamed from: a */
    public abstract void mo39354a(ahr ahr);

    /* renamed from: b */
    public abstract void mo39355b();

    /* renamed from: c */
    public abstract void mo39357c();

    /* renamed from: c */
    public void mo39403c(int i) {
    }

    /* renamed from: d */
    public abstract void mo39358d();

    /* renamed from: d */
    public void mo39404d(int i) {
    }

    /* renamed from: e */
    public abstract void mo39359e();

    /* renamed from: e */
    public void mo39405e(int i) {
    }

    /* renamed from: f */
    public void mo39406f(int i) {
    }

    /* renamed from: g */
    public void mo39407g(int i) {
    }

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);

    /* renamed from: a */
    public void mo39402a(String str, String[] strArr) {
        setVideoPath(str);
    }
}
