package com.p280ss.android.ugc.aweme.music.adapter.p1407a;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.music.adapter.LocalSoundEmptyViewHolder;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33753d;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33757h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.g */
public final class C33736g extends C25647a<List<C33757h>> {
    /* renamed from: a */
    private static void m108845a(List<C33757h> list, int i, C1293v vVar, List<Object> list2) {
        C7573i.m23587b(list, "items");
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list2, "payloads");
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x_, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new LocalSoundEmptyViewHolder(inflate);
    }

    /* renamed from: a */
    private static boolean m108846a(List<C33757h> list, int i) {
        C7573i.m23587b(list, "items");
        return list.get(i) instanceof C33753d;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m108846a((List) obj, i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
        m108845a((List) obj, i, vVar, list);
    }
}
