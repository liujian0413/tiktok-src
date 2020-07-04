package com.p280ss.android.ugc.gamora.recorder.toolbar;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.tools.C42146am;
import com.p280ss.android.ugc.aweme.tools.C42152as;
import com.p280ss.android.ugc.aweme.tools.C42153at;
import com.p280ss.android.ugc.aweme.tools.C42342g;
import com.p280ss.android.ugc.aweme.tools.C42585u;
import com.p280ss.android.ugc.aweme.tools.C42587w;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewState */
public final class RecordToolbarViewState implements C11670t {
    private final C44403b<Boolean> beautyConfig;
    private final C44403b<C42342g> bottomTab;
    private final C44403b<Integer> countDown;
    private final C44403b<C42153at> disableRecordDuration;
    private final C44403b<Boolean> enableReverseCamera;
    private final C44403b<C42585u> flash;
    private final C44403b<Boolean> frontDisable;
    private final C44403b<C42587w> frontRear;
    private final C44403b<C42146am> microphoneState;
    private final C44412h musicAdd;
    private final C44412h musicCleared;
    private final C44403b<Boolean> musicCutable;
    private final C44403b<Boolean> shakeFreeMode;
    private final C44403b<Integer> speedGroupVisibility;
    private final C44403b<C42152as> switchDurationConfig;
    private final C44403b<Boolean> wideCamera;

    public RecordToolbarViewState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public static /* synthetic */ RecordToolbarViewState copy$default(RecordToolbarViewState recordToolbarViewState, C44403b bVar, C44403b bVar2, C44412h hVar, C44412h hVar2, C44403b bVar3, C44403b bVar4, C44403b bVar5, C44403b bVar6, C44403b bVar7, C44403b bVar8, C44403b bVar9, C44403b bVar10, C44403b bVar11, C44403b bVar12, C44403b bVar13, C44403b bVar14, int i, Object obj) {
        RecordToolbarViewState recordToolbarViewState2 = recordToolbarViewState;
        int i2 = i;
        return recordToolbarViewState.copy((i2 & 1) != 0 ? recordToolbarViewState2.countDown : bVar, (i2 & 2) != 0 ? recordToolbarViewState2.frontDisable : bVar2, (i2 & 4) != 0 ? recordToolbarViewState2.musicAdd : hVar, (i2 & 8) != 0 ? recordToolbarViewState2.musicCleared : hVar2, (i2 & 16) != 0 ? recordToolbarViewState2.beautyConfig : bVar3, (i2 & 32) != 0 ? recordToolbarViewState2.frontRear : bVar4, (i2 & 64) != 0 ? recordToolbarViewState2.enableReverseCamera : bVar5, (i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? recordToolbarViewState2.musicCutable : bVar6, (i2 & 256) != 0 ? recordToolbarViewState2.microphoneState : bVar7, (i2 & 512) != 0 ? recordToolbarViewState2.shakeFreeMode : bVar8, (i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? recordToolbarViewState2.speedGroupVisibility : bVar9, (i2 & 2048) != 0 ? recordToolbarViewState2.switchDurationConfig : bVar10, (i2 & 4096) != 0 ? recordToolbarViewState2.flash : bVar11, (i2 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0 ? recordToolbarViewState2.bottomTab : bVar12, (i2 & 16384) != 0 ? recordToolbarViewState2.wideCamera : bVar13, (i2 & 32768) != 0 ? recordToolbarViewState2.disableRecordDuration : bVar14);
    }

    public final C44403b<Integer> component1() {
        return this.countDown;
    }

    public final C44403b<Boolean> component10() {
        return this.shakeFreeMode;
    }

    public final C44403b<Integer> component11() {
        return this.speedGroupVisibility;
    }

    public final C44403b<C42152as> component12() {
        return this.switchDurationConfig;
    }

    public final C44403b<C42585u> component13() {
        return this.flash;
    }

    public final C44403b<C42342g> component14() {
        return this.bottomTab;
    }

    public final C44403b<Boolean> component15() {
        return this.wideCamera;
    }

    public final C44403b<C42153at> component16() {
        return this.disableRecordDuration;
    }

    public final C44403b<Boolean> component2() {
        return this.frontDisable;
    }

    public final C44412h component3() {
        return this.musicAdd;
    }

    public final C44412h component4() {
        return this.musicCleared;
    }

    public final C44403b<Boolean> component5() {
        return this.beautyConfig;
    }

    public final C44403b<C42587w> component6() {
        return this.frontRear;
    }

    public final C44403b<Boolean> component7() {
        return this.enableReverseCamera;
    }

    public final C44403b<Boolean> component8() {
        return this.musicCutable;
    }

    public final C44403b<C42146am> component9() {
        return this.microphoneState;
    }

    public final RecordToolbarViewState copy(C44403b<Integer> bVar, C44403b<Boolean> bVar2, C44412h hVar, C44412h hVar2, C44403b<Boolean> bVar3, C44403b<C42587w> bVar4, C44403b<Boolean> bVar5, C44403b<Boolean> bVar6, C44403b<? extends C42146am> bVar7, C44403b<Boolean> bVar8, C44403b<Integer> bVar9, C44403b<? extends C42152as> bVar10, C44403b<C42585u> bVar11, C44403b<C42342g> bVar12, C44403b<Boolean> bVar13, C44403b<? extends C42153at> bVar14) {
        RecordToolbarViewState recordToolbarViewState = new RecordToolbarViewState(bVar, bVar2, hVar, hVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14);
        return recordToolbarViewState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.disableRecordDuration, (java.lang.Object) r3.disableRecordDuration) != false) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x00ab
            boolean r0 = r3 instanceof com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewState
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewState r3 = (com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewState) r3
            com.ss.android.ugc.gamora.jedi.b<java.lang.Integer> r0 = r2.countDown
            com.ss.android.ugc.gamora.jedi.b<java.lang.Integer> r1 = r3.countDown
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.gamora.jedi.b<java.lang.Boolean> r0 = r2.frontDisable
            com.ss.android.ugc.gamora.jedi.b<java.lang.Boolean> r1 = r3.frontDisable
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.gamora.jedi.h r0 = r2.musicAdd
            com.ss.android.ugc.gamora.jedi.h r1 = r3.musicAdd
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.gamora.jedi.h r0 = r2.musicCleared
            com.ss.android.ugc.gamora.jedi.h r1 = r3.musicCleared
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.gamora.jedi.b<java.lang.Boolean> r0 = r2.beautyConfig
            com.ss.android.ugc.gamora.jedi.b<java.lang.Boolean> r1 = r3.beautyConfig
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.tools.w> r0 = r2.frontRear
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.tools.w> r1 = r3.frontRear
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.gamora.jedi.b<java.lang.Boolean> r0 = r2.enableReverseCamera
            com.ss.android.ugc.gamora.jedi.b<java.lang.Boolean> r1 = r3.enableReverseCamera
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.gamora.jedi.b<java.lang.Boolean> r0 = r2.musicCutable
            com.ss.android.ugc.gamora.jedi.b<java.lang.Boolean> r1 = r3.musicCutable
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.tools.am> r0 = r2.microphoneState
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.tools.am> r1 = r3.microphoneState
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.gamora.jedi.b<java.lang.Boolean> r0 = r2.shakeFreeMode
            com.ss.android.ugc.gamora.jedi.b<java.lang.Boolean> r1 = r3.shakeFreeMode
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.gamora.jedi.b<java.lang.Integer> r0 = r2.speedGroupVisibility
            com.ss.android.ugc.gamora.jedi.b<java.lang.Integer> r1 = r3.speedGroupVisibility
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.tools.as> r0 = r2.switchDurationConfig
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.tools.as> r1 = r3.switchDurationConfig
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.tools.u> r0 = r2.flash
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.tools.u> r1 = r3.flash
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.tools.g> r0 = r2.bottomTab
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.tools.g> r1 = r3.bottomTab
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.gamora.jedi.b<java.lang.Boolean> r0 = r2.wideCamera
            com.ss.android.ugc.gamora.jedi.b<java.lang.Boolean> r1 = r3.wideCamera
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.tools.at> r0 = r2.disableRecordDuration
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.tools.at> r3 = r3.disableRecordDuration
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r3 = 0
            return r3
        L_0x00ab:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewState.equals(java.lang.Object):boolean");
    }

    public final C44403b<Boolean> getBeautyConfig() {
        return this.beautyConfig;
    }

    public final C44403b<C42342g> getBottomTab() {
        return this.bottomTab;
    }

    public final C44403b<Integer> getCountDown() {
        return this.countDown;
    }

    public final C44403b<C42153at> getDisableRecordDuration() {
        return this.disableRecordDuration;
    }

    public final C44403b<Boolean> getEnableReverseCamera() {
        return this.enableReverseCamera;
    }

    public final C44403b<C42585u> getFlash() {
        return this.flash;
    }

    public final C44403b<Boolean> getFrontDisable() {
        return this.frontDisable;
    }

    public final C44403b<C42587w> getFrontRear() {
        return this.frontRear;
    }

    public final C44403b<C42146am> getMicrophoneState() {
        return this.microphoneState;
    }

    public final C44412h getMusicAdd() {
        return this.musicAdd;
    }

    public final C44412h getMusicCleared() {
        return this.musicCleared;
    }

    public final C44403b<Boolean> getMusicCutable() {
        return this.musicCutable;
    }

    public final C44403b<Boolean> getShakeFreeMode() {
        return this.shakeFreeMode;
    }

    public final C44403b<Integer> getSpeedGroupVisibility() {
        return this.speedGroupVisibility;
    }

    public final C44403b<C42152as> getSwitchDurationConfig() {
        return this.switchDurationConfig;
    }

    public final C44403b<Boolean> getWideCamera() {
        return this.wideCamera;
    }

    public final int hashCode() {
        C44403b<Integer> bVar = this.countDown;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        C44403b<Boolean> bVar2 = this.frontDisable;
        int hashCode2 = (hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        C44412h hVar = this.musicAdd;
        int hashCode3 = (hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        C44412h hVar2 = this.musicCleared;
        int hashCode4 = (hashCode3 + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        C44403b<Boolean> bVar3 = this.beautyConfig;
        int hashCode5 = (hashCode4 + (bVar3 != null ? bVar3.hashCode() : 0)) * 31;
        C44403b<C42587w> bVar4 = this.frontRear;
        int hashCode6 = (hashCode5 + (bVar4 != null ? bVar4.hashCode() : 0)) * 31;
        C44403b<Boolean> bVar5 = this.enableReverseCamera;
        int hashCode7 = (hashCode6 + (bVar5 != null ? bVar5.hashCode() : 0)) * 31;
        C44403b<Boolean> bVar6 = this.musicCutable;
        int hashCode8 = (hashCode7 + (bVar6 != null ? bVar6.hashCode() : 0)) * 31;
        C44403b<C42146am> bVar7 = this.microphoneState;
        int hashCode9 = (hashCode8 + (bVar7 != null ? bVar7.hashCode() : 0)) * 31;
        C44403b<Boolean> bVar8 = this.shakeFreeMode;
        int hashCode10 = (hashCode9 + (bVar8 != null ? bVar8.hashCode() : 0)) * 31;
        C44403b<Integer> bVar9 = this.speedGroupVisibility;
        int hashCode11 = (hashCode10 + (bVar9 != null ? bVar9.hashCode() : 0)) * 31;
        C44403b<C42152as> bVar10 = this.switchDurationConfig;
        int hashCode12 = (hashCode11 + (bVar10 != null ? bVar10.hashCode() : 0)) * 31;
        C44403b<C42585u> bVar11 = this.flash;
        int hashCode13 = (hashCode12 + (bVar11 != null ? bVar11.hashCode() : 0)) * 31;
        C44403b<C42342g> bVar12 = this.bottomTab;
        int hashCode14 = (hashCode13 + (bVar12 != null ? bVar12.hashCode() : 0)) * 31;
        C44403b<Boolean> bVar13 = this.wideCamera;
        int hashCode15 = (hashCode14 + (bVar13 != null ? bVar13.hashCode() : 0)) * 31;
        C44403b<C42153at> bVar14 = this.disableRecordDuration;
        if (bVar14 != null) {
            i = bVar14.hashCode();
        }
        return hashCode15 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordToolbarViewState(countDown=");
        sb.append(this.countDown);
        sb.append(", frontDisable=");
        sb.append(this.frontDisable);
        sb.append(", musicAdd=");
        sb.append(this.musicAdd);
        sb.append(", musicCleared=");
        sb.append(this.musicCleared);
        sb.append(", beautyConfig=");
        sb.append(this.beautyConfig);
        sb.append(", frontRear=");
        sb.append(this.frontRear);
        sb.append(", enableReverseCamera=");
        sb.append(this.enableReverseCamera);
        sb.append(", musicCutable=");
        sb.append(this.musicCutable);
        sb.append(", microphoneState=");
        sb.append(this.microphoneState);
        sb.append(", shakeFreeMode=");
        sb.append(this.shakeFreeMode);
        sb.append(", speedGroupVisibility=");
        sb.append(this.speedGroupVisibility);
        sb.append(", switchDurationConfig=");
        sb.append(this.switchDurationConfig);
        sb.append(", flash=");
        sb.append(this.flash);
        sb.append(", bottomTab=");
        sb.append(this.bottomTab);
        sb.append(", wideCamera=");
        sb.append(this.wideCamera);
        sb.append(", disableRecordDuration=");
        sb.append(this.disableRecordDuration);
        sb.append(")");
        return sb.toString();
    }

    public RecordToolbarViewState(C44403b<Integer> bVar, C44403b<Boolean> bVar2, C44412h hVar, C44412h hVar2, C44403b<Boolean> bVar3, C44403b<C42587w> bVar4, C44403b<Boolean> bVar5, C44403b<Boolean> bVar6, C44403b<? extends C42146am> bVar7, C44403b<Boolean> bVar8, C44403b<Integer> bVar9, C44403b<? extends C42152as> bVar10, C44403b<C42585u> bVar11, C44403b<C42342g> bVar12, C44403b<Boolean> bVar13, C44403b<? extends C42153at> bVar14) {
        this.countDown = bVar;
        this.frontDisable = bVar2;
        this.musicAdd = hVar;
        this.musicCleared = hVar2;
        this.beautyConfig = bVar3;
        this.frontRear = bVar4;
        this.enableReverseCamera = bVar5;
        this.musicCutable = bVar6;
        this.microphoneState = bVar7;
        this.shakeFreeMode = bVar8;
        this.speedGroupVisibility = bVar9;
        this.switchDurationConfig = bVar10;
        this.flash = bVar11;
        this.bottomTab = bVar12;
        this.wideCamera = bVar13;
        this.disableRecordDuration = bVar14;
    }

    public /* synthetic */ RecordToolbarViewState(C44403b bVar, C44403b bVar2, C44412h hVar, C44412h hVar2, C44403b bVar3, C44403b bVar4, C44403b bVar5, C44403b bVar6, C44403b bVar7, C44403b bVar8, C44403b bVar9, C44403b bVar10, C44403b bVar11, C44403b bVar12, C44403b bVar13, C44403b bVar14, int i, C7571f fVar) {
        C44403b bVar15;
        C44403b bVar16;
        C44412h hVar3;
        C44412h hVar4;
        C44403b bVar17;
        C44403b bVar18;
        C44403b bVar19;
        C44403b bVar20;
        C44403b bVar21;
        C44403b bVar22;
        C44403b bVar23;
        C44403b bVar24;
        C44403b bVar25;
        C44403b bVar26;
        C44403b bVar27;
        C44403b bVar28;
        int i2 = i;
        if ((i2 & 1) != 0) {
            bVar15 = null;
        } else {
            bVar15 = bVar;
        }
        if ((i2 & 2) != 0) {
            bVar16 = null;
        } else {
            bVar16 = bVar2;
        }
        if ((i2 & 4) != 0) {
            hVar3 = null;
        } else {
            hVar3 = hVar;
        }
        if ((i2 & 8) != 0) {
            hVar4 = null;
        } else {
            hVar4 = hVar2;
        }
        if ((i2 & 16) != 0) {
            bVar17 = null;
        } else {
            bVar17 = bVar3;
        }
        if ((i2 & 32) != 0) {
            bVar18 = null;
        } else {
            bVar18 = bVar4;
        }
        if ((i2 & 64) != 0) {
            bVar19 = null;
        } else {
            bVar19 = bVar5;
        }
        if ((i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            bVar20 = null;
        } else {
            bVar20 = bVar6;
        }
        if ((i2 & 256) != 0) {
            bVar21 = null;
        } else {
            bVar21 = bVar7;
        }
        if ((i2 & 512) != 0) {
            bVar22 = null;
        } else {
            bVar22 = bVar8;
        }
        if ((i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            bVar23 = null;
        } else {
            bVar23 = bVar9;
        }
        if ((i2 & 2048) != 0) {
            bVar24 = null;
        } else {
            bVar24 = bVar10;
        }
        if ((i2 & 4096) != 0) {
            bVar25 = null;
        } else {
            bVar25 = bVar11;
        }
        if ((i2 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0) {
            bVar26 = null;
        } else {
            bVar26 = bVar12;
        }
        if ((i2 & 16384) != 0) {
            bVar27 = null;
        } else {
            bVar27 = bVar13;
        }
        if ((i2 & 32768) != 0) {
            bVar28 = null;
        } else {
            bVar28 = bVar14;
        }
        this(bVar15, bVar16, hVar3, hVar4, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23, bVar24, bVar25, bVar26, bVar27, bVar28);
    }
}
