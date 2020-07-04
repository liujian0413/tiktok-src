package com.p280ss.android.ugc.aweme.app;

import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;

/* renamed from: com.ss.android.ugc.aweme.app.ad */
public final class C22768ad implements C22790ak {
    /* renamed from: a */
    public final boolean mo59820a(Context context, String str) {
        if (context instanceof FragmentActivity) {
            return TextUtils.equals(HomePageDataViewModel.m98904a((FragmentActivity) context).mo79692a(), str);
        }
        return false;
    }
}
