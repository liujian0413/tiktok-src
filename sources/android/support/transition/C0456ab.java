package android.support.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p022v4.view.C0991u;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: android.support.transition.ab */
class C0456ab implements C0459ad {

    /* renamed from: a */
    public C0457a f1906a;

    /* renamed from: android.support.transition.ab$a */
    static class C0457a extends ViewGroup {

        /* renamed from: a */
        static Method f1907a;

        /* renamed from: b */
        ViewGroup f1908b;

        /* renamed from: c */
        View f1909c;

        /* renamed from: d */
        ArrayList<Drawable> f1910d;

        /* renamed from: e */
        C0456ab f1911e;

        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        static {
            try {
                f1907a = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        /* renamed from: a */
        private boolean m1995a() {
            if (getChildCount() == 0 && (this.f1910d == null || this.f1910d.size() == 0)) {
                return true;
            }
            return false;
        }

        public final void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* renamed from: b */
        public final void mo2053b(View view) {
            super.removeView(view);
            if (m1995a()) {
                this.f1908b.removeView(this);
            }
        }

        /* renamed from: a */
        private void m1994a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f1908b.getLocationOnScreen(iArr2);
            this.f1909c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: b */
        public final void mo2052b(Drawable drawable) {
            if (this.f1910d != null) {
                this.f1910d.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
            }
        }

        /* access modifiers changed from: protected */
        public final boolean verifyDrawable(Drawable drawable) {
            if (super.verifyDrawable(drawable) || (this.f1910d != null && this.f1910d.contains(drawable))) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo2050a(Drawable drawable) {
            if (this.f1910d == null) {
                this.f1910d = new ArrayList<>();
            }
            if (!this.f1910d.contains(drawable)) {
                this.f1910d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* access modifiers changed from: protected */
        public final void dispatchDraw(Canvas canvas) {
            int i;
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f1908b.getLocationOnScreen(iArr);
            this.f1909c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f1909c.getWidth(), this.f1909c.getHeight()));
            super.dispatchDraw(canvas);
            if (this.f1910d == null) {
                i = 0;
            } else {
                i = this.f1910d.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                ((Drawable) this.f1910d.get(i2)).draw(canvas);
            }
        }

        /* renamed from: a */
        public final void mo2051a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f1908b || viewGroup.getParent() == null || !C0991u.m4170G(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f1908b.getLocationOnScreen(iArr2);
                    C0991u.m4225i(view, iArr[0] - iArr2[0]);
                    C0991u.m4222h(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f1908b != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f1908b instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    m1994a(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }

        C0457a(Context context, ViewGroup viewGroup, View view, C0456ab abVar) {
            super(context);
            this.f1908b = viewGroup;
            this.f1909c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f1911e = abVar;
        }
    }

    /* renamed from: a */
    public final void mo2048a(Drawable drawable) {
        this.f1906a.mo2050a(drawable);
    }

    /* renamed from: b */
    public final void mo2049b(Drawable drawable) {
        this.f1906a.mo2052b(drawable);
    }

    /* renamed from: a */
    private static ViewGroup mo2164a(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: c */
    static C0456ab m1991c(View view) {
        ViewGroup a = mo2164a(view);
        if (a == null) {
            return null;
        }
        int childCount = a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = a.getChildAt(i);
            if (childAt instanceof C0457a) {
                return ((C0457a) childAt).f1911e;
            }
        }
        return new C0528v(a.getContext(), a, view);
    }

    C0456ab(Context context, ViewGroup viewGroup, View view) {
        this.f1906a = new C0457a(context, viewGroup, view, this);
    }
}
