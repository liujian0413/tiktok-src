package com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel */
public final class VEVideoCutterViewModel extends C0063u {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f102015a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(VEVideoCutterViewModel.class), "videoPlayerControlLiveData", "getVideoPlayerControlLiveData()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: b */
    private final C7541d f102016b = C7546e.m23569a(C39292a.f102017a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel$a */
    static final class C39292a extends Lambda implements C7561a<C0052o<C39293a>> {

        /* renamed from: a */
        public static final C39292a f102017a = new C39292a();

        C39292a() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<C39293a> m125561a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m125561a();
        }
    }

    /* renamed from: a */
    public final C0052o<C39293a> mo97801a() {
        return (C0052o) this.f102016b.getValue();
    }

    /* renamed from: a */
    public final void mo97802a(C39293a aVar) {
        C7573i.m23587b(aVar, "value");
        mo97801a().setValue(aVar);
    }
}
