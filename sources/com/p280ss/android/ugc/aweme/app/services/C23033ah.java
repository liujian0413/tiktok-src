package com.p280ss.android.ugc.aweme.app.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.main.p1385g.C33038x;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.services.ah */
public final class C23033ah implements C33038x {
    /* renamed from: a */
    public final void mo60006a(Context context, String str, String str2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "url");
        C7573i.m23587b(str2, "headStr");
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        intent.putExtra("hide_nav_bar", true);
        intent.putExtra("wap_headers", str2);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo60007a(Context context, String str, boolean z) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "url");
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("hide_nav_bar", z);
        context.startActivity(intent);
    }
}
