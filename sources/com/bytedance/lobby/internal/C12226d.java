package com.bytedance.lobby.internal;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.util.ArrayMap;
import com.bytedance.lobby.auth.C12198c;
import com.bytedance.lobby.auth.C12201d;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.Map;

/* renamed from: com.bytedance.lobby.internal.d */
public final class C12226d {

    /* renamed from: a */
    private static volatile C12226d f32512a;

    /* renamed from: b */
    private Map<String, C12201d> f32513b = new ArrayMap();

    private C12226d() {
    }

    /* renamed from: a */
    public static C12226d m35546a() {
        if (f32512a == null) {
            synchronized (C12226d.class) {
                if (f32512a == null) {
                    f32512a = new C12226d();
                }
            }
        }
        return f32512a;
    }

    /* renamed from: a */
    public final String mo29966a(String str) {
        C12201d d = mo29970d(str);
        if (d != null) {
            return d.mo29938b();
        }
        return null;
    }

    /* renamed from: b */
    public final String mo29968b(String str) {
        C12201d d = mo29970d(str);
        if (d != null) {
            return d.mo29940c();
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo29969c(String str) {
        C12201d d = mo29970d(str);
        if (d == null || !d.mo29951d()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final synchronized C12201d mo29970d(String str) {
        C12201d dVar = (C12201d) this.f32513b.get(str);
        if (dVar == null) {
            return null;
        }
        dVar.mo29958g();
        return dVar;
    }

    /* renamed from: a */
    public static void m35547a(C12198c cVar) {
        Bundle a = cVar.mo29930a();
        a.putString("provider_id", cVar.f32458b);
        a.putInt("action_type", 1);
        if (cVar.f32459c != null) {
            C12220a.m35533a().mo29961a(cVar.f32458b, 1, cVar.f32459c);
        }
        Intent intent = new Intent(cVar.f32457a, LobbyInvisibleActivity.class);
        intent.putExtras(a);
        cVar.f32457a.startActivityForResult(intent, BaseNotice.HASHTAG);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo29967a(C12201d dVar) {
        this.f32513b.put(dVar.mo29957f().f32466b, dVar);
    }
}
