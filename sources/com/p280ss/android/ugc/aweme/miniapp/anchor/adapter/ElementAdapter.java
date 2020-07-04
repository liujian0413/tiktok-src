package com.p280ss.android.ugc.aweme.miniapp.anchor.adapter;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.ElementAdapter */
public abstract class ElementAdapter<E, T extends C1293v> extends C1262a<T> {

    /* renamed from: a */
    List<E> f86998a = new ArrayList();

    /* renamed from: b */
    public C33335j<E> f86999b;

    public int getItemCount() {
        if (this.f86998a == null) {
            return 0;
        }
        return this.f86998a.size();
    }

    /* renamed from: a */
    public final void mo85448a(List<E> list) {
        this.f86998a.clear();
        this.f86998a.addAll(list);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85447a(int i, View view) {
        if (this.f86999b != null) {
            this.f86999b.mo85483a(this.f86998a.get(i));
        }
    }

    public void onBindViewHolder(T t, int i) {
        t.itemView.setOnClickListener(new C33326a(this, i));
    }
}
