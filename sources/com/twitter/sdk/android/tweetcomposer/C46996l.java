package com.twitter.sdk.android.tweetcomposer;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.C1642a;
import com.twitter.sdk.android.core.C46825e;
import com.twitter.sdk.android.core.C46939k;
import com.twitter.sdk.android.core.C46940l;
import com.twitter.sdk.android.core.C46969q;
import com.twitter.sdk.android.core.C46972t;
import com.twitter.sdk.android.core.internal.p1845a.C46858f;
import com.twitter.sdk.android.core.internal.scribe.C46898a;
import java.net.URL;

/* renamed from: com.twitter.sdk.android.tweetcomposer.l */
public class C46996l {

    /* renamed from: a */
    static volatile C46996l f120564a;

    /* renamed from: b */
    C46939k<C46972t> f120565b = C46969q.m146847a().f120510b;

    /* renamed from: c */
    C46825e f120566c = C46969q.m146847a().mo118104c();

    /* renamed from: d */
    Context f120567d = C46940l.m146818b().mo118084a(m146921d());

    /* renamed from: e */
    public C46992i f120568e = new C46994j(null);

    /* renamed from: com.twitter.sdk.android.tweetcomposer.l$a */
    public static class C46997a {

        /* renamed from: a */
        private final Context f120569a;

        /* renamed from: b */
        private String f120570b;

        /* renamed from: c */
        private URL f120571c;

        /* renamed from: d */
        private Uri f120572d;

        /* renamed from: b */
        private Intent m146922b() {
            Intent c = m146923c();
            if (c == null) {
                return m146924d();
            }
            return c;
        }

        /* renamed from: a */
        public final void mo118167a() {
            this.f120569a.startActivity(m146922b());
        }

        /* renamed from: d */
        private Intent m146924d() {
            String str;
            if (this.f120571c == null) {
                str = "";
            } else {
                str = this.f120571c.toString();
            }
            return new Intent("android.intent.action.VIEW", Uri.parse(C1642a.m8034a("https://twitter.com/intent/tweet?text=%s&url=%s", new Object[]{C46858f.m146567a(this.f120570b), C46858f.m146567a(str)})));
        }

        /* renamed from: c */
        private Intent m146923c() {
            Intent intent = new Intent("android.intent.action.SEND");
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f120570b)) {
                sb.append(this.f120570b);
            }
            if (this.f120571c != null) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(this.f120571c.toString());
            }
            intent.putExtra("android.intent.extra.TEXT", sb.toString());
            intent.setType("text/plain");
            if (this.f120572d != null) {
                intent.putExtra("android.intent.extra.STREAM", this.f120572d);
                intent.setType("image/jpeg");
            }
            for (ResolveInfo resolveInfo : this.f120569a.getPackageManager().queryIntentActivities(intent, 65536)) {
                if (resolveInfo.activityInfo.packageName.startsWith("com.twitter.android")) {
                    intent.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
                    return intent;
                }
            }
            return null;
        }

        public C46997a(Context context) {
            if (context != null) {
                this.f120569a = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public final C46997a mo118165a(Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("imageUri must not be null.");
            } else if (this.f120572d == null) {
                this.f120572d = uri;
                return this;
            } else {
                throw new IllegalStateException("imageUri already set.");
            }
        }

        /* renamed from: a */
        public final C46997a mo118166a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("text must not be null.");
            } else if (this.f120570b == null) {
                this.f120570b = str;
                return this;
            } else {
                throw new IllegalStateException("text already set.");
            }
        }
    }

    /* renamed from: b */
    private static String m146919b() {
        return "3.2.0.11";
    }

    /* renamed from: d */
    private static String m146921d() {
        return "com.twitter.sdk.android:tweet-composer";
    }

    /* renamed from: a */
    public static C46996l m146918a() {
        if (f120564a == null) {
            synchronized (C46996l.class) {
                if (f120564a == null) {
                    f120564a = new C46996l();
                }
            }
        }
        return f120564a;
    }

    C46996l() {
        m146920c();
    }

    /* renamed from: c */
    private void m146920c() {
        C46898a aVar = new C46898a(this.f120567d, this.f120565b, this.f120566c, C46940l.m146818b().f120360c, C46898a.m146694a("TweetComposer", m146919b()));
        this.f120568e = new C46994j(aVar);
    }
}
