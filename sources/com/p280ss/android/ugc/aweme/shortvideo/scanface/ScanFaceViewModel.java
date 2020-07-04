package com.p280ss.android.ugc.aweme.shortvideo.scanface;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.util.Pair;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.scanface.ScanFaceViewModel */
public final class ScanFaceViewModel extends C0063u {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f104711a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ScanFaceViewModel.class), "scanResult", "getScanResult()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: b */
    private final C7541d f104712b = C7546e.m23569a(C40321a.f104713a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.scanface.ScanFaceViewModel$a */
    static final class C40321a extends Lambda implements C7561a<C0052o<Pair<Integer, String>>> {

        /* renamed from: a */
        public static final C40321a f104713a = new C40321a();

        C40321a() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Pair<Integer, String>> m128782a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m128782a();
        }
    }

    /* renamed from: a */
    public final C0052o<Pair<Integer, String>> mo100143a() {
        return (C0052o) this.f104712b.getValue();
    }
}
