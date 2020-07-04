package com.p280ss.android.ugc.aweme.feed.adapter;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23087c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarWithBorderView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.mixfeed.p1182b.C26751a;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoDescWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoProgressBarWidget;
import com.p280ss.android.ugc.aweme.feed.helper.C28412a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28254o;
import com.p280ss.android.ugc.aweme.feed.param.FeedParamProvider.C28651a;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.XiGuaVideoViewHolder */
public final class XiGuaVideoViewHolder extends VideoViewHolder {

    /* renamed from: B */
    public static final C28124a f74191B = new C28124a(null);

    /* renamed from: A */
    public C26751a f74192A;
    public FrameLayout mAvatarPlace;
    public FrameLayout mXiaGuaTag;

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.XiGuaVideoViewHolder$a */
    public static final class C28124a {
        private C28124a() {
        }

        public /* synthetic */ C28124a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m92258a(String str, String str2) {
            HashMap hashMap = new HashMap();
            hashMap.put("to_user_id", str);
            hashMap.put(POIService.KEY_KEYWORD, str2);
            String a = C33447f.m108187a("microapp", "tt2bdc5d61b4f69b9e", "pages/index/index", hashMap, null);
            C7573i.m23582a((Object) a, "Utils.buildSchemByTools(… PATH_INDEX, query, null)");
            return a;
        }

        /* renamed from: a */
        public static String m92259a(String str, String str2, String str3) {
            HashMap hashMap = new HashMap();
            hashMap.put("group_id", str);
            hashMap.put(POIService.KEY_KEYWORD, str2);
            hashMap.put("to_user_id", str3);
            String a = C33447f.m108187a("microapp", "tt2bdc5d61b4f69b9e", "pages/detail/index", hashMap, null);
            C7573i.m23582a((Object) a, "Utils.buildSchemByTools(…PATH_DETAIL, query, null)");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.XiGuaVideoViewHolder$b */
    static final class C28125b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ XiGuaVideoViewHolder f74193a;

        C28125b(XiGuaVideoViewHolder xiGuaVideoViewHolder) {
            this.f74193a = xiGuaVideoViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            XiGuaVideoViewHolder xiGuaVideoViewHolder = this.f74193a;
            C7573i.m23582a((Object) view, "it");
            xiGuaVideoViewHolder.mo71728c(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.XiGuaVideoViewHolder$c */
    static final class C28126c<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ XiGuaVideoViewHolder f74194a;

        C28126c(XiGuaVideoViewHolder xiGuaVideoViewHolder) {
            this.f74194a = xiGuaVideoViewHolder;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            this.f74194a.f74253i.mo60157b(R.id.ec0, new VideoDescWidget()).mo60152a((View) this.f74194a.mBottomView, (Widget) new VideoProgressBarWidget());
            return null;
        }
    }

    /* renamed from: au */
    private void m92253au() {
        if (this.f74192A == null) {
            FrameLayout frameLayout = this.mXiaGuaTag;
            if (frameLayout == null) {
                C7573i.m23583a("mXiaGuaTag");
            }
            this.f74192A = new C26751a(frameLayout);
            C26751a aVar = this.f74192A;
            if (aVar != null) {
                aVar.mo68492a(this.f74130g, this.f74133m);
            }
        }
    }

    /* renamed from: av */
    private void m92254av() {
        LayoutInflater from = LayoutInflater.from(mo71647T());
        FrameLayout frameLayout = this.mAvatarPlace;
        if (frameLayout == null) {
            C7573i.m23583a("mAvatarPlace");
        }
        View inflate = from.inflate(R.layout.ac_, frameLayout, true);
        AvatarWithBorderView avatarWithBorderView = (AvatarWithBorderView) inflate.findViewById(R.id.e8m);
        if (this.f74130g != null) {
            Aweme aweme = this.f74130g;
            C7573i.m23582a((Object) aweme, "mAweme");
            if (aweme.getAuthor() != null) {
                Aweme aweme2 = this.f74130g;
                C7573i.m23582a((Object) aweme2, "mAweme");
                User author = aweme2.getAuthor();
                C7573i.m23582a((Object) author, "mAweme.author");
                if (author.getAvatarThumb() != null) {
                    RemoteImageView remoteImageView = avatarWithBorderView;
                    Aweme aweme3 = this.f74130g;
                    C7573i.m23582a((Object) aweme3, "mAweme");
                    User author2 = aweme3.getAuthor();
                    C7573i.m23582a((Object) author2, "mAweme.author");
                    C23323e.m76524b(remoteImageView, author2.getAvatarThumb());
                    inflate.setOnClickListener(new C28125b(this));
                }
            }
        }
        avatarWithBorderView.setBorderColor(R.color.dy);
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
        this.f74253i.mo60156a((Callable) new C28126c(this), this.f74138r);
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

    /* renamed from: a */
    public final void mo65708a(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        super.mo65708a(aweme);
        m92253au();
        m92254av();
    }

    public final void onClick(View view) {
        C7573i.m23587b(view, "view");
        if (view.getId() == R.id.title) {
            mo71728c(view);
        } else {
            super.onClick(view);
        }
    }

    /* renamed from: c */
    public final void mo71728c(View view) {
        C7573i.m23587b(view, "it");
        Context T = mo71647T();
        C7573i.m23582a((Object) T, "context");
        String searchKeyword = C28651a.m94274a(T).getSearchKeyword();
        Aweme aweme = this.f74130g;
        C7573i.m23582a((Object) aweme, "mAweme");
        User author = aweme.getAuthor();
        C7573i.m23582a((Object) author, "mAweme.author");
        String a = C28124a.m92258a(author.getUid(), searchKeyword);
        C7167b.m22380b().mo18647a().openMiniApp(mo71647T(), a, new C33472a().mo85792c("022003").mo85791b("ixigua_full_screen_player").mo85789a("head").mo85790a());
        Aweme h = mo65711h();
        C7573i.m23582a((Object) h, "aweme");
        C6907h.m21524a("mp_click", (Map) C22984d.m75611a().mo59973a("mp_id", C33447f.m108186a(a)).mo59973a("group_id", h.getAid()).mo59973a("position", "pgc").mo59973a("enter_from", "general_search").mo59970a("rank", this.f74133m).mo59973a("search_id", mo65711h().getRequestId()).mo59973a("query", searchKeyword).f60753a);
    }

    public XiGuaVideoViewHolder(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams, C28254o oVar, C28412a aVar) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(zVar, "listener");
        C7573i.m23587b(onTouchListener, "tapTouchListener");
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(baseFeedPageParams, "baseFeedPageParams");
        C7573i.m23587b(oVar, "iHandlePlay");
        C7573i.m23587b(aVar, "feedAllScreenHelper");
        super(view, zVar, onTouchListener, fragment, baseFeedPageParams, oVar, aVar);
        View findViewById = view.findViewById(R.id.ajl);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.feed_tag_layout)");
        this.mXiaGuaTag = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.ec2);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.videomusiccoverblock)");
        this.mAvatarPlace = (FrameLayout) findViewById2;
    }
}
