package com.bytedance.android.live.broadcast.api.p127c;

import android.os.Bundle;
import android.view.SurfaceView;
import com.p280ss.avframework.livestreamv2.ILiveStream.CatchVideoCallback;
import com.p280ss.avframework.livestreamv2.ILiveStream.ILiveStreamErrorListener;
import com.p280ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener;
import com.p280ss.avframework.livestreamv2.core.Client;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.bytedance.android.live.broadcast.api.c.a */
public interface C2429a {
    /* renamed from: a */
    Client mo8916a(InteractConfig interactConfig, Boolean bool);

    /* renamed from: a */
    void mo8917a();

    /* renamed from: a */
    void mo8918a(Bundle bundle, CatchVideoCallback catchVideoCallback);

    /* renamed from: a */
    void mo8919a(SurfaceView surfaceView);

    /* renamed from: a */
    void mo8920a(C2430b bVar);

    /* renamed from: a */
    void mo8921a(ILiveStreamErrorListener iLiveStreamErrorListener);

    /* renamed from: a */
    void mo8922a(ITextureFrameAvailableListener iTextureFrameAvailableListener);

    /* renamed from: a */
    void mo8923a(String str);

    /* renamed from: a */
    void mo8924a(List<String> list);

    /* renamed from: a */
    void mo8925a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j);

    /* renamed from: a */
    void mo8926a(boolean z);

    /* renamed from: b */
    void mo8927b();

    /* renamed from: c */
    void mo8928c();

    /* renamed from: d */
    void mo8929d();

    /* renamed from: e */
    void mo8930e();

    /* renamed from: f */
    void mo8931f();

    /* renamed from: g */
    IFilterManager mo8932g();

    /* renamed from: h */
    void mo8933h();

    /* renamed from: i */
    void mo8934i();
}
