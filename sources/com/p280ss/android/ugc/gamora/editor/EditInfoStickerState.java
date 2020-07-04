package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44409e;
import com.p280ss.android.ugc.gamora.jedi.C44410f;
import com.p280ss.android.ugc.gamora.jedi.C44411g;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.EditInfoStickerState */
public final class EditInfoStickerState implements C11670t {
    private final C44403b<StickerItemModel> clickStickerItemEvent;
    private final C44410f<Float, Long> editViewAnimEvent;
    private final C44411g<Float, Float, Float> editViewLayoutEvent;
    private final C44412h hideHelpBoxEvent;
    private final C44409e resetVideoLengthEvent;

    public EditInfoStickerState() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.b, code=com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.infosticker.StickerItemModel>, for r6v0, types: [com.ss.android.ugc.gamora.jedi.b] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.f, code=com.ss.android.ugc.gamora.jedi.f<java.lang.Float, java.lang.Long>, for r7v0, types: [com.ss.android.ugc.gamora.jedi.f] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.g, code=com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float>, for r8v0, types: [com.ss.android.ugc.gamora.jedi.g] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.gamora.editor.EditInfoStickerState copy$default(com.p280ss.android.ugc.gamora.editor.EditInfoStickerState r3, com.p280ss.android.ugc.gamora.jedi.C44412h r4, com.p280ss.android.ugc.gamora.jedi.C44409e r5, com.p280ss.android.ugc.gamora.jedi.C44403b<com.p280ss.android.ugc.aweme.infosticker.StickerItemModel> r6, com.p280ss.android.ugc.gamora.jedi.C44410f<java.lang.Float, java.lang.Long> r7, com.p280ss.android.ugc.gamora.jedi.C44411g<java.lang.Float, java.lang.Float, java.lang.Float> r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            com.ss.android.ugc.gamora.jedi.h r4 = r3.hideHelpBoxEvent
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            com.ss.android.ugc.gamora.jedi.e r5 = r3.resetVideoLengthEvent
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.infosticker.StickerItemModel> r6 = r3.clickStickerItemEvent
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            com.ss.android.ugc.gamora.jedi.f<java.lang.Float, java.lang.Long> r7 = r3.editViewAnimEvent
        L_0x001a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float> r8 = r3.editViewLayoutEvent
        L_0x0021:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            com.ss.android.ugc.gamora.editor.EditInfoStickerState r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditInfoStickerState.copy$default(com.ss.android.ugc.gamora.editor.EditInfoStickerState, com.ss.android.ugc.gamora.jedi.h, com.ss.android.ugc.gamora.jedi.e, com.ss.android.ugc.gamora.jedi.b, com.ss.android.ugc.gamora.jedi.f, com.ss.android.ugc.gamora.jedi.g, int, java.lang.Object):com.ss.android.ugc.gamora.editor.EditInfoStickerState");
    }

    public final C44412h component1() {
        return this.hideHelpBoxEvent;
    }

    public final C44409e component2() {
        return this.resetVideoLengthEvent;
    }

    public final C44403b<StickerItemModel> component3() {
        return this.clickStickerItemEvent;
    }

    public final C44410f<Float, Long> component4() {
        return this.editViewAnimEvent;
    }

    public final C44411g<Float, Float, Float> component5() {
        return this.editViewLayoutEvent;
    }

    public final EditInfoStickerState copy(C44412h hVar, C44409e eVar, C44403b<? extends StickerItemModel> bVar, C44410f<Float, Long> fVar, C44411g<Float, Float, Float> gVar) {
        EditInfoStickerState editInfoStickerState = new EditInfoStickerState(hVar, eVar, bVar, fVar, gVar);
        return editInfoStickerState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.editViewLayoutEvent, (java.lang.Object) r3.editViewLayoutEvent) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p280ss.android.ugc.gamora.editor.EditInfoStickerState
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.editor.EditInfoStickerState r3 = (com.p280ss.android.ugc.gamora.editor.EditInfoStickerState) r3
            com.ss.android.ugc.gamora.jedi.h r0 = r2.hideHelpBoxEvent
            com.ss.android.ugc.gamora.jedi.h r1 = r3.hideHelpBoxEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.e r0 = r2.resetVideoLengthEvent
            com.ss.android.ugc.gamora.jedi.e r1 = r3.resetVideoLengthEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.infosticker.StickerItemModel> r0 = r2.clickStickerItemEvent
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.infosticker.StickerItemModel> r1 = r3.clickStickerItemEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.f<java.lang.Float, java.lang.Long> r0 = r2.editViewAnimEvent
            com.ss.android.ugc.gamora.jedi.f<java.lang.Float, java.lang.Long> r1 = r3.editViewAnimEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float> r0 = r2.editViewLayoutEvent
            com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float> r3 = r3.editViewLayoutEvent
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditInfoStickerState.equals(java.lang.Object):boolean");
    }

    public final C44403b<StickerItemModel> getClickStickerItemEvent() {
        return this.clickStickerItemEvent;
    }

    public final C44410f<Float, Long> getEditViewAnimEvent() {
        return this.editViewAnimEvent;
    }

    public final C44411g<Float, Float, Float> getEditViewLayoutEvent() {
        return this.editViewLayoutEvent;
    }

    public final C44412h getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final C44409e getResetVideoLengthEvent() {
        return this.resetVideoLengthEvent;
    }

    public final int hashCode() {
        C44412h hVar = this.hideHelpBoxEvent;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        C44409e eVar = this.resetVideoLengthEvent;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        C44403b<StickerItemModel> bVar = this.clickStickerItemEvent;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        C44410f<Float, Long> fVar = this.editViewAnimEvent;
        int hashCode4 = (hashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C44411g<Float, Float, Float> gVar = this.editViewLayoutEvent;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditInfoStickerState(hideHelpBoxEvent=");
        sb.append(this.hideHelpBoxEvent);
        sb.append(", resetVideoLengthEvent=");
        sb.append(this.resetVideoLengthEvent);
        sb.append(", clickStickerItemEvent=");
        sb.append(this.clickStickerItemEvent);
        sb.append(", editViewAnimEvent=");
        sb.append(this.editViewAnimEvent);
        sb.append(", editViewLayoutEvent=");
        sb.append(this.editViewLayoutEvent);
        sb.append(")");
        return sb.toString();
    }

    public EditInfoStickerState(C44412h hVar, C44409e eVar, C44403b<? extends StickerItemModel> bVar, C44410f<Float, Long> fVar, C44411g<Float, Float, Float> gVar) {
        this.hideHelpBoxEvent = hVar;
        this.resetVideoLengthEvent = eVar;
        this.clickStickerItemEvent = bVar;
        this.editViewAnimEvent = fVar;
        this.editViewLayoutEvent = gVar;
    }

    public /* synthetic */ EditInfoStickerState(C44412h hVar, C44409e eVar, C44403b bVar, C44410f fVar, C44411g gVar, int i, C7571f fVar2) {
        C44412h hVar2;
        C44409e eVar2;
        C44403b bVar2;
        C44410f fVar3;
        C44411g gVar2;
        if ((i & 1) != 0) {
            hVar2 = null;
        } else {
            hVar2 = hVar;
        }
        if ((i & 2) != 0) {
            eVar2 = null;
        } else {
            eVar2 = eVar;
        }
        if ((i & 4) != 0) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        if ((i & 8) != 0) {
            fVar3 = null;
        } else {
            fVar3 = fVar;
        }
        if ((i & 16) != 0) {
            gVar2 = null;
        } else {
            gVar2 = gVar;
        }
        this(hVar2, eVar2, bVar2, fVar3, gVar2);
    }
}
