package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.editor.EditFilterIndicatorState */
public final class EditFilterIndicatorState implements C11670t {
    private final C29296g currentFilter;
    private final boolean isAutoUse;

    public static /* synthetic */ EditFilterIndicatorState copy$default(EditFilterIndicatorState editFilterIndicatorState, boolean z, C29296g gVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = editFilterIndicatorState.isAutoUse;
        }
        if ((i & 2) != 0) {
            gVar = editFilterIndicatorState.currentFilter;
        }
        return editFilterIndicatorState.copy(z, gVar);
    }

    public final boolean component1() {
        return this.isAutoUse;
    }

    public final C29296g component2() {
        return this.currentFilter;
    }

    public final EditFilterIndicatorState copy(boolean z, C29296g gVar) {
        return new EditFilterIndicatorState(z, gVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EditFilterIndicatorState) {
                EditFilterIndicatorState editFilterIndicatorState = (EditFilterIndicatorState) obj;
                if (!(this.isAutoUse == editFilterIndicatorState.isAutoUse) || !C7573i.m23585a((Object) this.currentFilter, (Object) editFilterIndicatorState.currentFilter)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C29296g getCurrentFilter() {
        return this.currentFilter;
    }

    public final int hashCode() {
        boolean z = this.isAutoUse;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        C29296g gVar = this.currentFilter;
        return i + (gVar != null ? gVar.hashCode() : 0);
    }

    public final boolean isAutoUse() {
        return this.isAutoUse;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditFilterIndicatorState(isAutoUse=");
        sb.append(this.isAutoUse);
        sb.append(", currentFilter=");
        sb.append(this.currentFilter);
        sb.append(")");
        return sb.toString();
    }

    public EditFilterIndicatorState(boolean z, C29296g gVar) {
        this.isAutoUse = z;
        this.currentFilter = gVar;
    }

    public /* synthetic */ EditFilterIndicatorState(boolean z, C29296g gVar, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            gVar = null;
        }
        this(z, gVar);
    }
}
