package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio;

import android.os.CountDownTimer;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio.widget.AudioRecordBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio.widget.AudioRecordStateView;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.c */
public final class C30770c implements C30795l {

    /* renamed from: a */
    public C30788g f80550a;

    /* renamed from: b */
    public C30779d f80551b;

    /* renamed from: c */
    public AudioRecordBar f80552c;

    /* renamed from: d */
    public AudioRecordStateView f80553d;

    /* renamed from: e */
    public CopyOnWriteArrayList<C30793j> f80554e;

    /* renamed from: f */
    public C30794k f80555f = new C30794k() {
        /* renamed from: c */
        public final void mo80590c() {
        }

        /* renamed from: b */
        public final void mo80589b() {
            if (C30770c.this.f80550a != null) {
                C30770c.this.f80550a.mo80625a(C30770c.this.f80552c.f80611b);
            }
        }

        /* renamed from: a */
        public final void mo80587a() {
            if (C30770c.this.f80550a != null) {
                C30770c.this.f80551b.mo80599a(false);
                C30770c.this.f80551b.mo80596a();
                C30770c.this.mo80580c();
                C30770c.this.f80550a.mo80626b();
            }
        }

        /* renamed from: a */
        public final void mo80588a(int i) {
            C30770c.this.mo80582d();
        }
    };

    /* renamed from: g */
    private CountDownTimer f80556g;

    /* renamed from: h */
    private C30794k f80557h = new C30794k() {
        /* renamed from: a */
        public final void mo80587a() {
        }

        /* renamed from: b */
        public final void mo80589b() {
            if (!(C30770c.this.f80554e == null || C30770c.this.f80550a == null)) {
                C6726a.m20844b(new Runnable() {
                    public final void run() {
                        C30770c.this.mo80576a(C30770c.this.f80550a.f80602g, C30770c.this.f80550a.f80603h);
                    }
                });
            }
            if (C30770c.this.f80553d != null && C30770c.this.f80550a.f80603h <= 60000) {
                C6726a.m20844b(new Runnable() {
                    public final void run() {
                        C30770c.this.f80553d.setVisibility(4);
                    }
                });
            }
        }

        /* renamed from: c */
        public final void mo80590c() {
            if (C30770c.this.f80553d != null && C30770c.this.f80550a.f80603h <= 60000) {
                C30770c.this.f80553d.post(new Runnable() {
                    public final void run() {
                        C30770c.this.f80553d.setVisibility(4);
                    }
                });
            }
            C6726a.m20844b(new Runnable() {
                public final void run() {
                    C30770c.this.mo80583e();
                }
            });
        }

        /* renamed from: a */
        public final void mo80588a(final int i) {
            if (i == -1) {
                C6726a.m20844b(new Runnable() {
                    public final void run() {
                        C30770c.this.f80553d.mo80641c();
                        C30770c.this.f80555f.mo80588a(i);
                    }
                });
            }
        }
    };

    public C30770c() {
        C307711 r0 = new CountDownTimer(60000, 50) {
            public final void onFinish() {
                C30770c.this.f80553d.mo80642d();
                C30770c.this.f80552c.mo1061a();
            }

            public final void onTick(long j) {
                if (j <= 10000) {
                    if (C30770c.this.f80552c.f80611b) {
                        C30770c.this.f80553d.setSecondsRemain(j);
                    } else {
                        C30770c.this.f80553d.mo80639a(j);
                    }
                } else if (C30770c.this.f80552c.f80611b) {
                    C30770c.this.f80553d.setVolumeLevel(C30770c.this.f80550a.mo80623a(5));
                } else {
                    C30770c.this.f80553d.mo80638a(C30770c.this.f80550a.mo80623a(5));
                }
            }
        };
        this.f80556g = r0;
    }

    /* renamed from: a */
    public final void mo80572a() {
        if (this.f80550a != null) {
            this.f80550a.mo80625a(true);
        }
        if (this.f80551b != null) {
            this.f80551b.mo80599a(true);
        }
    }

    /* renamed from: b */
    public final void mo80578b() {
        if (this.f80550a != null) {
            this.f80550a.mo80627c();
        }
        if (this.f80551b != null) {
            this.f80551b.mo80602c();
        }
        if (this.f80554e != null) {
            this.f80554e.clear();
        }
    }

    /* renamed from: c */
    public final void mo80580c() {
        if (this.f80554e != null) {
            Iterator it = this.f80554e.iterator();
            while (it.hasNext()) {
                ((C30793j) it.next()).mo80452a();
            }
        }
    }

    /* renamed from: d */
    public final void mo80582d() {
        if (this.f80554e != null) {
            Iterator it = this.f80554e.iterator();
            while (it.hasNext()) {
                ((C30793j) it.next()).mo80457c();
            }
        }
    }

    /* renamed from: e */
    public final void mo80583e() {
        if (this.f80554e != null) {
            Iterator it = this.f80554e.iterator();
            while (it.hasNext()) {
                ((C30793j) it.next()).mo80457c();
            }
        }
    }

    /* renamed from: f */
    public final void mo80584f() {
        if (this.f80554e != null) {
            Iterator it = this.f80554e.iterator();
            while (it.hasNext()) {
                ((C30793j) it.next()).mo80455b();
            }
        }
    }

    /* renamed from: a */
    public final void mo80573a(Message message) {
        this.f80551b.mo80600a(message);
    }

    /* renamed from: a */
    public final void mo80574a(C30793j jVar) {
        if (!this.f80554e.contains(jVar)) {
            this.f80554e.add(jVar);
        }
    }

    /* renamed from: b */
    public final void mo80579b(Message message) {
        if (this.f80554e != null) {
            Iterator it = this.f80554e.iterator();
            while (it.hasNext()) {
                ((C30793j) it.next()).mo80456b(message);
            }
        }
    }

    /* renamed from: c */
    public final void mo80581c(Message message) {
        if (this.f80554e != null) {
            Iterator it = this.f80554e.iterator();
            while (it.hasNext()) {
                ((C30793j) it.next()).mo80453a(message);
            }
        }
    }

    /* renamed from: a */
    public final void mo80577a(List<Message> list) {
        this.f80551b.mo80598a(list);
    }

    /* renamed from: a */
    public final void mo80575a(AudioRecordBar audioRecordBar, AudioRecordStateView audioRecordStateView) {
        this.f80550a = new C30788g();
        this.f80550a.f80600e = this.f80557h;
        this.f80550a.f80597b = this.f80556g;
        this.f80551b = new C30779d();
        this.f80551b.mo80597a(audioRecordBar.getContext(), (C30795l) this);
        this.f80552c = audioRecordBar;
        this.f80553d = audioRecordStateView;
        audioRecordBar.setListener(this.f80555f);
        audioRecordBar.setStateView(audioRecordStateView);
        this.f80554e = new CopyOnWriteArrayList<>();
    }

    /* renamed from: a */
    public final void mo80576a(File file, long j) {
        this.f80551b.mo80601b();
        if (this.f80554e != null) {
            Iterator it = this.f80554e.iterator();
            while (it.hasNext()) {
                ((C30793j) it.next()).mo80454a(file, j);
            }
        }
    }
}
