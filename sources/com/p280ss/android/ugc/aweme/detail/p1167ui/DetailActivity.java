package com.p280ss.android.ugc.aweme.detail.p1167ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.app.C0598c;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23259f.C23261b;
import com.p280ss.android.ugc.aweme.base.p1063g.C23346d;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25292bt;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.detail.C26062g;
import com.p280ss.android.ugc.aweme.detail.p1163g.C26063a;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.helper.C28428o;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29004c;
import com.p280ss.android.ugc.aweme.feed.param.C28652a;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.main.C33061p;
import com.p280ss.android.ugc.aweme.main.base.C32895a.C32896a;
import com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p280ss.android.ugc.aweme.p1003am.C22491a;
import com.p280ss.android.ugc.aweme.p1052b.C23149d;
import com.p280ss.android.ugc.aweme.p1052b.C23154h;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41553g;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43073dv;
import com.p280ss.android.ugc.aweme.utils.C43103en;
import com.p280ss.android.ugc.aweme.utils.p1695d.C43045c;
import com.p280ss.android.ugc.aweme.video.C43310q;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.playerkit.videoview.C44933a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.DetailActivity */
public class DetailActivity extends AmeSlideSSActivity implements C23149d, C26214y, C32896a {

    /* renamed from: d */
    public static boolean f69011d = true;

    /* renamed from: b */
    protected DetailFragment f69012b;

    /* renamed from: c */
    protected List<C23254a> f69013c;

    /* renamed from: e */
    public Aweme f69014e;

    /* renamed from: f */
    FrameLayout f69015f;

    /* renamed from: g */
    FrameLayout f69016g;

    /* renamed from: h */
    protected int f69017h;

    /* renamed from: i */
    private boolean f69018i;

    /* renamed from: j */
    private String f69019j = "";

    /* renamed from: k */
    private int f69020k = -1;

    /* renamed from: l */
    private String f69021l;

    /* renamed from: m */
    private C23154h f69022m;

    /* renamed from: n */
    private boolean f69023n = true;

    /* renamed from: f */
    public final int mo60513f() {
        return 0;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    @C7709l
    public void onVideoEvent(C28318an anVar) {
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo67701a(Bundle bundle) {
        this.f69017h = getIntent().getIntExtra("page_type", -1);
        this.f69021l = getIntent().getStringExtra("from_micro_app");
        if (TextUtils.isEmpty(this.f69021l) && getIntent().getData() != null) {
            this.f69021l = getIntent().getData().getQueryParameter("from");
        }
        FeedParam a = C28652a.m94276a(this);
        if (!TextUtils.isEmpty(a.getAid()) || !TextUtils.isEmpty(a.getIds()) || !TextUtils.isEmpty(a.getPushParams()) || a.isHotSpot() || a.isShowVideoRank() || a.isShowPoiNews()) {
            this.f69018i = a.isShowVideoRank();
            this.f69019j = a.getPreviousPage();
            if (!C6399b.m19944t() || !"undefined".equalsIgnoreCase(a.getAid())) {
                String str = "detailFragment";
                C0608j supportFragmentManager = getSupportFragmentManager();
                DetailFragment detailFragment = (DetailFragment) supportFragmentManager.mo2644a(str);
                C0633q a2 = supportFragmentManager.mo2645a();
                if (detailFragment != null) {
                    this.f69012b = detailFragment;
                } else {
                    this.f69012b = m86047a(a);
                    a2.mo2600b(R.id.aoy, this.f69012b, str);
                }
                C25292bt.m83098a(getParent(), (Fragment) this.f69012b);
                a2.mo2605c(this.f69012b);
                a2.mo2604c();
                this.f69012b.setUserVisibleHint(true);
                m86056b();
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                String stringExtra = getIntent().getStringExtra("invitation_code");
                String stringExtra2 = getIntent().getStringExtra("invitor");
                jSONObject.put("id", a.getAid());
                jSONObject.put("refer", a.getEventType());
                jSONObject.put("ids", a.getIds());
                jSONObject.put("userid", a.getUid());
                jSONObject.put("video_from", a.getFrom());
                jSONObject.put("page_type", this.f69017h);
                jSONObject.put("music_id", a.getMusicId());
                jSONObject.put("sticker_id", a.getStickerId());
                jSONObject.put("movie_id", a.getMvId());
                jSONObject.put("challenge_id", a.getChallengeId());
                jSONObject.put("invitation_code", stringExtra);
                jSONObject.put("invitor", stringExtra2);
                jSONObject.put("video_type", a.getVideoType());
                jSONObject.put("push_params", a.getPushParams());
            } catch (JSONException unused) {
            }
            C6877n.m21447a("aweme_detail_aid_undefined", jSONObject);
            finish();
            return;
        }
        finish();
    }

    public C33061p getHelper() {
        return this.f69012b.f69026f;
    }

    public void onPause() {
        super.onPause();
        C26062g.m85607a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C23154h getInflater() {
        if (this.f69022m == null) {
            this.f69022m = new C23154h(this);
        }
        return this.f69022m;
    }

    /* renamed from: e */
    public final boolean mo60512e() {
        if (!C43310q.m137426d()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m86056b() {
        try {
            Intent intent = getIntent();
            if (intent.getBooleanExtra("extra_dong_che_di_video", false)) {
                new C26063a().mo67593b(intent.getStringExtra("id")).mo67591a("general_search").mo67594c(((LogPbBean) intent.getSerializableExtra("extra_log_pb")).getImprId()).mo85252e();
            }
        } catch (Exception unused) {
        }
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

    /* renamed from: a */
    private void m86048a() {
        Intent intent = getIntent();
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            StringBuilder sb = new StringBuilder();
            sb.append(data.getHost());
            sb.append(data.getPath());
            if (TextUtils.equals("user/video", sb.toString())) {
                intent.putExtra("enter_from", "push");
                intent.putExtra("refer", "push");
                intent.putExtra("id", data.getQueryParameter("id"));
                intent.putExtra("cid", data.getQueryParameter("commentId"));
            }
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.c9);
        if (this.f69012b != null) {
            this.f69012b.mo67721f();
        }
        String stringExtra = getIntent().getStringExtra("video_from");
        if (C28428o.m93438a(this) || TextUtils.equals(stringExtra, "from_follow_page")) {
            overridePendingTransition(R.anim.ag, R.anim.ah);
        } else if (!C43316v.m137250H()) {
            C43316v.m137450K().mo104947w();
        } else {
            C44933a.m141791a().mo71673ae();
        }
        C22491a.m74384a(this);
        getIntent().removeExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY");
        if (this.f69012b != null) {
            this.f69012b.mo67715a(!TextUtils.equals(stringExtra, "from_follow_page"), this.f69020k);
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onResume", true);
        if (!isFinishing() && VERSION.SDK_INT >= 24 && VERSION.SDK_INT < 28) {
            C43073dv.m136651a((Activity) this);
        }
        if (isFinishing()) {
            C41553g.m132328a(this);
            C2077a.m9159a("crash_service_destory_timeout");
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onResume", false);
            return;
        }
        super.onResume();
        C43103en.m136721a(this);
        C26062g.m85607a(true);
        C43073dv.m136651a((Activity) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onResume", false);
    }

    public void onBackPressed() {
        if (C43045c.m136573c()) {
            Intent intent = (Intent) getIntent().getParcelableExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY");
            if (!(intent == null || intent.resolveActivity(getPackageManager()) == null)) {
                startActivity(intent);
                finish();
                return;
            }
        }
        if (this.f69018i) {
            C6907h.m21524a("back", (Map) C22984d.m75611a().mo59973a("enter_from", "poi_video_leaderboard").mo59973a("previous_page", this.f69019j).f60753a);
        }
        try {
            if (this.f69013c != null) {
                for (C23254a a : this.f69013c) {
                    if (a.mo60522a(4, null)) {
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (this.f69012b == null || !this.f69012b.isViewValid()) {
            if (!C7163a.m22363a()) {
                C6921a.m21552a(6, "DetailActivity", "back when fragment is null!");
                super.onBackPressed();
            } else {
                throw new IllegalStateException("back when fragment is null!");
            }
        } else if (!this.f69012b.mo67720e()) {
            this.f69012b.mo67723i();
        }
        C42961az.m136380a(new C28318an(42));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r1.equals("from_hot") != false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r6 = this;
            super.onDestroy()
            r0 = 0
            r6.overridePendingTransition(r0, r0)
            com.ss.android.ugc.aweme.detail.ui.DetailFragment r1 = r6.f69012b
            if (r1 != 0) goto L_0x000c
            return
        L_0x000c:
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r2 = "video_from"
            java.lang.String r1 = r1.getStringExtra(r2)
            android.content.Intent r2 = r6.getIntent()
            if (r2 == 0) goto L_0x0092
            com.ss.android.ugc.aweme.detail.f.a r2 = com.p280ss.android.ugc.aweme.detail.p1162f.C26061a.f68871a
            boolean r2 = r2.mo67590a(r1)
            if (r2 == 0) goto L_0x0092
            int r2 = r6.f69017h
            r3 = -1
            if (r2 == r3) goto L_0x0092
            com.ss.android.ugc.aweme.detail.ui.DetailFragment r2 = r6.f69012b
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.mo67722g()
            if (r2 == 0) goto L_0x0092
            int r4 = r1.hashCode()
            r5 = -1244334536(0xffffffffb5d4f638, float:-1.586689E-6)
            if (r4 == r5) goto L_0x004a
            r0 = 54656180(0x341fcb4, float:5.700769E-37)
            if (r4 == r0) goto L_0x0040
            goto L_0x0053
        L_0x0040:
            java.lang.String r0 = "from_nearby"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0053
            r0 = 1
            goto L_0x0054
        L_0x004a:
            java.lang.String r4 = "from_hot"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = -1
        L_0x0054:
            switch(r0) {
                case 0: goto L_0x005b;
                case 1: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            return
        L_0x0058:
            java.lang.String r0 = "homepage_fresh"
            goto L_0x005d
        L_0x005b:
            java.lang.String r0 = "homepage_hot"
        L_0x005d:
            com.ss.android.ugc.aweme.common.MobClick r1 = com.p280ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r3 = "feed_back"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r3)
            com.ss.android.ugc.aweme.common.MobClick r0 = r1.setLabelName(r0)
            com.ss.android.ugc.aweme.detail.ui.DetailFragment r1 = r6.f69012b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.mo67722g()
            java.lang.String r1 = r1.getAid()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setValue(r1)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService> r3 = com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService.class
            java.lang.Object r1 = r1.getService(r3)
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r1 = (com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r1
            int r3 = r6.f69017h
            org.json.JSONObject r1 = r1.getRequestIdAndOrderJsonObject(r2, r3)
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
            com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r0)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity.onDestroy():void");
    }

    /* renamed from: a */
    private static DetailFragment m86047a(FeedParam feedParam) {
        return DetailFragment.m86066a(feedParam);
    }

    public void unRegisterActivityOnKeyDownListener(C23254a aVar) {
        if (this.f69013c != null) {
            this.f69013c.remove(aVar);
        }
    }

    public void registerActivityOnKeyDownListener(C23254a aVar) {
        if (this.f69013c == null) {
            this.f69013c = new ArrayList();
        }
        if (!this.f69013c.contains(aVar)) {
            this.f69013c.add(aVar);
        }
    }

    @C7709l
    public void onPlayerControllerRenderFirstFrameEvent(C29004c cVar) {
        if (this.f69023n) {
            this.f69023n = false;
            getInflater().mo60292a().mo60294a((int) R.layout.item_feed).mo60294a((int) R.layout.layout_video_desc).mo60294a((int) R.layout.layout_video_tag).mo60294a((int) R.layout.layout_video_digg).mo60294a((int) R.layout.view_video_progress_bar).mo60294a((int) R.layout.layout_video_comment_count).mo60294a((int) R.layout.layout_video_share).mo60294a((int) R.layout.layout_feed_avatar).mo60294a((int) R.layout.view_video_hot_search_bar).mo60294a((int) R.layout.layout_video_title_music).mo60294a((int) R.layout.layout_video_cover_music).mo60294a((int) R.layout.addiction_hint).mo60296a();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onCreate", true);
        super.onCreate(bundle);
        m86048a();
        getWindow().setSoftInputMode(48);
        setContentView((int) R.layout.fa);
        getInflater().mo60292a().mo60294a((int) R.layout.fragment_detail_page).mo60294a(C24217a.m79549a().providerInputLayoutIdForPreLoad()).mo60296a();
        this.f69016g = (FrameLayout) findViewById(R.id.a81);
        this.f69015f = (FrameLayout) findViewById(R.id.aoy);
        this.f69016g.setBackground(null);
        mo67701a(bundle);
        if (!C26188a.m86176a(this)) {
            finish();
            C10761a.m31399c((Context) this, (int) R.string.cjs).mo25750a();
        }
        try {
            if (!C6399b.m19944t() && VERSION.SDK_INT >= 21) {
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().setNavigationBarColor(-16777216);
            }
            if (C6399b.m19946v() && VERSION.SDK_INT >= 21) {
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().setNavigationBarColor(-16777216);
            }
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
        }
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            this.f69020k = getIntent().getExtras().getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", -1);
        }
        if (this.f61273a != null) {
            this.f61273a.mo60528a((C23261b) new C23261b() {
                /* renamed from: a */
                public final void mo60531a() {
                    DetailActivity.this.f69014e = AwemeChangeCallBack.m106763a(DetailActivity.this);
                    if (DetailActivity.this.f69014e != null) {
                        C42961az.m136380a(new C28318an(21, DetailActivity.this.f69014e));
                    }
                }
            });
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onCreate", false);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f69013c != null) {
            for (C23254a a : this.f69013c) {
                if (a.mo60522a(i, keyEvent)) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: a */
    public static void m86051a(Context context, String str, String str2) {
        m86054a(context, str, null, null, str2);
    }

    /* renamed from: a */
    public static void m86049a(Activity activity, Bundle bundle, View view) {
        if (activity != null) {
            Intent intent = new Intent(activity, DetailActivity.class);
            intent.putExtras(bundle);
            m86050a((Context) activity, intent, view);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }

    /* renamed from: a */
    public static void m86050a(Context context, Intent intent, View view) {
        if (view == null) {
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                context.startActivity(intent);
            }
        } else {
            ActivityCompat.m2905a(context, intent, C0598c.m2487b(view, 0, 0, view.getWidth(), view.getHeight()).mo2580a());
        }
    }

    /* renamed from: a */
    private static void m86054a(Context context, String str, String str2, String str3, String str4) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra("id", str);
        intent.putExtra("invitation_code", null);
        intent.putExtra("invitor", null);
        intent.putExtra("refer", str4);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m86052a(Context context, String str, String str2, String str3, int i, int i2, View view) {
        m86053a(context, str, str2, str3, i, 17, null, view);
    }

    /* renamed from: a */
    public static void m86053a(Context context, String str, String str2, String str3, int i, int i2, String str4, View view) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra("id", str);
        intent.putExtra("refer", str2);
        intent.putExtra("video_from", str3);
        intent.putExtra("profile_enterprise_type", i);
        intent.putExtra("page_type", i2);
        if (str4 != null) {
            intent.putExtra("userid", str4);
        }
        m86050a(context, intent, view);
    }

    /* renamed from: a */
    public static void m86055a(Context context, String str, String str2, String str3, String str4, int i, int i2, String str5, View view) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra("search_keyword", str);
        intent.putExtra("id", str2);
        intent.putExtra("refer", str3);
        intent.putExtra("video_from", str4);
        intent.putExtra("profile_enterprise_type", i);
        intent.putExtra("page_type", i2);
        if (str5 != null) {
            intent.putExtra("userid", str5);
        }
        m86050a(context, intent, view);
    }
}
