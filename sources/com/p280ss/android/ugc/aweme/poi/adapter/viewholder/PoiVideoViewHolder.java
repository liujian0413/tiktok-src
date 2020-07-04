package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.FollowVideoViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.utils.C35460p;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiVideoViewHolder */
public final class PoiVideoViewHolder extends FollowVideoViewHolder {

    /* renamed from: a */
    public final FollowFeedLayout f91631a;

    /* renamed from: b */
    public final PoiSimpleBundle f91632b;

    /* renamed from: c */
    public final C21744b f91633c;

    /* renamed from: d */
    public final C29376j f91634d;

    /* renamed from: e */
    public final C21743a f91635e;

    /* renamed from: f */
    private final int f91636f;

    /* renamed from: g */
    private final String f91637g;

    /* renamed from: c */
    public final void mo68519c(boolean z) {
    }

    /* renamed from: e */
    public final void mo68520e() {
        mo68521f();
    }

    /* renamed from: i */
    public final int mo68524i() {
        return 10;
    }

    /* renamed from: g */
    public final boolean mo68522g() {
        return super.mo68522g();
    }

    /* renamed from: h */
    public final String mo68523h() {
        if (this.f91636f != 1) {
            return "from_poi_detail";
        }
        return "poi_rate";
    }

    /* renamed from: f */
    public final void mo68521f() {
        String str;
        CharSequence charSequence;
        super.mo68521f();
        Bundle bundle = new Bundle();
        Aweme aweme = this.f77546j;
        C7573i.m23582a((Object) aweme, "mAweme");
        bundle.putString("id", aweme.getAid());
        bundle.putString("refer", mo75290r());
        bundle.putString("video_from", mo68523h());
        Aweme aweme2 = this.f77546j;
        C7573i.m23582a((Object) aweme2, "mAweme");
        bundle.putInt("profile_enterprise_type", aweme2.getEnterpriseType());
        bundle.putInt("page_type", mo68524i());
        String str2 = "poi_id";
        PoiSimpleBundle poiSimpleBundle = this.f91632b;
        String str3 = null;
        if (poiSimpleBundle != null) {
            str = poiSimpleBundle.getPoiId();
        } else {
            str = null;
        }
        bundle.putString(str2, str);
        bundle.putString("previous_page", "poi_page");
        if (mo75315am() != null) {
            bundle.putString("userid", mo75315am());
        }
        PoiSimpleBundle poiSimpleBundle2 = this.f91632b;
        if (poiSimpleBundle2 != null) {
            charSequence = poiSimpleBundle2.getAwemeId();
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            String str4 = "related_gid";
            PoiSimpleBundle poiSimpleBundle3 = this.f91632b;
            if (poiSimpleBundle3 != null) {
                str3 = poiSimpleBundle3.getAwemeId();
            }
            bundle.putString(str4, str3);
        }
        if (!TextUtils.isEmpty(this.f91637g)) {
            bundle.putString("poi_tab_type", this.f91637g);
        }
        C35460p.m114544a(mo75261ab(), bundle, (View) this.f77597az);
    }

    public PoiVideoViewHolder(FollowFeedLayout followFeedLayout, PoiSimpleBundle poiSimpleBundle, C21744b bVar, C29376j jVar, C21743a aVar, int i, String str) {
        C7573i.m23587b(followFeedLayout, "view");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
        this.f91631a = followFeedLayout;
        this.f91632b = poiSimpleBundle;
        this.f91633c = bVar;
        this.f91634d = jVar;
        this.f91635e = aVar;
        this.f91636f = i;
        this.f91637g = str;
    }
}
