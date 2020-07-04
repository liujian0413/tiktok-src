package com.p280ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.metrics.C33248at;
import com.p280ss.android.ugc.aweme.metrics.C33248at.C33249a;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.g */
public final class C35447g {

    /* renamed from: a */
    public long f92955a = -1;

    /* renamed from: com.ss.android.ugc.aweme.poi.utils.g$a */
    static final class C35448a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f92956a;

        /* renamed from: b */
        final /* synthetic */ String f92957b;

        /* renamed from: c */
        final /* synthetic */ long f92958c;

        /* renamed from: d */
        final /* synthetic */ C33249a f92959d;

        C35448a(Context context, String str, long j, C33249a aVar) {
            this.f92956a = context;
            this.f92957b = str;
            this.f92958c = j;
            this.f92959d = aVar;
        }

        public final void run() {
            if (this.f92956a != null) {
                C6907h.m21517a(this.f92956a, "stay_time", this.f92957b, this.f92958c, 0);
            }
            if (this.f92959d != null) {
                new C33248at().mo85138a(String.valueOf(this.f92958c)).mo85139b(this.f92957b).mo85136a(this.f92959d).mo85252e();
            }
        }
    }

    /* renamed from: a */
    public final void mo90179a() {
        if (this.f92955a == -1) {
            this.f92955a = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo90180a(Context context, String str, C33249a aVar) {
        if (this.f92955a != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f92955a;
            if (currentTimeMillis > 0 && !TextUtils.isEmpty(str)) {
                C35448a aVar2 = new C35448a(context, str, currentTimeMillis, aVar);
                C6726a.m20842a(aVar2);
            }
            this.f92955a = -1;
        }
    }
}
