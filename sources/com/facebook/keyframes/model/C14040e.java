package com.facebook.keyframes.model;

import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import com.facebook.keyframes.model.KFAnimation.PropertyType;
import com.facebook.keyframes.model.keyframedmodels.C14057b;
import com.facebook.keyframes.model.keyframedmodels.C14061e;
import com.facebook.keyframes.model.keyframedmodels.C14062f.C14063a;
import com.facebook.keyframes.p733b.C14010b;
import com.facebook.keyframes.p733b.C14011c;
import com.facebook.keyframes.p733b.C14013e;
import java.util.List;

/* renamed from: com.facebook.keyframes.model.e */
public final class C14040e {

    /* renamed from: a */
    public final String f37071a;

    /* renamed from: b */
    public final int f37072b;

    /* renamed from: c */
    public final int f37073c;

    /* renamed from: d */
    public final float f37074d;

    /* renamed from: e */
    public final float f37075e;

    /* renamed from: f */
    public final List<C14045g> f37076f;

    /* renamed from: g */
    public final float[][][] f37077g;

    /* renamed from: h */
    public final int f37078h;

    /* renamed from: i */
    public final Cap f37079i;

    /* renamed from: j */
    final KFAnimation f37080j;

    /* renamed from: k */
    final List<KFAnimation> f37081k;

    /* renamed from: l */
    final KFAnimation f37082l;

    /* renamed from: m */
    public final C14042f f37083m;

    /* renamed from: n */
    public final String f37084n;

    /* renamed from: o */
    public final C14061e f37085o;

    /* renamed from: p */
    private final float f37086p;

    /* renamed from: com.facebook.keyframes.model.e$a */
    public static class C14041a {

        /* renamed from: a */
        public String f37087a;

        /* renamed from: b */
        public int f37088b;

        /* renamed from: c */
        public int f37089c;

        /* renamed from: d */
        public float f37090d;

        /* renamed from: e */
        public float f37091e;

        /* renamed from: f */
        public float f37092f = Float.MAX_VALUE;

        /* renamed from: g */
        public List<C14045g> f37093g;

        /* renamed from: h */
        public float[][][] f37094h;

        /* renamed from: i */
        public int f37095i;

        /* renamed from: j */
        public Cap f37096j = Cap.ROUND;

        /* renamed from: k */
        public List<KFAnimation> f37097k;

        /* renamed from: l */
        public float[] f37098l;

        /* renamed from: m */
        public C14042f f37099m;

        /* renamed from: n */
        public String f37100n;

        /* renamed from: a */
        public final C14040e mo33696a() {
            C14040e eVar = new C14040e(this.f37087a, this.f37088b, this.f37089c, this.f37090d, this.f37091e, this.f37092f, this.f37093g, this.f37094h, this.f37095i, this.f37096j, this.f37097k, this.f37098l, this.f37099m, this.f37100n);
            return eVar;
        }
    }

    /* renamed from: a */
    public final void mo33695a(C14063a aVar, float f) {
        if (aVar != null) {
            aVar.f37140a = this.f37086p;
            if (this.f37080j != null) {
                this.f37080j.f37051f.mo33705a(f, aVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo33694a(Matrix matrix, float f) {
        if (matrix != null) {
            matrix.reset();
            if (this.f37081k != null) {
                if (this.f37082l != null) {
                    ((C14057b) this.f37082l.f37051f).mo33706a(matrix);
                }
                int size = this.f37081k.size();
                for (int i = 0; i < size; i++) {
                    ((KFAnimation) this.f37081k.get(i)).f37051f.mo33705a(f, matrix);
                }
            }
        }
    }

    public C14040e(String str, int i, int i2, float f, float f2, float f3, List<C14045g> list, float[][][] fArr, int i3, Cap cap, List<KFAnimation> list2, float[] fArr2, C14042f fVar, String str2) {
        C14061e eVar;
        this.f37071a = str;
        this.f37072b = i;
        this.f37073c = i2;
        this.f37086p = f;
        this.f37074d = f2;
        this.f37075e = f3;
        this.f37076f = C14013e.m41371a(list);
        this.f37077g = (float[][][]) C14011c.m41368a(fArr, C14011c.m41370a(fArr, this.f37076f.size()), "timing_curves");
        this.f37078h = i3;
        this.f37079i = cap;
        this.f37080j = C14010b.m41367a(list2, PropertyType.STROKE_WIDTH);
        this.f37082l = C14010b.m41367a(list2, PropertyType.ANCHOR_POINT);
        C14013e.m41372a(list2, KFAnimation.f37046a);
        this.f37081k = C14013e.m41371a(list2);
        this.f37083m = fVar;
        this.f37084n = str2;
        if (this.f37076f.isEmpty()) {
            eVar = null;
        } else {
            eVar = C14061e.m41452a(this);
        }
        this.f37085o = eVar;
    }
}
