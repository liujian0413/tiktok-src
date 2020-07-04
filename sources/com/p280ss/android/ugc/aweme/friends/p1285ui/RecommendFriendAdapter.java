package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecomendFriendItemView.C30127a;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendFriendAdapter */
public class RecommendFriendAdapter extends BaseAdapter<User> {

    /* renamed from: a */
    public C30127a f79300a;

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        ((RecommendFriendViewHolder) vVar).mo76582a((User) this.f67539l.get(i));
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        RecomendFriendItemView recomendFriendItemView = new RecomendFriendItemView(viewGroup.getContext());
        recomendFriendItemView.setListener(this.f79300a);
        recomendFriendItemView.setLayoutParams(new LayoutParams(-1, (int) C9738o.m28708b(viewGroup.getContext(), 84.0f)));
        return new RecommendFriendViewHolder(recomendFriendItemView);
    }
}
