package com.bytedance.android.livesdk.rank;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class BackToPreRoomWidget extends LiveRecyclableWidget {

    /* renamed from: a */
    private C8845i f23894a;

    public int getLayoutId() {
        return R.layout.ale;
    }

    public void onInit(Object[] objArr) {
    }

    public void onUnload() {
        if (this.f23894a != null) {
            this.f23894a.mo21916b(this.dataCenter);
        }
    }

    public void onLoad(Object[] objArr) {
        if (this.contentView != null) {
            this.f23894a = new C8845i(this.context, getLifecycle(), (ViewGroup) this.contentView);
            this.f23894a.mo21915a(this.dataCenter);
            return;
        }
        C9738o.m28712b((View) this.containerView, 8);
    }
}
