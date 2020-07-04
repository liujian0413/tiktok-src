package com.p280ss.android.ugc.aweme.choosemusic.viewholder.p1093a;

import android.graphics.Color;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.SearchHistoryViewHolder;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.a.b */
public final class C24004b extends C25647a<List<? extends MusicSearchHistory>> {

    /* renamed from: a */
    private boolean f63451a;

    public C24004b(boolean z) {
        this.f63451a = z;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2m, viewGroup, false);
        if (this.f63451a) {
            ((ImageView) inflate.findViewById(R.id.b_0)).setImageResource(R.drawable.a8d);
            ((TextView) inflate.findViewById(R.id.dvm)).setTextColor(Color.parseColor("#e6ffffff"));
            ((ImageView) inflate.findViewById(R.id.b7c)).setImageResource(R.drawable.a5a);
        }
        C7573i.m23582a((Object) inflate, "view");
        return new SearchHistoryViewHolder(inflate);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m78756a((List) obj, i);
    }

    /* renamed from: a */
    private static boolean m78756a(List<? extends MusicSearchHistory> list, int i) {
        C7573i.m23587b(list, "items");
        if (((MusicSearchHistory) list.get(i)).type != Integer.MAX_VALUE) {
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
        ((SearchHistoryViewHolder) vVar).mo62247a((MusicSearchHistory) list.get(i), this.f63451a);
    }
}
