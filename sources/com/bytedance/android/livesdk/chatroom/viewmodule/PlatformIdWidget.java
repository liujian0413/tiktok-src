package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.app.dataholder.C3915g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class PlatformIdWidget extends LiveRecyclableWidget implements C3915g<KVData> {

    /* renamed from: a */
    private Room f16324a;

    /* renamed from: b */
    private TextView f16325b;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9832a(Object obj) {
    }

    public int getLayoutId() {
        return R.layout.ara;
    }

    public void onUnload() {
    }

    public void onInit(Object[] objArr) {
        this.f16325b = (TextView) this.contentView.findViewById(R.id.b2l);
    }

    public void onLoad(Object[] objArr) {
        this.f16324a = (Room) this.dataCenter.get("data_room");
        if (this.f16324a != null && this.f16324a.getOwner() != null) {
            this.f16325b.setText(C3358ac.m12517a((int) R.string.exs, this.f16324a.getOwner().displayId));
        }
    }
}
