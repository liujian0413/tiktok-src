package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.router.C7195s;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.RecommendFriendViewHolder */
public class RecommendFriendViewHolder extends C1293v {
    RecyclerView recyclerView;
    TextView txtFindMore;
    TextView txtInterested;

    public void goAddFriends() {
        C6907h.onEvent(MobClick.obtain().setEventName("check_more").setLabelName("discovery_recommend"));
        C7195s.m22438a().mo18682a("aweme://user/invite");
    }
}
