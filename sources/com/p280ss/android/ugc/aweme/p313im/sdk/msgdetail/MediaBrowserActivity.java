package com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.p313im.sdk.common.BaseContainerActivity;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserActivity */
public final class MediaBrowserActivity extends BaseContainerActivity {

    /* renamed from: a */
    public static final C31538a f82551a = new C31538a(null);

    /* renamed from: b */
    private MediaBrowserFragment f82552b;

    /* renamed from: c */
    private C31544a f82553c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserActivity$a */
    public static final class C31538a {
        private C31538a() {
        }

        public /* synthetic */ C31538a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m102521a(Context context, C31544a aVar) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(aVar, "param");
            Intent intent = new Intent(context, MediaBrowserActivity.class);
            aVar.mo82255a(intent);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static final void m102518a(Context context, C31544a aVar) {
        C31538a.m102521a(context, aVar);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserActivity", "onCreate", false);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    /* renamed from: a */
    public final void mo81547a() {
        this.f82553c = new C31544a().mo82257b(getIntent());
    }

    public final void onBackPressed() {
        MediaBrowserFragment mediaBrowserFragment = this.f82552b;
        if (mediaBrowserFragment == null) {
            C7573i.m23583a("fragment");
        }
        mediaBrowserFragment.mo82252l();
    }

    public final void onDestroy() {
        super.onDestroy();
        C31544a.f82575f.mo82263a();
    }

    /* renamed from: b */
    public final Fragment mo81548b() {
        this.f82552b = new MediaBrowserFragment();
        MediaBrowserFragment mediaBrowserFragment = this.f82552b;
        if (mediaBrowserFragment == null) {
            C7573i.m23583a("fragment");
        }
        C31544a aVar = this.f82553c;
        if (aVar == null) {
            C7573i.m23583a("param");
        }
        mediaBrowserFragment.setArguments(aVar.mo82256a(new Bundle()));
        MediaBrowserFragment mediaBrowserFragment2 = this.f82552b;
        if (mediaBrowserFragment2 == null) {
            C7573i.m23583a("fragment");
        }
        return mediaBrowserFragment2;
    }
}
