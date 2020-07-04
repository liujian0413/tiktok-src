package com.p280ss.android.ugc.aweme.effect.base;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import com.p280ss.android.ugc.aweme.effect.EffectModel;
import com.p280ss.android.ugc.aweme.effect.p1194a.C27359a;
import com.p280ss.android.ugc.aweme.shortvideo.C38527bf;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.effect.base.AbsVEDownloadableEffectAdapter */
public abstract class AbsVEDownloadableEffectAdapter<VH extends C1293v> extends C1262a<VH> {

    /* renamed from: a */
    private List<Integer> f72281a = new ArrayList();

    /* renamed from: b */
    private final RecyclerView f72282b;

    /* renamed from: c */
    public List<EffectModel> f72283c = new ArrayList();

    /* renamed from: d */
    private final C27359a f72284d;

    /* renamed from: a */
    private final void m89769a() {
        this.f72281a.clear();
        for (EffectModel a : this.f72283c) {
            this.f72281a.add(Integer.valueOf(m89768a(a)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo70492a(int i) {
        return ((Number) this.f72281a.get(i)).intValue();
    }

    /* renamed from: a */
    public final void mo70494a(List<? extends EffectModel> list) {
        if (list != null) {
            this.f72283c.clear();
            this.f72283c.addAll(list);
            m89769a();
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private final int m89768a(EffectModel effectModel) {
        if (C38527bf.m123172a(effectModel.resDir)) {
            return 3;
        }
        C27359a aVar = this.f72284d;
        if (aVar == null || !aVar.mo70463a(effectModel)) {
            C27359a aVar2 = this.f72284d;
            if (aVar2 == null || !aVar2.mo70466b(effectModel)) {
                return 0;
            }
        }
        return 2;
    }

    public AbsVEDownloadableEffectAdapter(RecyclerView recyclerView, C27359a aVar) {
        this.f72282b = recyclerView;
        this.f72284d = aVar;
    }

    /* renamed from: a */
    public final void mo70493a(int i, int i2) {
        if (this.f72281a.size() > i) {
            m89768a((EffectModel) this.f72283c.get(i));
            int intValue = ((Number) this.f72281a.get(i)).intValue();
            StringBuilder sb = new StringBuilder("onEffectStateChanged: position=");
            sb.append(i);
            sb.append(",newState=");
            sb.append(i2);
            sb.append(",current=");
            sb.append(intValue);
            sb.append(",state=");
            sb.append(i2);
            C41530am.m132280a(sb.toString());
            if (intValue != i2) {
                this.f72281a.set(i, Integer.valueOf(i2));
                notifyItemChanged(i);
            }
        }
    }
}
