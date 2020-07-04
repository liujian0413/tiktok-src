package com.p280ss.android.ugc.aweme.promote;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.retrofit2.p264b.C6457h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.setting.PopupSettingManager;
import com.p280ss.android.ugc.aweme.setting.model.PopupSetting;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.promote.PromoteGdprManager */
public class PromoteGdprManager implements C6310a {

    /* renamed from: a */
    public static PromoteNotificationDialog f96726a;

    /* renamed from: b */
    static PromoteGdprRequestApi f96727b = ((PromoteGdprRequestApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(f96728c).create(PromoteGdprRequestApi.class));

    /* renamed from: c */
    private static final String f96728c = Api.f60502b;

    /* renamed from: d */
    private static SharedPreferences f96729d;

    /* renamed from: e */
    private static PromoteGdprManager f96730e;

    /* renamed from: f */
    private C6309f f96731f = new C6309f(this);

    /* renamed from: g */
    private PopupSetting f96732g;

    /* renamed from: h */
    private Activity f96733h;

    /* renamed from: com.ss.android.ugc.aweme.promote.PromoteGdprManager$PromoteGdprRequestApi */
    interface PromoteGdprRequestApi {
        @C6457h(mo15740a = "/aweme/v1/user/agreement/status/")
        C18253l<C36923b> requestGdprState();
    }

    /* renamed from: b */
    private void m118783b() {
        m118786e();
    }

    /* renamed from: e */
    private void m118786e() {
        m118781a(this.f96731f);
    }

    private PromoteGdprManager() {
    }

    /* renamed from: a */
    public static PromoteGdprManager m118779a() {
        if (f96730e == null) {
            synchronized (PromoteGdprManager.class) {
                if (f96730e == null) {
                    f96730e = new PromoteGdprManager();
                }
            }
        }
        return f96730e;
    }

    /* renamed from: c */
    private static SharedPreferences m118784c() {
        if (f96729d == null) {
            f96729d = C7285c.m22838a(AwemeApplication.m21341a(), "aweme-gdpr-dialog", 0);
        }
        return f96729d;
    }

    /* renamed from: f */
    private void m118787f() {
        if (m118785d() && C6399b.m19946v()) {
            PromoteNotificationDialog promoteNotificationDialog = new PromoteNotificationDialog(this.f96733h, "", this.f96732g);
            f96726a = promoteNotificationDialog;
            promoteNotificationDialog.setOnDismissListener(new OnDismissListener() {
                public final void onDismiss(DialogInterface dialogInterface) {
                    PromoteGdprManager.f96726a = null;
                }
            });
            f96726a.show();
        }
    }

    /* renamed from: d */
    private boolean m118785d() {
        if (this.f96732g == null) {
            return false;
        }
        this.f96732g = null;
        String curUserId = C21115b.m71197a().getCurUserId();
        SharedPreferences c = m118784c();
        StringBuilder sb = new StringBuilder("last_pop_time_");
        sb.append(curUserId);
        if (DateUtils.isToday(c.getLong(sb.toString(), 0))) {
            return false;
        }
        try {
            Editor edit = m118784c().edit();
            StringBuilder sb2 = new StringBuilder("last_pop_time_");
            sb2.append(curUserId);
            edit.putLong(sb2.toString(), System.currentTimeMillis());
            edit.apply();
        } catch (Exception unused) {
        }
        return true;
    }

    /* renamed from: a */
    private void m118781a(C6309f fVar) {
        String curUserId = C21115b.m71197a().getCurUserId();
        SharedPreferences c = m118784c();
        StringBuilder sb = new StringBuilder("last_pop_time_");
        sb.append(curUserId);
        if (DateUtils.isToday(c.getLong(sb.toString(), 0))) {
            m118787f();
        } else {
            PopupSettingManager.m120234a().mo94810a(fVar, 2);
        }
    }

    public void handleMsg(Message message) {
        Object obj = message.obj;
        int i = message.what;
        Context a = C6399b.m19921a();
        if (obj instanceof ApiServerException) {
            C10761a.m31403c(a, ((ApiServerException) obj).getErrorMsg()).mo25750a();
        } else if (obj instanceof Exception) {
            C10761a.m31403c(a, a.getResources().getString(R.string.cjt)).mo25750a();
        } else if (!(obj instanceof C36923b) || i != 1) {
            if (i == 2) {
                this.f96732g = PopupSettingManager.m120234a().mo94809a("gdpr_popup");
                m118787f();
            }
        } else {
            C36923b bVar = (C36923b) obj;
            if (bVar != null) {
                m118782a(bVar.mo93287a());
                m118787f();
            }
        }
    }

    /* renamed from: a */
    private void m118782a(boolean z) {
        String curUserId = C21115b.m71197a().getCurUserId();
        Editor edit = m118784c().edit();
        StringBuilder sb = new StringBuilder("joined_");
        sb.append(curUserId);
        edit.putBoolean(sb.toString(), z);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo93266a(Activity activity) {
        if (activity != null && !activity.isFinishing() && C6399b.m19946v() && C21115b.m71197a().isLogin()) {
            if (f96726a != null) {
                f96726a.dismiss();
                f96726a = null;
            }
            this.f96733h = activity;
            m118783b();
        }
    }

    /* renamed from: a */
    public static void m118780a(Context context, String str, String str2) {
        if (context != null) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str = "https://m.tiktok.com/aweme/inapp/v2/ad_agreement?hide_nav_bar=1";
            }
            intent.setData(Uri.parse(str));
            intent.putExtra("hide_nav_bar", true);
            String str3 = "title";
            if (TextUtils.isEmpty(str2)) {
                str2 = context.getResources().getString(R.string.d8n);
            }
            intent.putExtra(str3, str2);
            intent.putExtra("aweme_model", bundle);
            context.startActivity(intent);
        }
    }
}
