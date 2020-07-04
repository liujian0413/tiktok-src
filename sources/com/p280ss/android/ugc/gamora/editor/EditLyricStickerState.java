package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39558aj;
import com.p280ss.android.ugc.gamora.jedi.C44409e;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.EditLyricStickerState */
public final class EditLyricStickerState implements C11670t {
    private final C44409e cleanSelected;
    private final C44412h clickCutMusic;
    private final Integer curColor;
    private final C44298ct curLyricEffect;
    private final Integer defaultColor;
    private final C44412h deleteLyric;
    private final Boolean inEditState;
    private final C39558aj lyricItem;
    private final C44412h saveAudioTime;

    public EditLyricStickerState() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ EditLyricStickerState copy$default(EditLyricStickerState editLyricStickerState, Integer num, C44298ct ctVar, Boolean bool, C44412h hVar, C44412h hVar2, C39558aj ajVar, Integer num2, C44409e eVar, C44412h hVar3, int i, Object obj) {
        EditLyricStickerState editLyricStickerState2 = editLyricStickerState;
        int i2 = i;
        return editLyricStickerState.copy((i2 & 1) != 0 ? editLyricStickerState2.curColor : num, (i2 & 2) != 0 ? editLyricStickerState2.curLyricEffect : ctVar, (i2 & 4) != 0 ? editLyricStickerState2.inEditState : bool, (i2 & 8) != 0 ? editLyricStickerState2.deleteLyric : hVar, (i2 & 16) != 0 ? editLyricStickerState2.saveAudioTime : hVar2, (i2 & 32) != 0 ? editLyricStickerState2.lyricItem : ajVar, (i2 & 64) != 0 ? editLyricStickerState2.defaultColor : num2, (i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? editLyricStickerState2.cleanSelected : eVar, (i2 & 256) != 0 ? editLyricStickerState2.clickCutMusic : hVar3);
    }

    public final Integer component1() {
        return this.curColor;
    }

    public final C44298ct component2() {
        return this.curLyricEffect;
    }

    public final Boolean component3() {
        return this.inEditState;
    }

    public final C44412h component4() {
        return this.deleteLyric;
    }

    public final C44412h component5() {
        return this.saveAudioTime;
    }

    public final C39558aj component6() {
        return this.lyricItem;
    }

    public final Integer component7() {
        return this.defaultColor;
    }

    public final C44409e component8() {
        return this.cleanSelected;
    }

    public final C44412h component9() {
        return this.clickCutMusic;
    }

    public final EditLyricStickerState copy(Integer num, C44298ct ctVar, Boolean bool, C44412h hVar, C44412h hVar2, C39558aj ajVar, Integer num2, C44409e eVar, C44412h hVar3) {
        EditLyricStickerState editLyricStickerState = new EditLyricStickerState(num, ctVar, bool, hVar, hVar2, ajVar, num2, eVar, hVar3);
        return editLyricStickerState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.clickCutMusic, (java.lang.Object) r3.clickCutMusic) != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0065
            boolean r0 = r3 instanceof com.p280ss.android.ugc.gamora.editor.EditLyricStickerState
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.gamora.editor.EditLyricStickerState r3 = (com.p280ss.android.ugc.gamora.editor.EditLyricStickerState) r3
            java.lang.Integer r0 = r2.curColor
            java.lang.Integer r1 = r3.curColor
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.gamora.editor.ct r0 = r2.curLyricEffect
            com.ss.android.ugc.gamora.editor.ct r1 = r3.curLyricEffect
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.Boolean r0 = r2.inEditState
            java.lang.Boolean r1 = r3.inEditState
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.gamora.jedi.h r0 = r2.deleteLyric
            com.ss.android.ugc.gamora.jedi.h r1 = r3.deleteLyric
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.gamora.jedi.h r0 = r2.saveAudioTime
            com.ss.android.ugc.gamora.jedi.h r1 = r3.saveAudioTime
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.aj r0 = r2.lyricItem
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.aj r1 = r3.lyricItem
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.Integer r0 = r2.defaultColor
            java.lang.Integer r1 = r3.defaultColor
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.gamora.jedi.e r0 = r2.cleanSelected
            com.ss.android.ugc.gamora.jedi.e r1 = r3.cleanSelected
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.gamora.jedi.h r0 = r2.clickCutMusic
            com.ss.android.ugc.gamora.jedi.h r3 = r3.clickCutMusic
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r3 = 0
            return r3
        L_0x0065:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditLyricStickerState.equals(java.lang.Object):boolean");
    }

    public final C44409e getCleanSelected() {
        return this.cleanSelected;
    }

    public final C44412h getClickCutMusic() {
        return this.clickCutMusic;
    }

    public final Integer getCurColor() {
        return this.curColor;
    }

    public final C44298ct getCurLyricEffect() {
        return this.curLyricEffect;
    }

    public final Integer getDefaultColor() {
        return this.defaultColor;
    }

    public final C44412h getDeleteLyric() {
        return this.deleteLyric;
    }

    public final Boolean getInEditState() {
        return this.inEditState;
    }

    public final C39558aj getLyricItem() {
        return this.lyricItem;
    }

    public final C44412h getSaveAudioTime() {
        return this.saveAudioTime;
    }

    public final int hashCode() {
        Integer num = this.curColor;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        C44298ct ctVar = this.curLyricEffect;
        int hashCode2 = (hashCode + (ctVar != null ? ctVar.hashCode() : 0)) * 31;
        Boolean bool = this.inEditState;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        C44412h hVar = this.deleteLyric;
        int hashCode4 = (hashCode3 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        C44412h hVar2 = this.saveAudioTime;
        int hashCode5 = (hashCode4 + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        C39558aj ajVar = this.lyricItem;
        int hashCode6 = (hashCode5 + (ajVar != null ? ajVar.hashCode() : 0)) * 31;
        Integer num2 = this.defaultColor;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        C44409e eVar = this.cleanSelected;
        int hashCode8 = (hashCode7 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        C44412h hVar3 = this.clickCutMusic;
        if (hVar3 != null) {
            i = hVar3.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditLyricStickerState(curColor=");
        sb.append(this.curColor);
        sb.append(", curLyricEffect=");
        sb.append(this.curLyricEffect);
        sb.append(", inEditState=");
        sb.append(this.inEditState);
        sb.append(", deleteLyric=");
        sb.append(this.deleteLyric);
        sb.append(", saveAudioTime=");
        sb.append(this.saveAudioTime);
        sb.append(", lyricItem=");
        sb.append(this.lyricItem);
        sb.append(", defaultColor=");
        sb.append(this.defaultColor);
        sb.append(", cleanSelected=");
        sb.append(this.cleanSelected);
        sb.append(", clickCutMusic=");
        sb.append(this.clickCutMusic);
        sb.append(")");
        return sb.toString();
    }

    public EditLyricStickerState(Integer num, C44298ct ctVar, Boolean bool, C44412h hVar, C44412h hVar2, C39558aj ajVar, Integer num2, C44409e eVar, C44412h hVar3) {
        this.curColor = num;
        this.curLyricEffect = ctVar;
        this.inEditState = bool;
        this.deleteLyric = hVar;
        this.saveAudioTime = hVar2;
        this.lyricItem = ajVar;
        this.defaultColor = num2;
        this.cleanSelected = eVar;
        this.clickCutMusic = hVar3;
    }

    public /* synthetic */ EditLyricStickerState(Integer num, C44298ct ctVar, Boolean bool, C44412h hVar, C44412h hVar2, C39558aj ajVar, Integer num2, C44409e eVar, C44412h hVar3, int i, C7571f fVar) {
        Integer num3;
        C44298ct ctVar2;
        Boolean bool2;
        C44412h hVar4;
        C44412h hVar5;
        C39558aj ajVar2;
        Integer num4;
        C44409e eVar2;
        int i2 = i;
        C44412h hVar6 = null;
        if ((i2 & 1) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i2 & 2) != 0) {
            ctVar2 = null;
        } else {
            ctVar2 = ctVar;
        }
        if ((i2 & 4) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i2 & 8) != 0) {
            hVar4 = null;
        } else {
            hVar4 = hVar;
        }
        if ((i2 & 16) != 0) {
            hVar5 = null;
        } else {
            hVar5 = hVar2;
        }
        if ((i2 & 32) != 0) {
            ajVar2 = null;
        } else {
            ajVar2 = ajVar;
        }
        if ((i2 & 64) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            eVar2 = null;
        } else {
            eVar2 = eVar;
        }
        if ((i2 & 256) == 0) {
            hVar6 = hVar3;
        }
        this(num3, ctVar2, bool2, hVar4, hVar5, ajVar2, num4, eVar2, hVar6);
    }
}
