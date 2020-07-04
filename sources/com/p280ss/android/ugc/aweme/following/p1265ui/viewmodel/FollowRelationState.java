package com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36337ai;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState */
public final class FollowRelationState implements C11670t {
    private final int connectedRelationCount;
    private final int fanCount;
    private final boolean isFollowingTab;
    private final boolean isSearching;

    public FollowRelationState() {
        this(false, 0, 0, false, 15, null);
    }

    public static /* synthetic */ FollowRelationState copy$default(FollowRelationState followRelationState, boolean z, int i, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = followRelationState.isSearching;
        }
        if ((i3 & 2) != 0) {
            i = followRelationState.connectedRelationCount;
        }
        if ((i3 & 4) != 0) {
            i2 = followRelationState.fanCount;
        }
        if ((i3 & 8) != 0) {
            z2 = followRelationState.isFollowingTab;
        }
        return followRelationState.copy(z, i, i2, z2);
    }

    public final boolean component1() {
        return this.isSearching;
    }

    public final int component2() {
        return this.connectedRelationCount;
    }

    public final int component3() {
        return this.fanCount;
    }

    public final boolean component4() {
        return this.isFollowingTab;
    }

    public final FollowRelationState copy(boolean z, int i, int i2, boolean z2) {
        return new FollowRelationState(z, i, i2, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FollowRelationState) {
                FollowRelationState followRelationState = (FollowRelationState) obj;
                if (this.isSearching == followRelationState.isSearching) {
                    if (this.connectedRelationCount == followRelationState.connectedRelationCount) {
                        if (this.fanCount == followRelationState.fanCount) {
                            if (this.isFollowingTab == followRelationState.isFollowingTab) {
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

    public final int getConnectedRelationCount() {
        return this.connectedRelationCount;
    }

    public final int getFanCount() {
        return this.fanCount;
    }

    public final int hashCode() {
        boolean z = this.isSearching;
        int i = 1;
        if (z) {
            z = true;
        }
        int hashCode = (((((z ? 1 : 0) * true) + Integer.hashCode(this.connectedRelationCount)) * 31) + Integer.hashCode(this.fanCount)) * 31;
        boolean z2 = this.isFollowingTab;
        if (!z2) {
            i = z2;
        }
        return hashCode + i;
    }

    public final boolean isFollowingTab() {
        return this.isFollowingTab;
    }

    public final boolean isSearching() {
        return this.isSearching;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowRelationState(isSearching=");
        sb.append(this.isSearching);
        sb.append(", connectedRelationCount=");
        sb.append(this.connectedRelationCount);
        sb.append(", fanCount=");
        sb.append(this.fanCount);
        sb.append(", isFollowingTab=");
        sb.append(this.isFollowingTab);
        sb.append(")");
        return sb.toString();
    }

    public FollowRelationState(boolean z, int i, int i2, boolean z2) {
        this.isSearching = z;
        this.connectedRelationCount = i;
        this.fanCount = i2;
        this.isFollowingTab = z2;
    }

    public /* synthetic */ FollowRelationState(boolean z, int i, int i2, boolean z2, int i3, C7571f fVar) {
        if ((i3 & 1) != 0) {
            z = false;
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            i2 = C36337ai.m117568b(f.getCurUser());
        }
        if ((i3 & 8) != 0) {
            z2 = false;
        }
        this(z, i, i2, z2);
    }
}
