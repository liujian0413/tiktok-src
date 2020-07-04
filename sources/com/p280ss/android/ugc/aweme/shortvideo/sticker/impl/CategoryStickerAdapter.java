package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40376ag;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectGameViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40953a;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.CategoryStickerAdapter */
public class CategoryStickerAdapter extends StickerAdapter<StickerWrapper> {

    /* renamed from: a */
    public boolean f105447a;

    /* renamed from: b */
    public C40953a f105448b;

    /* renamed from: d */
    private EffectStickerManager f105449d;

    /* renamed from: e */
    private List<StickerWrapper> f105450e;

    /* renamed from: f */
    private HashMap<String, Integer> f105451f = C40376ag.m129119a(null);

    /* renamed from: a */
    public final List<StickerWrapper> mo62312a() {
        return this.f105450e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo100647f() {
        this.f105451f = C40376ag.m129119a(this.f105450e);
    }

    CategoryStickerAdapter(EffectStickerManager effectStickerManager) {
        this.f105449d = effectStickerManager;
    }

    /* renamed from: a */
    public final void mo58045a(List<StickerWrapper> list) {
        this.f105450e = list;
        this.f105451f = C40376ag.m129119a(this.f105450e);
        super.mo58045a(this.f105450e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo100643a(Effect effect) {
        if (effect == null) {
            return -1;
        }
        Integer num = (Integer) this.f105451f.get(effect.getEffectId());
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo100644b(int i) {
        if (C40496bh.m129455d(((StickerWrapper) mo100733c(i)).f104908a)) {
            return 1003;
        }
        if (!C6399b.m19944t() || !C40496bh.m129466k(((StickerWrapper) mo100733c(i)).f104908a)) {
            return 1001;
        }
        return LiveRoomStruct.ROOM_LONGTIME_NO_NET;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C1293v mo100645b(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1003:
                return new EffectGameViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.v1, viewGroup, false), this.f105449d, this.f105450e);
            case LiveRoomStruct.ROOM_LONGTIME_NO_NET /*1004*/:
                EffectLockStickerViewHolder effectLockStickerViewHolder = new EffectLockStickerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.v0, viewGroup, false), this.f105449d, this.f105450e);
                effectLockStickerViewHolder.f104764e = this.f105448b;
                return effectLockStickerViewHolder;
            default:
                return new EffectStickerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.v1, viewGroup, false), this.f105449d, this.f105450e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo100646b(C1293v vVar, int i) {
        boolean z = this.f105447a;
        switch (getItemViewType(i)) {
            case 1003:
                ((EffectGameViewHolder) vVar).mo100185a((StickerWrapper) mo100733c(i), this.f105450e, i, z);
                return;
            case LiveRoomStruct.ROOM_LONGTIME_NO_NET /*1004*/:
                ((EffectLockStickerViewHolder) vVar).mo100191a((StickerWrapper) mo100733c(i), this.f105450e, i, z);
                return;
            default:
                ((EffectStickerViewHolder) vVar).mo100241a((StickerWrapper) mo100733c(i), this.f105450e, i, z);
                return;
        }
    }

    public void onBindViewHolder(C1293v vVar, int i, List list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            StickerWrapper stickerWrapper = (StickerWrapper) list.get(0);
            StickerWrapper.m129070a(stickerWrapper, (StickerWrapper) mo100733c(i));
            if (getItemViewType(i) == 1001) {
                ((EffectStickerViewHolder) vVar).mo100203b(stickerWrapper);
            } else if (getItemViewType(i) == 1003) {
                ((EffectGameViewHolder) vVar).mo100203b(stickerWrapper);
            } else {
                if (getItemViewType(i) == 1004) {
                    EffectLockStickerViewHolder effectLockStickerViewHolder = (EffectLockStickerViewHolder) vVar;
                    if (this.f105449d.mo100230c(stickerWrapper.f104908a)) {
                        effectLockStickerViewHolder.f104763d.animate().alpha(1.0f).setDuration(150).start();
                        this.f105449d.mo100232d(stickerWrapper.f104908a);
                    } else {
                        effectLockStickerViewHolder.f104763d.animate().alpha(0.0f).setDuration(150).start();
                    }
                }
            }
        } else {
            super.onBindViewHolder(vVar, i, list);
        }
    }
}
