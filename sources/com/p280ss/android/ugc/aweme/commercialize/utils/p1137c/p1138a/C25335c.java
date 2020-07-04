package com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.p1138a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.a.c */
public final class C25335c {

    /* renamed from: a */
    public static final C25335c f66725a = new C25335c();

    private C25335c() {
    }

    /* renamed from: a */
    public static final boolean m83259a(Context context, String str) {
        if (str == null) {
            return false;
        }
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        StringBuilder sb = new StringBuilder("https://play.google.com/store/apps/details?id=");
        sb.append(str);
        intent.setData(Uri.parse(sb.toString()));
        intent.putExtra("hide_nav_bar", true);
        intent.putExtra("hide_status_bar", true);
        return C25371n.m83445a(context, intent);
    }
}
