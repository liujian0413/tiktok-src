package android.support.design.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.util.AttributeSet;
import android.view.View;

class ViewOffsetBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    private C0412o f1604a;

    /* renamed from: b */
    private int f1605b;

    /* renamed from: c */
    private int f1606c;

    public ViewOffsetBehavior() {
    }

    /* renamed from: b */
    public int mo1273b() {
        if (this.f1604a != null) {
            return this.f1604a.f1771c;
        }
        return 0;
    }

    /* renamed from: a */
    public boolean mo1272a(int i) {
        if (this.f1604a != null) {
            return this.f1604a.mo1875a(i);
        }
        this.f1605b = i;
        return false;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1534b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo1394a((View) v, i);
    }

    /* renamed from: a */
    public boolean mo684a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo1534b(coordinatorLayout, v, i);
        if (this.f1604a == null) {
            this.f1604a = new C0412o(v);
        }
        this.f1604a.mo1874a();
        if (this.f1605b != 0) {
            this.f1604a.mo1875a(this.f1605b);
            this.f1605b = 0;
        }
        if (this.f1606c != 0) {
            this.f1604a.mo1876b(this.f1606c);
            this.f1606c = 0;
        }
        return true;
    }
}
