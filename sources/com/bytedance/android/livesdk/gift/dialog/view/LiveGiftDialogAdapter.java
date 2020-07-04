package com.bytedance.android.livesdk.gift.dialog.view;

import android.content.Context;
import android.graphics.Point;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.gift.model.p390a.C8135b;
import com.bytedance.android.livesdk.gift.model.p390a.C8137d;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class LiveGiftDialogAdapter extends C1262a<LiveGiftViewHolder> {

    /* renamed from: a */
    private final List<C8135b> f21360a = new ArrayList();

    /* renamed from: b */
    private final LayoutInflater f21361b;

    /* renamed from: c */
    private final GiftViewModel f21362c;

    /* renamed from: a */
    public final void mo20733a() {
        this.f21360a.clear();
    }

    public int getItemCount() {
        return this.f21360a.size();
    }

    /* renamed from: b */
    public final void mo20735b() {
        for (C8135b bVar : this.f21360a) {
            if (bVar != null) {
                bVar.f22204b = false;
            }
        }
    }

    /* renamed from: a */
    private static int m24232a(int i) {
        int i2 = i / 8;
        int i3 = i % 8;
        if (i3 < 4) {
            return (i3 * 2) + (i2 * 8);
        }
        return ((i3 - 4) * 2) + 1 + (i2 * 8);
    }

    /* renamed from: a */
    private List<C8135b> m24234a(Collection<? extends C8135b> collection) {
        int size = (((collection.size() - 1) / 8) + 1) * 8;
        C8135b[] bVarArr = new C8135b[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            bVarArr[i2] = new C8137d();
        }
        for (C8135b bVar : collection) {
            int a = m24232a(i);
            i++;
            if (a < size) {
                bVarArr[a] = bVar;
            }
        }
        return Arrays.asList(bVarArr);
    }

    public int getItemViewType(int i) {
        if (i < 0 || i >= this.f21360a.size()) {
            return super.getItemViewType(i);
        }
        C8135b bVar = (C8135b) this.f21360a.get(i);
        if (bVar != null) {
            return bVar.f22203a;
        }
        return super.getItemViewType(i);
    }

    /* renamed from: a */
    public final int mo20731a(C8135b bVar) {
        for (int i = 0; i < this.f21360a.size(); i++) {
            if (((C8135b) this.f21360a.get(i)).equals(bVar)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final C8135b mo20732a(long j) {
        for (C8135b bVar : this.f21360a) {
            if (bVar != null && bVar.mo21275p() == j) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo20734a(List<? extends C8135b> list) {
        if (list != null) {
            this.f21360a.clear();
            this.f21360a.addAll(m24234a((Collection<? extends C8135b>) list));
        }
    }

    public LiveGiftDialogAdapter(Context context, GiftViewModel giftViewModel) {
        this.f21361b = LayoutInflater.from(context);
        this.f21362c = giftViewModel;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public LiveGiftViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int b;
        LiveGiftViewHolder liveGiftViewHolder = new LiveGiftViewHolder(this.f21361b.inflate(R.layout.alm, null), i, this.f21362c);
        Context context = liveGiftViewHolder.itemView.getContext();
        if (context == null) {
            return liveGiftViewHolder;
        }
        boolean b2 = this.f21362c.mo20793b();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        if (b2) {
            b = point.x;
        } else {
            b = (int) C9738o.m28708b(context, 398.0f);
        }
        liveGiftViewHolder.itemView.setLayoutParams(new LayoutParams(b / 4, (int) C9738o.m28708b(context, 110.0f)));
        return liveGiftViewHolder;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(LiveGiftViewHolder liveGiftViewHolder, int i) {
        C8135b bVar = (C8135b) this.f21360a.get(i);
        if (bVar != null) {
            if (bVar.f22203a == 0) {
                liveGiftViewHolder.itemView.setVisibility(4);
            }
            liveGiftViewHolder.mo20749a(bVar);
        }
    }
}
