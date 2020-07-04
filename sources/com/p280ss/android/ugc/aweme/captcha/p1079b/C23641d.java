package com.p280ss.android.ugc.aweme.captcha.p1079b;

import com.alibaba.fastjson.JSON;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.captcha.p1078a.C23629b;
import com.p280ss.android.ugc.aweme.captcha.p1078a.C23630c;
import com.p280ss.android.ugc.aweme.captcha.p1078a.C23631d;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23644a;
import com.p280ss.android.ugc.aweme.common.C25652b;

/* renamed from: com.ss.android.ugc.aweme.captcha.b.d */
public final class C23641d extends C25652b<C23631d, C23638a> {
    public C23641d() {
        mo66536a(new C23631d());
    }

    /* renamed from: b */
    public final void mo56977b() {
        if (this.f67572c != null) {
            ((C23638a) this.f67572c).mo61545a((C23630c) ((C23631d) this.f67571b).getData());
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null) {
            ((C23638a) this.f67572c).mo61546a(exc);
        }
    }

    /* renamed from: a */
    public final void mo61549a(final String str) {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                try {
                    final C23629b bVar = (C23629b) JSON.parseObject(C23644a.m77545a(str), C23629b.class);
                    C6726a.m20844b(new Runnable() {
                        public final void run() {
                            if (C23641d.this.f67572c != null) {
                                ((C23638a) C23641d.this.f67572c).mo61544a(bVar);
                            }
                        }
                    });
                } catch (Exception e) {
                    if (C23641d.this.f67572c != null) {
                        ((C23638a) C23641d.this.f67572c).mo61546a(e);
                    }
                }
            }
        });
    }
}
