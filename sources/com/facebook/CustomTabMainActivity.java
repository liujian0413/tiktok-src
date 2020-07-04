package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p022v4.content.C0688e;
import com.facebook.internal.C13905d;

public class CustomTabMainActivity extends Activity {

    /* renamed from: a */
    public static final String f34637a;

    /* renamed from: b */
    public static final String f34638b;

    /* renamed from: c */
    public static final String f34639c;

    /* renamed from: d */
    public static final String f34640d;

    /* renamed from: e */
    private boolean f34641e = true;

    /* renamed from: f */
    private BroadcastReceiver f34642f;

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f34641e) {
            m38240a(0, null);
        }
        this.f34641e = true;
    }

    /* renamed from: a */
    public static final String m38239a() {
        StringBuilder sb = new StringBuilder("fb");
        sb.append(C13499h.m39725k());
        sb.append("://authorize");
        return sb.toString();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomTabMainActivity.class.getSimpleName());
        sb.append(".extra_params");
        f34637a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CustomTabMainActivity.class.getSimpleName());
        sb2.append(".extra_chromePackage");
        f34638b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(CustomTabMainActivity.class.getSimpleName());
        sb3.append(".extra_url");
        f34639c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(CustomTabMainActivity.class.getSimpleName());
        sb4.append(".action_refresh");
        f34640d = sb4.toString();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f34640d.equals(intent.getAction())) {
            C0688e.m2941a((Context) this).mo2839a(new Intent(CustomTabActivity.f34634b));
            m38240a(-1, intent);
            return;
        }
        if (CustomTabActivity.f34633a.equals(intent.getAction())) {
            m38240a(-1, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (CustomTabActivity.f34633a.equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle == null) {
            Bundle bundleExtra = getIntent().getBundleExtra(f34637a);
            new C13905d("oauth", bundleExtra).mo33556a(this, getIntent().getStringExtra(f34638b));
            this.f34641e = false;
            this.f34642f = new BroadcastReceiver() {
                public final void onReceive(Context context, Intent intent) {
                    Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
                    intent2.setAction(CustomTabMainActivity.f34640d);
                    intent2.putExtra(CustomTabMainActivity.f34639c, intent.getStringExtra(CustomTabMainActivity.f34639c));
                    intent2.addFlags(603979776);
                    CustomTabMainActivity.this.startActivity(intent2);
                }
            };
            C0688e.m2941a((Context) this).mo2838a(this.f34642f, new IntentFilter(CustomTabActivity.f34633a));
        }
    }

    /* renamed from: a */
    private void m38240a(int i, Intent intent) {
        C0688e.m2941a((Context) this).mo2837a(this.f34642f);
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }
}
