package com.facebook.share.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.content.C0688e;
import com.C1642a;
import com.facebook.AccessToken;
import com.facebook.C13338d;
import com.facebook.C13499h;
import com.facebook.C14064l;
import com.facebook.C14064l.C14065a;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13090b;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.C13187j;
import com.facebook.internal.C13861a;
import com.facebook.internal.C13888ad;
import com.facebook.internal.C13896c;
import com.facebook.internal.C13933p;
import com.facebook.internal.C13933p.C13941c;
import com.facebook.internal.C13945q;
import com.facebook.internal.C13949t;
import com.facebook.internal.C13953v;
import com.facebook.internal.C13962w.C13964a;
import com.facebook.internal.C13967z;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.C13855a;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.share.widget.LikeView.ObjectType;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.f */
public class C14496f {

    /* renamed from: a */
    public static final String f37464a = "f";

    /* renamed from: b */
    public static C13933p f37465b;

    /* renamed from: c */
    public static final ConcurrentHashMap<String, C14496f> f37466c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static volatile int f37467d;

    /* renamed from: q */
    private static C13888ad f37468q = new C13888ad(1);

    /* renamed from: r */
    private static C13888ad f37469r = new C13888ad(1);

    /* renamed from: s */
    private static Handler f37470s;

    /* renamed from: t */
    private static String f37471t;

    /* renamed from: u */
    private static boolean f37472u;

    /* renamed from: v */
    private static C13338d f37473v;

    /* renamed from: e */
    public String f37474e;

    /* renamed from: f */
    public ObjectType f37475f;

    /* renamed from: g */
    public boolean f37476g;

    /* renamed from: h */
    public String f37477h;

    /* renamed from: i */
    public String f37478i;

    /* renamed from: j */
    public String f37479j;

    /* renamed from: k */
    public String f37480k;

    /* renamed from: l */
    public String f37481l;

    /* renamed from: m */
    public String f37482m;

    /* renamed from: n */
    public boolean f37483n;

    /* renamed from: o */
    public boolean f37484o;

    /* renamed from: p */
    public boolean f37485p;

    /* renamed from: w */
    private Bundle f37486w;

    /* renamed from: x */
    private C13187j f37487x;

    /* renamed from: com.facebook.share.internal.f$4 */
    static /* synthetic */ class C145054 {

        /* renamed from: a */
        static final /* synthetic */ int[] f37507a = new int[ObjectType.values().length];

        static {
            try {
                f37507a[ObjectType.PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.facebook.share.internal.f$a */
    abstract class C14511a implements C14525n {

        /* renamed from: a */
        protected String f37514a;

        /* renamed from: b */
        protected ObjectType f37515b;

        /* renamed from: c */
        protected FacebookRequestError f37516c;

        /* renamed from: e */
        private GraphRequest f37518e;

        /* renamed from: a */
        public final FacebookRequestError mo36688a() {
            return this.f37516c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo36691a(GraphResponse graphResponse);

        /* renamed from: a */
        public final void mo36692a(C14064l lVar) {
            lVar.add(this.f37518e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo36689a(FacebookRequestError facebookRequestError) {
            C13949t.m41131a(LoggingBehavior.REQUESTS, C14496f.f37464a, "Error running request for object '%s' with type '%s' : %s", this.f37514a, this.f37515b, facebookRequestError);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo36690a(GraphRequest graphRequest) {
            this.f37518e = graphRequest;
            graphRequest.f34683m = C13499h.m39722h();
            graphRequest.mo31789a((C13090b) new C13090b() {
                /* renamed from: a */
                public final void mo31792a(GraphResponse graphResponse) {
                    C14511a.this.f37516c = graphResponse.f34704d;
                    if (C14511a.this.f37516c != null) {
                        C14511a.this.mo36689a(C14511a.this.f37516c);
                    } else {
                        C14511a.this.mo36691a(graphResponse);
                    }
                }
            });
        }

        protected C14511a(String str, ObjectType objectType) {
            this.f37514a = str;
            this.f37515b = objectType;
        }
    }

    /* renamed from: com.facebook.share.internal.f$b */
    static class C14513b implements Runnable {

        /* renamed from: a */
        private String f37520a;

        /* renamed from: b */
        private ObjectType f37521b;

        /* renamed from: c */
        private C14514c f37522c;

        public final void run() {
            C14496f.m41855b(this.f37520a, this.f37521b, this.f37522c);
        }

        C14513b(String str, ObjectType objectType, C14514c cVar) {
            this.f37520a = str;
            this.f37521b = objectType;
            this.f37522c = cVar;
        }
    }

    /* renamed from: com.facebook.share.internal.f$c */
    public interface C14514c {
        /* renamed from: a */
        void mo36681a(C14496f fVar, FacebookException facebookException);
    }

    /* renamed from: com.facebook.share.internal.f$d */
    class C14515d extends C14511a {

        /* renamed from: e */
        String f37523e = C14496f.this.f37477h;

        /* renamed from: f */
        String f37524f = C14496f.this.f37478i;

        /* renamed from: g */
        String f37525g = C14496f.this.f37479j;

        /* renamed from: h */
        String f37526h = C14496f.this.f37480k;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo36689a(FacebookRequestError facebookRequestError) {
            C13949t.m41131a(LoggingBehavior.REQUESTS, C14496f.f37464a, "Error fetching engagement for object '%s' with type '%s' : %s", this.f37514a, this.f37515b, facebookRequestError);
            C14496f.this.mo36674a("get_engagement", facebookRequestError);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo36691a(GraphResponse graphResponse) {
            JSONObject b = C13967z.m41257b(graphResponse.f34702b, "engagement");
            if (b != null) {
                this.f37523e = b.optString("count_string_with_like", this.f37523e);
                this.f37524f = b.optString("count_string_without_like", this.f37524f);
                this.f37525g = b.optString("social_sentence_with_like", this.f37525g);
                this.f37526h = b.optString("social_sentence_without_like", this.f37526h);
            }
        }

        C14515d(String str, ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
            bundle.putString("locale", Locale.getDefault().toString());
            mo36690a(new GraphRequest(AccessToken.m38225a(), str, bundle, HttpMethod.GET));
        }
    }

    /* renamed from: com.facebook.share.internal.f$e */
    class C14516e extends C14511a {

        /* renamed from: e */
        String f37528e;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo36691a(GraphResponse graphResponse) {
            JSONObject b = C13967z.m41257b(graphResponse.f34702b, this.f37514a);
            if (b != null) {
                JSONObject optJSONObject = b.optJSONObject("og_object");
                if (optJSONObject != null) {
                    this.f37528e = optJSONObject.optString("id");
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo36689a(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.mo31780a().contains("og_object")) {
                this.f37516c = null;
                return;
            }
            C13949t.m41131a(LoggingBehavior.REQUESTS, C14496f.f37464a, "Error getting the FB id for object '%s' with type '%s' : %s", this.f37514a, this.f37515b, facebookRequestError);
        }

        C14516e(String str, ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "og_object.fields(id)");
            bundle.putString("ids", str);
            mo36690a(new GraphRequest(AccessToken.m38225a(), "", bundle, HttpMethod.GET));
        }
    }

    /* renamed from: com.facebook.share.internal.f$f */
    class C14517f extends C14511a implements C14520i {

        /* renamed from: f */
        private boolean f37531f = C14496f.this.f37476g;

        /* renamed from: g */
        private String f37532g;

        /* renamed from: h */
        private final String f37533h;

        /* renamed from: i */
        private final ObjectType f37534i;

        /* renamed from: b */
        public final boolean mo36694b() {
            return this.f37531f;
        }

        /* renamed from: c */
        public final String mo36695c() {
            return this.f37532g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo36689a(FacebookRequestError facebookRequestError) {
            C13949t.m41131a(LoggingBehavior.REQUESTS, C14496f.f37464a, "Error fetching like status for object '%s' with type '%s' : %s", this.f37533h, this.f37534i, facebookRequestError);
            C14496f.this.mo36674a("get_og_object_like", facebookRequestError);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo36691a(GraphResponse graphResponse) {
            JSONArray c = C13967z.m41263c(graphResponse.f34702b, "data");
            if (c != null) {
                for (int i = 0; i < c.length(); i++) {
                    JSONObject optJSONObject = c.optJSONObject(i);
                    if (optJSONObject != null) {
                        this.f37531f = true;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("application");
                        AccessToken a = AccessToken.m38225a();
                        if (optJSONObject2 != null && AccessToken.m38232b() && C13967z.m41248a(a.f34630h, optJSONObject2.optString("id"))) {
                            this.f37532g = optJSONObject.optString("id");
                        }
                    }
                }
            }
        }

        C14517f(String str, ObjectType objectType) {
            super(str, objectType);
            this.f37533h = str;
            this.f37534i = objectType;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id,application");
            bundle.putString("object", this.f37533h);
            mo36690a(new GraphRequest(AccessToken.m38225a(), "me/og.likes", bundle, HttpMethod.GET));
        }
    }

    /* renamed from: com.facebook.share.internal.f$g */
    class C14518g extends C14511a {

        /* renamed from: e */
        String f37535e;

        /* renamed from: f */
        boolean f37536f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo36689a(FacebookRequestError facebookRequestError) {
            C13949t.m41131a(LoggingBehavior.REQUESTS, C14496f.f37464a, "Error getting the FB id for object '%s' with type '%s' : %s", this.f37514a, this.f37515b, facebookRequestError);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo36691a(GraphResponse graphResponse) {
            JSONObject b = C13967z.m41257b(graphResponse.f34702b, this.f37514a);
            if (b != null) {
                this.f37535e = b.optString("id");
                this.f37536f = !C13967z.m41249a(this.f37535e);
            }
        }

        C14518g(String str, ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id");
            bundle.putString("ids", str);
            mo36690a(new GraphRequest(AccessToken.m38225a(), "", bundle, HttpMethod.GET));
        }
    }

    /* renamed from: com.facebook.share.internal.f$h */
    class C14519h extends C14511a implements C14520i {

        /* renamed from: f */
        private boolean f37539f = C14496f.this.f37476g;

        /* renamed from: g */
        private String f37540g;

        /* renamed from: b */
        public final boolean mo36694b() {
            return this.f37539f;
        }

        /* renamed from: c */
        public final String mo36695c() {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo36689a(FacebookRequestError facebookRequestError) {
            C13949t.m41131a(LoggingBehavior.REQUESTS, C14496f.f37464a, "Error fetching like status for page id '%s': %s", this.f37540g, facebookRequestError);
            C14496f.this.mo36674a("get_page_like", facebookRequestError);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo36691a(GraphResponse graphResponse) {
            JSONArray c = C13967z.m41263c(graphResponse.f34702b, "data");
            if (c != null && c.length() > 0) {
                this.f37539f = true;
            }
        }

        C14519h(String str) {
            super(str, ObjectType.PAGE);
            this.f37540g = str;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id");
            AccessToken a = AccessToken.m38225a();
            StringBuilder sb = new StringBuilder("me/likes/");
            sb.append(str);
            mo36690a(new GraphRequest(a, sb.toString(), bundle, HttpMethod.GET));
        }
    }

    /* renamed from: com.facebook.share.internal.f$i */
    interface C14520i extends C14525n {
        /* renamed from: b */
        boolean mo36694b();

        /* renamed from: c */
        String mo36695c();
    }

    /* renamed from: com.facebook.share.internal.f$j */
    static class C14521j implements Runnable {

        /* renamed from: a */
        private static ArrayList<String> f37541a = new ArrayList<>();

        /* renamed from: b */
        private String f37542b;

        /* renamed from: c */
        private boolean f37543c;

        public final void run() {
            if (this.f37542b != null) {
                f37541a.remove(this.f37542b);
                f37541a.add(0, this.f37542b);
            }
            if (this.f37543c && f37541a.size() >= 128) {
                while (64 < f37541a.size()) {
                    ArrayList<String> arrayList = f37541a;
                    C14496f.f37466c.remove((String) arrayList.remove(arrayList.size() - 1));
                }
            }
        }

        C14521j(String str, boolean z) {
            this.f37542b = str;
            this.f37543c = z;
        }
    }

    /* renamed from: com.facebook.share.internal.f$k */
    class C14522k extends C14511a {

        /* renamed from: e */
        String f37544e;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo36691a(GraphResponse graphResponse) {
            this.f37544e = C13967z.m41225a(graphResponse.f34702b, "id");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo36689a(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.f34654d == 3501) {
                this.f37516c = null;
                return;
            }
            C13949t.m41131a(LoggingBehavior.REQUESTS, C14496f.f37464a, "Error liking object '%s' with type '%s' : %s", this.f37514a, this.f37515b, facebookRequestError);
            C14496f.this.mo36674a("publish_like", facebookRequestError);
        }

        C14522k(String str, ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString("object", str);
            mo36690a(new GraphRequest(AccessToken.m38225a(), "me/og.likes", bundle, HttpMethod.POST));
        }
    }

    /* renamed from: com.facebook.share.internal.f$l */
    class C14523l extends C14511a {

        /* renamed from: f */
        private String f37547f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo36691a(GraphResponse graphResponse) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo36689a(FacebookRequestError facebookRequestError) {
            C13949t.m41131a(LoggingBehavior.REQUESTS, C14496f.f37464a, "Error unliking object with unlike token '%s' : %s", this.f37547f, facebookRequestError);
            C14496f.this.mo36674a("publish_unlike", facebookRequestError);
        }

        C14523l(String str) {
            super(null, null);
            this.f37547f = str;
            mo36690a(new GraphRequest(AccessToken.m38225a(), str, null, HttpMethod.DELETE));
        }
    }

    /* renamed from: com.facebook.share.internal.f$m */
    interface C14524m {
        /* renamed from: a */
        void mo36682a();
    }

    /* renamed from: com.facebook.share.internal.f$n */
    interface C14525n {
        /* renamed from: a */
        FacebookRequestError mo36688a();

        /* renamed from: a */
        void mo36692a(C14064l lVar);
    }

    /* renamed from: com.facebook.share.internal.f$o */
    static class C14526o implements Runnable {

        /* renamed from: a */
        private String f37548a;

        /* renamed from: b */
        private String f37549b;

        public final void run() {
            C14496f.m41848a(this.f37548a, this.f37549b);
        }

        C14526o(String str, String str2) {
            this.f37548a = str;
            this.f37549b = str2;
        }
    }

    /* renamed from: a */
    public static boolean m41849a(final int i, final int i2, final Intent intent) {
        if (C13967z.m41249a(f37471t)) {
            f37471t = C7285c.m22838a(C13499h.m39721g(), "com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", null);
        }
        if (C13967z.m41249a(f37471t)) {
            return false;
        }
        m41847a(f37471t, ObjectType.UNKNOWN, (C14514c) new C14514c() {
            /* renamed from: a */
            public final void mo36681a(C14496f fVar, FacebookException facebookException) {
                if (facebookException == null) {
                    fVar.mo36678b(i, i2, intent);
                }
            }
        });
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m41848a(java.lang.String r2, java.lang.String r3) {
        /*
            r0 = 0
            com.facebook.internal.p r1 = f37465b     // Catch:{ IOException -> 0x001e, all -> 0x0016 }
            java.io.OutputStream r2 = r1.mo33582b(r2)     // Catch:{ IOException -> 0x001e, all -> 0x0016 }
            byte[] r3 = r3.getBytes()     // Catch:{ IOException -> 0x001f, all -> 0x0014 }
            r2.write(r3)     // Catch:{ IOException -> 0x001f, all -> 0x0014 }
            if (r2 == 0) goto L_0x0025
            com.facebook.internal.C13967z.m41239a(r2)
            return
        L_0x0014:
            r3 = move-exception
            goto L_0x0018
        L_0x0016:
            r3 = move-exception
            r2 = r0
        L_0x0018:
            if (r2 == 0) goto L_0x001d
            com.facebook.internal.C13967z.m41239a(r2)
        L_0x001d:
            throw r3
        L_0x001e:
            r2 = r0
        L_0x001f:
            if (r2 == 0) goto L_0x0025
            com.facebook.internal.C13967z.m41239a(r2)
            return
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C14496f.m41848a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final String mo36670a() {
        return this.f37476g ? this.f37477h : this.f37478i;
    }

    /* renamed from: a */
    public final void mo36671a(Activity activity, C13945q qVar, Bundle bundle) {
        boolean z = true;
        boolean z2 = !this.f37476g;
        if (m41865h()) {
            m41856b(z2);
            if (this.f37485p) {
                mo36679c().mo32371b("fb_like_control_did_undo_quickly", bundle);
                return;
            }
            if (!m41850a(z2, bundle)) {
                if (z2) {
                    z = false;
                }
                m41856b(z);
            }
        }
        m41854b(activity, qVar, bundle);
    }

    /* renamed from: a */
    private boolean m41850a(boolean z, Bundle bundle) {
        if (m41865h()) {
            if (z) {
                m41858c(bundle);
                return true;
            } else if (!C13967z.m41249a(this.f37481l)) {
                m41860d(bundle);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo36675a(boolean z) {
        m41856b(z);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action");
        m41845a(this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
    }

    /* renamed from: a */
    public final void mo36676a(boolean z, String str, String str2, String str3, String str4, String str5) {
        String a = C13967z.m41222a(str, (String) null);
        String a2 = C13967z.m41222a(str2, (String) null);
        String a3 = C13967z.m41222a(str3, (String) null);
        String a4 = C13967z.m41222a(str4, (String) null);
        String a5 = C13967z.m41222a(str5, (String) null);
        if (z != this.f37476g || !C13967z.m41248a(a, this.f37477h) || !C13967z.m41248a(a2, this.f37478i) || !C13967z.m41248a(a3, this.f37479j) || !C13967z.m41248a(a4, this.f37480k) || !C13967z.m41248a(a5, this.f37481l)) {
            this.f37476g = z;
            this.f37477h = a;
            this.f37478i = a2;
            this.f37479j = a3;
            this.f37480k = a4;
            this.f37481l = a5;
            m41842a(this);
            m41844a(this, "com.facebook.sdk.LikeActionController.UPDATED");
        }
    }

    /* renamed from: a */
    public final void mo36672a(Bundle bundle) {
        if (this.f37476g != this.f37484o && !m41850a(this.f37476g, bundle)) {
            mo36675a(!this.f37476g);
        }
    }

    /* renamed from: a */
    public final void mo36673a(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("object_id", this.f37474e);
        bundle2.putString("object_type", this.f37475f.toString());
        bundle2.putString("current_action", str);
        mo36679c().mo32367a("fb_like_control_error", (Double) null, bundle2);
    }

    /* renamed from: a */
    public final void mo36674a(String str, FacebookRequestError facebookRequestError) {
        Bundle bundle = new Bundle();
        if (facebookRequestError != null) {
            JSONObject jSONObject = facebookRequestError.f34660j;
            if (jSONObject != null) {
                bundle.putString("error", jSONObject.toString());
            }
        }
        mo36673a(str, bundle);
    }

    /* renamed from: f */
    private static void m41863f() {
        f37473v = new C13338d() {
            /* renamed from: a */
            public final void mo32630a(AccessToken accessToken, AccessToken accessToken2) {
                Context g = C13499h.m39721g();
                if (accessToken2 == null) {
                    C14496f.f37467d = (C14496f.f37467d + 1) % 1000;
                    C7285c.m22838a(g, "com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", C14496f.f37467d).apply();
                    C14496f.f37466c.clear();
                    C14496f.f37465b.mo33580a();
                }
                C14496f.m41844a((C14496f) null, "com.facebook.sdk.LikeActionController.DID_RESET");
            }
        };
    }

    /* renamed from: g */
    private void m41864g() {
        this.f37486w = null;
        m41862e(null);
    }

    /* renamed from: i */
    private void m41866i() {
        C14528h hVar = new C14528h(C13499h.m39721g(), C13499h.m39725k(), this.f37474e);
        if (hVar.mo33612a()) {
            hVar.f36931b = new C13964a() {
                /* renamed from: a */
                public final void mo33617a(Bundle bundle) {
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    if (bundle != null && bundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED")) {
                        boolean z = bundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
                        if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE")) {
                            str = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
                        } else {
                            str = C14496f.this.f37477h;
                        }
                        String str6 = str;
                        if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE")) {
                            str2 = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
                        } else {
                            str2 = C14496f.this.f37478i;
                        }
                        String str7 = str2;
                        if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE")) {
                            str3 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
                        } else {
                            str3 = C14496f.this.f37479j;
                        }
                        String str8 = str3;
                        if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE")) {
                            str4 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
                        } else {
                            str4 = C14496f.this.f37480k;
                        }
                        String str9 = str4;
                        if (bundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN")) {
                            str5 = bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN");
                        } else {
                            str5 = C14496f.this.f37481l;
                        }
                        C14496f.this.mo36676a(z, str6, str7, str8, str9, str5);
                    }
                }
            };
        }
    }

    /* renamed from: c */
    public final C13187j mo36679c() {
        if (this.f37487x == null) {
            this.f37487x = new C13187j(C13499h.m39721g());
        }
        return this.f37487x;
    }

    /* renamed from: h */
    private boolean m41865h() {
        AccessToken a = AccessToken.m38225a();
        if (this.f37483n || this.f37482m == null || !AccessToken.m38232b() || a.f34624b == null || !a.f34624b.contains("publish_actions")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static synchronized void m41861e() {
        synchronized (C14496f.class) {
            if (!f37472u) {
                f37470s = new Handler(Looper.getMainLooper());
                f37467d = C7285c.m22838a(C13499h.m39721g(), "com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
                f37465b = new C13933p(f37464a, new C13941c());
                m41863f();
                CallbackManagerImpl.m40921a(RequestCodeOffset.Like.toRequestCode(), new C13855a() {
                    /* renamed from: a */
                    public final boolean mo33483a(int i, Intent intent) {
                        return C14496f.m41849a(RequestCodeOffset.Like.toRequestCode(), i, intent);
                    }
                });
                f37472u = true;
            }
        }
    }

    /* renamed from: d */
    public final void mo36680d() {
        if (!AccessToken.m38232b()) {
            m41866i();
        } else {
            m41841a((C14524m) new C14524m() {
                /* renamed from: a */
                public final void mo36682a() {
                    final C14520i iVar;
                    if (C145054.f37507a[C14496f.this.f37475f.ordinal()] != 1) {
                        iVar = new C14517f(C14496f.this.f37482m, C14496f.this.f37475f);
                    } else {
                        iVar = new C14519h(C14496f.this.f37482m);
                    }
                    final C14515d dVar = new C14515d(C14496f.this.f37482m, C14496f.this.f37475f);
                    C14064l lVar = new C14064l();
                    iVar.mo36692a(lVar);
                    dVar.mo36692a(lVar);
                    lVar.mo33711a((C14065a) new C14065a() {
                        /* renamed from: a */
                        public final void mo32389a(C14064l lVar) {
                            if (iVar.mo36688a() == null && dVar.mo36688a() == null) {
                                C14496f.this.mo36676a(iVar.mo36694b(), dVar.f37523e, dVar.f37524f, dVar.f37525g, dVar.f37526h, iVar.mo36695c());
                                return;
                            }
                            C13949t.m41131a(LoggingBehavior.REQUESTS, C14496f.f37464a, "Unable to refresh like state for id: '%s'", C14496f.this.f37474e);
                        }
                    });
                    lVar.mo33715b();
                }
            });
        }
    }

    /* renamed from: b */
    public final String mo36677b() {
        if (this.f37476g) {
            return this.f37479j;
        }
        return this.f37480k;
    }

    /* renamed from: b */
    private C14534l m41852b(Bundle bundle) {
        return new C14534l(null, bundle) {

            /* renamed from: a */
            final /* synthetic */ Bundle f37512a;

            /* renamed from: a */
            public final void mo36685a(C13861a aVar) {
                mo36687a(aVar, (FacebookException) new FacebookOperationCanceledException());
            }

            /* renamed from: a */
            public final void mo36687a(C13861a aVar, FacebookException facebookException) {
                Bundle bundle;
                C13949t.m41131a(LoggingBehavior.REQUESTS, C14496f.f37464a, "Like Dialog failed with error : %s", facebookException);
                if (this.f37512a == null) {
                    bundle = new Bundle();
                } else {
                    bundle = this.f37512a;
                }
                bundle.putString("call_id", aVar.f36731a.toString());
                C14496f.this.mo36673a("present_dialog", bundle);
                C14496f.m41845a(C14496f.this, "com.facebook.sdk.LikeActionController.DID_ERROR", C13953v.m41161a(facebookException));
            }

            /* renamed from: a */
            public final void mo36686a(C13861a aVar, Bundle bundle) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                Bundle bundle2;
                if (bundle != null && bundle.containsKey("object_is_liked")) {
                    boolean z = bundle.getBoolean("object_is_liked");
                    String str6 = C14496f.this.f37477h;
                    String str7 = C14496f.this.f37478i;
                    if (bundle.containsKey("like_count_string")) {
                        str2 = bundle.getString("like_count_string");
                        str = str2;
                    } else {
                        str2 = str6;
                        str = str7;
                    }
                    String str8 = C14496f.this.f37479j;
                    String str9 = C14496f.this.f37480k;
                    if (bundle.containsKey("social_sentence")) {
                        str4 = bundle.getString("social_sentence");
                        str3 = str4;
                    } else {
                        str4 = str8;
                        str3 = str9;
                    }
                    if (bundle.containsKey("object_is_liked")) {
                        str5 = bundle.getString("unlike_token");
                    } else {
                        str5 = C14496f.this.f37481l;
                    }
                    String str10 = str5;
                    if (this.f37512a == null) {
                        bundle2 = new Bundle();
                    } else {
                        bundle2 = this.f37512a;
                    }
                    bundle2.putString("call_id", aVar.f36731a.toString());
                    C14496f.this.mo36679c().mo32371b("fb_like_control_dialog_did_succeed", bundle2);
                    C14496f.this.mo36676a(z, str2, str, str4, str3, str10);
                }
            }

            {
                this.f37512a = r3;
            }
        };
    }

    /* renamed from: c */
    private void m41858c(final Bundle bundle) {
        this.f37485p = true;
        m41841a((C14524m) new C14524m() {
            /* renamed from: a */
            public final void mo36682a() {
                if (C13967z.m41249a(C14496f.this.f37482m)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
                    C14496f.m41845a(C14496f.this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
                    return;
                }
                C14064l lVar = new C14064l();
                final C14522k kVar = new C14522k(C14496f.this.f37482m, C14496f.this.f37475f);
                kVar.mo36692a(lVar);
                lVar.mo33711a((C14065a) new C14065a() {
                    /* renamed from: a */
                    public final void mo32389a(C14064l lVar) {
                        C14496f.this.f37485p = false;
                        if (kVar.mo36688a() != null) {
                            C14496f.this.mo36675a(false);
                            return;
                        }
                        C14496f.this.f37481l = C13967z.m41222a(kVar.f37544e, (String) null);
                        C14496f.this.f37484o = true;
                        C14496f.this.mo36679c().mo32367a("fb_like_control_did_like", (Double) null, bundle);
                        C14496f.this.mo36672a(bundle);
                    }
                });
                lVar.mo33715b();
            }
        });
    }

    /* renamed from: a */
    private static C14496f m41839a(String str) {
        String d = m41859d(str);
        C14496f fVar = (C14496f) f37466c.get(d);
        if (fVar != null) {
            f37468q.mo33542a((Runnable) new C14521j(d, false));
        }
        return fVar;
    }

    /* renamed from: b */
    private void m41856b(boolean z) {
        mo36676a(z, this.f37477h, this.f37478i, this.f37479j, this.f37480k, this.f37481l);
    }

    /* renamed from: d */
    private void m41860d(final Bundle bundle) {
        this.f37485p = true;
        C14064l lVar = new C14064l();
        final C14523l lVar2 = new C14523l(this.f37481l);
        lVar2.mo36692a(lVar);
        lVar.mo33711a((C14065a) new C14065a() {
            /* renamed from: a */
            public final void mo32389a(C14064l lVar) {
                C14496f.this.f37485p = false;
                if (lVar2.mo36688a() != null) {
                    C14496f.this.mo36675a(true);
                    return;
                }
                C14496f.this.f37481l = null;
                C14496f.this.f37484o = false;
                C14496f.this.mo36679c().mo32367a("fb_like_control_did_unlike", (Double) null, bundle);
                C14496f.this.mo36672a(bundle);
            }
        });
        lVar.mo33715b();
    }

    /* renamed from: e */
    private static void m41862e(String str) {
        f37471t = str;
        C7285c.m22838a(C13499h.m39721g(), "com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", f37471t).apply();
    }

    /* renamed from: a */
    private void m41841a(final C14524m mVar) {
        if (!C13967z.m41249a(this.f37482m)) {
            mVar.mo36682a();
            return;
        }
        final C14516e eVar = new C14516e(this.f37474e, this.f37475f);
        final C14518g gVar = new C14518g(this.f37474e, this.f37475f);
        C14064l lVar = new C14064l();
        eVar.mo36692a(lVar);
        gVar.mo36692a(lVar);
        lVar.mo33711a((C14065a) new C14065a() {
            /* renamed from: a */
            public final void mo32389a(C14064l lVar) {
                FacebookRequestError facebookRequestError;
                C14496f.this.f37482m = eVar.f37528e;
                if (C13967z.m41249a(C14496f.this.f37482m)) {
                    C14496f.this.f37482m = gVar.f37535e;
                    C14496f.this.f37483n = gVar.f37536f;
                }
                if (C13967z.m41249a(C14496f.this.f37482m)) {
                    C13949t.m41131a(LoggingBehavior.DEVELOPER_ERRORS, C14496f.f37464a, "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", C14496f.this.f37474e);
                    C14496f fVar = C14496f.this;
                    String str = "get_verified_id";
                    if (gVar.mo36688a() != null) {
                        facebookRequestError = gVar.mo36688a();
                    } else {
                        facebookRequestError = eVar.mo36688a();
                    }
                    fVar.mo36674a(str, facebookRequestError);
                }
                if (mVar != null) {
                    mVar.mo36682a();
                }
            }
        });
        lVar.mo33715b();
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.facebook.share.internal.f] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.facebook.share.internal.f] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r4 != 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        com.facebook.internal.C13967z.m41239a((java.io.Closeable) r4);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r4 != 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return r0;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY]]
      uses: [com.facebook.share.internal.f, ?[int, boolean, OBJECT, ARRAY, byte, short, char], java.io.Closeable]
      mth insns count: 26
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facebook.share.internal.C14496f m41851b(java.lang.String r4) {
        /*
            r0 = 0
            java.lang.String r4 = m41859d(r4)     // Catch:{ IOException -> 0x002f, all -> 0x0028 }
            com.facebook.internal.p r1 = f37465b     // Catch:{ IOException -> 0x002f, all -> 0x0028 }
            java.io.InputStream r4 = r1.mo33579a(r4)     // Catch:{ IOException -> 0x002f, all -> 0x0028 }
            if (r4 == 0) goto L_0x0022
            java.lang.String r1 = com.facebook.internal.C13967z.m41221a(r4)     // Catch:{ IOException -> 0x0030, all -> 0x001d }
            boolean r2 = com.facebook.internal.C13967z.m41249a(r1)     // Catch:{ IOException -> 0x0030, all -> 0x001d }
            if (r2 != 0) goto L_0x0022
            com.facebook.share.internal.f r1 = m41857c(r1)     // Catch:{ IOException -> 0x0030, all -> 0x001d }
            r0 = r1
            goto L_0x0022
        L_0x001d:
            r0 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x0029
        L_0x0022:
            if (r4 == 0) goto L_0x0033
        L_0x0024:
            com.facebook.internal.C13967z.m41239a(r4)
            goto L_0x0033
        L_0x0028:
            r4 = move-exception
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            com.facebook.internal.C13967z.m41239a(r0)
        L_0x002e:
            throw r4
        L_0x002f:
            r4 = r0
        L_0x0030:
            if (r4 == 0) goto L_0x0033
            goto L_0x0024
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C14496f.m41851b(java.lang.String):com.facebook.share.internal.f");
    }

    /* renamed from: d */
    private static String m41859d(String str) {
        String str2;
        AccessToken a = AccessToken.m38225a();
        if (AccessToken.m38232b()) {
            str2 = a.f34627e;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            str2 = C13967z.m41252b(str2);
        }
        return C1642a.m8035a(Locale.ROOT, "%s|%s|com.fb.sdk.like|%d", new Object[]{str, C13967z.m41222a(str2, ""), Integer.valueOf(f37467d)});
    }

    /* renamed from: a */
    private static void m41842a(C14496f fVar) {
        String b = m41853b(fVar);
        String d = m41859d(fVar.f37474e);
        if (!C13967z.m41249a(b) && !C13967z.m41249a(d)) {
            f37469r.mo33542a((Runnable) new C14526o(d, b));
        }
    }

    /* renamed from: b */
    private static String m41853b(C14496f fVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.facebook.share.internal.LikeActionController.version", 3);
            jSONObject.put("object_id", fVar.f37474e);
            jSONObject.put("object_type", fVar.f37475f.getValue());
            jSONObject.put("like_count_string_with_like", fVar.f37477h);
            jSONObject.put("like_count_string_without_like", fVar.f37478i);
            jSONObject.put("social_sentence_with_like", fVar.f37479j);
            jSONObject.put("social_sentence_without_like", fVar.f37480k);
            jSONObject.put("is_object_liked", fVar.f37476g);
            jSONObject.put("unlike_token", fVar.f37481l);
            if (fVar.f37486w != null) {
                jSONObject.put("facebook_dialog_analytics_bundle", C13896c.m41030a(fVar.f37486w));
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static C14496f m41857c(String str) {
        C14496f fVar = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("com.facebook.share.internal.LikeActionController.version", -1) != 3) {
                return null;
            }
            C14496f fVar2 = new C14496f(jSONObject.getString("object_id"), ObjectType.fromInt(jSONObject.optInt("object_type", ObjectType.UNKNOWN.getValue())));
            fVar2.f37477h = jSONObject.optString("like_count_string_with_like", null);
            fVar2.f37478i = jSONObject.optString("like_count_string_without_like", null);
            fVar2.f37479j = jSONObject.optString("social_sentence_with_like", null);
            fVar2.f37480k = jSONObject.optString("social_sentence_without_like", null);
            fVar2.f37476g = jSONObject.optBoolean("is_object_liked");
            fVar2.f37481l = jSONObject.optString("unlike_token", null);
            JSONObject optJSONObject = jSONObject.optJSONObject("facebook_dialog_analytics_bundle");
            if (optJSONObject != null) {
                fVar2.f37486w = C13896c.m41029a(optJSONObject);
            }
            fVar = fVar2;
            return fVar;
        } catch (JSONException unused) {
        }
    }

    private C14496f(String str, ObjectType objectType) {
        this.f37474e = str;
        this.f37475f = objectType;
    }

    /* renamed from: a */
    public static void m41844a(C14496f fVar, String str) {
        m41845a(fVar, str, (Bundle) null);
    }

    /* renamed from: a */
    private static void m41846a(String str, C14496f fVar) {
        String d = m41859d(str);
        f37468q.mo33542a((Runnable) new C14521j(d, true));
        f37466c.put(d, fVar);
    }

    /* renamed from: a */
    private static void m41840a(final C14514c cVar, final C14496f fVar, final FacebookException facebookException) {
        if (cVar != null) {
            f37470s.post(new Runnable() {
                public final void run() {
                    cVar.mo36681a(fVar, facebookException);
                }
            });
        }
    }

    /* renamed from: b */
    private void m41854b(Activity activity, C13945q qVar, Bundle bundle) {
        mo36673a("present_dialog", bundle);
        m41844a((C14496f) null, "com.facebook.sdk.LikeActionController.UPDATED");
    }

    /* renamed from: a */
    private static void m41843a(C14496f fVar, ObjectType objectType, C14514c cVar) {
        FacebookException facebookException;
        ObjectType a = C14540n.m42025a(objectType, fVar.f37475f);
        if (a == null) {
            facebookException = new FacebookException("Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\"", fVar.f37474e, fVar.f37475f.toString(), objectType.toString());
            fVar = null;
        } else {
            fVar.f37475f = a;
            facebookException = null;
        }
        m41840a(cVar, fVar, facebookException);
    }

    /* renamed from: b */
    public static void m41855b(String str, ObjectType objectType, C14514c cVar) {
        C14496f a = m41839a(str);
        if (a != null) {
            m41843a(a, objectType, cVar);
            return;
        }
        C14496f b = m41851b(str);
        if (b == null) {
            b = new C14496f(str, objectType);
            m41842a(b);
        }
        m41846a(str, b);
        f37470s.post(new Runnable(b) {

            /* renamed from: a */
            final /* synthetic */ C14496f f37508a;

            public final void run() {
                this.f37508a.mo36680d();
            }

            {
                this.f37508a = r1;
            }
        });
        m41840a(cVar, b, (FacebookException) null);
    }

    /* renamed from: a */
    public static void m41845a(C14496f fVar, String str, Bundle bundle) {
        Intent intent = new Intent(str);
        if (fVar != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", fVar.f37474e);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C0688e.m2941a(C13499h.m39721g()).mo2839a(intent);
    }

    /* renamed from: b */
    public final void mo36678b(int i, int i2, Intent intent) {
        C14540n.m42039a(i, i2, intent, m41852b(this.f37486w));
        m41864g();
    }

    /* renamed from: a */
    public static void m41847a(String str, ObjectType objectType, C14514c cVar) {
        if (!f37472u) {
            m41861e();
        }
        C14496f a = m41839a(str);
        if (a != null) {
            m41843a(a, objectType, cVar);
        } else {
            f37469r.mo33542a((Runnable) new C14513b(str, objectType, cVar));
        }
    }
}
