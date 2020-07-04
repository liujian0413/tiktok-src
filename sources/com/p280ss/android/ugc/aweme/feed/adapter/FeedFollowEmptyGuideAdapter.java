package com.p280ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.activity.C23267h;
import com.p280ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;
import com.p280ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder.C30016a;
import com.p280ss.android.ugc.aweme.friends.p1285ui.C30179z;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendFriendItemViewV2Holder;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.FeedFollowEmptyGuideAdapter */
public final class FeedFollowEmptyGuideAdapter extends RecyclerHeaderViewAdapter<User> {

    /* renamed from: e */
    public String f73939e = "";

    /* renamed from: f */
    public final boolean f73940f = true;

    /* renamed from: g */
    private final HashMap<String, Boolean> f73941g = new HashMap<>();

    /* renamed from: h */
    private C23267h<User> f73942h;

    /* renamed from: i */
    private C30016a f73943i;

    /* renamed from: c */
    public final int mo60557c() {
        return super.mo60557c();
    }

    /* renamed from: b */
    public final void mo61148b(C1293v vVar, int i) {
        if (vVar instanceof RecommendFriendItemViewV2Holder) {
            ((RecommendFriendItemViewV2Holder) vVar).mo76581a((User) this.f67539l.get(i), 0, false, 2);
        }
    }

    /* renamed from: b */
    public final C1293v mo61146b(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        C30179z zVar = new C30179z(context, this.f73941g);
        zVar.setEnterFrom(this.f73939e);
        zVar.setListener(this.f73942h);
        zVar.setRecommendAwemeClickListener(this.f73943i);
        return new RecommendFriendItemViewV2Holder(zVar);
    }
}
