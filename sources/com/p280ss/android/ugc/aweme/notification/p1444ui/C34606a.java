package com.p280ss.android.ugc.aweme.notification.p1444ui;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.account.views.C22367e;

/* renamed from: com.ss.android.ugc.aweme.notification.ui.a */
public final class C34606a extends LinkMovementMethod {

    /* renamed from: b */
    private static C34606a f90338b;

    /* renamed from: a */
    private C22367e f90339a;

    /* renamed from: a */
    public static MovementMethod m111843a() {
        if (f90338b == null) {
            f90338b = new C34606a();
        }
        return f90338b;
    }

    /* renamed from: a */
    private static boolean m111845a(int i, Spannable spannable, Object obj) {
        if (i < spannable.getSpanStart(obj) || i > spannable.getSpanEnd(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private C22367e m111844a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
        C22367e[] eVarArr = (C22367e[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C22367e.class);
        if (eVarArr.length <= 0 || !m111845a(offsetForHorizontal, spannable, (Object) eVarArr[0])) {
            return null;
        }
        return eVarArr[0];
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            try {
                this.f90339a = m111844a(textView, spannable, motionEvent);
                if (this.f90339a != null) {
                    this.f90339a.f59674d = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(this.f90339a), spannable.getSpanEnd(this.f90339a));
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                C22367e a = m111844a(textView, spannable, motionEvent);
                if (!(this.f90339a == null || a == this.f90339a)) {
                    this.f90339a.f59674d = false;
                    this.f90339a = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException unused2) {
                return false;
            }
        } else {
            if (this.f90339a != null) {
                this.f90339a.f59674d = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.f90339a = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
