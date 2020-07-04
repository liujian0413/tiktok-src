package com.p280ss.android.ugc.aweme.friends.adapter;

import android.support.p029v7.widget.RecyclerView.C1264c;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.p280ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.SummonFriendAdapter */
public class SummonFriendAdapter extends LoadMoreRecyclerViewAdapter {

    /* renamed from: a */
    public int f78971a;

    /* renamed from: b */
    public String f78972b;

    /* renamed from: c */
    public C30020a f78973c;

    /* renamed from: d */
    private List<SummonFriendItem> f78974d = new ArrayList();

    /* renamed from: e */
    private String f78975e;

    /* renamed from: f */
    private int f78976f;

    /* renamed from: com.ss.android.ugc.aweme.friends.adapter.SummonFriendAdapter$a */
    public interface C30020a {
        /* renamed from: a */
        String mo76241a();
    }

    /* renamed from: c */
    public final int mo60557c() {
        if (this.f78974d == null) {
            return 0;
        }
        return this.f78974d.size();
    }

    /* renamed from: a */
    public final void mo76239a(List<SummonFriendItem> list) {
        this.f78974d = list;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        return ((SummonFriendItem) this.f78974d.get(i)).type;
    }

    /* renamed from: b */
    public final void mo76240b(List<SummonFriendItem> list) {
        this.f78974d = list;
        if (this.f67566v) {
            notifyItemRangeChanged(this.f78971a - 1, getItemCount() - this.f78971a);
            notifyItemChanged(getItemCount() - 1);
            return;
        }
        notifyItemRangeChanged(this.f78971a, getItemCount() - this.f78971a);
    }

    public SummonFriendAdapter(String str, int i) {
        this.f78975e = str;
        this.f78976f = i;
        registerAdapterDataObserver(new C1264c() {
            /* renamed from: a */
            public final void mo5721a() {
                SummonFriendAdapter.this.f78971a = SummonFriendAdapter.this.getItemCount();
            }

            /* renamed from: b */
            public final void mo5725b(int i, int i2) {
                SummonFriendAdapter.this.f78971a = SummonFriendAdapter.this.getItemCount();
            }

            /* renamed from: c */
            public final void mo5726c(int i, int i2) {
                SummonFriendAdapter.this.f78971a = SummonFriendAdapter.this.getItemCount();
            }

            /* renamed from: a */
            public final void mo5722a(int i, int i2) {
                SummonFriendAdapter.this.f78971a = SummonFriendAdapter.this.getItemCount();
            }

            /* renamed from: a */
            public final void mo5723a(int i, int i2, int i3) {
                SummonFriendAdapter.this.f78971a = SummonFriendAdapter.this.getItemCount();
            }
        });
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (i != 2) {
            return new SummonFriendViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3n, viewGroup, false), this.f78975e, this.f78976f);
        }
        return new SummonFriendLabelViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3m, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (getItemViewType(i) != 2) {
            SummonFriendViewHolder summonFriendViewHolder = (SummonFriendViewHolder) vVar;
            summonFriendViewHolder.f78981c = this.f78973c;
            summonFriendViewHolder.mo76243a((SummonFriendItem) this.f78974d.get(i), this.f78972b);
            return;
        }
        ((SummonFriendLabelViewHolder) vVar).mo76242a(((SummonFriendItem) this.f78974d.get(i)).label);
    }
}
