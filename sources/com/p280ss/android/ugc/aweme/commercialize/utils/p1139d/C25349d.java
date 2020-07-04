package com.p280ss.android.ugc.aweme.commercialize.utils.p1139d;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.d.d */
public final class C25349d {

    /* renamed from: a */
    private List<C25347c> f66747a = new ArrayList();

    /* renamed from: b */
    private int f66748b;

    /* renamed from: c */
    private C25350a f66749c = new C25350a(this);

    /* renamed from: d */
    private C25346b f66750d = C25345a.f66736a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.d.d$a */
    public static final class C25350a extends Handler {

        /* renamed from: c */
        public static final C25351a f66751c = new C25351a(null);

        /* renamed from: a */
        public long f66752a = 1000;

        /* renamed from: b */
        public final C25349d f66753b;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.d.d$a$a */
        public static final class C25351a {
            private C25351a() {
            }

            public /* synthetic */ C25351a(C7571f fVar) {
                this();
            }
        }

        /* renamed from: a */
        public final void mo65918a() {
            if (!hasMessages(1)) {
                sendEmptyMessage(1);
            }
        }

        /* renamed from: b */
        public final void mo65919b() {
            if (hasMessages(1)) {
                removeMessages(1);
            }
        }

        public C25350a(C25349d dVar) {
            C7573i.m23587b(dVar, "playTaskManager");
            this.f66753b = dVar;
        }

        public final void handleMessage(Message message) {
            Integer num;
            if (message != null) {
                num = Integer.valueOf(message.what);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1) {
                this.f66753b.mo65911a(this.f66753b.mo65917d());
                sendEmptyMessageDelayed(1, this.f66752a);
            }
        }
    }

    /* renamed from: d */
    public final long mo65917d() {
        return this.f66750d.mo65903a();
    }

    /* renamed from: a */
    public final void mo65910a() {
        this.f66747a.clear();
        this.f66749c.mo65919b();
        this.f66749c.f66752a = 1000;
    }

    /* renamed from: b */
    public final void mo65914b() {
        this.f66748b = 0;
        if (!this.f66747a.isEmpty()) {
            this.f66749c.mo65918a();
        }
    }

    /* renamed from: c */
    public final void mo65916c() {
        this.f66748b++;
        if (this.f66747a.isEmpty()) {
            this.f66749c.mo65919b();
        }
    }

    /* renamed from: a */
    public final void mo65912a(C25346b bVar) {
        C7573i.m23587b(bVar, "playTaskHelper");
        this.f66750d = bVar;
    }

    /* renamed from: b */
    public final void mo65915b(long j) {
        this.f66749c.f66752a = 350;
    }

    /* renamed from: a */
    public final void mo65913a(C25347c cVar) {
        C7573i.m23587b(cVar, "videoPlayTask");
        if (!this.f66747a.contains(cVar)) {
            this.f66747a.add(cVar);
        }
    }

    /* renamed from: a */
    public final void mo65911a(long j) {
        if (!this.f66747a.isEmpty()) {
            List arrayList = new ArrayList();
            for (C25347c cVar : this.f66747a) {
                if ((this.f66748b == cVar.f66737a && j >= ((long) cVar.f66738b)) || this.f66748b > cVar.f66737a) {
                    cVar.mo65904a();
                    if (!cVar.f66742f) {
                        arrayList.add(cVar);
                    } else {
                        cVar.f66737a++;
                    }
                }
            }
            this.f66747a.removeAll(arrayList);
        }
    }
}
