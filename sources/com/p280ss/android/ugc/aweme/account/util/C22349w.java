package com.p280ss.android.ugc.aweme.account.util;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.ss.android.ugc.aweme.account.util.w */
public final class C22349w implements C6310a {

    /* renamed from: a */
    public long f59612a;

    /* renamed from: b */
    public long f59613b;

    /* renamed from: c */
    public C22350a f59614c;

    /* renamed from: d */
    private long f59615d;

    /* renamed from: e */
    private C6309f f59616e = new C6309f(this);

    /* renamed from: com.ss.android.ugc.aweme.account.util.w$a */
    public interface C22350a {
        /* renamed from: a */
        void mo58224a(long j);
    }

    /* renamed from: a */
    public final void mo58762a() {
        this.f59616e.removeMessages(BaseNotice.HASHTAG);
    }

    /* renamed from: b */
    public final void mo58765b() {
        mo58762a();
        this.f59613b = 0;
        if (this.f59614c != null) {
            this.f59614c.mo58224a(this.f59613b);
        }
    }

    /* renamed from: c */
    private void m73997c() {
        this.f59613b = this.f59615d - ((System.currentTimeMillis() - this.f59612a) / 1000);
        if (this.f59613b <= 0) {
            this.f59613b = 0;
        } else {
            this.f59616e.sendEmptyMessageDelayed(BaseNotice.HASHTAG, 1000);
        }
        if (this.f59614c != null) {
            this.f59614c.mo58224a(this.f59613b);
        }
    }

    /* renamed from: b */
    public final void mo58767b(Bundle bundle) {
        this.f59612a = bundle.getLong("ticker_start_time", 0);
        this.f59615d = bundle.getLong("ticker_duration", 0);
        if (bundle.getBoolean("ticker_is_running", false)) {
            m73997c();
        }
    }

    public final void handleMsg(Message message) {
        this.f59613b--;
        if (this.f59613b <= 0) {
            this.f59613b = 0;
        } else {
            this.f59616e.sendEmptyMessageDelayed(BaseNotice.HASHTAG, 1000);
        }
        if (this.f59614c != null) {
            this.f59614c.mo58224a(this.f59613b);
        }
    }

    /* renamed from: a */
    public final void mo58764a(Bundle bundle) {
        bundle.putLong("ticker_start_time", this.f59612a);
        bundle.putLong("ticker_duration", this.f59615d);
        if (this.f59616e.hasMessages(BaseNotice.HASHTAG)) {
            bundle.putBoolean("ticker_is_running", true);
            mo58762a();
        }
    }

    /* renamed from: b */
    public final void mo58766b(long j, int i, C22350a aVar) {
        mo58762a();
        this.f59612a = j;
        this.f59615d = (long) i;
        this.f59614c = aVar;
        m73997c();
    }

    public C22349w(long j, int i, C22350a aVar) {
        this.f59612a = j;
        this.f59615d = (long) i;
        this.f59614c = aVar;
    }

    /* renamed from: a */
    public final void mo58763a(long j, int i, C22350a aVar) {
        this.f59613b = 60 - ((System.currentTimeMillis() - j) / 1000);
        if (this.f59613b <= 0) {
            this.f59613b = 0;
        } else {
            this.f59616e.sendEmptyMessageDelayed(BaseNotice.HASHTAG, 1000);
        }
        if (aVar != null) {
            aVar.mo58224a(this.f59613b);
        }
    }
}
