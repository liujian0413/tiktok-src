package com.p280ss.android.ugc.aweme.livewallpaper.p1368a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.legacy.download.C32331a;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.iesdownload.C44850c;
import com.p280ss.android.ugc.iesdownload.C44854e.C44856a;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.a.a */
public abstract class C32554a implements C44849d {

    /* renamed from: a */
    protected Aweme f84888a;

    /* renamed from: b */
    protected Activity f84889b;

    /* renamed from: c */
    protected C41654d f84890c;

    /* renamed from: d */
    protected String f84891d;

    /* renamed from: e */
    protected String f84892e;

    /* renamed from: f */
    protected String f84893f;

    /* renamed from: g */
    protected String f84894g;

    /* renamed from: h */
    protected String f84895h;

    /* renamed from: i */
    public int f84896i;

    /* renamed from: j */
    private int f84897j;

    /* renamed from: k */
    private Handler f84898k = new Handler(Looper.getMainLooper());

    /* renamed from: l */
    private Runnable f84899l = new Runnable() {
        public final void run() {
            if (C32554a.this.f84890c != null) {
                C41654d dVar = C32554a.this.f84890c;
                int i = 100;
                if (C32554a.this.f84896i < 100) {
                    i = C32554a.this.f84896i;
                }
                dVar.setProgress(i);
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo83832b(Aweme aweme);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo83833c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo83834d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo83835e();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo83836h();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo83828a() {
        C7276d.m22816c(this.f84894g);
    }

    /* renamed from: j */
    private void m105417j() {
        this.f84898k.postDelayed(new Runnable() {
            public final void run() {
                if (C32554a.this.f84896i == 0) {
                    C32554a.this.mo83836h();
                }
            }
        }, 60000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo83830b() {
        if (this.f84890c != null) {
            try {
                this.f84890c.dismiss();
            } catch (Exception unused) {
            }
            this.f84890c = null;
        }
    }

    /* renamed from: i */
    private void mo83843i() {
        C32331a.m104891a(new C44856a().mo107294a(this.f84891d).mo107298b(this.f84894g).mo107297a(), this);
    }

    /* renamed from: d */
    private boolean mo83842d(Aweme aweme) {
        if (m105414e(aweme) || !m105415f(aweme)) {
            return false;
        }
        return true;
    }

    protected C32554a(Activity activity) {
        this.f84889b = activity;
    }

    /* renamed from: e */
    private static boolean m105414e(Aweme aweme) {
        if (aweme.getAuthor() == null || !TextUtils.equals(C21115b.m71197a().getCurUserId(), aweme.getAuthorUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m105415f(Aweme aweme) {
        if (aweme.getStatus() == null || aweme.getStatus().getPrivateStatus() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo59411a(C44850c cVar) {
        if (this.f84889b != null) {
            if (this.f84897j < 3) {
                this.f84897j++;
                mo83843i();
                return;
            }
            mo83836h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo83831b(String str) {
        if (this.f84890c == null) {
            this.f84890c = C41654d.m132586b(this.f84889b, str);
            this.f84890c.setIndeterminate(false);
        }
        this.f84890c.setProgress(0);
    }

    /* renamed from: c */
    private boolean mo83840c(Aweme aweme) {
        if (aweme == null) {
            return true;
        }
        if (mo83842d(aweme)) {
            C10761a.m31399c((Context) this.f84889b, (int) R.string.fo1).mo25750a();
            return true;
        } else if (!C32557b.m105429a(this.f84889b)) {
            C10761a.m31403c((Context) this.f84889b, this.f84889b.getString(R.string.dkd)).mo25750a();
            return true;
        } else if (!mo83832b(aweme)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo83829a(Aweme aweme) {
        if (mo83840c(aweme)) {
            mo83830b();
            return;
        }
        this.f84888a = aweme;
        mo83833c();
        if (C7276d.m22812b(this.f84895h)) {
            mo83835e();
            mo83830b();
            return;
        }
        mo83831b(mo83834d());
        mo83843i();
        m105417j();
    }

    /* renamed from: a */
    public final void mo59408a(int i, long j, long j2) {
        if (this.f84889b != null) {
            this.f84896i = i;
            C6726a.m20844b(this.f84899l);
        }
    }
}
