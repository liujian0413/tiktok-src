package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import kotlin.Triple;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.editor.EditMusicCutViewModel */
public final class EditMusicCutViewModel extends BaseJediViewModel<EditMusicCutState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditMusicCutViewModel$a */
    static final class C43903a extends Lambda implements C7562b<EditMusicCutState, EditMusicCutState> {

        /* renamed from: a */
        final /* synthetic */ int f113711a;

        C43903a(int i) {
            this.f113711a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditMusicCutState invoke(EditMusicCutState editMusicCutState) {
            C7573i.m23587b(editMusicCutState, "$receiver");
            return EditMusicCutState.copy$default(editMusicCutState, null, Integer.valueOf(this.f113711a), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditMusicCutViewModel$b */
    static final class C43904b extends Lambda implements C7562b<EditMusicCutState, EditMusicCutState> {

        /* renamed from: a */
        final /* synthetic */ AVMusicWaveBean f113712a;

        /* renamed from: b */
        final /* synthetic */ int f113713b;

        /* renamed from: c */
        final /* synthetic */ int f113714c;

        C43904b(AVMusicWaveBean aVMusicWaveBean, int i, int i2) {
            this.f113712a = aVMusicWaveBean;
            this.f113713b = i;
            this.f113714c = i2;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditMusicCutState invoke(EditMusicCutState editMusicCutState) {
            C7573i.m23587b(editMusicCutState, "$receiver");
            return EditMusicCutState.copy$default(editMusicCutState, new Triple(this.f113712a, Integer.valueOf(this.f113713b), Integer.valueOf(this.f113714c)), null, 2, null);
        }
    }

    /* renamed from: f */
    private static EditMusicCutState m139049f() {
        return new EditMusicCutState(null, null, 3, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m139049f();
    }

    /* renamed from: a */
    public final void mo106287a(int i) {
        mo29038c(new C43903a(i));
    }

    /* renamed from: a */
    public final void mo106288a(AVMusicWaveBean aVMusicWaveBean, int i, int i2) {
        mo29038c(new C43904b(aVMusicWaveBean, i, 0));
    }
}
