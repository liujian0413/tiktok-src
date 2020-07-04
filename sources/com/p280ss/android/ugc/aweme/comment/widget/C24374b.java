package com.p280ss.android.ugc.aweme.comment.widget;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.widget.b */
public final class C24374b implements InputFilter {

    /* renamed from: a */
    private final int f64340a;

    public C24374b(int i) {
        this.f64340a = i;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f64340a - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            if (!TextUtils.isEmpty(charSequence)) {
                C10761a.m31403c((Context) C29960a.m98230a(), C29960a.m98230a().getResources().getString(R.string.dm1, new Object[]{Integer.valueOf(this.f64340a)})).mo25750a();
            }
            return "";
        } else if (length >= i2 - i) {
            return null;
        } else {
            int i5 = length + i;
            if (Character.isHighSurrogate(charSequence.charAt(i5 - 1))) {
                i5--;
                if (i5 == i) {
                    C10761a.m31403c((Context) C29960a.m98230a(), C29960a.m98230a().getResources().getString(R.string.dm1, new Object[]{Integer.valueOf(this.f64340a)})).mo25750a();
                    return "";
                }
            }
            C10761a.m31403c((Context) C29960a.m98230a(), C29960a.m98230a().getResources().getString(R.string.dm1, new Object[]{Integer.valueOf(this.f64340a)})).mo25750a();
            return charSequence.subSequence(i, i5);
        }
    }
}
