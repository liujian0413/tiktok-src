package com.p280ss.android.ugc.aweme.account.views;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.account.views.b */
public final class C22364b extends LinkMovementMethod {

    /* renamed from: b */
    private static C22364b f59667b;

    /* renamed from: a */
    private C22367e f59668a;

    /* renamed from: a */
    public static MovementMethod m74059a() {
        if (f59667b == null) {
            f59667b = new C22364b();
        }
        return f59667b;
    }

    /* renamed from: a */
    private static boolean m74061a(int i, Spannable spannable, Object obj) {
        if (i < spannable.getSpanStart(obj) || i > spannable.getSpanEnd(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private C22367e m74060a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
        C22367e[] eVarArr = (C22367e[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C22367e.class);
        if (eVarArr.length <= 0 || !m74061a(offsetForHorizontal, spannable, (Object) eVarArr[0])) {
            return null;
        }
        return eVarArr[0];
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f59668a = m74060a(textView, spannable, motionEvent);
            if (this.f59668a != null) {
                this.f59668a.f59674d = true;
                Selection.setSelection(spannable, spannable.getSpanStart(this.f59668a), spannable.getSpanEnd(this.f59668a));
            }
        } else if (motionEvent.getAction() == 2) {
            C22367e a = m74060a(textView, spannable, motionEvent);
            if (!(this.f59668a == null || a == this.f59668a)) {
                this.f59668a.f59674d = false;
                this.f59668a = null;
                Selection.removeSelection(spannable);
            }
        } else {
            if (this.f59668a != null) {
                this.f59668a.f59674d = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.f59668a = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
