package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.C46347b;
import com.swmansion.gesturehandler.C46348c;

/* renamed from: com.swmansion.gesturehandler.react.d */
public final class C46381d implements C46348c {

    /* renamed from: a */
    private SparseArray<int[]> f119416a = new SparseArray<>();

    /* renamed from: b */
    private SparseArray<int[]> f119417b = new SparseArray<>();

    /* renamed from: a */
    public final void mo115299a() {
        this.f119416a.clear();
        this.f119417b.clear();
    }

    /* renamed from: a */
    public final void mo115300a(int i) {
        this.f119416a.remove(i);
        this.f119417b.remove(i);
    }

    /* renamed from: a */
    private static int[] m145692a(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        int[] iArr = new int[array.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = array.getInt(i);
        }
        return iArr;
    }

    /* renamed from: b */
    public final boolean mo115221b(C46347b bVar, C46347b bVar2) {
        int[] iArr = (int[]) this.f119417b.get(bVar.f119284c);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == bVar2.f119284c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo115301a(C46347b bVar, ReadableMap readableMap) {
        bVar.mo115193a((C46348c) this);
        if (readableMap.hasKey("waitFor")) {
            this.f119416a.put(bVar.f119284c, m145692a(readableMap, "waitFor"));
        }
        if (readableMap.hasKey("simultaneousHandlers")) {
            this.f119417b.put(bVar.f119284c, m145692a(readableMap, "simultaneousHandlers"));
        }
    }

    /* renamed from: a */
    public final boolean mo115220a(C46347b bVar, C46347b bVar2) {
        int[] iArr = (int[]) this.f119416a.get(bVar.f119284c);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == bVar2.f119284c) {
                    return true;
                }
            }
        }
        return false;
    }
}
