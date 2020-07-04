package com.bytedance.p263im.core.internal.queue;

import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.internal.utils.C11433k;
import com.bytedance.p263im.core.p586b.C11208c;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.Response;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.queue.a */
public class C11379a {

    /* renamed from: a */
    private static C11379a f30830a;

    /* renamed from: b */
    private C11387b f30831b = new C11393g();

    /* renamed from: c */
    private C11387b f30832c = new C11388c();

    /* renamed from: b */
    public final void mo27404b() {
        this.f30831b.mo27415a();
        this.f30832c.mo27415a();
    }

    private C11379a() {
    }

    /* renamed from: a */
    public static C11379a m33470a() {
        if (f30830a == null) {
            synchronized (C11379a.class) {
                if (f30830a == null) {
                    f30830a = new C11379a();
                }
            }
        }
        return f30830a;
    }

    /* renamed from: a */
    public final void mo27401a(C11433k kVar) {
        this.f30831b.mo27417a(kVar);
        this.f30832c.mo27417a(kVar);
    }

    /* renamed from: a */
    public final void mo27400a(C11391e eVar) {
        if (eVar.mo27428d() == IMCMD.SEND_MESSAGE.getValue()) {
            this.f30831b.mo27416a(eVar);
        } else {
            this.f30832c.mo27416a(eVar);
        }
    }

    /* renamed from: a */
    public final void mo27403a(List<Long> list) {
        this.f30831b.mo27419a(list);
        this.f30832c.mo27419a(list);
    }

    /* renamed from: a */
    public final void mo27402a(String str, byte[] bArr) {
        Response response;
        try {
            response = C11392f.m33537a(str, bArr);
        } catch (CoderException e) {
            C11404d.m33585a("readFromQueue", (Throwable) e);
            C11209d.m32826a("im_pbdecode_error", "decode", 1.0f);
            C11208c.m32815a().mo27256a("network").mo27258b("ws").mo27257a("error", e).mo27257a("error_stack", C11209d.m32831b(e)).mo27260b();
            response = null;
        }
        if (response != null) {
            if (response.cmd.intValue() == IMCMD.SEND_MESSAGE.getValue()) {
                this.f30831b.mo27418a(response);
            } else {
                this.f30832c.mo27418a(response);
            }
        }
    }
}
