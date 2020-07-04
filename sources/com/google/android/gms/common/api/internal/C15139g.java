package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.api.internal.g */
public interface C15139g {
    /* renamed from: a */
    Activity mo38382a();

    /* renamed from: a */
    <T extends LifecycleCallback> T mo38383a(String str, Class<T> cls);

    /* renamed from: a */
    void mo38384a(String str, LifecycleCallback lifecycleCallback);

    void startActivityForResult(Intent intent, int i);
}
