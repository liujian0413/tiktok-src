package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.editor.EditCornerViewModel */
public final class EditCornerViewModel extends JediViewModel<EditCornerState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditCornerViewModel$a */
    static final class C43877a extends Lambda implements C7562b<EditCornerState, EditCornerState> {

        /* renamed from: a */
        final /* synthetic */ int f113670a;

        C43877a(int i) {
            this.f113670a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditCornerState invoke(EditCornerState editCornerState) {
            C7573i.m23587b(editCornerState, "$receiver");
            return EditCornerState.copy$default(editCornerState, null, null, Integer.valueOf(this.f113670a), 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditCornerViewModel$b */
    static final class C43878b extends Lambda implements C7562b<EditCornerState, EditCornerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f113671a;

        C43878b(boolean z) {
            this.f113671a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditCornerState invoke(EditCornerState editCornerState) {
            C7573i.m23587b(editCornerState, "$receiver");
            return EditCornerState.copy$default(editCornerState, Boolean.valueOf(this.f113671a), null, null, 6, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditCornerViewModel$c */
    static final class C43879c extends Lambda implements C7562b<EditCornerState, EditCornerState> {

        /* renamed from: a */
        final /* synthetic */ int f113672a;

        C43879c(int i) {
            this.f113672a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditCornerState invoke(EditCornerState editCornerState) {
            C7573i.m23587b(editCornerState, "$receiver");
            return EditCornerState.copy$default(editCornerState, null, Integer.valueOf(this.f113672a), null, 5, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m138985f();
    }

    /* renamed from: f */
    private static EditCornerState m138985f() {
        EditCornerState editCornerState = new EditCornerState(null, null, null, 7, null);
        return editCornerState;
    }

    /* renamed from: a */
    public final void mo106197a(int i) {
        mo29038c(new C43879c(i));
    }

    /* renamed from: b */
    public final void mo106199b(int i) {
        mo29038c(new C43877a(i));
    }

    /* renamed from: a */
    public final void mo106198a(boolean z) {
        mo29038c(new C43878b(z));
    }
}
