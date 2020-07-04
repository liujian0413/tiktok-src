package com.bytedance.ies.bullet.p551ui.common.p553b;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.ies.bullet.core.common.YieldError;
import com.bytedance.ies.bullet.p551ui.common.p553b.C10678a.C10679a;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.ui.common.b.c */
public final class C10682c<T extends View> {

    /* renamed from: a */
    public final T f28561a;

    /* renamed from: b */
    public final LayoutParams f28562b;

    /* renamed from: c */
    private final Set<C10683d<T>> f28563c;

    /* renamed from: a */
    private List<C10683d<T>> m31205a() {
        return C7525m.m23516h((Iterable<? extends T>) this.f28563c);
    }

    /* renamed from: b */
    public final void mo25561b(C10683d<T> dVar) {
        C7573i.m23587b(dVar, "delegate");
        this.f28563c.remove(dVar);
    }

    /* renamed from: a */
    public final void mo25559a(C10683d<T> dVar) {
        C7573i.m23587b(dVar, "delegate");
        this.f28563c.add(dVar);
    }

    /* renamed from: a */
    public final void mo25557a(Uri uri) {
        C7573i.m23587b(uri, "uri");
        for (C10683d a : m31205a()) {
            try {
                a.mo25546a(this, uri);
            } catch (YieldError unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo25560b(Uri uri) {
        C7573i.m23587b(uri, "uri");
        for (C10683d b : m31205a()) {
            try {
                b.mo25548b(this, uri);
            } catch (YieldError unused) {
            }
        }
    }

    private C10682c(T t, LayoutParams layoutParams) {
        C7573i.m23587b(t, "view");
        this.f28561a = t;
        this.f28562b = layoutParams;
        this.f28563c = new LinkedHashSet();
    }

    /* renamed from: a */
    public final void mo25558a(Uri uri, Throwable th) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(th, "e");
        for (C10683d a : m31205a()) {
            try {
                a.mo25547a(this, uri, th);
            } catch (YieldError unused) {
            }
        }
    }

    public /* synthetic */ C10682c(View view, LayoutParams layoutParams, int i, C7571f fVar) {
        this(view, C10679a.m31199a());
    }
}
