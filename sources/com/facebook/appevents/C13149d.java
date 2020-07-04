package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.content.C0688e;
import com.C1642a;
import com.facebook.AccessToken;
import com.facebook.C13499h;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13090b;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import com.facebook.internal.C13924n;
import com.facebook.internal.C13926o;
import com.facebook.internal.C13949t;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.d */
class C13149d {

    /* renamed from: a */
    public static volatile C13122c f34843a = new C13122c();

    /* renamed from: b */
    public static final ScheduledExecutorService f34844b = C13156e.m38454a();

    /* renamed from: c */
    public static ScheduledFuture f34845c = null;

    /* renamed from: d */
    public static final Runnable f34846d = new Runnable() {
        public final void run() {
            C13149d.f34845c = null;
            if (AppEventsLogger.m38355a() != FlushBehavior.EXPLICIT_ONLY) {
                C13149d.m38452b(C13162h.TIMER);
            }
        }
    };

    /* renamed from: e */
    private static final String f34847e = "com.facebook.appevents.d";

    C13149d() {
    }

    /* renamed from: b */
    public static Set<C13117a> m38451b() {
        return f34843a.mo32292a();
    }

    /* renamed from: a */
    public static void m38447a() {
        f34844b.execute(new Runnable() {
            public final void run() {
                C13157f.m38457a(C13149d.f34843a);
                C13149d.f34843a = new C13122c();
            }
        });
    }

    /* renamed from: a */
    public static void m38450a(final C13162h hVar) {
        f34844b.execute(new Runnable() {
            public final void run() {
                C13149d.m38452b(hVar);
            }
        });
    }

    /* renamed from: b */
    static void m38452b(C13162h hVar) {
        f34843a.mo32294a(C13157f.m38455a());
        try {
            C13163i a = m38446a(hVar, f34843a);
            if (a != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", a.f34876a);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", a.f34877b);
                C0688e.m2941a(C13499h.m39721g()).mo2839a(intent);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m38449a(final C13117a aVar, final AppEvent appEvent) {
        f34844b.execute(new Runnable() {
            public final void run() {
                C13149d.f34843a.mo32293a(aVar, appEvent);
                if (AppEventsLogger.m38355a() == FlushBehavior.EXPLICIT_ONLY || C13149d.f34843a.mo32295b() <= 100) {
                    if (C13149d.f34845c == null) {
                        C13149d.f34845c = C13149d.f34844b.schedule(C13149d.f34846d, 15, TimeUnit.SECONDS);
                    }
                    return;
                }
                C13149d.m38452b(C13162h.EVENT_THRESHOLD);
            }
        });
    }

    /* renamed from: a */
    private static C13163i m38446a(C13162h hVar, C13122c cVar) {
        C13163i iVar = new C13163i();
        boolean b = C13499h.m39714b(C13499h.m39721g());
        ArrayList<GraphRequest> arrayList = new ArrayList<>();
        for (C13117a aVar : cVar.mo32292a()) {
            GraphRequest a = m38445a(aVar, cVar.mo32291a(aVar), b, iVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        C13949t.m41131a(LoggingBehavior.APP_EVENTS, f34847e, "Flushing %d events due to %s.", Integer.valueOf(iVar.f34876a), hVar.toString());
        for (GraphRequest a2 : arrayList) {
            a2.mo31788a();
        }
        return iVar;
    }

    /* renamed from: a */
    private static GraphRequest m38445a(final C13117a aVar, final C13191l lVar, boolean z, final C13163i iVar) {
        String b = aVar.mo32287b();
        boolean z2 = false;
        C13924n a = C13926o.m41099a(b, false);
        final GraphRequest a2 = GraphRequest.m38253a((AccessToken) null, C1642a.m8034a("%s/activities", new Object[]{b}), (JSONObject) null, (C13090b) null);
        Bundle bundle = a2.f34680j;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("access_token", aVar.mo32286a());
        String d = C13187j.m38544d();
        if (d != null) {
            bundle.putString("device_token", d);
        }
        String e = C13159g.m38471e();
        if (e != null) {
            bundle.putString("install_referrer", e);
        }
        a2.f34680j = bundle;
        if (a != null) {
            z2 = a.f36837a;
        }
        int a3 = lVar.mo32377a(a2, C13499h.m39721g(), z2, z);
        if (a3 == 0) {
            return null;
        }
        iVar.f34876a += a3;
        a2.mo31789a((C13090b) new C13090b() {
            /* renamed from: a */
            public final void mo31792a(GraphResponse graphResponse) {
                C13149d.m38448a(aVar, a2, graphResponse, lVar, iVar);
            }
        });
        return a2;
    }

    /* renamed from: a */
    public static void m38448a(final C13117a aVar, GraphRequest graphRequest, GraphResponse graphResponse, final C13191l lVar, C13163i iVar) {
        String str;
        FacebookRequestError facebookRequestError = graphResponse.f34704d;
        String str2 = "Success";
        FlushResult flushResult = FlushResult.SUCCESS;
        boolean z = true;
        if (facebookRequestError != null) {
            if (facebookRequestError.f34654d == -1) {
                str2 = "Failed: No Connectivity";
                flushResult = FlushResult.NO_CONNECTIVITY;
            } else {
                str2 = C1642a.m8034a("Failed:\n  Response: %s\n  Error %s", new Object[]{graphResponse.toString(), facebookRequestError.toString()});
                flushResult = FlushResult.SERVER_ERROR;
            }
        }
        if (C13499h.m39715b(LoggingBehavior.APP_EVENTS)) {
            try {
                str = new JSONArray((String) graphRequest.f34682l).toString(2);
            } catch (JSONException unused) {
                str = "<Can't encode events for debug logging>";
            }
            C13949t.m41131a(LoggingBehavior.APP_EVENTS, f34847e, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", graphRequest.f34676f.toString(), str2, str);
        }
        if (facebookRequestError == null) {
            z = false;
        }
        lVar.mo32379a(z);
        if (flushResult == FlushResult.NO_CONNECTIVITY) {
            C13499h.m39719e().execute(new Runnable() {
                public final void run() {
                    C13157f.m38456a(aVar, lVar);
                }
            });
        }
        if (flushResult != FlushResult.SUCCESS && iVar.f34877b != FlushResult.NO_CONNECTIVITY) {
            iVar.f34877b = flushResult;
        }
    }
}
