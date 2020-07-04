package com.p280ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p276a.C6593c;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.n */
public final class C25005n {
    @C6593c(mo15949a = "seconds")

    /* renamed from: a */
    public final int f65936a;
    @C6593c(mo15949a = "url_list")

    /* renamed from: b */
    public final List<String> f65937b;

    public C25005n() {
        this(0, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25005n) {
                C25005n nVar = (C25005n) obj;
                if (!(this.f65936a == nVar.f65936a) || !C7573i.m23585a((Object) this.f65937b, (Object) nVar.f65937b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f65936a * 31;
        List<String> list = this.f65937b;
        return i + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackSecondsTrack(seconds=");
        sb.append(this.f65936a);
        sb.append(", urlList=");
        sb.append(this.f65937b);
        sb.append(")");
        return sb.toString();
    }

    private C25005n(int i, List<String> list) {
        this.f65936a = i;
        this.f65937b = list;
    }

    private /* synthetic */ C25005n(int i, List list, int i2, C7571f fVar) {
        this(0, null);
    }
}
