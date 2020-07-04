package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.internal.C13307g;
import com.facebook.common.memory.C13316a;
import com.facebook.common.memory.C13318c;
import com.facebook.imagepipeline.memory.BasePool.InvalidSizeException;

/* renamed from: com.facebook.imagepipeline.memory.p */
public class C13823p extends BasePool<byte[]> implements C13316a {

    /* renamed from: g */
    private final int[] f36670g;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo33395d(int i) {
        return i;
    }

    /* renamed from: a */
    private static void m40802a(byte[] bArr) {
        C13307g.m38940a(bArr);
    }

    /* renamed from: f */
    private static byte[] m40804f(int i) {
        return new byte[i];
    }

    /* renamed from: b */
    private static int m40803b(byte[] bArr) {
        C13307g.m38940a(bArr);
        return bArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ int mo33394c(Object obj) {
        return m40803b((byte[]) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo33391b(int i) {
        return m40804f(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ void mo33392b(Object obj) {
        m40802a((byte[]) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo33393c(int i) {
        int[] iArr;
        if (i > 0) {
            for (int i2 : this.f36670g) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new InvalidSizeException(Integer.valueOf(i));
    }

    public C13823p(C13318c cVar, C13803ad adVar, C13804ae aeVar) {
        super(cVar, adVar, aeVar);
        SparseIntArray sparseIntArray = adVar.f36641c;
        this.f36670g = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.f36670g[i] = sparseIntArray.keyAt(i);
        }
        mo33390a();
    }
}
