package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39168f;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.IStickPointMusicAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView */
public final class StickPointMusicView extends FrameLayout {

    /* renamed from: a */
    public C39168f f101652a;

    /* renamed from: b */
    private View f101653b;

    /* renamed from: c */
    private RecyclerView f101654c;

    /* renamed from: d */
    private View f101655d;

    /* renamed from: e */
    private View f101656e;

    /* renamed from: f */
    private View f101657f;

    /* renamed from: g */
    private View f101658g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView$a */
    final class C39216a extends LinearLayoutManager {

        /* renamed from: a */
        final /* synthetic */ StickPointMusicView f101659a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView$a$a */
        final class C39217a extends LinearSmoothScroller {

            /* renamed from: f */
            final /* synthetic */ C39216a f101660f;

            /* renamed from: a */
            public final float mo5464a(DisplayMetrics displayMetrics) {
                C7573i.m23587b(displayMetrics, "displayMetrics");
                return 150.0f / ((float) displayMetrics.densityDpi);
            }

            public C39217a(C39216a aVar, Context context) {
                C7573i.m23587b(context, "context");
                this.f101660f = aVar;
                super(context);
            }

            /* renamed from: a */
            public final int mo5466a(int i, int i2, int i3, int i4, int i5) {
                return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
            }
        }

        public C39216a(StickPointMusicView stickPointMusicView, Context context) {
            C7573i.m23587b(context, "context");
            this.f101659a = stickPointMusicView;
            super(context);
        }

        /* renamed from: a */
        public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
            C7573i.m23587b(recyclerView, "recyclerView");
            Context context = recyclerView.getContext();
            C7573i.m23582a((Object) context, "recyclerView.context");
            C39217a aVar = new C39217a(this, context);
            aVar.f4993g = i;
            mo5755a((C1287r) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView$b */
    static final class C39218b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StickPointMusicView f101661a;

        C39218b(StickPointMusicView stickPointMusicView) {
            this.f101661a = stickPointMusicView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C39168f fVar = this.f101661a.f101652a;
            if (fVar != null) {
                C7573i.m23582a((Object) view, "v");
                fVar.mo97325a(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView$c */
    static final class C39219c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StickPointMusicView f101662a;

        C39219c(StickPointMusicView stickPointMusicView) {
            this.f101662a = stickPointMusicView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C39168f fVar = this.f101662a.f101652a;
            if (fVar != null) {
                C7573i.m23582a((Object) view, "v");
                fVar.mo97329b(view);
            }
        }
    }

    public StickPointMusicView(Context context) {
        this(context, null, 0, 6, null);
    }

    public StickPointMusicView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo97537a() {
        View view = this.f101657f;
        if (view == null) {
            C7573i.m23583a("loadingView");
        }
        view.setVisibility(0);
        View view2 = this.f101658g;
        if (view2 == null) {
            C7573i.m23583a("contentView");
        }
        view2.setVisibility(8);
        View view3 = this.f101655d;
        if (view3 == null) {
            C7573i.m23583a("noDataView");
        }
        view3.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo97539b() {
        View view = this.f101658g;
        if (view == null) {
            C7573i.m23583a("contentView");
        }
        view.setVisibility(0);
        View view2 = this.f101657f;
        if (view2 == null) {
            C7573i.m23583a("loadingView");
        }
        view2.setVisibility(8);
        View view3 = this.f101655d;
        if (view3 == null) {
            C7573i.m23583a("noDataView");
        }
        view3.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo97540c() {
        View view = this.f101655d;
        if (view == null) {
            C7573i.m23583a("noDataView");
        }
        view.setVisibility(0);
        View view2 = this.f101658g;
        if (view2 == null) {
            C7573i.m23583a("contentView");
        }
        view2.setVisibility(8);
        View view3 = this.f101657f;
        if (view3 == null) {
            C7573i.m23583a("loadingView");
        }
        view3.setVisibility(8);
    }

    public final void setStickePointMusicListener(C39168f fVar) {
        C7573i.m23587b(fVar, "listener");
        this.f101652a = fVar;
    }

    /* renamed from: a */
    public final void mo97538a(int i) {
        RecyclerView recyclerView = this.f101654c;
        if (recyclerView == null) {
            C7573i.m23583a("musicRecyleView");
        }
        recyclerView.mo5561d(i);
    }

    public final void setRecyleViewAdapter(IStickPointMusicAdapter iStickPointMusicAdapter) {
        C7573i.m23587b(iStickPointMusicAdapter, "musicItemAdapter");
        RecyclerView recyclerView = this.f101654c;
        if (recyclerView == null) {
            C7573i.m23583a("musicRecyleView");
        }
        recyclerView.setAdapter(iStickPointMusicAdapter);
    }

    public final void setButtonClickable(boolean z) {
        View view = this.f101653b;
        if (view == null) {
            C7573i.m23583a("rootContentView");
        }
        if (view != null) {
            View view2 = this.f101653b;
            if (view2 == null) {
                C7573i.m23583a("rootContentView");
            }
            View findViewById = view2.findViewById(R.id.uz);
            C7573i.m23582a((Object) findViewById, "rootContentView.findView…w>(R.id.change_video_seg)");
            findViewById.setClickable(z);
        }
    }

    /* renamed from: a */
    private final void m125213a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.ab1, this);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…ngpoint_music_view, this)");
        this.f101653b = inflate;
        View view = this.f101653b;
        if (view == null) {
            C7573i.m23583a("rootContentView");
        }
        View findViewById = view.findViewById(R.id.a24);
        C7573i.m23582a((Object) findViewById, "rootContentView.findViewById(R.id.content_layout)");
        this.f101658g = findViewById;
        View view2 = this.f101653b;
        if (view2 == null) {
            C7573i.m23583a("rootContentView");
        }
        View findViewById2 = view2.findViewById(R.id.c4k);
        C7573i.m23582a((Object) findViewById2, "rootContentView.findViewById(R.id.no_data_view)");
        this.f101655d = findViewById2;
        View view3 = this.f101653b;
        if (view3 == null) {
            C7573i.m23583a("rootContentView");
        }
        View findViewById3 = view3.findViewById(R.id.csh);
        C7573i.m23582a((Object) findViewById3, "rootContentView.findViewById(R.id.retry_view)");
        this.f101656e = findViewById3;
        View view4 = this.f101653b;
        if (view4 == null) {
            C7573i.m23583a("rootContentView");
        }
        View findViewById4 = view4.findViewById(R.id.bu9);
        C7573i.m23582a((Object) findViewById4, "rootContentView.findViewById(R.id.loading_view)");
        this.f101657f = findViewById4;
        View view5 = this.f101653b;
        if (view5 == null) {
            C7573i.m23583a("rootContentView");
        }
        View findViewById5 = view5.findViewById(R.id.c1u);
        C7573i.m23582a((Object) findViewById5, "rootContentView.findView…Id(R.id.music_recyleview)");
        this.f101654c = (RecyclerView) findViewById5;
        C39216a aVar = new C39216a(this, context);
        aVar.mo5427b(0);
        RecyclerView recyclerView = this.f101654c;
        if (recyclerView == null) {
            C7573i.m23583a("musicRecyleView");
        }
        recyclerView.setLayoutManager(aVar);
        View view6 = this.f101653b;
        if (view6 == null) {
            C7573i.m23583a("rootContentView");
        }
        view6.findViewById(R.id.uz).setOnClickListener(new C39218b(this));
        View view7 = this.f101656e;
        if (view7 == null) {
            C7573i.m23583a("retryView");
        }
        view7.setOnClickListener(new C39219c(this));
    }

    public StickPointMusicView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        m125213a(context);
    }

    public /* synthetic */ StickPointMusicView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
