package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40376ag;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.FavoriteStickerAdapter */
public class FavoriteStickerAdapter extends StickerAdapter<StickerWrapper> {

    /* renamed from: a */
    private EffectStickerManager f105559a;

    /* renamed from: b */
    private List<StickerWrapper> f105560b;

    /* renamed from: d */
    private HashMap<String, Integer> f105561d = C40376ag.m129119a(this.f105560b);

    /* renamed from: a */
    public final List<StickerWrapper> mo62312a() {
        return this.f105560b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo100644b(int i) {
        return 1002;
    }

    public FavoriteStickerAdapter(EffectStickerManager effectStickerManager) {
        this.f105559a = effectStickerManager;
    }

    /* renamed from: a */
    public final void mo58045a(List<StickerWrapper> list) {
        this.f105560b = list;
        this.f105561d = C40376ag.m129119a(this.f105560b);
        super.mo58045a(list);
    }

    /* renamed from: a */
    public final int mo100723a(Effect effect) {
        if (effect == null) {
            return -1;
        }
        Integer num = (Integer) this.f105561d.get(effect.getEffectId());
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo100646b(C1293v vVar, int i) {
        ((FavoriteStickerViewHolder) vVar).mo100730a((StickerWrapper) mo100733c(i), mo62312a(), i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C1293v mo100645b(ViewGroup viewGroup, int i) {
        return new FavoriteStickerViewHolder(this.f105559a, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.v1, viewGroup, false), this.f105560b);
    }

    public void onBindViewHolder(C1293v vVar, int i, List list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            StickerWrapper stickerWrapper = (StickerWrapper) list.get(0);
            StickerWrapper.m129070a(stickerWrapper, (StickerWrapper) mo100733c(i));
            ((FavoriteStickerViewHolder) vVar).mo100203b(stickerWrapper);
            return;
        }
        super.onBindViewHolder(vVar, i, list);
    }
}
