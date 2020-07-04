package com.p280ss.android.ugc.aweme.discover.repo.fetcher;

import java.io.Serializable;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.DiscoverRequestParam */
public final class DiscoverRequestParam implements Serializable {
    public static final Companion Companion = new Companion(null);
    private int cursor;

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.DiscoverRequestParam$Companion */
    public static final class Companion implements Serializable {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    public static /* synthetic */ DiscoverRequestParam copy$default(DiscoverRequestParam discoverRequestParam, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = discoverRequestParam.cursor;
        }
        return discoverRequestParam.copy(i);
    }

    public final int component1() {
        return this.cursor;
    }

    public final DiscoverRequestParam copy(int i) {
        return new DiscoverRequestParam(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoverRequestParam) {
                if (this.cursor == ((DiscoverRequestParam) obj).cursor) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final int hashCode() {
        return this.cursor;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverRequestParam(cursor=");
        sb.append(this.cursor);
        sb.append(")");
        return sb.toString();
    }

    public final void setCursor(int i) {
        this.cursor = i;
    }

    public DiscoverRequestParam(int i) {
        this.cursor = i;
    }
}
