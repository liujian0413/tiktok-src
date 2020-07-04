package com.bytedance.android.livesdk.rank;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.rank.e */
final /* synthetic */ class C8841e implements OnClickListener {

    /* renamed from: a */
    private final HashMap f24031a;

    C8841e(HashMap hashMap) {
        this.f24031a = hashMap;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DailyRankDialog.m26365a(this.f24031a, dialogInterface, i);
    }
}
