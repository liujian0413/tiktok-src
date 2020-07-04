package com.p280ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.account.views.C22364b;
import com.p280ss.android.ugc.aweme.account.views.C22367e;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ac */
public final class C21278ac {
    /* renamed from: a */
    public static void m71641a(Context context, TextView textView, final OnClickListener onClickListener, final OnClickListener onClickListener2, boolean z) {
        int i;
        StringBuilder sb = new StringBuilder(" ");
        sb.append(context.getString(R.string.adu));
        sb.append(" ");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(" ");
        sb3.append(context.getString(R.string.adt));
        String sb4 = sb3.toString();
        if (z) {
            i = R.string.ade;
        } else {
            i = R.string.acs;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(i, new Object[]{sb2, sb4}));
        int color = context.getResources().getColor(R.color.lo);
        int color2 = context.getResources().getColor(R.color.lo);
        C212791 r4 = new C22367e(color, color2) {
            public final void onClick(View view) {
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        };
        C212802 r8 = new C22367e(color, color2) {
            public final void onClick(View view) {
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            }
        };
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf = spannableStringBuilder2.indexOf(sb2);
        int indexOf2 = spannableStringBuilder2.indexOf(sb4) - (sb2.length() + indexOf);
        spannableStringBuilder.setSpan(r4, indexOf, sb2.length() + indexOf, 34);
        spannableStringBuilder.setSpan(r8, sb2.length() + indexOf + indexOf2, indexOf + sb2.length() + indexOf2 + sb4.length(), 34);
        textView.setHighlightColor(context.getResources().getColor(17170445));
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(C22364b.m74059a());
    }
}
