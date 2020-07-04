package com.facebook.drawee.backends.pipeline.p696b.p697a;

import android.graphics.drawable.Animatable;
import com.facebook.common.time.C13331b;
import com.facebook.drawee.backends.pipeline.p696b.C13378g;
import com.facebook.drawee.backends.pipeline.p696b.C13379h;
import com.facebook.drawee.controller.C13400c;
import com.facebook.imagepipeline.p720g.C13648f;

/* renamed from: com.facebook.drawee.backends.pipeline.b.a.a */
public final class C13370a extends C13400c<C13648f> {

    /* renamed from: a */
    private final C13331b f35333a;

    /* renamed from: b */
    private final C13379h f35334b;

    /* renamed from: c */
    private final C13378g f35335c;

    /* renamed from: a */
    private void m39147a(long j) {
        this.f35334b.mo32690a(true);
        this.f35334b.f35388r = j;
        this.f35335c.mo32688b(this.f35334b, 1);
    }

    /* renamed from: b */
    private void m39150b(long j) {
        this.f35334b.mo32690a(false);
        this.f35334b.f35389s = j;
        this.f35335c.mo32688b(this.f35334b, 2);
    }

    public final void onRelease(String str) {
        super.onRelease(str);
        long now = this.f35333a.now();
        int i = this.f35334b.f35387q;
        if (!(i == 3 || i == 5)) {
            this.f35334b.f35380j = now;
            this.f35334b.f35371a = str;
            this.f35335c.mo32686a(this.f35334b, 4);
        }
        m39150b(now);
    }

    public final void onFailure(String str, Throwable th) {
        long now = this.f35333a.now();
        this.f35334b.f35379i = now;
        this.f35334b.f35371a = str;
        this.f35335c.mo32686a(this.f35334b, 5);
        m39150b(now);
    }

    public final void onSubmit(String str, Object obj) {
        long now = this.f35333a.now();
        this.f35334b.f35376f = now;
        this.f35334b.f35371a = str;
        this.f35334b.f35374d = obj;
        this.f35335c.mo32686a(this.f35334b, 0);
        m39147a(now);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onIntermediateImageSet(String str, C13648f fVar) {
        this.f35334b.f35377g = this.f35333a.now();
        this.f35334b.f35371a = str;
        this.f35334b.f35375e = fVar;
        this.f35335c.mo32686a(this.f35334b, 2);
    }

    public C13370a(C13331b bVar, C13379h hVar, C13378g gVar) {
        this.f35333a = bVar;
        this.f35334b = hVar;
        this.f35335c = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
        long now = this.f35333a.now();
        this.f35334b.f35378h = now;
        this.f35334b.f35382l = now;
        this.f35334b.f35371a = str;
        this.f35334b.f35375e = fVar;
        this.f35335c.mo32686a(this.f35334b, 3);
    }
}
