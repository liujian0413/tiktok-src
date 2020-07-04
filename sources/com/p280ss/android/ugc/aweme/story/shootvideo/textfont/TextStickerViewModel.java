package com.p280ss.android.ugc.aweme.story.shootvideo.textfont;

import android.arch.lifecycle.C0052o;
import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.TextStickerViewModel */
public final class TextStickerViewModel extends BaseJediViewModel<TextStickerViewState> {

    /* renamed from: c */
    private C0052o<Boolean> f109181c;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.TextStickerViewModel$a */
    static final class C42035a extends Lambda implements C7562b<TextStickerViewState, TextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f109182a;

        C42035a(boolean z) {
            this.f109182a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextStickerViewState invoke(TextStickerViewState textStickerViewState) {
            C7573i.m23587b(textStickerViewState, "$receiver");
            return textStickerViewState.copy(this.f109182a);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m133609f();
    }

    /* renamed from: f */
    private static TextStickerViewState m133609f() {
        return new TextStickerViewState(false, 1, null);
    }

    /* renamed from: a */
    public final void mo103209a(C0052o<Boolean> oVar) {
        C7573i.m23587b(oVar, "liveData");
        this.f109181c = oVar;
    }

    /* renamed from: a */
    public final void mo103210a(boolean z) {
        mo29038c(new C42035a(z));
        C0052o<Boolean> oVar = this.f109181c;
        if (oVar != null && (!C7573i.m23585a((Object) (Boolean) oVar.getValue(), (Object) Boolean.valueOf(z)))) {
            oVar.setValue(Boolean.valueOf(z));
        }
    }
}
