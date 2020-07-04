package android.support.p029v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.widget.C1054l;
import android.support.p029v7.appcompat.R$styleable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.widget.j */
final class C1415j extends PopupWindow {

    /* renamed from: a */
    private static final boolean f5512a;

    /* renamed from: b */
    private boolean f5513b;

    static {
        boolean z;
        if (VERSION.SDK_INT < 21) {
            z = true;
        } else {
            z = false;
        }
        f5512a = z;
    }

    /* renamed from: a */
    private void m7008a(boolean z) {
        if (f5512a) {
            this.f5513b = z;
        } else {
            C1054l.m4553a((PopupWindow) this, z);
        }
    }

    public final void showAsDropDown(View view, int i, int i2) {
        if (f5512a && this.f5513b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public C1415j(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m7007a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m7007a(Context context, AttributeSet attributeSet, int i, int i2) {
        C1365av a = C1365av.m6744a(context, attributeSet, R$styleable.PopupWindow, i, i2);
        if (a.mo6406g(2)) {
            m7008a(a.mo6394a(2, false));
        }
        setBackgroundDrawable(a.mo6392a(0));
        a.mo6393a();
    }

    public final void showAsDropDown(View view, int i, int i2, int i3) {
        if (f5512a && this.f5513b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public final void update(View view, int i, int i2, int i3, int i4) {
        if (f5512a && this.f5513b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
