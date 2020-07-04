package com.p280ss.android.ugc.aweme.image;

import com.bytedance.lighten.core.C12124e;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.ss.android.ugc.aweme.image.o */
final /* synthetic */ class C32051o implements Runnable {

    /* renamed from: a */
    private final C320491 f83835a;

    /* renamed from: b */
    private final C12124e f83836b;

    /* renamed from: c */
    private final Response f83837c;

    /* renamed from: d */
    private final long f83838d;

    /* renamed from: e */
    private final Request f83839e;

    C32051o(C320491 r1, C12124e eVar, Response response, long j, Request request) {
        this.f83835a = r1;
        this.f83836b = eVar;
        this.f83837c = response;
        this.f83838d = j;
        this.f83839e = request;
    }

    public final void run() {
        this.f83835a.mo83018a(this.f83836b, this.f83837c, this.f83838d, this.f83839e);
    }
}
