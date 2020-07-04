package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.model.C4901d;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class EndWidget extends LiveWidget {
    public int getLayoutId() {
        return R.layout.b01;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        if (isViewValid()) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_widget_loaded", new C4901d());
        }
    }
}
