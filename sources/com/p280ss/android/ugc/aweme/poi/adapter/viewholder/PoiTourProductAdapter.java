package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiTourProductAdapter */
public final class PoiTourProductAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    private final Context f91627a;

    /* renamed from: b */
    private final List<AwemeRawAd> f91628b;

    /* renamed from: c */
    private final PoiSimpleBundle f91629c;

    public final int getItemCount() {
        return this.f91628b.size();
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "p0");
        ((PoiTourProductViewHolder) vVar).mo88837a((AwemeRawAd) this.f91628b.get(i), this.f91629c);
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "p0");
        View inflate = LayoutInflater.from(this.f91627a).inflate(R.layout.a0u, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new PoiTourProductViewHolder(inflate);
    }

    public PoiTourProductAdapter(Context context, List<? extends AwemeRawAd> list, PoiSimpleBundle poiSimpleBundle) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(list, "ads");
        this.f91627a = context;
        this.f91628b = list;
        this.f91629c = poiSimpleBundle;
    }
}
