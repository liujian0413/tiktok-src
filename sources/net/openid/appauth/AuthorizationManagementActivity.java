package net.openid.appauth;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import net.openid.appauth.AuthorizationException.C48238a;
import net.openid.appauth.AuthorizationException.C48239b;
import net.openid.appauth.C48262f.C48264a;
import net.openid.appauth.p1889c.C48254a;
import org.json.JSONException;

public class AuthorizationManagementActivity extends Activity {

    /* renamed from: a */
    public Intent f123177a;

    /* renamed from: b */
    private boolean f123178b;

    /* renamed from: c */
    private C48259e f123179c;

    /* renamed from: d */
    private PendingIntent f123180d;

    /* renamed from: e */
    private PendingIntent f123181e;

    /* access modifiers changed from: protected */
    public void onResume() {
        C48258d.m149701a(this);
    }

    /* renamed from: b */
    private void m149650b() {
        Uri data = getIntent().getData();
        Intent a = m149648a(data);
        if (a == null) {
            C48254a.m149690d("Failed to extract OAuth2 response from redirect", new Object[0]);
            return;
        }
        a.setData(data);
        if (this.f123180d != null) {
            C48254a.m149686a("Authorization complete - invoking completion intent", new Object[0]);
            try {
                this.f123180d.send(this, 0, a);
            } catch (CanceledException e) {
                C48254a.m149690d("Failed to send completion intent", e);
            }
        } else {
            setResult(-1, a);
        }
    }

    /* renamed from: c */
    private void m149651c() {
        C48254a.m149686a("Authorization flow canceled by user", new Object[0]);
        Intent intent = AuthorizationException.fromTemplate(C48239b.f123161b, null).toIntent();
        if (this.f123181e != null) {
            try {
                this.f123181e.send(this, 0, intent);
            } catch (CanceledException e) {
                C48254a.m149690d("Failed to send cancel intent", e);
            }
        } else {
            setResult(0, intent);
            C48254a.m149686a("No cancel intent set - will return to previous activity", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo120602a() {
        super.onResume();
        if (!this.f123178b) {
            startActivity(this.f123177a);
            this.f123178b = true;
            return;
        }
        if (getIntent().getData() != null) {
            m149650b();
        } else {
            m149651c();
        }
        finish();
    }

    /* renamed from: a */
    private static Intent m149644a(Context context) {
        return new Intent(context, AuthorizationManagementActivity.class);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            m149649a(getIntent().getExtras());
        } else {
            m149649a(bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("authStarted", this.f123178b);
        bundle.putParcelable("authIntent", this.f123177a);
        bundle.putString("authRequest", this.f123179c.mo120626c());
        bundle.putParcelable("completeIntent", this.f123180d);
        bundle.putParcelable("cancelIntent", this.f123181e);
    }

    /* renamed from: a */
    private Intent m149648a(Uri uri) {
        if (uri.getQueryParameterNames().contains("error")) {
            return AuthorizationException.fromOAuthRedirect(uri).toIntent();
        }
        C48262f a = new C48264a(this.f123179c).mo120639a(uri).mo120643a();
        if ((this.f123179c.f123252j != null || a.f123274c == null) && (this.f123179c.f123252j == null || this.f123179c.f123252j.equals(a.f123274c))) {
            return a.mo120638b();
        }
        C48254a.m149689c("State returned in authorization response (%s) does not match state from request (%s) - discarding response", a.f123274c, this.f123179c.f123252j);
        return C48238a.f123158j.toIntent();
    }

    /* renamed from: a */
    private void m149649a(Bundle bundle) {
        if (bundle == null) {
            C48254a.m149689c("No stored state - unable to handle response", new Object[0]);
            finish();
            return;
        }
        this.f123177a = (Intent) bundle.getParcelable("authIntent");
        this.f123178b = bundle.getBoolean("authStarted", false);
        C48259e eVar = null;
        try {
            String string = bundle.getString("authRequest", null);
            if (string != null) {
                eVar = C48259e.m149702a(string);
            }
            this.f123179c = eVar;
            this.f123180d = (PendingIntent) bundle.getParcelable("completeIntent");
            this.f123181e = (PendingIntent) bundle.getParcelable("cancelIntent");
        } catch (JSONException e) {
            throw new IllegalStateException("Unable to deserialize authorization request", e);
        }
    }

    /* renamed from: a */
    public static Intent m149645a(Context context, Uri uri) {
        Intent a = m149644a(context);
        a.setData(uri);
        a.addFlags(603979776);
        return a;
    }

    /* renamed from: a */
    public static Intent m149646a(Context context, C48259e eVar, Intent intent) {
        return m149647a(context, eVar, intent, null, null);
    }

    /* renamed from: a */
    private static Intent m149647a(Context context, C48259e eVar, Intent intent, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Intent a = m149644a(context);
        a.putExtra("authIntent", intent);
        a.putExtra("authRequest", eVar.mo120626c());
        a.putExtra("completeIntent", null);
        a.putExtra("cancelIntent", null);
        return a;
    }
}
