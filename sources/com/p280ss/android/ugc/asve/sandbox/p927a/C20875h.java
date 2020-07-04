package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.ugc.asve.p756d.C15455i;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20911c.C20912a;
import java.lang.ref.WeakReference;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.h */
public final class C20875h extends C20912a {

    /* renamed from: a */
    public final WeakReference<C19662d> f56300a;

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.h$a */
    static final class C20876a extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C20875h f56301a;

        /* renamed from: b */
        final /* synthetic */ int f56302b;

        /* renamed from: c */
        final /* synthetic */ int f56303c;

        /* renamed from: d */
        final /* synthetic */ String f56304d;

        C20876a(C20875h hVar, int i, int i2, String str) {
            this.f56301a = hVar;
            this.f56302b = i;
            this.f56303c = i2;
            this.f56304d = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m69911a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m69911a() {
            C19662d dVar = (C19662d) this.f56301a.f56300a.get();
            if (dVar != null) {
                dVar.mo52272a(this.f56302b, this.f56303c, this.f56304d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.h$b */
    static final class C20877b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C20875h f56305a;

        /* renamed from: b */
        final /* synthetic */ int f56306b;

        C20877b(C20875h hVar, int i) {
            this.f56305a = hVar;
            this.f56306b = i;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m69912a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m69912a() {
            C19662d dVar = (C19662d) this.f56305a.f56300a.get();
            if (dVar != null) {
                dVar.mo52271a(this.f56306b);
            }
        }
    }

    public C20875h(C19662d dVar) {
        C7573i.m23587b(dVar, "cameraOpenListener");
        this.f56300a = new WeakReference<>(dVar);
    }

    /* renamed from: a */
    public final void mo56385a(int i) {
        C15455i.m45262a(new C20877b(this, i));
    }

    /* renamed from: a */
    public final void mo56386a(int i, int i2, String str) {
        C15455i.m45262a(new C20876a(this, i, i2, str));
    }
}
