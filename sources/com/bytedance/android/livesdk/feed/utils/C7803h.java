package com.bytedance.android.livesdk.feed.utils;

import com.bytedance.android.livesdk.feed.utils.ObjectInspector.DslParser.Token.Type;

/* renamed from: com.bytedance.android.livesdk.feed.utils.h */
public final /* synthetic */ class C7803h {

    /* renamed from: a */
    public static final /* synthetic */ int[] f21056a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f21057b;

    static {
        int[] iArr = new int[Type.values().length];
        f21056a = iArr;
        iArr[Type.SLASH.ordinal()] = 1;
        f21056a[Type.DOT.ordinal()] = 2;
        int[] iArr2 = new int[Type.values().length];
        f21057b = iArr2;
        iArr2[Type.SLASH.ordinal()] = 1;
        f21057b[Type.DOT.ordinal()] = 2;
        f21057b[Type.IDENTIFIER.ordinal()] = 3;
    }
}
