package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p280ss.android.ugc.aweme.base.p1054a.p1055a.C23222h;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25765b;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p280ss.android.ugc.aweme.profile.C35816h;
import com.p280ss.android.ugc.aweme.profile.C36102u;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36341a;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.PrivateAlbumActivity */
public final class PrivateAlbumActivity extends AmeSlideSSActivity {

    /* renamed from: e */
    public static final C36209a f94966e = new C36209a(null);

    /* renamed from: f */
    private static final String f94967f = f94967f;

    /* renamed from: b */
    public DmtStatusView f94968b;

    /* renamed from: c */
    public ScrollableLayout f94969c;

    /* renamed from: d */
    public AwemeListFragment f94970d;

    /* renamed from: g */
    private HashMap f94971g;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.PrivateAlbumActivity$a */
    public static final class C36209a {
        private C36209a() {
        }

        public /* synthetic */ C36209a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m117033a(Context context) {
            if (context != null) {
                context.startActivity(new Intent(context, PrivateAlbumActivity.class));
            }
        }

        /* renamed from: b */
        public static boolean m117035b(Context context) {
            if (!((C35816h) C23222h.m76242a(C6399b.m19921a(), C35816h.class)).mo60374a(false)) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public static void m117036c(Context context) {
            ((C35816h) C23222h.m76242a(C6399b.m19921a(), C35816h.class)).mo60375b(true);
        }

        /* renamed from: d */
        public static boolean m117037d(Context context) {
            return ((C35816h) C23222h.m76242a(C6399b.m19921a(), C35816h.class)).mo60376c(false);
        }

        /* renamed from: a */
        public static void m117034a(Context context, boolean z) {
            ((C35816h) C23222h.m76242a(C6399b.m19921a(), C35816h.class)).mo60377d(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.PrivateAlbumActivity$b */
    public static final class C36210b implements C36341a {

        /* renamed from: a */
        final /* synthetic */ PrivateAlbumActivity f94972a;

        C36210b(PrivateAlbumActivity privateAlbumActivity) {
            this.f94972a = privateAlbumActivity;
        }

        /* renamed from: a */
        public final void mo91881a(boolean z, int i) {
            DmtStatusView dmtStatusView = this.f94972a.f94968b;
            if (dmtStatusView != null) {
                dmtStatusView.mo25943g();
            }
            ScrollableLayout scrollableLayout = this.f94972a.f94969c;
            if (scrollableLayout != null) {
                scrollableLayout.setVisibility(8);
            }
        }

        /* renamed from: b */
        public final void mo91882b(boolean z, int i) {
            ScrollableLayout scrollableLayout = this.f94972a.f94969c;
            if (scrollableLayout != null) {
                scrollableLayout.setVisibility(0);
            }
            DmtStatusView dmtStatusView = this.f94972a.f94968b;
            if (dmtStatusView != null) {
                dmtStatusView.mo25939d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.PrivateAlbumActivity$c */
    public static final class C36211c implements C10797a {

        /* renamed from: a */
        final /* synthetic */ PrivateAlbumActivity f94973a;

        /* renamed from: b */
        public final void mo25896b(View view) {
            C7573i.m23587b(view, "view");
        }

        C36211c(PrivateAlbumActivity privateAlbumActivity) {
            this.f94973a = privateAlbumActivity;
        }

        /* renamed from: a */
        public final void mo25895a(View view) {
            C7573i.m23587b(view, "view");
            this.f94973a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.PrivateAlbumActivity$d */
    static final class C36212d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PrivateAlbumActivity f94974a;

        C36212d(PrivateAlbumActivity privateAlbumActivity) {
            this.f94974a = privateAlbumActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            AwemeListFragment awemeListFragment = this.f94974a.f94970d;
            if (awemeListFragment != null) {
                awemeListFragment.mo90811A();
            }
        }
    }

    /* renamed from: a */
    private View m117028a(int i) {
        if (this.f94971g == null) {
            this.f94971g = new HashMap();
        }
        View view = (View) this.f94971g.get(Integer.valueOf(R.id.djz));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.djz);
        this.f94971g.put(Integer.valueOf(R.id.djz), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public static final void m117030a(Context context, boolean z) {
        C36209a.m117034a(context, true);
    }

    /* renamed from: a */
    public static final boolean m117031a(Context context) {
        return C36209a.m117035b(context);
    }

    /* renamed from: b */
    public static final void m117032b(Context context) {
        C36209a.m117036c(context);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        if (C6399b.m19946v()) {
            ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03).init();
            return;
        }
        Activity activity = this;
        if (!C7212bb.m22495a(activity, R.color.a3z)) {
            ImmersionBar.with(activity).statusBarColor((int) R.color.a3z).init();
        }
    }

    /* renamed from: a */
    private final void m117029a() {
        ((TextTitleBar) m117028a((int) R.id.djz)).setOnTitleBarClickListener(new C36211c(this));
        this.f94969c = (ScrollableLayout) findViewById(R.id.czg);
        this.f94968b = (DmtStatusView) findViewById(R.id.a_4);
        Context context = this;
        C10803a a = C10803a.m31631a(context).mo25961a(new C10806a(context).mo25985a((int) R.drawable.b7c).mo25988a("没有私密作品").mo25991b("发布过的私密作品会出现在这里").f29135a);
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(context, R.style.ss));
        dmtTextView.setTextColor(getResources().getColor(R.color.a51));
        dmtTextView.setText(R.string.c48);
        dmtTextView.setOnClickListener(new C36212d(this));
        a.mo25966c((View) dmtTextView);
        DmtStatusView dmtStatusView = this.f94968b;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(a);
        }
        DmtStatusView dmtStatusView2 = this.f94968b;
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo25942f();
        }
        C0608j supportFragmentManager = getSupportFragmentManager();
        Fragment a2 = supportFragmentManager.mo2644a(f94967f);
        if (a2 == null) {
            C0633q a3 = supportFragmentManager.mo2645a();
            C7573i.m23582a((Object) a3, "fm.beginTransaction()");
            C36102u uVar = C36102u.f94392a;
            int dimension = (int) getResources().getDimension(R.dimen.my);
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            User curUser = f.getCurUser();
            C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
            String uid = curUser.getUid();
            C7573i.m23582a((Object) uid, "AccountProxyService.userService().curUser.uid");
            IAccountUserService f2 = C6861a.m21337f();
            C7573i.m23582a((Object) f2, "AccountProxyService.userService()");
            User curUser2 = f2.getCurUser();
            C7573i.m23582a((Object) curUser2, "AccountProxyService.userService().curUser");
            a2 = uVar.newAwemeListFragment(dimension, 14, uid, curUser2.getSecUid(), true, true, new Bundle());
            a3.mo2586a(R.id.aoy, a2, f94967f);
            a3.mo2604c();
        }
        if (!(a2 instanceof AwemeListFragment)) {
            a2 = null;
        }
        this.f94970d = (AwemeListFragment) a2;
        AwemeListFragment awemeListFragment = this.f94970d;
        if (awemeListFragment != null) {
            awemeListFragment.mo91883a(this.f94968b);
            awemeListFragment.setUserVisibleHint(true);
            awemeListFragment.mo90832e(true);
            awemeListFragment.mo90817a((C36341a) new C36210b(this));
        }
        ScrollableLayout scrollableLayout = this.f94969c;
        if (scrollableLayout != null) {
            C25765b helper = scrollableLayout.getHelper();
            if (helper != null) {
                helper.f68075b = this.f94970d;
            }
        }
        C36209a.m117036c(context);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.e5);
        m117029a();
    }
}
