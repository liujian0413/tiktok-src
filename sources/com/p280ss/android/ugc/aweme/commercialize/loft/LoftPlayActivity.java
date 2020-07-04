package com.p280ss.android.ugc.aweme.commercialize.loft;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.loft.LoftPlayFragment.C24833a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity */
public final class LoftPlayActivity extends AmeSSActivity {

    /* renamed from: b */
    public static Bitmap f65426b;

    /* renamed from: c */
    public static final C24832a f65427c = new C24832a(null);

    /* renamed from: a */
    public View f65428a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity$a */
    public static final class C24832a {
        private C24832a() {
        }

        /* renamed from: a */
        public static Bitmap m81482a() {
            return LoftPlayActivity.f65426b;
        }

        public /* synthetic */ C24832a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static void m81483a(Bitmap bitmap) {
            LoftPlayActivity.f65426b = bitmap;
        }

        /* renamed from: a */
        public final void mo64926a(Context context, String str, Integer num, Bitmap bitmap) {
            C7573i.m23587b(str, "loftId");
            if (context != null) {
                m81483a(bitmap);
                Intent intent = new Intent(context, LoftPlayActivity.class);
                intent.putExtra("loft_event_type", "discovery_second_floor");
                intent.putExtra("loft_page_type", num);
                intent.putExtra("loft_id", str);
                context.startActivity(intent);
            }
        }
    }

    /* renamed from: a */
    public static final void m81481a(Context context, String str, Integer num, Bitmap bitmap) {
        f65427c.mo64926a(context, str, num, bitmap);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        View view = this.f65428a;
        if (view == null) {
            C7573i.m23583a("rootView");
        }
        view.setBackgroundColor(getResources().getColor(R.color.ac4));
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity", "onResume", true);
        super.onResume();
        View view = this.f65428a;
        if (view == null) {
            C7573i.m23583a("rootView");
        }
        view.setBackgroundColor(getResources().getColor(R.color.fs));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity", "onResume", false);
    }

    public final void setRootView(View view) {
        C7573i.m23587b(view, "<set-?>");
        this.f65428a = view;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView((int) R.layout.d1);
        Intent intent = getIntent();
        if (intent != null) {
            C0633q a = getSupportFragmentManager().mo2645a();
            String stringExtra = intent.getStringExtra("loft_event_type");
            int intExtra = intent.getIntExtra("loft_page_type", -1);
            String stringExtra2 = intent.getStringExtra("loft_id");
            C7573i.m23582a((Object) stringExtra2, "it.getStringExtra(LoftPlayFragment.LOFT_ID)");
            a.mo2585a((int) R.id.a24, (Fragment) C24833a.m81499a(stringExtra, intExtra, stringExtra2, true)).mo2606d();
        }
        View findViewById = findViewById(R.id.cws);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.root_view)");
        this.f65428a = findViewById;
        C23487o.m77149b((Activity) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity", "onCreate", false);
    }
}
