package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.BaseWordViewHolder */
public abstract class BaseWordViewHolder<T> extends C1293v {

    /* renamed from: a */
    protected TextView f69427a;

    /* renamed from: b */
    protected View f69428b;

    /* renamed from: c */
    protected TagFlowLayout f69429c;

    /* renamed from: d */
    protected View f69430d;

    /* renamed from: e */
    protected View f69431e;

    /* renamed from: f */
    protected List<T> f69432f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo67912a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo67913a(T t, int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo67916b(List<T> list);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo67918c(List<T> list);

    /* renamed from: b */
    public void mo67917c() {
        int visibleViewCount = this.f69429c.getVisibleViewCount();
        int i = 0;
        while (i < visibleViewCount && i < this.f69432f.size()) {
            mo67913a(this.f69432f.get(i), i);
            i++;
        }
    }

    /* renamed from: d */
    private void m86737d() {
        this.f69427a = (TextView) this.itemView.findViewById(R.id.e3f);
        this.f69428b = this.itemView.findViewById(R.id.bso);
        this.f69429c = (TagFlowLayout) this.itemView.findViewById(R.id.dik);
        this.f69430d = this.itemView.findViewById(R.id.bsx);
        this.f69431e = this.itemView.findViewById(R.id.eck);
    }

    public BaseWordViewHolder(View view) {
        super(view);
        m86737d();
    }

    /* renamed from: a */
    public final void mo67914a(List<T> list) {
        if (C6307b.m19566a((Collection<T>) list)) {
            C23487o.m77140a(this.itemView, 8);
        } else if (!mo67916b(list)) {
            mo67918c(list);
            this.f69429c.post(new C26474a(this));
        }
    }
}
