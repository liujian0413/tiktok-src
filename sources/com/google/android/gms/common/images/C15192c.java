package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import com.google.android.gms.common.images.ImageManager.C15186a;
import com.google.android.gms.common.internal.C15265q;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.images.c */
public final class C15192c extends C15190a {

    /* renamed from: c */
    private WeakReference<C15186a> f39310c;

    public final int hashCode() {
        return C15265q.m44379a(this.f39307a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15192c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C15192c cVar = (C15192c) obj;
        C15186a aVar = (C15186a) this.f39310c.get();
        C15186a aVar2 = (C15186a) cVar.f39310c.get();
        return aVar2 != null && aVar != null && C15265q.m44381a(aVar2, aVar) && C15265q.m44381a(cVar.f39307a, this.f39307a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38493a(Drawable drawable, boolean z, boolean z2, boolean z3) {
        this.f39310c.get();
    }
}
