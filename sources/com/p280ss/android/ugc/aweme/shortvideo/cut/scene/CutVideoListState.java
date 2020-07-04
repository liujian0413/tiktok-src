package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.gamora.jedi.C44404c;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListState */
public final class CutVideoListState implements C11670t {
    private final C44404c animateRecyclerViewEvent;
    private final Boolean cancelEnable;
    private final C44412h deleteSegEvent;
    private final C44404c dismissSegAnimateEvent;
    private final C44404c dismissSingleAnimateEvent;
    private final Boolean saveEnable;
    private final C44404c showSegAnimateEvent;
    private final C44404c showSingleAnimateEvent;
    private final Boolean singleVideoEditVisible;
    private final C44404c updateSpeedCheckEvent;

    public CutVideoListState() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ CutVideoListState copy$default(CutVideoListState cutVideoListState, C44412h hVar, C44404c cVar, Boolean bool, Boolean bool2, C44404c cVar2, C44404c cVar3, C44404c cVar4, C44404c cVar5, Boolean bool3, C44404c cVar6, int i, Object obj) {
        CutVideoListState cutVideoListState2 = cutVideoListState;
        int i2 = i;
        return cutVideoListState.copy((i2 & 1) != 0 ? cutVideoListState2.deleteSegEvent : hVar, (i2 & 2) != 0 ? cutVideoListState2.updateSpeedCheckEvent : cVar, (i2 & 4) != 0 ? cutVideoListState2.saveEnable : bool, (i2 & 8) != 0 ? cutVideoListState2.cancelEnable : bool2, (i2 & 16) != 0 ? cutVideoListState2.showSegAnimateEvent : cVar2, (i2 & 32) != 0 ? cutVideoListState2.dismissSegAnimateEvent : cVar3, (i2 & 64) != 0 ? cutVideoListState2.showSingleAnimateEvent : cVar4, (i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? cutVideoListState2.dismissSingleAnimateEvent : cVar5, (i2 & 256) != 0 ? cutVideoListState2.singleVideoEditVisible : bool3, (i2 & 512) != 0 ? cutVideoListState2.animateRecyclerViewEvent : cVar6);
    }

    public final C44412h component1() {
        return this.deleteSegEvent;
    }

    public final C44404c component10() {
        return this.animateRecyclerViewEvent;
    }

    public final C44404c component2() {
        return this.updateSpeedCheckEvent;
    }

    public final Boolean component3() {
        return this.saveEnable;
    }

    public final Boolean component4() {
        return this.cancelEnable;
    }

    public final C44404c component5() {
        return this.showSegAnimateEvent;
    }

    public final C44404c component6() {
        return this.dismissSegAnimateEvent;
    }

    public final C44404c component7() {
        return this.showSingleAnimateEvent;
    }

    public final C44404c component8() {
        return this.dismissSingleAnimateEvent;
    }

    public final Boolean component9() {
        return this.singleVideoEditVisible;
    }

    public final CutVideoListState copy(C44412h hVar, C44404c cVar, Boolean bool, Boolean bool2, C44404c cVar2, C44404c cVar3, C44404c cVar4, C44404c cVar5, Boolean bool3, C44404c cVar6) {
        CutVideoListState cutVideoListState = new CutVideoListState(hVar, cVar, bool, bool2, cVar2, cVar3, cVar4, cVar5, bool3, cVar6);
        return cutVideoListState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.animateRecyclerViewEvent, (java.lang.Object) r3.animateRecyclerViewEvent) != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x006f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListState
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListState r3 = (com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListState) r3
            com.ss.android.ugc.gamora.jedi.h r0 = r2.deleteSegEvent
            com.ss.android.ugc.gamora.jedi.h r1 = r3.deleteSegEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.gamora.jedi.c r0 = r2.updateSpeedCheckEvent
            com.ss.android.ugc.gamora.jedi.c r1 = r3.updateSpeedCheckEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.Boolean r0 = r2.saveEnable
            java.lang.Boolean r1 = r3.saveEnable
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.Boolean r0 = r2.cancelEnable
            java.lang.Boolean r1 = r3.cancelEnable
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.gamora.jedi.c r0 = r2.showSegAnimateEvent
            com.ss.android.ugc.gamora.jedi.c r1 = r3.showSegAnimateEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.gamora.jedi.c r0 = r2.dismissSegAnimateEvent
            com.ss.android.ugc.gamora.jedi.c r1 = r3.dismissSegAnimateEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.gamora.jedi.c r0 = r2.showSingleAnimateEvent
            com.ss.android.ugc.gamora.jedi.c r1 = r3.showSingleAnimateEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.gamora.jedi.c r0 = r2.dismissSingleAnimateEvent
            com.ss.android.ugc.gamora.jedi.c r1 = r3.dismissSingleAnimateEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.Boolean r0 = r2.singleVideoEditVisible
            java.lang.Boolean r1 = r3.singleVideoEditVisible
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.gamora.jedi.c r0 = r2.animateRecyclerViewEvent
            com.ss.android.ugc.gamora.jedi.c r3 = r3.animateRecyclerViewEvent
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r3 = 0
            return r3
        L_0x006f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListState.equals(java.lang.Object):boolean");
    }

    public final C44404c getAnimateRecyclerViewEvent() {
        return this.animateRecyclerViewEvent;
    }

    public final Boolean getCancelEnable() {
        return this.cancelEnable;
    }

    public final C44412h getDeleteSegEvent() {
        return this.deleteSegEvent;
    }

    public final C44404c getDismissSegAnimateEvent() {
        return this.dismissSegAnimateEvent;
    }

    public final C44404c getDismissSingleAnimateEvent() {
        return this.dismissSingleAnimateEvent;
    }

    public final Boolean getSaveEnable() {
        return this.saveEnable;
    }

    public final C44404c getShowSegAnimateEvent() {
        return this.showSegAnimateEvent;
    }

    public final C44404c getShowSingleAnimateEvent() {
        return this.showSingleAnimateEvent;
    }

    public final Boolean getSingleVideoEditVisible() {
        return this.singleVideoEditVisible;
    }

    public final C44404c getUpdateSpeedCheckEvent() {
        return this.updateSpeedCheckEvent;
    }

    public final int hashCode() {
        C44412h hVar = this.deleteSegEvent;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        C44404c cVar = this.updateSpeedCheckEvent;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Boolean bool = this.saveEnable;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.cancelEnable;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        C44404c cVar2 = this.showSegAnimateEvent;
        int hashCode5 = (hashCode4 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        C44404c cVar3 = this.dismissSegAnimateEvent;
        int hashCode6 = (hashCode5 + (cVar3 != null ? cVar3.hashCode() : 0)) * 31;
        C44404c cVar4 = this.showSingleAnimateEvent;
        int hashCode7 = (hashCode6 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31;
        C44404c cVar5 = this.dismissSingleAnimateEvent;
        int hashCode8 = (hashCode7 + (cVar5 != null ? cVar5.hashCode() : 0)) * 31;
        Boolean bool3 = this.singleVideoEditVisible;
        int hashCode9 = (hashCode8 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        C44404c cVar6 = this.animateRecyclerViewEvent;
        if (cVar6 != null) {
            i = cVar6.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CutVideoListState(deleteSegEvent=");
        sb.append(this.deleteSegEvent);
        sb.append(", updateSpeedCheckEvent=");
        sb.append(this.updateSpeedCheckEvent);
        sb.append(", saveEnable=");
        sb.append(this.saveEnable);
        sb.append(", cancelEnable=");
        sb.append(this.cancelEnable);
        sb.append(", showSegAnimateEvent=");
        sb.append(this.showSegAnimateEvent);
        sb.append(", dismissSegAnimateEvent=");
        sb.append(this.dismissSegAnimateEvent);
        sb.append(", showSingleAnimateEvent=");
        sb.append(this.showSingleAnimateEvent);
        sb.append(", dismissSingleAnimateEvent=");
        sb.append(this.dismissSingleAnimateEvent);
        sb.append(", singleVideoEditVisible=");
        sb.append(this.singleVideoEditVisible);
        sb.append(", animateRecyclerViewEvent=");
        sb.append(this.animateRecyclerViewEvent);
        sb.append(")");
        return sb.toString();
    }

    public CutVideoListState(C44412h hVar, C44404c cVar, Boolean bool, Boolean bool2, C44404c cVar2, C44404c cVar3, C44404c cVar4, C44404c cVar5, Boolean bool3, C44404c cVar6) {
        this.deleteSegEvent = hVar;
        this.updateSpeedCheckEvent = cVar;
        this.saveEnable = bool;
        this.cancelEnable = bool2;
        this.showSegAnimateEvent = cVar2;
        this.dismissSegAnimateEvent = cVar3;
        this.showSingleAnimateEvent = cVar4;
        this.dismissSingleAnimateEvent = cVar5;
        this.singleVideoEditVisible = bool3;
        this.animateRecyclerViewEvent = cVar6;
    }

    public /* synthetic */ CutVideoListState(C44412h hVar, C44404c cVar, Boolean bool, Boolean bool2, C44404c cVar2, C44404c cVar3, C44404c cVar4, C44404c cVar5, Boolean bool3, C44404c cVar6, int i, C7571f fVar) {
        C44412h hVar2;
        C44404c cVar7;
        Boolean bool4;
        Boolean bool5;
        C44404c cVar8;
        C44404c cVar9;
        C44404c cVar10;
        C44404c cVar11;
        Boolean bool6;
        int i2 = i;
        C44404c cVar12 = null;
        if ((i2 & 1) != 0) {
            hVar2 = null;
        } else {
            hVar2 = hVar;
        }
        if ((i2 & 2) != 0) {
            cVar7 = null;
        } else {
            cVar7 = cVar;
        }
        if ((i2 & 4) != 0) {
            bool4 = null;
        } else {
            bool4 = bool;
        }
        if ((i2 & 8) != 0) {
            bool5 = null;
        } else {
            bool5 = bool2;
        }
        if ((i2 & 16) != 0) {
            cVar8 = null;
        } else {
            cVar8 = cVar2;
        }
        if ((i2 & 32) != 0) {
            cVar9 = null;
        } else {
            cVar9 = cVar3;
        }
        if ((i2 & 64) != 0) {
            cVar10 = null;
        } else {
            cVar10 = cVar4;
        }
        if ((i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            cVar11 = null;
        } else {
            cVar11 = cVar5;
        }
        if ((i2 & 256) != 0) {
            bool6 = null;
        } else {
            bool6 = bool3;
        }
        if ((i2 & 512) == 0) {
            cVar12 = cVar6;
        }
        this(hVar2, cVar7, bool4, bool5, cVar8, cVar9, cVar10, cVar11, bool6, cVar12);
    }
}
