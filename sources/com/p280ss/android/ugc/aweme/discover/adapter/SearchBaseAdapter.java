package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchBaseAdapter */
public abstract class SearchBaseAdapter<T> extends RecyclerHeaderViewAdapter<T> {

    /* renamed from: e */
    protected C26501r f69665e;

    /* renamed from: f */
    public String f69666f;

    /* renamed from: a */
    public final int mo58030a(View view) {
        return (int) C9738o.m28708b(view.getContext(), 45.0f);
    }

    public SearchBaseAdapter(C26501r rVar, String str) {
        this.f69665e = rVar;
        this.f69666f = str;
    }

    /* renamed from: a */
    public void mo58033a(C1293v vVar, int i) {
        try {
            super.mo58033a(vVar, i);
        } finally {
            vVar.itemView.post(new Runnable() {
                public final void run() {
                    C26612d.m87397c();
                }
            });
        }
    }
}
