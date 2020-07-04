package com.bytedance.android.livesdk.gift.holder;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.gift.C7859a;
import com.bytedance.android.livesdk.gift.model.p390a.C8139f;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class GiftPanelViewHolder extends BaseGiftPanelViewHolder<C8139f> {

    /* renamed from: n */
    private final View f22048n;

    public GiftPanelViewHolder(View view) {
        super(view);
        this.f22048n = view.findViewById(R.id.dv5);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21167a(C8139f fVar) {
        super.mo21167a(fVar);
        this.f22048n.setVisibility(8);
        if (fVar.mo21262c()) {
            m24796b(fVar);
        }
    }

    /* renamed from: b */
    private static void m24796b(C8139f fVar) {
        if (TextUtils.isEmpty(C7859a.m24102a(fVar.mo21277r().f22233d))) {
            C7859a.m24104b(fVar.mo21277r().f22233d);
        }
    }
}
