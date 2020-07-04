package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload;

import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30981y;
import com.p280ss.ttuploader.TTImageInfo;
import com.p280ss.ttuploader.TTImageUploaderListener;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.upload.b */
final /* synthetic */ class C30962b implements TTImageUploaderListener {

    /* renamed from: a */
    private final C30957a f81074a;

    /* renamed from: b */
    private final C30981y f81075b;

    /* renamed from: c */
    private final int f81076c;

    /* renamed from: d */
    private final String f81077d;

    C30962b(C30957a aVar, C30981y yVar, int i, String str) {
        this.f81074a = aVar;
        this.f81075b = yVar;
        this.f81076c = i;
        this.f81077d = str;
    }

    public final void onNotify(int i, long j, TTImageInfo tTImageInfo) {
        this.f81074a.mo81327a(this.f81075b, this.f81076c, this.f81077d, i, j, tTImageInfo);
    }
}
