package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.internal.ads.C15668ex;
import com.google.android.gms.internal.ads.afm;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.ads.formats.d */
public final class C14753d {

    /* renamed from: a */
    public static WeakHashMap<View, C14753d> f38130a = new WeakHashMap<>();

    /* renamed from: b */
    private C15668ex f38131b;

    /* renamed from: c */
    private WeakReference<View> f38132c;

    /* renamed from: a */
    public final void mo37519a(C14747a aVar) {
        m42655a((C15345b) aVar.mo37498a());
    }

    /* renamed from: a */
    public final void mo37520a(C14761h hVar) {
        m42655a((C15345b) hVar.mo37549l());
    }

    /* renamed from: a */
    private final void m42655a(C15345b bVar) {
        View view = this.f38132c != null ? (View) this.f38132c.get() : null;
        if (view == null) {
            afm.m45783e("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!f38130a.containsKey(view)) {
            f38130a.put(view, this);
        }
        if (this.f38131b != null) {
            try {
                this.f38131b.mo41627a(bVar);
            } catch (RemoteException e) {
                afm.m45778b("Unable to call setNativeAd on delegate", e);
            }
        }
    }
}
