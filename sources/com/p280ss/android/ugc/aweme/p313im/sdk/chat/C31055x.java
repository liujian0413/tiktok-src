package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.text.InputFilter;
import android.text.Spanned;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.x */
public final class C31055x implements InputFilter {

    /* renamed from: a */
    private final int f81507a;

    public C31055x(int i) {
        this.f81507a = i;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f81507a - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            C9738o.m28697a(C6399b.m19921a(), C6399b.m19921a().getResources().getString(R.string.bmn));
            return "";
        } else if (length >= i2 - i) {
            return null;
        } else {
            int i5 = length + i;
            if (Character.isHighSurrogate(charSequence.charAt(i5 - 1))) {
                i5--;
                if (i5 == i) {
                    C9738o.m28697a(C6399b.m19921a(), C6399b.m19921a().getResources().getString(R.string.bmn));
                    return "";
                }
            }
            return charSequence.subSequence(i, i5);
        }
    }
}
