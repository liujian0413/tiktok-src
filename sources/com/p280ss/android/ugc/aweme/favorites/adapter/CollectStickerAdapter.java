package com.p280ss.android.ugc.aweme.favorites.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.favorites.viewholder.StickerCollectViewHolder;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.CollectStickerAdapter */
public class CollectStickerAdapter extends BaseAdapter<NewFaceStickerBean> {
    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        ((StickerCollectViewHolder) vVar).mo71315a((NewFaceStickerBean) mo62312a().get(i));
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        return new StickerCollectViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv, viewGroup, false));
    }
}
