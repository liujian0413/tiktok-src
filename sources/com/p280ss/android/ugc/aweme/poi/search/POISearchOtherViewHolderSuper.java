package com.p280ss.android.ugc.aweme.poi.search;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.widget.C10804a;
import com.p280ss.android.ugc.aweme.poi.event.C35079b;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.search.POISearchOtherViewHolderSuper */
public class POISearchOtherViewHolderSuper extends C1293v implements OnClickListener {

    /* renamed from: a */
    private TextView f92258a;

    /* renamed from: b */
    private TextView f92259b;

    /* renamed from: c */
    private View f92260c;

    /* renamed from: d */
    private View f92261d;

    /* renamed from: e */
    private LinearLayout f92262e;

    /* renamed from: f */
    private View f92263f;

    /* renamed from: g */
    private PoiStruct f92264g;

    /* renamed from: h */
    private String f92265h;

    /* renamed from: i */
    private int f92266i = -1;

    /* renamed from: j */
    private boolean f92267j;

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.b4p) {
            if (this.f92264g != null) {
                this.f92264g.put(POIService.KEY_KEYWORD, this.f92265h);
                this.f92264g.put(POIService.KEY_ORDER, String.valueOf(this.f92266i));
            }
            C42961az.m136380a(new C35079b(2, this.f92264g));
            return;
        }
        if (id == R.id.c4o) {
            C42961az.m136380a(new C35079b(1));
        }
    }

    public POISearchOtherViewHolderSuper(View view, boolean z) {
        super(view);
        this.f92267j = z;
        this.f92258a = (TextView) view.findViewById(R.id.b4q);
        this.f92259b = (TextView) view.findViewById(R.id.b4k);
        this.f92260c = view.findViewById(R.id.b4m);
        this.f92261d = view.findViewById(R.id.b4o);
        this.f92262e = (LinearLayout) view.findViewById(R.id.b4p);
        this.f92263f = view.findViewById(R.id.c4o);
        this.f92262e.setOnClickListener(this);
        this.f92263f.setOnClickListener(this);
        this.f92262e.setOnTouchListener(new C10804a(0.5f, 1.0f));
    }

    /* renamed from: a */
    public final void mo89680a(PoiStruct poiStruct, int i, String str) {
        if (poiStruct != null) {
            this.f92266i = i;
            this.f92264g = poiStruct;
            this.f92265h = str;
            this.f92259b.setText(poiStruct.getPoiName());
            if (i != 0 || !C6319n.m19593a(str)) {
                this.f92263f.setVisibility(8);
            } else {
                this.f92263f.setVisibility(0);
            }
            if (this.f92267j) {
                this.f92263f.setVisibility(8);
            }
            this.f92258a.setVisibility(8);
            this.f92260c.setVisibility(8);
            this.f92261d.setVisibility(0);
        }
    }
}
