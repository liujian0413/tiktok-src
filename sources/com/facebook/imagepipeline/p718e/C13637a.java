package com.facebook.imagepipeline.p718e;

import com.facebook.common.internal.C13307g;
import com.facebook.datasource.C13341a;
import com.facebook.imagepipeline.p721h.C13653c;
import com.facebook.imagepipeline.p724k.C13699am;
import com.facebook.imagepipeline.p724k.C13711at;
import com.facebook.imagepipeline.p724k.C13728b;
import com.facebook.imagepipeline.p724k.C13748k;
import com.facebook.imagepipeline.p725l.C13783b;

/* renamed from: com.facebook.imagepipeline.e.a */
public abstract class C13637a<T> extends C13341a<T> {

    /* renamed from: a */
    private final C13711at f36248a;

    /* renamed from: b */
    private final C13653c f36249b;

    /* renamed from: i */
    private C13748k<T> m40198i() {
        return new C13728b<T>() {
            /* renamed from: a */
            public final void mo33254a() {
                C13637a.this.mo33253h();
            }

            /* renamed from: a */
            public final void mo33255a(float f) {
                C13637a.this.mo32636a(f);
            }

            /* renamed from: a */
            public final void mo33257a(Throwable th) {
                C13637a.this.mo33252b(th);
            }

            /* renamed from: a */
            public final void mo33256a(T t, int i) {
                C13637a.this.mo33251a(t, i);
            }
        };
    }

    /* renamed from: h */
    public final synchronized void mo33253h() {
        C13307g.m38947b(mo32635a());
    }

    /* renamed from: g */
    public final boolean mo32644g() {
        if (!super.mo32644g()) {
            return false;
        }
        if (!super.mo32639b()) {
            this.f36249b.onRequestCancellation(this.f36248a.mo33335b());
            this.f36248a.mo33361i();
        }
        return true;
    }

    /* renamed from: b */
    public final void mo33252b(Throwable th) {
        if (super.mo32638a(th)) {
            this.f36249b.onRequestFailure(this.f36248a.mo33333a(), this.f36248a.mo33335b(), th, this.f36248a.mo33339f());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33251a(T t, int i) {
        boolean a = C13728b.m40493a(i);
        if (super.mo32637a(t, a) && a) {
            this.f36249b.onRequestSuccess(this.f36248a.mo33333a(), this.f36248a.mo33335b(), this.f36248a.mo33339f());
        }
    }

    protected C13637a(C13699am<T> amVar, C13711at atVar, C13653c cVar) {
        if (C13783b.m40665b()) {
            C13783b.m40664a("AbstractProducerToDataSourceAdapter()");
        }
        this.f36248a = atVar;
        this.f36249b = cVar;
        if (C13783b.m40665b()) {
            C13783b.m40664a("AbstractProducerToDataSourceAdapter()->onRequestStart");
        }
        this.f36249b.onRequestStart(atVar.mo33333a(), this.f36248a.mo33337d(), this.f36248a.mo33335b(), this.f36248a.mo33339f());
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        if (C13783b.m40665b()) {
            C13783b.m40664a("AbstractProducerToDataSourceAdapter()->produceResult");
        }
        amVar.mo33296a(m40198i(), atVar);
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }
}
