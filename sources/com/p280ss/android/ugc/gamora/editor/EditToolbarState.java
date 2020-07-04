package com.p280ss.android.ugc.gamora.editor;

import android.graphics.drawable.Drawable;
import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import java.util.List;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarState */
public final class EditToolbarState implements C11670t {
    private final C44412h autoEnhanceAnimationEvent;
    private final Drawable autoEnhanceIcon;
    private final Boolean backTipVisible;
    private final Boolean backVisible;
    private final List<C44267cf> bottomBarItems;
    private final Integer bottomHeight;
    private final Integer bottomMargin;
    private final Drawable chooseMusicIcon;
    private final String chooseMusicText;
    private final C44412h hideMoreEvent;
    private final Boolean nextStepVisible;
    private final List<C44267cf> titleBarItems;
    private final Boolean titleBarVisible;
    private final Integer topMargin;

    public EditToolbarState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public static /* synthetic */ EditToolbarState copy$default(EditToolbarState editToolbarState, Boolean bool, Boolean bool2, Boolean bool3, List list, List list2, C44412h hVar, Boolean bool4, String str, Drawable drawable, Integer num, Integer num2, Integer num3, Drawable drawable2, C44412h hVar2, int i, Object obj) {
        EditToolbarState editToolbarState2 = editToolbarState;
        int i2 = i;
        return editToolbarState.copy((i2 & 1) != 0 ? editToolbarState2.backVisible : bool, (i2 & 2) != 0 ? editToolbarState2.backTipVisible : bool2, (i2 & 4) != 0 ? editToolbarState2.nextStepVisible : bool3, (i2 & 8) != 0 ? editToolbarState2.titleBarItems : list, (i2 & 16) != 0 ? editToolbarState2.bottomBarItems : list2, (i2 & 32) != 0 ? editToolbarState2.hideMoreEvent : hVar, (i2 & 64) != 0 ? editToolbarState2.titleBarVisible : bool4, (i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? editToolbarState2.chooseMusicText : str, (i2 & 256) != 0 ? editToolbarState2.chooseMusicIcon : drawable, (i2 & 512) != 0 ? editToolbarState2.topMargin : num, (i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? editToolbarState2.bottomMargin : num2, (i2 & 2048) != 0 ? editToolbarState2.bottomHeight : num3, (i2 & 4096) != 0 ? editToolbarState2.autoEnhanceIcon : drawable2, (i2 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0 ? editToolbarState2.autoEnhanceAnimationEvent : hVar2);
    }

    public final Boolean component1() {
        return this.backVisible;
    }

    public final Integer component10() {
        return this.topMargin;
    }

    public final Integer component11() {
        return this.bottomMargin;
    }

    public final Integer component12() {
        return this.bottomHeight;
    }

    public final Drawable component13() {
        return this.autoEnhanceIcon;
    }

    public final C44412h component14() {
        return this.autoEnhanceAnimationEvent;
    }

    public final Boolean component2() {
        return this.backTipVisible;
    }

    public final Boolean component3() {
        return this.nextStepVisible;
    }

    public final List<C44267cf> component4() {
        return this.titleBarItems;
    }

    public final List<C44267cf> component5() {
        return this.bottomBarItems;
    }

    public final C44412h component6() {
        return this.hideMoreEvent;
    }

    public final Boolean component7() {
        return this.titleBarVisible;
    }

    public final String component8() {
        return this.chooseMusicText;
    }

    public final Drawable component9() {
        return this.chooseMusicIcon;
    }

    public final EditToolbarState copy(Boolean bool, Boolean bool2, Boolean bool3, List<C44267cf> list, List<C44267cf> list2, C44412h hVar, Boolean bool4, String str, Drawable drawable, Integer num, Integer num2, Integer num3, Drawable drawable2, C44412h hVar2) {
        EditToolbarState editToolbarState = new EditToolbarState(bool, bool2, bool3, list, list2, hVar, bool4, str, drawable, num, num2, num3, drawable2, hVar2);
        return editToolbarState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.autoEnhanceAnimationEvent, (java.lang.Object) r3.autoEnhanceAnimationEvent) != false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0097
            boolean r0 = r3 instanceof com.p280ss.android.ugc.gamora.editor.EditToolbarState
            if (r0 == 0) goto L_0x0095
            com.ss.android.ugc.gamora.editor.EditToolbarState r3 = (com.p280ss.android.ugc.gamora.editor.EditToolbarState) r3
            java.lang.Boolean r0 = r2.backVisible
            java.lang.Boolean r1 = r3.backVisible
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0095
            java.lang.Boolean r0 = r2.backTipVisible
            java.lang.Boolean r1 = r3.backTipVisible
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0095
            java.lang.Boolean r0 = r2.nextStepVisible
            java.lang.Boolean r1 = r3.nextStepVisible
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0095
            java.util.List<com.ss.android.ugc.gamora.editor.cf> r0 = r2.titleBarItems
            java.util.List<com.ss.android.ugc.gamora.editor.cf> r1 = r3.titleBarItems
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0095
            java.util.List<com.ss.android.ugc.gamora.editor.cf> r0 = r2.bottomBarItems
            java.util.List<com.ss.android.ugc.gamora.editor.cf> r1 = r3.bottomBarItems
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0095
            com.ss.android.ugc.gamora.jedi.h r0 = r2.hideMoreEvent
            com.ss.android.ugc.gamora.jedi.h r1 = r3.hideMoreEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0095
            java.lang.Boolean r0 = r2.titleBarVisible
            java.lang.Boolean r1 = r3.titleBarVisible
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = r2.chooseMusicText
            java.lang.String r1 = r3.chooseMusicText
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0095
            android.graphics.drawable.Drawable r0 = r2.chooseMusicIcon
            android.graphics.drawable.Drawable r1 = r3.chooseMusicIcon
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0095
            java.lang.Integer r0 = r2.topMargin
            java.lang.Integer r1 = r3.topMargin
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0095
            java.lang.Integer r0 = r2.bottomMargin
            java.lang.Integer r1 = r3.bottomMargin
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0095
            java.lang.Integer r0 = r2.bottomHeight
            java.lang.Integer r1 = r3.bottomHeight
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0095
            android.graphics.drawable.Drawable r0 = r2.autoEnhanceIcon
            android.graphics.drawable.Drawable r1 = r3.autoEnhanceIcon
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0095
            com.ss.android.ugc.gamora.jedi.h r0 = r2.autoEnhanceAnimationEvent
            com.ss.android.ugc.gamora.jedi.h r3 = r3.autoEnhanceAnimationEvent
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r3 = 0
            return r3
        L_0x0097:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditToolbarState.equals(java.lang.Object):boolean");
    }

    public final C44412h getAutoEnhanceAnimationEvent() {
        return this.autoEnhanceAnimationEvent;
    }

    public final Drawable getAutoEnhanceIcon() {
        return this.autoEnhanceIcon;
    }

    public final Boolean getBackTipVisible() {
        return this.backTipVisible;
    }

    public final Boolean getBackVisible() {
        return this.backVisible;
    }

    public final List<C44267cf> getBottomBarItems() {
        return this.bottomBarItems;
    }

    public final Integer getBottomHeight() {
        return this.bottomHeight;
    }

    public final Integer getBottomMargin() {
        return this.bottomMargin;
    }

    public final Drawable getChooseMusicIcon() {
        return this.chooseMusicIcon;
    }

    public final String getChooseMusicText() {
        return this.chooseMusicText;
    }

    public final C44412h getHideMoreEvent() {
        return this.hideMoreEvent;
    }

    public final Boolean getNextStepVisible() {
        return this.nextStepVisible;
    }

    public final List<C44267cf> getTitleBarItems() {
        return this.titleBarItems;
    }

    public final Boolean getTitleBarVisible() {
        return this.titleBarVisible;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    public final int hashCode() {
        Boolean bool = this.backVisible;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.backTipVisible;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.nextStepVisible;
        int hashCode3 = (hashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        List<C44267cf> list = this.titleBarItems;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        List<C44267cf> list2 = this.bottomBarItems;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        C44412h hVar = this.hideMoreEvent;
        int hashCode6 = (hashCode5 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Boolean bool4 = this.titleBarVisible;
        int hashCode7 = (hashCode6 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        String str = this.chooseMusicText;
        int hashCode8 = (hashCode7 + (str != null ? str.hashCode() : 0)) * 31;
        Drawable drawable = this.chooseMusicIcon;
        int hashCode9 = (hashCode8 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num = this.topMargin;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.bottomMargin;
        int hashCode11 = (hashCode10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.bottomHeight;
        int hashCode12 = (hashCode11 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable2 = this.autoEnhanceIcon;
        int hashCode13 = (hashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        C44412h hVar2 = this.autoEnhanceAnimationEvent;
        if (hVar2 != null) {
            i = hVar2.hashCode();
        }
        return hashCode13 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditToolbarState(backVisible=");
        sb.append(this.backVisible);
        sb.append(", backTipVisible=");
        sb.append(this.backTipVisible);
        sb.append(", nextStepVisible=");
        sb.append(this.nextStepVisible);
        sb.append(", titleBarItems=");
        sb.append(this.titleBarItems);
        sb.append(", bottomBarItems=");
        sb.append(this.bottomBarItems);
        sb.append(", hideMoreEvent=");
        sb.append(this.hideMoreEvent);
        sb.append(", titleBarVisible=");
        sb.append(this.titleBarVisible);
        sb.append(", chooseMusicText=");
        sb.append(this.chooseMusicText);
        sb.append(", chooseMusicIcon=");
        sb.append(this.chooseMusicIcon);
        sb.append(", topMargin=");
        sb.append(this.topMargin);
        sb.append(", bottomMargin=");
        sb.append(this.bottomMargin);
        sb.append(", bottomHeight=");
        sb.append(this.bottomHeight);
        sb.append(", autoEnhanceIcon=");
        sb.append(this.autoEnhanceIcon);
        sb.append(", autoEnhanceAnimationEvent=");
        sb.append(this.autoEnhanceAnimationEvent);
        sb.append(")");
        return sb.toString();
    }

    public EditToolbarState(Boolean bool, Boolean bool2, Boolean bool3, List<C44267cf> list, List<C44267cf> list2, C44412h hVar, Boolean bool4, String str, Drawable drawable, Integer num, Integer num2, Integer num3, Drawable drawable2, C44412h hVar2) {
        this.backVisible = bool;
        this.backTipVisible = bool2;
        this.nextStepVisible = bool3;
        this.titleBarItems = list;
        this.bottomBarItems = list2;
        this.hideMoreEvent = hVar;
        this.titleBarVisible = bool4;
        this.chooseMusicText = str;
        this.chooseMusicIcon = drawable;
        this.topMargin = num;
        this.bottomMargin = num2;
        this.bottomHeight = num3;
        this.autoEnhanceIcon = drawable2;
        this.autoEnhanceAnimationEvent = hVar2;
    }

    public /* synthetic */ EditToolbarState(Boolean bool, Boolean bool2, Boolean bool3, List list, List list2, C44412h hVar, Boolean bool4, String str, Drawable drawable, Integer num, Integer num2, Integer num3, Drawable drawable2, C44412h hVar2, int i, C7571f fVar) {
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        List list3;
        List list4;
        C44412h hVar3;
        Boolean bool8;
        String str2;
        Drawable drawable3;
        Integer num4;
        Integer num5;
        Integer num6;
        Drawable drawable4;
        int i2 = i;
        C44412h hVar4 = null;
        if ((i2 & 1) != 0) {
            bool5 = null;
        } else {
            bool5 = bool;
        }
        if ((i2 & 2) != 0) {
            bool6 = null;
        } else {
            bool6 = bool2;
        }
        if ((i2 & 4) != 0) {
            bool7 = null;
        } else {
            bool7 = bool3;
        }
        if ((i2 & 8) != 0) {
            list3 = null;
        } else {
            list3 = list;
        }
        if ((i2 & 16) != 0) {
            list4 = null;
        } else {
            list4 = list2;
        }
        if ((i2 & 32) != 0) {
            hVar3 = null;
        } else {
            hVar3 = hVar;
        }
        if ((i2 & 64) != 0) {
            bool8 = null;
        } else {
            bool8 = bool4;
        }
        if ((i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i2 & 256) != 0) {
            drawable3 = null;
        } else {
            drawable3 = drawable;
        }
        if ((i2 & 512) != 0) {
            num4 = null;
        } else {
            num4 = num;
        }
        if ((i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            num5 = null;
        } else {
            num5 = num2;
        }
        if ((i2 & 2048) != 0) {
            num6 = null;
        } else {
            num6 = num3;
        }
        if ((i2 & 4096) != 0) {
            drawable4 = null;
        } else {
            drawable4 = drawable2;
        }
        if ((i2 & VideoCacheReadBuffersizeExperiment.DEFAULT) == 0) {
            hVar4 = hVar2;
        }
        this(bool5, bool6, bool7, list3, list4, hVar3, bool8, str2, drawable3, num4, num5, num6, drawable4, hVar4);
    }
}
