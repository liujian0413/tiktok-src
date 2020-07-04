package com.facebook.share.internal;

import android.content.Context;
import android.support.p029v7.p030a.p031a.C1065a;
import android.util.AttributeSet;
import com.facebook.C13449f;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.facebook.share.internal.g */
public final class C14527g extends C13449f {
    public final int getDefaultRequestCode() {
        return 0;
    }

    public final int getDefaultStyleResource() {
        return R.style.s6;
    }

    /* renamed from: a */
    private void m41921a() {
        if (isSelected()) {
            setCompoundDrawablesWithIntrinsicBounds(R.drawable.x0, 0, 0, 0);
            setText(getResources().getString(R.string.a6e));
            return;
        }
        setCompoundDrawablesWithIntrinsicBounds(C1065a.m4641b(getContext(), R.drawable.wy), null, null, null);
        setText(getResources().getString(R.string.a6f));
    }

    public final void setSelected(boolean z) {
        super.setSelected(z);
        m41921a();
    }

    /* renamed from: a */
    public final void mo32947a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.mo32947a(context, attributeSet, i, i2);
        m41921a();
    }
}
