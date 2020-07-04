package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarState */
public final class CutVideoBottomBarState implements C11670t {
    private final Boolean deleteEnable;
    private final Boolean deleteVisible;
    private final Boolean rotateEnable;
    private final Boolean rotateVisible;
    private final Float selectTime;
    private final Boolean speedChecked;
    private final Boolean speedEnable;
    private final Boolean speedVisible;

    public CutVideoBottomBarState() {
        this(null, null, null, null, null, null, null, null, NormalGiftView.ALPHA_255, null);
    }

    public static /* synthetic */ CutVideoBottomBarState copy$default(CutVideoBottomBarState cutVideoBottomBarState, Float f, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i, Object obj) {
        CutVideoBottomBarState cutVideoBottomBarState2 = cutVideoBottomBarState;
        int i2 = i;
        return cutVideoBottomBarState.copy((i2 & 1) != 0 ? cutVideoBottomBarState2.selectTime : f, (i2 & 2) != 0 ? cutVideoBottomBarState2.speedVisible : bool, (i2 & 4) != 0 ? cutVideoBottomBarState2.speedChecked : bool2, (i2 & 8) != 0 ? cutVideoBottomBarState2.rotateVisible : bool3, (i2 & 16) != 0 ? cutVideoBottomBarState2.deleteVisible : bool4, (i2 & 32) != 0 ? cutVideoBottomBarState2.rotateEnable : bool5, (i2 & 64) != 0 ? cutVideoBottomBarState2.speedEnable : bool6, (i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? cutVideoBottomBarState2.deleteEnable : bool7);
    }

    public final Float component1() {
        return this.selectTime;
    }

    public final Boolean component2() {
        return this.speedVisible;
    }

    public final Boolean component3() {
        return this.speedChecked;
    }

    public final Boolean component4() {
        return this.rotateVisible;
    }

    public final Boolean component5() {
        return this.deleteVisible;
    }

    public final Boolean component6() {
        return this.rotateEnable;
    }

    public final Boolean component7() {
        return this.speedEnable;
    }

    public final Boolean component8() {
        return this.deleteEnable;
    }

    public final CutVideoBottomBarState copy(Float f, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        CutVideoBottomBarState cutVideoBottomBarState = new CutVideoBottomBarState(f, bool, bool2, bool3, bool4, bool5, bool6, bool7);
        return cutVideoBottomBarState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.deleteEnable, (java.lang.Object) r3.deleteEnable) != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x005b
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarState
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarState r3 = (com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarState) r3
            java.lang.Float r0 = r2.selectTime
            java.lang.Float r1 = r3.selectTime
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.Boolean r0 = r2.speedVisible
            java.lang.Boolean r1 = r3.speedVisible
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.Boolean r0 = r2.speedChecked
            java.lang.Boolean r1 = r3.speedChecked
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.Boolean r0 = r2.rotateVisible
            java.lang.Boolean r1 = r3.rotateVisible
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.Boolean r0 = r2.deleteVisible
            java.lang.Boolean r1 = r3.deleteVisible
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.Boolean r0 = r2.rotateEnable
            java.lang.Boolean r1 = r3.rotateEnable
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.Boolean r0 = r2.speedEnable
            java.lang.Boolean r1 = r3.speedEnable
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.Boolean r0 = r2.deleteEnable
            java.lang.Boolean r3 = r3.deleteEnable
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 0
            return r3
        L_0x005b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarState.equals(java.lang.Object):boolean");
    }

    public final Boolean getDeleteEnable() {
        return this.deleteEnable;
    }

    public final Boolean getDeleteVisible() {
        return this.deleteVisible;
    }

    public final Boolean getRotateEnable() {
        return this.rotateEnable;
    }

    public final Boolean getRotateVisible() {
        return this.rotateVisible;
    }

    public final Float getSelectTime() {
        return this.selectTime;
    }

    public final Boolean getSpeedChecked() {
        return this.speedChecked;
    }

    public final Boolean getSpeedEnable() {
        return this.speedEnable;
    }

    public final Boolean getSpeedVisible() {
        return this.speedVisible;
    }

    public final int hashCode() {
        Float f = this.selectTime;
        int i = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        Boolean bool = this.speedVisible;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.speedChecked;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.rotateVisible;
        int hashCode4 = (hashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.deleteVisible;
        int hashCode5 = (hashCode4 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.rotateEnable;
        int hashCode6 = (hashCode5 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        Boolean bool6 = this.speedEnable;
        int hashCode7 = (hashCode6 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
        Boolean bool7 = this.deleteEnable;
        if (bool7 != null) {
            i = bool7.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CutVideoBottomBarState(selectTime=");
        sb.append(this.selectTime);
        sb.append(", speedVisible=");
        sb.append(this.speedVisible);
        sb.append(", speedChecked=");
        sb.append(this.speedChecked);
        sb.append(", rotateVisible=");
        sb.append(this.rotateVisible);
        sb.append(", deleteVisible=");
        sb.append(this.deleteVisible);
        sb.append(", rotateEnable=");
        sb.append(this.rotateEnable);
        sb.append(", speedEnable=");
        sb.append(this.speedEnable);
        sb.append(", deleteEnable=");
        sb.append(this.deleteEnable);
        sb.append(")");
        return sb.toString();
    }

    public CutVideoBottomBarState(Float f, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        this.selectTime = f;
        this.speedVisible = bool;
        this.speedChecked = bool2;
        this.rotateVisible = bool3;
        this.deleteVisible = bool4;
        this.rotateEnable = bool5;
        this.speedEnable = bool6;
        this.deleteEnable = bool7;
    }

    public /* synthetic */ CutVideoBottomBarState(Float f, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i, C7571f fVar) {
        Float f2;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Boolean bool11;
        Boolean bool12;
        Boolean bool13;
        int i2 = i;
        Boolean bool14 = null;
        if ((i2 & 1) != 0) {
            f2 = null;
        } else {
            f2 = f;
        }
        if ((i2 & 2) != 0) {
            bool8 = null;
        } else {
            bool8 = bool;
        }
        if ((i2 & 4) != 0) {
            bool9 = null;
        } else {
            bool9 = bool2;
        }
        if ((i2 & 8) != 0) {
            bool10 = null;
        } else {
            bool10 = bool3;
        }
        if ((i2 & 16) != 0) {
            bool11 = null;
        } else {
            bool11 = bool4;
        }
        if ((i2 & 32) != 0) {
            bool12 = null;
        } else {
            bool12 = bool5;
        }
        if ((i2 & 64) != 0) {
            bool13 = null;
        } else {
            bool13 = bool6;
        }
        if ((i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) == 0) {
            bool14 = bool7;
        }
        this(f2, bool8, bool9, bool10, bool11, bool12, bool13, bool14);
    }
}
