package com.bytedance.android.livesdk.feed.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.paging.adapter.PagingAdapter.EndViewHolder;
import com.bytedance.android.live.core.viewholder.C3417a;
import com.bytedance.android.livesdk.feed.C5980f;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

public class FeedLiveAdapter extends BaseFeedAdapter {

    /* renamed from: l */
    private final FeedLiveFragment f17577l;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo14520c(int i) {
        if (i != 1) {
            if (i == 3) {
                return R.layout.art;
            }
            switch (i) {
                case 1001:
                    return R.layout.awf;
                case 1002:
                    return R.layout.awh;
                case 1003:
                    return R.layout.awi;
                case LiveRoomStruct.ROOM_LONGTIME_NO_NET /*1004*/:
                    return R.layout.arz;
                default:
                    return super.mo14520c(i);
            }
        } else if (FeedLiveFragment.m18771o()) {
            return R.layout.arv;
        } else {
            return R.layout.aru;
        }
    }

    /* renamed from: b */
    public final C1293v mo10080b(ViewGroup viewGroup, int i) {
        return super.mo10080b(viewGroup, i);
    }

    /* renamed from: c */
    public final C1293v mo10082c(ViewGroup viewGroup, int i) {
        return new EndViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.amb, viewGroup, false));
    }

    public FeedLiveAdapter(Map<Integer, C3417a> map, C5980f fVar, FeedLiveFragment feedLiveFragment) {
        super(map, fVar);
        this.f17577l = feedLiveFragment;
    }
}
