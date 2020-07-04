package com.bytedance.android.livesdk.gift.holder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.gift.combo.ComboTarget;
import com.bytedance.android.livesdk.gift.model.C8150e;
import com.bytedance.android.livesdk.gift.model.p390a.C8138e;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class GiftAdViewHolder extends BasePanelViewHolder<C8138e> {

    /* renamed from: a */
    TextView f22047a;

    /* renamed from: a */
    public final ComboTarget mo21165a() {
        return null;
    }

    public GiftAdViewHolder(View view) {
        super(view);
        this.f22047a = (TextView) view.findViewById(R.id.dv5);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21167a(C8138e eVar) {
        super.mo21167a(eVar);
        if (eVar == null || eVar.f22206d == null || ((C8150e) eVar.f22206d).f22257b <= 0) {
            this.f22047a.setVisibility(0);
        } else {
            this.f22047a.setVisibility(0);
            this.f22047a.setText(C3358ac.m12517a((int) R.string.et6, Integer.valueOf(((C8150e) eVar.f22206d).f22257b)));
        }
        if (eVar != null) {
            this.f22039i.setText(eVar.mo21271l());
        }
        this.f22039i.setTextColor(C3358ac.m12521b((int) R.color.agp));
        this.f22040j.setVisibility(8);
    }
}
