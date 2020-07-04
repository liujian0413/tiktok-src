package com.p280ss.android.ugc.aweme.account.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.p982ui.RecoverAccountActivity;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.utils.C43122ff;

/* renamed from: com.ss.android.ugc.aweme.account.util.i */
public final class C22330i {
    /* renamed from: a */
    public static boolean m73930a() {
        return m73931a((String) null);
    }

    /* renamed from: a */
    public static boolean m73931a(String str) {
        if (!C21115b.m71197a().getCurUser().isUserCancelled()) {
            return false;
        }
        RecoverAccountActivity.m73826a(AwemeApplication.m21341a(), str);
        return true;
    }

    /* renamed from: a */
    public static void m73929a(Context context) {
        String str;
        if (!C6399b.m19946v()) {
            str = "https://www.tiktokv.com/aweme/account/check/";
        } else if (C43122ff.m136767b()) {
            str = "https://m.tiktok.com/account/confirm/";
        } else {
            str = "https://m.tiktok.com/account/check/";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("?locale=");
        sb.append(((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage());
        String sb2 = sb.toString();
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.putExtra("hide_status_bar", true);
        intent.putExtra("hide_nav_bar", true);
        intent.setData(Uri.parse(sb2));
        context.startActivity(intent);
    }
}
