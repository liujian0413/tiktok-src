package com.bytedance.android.livesdk.gift.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.livesdk.gift.holder.BasePanelViewHolder;
import com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter.C8111a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;

public class LandGiftAdapter extends AbsGiftAdapter {
    /* renamed from: a */
    public final BasePanelViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        BasePanelViewHolder a = super.onCreateViewHolder(viewGroup, i);
        a.itemView.setLayoutParams(new LayoutParams((int) C9738o.m28708b(this.f22126a, 93.0f), (int) C9738o.m28708b(this.f22126a, 104.0f)));
        return a;
    }

    public LandGiftAdapter(Context context, Room room, C8111a aVar, boolean z) {
        super(context, room, aVar, false);
    }
}
