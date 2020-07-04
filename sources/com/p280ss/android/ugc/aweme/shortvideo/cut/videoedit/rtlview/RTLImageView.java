package com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview;

import android.content.Context;
import android.support.p022v4.view.C0991u;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView */
public class RTLImageView extends AutoRTLImageView {

    /* renamed from: a */
    private int f101877a;

    public float getLeftX() {
        return super.getX();
    }

    /* renamed from: a */
    private void m125423a() {
        this.f101877a = C23482j.m77098b(C23487o.m77130a(getContext()));
    }

    public float getStartX() {
        if (C0991u.m4220h(this) == 1) {
            return (((float) this.f101877a) - super.getX()) - ((float) getMeasuredWidth());
        }
        return super.getX();
    }

    public void setLeftX(float f) {
        super.setX(f);
    }

    public RTLImageView(Context context) {
        super(context);
        m125423a();
    }

    public void setStartX(float f) {
        if (C0991u.m4220h(this) == 1) {
            f = (((float) this.f101877a) - f) - ((float) getMeasuredWidth());
        }
        super.setX(f);
    }
}
