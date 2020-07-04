package com.p280ss.android.ugc.aweme.sharer;

import android.net.Uri;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.j */
public final class C38359j extends C38354f {

    /* renamed from: b */
    public final Uri f99575b;

    /* renamed from: c */
    public final String f99576c;

    /* renamed from: d */
    public final String f99577d;

    /* renamed from: e */
    public final String f99578e;

    /* renamed from: f */
    public final String f99579f;

    /* renamed from: g */
    public final String f99580g;

    public C38359j(Uri uri, String str) {
        this(uri, str, null, null, null, null, 60, null);
    }

    private C38359j(Uri uri, String str, String str2, String str3, String str4, String str5) {
        C7573i.m23587b(uri, "localUri");
        super(null);
        this.f99575b = uri;
        this.f99576c = str;
        this.f99577d = str2;
        this.f99578e = str3;
        this.f99579f = str4;
        this.f99580g = str5;
    }

    public /* synthetic */ C38359j(Uri uri, String str, String str2, String str3, String str4, String str5, int i, C7571f fVar) {
        String str6;
        String str7;
        String str8;
        String str9;
        if ((i & 2) != 0) {
            str6 = null;
        } else {
            str6 = str;
        }
        if ((i & 4) != 0) {
            str7 = null;
        } else {
            str7 = str2;
        }
        if ((i & 16) != 0) {
            str8 = null;
        } else {
            str8 = str4;
        }
        if ((i & 32) != 0) {
            str9 = null;
        } else {
            str9 = str5;
        }
        this(uri, str6, str7, null, str8, str9);
    }
}
