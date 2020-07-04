package com.p280ss.android.ugc.aweme.commercialize.anchor.adapter;

import android.arch.lifecycle.C0043i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.adapter.a */
public final class C24529a extends C25647a<List<? extends C24536e>> {

    /* renamed from: a */
    public final C0043i f64749a;

    /* renamed from: a */
    private static boolean m80534a(List<C24536e> list, int i) {
        C7573i.m23587b(list, "items");
        return true;
    }

    public C24529a(C0043i iVar) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        this.f64749a = iVar;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a4k, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new SimpleAnchorViewHolder(inflate, this.f64749a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m80534a((List) obj, i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
        m80533a((List) obj, i, vVar, list);
    }

    /* renamed from: a */
    private static void m80533a(List<C24536e> list, int i, C1293v vVar, List<Object> list2) {
        C7573i.m23587b(list, "items");
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list2, "payloads");
        C24536e eVar = (C24536e) list.get(i);
        if (vVar instanceof SimpleAnchorViewHolder) {
            ((SimpleAnchorViewHolder) vVar).mo64325a(eVar);
        }
    }
}
