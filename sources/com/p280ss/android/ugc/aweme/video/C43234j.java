package com.p280ss.android.ugc.aweme.video;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34967c;
import com.p280ss.android.ugc.aweme.video.experiment.TTPlayerRenderTypeExperiment;
import com.p280ss.android.ugc.aweme.video.p1697a.C43180a;
import com.p280ss.android.ugc.aweme.video.p1697a.C43180a.C43181a;
import com.p280ss.android.ugc.aweme.video.p1700d.C43209d;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.video.j */
public class C43234j implements C43180a {

    /* renamed from: a */
    public static final String f111907a = "j";

    /* renamed from: b */
    public C34976f f111908b;

    /* renamed from: c */
    private HandlerThread f111909c;

    /* renamed from: d */
    private C43236a f111910d;

    /* renamed from: e */
    private String f111911e;

    /* renamed from: com.ss.android.ugc.aweme.video.j$a */
    static class C43236a extends Handler {

        /* renamed from: a */
        public IPlayer f111915a;

        /* renamed from: b */
        public volatile Surface f111916b;

        /* renamed from: c */
        public String f111917c;

        /* renamed from: d */
        public int f111918d;

        /* renamed from: e */
        public boolean f111919e;

        /* renamed from: f */
        public long f111920f;

        /* renamed from: g */
        public long f111921g = -1;

        /* renamed from: h */
        public boolean f111922h;

        /* renamed from: i */
        public int f111923i;

        /* renamed from: j */
        public C43234j f111924j;

        /* renamed from: k */
        public C43181a f111925k;

        /* renamed from: l */
        public C34967c f111926l;

        /* renamed from: m */
        private String f111927m;

        /* renamed from: d */
        private void m137157d() {
            this.f111915a.mo88593f();
            this.f111918d = 0;
        }

        /* renamed from: g */
        private void m137160g() {
            if (this.f111915a != null) {
                mo104972b();
                this.f111915a.mo88591d();
                this.f111918d = 6;
            }
        }

        /* renamed from: c */
        private void m137156c() {
            this.f111915a = C43209d.m137009a(Type.TT, true);
            this.f111926l = new C34967c() {

                /* renamed from: b */
                private boolean f111929b = true;

                /* renamed from: c */
                public final void mo88609c() {
                    StringBuilder sb = new StringBuilder("onCompletion() called, mStatus = [");
                    sb.append(C43236a.this.f111918d);
                    sb.append("]");
                    if (C43236a.this.f111924j != null) {
                        if (C43236a.this.f111923i == 0) {
                            C43236a.this.f111924j.mo104962a(4, C43236a.this.f111917c);
                        }
                        C43236a.this.f111923i++;
                        C43236a.this.f111924j.mo104962a(6, C43236a.this.f111917c);
                    }
                }

                /* renamed from: a */
                public final void mo88605a() {
                    StringBuilder sb = new StringBuilder("onPrepared() called, mStatus = [");
                    sb.append(C43236a.this.f111918d);
                    sb.append("]      mReady2Render=[");
                    sb.append(C43236a.this.f111919e);
                    sb.append("]");
                    if (C43236a.this.f111918d == 1) {
                        C43236a.this.f111918d = 2;
                        C43236a.this.f111922h = true;
                        C43236a.this.mo104970a();
                        return;
                    }
                    if (C43236a.this.f111918d == 5) {
                        C43236a.this.mo104972b();
                    }
                }

                /* renamed from: b */
                public final void mo88608b() {
                    StringBuilder sb = new StringBuilder("onRender() called, mStatus = [");
                    sb.append(C43236a.this.f111918d);
                    sb.append("]");
                    sb.append(C43236a.this.f111916b);
                    if (C43236a.this.f111924j != null) {
                        C43236a.this.f111924j.mo104962a(0, new C44920d(C43236a.this.f111917c, false, C43236a.this.f111915a.mo88600m()));
                        C43236a.this.f111924j.mo104962a(7, new C44921e(C43236a.this.f111917c, false));
                    }
                    C43236a.this.f111922h = false;
                }

                /* renamed from: a */
                public final void mo88607a(boolean z) {
                    StringBuilder sb = new StringBuilder("onBuffering() called with: isBuffering = [");
                    sb.append(z);
                    sb.append("], mStatus = [");
                    sb.append(C43236a.this.f111918d);
                    sb.append("]");
                    if (!z) {
                        C43236a.this.f111922h = false;
                        if (C43236a.this.f111924j != null) {
                            C43236a.this.f111924j.mo104962a(5, Boolean.valueOf(false));
                        }
                    } else if (C43236a.this.f111924j != null) {
                        C43236a.this.f111924j.mo104962a(5, Boolean.valueOf(true));
                    }
                }

                /* renamed from: a */
                public final void mo88606a(int i, int i2, Object obj) {
                    boolean z;
                    StringBuilder sb = new StringBuilder("onError() called with: what = [");
                    sb.append(i);
                    sb.append("], extra = [");
                    sb.append(i2);
                    sb.append("], extraInfo = [");
                    sb.append(obj);
                    sb.append("], mStatus = [");
                    sb.append(C43236a.this.f111918d);
                    sb.append("]");
                    if (this.f111929b && i == -10000 && i2 == -1000) {
                        z = true;
                    } else {
                        z = false;
                    }
                    StringBuilder sb2 = new StringBuilder("onError() called with: retryOnError = [");
                    sb2.append(z);
                    sb2.append("]");
                    if (!z && C43236a.this.f111924j != null) {
                        C44919c cVar = new C44919c(C43236a.this.f111917c, false, i, i2, obj);
                        C43236a.this.f111924j.mo104962a(2, cVar);
                    }
                    if (C43236a.this.f111915a != null) {
                        C43236a.this.f111915a.mo88577a((Surface) null);
                        C43236a.this.f111915a.mo88592e();
                        C43236a.this.f111915a = null;
                        C43236a.this.f111918d = 0;
                    }
                    C43236a.this.f111920f = -1;
                    C43236a.this.f111921g = -1;
                    if (z) {
                        C43236a.this.mo104971a(C43236a.this.f111925k);
                        C6877n.m21447a("aweme_media_play_retry_on_freezing", null);
                        if (C43236a.this.f111924j != null) {
                            C43234j jVar = C43236a.this.f111924j;
                            C44919c cVar2 = new C44919c(C43236a.this.f111917c, false, i, i2, obj);
                            jVar.mo104962a(8, cVar2);
                        }
                    }
                }
            };
            this.f111915a.mo88579a(this.f111926l);
        }

        /* renamed from: h */
        private void m137161h() {
            m137160g();
            if (this.f111915a != null) {
                this.f111915a.mo88592e();
                this.f111915a = null;
                this.f111918d = 7;
            }
        }

        /* renamed from: e */
        private void m137158e() {
            StringBuilder sb = new StringBuilder("render() called status=[");
            sb.append(this.f111918d);
            sb.append("]");
            this.f111919e = true;
            if (this.f111918d == 1 || this.f111918d == 2) {
                if (this.f111918d == 2) {
                    mo104970a();
                }
                return;
            }
            mo104971a(this.f111925k);
        }

        /* renamed from: f */
        private void m137159f() {
            new StringBuilder("resume() called").append(this.f111918d);
            if (this.f111918d < 2 || this.f111918d > 5) {
                mo104971a(this.f111925k);
                return;
            }
            this.f111918d = 2;
            mo104970a();
            if (this.f111924j != null) {
                this.f111924j.mo104962a(1, this.f111917c);
            }
        }

        /* renamed from: a */
        public final void mo104970a() {
            if (this.f111915a != null && this.f111918d == 2 && this.f111916b != null && this.f111916b.isValid()) {
                this.f111915a.mo88577a(this.f111916b);
                this.f111915a.mo88587b();
                this.f111918d = 3;
            }
        }

        /* renamed from: b */
        public final void mo104972b() {
            if (this.f111915a != null && this.f111918d <= 5) {
                this.f111915a.mo88589c();
                if (this.f111924j != null && this.f111918d <= 5) {
                    this.f111924j.mo104962a(3, this.f111917c);
                }
                this.f111918d = 5;
            }
        }

        /* renamed from: a */
        public final void mo104971a(C43181a aVar) {
            if (aVar != null) {
                this.f111925k = aVar;
                this.f111927m = aVar.mo104813a();
                this.f111917c = aVar.f111813b;
                StringBuilder sb = new StringBuilder("prepare() called with: prepareData = [");
                sb.append(this.f111927m);
                sb.append("], id = [");
                sb.append(this.f111917c);
                sb.append("]");
                if (this.f111927m != null && !TextUtils.isEmpty(this.f111927m)) {
                    this.f111920f = System.currentTimeMillis();
                    this.f111917c = this.f111917c;
                    if (this.f111915a == null) {
                        m137156c();
                    } else {
                        m137157d();
                    }
                    this.f111922h = false;
                    this.f111923i = 0;
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put("context", C6399b.m19921a());
                        hashMap.put("vr", Boolean.valueOf(false));
                        hashMap.put("h265", Boolean.valueOf(false));
                        hashMap.put("render_type", Integer.valueOf(C6384b.m19835a().mo15287a(TTPlayerRenderTypeExperiment.class, true, "ttplayer_render_type", C6384b.m19835a().mo15295d().ttplayer_render_type, 0)));
                        this.f111915a.mo88585a(this.f111927m, (Map<String, Object>) hashMap);
                        this.f111918d = 1;
                    } catch (IOException unused) {
                        if (this.f111924j != null) {
                            this.f111924j.mo104962a(2, this.f111917c);
                        }
                        this.f111920f = -1;
                    }
                }
            }
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    return;
                case 1:
                    C43181a aVar = (C43181a) message.obj;
                    if (aVar != null) {
                        mo104971a(aVar);
                        return;
                    }
                    return;
                case 3:
                    mo104970a();
                    return;
                case 4:
                    String str = (String) message.obj;
                    if (!TextUtils.isEmpty(str) && C6319n.m19594a(str, this.f111917c)) {
                        m137159f();
                        return;
                    }
                case 5:
                    mo104972b();
                    return;
                case 6:
                    m137160g();
                    return;
                case 7:
                    m137161h();
                    return;
                case 8:
                    m137158e();
                    return;
                case 9:
                    Pair pair = (Pair) message.obj;
                    if (pair != null) {
                        m137155a(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                        return;
                    }
                    break;
                case 10:
                    Looper looper = getLooper();
                    if (!(looper == null || looper == Looper.getMainLooper())) {
                        looper.quit();
                        break;
                    }
            }
        }

        C43236a(Looper looper, C43234j jVar) {
            super(looper);
            this.f111924j = jVar;
        }

        /* renamed from: a */
        private void m137155a(float f, float f2) {
            if (this.f111915a != null) {
                this.f111915a.mo88575a(f, f2);
            }
        }
    }

    /* renamed from: e */
    private void m137146e() {
        if (this.f111910d == null) {
            m137145d();
        }
    }

    /* renamed from: a */
    public final void mo104961a() {
        if (this.f111910d != null) {
            this.f111910d.sendEmptyMessage(5);
        }
    }

    /* renamed from: c */
    public final void mo104968c() {
        if (this.f111910d != null) {
            this.f111910d.sendEmptyMessage(8);
        }
    }

    /* renamed from: b */
    public final void mo104967b() {
        if (this.f111910d != null) {
            this.f111910d.removeCallbacksAndMessages(null);
            this.f111910d.sendEmptyMessage(7);
            this.f111910d.sendEmptyMessage(10);
            this.f111910d = null;
        }
        if (this.f111909c != null) {
            this.f111909c = null;
        }
    }

    /* renamed from: d */
    private void m137145d() {
        Looper looper;
        try {
            this.f111909c = new HandlerThread("live_play_thread", 0);
            this.f111909c.start();
        } catch (Exception e) {
            this.f111909c = null;
            C6921a.m21559a((Throwable) e);
        }
        if (this.f111909c == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = this.f111909c.getLooper();
        }
        this.f111910d = new C43236a(looper, this);
    }

    /* renamed from: a */
    public final void mo104964a(C34976f fVar) {
        this.f111908b = fVar;
    }

    /* renamed from: a */
    public final void mo104963a(Surface surface) {
        m137146e();
        this.f111910d.f111916b = surface;
    }

    /* renamed from: a */
    public final void mo104965a(C43181a aVar) {
        m137146e();
        this.f111910d.sendMessage(this.f111910d.obtainMessage(1, aVar));
        this.f111911e = aVar.f111813b;
    }

    /* renamed from: a */
    public final void mo104966a(String str) {
        new StringBuilder("resume").append(str);
        if (this.f111910d != null) {
            this.f111910d.obtainMessage(4, str).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo104962a(final int i, final Object obj) {
        C6726a.m20844b(new Runnable() {
            public final void run() {
                if (C43234j.this.f111908b != null) {
                    switch (i) {
                        case 0:
                            C43234j.this.f111908b.mo63044a((C44920d) obj);
                            return;
                        case 1:
                            C43234j.this.f111908b.mo63046a((String) obj);
                            return;
                        case 2:
                            C43234j.this.f111908b.mo63043a((C44919c) obj);
                            return;
                        case 3:
                            C43234j.this.f111908b.mo64951d((String) obj);
                            return;
                        case 5:
                            C43234j.this.f111908b.mo64954e_(((Boolean) obj).booleanValue());
                            return;
                        case 6:
                            C43234j.this.f111908b.mo63047b((String) obj);
                            return;
                        case 7:
                            C43234j.this.f111908b.mo63045a((C44921e) obj);
                            break;
                        case 8:
                            C43234j.this.f111908b.mo64946b((C44919c) obj);
                            return;
                    }
                }
            }
        });
    }
}
