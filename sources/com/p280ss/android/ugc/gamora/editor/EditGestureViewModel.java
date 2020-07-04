package com.p280ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0052o;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.gamora.jedi.C44410f;
import com.p280ss.android.ugc.gamora.jedi.C44411g;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.gamora.editor.EditGestureViewModel */
public final class EditGestureViewModel extends JediViewModel<EditGestureState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f113682c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditGestureViewModel.class), "curFilter", "getCurFilter()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: d */
    private final C7541d f113683d = C7546e.m23569a(C43885b.f113686a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditGestureViewModel$a */
    static final class C43884a extends Lambda implements C7562b<EditGestureState, EditGestureState> {

        /* renamed from: a */
        final /* synthetic */ float f113684a;

        /* renamed from: b */
        final /* synthetic */ long f113685b;

        C43884a(float f, long j) {
            this.f113684a = f;
            this.f113685b = j;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditGestureState invoke(EditGestureState editGestureState) {
            C7573i.m23587b(editGestureState, "$receiver");
            return EditGestureState.copy$default(editGestureState, null, new C44410f(new Pair(Float.valueOf(this.f113684a), Long.valueOf(this.f113685b))), null, 5, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditGestureViewModel$b */
    static final class C43885b extends Lambda implements C7561a<C0052o<C29296g>> {

        /* renamed from: a */
        public static final C43885b f113686a = new C43885b();

        C43885b() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<C29296g> m139012a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139012a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditGestureViewModel$c */
    static final class C43886c extends Lambda implements C7562b<EditGestureState, EditGestureState> {

        /* renamed from: a */
        final /* synthetic */ boolean f113687a;

        C43886c(boolean z) {
            this.f113687a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditGestureState invoke(EditGestureState editGestureState) {
            C7573i.m23587b(editGestureState, "$receiver");
            return EditGestureState.copy$default(editGestureState, Boolean.valueOf(this.f113687a), null, null, 6, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditGestureViewModel$d */
    static final class C43887d extends Lambda implements C7562b<EditGestureState, EditGestureState> {

        /* renamed from: a */
        final /* synthetic */ float f113688a;

        /* renamed from: b */
        final /* synthetic */ float f113689b;

        /* renamed from: c */
        final /* synthetic */ float f113690c;

        C43887d(float f, float f2, float f3) {
            this.f113688a = f;
            this.f113689b = f2;
            this.f113690c = f3;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditGestureState invoke(EditGestureState editGestureState) {
            C7573i.m23587b(editGestureState, "$receiver");
            return EditGestureState.copy$default(editGestureState, null, null, new C44411g(new Triple(Float.valueOf(this.f113688a), Float.valueOf(this.f113689b), Float.valueOf(this.f113690c))), 3, null);
        }
    }

    /* renamed from: f */
    public final C0052o<C29296g> mo29069f() {
        return (C0052o) this.f113683d.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m139005g();
    }

    /* renamed from: g */
    private static EditGestureState m139005g() {
        EditGestureState editGestureState = new EditGestureState(null, null, null, 7, null);
        return editGestureState;
    }

    /* renamed from: a */
    public final void mo106229a(boolean z) {
        mo29038c(new C43886c(z));
    }

    /* renamed from: a */
    public final void mo106228a(float f, long j) {
        mo29038c(new C43884a(f, 300));
    }

    /* renamed from: a */
    public final void mo106227a(float f, float f2, float f3) {
        mo29038c(new C43887d(f, f2, f3));
    }
}
