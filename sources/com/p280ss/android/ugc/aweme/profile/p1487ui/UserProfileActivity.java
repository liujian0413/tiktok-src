package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.p1063g.C23346d;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.SlideSwitchLayout;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1003am.C22491a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.MyProfileV2Fragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.UserProfileV2Fragment;
import com.p280ss.android.ugc.aweme.profile.presenter.C36007ag;
import com.p280ss.android.ugc.aweme.profile.presenter.C36045s;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41553g;
import com.p280ss.android.ugc.aweme.utils.C43073dv;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UserProfileActivity */
public class UserProfileActivity extends AmeSlideSSActivity implements C36045s {

    /* renamed from: b */
    private String f95285b;

    /* renamed from: c */
    private String f95286c;

    /* renamed from: d */
    private String f95287d;

    /* renamed from: e */
    private String f95288e;

    /* renamed from: f */
    private String f95289f;

    /* renamed from: g */
    private String f95290g;

    /* renamed from: h */
    private String f95291h;

    /* renamed from: i */
    private String f95292i;

    /* renamed from: j */
    private String f95293j;

    /* renamed from: k */
    private String f95294k;

    /* renamed from: l */
    private String f95295l;

    /* renamed from: m */
    private Aweme f95296m;
    protected DmtStatusView mDmtStatusView;
    LinearLayout mProfileLayout;
    SlideSwitchLayout mSlideSwitchLayout;

    /* renamed from: n */
    private String f95297n;

    /* renamed from: o */
    private String f95298o;

    /* renamed from: p */
    private String f95299p;

    /* renamed from: q */
    private int f95300q;

    /* renamed from: r */
    private C36007ag f95301r;

    /* renamed from: s */
    private String f95302s;

    /* renamed from: t */
    private List<C23254a> f95303t = new ArrayList();

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    /* renamed from: a */
    public static void m117394a(Context context, String str, String str2, String str3) {
        if (context != null && !TextUtils.isEmpty(str)) {
            Intent intent = new Intent(context, UserProfileActivity.class);
            intent.putExtra("enter_from", str3);
            intent.putExtra("uid", str);
            intent.putExtra("sec_user_id", str2);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m117395a(Context context, String str, String str2, String str3, String str4) {
        if (context != null && str != null && !str.equals("")) {
            Intent intent = new Intent(context, UserProfileActivity.class);
            intent.putExtra("enter_method", str4);
            intent.putExtra("enter_from", str3);
            intent.putExtra("uid", str);
            intent.putExtra("sec_user_id", str2);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public final void mo92365a(C23254a aVar) {
        if (!this.f95303t.contains(aVar)) {
            this.f95303t.add(aVar);
        }
    }

    /* renamed from: a */
    private void m117396a(String str) {
        if (this.f95301r == null) {
            this.f95301r = new C36007ag();
            this.f95301r.mo66537a(this);
        }
        this.f95301r.mo56976a(str);
        this.mDmtStatusView.mo25942f();
    }

    /* renamed from: a */
    public final void mo91735a(String str, String str2) {
        this.f95297n = str;
        this.f95299p = str2;
        m117401g();
        this.mDmtStatusView.mo25939d();
    }

    /* renamed from: a */
    public final void mo75662a() {
        this.mDmtStatusView.mo25939d();
        onBackPressed();
    }

    /* renamed from: a */
    private void m117397a(boolean z) {
        if (!z) {
            TimeLockRuler.disableStartActivityIfNeeded(this);
        }
    }

    public void finish() {
        super.finish();
        C22491a.m74384a(this);
    }

    /* renamed from: b */
    private void m117398b() {
        this.mProfileLayout.setLayoutParams(new LayoutParams(C23482j.m77100c(this), -1));
        this.mSlideSwitchLayout.setScrowToChildWhenRequestChildFocus(false);
        this.mSlideSwitchLayout.mo73917a("page_profile", 0);
        this.mSlideSwitchLayout.mo73918a("page_profile", false);
        this.mSlideSwitchLayout.setCanScroll(false);
        this.mDmtStatusView.setBuilder(C10803a.m31631a((Context) this));
    }

    /* renamed from: i */
    private UserProfileFragment m117403i() {
        UserProfileFragment userProfileFragment = new UserProfileFragment();
        userProfileFragment.f95340af = this.f95296m;
        if (C25352e.m83221d(this.f95296m) && TextUtils.equals("general_search", this.f95292i)) {
            userProfileFragment.mo92378c(this.f95296m);
        }
        return userProfileFragment;
    }

    public Resources getResources() {
        if (!this.mFirstResumed) {
            C43073dv.m136653b((Activity) this);
            if (C23346d.m76602a(this)) {
                return new C23346d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
            }
        }
        return super.getResources();
    }

    /* renamed from: d */
    private void m117400d() {
        String str;
        if (TextUtils.equals(this.f95292i, "open_screen_ad") && !TextUtils.isEmpty(this.f95297n)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("enter_from", "click_open_screen_ad");
                jSONObject.put("enter_method", "open_screen_ad");
            } catch (JSONException unused) {
            }
            String str2 = "enter_detail";
            if (TextUtils.equals(this.f95297n, C21115b.m71197a().getCurUserId())) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            C6907h.m21521a((Context) this, str2, str, "0", "0", jSONObject);
        }
    }

    /* renamed from: g */
    private void m117401g() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2644a("userprofilefragment");
        if (a == null) {
            if (C6399b.m19944t()) {
                a = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createUserProfileFragment();
            }
            if (a == null) {
                if (ProfileNewStyleExperiment.INSTANCE.getENABLE_NEW_STYLE()) {
                    a = new UserProfileV2Fragment();
                } else {
                    a = m117403i();
                }
            }
            a.setArguments(m117402h());
        }
        supportFragmentManager.mo2645a().mo2600b(R.id.ed5, a, "userprofilefragment").mo2606d();
    }

    /* renamed from: j */
    private void m117404j() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2644a("myprofilefragment");
        if (a == null) {
            if (C6399b.m19944t()) {
                if (ProfileNewStyleExperiment.INSTANCE.getENABLE_NEW_STYLE()) {
                    a = new MyProfileV2Fragment();
                } else {
                    a = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createUserProfileFragment();
                }
            }
            if (a == null) {
                a = new MyProfileFragment();
            }
            a.setArguments(m117402h());
        }
        supportFragmentManager.mo2645a().mo2600b(R.id.ed5, a, "myprofilefragment").mo2606d();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onResume", true);
        if (!isFinishing() && VERSION.SDK_INT >= 24 && VERSION.SDK_INT < 28) {
            C43073dv.m136651a((Activity) this);
        }
        if (isFinishing()) {
            C41553g.m132328a(this);
            C2077a.m9159a("crash_service_destory_timeout");
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onResume", false);
            return;
        }
        super.onResume();
        C43073dv.m136651a((Activity) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onResume", false);
    }

    /* renamed from: h */
    private Bundle m117402h() {
        Bundle bundle = new Bundle();
        bundle.putString("uid", this.f95297n);
        bundle.putString("sec_user_id", this.f95299p);
        bundle.putString("profile_from", this.f95285b);
        bundle.putString("video_id", this.f95286c);
        bundle.putString("profile_from", "other_user");
        bundle.putString("type", this.f95287d);
        bundle.putString("enter_method", this.f95294k);
        bundle.putString("enter_from", this.f95292i);
        bundle.putString("request_id", this.f95288e);
        bundle.putString("room_id", this.f95289f);
        bundle.putString("room_owner_id", this.f95290g);
        bundle.putString("user_type", this.f95291h);
        bundle.putBoolean("isFromFeed", false);
        bundle.putString("poi_id", this.f95293j);
        bundle.putString("extra_previous_page_position", getIntent().getStringExtra("extra_previous_page_position"));
        bundle.putString("enter_from_request_id", getIntent().getStringExtra("enter_from_request_id"));
        bundle.putString("scene_id", this.f95295l);
        bundle.putInt("need_track_compare_recommend_reason", getIntent().getIntExtra("need_track_compare_recommend_reason", 0));
        bundle.putString("previous_recommend_reason", getIntent().getStringExtra("previous_recommend_reason"));
        bundle.putString("recommend_from_type", getIntent().getStringExtra("recommend_from_type"));
        bundle.putInt("is_cold_launch", getIntent().getIntExtra("is_cold_launch", 0));
        bundle.putInt("from_recommend_card", getIntent().getIntExtra("from_recommend_card", 0));
        bundle.putInt("general_search_card_type", getIntent().getIntExtra("general_search_card_type", 0));
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0182, code lost:
        if (android.text.TextUtils.equals(r8.f95297n, com.p280ss.android.ugc.aweme.account.C21115b.m71197a().getCurUserId()) != false) goto L_0x0186;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x018c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m117399c() {
        /*
            r8 = this;
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r1 = "uid"
            java.lang.String r1 = r0.getStringExtra(r1)
            r8.f95297n = r1
            java.lang.String r1 = r8.f95297n
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = "id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r8.f95297n = r1
        L_0x001c:
            java.lang.String r1 = "sec_user_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r8.f95299p = r1
            java.lang.String r1 = r8.f95299p
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = "sec_uid"
            java.lang.String r1 = r0.getStringExtra(r1)
            r8.f95299p = r1
        L_0x0034:
            java.lang.String r1 = r8.f95299p
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.utils.dz r1 = com.p280ss.android.ugc.aweme.utils.C43077dz.m136657a()
            r1.mo104735b()
            com.ss.android.ugc.aweme.utils.dz r1 = com.p280ss.android.ugc.aweme.utils.C43077dz.m136657a()
            java.lang.String r2 = r8.f95297n
            java.lang.String r1 = r1.mo104733b(r2)
            r8.f95299p = r1
        L_0x004f:
            java.lang.String r1 = "unique_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r8.f95298o = r1
            java.lang.String r1 = "profile_from"
            java.lang.String r1 = r0.getStringExtra(r1)
            r8.f95285b = r1
            java.lang.String r1 = "video_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r8.f95286c = r1
            java.lang.String r1 = "type"
            java.lang.String r1 = r0.getStringExtra(r1)
            r8.f95287d = r1
            java.lang.String r1 = "profile_enterprise_type"
            r2 = 0
            int r1 = r0.getIntExtra(r1, r2)
            r8.f95300q = r1
            java.lang.String r1 = "enter_method"
            java.lang.String r1 = r0.getStringExtra(r1)
            r8.f95294k = r1
            java.lang.String r1 = "request_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r8.f95288e = r1
            java.lang.String r1 = "room_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r8.f95289f = r1
            java.lang.String r1 = "room_owner_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r8.f95290g = r1
            java.lang.String r1 = "user_type"
            java.lang.String r1 = r0.getStringExtra(r1)
            r8.f95291h = r1
            java.lang.String r1 = "scene_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r8.f95295l = r1
            java.lang.String r1 = "poi_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r8.f95293j = r1
            java.lang.String r1 = "enter_from"
            java.lang.String r1 = r0.getStringExtra(r1)
            r8.f95292i = r1
            java.lang.String r1 = "extra_from_event_enter_from"
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.String r3 = "extra_from_event_type"
            java.lang.String r3 = r0.getStringExtra(r3)
            java.lang.String r4 = "extra_from_pre_page"
            java.lang.String r4 = r0.getStringExtra(r4)
            java.lang.String r5 = "extra_from_pre_relation_from"
            java.lang.String r5 = r0.getStringExtra(r5)
            android.arch.lifecycle.w r6 = android.arch.lifecycle.C0069x.m159a(r8)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.StatusStoreViewModel> r7 = com.p280ss.android.ugc.aweme.shortvideo.StatusStoreViewModel.class
            android.arch.lifecycle.u r6 = r6.mo147a(r7)
            com.ss.android.ugc.aweme.shortvideo.StatusStoreViewModel r6 = (com.p280ss.android.ugc.aweme.shortvideo.StatusStoreViewModel) r6
            java.lang.String r7 = "extra_from_event_type"
            r6.mo96201b(r7, r3)
            java.lang.String r3 = "extra_from_pre_page"
            r6.mo96201b(r3, r4)
            java.lang.String r3 = "extra_from_pre_relation_from"
            r6.mo96201b(r3, r5)
            java.lang.String r3 = "extra_from_event_enter_from"
            r6.mo96201b(r3, r1)
            java.lang.String r1 = "face_to_face"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x00fd
            java.lang.String r1 = "extra_previous_page_position"
            r0.putExtra(r1, r4)
        L_0x00fd:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r3 = com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r1 = r1.getService(r3)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r1 = (com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService) r1
            java.lang.String r3 = "source_aid"
            java.lang.String r3 = r0.getStringExtra(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.getRawAdAwemeById(r3)
            r8.f95296m = r1
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r3 = "from_micro_app"
            java.lang.String r1 = r1.getStringExtra(r3)
            r8.f95302s = r1
            java.lang.String r1 = r8.f95302s
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x013b
            android.net.Uri r1 = r0.getData()
            if (r1 == 0) goto L_0x013b
            android.net.Uri r0 = r0.getData()
            java.lang.String r1 = "from"
            java.lang.String r0 = r0.getQueryParameter(r1)
            r8.f95302s = r0
        L_0x013b:
            java.lang.String r0 = r8.f95297n
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0174
            java.lang.String r0 = r8.f95299p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0174
            java.lang.String r0 = r8.f95298o
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0155
            goto L_0x0186
        L_0x0155:
            java.lang.String r0 = r8.f95298o
            com.ss.android.ugc.aweme.IAccountUserService r3 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getCurUser()
            java.lang.String r3 = r3.getUniqueId()
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L_0x0185
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            java.lang.String r0 = r0.getCurUserId()
            r8.f95297n = r0
            goto L_0x0186
        L_0x0174:
            java.lang.String r0 = r8.f95297n
            com.ss.android.ugc.aweme.IAccountUserService r3 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            java.lang.String r3 = r3.getCurUserId()
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L_0x0185
            goto L_0x0186
        L_0x0185:
            r1 = 0
        L_0x0186:
            if (r1 == 0) goto L_0x018c
            r8.m117404j()
            goto L_0x01a6
        L_0x018c:
            java.lang.String r0 = r8.f95297n
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01a3
            java.lang.String r0 = r8.f95299p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x019d
            goto L_0x01a3
        L_0x019d:
            java.lang.String r0 = r8.f95298o
            r8.m117396a(r0)
            goto L_0x01a6
        L_0x01a3:
            r8.m117401g()
        L_0x01a6:
            r8.m117400d()
            r8.m117397a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity.m117399c():void");
    }

    /* renamed from: a */
    private static int m117385a(User user) {
        if (user == null) {
            return 0;
        }
        return user.getCommerceUserLevel();
    }

    /* renamed from: b */
    public final void mo92366b(C23254a aVar) {
        if (this.f95303t != null) {
            this.f95303t.remove(aVar);
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(48);
        requestDisableOptimizeViewHierarchy();
        setContentView((int) R.layout.f8);
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).setStatusBar(this);
        m117398b();
        m117399c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m117386a(Context context, Bundle bundle) {
        if (context != null) {
            Intent intent = new Intent(context, UserProfileActivity.class);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m117387a(Context context, User user) {
        if (context != null && user != null) {
            m117393a(context, user.getUid(), user.getSecUid(), m117385a(user), "");
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isViewValid()) {
            return false;
        }
        for (C23254a a : this.f95303t) {
            if (a.mo60522a(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: a */
    public static void m117388a(Context context, User user, String str) {
        m117389a(context, user, str, "");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1 || i2 != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (this.mSlideSwitchLayout != null) {
            this.mSlideSwitchLayout.setCurrentItem("page_profile");
        }
    }

    /* renamed from: a */
    public static void m117392a(Context context, String str, String str2) {
        if (context != null && str != null && !str.equals("")) {
            Intent intent = new Intent(context, UserProfileActivity.class);
            intent.putExtra("uid", str);
            intent.putExtra("sec_user_id", str2);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    private static void m117389a(Context context, User user, String str, String str2) {
        m117390a(context, user, str, str2, "");
    }

    /* renamed from: a */
    public static void m117390a(Context context, User user, String str, String str2, String str3) {
        m117391a(context, user, str, str2, str3, "");
    }

    /* renamed from: a */
    private static void m117393a(Context context, String str, String str2, int i, String str3) {
        if (context != null && str != null && !str.equals("")) {
            Intent intent = new Intent(context, UserProfileActivity.class);
            intent.putExtra("uid", str);
            intent.putExtra("sec_user_id", str2);
            intent.putExtra("profile_enterprise_type", i);
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra("enter_from_request_id", str3);
            }
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    private static void m117391a(Context context, User user, String str, String str2, String str3, String str4) {
        if (context != null && user != null && !TextUtils.isEmpty(user.getUid())) {
            String uid = user.getUid();
            String secUid = user.getSecUid();
            Intent intent = new Intent(context, UserProfileActivity.class);
            intent.putExtra("enter_from", str);
            intent.putExtra("uid", uid);
            intent.putExtra("sec_user_id", secUid);
            intent.putExtra("profile_enterprise_type", m117385a(user));
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("enter_from_request_id", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra("extra_previous_page_position", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                intent.putExtra("enter_method", str4);
            }
            context.startActivity(intent);
        }
    }
}
