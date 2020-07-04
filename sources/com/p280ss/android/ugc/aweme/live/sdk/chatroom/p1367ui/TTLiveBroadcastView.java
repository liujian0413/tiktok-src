package com.p280ss.android.ugc.aweme.live.sdk.chatroom.p1367ui;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.support.p022v4.app.C0633q;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9346b.C9347a;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9349d;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9350e;
import com.bytedance.common.utility.C9738o;
import com.facebook.imagepipeline.request.C13842b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.live.C32430a;
import com.p280ss.android.ugc.aweme.live.model.C32531a;
import com.p280ss.android.ugc.aweme.live.p1364d.C32504a;
import com.p280ss.android.ugc.aweme.live.p1364d.C32506b;
import com.p280ss.android.ugc.aweme.port.internal.C35610c.C35611a;
import com.p280ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40187b;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40189d;
import com.p280ss.android.ugc.aweme.story.live.C41986a;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView */
public class TTLiveBroadcastView implements C0042h, C32534a {

    /* renamed from: a */
    public Context f84815a;

    /* renamed from: b */
    public IRecordingOperationPanel f84816b;

    /* renamed from: c */
    public RemoteImageView f84817c;

    /* renamed from: d */
    public C9350e f84818d;

    /* renamed from: e */
    public float f84819e;

    /* renamed from: f */
    public float f84820f;

    /* renamed from: g */
    public float f84821g;

    /* renamed from: h */
    public C40189d f84822h;

    /* renamed from: i */
    public float f84823i;

    /* renamed from: j */
    public int f84824j = -1;

    /* renamed from: k */
    public boolean f84825k;

    /* renamed from: l */
    public boolean f84826l;

    /* renamed from: m */
    public boolean f84827m = true;

    /* renamed from: n */
    private FrameLayout f84828n;

    /* renamed from: o */
    private C32535b f84829o;

    /* renamed from: p */
    private C9350e f84830p;

    /* renamed from: q */
    private C40187b f84831q;

    /* renamed from: r */
    private int f84832r;

    /* renamed from: s */
    private List<C29296g> f84833s = new ArrayList();

    /* renamed from: t */
    private float f84834t;

    /* renamed from: u */
    private float f84835u;

    /* renamed from: v */
    private float f84836v;

    /* renamed from: w */
    private float f84837w;

    /* renamed from: x */
    private float f84838x;

    /* renamed from: y */
    private C9349d f84839y = new C9347a() {
        /* renamed from: a */
        public final void mo9581a() {
            if (TTLiveBroadcastView.this.f84816b != null) {
                TTLiveBroadcastView.this.f84816b.closeRecording();
            }
        }

        /* renamed from: b */
        public final void mo9585b() {
            TTLiveBroadcastView.this.f84826l = true;
            TTLiveBroadcastView.this.f84818d.mo9514h();
            if (TTLiveBroadcastView.this.f84818d != null && TTLiveBroadcastView.this.f84818d.mo9512f().isEmpty()) {
                C1592h.m7848a(200).mo6876a((C1591g<TResult, TContinuationResult>) new C32542h<TResult,TContinuationResult>(TTLiveBroadcastView.this), C1592h.f5958b);
            }
        }

        /* renamed from: b */
        public final void mo9587b(int i) {
            TTLiveBroadcastView.this.mo83774a(i);
        }

        /* renamed from: c */
        public final void mo9588c(float f) {
            TTLiveBroadcastView.this.f84819e = f;
            TTLiveBroadcastView.this.mo83773a(TTLiveBroadcastView.this.f84819e, TTLiveBroadcastView.this.f84820f);
        }

        /* renamed from: d */
        public final void mo9589d(float f) {
            TTLiveBroadcastView.this.f84820f = f;
            TTLiveBroadcastView.this.mo83773a(TTLiveBroadcastView.this.f84819e, TTLiveBroadcastView.this.f84820f);
        }

        /* renamed from: a */
        public final void mo9583a(int i) {
            if (i != TTLiveBroadcastView.this.f84816b.getCameraPos()) {
                TTLiveBroadcastView.this.f84816b.setCameraPos(i);
            }
            C1592h.m7848a(100).mo6876a((C1591g<TResult, TContinuationResult>) new C32541g<TResult,TContinuationResult>(TTLiveBroadcastView.this), C1592h.f5958b);
        }

        /* renamed from: a */
        public final void mo9584a(boolean z) {
            UrlModel urlModel;
            if (!z || !TTLiveBroadcastView.this.f84825k) {
                TTLiveBroadcastView.this.f84817c.setVisibility(0);
                TTLiveBroadcastView.this.f84817c.setImageAlpha(0);
                return;
            }
            TTLiveBroadcastView.this.f84817c.setImageAlpha(NormalGiftView.ALPHA_255);
            TTLiveBroadcastView.this.f84817c.setVisibility(0);
            float a = ((float) C9738o.m28691a(TTLiveBroadcastView.this.f84815a)) / ((float) C9738o.m28709b(TTLiveBroadcastView.this.f84815a));
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            RemoteImageView remoteImageView = TTLiveBroadcastView.this.f84817c;
            if (iUserService != null) {
                urlModel = iUserService.getCurrentUser().getAvatarMedium();
            } else {
                urlModel = null;
            }
            C23323e.m76513a(remoteImageView, urlModel, (C13842b) new C32504a(5, a, null));
        }

        /* renamed from: b */
        public final void mo9586b(float f) {
            float f2;
            TTLiveBroadcastView.this.f84821g = f;
            float f3 = 0.0f;
            if (TTLiveBroadcastView.this.f84827m && TTLiveBroadcastView.this.f84822h != null) {
                C40189d dVar = TTLiveBroadcastView.this.f84822h;
                float f4 = TTLiveBroadcastView.this.f84821g;
                if (TTLiveBroadcastView.this.f84824j == 0) {
                    f2 = TTLiveBroadcastView.this.f84823i;
                } else {
                    f2 = 0.0f;
                }
                dVar.mo99956a(f4, f2);
                TTLiveBroadcastView.this.f84827m = false;
            }
            TTLiveBroadcastView tTLiveBroadcastView = TTLiveBroadcastView.this;
            float f5 = TTLiveBroadcastView.this.f84821g;
            if (TTLiveBroadcastView.this.f84824j == 0) {
                f3 = TTLiveBroadcastView.this.f84823i;
            }
            tTLiveBroadcastView.mo83779b(f5, f3);
        }
    };

    static {
        C32430a.m105068e();
    }

    /* renamed from: a */
    public final View mo83771a() {
        return this.f84828n;
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
    }

    /* renamed from: i */
    private int m105359i() {
        if (this.f84816b == null) {
            return 1;
        }
        return this.f84816b.getCameraPos();
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        if (this.f84825k && this.f84826l) {
            C1592h.m7848a(500).mo6876a((C1591g<TResult, TContinuationResult>) new C32539e<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: g */
    private void m105357g() {
        List f = this.f84818d.mo9512f();
        if (!f.isEmpty() && f.size() != this.f84833s.size()) {
            this.f84833s.clear();
            this.f84833s.addAll(C32506b.m105295a(f));
        }
    }

    /* renamed from: h */
    private void m105358h() {
        float f;
        if (this.f84831q != null) {
            this.f84831q.mo74889a(this.f84832r);
        }
        if (this.f84822h != null) {
            this.f84822h.mo99958a(this.f84832r);
            this.f84822h.mo99969b(this.f84836v, this.f84834t);
            C40189d dVar = this.f84822h;
            float f2 = this.f84835u;
            if (this.f84832r == 0) {
                f = 0.35f;
            } else {
                f = 0.0f;
            }
            dVar.mo99956a(f2, f);
            this.f84822h.mo99974c(this.f84837w, this.f84838x);
        }
    }

    /* renamed from: b */
    public final void mo83778b() {
        if (!this.f84825k) {
            this.f84825k = true;
            C41989d.m133467a();
            m105356f();
            this.f84829o.mo83786a();
            C1592h.m7848a(100).mo6876a((C1591g<TResult, TContinuationResult>) new C32540f<TResult,TContinuationResult>(this), C1592h.f5958b);
            this.f84817c.setVisibility(0);
        }
    }

    /* renamed from: c */
    public final void mo83780c() {
        if (this.f84825k) {
            this.f84825k = false;
            if (this.f84818d != null) {
                this.f84818d.mo9515i();
            }
            this.f84829o.mo83790b();
            this.f84817c.setVisibility(8);
            m105358h();
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        if (this.f84822h != null && this.f84825k) {
            this.f84822h.mo99974c(this.f84837w, this.f84838x);
        }
        if (this.f84818d != null) {
            this.f84818d.mo9491a((C9349d) null);
        }
        this.f84822h = null;
        C42961az.m136383d(this);
        C32506b.m105296a(m105359i(), this.f84832r);
    }

    /* renamed from: e */
    private void m105355e() {
        this.f84828n = new FrameLayout(this.f84815a);
        this.f84828n.setVisibility(4);
        this.f84828n.setId(R.id.bnn);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.bottomMargin = (int) C9738o.m28708b(this.f84815a, 30.0f);
        this.f84828n.setLayoutParams(layoutParams);
        this.f84829o = new C32535b(this.f84828n);
        this.f84830p = C32430a.m105068e().mo22016b();
        this.f84822h = this.f84816b.videoRecorder();
    }

    /* renamed from: f */
    private void m105356f() {
        boolean z;
        if (this.f84818d == null) {
            if (this.f84830p == null) {
                this.f84830p = C32430a.m105068e().mo22016b();
            }
            this.f84818d = this.f84830p;
            this.f84818d.mo9491a(this.f84839y);
            C0633q a = this.f84816b.fragmentManager().mo2645a();
            a.mo2585a((int) R.id.bnn, this.f84818d.mo9516j());
            a.mo2606d();
            this.f84818d.mo9481a(90);
            if (C9469i.m27992d() != null) {
                C9469i.m27992d().mo22023i().mo9651a(C32538d.f84850a);
            }
            this.f84817c = this.f84816b.backgroundView();
            this.f84817c.setVisibility(8);
            m105357g();
        }
        if (this.f84818d != null) {
            int i = 0;
            if (this.f84816b.getCameraPos() == 0) {
                z = true;
            } else {
                z = false;
            }
            C9350e eVar = this.f84818d;
            if (!z) {
                i = 1;
            }
            eVar.mo9497b(i);
        }
        this.f84831q = this.f84816b.filterModule();
        if (this.f84822h != null) {
            this.f84836v = this.f84822h.mo99973c();
            this.f84834t = this.f84822h.mo99976d();
            this.f84835u = this.f84822h.mo99978e();
            this.f84837w = this.f84822h.mo99954a();
            this.f84838x = this.f84822h.mo99968b();
        }
    }

    /* renamed from: a */
    public final void mo83775a(C35611a aVar) {
        this.f84829o.f84844c = aVar;
    }

    /* renamed from: a */
    public final void mo83776a(View... viewArr) {
        this.f84829o.mo83789a(viewArr);
    }

    @C7709l
    public void onCameraReverse(C41986a aVar) {
        if (this.f84825k && this.f84826l && this.f84818d != null) {
            boolean z = aVar.f109066a;
            if (this.f84818d.mo9513g() != z) {
                this.f84818d.mo9497b(z ? 1 : 0);
            }
        }
    }

    /* renamed from: a */
    public final C1592h mo83777b(C1592h hVar) {
        float f;
        if (this.f84822h != null) {
            mo83773a(this.f84819e, this.f84820f);
            float f2 = this.f84821g;
            if (this.f84824j == 0) {
                f = this.f84823i;
            } else {
                f = 0.0f;
            }
            mo83779b(f2, f);
            this.f84822h.mo99974c(0.0f, 0.0f);
            mo83774a(this.f84824j);
        }
        return null;
    }

    @C7709l
    public void onFilterChange(C32531a aVar) {
        int i = aVar.f84813a.f77270e;
        if (!this.f84825k) {
            this.f84832r = i;
        } else if (this.f84826l && this.f84824j != i) {
            this.f84824j = i;
            m105357g();
            if (this.f84818d != null) {
                this.f84818d.mo9504c(this.f84824j);
            }
            this.f84831q.mo74895a(this.f84833s);
            mo83774a(this.f84824j);
        }
    }

    /* renamed from: a */
    public final void mo83774a(int i) {
        float f;
        if (this.f84825k) {
            if (this.f84831q != null) {
                m105357g();
                this.f84831q.mo74896a(this.f84833s, i);
            }
            if (this.f84826l && i != -1) {
                this.f84824j = i;
                mo83773a(this.f84819e, this.f84820f);
                float f2 = this.f84821g;
                if (this.f84824j == 0) {
                    f = this.f84823i;
                } else {
                    f = 0.0f;
                }
                mo83779b(f2, f);
                if (this.f84818d != null) {
                    this.f84818d.mo9504c(this.f84824j);
                }
                if (this.f84822h != null && this.f84833s.size() > this.f84824j) {
                    String b = ((C29296g) this.f84833s.get(this.f84824j)).mo74978b();
                    if (TextUtils.isEmpty(b)) {
                        b = "";
                    }
                    this.f84822h.mo99961a(b);
                }
            }
        }
    }

    public TTLiveBroadcastView(Context context, IRecordingOperationPanel iRecordingOperationPanel) {
        C42961az.m136382c(this);
        this.f84815a = context;
        this.f84816b = iRecordingOperationPanel;
        if (this.f84816b != null) {
            this.f84816b.getLifecycle().mo55a(this);
        }
        m105355e();
    }

    /* renamed from: a */
    public final void mo83773a(float f, float f2) {
        if (this.f84822h != null) {
            if (this.f84818d.mo9509e().isEmpty()) {
                this.f84822h.mo99969b(f, f2);
                return;
            }
            this.f84822h.mo99971b(this.f84818d.mo9509e(), f, f2);
        }
    }

    /* renamed from: b */
    public final void mo83779b(float f, float f2) {
        if (this.f84822h != null) {
            if (this.f84818d.mo9507d().isEmpty()) {
                this.f84822h.mo99956a(f, f2);
            } else {
                this.f84822h.mo99963a(this.f84818d.mo9507d(), f, f2);
            }
            if (f > 0.0f) {
                this.f84822h.mo99955a(0.05f);
                return;
            }
            this.f84822h.mo99955a(0.01f);
        }
    }
}
