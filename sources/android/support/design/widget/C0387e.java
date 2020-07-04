package android.support.design.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: android.support.design.widget.e */
public final class C0387e {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f1671a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f1672b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m1721a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m1723b(viewGroup, view, rect);
    }

    /* renamed from: a */
    private static void m1722a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m1722a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: b */
    private static void m1723b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = (Matrix) f1671a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f1671a.set(matrix);
        } else {
            matrix.reset();
        }
        m1722a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f1672b.get();
        if (rectF == null) {
            rectF = new RectF();
            f1672b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
