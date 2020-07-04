package com.facebook.keyframes.model.keyframedmodels;

import android.graphics.Matrix;
import com.facebook.keyframes.model.C14032b;
import com.facebook.keyframes.model.KFAnimation;
import com.facebook.keyframes.model.KFAnimation.PropertyType;
import java.util.List;

/* renamed from: com.facebook.keyframes.model.keyframedmodels.c */
public final class C14058c extends C14060d<C14032b, Matrix> {

    /* renamed from: a */
    private final PropertyType f37133a;

    /* renamed from: b */
    private final float[] f37134b;

    /* renamed from: a */
    public static C14058c m41441a(KFAnimation kFAnimation) {
        if (kFAnimation.f37047b.isMatrixBased()) {
            return new C14058c(kFAnimation.f37048c, kFAnimation.f37049d, kFAnimation.f37047b, kFAnimation.f37050e);
        }
        throw new IllegalArgumentException("Cannot create a KeyFramedMatrixAnimation from a non matrix based KFAnimation.");
    }

    /* renamed from: d */
    private static void m41445d(C14032b bVar, C14032b bVar2, float f, Matrix matrix) {
        if (bVar2 == null) {
            matrix.postTranslate(bVar.f37056a[0], 0.0f);
        } else {
            matrix.postTranslate(m41449a(bVar.f37056a[0], bVar2.f37056a[0], f), 0.0f);
        }
    }

    /* renamed from: e */
    private static void m41446e(C14032b bVar, C14032b bVar2, float f, Matrix matrix) {
        if (bVar2 == null) {
            matrix.postTranslate(0.0f, bVar.f37056a[0]);
        } else {
            matrix.postTranslate(0.0f, m41449a(bVar.f37056a[0], bVar2.f37056a[0], f));
        }
    }

    private C14058c(List<C14032b> list, float[][][] fArr, PropertyType propertyType, float[] fArr2) {
        super(list, fArr);
        this.f37133a = propertyType;
        if (fArr2 == null) {
            fArr2 = new float[2];
        }
        this.f37134b = fArr2;
        if (propertyType == PropertyType.POSITION) {
            this.f37134b[0] = ((C14032b) list.get(0)).f37056a[0];
            this.f37134b[1] = ((C14032b) list.get(0)).f37056a[1];
        }
    }

    /* renamed from: f */
    private void m41447f(C14032b bVar, C14032b bVar2, float f, Matrix matrix) {
        if (bVar2 != null) {
            matrix.postTranslate(m41449a(bVar.f37056a[0], bVar2.f37056a[0], f) - this.f37134b[0], m41449a(bVar.f37056a[1], bVar2.f37056a[1], f) - this.f37134b[1]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo33704a(C14032b bVar, C14032b bVar2, float f, Matrix matrix) {
        switch (this.f37133a) {
            case ROTATION:
                m41443b(bVar, bVar2, f, matrix);
                return;
            case SCALE:
                m41444c(bVar, bVar2, f, matrix);
                return;
            case POSITION:
                m41447f(bVar, bVar2, f, matrix);
                return;
            case X_POSITION:
                m41445d(bVar, bVar2, f, matrix);
                return;
            case Y_POSITION:
                m41446e(bVar, bVar2, f, matrix);
                return;
            default:
                StringBuilder sb = new StringBuilder("Cannot apply matrix transformation to ");
                sb.append(this.f37133a);
                throw new UnsupportedOperationException(sb.toString());
        }
    }

    /* renamed from: b */
    private void m41443b(C14032b bVar, C14032b bVar2, float f, Matrix matrix) {
        float f2;
        float f3;
        float f4 = 0.0f;
        if (bVar2 == null) {
            float f5 = bVar.f37056a[0];
            if (this.f37134b != null) {
                f3 = this.f37134b[0];
            } else {
                f3 = 0.0f;
            }
            if (this.f37134b != null) {
                f4 = this.f37134b[1];
            }
            matrix.postRotate(f5, f3, f4);
            return;
        }
        float a = m41449a(bVar.f37056a[0], bVar2.f37056a[0], f);
        if (this.f37134b != null) {
            f2 = this.f37134b[0];
        } else {
            f2 = 0.0f;
        }
        if (this.f37134b != null) {
            f4 = this.f37134b[1];
        }
        matrix.postRotate(a, f2, f4);
    }

    /* renamed from: c */
    private void m41444c(C14032b bVar, C14032b bVar2, float f, Matrix matrix) {
        float f2;
        float f3;
        float f4 = 0.0f;
        if (bVar2 == null) {
            float f5 = bVar.f37056a[0] / 100.0f;
            float f6 = bVar.f37056a[1] / 100.0f;
            if (this.f37134b != null) {
                f3 = this.f37134b[0];
            } else {
                f3 = 0.0f;
            }
            if (this.f37134b != null) {
                f4 = this.f37134b[1];
            }
            matrix.postScale(f5, f6, f3, f4);
            return;
        }
        float f7 = bVar.f37056a[0];
        float f8 = bVar2.f37056a[0];
        float a = m41449a(f7, f8, f) / 100.0f;
        float a2 = m41449a(bVar.f37056a[1], bVar2.f37056a[1], f) / 100.0f;
        if (this.f37134b != null) {
            f2 = this.f37134b[0];
        } else {
            f2 = 0.0f;
        }
        if (this.f37134b != null) {
            f4 = this.f37134b[1];
        }
        matrix.postScale(a, a2, f2, f4);
    }
}
