package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout.C0355d;
import android.support.p022v4.p023a.C0534a;
import android.support.p022v4.view.C0954ab;
import android.support.p022v4.view.C0972e;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.List;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: a */
    final Rect f1457a = new Rect();

    /* renamed from: b */
    final Rect f1458b = new Rect();

    /* renamed from: c */
    public int f1459c = 0;

    /* renamed from: d */
    public int f1460d;

    /* renamed from: b */
    private static int m1551b(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo1275a(View view) {
        return 1.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract View mo1276a(List<View> list);

    public HeaderScrollingViewBehavior() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo1278b(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo1535c(View view) {
        if (this.f1460d == 0) {
            return 0;
        }
        return C0534a.m2233a((int) (mo1275a(view) * ((float) this.f1460d)), 0, this.f1460d);
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo1534b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a = mo1276a(coordinatorLayout.mo1400b(view));
        if (a != null) {
            C0355d dVar = (C0355d) view.getLayoutParams();
            Rect rect = this.f1457a;
            rect.set(coordinatorLayout.getPaddingLeft() + dVar.leftMargin, a.getBottom() + dVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - dVar.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - dVar.bottomMargin);
            C0954ab lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C0991u.m4244w(coordinatorLayout) && !C0991u.m4244w(view)) {
                rect.left += lastWindowInsets.mo3717a();
                rect.right -= lastWindowInsets.mo3720c();
            }
            Rect rect2 = this.f1458b;
            C0972e.m4110a(m1551b(dVar.f1409c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int c = mo1535c(a);
            view.layout(rect2.left, rect2.top - c, rect2.right, rect2.bottom - c);
            this.f1459c = rect2.top - a.getBottom();
            return;
        }
        super.mo1534b(coordinatorLayout, view, i);
        this.f1459c = 0;
    }

    /* renamed from: a */
    public boolean mo1263a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = view.getLayoutParams().height;
        if (i6 == -1 || i6 == -2) {
            View a = mo1276a(coordinatorLayout.mo1400b(view));
            if (a != null) {
                if (!C0991u.m4244w(a) || C0991u.m4244w(view)) {
                    View view2 = view;
                } else {
                    View view3 = view;
                    C0991u.m4203b(view, true);
                    if (C0991u.m4244w(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                int measuredHeight = (size - a.getMeasuredHeight()) + mo1278b(a);
                if (i6 == -1) {
                    i5 = 1073741824;
                } else {
                    i5 = Integer.MIN_VALUE;
                }
                coordinatorLayout.mo1395a(view, i, i2, MeasureSpec.makeMeasureSpec(measuredHeight, i5), i4);
                return true;
            }
        }
        return false;
    }
}
