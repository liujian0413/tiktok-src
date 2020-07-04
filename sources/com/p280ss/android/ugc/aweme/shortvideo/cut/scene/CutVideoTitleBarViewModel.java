package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44404c;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel */
public final class CutVideoTitleBarViewModel extends BaseJediViewModel<CutVideoTitleBarState> {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel$a */
    static final class C38882a extends Lambda implements C7562b<CutVideoTitleBarState, CutVideoTitleBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100985a;

        C38882a(boolean z) {
            this.f100985a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoTitleBarState invoke(CutVideoTitleBarState cutVideoTitleBarState) {
            C7573i.m23587b(cutVideoTitleBarState, "$receiver");
            return CutVideoTitleBarState.copy$default(cutVideoTitleBarState, null, null, null, null, new C44404c(this.f100985a), 15, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel$b */
    static final class C38883b extends Lambda implements C7562b<CutVideoTitleBarState, CutVideoTitleBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100986a;

        C38883b(boolean z) {
            this.f100986a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoTitleBarState invoke(CutVideoTitleBarState cutVideoTitleBarState) {
            C7573i.m23587b(cutVideoTitleBarState, "$receiver");
            return CutVideoTitleBarState.copy$default(cutVideoTitleBarState, null, null, Boolean.valueOf(this.f100986a), null, null, 27, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel$c */
    static final class C38884c extends Lambda implements C7562b<CutVideoTitleBarState, CutVideoTitleBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100987a;

        C38884c(boolean z) {
            this.f100987a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoTitleBarState invoke(CutVideoTitleBarState cutVideoTitleBarState) {
            C7573i.m23587b(cutVideoTitleBarState, "$receiver");
            return CutVideoTitleBarState.copy$default(cutVideoTitleBarState, Boolean.valueOf(this.f100987a), null, null, null, null, 30, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel$d */
    static final class C38885d extends Lambda implements C7562b<CutVideoTitleBarState, CutVideoTitleBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100988a;

        C38885d(boolean z) {
            this.f100988a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoTitleBarState invoke(CutVideoTitleBarState cutVideoTitleBarState) {
            C7573i.m23587b(cutVideoTitleBarState, "$receiver");
            return CutVideoTitleBarState.copy$default(cutVideoTitleBarState, null, null, null, Boolean.valueOf(this.f100988a), null, 23, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel$e */
    static final class C38886e extends Lambda implements C7562b<CutVideoTitleBarState, CutVideoTitleBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100989a;

        C38886e(boolean z) {
            this.f100989a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoTitleBarState invoke(CutVideoTitleBarState cutVideoTitleBarState) {
            C7573i.m23587b(cutVideoTitleBarState, "$receiver");
            return CutVideoTitleBarState.copy$default(cutVideoTitleBarState, null, Boolean.valueOf(this.f100989a), null, null, null, 29, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m124134f();
    }

    /* renamed from: f */
    private static CutVideoTitleBarState m124134f() {
        CutVideoTitleBarState cutVideoTitleBarState = new CutVideoTitleBarState(null, null, null, null, null, 31, null);
        return cutVideoTitleBarState;
    }

    /* renamed from: a */
    public final void mo97149a(boolean z) {
        mo29038c(new C38884c(z));
    }

    /* renamed from: b */
    public final void mo97150b(boolean z) {
        mo29038c(new C38886e(z));
    }

    /* renamed from: c */
    public final void mo97151c(boolean z) {
        mo29038c(new C38883b(z));
    }

    /* renamed from: d */
    public final void mo97152d(boolean z) {
        mo29038c(new C38885d(z));
    }

    /* renamed from: e */
    public final void mo97153e(boolean z) {
        mo29038c(new C38882a(z));
    }
}
