package com.p280ss.android.ugc.aweme.shortvideo.countdown;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.net.Uri;
import android.support.p022v4.app.FragmentActivity;
import android.widget.FrameLayout;
import com.bytedance.scene.group.C12604b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23321d;
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.countdown.C38594c.C38596a;
import com.p280ss.android.ugc.aweme.shortvideo.countdown.C38597d.C38599b;
import com.p280ss.android.ugc.aweme.shortvideo.countdown.C38622h.C38623a;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.countdown.C44600a;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.CountDownModule */
public class CountDownModule implements C0042h, C38622h {

    /* renamed from: a */
    public FragmentActivity f100235a;

    /* renamed from: b */
    public C44600a f100236b;

    /* renamed from: c */
    public C38594c f100237c;

    /* renamed from: d */
    public C38622h f100238d;

    /* renamed from: e */
    public int f100239e;

    /* renamed from: f */
    public long f100240f = C40413c.f105051b;

    /* renamed from: g */
    public int f100241g;

    /* renamed from: h */
    public C38596a f100242h = new C38596a() {
        /* renamed from: a */
        public final void mo96571a(int i) {
            C38597d dVar = (C38597d) CountDownModule.this.f100236b.mo30924a("count_down");
            if (dVar != null) {
                dVar.mo96614d(i);
            }
        }
    };

    /* renamed from: i */
    private C23321d<JSONObject> f100243i;

    /* renamed from: j */
    private C38591a f100244j;

    /* renamed from: k */
    private C38599b f100245k = new C38599b() {
        /* renamed from: a */
        public final void mo96567a(int i) {
            RecordToolbarViewModel recordToolbarViewModel = (RecordToolbarViewModel) C36113b.m116288a(CountDownModule.this.f100235a).mo91871a(RecordToolbarViewModel.class);
            if (recordToolbarViewModel != null) {
                recordToolbarViewModel.mo107176a(i);
            }
        }
    };

    /* renamed from: l */
    private C38624i f100246l = new C38624i() {
        /* renamed from: a */
        public final void mo96568a() {
            if (CountDownModule.this.f100237c != null) {
                CountDownModule.this.f100237c.mo96604c();
            }
        }

        /* renamed from: a */
        public final void mo96569a(int i, int i2) {
            CountDownModule.this.f100241g = i2;
            CountDownModule.this.f100239e = (int) Math.min(CountDownModule.this.f100240f, (long) i);
            CountDownModule.this.f100238d.mo96562a(i2);
        }

        /* renamed from: a */
        public final void mo96570a(String str, int i, int i2) {
            if (str != null) {
                if (CountDownModule.this.f100237c != null) {
                    CountDownModule.this.f100237c.mo96604c();
                }
                CountDownModule.this.f100237c = new C38594c(CountDownModule.this.f100235a, Uri.parse(str));
                CountDownModule.this.f100237c.f100270e = CountDownModule.this.f100242h;
                CountDownModule.this.f100237c.mo96602a(i, i2);
            }
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.CountDownModule$a */
    public interface C38590a {
        /* renamed from: a */
        void mo96572a();

        /* renamed from: a */
        void mo96573a(boolean z);
    }

    /* renamed from: a */
    public final void mo96561a() {
        this.f100238d.mo96561a();
    }

    /* renamed from: b */
    public final boolean mo96564b() {
        return this.f100238d.mo96564b();
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_RESUME)
    public void resume() {
        if (this.f100237c != null) {
            this.f100237c.mo96603b();
        }
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_PAUSE)
    public void pause() {
        if (this.f100237c != null) {
            this.f100237c.mo96600a();
        }
        mo96561a();
        this.f100244j.mo96594b();
    }

    /* renamed from: a */
    public final void mo96562a(int i) {
        this.f100238d.mo96562a(i);
    }

    public CountDownModule(C44600a aVar, FragmentActivity fragmentActivity, FrameLayout frameLayout, C38623a aVar2, C23321d<JSONObject> dVar) {
        this.f100235a = fragmentActivity;
        this.f100236b = aVar;
        this.f100243i = dVar;
        this.f100244j = new C38591a(fragmentActivity);
        this.f100238d = new C38593b(frameLayout, aVar2, this.f100244j);
        fragmentActivity.getLifecycle().mo55a(this);
    }

    /* renamed from: a */
    public final void mo96563a(int i, String str, UrlModel urlModel, long j, long j2, long j3, long j4, AVMusicWaveBean aVMusicWaveBean, C38590a aVar) {
        long j5 = j4;
        this.f100240f = j5;
        ((C35622l) C25682d.m84426a(this.f100235a, C35622l.class)).mo60360a(false);
        C38597d.m123325a(str, C39312e.m125622a(aVMusicWaveBean), urlModel, j, j2, j3, j5).mo96609a(this.f100246l).mo96607a(aVar).mo96608a(this.f100245k).mo96612a((C12604b) this.f100236b, (int) R.id.cpo, "count_down");
    }
}
