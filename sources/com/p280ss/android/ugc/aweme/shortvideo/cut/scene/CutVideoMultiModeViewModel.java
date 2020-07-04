package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44404c;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel */
public final class CutVideoMultiModeViewModel extends BaseJediViewModel<CutVideoMultiModeState> {

    /* renamed from: c */
    public int f100958c;

    /* renamed from: d */
    public C39053bm f100959d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel$a */
    static final class C38864a extends Lambda implements C7562b<CutVideoMultiModeState, CutVideoMultiModeState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100960a;

        C38864a(boolean z) {
            this.f100960a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoMultiModeState invoke(CutVideoMultiModeState cutVideoMultiModeState) {
            C7573i.m23587b(cutVideoMultiModeState, "$receiver");
            return CutVideoMultiModeState.copy$default(cutVideoMultiModeState, null, null, new C44404c(this.f100960a), 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel$b */
    static final class C38865b extends Lambda implements C7562b<CutVideoMultiModeState, CutVideoMultiModeState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100961a;

        C38865b(boolean z) {
            this.f100961a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoMultiModeState invoke(CutVideoMultiModeState cutVideoMultiModeState) {
            C7573i.m23587b(cutVideoMultiModeState, "$receiver");
            return CutVideoMultiModeState.copy$default(cutVideoMultiModeState, null, new C44404c(this.f100961a), null, 5, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m124082g();
    }

    /* renamed from: f */
    public final boolean mo29069f() {
        if (this.f100958c == 1) {
            return true;
        }
        return false;
    }

    public CutVideoMultiModeViewModel() {
        int i;
        if (C39182e.m125105i()) {
            i = 1;
        } else {
            i = 2;
        }
        this.f100958c = i;
    }

    /* renamed from: g */
    private static CutVideoMultiModeState m124082g() {
        CutVideoMultiModeState cutVideoMultiModeState = new CutVideoMultiModeState(null, null, null, 7, null);
        return cutVideoMultiModeState;
    }

    /* renamed from: a */
    public final void mo97071a(C39053bm bmVar) {
        C7573i.m23587b(bmVar, "<set-?>");
        this.f100959d = bmVar;
    }

    /* renamed from: a */
    public final void mo97072a(boolean z) {
        mo29038c(new C38865b(true));
    }

    /* renamed from: b */
    public final void mo97074b(boolean z) {
        mo29038c(new C38864a(true));
    }

    /* renamed from: a */
    public final void mo97070a(FragmentActivity fragmentActivity, boolean z) {
        C7573i.m23587b(fragmentActivity, "activity");
        C39053bm bmVar = this.f100959d;
        if (bmVar == null) {
            C7573i.m23583a("stickerPointController");
        }
        bmVar.mo97267a(z);
        C10761a.m31387a((Context) fragmentActivity, fragmentActivity.getResources().getString(R.string.e28)).mo25750a();
        JediViewModel a = C36113b.m116288a(fragmentActivity).mo91871a(CutVideoListViewModel.class);
        C7573i.m23582a((Object) a, "JediViewModelProviders.o…istViewModel::class.java)");
        ((CutVideoListViewModel) a).mo97052i(true);
        JediViewModel a2 = C36113b.m116288a(fragmentActivity).mo91871a(CutVideoEditViewModel.class);
        C7573i.m23582a((Object) a2, "JediViewModelProviders.o…ditViewModel::class.java)");
        CutVideoEditViewModel cutVideoEditViewModel = (CutVideoEditViewModel) a2;
        cutVideoEditViewModel.mo96982b(false);
        C39053bm bmVar2 = this.f100959d;
        if (bmVar2 == null) {
            C7573i.m23583a("stickerPointController");
        }
        bmVar2.mo97284o().mo97349a(false);
        cutVideoEditViewModel.mo96984g();
    }

    /* renamed from: b */
    public final void mo97073b(FragmentActivity fragmentActivity, boolean z) {
        C7573i.m23587b(fragmentActivity, "activity");
        C39053bm bmVar = this.f100959d;
        if (bmVar == null) {
            C7573i.m23583a("stickerPointController");
        }
        bmVar.mo97270b(z);
        JediViewModel a = C36113b.m116288a(fragmentActivity).mo91871a(CutVideoEditViewModel.class);
        C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
        CutVideoEditViewModel cutVideoEditViewModel = (CutVideoEditViewModel) a;
        cutVideoEditViewModel.mo96982b(true);
        if (z) {
            cutVideoEditViewModel.mo96984g();
        }
        JediViewModel a2 = C36113b.m116288a(fragmentActivity).mo91871a(CutVideoListViewModel.class);
        C7573i.m23582a((Object) a2, "JediViewModelProviders.o…istViewModel::class.java)");
        ((CutVideoListViewModel) a2).mo97052i(false);
        C39053bm bmVar2 = this.f100959d;
        if (bmVar2 == null) {
            C7573i.m23583a("stickerPointController");
        }
        bmVar2.mo97284o().mo97349a(true);
    }
}
