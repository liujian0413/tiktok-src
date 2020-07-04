package com.p280ss.android.ugc.aweme.feed.adapter;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23087c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.discover.C26573b;
import com.p280ss.android.ugc.aweme.experiment.C27685a;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28325h;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.feedwidget.FeedAvatarWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoCommentWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget.C28350a;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoShareWidget;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.service.C28677a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.e */
public final class C28174e extends C28195w {

    /* renamed from: f */
    private View f74274f;

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.e$a */
    static final class C28175a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C28174e f74275a;

        C28175a(C28174e eVar) {
            this.f74275a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            this.f74275a.f74253i.mo60157b(R.id.a8y, new VideoDiggWidget(this.f74275a.f73944a, new C28350a(this) {

                /* renamed from: a */
                final /* synthetic */ C28175a f74276a;

                {
                    this.f74276a = r1;
                }

                /* renamed from: a */
                public final long mo71759a() {
                    return System.currentTimeMillis() - this.f74276a.f74275a.f73948e;
                }
            }));
            if (C27685a.f72985a.mo71140c()) {
                this.f74275a.f74253i.mo60157b(R.id.j3, new FeedAvatarWidget()).mo60157b(R.id.d5b, new VideoShareWidget()).mo60157b(R.id.ze, new VideoCommentWidget());
            } else {
                this.f74275a.mo71771s();
            }
            this.f74275a.mo71772t();
            this.f74275a.mo71773u();
            return null;
        }
    }

    /* renamed from: t */
    public final void mo71772t() {
        WidgetManager widgetManager = this.f74253i;
        C28134ag b = C28677a.m94348b();
        C7573i.m23582a((Object) b, "FeedComponentServiceUtil…tVideoViewHolderService()");
        widgetManager.mo60151a((int) R.id.ajc, b.mo71739f());
    }

    /* renamed from: u */
    public final void mo71773u() {
        WidgetManager widgetManager = this.f74253i;
        C28134ag b = C28677a.m94348b();
        C7573i.m23582a((Object) b, "FeedComponentServiceUtil…tVideoViewHolderService()");
        widgetManager.mo60151a((int) R.id.aja, b.mo71737d());
    }

    /* renamed from: s */
    public final void mo71771s() {
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
    /* renamed from: n */
    public final void mo71537n() {
        this.f74252h = DataCenter.m75849a(C23087c.m75887a(this.f73947d, this), (C0043i) this.f73947d);
        C0053p pVar = this;
        this.f74252h.mo60132a("update_diig_view", pVar).mo60132a("video_digg", pVar).mo60132a("feed_internal_event", pVar).mo60132a("video_share_click", pVar).mo60132a("to_profile", pVar).mo60132a("video_comment_list", pVar).mo60132a("video_barrage_comment_item", pVar).mo60132a("key_dislike_user", pVar);
        this.f74253i = WidgetManager.m75867a(this.f73947d, (View) this.mRootView);
        WidgetManager widgetManager = this.f74253i;
        C7573i.m23582a((Object) widgetManager, "mWidgetManager");
        widgetManager.mo60153a(this.f74252h);
        this.f74253i.mo60156a((Callable) new C28175a(this), C6384b.m19835a().mo15292a(DisableAsyncBindAB.class, true, "disable_async_widgetbind", C6384b.m19835a().mo15295d().disable_async_widgetbind, true));
    }

    /* renamed from: a */
    public final void mo65708a(Aweme aweme) {
        mo71529b(aweme);
    }

    /* renamed from: a */
    public final void mo71770a(boolean z) {
        this.f74252h.mo60134a("key_on_refresh", (Object) Boolean.valueOf(z));
    }

    /* renamed from: d */
    public final void mo71533d(boolean z) {
        super.mo71533d(z);
        C28195w.m91742a(this.f74274f, z);
    }

    /* renamed from: e */
    public final void mo71535e(boolean z) {
        super.mo71535e(z);
        if (z) {
            this.f74274f.animate().alpha(0.0f).setDuration(200).start();
        } else {
            this.f74274f.animate().alpha(1.0f).setDuration(200).start();
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
                    mo71526a(aVar.mo60161a());
                    if (this.mRootView != null) {
                        FrameLayout frameLayout = this.mRootView;
                        Fragment fragment = this.f73947d;
                        C7573i.m23582a((Object) fragment, "fragment");
                        frameLayout.setBackgroundColor(fragment.getResources().getColor(R.color.l3));
                    }
                }
            } else if (str.equals("key_dislike_user")) {
                User user = (User) aVar.mo60161a();
                if (user != null) {
                    if (!C28177f.m92532a(mo71539v())) {
                        C10761a.m31399c(mo71539v(), (int) R.string.cjs).mo25750a();
                        return;
                    }
                    C26573b H = C6903bc.m21467H();
                    String uid = user.getUid();
                    C7573i.m23582a((Object) uid, "uid");
                    H.mo67869a(uid);
                    C42961az.m136380a(new C28325h(user));
                    C10761a.m31399c(mo71539v(), (int) R.string.fh_).mo25750a();
                }
            }
        }
    }

    public C28174e(int i, View view, C28343z<C28318an> zVar, String str, OnTouchListener onTouchListener, Fragment fragment, int i2) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(zVar, "listener");
        C7573i.m23587b(str, "eventType");
        C7573i.m23587b(onTouchListener, "tapTouchListener");
        C7573i.m23587b(fragment, "fragment");
        super(i, view, zVar, str, onTouchListener, fragment, i2);
        View view2 = this.mBottomView;
        C7573i.m23582a((Object) view2, "mBottomView");
        LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            View view3 = this.mBottomView;
            C7573i.m23582a((Object) view3, "mBottomView");
            view3.setLayoutParams(marginLayoutParams);
            View findViewById = this.mRootView.findViewById(R.id.ajo);
            C7573i.m23582a((Object) findViewById, "mRootView.findViewById(R…_user_info_top_container)");
            this.f74274f = findViewById;
            View findViewById2 = this.mRootView.findViewById(R.id.ahu);
            C7573i.m23582a((Object) findViewById2, "mRootView.findViewById<V…id.familiar_title_shadow)");
            findViewById2.setVisibility(0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
