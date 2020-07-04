package com.p280ss.android.ugc.aweme.sharer;

import android.net.Uri;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.h */
public final class C38357h extends C38354f {

    /* renamed from: b */
    public final Uri f99567b;

    /* renamed from: c */
    public final String f99568c;

    /* renamed from: d */
    public final String f99569d;

    /* renamed from: e */
    public final String f99570e;

    /* renamed from: f */
    public final String f99571f;

    /* renamed from: g */
    public final String f99572g;

    public C38357h(Uri uri, String str) {
        this(uri, str, null, null, null, null, 60, null);
    }

    private C38357h(Uri uri, String str, String str2, String str3, String str4, String str5) {
        C7573i.m23587b(uri, "localUri");
        C7573i.m23587b(str, "localPath");
        super(null);
        this.f99567b = uri;
        this.f99568c = str;
        this.f99569d = str2;
        this.f99570e = str3;
        this.f99571f = str4;
        this.f99572g = str5;
    }

    public /* synthetic */ C38357h(Uri uri, String str, String str2, String str3, String str4, String str5, int i, C7571f fVar) {
        if ((i & 32) != 0) {
            str5 = null;
        }
        this(uri, str, null, null, null, str5);
    }
}
