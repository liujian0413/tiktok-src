package com.p280ss.android.ugc.aweme.commercialize.utils.p1139d;

import com.p280ss.android.ugc.aweme.p331m.C7163a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.d.c */
public final class C25347c {

    /* renamed from: a */
    public int f66737a;

    /* renamed from: b */
    public int f66738b;

    /* renamed from: c */
    public long f66739c;

    /* renamed from: d */
    public final int f66740d;

    /* renamed from: e */
    public Runnable f66741e;

    /* renamed from: f */
    public boolean f66742f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.d.c$a */
    public static final class C25348a {

        /* renamed from: a */
        private long f66743a = 1;

        /* renamed from: b */
        private int f66744b;

        /* renamed from: c */
        private Runnable f66745c;

        /* renamed from: d */
        private boolean f66746d;

        /* renamed from: a */
        public final C25347c mo65909a() {
            long j = this.f66743a;
            int i = this.f66744b;
            Runnable runnable = this.f66745c;
            if (runnable == null) {
                C7573i.m23583a("callback");
            }
            C25347c cVar = new C25347c(j, i, runnable, this.f66746d, null);
            return cVar;
        }

        /* renamed from: a */
        public final C25348a mo65905a(int i) {
            C25348a aVar = this;
            aVar.f66744b = i;
            return aVar;
        }

        /* renamed from: a */
        public final C25348a mo65907a(Runnable runnable) {
            C7573i.m23587b(runnable, "callback");
            C25348a aVar = this;
            aVar.f66745c = runnable;
            return aVar;
        }

        /* renamed from: a */
        public final C25348a mo65908a(boolean z) {
            C25348a aVar = this;
            aVar.f66746d = z;
            return aVar;
        }

        /* renamed from: a */
        public final C25348a mo65906a(long j) {
            C25348a aVar = this;
            if (j > 0) {
                if (j <= 0) {
                    j = 1;
                }
                aVar.f66743a = j;
                return aVar;
            }
            StringBuilder sb = new StringBuilder("Invalid video duration ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo65904a() {
        try {
            Runnable runnable = this.f66741e;
            if (runnable != null) {
                runnable.run();
            }
            if (!this.f66742f) {
                this.f66741e = null;
            }
        } catch (Exception e) {
            if (C7163a.m22363a()) {
                throw e;
            }
        }
    }

    private C25347c(long j, int i, Runnable runnable, boolean z) {
        this.f66739c = j;
        this.f66740d = i;
        this.f66741e = runnable;
        this.f66742f = z;
        this.f66737a = (int) (((long) this.f66740d) / this.f66739c);
        this.f66738b = (int) (((long) this.f66740d) % this.f66739c);
    }

    public /* synthetic */ C25347c(long j, int i, Runnable runnable, boolean z, C7571f fVar) {
        this(j, i, runnable, z);
    }
}
