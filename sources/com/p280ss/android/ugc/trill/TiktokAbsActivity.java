package com.p280ss.android.ugc.trill;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.content.C0688e;
import android.view.View;
import com.bytedance.common.utility.collection.C6308d;
import com.bytedance.ies.uikit.base.C11008b;
import com.bytedance.ies.uikit.base.C11008b.C11009a;
import com.bytedance.ies.uikit.base.C11008b.C11010b;
import com.bytedance.ies.uikit.base.C11008b.C11011c;
import com.bytedance.ies.uikit.base.C11013c;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.base.activity.C23256c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.trill.TiktokAbsActivity */
public abstract class TiktokAbsActivity extends Activity {

    /* renamed from: c */
    protected static int f115639c;

    /* renamed from: a */
    protected boolean f115640a;

    /* renamed from: b */
    protected boolean f115641b;

    /* renamed from: d */
    protected int f115642d = 0;

    /* renamed from: e */
    private C6308d<C11013c> f115643e = new C6308d<>();

    /* renamed from: f */
    private BroadcastReceiver f115644f;

    /* renamed from: a */
    private int m141908a() {
        return getResources().getColor(R.color.hn);
    }

    /* renamed from: b */
    private void m141909b() {
        if (VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(m141908a());
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            C10994a.m32206a(this, m141908a());
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (f115639c == 0) {
            C11011c d = C11008b.m32272d();
            if (d != null) {
                d.mo26595a(false);
            }
        }
        f115639c++;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C0688e.m2941a((Context) this).mo2837a(this.f115644f);
        super.onDestroy();
        this.f115641b = true;
        if (!this.f115643e.mo15145b()) {
            Iterator it = this.f115643e.iterator();
            while (it.hasNext()) {
                C11013c cVar = (C11013c) it.next();
                if (cVar != null) {
                    cVar.bb_();
                }
            }
            this.f115643e.mo15142a();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f115640a = false;
        C11009a b = C11008b.m32270b();
        if (b != null) {
            b.mo26593b(this);
        }
        if (!this.f115643e.mo15145b()) {
            Iterator it = this.f115643e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f115640a = true;
        C11009a b = C11008b.m32270b();
        if (b != null) {
            b.mo26592a(this);
        }
        if (!this.f115643e.mo15145b()) {
            Iterator it = this.f115643e.iterator();
            while (it.hasNext()) {
                C11013c cVar = (C11013c) it.next();
                if (cVar != null) {
                    cVar.mo26596a();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        int i = f115639c - 1;
        f115639c = i;
        if (i == 0) {
            C11011c d = C11008b.m32272d();
            if (d != null) {
                d.mo26595a(true);
            }
        }
        this.f115640a = false;
        if (!this.f115643e.mo15145b()) {
            Iterator it = this.f115643e.iterator();
            while (it.hasNext()) {
                C11013c cVar = (C11013c) it.next();
                if (cVar != null) {
                    cVar.bc_();
                }
            }
        }
    }

    public void setContentView(int i) {
        super.setContentView(i);
        m141909b();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        m141909b();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f115644f = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if (!TiktokAbsActivity.this.isFinishing()) {
                    TiktokAbsActivity.this.finish();
                }
            }
        };
        C0688e.m2941a((Context) this).mo2838a(this.f115644f, new IntentFilter("com.ss.android.common.app.action.exit_app"));
        if (this.f115642d != 0) {
            C23256c.m76347a(this, this.f115642d);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C11010b c = C11008b.m32271c();
        if (c == null || !c.mo26594a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }
}
