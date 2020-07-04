package com.p280ss.android.ugc.gamora.recorder.exit;

import android.graphics.drawable.Drawable;
import com.bytedance.jedi.arch.C11670t;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.exit.RecordExitState */
public final class RecordExitState implements C11670t {
    private final Pair<Float, Float> closeAlphaAnim;
    private final boolean closeVisible;
    private final Drawable exitDrawable;

    public RecordExitState() {
        this(null, false, null, 7, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.Pair, code=kotlin.Pair<java.lang.Float, java.lang.Float>, for r3v0, types: [kotlin.Pair] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.gamora.recorder.exit.RecordExitState copy$default(com.p280ss.android.ugc.gamora.recorder.exit.RecordExitState r0, android.graphics.drawable.Drawable r1, boolean r2, kotlin.Pair<java.lang.Float, java.lang.Float> r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            android.graphics.drawable.Drawable r1 = r0.exitDrawable
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            boolean r2 = r0.closeVisible
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            kotlin.Pair<java.lang.Float, java.lang.Float> r3 = r0.closeAlphaAnim
        L_0x0012:
            com.ss.android.ugc.gamora.recorder.exit.RecordExitState r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.recorder.exit.RecordExitState.copy$default(com.ss.android.ugc.gamora.recorder.exit.RecordExitState, android.graphics.drawable.Drawable, boolean, kotlin.Pair, int, java.lang.Object):com.ss.android.ugc.gamora.recorder.exit.RecordExitState");
    }

    public final Drawable component1() {
        return this.exitDrawable;
    }

    public final boolean component2() {
        return this.closeVisible;
    }

    public final Pair<Float, Float> component3() {
        return this.closeAlphaAnim;
    }

    public final RecordExitState copy(Drawable drawable, boolean z, Pair<Float, Float> pair) {
        return new RecordExitState(drawable, z, pair);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecordExitState) {
                RecordExitState recordExitState = (RecordExitState) obj;
                if (C7573i.m23585a((Object) this.exitDrawable, (Object) recordExitState.exitDrawable)) {
                    if (!(this.closeVisible == recordExitState.closeVisible) || !C7573i.m23585a((Object) this.closeAlphaAnim, (Object) recordExitState.closeAlphaAnim)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Pair<Float, Float> getCloseAlphaAnim() {
        return this.closeAlphaAnim;
    }

    public final boolean getCloseVisible() {
        return this.closeVisible;
    }

    public final Drawable getExitDrawable() {
        return this.exitDrawable;
    }

    public final int hashCode() {
        Drawable drawable = this.exitDrawable;
        int i = 0;
        int hashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
        boolean z = this.closeVisible;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        Pair<Float, Float> pair = this.closeAlphaAnim;
        if (pair != null) {
            i = pair.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordExitState(exitDrawable=");
        sb.append(this.exitDrawable);
        sb.append(", closeVisible=");
        sb.append(this.closeVisible);
        sb.append(", closeAlphaAnim=");
        sb.append(this.closeAlphaAnim);
        sb.append(")");
        return sb.toString();
    }

    public RecordExitState(Drawable drawable, boolean z, Pair<Float, Float> pair) {
        this.exitDrawable = drawable;
        this.closeVisible = z;
        this.closeAlphaAnim = pair;
    }

    public /* synthetic */ RecordExitState(Drawable drawable, boolean z, Pair pair, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            drawable = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            pair = null;
        }
        this(drawable, z, pair);
    }
}
