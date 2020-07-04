package com.p280ss.android.ugc.aweme.profile;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.base.share.RocketFansGroupInfo;
import com.p280ss.android.ugc.aweme.utils.C42919ag;
import com.rocket.android.opensdk.IRocketAPI;
import com.rocket.android.opensdk.RocketAPIFactory;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.w */
public final class C36104w {
    /* renamed from: a */
    public static void m116262a(Context context, RocketFansGroupInfo rocketFansGroupInfo) {
        if (context != null && rocketFansGroupInfo != null) {
            IRocketAPI createRocketAPI = RocketAPIFactory.createRocketAPI(context, "rs9760739781918870", true);
            if (!createRocketAPI.isRocketInstalled() || !createRocketAPI.isRocketSupportAPI()) {
                String downloadUrl = rocketFansGroupInfo.getDownloadUrl();
                if (!TextUtils.isEmpty(downloadUrl)) {
                    C42919ag.m136264a("rocket_token", context, rocketFansGroupInfo.getToken());
                    try {
                        SmartRouter.buildRoute(context, "//webview").withParam("url", downloadUrl).open();
                    } catch (Exception unused) {
                        C10761a.m31399c(context, (int) R.string.dhf).mo25750a();
                    }
                }
            } else {
                String schema = rocketFansGroupInfo.getSchema();
                if (!TextUtils.isEmpty(schema)) {
                    C42919ag.m136264a("rocket_token", context, rocketFansGroupInfo.getToken());
                    try {
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.VIEW");
                        intent.addCategory("android.intent.category.DEFAULT");
                        intent.setData(Uri.parse(schema));
                        context.startActivity(intent);
                    } catch (Exception unused2) {
                        C10761a.m31399c(context, (int) R.string.dhf).mo25750a();
                    }
                }
            }
        }
    }
}
