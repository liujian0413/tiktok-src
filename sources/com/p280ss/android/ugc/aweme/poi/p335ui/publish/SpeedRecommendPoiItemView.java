package com.p280ss.android.ugc.aweme.poi.p335ui.publish;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.poi.model.C35127p;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.SpeedRecommendPoiItemView */
public class SpeedRecommendPoiItemView extends LinearLayout {

    /* renamed from: a */
    TextView f92868a;

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f92868a = (TextView) findViewById(R.id.cp_);
    }

    public SpeedRecommendPoiItemView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo90139a(C35127p pVar) {
        int i;
        PoiStruct poiStruct = pVar.f91891a;
        if (poiStruct != null) {
            this.f92868a.setText(poiStruct.getPoiName());
        }
        boolean z = pVar.f91892b;
        setSelected(z);
        this.f92868a.setSelected(z);
        TextView textView = this.f92868a;
        if (z) {
            i = this.f92868a.getContext().getResources().getColor(R.color.a4s);
        } else {
            i = this.f92868a.getContext().getResources().getColor(R.color.a53);
        }
        textView.setTextColor(i);
    }

    public SpeedRecommendPoiItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpeedRecommendPoiItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
