package com.p280ss.android.ugc.aweme.p1000ak;

import android.content.Context;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.ttuploader.TTImageUploader;
import com.p280ss.ttuploader.TTUploadSpeedProber;
import com.p280ss.ttuploader.TTVideoUploader;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ak.c */
public final class C22487c {

    /* renamed from: a */
    public static final C22487c f59934a = new C22487c();

    private C22487c() {
    }

    /* renamed from: a */
    public static final TTVideoUploader m74374a() throws Exception {
        C35563c.f93228J.mo90368a("ttvideouploader");
        return new TTVideoUploader();
    }

    /* renamed from: b */
    public static final TTImageUploader m74375b() throws Exception {
        C35563c.f93228J.mo90368a("ttvideouploader");
        return new TTImageUploader();
    }

    /* renamed from: a */
    public static final TTUploadSpeedProber m74373a(Context context, int i) {
        C7573i.m23587b(context, "context");
        C35563c.f93228J.mo90368a("ttvideouploader");
        try {
            return new TTUploadSpeedProber(context, i);
        } catch (Throwable unused) {
            return null;
        }
    }
}
