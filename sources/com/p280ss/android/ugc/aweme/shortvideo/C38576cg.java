package com.p280ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cg */
public final class C38576cg {

    /* renamed from: a */
    public int f100214a;

    /* renamed from: b */
    public Activity f100215b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cg$a */
    static final class C38577a extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C38577a f100216a = new C38577a();

        C38577a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cg$b */
    static final class C38578b implements OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ C38576cg f100217a;

        /* renamed from: b */
        final /* synthetic */ C7561a f100218b;

        /* renamed from: c */
        final /* synthetic */ C7562b f100219c;

        C38578b(C38576cg cgVar, C7561a aVar, C7562b bVar) {
            this.f100217a = cgVar;
            this.f100218b = aVar;
            this.f100219c = bVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (C39805en.m127451d(this.f100217a.f100215b) != this.f100217a.f100214a && ((Boolean) this.f100218b.invoke()).booleanValue()) {
                this.f100217a.f100214a = C39805en.m127451d(this.f100217a.f100215b);
                this.f100219c.invoke(Integer.valueOf(this.f100217a.f100214a));
            }
        }
    }

    /* renamed from: a */
    public final void mo96555a(C7562b<? super Integer, C7581n> bVar) {
        mo96554a(C38577a.f100216a, bVar);
    }

    public C38576cg(Activity activity) {
        C7573i.m23587b(activity, "context");
        this.f100215b = activity;
        this.f100214a = C39805en.m127451d(this.f100215b);
    }

    public C38576cg(Activity activity, int i) {
        C7573i.m23587b(activity, "context");
        this.f100215b = activity;
        this.f100214a = i;
    }

    /* renamed from: a */
    public final void mo96554a(C7561a<Boolean> aVar, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(aVar, "condition");
        C7573i.m23587b(bVar, "function");
        this.f100215b.findViewById(16908290).addOnLayoutChangeListener(new C38578b(this, aVar, bVar));
    }
}
