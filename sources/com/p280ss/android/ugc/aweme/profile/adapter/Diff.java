package com.p280ss.android.ugc.aweme.profile.adapter;

import android.support.p029v7.util.C1143a.C1147c;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.Diff */
public final class Diff extends C1147c<MixStruct> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo4549a(Object obj, Object obj2) {
        return m115315a((MixStruct) obj, (MixStruct) obj2);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo4550b(Object obj, Object obj2) {
        return m115316b((MixStruct) obj, (MixStruct) obj2);
    }

    /* renamed from: a */
    private static boolean m115315a(MixStruct mixStruct, MixStruct mixStruct2) {
        C7573i.m23587b(mixStruct, "p0");
        C7573i.m23587b(mixStruct2, "p1");
        return C7573i.m23585a((Object) mixStruct.mixId, (Object) mixStruct2.mixId);
    }

    /* renamed from: b */
    private static boolean m115316b(MixStruct mixStruct, MixStruct mixStruct2) {
        C7573i.m23587b(mixStruct, "p0");
        C7573i.m23587b(mixStruct2, "p1");
        return C7573i.m23585a((Object) mixStruct.mixId, (Object) mixStruct2.mixId);
    }
}
