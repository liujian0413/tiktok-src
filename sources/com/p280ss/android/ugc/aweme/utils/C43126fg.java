package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p029v7.p030a.p031a.C1065a;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.common.C10773a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.utils.fg */
public final class C43126fg {

    /* renamed from: a */
    public static final C43126fg f111748a = new C43126fg();

    private C43126fg() {
    }

    /* renamed from: a */
    public static final boolean m136802a(UserVerify userVerify) {
        CharSequence charSequence;
        String str = null;
        if (userVerify != null) {
            charSequence = userVerify.getCustomVerify();
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (userVerify != null) {
                str = userVerify.getEnterpriseVerifyReason();
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m136803a(String str, String str2) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static int m136804b(Context context, Float f) {
        if (context == null || f == null) {
            return R.drawable.a3r;
        }
        int c = C9738o.m28714c(context, f.floatValue());
        if (c == 17) {
            return R.drawable.a3s;
        }
        if (c == 20) {
            return R.drawable.a3t;
        }
        switch (c) {
            case 12:
            case 13:
            case 14:
            case 15:
                return R.drawable.a3r;
            default:
                return R.drawable.a3t;
        }
    }

    /* renamed from: c */
    private static int m136805c(Context context, Float f) {
        if (context == null || f == null) {
            return (int) C9738o.m28708b(context, 4.0f);
        }
        int c = C9738o.m28714c(context, f.floatValue());
        if (c == 17 || c == 20) {
            return (int) C9738o.m28708b(context, 4.0f);
        }
        switch (c) {
            case 12:
            case 13:
            case 14:
            case 15:
                return (int) C9738o.m28708b(context, 3.0f);
            default:
                return (int) C9738o.m28708b(context, 4.0f);
        }
    }

    /* renamed from: a */
    private static Drawable m136799a(Context context, Float f) {
        if (context == null || f == null) {
            return null;
        }
        int c = C9738o.m28714c(context, f.floatValue());
        if (c == 17) {
            return C1065a.m4641b(context, R.drawable.a3s);
        }
        if (c == 20) {
            return C1065a.m4641b(context, R.drawable.a3t);
        }
        switch (c) {
            case 12:
            case 13:
            case 14:
            case 15:
                return C1065a.m4641b(context, R.drawable.a3r);
            default:
                return C1065a.m4641b(context, R.drawable.a3t);
        }
    }

    /* renamed from: a */
    public static final void m136800a(Context context, UserVerify userVerify, TextView textView) {
        if (!(context == null || userVerify == null || textView == null || !C6399b.m19944t() || !m136802a(userVerify))) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(textView.getText());
            String str = " T";
            spannableStringBuilder.append(str);
            spannableStringBuilder.setSpan(new C10773a(context, m136804b(context, Float.valueOf(textView.getTextSize()))), (spannableStringBuilder.length() - str.length()) + 1, spannableStringBuilder.length(), 17);
            textView.setText(spannableStringBuilder);
        }
    }

    /* renamed from: a */
    public static final void m136801a(Context context, String str, String str2, TextView textView) {
        if (context != null && textView != null && C6399b.m19944t()) {
            Drawable a = m136799a(context, Float.valueOf(textView.getTextSize()));
            if (!m136803a(str, str2) || a == null) {
                if (VERSION.SDK_INT >= 17) {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, null, null);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                }
            } else if (VERSION.SDK_INT >= 17) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, a, null);
                textView.setCompoundDrawablePadding(m136805c(context, Float.valueOf(textView.getTextSize())));
            } else {
                a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
                textView.setCompoundDrawablesWithIntrinsicBounds(null, null, m136799a(context, Float.valueOf(textView.getTextSize())), null);
                textView.setCompoundDrawablePadding(m136805c(context, Float.valueOf(textView.getTextSize())));
            }
        }
    }
}
