package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.GridLayoutManager.C1241a;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerAdapterV2 */
public class InfoStickerAdapterV2 extends AbstractInfoStickerAdapter<EffectCategoryResponse> {

    /* renamed from: c */
    protected FragmentActivity f105639c;

    /* renamed from: d */
    protected String f105640d;

    /* renamed from: e */
    protected SparseBooleanArray f105641e = new SparseBooleanArray();

    /* renamed from: f */
    public SparseArray<StickerWrapper> f105642f = new SparseArray<>();

    /* renamed from: g */
    public HashMap<String, InfoStickerHolder> f105643g = new HashMap<>();

    /* renamed from: h */
    public boolean f105644h = true;

    /* renamed from: i */
    public C40800j f105645i;

    /* renamed from: c */
    public int mo60557c() {
        if (this.f105634a) {
            return 1;
        }
        return this.f105641e.size() + 2;
    }

    /* renamed from: b */
    public int mo100755b(int i) {
        if (this.f105641e.get(i - 1)) {
            return 3;
        }
        return 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final StickerWrapper mo100760e(int i) {
        return (StickerWrapper) this.f105642f.get(i);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f4721g = new C1241a() {
                /* renamed from: a */
                public final int mo5386a(int i) {
                    if (InfoStickerAdapterV2.this.mo58029a(i) == -2 || InfoStickerAdapterV2.this.mo58029a(i) == -5 || InfoStickerAdapterV2.this.mo58029a(i) == -4 || InfoStickerAdapterV2.this.mo58029a(i) == 3 || InfoStickerAdapterV2.this.getItemViewType(i) == Integer.MIN_VALUE) {
                        return gridLayoutManager.f4716b;
                    }
                    return 1;
                }
            };
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo100759a(EffectChannelResponse effectChannelResponse) {
        if (C6311g.m19573a(effectChannelResponse.categoryResponseList)) {
            int i = 0;
            for (int i2 = 0; i2 < effectChannelResponse.allCategoryEffects.size(); i2++) {
                StickerWrapper a = StickerWrapper.m129063a((Effect) effectChannelResponse.allCategoryEffects.get(i2), this.f105640d);
                if (this.f105644h || !C40814t.m130429e(a.f104908a)) {
                    this.f105641e.put(i, false);
                    int i3 = i + 1;
                    this.f105642f.put(i, a);
                    i = i3;
                }
            }
            notifyDataSetChanged();
            return;
        }
        mo58045a(effectChannelResponse.categoryResponseList);
    }

    /* renamed from: a */
    public final void mo58045a(List<EffectCategoryResponse> list) {
        super.mo58045a(list);
        if (!C6311g.m19573a(list)) {
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) list.get(i2);
                if (effectCategoryResponse != null && !C6311g.m19573a(effectCategoryResponse.totalEffects)) {
                    int i3 = i;
                    for (int i4 = 0; i4 < effectCategoryResponse.totalEffects.size(); i4++) {
                        StickerWrapper a = StickerWrapper.m129063a((Effect) effectCategoryResponse.totalEffects.get(i4), effectCategoryResponse.name);
                        if (this.f105644h || !C40814t.m130429e(a.f104908a)) {
                            this.f105641e.put(i3, false);
                            int i5 = i3 + 1;
                            this.f105642f.put(i3, a);
                            i3 = i5;
                        }
                    }
                    if (i2 != size - 1) {
                        int i6 = i3 + 1;
                        this.f105641e.put(i3, true);
                        i = i6;
                    } else {
                        i = i3;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (i == 3) {
            return m129936c(viewGroup, i);
        }
        return super.mo58032a(viewGroup, i);
    }

    InfoStickerAdapterV2(FragmentActivity fragmentActivity, String str) {
        this.f105639c = fragmentActivity;
        this.f105640d = str;
    }

    /* renamed from: c */
    private static C1293v m129936c(ViewGroup viewGroup, int i) {
        return new InfoStickerDividerHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sh, viewGroup, false));
    }

    /* renamed from: b */
    public C1293v mo100756b(ViewGroup viewGroup, int i) {
        InfoStickerHolder infoStickerHolder = new InfoStickerHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.g9, viewGroup, false), this.f105639c, this);
        infoStickerHolder.f105672c = this.f105635b;
        return infoStickerHolder;
    }

    /* renamed from: b */
    public void mo100757b(C1293v vVar, int i) {
        if (mo100755b(i) == 1) {
            InfoStickerHolder infoStickerHolder = (InfoStickerHolder) vVar;
            int i2 = i - 1;
            infoStickerHolder.mo100775a(this.f105639c, (StickerWrapper) this.f105642f.get(i2), this.f105640d);
            infoStickerHolder.f105675f = i;
            this.f105643g.put(((StickerWrapper) this.f105642f.get(i2)).f104908a.getEffectId(), infoStickerHolder);
        }
    }
}
