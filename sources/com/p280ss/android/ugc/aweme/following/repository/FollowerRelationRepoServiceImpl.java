package com.p280ss.android.ugc.aweme.following.repository;

import com.p280ss.android.ugc.aweme.following.model.C29567c;
import com.p280ss.android.ugc.aweme.p1019ap.C22666a;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.following.repository.FollowerRelationRepoServiceImpl */
public final class FollowerRelationRepoServiceImpl implements C22666a {
    public final C7492s<C29567c> queryFollowerList(String str, String str2, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        String str3 = str;
        C7573i.m23587b(str3, "userId");
        String str4 = str2;
        C7573i.m23587b(str4, "secUserId");
        return new C29602d().queryFollowerList(str3, str4, j, i, i2, i3, i4, i5, 0, 0);
    }
}
