package com.p280ss.android.ugc.aweme.favorites;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import butterknife.ButterKnife;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.activity.C23256c;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33250au;
import com.p280ss.android.ugc.aweme.profile.C36102u;
import com.p280ss.android.ugc.aweme.profile.p1487ui.AwemeListFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.favorites.FavoriteListActivity */
public class FavoriteListActivity extends AmeSSActivity {

    /* renamed from: a */
    boolean f72990a = true;

    /* renamed from: b */
    private int f72991b;

    /* renamed from: c */
    private String f72992c;

    /* renamed from: d */
    private String f72993d;

    /* renamed from: e */
    private boolean f72994e;

    /* renamed from: f */
    private boolean f72995f;

    /* renamed from: g */
    private String f72996g;

    /* renamed from: h */
    private String f72997h;

    /* renamed from: i */
    private AwemeListFragment f72998i;

    /* renamed from: j */
    private long f72999j;
    TextTitleBar mTitleBar;

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.FavoriteListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    private void m90850a() {
        this.f72999j = System.currentTimeMillis();
    }

    public void onPause() {
        super.onPause();
        m90851b();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.FavoriteListActivity", "onResume", true);
        super.onResume();
        m90850a();
        m90852c();
        if (this.f72998i != null && !this.f72990a) {
            this.f72998i.mo71270t();
        }
        this.f72990a = false;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.FavoriteListActivity", "onResume", false);
    }

    /* renamed from: b */
    private void m90851b() {
        String str;
        String str2;
        if (this.f72999j > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f72999j;
            if (currentTimeMillis > 0) {
                C33250au auVar = new C33250au();
                if (this.f72994e) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                C33250au auVar2 = (C33250au) auVar.mo85151b(str).mo85150a(String.valueOf(currentTimeMillis)).mo85283l(this.f72997h);
                if (this.f72995f) {
                    str2 = "click_my_like";
                } else {
                    str2 = "click_link";
                }
                auVar2.mo85153d(str2).mo85252e();
            }
            this.f72999j = -1;
        }
    }

    /* renamed from: c */
    private void m90852c() {
        String str;
        int i;
        int i2;
        if (C6399b.m19944t()) {
            Locale locale = Locale.getDefault();
            String string = getString(R.string.bz6);
            Object[] objArr = new Object[1];
            if (this.f72991b < 0) {
                i2 = 0;
            } else {
                i2 = this.f72991b;
            }
            objArr[0] = Integer.valueOf(i2);
            str = C1642a.m8035a(locale, string, objArr);
        } else {
            Object[] objArr2 = new Object[1];
            if (this.f72991b < 0) {
                i = 0;
            } else {
                i = this.f72991b;
            }
            objArr2[0] = Integer.valueOf(i);
            str = getString(R.string.bz6, objArr2);
        }
        this.mTitleBar.setTitle((CharSequence) str);
    }

    @C7709l
    public void onVideoEvent(C28318an anVar) {
        if (anVar.f74631a == 13) {
            if (((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById((String) anVar.f74632b).getUserDigg() == 1) {
                this.f72991b++;
            } else {
                this.f72991b--;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.FavoriteListActivity", "onCreate", true);
        super.onCreate(bundle);
        requestDisableOptimizeViewHierarchy();
        setContentView((int) R.layout.bl);
        C23256c.m76347a(this, 0);
        this.f72991b = getIntent().getIntExtra("favoriteCount", 0);
        this.f72992c = getIntent().getStringExtra("userId");
        this.f72993d = getIntent().getStringExtra("sec_user_id");
        this.f72994e = getIntent().getBooleanExtra("isMyProfile", false);
        this.f72995f = getIntent().getBooleanExtra("clickMyLike", false);
        this.f72996g = getIntent().getStringExtra("contentSource");
        this.f72997h = getIntent().getStringExtra("tabName");
        ButterKnife.bind((Activity) this);
        this.f72998i = C36102u.f94392a.newBasicAwemeListFragment((int) getResources().getDimension(R.dimen.my), 1, this.f72992c, this.f72993d, this.f72994e, true);
        this.f72998i.mo90832e(true);
        AwemeListFragment awemeListFragment = this.f72998i;
        if (this.f72995f) {
            str = "click_my_like_cover";
        } else {
            str = "click_link_cover";
        }
        awemeListFragment.mo90827c(str);
        this.f72998i.mo90828d(this.f72996g);
        this.f72998i.mo92306h(this.f72997h);
        getSupportFragmentManager().mo2645a().mo2585a((int) R.id.aoy, (Fragment) this.f72998i).mo2606d();
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                FavoriteListActivity.this.onBackPressed();
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.FavoriteListActivity", "onCreate", false);
    }
}
