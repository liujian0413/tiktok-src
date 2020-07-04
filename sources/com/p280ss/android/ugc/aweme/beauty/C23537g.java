package com.p280ss.android.ugc.aweme.beauty;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.beauty.g */
public final class C23537g {

    /* renamed from: a */
    public final ComposerBeauty f62121a;

    /* renamed from: b */
    public final String f62122b;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComposerBeautyDownload(beauty=");
        sb.append(this.f62121a);
        sb.append(", unzipPath=");
        sb.append(this.f62122b);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return C23538h.m77304a(this.f62121a.getEffect().getEffectId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C23537g) {
            return C7573i.m23585a((Object) ((C23537g) obj).f62122b, (Object) this.f62122b);
        }
        return false;
    }

    private C23537g(ComposerBeauty composerBeauty, String str) {
        C7573i.m23587b(composerBeauty, "beauty");
        C7573i.m23587b(str, "unzipPath");
        this.f62121a = composerBeauty;
        this.f62122b = str;
    }

    public /* synthetic */ C23537g(ComposerBeauty composerBeauty, String str, int i, C7571f fVar) {
        String unzipPath = composerBeauty.getEffect().getUnzipPath();
        C7573i.m23582a((Object) unzipPath, "beauty.effect.unzipPath");
        this(composerBeauty, unzipPath);
    }
}
