package com.facebook.keyframes.model.keyframedmodels;

import android.util.SparseArray;
import android.view.animation.Interpolator;
import com.facebook.keyframes.model.C14031a;
import java.util.List;

/* renamed from: com.facebook.keyframes.model.keyframedmodels.d */
public abstract class C14060d<T extends C14031a, M> {

    /* renamed from: a */
    private final SparseArray<T> f37136a;

    /* renamed from: b */
    private final List<Interpolator> f37137b;

    /* renamed from: c */
    private final int f37138c;

    /* renamed from: d */
    private final int f37139d;

    protected C14060d() {
    }

    /* renamed from: a */
    protected static float m41449a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33704a(T t, T t2, float f, M m);

    public C14060d(List<T> list, float[][][] fArr) {
        int size = list.size();
        this.f37136a = new SparseArray<>(size);
        for (int i = 0; i < size; i++) {
            C14031a aVar = (C14031a) list.get(i);
            this.f37136a.put(aVar.mo33689a(), aVar);
        }
        this.f37138c = this.f37136a.keyAt(0);
        this.f37139d = this.f37136a.keyAt(size - 1);
        this.f37137b = C14056a.m41434a(fArr);
    }

    /* renamed from: a */
    public void mo33705a(float f, M m) {
        C14031a aVar;
        C14031a aVar2 = null;
        if (this.f37137b.isEmpty() || f <= ((float) this.f37138c)) {
            mo33704a((C14031a) this.f37136a.get(this.f37138c), null, 0.0f, m);
        } else if (f >= ((float) this.f37139d)) {
            mo33704a((C14031a) this.f37136a.get(this.f37139d), null, 0.0f, m);
        } else {
            int size = this.f37137b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    aVar = null;
                    break;
                } else if (((float) this.f37136a.keyAt(i)) == f || (((float) this.f37136a.keyAt(i)) < f && ((float) this.f37136a.keyAt(i + 1)) > f)) {
                    aVar2 = (C14031a) this.f37136a.valueAt(i);
                    aVar = (C14031a) this.f37136a.valueAt(i + 1);
                } else {
                    i++;
                }
            }
            mo33704a(aVar2, aVar, ((Interpolator) this.f37137b.get(i)).getInterpolation((f - ((float) aVar2.mo33689a())) / ((float) (aVar.mo33689a() - aVar2.mo33689a()))), m);
        }
    }
}
