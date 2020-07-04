package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.Surface;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.api.p128d.C2434c;
import com.bytedance.android.live.broadcast.monitor.C2760c;
import com.bytedance.android.live.broadcast.monitor.C2761d;
import com.bytedance.android.live.broadcast.monitor.C2762e;
import com.bytedance.android.live.broadcast.p134e.C2559a;
import com.bytedance.android.live.broadcast.p134e.C2559a.C2561a;
import com.bytedance.android.live.broadcast.stream.C2967c;
import com.bytedance.android.live.broadcast.stream.C2977d.C2978a;
import com.bytedance.android.live.broadcast.stream.monitor.C2980a;
import com.bytedance.android.live.broadcast.stream.p141a.C2958f;
import com.bytedance.android.live.broadcast.stream.p141a.C2959g;
import com.bytedance.android.live.broadcast.stream.p141a.C2959g.C2961a;
import com.bytedance.android.live.broadcast.stream.p143b.C2965a;
import com.bytedance.android.live.broadcast.stream.p143b.C2966b;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.interact.C4486al;
import com.bytedance.android.livesdk.chatroom.interact.C4487am;
import com.bytedance.android.livesdk.user.C8984e;
import com.p280ss.avframework.livestreamv2.core.Client;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay.FrameListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;

public class LinkInRoomAudioView extends GLSurfaceView implements C2434c, C2958f, C2961a, C4486al, C4487am, FrameListener {

    /* renamed from: a */
    C2959g f9341a;

    /* renamed from: b */
    C2559a f9342b;

    /* renamed from: c */
    private final C2429a f9343c;

    /* renamed from: d */
    private EGLContext f9344d;

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
        if (this.f9342b != null) {
            this.f9342b.mo9157b();
        }
    }

    /* renamed from: d */
    public final void mo9799d() {
        if (this.f9342b != null) {
            this.f9342b.quitSafely();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9343c.mo8927b();
        this.f9343c.mo8930e();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f9343c.mo8931f();
        this.f9343c.mo8928c();
        this.f9343c.mo8929d();
        super.onDetachedFromWindow();
    }

    public LinkInRoomAudioView(Context context) {
        this(context, null);
    }

    public void setOutputFormat(int i) {
        this.f9341a.mo9724a(i);
    }

    /* renamed from: a */
    public final void mo9735a(Surface surface) {
        C8984e eVar;
        IUser iUser;
        ImageModel imageModel;
        String str;
        C2561a aVar = new C2561a();
        C3592a aVar2 = (C3592a) C3596c.m13172a(C3592a.class);
        List list = null;
        if (aVar2 != null) {
            eVar = aVar2.user();
        } else {
            eVar = null;
        }
        if (eVar != null) {
            iUser = eVar.mo22165a();
        } else {
            iUser = null;
        }
        if (iUser != null) {
            imageModel = iUser.getAvatarThumb();
        } else {
            imageModel = null;
        }
        if (imageModel != null) {
            list = imageModel.getUrls();
        }
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = (String) list.get(0);
        }
        aVar.f8232a = str;
        aVar.f8234c = getHeight();
        aVar.f8233b = getWidth();
        this.f9342b = new C2559a(surface, aVar);
        this.f9342b.start();
    }

    /* renamed from: a */
    public final Client mo9795a(InteractConfig interactConfig, Boolean bool) {
        return this.f9343c.mo8916a(interactConfig, bool);
    }

    public LinkInRoomAudioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9341a = new C2959g(this);
        this.f9341a.f9193a = this;
        this.f9341a.mo9726a((C2958f) this);
        this.f9343c = new C2967c(new C2978a(getContext()).mo9759a(C3358ac.m12515a((int) R.string.fdg)).mo9755a((C2965a) new C2761d()).mo9756a((C2966b) new C2762e()).mo9757a((C2980a) new C2760c()).mo9752a(240, 320).mo9774g(320).mo9773f(240).mo9777j(4).mo9762a());
    }

    public void onFrameAvailable(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        EGLContext eGLContext2 = eGLContext;
        if (this.f9343c != null) {
            if (this.f9344d != null) {
                this.f9344d.equals(eGLContext);
            }
            this.f9344d = eGLContext2;
            this.f9343c.mo8925a(eGLContext, i, i2, i3, i4, j);
        }
    }
}
