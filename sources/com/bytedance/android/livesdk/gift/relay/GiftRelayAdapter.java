package com.bytedance.android.livesdk.gift.relay;

import android.content.Context;
import android.graphics.Point;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import com.bytedance.android.livesdk.gift.relay.GiftRelayViewHolder.C8267a;
import com.bytedance.android.livesdk.gift.relay.p392a.C8271c;
import com.bytedance.android.livesdk.gift.relay.p392a.C8271c.C8272a;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

public class GiftRelayAdapter extends C1262a<GiftRelayViewHolder> implements C8267a {

    /* renamed from: a */
    public final List<C8272a> f22645a = new ArrayList();

    /* renamed from: b */
    public C8272a f22646b;

    /* renamed from: c */
    public C8265a f22647c;

    /* renamed from: d */
    private Context f22648d;

    /* renamed from: e */
    private LayoutInflater f22649e;

    /* renamed from: f */
    private C8271c f22650f;

    /* renamed from: com.bytedance.android.livesdk.gift.relay.GiftRelayAdapter$a */
    public interface C8265a {
        /* renamed from: a */
        void mo21408a(C8272a aVar);
    }

    public int getItemCount() {
        return this.f22645a.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo21404a(C8272a aVar) {
        for (int i = 0; i < this.f22645a.size(); i++) {
            if (aVar == this.f22645a.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo21405a(int i) {
        if (this.f22645a != null && i >= 0 && i < this.f22645a.size()) {
            C8272a aVar = (C8272a) this.f22645a.get(i);
            if (this.f22646b != null) {
                this.f22646b.f22721g = false;
            }
            if (aVar != null) {
                aVar.f22721g = true;
                this.f22646b = aVar;
            }
        }
    }

    /* renamed from: a */
    public final void mo21407a(List<C8272a> list) {
        if (list != null && !list.isEmpty()) {
            this.f22645a.clear();
            this.f22645a.addAll(list);
            if (this.f22646b == null) {
                for (C8272a aVar : this.f22645a) {
                    aVar.f22721g = false;
                }
            }
            notifyDataSetChanged();
        }
    }

    public GiftRelayAdapter(Context context, C8271c cVar) {
        this.f22648d = context;
        this.f22650f = cVar;
        this.f22649e = LayoutInflater.from(this.f22648d);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(GiftRelayViewHolder giftRelayViewHolder, int i) {
        C8272a aVar = (C8272a) this.f22645a.get(i);
        if (aVar != null) {
            giftRelayViewHolder.mo21418a(aVar);
            giftRelayViewHolder.f22687a = this;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public GiftRelayViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        GiftRelayViewHolder giftRelayViewHolder = new GiftRelayViewHolder(this.f22649e.inflate(R.layout.ar4, null), this.f22650f);
        WindowManager windowManager = (WindowManager) this.f22648d.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        giftRelayViewHolder.itemView.setLayoutParams(new LayoutParams((point.x - ((int) C9051ar.m27035b(this.f22648d, 28.0f))) / 3, (int) C9051ar.m27035b(this.f22648d, 120.0f)));
        return giftRelayViewHolder;
    }

    /* renamed from: a */
    public final void mo21406a(GiftRelayViewHolder giftRelayViewHolder, C8272a aVar) {
        if (this.f22647c != null) {
            this.f22647c.mo21408a(aVar);
        }
        if (this.f22646b != null) {
            this.f22646b.f22721g = false;
            if (this.f22646b == aVar) {
                this.f22646b = null;
                return;
            }
        }
        if (aVar != null) {
            aVar.f22721g = true;
            this.f22646b = aVar;
        }
        giftRelayViewHolder.mo21420a(true);
    }
}
