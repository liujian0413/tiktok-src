package com.twitter.sdk.android.core.internal;

import android.content.Context;
import com.twitter.sdk.android.core.internal.p1846b.C46861b;
import com.twitter.sdk.android.core.internal.p1846b.C46862c;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* renamed from: com.twitter.sdk.android.core.internal.m */
public final class C46875m {

    /* renamed from: e */
    private static final Pattern f120188e = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: f */
    private static final String f120189f = Pattern.quote("/");

    /* renamed from: a */
    public final String f120190a;

    /* renamed from: b */
    C46865c f120191b;

    /* renamed from: c */
    C46859b f120192c;

    /* renamed from: d */
    boolean f120193d;

    /* renamed from: g */
    private final ReentrantLock f120194g;

    /* renamed from: h */
    private final boolean f120195h;

    /* renamed from: i */
    private final C46861b f120196i;

    /* renamed from: b */
    public final String mo117974b() {
        if (this.f120195h) {
            C46859b d = m146622d();
            if (d != null) {
                return d.f120166a;
            }
        }
        return null;
    }

    /* renamed from: d */
    private synchronized C46859b m146622d() {
        if (!this.f120193d) {
            this.f120192c = this.f120191b.mo117966a();
            this.f120193d = true;
        }
        return this.f120192c;
    }

    /* renamed from: c */
    private String m146621c() {
        this.f120194g.lock();
        try {
            String string = this.f120196i.mo117960a().getString("installation_uuid", null);
            if (string == null) {
                string = m146620a(UUID.randomUUID().toString());
                this.f120196i.mo117961a(this.f120196i.mo117962b().putString("installation_uuid", string));
            }
            return string;
        } finally {
            this.f120194g.unlock();
        }
    }

    /* renamed from: a */
    public final String mo117973a() {
        String str = "";
        if (!this.f120195h) {
            return str;
        }
        String string = this.f120196i.mo117960a().getString("installation_uuid", null);
        if (string == null) {
            return m146621c();
        }
        return string;
    }

    public C46875m(Context context) {
        this(context, new C46862c(context, "com.twitter.sdk.android.AdvertisingPreferences"));
    }

    /* renamed from: a */
    private static String m146620a(String str) {
        if (str == null) {
            return null;
        }
        return f120188e.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    private C46875m(Context context, C46861b bVar) {
        this(context, bVar, new C46865c(context, bVar));
    }

    private C46875m(Context context, C46861b bVar, C46865c cVar) {
        this.f120194g = new ReentrantLock();
        if (context != null) {
            this.f120190a = context.getPackageName();
            this.f120191b = cVar;
            this.f120196i = bVar;
            this.f120195h = C46869g.m146608a(context, "com.twitter.sdk.android.COLLECT_IDENTIFIERS_ENABLED", true);
            if (!this.f120195h) {
                new StringBuilder("Device ID collection disabled for ").append(context.getPackageName());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("appContext must not be null");
    }
}
