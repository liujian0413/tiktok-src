package com.p280ss.android.ugc.aweme.follow.recommend.follow.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowActivity */
public final class RecommendFollowActivity extends JediBaseActivity {

    /* renamed from: b */
    public static final C29481a f77742b = new C29481a(null);

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowActivity$a */
    public static final class C29481a {
        private C29481a() {
        }

        public /* synthetic */ C29481a(C7571f fVar) {
            this();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    /* renamed from: g */
    private final void m96974g() {
        if (getSupportFragmentManager().mo2644a("tag_recommend_follow") == null) {
            Fragment recommendFollowFragment = new RecommendFollowFragment();
            RecommendFollowFragment recommendFollowFragment2 = (RecommendFollowFragment) recommendFollowFragment;
            Intent intent = getIntent();
            C7573i.m23582a((Object) intent, "intent");
            recommendFollowFragment2.setArguments(intent.getExtras());
            getSupportFragmentManager().mo2645a().mo2586a(R.id.aoy, recommendFollowFragment, "tag_recommend_follow").mo2606d();
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ee);
        m96974g();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowActivity", "onCreate", false);
    }
}
