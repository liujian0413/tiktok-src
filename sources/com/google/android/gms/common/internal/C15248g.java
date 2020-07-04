package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.common.api.internal.C15139g;

/* renamed from: com.google.android.gms.common.internal.g */
public abstract class C15248g implements OnClickListener {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo38590a();

    /* renamed from: a */
    public static C15248g m44343a(Activity activity, Intent intent, int i) {
        return new C15274w(intent, activity, i);
    }

    /* renamed from: a */
    public static C15248g m44344a(C15139g gVar, Intent intent, int i) {
        return new C15275x(intent, gVar, 2);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo38590a();
        } catch (ActivityNotFoundException unused) {
        } finally {
            dialogInterface.dismiss();
        }
    }
}
