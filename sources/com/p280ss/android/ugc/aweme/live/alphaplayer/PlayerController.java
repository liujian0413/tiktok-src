package com.p280ss.android.ugc.aweme.live.alphaplayer;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.p280ss.android.ugc.aweme.live.alphaplayer.C32454c.C32455a;
import com.p280ss.android.ugc.aweme.live.alphaplayer.C32454c.C32456b;
import com.p280ss.android.ugc.aweme.live.alphaplayer.C32454c.C32457c;
import com.p280ss.android.ugc.aweme.live.alphaplayer.C32454c.C32458d;
import com.p280ss.android.ugc.aweme.live.alphaplayer.C32454c.C32459e;
import com.p280ss.android.ugc.aweme.live.alphaplayer.DataSource.ScaleType;
import com.p280ss.android.ugc.aweme.live.alphaplayer.p1360a.C32446a;
import com.p280ss.android.ugc.aweme.live.alphaplayer.p1361b.C32448a;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.PlayerController */
public class PlayerController implements C0042h, Callback, C32461e {

    /* renamed from: a */
    public C32464g f84634a = C32464g.NOT_PREPARED;

    /* renamed from: b */
    public C32460d f84635b;

    /* renamed from: c */
    public C32445a f84636c;

    /* renamed from: d */
    public AlphaVideoView f84637d;

    /* renamed from: e */
    private long f84638e;

    /* renamed from: f */
    private boolean f84639f;

    /* renamed from: g */
    private Context f84640g;

    /* renamed from: h */
    private C32454c<C32448a<C32448a>> f84641h;

    /* renamed from: i */
    private Handler f84642i;

    /* renamed from: j */
    private Handler f84643j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    private HandlerThread f84644k;

    /* renamed from: l */
    private C32459e<C32448a<C32448a>> f84645l = new C32459e<C32448a<C32448a>>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo83698a(C32448a<C32448a> aVar) {
            PlayerController.this.mo83679a(PlayerController.m105088a(2, (Object) null));
        }
    };

    /* renamed from: m */
    private C32457c<C32448a<C32448a>> f84646m = new C32457c<C32448a<C32448a>>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo83699a(C32448a<C32448a> aVar, int i, int i2, String str) {
            PlayerController playerController = PlayerController.this;
            StringBuilder sb = new StringBuilder("mediaPlayer error, info:");
            sb.append(str);
            playerController.mo83683a(false, i, i2, sb.toString());
            PlayerController.this.mo83688d();
        }
    };

    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
        m105097f();
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        mo83678a();
    }

    @C0054q(mo125a = Event.ON_STOP)
    public void onStop() {
        m105098g();
    }

    /* renamed from: a */
    public final void mo83681a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.f84637d.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f84637d);
            }
            if (viewGroup.indexOfChild(this.f84637d) == -1) {
                viewGroup.addView(this.f84637d);
            }
        }
    }

    /* renamed from: a */
    public final void mo83682a(DataSource dataSource) {
        this.f84638e = dataSource.f84626d;
        if (dataSource.f84624b) {
            m105090a(0);
            mo83679a(m105088a(1, (Object) dataSource));
            return;
        }
        mo83688d();
        StringBuilder sb = new StringBuilder("dataSource is invalid. ErrorInfo: ");
        sb.append(dataSource.f84625c);
        mo83684a(false, sb.toString());
    }

    /* renamed from: a */
    public final void mo83684a(boolean z, String str) {
        mo83683a(z, 0, 0, str);
    }

    /* renamed from: a */
    public final void mo83683a(boolean z, int i, int i2, String str) {
        if (this.f84635b != null) {
            C32460d dVar = this.f84635b;
            String i3 = this.f84641h != null ? this.f84641h.mo21078i() : "unknown";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", messageId: ");
            sb.append(this.f84638e);
            dVar.mo21098a(z, i3, i, i2, sb.toString());
        }
    }

    /* renamed from: f */
    private void m105097f() {
        mo83679a(m105088a(3, (Object) null));
    }

    /* renamed from: g */
    private void m105098g() {
        mo83679a(m105088a(5, (Object) null));
    }

    /* renamed from: b */
    public final void mo83685b() {
        mo83679a(m105088a(6, (Object) null));
    }

    /* renamed from: c */
    public final void mo83687c() {
        mo83679a(m105088a(9, (Object) null));
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        mo83679a(m105088a(6, (Object) null));
    }

    /* renamed from: d */
    public final void mo83688d() {
        this.f84639f = false;
        this.f84638e = 0;
        this.f84643j.post(new Runnable() {
            public final void run() {
                if (PlayerController.this.f84636c != null) {
                    PlayerController.this.f84636c.mo21097b();
                }
            }
        });
    }

    /* renamed from: e */
    private void m105096e() {
        this.f84637d = new AlphaVideoView(this.f84640g, null);
        this.f84637d.setLayoutParams(new LayoutParams(-1, -1));
        this.f84637d.setPlayerController(this);
        this.f84637d.setVideoRenderer(new C32465h(this.f84637d));
    }

    /* renamed from: h */
    private void m105099h() throws Exception {
        final C32446a h = this.f84641h.mo21077h();
        this.f84637d.mo83662a((float) (h.f84658a / 2), (float) h.f84659b);
        final ScaleType scaleType = this.f84637d.getScaleType();
        this.f84643j.post(new Runnable() {
            public final void run() {
                if (PlayerController.this.f84636c != null) {
                    PlayerController.this.f84636c.mo21096a(h.f84658a / 2, h.f84659b, scaleType);
                }
            }
        });
    }

    /* renamed from: i */
    private void m105100i() {
        if (this.f84641h != null) {
            if (this.f84634a == C32464g.NOT_PREPARED || this.f84634a == C32464g.STOPPED) {
                this.f84641h.mo83706a(this.f84645l);
                this.f84641h.mo83704a(this.f84646m);
                this.f84641h.mo21070b();
            }
        }
    }

    /* renamed from: j */
    private void m105101j() {
        if (this.f84641h != null) {
            switch (this.f84634a) {
                case PREPARED:
                    this.f84641h.mo21072c();
                    this.f84639f = true;
                    this.f84634a = C32464g.STARTED;
                    this.f84643j.post(new Runnable() {
                        public final void run() {
                            if (PlayerController.this.f84636c != null) {
                                PlayerController.this.f84636c.mo21095a();
                            }
                        }
                    });
                    return;
                case PAUSED:
                    this.f84641h.mo21072c();
                    this.f84634a = C32464g.STARTED;
                    return;
                case NOT_PREPARED:
                case STOPPED:
                    try {
                        m105100i();
                        return;
                    } catch (Exception unused) {
                        mo83684a(false, "prepare and start MediaPlayer failure.");
                        mo83688d();
                        break;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo83678a() {
        mo83679a(m105088a(4, (Object) null));
    }

    /* renamed from: a */
    public final C32461e mo83677a(C32445a aVar) {
        this.f84636c = aVar;
        return this;
    }

    /* renamed from: a */
    public final void mo83679a(Message message) {
        m105092a(message, 0);
    }

    /* renamed from: b */
    private void m105094b(DataSource dataSource) {
        try {
            m105095c(dataSource);
        } catch (Exception e) {
            mo83688d();
            StringBuilder sb = new StringBuilder("alphaVideoView set dataSource failure:");
            sb.append(Log.getStackTraceString(e));
            mo83684a(false, sb.toString());
        }
    }

    /* renamed from: a */
    private void m105090a(int i) {
        this.f84637d.setVisibility(0);
        this.f84637d.bringToFront();
    }

    /* renamed from: b */
    public final void mo83686b(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.removeView(this.f84637d);
        }
    }

    /* renamed from: c */
    private void m105095c(DataSource dataSource) throws Exception {
        this.f84641h.mo21075f();
        this.f84634a = C32464g.NOT_PREPARED;
        int i = this.f84640g.getResources().getConfiguration().orientation;
        String a = dataSource.mo83675a(i);
        ScaleType b = dataSource.mo83676b(i);
        if (TextUtils.isEmpty(a) || !new File(a).exists()) {
            StringBuilder sb = new StringBuilder("dataPath is empty or File is not exists. path: ");
            sb.append(a);
            mo83684a(false, sb.toString());
            mo83688d();
            return;
        }
        this.f84637d.setScaleType(b);
        this.f84641h.mo21068a(a);
        if (this.f84637d.f84609a) {
            m105100i();
        }
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (this.f84642i != null) {
                    this.f84642i.removeMessages(8);
                }
                m105094b((DataSource) message.obj);
                break;
            case 2:
                try {
                    m105099h();
                    this.f84634a = C32464g.PREPARED;
                    m105101j();
                    break;
                } catch (Exception e) {
                    mo83688d();
                    StringBuilder sb = new StringBuilder("start video failure:");
                    sb.append(Log.getStackTraceString(e));
                    mo83684a(false, sb.toString());
                    break;
                }
            case 3:
                if (this.f84641h != null && this.f84634a == C32464g.STARTED) {
                    this.f84641h.mo21073d();
                    this.f84634a = C32464g.PAUSED;
                    break;
                }
            case 4:
                if (this.f84639f) {
                    m105101j();
                    break;
                }
                break;
            case 5:
                if (this.f84641h != null && (this.f84634a == C32464g.STARTED || this.f84634a == C32464g.PAUSED)) {
                    this.f84641h.mo21073d();
                    this.f84634a = C32464g.PAUSED;
                    break;
                }
            case 6:
                this.f84637d.onPause();
                if (this.f84641h != null) {
                    if (this.f84634a == C32464g.STARTED) {
                        this.f84641h.mo21073d();
                        this.f84634a = C32464g.PAUSED;
                    }
                    if (this.f84634a == C32464g.PAUSED) {
                        this.f84641h.mo21074e();
                        this.f84634a = C32464g.STOPPED;
                    }
                    this.f84641h.mo21076g();
                    this.f84637d.mo83664c();
                    this.f84634a = C32464g.RELEASE;
                    if (this.f84644k != null) {
                        this.f84644k.quit();
                        this.f84644k.interrupt();
                        break;
                    }
                } else {
                    this.f84634a = C32464g.NOT_PREPARED;
                    return true;
                }
                break;
            case 7:
                this.f84641h.mo21067a((Surface) message.obj);
                break;
            case 9:
                if (this.f84641h != null) {
                    this.f84641h.mo21075f();
                    this.f84634a = C32464g.NOT_PREPARED;
                    this.f84639f = false;
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    private void m105093a(C32454c<C32448a<C32448a>> cVar) {
        this.f84641h = cVar;
        cVar.mo21071b(true);
        cVar.mo21069a(false);
        this.f84641h.mo83705a((C32458d<T>) new C32458d<C32448a<C32448a>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo83695a(C32448a<C32448a> aVar) {
                PlayerController.this.f84637d.mo83661a();
            }
        });
        this.f84641h.mo83703a((C32456b<T>) new C32456b<C32448a<C32448a>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo83696a(C32448a<C32448a> aVar) {
                PlayerController.this.f84637d.mo83663b();
                PlayerController.this.f84634a = C32464g.PAUSED;
                PlayerController.this.mo83684a(true, (String) null);
                PlayerController.this.mo83688d();
            }
        });
    }

    /* renamed from: a */
    public final void mo83680a(Surface surface) {
        mo83679a(m105088a(7, (Object) surface));
    }

    /* renamed from: a */
    public static Message m105088a(int i, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        return obtain;
    }

    /* renamed from: a */
    public static PlayerController m105089a(C32447b bVar, C32454c cVar) {
        return new PlayerController(bVar.f84660a, bVar.f84661b, cVar);
    }

    /* renamed from: a */
    private void m105091a(Context context, C0043i iVar) {
        this.f84640g = context;
        iVar.getLifecycle().mo55a(this);
        this.f84644k = new HandlerThread("alpha-play-thread", 10);
        this.f84644k.start();
        this.f84642i = new Handler(this.f84644k.getLooper(), this);
        this.f84641h = C32455a.m105172a();
    }

    /* renamed from: a */
    private void m105092a(Message message, long j) {
        if (this.f84644k != null && this.f84644k.isAlive() && !this.f84644k.isInterrupted()) {
            if (this.f84642i == null) {
                this.f84642i = new Handler(this.f84644k.getLooper(), this);
            }
            this.f84642i.sendMessageDelayed(message, 0);
        }
    }

    private PlayerController(Context context, C0043i iVar, C32454c<C32448a<C32448a>> cVar) {
        m105091a(context, iVar);
        m105096e();
        m105093a(cVar);
    }
}
