package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.arch.lifecycle.C0053p;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28478a;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.playerkit.videoview.C44933a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.as */
public final class C28810as extends C28894e implements C0053p<C23083a> {

    /* renamed from: a */
    private View f75955a;

    /* renamed from: a */
    public final void mo72018a() {
    }

    /* renamed from: i */
    private final boolean m94816i() {
        if (!C28478a.m93588c(this.f76169g) || C6903bc.m21478S().mo57884b() != 3) {
            return false;
        }
        return true;
    }

    public C28810as(View view) {
        super(view);
    }

    /* renamed from: a */
    public final void mo72021a(VideoItemParams videoItemParams) {
        super.mo72021a(videoItemParams);
        m94815a("on_viewpager_page_selected");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        String str;
        if (C7573i.m23585a((Object) "homepage_hot", (Object) this.f76170h) && this.f76173k == 0 && this.f76179q == 1) {
            if (aVar != null) {
                str = aVar.f60948a;
            } else {
                str = null;
            }
            m94815a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
        if (dataCenter != null) {
            C0053p pVar = this;
            DataCenter a = dataCenter.mo60132a("on_viewpager_page_selected", pVar);
            if (a != null) {
                a.mo60132a("startPlayAnimation", pVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72019a(View view) {
        View view2 = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.b5_);
        C7573i.m23582a((Object) view2, "x2CItemFeed.getView(mCon…ayout.vpa_opted_out_mask)");
        ((DmtTextView) view2.findViewById(R.id.title)).setFontType(C10834d.f29332b);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        this.f75955a = view2;
        View view3 = this.f75955a;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    /* renamed from: a */
    private final void m94815a(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1180796502) {
                if (hashCode == 307897710 && str.equals("startPlayAnimation")) {
                    View view = this.f75955a;
                    if (view != null && view.getVisibility() == 0) {
                        if (!C43316v.m137250H()) {
                            C43222g K = C43316v.m137450K();
                            C7573i.m23582a((Object) K, "PlayerManager.inst()");
                            if (K.mo104916o()) {
                                C43316v.m137450K().mo104948x();
                            }
                        } else {
                            C44933a a = C44933a.m141791a();
                            C7573i.m23582a((Object) a, "AppPlayingVideoViewProxy.INSTANCE()");
                            if (a.mo107442b()) {
                                C44933a.m141791a().mo71672ad();
                            }
                        }
                    }
                }
            } else if (str.equals("on_viewpager_page_selected")) {
                if (m94816i()) {
                    View view2 = this.f75955a;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    Aweme aweme = this.f76169g;
                    C7573i.m23582a((Object) aweme, "aweme");
                    Aweme aweme2 = this.f76169g;
                    C7573i.m23582a((Object) aweme2, "aweme");
                    C6907h.m21524a("opt_out_layer_show", (Map) C22984d.m75611a().mo59973a("enter_from", this.f76170h).mo59973a("group_id", aweme.getAid()).mo59973a("author_id", aweme2.getAuthorUid()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107206a(this.f76169g, this.f76173k))).f60753a);
                    return;
                }
                View view3 = this.f75955a;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
        }
    }
}
