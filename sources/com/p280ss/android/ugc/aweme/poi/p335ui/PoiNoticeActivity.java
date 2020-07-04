package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity */
public final class PoiNoticeActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C35259a f92394a = new C35259a(null);

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity$a */
    public static final class C35259a {
        private C35259a() {
        }

        public /* synthetic */ C35259a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m113797a(Context context, String str, PoiClassRankBannerStruct poiClassRankBannerStruct) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(str, "name");
            C7573i.m23587b(poiClassRankBannerStruct, "data");
            Intent intent = new Intent(context, PoiNoticeActivity.class);
            intent.putExtra("INTENT_TITLE", str);
            intent.putExtra("INTENT_DATA", poiClassRankBannerStruct);
            context.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity$b */
    static final class C35260b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiNoticeActivity f92395a;

        /* renamed from: b */
        final /* synthetic */ ObjectRef f92396b;

        C35260b(PoiNoticeActivity poiNoticeActivity, ObjectRef objectRef) {
            this.f92395a = poiNoticeActivity;
            this.f92396b = objectRef;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f92395a.finish();
        }
    }

    /* renamed from: a */
    public static final void m113796a(Context context, String str, PoiClassRankBannerStruct poiClassRankBannerStruct) {
        C35259a.m113797a(context, str, poiClassRankBannerStruct);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        if (C6399b.m19946v()) {
            ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).init();
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dz);
        if (VERSION.SDK_INT >= 19) {
            View findViewById = findViewById(R.id.dal);
            C7573i.m23582a((Object) findViewById, "findViewById<View>(R.id.status_bar)");
            findViewById.getLayoutParams().height = C10994a.m32204a((Context) this);
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("INTENT_DATA");
        if (serializableExtra != null) {
            PoiClassRankBannerStruct poiClassRankBannerStruct = (PoiClassRankBannerStruct) serializableExtra;
            ObjectRef objectRef = new ObjectRef();
            objectRef.element = getIntent().getStringExtra("INTENT_TITLE");
            if (poiClassRankBannerStruct != null) {
                View findViewById2 = findViewById(R.id.c5m);
                C7573i.m23582a((Object) findViewById2, "findViewById<TextView>(R.id.notice_title)");
                ((TextView) findViewById2).setText((String) objectRef.element);
                View findViewById3 = findViewById(R.id.c5l);
                C7573i.m23582a((Object) findViewById3, "findViewById<TextView>(R.id.notice_summary)");
                ((TextView) findViewById3).setText(poiClassRankBannerStruct.getTitle());
                View findViewById4 = findViewById(R.id.c5d);
                C7573i.m23582a((Object) findViewById4, "findViewById<TextView>(R.id.notice_content)");
                ((TextView) findViewById4).setText(poiClassRankBannerStruct.getDescription());
                C23323e.m76524b((RemoteImageView) findViewById(R.id.c5k), poiClassRankBannerStruct.getBannerUrl());
                findViewById(R.id.c5b).setOnClickListener(new C35260b(this, objectRef));
            }
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity", "onCreate", false);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct");
    }
}
