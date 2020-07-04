package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.content.Context;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.SpanInterceptNoTextView */
public class SpanInterceptNoTextView extends DmtTextView {

    /* renamed from: b */
    private GestureDetector f83645b;

    /* renamed from: c */
    CharacterStyle f83646c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1061a() {
    }

    public ActionMode startActionMode(Callback callback) {
        return null;
    }

    public ActionMode startActionMode(Callback callback, int i) {
        return null;
    }

    /* renamed from: b */
    private void m103908b() {
        getPaint().setUnderlineText(false);
        setTextIsSelectable(true);
        m103909c();
    }

    /* renamed from: c */
    private void m103909c() {
        this.f83645b = new GestureDetector(new SimpleOnGestureListener() {

            /* renamed from: b */
            private MotionEvent f83648b;

            public final boolean onDown(MotionEvent motionEvent) {
                this.f83648b = motionEvent;
                return SpanInterceptNoTextView.this.mo82904a(this.f83648b, 0);
            }

            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return SpanInterceptNoTextView.this.mo82904a(this.f83648b, 1);
            }

            public final void onLongPress(MotionEvent motionEvent) {
                SpanInterceptNoTextView.this.mo82904a(this.f83648b, 3);
                ((View) SpanInterceptNoTextView.this.getParent()).performLongClick();
                SpanInterceptNoTextView.this.mo1061a();
            }

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return SpanInterceptNoTextView.this.mo82904a(this.f83648b, 3);
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return SpanInterceptNoTextView.this.mo82904a(this.f83648b, 3);
            }
        });
    }

    private CharacterStyle getPressedSpan() {
        if (this.f83646c != null) {
            return this.f83646c;
        }
        this.f83646c = getCharStyle();
        return this.f83646c;
    }

    /* access modifiers changed from: 0000 */
    public CharacterStyle getCharStyle() {
        return new BackgroundColorSpan(getHighlightColor());
    }

    public SpanInterceptNoTextView(Context context) {
        super(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f83645b.onTouchEvent(motionEvent);
    }

    public SpanInterceptNoTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final boolean mo82904a(MotionEvent motionEvent, int i) {
        int x = (((int) motionEvent.getX()) - getTotalPaddingLeft()) + getScrollX();
        int y = (((int) motionEvent.getY()) - getTotalPaddingTop()) + getScrollY();
        Layout layout = getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
        Spannable spannable = (Spannable) getText();
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length != 0) {
            int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
            int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
            if (i != 3) {
                switch (i) {
                    case 0:
                        Selection.setSelection(spannable, spanStart, spanEnd);
                        spannable.setSpan(getPressedSpan(), spanStart, spanEnd, 33);
                        return true;
                    case 1:
                        clickableSpanArr[0].onClick(this);
                        spannable.removeSpan(getPressedSpan());
                        break;
                }
            }
            Selection.removeSelection(spannable);
            spannable.removeSpan(getPressedSpan());
            return true;
        }
        Selection.removeSelection(spannable);
        spannable.removeSpan(getPressedSpan());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        onTouchEvent(obtain);
        return false;
    }

    public SpanInterceptNoTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m103908b();
    }
}
