package android.support.p022v4.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: android.support.v4.widget.r */
public final class C1064r {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f3696a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f3697b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m4635a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m4637b(viewGroup, view, rect);
    }

    /* renamed from: a */
    private static void m4636a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m4636a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: b */
    private static void m4637b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = (Matrix) f3696a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f3696a.set(matrix);
        } else {
            matrix.reset();
        }
        m4636a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f3697b.get();
        if (rectF == null) {
            rectF = new RectF();
            f3697b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
