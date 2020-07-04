package com.p280ss.android.ugc.aweme.music.adapter.p1407a;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33755f;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33757h;
import com.p280ss.android.ugc.aweme.music.adapter.type.MarginViewHolder;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.i */
public final class C33738i extends C25647a<List<C33757h>> {

    /* renamed from: a */
    private final float f88094a = 16.0f;

    /* renamed from: a */
    private static void m108855a(List<C33757h> list, int i, C1293v vVar, List<Object> list2) {
        C7573i.m23587b(list, "items");
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list2, "payloads");
    }

    public C33738i(float f) {
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new LayoutParams(-1, (int) C9738o.m28708b(viewGroup.getContext(), this.f88094a)));
        return new MarginViewHolder(view);
    }

    /* renamed from: a */
    private static boolean m108856a(List<C33757h> list, int i) {
        C7573i.m23587b(list, "items");
        int size = list.size();
        if (i >= 0 && size > i) {
            return list.get(i) instanceof C33755f;
        }
        return false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m108856a((List) obj, i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
        m108855a((List) obj, i, vVar, list);
    }
}
