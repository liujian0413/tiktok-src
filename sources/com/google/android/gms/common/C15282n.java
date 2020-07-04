package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.n */
abstract class C15282n extends C15280l {

    /* renamed from: b */
    private static final WeakReference<byte[]> f39487b = new WeakReference<>(null);

    /* renamed from: a */
    private WeakReference<byte[]> f39488a = f39487b;

    C15282n(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract byte[] mo38625d();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final byte[] mo38622c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f39488a.get();
            if (bArr == null) {
                bArr = mo38625d();
                this.f39488a = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
