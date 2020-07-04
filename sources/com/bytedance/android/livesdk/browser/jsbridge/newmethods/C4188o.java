package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.o */
public final class C4188o implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C7563m f12256a;

    public C4188o(C7563m mVar) {
        this.f12256a = mVar;
    }

    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        C7573i.m23582a(this.f12256a.invoke(dialogInterface, Integer.valueOf(i)), "invoke(...)");
    }
}
