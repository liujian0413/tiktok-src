package com.p280ss.android.ugc.aweme.money.growth;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.money.growth.d */
public final class C33637d {

    /* renamed from: c */
    public static final C33638a f87787c = new C33638a(null);

    /* renamed from: a */
    public long f87788a;

    /* renamed from: b */
    public long f87789b;

    /* renamed from: d */
    private final Keva f87790d;

    /* renamed from: com.ss.android.ugc.aweme.money.growth.d$a */
    public static final class C33638a {
        private C33638a() {
        }

        public /* synthetic */ C33638a(C7571f fVar) {
            this();
        }
    }

    public C33637d() {
        Keva repo = Keva.getRepo("money_growth_read_task");
        C7573i.m23582a((Object) repo, "Keva.getRepo(REPO_NAME)");
        this.f87790d = repo;
        mo86020a(this.f87790d.getLong("today_timestamp", 0));
        mo86021b(this.f87790d.getLong("progress_time", 0));
    }

    /* renamed from: a */
    public final void mo86020a(long j) {
        this.f87788a = j;
        this.f87790d.storeLong("today_timestamp", j);
    }

    /* renamed from: b */
    public final void mo86021b(long j) {
        this.f87789b = j;
        this.f87790d.storeLong("progress_time", j);
    }
}
