package com.p280ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.widget.DrawerLayout;
import android.support.p022v4.widget.DrawerLayout.C1009c;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.base.event.RoomStatusEvent;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.C3916b;
import com.bytedance.android.livesdkapi.C9289b;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.depend.live.C9328d;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.android.livesdkapi.p452h.C9413b;
import com.bytedance.android.livesdkapi.p458j.C9488a;
import com.bytedance.android.livesdkapi.view.C9518b;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.bytedance.p474c.p475a.p476a.C9668a;
import com.p280ss.android.sdk.p899a.C20097a;
import com.p280ss.android.ugc.aweme.C21780t;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.C23018p;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.base.p1063g.C23346d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.live.model.C32532b;
import com.p280ss.android.ugc.aweme.live.p1365e.C32508a;
import com.p280ss.android.ugc.aweme.live.p1365e.C32511c;
import com.p280ss.android.ugc.aweme.live.p1365e.C32511c.C32513a;
import com.p280ss.android.ugc.aweme.live.p1366f.C32515a;
import com.p280ss.android.ugc.aweme.main.C32993do;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.p1383e.C33001a;
import com.p280ss.android.ugc.aweme.p1003am.C22491a;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41553g;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.story.live.C41990e;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43073dv;
import com.p280ss.android.ugc.aweme.utils.C43098ej;
import com.p280ss.p1783b.p1784a.C45771a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C7709l;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.live.LivePlayActivity */
public class LivePlayActivity extends BaseLiveSdkActivity implements C9289b, C9413b {

    /* renamed from: p */
    private static long f84574p;

    /* renamed from: a */
    public C32513a f84575a = new C32513a();

    /* renamed from: b */
    public Fragment f84576b;

    /* renamed from: c */
    public DmtLoadingLayout f84577c;

    /* renamed from: d */
    public int f84578d = 0;

    /* renamed from: e */
    private Rect f84579e;

    /* renamed from: f */
    private Fragment f84580f;

    /* renamed from: g */
    private C9328d f84581g;

    /* renamed from: h */
    private LiveDrawerDialog f84582h;

    /* renamed from: i */
    private LiveDrawerLayout f84583i;

    /* renamed from: j */
    private boolean f84584j = false;

    /* renamed from: k */
    private boolean f84585k = false;

    /* renamed from: l */
    private boolean f84586l = false;

    /* renamed from: m */
    private boolean f84587m = false;

    /* renamed from: n */
    private String f84588n = "";

    /* renamed from: o */
    private HashMap f84589o;

    /* renamed from: q */
    private List<C1009c> f84590q;

    /* renamed from: r */
    private C7321c f84591r;

    /* renamed from: s */
    private C32515a f84592s;

    /* renamed from: t */
    private C1009c f84593t = new C1009c() {
        public final void onDrawerSlide(View view, float f) {
        }

        public final void onDrawerStateChanged(int i) {
        }

        public final void onDrawerClosed(View view) {
            C3916b.m13813a().mo11466c();
        }

        public final void onDrawerOpened(View view) {
            C3916b.m13813a().mo11465b();
            if (LivePlayActivity.this.f84576b == null) {
                LivePlayActivity.this.f84577c = (DmtLoadingLayout) LivePlayActivity.this.findViewById(R.id.a_3);
                LivePlayActivity.this.f84577c.setVisibility(0);
                LivePlayActivity.this.f84576b = null;
                C0633q a = LivePlayActivity.this.getSupportFragmentManager().mo2645a();
                a.mo2585a((int) R.id.c_8, LivePlayActivity.this.f84576b);
                a.mo2606d();
            }
        }
    };

    /* renamed from: a */
    public final void mo23112a(String str) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final DrawerLayout mo83650a() {
        return this.f84583i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo83654e() {
        overridePendingTransition(0, 0);
        super.finish();
    }

    /* renamed from: l */
    private static boolean m105037l() {
        return C7213d.m22500a().mo18759aW();
    }

    /* renamed from: p */
    private void m105041p() {
        if (this.f84592s != null) {
            this.f84592s.mo83739b();
        }
    }

    /* renamed from: q */
    private void m105042q() {
        if (this.f84592s != null) {
            this.f84592s.mo83741d();
        }
    }

    /* renamed from: i */
    private void m105034i() {
        if (this.f84584j && this.f84579e != null) {
            C32508a.m105304a(findViewById(R.id.cwn), this.f84579e, new View[0]);
        }
    }

    /* renamed from: c */
    public final void mo23113c() {
        if (this.f84577c != null) {
            this.f84577c.setVisibility(8);
        }
        if (this.f84582h != null && this.f84582h.isVisible()) {
            this.f84582h.mo83646b();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C32430a.m105068e().mo22020f().mo21101b(hashCode());
        if (this.f84591r != null) {
            this.f84591r.dispose();
        }
    }

    /* renamed from: g */
    private boolean m105032g() {
        if (!isTaskRoot() || getIntent() == null) {
            return false;
        }
        String stringExtra = getIntent().getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
        if (!C6399b.m19944t() || !TextUtils.isEmpty(stringExtra)) {
            return true;
        }
        C41990e.m133500a(this, new Bundle());
        return false;
    }

    /* renamed from: h */
    private void m105033h() {
        if (this.f84575a == null) {
            this.f84575a = new C32513a();
        }
        C32511c.m105305a(this, this.f84575a);
        if (this.f84575a.f84775a) {
            mo83653d();
            return;
        }
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public final void run() {
                if (LivePlayActivity.this.f84575a.f84775a) {
                    LivePlayActivity.this.mo83653d();
                } else {
                    handler.postDelayed(this, 50);
                }
            }
        }, 50);
    }

    /* renamed from: j */
    private void m105035j() {
        Intent intent = getIntent();
        if (intent != null) {
            RoomStatusEvent roomStatusEvent = (RoomStatusEvent) intent.getParcelableExtra("host_room_status_event");
            if (roomStatusEvent != null) {
                C42961az.m136380a(roomStatusEvent);
                if (roomStatusEvent.f7646c && this.f84585k && !C23018p.m75672a().mo59990c()) {
                    startActivity(new Intent(this, MainActivity.class));
                }
            }
        }
    }

    /* renamed from: k */
    private void m105036k() {
        if (getIntent() != null) {
            long longExtra = getIntent().getLongExtra("current_room_id", 0);
            boolean booleanExtra = getIntent().getBooleanExtra("has_page_slide", false);
            if (longExtra > 0 && booleanExtra) {
                C42961az.m136380a(new C32532b(longExtra));
            }
        }
    }

    /* renamed from: m */
    private boolean m105038m() {
        if (C6399b.m19944t()) {
            return false;
        }
        Bundle bundleExtra = getIntent().getBundleExtra("live_play_params");
        if (bundleExtra == null || (!m105039n() && !m105030d(bundleExtra))) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private boolean m105039n() {
        boolean z;
        boolean z2;
        Bundle bundleExtra = getIntent().getBundleExtra("live_play_params");
        if (bundleExtra == null || !bundleExtra.getBoolean("live.intent.extra.FROM_NEW_STYLE", false)) {
            z = false;
        } else {
            z = true;
        }
        if (bundleExtra == null || !TextUtils.equals("live_square", bundleExtra.getString("enter_from_live_source"))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private void m105040o() {
        if (getIntent() == null || getIntent().getLongExtra("room_id", 0) == -3 || (this.f84592s != null && this.f84592s.mo83742e())) {
            finish();
        }
    }

    /* renamed from: b */
    public final boolean mo22779b() {
        if (!C30199h.m98861a().getEnableLiveDrawerDialog().booleanValue() || !m105038m()) {
            return false;
        }
        return true;
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

    public void onBackPressed() {
        if (this.f84583i == null || !this.f84583i.isDrawerOpen(8388613)) {
            if ((this.f84580f instanceof C9518b) && !((C9518b) this.f84580f).mo11358a()) {
                super.onBackPressed();
            }
            return;
        }
        this.f84583i.closeDrawer(8388613);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onResume", true);
        if (!isFinishing() && VERSION.SDK_INT >= 24 && VERSION.SDK_INT < 28) {
            C43073dv.m136651a((Activity) this);
        }
        if (isFinishing()) {
            C41553g.m132328a(this);
            C2077a.m9159a("crash_service_destory_timeout");
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onResume", false);
            return;
        }
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onResume", false);
    }

    /* renamed from: f */
    private void m105031f() {
        if (mo22779b()) {
            ((DrawerLayout) findViewById(R.id.abi)).setDrawerLockMode(1);
            return;
        }
        this.f84583i = (LiveDrawerLayout) findViewById(R.id.abi);
        this.f84583i.mo83649a(this, 1.0f);
        if (!m105038m()) {
            this.f84583i.setDrawerLockMode(1);
            return;
        }
        this.f84583i.addDrawerListener(this.f84593t);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.c_9);
        int a = (int) (((float) C9738o.m28691a((Context) this)) - C9738o.m28708b((Context) this, 50.0f));
        if (a > 0) {
            LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = a;
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: d */
    public final void mo83653d() {
        if (this.f84584j || !m105037l()) {
            C32508a.m105303a(findViewById(R.id.cwn), this.f84579e, new C32527h(this), new View[0]);
            return;
        }
        m105036k();
        super.finish();
    }

    public void finish() {
        if (!this.f84587m && getIntent() != null && getIntent().getBooleanExtra("live_room_effect_watch_one_min", false)) {
            new C33001a();
        }
        String stringExtra = getIntent().getStringExtra("backurl");
        if (TextUtils.isEmpty(stringExtra)) {
            m105035j();
            if (this.f84579e != null && m105037l()) {
                m105033h();
                return;
            }
        }
        super.finish();
        if (!TextUtils.isEmpty(stringExtra) || m105032g()) {
            C22491a.m74384a(this);
        }
    }

    /* renamed from: b */
    public final void mo22778b(C1009c cVar) {
        if (cVar != null && this.f84590q != null) {
            this.f84590q.remove(cVar);
        }
    }

    /* renamed from: b */
    private static boolean m105028b(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        if (bundle.getBoolean("live.intent.extra.FROM_NEW_STYLE", false)) {
            return true;
        }
        Bundle bundle2 = bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
        if (bundle2 == null || !bundle2.getBoolean("live.intent.extra.FROM_NEW_STYLE", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo22776a(C1009c cVar) {
        if (cVar != null) {
            if (this.f84590q == null) {
                this.f84590q = new ArrayList();
            }
            this.f84590q.add(cVar);
        }
    }

    @C7709l
    public void onEvent(C20097a aVar) {
        if (C6399b.m19944t() && C32430a.m105068e() != null) {
            C32430a.m105068e().mo22022h().mo22000b();
        }
    }

    public void setTheme(int i) {
        Bundle bundleExtra = getIntent().getBundleExtra("live_play_params");
        if (bundleExtra == null || bundleExtra.getParcelable("live.intent.extra.SOURCE_POSITION") == null) {
            super.setTheme(R.style.n);
        } else {
            super.setTheme(i);
        }
    }

    /* renamed from: a */
    private void m105023a(Intent intent) {
        if (getIntent() == null || getIntent().getLongExtra("room_id", 0) == -3) {
            setIntent(intent);
        } else {
            this.f84592s = null;
        }
    }

    /* renamed from: d */
    private static boolean m105030d(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        Bundle bundle2 = bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
        if ("1".equals(bundle.getString("enable_feed_drawer", "0")) || (bundle2 != null && "1".equals(bundle2.getString("enable_feed_drawer", "0")))) {
            return true;
        }
        return false;
    }

    @C7709l
    public void onEvent(ShareCompleteEvent shareCompleteEvent) {
        if (this.f84586l && TextUtils.equals("live", shareCompleteEvent.itemType)) {
            C3596c.m13172a(C9295a.class);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!C6399b.m19944t() && this.f84579e != null && configuration.orientation == 2) {
            try {
                C9488a.m28006a((Object) this, "convertFromTranslucent", new Object[0]);
            } catch (Throwable th) {
                C45771a.m143707b("LivePlayActivity", Log.getStackTraceString(th));
            }
        }
        if (this.f84583i == null || configuration.orientation != 2) {
            if (this.f84583i != null && m105038m()) {
                this.f84583i.setDrawerLockMode(0);
            }
            return;
        }
        this.f84583i.setDrawerLockMode(1);
    }

    /* renamed from: a */
    private void m105024a(Bundle bundle) {
        Bundle bundle2;
        if (m105030d(bundle)) {
            if (getIntent() != null) {
                bundle2 = getIntent().getBundleExtra("live_play_params");
            } else {
                bundle2 = null;
            }
            if (bundle2 != null) {
                bundle2.putString("enable_feed_drawer", "1");
            }
            m105031f();
        }
    }

    /* renamed from: c */
    private void m105029c(Bundle bundle) {
        boolean z;
        if (bundle != null) {
            if (bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA") != null) {
                this.f84587m = TextUtils.equals("live_square", bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA").getString("enter_from_live_square"));
            }
            this.f84579e = (Rect) bundle.getParcelable("live.intent.extra.SOURCE_POSITION");
            Bundle bundle2 = bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            boolean z2 = true;
            if (bundle2 == null || !TextUtils.equals(bundle2.getString("enter_from_merge"), "push")) {
                z = false;
            } else {
                z = true;
            }
            this.f84585k = z;
            if (bundle2 != null) {
                this.f84588n = bundle2.getString("previous_page");
            }
            if (bundle == null || !bundle.getBoolean("enter_from_dou_plus", false)) {
                z2 = false;
            }
            this.f84586l = z2;
            if (this.f84586l) {
                Serializable serializable = bundle.getSerializable("live_douplus_log_extra");
                if (serializable instanceof HashMap) {
                    this.f84589o = (HashMap) serializable;
                }
            }
            if (this.f84579e == null || !this.f84584j) {
                try {
                    C9488a.m28006a((Object) this, "convertFromTranslucent", new Object[0]);
                } catch (Throwable th) {
                    C6921a.m21559a(th);
                }
            } else {
                overridePendingTransition(0, 0);
            }
        }
    }

    /* renamed from: a */
    private boolean m105026a(long j) {
        boolean z;
        if (j == -3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f84592s = new C32515a(this);
            this.f84592s.mo83738a();
            this.f84592s.mo83740c();
        } else {
            m105041p();
            m105042q();
        }
        return z;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onCreate", true);
        Intent intent = getIntent();
        long longExtra = intent.getLongExtra("room_id", 0);
        Bundle bundleExtra = intent.getBundleExtra("live_play_params");
        super.onCreate(bundle);
        m105029c(bundleExtra);
        setContentView((int) R.layout.cs);
        m105034i();
        getWindow().setSoftInputMode(48);
        getWindow().addFlags(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        if (VERSION.SDK_INT != 19 && !C22911a.m75401a(this)) {
            C43098ej.m136709a((Activity) this);
        }
        C32430a.m105068e().mo22020f().mo21100a(hashCode(), this);
        if (!m105026a(longExtra)) {
            C0633q a = getSupportFragmentManager().mo2645a();
            this.f84581g = C32430a.m105068e().mo22004a(longExtra, bundleExtra);
            this.f84580f = this.f84581g.mo11360b();
            if (this.f84580f.getArguments() != null) {
                this.f84580f.getArguments().putLong("live.intent.extra.ROOM_ID", longExtra);
                this.f84580f.getArguments().putString("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TYPE", "click");
                this.f84580f.getArguments().putLong("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME", f84574p);
            }
            a.mo2585a((int) R.id.aoy, this.f84580f);
            a.mo2604c();
        }
        m105031f();
        overridePendingTransition(R.anim.c4, R.anim.cc);
        if (!(C9469i.m27992d() == null || C9469i.m27992d().mo22018d() == null || C9469i.m27992d().mo22018d().getLiveWatchTime() == null)) {
            this.f84591r = C9469i.m27992d().mo22018d().getLiveWatchTime().mo19325f((C7326g<? super T>) new C7326g<Long>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Long l) throws Exception {
                    LivePlayActivity.this.f84578d = (int) (((long) LivePlayActivity.this.f84578d) + l.longValue());
                    if (LivePlayActivity.this.f84578d >= 60000) {
                        C21780t.m72807a().mo57891a(252, (long) (LivePlayActivity.this.f84578d / 1000), new HashMap(), new C9668a<Object>() {
                        });
                    }
                }
            });
        }
        try {
            C0608j supportFragmentManager = getSupportFragmentManager();
            Fragment a2 = supportFragmentManager.mo2644a("LiveDrawerDialog");
            if (a2 != null) {
                supportFragmentManager.mo2645a().mo2587a(a2).mo2606d();
            }
        } catch (Exception unused) {
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onCreate", false);
    }

    public void onNewIntent(Intent intent) {
        boolean z;
        super.onNewIntent(intent);
        if (intent != null) {
            if (this.f84581g == null || this.f84581g.mo11364c() == null) {
                z = false;
            } else {
                Bundle arguments = this.f84581g.mo11364c().mo13278g().getArguments();
                if (arguments == null || arguments.getLong("live.intent.extra.ROOM_ID", -1) != intent.getLongExtra("room_id", -2)) {
                    z = m105028b(arguments);
                } else {
                    return;
                }
            }
            Bundle bundleExtra = intent.getBundleExtra("live_play_params");
            long longExtra = intent.getLongExtra("room_id", 0);
            if (longExtra != -3) {
                if (longExtra == -4) {
                    m105040o();
                    return;
                }
                m105023a(intent);
                boolean z2 = true;
                if (z && ("push".equals(bundleExtra.getString("enter_from_merge")) || "push".equals(bundleExtra.getString("enter_method")))) {
                    bundleExtra.putBoolean("live.intent.extra.FROM_NEW_STYLE", true);
                }
                this.f84581g = C32430a.m105068e().mo22004a(longExtra, bundleExtra);
                this.f84580f = this.f84581g.mo11360b();
                if (this.f84580f.getArguments() != null) {
                    this.f84580f.getArguments().putLong("live.intent.extra.ROOM_ID", longExtra);
                    this.f84580f.getArguments().putBoolean("extra_bool_flag_from_new_intent", true);
                    this.f84580f.getArguments().putString("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TYPE", "click");
                    this.f84580f.getArguments().putLong("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME", f84574p);
                    this.f84580f.getArguments().putString("previous_page", this.f84588n);
                }
                if (bundleExtra == null || !bundleExtra.getBoolean("enter_from_dou_plus", false)) {
                    z2 = false;
                }
                this.f84586l = z2;
                if (this.f84586l) {
                    Serializable serializable = bundleExtra.getSerializable("live_douplus_log_extra");
                    if (serializable instanceof HashMap) {
                        this.f84589o = (HashMap) serializable;
                    }
                }
                C0633q a = getSupportFragmentManager().mo2645a();
                a.mo2599b(R.id.aoy, this.f84580f);
                a.mo2604c();
                m105024a(bundleExtra);
            }
        }
    }

    /* renamed from: a */
    public final void mo22777a(Boolean bool) {
        if (mo22779b()) {
            if (bool.booleanValue()) {
                if (this.f84582h == null || !this.f84582h.isVisible()) {
                    if (this.f84582h == null) {
                        this.f84582h = LiveDrawerDialog.m105007a(this.f84590q);
                    }
                    if (!this.f84582h.isAdded()) {
                        this.f84582h.showNow(getSupportFragmentManager(), "LiveDrawerDialog");
                    }
                }
            } else if (this.f84582h != null && this.f84582h.isVisible()) {
                this.f84582h.mo83644a(false);
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C9469i.m27992d().mo22022h().mo21999a(0, i, keyEvent);
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: a */
    public static void m105022a(Context context, long j, Bundle bundle) {
        f84574p = System.currentTimeMillis();
        if (!TimeLockRuler.isEnableShowTeenageTip(R.string.e5n)) {
            Intent intent = new Intent(context, LivePlayActivity.class);
            intent.putExtra("room_id", j);
            intent.putExtra("live_play_params", bundle);
            intent.putExtra("backurl", bundle.getString("backUrl"));
            int i = bundle.getInt("live.intent.extra.BACK_TAB_INDEX", -1);
            if (i >= 0) {
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", C32993do.m106642a(Integer.valueOf(i)));
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            C32430a.m105068e().mo22008a(j, bundle, context);
            return;
        }
        if (TextUtils.equals(bundle.getString("enter_method", ""), "push")) {
            C41989d.m133478a(bundle.getString("anchor_id", ""), j, "user_is_teen_mode");
        }
    }
}
