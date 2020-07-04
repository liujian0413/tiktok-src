package com.bytedance.android.live.broadcast.p134e;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* renamed from: com.bytedance.android.live.broadcast.e.c */
public class C2563c extends HandlerThread implements Callback {

    /* renamed from: a */
    private Surface f8235a;

    /* renamed from: b */
    private Rect f8236b;

    /* renamed from: c */
    private Handler f8237c;

    /* renamed from: b */
    private void m10536b() {
        this.f8235a = null;
    }

    public boolean quitSafely() {
        boolean quitSafely = super.quitSafely();
        this.f8237c.sendEmptyMessage(235);
        return quitSafely;
    }

    /* renamed from: a */
    private void m10535a() {
        Canvas lockCanvas = this.f8235a.lockCanvas(this.f8236b);
        lockCanvas.drawColor(-7829368);
        this.f8235a.unlockCanvasAndPost(lockCanvas);
        this.f8237c.sendEmptyMessageDelayed(233, 66);
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        super.onLooperPrepared();
        this.f8237c = new Handler(getLooper(), this);
        this.f8237c.sendEmptyMessage(233);
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 233) {
            m10535a();
        } else if (i == 235) {
            m10536b();
        }
        return true;
    }

    public C2563c(Surface surface, int i, int i2) {
        super(C2563c.class.getSimpleName());
        this.f8235a = surface;
        this.f8236b = new Rect(0, 0, i, i2);
    }
}
