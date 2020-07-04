package com.linecorp.linesdk.auth.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponseCode;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

public class LineAuthenticationActivity extends Activity {

    /* renamed from: a */
    private boolean f50249a;

    /* renamed from: b */
    private C18602d f50250b;

    /* renamed from: c */
    private C18598c f50251c;

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f50249a = true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f50250b.f50282d == C18604a.f50283a) {
            C18598c cVar = this.f50251c;
            cVar.f50275h.f50282d = C18604a.f50284b;
            new C18601c(cVar, 0).execute(new Void[0]);
        } else if (this.f50250b.f50282d != C18604a.f50285c) {
            new Handler(Looper.getMainLooper()).postDelayed(new C18600b(this.f50251c, 0), 1000);
        }
        this.f50249a = false;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("authenticationStatus", this.f50250b);
    }

    /* renamed from: a */
    public static LineLoginResult m61022a(Intent intent) {
        LineLoginResult lineLoginResult = (LineLoginResult) intent.getParcelableExtra("authentication_result");
        if (lineLoginResult == null) {
            return new LineLoginResult(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("Authentication result is not found."));
        }
        return lineLoginResult;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo48766a(LineLoginResult lineLoginResult) {
        if (this.f50250b == null) {
            finish();
            return;
        }
        if ((this.f50250b.f50282d == C18604a.f50284b && !this.f50249a) || this.f50250b.f50282d == C18604a.f50286d) {
            Intent intent = new Intent();
            intent.putExtra("authentication_result", lineLoginResult);
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C18602d dVar;
        super.onCreate(bundle);
        setContentView(R.layout.ace);
        Intent intent = getIntent();
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) intent.getParcelableExtra("authentication_config");
        if (lineAuthenticationConfig == null) {
            mo48766a(new LineLoginResult(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("The requested parameter is illegal.")));
            return;
        }
        if (bundle == null) {
            dVar = new C18602d();
        } else {
            dVar = (C18602d) bundle.getParcelable("authenticationStatus");
            if (dVar == null) {
                dVar = new C18602d();
            }
        }
        this.f50250b = dVar;
        this.f50251c = new C18598c(this, lineAuthenticationConfig, this.f50250b, intent.getStringArrayExtra("permissions"));
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        C18596c cVar;
        LineApiResponseCode lineApiResponseCode;
        super.onNewIntent(intent);
        if (this.f50250b.f50282d == C18604a.f50284b) {
            C18598c cVar2 = this.f50251c;
            cVar2.f50275h.f50282d = C18604a.f50285c;
            C18593a aVar = cVar2.f50272e;
            Uri data = intent.getData();
            if (data == null) {
                cVar = C18596c.m61025a("Illegal redirection from external application.");
            } else {
                String str = aVar.f50253b.f50281c;
                String queryParameter = data.getQueryParameter("state");
                if (str == null || !str.equals(queryParameter)) {
                    cVar = C18596c.m61025a("Illegal parameter value of 'state'.");
                } else {
                    String queryParameter2 = data.getQueryParameter("code");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        cVar = new C18596c(queryParameter2, null, null, null);
                    } else {
                        cVar = new C18596c(null, data.getQueryParameter("error"), data.getQueryParameter("error_description"), null);
                    }
                }
            }
            if (!cVar.mo48774a()) {
                cVar2.f50275h.f50282d = C18604a.f50286d;
                LineAuthenticationActivity lineAuthenticationActivity = cVar2.f50268a;
                if (cVar.mo48775b()) {
                    lineApiResponseCode = LineApiResponseCode.AUTHENTICATION_AGENT_ERROR;
                } else {
                    lineApiResponseCode = LineApiResponseCode.INTERNAL_ERROR;
                }
                lineAuthenticationActivity.mo48766a(new LineLoginResult(lineApiResponseCode, cVar.mo48776c()));
                return;
            }
            C18599a aVar2 = new C18599a(cVar2, 0);
            String[] strArr = new String[1];
            if (!TextUtils.isEmpty(cVar.f50261a)) {
                strArr[0] = cVar.f50261a;
                aVar2.execute(strArr);
            } else {
                throw new UnsupportedOperationException("requestToken is null. Please check result by isSuccess before.");
            }
        }
    }

    /* renamed from: a */
    public static Intent m61021a(Context context, LineAuthenticationConfig lineAuthenticationConfig, List<String> list) {
        Intent intent = new Intent(context, LineAuthenticationActivity.class);
        intent.putExtra("authentication_config", lineAuthenticationConfig);
        intent.putExtra("permissions", (String[]) list.toArray(new String[list.size()]));
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f50250b.f50282d == C18604a.f50284b) {
            C18598c cVar = this.f50251c;
            if (i == 3 && cVar.f50275h.f50282d != C18604a.f50285c) {
                new Handler(Looper.getMainLooper()).postDelayed(new C18600b(cVar, 0), 1000);
            }
        }
    }
}
