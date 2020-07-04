package com.p280ss.android.ugc.aweme.ttplatformapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ttplatformsdk.p911b.C20426a;
import com.p280ss.android.ttplatformsdk.p911b.C20426a.C20428a;
import com.p280ss.android.ttplatformsdk.view.TtBaseAuthorizeActivity;
import com.p280ss.android.ugc.aweme.IAccountService.C21080d;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1058c.C23284c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.AwemeSSOPlatformUtils;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity */
public class TtAuthorizeActivity extends TtBaseAuthorizeActivity {

    /* renamed from: d */
    private static final String f110795d = "TtAuthorizeActivity";

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    public final boolean mo54992c() {
        return C42629a.m135442a(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C42961az.m136383d(this);
    }

    /* renamed from: b */
    public final boolean mo54989b() {
        try {
            return C21115b.m71197a().isLogin();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final void mo54993d() {
        C6861a.m21333b().showLoginAndRegisterView(new C21080d().mo56860a((Activity) this).mo56864a("toutiao").mo56859a());
    }

    /* renamed from: a */
    public final C20426a mo54985a() {
        String str;
        String str2;
        String str3 = "";
        CookieManager instance = CookieManager.getInstance();
        if (instance == null) {
            str = "";
        } else {
            str = instance.getCookie(C19223b.f51886a);
        }
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(";");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String[] split2 = split[i].split("=");
                if (split2.length >= 2 && split2[0].trim().equals("sessionid")) {
                    str3 = split2[1];
                    break;
                }
                i++;
            }
        }
        String str4 = "";
        String str5 = "";
        String str6 = "";
        User curUser = C21115b.m71197a().getCurUser();
        if (curUser != null) {
            str4 = String.valueOf(curUser.getUid());
            str5 = curUser.getNickname();
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if (avatarMedium == null || avatarMedium.getUrlList() == null || avatarMedium.getUrlList().size() <= 0) {
                str2 = "";
            } else {
                str2 = (String) avatarMedium.getUrlList().get(0);
            }
            str6 = str2;
        }
        return new C20428a().mo54973b(Uri.encode(str3)).mo54974c(Uri.encode(str4)).mo54975d(Uri.encode(str5)).mo54976e(Uri.encode(str6)).mo54972a(getString(R.string.dzs)).f55167a;
    }

    @C7709l
    public void onUpdateUserEvent(C23284c cVar) {
        AwemeSSOPlatformUtils.m136204a();
    }

    /* renamed from: c */
    public final void mo54991c(String str) {
        C10761a.m31399c((Context) this, (int) R.string.mn).mo25750a();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity", "onCreate", true);
        C42961az.m136382c(this);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo54987a(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            C10761a.m31403c((Context) this, str).mo25750a();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
