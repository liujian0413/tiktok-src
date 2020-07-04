package com.p280ss.android.ugc.aweme.setting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.i18n.language.C30476b;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.DmtStatusViewDialog;
import com.p280ss.android.ugc.aweme.setting.p1513c.C37587a;
import com.p280ss.android.ugc.aweme.setting.p337ui.SelectResidenceActivity;
import com.p280ss.android.ugc.aweme.setting.verification.C37940b;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity */
public abstract class I18nSettingManageMyAccountActivity extends AmeBaseActivity implements C6310a {

    /* renamed from: d */
    private static final boolean f97888d = C7163a.m22363a();

    /* renamed from: a */
    protected String f97889a;

    /* renamed from: b */
    protected DmtStatusViewDialog f97890b;

    /* renamed from: c */
    protected User f97891c;

    /* renamed from: e */
    private int f97892e = -1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo94801a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo94803a(User user) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo94807j() {
        C37940b.m121200a(this);
    }

    public void onDestroy() {
        super.onDestroy();
        C42961az.m136383d(this);
    }

    /* renamed from: l */
    private void m120223l() {
        if (this.f97890b != null) {
            C42951au.m136343b(this.f97890b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo59893d() {
        this.f97891c = C21115b.m71197a().getCurUser();
    }

    /* renamed from: k */
    private void m120222k() {
        if (this.f97890b == null) {
            this.f97890b = new DmtStatusViewDialog(this);
        }
        C42951au.m136342a(this.f97890b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo58711c() {
        Intent intent = new Intent(this, SelectResidenceActivity.class);
        intent.putExtra("CUTTENT_SELECT_REGION", m120221a(this.f97889a));
        startActivityForResult(intent, 3000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo94806i() {
        if (!C37664o.m120486a(this)) {
            C10761a.m31399c((Context) this, (int) R.string.cjs).mo25750a();
            return;
        }
        C19290j jVar = new C19290j(C7213d.m22500a().mo18749aL());
        jVar.mo51188a("lang", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage());
        jVar.mo51188a("locale", C30476b.m99553b());
        jVar.mo51186a("aid", 1233);
        Intent intent = new Intent(this, CrossPlatformActivity.class);
        intent.setData(Uri.parse(jVar.mo51184a()));
        intent.putExtra("hide_nav_bar", true);
        startActivity(intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f97889a = (String) SharePrefCache.inst().getUserResidence().mo59877d();
    }

    /* renamed from: a */
    protected static int m120221a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        for (int i = 0; i < C37587a.m120382a().size(); i++) {
            if (str.equals(((C37587a) C37587a.m120382a().get(i)).f98021c)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Boolean mo94805c(User user) throws Exception {
        if (TextUtils.isEmpty(user.getEmail()) || !user.isEmailVerified()) {
            return Boolean.valueOf(false);
        }
        C21115b.m71197a().updateCurUser(user);
        mo59893d();
        return Boolean.valueOf(true);
    }

    public void handleMsg(Message message) {
        if (message.what != 112 || !(message.obj instanceof User)) {
            m120223l();
            return;
        }
        User user = (User) message.obj;
        C1592h.m7853a((Callable<TResult>) new C37658m<TResult>(this, user)).mo6876a((C1591g<TResult, TContinuationResult>) new C37663n<TResult,TContinuationResult>(this, user), C1592h.f5958b);
    }

    @C7709l
    public void onEmailEvent(C27994k kVar) {
        if (kVar == null || !TextUtils.equals("link_email_event", kVar.f73729a) || kVar.f73730b == null) {
            C10761a.m31403c((Context) this, getString(R.string.c43)).mo25750a();
            return;
        }
        try {
            this.f97892e = kVar.f73730b.getInt("action_type");
        } catch (JSONException unused) {
            this.f97892e = -1;
        }
        if (!Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)}).contains(Integer.valueOf(this.f97892e))) {
            C10761a.m31403c((Context) this, getString(R.string.c43)).mo25750a();
            return;
        }
        m120222k();
        C21115b.m71197a().queryUser(new C6309f(Looper.getMainLooper(), this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo94804b(User user) {
        String str;
        String str2;
        String str3;
        String str4;
        C22984d dVar;
        String str5;
        if (C30199h.m98861a().getEnableEmailVerification().intValue() == 1) {
            String email = user.getEmail();
            boolean z = !TextUtils.isEmpty(email);
            if (C6399b.m19946v()) {
                str = "https://m.tiktok.com/passport/email/email_bind_index/";
            } else {
                str = "https://www.tiktok.com/passport/email/email_bind_index/";
            }
            C19290j jVar = new C19290j(str);
            jVar.mo51188a("lang", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage());
            jVar.mo51186a("aid", 1233);
            jVar.mo51188a("locale", C30476b.m99553b());
            if (!z || !user.isEmailVerified()) {
                if (z) {
                    jVar.mo51188a("email", email);
                    StringBuilder sb = new StringBuilder();
                    sb.append(jVar.mo51184a());
                    sb.append("#verify-email");
                    str5 = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(jVar.mo51184a());
                    sb2.append("#bind-email");
                    str5 = sb2.toString();
                }
                Intent intent = new Intent(this, CrossPlatformActivity.class);
                intent.setData(Uri.parse(str5));
                intent.putExtra("hide_nav_bar", true);
                startActivity(intent);
                str2 = "enter_email_setting";
                dVar = new C22984d();
                str4 = "status";
                if (z) {
                    str3 = "not_verified";
                } else {
                    str3 = "empty";
                }
            } else {
                new C10741a(this).mo25649a((int) R.string.afs).mo25660b(C1642a.m8035a(Locale.US, getString(R.string.afr), new Object[]{email})).mo25650a((int) R.string.cll, (OnClickListener) new C37657l(this, jVar)).mo25658b((int) R.string.w_, (OnClickListener) null).mo25656a().mo25638b();
                str2 = "enter_email_setting";
                dVar = new C22984d();
                str4 = "status";
                str3 = "verified";
            }
            C6907h.m21524a(str2, (Map) dVar.mo59973a(str4, str3).f60753a);
            C42961az.m136382c(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo94800a(User user, C1592h hVar) throws Exception {
        m120223l();
        if (!C43173w.m136926a(hVar) || !((Boolean) hVar.mo6890e()).booleanValue()) {
            if (f97888d && hVar != null) {
                hVar.mo6891f();
            }
            C10761a.m31399c((Context) this, (int) R.string.c43).mo25750a();
        } else {
            boolean z = true;
            switch (this.f97892e) {
                case 1:
                    C10761a.m31409e((Context) this, (int) R.string.azs).mo25750a();
                    C6907h.m21524a("email_verify_success", (Map) new HashMap());
                    break;
                case 2:
                    C10761a.m31409e((Context) this, (int) R.string.azp).mo25750a();
                    C6907h.m21524a("email_bundling_success", (Map) new C22984d().mo59970a("type", 1).f60753a);
                    break;
                case 3:
                    C10761a.m31409e((Context) this, (int) R.string.azr).mo25750a();
                    C6907h.m21524a("email_bundling_success", (Map) new C22984d().mo59970a("type", 2).f60753a);
                    break;
                default:
                    z = false;
                    C10761a.m31403c((Context) this, getString(R.string.c43)).mo25750a();
                    break;
            }
            if (z) {
                mo94803a(user);
            }
        }
        this.f97892e = -1;
        return null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 3000 && i2 == -1 && intent != null) {
            int i3 = intent.getExtras().getInt("SELECT_REGION_INDEX", -1);
            if (!C37587a.m120383a(i3)) {
                mo94801a(i3);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo94802a(C19290j jVar, DialogInterface dialogInterface, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.mo51184a());
        sb.append("#change-email");
        String sb2 = sb.toString();
        Intent intent = new Intent(this, CrossPlatformActivity.class);
        intent.setData(Uri.parse(sb2));
        intent.putExtra("hide_nav_bar", true);
        startActivity(intent);
    }
}
