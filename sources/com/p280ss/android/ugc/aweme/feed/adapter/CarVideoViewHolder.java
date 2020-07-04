package com.p280ss.android.ugc.aweme.feed.adapter;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.net.Uri;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23087c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoDescWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoProgressBarWidget;
import com.p280ss.android.ugc.aweme.feed.helper.C28412a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28254o;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.CarVideoViewHolder */
public final class CarVideoViewHolder extends VideoViewHolder {
    public FrameLayout mTag;

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.CarVideoViewHolder$a */
    public static final class C28068a {

        /* renamed from: a */
        public View f73929a;

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.CarVideoViewHolder$a$a */
        static final class C28069a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C28068a f73930a;

            /* renamed from: b */
            final /* synthetic */ Aweme f73931b;

            C28069a(C28068a aVar, Aweme aweme) {
                this.f73930a = aVar;
                this.f73931b = aweme;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                String schema = this.f73931b.getDcdVideoExtra().getSchema();
                if (schema != null) {
                    C33471b a = new C33472a().mo85791b("general_search").mo85789a("microapp").mo85792c("022001").mo85790a();
                    C7167b b = C7167b.m22380b();
                    C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
                    IMiniAppService a2 = b.mo18647a();
                    if (a2 != null) {
                        Context context = this.f73930a.f73929a.getContext();
                        StringBuilder sb = new StringBuilder("sslocal://microapp?app_id=tt3ed7486aa1fd80c3&start_page=");
                        sb.append(Uri.encode(schema));
                        a2.openMiniApp(context, sb.toString(), a);
                    }
                }
            }
        }

        public C28068a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "container");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a4p, viewGroup, true);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…ication, container, true)");
            this.f73929a = inflate;
        }

        /* renamed from: a */
        public final void mo71515a(Aweme aweme) {
            C7573i.m23587b(aweme, "aweme");
            DmtTextView dmtTextView = (DmtTextView) this.f73929a.findViewById(R.id.abq);
            C7573i.m23582a((Object) dmtTextView, "mSpecification.dtv_specification");
            dmtTextView.setText(aweme.getTitle());
            this.f73929a.setOnClickListener(new C28069a(this, aweme));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo71514H() {
        this.f74252h = DataCenter.m75849a(C23087c.m75887a(this.f74132l, this), (C0043i) this.f74132l);
        this.f74252h.mo60132a("feed_internal_event", (C0053p<C23083a>) this);
        this.f74253i = WidgetManager.m75867a(this.f74132l, (View) this.mRootView);
        WidgetManager widgetManager = this.f74253i;
        C7573i.m23582a((Object) widgetManager, "mWidgetManager");
        widgetManager.mo60153a(this.f74252h);
        this.f74253i.mo60157b(R.id.ec0, new VideoDescWidget()).mo60152a((View) this.mBottomView, (Widget) new VideoProgressBarWidget());
        View findViewById = this.mRootView.findViewById(R.id.ec3);
        C7573i.m23582a((Object) findViewById, "mRootView.findViewById<V….id.videomusictitleblock)");
        findViewById.setVisibility(8);
        View findViewById2 = this.mRootView.findViewById(R.id.ec0);
        C7573i.m23582a((Object) findViewById2, "mRootView.findViewById<View>(R.id.videodescblock)");
        LayoutParams layoutParams = findViewById2.getLayoutParams();
        if (layoutParams != null) {
            ((MarginLayoutParams) layoutParams).bottomMargin = 0;
            mo71564o().mo64558a(this.f74252h);
            this.f74142v = WidgetManager.m75867a(this.f74132l, (View) this.mRootView);
            mo71646R();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: g */
    private final void m91720g(Aweme aweme) {
        FrameLayout frameLayout = this.mTag;
        if (frameLayout == null) {
            C7573i.m23583a("mTag");
        }
        new C28068a(frameLayout).mo71515a(aweme);
    }

    /* renamed from: a */
    public final void mo65708a(Aweme aweme) {
        super.mo65708a(aweme);
        if (aweme != null) {
            m91720g(aweme);
        }
        View findViewById = this.mRootView.findViewById(R.id.bkg);
        C7573i.m23582a((Object) findViewById, "mRootView.findViewById<View>(R.id.layout_title)");
        findViewById.setVisibility(8);
    }

    public CarVideoViewHolder(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams, C28254o oVar, C28412a aVar) {
        C7573i.m23587b(baseFeedPageParams, "baseFeedPageParams");
        super(view, zVar, onTouchListener, fragment, baseFeedPageParams, oVar, aVar);
    }
}
