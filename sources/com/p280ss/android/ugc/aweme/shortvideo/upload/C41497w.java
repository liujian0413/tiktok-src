package com.p280ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.base.C17454q;
import com.google.common.base.C17463v;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.utils.C43104eo;
import java.util.concurrent.TimeUnit;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.w */
public final class C41497w {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f107928a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41497w.class), "counter", "getCounter()Lcom/google/common/base/Stopwatch;"))};

    /* renamed from: b */
    private final C7541d f107929b = C7546e.m23569a(C41498a.f107930a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.w$a */
    static final class C41498a extends Lambda implements C7561a<C17454q> {

        /* renamed from: a */
        public static final C41498a f107930a = new C41498a();

        C41498a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m132198a();
        }

        /* renamed from: a */
        private static C17454q m132198a() {
            return C17454q.m58002a((C17463v) C43104eo.f111724a);
        }
    }

    /* renamed from: d */
    private final C17454q m132194d() {
        return (C17454q) this.f107929b.getValue();
    }

    /* renamed from: c */
    public final long mo102156c() {
        return m132194d().mo44941a(TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public final void mo102155b() {
        if (!m132194d().f48412a) {
            m132193a("repeat stop");
        } else {
            m132194d().mo44943d();
        }
    }

    /* renamed from: a */
    public final void mo102154a() {
        if (m132194d().f48412a) {
            m132193a("repeat start");
        } else {
            m132194d().mo44942c();
        }
    }

    /* renamed from: a */
    private static void m132193a(String str) {
        StringBuilder sb = new StringBuilder("UploadWaitTimeCounter 上传 sdk 调用异常: ");
        sb.append(str);
        String sb2 = sb.toString();
        if (!C6399b.m19928c()) {
            C41530am.m132283b(sb2);
            return;
        }
        throw new RuntimeException(sb2);
    }
}
