package com.p280ss.android.ugc.aweme.discover.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25292bt;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailFragment;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p280ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel;
import com.p280ss.android.ugc.aweme.discover.p1185ui.DiscoverDetailFragment;
import com.p280ss.android.ugc.aweme.experiment.DiscoveryV4Experiment;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.feed.param.C28652a;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity */
public class DiscoverDetailActivity extends DetailActivity {
    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo67701a(Bundle bundle) {
        FeedParam a = C28652a.m94276a(this);
        if (a.getCellDetailType() != 1 || !TextUtils.isEmpty(a.getCellId())) {
            C28503s.m93679a((C25673a) new DiscoveryV4DetailListModel());
            C0608j supportFragmentManager = getSupportFragmentManager();
            this.f69012b = (DetailFragment) supportFragmentManager.mo2644a("detail_fragment");
            if (this.f69012b == null) {
                this.f69012b = DiscoverDetailFragment.m88233b(a);
            }
            this.f69012b.setUserVisibleHint(true);
            if (bundle == null) {
                C0633q a2 = supportFragmentManager.mo2645a();
                C25292bt.m83098a(getParent(), (Fragment) this.f69012b);
                a2.mo2600b(R.id.aoy, this.f69012b, "detail_fragment");
                a2.mo2604c();
            }
            return;
        }
        finish();
    }

    /* renamed from: a */
    public static void m86686a(Context context, int i, String str, String str2, int i2) {
        if (context != null) {
            Intent intent = new Intent(context, DiscoverDetailActivity.class);
            intent.putExtra("cell_id", str);
            intent.putExtra("type", i);
            intent.putExtra("id", str2);
            intent.putExtra("refer", "playlist");
            intent.putExtra("video_from", "from_discovery_v3");
            intent.putExtra("index", i2);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m86687a(Context context, int i, String str, String str2, int i2, String str3, String str4) {
        if (context != null) {
            Intent intent = new Intent(context, DiscoverDetailActivity.class);
            int i3 = 1;
            if (C6384b.m19835a().mo15287a(DiscoveryV4Experiment.class, true, "discover_v4_type", C6384b.m19835a().mo15295d().discover_v4_type, 0) == 1) {
                i3 = 0;
                intent.putExtra("refer", "discovery_category");
            } else if (TextUtils.equals(str3, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
                i3 = 2;
                intent.putExtra("refer", "discovery_tab");
            } else {
                intent.putExtra("refer", "playlist");
            }
            intent.putExtra("video_from", "from_discovery_v4");
            intent.putExtra("detail_cell_type", i3);
            intent.putExtra("tab_name", str3);
            intent.putExtra("tab_text", str4);
            intent.putExtra("cell_id", str);
            intent.putExtra("type", i);
            intent.putExtra("id", str2);
            intent.putExtra("index", i2);
            context.startActivity(intent);
        }
    }
}
