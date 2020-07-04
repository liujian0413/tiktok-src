package com.facebook.messenger;

import android.net.Uri;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.messenger.b */
public final class C14119b {

    /* renamed from: a */
    public static final Set<String> f37297a;

    /* renamed from: b */
    public static final Set<String> f37298b;

    /* renamed from: c */
    public static final Set<String> f37299c;

    /* renamed from: d */
    public final Uri f37300d;

    /* renamed from: e */
    public final String f37301e;

    /* renamed from: f */
    public final String f37302f;

    /* renamed from: g */
    public final Uri f37303g;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("image/*");
        hashSet.add("image/jpeg");
        hashSet.add("image/png");
        hashSet.add("image/gif");
        hashSet.add("image/webp");
        hashSet.add("video/*");
        hashSet.add("video/mp4");
        hashSet.add("audio/*");
        hashSet.add("audio/mpeg");
        f37298b = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(C38347c.f99553h);
        hashSet2.add("android.resource");
        hashSet2.add("file");
        f37297a = Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(WebKitApi.SCHEME_HTTP);
        hashSet3.add(WebKitApi.SCHEME_HTTPS);
        f37299c = Collections.unmodifiableSet(hashSet3);
    }

    C14119b(C14120c cVar) {
        this.f37300d = cVar.f37304a;
        this.f37301e = cVar.f37305b;
        this.f37302f = cVar.f37306c;
        this.f37303g = cVar.f37307d;
        if (this.f37300d == null) {
            throw new NullPointerException("Must provide non-null uri");
        } else if (this.f37301e == null) {
            throw new NullPointerException("Must provide mimeType");
        } else if (!f37297a.contains(this.f37300d.getScheme())) {
            StringBuilder sb = new StringBuilder("Unsupported URI scheme: ");
            sb.append(this.f37300d.getScheme());
            throw new IllegalArgumentException(sb.toString());
        } else if (!f37298b.contains(this.f37301e)) {
            StringBuilder sb2 = new StringBuilder("Unsupported mime-type: ");
            sb2.append(this.f37301e);
            throw new IllegalArgumentException(sb2.toString());
        } else if (this.f37303g != null && !f37299c.contains(this.f37303g.getScheme())) {
            StringBuilder sb3 = new StringBuilder("Unsupported external uri scheme: ");
            sb3.append(this.f37303g.getScheme());
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: a */
    public static C14120c m41693a(Uri uri, String str) {
        return new C14120c(uri, str);
    }
}
