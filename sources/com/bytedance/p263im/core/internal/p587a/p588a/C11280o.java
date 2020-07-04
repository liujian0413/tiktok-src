package com.bytedance.p263im.core.internal.p587a.p588a;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.bytedance.p263im.core.internal.queue.C11379a;
import com.bytedance.p263im.core.internal.queue.C11390d;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11432j;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p584a.C11202d.C11204b;
import com.bytedance.p263im.core.p584a.p585a.C11194a;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.p584a.p585a.C11196c;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.Refer;
import com.bytedance.p263im.core.proto.Request;
import com.bytedance.p263im.core.proto.Request.Builder;
import com.bytedance.p263im.core.proto.RequestBody;
import com.bytedance.p263im.core.proto.SendMessageRequestBody;
import com.p280ss.android.ugc.aweme.feed.monitor.C28539a;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: com.bytedance.im.core.internal.a.a.o */
public abstract class C11280o<T> {

    /* renamed from: a */
    private C11195b<T> f30582a;

    /* renamed from: c */
    protected int f30583c;

    /* renamed from: com.bytedance.im.core.internal.a.a.o$a */
    public static class C11282a {

        /* renamed from: a */
        private static C11282a f30586a;

        /* renamed from: b */
        private long f30587b;

        private C11282a() {
            m33052c();
        }

        /* renamed from: a */
        public static C11282a m33051a() {
            if (f30586a == null) {
                synchronized (C11282a.class) {
                    if (f30586a == null) {
                        f30586a = new C11282a();
                    }
                }
            }
            return f30586a;
        }

        /* renamed from: c */
        private void m33052c() {
            if (this.f30587b == 0) {
                this.f30587b = (long) new Random().nextInt(C28539a.f75176k);
            }
        }

        /* renamed from: b */
        public final synchronized long mo27308b() {
            long j;
            if (this.f30587b <= 0) {
                this.f30587b = 1;
            }
            j = this.f30587b;
            this.f30587b = 1 + j;
            return j;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27263a(C11391e eVar, Runnable runnable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo27278a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo27265a(C11391e eVar);

    public C11280o(int i) {
        this.f30583c = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo27305b(C11391e eVar) {
        if (this.f30582a != null) {
            this.f30582a.mo18088a(C11438g.m33713a(eVar));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27302a(T t) {
        if (this.f30582a != null) {
            this.f30582a.mo18089a(t);
        }
    }

    /* renamed from: c */
    public final void mo27306c(final C11391e eVar) {
        SendMessageRequestBody sendMessageRequestBody;
        C11432j.m33706a();
        if (!eVar.mo27431g()) {
            if (eVar.f30860i == C11204b.f30384b || eVar.f30860i == C11204b.f30385c) {
                C11198c.m32777a().f30372b.mo27231a(eVar.f30860i);
            } else if (eVar.f30860i == C11204b.f30386d && this.f30583c == IMCMD.SEND_MESSAGE.getValue()) {
                if (eVar.f30857f.body != null) {
                    sendMessageRequestBody = eVar.f30857f.body.send_message_body;
                } else {
                    sendMessageRequestBody = null;
                }
                if (sendMessageRequestBody != null) {
                    C11283p.m33057a();
                    C11283p.m33081b(sendMessageRequestBody.conversation_id);
                }
            }
        }
        mo27263a(eVar, (Runnable) new Runnable() {
            public final void run() {
                if (eVar.f30855d != null) {
                    if (!eVar.mo27431g() || !C11280o.this.mo27265a(eVar)) {
                        eVar.f30855d.mo18275b(eVar);
                    } else {
                        eVar.f30855d.mo18274a(eVar);
                    }
                }
            }
        });
    }

    public C11280o(int i, C11195b<T> bVar) {
        this.f30583c = i;
        if (bVar != null) {
            this.f30582a = bVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27304a(T t, C11391e eVar) {
        if (this.f30582a != null) {
            try {
                if (!(this.f30582a instanceof C11196c) || eVar == null) {
                    this.f30582a.mo18089a(t);
                    return;
                }
                ((C11196c) this.f30582a).mo18090a(t, C11438g.m33713a(eVar));
            } catch (Exception e) {
                C11209d.m32824a(e);
            }
        }
    }

    /* renamed from: a */
    private long m33040a(Request request, C11390d dVar, Object... objArr) {
        C11391e eVar = new C11391e(request.sequence_id.longValue(), this);
        eVar.f30857f = request;
        eVar.f30856e = objArr;
        eVar.f30854c = mo27278a();
        eVar.f30855d = dVar;
        eVar.f30861j = SystemClock.uptimeMillis();
        C11379a.m33470a().mo27400a(eVar);
        return eVar.f30852a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27303a(T t, long j, boolean z) {
        if (this.f30582a != null) {
            if (this.f30582a instanceof C11194a) {
                ((C11194a) this.f30582a).mo27242a(t, j, z);
                return;
            }
            this.f30582a.mo18089a(t);
        }
    }

    /* renamed from: a */
    private static Request m33041a(int i, int i2, RequestBody requestBody) {
        Map f = C11198c.m32777a().f30372b.mo27239f();
        if (f == null) {
            f = new HashMap();
        }
        if (C11198c.m32777a().mo27248b().f30391A) {
            f.put("expected_user_id", String.valueOf(C11198c.m32777a().f30372b.mo27230a()));
        }
        return new Builder().sequence_id(Long.valueOf(C11282a.m33051a().mo27308b())).sdk_version("4.0.6.0").token(C11198c.m32777a().f30372b.mo27235b()).refer(Refer.ANDROID).device_id(C11198c.m32777a().f30372b.mo27236c()).inbox_type(Integer.valueOf(i)).build_number("4060").channel(C11198c.m32777a().mo27248b().f30404d).device_platform("android").device_type(Build.MODEL).os_version(VERSION.RELEASE).version_code(String.valueOf(C11198c.m32777a().mo27248b().f30403c)).cmd(Integer.valueOf(i2)).body(requestBody).headers(f).build();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo27301a(int i, RequestBody requestBody, C11390d dVar, Object... objArr) {
        return m33040a(m33041a(i, this.f30583c, requestBody), dVar, objArr);
    }
}
