package com.bytedance.android.livesdk.message.p408b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.message.model.C8680m;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IInterceptor;
import java.util.ArrayList;
import java.util.List;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.message.b.f */
public final class C8465f implements IInterceptor {

    /* renamed from: a */
    public final Handler f23168a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final List<C8538c> f23169b = new ArrayList();

    /* renamed from: c */
    public boolean f23170c;

    /* renamed from: a */
    public final void mo21640a() {
        this.f23170c = true;
    }

    public C8465f() {
        this.f23168a.postDelayed(new Runnable() {
            public final void run() {
                if (!C8465f.this.f23169b.isEmpty()) {
                    C8465f.m25727a(new ArrayList(C8465f.this.f23169b));
                    C8465f.this.f23169b.clear();
                }
                if (!C8465f.this.f23170c) {
                    C8465f.this.f23168a.postDelayed(this, 3000);
                }
            }
        }, 3000);
    }

    /* renamed from: a */
    public static void m25727a(List<C8538c> list) {
        C7492s.m23282a((C7495v<T>) new C8467g<T>(list)).mo19304b(C7333a.m23044b()).mo19333l();
    }

    public final boolean onMessage(IMessage iMessage) {
        if (((Boolean) LiveConfigSettingKeys.LIVE_MSG_TYPE_ALOG_ENABLE.mo10240a()).booleanValue() && (iMessage instanceof C8538c) && !(iMessage instanceof C8680m)) {
            C8538c cVar = (C8538c) iMessage;
            if (!cVar.isLocalInsertMsg) {
                this.f23169b.add(cVar);
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bytedance.android.livesdk.message.model.c>, for r4v0, types: [java.util.List, java.util.List<com.bytedance.android.livesdk.message.model.c>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void m25728a(java.util.List<com.bytedance.android.livesdk.message.model.C8538c> r4, p346io.reactivex.C47870u r5) throws java.lang.Exception {
        /*
            java.util.Iterator r4 = r4.iterator()
        L_0x0004:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0046
            java.lang.Object r5 = r4.next()
            com.bytedance.android.livesdk.message.model.c r5 = (com.bytedance.android.livesdk.message.model.C8538c) r5
            if (r5 == 0) goto L_0x0004
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "msg_id"
            long r2 = r5.getMessageId()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r1, r2)
            java.lang.String r1 = "msg_type"
            java.lang.Class r2 = r5.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r0.put(r1, r2)
            java.lang.String r1 = "msg_time"
            long r2 = r5.timestamp
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            r0.put(r1, r5)
            com.bytedance.android.livesdk.log.d r5 = com.bytedance.android.livesdk.log.C8444d.m25673b()
            java.lang.String r1 = "ttlive_msgtype"
            r5.mo9999a(r1, r0)
            goto L_0x0004
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.message.p408b.C8465f.m25728a(java.util.List, io.reactivex.u):void");
    }
}
