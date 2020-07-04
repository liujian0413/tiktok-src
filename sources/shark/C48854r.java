package shark;

import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: shark.r */
public final class C48854r extends C48861w {

    /* renamed from: a */
    public final String f124206a;

    /* renamed from: b */
    public final C7562b<C48746h, Boolean> f124207b;

    /* renamed from: c */
    private final ReferencePattern f124208c;

    /* renamed from: a */
    public final ReferencePattern mo123605a() {
        return this.f124208c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f124207b, (java.lang.Object) r3.f124207b) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x002d
            boolean r0 = r3 instanceof shark.C48854r
            if (r0 == 0) goto L_0x002b
            shark.r r3 = (shark.C48854r) r3
            shark.ReferencePattern r0 = r2.mo123605a()
            shark.ReferencePattern r1 = r3.mo123605a()
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = r2.f124206a
            java.lang.String r1 = r3.f124206a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x002b
            kotlin.jvm.a.b<shark.h, java.lang.Boolean> r0 = r2.f124207b
            kotlin.jvm.a.b<shark.h, java.lang.Boolean> r3 = r3.f124207b
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r3 = 0
            return r3
        L_0x002d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.C48854r.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ReferencePattern a = mo123605a();
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        String str = this.f124206a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        C7562b<C48746h, Boolean> bVar = this.f124207b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryLeakReferenceMatcher(pattern=");
        sb.append(mo123605a());
        sb.append(", description=");
        sb.append(this.f124206a);
        sb.append(", patternApplies=");
        sb.append(this.f124207b);
        sb.append(")");
        return sb.toString();
    }

    public C48854r(ReferencePattern referencePattern, String str, C7562b<? super C48746h, Boolean> bVar) {
        C7573i.m23587b(referencePattern, "pattern");
        C7573i.m23587b(str, "description");
        C7573i.m23587b(bVar, "patternApplies");
        super(null);
        this.f124208c = referencePattern;
        this.f124206a = str;
        this.f124207b = bVar;
    }
}
