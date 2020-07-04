package com.facebook.keyframes.model;

import com.facebook.keyframes.model.keyframedmodels.C14057b;
import com.facebook.keyframes.model.keyframedmodels.C14058c;
import com.facebook.keyframes.model.keyframedmodels.C14060d;
import com.facebook.keyframes.model.keyframedmodels.C14062f;
import com.facebook.keyframes.p733b.C14011c;
import com.facebook.keyframes.p733b.C14013e;
import java.util.Comparator;
import java.util.List;

public final class KFAnimation {

    /* renamed from: a */
    public static final Comparator<KFAnimation> f37046a = new Comparator<KFAnimation>() {
        /* renamed from: a */
        private static int m41410a(KFAnimation kFAnimation, KFAnimation kFAnimation2) {
            return kFAnimation.f37047b.compareTo(kFAnimation2.f37047b);
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m41410a((KFAnimation) obj, (KFAnimation) obj2);
        }
    };

    /* renamed from: b */
    public final PropertyType f37047b;

    /* renamed from: c */
    public final List<C14032b> f37048c;

    /* renamed from: d */
    public final float[][][] f37049d;

    /* renamed from: e */
    public final float[] f37050e;

    /* renamed from: f */
    public final C14060d f37051f;

    public enum PropertyType {
        SCALE(true),
        ROTATION(true),
        POSITION(true),
        X_POSITION(true),
        Y_POSITION(true),
        ANCHOR_POINT(false),
        STROKE_WIDTH(false);
        
        final boolean mIsMatrixBased;

        public final boolean isMatrixBased() {
            return this.mIsMatrixBased;
        }

        private PropertyType(boolean z) {
            this.mIsMatrixBased = z;
        }
    }

    /* renamed from: com.facebook.keyframes.model.KFAnimation$a */
    public static class C14030a {

        /* renamed from: a */
        public PropertyType f37052a;

        /* renamed from: b */
        public List<C14032b> f37053b;

        /* renamed from: c */
        public float[][][] f37054c;

        /* renamed from: d */
        public float[] f37055d;

        /* renamed from: a */
        public final KFAnimation mo33688a() {
            return new KFAnimation(this.f37052a, this.f37053b, this.f37054c, this.f37055d);
        }
    }

    public KFAnimation(PropertyType propertyType, List<C14032b> list, float[][][] fArr, float[] fArr2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (propertyType != null) {
            z = true;
        } else {
            z = false;
        }
        this.f37047b = (PropertyType) C14011c.m41368a(propertyType, z, "property");
        List a = C14013e.m41371a(list);
        if (list == null || list.size() <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f37048c = (List) C14011c.m41368a(a, z2, "key_values");
        this.f37049d = (float[][][]) C14011c.m41368a(fArr, C14011c.m41370a(fArr, this.f37048c.size()), "timing_curves");
        if (fArr2 == null || fArr2.length == 2) {
            z3 = true;
        }
        this.f37050e = (float[]) C14011c.m41368a(fArr2, z3, "anchor");
        if (this.f37047b.isMatrixBased()) {
            this.f37051f = C14058c.m41441a(this);
        } else if (this.f37047b == PropertyType.STROKE_WIDTH) {
            this.f37051f = C14062f.m41455a(this);
        } else if (this.f37047b == PropertyType.ANCHOR_POINT) {
            this.f37051f = C14057b.m41435a(this);
        } else {
            StringBuilder sb = new StringBuilder("Unknown property type for animation post processing: ");
            sb.append(this.f37047b);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
