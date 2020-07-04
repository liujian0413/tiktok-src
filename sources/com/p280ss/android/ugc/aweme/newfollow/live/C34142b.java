package com.p280ss.android.ugc.aweme.newfollow.live;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.C9318b;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.C9319c;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage;
import com.bytedance.android.livesdkapi.service.C9515c;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.p280ss.android.agilelogger.ALog;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p280ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.p280ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.C34283m;

/* renamed from: com.ss.android.ugc.aweme.newfollow.live.b */
public final class C34142b implements C9318b {

    /* renamed from: a */
    private boolean f88961a;

    /* renamed from: b */
    private C34283m f88962b;

    /* renamed from: c */
    private String f88963c;

    /* renamed from: d */
    private LiveRoomStruct f88964d;

    /* renamed from: e */
    private FrameLayout f88965e;

    /* renamed from: f */
    private TextureRenderView f88966f;

    /* renamed from: g */
    private ILivePlayController f88967g;

    /* renamed from: h */
    private Runnable f88968h;

    /* renamed from: i */
    private int f88969i;

    /* renamed from: j */
    private int f88970j;

    /* renamed from: e */
    private void m110046e() {
        m110045d();
    }

    /* renamed from: g */
    private Context m110048g() {
        if (this.f88965e == null) {
            return null;
        }
        return this.f88965e.getContext();
    }

    /* renamed from: i */
    private void m110050i() {
        if (this.f88967g != null) {
            this.f88967g.mo21788d(m110048g());
        }
    }

    /* renamed from: d */
    private void m110045d() {
        try {
            this.f88967g.mo21783a((String) null, (TextureView) null, 0, (C9319c) null, (C9318b) null, (String) null);
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
        }
    }

    /* renamed from: f */
    private void m110047f() {
        if (this.f88966f != null) {
            this.f88966f.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f88966f.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f88966f);
            }
        }
    }

    /* renamed from: b */
    public final void mo86826b() {
        if (this.f88967g != null && TextUtils.equals(this.f88963c, this.f88967g.mo21797i())) {
            m110046e();
            m110050i();
            m110047f();
        }
    }

    /* renamed from: c */
    public final void mo86827c() {
        if (this.f88967g != null) {
            m110050i();
            this.f88967g.mo21791e(m110048g());
        }
        m110047f();
    }

    /* renamed from: a */
    public final void mo86823a() {
        if (this.f88967g != null && TextUtils.equals(this.f88963c, this.f88967g.mo21797i())) {
            m110050i();
            m110047f();
        }
    }

    /* renamed from: h */
    private void m110049h() {
        StreamUrlStruct streamUrlStruct = this.f88964d.stream_url;
        try {
            m110043a(this.f88965e.getContext());
            m110044a(this.f88965e);
            this.f88967g.mo21789d(true);
            this.f88967g.mo21783a(streamUrlStruct.rtmp_pull_url, (TextureView) this.f88966f, RoomStruct.getStreamType(this.f88964d).ordinal(), (C9319c) null, (C9318b) this, (String) null);
            this.f88967g.mo21785a(this.f88961a, m110048g());
        } catch (Exception e) {
            C6921a.m21562b("LivePlayHelper", Log.getStackTraceString(e));
        }
    }

    /* renamed from: a */
    private void m110044a(FrameLayout frameLayout) {
        if (frameLayout.indexOfChild(this.f88966f) < 0) {
            m110047f();
            this.f88966f.setVisibility(0);
            frameLayout.addView(this.f88966f);
        }
    }

    /* renamed from: a */
    private void m110043a(Context context) {
        if (this.f88966f == null) {
            this.f88966f = new TextureRenderView(context);
        }
        if (!(this.f88966f.getLayoutParams() != null && this.f88966f.getLayoutParams().width == -1 && this.f88966f.getLayoutParams().height == -1)) {
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.f88966f.setLayoutParams(layoutParams);
        }
        this.f88966f.setVisibility(0);
        this.f88966f.setScaleType(2);
    }

    /* renamed from: a */
    public final void mo86824a(boolean z) {
        if (!(this.f88967g == null || m110048g() == null)) {
            try {
                this.f88967g.mo21785a(z, m110048g());
            } catch (Exception e) {
                C6921a.m21562b("LivePlayHelper", Log.getStackTraceString(e));
            }
        }
    }

    public C34142b(Runnable runnable, C34283m mVar) {
        ILivePlayController iLivePlayController;
        if (ServiceManager.get().getService(C9515c.class) != null) {
            iLivePlayController = ((C9515c) ServiceManager.get().getService(C9515c.class)).mo22019e();
        } else {
            iLivePlayController = null;
        }
        this.f88967g = iLivePlayController;
        this.f88968h = runnable;
        this.f88962b = mVar;
    }

    /* renamed from: a */
    public final void mo11991a(PlayerMessage playerMessage, Object obj) {
        switch (playerMessage) {
            case VIDEO_SIZE_CHANGED:
                if (this.f88962b != null) {
                    int parseInt = Integer.parseInt((String) obj);
                    int i = 65535 & parseInt;
                    this.f88969i = i;
                    int i2 = parseInt >> 16;
                    this.f88970j = i2;
                    StringBuilder sb = new StringBuilder("width = ");
                    sb.append(i);
                    sb.append("; height = ");
                    sb.append(i2);
                    ALog.m20862b("LivePlayHelper", sb.toString());
                    this.f88962b.mo87007a(this.f88966f, this.f88969i, this.f88970j);
                    if (this.f88966f != null) {
                        this.f88966f.setScaleType(2);
                        this.f88966f.mo23565a(this.f88969i, this.f88970j);
                        break;
                    }
                }
                break;
            case DISPLAYED_PLAY:
                if (this.f88968h != null) {
                    this.f88968h.run();
                    break;
                }
                break;
        }
        if (this.f88962b != null) {
            this.f88962b.mo87008a(playerMessage, obj);
        }
    }

    /* renamed from: a */
    public final void mo86825a(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout) {
        if (frameLayout == null) {
            C6921a.m21562b("LivePlayHelper", "liveStreamContainer is null");
            return;
        }
        this.f88961a = z;
        if (!TextUtils.equals(this.f88963c, liveRoomStruct.stream_url.rtmp_pull_url)) {
            m110045d();
        }
        this.f88963c = liveRoomStruct.stream_url.rtmp_pull_url;
        this.f88964d = liveRoomStruct;
        this.f88965e = frameLayout;
        m110049h();
    }
}
