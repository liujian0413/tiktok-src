package com.p280ss.android.ugc.aweme.poi.search;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.widget.C10804a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.poi.event.C35079b;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.search.POISearchViewHolderSuper */
public class POISearchViewHolderSuper extends C1293v implements OnClickListener {

    /* renamed from: a */
    private TextView f92268a;

    /* renamed from: b */
    private TextView f92269b;

    /* renamed from: c */
    private TextView f92270c;

    /* renamed from: d */
    private View f92271d;

    /* renamed from: e */
    private View f92272e;

    /* renamed from: f */
    private PoiStruct f92273f;

    /* renamed from: g */
    private String f92274g;

    /* renamed from: h */
    private int f92275h = -1;

    /* renamed from: i */
    private boolean f92276i;

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.b4p) {
            if (this.f92273f != null) {
                this.f92273f.put(POIService.KEY_KEYWORD, this.f92274g);
                this.f92273f.put(POIService.KEY_ORDER, String.valueOf(this.f92275h));
            }
            C42961az.m136380a(new C35079b(2, this.f92273f));
            return;
        }
        if (id == R.id.c4o) {
            C42961az.m136380a(new C35079b(1));
        }
    }

    /* renamed from: a */
    private static SpannableString m113658a(String str, String str2) {
        int indexOf = str.toLowerCase().indexOf(str2.toLowerCase());
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(C6399b.m19921a().getResources().getColor(R.color.a71)), indexOf, str2.length() + indexOf, 0);
        return spannableString;
    }

    public POISearchViewHolderSuper(View view, boolean z) {
        super(view);
        this.f92276i = z;
        this.f92272e = view.findViewById(R.id.c4o);
        this.f92272e.setOnClickListener(this);
        this.f92268a = (TextView) view.findViewById(R.id.b4k);
        this.f92269b = (TextView) view.findViewById(R.id.b4l);
        this.f92270c = (TextView) view.findViewById(R.id.b4n);
        this.f92271d = view.findViewById(R.id.b4p);
        this.f92271d.setOnClickListener(this);
        this.f92271d.setOnTouchListener(new C10804a(0.5f, 1.0f));
    }

    /* renamed from: a */
    public final void mo89682a(PoiStruct poiStruct, int i, String str) {
        if (poiStruct != null) {
            this.f92273f = poiStruct;
            this.f92274g = str;
            this.f92275h = i;
            if (i != 0 || !C6319n.m19593a(str)) {
                this.f92272e.setVisibility(8);
            } else {
                this.f92272e.setVisibility(0);
            }
            if (this.f92276i) {
                this.f92272e.setVisibility(8);
            }
            if (C6319n.m19593a(str) || C6319n.m19593a(this.f92273f.poiName) || !this.f92273f.poiName.toLowerCase().contains(str.toLowerCase())) {
                this.f92268a.setText(this.f92273f.poiName);
            } else {
                this.f92268a.setText(m113658a(this.f92273f.poiName, str));
            }
            if (this.f92273f.address == null || TextUtils.isEmpty(this.f92273f.address.getSimpleAddr())) {
                this.f92269b.setVisibility(8);
            } else {
                this.f92269b.setText(this.f92273f.address.getSimpleAddr());
                this.f92269b.setVisibility(0);
            }
            if (TextUtils.isEmpty(this.f92273f.distance)) {
                this.f92270c.setVisibility(8);
                return;
            }
            this.f92270c.setVisibility(0);
            this.f92270c.setText(this.f92273f.distance);
        }
    }
}
