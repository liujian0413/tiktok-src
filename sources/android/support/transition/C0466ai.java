package android.support.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.transition.ai */
class C0466ai {
    C0466ai() {
    }

    /* renamed from: c */
    public void mo2067c(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(R.id.cy_, null);
        }
    }

    /* renamed from: a */
    public float mo2064a(View view) {
        Float f = (Float) view.getTag(R.id.cy_);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: b */
    public void mo2066b(View view) {
        if (view.getTag(R.id.cy_) == null) {
            view.setTag(R.id.cy_, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: a */
    public void mo2065a(View view, float f) {
        Float f2 = (Float) view.getTag(R.id.cy_);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: b */
    public void mo2069b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo2069b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    /* renamed from: a */
    public void mo2068a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo2068a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: a */
    public void mo2070a(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }
}
