package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.C44409e;
import com.p280ss.android.ugc.gamora.jedi.C44410f;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.EditState */
public final class EditState implements C11670t {
    private final C44412h nextStepEvent;
    private final C44412h quitEvent;
    private final C44410f<Boolean, Boolean> showSettingEvent;
    private final C44409e toolBarClickEvent;
    private final C44412h updateStickerLayoutEvent;
    private final Integer viewStubTopMargin;

    public EditState() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.f, code=com.ss.android.ugc.gamora.jedi.f<java.lang.Boolean, java.lang.Boolean>, for r8v0, types: [com.ss.android.ugc.gamora.jedi.f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.gamora.editor.EditState copy$default(com.p280ss.android.ugc.gamora.editor.EditState r4, com.p280ss.android.ugc.gamora.jedi.C44412h r5, com.p280ss.android.ugc.gamora.jedi.C44412h r6, com.p280ss.android.ugc.gamora.jedi.C44409e r7, com.p280ss.android.ugc.gamora.jedi.C44410f<java.lang.Boolean, java.lang.Boolean> r8, java.lang.Integer r9, com.p280ss.android.ugc.gamora.jedi.C44412h r10, int r11, java.lang.Object r12) {
        /*
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            com.ss.android.ugc.gamora.jedi.h r5 = r4.quitEvent
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000c
            com.ss.android.ugc.gamora.jedi.h r6 = r4.nextStepEvent
        L_0x000c:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            com.ss.android.ugc.gamora.jedi.e r7 = r4.toolBarClickEvent
        L_0x0013:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            com.ss.android.ugc.gamora.jedi.f<java.lang.Boolean, java.lang.Boolean> r8 = r4.showSettingEvent
        L_0x001a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            java.lang.Integer r9 = r4.viewStubTopMargin
        L_0x0021:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0028
            com.ss.android.ugc.gamora.jedi.h r10 = r4.updateStickerLayoutEvent
        L_0x0028:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            com.ss.android.ugc.gamora.editor.EditState r4 = r6.copy(r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditState.copy$default(com.ss.android.ugc.gamora.editor.EditState, com.ss.android.ugc.gamora.jedi.h, com.ss.android.ugc.gamora.jedi.h, com.ss.android.ugc.gamora.jedi.e, com.ss.android.ugc.gamora.jedi.f, java.lang.Integer, com.ss.android.ugc.gamora.jedi.h, int, java.lang.Object):com.ss.android.ugc.gamora.editor.EditState");
    }

    public final C44412h component1() {
        return this.quitEvent;
    }

    public final C44412h component2() {
        return this.nextStepEvent;
    }

    public final C44409e component3() {
        return this.toolBarClickEvent;
    }

    public final C44410f<Boolean, Boolean> component4() {
        return this.showSettingEvent;
    }

    public final Integer component5() {
        return this.viewStubTopMargin;
    }

    public final C44412h component6() {
        return this.updateStickerLayoutEvent;
    }

    public final EditState copy(C44412h hVar, C44412h hVar2, C44409e eVar, C44410f<Boolean, Boolean> fVar, Integer num, C44412h hVar3) {
        EditState editState = new EditState(hVar, hVar2, eVar, fVar, num, hVar3);
        return editState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.updateStickerLayoutEvent, (java.lang.Object) r3.updateStickerLayoutEvent) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.p280ss.android.ugc.gamora.editor.EditState
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.gamora.editor.EditState r3 = (com.p280ss.android.ugc.gamora.editor.EditState) r3
            com.ss.android.ugc.gamora.jedi.h r0 = r2.quitEvent
            com.ss.android.ugc.gamora.jedi.h r1 = r3.quitEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.gamora.jedi.h r0 = r2.nextStepEvent
            com.ss.android.ugc.gamora.jedi.h r1 = r3.nextStepEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.gamora.jedi.e r0 = r2.toolBarClickEvent
            com.ss.android.ugc.gamora.jedi.e r1 = r3.toolBarClickEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.gamora.jedi.f<java.lang.Boolean, java.lang.Boolean> r0 = r2.showSettingEvent
            com.ss.android.ugc.gamora.jedi.f<java.lang.Boolean, java.lang.Boolean> r1 = r3.showSettingEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.Integer r0 = r2.viewStubTopMargin
            java.lang.Integer r1 = r3.viewStubTopMargin
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.gamora.jedi.h r0 = r2.updateStickerLayoutEvent
            com.ss.android.ugc.gamora.jedi.h r3 = r3.updateStickerLayoutEvent
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditState.equals(java.lang.Object):boolean");
    }

    public final C44412h getNextStepEvent() {
        return this.nextStepEvent;
    }

    public final C44412h getQuitEvent() {
        return this.quitEvent;
    }

    public final C44410f<Boolean, Boolean> getShowSettingEvent() {
        return this.showSettingEvent;
    }

    public final C44409e getToolBarClickEvent() {
        return this.toolBarClickEvent;
    }

    public final C44412h getUpdateStickerLayoutEvent() {
        return this.updateStickerLayoutEvent;
    }

    public final Integer getViewStubTopMargin() {
        return this.viewStubTopMargin;
    }

    public final int hashCode() {
        C44412h hVar = this.quitEvent;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        C44412h hVar2 = this.nextStepEvent;
        int hashCode2 = (hashCode + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        C44409e eVar = this.toolBarClickEvent;
        int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        C44410f<Boolean, Boolean> fVar = this.showSettingEvent;
        int hashCode4 = (hashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        Integer num = this.viewStubTopMargin;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        C44412h hVar3 = this.updateStickerLayoutEvent;
        if (hVar3 != null) {
            i = hVar3.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditState(quitEvent=");
        sb.append(this.quitEvent);
        sb.append(", nextStepEvent=");
        sb.append(this.nextStepEvent);
        sb.append(", toolBarClickEvent=");
        sb.append(this.toolBarClickEvent);
        sb.append(", showSettingEvent=");
        sb.append(this.showSettingEvent);
        sb.append(", viewStubTopMargin=");
        sb.append(this.viewStubTopMargin);
        sb.append(", updateStickerLayoutEvent=");
        sb.append(this.updateStickerLayoutEvent);
        sb.append(")");
        return sb.toString();
    }

    public EditState(C44412h hVar, C44412h hVar2, C44409e eVar, C44410f<Boolean, Boolean> fVar, Integer num, C44412h hVar3) {
        this.quitEvent = hVar;
        this.nextStepEvent = hVar2;
        this.toolBarClickEvent = eVar;
        this.showSettingEvent = fVar;
        this.viewStubTopMargin = num;
        this.updateStickerLayoutEvent = hVar3;
    }

    public /* synthetic */ EditState(C44412h hVar, C44412h hVar2, C44409e eVar, C44410f fVar, Integer num, C44412h hVar3, int i, C7571f fVar2) {
        C44412h hVar4;
        C44412h hVar5;
        C44409e eVar2;
        C44410f fVar3;
        Integer num2;
        C44412h hVar6;
        if ((i & 1) != 0) {
            hVar4 = null;
        } else {
            hVar4 = hVar;
        }
        if ((i & 2) != 0) {
            hVar5 = null;
        } else {
            hVar5 = hVar2;
        }
        if ((i & 4) != 0) {
            eVar2 = null;
        } else {
            eVar2 = eVar;
        }
        if ((i & 8) != 0) {
            fVar3 = null;
        } else {
            fVar3 = fVar;
        }
        if ((i & 16) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i & 32) != 0) {
            hVar6 = null;
        } else {
            hVar6 = hVar3;
        }
        this(hVar4, hVar5, eVar2, fVar3, num2, hVar6);
    }
}
