package net.openid.appauth;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.customtabs.C0219c;
import android.support.customtabs.C0219c.C0220a;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Map;
import net.openid.appauth.AuthorizationException.C48239b;
import net.openid.appauth.AuthorizationException.C48240c;
import net.openid.appauth.C48285q.C48286a;
import net.openid.appauth.p1887a.C48243b;
import net.openid.appauth.p1887a.C48245d;
import net.openid.appauth.p1887a.C48246e;
import net.openid.appauth.p1888b.C48251a;
import net.openid.appauth.p1889c.C48254a;
import net.openid.appauth.p1889c.C48257b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.g */
public final class C48265g {

    /* renamed from: a */
    Context f123291a;

    /* renamed from: b */
    public final C48246e f123292b;

    /* renamed from: c */
    public final C48243b f123293c;

    /* renamed from: d */
    private final C48248b f123294d;

    /* renamed from: e */
    private boolean f123295e;

    /* renamed from: net.openid.appauth.g$a */
    static class C48266a extends AsyncTask<Void, Void, JSONObject> {

        /* renamed from: a */
        private C48282p f123296a;

        /* renamed from: b */
        private ClientAuthentication f123297b;

        /* renamed from: c */
        private final C48251a f123298c;

        /* renamed from: d */
        private C48267b f123299d;

        /* renamed from: e */
        private AuthorizationException f123300e;

        /* renamed from: a */
        private static void m149753a(URLConnection uRLConnection) {
            if (TextUtils.isEmpty(uRLConnection.getRequestProperty("Accept"))) {
                uRLConnection.setRequestProperty("Accept", "application/json");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onPostExecute(JSONObject jSONObject) {
            AuthorizationException authorizationException;
            if (this.f123300e != null) {
                this.f123299d.mo83605a(null, this.f123300e);
            } else if (jSONObject.has("error")) {
                try {
                    String string = jSONObject.getString("error");
                    authorizationException = AuthorizationException.fromOAuthTemplate(C48240c.m149643a(string), string, jSONObject.optString("error_description", null), C48257b.m149695a(jSONObject.optString("error_uri")));
                } catch (JSONException e) {
                    authorizationException = AuthorizationException.fromTemplate(C48239b.f123165f, e);
                }
                this.f123299d.mo83605a(null, authorizationException);
            } else {
                try {
                    C48285q a = new C48286a(this.f123296a).mo120666a(jSONObject).mo120667a();
                    C48254a.m149686a("Token exchange with %s completed", this.f123296a.f123313b.f123302b);
                    this.f123299d.mo83605a(a, null);
                } catch (JSONException e2) {
                    this.f123299d.mo83605a(null, AuthorizationException.fromTemplate(C48239b.f123165f, e2));
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public JSONObject doInBackground(Void... voidArr) {
            InputStream inputStream;
            InputStream inputStream2;
            InputStream inputStream3;
            InputStream inputStream4 = null;
            try {
                HttpURLConnection a = this.f123298c.mo120621a(this.f123296a.f123313b.f123302b);
                a.setRequestMethod("POST");
                C48268h.m149757a(a, "Content-Type", "application/x-www-form-urlencoded");
                m149753a((URLConnection) a);
                a.setDoOutput(true);
                Map a2 = this.f123296a.mo120657a();
                Map a3 = this.f123297b.mo120611a(this.f123296a.f123314c);
                if (a3 != null) {
                    a2.putAll(a3);
                }
                String a4 = C48257b.m149697a(a2);
                C48268h.m149757a(a, "Content-Length", String.valueOf(a4.length()));
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(a.getOutputStream());
                outputStreamWriter.write(a4);
                outputStreamWriter.flush();
                if (a.getResponseCode() < 200 || a.getResponseCode() >= 300) {
                    inputStream3 = a.getErrorStream();
                } else {
                    inputStream3 = C48268h.m149756a(a);
                }
                try {
                    JSONObject jSONObject = new JSONObject(C48287r.m149824a(inputStream3));
                    C48287r.m149825b(inputStream3);
                    return jSONObject;
                } catch (IOException e) {
                    Throwable th = e;
                    inputStream2 = inputStream3;
                    e = th;
                    C48254a.m149687a(e, "Failed to complete exchange request", new Object[0]);
                    this.f123300e = AuthorizationException.fromTemplate(C48239b.f123163d, e);
                    C48287r.m149825b(inputStream);
                    return null;
                } catch (JSONException e2) {
                    Throwable th2 = e2;
                    inputStream = inputStream3;
                    e = th2;
                    C48254a.m149687a(e, "Failed to complete exchange request", new Object[0]);
                    this.f123300e = AuthorizationException.fromTemplate(C48239b.f123165f, e);
                    C48287r.m149825b(inputStream);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream4 = inputStream3;
                    C48287r.m149825b(inputStream4);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                inputStream2 = null;
                C48254a.m149687a(e, "Failed to complete exchange request", new Object[0]);
                this.f123300e = AuthorizationException.fromTemplate(C48239b.f123163d, e);
                C48287r.m149825b(inputStream);
                return null;
            } catch (JSONException e4) {
                e = e4;
                inputStream = null;
                C48254a.m149687a(e, "Failed to complete exchange request", new Object[0]);
                this.f123300e = AuthorizationException.fromTemplate(C48239b.f123165f, e);
                C48287r.m149825b(inputStream);
                return null;
            } catch (Throwable th4) {
                th = th4;
                inputStream4 = inputStream;
                C48287r.m149825b(inputStream4);
                throw th;
            }
        }

        C48266a(C48282p pVar, ClientAuthentication clientAuthentication, C48251a aVar, C48267b bVar) {
            this.f123296a = pVar;
            this.f123297b = clientAuthentication;
            this.f123298c = aVar;
            this.f123299d = bVar;
        }
    }

    /* renamed from: net.openid.appauth.g$b */
    public interface C48267b {
        /* renamed from: a */
        void mo83605a(C48285q qVar, AuthorizationException authorizationException);
    }

    /* renamed from: a */
    private void m149747a() {
        if (this.f123295e) {
            throw new IllegalStateException("Service has been disposed and rendered inoperable");
        }
    }

    public C48265g(Context context) {
        this(context, C48248b.f123231a);
    }

    /* renamed from: a */
    private C0220a m149746a(Uri... uriArr) {
        m149747a();
        return this.f123292b.mo120617a(uriArr);
    }

    /* renamed from: a */
    public final Intent mo120649a(C48259e eVar) {
        return m149745a(eVar, m149746a(new Uri[0]).mo648a());
    }

    /* renamed from: a */
    public final void mo120651a(C48282p pVar, C48267b bVar) {
        mo120650a(pVar, C48279m.f123310a, bVar);
    }

    private C48265g(Context context, C48248b bVar) {
        this(context, bVar, C48245d.m149670a(context, bVar.f123232b), new C48246e(context));
    }

    /* renamed from: a */
    private Intent m149745a(C48259e eVar, C0219c cVar) {
        return AuthorizationManagementActivity.m149646a(this.f123291a, eVar, m149748b(eVar, cVar));
    }

    /* renamed from: b */
    private Intent m149748b(C48259e eVar, C0219c cVar) {
        Intent intent;
        m149747a();
        if (this.f123293c != null) {
            Uri a = eVar.mo120624a();
            if (this.f123293c.f123224d.booleanValue()) {
                intent = cVar.f855a;
            } else {
                intent = new Intent("android.intent.action.VIEW");
            }
            intent.setPackage(this.f123293c.f123221a);
            intent.setData(a);
            C48254a.m149686a("Using %s as browser for auth, custom tab = %s", intent.getPackage(), this.f123293c.f123224d.toString());
            C48254a.m149686a("Initiating authorization request to %s", eVar.f123244b.f123301a);
            return intent;
        }
        throw new ActivityNotFoundException();
    }

    /* renamed from: a */
    public final void mo120650a(C48282p pVar, ClientAuthentication clientAuthentication, C48267b bVar) {
        m149747a();
        C48254a.m149686a("Initiating code exchange request to %s", pVar.f123313b.f123302b);
        new C48266a(pVar, clientAuthentication, this.f123294d.f123233c, bVar).execute(new Void[0]);
    }

    private C48265g(Context context, C48248b bVar, C48243b bVar2, C48246e eVar) {
        this.f123291a = (Context) C48280n.m149788a(context);
        this.f123294d = bVar;
        this.f123292b = eVar;
        this.f123293c = bVar2;
        if (bVar2 != null && bVar2.f123224d.booleanValue()) {
            this.f123292b.mo120618a(bVar2.f123221a);
        }
    }
}
