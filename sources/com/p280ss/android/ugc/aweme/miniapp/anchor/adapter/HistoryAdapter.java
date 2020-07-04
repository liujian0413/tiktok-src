package com.p280ss.android.ugc.aweme.miniapp.anchor.adapter;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.miniapp.anchor.fragment.SearchElementsFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.HistoryAdapter */
public class HistoryAdapter extends C1262a<ViewHolder> {

    /* renamed from: a */
    public SearchElementsFragment f87017a;

    /* renamed from: b */
    private List<String> f87018b = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.HistoryAdapter$ViewHolder */
    public class ViewHolder extends C1293v {

        /* renamed from: a */
        DmtTextView f87019a;

        /* renamed from: b */
        ImageView f87020b;

        public ViewHolder(View view) {
            super(view);
            this.f87019a = (DmtTextView) view.findViewById(R.id.avp);
            this.f87020b = (ImageView) view.findViewById(R.id.avo);
            this.f87020b.setOnClickListener(new OnClickListener(HistoryAdapter.this) {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    HistoryAdapter.this.mo85458a(HistoryAdapter.this.f87017a.mo85497a(ViewHolder.this.getAdapterPosition()));
                }
            });
            view.setOnClickListener(new OnClickListener(HistoryAdapter.this) {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    HistoryAdapter.this.f87017a.mo85498a(ViewHolder.this.f87019a.getText());
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo85457a() {
        this.f87018b.clear();
        notifyDataSetChanged();
    }

    public int getItemCount() {
        if (this.f87018b == null) {
            return 0;
        }
        return this.f87018b.size();
    }

    public HistoryAdapter(SearchElementsFragment searchElementsFragment) {
        this.f87017a = searchElementsFragment;
    }

    /* renamed from: a */
    public final void mo85458a(List<String> list) {
        this.f87018b.clear();
        this.f87018b.addAll(list);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.t8, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (i >= 0 && i <= getItemCount() - 1) {
            viewHolder.f87019a.setText((String) this.f87018b.get(i));
        }
    }
}
