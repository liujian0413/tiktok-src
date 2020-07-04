package com.bytedance.p263im.core.internal.queue.p597a;

import com.bytedance.p263im.core.proto.Response;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;

/* renamed from: com.bytedance.im.core.internal.queue.a.c */
public final class C11384c {

    /* renamed from: a */
    public int f30838a;

    /* renamed from: b */
    public String f30839b;

    /* renamed from: c */
    public byte[] f30840c;

    /* renamed from: d */
    public Response f30841d;

    /* renamed from: com.bytedance.im.core.internal.queue.a.c$a */
    public static class C11386a {

        /* renamed from: a */
        public C11384c f30842a = new C11384c();

        /* renamed from: a */
        public final C11386a mo27412a(int i) {
            this.f30842a.f30838a = C34943c.f91127w;
            return this;
        }

        /* renamed from: a */
        public final C11386a mo27413a(Response response) {
            this.f30842a.f30841d = response;
            return this;
        }

        /* renamed from: a */
        public final C11386a mo27414a(String str) {
            this.f30842a.f30839b = str;
            return this;
        }
    }

    private C11384c() {
    }

    /* renamed from: a */
    public final boolean mo27411a() {
        if (this.f30838a < 200 || this.f30838a >= 300) {
            return false;
        }
        return true;
    }
}
