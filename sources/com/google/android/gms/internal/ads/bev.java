package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.lang.reflect.InvocationTargetException;

public final class bev extends bfw {

    /* renamed from: d */
    private final Activity f41820d;

    /* renamed from: e */
    private final View f41821e;

    public bev(beh beh, String str, String str2, C16247a aVar, int i, int i2, View view, Activity activity) {
        super(beh, str, str2, aVar, i, 62);
        this.f41821e = view;
        this.f41820d = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40578a() throws IllegalAccessException, InvocationTargetException {
        if (this.f41821e != null) {
            boolean booleanValue = ((Boolean) bym.m50299d().mo41272a(C15585bw.f43853bu)).booleanValue();
            Object[] objArr = (Object[]) this.f41860c.invoke(null, new Object[]{this.f41821e, this.f41820d, Boolean.valueOf(booleanValue)});
            synchronized (this.f41859b) {
                this.f41859b.mo42202E(((Long) objArr[0]).longValue());
                this.f41859b.mo42203F(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f41859b.mo42231h((String) objArr[2]);
                }
            }
        }
    }
}
