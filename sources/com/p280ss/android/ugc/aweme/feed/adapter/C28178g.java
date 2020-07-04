package com.p280ss.android.ugc.aweme.feed.adapter;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23087c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.experiment.C27685a;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.feedwidget.FeedAvatarWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoCommentWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget.C28350a;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoProgressBarWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoShareWidget;
import com.p280ss.android.ugc.aweme.feed.helper.C28412a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28254o;
import com.p280ss.android.ugc.aweme.feed.service.C28677a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.g */
public final class C28178g extends C28196x {

    /* renamed from: A */
    private View f74277A;

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.g$a */
    static final class C28179a implements C28350a {

        /* renamed from: a */
        final /* synthetic */ C28178g f74278a;

        C28179a(C28178g gVar) {
            this.f74278a = gVar;
        }

        /* renamed from: a */
        public final long mo71759a() {
            return System.currentTimeMillis() - this.f74278a.f74128e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final void mo71637I() {
    }

    /* renamed from: av */
    private final void m92534av() {
        WidgetManager widgetManager = this.f74253i;
        C28134ag b = C28677a.m94348b();
        C7573i.m23582a((Object) b, "FeedComponentServiceUtil…tVideoViewHolderService()");
        widgetManager.mo60151a((int) R.id.ajc, b.mo71739f());
    }

    /* renamed from: aw */
    private final void m92535aw() {
        WidgetManager widgetManager = this.f74253i;
        C28134ag b = C28677a.m94348b();
        C7573i.m23582a((Object) b, "FeedComponentServiceUtil…tVideoViewHolderService()");
        widgetManager.mo60151a((int) R.id.aja, b.mo71737d());
    }

    /* renamed from: au */
    private final void m92533au() {
        if (C27685a.f72985a.mo71139b()) {
            WidgetManager widgetManager = this.f74253i;
            C28134ag b = C28677a.m94348b();
            C7573i.m23582a((Object) b, "FeedComponentServiceUtil…tVideoViewHolderService()");
            widgetManager.mo60151a((int) R.id.ajn, b.mo71738e());
            return;
        }
        if (C27685a.f72985a.mo71137a()) {
            WidgetManager widgetManager2 = this.f74253i;
            C28134ag b2 = C28677a.m94348b();
            C7573i.m23582a((Object) b2, "FeedComponentServiceUtil…tVideoViewHolderService()");
            widgetManager2.mo60151a((int) R.id.ajo, b2.mo71738e());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo71514H() {
        this.f74252h = DataCenter.m75849a(C23087c.m75887a(this.f74132l, this), (C0043i) this.f74132l);
        C0053p pVar = this;
        this.f74252h.mo60132a("feed_internal_event", pVar).mo60132a("to_profile", pVar).mo60132a("dismiss_dou_pop", pVar).mo60132a("is_show_music_guide", pVar).mo60132a("update_diig_view", pVar).mo60132a("video_comment_list", pVar).mo60132a("video_barrage_comment_item", pVar).mo60132a("video_share_click", pVar).mo60132a("video_digg", pVar).mo60132a("show_poi_distance", pVar).mo60132a("key_dislike_user", pVar);
        this.f74253i = WidgetManager.m75867a(this.f74132l, (View) this.mRootView);
        WidgetManager widgetManager = this.f74253i;
        C7573i.m23582a((Object) widgetManager, "mWidgetManager");
        widgetManager.mo60153a(this.f74252h);
        WidgetManager a = this.f74253i.mo60152a((View) this.mBottomView, (Widget) new VideoProgressBarWidget());
        VideoDiggWidget videoDiggWidget = new VideoDiggWidget(mo71648U(), mo71649V(), mo71650W(), mo71652Y(), mo71651X(), new C28179a(this));
        a.mo60157b(R.id.a8y, videoDiggWidget);
        this.f74142v = WidgetManager.m75867a(this.f74132l, (View) this.mRootView);
        mo71564o().mo64558a(this.f74252h);
        mo71564o().mo64559a(this.f74253i);
        mo71646R();
        if (C27685a.f72985a.mo71140c()) {
            this.f74253i.mo60152a((View) this.mBottomView, (Widget) new VideoProgressBarWidget()).mo60157b(R.id.ze, new VideoCommentWidget()).mo60157b(R.id.d5b, new VideoShareWidget()).mo60157b(R.id.j3, new FeedAvatarWidget());
        } else {
            m92533au();
        }
        m92534av();
        m92535aw();
    }

    /* renamed from: a */
    public final void mo65708a(Aweme aweme) {
        mo71696f(aweme);
    }

    /* renamed from: d */
    public final void mo71533d(boolean z) {
        super.mo71533d(z);
        mo71658a(this.f74277A, z);
    }

    /* renamed from: k */
    public final void mo71775k(boolean z) {
        this.f74252h.mo60134a("key_on_refresh", (Object) Boolean.valueOf(z));
    }

    /* renamed from: e */
    public final void mo71535e(boolean z) {
        super.mo71535e(z);
        if (z) {
            this.f74277A.animate().alpha(0.0f).setDuration(200).start();
        } else {
            this.f74277A.animate().alpha(1.0f).setDuration(200).start();
        }
    }

    /* renamed from: a */
    public final void onChanged(C23083a aVar) {
        String str;
        super.onChanged(aVar);
        if (aVar != null) {
            str = aVar.f60948a;
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -965987195) {
                if (hashCode == 1159399990 && str.equals("video_barrage_comment_item")) {
                    mo71666a(aVar.mo60161a());
                    if (this.mRootView != null) {
                        FrameLayout frameLayout = this.mRootView;
                        Fragment fragment = this.f74132l;
                        C7573i.m23582a((Object) fragment, "fragment");
                        frameLayout.setBackgroundColor(fragment.getResources().getColor(R.color.l3));
                    }
                }
            } else if (str.equals("key_dislike_user")) {
                mo71664a((User) aVar.mo60161a());
            }
        }
    }

    public C28178g(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams, C28254o oVar, C28412a aVar) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(zVar, "listener");
        C7573i.m23587b(onTouchListener, "tapTouchListener");
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(baseFeedPageParams, "baseFeedPageParams");
        C7573i.m23587b(oVar, "iHandlePlay");
        C7573i.m23587b(aVar, "feedAllScreenHelper");
        super(view, zVar, onTouchListener, fragment, baseFeedPageParams, oVar, aVar);
        FrameLayout frameLayout = this.mBottomView;
        C7573i.m23582a((Object) frameLayout, "mBottomView");
        LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            FrameLayout frameLayout2 = this.mBottomView;
            C7573i.m23582a((Object) frameLayout2, "mBottomView");
            frameLayout2.setLayoutParams(marginLayoutParams);
            View findViewById = this.mRootView.findViewById(R.id.ajo);
            C7573i.m23582a((Object) findViewById, "mRootView.findViewById(R…_user_info_top_container)");
            this.f74277A = findViewById;
            View findViewById2 = this.mRootView.findViewById(R.id.ahu);
            C7573i.m23582a((Object) findViewById2, "mRootView.findViewById<V…id.familiar_title_shadow)");
            findViewById2.setVisibility(0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
