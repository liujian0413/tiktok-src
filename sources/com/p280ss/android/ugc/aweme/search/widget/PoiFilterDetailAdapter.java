package com.p280ss.android.ugc.aweme.search.widget;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.search.widget.PoiFilterDetailAdapter */
public class PoiFilterDetailAdapter extends C1262a<C37392b> {

    /* renamed from: a */
    private List<PoiOptionStruct> f97637a;

    /* renamed from: b */
    private C37391a f97638b;

    /* renamed from: com.ss.android.ugc.aweme.search.widget.PoiFilterDetailAdapter$a */
    public interface C37391a {
    }

    /* renamed from: com.ss.android.ugc.aweme.search.widget.PoiFilterDetailAdapter$b */
    static class C37392b extends C1293v {

        /* renamed from: a */
        private C37391a f97639a;

        /* renamed from: b */
        private DmtTextView f97640b;

        /* renamed from: c */
        private ImageView f97641c;

        /* renamed from: d */
        private View f97642d;

        /* renamed from: e */
        private View f97643e;

        C37392b(View view, C37391a aVar) {
            super(view);
            this.f97640b = (DmtTextView) view.findViewById(R.id.cey);
            this.f97641c = (ImageView) view.findViewById(R.id.cf0);
            this.f97642d = view.findViewById(R.id.dmr);
            this.f97643e = view.findViewById(R.id.ob);
            this.f97639a = aVar;
        }

        /* renamed from: a */
        public final void mo94137a(int i, int i2, PoiOptionStruct poiOptionStruct) {
            this.f97640b.setText(poiOptionStruct.getName());
            if (poiOptionStruct.isSelected()) {
                this.f97641c.setVisibility(0);
            } else {
                this.f97641c.setVisibility(8);
            }
            if (i == 0) {
                this.f97642d.setVisibility(0);
            } else {
                this.f97642d.setVisibility(8);
            }
            if (i == i2 - 1) {
                this.f97643e.setVisibility(0);
            } else {
                this.f97643e.setVisibility(8);
            }
            this.itemView.setOnClickListener(new C37395c(this, i, poiOptionStruct));
        }
    }

    public int getItemCount() {
        if (this.f97637a == null) {
            return 0;
        }
        return this.f97637a.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C37392b bVar, int i) {
        bVar.mo94137a(i, getItemCount(), (PoiOptionStruct) this.f97637a.get(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C37392b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C37392b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0i, viewGroup, false), this.f97638b);
    }
}
