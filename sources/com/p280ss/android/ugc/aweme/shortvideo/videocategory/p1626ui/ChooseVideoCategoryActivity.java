package com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1626ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p022v4.app.Fragment;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1626ui.ChooseVideoCategoryFragment.C41620b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryActivity */
public final class ChooseVideoCategoryActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C41616a f108128a = new C41616a(null);

    /* renamed from: b */
    private VideoCategoryParam f108129b;

    /* renamed from: c */
    private AVETParameter f108130c;

    /* renamed from: d */
    private ChooseVideoCategoryFragment f108131d;

    /* renamed from: e */
    private HashMap f108132e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryActivity$a */
    public static final class C41616a {
        private C41616a() {
        }

        public /* synthetic */ C41616a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m132500a(Activity activity, VideoCategoryParam videoCategoryParam, AVETParameter aVETParameter, int i) {
            C7573i.m23587b(activity, "host");
            C7573i.m23587b(aVETParameter, "mobParam");
            Intent intent = new Intent(activity, ChooseVideoCategoryActivity.class);
            intent.putExtra("KEY_VIDEO_DEFAULT_CATEGORY", videoCategoryParam);
            intent.putExtra("key_video_mob_param", aVETParameter);
            activity.startActivityForResult(intent, 6);
            activity.overridePendingTransition(R.anim.s, R.anim.t);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryActivity$b */
    public static final class C41617b implements C10797a {

        /* renamed from: a */
        final /* synthetic */ ChooseVideoCategoryActivity f108133a;

        /* renamed from: b */
        public final void mo25896b(View view) {
        }

        C41617b(ChooseVideoCategoryActivity chooseVideoCategoryActivity) {
            this.f108133a = chooseVideoCategoryActivity;
        }

        /* renamed from: a */
        public final void mo25895a(View view) {
            this.f108133a.mo102236a();
        }
    }

    /* renamed from: a */
    private View m132494a(int i) {
        if (this.f108132e == null) {
            this.f108132e = new HashMap();
        }
        View view = (View) this.f108132e.get(Integer.valueOf(R.id.djz));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.djz);
        this.f108132e.put(Integer.valueOf(R.id.djz), findViewById);
        return findViewById;
    }

    public final void onBackPressed() {
        mo102236a();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: e */
    private final VideoCategoryParam m132498e() {
        ChooseVideoCategoryFragment chooseVideoCategoryFragment = this.f108131d;
        if (chooseVideoCategoryFragment != null) {
            return chooseVideoCategoryFragment.mo102247d();
        }
        return null;
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.s, R.anim.t);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: a */
    public final void mo102236a() {
        setResult(-1, new Intent().putExtra("KEY_VIDEO_CATEGORY_CHOOSE_RESULT", m132498e()));
        finish();
    }

    /* renamed from: b */
    private final void m132495b() {
        Parcelable parcelableExtra = getIntent().getParcelableExtra("KEY_VIDEO_DEFAULT_CATEGORY");
        if (!(parcelableExtra instanceof VideoCategoryParam)) {
            parcelableExtra = null;
        }
        this.f108129b = (VideoCategoryParam) parcelableExtra;
        Serializable serializableExtra = getIntent().getSerializableExtra("key_video_mob_param");
        if (serializableExtra != null) {
            this.f108130c = (AVETParameter) serializableExtra;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.model.AVETParameter");
    }

    /* renamed from: d */
    private final void m132497d() {
        if (getSupportFragmentManager().mo2642a((int) R.id.aoy) == null) {
            VideoCategoryParam videoCategoryParam = this.f108129b;
            AVETParameter aVETParameter = this.f108130c;
            if (aVETParameter == null) {
                C7573i.m23583a("mMobParam");
            }
            ChooseVideoCategoryFragment a = C41620b.m132518a(videoCategoryParam, aVETParameter);
            this.f108131d = a;
            getSupportFragmentManager().mo2645a().mo2585a((int) R.id.aoy, (Fragment) a).mo2604c();
        }
    }

    /* renamed from: c */
    private final void m132496c() {
        ((NormalTitleBar) m132494a(R.id.djz)).setOnTitleBarClickListener(new C41617b(this));
        ((NormalTitleBar) m132494a(R.id.djz)).setStartBtnIcon(R.drawable.ff);
        boolean z = true;
        ImmersionBar fitsSystemWindows = ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).fitsSystemWindows(true);
        if (!C6399b.m19946v()) {
            Object service = ServiceManager.get().getService(IMainService.class);
            C7573i.m23582a(service, "ServiceManager.get().get…IMainService::class.java)");
            if (!((IMainService) service).isTiktokWhite()) {
                z = false;
            }
        }
        fitsSystemWindows.statusBarDarkFont(z).init();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.av);
        m132495b();
        m132496c();
        m132497d();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryActivity", "onCreate", false);
    }
}
