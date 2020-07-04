package com.p280ss.android.ugc.aweme.profile;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.router.SmartRouter;

/* renamed from: com.ss.android.ugc.aweme.profile.aa */
public final class C35671aa {
    /* renamed from: a */
    private static boolean m115278a(Context context) {
        try {
            if (context.getPackageManager().getPackageInfo("com.sina.weibo", 0) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m115277a(Context context, String str, String str2, String str3) {
        if (context != null) {
            if (m115278a(context)) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.VIEW");
                        intent.addCategory("android.intent.category.DEFAULT");
                        intent.setData(Uri.parse(str));
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        C10761a.m31403c(context, "找不到对应的Activity,微博客户端存在异常").mo25750a();
                    }
                }
            } else if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                SmartRouter.buildRoute(context, "//webview").withParam("url", str2).withParam("title", str3).open();
            }
        }
    }
}
