package com.bytedance.android.livesdk.chatroom.p220ui;

import android.os.SystemClock;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cs */
public final class C5257cs extends LinkMovementMethod {

    /* renamed from: c */
    private static C5257cs f15372c;

    /* renamed from: a */
    private final long f15373a = ((long) ViewConfiguration.getLongPressTimeout());

    /* renamed from: b */
    private long f15374b;

    private C5257cs() {
    }

    /* renamed from: a */
    public static C5257cs m16901a() {
        if (f15372c == null) {
            f15372c = new C5257cs();
        }
        return f15372c;
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
            int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            try {
                int lineForVertical = layout.getLineForVertical(y);
                if (lineForVertical >= layout.getLineCount()) {
                    return false;
                }
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) x);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        if (!(clickableSpanArr[0] instanceof C5258ct)) {
                            clickableSpanArr[0].onClick(textView);
                        } else if (this.f15374b <= 0 || SystemClock.elapsedRealtime() - this.f15374b < this.f15373a) {
                            clickableSpanArr[0].onClick(textView);
                        } else {
                            ((C5258ct) clickableSpanArr[0]).mo13520a(textView);
                        }
                        this.f15374b = 0;
                    } else if (action == 0) {
                        Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                        this.f15374b = SystemClock.elapsedRealtime();
                    }
                    return true;
                }
                Selection.removeSelection(spannable);
            } catch (Exception unused) {
                return false;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
