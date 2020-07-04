package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.internal.C13307g;
import com.facebook.common.memory.C13318c;
import com.facebook.imagepipeline.memory.BasePool.InvalidSizeException;

/* renamed from: com.facebook.imagepipeline.memory.t */
public abstract class C13827t extends BasePool<C13826s> {

    /* renamed from: g */
    private final int[] f36678g;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo33395d(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C13826s mo33391b(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo33449b() {
        return this.f36678g[0];
    }

    /* renamed from: a */
    private static void m40821a(C13826s sVar) {
        C13307g.m38940a(sVar);
        sVar.close();
    }

    /* renamed from: b */
    private static int m40822b(C13826s sVar) {
        C13307g.m38940a(sVar);
        return sVar.getSize();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ int mo33394c(Object obj) {
        return m40822b((C13826s) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ boolean mo33396d(Object obj) {
        return m40823c((C13826s) obj);
    }

    /* renamed from: c */
    private static boolean m40823c(C13826s sVar) {
        C13307g.m38940a(sVar);
        if (!sVar.isClosed()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo33393c(int i) {
        int[] iArr;
        if (i > 0) {
            for (int i2 : this.f36678g) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new InvalidSizeException(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ void mo33392b(Object obj) {
        m40821a((C13826s) obj);
    }

    C13827t(C13318c cVar, C13803ad adVar, C13804ae aeVar) {
        super(cVar, adVar, aeVar);
        SparseIntArray sparseIntArray = adVar.f36641c;
        this.f36678g = new int[sparseIntArray.size()];
        for (int i = 0; i < this.f36678g.length; i++) {
            this.f36678g[i] = sparseIntArray.keyAt(i);
        }
        mo33390a();
    }
}
