package com.p280ss.android.ugc.aweme.poi.p335ui.publish;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.poi.model.C35127p;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.SpeedRecommendPoiAdapter */
public class SpeedRecommendPoiAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public C35397a f92858a;

    /* renamed from: b */
    private List<C35127p> f92859b;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.SpeedRecommendPoiAdapter$a */
    public interface C35397a {
        /* renamed from: a */
        void mo90134a(C35127p pVar, boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.SpeedRecommendPoiAdapter$b */
    class C35398b extends C1293v {

        /* renamed from: b */
        private View f92861b;

        /* renamed from: c */
        private TextView f92862c;

        /* renamed from: a */
        public final void mo90135a() {
            this.f92862c.setText(R.string.ca4);
            this.f92861b.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (SpeedRecommendPoiAdapter.this.f92858a != null) {
                        SpeedRecommendPoiAdapter.this.f92858a.mo90134a(null, true);
                    }
                }
            });
        }

        C35398b(View view) {
            super(view);
            this.f92861b = view;
            this.f92862c = (TextView) view.findViewById(R.id.d1e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.SpeedRecommendPoiAdapter$c */
    class C35400c extends C1293v {

        /* renamed from: b */
        private SpeedRecommendPoiItemView f92865b;

        /* renamed from: a */
        public final void mo90137a(final C35127p pVar) {
            this.f92865b.mo90139a(pVar);
            this.f92865b.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    C35127p pVar;
                    ClickInstrumentation.onClick(view);
                    boolean z = pVar.f91892b;
                    pVar.f91892b = !z;
                    if (SpeedRecommendPoiAdapter.this.f92858a != null) {
                        C35397a aVar = SpeedRecommendPoiAdapter.this.f92858a;
                        if (z) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        aVar.mo90134a(pVar, false);
                    }
                }
            });
        }

        C35400c(SpeedRecommendPoiItemView speedRecommendPoiItemView) {
            super(speedRecommendPoiItemView);
            this.f92865b = speedRecommendPoiItemView;
        }
    }

    public int getItemCount() {
        if (this.f92859b == null) {
            return 1;
        }
        return this.f92859b.size() + 1;
    }

    public SpeedRecommendPoiAdapter(List<C35127p> list) {
        this.f92859b = list;
    }

    public int getItemViewType(int i) {
        if (this.f92859b == null || i != this.f92859b.size()) {
            return 1;
        }
        return 2;
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        switch (getItemViewType(i)) {
            case 1:
                ((C35400c) vVar).mo90137a((C35127p) this.f92859b.get(i));
                return;
            case 2:
                ((C35398b) vVar).mo90135a();
                break;
        }
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return new C35398b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3_, viewGroup, false));
        }
        return new C35400c((SpeedRecommendPoiItemView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a39, viewGroup, false));
    }
}
