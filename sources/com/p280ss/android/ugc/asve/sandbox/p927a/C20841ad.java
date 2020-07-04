package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.ugc.asve.p756d.C15455i;
import com.p280ss.android.ugc.asve.recorder.camera.C20713c;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20944n.C20945a;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.ad */
public final class C20841ad extends C20945a {

    /* renamed from: a */
    public final WeakReference<C20713c> f56263a;

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.ad$a */
    static final class C20842a extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C20841ad f56264a;

        /* renamed from: b */
        final /* synthetic */ int f56265b;

        /* renamed from: c */
        final /* synthetic */ float f56266c;

        /* renamed from: d */
        final /* synthetic */ boolean f56267d;

        C20842a(C20841ad adVar, int i, float f, boolean z) {
            this.f56264a = adVar;
            this.f56265b = i;
            this.f56266c = f;
            this.f56267d = z;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m69811a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m69811a() {
            C20713c cVar = (C20713c) this.f56264a.f56263a.get();
            if (cVar != null) {
                cVar.mo56008a(this.f56265b, this.f56266c, this.f56267d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.ad$b */
    static final class C20843b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C20841ad f56268a;

        /* renamed from: b */
        final /* synthetic */ int f56269b;

        /* renamed from: c */
        final /* synthetic */ boolean f56270c;

        /* renamed from: d */
        final /* synthetic */ boolean f56271d;

        /* renamed from: e */
        final /* synthetic */ float f56272e;

        /* renamed from: f */
        final /* synthetic */ int[] f56273f;

        C20843b(C20841ad adVar, int i, boolean z, boolean z2, float f, int[] iArr) {
            this.f56268a = adVar;
            this.f56269b = i;
            this.f56270c = z;
            this.f56271d = z2;
            this.f56272e = f;
            this.f56273f = iArr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m69812a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m69812a() {
            List list;
            C20713c cVar = (C20713c) this.f56268a.f56263a.get();
            if (cVar != null) {
                int i = this.f56269b;
                boolean z = this.f56270c;
                boolean z2 = this.f56271d;
                float f = this.f56272e;
                int[] iArr = this.f56273f;
                if (iArr != null) {
                    list = C7519g.m23446d(iArr);
                } else {
                    list = null;
                }
                cVar.mo56009a(i, z, z2, f, list);
            }
        }
    }

    public C20841ad(C20713c cVar) {
        C7573i.m23587b(cVar, "zoomListener");
        this.f56263a = new WeakReference<>(cVar);
    }

    /* renamed from: a */
    public final void mo56367a(int i, float f, boolean z) {
        C15455i.m45262a(new C20842a(this, i, f, z));
    }

    /* renamed from: a */
    public final void mo56368a(int i, boolean z, boolean z2, float f, int[] iArr) {
        C20843b bVar = new C20843b(this, i, z, z2, f, iArr);
        C15455i.m45262a(bVar);
    }
}
