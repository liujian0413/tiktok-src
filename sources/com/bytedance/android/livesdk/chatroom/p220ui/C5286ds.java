package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.widget.C9239c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ds */
public final class C5286ds extends C9239c implements OnClickListener {

    /* renamed from: a */
    public C5287a f15454a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ds$a */
    public interface C5287a {
        /* renamed from: h */
        void mo13549h();

        /* renamed from: i */
        void mo13550i();
    }

    /* renamed from: a */
    public final int mo9100a() {
        return R.layout.aod;
    }

    public C5286ds(Context context) {
        super(context);
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.cn0) {
            this.f15454a.mo13549h();
        } else if (id == R.id.cn1) {
            this.f15454a.mo13550i();
        }
        dismiss();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(R.id.cn0).setOnClickListener(this);
        findViewById(R.id.cn1).setOnClickListener(this);
        findViewById(R.id.cmz).setOnClickListener(this);
    }
}
