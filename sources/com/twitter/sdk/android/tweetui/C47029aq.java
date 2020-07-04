package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.core.C46825e;
import com.twitter.sdk.android.core.C46939k;
import com.twitter.sdk.android.core.C46940l;
import com.twitter.sdk.android.core.C46969q;
import com.twitter.sdk.android.core.C46972t;
import com.twitter.sdk.android.core.internal.scribe.C46898a;
import com.twitter.sdk.android.core.internal.scribe.C46908e;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import java.util.List;

/* renamed from: com.twitter.sdk.android.tweetui.aq */
public class C47029aq {

    /* renamed from: a */
    static volatile C47029aq f120671a;

    /* renamed from: b */
    C46939k<C46972t> f120672b;

    /* renamed from: c */
    C46825e f120673c;

    /* renamed from: d */
    C46898a f120674d;

    /* renamed from: e */
    Context f120675e = C46940l.m146818b().mo118084a(m147041b());

    /* renamed from: f */
    public C47018aj f120676f;

    /* renamed from: g */
    public Picasso f120677g;

    /* renamed from: b */
    private static String m147041b() {
        return "com.twitter.sdk.android:tweet-ui";
    }

    /* renamed from: c */
    private static String m147042c() {
        return "3.2.0.11";
    }

    /* renamed from: a */
    public static C47029aq m147040a() {
        if (f120671a == null) {
            synchronized (C47029aq.class) {
                if (f120671a == null) {
                    f120671a = new C47029aq();
                }
            }
        }
        return f120671a;
    }

    /* renamed from: d */
    private void m147043d() {
        C46898a aVar = new C46898a(this.f120675e, this.f120672b, this.f120673c, C46940l.m146818b().f120360c, C46898a.m146694a("TweetUi", m147042c()));
        this.f120674d = aVar;
    }

    C47029aq() {
        C46969q a = C46969q.m146847a();
        this.f120672b = a.f120510b;
        this.f120673c = a.mo118104c();
        this.f120676f = new C47018aj(new Handler(Looper.getMainLooper()), a.f120510b);
        this.f120677g = Picasso.m61392a(C46940l.m146818b().mo118084a(m147041b()));
        m147043d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118235a(C46908e... eVarArr) {
        if (this.f120674d != null) {
            for (int i = 0; i <= 0; i++) {
                C46908e eVar = eVarArr[0];
                this.f120674d.mo118023a(eVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118234a(C46908e eVar, List<ScribeItem> list) {
        if (this.f120674d != null) {
            this.f120674d.mo118022a(eVar, list);
        }
    }
}
