package com.p280ss.android.ugc.aweme.detail.p1162f;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.detail.C26057e;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.main.experiment.C33002a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.video.C43221f;
import com.p280ss.android.ugc.aweme.video.C43316v;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.f.a */
public final class C26061a {

    /* renamed from: a */
    public static final C26061a f68871a = new C26061a();

    private C26061a() {
    }

    /* renamed from: b */
    public static boolean m85601b(String str) {
        CharSequence charSequence = str;
        if (TextUtils.equals(charSequence, "from_follow_page") || TextUtils.equals(charSequence, "from_familiar_tab")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m85603d(String str) {
        if (2 != C33002a.m106650a() || !TextUtils.equals(str, "from_follow_tab")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo67590a(String str) {
        if (!m85603d(str)) {
            CharSequence charSequence = str;
            if (!TextUtils.equals("poi_grid", charSequence) && !TextUtils.equals("from_nearby", charSequence) && !TextUtils.equals("from_search", charSequence) && !TextUtils.equals("from_search_similar_aweme", charSequence) && !C26057e.m85589a(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private final boolean m85602c(String str) {
        if (!mo67590a(str)) {
            CharSequence charSequence = str;
            if (!TextUtils.equals("from_poi_categorized", charSequence) && !TextUtils.equals("from_search_jedi", charSequence) && !TextUtils.equals("potential_friends", charSequence) && !TextUtils.equals("from_no_request", charSequence) && !TextUtils.equals("from_commerce_seed", charSequence) && !TextUtils.equals("from_commerce_bill_share", charSequence) && !TextUtils.equals("from_anchor_video", charSequence) && !TextUtils.equals("from_profile_self", charSequence) && !TextUtils.equals("from_profile_other", charSequence) && !TextUtils.equals("from_commerce_banner", charSequence) && !TextUtils.equals("from_visual_search_result", charSequence) && !TextUtils.equals("poi_rate", charSequence) && !TextUtils.equals("poi_rate_list", charSequence) && !TextUtils.equals("poi_map", charSequence) && !TextUtils.equals("from_familiar_tab", charSequence) && !TextUtils.equals("from_channel", charSequence) && !TextUtils.equals("poi_street", charSequence) && !TextUtils.equals("from_search_commodity", charSequence) && !TextUtils.equals("from_mix_detail", charSequence)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo67588a(Aweme aweme, String str, int i, String str2, long j) {
        mo67589a(aweme, str, i, str2, j, true, -1);
    }

    /* renamed from: a */
    public final void mo67589a(Aweme aweme, String str, int i, String str2, long j, boolean z, int i2) {
        if (aweme != null && m85602c(str)) {
            C28318an anVar = new C28318an(21, aweme);
            anVar.f74634d = str;
            anVar.f74637g = i;
            anVar.f74641k = z;
            if (C26057e.m85589a(str)) {
                C43221f L = C43316v.m137451L();
                C7573i.m23582a((Object) L, "PlayerManager.getPlayerInfoProvider()");
                anVar.f74639i = L.mo104915n();
                C43221f L2 = C43316v.m137451L();
                C7573i.m23582a((Object) L2, "PlayerManager.getPlayerInfoProvider()");
                anVar.f74640j = L2.mo104916o();
                anVar.f74635e = str2;
                anVar.f74636f = j;
            }
            anVar.f74638h = i2;
            C42961az.m136380a(anVar);
        }
    }
}
