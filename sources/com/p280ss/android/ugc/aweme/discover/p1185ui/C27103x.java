package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewStub;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.detail.p1160d.C26056a;
import com.p280ss.android.ugc.aweme.detail.p1165i.C26071a;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4.Companion;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p280ss.android.ugc.aweme.experiment.DiscoveryV4Experiment;
import com.p280ss.android.ugc.aweme.feed.C28230c;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.guide.p1232a.C28385a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33233af;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.x */
public final class C27103x extends C26071a implements C28385a {

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.x$a */
    static final class C27104a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C27103x f71482a;

        C27104a(C27103x xVar) {
            this.f71482a = xVar;
        }

        public final void run() {
            this.f71482a.mo71902ah();
            C26056a.m85588f(false);
        }
    }

    /* renamed from: F */
    public final String mo69887F() {
        return "playlist_id";
    }

    /* renamed from: J */
    public final void mo69891J() {
    }

    /* renamed from: G */
    public final String mo69888G() {
        FeedParam feedParam = this.f75327V;
        C7573i.m23582a((Object) feedParam, "param");
        String cellId = feedParam.getCellId();
        C7573i.m23582a((Object) cellId, "param.cellId");
        return cellId;
    }

    /* renamed from: I */
    public final void mo69890I() {
        if (C26056a.m85587e(true)) {
            this.f68889b.postDelayed(new C27104a(this), 2000);
        }
    }

    public final void ae_() {
        if (this.f68891c != null) {
            this.f68891c.mo62419c();
        }
        DmtStatusView n = mo73419n(true);
        if (n != null) {
            n.setVisibility(0);
            n.mo25943g();
        }
    }

    /* renamed from: H */
    public final String mo69889H() {
        if (C6384b.m19835a().mo15287a(DiscoveryV4Experiment.class, true, "discover_v4_type", C6384b.m19835a().mo15295d().discover_v4_type, 0) == 1) {
            return DiscoverPlayListStructV4.Companion.getPlayListType(2);
        }
        Companion companion = DiscoverPlayListStructV4.Companion;
        FeedParam feedParam = this.f75327V;
        C7573i.m23582a((Object) feedParam, "param");
        return companion.getPlayListType(feedParam.getType());
    }

    /* renamed from: b */
    public final void mo69893b(View view) {
        this.f75347aa = this;
    }

    /* renamed from: b */
    public final void mo67618b(List<Aweme> list) {
        super.mo67618b(list);
        C28230c cVar = this.f75326U;
        String H = mo69889H();
        String F = mo69887F();
        String G = mo69888G();
        FeedParam feedParam = this.f75327V;
        C7573i.m23582a((Object) feedParam, "param");
        cVar.mo71832a(H, F, G, feedParam.getTabName());
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (this.f68891c != null) {
            this.f68891c.mo62419c();
        }
        C22814a.m75244a(C6399b.m19921a(), (Throwable) exc);
        DmtStatusView n = mo73419n(true);
        if (n != null) {
            n.setVisibility(0);
            n.mo25944h();
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<Object> list, boolean z) {
        super.mo59099a((List) list, z);
        FeedParam feedParam = this.f75327V;
        C7573i.m23582a((Object) feedParam, "param");
        if (feedParam.getCellDetailType() == 1 && this.f68895g != null) {
            this.f68895g.mo67746g();
        }
    }

    /* renamed from: a */
    public final void mo67607a(C28130ac acVar, String str) {
        C7573i.m23587b(acVar, "baseHolder");
        C7573i.m23587b(str, "eventType");
        C33233af e = new C33233af().mo85061a(str).mo85063b(str).mo85074k(mo69888G()).mo85073j(mo69887F()).mo85072i(mo69889H()).mo85071g(acVar.mo65711h()).mo85067e(String.valueOf(this.f68901m));
        FeedParam feedParam = this.f75327V;
        C7573i.m23582a((Object) feedParam, "param");
        ((C33233af) ((C33233af) e.mo85283l(feedParam.getTabName())).mo85284m(C33230ac.m107216b(acVar.mo65711h(), mo71888Y()))).mo85252e();
    }

    /* renamed from: a */
    public final void mo67605a(View view, Bundle bundle) {
        super.mo67605a(view, bundle);
        String str = null;
        View inflate = LayoutInflater.from(mo105655bv()).inflate(R.layout.b31, null);
        if (inflate != null) {
            DmtTextView dmtTextView = (DmtTextView) inflate;
            if (TextUtils.equals(mo67595A(), DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
                Context bv = mo105655bv();
                if (bv != null) {
                    str = bv.getString(R.string.aso);
                }
                dmtTextView.setText(str);
            }
            this.f75388s.setLoadMoreEmptyView(dmtTextView);
            FeedParam feedParam = this.f75327V;
            C7573i.m23582a((Object) feedParam, "param");
            if (!TextUtils.isEmpty(feedParam.getTabText())) {
                ViewStub viewStub = (ViewStub) this.f68889b.findViewById(R.id.ap0);
                if (viewStub != null) {
                    viewStub.inflate();
                }
                View findViewById = this.f68889b.findViewById(R.id.aoz);
                C7573i.m23582a((Object) findViewById, "mLayout.findViewById<Dmt…id.fragment_detail_title)");
                DmtTextView dmtTextView2 = (DmtTextView) findViewById;
                FeedParam feedParam2 = this.f75327V;
                C7573i.m23582a((Object) feedParam2, "param");
                dmtTextView2.setText(feedParam2.getTabText());
            }
            DmtStatusView n = mo73419n(true);
            MtEmptyView a = MtEmptyView.m31657a((Context) this.f113033ay);
            a.setStatus(new C10806a(this.f113033ay).mo25993c(R.string.cm4).f29135a);
            if (n != null) {
                n.setBuilder(C10803a.m31631a(mo105655bv()).mo25965c(1).mo25963b((View) a));
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
    }

    /* renamed from: a */
    public final void mo69892a(Aweme aweme, String str) {
        String str2;
        String str3;
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "uid");
        C33280v b = new C33280v().mo85341b(mo64928a(true));
        if (TextUtils.isEmpty(mo71875L())) {
            str2 = aw_();
        } else {
            str2 = mo71875L();
        }
        C33280v e = b.mo85345e(str2);
        if (TextUtils.isEmpty(mo71875L())) {
            str3 = "follow_button";
        } else {
            str3 = mo73388bi();
        }
        C33280v c = e.mo85347f(str3).mo85357t(mo69888G()).mo85356s(mo69887F()).mo85355r(mo69889H()).mo85343c("follow_button").mo85348g(str).mo85342c(aweme, mo71888Y());
        FeedParam feedParam = this.f75327V;
        C7573i.m23582a((Object) feedParam, "param");
        ((C33280v) ((C33280v) c.mo85283l(feedParam.getTabName())).mo85284m(C33230ac.m107216b(aweme, mo71888Y()))).mo85252e();
    }

    /* renamed from: a */
    public final FeedPagerAdapter mo67600a(Context context, LayoutInflater layoutInflater, int i, C28343z<C28318an> zVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        DiscoveryV4DetailFeedPagerAdapter discoveryV4DetailFeedPagerAdapter = new DiscoveryV4DetailFeedPagerAdapter(context, layoutInflater, 10, zVar, fragment, onTouchListener, baseFeedPageParams);
        String H = mo69889H();
        String F = mo69887F();
        String G = mo69888G();
        FeedParam feedParam = this.f75327V;
        C7573i.m23582a((Object) feedParam, "param");
        String tabName = feedParam.getTabName();
        C7573i.m23582a((Object) tabName, "param.tabName");
        discoveryV4DetailFeedPagerAdapter.mo69574a(H, F, G, tabName);
        return discoveryV4DetailFeedPagerAdapter;
    }
}
