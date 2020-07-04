package com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview;

import android.content.Context;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout */
public class RTLLinearLayout extends LinearLayout {

    /* renamed from: a */
    private int f101878a;

    public float getLeftX() {
        return super.getX();
    }

    /* renamed from: a */
    private void m125424a() {
        this.f101878a = C23482j.m77098b(C23487o.m77130a(getContext()));
    }

    public float getStartX() {
        if (C0991u.m4220h(this) == 1) {
            return (((float) this.f101878a) - super.getX()) - ((float) getMeasuredWidth());
        }
        return super.getX();
    }

    public void setLeftX(float f) {
        super.setX(f);
    }

    public RTLLinearLayout(Context context) {
        super(context);
        m125424a();
    }

    public void setStartX(float f) {
        if (C0991u.m4220h(this) == 1) {
            super.setX((((float) this.f101878a) - f) - ((float) getMeasuredWidth()));
        } else {
            super.setX(f);
        }
    }

    public RTLLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m125424a();
    }

    public RTLLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m125424a();
    }
}
