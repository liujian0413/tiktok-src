package com.google.android.gms.internal.ads;

import android.content.Context;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.concurrent.Callable;

final /* synthetic */ class acn implements Callable {

    /* renamed from: a */
    private final acl f40011a;

    /* renamed from: b */
    private final Context f40012b;

    acn(acl acl, Context context) {
        this.f40011a = acl;
        this.f40012b = context;
    }

    public final Object call() {
        Context context = this.f40012b;
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43939da)).booleanValue()) {
            return "";
        }
        return C7285c.m22838a(context, "mobileads_consent", 0).getString("consent_string", "");
    }
}
