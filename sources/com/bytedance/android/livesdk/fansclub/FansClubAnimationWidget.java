package com.bytedance.android.livesdk.fansclub;

import com.bytedance.android.livesdk.app.dataholder.C3915g;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class FansClubAnimationWidget extends LiveRecyclableWidget implements C3915g<KVData> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9832a(Object obj) {
    }

    public int getLayoutId() {
        return R.layout.atg;
    }

    public void onInit(Object[] objArr) {
    }

    public void onUnload() {
    }

    public void onLoad(Object[] objArr) {
        this.dataCenter.lambda$put$1$DataCenter("data_fans_club_anim_view", this.containerView.findViewById(R.id.bfd));
    }
}
