package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.C13447e;
import com.facebook.C13498g;
import com.facebook.C13499h;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.internal.C13876aa;
import com.facebook.internal.C13945q;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.C13855a;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class LoginManager {

    /* renamed from: d */
    private static final Set<String> f37227d = m41592c();

    /* renamed from: e */
    private static volatile LoginManager f37228e;

    /* renamed from: a */
    public LoginBehavior f37229a = LoginBehavior.NATIVE_WITH_FALLBACK;

    /* renamed from: b */
    public DefaultAudience f37230b = DefaultAudience.FRIENDS;

    /* renamed from: c */
    public String f37231c = "rerequest";

    /* renamed from: f */
    private final SharedPreferences f37232f;

    /* renamed from: com.facebook.login.LoginManager$a */
    static class C14093a implements C14103e {

        /* renamed from: a */
        private final Activity f37236a;

        /* renamed from: a */
        public final Activity mo33809a() {
            return this.f37236a;
        }

        C14093a(Activity activity) {
            C13876aa.m40978a((Object) activity, "activity");
            this.f37236a = activity;
        }

        /* renamed from: a */
        public final void mo33810a(Intent intent, int i) {
            this.f37236a.startActivityForResult(intent, i);
        }
    }

    /* renamed from: com.facebook.login.LoginManager$b */
    static class C14094b implements C14103e {

        /* renamed from: a */
        private final C13945q f37237a;

        /* renamed from: a */
        public final Activity mo33809a() {
            return this.f37237a.mo33598a();
        }

        C14094b(C13945q qVar) {
            C13876aa.m40978a((Object) qVar, "fragment");
            this.f37237a = qVar;
        }

        /* renamed from: a */
        public final void mo33810a(Intent intent, int i) {
            this.f37237a.mo33599a(intent, i);
        }
    }

    /* renamed from: com.facebook.login.LoginManager$c */
    static class C14095c {

        /* renamed from: a */
        private static C14101c f37238a;

        /* renamed from: a */
        public static synchronized C14101c m41609a(Context context) {
            synchronized (C14095c.class) {
                if (context == null) {
                    context = C13499h.m39721g();
                }
                if (context == null) {
                    return null;
                }
                if (f37238a == null) {
                    f37238a = new C14101c(context, C13499h.m39725k());
                }
                C14101c cVar = f37238a;
                return cVar;
            }
        }
    }

    /* renamed from: a */
    public final void mo33805a(C13447e eVar, final C13498g<C14102d> gVar) {
        if (eVar instanceof CallbackManagerImpl) {
            ((CallbackManagerImpl) eVar).mo33481b(RequestCodeOffset.Login.toRequestCode(), new C13855a() {
                /* renamed from: a */
                public final boolean mo33483a(int i, Intent intent) {
                    return LoginManager.this.mo33807a(i, intent, gVar);
                }
            });
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33806a(int i, Intent intent) {
        return mo33807a(i, intent, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33807a(int i, Intent intent, C13498g<C14102d> gVar) {
        Map map;
        C14085a aVar;
        boolean z;
        AccessToken accessToken;
        Request request;
        Request request2;
        Map map2;
        AccessToken accessToken2;
        int i2 = i;
        Intent intent2 = intent;
        C14085a aVar2 = C14085a.ERROR;
        FacebookException facebookException = null;
        boolean z2 = false;
        if (intent2 != null) {
            Result result = (Result) intent2.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                Request request3 = result.f37213e;
                C14085a aVar3 = result.f37209a;
                if (i2 == -1) {
                    if (result.f37209a == C14085a.SUCCESS) {
                        accessToken2 = result.f37210b;
                    } else {
                        facebookException = new FacebookAuthorizationException(result.f37211c);
                        accessToken2 = null;
                    }
                } else if (i2 == 0) {
                    accessToken2 = null;
                    z2 = true;
                } else {
                    accessToken2 = null;
                }
                map2 = result.f37214f;
                C14085a aVar4 = aVar3;
                request2 = request3;
                aVar2 = aVar4;
            } else {
                accessToken2 = null;
                map2 = null;
                request2 = null;
            }
            map = map2;
            aVar = aVar2;
            z = z2;
            Request request4 = request2;
            accessToken = accessToken2;
            request = request4;
        } else if (i2 == 0) {
            aVar = C14085a.CANCEL;
            request = null;
            accessToken = null;
            map = null;
            z = true;
        } else {
            aVar = aVar2;
            request = null;
            accessToken = null;
            map = null;
            z = false;
        }
        if (facebookException == null && accessToken == null && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        m41583a(null, aVar, map, facebookException, true, request);
        m41584a(accessToken, request, facebookException, z, gVar);
        return true;
    }

    /* renamed from: a */
    public final LoginManager mo33801a(String str) {
        this.f37231c = str;
        return this;
    }

    /* renamed from: a */
    public final void mo33804a(Fragment fragment, Collection<String> collection) {
        m41586a(new C13945q(fragment), collection);
    }

    /* renamed from: a */
    public final void mo33803a(android.app.Fragment fragment, Collection<String> collection) {
        m41586a(new C13945q(fragment), collection);
    }

    /* renamed from: a */
    private void m41586a(C13945q qVar, Collection<String> collection) {
        m41587a((C14103e) new C14094b(qVar), m41579a(collection));
    }

    /* renamed from: a */
    public final void mo33802a(Activity activity, Collection<String> collection) {
        m41587a((C14103e) new C14093a(activity), m41579a(collection));
    }

    /* renamed from: a */
    private void m41587a(C14103e eVar, Request request) throws FacebookException {
        m41582a((Context) eVar.mo33809a(), request);
        CallbackManagerImpl.m40921a(RequestCodeOffset.Login.toRequestCode(), new C13855a() {
            /* renamed from: a */
            public final boolean mo33483a(int i, Intent intent) {
                return LoginManager.this.mo33806a(i, intent);
            }
        });
        if (!m41590b(eVar, request)) {
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            m41583a(eVar.mo33809a(), C14085a.ERROR, null, facebookException, false, request);
            throw facebookException;
        }
    }

    /* renamed from: a */
    private static boolean m41589a(Intent intent) {
        if (C13499h.m39721g().getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m41588a(boolean z) {
        Editor edit = this.f37232f.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }

    /* renamed from: c */
    private static Set<String> m41592c() {
        return Collections.unmodifiableSet(new HashSet<String>() {
            {
                add("ads_management");
                add("create_event");
                add("rsvp_event");
            }
        });
    }

    /* renamed from: b */
    public final void mo33808b() {
        AccessToken.m38229a((AccessToken) null);
        Profile.m38320a(null);
        m41588a(false);
    }

    LoginManager() {
        C13876aa.m40975a();
        this.f37232f = C7285c.m22838a(C13499h.m39721g(), "com.facebook.loginManager", 0);
    }

    /* renamed from: a */
    public static LoginManager m41580a() {
        if (f37228e == null) {
            synchronized (LoginManager.class) {
                if (f37228e == null) {
                    f37228e = new LoginManager();
                }
            }
        }
        return f37228e;
    }

    /* renamed from: a */
    public final LoginManager mo33799a(DefaultAudience defaultAudience) {
        this.f37230b = defaultAudience;
        return this;
    }

    /* renamed from: a */
    public final LoginManager mo33800a(LoginBehavior loginBehavior) {
        this.f37229a = loginBehavior;
        return this;
    }

    /* renamed from: a */
    private static Intent m41578a(Request request) {
        Intent intent = new Intent();
        intent.setClass(C13499h.m39721g(), FacebookActivity.class);
        intent.setAction(request.f37200a.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* renamed from: b */
    static boolean m41591b(String str) {
        if (str == null || (!str.startsWith("publish") && !str.startsWith("manage") && !f37227d.contains(str))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private Request m41579a(Collection<String> collection) {
        HashSet hashSet;
        LoginBehavior loginBehavior = this.f37229a;
        if (collection != null) {
            hashSet = new HashSet(collection);
        } else {
            hashSet = new HashSet();
        }
        Request request = new Request(loginBehavior, Collections.unmodifiableSet(hashSet), this.f37230b, this.f37231c, C13499h.m39725k(), UUID.randomUUID().toString());
        request.f37205f = AccessToken.m38232b();
        return request;
    }

    /* renamed from: a */
    public static void m41585a(C13447e eVar) {
        if (eVar instanceof CallbackManagerImpl) {
            ((CallbackManagerImpl) eVar).mo33480a(RequestCodeOffset.Login.toRequestCode());
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* renamed from: a */
    private static void m41582a(Context context, Request request) {
        C14101c a = C14095c.m41609a(context);
        if (a != null && request != null) {
            a.mo33827a(request);
        }
    }

    /* renamed from: b */
    private boolean m41590b(C14103e eVar, Request request) {
        Intent a = m41578a(request);
        if (!m41589a(a)) {
            return false;
        }
        try {
            eVar.mo33810a(a, LoginClient.m41535b());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static C14102d m41581a(Request request, AccessToken accessToken) {
        Set<String> set = request.f37201b;
        HashSet hashSet = new HashSet(accessToken.f34624b);
        if (request.f37205f) {
            hashSet.retainAll(set);
        }
        HashSet hashSet2 = new HashSet(set);
        hashSet2.removeAll(hashSet);
        return new C14102d(accessToken, hashSet, hashSet2);
    }

    /* renamed from: a */
    private void m41584a(AccessToken accessToken, Request request, FacebookException facebookException, boolean z, C13498g<C14102d> gVar) {
        C14102d dVar;
        if (accessToken != null) {
            AccessToken.m38229a(accessToken);
            Profile.m38321b();
        }
        if (gVar != null) {
            if (accessToken != null) {
                dVar = m41581a(request, accessToken);
            } else {
                dVar = null;
            }
            if (z || (dVar != null && dVar.f37253b.size() == 0)) {
                gVar.mo29948n_();
            } else if (facebookException != null) {
                gVar.mo29946a(facebookException);
            } else if (accessToken != null) {
                m41588a(true);
                gVar.mo29947a(dVar);
            }
        }
    }

    /* renamed from: a */
    private static void m41583a(Context context, C14085a aVar, Map<String, String> map, Exception exc, boolean z, Request request) {
        String str;
        C14101c a = C14095c.m41609a(context);
        if (a != null) {
            if (request == null) {
                a.mo33833c("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
                return;
            }
            HashMap hashMap = new HashMap();
            String str2 = "try_login_activity";
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put(str2, str);
            a.mo33831a(request.f37204e, hashMap, aVar, map, exc);
        }
    }
}
