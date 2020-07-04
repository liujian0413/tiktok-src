package com.p280ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40881d;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater.MultiStickerAdapter */
public class MultiStickerAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public int f106168a;

    /* renamed from: b */
    private List<StickerWrapper> f106169b = new ArrayList();

    /* renamed from: c */
    private String f106170c;

    /* renamed from: d */
    private EffectStickerManager f106171d;

    /* renamed from: e */
    private boolean f106172e;

    public int getItemCount() {
        if (this.f106169b == null) {
            return 0;
        }
        return this.f106169b.size();
    }

    /* renamed from: a */
    public final void mo101090a(List<Effect> list) {
        this.f106169b = StickerWrapper.m129069a(list, (String) null);
        notifyDataSetChanged();
        this.f106172e = false;
    }

    /* renamed from: a */
    private StickerWrapper m130457a(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return (StickerWrapper) this.f106169b.get(i);
    }

    /* renamed from: b */
    private boolean m130458b(int i) {
        boolean z;
        boolean z2 = false;
        if (this.f106168a < 0 || !C40496bh.m129437a((StickerWrapper) this.f106169b.get(this.f106168a))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            boolean z3 = !C40496bh.m129437a((StickerWrapper) this.f106169b.get(i));
            if (this.f106172e || !z3) {
                return false;
            }
            this.f106172e = true;
            return true;
        }
        if (this.f106168a == i) {
            z2 = true;
        }
        if (!this.f106172e && z2) {
            this.f106172e = true;
        }
        return z2;
    }

    public MultiStickerAdapter(String str, EffectStickerManager effectStickerManager) {
        this.f106170c = str;
        this.f106171d = effectStickerManager;
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        ((MultiStickerViewHolder) vVar).mo101091a(m130457a(i), m130458b(i), this.f106169b);
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (C40881d.m130626a(this.f106170c)) {
            i2 = R.layout.ga;
        } else {
            i2 = R.layout.z_;
        }
        return new MultiStickerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false), this.f106171d);
    }
}
