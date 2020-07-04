package com.p280ss.android.ugc.aweme.choosemusic.p1092f;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.C6379c;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.p1090d.C23875u;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33951d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34018y;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.p1716b.p1717a.C43652b;
import com.p280ss.android.ugc.p1716b.p1717a.C43653c;
import com.p280ss.android.ugc.p1716b.p1717a.C43654d;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.f.a */
public final class C23880a extends C34018y {

    /* renamed from: a */
    public Handler f63021a;

    /* renamed from: b */
    public Thread f63022b;

    /* renamed from: c */
    public C23819a f63023c;

    /* renamed from: d */
    public C23886a f63024d;

    /* renamed from: s */
    private C23875u f63025s;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.f.a$a */
    public interface C23886a {
        /* renamed from: a */
        void mo61983a();

        /* renamed from: a */
        void mo61984a(int i, int i2);
    }

    /* renamed from: a */
    public final void mo61971a() {
        super.mo61971a();
        if (this.f88734n != null && this.f63023c != null) {
            C23888c.m78187a(this.f88734n.getMusicId());
            C23888c.m78189a(this.f88734n.getMusicId(), this.f63023c);
        }
    }

    /* renamed from: c */
    public final void mo61975c() {
        this.f88728h.mo105602a((C43654d) new C23887b(this));
        this.f88728h.mo105600a((C43652b) new C43652b() {
            /* renamed from: a */
            public final void mo61979a() {
                if (C23880a.this.f63024d != null) {
                    C23880a.this.f63024d.mo61983a();
                }
                if (C23880a.this.f63023c.f62877h) {
                    C23888c.m78187a(C23880a.this.f88734n.getMusicId());
                    C23888c.m78189a(C23880a.this.f88734n.getMusicId(), C23880a.this.f63023c);
                }
            }
        });
        this.f88728h.mo105601a((C43653c) new C43653c() {
            /* renamed from: a */
            public final void mo61980a(int i, int i2) {
                if (C23880a.this.f63024d != null) {
                    C23880a.this.f63024d.mo61984a(i, i2);
                }
            }
        });
    }

    /* renamed from: d */
    public final void mo61976d() {
        if (this.f88736q != null) {
            this.f88736q.cancel();
        }
        if (this.f88725e != null) {
            this.f88725e = null;
        }
        if (this.f63021a != null) {
            this.f63021a.removeCallbacksAndMessages(null);
            this.f63021a.sendEmptyMessage(0);
        }
        this.f88728h.mo105600a((C43652b) null);
        this.f88728h.mo105601a((C43653c) null);
        this.f88728h.mo105602a((C43654d) null);
        this.f63024d = null;
    }

    /* renamed from: b */
    public final void mo61974b() {
        if (this.f88736q != null) {
            this.f88736q.cancel();
        }
        if (this.f63021a == null) {
            if (this.f88728h != null) {
                this.f88728h.mo105608b();
            }
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 2;
        this.f63021a.sendMessage(obtain);
    }

    public C23880a(C33951d dVar) {
        this(dVar, null);
    }

    /* renamed from: b */
    private void m78167b(String str) {
        if (this.f63025s != null && TextUtils.equals(str, this.f63025s.f63011a)) {
            C6379c.m19826a("time_from_click_music_to_start_play", C6869c.m21381a().mo16886a("duration", Long.valueOf(System.currentTimeMillis() - this.f63025s.f63012b)).mo16888b());
        }
    }

    /* renamed from: c */
    private void m78168c(MusicModel musicModel) {
        if (C33703a.m108723g()) {
            if (this.f88736q != null) {
                this.f88736q.cancel();
            }
            if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
                C238854 r0 = new CountDownTimer((long) musicModel.getRealAuditionDuration(), 1000) {
                    public final void onTick(long j) {
                    }

                    public final void onFinish() {
                        C23880a.this.f88728h.mo105608b();
                        if (C23880a.this.f63024d != null) {
                            C23880a.this.f63024d.mo61983a();
                        }
                    }
                };
                this.f88736q = r0;
                this.f88736q.start();
            }
        }
    }

    public C23880a(C33951d dVar, C23886a aVar) {
        super(dVar);
        this.f63024d = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo61972a(int i, int i2) {
        if (this.f88734n != null) {
            m78168c(this.f88734n);
        }
        C23888c.m78183a(this.f63023c, this.f88734n);
        C23888c.m78188a(this.f88734n.getMusicId(), i2);
        m78167b(this.f88734n.getMusicId());
        if (this.f88733m && this.f88728h != null) {
            mo61974b();
        }
        if (this.f88725e != null && this.f88725e.mo61999f() != null && i2 != 0) {
            this.f88725e.mo61999f().setDuration(i2);
        }
    }

    /* renamed from: a */
    public final void mo61973a(MusicModel musicModel, int i, boolean z) {
        final C23892g gVar = new C23892g(musicModel, i, z);
        if (musicModel != null) {
            this.f63025s = new C23875u(musicModel.getMusicId(), System.currentTimeMillis());
        }
        if (this.f63022b == null) {
            this.f63022b = new Thread() {
                public final void run() {
                    Looper.prepare();
                    C23880a.this.f63021a = new Handler(Looper.myLooper()) {
                        public final void handleMessage(Message message) {
                            if (message.what == 0) {
                                Looper.myLooper().quit();
                                if (C23880a.this.f88728h != null) {
                                    C23880a.this.f88728h.mo105598a();
                                }
                                C23880a.this.f63022b = null;
                                return;
                            }
                            if (message.what == 2) {
                                if (C23880a.this.f88728h != null) {
                                    C23880a.this.f88728h.mo105608b();
                                }
                            } else if (message.what == 1) {
                                C23892g gVar = (C23892g) message.obj;
                                C238811.super.mo61973a(gVar.f63043a, gVar.f63044b, gVar.f63045c);
                            }
                        }
                    };
                    C23880a.super.mo61973a(gVar.f63043a, gVar.f63044b, gVar.f63045c);
                    Looper.loop();
                }
            };
            this.f63022b.start();
            return;
        }
        if (this.f63021a != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = gVar;
            this.f63021a.sendMessage(obtain);
        }
    }
}
