package com.p280ss.android.ugc.aweme.livewallpaper.p1370ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.livewallpaper.adapter.LiveWallPaperAdapter;
import com.p280ss.android.ugc.aweme.livewallpaper.adapter.LiveWallPaperAdapter.C32568a;
import com.p280ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32571c;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32577e;
import com.p280ss.android.ugc.aweme.profile.adapter.AmeDecoration;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity */
public class LocalLiveWallPaperActivity extends AmeSSActivity {

    /* renamed from: a */
    private LiveWallPaperAdapter f85042a;

    /* renamed from: b */
    private boolean f85043b;
    ViewGroup mLayoutEmpty;
    TextView mTitle;
    RecyclerView mWallPapersRecyclerView;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onResume", true);
        super.onResume();
        List c = C32571c.m105458a().mo83860c();
        if (C6307b.m19566a((Collection<T>) c)) {
            this.mLayoutEmpty.setVisibility(0);
        } else {
            if (!this.f85043b) {
                this.f85043b = true;
                C32577e.m105492a(c);
            }
            this.mLayoutEmpty.setVisibility(8);
        }
        this.f85042a.mo83849a(c);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onResume", false);
    }

    public void setStatusBarColor() {
        if (!C6399b.m19946v()) {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a03).statusBarDarkFont(true).init();
        }
    }

    /* renamed from: a */
    private void m105650a() {
        this.mTitle.setText(getString(R.string.c4j));
        this.mWallPapersRecyclerView.setLayoutManager(new WrapGridLayoutManager((Context) this, 3, 1, false));
        this.mWallPapersRecyclerView.setHasFixedSize(true);
        this.f85042a = new LiveWallPaperAdapter();
        this.f85042a.f84917a = new C32568a() {
            /* renamed from: a */
            public final void mo83851a(LiveWallPaperBean liveWallPaperBean) {
                Intent intent = new Intent(LocalLiveWallPaperActivity.this, LiveWallPaperPreviewActivity.class);
                intent.putExtra("live_wall_paper", liveWallPaperBean);
                LocalLiveWallPaperActivity.this.startActivity(intent);
            }
        };
        this.mWallPapersRecyclerView.mo5525a((C1272h) new AmeDecoration((int) C9738o.m28708b((Context) this, 1.0f)));
        this.mWallPapersRecyclerView.setAdapter(this.f85042a);
    }

    public void exit(View view) {
        finish();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.cx);
        m105650a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onCreate", false);
    }
}
