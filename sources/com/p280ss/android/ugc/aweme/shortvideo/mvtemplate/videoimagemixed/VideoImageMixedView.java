package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import android.content.Context;
import android.support.p029v7.widget.DefaultItemAnimator;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView */
public final class VideoImageMixedView extends FrameLayout {

    /* renamed from: a */
    public RecyclerView f104405a;

    /* renamed from: b */
    private View f104406b;

    /* renamed from: c */
    private DmtTextView f104407c;

    /* renamed from: d */
    private DmtTextView f104408d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView$a */
    final class C40164a extends LinearLayoutManager {

        /* renamed from: a */
        final /* synthetic */ VideoImageMixedView f104409a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView$a$a */
        final class C40165a extends LinearSmoothScroller {

            /* renamed from: f */
            final /* synthetic */ C40164a f104410f;

            /* renamed from: a */
            public final float mo5464a(DisplayMetrics displayMetrics) {
                C7573i.m23587b(displayMetrics, "displayMetrics");
                return 300.0f / ((float) displayMetrics.densityDpi);
            }

            public C40165a(C40164a aVar, Context context) {
                C7573i.m23587b(context, "context");
                this.f104410f = aVar;
                super(context);
            }

            /* renamed from: a */
            public final int mo5466a(int i, int i2, int i3, int i4, int i5) {
                return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
            }
        }

        public C40164a(VideoImageMixedView videoImageMixedView, Context context) {
            C7573i.m23587b(context, "context");
            this.f104409a = videoImageMixedView;
            super(context);
            mo5427b(0);
        }

        /* renamed from: a */
        public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
            C7573i.m23587b(recyclerView, "recyclerView");
            Context context = recyclerView.getContext();
            C7573i.m23582a((Object) context, "recyclerView.context");
            C40165a aVar = new C40165a(this, context);
            aVar.f4993g = i;
            mo5755a((C1287r) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView$b */
    static final class C40166b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoImageMixedView f104411a;

        C40166b(VideoImageMixedView videoImageMixedView) {
            this.f104411a = videoImageMixedView;
        }

        public final void run() {
            VideoImageMixedView.m128324a(this.f104411a).setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView$c */
    static final class C40167c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoImageMixedView f104412a;

        C40167c(VideoImageMixedView videoImageMixedView) {
            this.f104412a = videoImageMixedView;
        }

        public final void run() {
            VideoImageMixedView.m128324a(this.f104412a).setVisibility(8);
        }
    }

    public VideoImageMixedView(Context context) {
        this(context, null, 2, null);
    }

    public final RecyclerView getMediaSelectRecyleView() {
        RecyclerView recyclerView = this.f104405a;
        if (recyclerView == null) {
            C7573i.m23583a("mediaSelectRecyleView");
        }
        return recyclerView;
    }

    public final DmtTextView getSureTextView() {
        DmtTextView dmtTextView = this.f104407c;
        if (dmtTextView == null) {
            C7573i.m23583a("sureTextView");
        }
        return dmtTextView;
    }

    /* renamed from: a */
    public static final /* synthetic */ RecyclerView m128324a(VideoImageMixedView videoImageMixedView) {
        RecyclerView recyclerView = videoImageMixedView.f104405a;
        if (recyclerView == null) {
            C7573i.m23583a("mediaSelectRecyleView");
        }
        return recyclerView;
    }

    /* renamed from: a */
    public final void mo99921a(int i) {
        View view;
        if (i > 3) {
            RecyclerView recyclerView = this.f104405a;
            if (recyclerView == null) {
                C7573i.m23583a("mediaSelectRecyleView");
            }
            C1293v f = recyclerView.mo5575f(i - 3);
            if (f != null) {
                view = f.itemView;
            } else {
                view = null;
            }
            if (view == null) {
                RecyclerView recyclerView2 = this.f104405a;
                if (recyclerView2 == null) {
                    C7573i.m23583a("mediaSelectRecyleView");
                }
                recyclerView2.mo5541b(i - 1);
                return;
            }
            RecyclerView recyclerView3 = this.f104405a;
            if (recyclerView3 == null) {
                C7573i.m23583a("mediaSelectRecyleView");
            }
            recyclerView3.mo5561d(i - 1);
        }
    }

    /* renamed from: a */
    private final void m128325a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.ac1, this);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…_mixed_bottom_view, this)");
        this.f104406b = inflate;
        View view = this.f104406b;
        if (view == null) {
            C7573i.m23583a("contentRootView");
        }
        View findViewById = view.findViewById(R.id.bxl);
        C7573i.m23582a((Object) findViewById, "contentRootView.findView…Id(R.id.media_recyleview)");
        this.f104405a = (RecyclerView) findViewById;
        View view2 = this.f104406b;
        if (view2 == null) {
            C7573i.m23583a("contentRootView");
        }
        View findViewById2 = view2.findViewById(R.id.ddn);
        C7573i.m23582a((Object) findViewById2, "contentRootView.findViewById(R.id.sure_view)");
        this.f104407c = (DmtTextView) findViewById2;
        View view3 = this.f104406b;
        if (view3 == null) {
            C7573i.m23583a("contentRootView");
        }
        View findViewById3 = view3.findViewById(R.id.ear);
        C7573i.m23582a((Object) findViewById3, "contentRootView.findView…d.video_image_mixed_text)");
        this.f104408d = (DmtTextView) findViewById3;
        RecyclerView recyclerView = this.f104405a;
        if (recyclerView == null) {
            C7573i.m23583a("mediaSelectRecyleView");
        }
        recyclerView.setLayoutManager(new C40164a(this, context));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.f4940i = 250;
        defaultItemAnimator.f4942k = 250;
        defaultItemAnimator.f4941j = 250;
        defaultItemAnimator.f4943l = 250;
        RecyclerView recyclerView2 = this.f104405a;
        if (recyclerView2 == null) {
            C7573i.m23583a("mediaSelectRecyleView");
        }
        recyclerView2.setItemAnimator(defaultItemAnimator);
    }

    /* renamed from: a */
    public final void mo99923a(boolean z) {
        if (z) {
            RecyclerView recyclerView = this.f104405a;
            if (recyclerView == null) {
                C7573i.m23583a("mediaSelectRecyleView");
            }
            recyclerView.postDelayed(new C40166b(this), 250);
            return;
        }
        RecyclerView recyclerView2 = this.f104405a;
        if (recyclerView2 == null) {
            C7573i.m23583a("mediaSelectRecyleView");
        }
        recyclerView2.post(new C40167c(this));
    }

    public VideoImageMixedView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        m128325a(context);
    }

    /* renamed from: a */
    public final void mo99922a(String str, boolean z) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            DmtTextView dmtTextView = this.f104408d;
            if (dmtTextView == null) {
                C7573i.m23583a("hintTextView");
            }
            dmtTextView.setText(charSequence);
        } else if (z) {
            DmtTextView dmtTextView2 = this.f104408d;
            if (dmtTextView2 == null) {
                C7573i.m23583a("hintTextView");
            }
            dmtTextView2.setText("");
        }
    }

    public /* synthetic */ VideoImageMixedView(Context context, AttributeSet attributeSet, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }
}
