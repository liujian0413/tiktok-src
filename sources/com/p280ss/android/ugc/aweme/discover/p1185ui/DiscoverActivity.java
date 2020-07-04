package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.base.activity.C23256c;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.main.C32904bi;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.DiscoverActivity */
public final class DiscoverActivity extends AmeBaseActivity {

    /* renamed from: c */
    public static final C26880a f70910c = new C26880a(null);

    /* renamed from: a */
    public TextTitleBar f70911a;

    /* renamed from: b */
    public HotSearchAndDiscoveryFragment2 f70912b;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.DiscoverActivity$a */
    public static final class C26880a {
        private C26880a() {
        }

        public /* synthetic */ C26880a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.DiscoverActivity$b */
    public static final class C26881b implements C10797a {

        /* renamed from: a */
        final /* synthetic */ DiscoverActivity f70913a;

        /* renamed from: b */
        public final void mo25896b(View view) {
            C7573i.m23587b(view, "view");
        }

        C26881b(DiscoverActivity discoverActivity) {
            this.f70913a = discoverActivity;
        }

        /* renamed from: a */
        public final void mo25895a(View view) {
            C7573i.m23587b(view, "view");
            this.f70913a.finish();
        }
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.be;
    }

    public final void finish() {
        int i;
        super.finish();
        if (C32904bi.m106502g()) {
            i = 4;
        } else {
            i = 0;
        }
        C23256c.m76348b(this, i);
    }

    public final void onBackPressed() {
        HotSearchAndDiscoveryFragment2 hotSearchAndDiscoveryFragment2 = this.f70912b;
        if (hotSearchAndDiscoveryFragment2 == null) {
            C7573i.m23583a("mDiscoveryFragment");
        }
        if (!hotSearchAndDiscoveryFragment2.mo67891c()) {
            super.onBackPressed();
        }
    }

    /* renamed from: c */
    private final void m88229c() {
        View findViewById = findViewById(R.id.djz);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.title_bar)");
        this.f70911a = (TextTitleBar) findViewById;
        TextTitleBar textTitleBar = this.f70911a;
        if (textTitleBar == null) {
            C7573i.m23583a("mTextTitleBar");
        }
        textTitleBar.setVisibility(8);
        TextTitleBar textTitleBar2 = this.f70911a;
        if (textTitleBar2 == null) {
            C7573i.m23583a("mTextTitleBar");
        }
        textTitleBar2.mo25857a(false);
        TextTitleBar textTitleBar3 = this.f70911a;
        if (textTitleBar3 == null) {
            C7573i.m23583a("mTextTitleBar");
        }
        textTitleBar3.setOnTitleBarClickListener(new C26881b(this));
    }

    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (C32904bi.m106502g()) {
            i = 4;
        } else {
            i = 0;
        }
        Activity activity = this;
        C23256c.m76347a(activity, i);
        m88229c();
        this.f70912b = new HotSearchAndDiscoveryFragment2();
        HotSearchAndDiscoveryFragment2 hotSearchAndDiscoveryFragment2 = this.f70912b;
        if (hotSearchAndDiscoveryFragment2 == null) {
            C7573i.m23583a("mDiscoveryFragment");
        }
        Intent intent = getIntent();
        C7573i.m23582a((Object) intent, "intent");
        hotSearchAndDiscoveryFragment2.setArguments(intent.getExtras());
        C0633q a = getSupportFragmentManager().mo2645a();
        HotSearchAndDiscoveryFragment2 hotSearchAndDiscoveryFragment22 = this.f70912b;
        if (hotSearchAndDiscoveryFragment22 == null) {
            C7573i.m23583a("mDiscoveryFragment");
        }
        a.mo2585a((int) R.id.a24, (Fragment) hotSearchAndDiscoveryFragment22).mo2606d();
        C23487o.m77149b(activity);
    }
}
