package com.p280ss.android.ugc.aweme.forward.view;

import android.os.Bundle;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29371f;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.p280ss.android.ugc.aweme.utils.C43076dy;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.forward.view.FeedDetailActivity */
public class FeedDetailActivity extends AmeBaseActivity {

    /* renamed from: a */
    public String f78716a;

    /* renamed from: b */
    public String f78717b;

    /* renamed from: c */
    public String f78718c;

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.bn;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    /* renamed from: c */
    public static boolean m98162c() {
        return C6405d.m19984g() instanceof FeedDetailActivity;
    }

    public void onResume() {
        super.onResume();
        if (!C43076dy.m136656a()) {
            C34138b.m109993b();
        }
    }

    public void onPause() {
        super.onPause();
        if (!C29371f.m96475a().mo75105b()) {
            C34138b.m110006c(this.f78716a, C22704b.f60415d);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
