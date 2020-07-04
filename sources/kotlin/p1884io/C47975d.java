package kotlin.p1884io;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.io.d */
public final class C47975d {

    /* renamed from: a */
    public final File f122807a;

    /* renamed from: b */
    public final List<File> f122808b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f122808b, (java.lang.Object) r3.f122808b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof kotlin.p1884io.C47975d
            if (r0 == 0) goto L_0x001d
            kotlin.io.d r3 = (kotlin.p1884io.C47975d) r3
            java.io.File r0 = r2.f122807a
            java.io.File r1 = r3.f122807a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<java.io.File> r0 = r2.f122808b
            java.util.List<java.io.File> r3 = r3.f122808b
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p1884io.C47975d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        File file = this.f122807a;
        int i = 0;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        List<File> list = this.f122808b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilePathComponents(root=");
        sb.append(this.f122807a);
        sb.append(", segments=");
        sb.append(this.f122808b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    public final int mo120171b() {
        return this.f122808b.size();
    }

    /* renamed from: a */
    public final boolean mo120170a() {
        String path = this.f122807a.getPath();
        C7573i.m23582a((Object) path, "root.path");
        if (path.length() > 0) {
            return true;
        }
        return false;
    }

    public C47975d(File file, List<? extends File> list) {
        C7573i.m23587b(file, "root");
        C7573i.m23587b(list, "segments");
        this.f122807a = file;
        this.f122808b = list;
    }
}
