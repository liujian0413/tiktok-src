package com.p280ss.android.ugc.aweme.base.widget;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.LoadMoreViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter */
public abstract class RecyclerHeaderViewAdapter<DATA> extends BaseAdapter<DATA> {

    /* renamed from: a */
    public static int f62013a = 10000;

    /* renamed from: b */
    public static int f62014b = 20000;

    /* renamed from: c */
    public View f62015c;

    /* renamed from: d */
    public View f62016d;

    /* renamed from: com.ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter$a */
    static class C23504a extends C1293v {
        public C23504a(View view) {
            super(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1293v mo61146b(ViewGroup viewGroup, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo61148b(C1293v vVar, int i) {
    }

    /* renamed from: d */
    public final boolean mo61150d() {
        if (this.f62015c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int mo60557c() {
        int i;
        if (this.f62015c == null) {
            i = 0;
        } else {
            i = 1;
        }
        return super.mo60557c() + i;
    }

    public RecyclerHeaderViewAdapter() {
        mo66506d(R.string.am0);
    }

    /* renamed from: b */
    public final void mo61147b() {
        if (this.f62015c != null) {
            f62013a++;
            this.f62015c = null;
            notifyItemRemoved(0);
        }
    }

    /* renamed from: c_ */
    public final void mo61149c_(View view) {
        if (view != null) {
            this.f62015c = view;
            notifyItemInserted(0);
        }
    }

    /* renamed from: a */
    public int mo58029a(int i) {
        if (this.f62015c == null && this.f62016d == null) {
            return 0;
        }
        if (i == 0) {
            return f62013a;
        }
        if (!this.f67566v || i != getItemCount() - 1) {
            return 0;
        }
        return f62014b;
    }

    /* renamed from: a */
    public C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (this.f62015c != null && i == f62013a) {
            return new C23504a(this.f62015c);
        }
        if (this.f62016d == null || i != f62014b) {
            return mo61146b(viewGroup, i);
        }
        return mo61886a_(viewGroup);
    }

    /* renamed from: a */
    public void mo58033a(C1293v vVar, int i) {
        if (getItemViewType(i) == 0) {
            if (!(this.f62015c == null || i == 0)) {
                i--;
            }
            mo61148b(vVar, i);
            return;
        }
        if (getItemViewType(i) == f62014b && (vVar instanceof LoadMoreViewHolder)) {
            ((LoadMoreViewHolder) vVar).mo66509a();
        }
    }
}
