package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public abstract class AbsCaptureWidget extends LiveWidget {

    /* renamed from: a */
    protected boolean f9324a;

    /* renamed from: b */
    protected C2429a f9325b;

    /* renamed from: a */
    private void mo9149a() {
        this.f9324a = true;
    }

    /* renamed from: e */
    public void mo9785e() {
        this.f9324a = false;
    }

    public void onCreate() {
        super.onCreate();
        if (!this.f9324a) {
            mo9149a();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f9324a) {
            mo9785e();
        }
    }

    public AbsCaptureWidget(C2429a aVar) {
        this.f9325b = aVar;
    }
}
