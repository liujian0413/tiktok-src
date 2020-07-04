package com.facebook.drawee.p692a.p693a;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.C13400c;

/* renamed from: com.facebook.drawee.a.a.a */
public final class C13362a extends C13400c {

    /* renamed from: a */
    private long f35316a = -1;

    /* renamed from: b */
    private long f35317b = -1;

    /* renamed from: c */
    private C13363b f35318c;

    public C13362a(C13363b bVar) {
        this.f35318c = bVar;
    }

    public final void onSubmit(String str, Object obj) {
        this.f35316a = System.currentTimeMillis();
    }

    public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
        this.f35317b = System.currentTimeMillis();
        if (this.f35318c != null) {
            this.f35318c.mo32666a(this.f35317b - this.f35316a);
        }
    }
}
