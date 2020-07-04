package com.p280ss.android.ugc.gamora.recorder;

import android.arch.lifecycle.C0043i;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.shortvideo.guide.DefaultStickerGuidePresenter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C41018x;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.IStickerGuidePresenter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.impl.C40639s;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.tabguide.DefaultStickerTabGuidePresenter.C40935a;
import com.p280ss.android.ugc.gamora.recorder.C44453ag.C44455a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.ah */
public final class C44456ah {

    /* renamed from: a */
    public static final C44456ah f114724a = new C44456ah();

    /* renamed from: com.ss.android.ugc.gamora.recorder.ah$a */
    static final class C44457a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40994w f114725a;

        C44457a(C40994w wVar) {
            this.f114725a = wVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f114725a.mo100320l();
        }
    }

    private C44456ah() {
    }

    /* renamed from: a */
    private static void m140628a(AppCompatActivity appCompatActivity, C0043i iVar, C40994w wVar, String str, View view, FrameLayout frameLayout) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(wVar, "stickerModule");
        C7573i.m23587b(str, "panel");
        C7573i.m23587b(view, "rootView");
        C7573i.m23587b(frameLayout, "stickerRootView");
        wVar.mo100279a(C44455a.m140627a(appCompatActivity, iVar, view, new C44457a(wVar)));
        View findViewById = appCompatActivity.findViewById(R.id.bj9);
        if (findViewById == null) {
            C7573i.m23580a();
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById;
        wVar.mo100270a(frameLayout2);
        wVar.mo100281a((C41018x) C40639s.m129925a(str, frameLayout));
        DefaultStickerGuidePresenter defaultStickerGuidePresenter = new DefaultStickerGuidePresenter(frameLayout2);
        defaultStickerGuidePresenter.mo99409a(iVar);
        wVar.mo100275a((IStickerGuidePresenter) defaultStickerGuidePresenter);
        wVar.mo100276a(C40935a.m130776a(frameLayout2));
    }

    /* renamed from: a */
    public static /* synthetic */ void m140629a(C44456ah ahVar, AppCompatActivity appCompatActivity, C0043i iVar, C40994w wVar, String str, View view, FrameLayout frameLayout, int i, Object obj) {
        View findViewById = appCompatActivity.findViewById(R.id.bj7);
        if (findViewById == null) {
            C7573i.m23580a();
        }
        m140628a(appCompatActivity, iVar, wVar, str, view, (FrameLayout) findViewById);
    }
}
