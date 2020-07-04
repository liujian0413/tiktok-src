package com.p280ss.android.ugc.aweme.app.api.p1024c;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.squareup.wire.Message;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.app.api.c.d */
public class C22823d<P extends Message, J> implements C22824e, C6866d {

    /* renamed from: a */
    final J f60540a;

    /* renamed from: b */
    final P f60541b;
    @C6593c(mo15949a = "rid")

    /* renamed from: c */
    String f60542c;

    /* renamed from: d */
    private transient Long f60543d;

    public String getRequestId() {
        return this.f60542c;
    }

    public void setNetworkInfoKey(Long l) {
        this.f60543d = l;
    }

    public void setRequestId(String str) {
        this.f60542c = str;
    }

    /* renamed from: a */
    static <T extends Message> C22823d m75257a(T t) {
        return new C22823d(null, t);
    }

    /* renamed from: a */
    static C22823d m75258a(Object obj) {
        return new C22823d(obj, null);
    }

    /* renamed from: a */
    public final J mo59836a(C7327h<P, J> hVar) throws Exception {
        J j = this.f60540a;
        if (j == null) {
            j = hVar.apply(this.f60541b);
        }
        if (j instanceof C6866d) {
            ((C6866d) j).setRequestId(this.f60542c);
        }
        if (j instanceof C22824e) {
            ((C22824e) j).setNetworkInfoKey(this.f60543d);
        }
        return j;
    }

    private C22823d(J j, P p) {
        if (j == null && p == null) {
            throw new IllegalArgumentException("wrong args");
        }
        this.f60540a = j;
        this.f60541b = p;
    }
}
