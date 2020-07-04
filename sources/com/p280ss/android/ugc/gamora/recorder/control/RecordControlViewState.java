package com.p280ss.android.ugc.gamora.recorder.control;

import android.view.animation.Animation;
import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.recorder.control.RecordControlViewState */
public final class RecordControlViewState implements C11670t {
    private final Integer deleteLastVisibility;
    private final C44412h dismissSuperEntranceEvent;
    private final Integer effectContainerVisibility;
    private final Boolean goNextSelected;
    private final Integer goNextVisibility;
    private final C44403b<Boolean> manuallySetRecording;
    private final String musicPath;
    private final Boolean needNoTouchListener;
    private final Boolean recordEnable;
    private final Pair<Integer, Boolean> recordMode;
    private final C44403b<Integer> recordOnlySetMode;
    private final C44412h recordReset;
    private final C44412h recordStartAnim;
    private final Animation recordStartAnimation;
    private final Integer recordVisibility;
    private final C44412h takePhoto;
    private final C44412h touchEvent;
    private final Integer uploadVisibility;

    public RecordControlViewState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public static /* synthetic */ RecordControlViewState copy$default(RecordControlViewState recordControlViewState, Pair pair, C44403b bVar, Boolean bool, C44412h hVar, Integer num, Animation animation, C44412h hVar2, C44403b bVar2, Integer num2, Boolean bool2, Integer num3, Integer num4, Integer num5, String str, Boolean bool3, C44412h hVar3, C44412h hVar4, C44412h hVar5, int i, Object obj) {
        Boolean bool4;
        C44412h hVar6;
        C44412h hVar7;
        C44412h hVar8;
        RecordControlViewState recordControlViewState2 = recordControlViewState;
        int i2 = i;
        Pair pair2 = (i2 & 1) != 0 ? recordControlViewState2.recordMode : pair;
        C44403b bVar3 = (i2 & 2) != 0 ? recordControlViewState2.recordOnlySetMode : bVar;
        Boolean bool5 = (i2 & 4) != 0 ? recordControlViewState2.recordEnable : bool;
        C44412h hVar9 = (i2 & 8) != 0 ? recordControlViewState2.recordReset : hVar;
        Integer num6 = (i2 & 16) != 0 ? recordControlViewState2.recordVisibility : num;
        Animation animation2 = (i2 & 32) != 0 ? recordControlViewState2.recordStartAnimation : animation;
        C44412h hVar10 = (i2 & 64) != 0 ? recordControlViewState2.recordStartAnim : hVar2;
        C44403b bVar4 = (i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? recordControlViewState2.manuallySetRecording : bVar2;
        Integer num7 = (i2 & 256) != 0 ? recordControlViewState2.effectContainerVisibility : num2;
        Boolean bool6 = (i2 & 512) != 0 ? recordControlViewState2.goNextSelected : bool2;
        Integer num8 = (i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? recordControlViewState2.goNextVisibility : num3;
        Integer num9 = (i2 & 2048) != 0 ? recordControlViewState2.deleteLastVisibility : num4;
        Integer num10 = (i2 & 4096) != 0 ? recordControlViewState2.uploadVisibility : num5;
        String str2 = (i2 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0 ? recordControlViewState2.musicPath : str;
        Boolean bool7 = (i2 & 16384) != 0 ? recordControlViewState2.needNoTouchListener : bool3;
        if ((i2 & 32768) != 0) {
            bool4 = bool7;
            hVar6 = recordControlViewState2.touchEvent;
        } else {
            bool4 = bool7;
            hVar6 = hVar3;
        }
        if ((i2 & 65536) != 0) {
            hVar7 = hVar6;
            hVar8 = recordControlViewState2.takePhoto;
        } else {
            hVar7 = hVar6;
            hVar8 = hVar4;
        }
        return recordControlViewState.copy(pair2, bVar3, bool5, hVar9, num6, animation2, hVar10, bVar4, num7, bool6, num8, num9, num10, str2, bool4, hVar7, hVar8, (i2 & 131072) != 0 ? recordControlViewState2.dismissSuperEntranceEvent : hVar5);
    }

    public final Pair<Integer, Boolean> component1() {
        return this.recordMode;
    }

    public final Boolean component10() {
        return this.goNextSelected;
    }

    public final Integer component11() {
        return this.goNextVisibility;
    }

    public final Integer component12() {
        return this.deleteLastVisibility;
    }

    public final Integer component13() {
        return this.uploadVisibility;
    }

    public final String component14() {
        return this.musicPath;
    }

    public final Boolean component15() {
        return this.needNoTouchListener;
    }

    public final C44412h component16() {
        return this.touchEvent;
    }

    public final C44412h component17() {
        return this.takePhoto;
    }

    public final C44412h component18() {
        return this.dismissSuperEntranceEvent;
    }

    public final C44403b<Integer> component2() {
        return this.recordOnlySetMode;
    }

    public final Boolean component3() {
        return this.recordEnable;
    }

    public final C44412h component4() {
        return this.recordReset;
    }

    public final Integer component5() {
        return this.recordVisibility;
    }

    public final Animation component6() {
        return this.recordStartAnimation;
    }

    public final C44412h component7() {
        return this.recordStartAnim;
    }

    public final C44403b<Boolean> component8() {
        return this.manuallySetRecording;
    }

    public final Integer component9() {
        return this.effectContainerVisibility;
    }

    public final RecordControlViewState copy(Pair<Integer, Boolean> pair, C44403b<Integer> bVar, Boolean bool, C44412h hVar, Integer num, Animation animation, C44412h hVar2, C44403b<Boolean> bVar2, Integer num2, Boolean bool2, Integer num3, Integer num4, Integer num5, String str, Boolean bool3, C44412h hVar3, C44412h hVar4, C44412h hVar5) {
        RecordControlViewState recordControlViewState = new RecordControlViewState(pair, bVar, bool, hVar, num, animation, hVar2, bVar2, num2, bool2, num3, num4, num5, str, bool3, hVar3, hVar4, hVar5);
        return recordControlViewState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ba, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.dismissSuperEntranceEvent, (java.lang.Object) r3.dismissSuperEntranceEvent) != false) goto L_0x00bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x00bf
            boolean r0 = r3 instanceof com.p280ss.android.ugc.gamora.recorder.control.RecordControlViewState
            if (r0 == 0) goto L_0x00bd
            com.ss.android.ugc.gamora.recorder.control.RecordControlViewState r3 = (com.p280ss.android.ugc.gamora.recorder.control.RecordControlViewState) r3
            kotlin.Pair<java.lang.Integer, java.lang.Boolean> r0 = r2.recordMode
            kotlin.Pair<java.lang.Integer, java.lang.Boolean> r1 = r3.recordMode
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            com.ss.android.ugc.gamora.jedi.b<java.lang.Integer> r0 = r2.recordOnlySetMode
            com.ss.android.ugc.gamora.jedi.b<java.lang.Integer> r1 = r3.recordOnlySetMode
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            java.lang.Boolean r0 = r2.recordEnable
            java.lang.Boolean r1 = r3.recordEnable
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            com.ss.android.ugc.gamora.jedi.h r0 = r2.recordReset
            com.ss.android.ugc.gamora.jedi.h r1 = r3.recordReset
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            java.lang.Integer r0 = r2.recordVisibility
            java.lang.Integer r1 = r3.recordVisibility
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            android.view.animation.Animation r0 = r2.recordStartAnimation
            android.view.animation.Animation r1 = r3.recordStartAnimation
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            com.ss.android.ugc.gamora.jedi.h r0 = r2.recordStartAnim
            com.ss.android.ugc.gamora.jedi.h r1 = r3.recordStartAnim
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            com.ss.android.ugc.gamora.jedi.b<java.lang.Boolean> r0 = r2.manuallySetRecording
            com.ss.android.ugc.gamora.jedi.b<java.lang.Boolean> r1 = r3.manuallySetRecording
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            java.lang.Integer r0 = r2.effectContainerVisibility
            java.lang.Integer r1 = r3.effectContainerVisibility
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            java.lang.Boolean r0 = r2.goNextSelected
            java.lang.Boolean r1 = r3.goNextSelected
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            java.lang.Integer r0 = r2.goNextVisibility
            java.lang.Integer r1 = r3.goNextVisibility
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            java.lang.Integer r0 = r2.deleteLastVisibility
            java.lang.Integer r1 = r3.deleteLastVisibility
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            java.lang.Integer r0 = r2.uploadVisibility
            java.lang.Integer r1 = r3.uploadVisibility
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r2.musicPath
            java.lang.String r1 = r3.musicPath
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            java.lang.Boolean r0 = r2.needNoTouchListener
            java.lang.Boolean r1 = r3.needNoTouchListener
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            com.ss.android.ugc.gamora.jedi.h r0 = r2.touchEvent
            com.ss.android.ugc.gamora.jedi.h r1 = r3.touchEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            com.ss.android.ugc.gamora.jedi.h r0 = r2.takePhoto
            com.ss.android.ugc.gamora.jedi.h r1 = r3.takePhoto
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00bd
            com.ss.android.ugc.gamora.jedi.h r0 = r2.dismissSuperEntranceEvent
            com.ss.android.ugc.gamora.jedi.h r3 = r3.dismissSuperEntranceEvent
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            r3 = 0
            return r3
        L_0x00bf:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.recorder.control.RecordControlViewState.equals(java.lang.Object):boolean");
    }

    public final Integer getDeleteLastVisibility() {
        return this.deleteLastVisibility;
    }

    public final C44412h getDismissSuperEntranceEvent() {
        return this.dismissSuperEntranceEvent;
    }

    public final Integer getEffectContainerVisibility() {
        return this.effectContainerVisibility;
    }

    public final Boolean getGoNextSelected() {
        return this.goNextSelected;
    }

    public final Integer getGoNextVisibility() {
        return this.goNextVisibility;
    }

    public final C44403b<Boolean> getManuallySetRecording() {
        return this.manuallySetRecording;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final Boolean getNeedNoTouchListener() {
        return this.needNoTouchListener;
    }

    public final Boolean getRecordEnable() {
        return this.recordEnable;
    }

    public final Pair<Integer, Boolean> getRecordMode() {
        return this.recordMode;
    }

    public final C44403b<Integer> getRecordOnlySetMode() {
        return this.recordOnlySetMode;
    }

    public final C44412h getRecordReset() {
        return this.recordReset;
    }

    public final C44412h getRecordStartAnim() {
        return this.recordStartAnim;
    }

    public final Animation getRecordStartAnimation() {
        return this.recordStartAnimation;
    }

    public final Integer getRecordVisibility() {
        return this.recordVisibility;
    }

    public final C44412h getTakePhoto() {
        return this.takePhoto;
    }

    public final C44412h getTouchEvent() {
        return this.touchEvent;
    }

    public final Integer getUploadVisibility() {
        return this.uploadVisibility;
    }

    public final int hashCode() {
        Pair<Integer, Boolean> pair = this.recordMode;
        int i = 0;
        int hashCode = (pair != null ? pair.hashCode() : 0) * 31;
        C44403b<Integer> bVar = this.recordOnlySetMode;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        Boolean bool = this.recordEnable;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        C44412h hVar = this.recordReset;
        int hashCode4 = (hashCode3 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Integer num = this.recordVisibility;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Animation animation = this.recordStartAnimation;
        int hashCode6 = (hashCode5 + (animation != null ? animation.hashCode() : 0)) * 31;
        C44412h hVar2 = this.recordStartAnim;
        int hashCode7 = (hashCode6 + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        C44403b<Boolean> bVar2 = this.manuallySetRecording;
        int hashCode8 = (hashCode7 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        Integer num2 = this.effectContainerVisibility;
        int hashCode9 = (hashCode8 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Boolean bool2 = this.goNextSelected;
        int hashCode10 = (hashCode9 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Integer num3 = this.goNextVisibility;
        int hashCode11 = (hashCode10 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.deleteLastVisibility;
        int hashCode12 = (hashCode11 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.uploadVisibility;
        int hashCode13 = (hashCode12 + (num5 != null ? num5.hashCode() : 0)) * 31;
        String str = this.musicPath;
        int hashCode14 = (hashCode13 + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool3 = this.needNoTouchListener;
        int hashCode15 = (hashCode14 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        C44412h hVar3 = this.touchEvent;
        int hashCode16 = (hashCode15 + (hVar3 != null ? hVar3.hashCode() : 0)) * 31;
        C44412h hVar4 = this.takePhoto;
        int hashCode17 = (hashCode16 + (hVar4 != null ? hVar4.hashCode() : 0)) * 31;
        C44412h hVar5 = this.dismissSuperEntranceEvent;
        if (hVar5 != null) {
            i = hVar5.hashCode();
        }
        return hashCode17 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordControlViewState(recordMode=");
        sb.append(this.recordMode);
        sb.append(", recordOnlySetMode=");
        sb.append(this.recordOnlySetMode);
        sb.append(", recordEnable=");
        sb.append(this.recordEnable);
        sb.append(", recordReset=");
        sb.append(this.recordReset);
        sb.append(", recordVisibility=");
        sb.append(this.recordVisibility);
        sb.append(", recordStartAnimation=");
        sb.append(this.recordStartAnimation);
        sb.append(", recordStartAnim=");
        sb.append(this.recordStartAnim);
        sb.append(", manuallySetRecording=");
        sb.append(this.manuallySetRecording);
        sb.append(", effectContainerVisibility=");
        sb.append(this.effectContainerVisibility);
        sb.append(", goNextSelected=");
        sb.append(this.goNextSelected);
        sb.append(", goNextVisibility=");
        sb.append(this.goNextVisibility);
        sb.append(", deleteLastVisibility=");
        sb.append(this.deleteLastVisibility);
        sb.append(", uploadVisibility=");
        sb.append(this.uploadVisibility);
        sb.append(", musicPath=");
        sb.append(this.musicPath);
        sb.append(", needNoTouchListener=");
        sb.append(this.needNoTouchListener);
        sb.append(", touchEvent=");
        sb.append(this.touchEvent);
        sb.append(", takePhoto=");
        sb.append(this.takePhoto);
        sb.append(", dismissSuperEntranceEvent=");
        sb.append(this.dismissSuperEntranceEvent);
        sb.append(")");
        return sb.toString();
    }

    public RecordControlViewState(Pair<Integer, Boolean> pair, C44403b<Integer> bVar, Boolean bool, C44412h hVar, Integer num, Animation animation, C44412h hVar2, C44403b<Boolean> bVar2, Integer num2, Boolean bool2, Integer num3, Integer num4, Integer num5, String str, Boolean bool3, C44412h hVar3, C44412h hVar4, C44412h hVar5) {
        this.recordMode = pair;
        this.recordOnlySetMode = bVar;
        this.recordEnable = bool;
        this.recordReset = hVar;
        this.recordVisibility = num;
        this.recordStartAnimation = animation;
        this.recordStartAnim = hVar2;
        this.manuallySetRecording = bVar2;
        this.effectContainerVisibility = num2;
        this.goNextSelected = bool2;
        this.goNextVisibility = num3;
        this.deleteLastVisibility = num4;
        this.uploadVisibility = num5;
        this.musicPath = str;
        this.needNoTouchListener = bool3;
        this.touchEvent = hVar3;
        this.takePhoto = hVar4;
        this.dismissSuperEntranceEvent = hVar5;
    }

    public /* synthetic */ RecordControlViewState(Pair pair, C44403b bVar, Boolean bool, C44412h hVar, Integer num, Animation animation, C44412h hVar2, C44403b bVar2, Integer num2, Boolean bool2, Integer num3, Integer num4, Integer num5, String str, Boolean bool3, C44412h hVar3, C44412h hVar4, C44412h hVar5, int i, C7571f fVar) {
        Pair pair2;
        C44403b bVar3;
        Boolean bool4;
        C44412h hVar6;
        Integer num6;
        Animation animation2;
        C44412h hVar7;
        C44403b bVar4;
        Integer num7;
        Boolean bool5;
        Integer num8;
        Integer num9;
        Integer num10;
        String str2;
        Boolean bool6;
        C44412h hVar8;
        C44412h hVar9;
        C44412h hVar10;
        int i2 = i;
        if ((i2 & 1) != 0) {
            pair2 = null;
        } else {
            pair2 = pair;
        }
        if ((i2 & 2) != 0) {
            bVar3 = null;
        } else {
            bVar3 = bVar;
        }
        if ((i2 & 4) != 0) {
            bool4 = null;
        } else {
            bool4 = bool;
        }
        if ((i2 & 8) != 0) {
            hVar6 = null;
        } else {
            hVar6 = hVar;
        }
        if ((i2 & 16) != 0) {
            num6 = null;
        } else {
            num6 = num;
        }
        if ((i2 & 32) != 0) {
            animation2 = null;
        } else {
            animation2 = animation;
        }
        if ((i2 & 64) != 0) {
            hVar7 = null;
        } else {
            hVar7 = hVar2;
        }
        if ((i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            bVar4 = null;
        } else {
            bVar4 = bVar2;
        }
        if ((i2 & 256) != 0) {
            num7 = null;
        } else {
            num7 = num2;
        }
        if ((i2 & 512) != 0) {
            bool5 = null;
        } else {
            bool5 = bool2;
        }
        if ((i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            num8 = null;
        } else {
            num8 = num3;
        }
        if ((i2 & 2048) != 0) {
            num9 = null;
        } else {
            num9 = num4;
        }
        if ((i2 & 4096) != 0) {
            num10 = null;
        } else {
            num10 = num5;
        }
        if ((i2 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i2 & 16384) != 0) {
            bool6 = null;
        } else {
            bool6 = bool3;
        }
        if ((i2 & 32768) != 0) {
            hVar8 = null;
        } else {
            hVar8 = hVar3;
        }
        if ((i2 & 65536) != 0) {
            hVar9 = null;
        } else {
            hVar9 = hVar4;
        }
        if ((i2 & 131072) != 0) {
            hVar10 = null;
        } else {
            hVar10 = hVar5;
        }
        this(pair2, bVar3, bool4, hVar6, num6, animation2, hVar7, bVar4, num7, bool5, num8, num9, num10, str2, bool6, hVar8, hVar9, hVar10);
    }
}
