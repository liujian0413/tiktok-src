package com.p280ss.android.ugc.network.observer.bean;

import com.p280ss.android.ugc.network.observer.NetworkState;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.network.observer.bean.a */
public final class C44893a {

    /* renamed from: a */
    public final boolean f115438a;

    /* renamed from: b */
    public final NetworkState f115439b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44893a) {
                C44893a aVar = (C44893a) obj;
                if (!(this.f115438a == aVar.f115438a) || !C7573i.m23585a((Object) this.f115439b, (Object) aVar.f115439b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f115438a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        NetworkState networkState = this.f115439b;
        return i + (networkState != null ? networkState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DetectResult(needNextStep=");
        sb.append(this.f115438a);
        sb.append(", state=");
        sb.append(this.f115439b);
        sb.append(")");
        return sb.toString();
    }

    public C44893a(boolean z, NetworkState networkState) {
        C7573i.m23587b(networkState, "state");
        this.f115438a = z;
        this.f115439b = networkState;
    }
}
