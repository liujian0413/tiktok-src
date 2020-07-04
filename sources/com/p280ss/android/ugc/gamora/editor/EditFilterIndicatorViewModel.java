package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.editor.EditFilterIndicatorViewModel */
public final class EditFilterIndicatorViewModel extends JediViewModel<EditFilterIndicatorState> {

    /* renamed from: c */
    public boolean f113673c;

    /* renamed from: com.ss.android.ugc.gamora.editor.EditFilterIndicatorViewModel$a */
    static final class C43880a extends Lambda implements C7562b<EditFilterIndicatorState, EditFilterIndicatorState> {

        /* renamed from: a */
        final /* synthetic */ boolean f113674a;

        /* renamed from: b */
        final /* synthetic */ C29296g f113675b;

        C43880a(boolean z, C29296g gVar) {
            this.f113674a = z;
            this.f113675b = gVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditFilterIndicatorState invoke(EditFilterIndicatorState editFilterIndicatorState) {
            C7573i.m23587b(editFilterIndicatorState, "$receiver");
            return editFilterIndicatorState.copy(this.f113674a, this.f113675b);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m138993f();
    }

    /* renamed from: f */
    private static EditFilterIndicatorState m138993f() {
        return new EditFilterIndicatorState(true, null, 2, null);
    }

    /* renamed from: a */
    public final void mo106208a(boolean z, C29296g gVar) {
        this.f113673c = z;
        mo29038c(new C43880a(z, gVar));
    }
}
