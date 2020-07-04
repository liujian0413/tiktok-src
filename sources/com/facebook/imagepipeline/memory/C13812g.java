package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.internal.C13307g;
import com.facebook.common.memory.C13318c;

/* renamed from: com.facebook.imagepipeline.memory.g */
public final class C13812g extends BasePool<Bitmap> implements C13806c {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo33393c(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo33395d(int i) {
        return i;
    }

    /* renamed from: a */
    private static void m40768a(Bitmap bitmap) {
        C13307g.m38940a(bitmap);
        bitmap.recycle();
    }

    /* renamed from: b */
    private static int m40769b(Bitmap bitmap) {
        C13307g.m38940a(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ int mo33394c(Object obj) {
        return m40769b((Bitmap) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ boolean mo33396d(Object obj) {
        return m40771c((Bitmap) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Bitmap mo33389a(C13808e<Bitmap> eVar) {
        Bitmap bitmap = (Bitmap) super.mo33389a(eVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* renamed from: c */
    private static boolean m40771c(Bitmap bitmap) {
        C13307g.m38940a(bitmap);
        if (bitmap.isRecycled() || !bitmap.isMutable()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static Bitmap m40772f(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return Bitmap.createBitmap(1, (int) Math.ceil(d / 2.0d), Config.RGB_565);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo33391b(int i) {
        return m40772f(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ void mo33392b(Object obj) {
        m40768a((Bitmap) obj);
    }

    public C13812g(C13318c cVar, C13803ad adVar, C13804ae aeVar) {
        super(cVar, adVar, aeVar);
        mo33390a();
    }
}
