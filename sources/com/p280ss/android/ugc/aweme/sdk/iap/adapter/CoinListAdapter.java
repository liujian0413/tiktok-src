package com.p280ss.android.ugc.aweme.sdk.iap.adapter;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.adapter.CoinListAdapter */
public class CoinListAdapter extends C1262a<ViewHolder> implements OnClickListener {

    /* renamed from: a */
    public C37331a f97494a;

    /* renamed from: b */
    private List<C37332a> f97495b = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.sdk.iap.adapter.CoinListAdapter$ViewHolder */
    public class ViewHolder extends C1293v {

        /* renamed from: a */
        public TextView f97496a;

        /* renamed from: b */
        public TextView f97497b;

        public ViewHolder(View view) {
            super(view);
            this.f97496a = (TextView) view.findViewById(R.id.dry);
            this.f97497b = (TextView) view.findViewById(R.id.drz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sdk.iap.adapter.CoinListAdapter$a */
    public interface C37331a {
        /* renamed from: a */
        void mo93950a(View view, C37332a aVar);
    }

    public int getItemCount() {
        return this.f97495b.size();
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f97494a != null) {
            this.f97494a.mo93950a(view, (C37332a) view.getTag());
        }
    }

    /* renamed from: a */
    private C37332a m119853a(int i) {
        if (i >= this.f97495b.size() || i < 0) {
            return null;
        }
        return (C37332a) this.f97495b.get(i);
    }

    /* renamed from: a */
    public final void mo93954a(List<C37332a> list) {
        this.f97495b.clear();
        if (list != null && list.size() > 0) {
            this.f97495b.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.acg, viewGroup, false);
        inflate.setOnClickListener(this);
        return new ViewHolder(inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        C37332a a = m119853a(i);
        if (a != null) {
            viewHolder.f97496a.setText(viewHolder.itemView.getResources().getString(R.string.bba, new Object[]{Integer.valueOf(a.f97502d)}));
            viewHolder.f97497b.setText(a.f97501c);
            viewHolder.itemView.setTag(a);
        }
    }
}
