package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.FollowImageViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.utils.C35460p;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiImageViewHolder */
public final class PoiImageViewHolder extends FollowImageViewHolder {

    /* renamed from: aA */
    private final int f91521aA;

    /* renamed from: aB */
    private final String f91522aB;

    /* renamed from: az */
    public final C21743a f91523az;

    /* renamed from: d */
    public final FollowFeedLayout f91524d;

    /* renamed from: e */
    public final PoiSimpleBundle f91525e;

    /* renamed from: f */
    public final C21744b f91526f;

    /* renamed from: g */
    public final C29376j f91527g;

    /* renamed from: a */
    public final void mo75305a(boolean z) {
    }

    /* renamed from: ae */
    public final void mo75306ae() {
        mo68521f();
    }

    /* renamed from: h */
    public final int mo68523h() {
        return 10;
    }

    /* renamed from: e */
    public final boolean mo68520e() {
        return super.mo68520e();
    }

    /* renamed from: i */
    public final String mo68524i() {
        if (this.f91521aA != 1) {
            return "from_poi_detail";
        }
        return "poi_rate";
    }

    /* renamed from: f */
    public final void mo68521f() {
        String str;
        CharSequence charSequence;
        if (this.f77546j != null) {
            C6903bc.m21486e().mo75372b(this.f77546j, mo75290r());
            mo75305a(true);
            C28503s.m93679a(this.f77550n.mo58090c(this.f77546j));
            Bundle bundle = new Bundle();
            Aweme aweme = this.f77546j;
            C7573i.m23582a((Object) aweme, "mAweme");
            bundle.putString("id", aweme.getAid());
            bundle.putString("refer", mo75290r());
            bundle.putString("video_from", mo68524i());
            Aweme aweme2 = this.f77546j;
            C7573i.m23582a((Object) aweme2, "mAweme");
            bundle.putInt("profile_enterprise_type", aweme2.getEnterpriseType());
            bundle.putInt("page_type", mo68523h());
            String str2 = "poi_id";
            PoiSimpleBundle poiSimpleBundle = this.f91525e;
            String str3 = null;
            if (poiSimpleBundle != null) {
                str = poiSimpleBundle.getPoiId();
            } else {
                str = null;
            }
            bundle.putString(str2, str);
            bundle.putString("previous_page", "poi_page");
            if (mo68522g() != null) {
                bundle.putString("userid", mo68522g());
            }
            PoiSimpleBundle poiSimpleBundle2 = this.f91525e;
            if (poiSimpleBundle2 != null) {
                charSequence = poiSimpleBundle2.getAwemeId();
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                String str4 = "related_gid";
                PoiSimpleBundle poiSimpleBundle3 = this.f91525e;
                if (poiSimpleBundle3 != null) {
                    str3 = poiSimpleBundle3.getAwemeId();
                }
                bundle.putString(str4, str3);
            }
            if (!TextUtils.isEmpty(this.f91522aB)) {
                bundle.putString("poi_tab_type", this.f91522aB);
            }
            C35460p.m114544a(mo75261ab(), bundle, (View) this.f77571a);
        }
    }

    public PoiImageViewHolder(FollowFeedLayout followFeedLayout, PoiSimpleBundle poiSimpleBundle, C21744b bVar, C29376j jVar, C21743a aVar, int i, String str) {
        C7573i.m23587b(followFeedLayout, "view");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
        this.f91524d = followFeedLayout;
        this.f91525e = poiSimpleBundle;
        this.f91526f = bVar;
        this.f91527g = jVar;
        this.f91523az = aVar;
        this.f91521aA = i;
        this.f91522aB = str;
    }
}
