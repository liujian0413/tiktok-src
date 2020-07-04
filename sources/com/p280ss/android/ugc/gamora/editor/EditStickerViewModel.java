package com.p280ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0052o;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
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

/* renamed from: com.ss.android.ugc.gamora.editor.EditStickerViewModel */
public final class EditStickerViewModel extends JediViewModel<EditStickerState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f113737c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditStickerViewModel.class), "stickerEditableInTimeEdit", "getStickerEditableInTimeEdit()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditStickerViewModel.class), "stickerEditableInPinEdit", "getStickerEditableInPinEdit()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditStickerViewModel.class), "stickerEditable", "getStickerEditable()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: d */
    private final C7541d f113738d = C7546e.m23569a(C43923e.f113746a);

    /* renamed from: e */
    private final C7541d f113739e = C7546e.m23569a(C43922d.f113745a);

    /* renamed from: f */
    private final C7541d f113740f = C7546e.m23569a(C43921c.f113744a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditStickerViewModel$a */
    static final class C43919a extends Lambda implements C7562b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f113741a;

        /* renamed from: b */
        final /* synthetic */ long f113742b;

        C43919a(float f, long j) {
            this.f113741a = f;
            this.f113742b = j;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditStickerState invoke(EditStickerState editStickerState) {
            C7573i.m23587b(editStickerState, "$receiver");
            return EditStickerState.copy$default(editStickerState, null, new C44410f(new Pair(Float.valueOf(this.f113741a), Long.valueOf(this.f113742b))), null, 5, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditStickerViewModel$b */
    static final class C43920b extends Lambda implements C7562b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ Integer f113743a;

        C43920b(Integer num) {
            this.f113743a = num;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditStickerState invoke(EditStickerState editStickerState) {
            C7573i.m23587b(editStickerState, "$receiver");
            return EditStickerState.copy$default(editStickerState, this.f113743a, null, null, 6, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditStickerViewModel$c */
    static final class C43921c extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C43921c f113744a = new C43921c();

        C43921c() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Boolean> m139102a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139102a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditStickerViewModel$d */
    static final class C43922d extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C43922d f113745a = new C43922d();

        C43922d() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Boolean> m139103a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139103a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditStickerViewModel$e */
    static final class C43923e extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C43923e f113746a = new C43923e();

        C43923e() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Boolean> m139104a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139104a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditStickerViewModel$f */
    static final class C43924f extends Lambda implements C7562b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f113747a;

        /* renamed from: b */
        final /* synthetic */ float f113748b;

        /* renamed from: c */
        final /* synthetic */ float f113749c;

        C43924f(float f, float f2, float f3) {
            this.f113747a = f;
            this.f113748b = f2;
            this.f113749c = f3;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditStickerState invoke(EditStickerState editStickerState) {
            C7573i.m23587b(editStickerState, "$receiver");
            return EditStickerState.copy$default(editStickerState, null, null, new C44411g(new Triple(Float.valueOf(this.f113747a), Float.valueOf(this.f113748b), Float.valueOf(this.f113749c))), 3, null);
        }
    }

    /* renamed from: f */
    public final C0052o<Boolean> mo29069f() {
        return (C0052o) this.f113738d.getValue();
    }

    /* renamed from: g */
    public final C0052o<Boolean> mo106363g() {
        return (C0052o) this.f113739e.getValue();
    }

    /* renamed from: h */
    public final C0052o<Boolean> mo106364h() {
        return (C0052o) this.f113740f.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m139092i();
    }

    /* renamed from: i */
    private static EditStickerState m139092i() {
        EditStickerState editStickerState = new EditStickerState(null, null, null, 7, null);
        return editStickerState;
    }

    /* renamed from: a */
    public final void mo106362a(Integer num) {
        mo29038c(new C43920b(num));
    }

    /* renamed from: a */
    public final void mo106361a(float f, long j) {
        mo29038c(new C43919a(f, 300));
    }

    /* renamed from: a */
    public final void mo106360a(float f, float f2, float f3) {
        mo29038c(new C43924f(f, f2, f3));
    }
}
