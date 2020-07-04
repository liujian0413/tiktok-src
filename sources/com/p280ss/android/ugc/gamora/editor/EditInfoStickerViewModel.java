package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44409e;
import com.p280ss.android.ugc.gamora.jedi.C44410f;
import com.p280ss.android.ugc.gamora.jedi.C44411g;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.editor.EditInfoStickerViewModel */
public final class EditInfoStickerViewModel extends JediViewModel<EditInfoStickerState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditInfoStickerViewModel$a */
    static final class C43888a extends Lambda implements C7562b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f113691a;

        /* renamed from: b */
        final /* synthetic */ long f113692b;

        C43888a(float f, long j) {
            this.f113691a = f;
            this.f113692b = j;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            C7573i.m23587b(editInfoStickerState, "$receiver");
            return EditInfoStickerState.copy$default(editInfoStickerState, null, null, null, new C44410f(new Pair(Float.valueOf(this.f113691a), Long.valueOf(this.f113692b))), null, 23, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditInfoStickerViewModel$b */
    static final class C43889b extends Lambda implements C7562b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        final /* synthetic */ StickerItemModel f113693a;

        C43889b(StickerItemModel stickerItemModel) {
            this.f113693a = stickerItemModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            C7573i.m23587b(editInfoStickerState, "$receiver");
            return EditInfoStickerState.copy$default(editInfoStickerState, null, null, new C44403b(this.f113693a), null, null, 27, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditInfoStickerViewModel$c */
    static final class C43890c extends Lambda implements C7562b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        public static final C43890c f113694a = new C43890c();

        C43890c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m139024a((EditInfoStickerState) obj);
        }

        /* renamed from: a */
        private static EditInfoStickerState m139024a(EditInfoStickerState editInfoStickerState) {
            C7573i.m23587b(editInfoStickerState, "$receiver");
            return EditInfoStickerState.copy$default(editInfoStickerState, new C44412h(), null, null, null, null, 30, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditInfoStickerViewModel$d */
    static final class C43891d extends Lambda implements C7562b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        final /* synthetic */ int f113695a;

        C43891d(int i) {
            this.f113695a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            C7573i.m23587b(editInfoStickerState, "$receiver");
            return EditInfoStickerState.copy$default(editInfoStickerState, null, new C44409e(this.f113695a), null, null, null, 29, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditInfoStickerViewModel$e */
    static final class C43892e extends Lambda implements C7562b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f113696a;

        /* renamed from: b */
        final /* synthetic */ float f113697b;

        /* renamed from: c */
        final /* synthetic */ float f113698c;

        C43892e(float f, float f2, float f3) {
            this.f113696a = f;
            this.f113697b = f2;
            this.f113698c = f3;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            C7573i.m23587b(editInfoStickerState, "$receiver");
            return EditInfoStickerState.copy$default(editInfoStickerState, null, null, null, null, new C44411g(new Triple(Float.valueOf(this.f113696a), Float.valueOf(this.f113697b), Float.valueOf(this.f113698c))), 15, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m139015g();
    }

    /* renamed from: f */
    public final void mo29069f() {
        mo29038c(C43890c.f113694a);
    }

    /* renamed from: g */
    private static EditInfoStickerState m139015g() {
        EditInfoStickerState editInfoStickerState = new EditInfoStickerState(null, null, null, null, null, 31, null);
        return editInfoStickerState;
    }

    /* renamed from: a */
    public final void mo106246a(int i) {
        mo29038c(new C43891d(i));
    }

    /* renamed from: a */
    public final void mo106247a(StickerItemModel stickerItemModel) {
        C7573i.m23587b(stickerItemModel, "item");
        mo29038c(new C43889b(stickerItemModel));
    }

    /* renamed from: a */
    public final void mo106245a(float f, long j) {
        mo29038c(new C43888a(f, 300));
    }

    /* renamed from: a */
    public final void mo106244a(float f, float f2, float f3) {
        mo29038c(new C43892e(f, f2, f3));
    }
}
