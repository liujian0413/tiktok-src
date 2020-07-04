package com.p280ss.android.ugc.aweme.p984ad;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.p984ad.MentionTextView.C22372a;

/* renamed from: com.ss.android.ugc.aweme.ad.ClickSpanWorkaroundTextView */
public class ClickSpanWorkaroundTextView extends DmtTextView {

    /* renamed from: b */
    private C22372a f59698b;

    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
        }
        switch (motionEvent.getAction()) {
            case 0:
                C22372a aVar = (C22372a) m74070a(motionEvent, C22372a.class);
                if (aVar != null) {
                    aVar.mo58839a(true);
                    this.f59698b = aVar;
                    return true;
                } else if (m74070a(motionEvent, ClickableSpan.class) != null) {
                    return true;
                } else {
                    return false;
                }
            case 1:
                if (this.f59698b == null || this.f59698b != m74070a(motionEvent, C22372a.class)) {
                    return false;
                }
                this.f59698b.mo58839a(false);
                this.f59698b = null;
                return true;
            case 2:
                if (!(this.f59698b == null || this.f59698b == m74070a(motionEvent, C22372a.class))) {
                    this.f59698b.mo58839a(false);
                    this.f59698b = null;
                }
                return false;
            case 3:
                if (this.f59698b != null) {
                    this.f59698b.mo58839a(false);
                    this.f59698b = null;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: a */
    private <T extends ClickableSpan> T m74070a(MotionEvent motionEvent, Class<T> cls) {
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
            if (tArr.length > 0 && m74071a(offsetForHorizontal, spanned, tArr[0])) {
                t = tArr[0];
            }
            return t;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m74071a(int i, Spanned spanned, Object obj) {
        if (i < spanned.getSpanStart(obj) || i > spanned.getSpanEnd(obj)) {
            return false;
        }
        return true;
    }
}
