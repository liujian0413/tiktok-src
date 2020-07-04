package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.os.Message;
import android.util.Pair;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ak */
public final class C31865ak extends C31874at<Pair<IMUser, BaseContent>> {

    /* renamed from: b */
    private static ExecutorService f83334b;

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo82719b() {
        super.mo82719b();
    }

    public final /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ExecutorService mo82718a() {
        if (f83334b == null) {
            f83334b = C31866al.m103550a();
        }
        return f83334b;
    }

    public final /* bridge */ /* synthetic */ void handleMsg(Message message) {
        super.handleMsg(message);
    }

    private C31865ak(C31918r<Pair<IMUser, BaseContent>> rVar, C31917q<Pair<IMUser, BaseContent>> qVar) {
        super(rVar, qVar);
    }

    /* renamed from: a */
    public static void m103547a(C31918r<Pair<IMUser, BaseContent>> rVar, C31917q<Pair<IMUser, BaseContent>> qVar) {
        new C31865ak(rVar, qVar).mo82719b();
    }
}
