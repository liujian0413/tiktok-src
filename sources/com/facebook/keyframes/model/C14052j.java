package com.facebook.keyframes.model;

import android.graphics.Matrix;
import android.util.SparseArray;
import com.facebook.keyframes.p733b.C14009a;
import com.facebook.keyframes.p733b.C14011c;
import com.facebook.keyframes.p733b.C14013e;
import java.util.List;

/* renamed from: com.facebook.keyframes.model.j */
public final class C14052j {

    /* renamed from: a */
    public final int f37116a;

    /* renamed from: b */
    public final int f37117b;

    /* renamed from: c */
    public final List<C14040e> f37118c;

    /* renamed from: d */
    public final List<C14035c> f37119d;

    /* renamed from: e */
    public final float[] f37120e;

    /* renamed from: f */
    public final int f37121f;

    /* renamed from: com.facebook.keyframes.model.j$a */
    public static class C14054a {

        /* renamed from: a */
        public int f37122a;

        /* renamed from: b */
        public int f37123b;

        /* renamed from: c */
        public List<C14040e> f37124c;

        /* renamed from: d */
        public List<C14035c> f37125d;

        /* renamed from: e */
        public float[] f37126e;

        /* renamed from: f */
        public int f37127f;

        /* renamed from: a */
        public final C14052j mo33703a() {
            C14052j jVar = new C14052j(this.f37122a, this.f37123b, this.f37124c, this.f37125d, this.f37126e, this.f37127f);
            return jVar;
        }
    }

    /* renamed from: a */
    public final void mo33702a(SparseArray<Matrix> sparseArray, float f) {
        int size = this.f37119d.size();
        for (int i = 0; i < size; i++) {
            C14035c cVar = (C14035c) this.f37119d.get(i);
            Matrix matrix = (Matrix) sparseArray.get(cVar.f37060a);
            matrix.reset();
            if (cVar.mo33691a() != null) {
                cVar.mo33691a().mo33706a(matrix);
            }
            int size2 = cVar.f37062c.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((KFAnimation) cVar.f37062c.get(i2)).f37051f.mo33705a(f, matrix);
            }
            if (cVar.f37061b > 0) {
                matrix.postConcat((Matrix) sparseArray.get(cVar.f37061b));
            }
        }
    }

    private C14052j(int i, int i2, List<C14040e> list, List<C14035c> list2, float[] fArr, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        Integer valueOf = Integer.valueOf(i);
        boolean z4 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f37116a = ((Integer) C14011c.m41368a(valueOf, z, "frame_rate")).intValue();
        Integer valueOf2 = Integer.valueOf(i2);
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f37117b = ((Integer) C14011c.m41368a(valueOf2, z2, "animation_frame_count")).intValue();
        List a = C14013e.m41371a(list);
        if (list.size() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f37118c = (List) C14011c.m41368a(a, z3, "features");
        List a2 = C14009a.m41366a(list2);
        this.f37119d = (List) C14011c.m41368a(C14013e.m41371a(a2), C14011c.m41369a(a2), "animation_groups");
        if (fArr.length == 2 && fArr[0] > 0.0f && fArr[1] > 0.0f) {
            z4 = true;
        }
        this.f37120e = (float[]) C14011c.m41368a(fArr, z4, "canvas_size");
        this.f37121f = i3;
    }
}
