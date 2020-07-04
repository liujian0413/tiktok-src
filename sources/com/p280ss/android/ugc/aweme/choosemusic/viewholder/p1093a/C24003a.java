package com.p280ss.android.ugc.aweme.choosemusic.viewholder.p1093a;

import android.graphics.Color;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.ClearHistoryViewHolder;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.a.a */
public final class C24003a extends C25647a<List<? extends MusicSearchHistory>> {

    /* renamed from: a */
    private boolean f63450a;

    public C24003a(boolean z) {
        this.f63450a = z;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tr, viewGroup, false);
        if (this.f63450a) {
            ((TextView) inflate.findViewById(R.id.drv)).setTextColor(Color.parseColor("#80ffffff"));
        }
        C7573i.m23582a((Object) inflate, "view");
        return new ClearHistoryViewHolder(inflate);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m78751a((List) obj, i);
    }

    /* renamed from: a */
    private static boolean m78751a(List<? extends MusicSearchHistory> list, int i) {
        C7573i.m23587b(list, "items");
        if (((MusicSearchHistory) list.get(i)).type == Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62252a(List<? extends MusicSearchHistory> list, int i, C1293v vVar, List<? extends Object> list2) {
        C7573i.m23587b(list, "items");
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list2, "payloads");
        ((ClearHistoryViewHolder) vVar).mo62187a((MusicSearchHistory) list.get(i), this.f63450a);
    }
}
