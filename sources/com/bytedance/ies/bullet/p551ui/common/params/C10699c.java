package com.bytedance.ies.bullet.p551ui.common.params;

/* renamed from: com.bytedance.ies.bullet.ui.common.params.c */
public final class C10699c {

    /* renamed from: a */
    public final int f28594a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10699c) {
                if (this.f28594a == ((C10699c) obj).f28594a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f28594a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UIColor(color=");
        sb.append(this.f28594a);
        sb.append(")");
        return sb.toString();
    }

    public C10699c(int i) {
        this.f28594a = i;
    }
}
