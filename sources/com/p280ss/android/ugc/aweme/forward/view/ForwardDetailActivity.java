package com.p280ss.android.ugc.aweme.forward.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity */
public class ForwardDetailActivity extends FeedDetailActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        if (TextUtils.isEmpty(getIntent().getStringExtra("forward_id"))) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onCreate", false);
            return;
        }
        this.f78716a = getIntent().getStringExtra("refer");
        if (bundle == null) {
            ForwardAwemeDetailFragment forwardAwemeDetailFragment = new ForwardAwemeDetailFragment();
            forwardAwemeDetailFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().mo2645a().mo2586a(R.id.am6, forwardAwemeDetailFragment, "OriginDetail").mo2604c();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m98168a(Context context, String str, String str2, String str3, int i) {
        if (C6384b.m19835a().mo15292a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", C6384b.m19835a().mo15295d().follow_detail_full_screen, false)) {
            C7195s a = C7195s.m22438a();
            Activity activity = (Activity) context;
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(str);
            a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18693a("profile_enterprise_type", 0).mo18694a("cid", (String) null).mo18694a("refer", str2).mo18694a("video_from", "from_launch_forward").mo18695a());
            return;
        }
        Intent intent = new Intent(context, ForwardDetailActivity.class);
        intent.putExtra("forward_id", str);
        intent.putExtra("refer", str2);
        intent.putExtra("cid", null);
        context.startActivity(intent);
    }
}
