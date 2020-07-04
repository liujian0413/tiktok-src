package com.p280ss.android.ugc.aweme.homepage.api.interaction;

import android.arch.lifecycle.C0052o;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.b */
public final class C30249b extends C0052o<Integer> {

    /* renamed from: a */
    public boolean f79607a;

    /* renamed from: b */
    public C30251c f79608b = new C30250a();

    /* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.b$a */
    public static final class C30250a implements C30251c {
        C30250a() {
        }

        /* renamed from: a */
        public final int mo67727a() {
            return 0;
        }

        /* renamed from: a */
        public final void mo67728a(int i) {
        }

        /* renamed from: a */
        public final void mo67729a(int i, boolean z) {
        }
    }

    /* renamed from: a */
    public final Integer getValue() {
        return Integer.valueOf(this.f79608b.mo67727a());
    }

    public final /* synthetic */ void setValue(Object obj) {
        mo79749a(((Number) obj).intValue());
    }

    /* renamed from: a */
    public final void mo79749a(int i) {
        this.f79608b.mo67728a(i);
        super.setValue(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo79752a(C30251c cVar) {
        C7573i.m23587b(cVar, "value");
        this.f79607a = true;
        this.f79608b = cVar;
    }

    /* renamed from: a */
    public final void mo79750a(int i, boolean z) {
        mo79751a(i, z, true);
    }

    /* renamed from: a */
    public final void mo79751a(int i, boolean z, boolean z2) {
        this.f79608b.mo67729a(i, z);
        if (z2) {
            super.setValue(Integer.valueOf(i));
        }
    }
}
