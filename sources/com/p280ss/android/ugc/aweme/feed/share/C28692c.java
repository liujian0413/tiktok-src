package com.p280ss.android.ugc.aweme.feed.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.PopupWindow;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.share.c */
public final class C28692c extends PopupWindow {

    /* renamed from: a */
    public static final C28693a f75569a = new C28693a(null);

    /* renamed from: b */
    private PullUpLayout f75570b;

    /* renamed from: c */
    private final Activity f75571c;

    /* renamed from: d */
    private final String f75572d;

    /* renamed from: e */
    private final UrlModel f75573e;

    /* renamed from: com.ss.android.ugc.aweme.feed.share.c$a */
    public static final class C28693a {
        private C28693a() {
        }

        public /* synthetic */ C28693a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.share.c$b */
    static final class C28694b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28692c f75574a;

        C28694b(C28692c cVar) {
            this.f75574a = cVar;
        }

        public final void run() {
            this.f75574a.mo73753b();
        }
    }

    /* renamed from: d */
    private final void m94407d() {
        setWidth(C9738o.m28691a((Context) this.f75571c));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.wk);
    }

    /* renamed from: b */
    public final void mo73753b() {
        if (isShowing()) {
            try {
                if (!this.f75571c.isFinishing()) {
                    PullUpLayout pullUpLayout = this.f75570b;
                    if (pullUpLayout == null) {
                        C7573i.m23583a("pullUpLayout");
                    }
                    pullUpLayout.mo66733a(0.0f, true);
                    dismiss();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private final void m94406c() {
        DmtTextView dmtTextView = (DmtTextView) getContentView().findViewById(R.id.d4p);
        C7573i.m23582a((Object) dmtTextView, "hintView");
        dmtTextView.setText(this.f75571c.getResources().getString(R.string.ds2, new Object[]{this.f75572d}));
        C23323e.m76524b((RemoteImageView) getContentView().findViewById(R.id.d4r), this.f75573e);
        View findViewById = getContentView().findViewById(R.id.clx);
        C7573i.m23582a((Object) findViewById, "contentView.findViewById(R.id.pull_layout)");
        this.f75570b = (PullUpLayout) findViewById;
        PullUpLayout pullUpLayout = this.f75570b;
        if (pullUpLayout == null) {
            C7573i.m23583a("pullUpLayout");
        }
        pullUpLayout.mo66734a(getContentView().findViewById(R.id.abf), false);
    }

    /* renamed from: a */
    public final void mo73752a() {
        PullUpLayout pullUpLayout = this.f75570b;
        if (pullUpLayout == null) {
            C7573i.m23583a("pullUpLayout");
        }
        pullUpLayout.mo66732a();
        if (!isShowing()) {
            View contentView = getContentView();
            C7573i.m23582a((Object) contentView, "contentView");
            if (contentView.getParent() != null) {
                View contentView2 = getContentView();
                C7573i.m23582a((Object) contentView2, "contentView");
                ViewParent parent = contentView2.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(getContentView());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            PullUpLayout pullUpLayout2 = this.f75570b;
            if (pullUpLayout2 == null) {
                C7573i.m23583a("pullUpLayout");
            }
            pullUpLayout2.postDelayed(new C28694b(this), 3000);
            Window window = this.f75571c.getWindow();
            C7573i.m23582a((Object) window, "ctx.window");
            showAtLocation(window.getDecorView(), 48, 0, 0);
        }
    }

    public C28692c(Activity activity, String str, UrlModel urlModel) {
        C7573i.m23587b(activity, "ctx");
        C7573i.m23587b(str, "channel");
        C7573i.m23587b(urlModel, "cover");
        super(activity);
        this.f75571c = activity;
        this.f75572d = str;
        this.f75573e = urlModel;
        setContentView(LayoutInflater.from(this.f75571c).inflate(R.layout.aa8, null));
        setBackgroundDrawable(new ColorDrawable(0));
        m94407d();
        m94406c();
    }
}
