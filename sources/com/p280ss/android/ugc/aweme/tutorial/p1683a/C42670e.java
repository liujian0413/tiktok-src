package com.p280ss.android.ugc.aweme.tutorial.p1683a;

import com.google.gson.p276a.C6593c;
import java.util.ArrayList;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tutorial.a.e */
public final class C42670e {
    @C6593c(mo15949a = "cursor")

    /* renamed from: a */
    public final long f110926a;
    @C6593c(mo15949a = "has_more")

    /* renamed from: b */
    public final boolean f110927b;
    @C6593c(mo15949a = "status_code")

    /* renamed from: c */
    public final int f110928c;
    @C6593c(mo15949a = "tutorial_list")

    /* renamed from: d */
    public final ArrayList<C42665a> f110929d;

    /* renamed from: e */
    public int f110930e;

    public C42670e() {
        this(0, false, 0, null, 0, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42670e) {
                C42670e eVar = (C42670e) obj;
                if (this.f110926a == eVar.f110926a) {
                    if (this.f110927b == eVar.f110927b) {
                        if ((this.f110928c == eVar.f110928c) && C7573i.m23585a((Object) this.f110929d, (Object) eVar.f110929d)) {
                            if (this.f110930e == eVar.f110930e) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f110926a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.f110927b;
        if (z) {
            z = true;
        }
        int i2 = (((i + (z ? 1 : 0)) * 31) + this.f110928c) * 31;
        ArrayList<C42665a> arrayList = this.f110929d;
        return ((i2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31) + this.f110930e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TutorialListResponse(cursor=");
        sb.append(this.f110926a);
        sb.append(", hasMore=");
        sb.append(this.f110927b);
        sb.append(", statusCode=");
        sb.append(this.f110928c);
        sb.append(", tutorialList=");
        sb.append(this.f110929d);
        sb.append(", pageIndex=");
        sb.append(this.f110930e);
        sb.append(")");
        return sb.toString();
    }

    private C42670e(long j, boolean z, int i, ArrayList<C42665a> arrayList, int i2) {
        C7573i.m23587b(arrayList, "tutorialList");
        this.f110926a = j;
        this.f110927b = z;
        this.f110928c = i;
        this.f110929d = arrayList;
        this.f110930e = i2;
    }

    private /* synthetic */ C42670e(long j, boolean z, int i, ArrayList arrayList, int i2, int i3, C7571f fVar) {
        this(0, false, 0, new ArrayList(), 0);
    }
}
