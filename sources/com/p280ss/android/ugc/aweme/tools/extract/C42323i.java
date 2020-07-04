package com.p280ss.android.ugc.aweme.tools.extract;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.tools.C42341f;
import com.p280ss.android.ugc.aweme.tools.extract.C42320g.C42321a;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.i */
public final class C42323i extends C42312a {

    /* renamed from: f */
    public static final String f110089f = "i";

    /* renamed from: e */
    public List<String> f110090e;

    /* renamed from: a */
    public final void mo103790a() {
        super.mo103790a();
    }

    /* renamed from: f */
    public final String mo103802f() {
        return "extract_movie";
    }

    public C42323i(List<String> list) {
        this.f110090e = list;
    }

    /* renamed from: a */
    public final void mo103794a(boolean z) {
        super.mo103794a(z);
    }

    /* renamed from: a */
    public final void mo103792a(final C42321a aVar) {
        super.mo103792a(aVar);
        if (m134573b()) {
            C1592h.m7853a((Callable<TResult>) new Callable<Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    if (C42323i.this.f110090e == null || C42323i.this.f110090e.isEmpty()) {
                        return null;
                    }
                    for (String a : C42323i.this.f110090e) {
                        Bitmap a2 = C42341f.m134633a(a, C42319f.f110087a);
                        if (a2 != null) {
                            String a3 = C42323i.this.f110077c.mo88162a();
                            C42341f.m134636a(a2, new File(a3), 70, CompressFormat.JPEG);
                            C42323i.this.f110075a.addFrameAtLastSegment(a3);
                        }
                    }
                    return null;
                }
            }).mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<Void, Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(C1592h<Void> hVar) {
                    aVar.mo96560a(hVar.mo6882b());
                    C42323i.this.mo103794a(true);
                    C42323i.this.mo103790a();
                    return null;
                }
            });
        }
    }
}
