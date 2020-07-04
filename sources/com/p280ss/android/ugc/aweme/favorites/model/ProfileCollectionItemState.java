package com.p280ss.android.ugc.aweme.favorites.model;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27707j;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.ProfileCollectionItemState */
public final class ProfileCollectionItemState implements C11670t {
    private final C27707j profileCollectionItemStruct;

    public ProfileCollectionItemState() {
        this(null, 1, null);
    }

    public static /* synthetic */ ProfileCollectionItemState copy$default(ProfileCollectionItemState profileCollectionItemState, C27707j jVar, int i, Object obj) {
        if ((i & 1) != 0) {
            jVar = profileCollectionItemState.profileCollectionItemStruct;
        }
        return profileCollectionItemState.copy(jVar);
    }

    public final C27707j component1() {
        return this.profileCollectionItemStruct;
    }

    public final ProfileCollectionItemState copy(C27707j jVar) {
        C7573i.m23587b(jVar, "profileCollectionItemStruct");
        return new ProfileCollectionItemState(jVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.profileCollectionItemStruct, (java.lang.Object) ((com.p280ss.android.ugc.aweme.favorites.model.ProfileCollectionItemState) r2).profileCollectionItemStruct) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.favorites.model.ProfileCollectionItemState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.favorites.model.ProfileCollectionItemState r2 = (com.p280ss.android.ugc.aweme.favorites.model.ProfileCollectionItemState) r2
            com.ss.android.ugc.aweme.favorites.a.j r0 = r1.profileCollectionItemStruct
            com.ss.android.ugc.aweme.favorites.a.j r2 = r2.profileCollectionItemStruct
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.model.ProfileCollectionItemState.equals(java.lang.Object):boolean");
    }

    public final C27707j getProfileCollectionItemStruct() {
        return this.profileCollectionItemStruct;
    }

    public final int hashCode() {
        C27707j jVar = this.profileCollectionItemStruct;
        if (jVar != null) {
            return jVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileCollectionItemState(profileCollectionItemStruct=");
        sb.append(this.profileCollectionItemStruct);
        sb.append(")");
        return sb.toString();
    }

    public ProfileCollectionItemState(C27707j jVar) {
        C7573i.m23587b(jVar, "profileCollectionItemStruct");
        this.profileCollectionItemStruct = jVar;
    }

    public /* synthetic */ ProfileCollectionItemState(C27707j jVar, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            jVar = new C27707j(null, 0, null, 0, null, null, null, false, NormalGiftView.ALPHA_255, null);
        }
        this(jVar);
    }
}
