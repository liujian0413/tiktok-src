package com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.p1138a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.a.d */
public final class C25336d {

    /* renamed from: a */
    public static final C25336d f66726a = new C25336d();

    private C25336d() {
    }

    /* renamed from: a */
    public static final void m83260a(Context context, String str) {
        if (context != null && str != null) {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.setData(Uri.parse(parse.getQueryParameter("url")));
            String queryParameter = parse.getQueryParameter("immersive_mode");
            String queryParameter2 = parse.getQueryParameter("enter_from");
            String queryParameter3 = parse.getQueryParameter("author_id");
            if (queryParameter != null) {
                Integer d = C7634n.m23706d(queryParameter);
                if (d != null && d.intValue() == 1) {
                    intent.putExtra("use_ordinary_web", false);
                }
            }
            if (queryParameter2 != null) {
                intent.putExtra("quick_shop_enter_from", queryParameter2);
            }
            if (queryParameter3 != null) {
                intent.putExtra("owner_id", queryParameter3);
            }
            intent.putExtra("web_type", 2);
            C25371n.m83445a(context, intent);
        }
    }
}
