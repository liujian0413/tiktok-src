package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p022v4.content.C0688e;

public class CustomTabActivity extends Activity {

    /* renamed from: a */
    public static final String f34633a;

    /* renamed from: b */
    public static final String f34634b;

    /* renamed from: c */
    private BroadcastReceiver f34635c;

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C0688e.m2941a((Context) this).mo2837a(this.f34635c);
        super.onDestroy();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomTabActivity.class.getSimpleName());
        sb.append(".action_customTabRedirect");
        f34633a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CustomTabActivity.class.getSimpleName());
        sb2.append(".action_destroy");
        f34634b = sb2.toString();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f34633a);
        intent.putExtra(CustomTabMainActivity.f34639c, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f34633a);
            intent2.putExtra(CustomTabMainActivity.f34639c, getIntent().getDataString());
            C0688e.m2941a((Context) this).mo2839a(intent2);
            this.f34635c = new BroadcastReceiver() {
                public final void onReceive(Context context, Intent intent) {
                    CustomTabActivity.this.finish();
                }
            };
            C0688e.m2941a((Context) this).mo2838a(this.f34635c, new IntentFilter(f34634b));
        }
    }
}
