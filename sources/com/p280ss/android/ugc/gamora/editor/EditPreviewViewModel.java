package com.p280ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0052o;
import android.graphics.Bitmap;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44404c;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel */
public final class EditPreviewViewModel extends JediViewModel<EditPreviewState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f113722c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditPreviewViewModel.class), "editFirstFrameDone", "getEditFirstFrameDone()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditPreviewViewModel.class), "firstFrameVisible", "getFirstFrameVisible()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditPreviewViewModel.class), "firstFrameBitmap", "getFirstFrameBitmap()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditPreviewViewModel.class), "editPrepareDonePersist", "getEditPrepareDonePersist()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditPreviewViewModel.class), "lightDetectionDone", "getLightDetectionDone()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: d */
    private final C7541d f113723d = C7546e.m23569a(C43910a.f113728a);

    /* renamed from: e */
    private final C7541d f113724e = C7546e.m23569a(C43913d.f113731a);

    /* renamed from: f */
    private final C7541d f113725f = C7546e.m23569a(C43912c.f113730a);

    /* renamed from: g */
    private final C7541d f113726g = C7546e.m23569a(C43911b.f113729a);

    /* renamed from: h */
    private final C7541d f113727h = C7546e.m23569a(C43914e.f113732a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel$a */
    static final class C43910a extends Lambda implements C7561a<C0052o<Void>> {

        /* renamed from: a */
        public static final C43910a f113728a = new C43910a();

        C43910a() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Void> m139080a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139080a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel$b */
    static final class C43911b extends Lambda implements C7561a<C0052o<Void>> {

        /* renamed from: a */
        public static final C43911b f113729a = new C43911b();

        C43911b() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Void> m139081a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139081a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel$c */
    static final class C43912c extends Lambda implements C7561a<C0052o<Bitmap>> {

        /* renamed from: a */
        public static final C43912c f113730a = new C43912c();

        C43912c() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Bitmap> m139082a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139082a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel$d */
    static final class C43913d extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C43913d f113731a = new C43913d();

        C43913d() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Boolean> m139083a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139083a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel$e */
    static final class C43914e extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C43914e f113732a = new C43914e();

        C43914e() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Boolean> m139084a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139084a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel$f */
    static final class C43915f extends Lambda implements C7562b<EditPreviewState, EditPreviewState> {

        /* renamed from: a */
        public static final C43915f f113733a = new C43915f();

        C43915f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m139085a((EditPreviewState) obj);
        }

        /* renamed from: a */
        private static EditPreviewState m139085a(EditPreviewState editPreviewState) {
            C7573i.m23587b(editPreviewState, "$receiver");
            return EditPreviewState.copy$default(editPreviewState, new C44412h(), null, null, 6, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel$g */
    static final class C43916g extends Lambda implements C7562b<EditPreviewState, EditPreviewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f113734a;

        C43916g(boolean z) {
            this.f113734a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditPreviewState invoke(EditPreviewState editPreviewState) {
            C7573i.m23587b(editPreviewState, "$receiver");
            return EditPreviewState.copy$default(editPreviewState, null, null, new C44404c(this.f113734a), 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel$h */
    static final class C43917h extends Lambda implements C7562b<EditPreviewState, EditPreviewState> {

        /* renamed from: a */
        final /* synthetic */ int f113735a;

        C43917h(int i) {
            this.f113735a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditPreviewState invoke(EditPreviewState editPreviewState) {
            C7573i.m23587b(editPreviewState, "$receiver");
            return EditPreviewState.copy$default(editPreviewState, null, Integer.valueOf(this.f113735a), null, 5, null);
        }
    }

    /* renamed from: g */
    public final C0052o<Void> mo106322g() {
        return (C0052o) this.f113723d.getValue();
    }

    /* renamed from: h */
    public final C0052o<Boolean> mo106323h() {
        return (C0052o) this.f113724e.getValue();
    }

    /* renamed from: i */
    public final C0052o<Bitmap> mo106324i() {
        return (C0052o) this.f113725f.getValue();
    }

    /* renamed from: j */
    public final C0052o<Void> mo106325j() {
        return (C0052o) this.f113726g.getValue();
    }

    /* renamed from: k */
    public final C0052o<Boolean> mo106326k() {
        return (C0052o) this.f113727h.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m139070l();
    }

    /* renamed from: f */
    public final void mo29069f() {
        mo29038c(C43915f.f113733a);
    }

    /* renamed from: l */
    private static EditPreviewState m139070l() {
        EditPreviewState editPreviewState = new EditPreviewState(null, null, null, 7, null);
        return editPreviewState;
    }

    /* renamed from: a */
    public final void mo106320a(int i) {
        mo29038c(new C43917h(i));
    }

    /* renamed from: a */
    public final void mo106321a(boolean z) {
        mo29038c(new C43916g(z));
    }
}
