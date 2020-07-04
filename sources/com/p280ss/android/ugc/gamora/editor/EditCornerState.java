package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.EditCornerState */
public final class EditCornerState implements C11670t {
    private final Integer bottomMargin;
    private final Boolean cornerVisible;
    private final Integer topMargin;

    public EditCornerState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ EditCornerState copy$default(EditCornerState editCornerState, Boolean bool, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = editCornerState.cornerVisible;
        }
        if ((i & 2) != 0) {
            num = editCornerState.topMargin;
        }
        if ((i & 4) != 0) {
            num2 = editCornerState.bottomMargin;
        }
        return editCornerState.copy(bool, num, num2);
    }

    public final Boolean component1() {
        return this.cornerVisible;
    }

    public final Integer component2() {
        return this.topMargin;
    }

    public final Integer component3() {
        return this.bottomMargin;
    }

    public final EditCornerState copy(Boolean bool, Integer num, Integer num2) {
        return new EditCornerState(bool, num, num2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.bottomMargin, (java.lang.Object) r3.bottomMargin) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.gamora.editor.EditCornerState
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.editor.EditCornerState r3 = (com.p280ss.android.ugc.gamora.editor.EditCornerState) r3
            java.lang.Boolean r0 = r2.cornerVisible
            java.lang.Boolean r1 = r3.cornerVisible
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.topMargin
            java.lang.Integer r1 = r3.topMargin
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.bottomMargin
            java.lang.Integer r3 = r3.bottomMargin
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditCornerState.equals(java.lang.Object):boolean");
    }

    public final Integer getBottomMargin() {
        return this.bottomMargin;
    }

    public final Boolean getCornerVisible() {
        return this.cornerVisible;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    public final int hashCode() {
        Boolean bool = this.cornerVisible;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Integer num = this.topMargin;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.bottomMargin;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditCornerState(cornerVisible=");
        sb.append(this.cornerVisible);
        sb.append(", topMargin=");
        sb.append(this.topMargin);
        sb.append(", bottomMargin=");
        sb.append(this.bottomMargin);
        sb.append(")");
        return sb.toString();
    }

    public EditCornerState(Boolean bool, Integer num, Integer num2) {
        this.cornerVisible = bool;
        this.topMargin = num;
        this.bottomMargin = num2;
    }

    public /* synthetic */ EditCornerState(Boolean bool, Integer num, Integer num2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        this(bool, num, num2);
    }
}
