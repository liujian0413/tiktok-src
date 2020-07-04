package com.bytedance.jedi.ext.adapter.decorator.internal;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.decorator.C11683b;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.bytedance.jedi.ext.adapter.decorator.internal.a */
public final class C11684a extends C11687b implements C11683b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f31402a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11684a.class), C38347c.f99553h, "getContent()Landroid/view/View;"))};

    /* renamed from: b */
    public final C7561a<C7581n> f31403b;

    /* renamed from: c */
    private final C7541d f31404c;

    /* renamed from: com.bytedance.jedi.ext.adapter.decorator.internal.a$a */
    static final class C11685a extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ C11684a f31405a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f31406b;

        /* renamed from: com.bytedance.jedi.ext.adapter.decorator.internal.a$a$a */
        static final class C11686a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C7561a f31407a;

            C11686a(C7561a aVar) {
                this.f31407a = aVar;
            }

            public final void onClick(View view) {
                this.f31407a.invoke();
            }
        }

        C11685a(C11684a aVar, ViewGroup viewGroup) {
            this.f31405a = aVar;
            this.f31406b = viewGroup;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            View a = C11688c.m34257a(this.f31406b, R.layout.j7, false);
            this.f31405a.mo29241a(a, R.id.cky, R.id.dq0, R.id.dq2);
            C7561a<C7581n> aVar = this.f31405a.f31403b;
            if (aVar != null) {
                this.f31405a.mo29240a((int) R.id.dq0, a).setOnClickListener(new C11686a(aVar));
            }
            return a;
        }
    }

    /* renamed from: c */
    private final View m34249c() {
        return (View) this.f31404c.getValue();
    }

    /* renamed from: a */
    public final View mo29235a() {
        return m34249c();
    }

    /* renamed from: a */
    public final void mo29236a(int i) {
        switch (i) {
            case 241:
                mo29242b();
                return;
            case 242:
                mo29243b(R.id.cky);
                return;
            case 243:
                mo29243b(R.id.dq2);
                break;
            case 244:
                mo29243b(R.id.dq0);
                return;
        }
    }

    public C11684a(ViewGroup viewGroup, C7561a<C7581n> aVar) {
        C7573i.m23587b(viewGroup, "parent");
        this.f31403b = aVar;
        this.f31404c = C7546e.m23569a(new C11685a(this, viewGroup));
    }
}
