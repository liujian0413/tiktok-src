package com.p280ss.android.ugc.aweme.discover.model;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverPlaylistUpdateParam */
public final class DiscoverPlaylistUpdateParam {
    public final Aweme aweme;
    public final String cellID;
    public final int index;
    public final String tabName;

    public static /* synthetic */ DiscoverPlaylistUpdateParam copy$default(DiscoverPlaylistUpdateParam discoverPlaylistUpdateParam, int i, String str, String str2, Aweme aweme2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = discoverPlaylistUpdateParam.index;
        }
        if ((i2 & 2) != 0) {
            str = discoverPlaylistUpdateParam.tabName;
        }
        if ((i2 & 4) != 0) {
            str2 = discoverPlaylistUpdateParam.cellID;
        }
        if ((i2 & 8) != 0) {
            aweme2 = discoverPlaylistUpdateParam.aweme;
        }
        return discoverPlaylistUpdateParam.copy(i, str, str2, aweme2);
    }

    public final DiscoverPlaylistUpdateParam copy(int i, String str, String str2, Aweme aweme2) {
        C7573i.m23587b(str, "tabName");
        C7573i.m23587b(str2, "cellID");
        C7573i.m23587b(aweme2, "aweme");
        return new DiscoverPlaylistUpdateParam(i, str, str2, aweme2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoverPlaylistUpdateParam) {
                DiscoverPlaylistUpdateParam discoverPlaylistUpdateParam = (DiscoverPlaylistUpdateParam) obj;
                if (!(this.index == discoverPlaylistUpdateParam.index) || !C7573i.m23585a((Object) this.tabName, (Object) discoverPlaylistUpdateParam.tabName) || !C7573i.m23585a((Object) this.cellID, (Object) discoverPlaylistUpdateParam.cellID) || !C7573i.m23585a((Object) this.aweme, (Object) discoverPlaylistUpdateParam.aweme)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.index) * 31;
        String str = this.tabName;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.cellID;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Aweme aweme2 = this.aweme;
        if (aweme2 != null) {
            i = aweme2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverPlaylistUpdateParam(index=");
        sb.append(this.index);
        sb.append(", tabName=");
        sb.append(this.tabName);
        sb.append(", cellID=");
        sb.append(this.cellID);
        sb.append(", aweme=");
        sb.append(this.aweme);
        sb.append(")");
        return sb.toString();
    }

    public DiscoverPlaylistUpdateParam(int i, String str, String str2, Aweme aweme2) {
        C7573i.m23587b(str, "tabName");
        C7573i.m23587b(str2, "cellID");
        C7573i.m23587b(aweme2, "aweme");
        this.index = i;
        this.tabName = str;
        this.cellID = str2;
        this.aweme = aweme2;
    }
}
