package com.p280ss.android.ugc.aweme.flowfeed.p1256ui;

import android.text.Layout;
import android.text.NoCopySpan.Concrete;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.d */
public final class C29401d extends ScrollingMovementMethod {

    /* renamed from: b */
    private static C29401d f77482b;

    /* renamed from: c */
    private static Object f77483c = new Concrete();

    /* renamed from: a */
    int f77484a;

    public final boolean canSelectArbitrarily() {
        return true;
    }

    public final void onTakeFocus(TextView textView, Spannable spannable, int i) {
    }

    private C29401d(int i) {
        this.f77484a = i;
    }

    /* renamed from: a */
    public static MovementMethod m96615a(int i) {
        if (f77482b == null) {
            f77482b = new C29401d(i);
            return f77482b;
        } else if (f77482b.f77484a == i) {
            return f77482b;
        } else {
            return new C29401d(i);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean down(TextView textView, Spannable spannable) {
        if (m96616a(3, textView, spannable)) {
            return true;
        }
        return super.down(textView, spannable);
    }

    public final void initialize(TextView textView, Spannable spannable) {
        Selection.removeSelection(spannable);
        spannable.removeSpan(f77483c);
    }

    /* access modifiers changed from: protected */
    public final boolean left(TextView textView, Spannable spannable) {
        if (m96616a(2, textView, spannable)) {
            return true;
        }
        return super.left(textView, spannable);
    }

    /* access modifiers changed from: protected */
    public final boolean right(TextView textView, Spannable spannable) {
        if (m96616a(3, textView, spannable)) {
            return true;
        }
        return super.right(textView, spannable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: up */
    public final boolean mo75224up(TextView textView, Spannable spannable) {
        if (m96616a(2, textView, spannable)) {
            return true;
        }
        return super.up(textView, spannable);
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
            int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            int lineForVertical = layout.getLineForVertical(y);
            if (lineForVertical == 0 && x < this.f77484a) {
                return false;
            }
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) x);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    clickableSpanArr[0].onClick(textView);
                }
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }

    /* renamed from: a */
    private static boolean m96616a(int i, TextView textView, Spannable spannable) {
        Layout layout = textView.getLayout();
        int totalPaddingTop = textView.getTotalPaddingTop() + textView.getTotalPaddingBottom();
        int scrollY = textView.getScrollY();
        int height = (textView.getHeight() + scrollY) - totalPaddingTop;
        int lineForVertical = layout.getLineForVertical(scrollY);
        int lineForVertical2 = layout.getLineForVertical(height);
        int lineStart = layout.getLineStart(lineForVertical);
        int lineEnd = layout.getLineEnd(lineForVertical2);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(lineStart, lineEnd, ClickableSpan.class);
        int selectionStart = Selection.getSelectionStart(spannable);
        int selectionEnd = Selection.getSelectionEnd(spannable);
        int min = Math.min(selectionStart, selectionEnd);
        int max = Math.max(selectionStart, selectionEnd);
        if (min < 0 && spannable.getSpanStart(f77483c) >= 0) {
            min = spannable.length();
            max = min;
        }
        if (min > lineEnd) {
            max = Integer.MAX_VALUE;
            min = Integer.MAX_VALUE;
        }
        int i2 = -1;
        if (max < lineStart) {
            max = -1;
            min = -1;
        }
        switch (i) {
            case 1:
                if (min != max) {
                    ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable.getSpans(min, max, ClickableSpan.class);
                    if (clickableSpanArr2.length == 1) {
                        clickableSpanArr2[0].onClick(textView);
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 2:
                int i3 = -1;
                for (int i4 = 0; i4 < clickableSpanArr.length; i4++) {
                    int spanEnd = spannable.getSpanEnd(clickableSpanArr[i4]);
                    if ((spanEnd < max || min == max) && spanEnd > i3) {
                        i2 = spannable.getSpanStart(clickableSpanArr[i4]);
                        i3 = spanEnd;
                    }
                }
                if (i2 >= 0) {
                    Selection.setSelection(spannable, i3, i2);
                    return true;
                }
                break;
            case 3:
                int i5 = Integer.MAX_VALUE;
                int i6 = Integer.MAX_VALUE;
                for (int i7 = 0; i7 < clickableSpanArr.length; i7++) {
                    int spanStart = spannable.getSpanStart(clickableSpanArr[i7]);
                    if ((spanStart > min || min == max) && spanStart < i6) {
                        i5 = spannable.getSpanEnd(clickableSpanArr[i7]);
                        i6 = spanStart;
                    }
                }
                if (i5 < Integer.MAX_VALUE) {
                    Selection.setSelection(spannable, i6, i5);
                    return true;
                }
                break;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean handleMovementKey(TextView textView, Spannable spannable, int i, int i2, KeyEvent keyEvent) {
        if ((i == 23 || i == 66) && KeyEvent.metaStateHasNoModifiers(i2) && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0 && m96616a(1, textView, spannable)) {
            return true;
        }
        return super.handleMovementKey(textView, spannable, i, i2, keyEvent);
    }
}
