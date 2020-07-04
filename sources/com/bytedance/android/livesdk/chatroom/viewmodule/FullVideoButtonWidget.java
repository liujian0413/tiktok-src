package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0053p;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.event.C4427as;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.p451g.C9409a;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

public class FullVideoButtonWidget extends LiveWidget implements C0053p<KVData> {

    /* renamed from: a */
    private long f15893a;

    /* renamed from: b */
    private boolean f15894b;

    /* renamed from: c */
    private boolean f15895c;

    public int getLayoutId() {
        return R.layout.au6;
    }

    public void onDestroy() {
        this.dataCenter.removeObserver(this);
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        this.f15893a = ((Long) this.dataCenter.get("data_room_id")).longValue();
        this.dataCenter.observe("data_keyboard_status", this).observe("cmd_video_orientation_changed", this, true);
        this.contentView.setOnClickListener(new C5585aj(this));
    }

    /* renamed from: a */
    private void m17294a(boolean z) {
        int i;
        if (isViewValid()) {
            View view = this.contentView;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (isViewValid() && kVData != null && kVData.getData() != null && isViewValid()) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            boolean z = true;
            if (hashCode != 1060055221) {
                if (hashCode == 1631824572 && key.equals("cmd_video_orientation_changed")) {
                    c = 1;
                }
            } else if (key.equals("data_keyboard_status")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    this.f15895c = ((Boolean) kVData.getData()).booleanValue();
                    if (this.f15895c || !this.f15894b) {
                        z = false;
                    }
                    m17294a(z);
                    return;
                case 1:
                    this.f15894b = ((C4427as) kVData.getData()).f12860a;
                    if (this.f15895c || !this.f15894b) {
                        z = false;
                    }
                    m17294a(z);
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13765a(View view) {
        C9097a.m27146a().mo22267a((Object) new C9409a(2));
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f15893a));
        hashMap.put("type", "portrait_to_landscape");
        C8443c.m25663a().mo21606a("screen_rotate", hashMap, new C8438j().mo21603f("click").mo21599b("live").mo21598a("live_detail"));
    }
}
