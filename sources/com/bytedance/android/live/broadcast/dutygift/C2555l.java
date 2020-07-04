package com.bytedance.android.live.broadcast.dutygift;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.chatroom.event.C4414af;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.widget.C9239c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.broadcast.dutygift.l */
public final class C2555l extends C9239c implements OnClickListener {

    /* renamed from: a */
    private OnClickListener f8209a;

    /* renamed from: a */
    public final int mo9100a() {
        return R.layout.an8;
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.b9l) {
            C9097a.m27146a().mo22267a((Object) new C4414af("https://webcast.huoshan.com/falcon/webcast_huoshan/page/gift_task_intro/", ""));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(R.id.aqt).setOnClickListener(this.f8209a);
        findViewById(R.id.b9l).setOnClickListener(this);
    }

    public C2555l(Context context, OnClickListener onClickListener) {
        super(context);
        this.f8209a = onClickListener;
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }
}
