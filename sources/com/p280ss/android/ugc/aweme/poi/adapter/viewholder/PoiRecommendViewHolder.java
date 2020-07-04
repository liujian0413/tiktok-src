package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.adapter.RecommendImageAdapter;
import com.p280ss.android.ugc.aweme.poi.bean.C35071c;
import com.p280ss.android.ugc.aweme.poi.model.PoiPhoto;
import com.p280ss.android.ugc.aweme.poi.model.PoiTypeEnum;
import com.p280ss.android.ugc.aweme.poi.p335ui.SpaceDecoration;
import com.p280ss.android.ugc.aweme.poi.preview.C35135a;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p280ss.android.ugc.aweme.widget.flowlayout.C43554a;
import com.p280ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import com.p280ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendViewHolder */
public class PoiRecommendViewHolder extends C1293v {

    /* renamed from: a */
    public Context f91614a;

    /* renamed from: b */
    public PoiSimpleBundle f91615b;

    /* renamed from: c */
    private C35071c f91616c;

    /* renamed from: d */
    private RecommendImageAdapter f91617d;
    LinearLayout mRecommendLayout;

    public PoiRecommendViewHolder(View view) {
        super(view);
        this.f91614a = view.getContext();
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: a */
    private void m113139a(List<String> list) {
        View inflate = LayoutInflater.from(this.f91614a).inflate(R.layout.ph, null, false);
        this.mRecommendLayout.addView(inflate, new LayoutParams(-1, -2));
        TextView textView = (TextView) inflate.findViewById(R.id.cem);
        TextView textView2 = (TextView) inflate.findViewById(R.id.cen);
        if (!this.f91616c.f91727e) {
            textView.setVisibility(8);
            textView2.setVisibility(0);
        }
        final TagFlowLayout tagFlowLayout = (TagFlowLayout) inflate.findViewById(R.id.cel);
        tagFlowLayout.setAdapter(new C43554a<String>(list) {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public View mo67958a(FlowLayout flowLayout, int i, String str) {
                TextView textView = (TextView) LayoutInflater.from(PoiRecommendViewHolder.this.f91614a).inflate(R.layout.a0t, tagFlowLayout, false);
                textView.setText(str);
                return textView;
            }
        });
    }

    /* renamed from: a */
    public final void mo88835a(C35071c cVar, PoiSimpleBundle poiSimpleBundle) {
        if (this.f91616c == null) {
            this.f91615b = poiSimpleBundle;
            this.f91616c = cVar;
            PoiTypeEnum poiType = PoiTypeEnum.getPoiType(cVar.f91725c);
            if (!C6307b.m19566a((Collection<T>) cVar.f91724b)) {
                m113138a(cVar.f91726d, cVar.f91724b);
                return;
            }
            if (PoiTypeEnum.POI_TYPE_RESTAURANT == poiType && !C6307b.m19566a((Collection<T>) cVar.f91723a)) {
                m113139a(cVar.f91723a);
            }
        }
    }

    /* renamed from: a */
    private void m113138a(String str, List<PoiPhoto> list) {
        View inflate = LayoutInflater.from(this.f91614a).inflate(R.layout.pg, null, false);
        this.mRecommendLayout.addView(inflate, new LayoutParams(-1, -2));
        TextView textView = (TextView) inflate.findViewById(R.id.cem);
        TextView textView2 = (TextView) inflate.findViewById(R.id.cen);
        if (!this.f91616c.f91727e) {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            textView2.setText(str);
        } else {
            textView.setText(str);
        }
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.cek);
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(this.f91614a, 0, false));
        recyclerView.mo5525a((C1272h) new SpaceDecoration(this.f91614a.getResources().getDimensionPixelOffset(R.dimen.lj)));
        recyclerView.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    C6907h.m21517a((Context) null, "cell_slide", "slide", 0, 0);
                    C35135a.m113346a(PoiRecommendViewHolder.this.f91615b, "recommend");
                }
            }
        });
        this.f91617d = new RecommendImageAdapter(this.f91614a, recyclerView, list, this.f91615b);
        recyclerView.setAdapter(this.f91617d);
    }
}
