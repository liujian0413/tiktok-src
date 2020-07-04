package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.internal.C13876aa;
import com.facebook.internal.C13967z;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class LoginClient implements Parcelable {
    public static final Creator<LoginClient> CREATOR = new Creator<LoginClient>() {
        /* renamed from: a */
        private static LoginClient[] m41558a(int i) {
            return new LoginClient[i];
        }

        /* renamed from: a */
        private static LoginClient m41557a(Parcel parcel) {
            return new LoginClient(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m41557a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m41558a(i);
        }
    };

    /* renamed from: a */
    LoginMethodHandler[] f37190a;

    /* renamed from: b */
    int f37191b = -1;

    /* renamed from: c */
    public Fragment f37192c;

    /* renamed from: d */
    public C14087b f37193d;

    /* renamed from: e */
    public C14086a f37194e;

    /* renamed from: f */
    boolean f37195f;

    /* renamed from: g */
    public Request f37196g;

    /* renamed from: h */
    Map<String, String> f37197h;

    /* renamed from: i */
    Map<String, String> f37198i;

    /* renamed from: j */
    private C14101c f37199j;

    public static class Request implements Parcelable {
        public static final Creator<Request> CREATOR = new Creator<Request>() {
            /* renamed from: a */
            private static Request[] m41562a(int i) {
                return new Request[i];
            }

            /* renamed from: a */
            private static Request m41561a(Parcel parcel) {
                return new Request(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m41561a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m41562a(i);
            }
        };

        /* renamed from: a */
        public final LoginBehavior f37200a;

        /* renamed from: b */
        public Set<String> f37201b;

        /* renamed from: c */
        public final DefaultAudience f37202c;

        /* renamed from: d */
        public final String f37203d;

        /* renamed from: e */
        public final String f37204e;

        /* renamed from: f */
        public boolean f37205f;

        /* renamed from: g */
        public String f37206g;

        /* renamed from: h */
        public String f37207h;

        /* renamed from: i */
        public String f37208i;

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo33786a() {
            for (String b : this.f37201b) {
                if (LoginManager.m41591b(b)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo33785a(Set<String> set) {
            C13876aa.m40978a((Object) set, "permissions");
            this.f37201b = set;
        }

        private Request(Parcel parcel) {
            LoginBehavior loginBehavior;
            boolean z;
            String readString = parcel.readString();
            DefaultAudience defaultAudience = null;
            if (readString != null) {
                loginBehavior = LoginBehavior.valueOf(readString);
            } else {
                loginBehavior = null;
            }
            this.f37200a = loginBehavior;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f37201b = new HashSet(arrayList);
            String readString2 = parcel.readString();
            if (readString2 != null) {
                defaultAudience = DefaultAudience.valueOf(readString2);
            }
            this.f37202c = defaultAudience;
            this.f37203d = parcel.readString();
            this.f37204e = parcel.readString();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f37205f = z;
            this.f37206g = parcel.readString();
            this.f37207h = parcel.readString();
            this.f37208i = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            String str;
            String str2 = null;
            if (this.f37200a != null) {
                str = this.f37200a.name();
            } else {
                str = null;
            }
            parcel.writeString(str);
            parcel.writeStringList(new ArrayList(this.f37201b));
            if (this.f37202c != null) {
                str2 = this.f37202c.name();
            }
            parcel.writeString(str2);
            parcel.writeString(this.f37203d);
            parcel.writeString(this.f37204e);
            parcel.writeByte(this.f37205f ? (byte) 1 : 0);
            parcel.writeString(this.f37206g);
            parcel.writeString(this.f37207h);
            parcel.writeString(this.f37208i);
        }

        Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3) {
            this.f37200a = loginBehavior;
            if (set == null) {
                set = new HashSet<>();
            }
            this.f37201b = set;
            this.f37202c = defaultAudience;
            this.f37207h = str;
            this.f37203d = str2;
            this.f37204e = str3;
        }
    }

    public static class Result implements Parcelable {
        public static final Creator<Result> CREATOR = new Creator<Result>() {
            /* renamed from: a */
            private static Result[] m41568a(int i) {
                return new Result[i];
            }

            /* renamed from: a */
            private static Result m41567a(Parcel parcel) {
                return new Result(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m41567a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m41568a(i);
            }
        };

        /* renamed from: a */
        final C14085a f37209a;

        /* renamed from: b */
        final AccessToken f37210b;

        /* renamed from: c */
        final String f37211c;

        /* renamed from: d */
        final String f37212d;

        /* renamed from: e */
        final Request f37213e;

        /* renamed from: f */
        public Map<String, String> f37214f;

        /* renamed from: g */
        public Map<String, String> f37215g;

        /* renamed from: com.facebook.login.LoginClient$Result$a */
        enum C14085a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            

            /* renamed from: d */
            public final String f37220d;

            private C14085a(String str) {
                this.f37220d = str;
            }
        }

        public int describeContents() {
            return 0;
        }

        private Result(Parcel parcel) {
            this.f37209a = C14085a.valueOf(parcel.readString());
            this.f37210b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f37211c = parcel.readString();
            this.f37212d = parcel.readString();
            this.f37213e = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f37214f = C13967z.m41233a(parcel);
            this.f37215g = C13967z.m41233a(parcel);
        }

        /* renamed from: a */
        static Result m41563a(Request request, AccessToken accessToken) {
            Result result = new Result(request, C14085a.SUCCESS, accessToken, null, null);
            return result;
        }

        /* renamed from: a */
        static Result m41564a(Request request, String str) {
            Result result = new Result(request, C14085a.CANCEL, null, str, null);
            return result;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f37209a.name());
            parcel.writeParcelable(this.f37210b, i);
            parcel.writeString(this.f37211c);
            parcel.writeString(this.f37212d);
            parcel.writeParcelable(this.f37213e, i);
            C13967z.m41238a(parcel, this.f37214f);
            C13967z.m41238a(parcel, this.f37215g);
        }

        /* renamed from: a */
        static Result m41565a(Request request, String str, String str2) {
            return m41566a(request, str, str2, null);
        }

        /* renamed from: a */
        static Result m41566a(Request request, String str, String str2, String str3) {
            Request request2 = request;
            Result result = new Result(request2, C14085a.ERROR, null, TextUtils.join(": ", C13967z.m41254b((T[]) new String[]{str, str2})), str3);
            return result;
        }

        private Result(Request request, C14085a aVar, AccessToken accessToken, String str, String str2) {
            C13876aa.m40978a((Object) aVar, "code");
            this.f37213e = request;
            this.f37210b = accessToken;
            this.f37211c = str;
            this.f37209a = aVar;
            this.f37212d = str2;
        }
    }

    /* renamed from: com.facebook.login.LoginClient$a */
    interface C14086a {
        /* renamed from: a */
        void mo33795a();

        /* renamed from: b */
        void mo33796b();
    }

    /* renamed from: com.facebook.login.LoginClient$b */
    public interface C14087b {
        /* renamed from: a */
        void mo33797a(Result result);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public static int m41535b() {
        return RequestCodeOffset.Login.toRequestCode();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final FragmentActivity mo33770a() {
        return this.f37192c.getActivity();
    }

    /* renamed from: i */
    private boolean m41541i() {
        if (this.f37196g == null || this.f37191b < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private void m41543k() {
        mo33775b(Result.m41565a(this.f37196g, "Login attempt failed.", null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo33776c() {
        if (this.f37191b >= 0) {
            mo33777d().mo33762b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo33780f() {
        if (this.f37194e != null) {
            this.f37194e.mo33795a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo33781g() {
        if (this.f37194e != null) {
            this.f37194e.mo33796b();
        }
    }

    /* renamed from: h */
    static String m41540h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final LoginMethodHandler mo33777d() {
        if (this.f37191b >= 0) {
            return this.f37190a[this.f37191b];
        }
        return null;
    }

    /* renamed from: j */
    private boolean m41542j() {
        if (this.f37195f) {
            return true;
        }
        if (m41531a("android.permission.INTERNET") != 0) {
            FragmentActivity a = mo33770a();
            mo33775b(Result.m41565a(this.f37196g, a.getString(R.string.a6d), a.getString(R.string.a6c)));
            return false;
        }
        this.f37195f = true;
        return true;
    }

    /* renamed from: m */
    private C14101c m41545m() {
        if (this.f37199j == null || !this.f37199j.f37249a.equals(this.f37196g.f37203d)) {
            this.f37199j = new C14101c(mo33770a(), this.f37196g.f37203d);
        }
        return this.f37199j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo33779e() {
        if (this.f37191b >= 0) {
            m41533a(mo33777d().mo33721a(), "skipped", null, null, mo33777d().f37239a);
        }
        while (this.f37190a != null && this.f37191b < this.f37190a.length - 1) {
            this.f37191b++;
            if (m41544l()) {
                return;
            }
        }
        if (this.f37196g != null) {
            m41543k();
        }
    }

    /* renamed from: l */
    private boolean m41544l() {
        LoginMethodHandler d = mo33777d();
        if (!d.mo33815d() || m41542j()) {
            boolean a = d.mo33724a(this.f37196g);
            if (a) {
                m41545m().mo33828a(this.f37196g.f37204e, d.mo33721a());
            } else {
                m41545m().mo33832b(this.f37196g.f37204e, d.mo33721a());
                m41534a("not_tried", d.mo33721a(), true);
            }
            return a;
        }
        m41534a("no_internet_permission", "1", false);
        return false;
    }

    public LoginClient(Fragment fragment) {
        this.f37192c = fragment;
    }

    /* renamed from: a */
    private int m41531a(String str) {
        return mo33770a().checkCallingOrSelfPermission(str);
    }

    /* renamed from: d */
    private void m41539d(Result result) {
        if (this.f37193d != null) {
            this.f37193d.mo33797a(result);
        }
    }

    /* renamed from: b */
    private void m41536b(Request request) {
        if (request != null) {
            if (this.f37196g != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            } else if (!AccessToken.m38232b() || m41542j()) {
                this.f37196g = request;
                this.f37190a = m41538c(request);
                mo33779e();
            }
        }
    }

    public LoginClient(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.f37190a = new LoginMethodHandler[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            this.f37190a[i] = (LoginMethodHandler) readParcelableArray[i];
            this.f37190a[i].mo33812a(this);
        }
        this.f37191b = parcel.readInt();
        this.f37196g = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.f37197h = C13967z.m41233a(parcel);
        this.f37198i = C13967z.m41233a(parcel);
    }

    /* renamed from: c */
    private void m41537c(Result result) {
        Result result2;
        if (result.f37210b != null) {
            AccessToken a = AccessToken.m38225a();
            AccessToken accessToken = result.f37210b;
            if (!(a == null || accessToken == null)) {
                try {
                    if (a.f34631i.equals(accessToken.f34631i)) {
                        result2 = Result.m41563a(this.f37196g, result.f37210b);
                        mo33775b(result2);
                        return;
                    }
                } catch (Exception e) {
                    mo33775b(Result.m41565a(this.f37196g, "Caught exception", e.getMessage()));
                    return;
                }
            }
            result2 = Result.m41565a(this.f37196g, "User logged in as different Facebook user.", null);
            mo33775b(result2);
            return;
        }
        throw new FacebookException("Can't validate without a token");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo33775b(Result result) {
        LoginMethodHandler d = mo33777d();
        if (d != null) {
            m41532a(d.mo33721a(), result, d.f37239a);
        }
        if (this.f37197h != null) {
            result.f37214f = this.f37197h;
        }
        if (this.f37198i != null) {
            result.f37215g = this.f37198i;
        }
        this.f37190a = null;
        this.f37191b = -1;
        this.f37196g = null;
        this.f37197h = null;
        m41539d(result);
    }

    /* renamed from: c */
    private LoginMethodHandler[] m41538c(Request request) {
        ArrayList arrayList = new ArrayList();
        LoginBehavior loginBehavior = request.f37200a;
        if (loginBehavior.allowsGetTokenAuth) {
            arrayList.add(new GetTokenLoginMethodHandler(this));
        }
        if (loginBehavior.allowsKatanaAuth) {
            arrayList.add(new KatanaProxyLoginMethodHandler(this));
        }
        if (loginBehavior.allowsFacebookLiteAuth) {
            arrayList.add(new FacebookLiteLoginMethodHandler(this));
        }
        if (loginBehavior.allowsCustomTabAuth) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (loginBehavior.allowsWebViewAuth) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (loginBehavior.allowsDeviceAuth) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
        arrayList.toArray(loginMethodHandlerArr);
        return loginMethodHandlerArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33771a(Fragment fragment) {
        if (this.f37192c == null) {
            this.f37192c = fragment;
            return;
        }
        throw new FacebookException("Can't set fragment once it is already set.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33772a(Request request) {
        if (!m41541i()) {
            m41536b(request);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33773a(Result result) {
        if (result.f37210b == null || !AccessToken.m38232b()) {
            mo33775b(result);
        } else {
            m41537c(result);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.f37190a, i);
        parcel.writeInt(this.f37191b);
        parcel.writeParcelable(this.f37196g, i);
        C13967z.m41238a(parcel, this.f37197h);
        C13967z.m41238a(parcel, this.f37198i);
    }

    /* renamed from: a */
    private void m41532a(String str, Result result, Map<String, String> map) {
        m41533a(str, result.f37209a.f37220d, result.f37211c, result.f37212d, map);
    }

    /* renamed from: a */
    private void m41534a(String str, String str2, boolean z) {
        if (this.f37197h == null) {
            this.f37197h = new HashMap();
        }
        if (this.f37197h.containsKey(str) && z) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.f37197h.get(str));
            sb.append(",");
            sb.append(str2);
            str2 = sb.toString();
        }
        this.f37197h.put(str, str2);
    }

    /* renamed from: a */
    public final boolean mo33774a(int i, int i2, Intent intent) {
        if (this.f37196g != null) {
            return mo33777d().mo33723a(i, i2, intent);
        }
        return false;
    }

    /* renamed from: a */
    private void m41533a(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.f37196g == null) {
            m41545m().mo33829a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            m41545m().mo33830a(this.f37196g.f37204e, str, str2, str3, str4, map);
        }
    }
}
