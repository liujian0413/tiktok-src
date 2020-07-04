package com.p280ss.android.ugc.aweme.search.widget;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.search.widget.PoiFilterAdapter */
public class PoiFilterAdapter extends C1262a<C37390b> {

    /* renamed from: a */
    private List<C37393a> f97631a;

    /* renamed from: b */
    private C37389a f97632b;

    /* renamed from: com.ss.android.ugc.aweme.search.widget.PoiFilterAdapter$a */
    public interface C37389a {
    }

    /* renamed from: com.ss.android.ugc.aweme.search.widget.PoiFilterAdapter$b */
    static class C37390b extends C1293v {

        /* renamed from: a */
        private View f97633a;

        /* renamed from: b */
        private C37389a f97634b;

        /* renamed from: c */
        private DmtTextView f97635c;

        /* renamed from: d */
        private ImageView f97636d;

        C37390b(View view, C37389a aVar) {
            super(view);
            this.f97633a = view;
            this.f97634b = aVar;
            this.f97635c = (DmtTextView) view.findViewById(R.id.akf);
            this.f97636d = (ImageView) view.findViewById(R.id.b61);
        }

        /* renamed from: a */
        public final void mo94135a(C37393a aVar, int i) {
            if (!TextUtils.isEmpty(aVar.f97646c)) {
                this.f97635c.setText(aVar.f97646c);
                this.f97635c.setTextColor(this.f97633a.getContext().getResources().getColor(R.color.ab0));
                this.f97636d.setImageResource(R.drawable.aer);
            } else {
                this.f97635c.setText(aVar.f97644a);
                this.f97635c.setTextColor(this.f97633a.getContext().getResources().getColor(R.color.ab4));
                this.f97636d.setImageResource(R.drawable.aeq);
            }
            if (C6307b.m19566a((Collection<T>) aVar.f97645b)) {
                this.f97636d.setVisibility(8);
                if (aVar.f97647d) {
                    this.f97635c.setTextColor(this.f97633a.getContext().getResources().getColor(R.color.ab0));
                } else {
                    this.f97635c.setTextColor(this.f97633a.getContext().getResources().getColor(R.color.ab4));
                }
            } else {
                this.f97636d.setVisibility(0);
            }
            this.f97633a.setOnClickListener(new C37394b(this, aVar, i));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo94136a(C37393a aVar, int i, View view) {
            this.f97635c.setTextColor(this.f97633a.getContext().getResources().getColor(R.color.ab0));
            this.f97636d.setImageResource(R.drawable.aes);
        }
    }

    public int getItemCount() {
        if (this.f97631a == null) {
            return 0;
        }
        return this.f97631a.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C37390b bVar, int i) {
        bVar.mo94135a((C37393a) this.f97631a.get(i), i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C37390b onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0h, viewGroup, false);
        LayoutParams layoutParams = inflate.getLayoutParams();
        int b = C23482j.m77098b(viewGroup.getContext());
        if (viewGroup.getMeasuredWidth() > 0) {
            b = viewGroup.getMeasuredWidth();
        }
        int i2 = 4;
        if (getItemCount() != 0 && getItemCount() <= 4) {
            i2 = getItemCount();
        }
        layoutParams.width = b / i2;
        inflate.setLayoutParams(layoutParams);
        return new C37390b(inflate, this.f97632b);
    }
}
