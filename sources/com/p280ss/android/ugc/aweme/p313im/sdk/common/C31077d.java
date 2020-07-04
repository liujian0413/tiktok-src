package com.p280ss.android.ugc.aweme.p313im.sdk.common;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.d */
public final class C31077d<T> extends C23084b<Integer> {

    /* renamed from: g */
    public static final C31078a f81561g = new C31078a(null);

    /* renamed from: b */
    public boolean f81562b;

    /* renamed from: c */
    public boolean f81563c;

    /* renamed from: d */
    public boolean f81564d;

    /* renamed from: e */
    public Throwable f81565e;

    /* renamed from: f */
    public final C23084b<List<T>> f81566f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.d$a */
    public static final class C31078a {
        private C31078a() {
        }

        public /* synthetic */ C31078a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.d$b */
    static final class C31079b<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ C31077d f81567a;

        /* renamed from: b */
        final /* synthetic */ C31071b f81568b;

        C31079b(C31077d dVar, C31071b bVar) {
            this.f81567a = dVar;
            this.f81568b = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null && num.intValue() == 1) {
                this.f81568b.mo81560a();
            } else if (num != null && num.intValue() == 3) {
                this.f81568b.mo81562a((List) this.f81567a.f81566f.getValue(), this.f81567a.f81562b);
            } else {
                if (num != null && num.intValue() == 2) {
                    this.f81568b.mo81561a(this.f81567a.f81565e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo81564a(Throwable th) {
        this.f81565e = th;
        mo81565a(false);
        setValue(Integer.valueOf(2));
    }

    /* renamed from: b */
    public final void mo81566b(boolean z) {
        this.f81564d = true;
        mo81565a(false);
        setValue(Integer.valueOf(3));
    }

    public C31077d(C23084b<List<T>> bVar) {
        C7573i.m23587b(bVar, "data");
        this.f81566f = bVar;
        setValue(Integer.valueOf(0));
    }

    /* renamed from: a */
    public final void mo81565a(boolean z) {
        this.f81563c = z;
        if (z) {
            setValue(Integer.valueOf(1));
        }
    }

    /* renamed from: a */
    public final void mo81563a(C0043i iVar, C31071b<T> bVar) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(bVar, "listListener");
        observe(iVar, new C31079b(this, bVar));
    }
}
