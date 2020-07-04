package com.p280ss.android.ugc.aweme.shortvideo.festival;

import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.p1288h.C30221c;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.e */
public final class C39871e {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f103608a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C39871e.class), "inFestival", "getInFestival()Z"))};

    /* renamed from: b */
    public final C30221c f103609b;

    /* renamed from: c */
    private final C7541d f103610c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.e$a */
    static final class C39872a extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C39871e f103611a;

        C39872a(C39871e eVar) {
            this.f103611a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m127608a());
        }

        /* renamed from: a */
        private boolean m127608a() {
            if (this.f103611a.f103609b == null || !this.f103611a.f103609b.f79514d || C43122ff.m136767b()) {
                return false;
            }
            return true;
        }
    }

    public C39871e() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public final boolean mo99297a() {
        return ((Boolean) this.f103610c.getValue()).booleanValue();
    }

    private C39871e(C30221c cVar) {
        this.f103609b = cVar;
        this.f103610c = C7546e.m23569a(new C39872a(this));
    }

    public /* synthetic */ C39871e(C30221c cVar, int i, C7571f fVar) {
        this(C29132a.m95572g());
    }
}
