package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerEmojiAdapterV2 */
public class InfoStickerEmojiAdapterV2 extends InfoStickerAdapterV2 {

    /* renamed from: j */
    private String f105649j;

    /* renamed from: k */
    private List<StickerWrapper> f105650k = new ArrayList();

    /* renamed from: c */
    public final int mo60557c() {
        if (this.f105634a) {
            return 1;
        }
        return this.f105650k.size() + 2;
    }

    /* renamed from: b */
    public final int mo100755b(int i) {
        if (this.f105641e.get(i - 1)) {
            return 3;
        }
        return 2;
    }

    /* renamed from: a */
    public final void mo100761a(CategoryEffectModel categoryEffectModel) {
        if (categoryEffectModel != null && categoryEffectModel.effects != null) {
            this.f105650k.addAll(StickerWrapper.m129069a(categoryEffectModel.effects, ""));
        }
    }

    InfoStickerEmojiAdapterV2(FragmentActivity fragmentActivity, String str) {
        super(fragmentActivity, str);
        this.f105639c = fragmentActivity;
        this.f105649j = str;
    }

    /* renamed from: b */
    public final C1293v mo100756b(ViewGroup viewGroup, int i) {
        InfoStickerHolder infoStickerHolder = new InfoStickerHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.g_, viewGroup, false), this.f105639c, this);
        infoStickerHolder.f105672c = this.f105635b;
        return infoStickerHolder;
    }

    /* renamed from: b */
    public final void mo100757b(C1293v vVar, int i) {
        if (mo100755b(i) == 2) {
            InfoStickerHolder infoStickerHolder = (InfoStickerHolder) vVar;
            int i2 = i - 1;
            infoStickerHolder.mo100775a(this.f105639c, (StickerWrapper) this.f105650k.get(i2), this.f105649j);
            infoStickerHolder.f105675f = i;
            if (((StickerWrapper) this.f105650k.get(i2)).f104908a != null) {
                this.f105643g.put(((StickerWrapper) this.f105650k.get(i2)).f104908a.getEffectId(), infoStickerHolder);
            }
        }
    }
}
