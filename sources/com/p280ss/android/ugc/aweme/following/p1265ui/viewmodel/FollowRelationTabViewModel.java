package com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel */
public final class FollowRelationTabViewModel extends JediViewModel<FollowRelationState> {

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel$a */
    static final class C29822a extends Lambda implements C7562b<FollowRelationState, FollowRelationState> {

        /* renamed from: a */
        final /* synthetic */ int f78383a;

        C29822a(int i) {
            this.f78383a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FollowRelationState invoke(FollowRelationState followRelationState) {
            C7573i.m23587b(followRelationState, "$receiver");
            return FollowRelationState.copy$default(followRelationState, false, this.f78383a, 0, false, 13, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel$b */
    static final class C29823b extends Lambda implements C7562b<FollowRelationState, FollowRelationState> {

        /* renamed from: a */
        final /* synthetic */ int f78384a;

        C29823b(int i) {
            this.f78384a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FollowRelationState invoke(FollowRelationState followRelationState) {
            C7573i.m23587b(followRelationState, "$receiver");
            return FollowRelationState.copy$default(followRelationState, false, 0, this.f78384a, false, 11, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel$c */
    static final class C29824c extends Lambda implements C7562b<FollowRelationState, FollowRelationState> {

        /* renamed from: a */
        final /* synthetic */ boolean f78385a;

        C29824c(boolean z) {
            this.f78385a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FollowRelationState invoke(FollowRelationState followRelationState) {
            C7573i.m23587b(followRelationState, "$receiver");
            return FollowRelationState.copy$default(followRelationState, false, 0, 0, this.f78385a, 7, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel$d */
    static final class C29825d extends Lambda implements C7562b<FollowRelationState, FollowRelationState> {

        /* renamed from: a */
        final /* synthetic */ boolean f78386a;

        C29825d(boolean z) {
            this.f78386a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FollowRelationState invoke(FollowRelationState followRelationState) {
            C7573i.m23587b(followRelationState, "$receiver");
            return FollowRelationState.copy$default(followRelationState, this.f78386a, 0, 0, false, 14, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m97581f();
    }

    /* renamed from: f */
    private static FollowRelationState m97581f() {
        FollowRelationState followRelationState = new FollowRelationState(false, 0, 0, false, 15, null);
        return followRelationState;
    }

    /* renamed from: a */
    public final void mo75795a(int i) {
        mo29038c(new C29822a(i));
    }

    /* renamed from: b */
    public final void mo75797b(int i) {
        mo29038c(new C29823b(i));
    }

    /* renamed from: a */
    public final void mo75796a(boolean z) {
        mo29038c(new C29825d(z));
    }

    /* renamed from: b */
    public final void mo75798b(boolean z) {
        mo29038c(new C29824c(z));
    }
}
