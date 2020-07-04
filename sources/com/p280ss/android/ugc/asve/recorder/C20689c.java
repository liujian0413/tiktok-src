package com.p280ss.android.ugc.asve.recorder;

import android.content.Context;
import com.p280ss.android.medialib.p880b.C19622b;
import com.p280ss.android.ugc.asve.p755c.C15397b;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.asve.recorder.p921a.C20673b;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.asve.recorder.reaction.C20779a;
import com.p280ss.android.vesdk.C45382z.C45393e;
import com.p280ss.android.vesdk.runtime.C45362d;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.asve.recorder.c */
public interface C20689c {
    /* renamed from: a */
    void mo55841a(Context context);

    /* renamed from: a */
    void mo55842a(C19622b bVar);

    /* renamed from: a */
    void mo55843a(C45362d dVar, String str);

    /* renamed from: a */
    void mo55844a(C45393e eVar);

    /* renamed from: a */
    void mo55845a(C7562b<? super Long, C7581n> bVar);

    /* renamed from: b */
    C20707b mo55846b();

    /* renamed from: b */
    void mo55847b(C19622b bVar);

    /* renamed from: b */
    void mo55848b(C7562b<? super Integer, C7581n> bVar);

    /* renamed from: c */
    C20673b mo55849c();

    /* renamed from: d */
    C20749b mo55850d();

    /* renamed from: e */
    C20676a mo55851e();

    /* renamed from: f */
    C20779a mo55852f();

    /* renamed from: g */
    C15397b mo55853g();

    /* renamed from: h */
    void mo55854h();

    void release();
}
