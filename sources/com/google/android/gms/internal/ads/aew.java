package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.concurrent.Callable;

final class aew implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ Context f40118a;

    /* renamed from: b */
    private final /* synthetic */ Context f40119b;

    aew(aev aev, Context context, Context context2) {
        this.f40118a = context;
        this.f40119b = context2;
    }

    public final /* synthetic */ Object call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f40118a != null) {
            acd.m45438a("Attempting to read user agent from Google Play Services.");
            sharedPreferences = C7285c.m22838a(this.f40118a, "admob_user_agent", 0);
        } else {
            acd.m45438a("Attempting to read user agent from local cache.");
            sharedPreferences = C7285c.m22838a(this.f40119b, "admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            acd.m45438a("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f40119b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                acd.m45438a("Persisting user agent.");
            }
        }
        return string;
    }
}
