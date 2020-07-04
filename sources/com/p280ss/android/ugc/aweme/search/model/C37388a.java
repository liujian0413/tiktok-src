package com.p280ss.android.ugc.aweme.search.model;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.search.model.a */
public final class C37388a {

    /* renamed from: a */
    public final Context f97625a;

    /* renamed from: b */
    public final SearchResultParam f97626b;

    /* renamed from: c */
    public final SearchEnterParam f97627c;

    /* renamed from: d */
    public final String f97628d;

    /* renamed from: e */
    public final String f97629e;

    /* renamed from: f */
    public final Bundle f97630f;

    public C37388a(Context context, SearchResultParam searchResultParam, SearchEnterParam searchEnterParam, String str, String str2, Bundle bundle) {
        C7573i.m23587b(searchResultParam, "param");
        this.f97625a = context;
        this.f97626b = searchResultParam;
        this.f97627c = searchEnterParam;
        this.f97628d = str;
        this.f97629e = str2;
        this.f97630f = bundle;
    }

    public /* synthetic */ C37388a(Context context, SearchResultParam searchResultParam, SearchEnterParam searchEnterParam, String str, String str2, Bundle bundle, int i, C7571f fVar) {
        this(context, searchResultParam, null, null, null, null);
    }
}
