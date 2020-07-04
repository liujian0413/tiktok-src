package com.p280ss.android.ugc.aweme.recommend.viewholder;

import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.metrics.C33238ak;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.RecommendFeedFamiliarUserViewHolder */
public final class RecommendFeedFamiliarUserViewHolder extends RecommendCommonUserViewHolderV2 {
    /* renamed from: b */
    public final int mo93623b() {
        return R.layout.a1e;
    }

    /* renamed from: g */
    public final boolean mo93634g() {
        return false;
    }

    public RecommendFeedFamiliarUserViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        super(viewGroup);
    }

    /* renamed from: a */
    public final void mo93621a(User user, String str, int i) {
        C7573i.m23587b(str, "eventType");
        if (user != null) {
            C33238ak a = new C33238ak(null, 1, null).mo85098c(str).mo85095a(user.getUid()).mo85100e(user.getRecommendReason()).mo85094a(Integer.valueOf(i));
            DataCenter dataCenter = this.f97187a;
            if (dataCenter != null) {
                dataCenter.mo60134a("key_recommend_user_event", (Object) a);
            }
        }
    }
}
