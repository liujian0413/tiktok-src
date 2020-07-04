package com.bytedance.android.livesdk.gift.impl;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import com.bytedance.android.livesdk.gift.holder.BasePanelViewHolder;
import com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter.C8111a;
import com.bytedance.android.livesdk.gift.model.p390a.C8135b;
import com.bytedance.android.livesdk.gift.model.p390a.C8137d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GiftAdapter extends AbsGiftAdapter {
    /* renamed from: a */
    public final void mo21225a(List<C8135b> list) {
        super.mo21225a(m24885a((Collection<? extends C8135b>) list));
    }

    /* renamed from: a */
    private static int m24884a(int i) {
        int i2 = i / 8;
        int i3 = i % 8;
        if (i3 < 4) {
            return (i3 * 2) + (i2 * 8);
        }
        return ((i3 - 4) * 2) + 1 + (i2 * 8);
    }

    /* renamed from: a */
    private List<C8135b> m24885a(Collection<? extends C8135b> collection) {
        int size = (((collection.size() - 1) / 8) + 1) * 8;
        C8135b[] bVarArr = new C8135b[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            bVarArr[i2] = new C8137d();
        }
        for (C8135b bVar : collection) {
            int a = m24884a(i);
            i++;
            if (a < size) {
                bVarArr[a] = bVar;
            }
        }
        return Arrays.asList(bVarArr);
    }

    /* renamed from: a */
    public final BasePanelViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        BasePanelViewHolder a = super.onCreateViewHolder(viewGroup, i);
        WindowManager windowManager = (WindowManager) this.f22126a.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        a.itemView.setLayoutParams(new LayoutParams(point.x / 4, (int) C9738o.m28708b(this.f22126a, 104.0f)));
        return a;
    }

    public GiftAdapter(Context context, Room room, C8111a aVar, boolean z) {
        super(context, room, aVar, true);
    }
}
