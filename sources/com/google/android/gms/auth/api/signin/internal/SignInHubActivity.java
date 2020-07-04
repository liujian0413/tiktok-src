package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0650v.C0651a;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0685d;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.api.Status;

public class SignInHubActivity extends FragmentActivity {

    /* renamed from: a */
    private static boolean f38821a;

    /* renamed from: b */
    private boolean f38822b;

    /* renamed from: c */
    private SignInConfiguration f38823c;

    /* renamed from: d */
    private boolean f38824d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f38825e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Intent f38826f;

    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    class C14982a implements C0651a<Void> {
        private C14982a() {
        }

        /* renamed from: a */
        public final void mo2759a(C0685d<Void> dVar) {
        }

        /* renamed from: a */
        public final C0685d<Void> mo2758a(int i, Bundle bundle) {
            return new zze(SignInHubActivity.this, C15037d.m43585a());
        }

        /* renamed from: a */
        public final /* synthetic */ void mo2760a(C0685d dVar, Object obj) {
            SignInHubActivity.this.setResult(SignInHubActivity.this.f38825e, SignInHubActivity.this.f38826f);
            SignInHubActivity.this.finish();
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m43467a(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            this.f38823c = (SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
            if (this.f38823c == null) {
                setResult(0);
                finish();
                return;
            }
            if (!(bundle == null)) {
                this.f38824d = bundle.getBoolean("signingInGoogleApiClients");
                if (this.f38824d) {
                    this.f38825e = bundle.getInt("signInResultCode");
                    this.f38826f = (Intent) bundle.getParcelable("signInResultData");
                    m43466a();
                }
            } else if (f38821a) {
                setResult(0);
                m43467a(12502);
            } else {
                f38821a = true;
                Intent intent2 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.f38823c);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.f38822b = true;
                    m43467a(17);
                }
            }
        } else {
            String str = "Unknown action: ";
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f38824d);
        if (this.f38824d) {
            bundle.putInt("signInResultCode", this.f38825e);
            bundle.putParcelable("signInResultData", this.f38826f);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f38822b) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.f38809a != null) {
                        GoogleSignInAccount googleSignInAccount = signInAccount.f38809a;
                        C14995m.m43512a(this).mo38138a(this.f38823c.f38819a, googleSignInAccount);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.f38824d = true;
                        this.f38825e = i2;
                        this.f38826f = intent;
                        m43466a();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        m43467a(intExtra);
                        return;
                    }
                }
                m43467a(8);
            }
        }
    }

    /* renamed from: a */
    private final void m43466a() {
        getSupportLoaderManager().mo2480a(0, null, new C14982a());
        f38821a = false;
    }

    /* renamed from: a */
    private final void m43467a(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f38821a = false;
    }
}
