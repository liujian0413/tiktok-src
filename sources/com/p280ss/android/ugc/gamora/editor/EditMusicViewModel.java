package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44409e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.editor.EditMusicViewModel */
public final class EditMusicViewModel extends BaseJediViewModel<EditMusicState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditMusicViewModel$a */
    static final class C43905a extends Lambda implements C7562b<EditMusicState, EditMusicState> {

        /* renamed from: a */
        final /* synthetic */ int f113715a;

        C43905a(int i) {
            this.f113715a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditMusicState invoke(EditMusicState editMusicState) {
            C7573i.m23587b(editMusicState, "$receiver");
            return EditMusicState.copy$default(editMusicState, null, new C44409e(this.f113715a), null, 5, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditMusicViewModel$b */
    static final class C43906b extends Lambda implements C7562b<EditMusicState, EditMusicState> {

        /* renamed from: a */
        final /* synthetic */ boolean f113716a;

        C43906b(boolean z) {
            this.f113716a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditMusicState invoke(EditMusicState editMusicState) {
            C7573i.m23587b(editMusicState, "$receiver");
            return EditMusicState.copy$default(editMusicState, Boolean.valueOf(this.f113716a), null, null, 6, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditMusicViewModel$c */
    static final class C43907c extends Lambda implements C7562b<EditMusicState, EditMusicState> {

        /* renamed from: a */
        final /* synthetic */ AVMusic f113717a;

        C43907c(AVMusic aVMusic) {
            this.f113717a = aVMusic;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditMusicState invoke(EditMusicState editMusicState) {
            C7573i.m23587b(editMusicState, "$receiver");
            return EditMusicState.copy$default(editMusicState, null, null, this.f113717a, 3, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m139055f();
    }

    /* renamed from: f */
    private static EditMusicState m139055f() {
        EditMusicState editMusicState = new EditMusicState(null, null, null, 7, null);
        return editMusicState;
    }

    /* renamed from: a */
    public final void mo106299a(int i) {
        mo29038c(new C43905a(i));
    }

    /* renamed from: a */
    public final void mo106300a(AVMusic aVMusic) {
        C7573i.m23587b(aVMusic, "model");
        mo29038c(new C43907c(aVMusic));
    }

    /* renamed from: a */
    public final void mo106301a(boolean z) {
        mo29038c(new C43906b(z));
    }
}
