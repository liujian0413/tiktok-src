package com.p280ss.android.ugc.aweme.feed.widget;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.d */
public class C29051d extends BaseMovementMethod {

    /* renamed from: a */
    private static C29051d f76603a;

    private C29051d() {
    }

    /* renamed from: a */
    public static C29051d m95330a() {
        if (f76603a == null) {
            synchronized (C29051d.class) {
                if (f76603a == null) {
                    f76603a = new C29051d();
                }
            }
        }
        return f76603a;
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (int) motionEvent.getX();
            int totalPaddingLeft = (x - textView.getTotalPaddingLeft()) + textView.getScrollX();
            int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) totalPaddingLeft);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && action == 1) {
                clickableSpanArr[0].onClick(textView);
            }
            return true;
        }
        return true;
    }
}
