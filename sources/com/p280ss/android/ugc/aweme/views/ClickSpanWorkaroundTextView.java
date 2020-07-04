package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43345c;

/* renamed from: com.ss.android.ugc.aweme.views.ClickSpanWorkaroundTextView */
public class ClickSpanWorkaroundTextView extends DmtTextView {

    /* renamed from: b */
    private C43345c f112226b;

    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e) {
            C6921a.m21554a(e);
            return null;
        }
    }

    public ClickSpanWorkaroundTextView(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
        switch (motionEvent.getAction()) {
            case 0:
                C43345c cVar = (C43345c) m137566a(motionEvent, C43345c.class);
                if (cVar != null) {
                    cVar.mo105198a(true);
                    this.f112226b = cVar;
                    return true;
                } else if (m137566a(motionEvent, ClickableSpan.class) != null) {
                    return true;
                } else {
                    return false;
                }
            case 1:
                if (this.f112226b == null || this.f112226b != m137566a(motionEvent, C43345c.class)) {
                    return false;
                }
                this.f112226b.mo105198a(false);
                this.f112226b = null;
                return true;
            case 2:
                if (!(this.f112226b == null || this.f112226b == m137566a(motionEvent, C43345c.class))) {
                    this.f112226b.mo105198a(false);
                    this.f112226b = null;
                }
                return false;
            case 3:
                if (this.f112226b != null) {
                    this.f112226b.mo105198a(false);
                    this.f112226b = null;
                }
                return false;
            default:
                return false;
        }
    }

    public ClickSpanWorkaroundTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private <T extends ClickableSpan> T m137566a(MotionEvent motionEvent, Class<T> cls) {
        T t = null;
        if (!(getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) getText();
        int x = (((int) motionEvent.getX()) - getTotalPaddingLeft()) + getScrollX();
        int y = (((int) motionEvent.getY()) - getTotalPaddingTop()) + getScrollY();
        Layout layout = getLayout();
        try {
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
            T[] tArr = (ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, cls);
            if (tArr.length > 0 && m137567a(offsetForHorizontal, spanned, tArr[0])) {
                t = tArr[0];
            }
            return t;
        } catch (Exception unused) {
            return null;
        }
    }

    public ClickSpanWorkaroundTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    private static boolean m137567a(int i, Spanned spanned, Object obj) {
        if (i < spanned.getSpanStart(obj) || i > spanned.getSpanEnd(obj)) {
            return false;
        }
        return true;
    }
}
