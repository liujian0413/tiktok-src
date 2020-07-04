package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.arch.lifecycle.C0052o;
import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.Pair;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiBottomViewModel */
public final class CutVideoMultiBottomViewModel extends BaseJediViewModel<CutVideoMultiBottomState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f100955c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CutVideoMultiBottomViewModel.class), "animationProgress", "getAnimationProgress()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: d */
    private final C7541d f100956d = C7546e.m23569a(C38863a.f100957a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiBottomViewModel$a */
    static final class C38863a extends Lambda implements C7561a<C0052o<Pair<? extends Boolean, ? extends Float>>> {

        /* renamed from: a */
        public static final C38863a f100957a = new C38863a();

        C38863a() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Pair<Boolean, Float>> m124081a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m124081a();
        }
    }

    /* renamed from: f */
    public final C0052o<Pair<Boolean, Float>> mo29069f() {
        return (C0052o) this.f100956d.getValue();
    }

    /* renamed from: g */
    private static CutVideoMultiBottomState m124078g() {
        return new CutVideoMultiBottomState(null, 1, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m124078g();
    }
}
