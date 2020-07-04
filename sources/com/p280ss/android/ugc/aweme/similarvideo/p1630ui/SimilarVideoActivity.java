package com.p280ss.android.ugc.aweme.similarvideo.p1630ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.similarvideo.p1630ui.SimilarVideoFragment.C41725a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoActivity */
public class SimilarVideoActivity extends AmeSSActivity {

    /* renamed from: a */
    public static Aweme f108598a;

    /* renamed from: b */
    private static Activity f108599b;

    public void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    /* renamed from: a */
    private void m132836a() {
        View findViewById = findViewById(R.id.dal);
        if (VERSION.SDK_INT >= 19) {
            findViewById.getLayoutParams().height = C10994a.m32204a((Context) this);
        }
        findViewById(R.id.b6v).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SimilarVideoActivity.this.finish();
            }
        });
        m132838b();
    }

    /* renamed from: b */
    private void m132838b() {
        String str;
        if (f108598a == null) {
            str = null;
        } else {
            str = f108598a.getAid();
        }
        SimilarVideoFragment a = SimilarVideoFragment.m132840a(str);
        if (a != null) {
            a.f108603e = new C41725a() {
                /* renamed from: a */
                public final void mo102494a() {
                    if (SimilarVideoActivity.f108598a != null && SimilarVideoActivity.f108598a.getVideo() != null) {
                        C23323e.m76524b((RemoteImageView) SimilarVideoActivity.this.findViewById(R.id.d6x), SimilarVideoActivity.f108598a.getVideo().getCover());
                    }
                }
            };
            C0633q a2 = getSupportFragmentManager().mo2645a();
            a2.mo2600b(R.id.d6w, a, "similar_video_contain");
            a2.mo2606d();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.et);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("aweme_to_similar")) {
            f108598a = (Aweme) intent.getSerializableExtra("aweme_to_similar");
        }
        m132836a();
    }

    /* renamed from: a */
    public static void m132837a(Context context, Aweme aweme) {
        if (context != null && aweme != null) {
            f108599b = (Activity) context;
            Intent intent = new Intent(context, SimilarVideoActivity.class);
            intent.putExtra("aweme_to_similar", aweme);
            context.startActivity(intent);
            f108599b.overridePendingTransition(R.anim.s, 0);
        }
    }
}
