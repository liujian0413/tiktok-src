package com.p280ss.android.ugc.asve.sandbox.p929c;

import com.p280ss.android.ugc.asve.context.C15430g;
import com.p280ss.android.ugc.asve.recorder.reaction.C20779a;
import com.p280ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p280ss.android.ugc.asve.sandbox.C20996d;
import com.p280ss.android.ugc.asve.sandbox.C21038k;
import java.lang.reflect.Proxy;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.c.e */
public final class C20995e implements C20779a {

    /* renamed from: a */
    private final C21038k f56456a;

    /* renamed from: b */
    private final C15430g f56457b;

    /* renamed from: a */
    public final C15430g mo56154a() {
        return this.f56457b;
    }

    /* renamed from: b */
    public final float mo56157b() {
        return this.f56456a.mo56688a();
    }

    /* renamed from: c */
    public final int[] mo56159c() {
        return this.f56456a.mo56692b();
    }

    /* renamed from: d */
    public final int[] mo56160d() {
        return this.f56456a.mo56693c();
    }

    /* renamed from: e */
    public final void mo56161e() {
        this.f56456a.mo56694d();
    }

    /* renamed from: g */
    public final void mo56163g() {
        this.f56456a.mo56696f();
    }

    /* renamed from: f */
    public final ReactionWindowInfo mo56162f() {
        ReactionWindowInfo e = this.f56456a.mo56695e();
        C7573i.m23582a((Object) e, "safeRemoteReactionController.currentWindowInfo");
        return e;
    }

    /* renamed from: a */
    public final void mo56155a(float f) {
        this.f56456a.mo56689a(f);
    }

    /* renamed from: a */
    public final void mo56156a(int i, int i2) {
        this.f56456a.mo56690a(i, i2);
    }

    /* renamed from: b */
    public final boolean mo56158b(int i, int i2) {
        return this.f56456a.mo56691b(i, i2);
    }

    public C20995e(C21038k kVar, C15430g gVar) {
        C7573i.m23587b(gVar, "reactionContext");
        this.f56457b = gVar;
        Object newProxyInstance = Proxy.newProxyInstance(C21038k.class.getClassLoader(), new Class[]{C21038k.class}, new C20996d(kVar));
        if (newProxyInstance != null) {
            this.f56456a = (C21038k) newProxyInstance;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.asve.sandbox.ISandBoxRemoteReactionService");
    }
}
