package com.p280ss.android.account;

import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.platform.api.C12905a;
import com.bytedance.sdk.account.platform.p669a.C12904a;
import com.bytedance.sdk.account.utils.C12909b;
import com.p280ss.android.C19222b;
import com.p280ss.android.C19224c;
import com.p280ss.android.account.p814a.p815a.C18891a;

/* renamed from: com.ss.android.account.c */
public final class C18895c {

    /* renamed from: a */
    private static volatile C19222b f50935a;

    /* renamed from: b */
    private static volatile C19224c f50936b;

    /* renamed from: c */
    private static volatile C18891a f50937c;

    /* renamed from: d */
    private static volatile C12909b f50938d;

    /* renamed from: b */
    public static C19224c m61671b() {
        return f50936b;
    }

    /* renamed from: c */
    public static C18891a m61672c() {
        return f50937c;
    }

    /* renamed from: d */
    public static C12909b m61673d() {
        return f50938d;
    }

    /* renamed from: a */
    public static C19222b m61668a() {
        if (f50935a != null) {
            return f50935a;
        }
        throw new IllegalStateException("not init TTAccount config");
    }

    /* renamed from: a */
    public static void m61669a(C18891a aVar) {
        f50937c = aVar;
    }

    /* renamed from: a */
    public static void m61670a(C19222b bVar) {
        f50935a = bVar;
        C12904a.m37575a(C12905a.class, C12798d.m37187b(bVar.mo50930b()));
    }
}
