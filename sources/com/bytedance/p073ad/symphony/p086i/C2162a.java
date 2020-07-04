package com.bytedance.p073ad.symphony.p086i;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.p073ad.symphony.p079d.p080a.C2133a;
import com.p280ss.android.common.util.C6776h;

/* renamed from: com.bytedance.ad.symphony.i.a */
public final class C2162a extends View {

    /* renamed from: a */
    public boolean f7343a;

    /* renamed from: b */
    public C2133a f7344b;

    /* renamed from: c */
    public ViewGroup f7345c;

    /* renamed from: d */
    public Context f7346d;

    /* renamed from: e */
    public boolean f7347e;

    /* renamed from: f */
    public int f7348f;

    /* renamed from: g */
    protected final Handler f7349g = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    if (C2162a.this.f7343a) {
                        if (C2165c.m9436a(C2162a.this.f7345c, 0, C2162a.this.f7348f)) {
                            C2162a.this.mo7857a();
                            if (C2162a.this.f7344b != null) {
                                C2162a.this.f7344b.mo7763a();
                                return;
                            }
                        } else {
                            C2162a.this.f7349g.sendEmptyMessageDelayed(1, 1000);
                            return;
                        }
                    }
                    break;
                case 2:
                    boolean c = C6776h.m20951c(C2162a.this.f7346d, C2162a.this.f7346d.getPackageName());
                    if (!C2165c.m9436a(C2162a.this.f7345c, 0, C2162a.this.f7348f) && c) {
                        if (!C2162a.this.f7347e) {
                            C2162a.this.setNeedCheckingShow(true);
                            break;
                        }
                    } else {
                        C2162a.this.f7349g.sendEmptyMessageDelayed(2, 1000);
                        return;
                    }
                    break;
            }
        }
    };

    /* renamed from: h */
    private boolean f7350h;

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9431b();
        this.f7347e = false;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7347e = true;
        mo7857a();
    }

    /* renamed from: b */
    private void m9431b() {
        if (this.f7350h && !this.f7343a) {
            this.f7343a = true;
            this.f7349g.sendEmptyMessage(1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7857a() {
        if (this.f7343a) {
            if (!this.f7347e) {
                this.f7345c.removeView(this);
            }
            this.f7349g.removeCallbacksAndMessages(null);
            this.f7343a = false;
        }
    }

    public final void setAdType(int i) {
        this.f7348f = i;
    }

    public final void setListener(C2133a aVar) {
        this.f7344b = aVar;
    }

    public final void setNeedCheckingShow(boolean z) {
        this.f7350h = z;
        if (z || !this.f7343a) {
            if (z && !this.f7343a) {
                m9431b();
            }
            return;
        }
        mo7857a();
    }

    public C2162a(Context context, ViewGroup viewGroup) {
        super(context);
        this.f7346d = context;
        this.f7345c = viewGroup;
        setLayoutParams(new LayoutParams(0, 0));
    }
}
