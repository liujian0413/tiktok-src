package com.bytedance.lobby.internal;

import android.arch.lifecycle.C0053p;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatActivity;
import com.bytedance.lobby.C12191a;
import com.bytedance.lobby.LobbyException;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.AuthResult.C12195a;
import com.bytedance.lobby.auth.C12201d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class LobbyInvisibleActivity extends AppCompatActivity {

    /* renamed from: a */
    public static final boolean f32497a = C12191a.f32435a;

    /* renamed from: b */
    public int f32498b;

    /* renamed from: c */
    private boolean f32499c;

    /* renamed from: d */
    private boolean f32500d;

    /* renamed from: e */
    private C12201d f32501e;

    public void onDestroy() {
        super.onDestroy();
        this.f32501e.mo29935a();
    }

    public void onResume() {
        super.onResume();
        if (!this.f32499c || this.f32500d) {
            this.f32499c = true;
        } else {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.cw);
        Intent intent = getIntent();
        final String stringExtra = intent.getStringExtra("provider_id");
        this.f32498b = intent.getIntExtra("action_type", 0);
        this.f32501e = C12222c.m35539a().mo29970d(stringExtra);
        if (this.f32501e == null) {
            C12220a a = C12220a.m35533a();
            int i = this.f32498b;
            C12195a a2 = new C12195a(stringExtra, this.f32498b).mo29925a(false);
            StringBuilder sb = new StringBuilder("No provider found for ");
            sb.append(stringExtra);
            a.mo29960a(stringExtra, i, a2.mo29923a(new LobbyException(1, sb.toString())).mo29926a());
            finish();
            return;
        }
        LobbyViewModel.m35531a(this).mo29959h().observe(this, new C0053p<AuthResult>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(AuthResult authResult) {
                C12220a.m35533a().mo29960a(stringExtra, LobbyInvisibleActivity.this.f32498b, authResult);
                LobbyInvisibleActivity.this.finish();
            }
        });
        this.f32500d = true;
        switch (this.f32498b) {
            case 1:
                this.f32501e.mo29937a(this, intent.getExtras());
                return;
            case 2:
                this.f32501e.mo29939b(this, intent.getExtras());
                return;
            default:
                C12220a a3 = C12220a.m35533a();
                int i2 = this.f32498b;
                C12195a a4 = new C12195a(stringExtra, this.f32498b).mo29925a(false);
                StringBuilder sb2 = new StringBuilder("Unknown action type: ");
                sb2.append(this.f32498b);
                a3.mo29960a(stringExtra, i2, a4.mo29923a(new LobbyException(1, sb2.toString())).mo29926a());
                finish();
                return;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f32501e.mo29936a(this, i, i2, intent);
    }
}
