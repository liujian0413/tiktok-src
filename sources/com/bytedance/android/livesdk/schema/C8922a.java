package com.bytedance.android.livesdk.schema;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.livesdk.browser.C3951b;
import com.bytedance.android.livesdkapi.host.IHostAction;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.schema.a */
public final class C8922a implements C8923b {

    /* renamed from: a */
    private IHostAction f24292a;

    C8922a(IHostAction iHostAction) {
        this.f24292a = iHostAction;
    }

    /* renamed from: a */
    public final boolean mo22049a(String str) {
        return this.f24292a.tryShowKoiRedPackageInLive(str);
    }

    /* renamed from: a */
    public final void mo22043a(long j, Map<String, String> map) {
        this.f24292a.openUserProfilePage(j, map);
    }

    /* renamed from: a */
    public final void mo22044a(String str, Context context) {
        this.f24292a.openFeedBack(str, context);
    }

    /* renamed from: b */
    public final void mo22050b(Context context, String str) {
        Intent intent = new Intent();
        intent.putExtra("url", str);
        this.f24292a.openSignActivity(context, intent);
    }

    /* renamed from: a */
    public final void mo22046a(String str, String str2) {
        this.f24292a.openVideoDetailPage(str, str2);
    }

    /* renamed from: a */
    public final boolean mo22047a(Context context, String str) {
        return this.f24292a.handleSchema(context, str, new Bundle());
    }

    /* renamed from: a */
    public final void mo22045a(String str, Bundle bundle, Context context) {
        this.f24292a.openLiveBrowser(str, bundle, context);
        C3951b.m13877a(str);
    }

    /* renamed from: a */
    public final boolean mo22048a(Context context, String str, Bundle bundle) {
        return this.f24292a.handleSchema(context, str, bundle);
    }
}
