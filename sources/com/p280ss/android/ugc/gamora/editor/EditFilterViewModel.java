package com.p280ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0052o;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.filter.C29296g;
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

/* renamed from: com.ss.android.ugc.gamora.editor.EditFilterViewModel */
public final class EditFilterViewModel extends JediViewModel<EditFilterState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f113676c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditFilterViewModel.class), "curFilter", "getCurFilter()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditFilterViewModel.class), "cancelStatus", "getCancelStatus()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: d */
    private final C7541d f113677d = C7546e.m23569a(C43882b.f113680a);

    /* renamed from: e */
    private final C7541d f113678e = C7546e.m23569a(C43881a.f113679a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditFilterViewModel$a */
    static final class C43881a extends Lambda implements C7561a<C0052o<Object>> {

        /* renamed from: a */
        public static final C43881a f113679a = new C43881a();

        C43881a() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Object> m139002a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139002a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditFilterViewModel$b */
    static final class C43882b extends Lambda implements C7561a<C0052o<C29296g>> {

        /* renamed from: a */
        public static final C43882b f113680a = new C43882b();

        C43882b() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<C29296g> m139003a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139003a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditFilterViewModel$c */
    static final class C43883c extends Lambda implements C7562b<EditFilterState, EditFilterState> {

        /* renamed from: a */
        public static final C43883c f113681a = new C43883c();

        C43883c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m139004a((EditFilterState) obj);
        }

        /* renamed from: a */
        private static EditFilterState m139004a(EditFilterState editFilterState) {
            C7573i.m23587b(editFilterState, "$receiver");
            return editFilterState.copy(new C44412h());
        }
    }

    /* renamed from: g */
    public final C0052o<C29296g> mo106215g() {
        return (C0052o) this.f113677d.getValue();
    }

    /* renamed from: h */
    public final C0052o<Object> mo106216h() {
        return (C0052o) this.f113678e.getValue();
    }

    /* renamed from: i */
    private static EditFilterState m138997i() {
        return new EditFilterState(null, 1, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m138997i();
    }

    /* renamed from: f */
    public final void mo29069f() {
        mo29038c(C43883c.f113681a);
    }
}
