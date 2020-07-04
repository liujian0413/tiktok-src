package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.account.views.C22367e;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.t */
public final class C23808t extends LinkMovementMethod {

    /* renamed from: b */
    private static C23808t f62846b;

    /* renamed from: a */
    private C22367e f62847a;

    /* renamed from: a */
    public static MovementMethod m78017a() {
        if (f62846b == null) {
            f62846b = new C23808t();
        }
        return f62846b;
    }

    /* renamed from: a */
    private static boolean m78019a(int i, Spannable spannable, Object obj) {
        if (i < spannable.getSpanStart(obj) || i > spannable.getSpanEnd(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private C22367e m78018a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
        C22367e[] eVarArr = (C22367e[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C22367e.class);
        if (eVarArr.length <= 0 || !m78019a(offsetForHorizontal, spannable, (Object) eVarArr[0])) {
            return null;
        }
        return eVarArr[0];
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            try {
                this.f62847a = m78018a(textView, spannable, motionEvent);
                if (this.f62847a != null) {
                    this.f62847a.f59674d = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(this.f62847a), spannable.getSpanEnd(this.f62847a));
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                C22367e a = m78018a(textView, spannable, motionEvent);
                if (!(this.f62847a == null || a == this.f62847a)) {
                    this.f62847a.f59674d = false;
                    this.f62847a = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException unused2) {
                return false;
            }
        } else {
            if (this.f62847a != null) {
                this.f62847a.f59674d = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.f62847a = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
