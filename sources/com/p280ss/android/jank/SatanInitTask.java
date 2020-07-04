package com.p280ss.android.jank;

import android.app.Application;
import android.content.Context;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.ugc.aweme.p1817a.p1818a.p1819a.p1820a.C46177a;
import com.p280ss.ugc.aweme.p1817a.p1818a.p1819a.p1821b.C46178a;
import com.p280ss.ugc.aweme.p1817a.p1818a.p1819a.p1822c.C46179a;
import com.p280ss.ugc.aweme.p1817a.p1823b.C46180a;
import com.p280ss.ugc.aweme.p1817a.p1823b.C46180a.C46181a;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.jank.SatanInitTask */
public final class SatanInitTask implements LegoTask {
    static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SatanInitTask.class), "config", "getConfig()Lcom/ss/android/jank/SatanInitTask$Config;"))};
    public static final C19606a Companion = new C19606a(null);
    private final C7541d config$delegate = C7546e.m23569a(new C19608c(this));

    /* renamed from: com.ss.android.jank.SatanInitTask$a */
    public static final class C19606a {
        private C19606a() {
        }

        public /* synthetic */ C19606a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.jank.SatanInitTask$b */
    public final class C19607b implements C46177a {

        /* renamed from: a */
        public boolean f53046a = true;

        public C19607b() {
        }
    }

    /* renamed from: com.ss.android.jank.SatanInitTask$c */
    static final class C19608c extends Lambda implements C7561a<C19607b> {

        /* renamed from: a */
        final /* synthetic */ SatanInitTask f53048a;

        C19608c(SatanInitTask satanInitTask) {
            this.f53048a = satanInitTask;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C19607b invoke() {
            return new C19607b();
        }
    }

    /* renamed from: com.ss.android.jank.SatanInitTask$d */
    public static final class C19609d implements C46178a<Object> {
        C19609d() {
        }
    }

    public final C19607b getConfig() {
        return (C19607b) this.config$delegate.getValue();
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BACKGROUND;
    }

    public final void run(Context context) {
        C46181a.m145046a().mo112477a((C46177a) getConfig()).mo112478a((C46178a<?>) new C19609d<Object>()).mo112479a((C46179a) C19610a.f53049a);
        if (context != null) {
            C46180a.m145042a((Application) context);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
    }
}
