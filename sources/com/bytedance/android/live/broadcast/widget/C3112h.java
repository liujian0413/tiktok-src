package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.Surface;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.api.p128d.C2434c;
import com.bytedance.android.live.broadcast.p134e.C2563c;
import com.bytedance.android.live.broadcast.stream.p141a.C2958f;
import com.bytedance.android.live.broadcast.stream.p141a.C2959g;
import com.bytedance.android.live.broadcast.stream.p141a.C2959g.C2961a;
import com.bytedance.android.livesdk.chatroom.interact.C4486al;
import com.bytedance.android.livesdk.chatroom.interact.C4487am;
import com.p280ss.avframework.livestreamv2.core.Client;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay.FrameListener;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoQuality;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.bytedance.android.live.broadcast.widget.h */
public final class C3112h extends GLSurfaceView implements C2434c, C2958f, C2961a, C4486al, C4487am, FrameListener {

    /* renamed from: a */
    C2959g f9601a;

    /* renamed from: b */
    C2563c f9602b;

    /* renamed from: c */
    private final C2429a f9603c;

    /* renamed from: d */
    private EGLContext f9604d;

    /* renamed from: a */
    public final void mo9796a() {
        onPause();
    }

    /* renamed from: b */
    public final void mo9797b() {
        onResume();
    }

    /* renamed from: c */
    public final void mo9798c() {
    }

    /* renamed from: d */
    public final void mo9799d() {
        if (this.f9602b != null) {
            this.f9602b.quitSafely();
        }
    }

    public final void setOutputFormat(int i) {
        this.f9601a.mo9724a(i);
    }

    /* renamed from: a */
    public final void mo9735a(Surface surface) {
        this.f9602b = new C2563c(surface, VideoQuality.GUEST_NORMAL.getWidth(), VideoQuality.GUEST_NORMAL.getHeight());
        this.f9602b.start();
    }

    public C3112h(C2429a aVar, Context context) {
        this(aVar, context, null);
    }

    /* renamed from: a */
    public final Client mo9795a(InteractConfig interactConfig, Boolean bool) {
        return this.f9603c.mo8916a(interactConfig, bool);
    }

    private C3112h(C2429a aVar, Context context, AttributeSet attributeSet) {
        super(context, null);
        this.f9603c = aVar;
        this.f9601a = new C2959g(this);
        this.f9601a.f9193a = this;
        this.f9601a.mo9726a((C2958f) this);
    }

    public final void onFrameAvailable(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        EGLContext eGLContext2 = eGLContext;
        if (this.f9603c != null) {
            if (this.f9604d != null) {
                this.f9604d.equals(eGLContext);
            }
            this.f9604d = eGLContext2;
            this.f9603c.mo8925a(eGLContext, i, i2, i3, i4, j);
        }
    }
}
