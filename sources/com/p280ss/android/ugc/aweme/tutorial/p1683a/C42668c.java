package com.p280ss.android.ugc.aweme.tutorial.p1683a;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tutorial.a.c */
public final class C42668c {

    /* renamed from: a */
    public final String f110919a;

    /* renamed from: b */
    public final int f110920b;

    public C42668c() {
        this(null, 0, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42668c) {
                C42668c cVar = (C42668c) obj;
                if (C7573i.m23585a((Object) this.f110919a, (Object) cVar.f110919a)) {
                    if (this.f110920b == cVar.f110920b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f110919a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f110920b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TutorialCategory(tutorialCategoryName=");
        sb.append(this.f110919a);
        sb.append(", tutorialCategoryKey=");
        sb.append(this.f110920b);
        sb.append(")");
        return sb.toString();
    }

    public C42668c(String str, int i) {
        C7573i.m23587b(str, "tutorialCategoryName");
        this.f110919a = str;
        this.f110920b = i;
    }

    private /* synthetic */ C42668c(String str, int i, int i2, C7571f fVar) {
        this("", 0);
    }
}
