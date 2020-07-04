package com.p280ss.android.message.push.connection.p887a;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* renamed from: com.ss.android.message.push.connection.a.j */
public final class C19884j extends DataOutputStream {

    /* renamed from: a */
    private C19885a f53943a;

    /* renamed from: com.ss.android.message.push.connection.a.j$a */
    static class C19885a extends ByteArrayOutputStream {
        /* renamed from: a */
        public final byte[] mo53284a() {
            return this.buf;
        }

        /* renamed from: b */
        public final int mo53285b() {
            return this.count;
        }
    }

    /* renamed from: a */
    public final byte[] mo53282a() {
        return this.f53943a.mo53284a();
    }

    /* renamed from: b */
    public final int mo53283b() {
        return this.f53943a.mo53285b();
    }

    public C19884j() {
        this(new C19885a());
    }

    private C19884j(C19885a aVar) {
        super(aVar);
        this.f53943a = aVar;
    }
}
