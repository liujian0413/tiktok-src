package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24029a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.VideoControl;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28458l;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28460m;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28479b;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.metrics.C33228ab;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVService.IPermissionModule;
import com.p280ss.android.ugc.aweme.services.IAVService.IPermissionSettingItem;
import com.p280ss.android.ugc.aweme.setting.C37649i;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37708a;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37709b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37710c;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37716e;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.shortvideo.C39319cy;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39325c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43167r;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.PrivacySettingActivity */
public class PrivacySettingActivity extends AmeActivity implements C37708a, C37709b {

    /* renamed from: h */
    private static final int f98504h = 2130772068;

    /* renamed from: i */
    private static final int f98505i = 2130772079;

    /* renamed from: a */
    public Aweme f98506a;

    /* renamed from: b */
    private CommonItemView f98507b;

    /* renamed from: c */
    private CommonItemView f98508c;

    /* renamed from: d */
    private CommonItemView f98509d;

    /* renamed from: e */
    private View f98510e;

    /* renamed from: f */
    private DmtTextView f98511f;

    /* renamed from: g */
    private IPermissionSettingItem f98512g;

    /* renamed from: j */
    private IPermissionModule f98513j;

    /* renamed from: k */
    private C37710c f98514k;

    /* renamed from: l */
    private boolean f98515l = true;

    /* renamed from: m */
    private C37723b f98516m;

    /* renamed from: n */
    private C37716e f98517n = new C37716e();

    /* renamed from: o */
    private boolean f98518o = true;

    /* renamed from: p */
    private ImmersionBar f98519p;

    public final void bI_() {
    }

    /* renamed from: c_ */
    public final void mo83182c_(Exception exc) {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacySettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacySettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacySettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: d */
    private void m120914d() {
        this.f98506a = C28479b.m93592a();
        C28479b.m93597b(this.f98506a);
    }

    /* renamed from: e */
    private void m120915e() {
        super.overridePendingTransition(f98504h, 17432577);
    }

    /* renamed from: j */
    private void m120920j() {
        m120921k();
        m120922l();
        m120926p();
    }

    /* renamed from: t */
    private boolean m120930t() {
        if (this.f98516m == null || this.f98516m.f98280p != 0) {
            return false;
        }
        return true;
    }

    public final void bJ_() {
        this.f98515l = !this.f98515l;
        this.f98507b.setChecked(!this.f98515l);
    }

    public void finish() {
        super.finish();
        super.overridePendingTransition(17432576, f98505i);
    }

    /* renamed from: h */
    private void m120918h() {
        C1592h.m7853a((Callable<TResult>) new C37936z<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C37874aa<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: l */
    private void m120922l() {
        this.f98507b = (CommonItemView) findViewById(R.id.zx);
        m120924n();
        this.f98508c = (CommonItemView) findViewById(R.id.abr);
        m120923m();
        m120925o();
    }

    /* renamed from: r */
    private void m120928r() {
        if (this.f98509d != null && !m120930t()) {
            this.f98509d.setChecked(true);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f98514k.mo59134U_();
        if (this.f98519p != null) {
            this.f98519p.destroy();
        }
    }

    /* renamed from: f */
    private void m120916f() {
        this.f98510e.setOnClickListener(new C37932w(this));
        this.f98513j = ((IAVService) ServiceManager.get().getService(IAVService.class)).createPermissionModule(this, this.f98512g, 0);
        this.f98513j.setupByActivity(new C39319cy() {
        });
        this.f98507b.setOnClickListener(new C37934x(this));
        this.f98508c.setOnClickListener(new C37935y(this));
    }

    /* renamed from: g */
    private void m120917g() {
        if (!C37876ac.m121125a(this)) {
            C10761a.m31409e((Context) this, (int) R.string.cjr).mo25750a();
            return;
        }
        if (this.f98518o) {
            this.f98518o = false;
        } else {
            this.f98518o = true;
        }
        this.f98508c.setChecked(true ^ this.f98518o);
        m120918h();
    }

    /* renamed from: k */
    private void m120921k() {
        this.f98510e = findViewById(R.id.jn);
        this.f98511f = (DmtTextView) findViewById(R.id.cju);
        this.f98511f.setTextSize(0, C9738o.m28708b((Context) this, 17.0f));
    }

    /* renamed from: m */
    private void m120923m() {
        if (this.f98506a != null) {
            boolean b = C43167r.m136905b(this.f98506a);
            if (!C43167r.m136904a(this.f98506a) && !b) {
                this.f98518o = false;
            } else if (this.f98506a.getDuetSetting() == 0 || this.f98506a.getReactSetting() == 0) {
                this.f98518o = true;
            } else {
                this.f98518o = false;
            }
            this.f98508c.setChecked(!this.f98518o);
        }
    }

    public void setStatusBarColor() {
        if (C6399b.m19946v()) {
            this.f98519p = ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03);
            this.f98519p.init();
            return;
        }
        super.setStatusBarColor();
    }

    /* renamed from: n */
    private void m120924n() {
        if (this.f98506a == null || this.f98506a.getAuthor() == null || (this.f98506a.getAuthor().getCommentSetting() != C37649i.f98121d && this.f98506a.getCommentSetting() == C37649i.f98118a)) {
            this.f98515l = true;
        } else {
            this.f98515l = false;
        }
        this.f98507b.setChecked(true ^ this.f98515l);
        this.f98517n = new C37716e();
        this.f98517n.mo66537a(this);
        this.f98517n.mo56976a(new Object[0]);
    }

    /* renamed from: o */
    private void m120925o() {
        if (C6399b.m19944t() && C30199h.m98861a().getPostDownloadSetting().booleanValue() && C7213d.m22500a().mo18798bj() == 2) {
            this.f98509d = (CommonItemView) findViewById(R.id.aat);
            this.f98509d.setChecked(m120911a(this.f98506a));
            this.f98509d.setOnClickListener(new C37875ab(this));
            this.f98509d.setVisibility(0);
        }
    }

    /* renamed from: q */
    private void m120927q() {
        C28460m mVar = new C28460m(this);
        mVar.mo66536a(new C28458l());
        mVar.mo72198a(this.f98506a, 0);
        mVar.mo56976a(this.f98506a.getAid(), Integer.valueOf(1));
        C6907h.onEvent(new MobClick().setEventName("public_permission").setLabelName("confirm").setValue(this.f98506a.getAid()));
    }

    /* renamed from: i */
    private void m120919i() {
        String str;
        int i;
        String str2;
        String str3;
        if (C25352e.m83220c(this.f98506a)) {
            C10761a.m31399c((Context) this, (int) R.string.e4).mo25750a();
        }
        if (!C37876ac.m121125a(this)) {
            C10761a.m31409e((Context) this, (int) R.string.cjr).mo25750a();
            return;
        }
        if (this.f98515l) {
            C37710c cVar = this.f98514k;
            Object[] objArr = new Object[3];
            objArr[0] = "item_comment";
            objArr[1] = Integer.valueOf(C37649i.f98121d);
            if (this.f98506a != null) {
                str3 = this.f98506a.getAid();
            } else {
                str3 = "";
            }
            objArr[2] = str3;
            cVar.mo56976a(objArr);
            this.f98515l = false;
        } else {
            C37710c cVar2 = this.f98514k;
            Object[] objArr2 = new Object[3];
            objArr2[0] = "item_comment";
            objArr2[1] = Integer.valueOf(C37649i.f98118a);
            if (this.f98506a != null) {
                str2 = this.f98506a.getAid();
            } else {
                str2 = "";
            }
            objArr2[2] = str2;
            cVar2.mo56976a(objArr2);
            this.f98515l = true;
        }
        this.f98507b.setChecked(!this.f98515l);
        if (this.f98506a != null) {
            IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
            Aweme aweme = this.f98506a;
            if (this.f98515l) {
                i = C37649i.f98118a;
            } else {
                i = C37649i.f98121d;
            }
            iAwemeService.updateCommentSetting(aweme, i);
        }
        if (this.f98506a != null) {
            str = this.f98506a.getAid();
        } else {
            str = "";
        }
        C24029a aVar = new C24029a(8, str);
        aVar.f63542d = this.f98506a;
        C42961az.m136380a(aVar);
    }

    /* renamed from: p */
    private void m120926p() {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.c30);
        this.f98512g = ((IAVService) ServiceManager.get().getService(IAVService.class)).createPermissionSettingItem(this);
        this.f98512g.asView().setId(R.id.c2z);
        this.f98512g.asView().setLayoutParams(new LayoutParams(-1, -1));
        frameLayout.addView(this.f98512g.asView());
        this.f98512g.getPrivateIcon().setVisibility(8);
        DmtTextView privateHint = this.f98512g.getPrivateHint();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        privateHint.setLayoutParams(layoutParams);
        if (C43168s.m136910b(this.f98506a)) {
            this.f98512g.setPermission(0);
        } else if (C43168s.m136911c(this.f98506a)) {
            this.f98512g.setPermission(2);
        } else {
            if (C43168s.m136912d(this.f98506a)) {
                this.f98512g.setPermission(1);
            }
        }
    }

    /* renamed from: s */
    private void m120929s() {
        int i;
        if (!C37876ac.m121125a(this)) {
            C10761a.m31409e((Context) this, (int) R.string.cjr).mo25750a();
        } else if (this.f98509d.mo25778c() && !m120930t()) {
            C10761a.m31399c((Context) this, (int) R.string.avs).mo25750a();
        } else if (this.f98506a != null && this.f98514k != null) {
            this.f98509d.setChecked(!this.f98509d.mo25778c());
            C37710c cVar = this.f98514k;
            int i2 = 3;
            Object[] objArr = new Object[3];
            objArr[0] = "item_download";
            if (this.f98509d.mo25778c()) {
                i = 3;
            } else {
                i = 0;
            }
            objArr[1] = Integer.valueOf(i);
            objArr[2] = this.f98506a.getAid();
            cVar.mo56976a(objArr);
            if (this.f98506a != null) {
                IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
                Aweme aweme = this.f98506a;
                if (!this.f98509d.mo25778c()) {
                    i2 = 0;
                }
                iAwemeService.updatePreventDownloadType(aweme, i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Void mo95223c() throws Exception {
        int i;
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        String aid = this.f98506a.getAid();
        int i2 = 0;
        if (this.f98506a.getDuetSetting() == 0 || this.f98506a.getReactSetting() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        String valueOf = String.valueOf(i);
        if (this.f98506a.getDuetSetting() == 0 || this.f98506a.getReactSetting() == 0) {
            i2 = 1;
        }
        return iAVService.requestReactDuetSettings(aid, valueOf, String.valueOf(i2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95221a(View view) {
        m120929s();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo95222b(View view) {
        m120917g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo95225d(View view) {
        finish();
    }

    /* renamed from: a */
    private static boolean m120911a(Aweme aweme) {
        if (aweme != null) {
            VideoControl videoControl = aweme.getVideoControl();
            if (videoControl == null || videoControl.preventDownloadType == 3) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo83181a(C37723b bVar) {
        this.f98516m = bVar;
        if (this.f98507b != null) {
            if (this.f98516m != null && this.f98516m.f98277m == C37649i.f98121d) {
                this.f98507b.setChecked(true);
                this.f98507b.setAlpha(0.66f);
            }
            m120928r();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo95224c(View view) {
        if (this.f98516m == null || this.f98516m.f98277m != C37649i.f98121d) {
            m120919i();
        } else {
            C10761a.m31410e(this.f98507b.getContext(), this.f98507b.getContext().getString(R.string.f124285if)).mo25750a();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacySettingActivity", "onCreate", true);
        super.onCreate(bundle);
        m120915e();
        setContentView((int) R.layout.e4);
        m120914d();
        m120920j();
        m120916f();
        if (bundle != null) {
            this.f98513j.restoreSavedInstanceState(bundle);
        }
        this.f98514k = new C37710c();
        this.f98514k.mo66537a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacySettingActivity", "onCreate", false);
    }

    /* renamed from: a */
    private void m120909a(int i) {
        String str;
        if (this.f98506a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("is_photo", C28482e.m93611d(this.f98506a) ? 1 : 0);
            } catch (JSONException unused) {
            }
            MobClick labelName = MobClick.obtain().setEventName("scope_click").setLabelName("share_option");
            if (this.f98506a == null) {
                str = "0";
            } else {
                str = this.f98506a.getAid();
            }
            C6907h.onEvent(labelName.setValue(str).setJsonObject(jSONObject));
            m120912b(i);
        }
    }

    /* renamed from: b */
    private void m120912b(final int i) {
        C378032 r0 = new C28460m(this) {
            /* renamed from: a */
            public final void mo57296a(Exception exc) {
                super.mo57296a(exc);
                Throwable a = C22814a.m75241a((Throwable) exc);
                if ((a instanceof ApiServerException) && ((ApiServerException) a).getErrorCode() == 2752) {
                    C22814a.m75243a(PrivacySettingActivity.this, (Exception) a, R.string.c7z, R.string.c80);
                    if (i == 2) {
                        C33228ab.m107200a("promote_layer_show").mo85057b(C38347c.f99553h, "friend_only_fail").mo85057b("group_id", PrivacySettingActivity.this.f98506a.getAid()).mo85252e();
                    } else if (i == 1) {
                        C33228ab.m107200a("promote_layer_show").mo85057b(C38347c.f99553h, "private_fail").mo85057b("group_id", PrivacySettingActivity.this.f98506a.getAid()).mo85252e();
                    }
                }
            }
        };
        this.f98506a.getStatus().setPrivateStatus(i);
        r0.mo66536a(new C28458l());
        if (i == 2) {
            m120913c(2);
            r0.mo72198a(this.f98506a, 2);
            r0.mo56976a(this.f98506a.getAid(), Integer.valueOf(3));
        } else if (i == 1) {
            m120913c(1);
            r0.mo72198a(this.f98506a, 1);
            r0.mo56976a(this.f98506a.getAid(), Integer.valueOf(2));
            C6907h.onEvent(new MobClick().setEventName("private_permission").setLabelName("confirm").setValue(this.f98506a.getAid()));
        } else {
            if (i == 0) {
                m120913c(0);
                m120927q();
            }
        }
    }

    /* renamed from: c */
    private void m120913c(int i) {
        String str;
        String str2 = "";
        switch (i) {
            case 0:
                str2 = "public";
                break;
            case 1:
                str2 = "private";
                break;
            case 2:
                str2 = "friend";
                break;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("to_status", str2);
            }
            if (this.f98506a.getAwemeType() == 2) {
                jSONObject.put("is_photo", 1);
            }
        } catch (JSONException unused) {
        }
        MobClick labelName = MobClick.obtain().setEventName("scope_control").setLabelName("share_option");
        if (this.f98506a == null) {
            str = "0";
        } else {
            str = this.f98506a.getAid();
        }
        C6907h.onEvent(labelName.setValue(str).setJsonObject(jSONObject));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo95220a(C1592h hVar) throws Exception {
        String str;
        int i = 1;
        if (hVar.mo6889d()) {
            C10761a.m31409e((Context) this, (int) R.string.cjr).mo25750a();
            this.f98518o = !this.f98518o;
            this.f98508c.setChecked(true ^ this.f98518o);
        } else {
            if (!(this.f98506a.getDuetSetting() == 0 || this.f98506a.getReactSetting() == 0)) {
                i = 0;
            }
            this.f98506a.setDuetSetting(i);
            this.f98506a.setReactSetting(i);
            C42961az.m136380a(new C39325c(this.f98506a));
            String str2 = "click_react_duet_control";
            C22984d a = C22984d.m75611a().mo59973a("group_id", this.f98506a.getAid()).mo59973a("enter_from", "personal_homepage");
            String str3 = "to_status";
            if (this.f98506a.getDuetSetting() == 0 || this.f98506a.getReactSetting() == 0) {
                str = "on";
            } else {
                str = "off";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
        }
        return null;
    }

    /* renamed from: a */
    public static void m120910a(Context context, Aweme aweme) {
        Intent intent = new Intent(context, PrivacySettingActivity.class);
        C28479b.m93593a(aweme);
        context.startActivity(intent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 2) {
            if (!C37876ac.m121125a(this)) {
                C10761a.m31409e((Context) this, (int) R.string.cjr).mo25750a();
            } else if (this.f98506a != null) {
                int intExtra = intent.getIntExtra("extra.PERMISSION", 0);
                int privateStatus = this.f98506a.getStatus().getPrivateStatus();
                this.f98513j.receivePermissionResult(intent);
                if (intExtra != privateStatus) {
                    m120909a(intExtra);
                }
            }
        }
    }
}
