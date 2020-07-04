package com.bytedance.android.live.broadcast.widget;

import android.animation.ValueAnimator;
import android.view.Surface;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.stream.p141a.C2958f;
import com.bytedance.android.live.broadcast.stream.p141a.C2959g;
import com.bytedance.android.live.broadcast.stream.p141a.C2959g.C2961a;
import com.bytedance.android.live.core.p147c.C3166a;

public class AudioWidget extends CaptureWidget implements C2961a {

    /* renamed from: e */
    private C2959g f9326e;

    /* renamed from: f */
    private Surface f9327f;

    /* renamed from: g */
    private ValueAnimator f9328g;

    public void onDestroy() {
        super.onDestroy();
        this.f9328g.removeAllUpdateListeners();
    }

    public void onPause() {
        super.onPause();
        this.f9326e.mo9727b();
        this.f9328g.end();
    }

    public void onResume() {
        super.onResume();
        this.f9326e.mo9723a();
        this.f9328g.start();
    }

    public void onCreate() {
        super.onCreate();
        this.f9326e = new C2959g(this.f9338d);
        this.f9326e.mo9724a(3553);
        this.f9326e.f9193a = this;
        this.f9326e.mo9726a(this.f9337c);
        this.f9328g = ValueAnimator.ofInt(new int[]{0, 4}).setDuration(1000);
        this.f9328g.setRepeatMode(2);
        this.f9328g.setRepeatCount(-1);
        this.f9328g.addUpdateListener(new C3081a(this));
        this.f9328g.start();
    }

    /* renamed from: a */
    public final void mo9735a(Surface surface) {
        this.f9327f = surface;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9786a(ValueAnimator valueAnimator) {
        if (this.f9327f != null) {
            try {
                this.f9327f.unlockCanvasAndPost(this.f9327f.lockCanvas(null));
            } catch (Throwable th) {
                C3166a.m11963b("AudioWidget", th);
            }
        }
    }

    public AudioWidget(C2958f fVar, C2429a aVar) {
        super(fVar, aVar);
    }
}
