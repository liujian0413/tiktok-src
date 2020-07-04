package com.facebook.imagepipeline.p724k;

import com.facebook.common.p685b.C13284h;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.k.au */
public abstract class C13712au<T> extends C13284h<T> {

    /* renamed from: b */
    private final C13748k<T> f36398b;

    /* renamed from: c */
    private final C13702ap f36399c;

    /* renamed from: d */
    private final String f36400d;

    /* renamed from: e */
    private final String f36401e;

    /* renamed from: b */
    public abstract void mo32536b(T t);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> mo33302c(T t) {
        return null;
    }

    /* renamed from: b */
    public void mo32535b() {
        C13702ap apVar = this.f36399c;
        String str = this.f36401e;
        String str2 = this.f36400d;
        this.f36399c.requiresExtraMap(this.f36401e);
        apVar.onProducerFinishWithCancellation(str, str2, null);
        this.f36398b.mo33352b();
    }

    /* renamed from: a */
    public void mo32533a(Exception exc) {
        C13702ap apVar = this.f36399c;
        String str = this.f36401e;
        String str2 = this.f36400d;
        this.f36399c.requiresExtraMap(this.f36401e);
        apVar.onProducerFinishWithFailure(str, str2, exc, null);
        this.f36398b.mo33355b((Throwable) exc);
    }

    /* renamed from: a */
    public void mo32534a(T t) {
        Map map;
        C13702ap apVar = this.f36399c;
        String str = this.f36401e;
        String str2 = this.f36400d;
        if (this.f36399c.requiresExtraMap(this.f36401e)) {
            map = mo33302c(t);
        } else {
            map = null;
        }
        apVar.onProducerFinishWithSuccess(str, str2, map);
        this.f36398b.mo33354b(t, 1);
    }

    public C13712au(C13748k<T> kVar, C13702ap apVar, String str, String str2) {
        this.f36398b = kVar;
        this.f36399c = apVar;
        this.f36400d = str;
        this.f36401e = str2;
        this.f36399c.onProducerStart(this.f36401e, this.f36400d);
    }
}
