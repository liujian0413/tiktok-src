package com.bytedance.opensdk.core.grant.p631a;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.opensdk.core.ApiInfo;
import com.bytedance.opensdk.core.base.config.AppConfig;
import com.bytedance.opensdk.core.grant.config.GrantConfig;
import com.bytedance.opensdk.core.grant.model.GrantInfo;
import com.bytedance.opensdk.core.grant.web.WebGrantActivity;
import kotlin.C7581n;
import kotlin.coroutines.C47919b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.opensdk.core.grant.a.a */
public final class C12323a {

    /* renamed from: a */
    private AppConfig f32707a;

    public C12323a(AppConfig appConfig) {
        C7573i.m23587b(appConfig, "appConfig");
        this.f32707a = appConfig;
    }

    /* renamed from: a */
    private static void m35782a(Activity activity, GrantConfig grantConfig) {
        Intent intent = new Intent(activity, WebGrantActivity.class);
        intent.putExtra("bind_config", grantConfig);
        activity.startActivityForResult(intent, grantConfig.f32712e.getRequestCodeInt());
    }

    /* renamed from: a */
    public final Object mo30153a(Activity activity, GrantInfo grantInfo, String str, C47919b<? super C7581n> bVar) {
        GrantConfig grantConfig = new GrantConfig(grantInfo.f32716c, this.f32707a, grantInfo, str, ApiInfo.GRANT, this.f32707a.f32675g);
        m35782a(activity, grantConfig);
        return C7581n.f20898a;
    }
}
