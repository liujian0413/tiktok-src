package com.p280ss.android.ugc.aweme.poi.p335ui.publish;

import android.content.Context;
import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.poi.model.C35127p;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.p335ui.publish.SpeedRecommendPoiAdapter.C35397a;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.SpeedRecommendPoiView */
public class SpeedRecommendPoiView extends LinearLayout {

    /* renamed from: a */
    private ViewGroup f92869a;

    /* renamed from: b */
    private RecyclerView f92870b;

    /* renamed from: c */
    private SpeedRecommendPoiAdapter f92871c;

    /* renamed from: d */
    private C35397a f92872d;

    public void setOnItemClick(C35397a aVar) {
        this.f92872d = aVar;
    }

    public SpeedRecommendPoiView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m114359a(Context context) {
        this.f92869a = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.b4f, this, true);
        this.f92870b = (RecyclerView) this.f92869a.findViewById(R.id.cgd);
    }

    public void setData(List<C35127p> list) {
        if (list == null || list.size() == 0) {
            setVisibility(8);
            return;
        }
        this.f92870b.setLayoutManager(new WrapLinearLayoutManager(getContext(), 0, false));
        this.f92870b.mo5525a((C1272h) new C1272h() {
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
                int i;
                int i2;
                int f = RecyclerView.m5892f(view);
                if (f == 0) {
                    i = (int) C9738o.m28708b(SpeedRecommendPoiView.this.getContext(), 16.0f);
                } else {
                    i = 0;
                }
                if (f != recyclerView.getAdapter().getItemCount() - 1) {
                    i2 = (int) C9738o.m28708b(SpeedRecommendPoiView.this.getContext(), 10.0f);
                } else {
                    i2 = (int) C9738o.m28708b(SpeedRecommendPoiView.this.getContext(), 16.0f);
                }
                rect.set(i, 0, i2, 0);
            }
        });
        this.f92871c = new SpeedRecommendPoiAdapter(list);
        this.f92871c.f92858a = this.f92872d;
        this.f92870b.setAdapter(this.f92871c);
    }

    public SpeedRecommendPoiView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo90141a(PoiStruct poiStruct, List<C35127p> list) {
        if (list != null) {
            if (poiStruct == null) {
                for (C35127p pVar : list) {
                    pVar.f91892b = false;
                }
            } else {
                for (C35127p pVar2 : list) {
                    if (pVar2.f91891a.getPoiId().equals(poiStruct.getPoiId())) {
                        pVar2.f91892b = true;
                    } else {
                        pVar2.f91892b = false;
                    }
                }
            }
            if (this.f92871c != null) {
                this.f92871c.notifyDataSetChanged();
            }
        }
    }

    public SpeedRecommendPoiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m114359a(context);
    }
}
