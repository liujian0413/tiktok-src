package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;

final class adt implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C15472ads f40073a;

    adt(C15472ads ads) {
        this.f40073a = ads;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        acl.m45527a(this.f40073a.f40069a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
