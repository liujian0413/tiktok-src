package com.p280ss.android.downloadlib.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.ActivityCompat.C0539a;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.p280ss.android.download.api.p857a.C19382k;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.downloadlib.p868c.C19519e;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.ugc.aweme.app.C22912d;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.downloadlib.activity.TTDelegateActivity */
public class TTDelegateActivity extends Activity implements C0539a {

    /* renamed from: a */
    private Intent f52666a;

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m63990b();
    }

    /* renamed from: a */
    private void m63987a() {
        Window window = getWindow();
        LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    /* renamed from: b */
    private void m63990b() {
        if (this.f52666a != null) {
            switch (this.f52666a.getIntExtra("type", 0)) {
                case 1:
                    m63992b(this.f52666a.getStringExtra("permission_id_key"), this.f52666a.getStringArrayExtra("permission_content_key"));
                    break;
                case 2:
                    m63991b(this.f52666a.getStringExtra(C22912d.f60642b));
                    break;
                default:
                    C19523h.m64312a((Activity) this);
                    break;
            }
            this.f52666a = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m63987a();
        this.f52666a = getIntent();
        C19491j.m64221b(this);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.f52666a = intent;
        C19491j.m64221b(this);
    }

    /* renamed from: a */
    public static void m63988a(String str) {
        Intent intent = new Intent(C19491j.m64206a(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 2);
        intent.putExtra(C22912d.f60642b, str);
        if (C19491j.m64206a() != null) {
            C19491j.m64206a().startActivity(intent);
        }
    }

    /* renamed from: b */
    private void m63991b(String str) {
        if (TextUtils.isEmpty(str)) {
            C19523h.m64312a((Activity) this);
            return;
        }
        try {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            intent.putExtra(C22912d.f60642b, str);
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
        } finally {
            C19523h.m64312a((Activity) this);
        }
    }

    /* renamed from: a */
    public static void m63989a(String str, String[] strArr) {
        Intent intent = new Intent(C19491j.m64206a(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 1);
        intent.putExtra("permission_id_key", str);
        intent.putExtra("permission_content_key", strArr);
        if (C19491j.m64206a() != null) {
            C19491j.m64206a().startActivity(intent);
        }
    }

    /* renamed from: b */
    private void m63992b(final String str, String[] strArr) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            C19523h.m64312a((Activity) this);
            return;
        }
        C194551 r0 = new C19382k() {

            /* renamed from: c */
            private WeakReference<Activity> f52669c = new WeakReference<>(TTDelegateActivity.this);

            /* renamed from: a */
            public final void mo51367a() {
                C19519e.m64287a(str);
                C19523h.m64312a((Activity) this.f52669c.get());
            }

            /* renamed from: a */
            public final void mo51368a(String str) {
                C19519e.m64289a(str, str);
                C19523h.m64312a((Activity) this.f52669c.get());
            }
        };
        if (VERSION.SDK_INT >= 23) {
            try {
                C19491j.m64225f().mo51361a(this, strArr, r0);
                return;
            } catch (Exception unused) {
            }
        }
        r0.mo51367a();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C19491j.m64225f().mo51360a(this, i, strArr, iArr);
    }
}
