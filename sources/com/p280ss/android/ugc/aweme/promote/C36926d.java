package com.p280ss.android.ugc.aweme.promote;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.promote.d */
public class C36926d implements C36922a {

    /* renamed from: a */
    public static String f96761a = "http://m.tiktok.com/creatoradagreement";

    /* renamed from: a */
    public final void mo93286a(Context context, String str, String str2) {
        Activity activity = (Activity) context;
        if (TextUtils.isEmpty(str)) {
            str = f96761a;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = context.getResources().getString(R.string.d8j);
        }
        AgreementActivity.m99747a(activity, str, false, str2);
    }
}
