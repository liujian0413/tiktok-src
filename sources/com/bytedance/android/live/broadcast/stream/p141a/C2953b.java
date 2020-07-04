package com.bytedance.android.live.broadcast.stream.p141a;

import android.content.Context;
import android.view.SurfaceView;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.stream.p141a.C2954c.C2955a;
import com.bytedance.android.live.broadcast.stream.p141a.p142a.C2948a;
import com.bytedance.android.live.broadcast.stream.p141a.p142a.C2950c;
import com.p280ss.avframework.livestreamv2.ILiveStream.ILiveStreamErrorListener;
import com.p280ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener;
import com.p280ss.avframework.livestreamv2.effectcamera.render.EffectRender.OnRefreshFaceDataListener;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager.EffectMsgListener;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager.FaceDetectListener;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.bytedance.android.live.broadcast.stream.a.b */
public final class C2953b extends C2947a implements ILiveStreamErrorListener, ITextureFrameAvailableListener, EffectMsgListener, FaceDetectListener {

    /* renamed from: d */
    private C2950c f9187d;

    /* renamed from: e */
    private Context f9188e;

    /* renamed from: f */
    private C2955a f9189f;

    /* renamed from: g */
    private C2429a f9190g;

    /* renamed from: b */
    public final void mo9681b() {
        this.f9190g.mo8934i();
    }

    /* renamed from: c */
    public final void mo9683c() {
        this.f9190g.mo8933h();
    }

    /* renamed from: d */
    public final int mo9684d() {
        return this.f9190g.mo8932g().startEffectAudio();
    }

    /* renamed from: e */
    public final int mo9685e() {
        return this.f9190g.mo8932g().stopEffectAudio();
    }

    /* renamed from: a */
    public final void mo9676a() {
        this.f9183c = null;
        this.f9187d.mo9693a();
        this.f9190g.mo8931f();
    }

    /* renamed from: a */
    public final void mo9678a(C2955a aVar) {
        this.f9189f = aVar;
    }

    /* renamed from: a */
    public final void mo9677a(C2948a aVar) {
        aVar.mo9686a(this.f9188e, this.f9187d);
    }

    public final void onFaceDetectResultCallback(int i) {
        if (this.f9181a != null) {
            for (int size = this.f9181a.size() - 1; size >= 0; size--) {
                ((OnRefreshFaceDataListener) this.f9181a.get(size)).onRefreshFaceData(i);
            }
        }
    }

    public C2953b(SurfaceView surfaceView, C2429a aVar) {
        this.f9190g = aVar;
        this.f9188e = surfaceView.getContext();
        this.f9190g.mo8919a(surfaceView);
        aVar.mo8921a((ILiveStreamErrorListener) this);
        IFilterManager g = this.f9190g.mo8932g();
        g.enable(true);
        g.setFaceDetectListener(this);
        g.setEffectMsgListener(this);
        this.f9187d = new C2956d(g);
        this.f9190g.mo8930e();
        this.f9190g.mo8922a((ITextureFrameAvailableListener) this);
    }

    public final void onError(int i, int i2, Exception exc) {
        if (this.f9189f != null) {
            this.f9189f.mo9572a(i, i2, null);
        }
    }

    /* renamed from: a */
    public final int mo9675a(int i, int i2, int i3, String str) {
        return this.f9190g.mo8932g().sendEffectMsg(i, i2, i3, str);
    }

    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 2139095041 && this.f9189f != null) {
            this.f9189f.mo9574b(1, i2, str);
        }
    }

    public final void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr) {
        if (this.f9183c != null) {
            this.f9183c.onFrameAvailable(eGLContext, i, z ? 1 : 0, i2, i3, j);
        }
    }
}
