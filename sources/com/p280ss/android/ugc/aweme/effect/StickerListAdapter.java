package com.p280ss.android.ugc.aweme.effect;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.effect.EffectListItemViewHolder.C27334a;
import com.p280ss.android.ugc.aweme.feed.model.NewFaceSticker;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effect.StickerListAdapter */
public final class StickerListAdapter extends BaseAdapter<NewFaceSticker> {

    /* renamed from: a */
    public boolean f72158a;

    public StickerListAdapter(boolean z) {
        this.f72158a = z;
    }

    /* renamed from: b */
    public final NewFaceSticker mo70406b(int i) {
        if (i >= this.f67539l.size() || this.f67539l == null) {
            return null;
        }
        List list = this.f67539l;
        if (list == null) {
            C7573i.m23580a();
        }
        return (NewFaceSticker) list.get(i);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        ((EffectListItemViewHolder) vVar).mo70350a(mo70406b(i));
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        return new EffectListItemViewHolder(C27334a.m89621a(viewGroup), this.f72158a);
    }
}
