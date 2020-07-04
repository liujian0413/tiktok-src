package com.p280ss.android.ugc.aweme.poi.search;

import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.search.POISearchAdapterSuper */
public class POISearchAdapterSuper extends BaseAdapter<PoiStruct> implements C35239i {

    /* renamed from: a */
    public boolean f92237a;

    /* renamed from: b */
    private String f92238b;

    /* renamed from: c */
    private PoiStruct f92239c;

    /* renamed from: d */
    private int f92240d;

    /* renamed from: a */
    public final void mo89664a(PoiStruct poiStruct) {
        this.f92239c = poiStruct;
    }

    /* renamed from: a */
    public final void mo89665a(String str) {
        this.f92238b = str;
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (!this.f92237a && i == this.f92240d && this.f92239c != null) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a_ */
    public final C1293v mo61886a_(ViewGroup viewGroup) {
        this.f67550q = C0683b.m2912c(viewGroup.getContext(), R.color.a53);
        return super.mo61886a_(viewGroup);
    }

    /* renamed from: a */
    public final void mo58045a(List<PoiStruct> list) {
        if (this.f92239c != null && (C6307b.m19566a((Collection<T>) list) || !this.f92239c.poiId.equals(((PoiStruct) list.get(0)).poiId))) {
            list.add(this.f92240d, this.f92239c);
        }
        super.mo58045a(list);
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new POISearchViewHolderSuper(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0q, viewGroup, false), this.f92237a);
        }
        return new POISearchOtherViewHolderSuper(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0r, viewGroup, false), this.f92237a);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (mo58029a(i) == 0) {
            ((POISearchViewHolderSuper) vVar).mo89682a((PoiStruct) this.f67539l.get(i), i, this.f92238b);
        } else {
            ((POISearchOtherViewHolderSuper) vVar).mo89680a((PoiStruct) this.f67539l.get(i), i, this.f92238b);
        }
    }
}
