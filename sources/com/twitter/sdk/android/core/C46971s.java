package com.twitter.sdk.android.core;

import okhttp3.Headers;

/* renamed from: com.twitter.sdk.android.core.s */
public final class C46971s {

    /* renamed from: a */
    public int f120519a;

    /* renamed from: b */
    public int f120520b;

    /* renamed from: c */
    public long f120521c;

    C46971s(Headers headers) {
        if (headers != null) {
            for (int i = 0; i < headers.size(); i++) {
                if ("x-rate-limit-limit".equals(headers.name(i))) {
                    this.f120519a = Integer.valueOf(headers.value(i)).intValue();
                } else if ("x-rate-limit-remaining".equals(headers.name(i))) {
                    this.f120520b = Integer.valueOf(headers.value(i)).intValue();
                } else if ("x-rate-limit-reset".equals(headers.name(i))) {
                    this.f120521c = Long.valueOf(headers.value(i)).longValue();
                }
            }
            return;
        }
        throw new IllegalArgumentException("headers must not be null");
    }
}
