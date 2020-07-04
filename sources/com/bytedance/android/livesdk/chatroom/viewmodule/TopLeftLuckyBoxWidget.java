package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.message.model.C8512bh;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class TopLeftLuckyBoxWidget extends LuckyBoxWidget {
    public int getLayoutId() {
        return R.layout.axn;
    }

    /* renamed from: a */
    public final void mo14021a(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            this.f16271b = viewGroup;
        }
    }

    public void onLoad(Object... objArr) {
        super.onLoad(objArr);
        this.f16270a = 60;
    }

    /* renamed from: a */
    public final void mo12991a(C8512bh bhVar) {
        if (this.f16271b != null) {
            super.mo12991a(bhVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo13942a(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / 60;
        long j3 = j - (60 * j2);
        sb.append(j2);
        sb.append(":");
        if (j3 < 10) {
            sb.append("0");
        }
        sb.append(j3);
        return sb.toString();
    }
}
