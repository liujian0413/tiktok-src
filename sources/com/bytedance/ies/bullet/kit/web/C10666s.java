package com.bytedance.ies.bullet.kit.web;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.bytedance.ies.bullet.kit.web.s */
public final class C10666s {

    /* renamed from: a */
    public final boolean f28526a;

    public C10666s() {
        this(false, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10666s) {
                if (this.f28526a == ((C10666s) obj).f28526a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f28526a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebKitGlobalSettings(webContentsDebuggingEnabled=");
        sb.append(this.f28526a);
        sb.append(")");
        return sb.toString();
    }

    private C10666s(boolean z) {
        this.f28526a = z;
    }

    private /* synthetic */ C10666s(boolean z, int i, C7571f fVar) {
        this(false);
    }
}
