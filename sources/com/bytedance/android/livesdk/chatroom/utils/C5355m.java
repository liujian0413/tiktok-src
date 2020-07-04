package com.bytedance.android.livesdk.chatroom.utils;

import android.util.Pair;
import java.util.Map;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.utils.m */
final /* synthetic */ class C5355m implements C7326g {

    /* renamed from: a */
    private final String f15628a;

    /* renamed from: b */
    private final long f15629b;

    /* renamed from: c */
    private final Map f15630c;

    C5355m(String str, long j, Map map) {
        this.f15628a = str;
        this.f15629b = j;
        this.f15630c = map;
    }

    public final void accept(Object obj) {
        C5352j.m17069a(this.f15628a, this.f15629b, this.f15630c, (Pair) obj);
    }
}
