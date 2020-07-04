package com.p280ss.android.ugc.aweme.utils;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.utils.fm */
public final class C43134fm {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f111760a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f111761b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m136820a(Rect rect, View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (rect != null) {
            if (rect.top >= 0) {
                i = rect.top;
            } else {
                i = view.getPaddingTop();
            }
            if (rect.bottom >= 0) {
                i2 = rect.bottom;
            } else {
                i2 = view.getPaddingBottom();
            }
            if (VERSION.SDK_INT >= 17) {
                if (rect.left >= 0) {
                    i5 = rect.left;
                } else {
                    i5 = view.getPaddingStart();
                }
                if (rect.right >= 0) {
                    i6 = rect.right;
                } else {
                    i6 = view.getPaddingEnd();
                }
                view.setPaddingRelative(i5, i, i6, i2);
                return;
            }
            if (rect.left >= 0) {
                i3 = rect.left;
            } else {
                i3 = view.getPaddingLeft();
            }
            if (rect.right >= 0) {
                i4 = rect.right;
            } else {
                i4 = view.getPaddingRight();
            }
            if (C43127fh.m136806a(C6399b.m19921a())) {
                view.setPadding(i4, i, i3, i2);
                return;
            }
            view.setPadding(i3, i, i4, i2);
        }
    }

    /* renamed from: a */
    public static void m136821a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m136823b(viewGroup, view, rect);
    }

    /* renamed from: a */
    private static void m136822a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m136822a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: b */
    private static void m136823b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = (Matrix) f111760a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f111760a.set(matrix);
        } else {
            matrix.reset();
        }
        m136822a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f111761b.get();
        if (rectF == null) {
            rectF = new RectF();
            f111761b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
