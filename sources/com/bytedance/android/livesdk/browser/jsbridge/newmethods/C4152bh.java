package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bh */
final /* synthetic */ class C4152bh implements OnClickListener {

    /* renamed from: a */
    private final C4151bg f12189a;

    /* renamed from: b */
    private final JSONObject f12190b;

    /* renamed from: c */
    private final long f12191c;

    /* renamed from: d */
    private final String f12192d;

    /* renamed from: e */
    private final String f12193e;

    /* renamed from: f */
    private final Context f12194f;

    C4152bh(C4151bg bgVar, JSONObject jSONObject, long j, String str, String str2, Context context) {
        this.f12189a = bgVar;
        this.f12190b = jSONObject;
        this.f12191c = j;
        this.f12192d = str;
        this.f12193e = str2;
        this.f12194f = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f12189a.mo11712a(this.f12190b, this.f12191c, this.f12192d, this.f12193e, this.f12194f, dialogInterface, i);
    }
}
