package com.p280ss.android.ugc.aweme.story.shootvideo.textfont;

import com.bytedance.jedi.arch.C11670t;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.TextStickerViewState */
public final class TextStickerViewState implements C11670t {
    private final boolean inTimeEditView;

    public TextStickerViewState() {
        this(false, 1, null);
    }

    public static /* synthetic */ TextStickerViewState copy$default(TextStickerViewState textStickerViewState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = textStickerViewState.inTimeEditView;
        }
        return textStickerViewState.copy(z);
    }

    public final boolean component1() {
        return this.inTimeEditView;
    }

    public final TextStickerViewState copy(boolean z) {
        return new TextStickerViewState(z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextStickerViewState) {
                if (this.inTimeEditView == ((TextStickerViewState) obj).inTimeEditView) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public final int hashCode() {
        boolean z = this.inTimeEditView;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStickerViewState(inTimeEditView=");
        sb.append(this.inTimeEditView);
        sb.append(")");
        return sb.toString();
    }

    public TextStickerViewState(boolean z) {
        this.inTimeEditView = z;
    }

    public /* synthetic */ TextStickerViewState(boolean z, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            z = false;
        }
        this(z);
    }
}
