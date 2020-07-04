package com.p280ss.android.ugc.aweme.commercialize.model;

import android.view.View;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.b */
public final class C24989b {

    /* renamed from: a */
    public final int f65884a;

    /* renamed from: b */
    public final String f65885b;

    /* renamed from: c */
    public final View f65886c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24989b) {
                C24989b bVar = (C24989b) obj;
                if (!(this.f65884a == bVar.f65884a) || !C7573i.m23585a((Object) this.f65885b, (Object) bVar.f65885b) || !C7573i.m23585a((Object) this.f65886c, (Object) bVar.f65886c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f65884a) * 31;
        String str = this.f65885b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        View view = this.f65886c;
        if (view != null) {
            i = view.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdHalfWebPageShowParams(delay=");
        sb.append(this.f65884a);
        sb.append(", eventType=");
        sb.append(this.f65885b);
        sb.append(", oldAdBottomLabelView=");
        sb.append(this.f65886c);
        sb.append(")");
        return sb.toString();
    }

    public C24989b(int i, String str, View view) {
        this.f65884a = i;
        this.f65885b = str;
        this.f65886c = view;
    }
}
