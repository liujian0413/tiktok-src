package com.bytedance.android.live.core.utils;

import android.content.ClipData;
import android.content.ClipboardManager;

/* renamed from: com.bytedance.android.live.core.utils.c */
public final class C3381c {

    /* renamed from: a */
    private static CharSequence f10182a;

    /* renamed from: a */
    public static void m12568a(CharSequence charSequence) throws Exception {
        f10182a = charSequence;
        ((ClipboardManager) C3358ac.m12528e().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
    }
}
