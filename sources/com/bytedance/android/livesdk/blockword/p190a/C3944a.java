package com.bytedance.android.livesdk.blockword.p190a;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.blockword.a.a */
public final class C3944a {
    @C6593c(mo15949a = "id")

    /* renamed from: a */
    public int f11784a = -1;
    @C6593c(mo15949a = "content")

    /* renamed from: b */
    public String f11785b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3944a) {
                C3944a aVar = (C3944a) obj;
                if (!(this.f11784a == aVar.f11784a) || !C7573i.m23585a((Object) this.f11785b, (Object) aVar.f11785b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f11784a) * 31;
        String str = this.f11785b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockWord(id=");
        sb.append(this.f11784a);
        sb.append(", content=");
        sb.append(this.f11785b);
        sb.append(")");
        return sb.toString();
    }

    public C3944a(int i, String str) {
        C7573i.m23587b(str, C38347c.f99553h);
        this.f11785b = str;
    }
}
