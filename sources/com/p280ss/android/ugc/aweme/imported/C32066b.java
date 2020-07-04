package com.p280ss.android.ugc.aweme.imported;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.imported.b */
public final class C32066b implements InputFilter {

    /* renamed from: a */
    public boolean f83868a;

    /* renamed from: b */
    private final int f83869b;

    /* renamed from: a */
    public final void mo83032a() {
        this.f83868a = false;
    }

    public C32066b(int i) {
        this.f83869b = i;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f83869b - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            if (!TextUtils.isEmpty(charSequence)) {
                C10761a.m31403c((Context) C29960a.m98230a(), C29960a.m98230a().getResources().getString(R.string.dm1, new Object[]{Integer.valueOf(this.f83869b)})).mo25750a();
                this.f83868a = true;
            }
            return "";
        } else if (length >= i2 - i) {
            return null;
        } else {
            int i5 = length + i;
            if (Character.isHighSurrogate(charSequence.charAt(i5 - 1))) {
                i5--;
                if (i5 == i) {
                    C10761a.m31403c((Context) C29960a.m98230a(), C29960a.m98230a().getResources().getString(R.string.dm1, new Object[]{Integer.valueOf(this.f83869b)})).mo25750a();
                    this.f83868a = true;
                    return "";
                }
            }
            C10761a.m31403c((Context) C29960a.m98230a(), C29960a.m98230a().getResources().getString(R.string.dm1, new Object[]{Integer.valueOf(this.f83869b)})).mo25750a();
            this.f83868a = true;
            return charSequence.subSequence(i, i5);
        }
    }
}
