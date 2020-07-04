package com.p280ss.android.ugc.aweme.account.network.p980a;

import android.content.Context;
import com.bytedance.sdk.account.C12789c;
import com.p280ss.android.C19222b;
import com.p280ss.android.ugc.aweme.C21084a;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.model.C6862d;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.account.network.a.a */
public final class C22204a implements C19222b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f59302a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C22204a.class), "mNetwork", "getMNetwork()Lcom/ss/android/ugc/aweme/account/network/ttaccount/TTAccountNetworkImpl;"))};

    /* renamed from: b */
    private final C7541d f59303b = C7546e.m23569a(C22205a.f59304a);

    /* renamed from: com.ss.android.ugc.aweme.account.network.a.a$a */
    static final class C22205a extends Lambda implements C7561a<C22206b> {

        /* renamed from: a */
        public static final C22205a f59304a = new C22205a();

        C22205a() {
            super(0);
        }

        /* renamed from: a */
        private static C22206b m73667a() {
            return new C22206b();
        }

        public final /* synthetic */ Object invoke() {
            return m73667a();
        }
    }

    /* renamed from: e */
    private final C22206b m73662e() {
        return (C22206b) this.f59303b.getValue();
    }

    /* renamed from: a */
    public final String mo50929a() {
        return "api2.musical.ly";
    }

    /* renamed from: b */
    public final Context mo50930b() {
        return C21084a.m71112a();
    }

    /* renamed from: c */
    public final C12789c mo50931c() {
        return m73662e();
    }

    /* renamed from: d */
    public final boolean mo50932d() {
        C6862d h = C21671bd.m72540h();
        C7573i.m23582a((Object) h, "ModuleStore.getAbModel()");
        return h.isEnableMultiAccountLogin();
    }
}
