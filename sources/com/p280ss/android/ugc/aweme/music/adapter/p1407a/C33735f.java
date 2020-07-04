package com.p280ss.android.ugc.aweme.music.adapter.p1407a;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33751b;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33752c;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33757h;
import com.p280ss.android.ugc.aweme.music.adapter.type.LoadingViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.f */
public final class C33735f extends C25647a<List<C33757h>> {
    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3c, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new LoadingViewHolder(inflate);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m108841a((List) obj, i);
    }

    /* renamed from: a */
    private static boolean m108841a(List<C33757h> list, int i) {
        C7573i.m23587b(list, "items");
        int size = list.size();
        if (i < 0 || size <= i) {
            return false;
        }
        if ((list.get(i) instanceof C33752c) || (list.get(i) instanceof C33751b)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
        m108840a((List) obj, i, vVar, list);
    }

    /* renamed from: a */
    private static void m108840a(List<C33757h> list, int i, C1293v vVar, List<Object> list2) {
        C7573i.m23587b(list, "items");
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list2, "payloads");
        if (vVar instanceof LoadingViewHolder) {
            LoadingViewHolder loadingViewHolder = (LoadingViewHolder) vVar;
            DmtStatusView dmtStatusView = loadingViewHolder.f88107a;
            DmtStatusView dmtStatusView2 = loadingViewHolder.f88107a;
            C7573i.m23582a((Object) dmtStatusView2, "holder.statusView");
            dmtStatusView.setBuilder(C10803a.m31631a(dmtStatusView2.getContext()));
            if (list.get(i) instanceof C33752c) {
                loadingViewHolder.f88107a.setStatus(-1);
                loadingViewHolder.f88107a.mo25942f();
            } else if (list.get(i) instanceof C33751b) {
                loadingViewHolder.f88107a.setStatus(-1);
                loadingViewHolder.f88107a.mo25944h();
            }
        }
    }
}
