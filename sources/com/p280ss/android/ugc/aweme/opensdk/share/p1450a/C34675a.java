package com.p280ss.android.ugc.aweme.opensdk.share.p1450a;

import android.app.Activity;
import android.app.Dialog;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.a.a */
public final class C34675a extends Dialog {

    /* renamed from: a */
    public C34678a f90449a;

    /* renamed from: b */
    private String f90450b;

    /* renamed from: c */
    private String f90451c;

    /* renamed from: d */
    private ImageView f90452d;

    /* renamed from: e */
    private DmtTextView f90453e;

    /* renamed from: f */
    private DmtTextView f90454f;

    /* renamed from: g */
    private RelativeLayout f90455g;

    /* renamed from: h */
    private RelativeLayout f90456h;

    /* renamed from: com.ss.android.ugc.aweme.opensdk.share.a.a$a */
    public interface C34678a {
        /* renamed from: a */
        void mo80106a();

        /* renamed from: b */
        void mo80107b();
    }

    /* renamed from: a */
    private void m111970a() {
        this.f90452d = (ImageView) findViewById(R.id.d5v);
        this.f90453e = (DmtTextView) findViewById(R.id.d5x);
        this.f90452d.setImageResource(R.drawable.af6);
        this.f90453e.setText(R.string.e74);
    }

    /* renamed from: b */
    private void m111971b() {
        this.f90452d = (ImageView) findViewById(R.id.d5v);
        this.f90453e = (DmtTextView) findViewById(R.id.d5x);
        this.f90452d.setImageResource(R.drawable.af5);
        this.f90453e.setText(R.string.e72);
    }

    /* renamed from: c */
    private void m111972c() {
        this.f90452d = (ImageView) findViewById(R.id.d5v);
        this.f90453e = (DmtTextView) findViewById(R.id.d5x);
        this.f90452d.setImageResource(R.drawable.af6);
        this.f90453e.setText(R.string.e73);
    }

    /* renamed from: d */
    private void m111973d() {
        this.f90454f = (DmtTextView) findViewById(R.id.d5t);
        this.f90454f.setText(getContext().getResources().getString(R.string.e71, new Object[]{this.f90451c}));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onCreate(r3)
            r3 = 2131493305(0x7f0c01b9, float:1.8610086E38)
            r2.setContentView(r3)
            java.lang.String r3 = r2.f90450b
            int r0 = r3.hashCode()
            r1 = -2076320574(0xffffffff843ddcc2, float:-2.231821E-36)
            if (r0 == r1) goto L_0x0033
            r1 = -1846572353(0xffffffff91ef8abf, float:-3.779306E-28)
            if (r0 == r1) goto L_0x0029
            r1 = -1397149946(0xffffffffacb92f06, float:-5.263237E-12)
            if (r0 == r1) goto L_0x001f
            goto L_0x003d
        L_0x001f:
            java.lang.String r0 = "share saved"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x003d
            r3 = 1
            goto L_0x003e
        L_0x0029:
            java.lang.String r0 = "share fail"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x003d
            r3 = 2
            goto L_0x003e
        L_0x0033:
            java.lang.String r0 = "share success"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x003d
            r3 = 0
            goto L_0x003e
        L_0x003d:
            r3 = -1
        L_0x003e:
            switch(r3) {
                case 0: goto L_0x0049;
                case 1: goto L_0x0045;
                default: goto L_0x0041;
            }
        L_0x0041:
            r2.m111971b()
            goto L_0x004c
        L_0x0045:
            r2.m111972c()
            goto L_0x004c
        L_0x0049:
            r2.m111970a()
        L_0x004c:
            r2.m111973d()
            r3 = 2131301563(0x7f0914bb, float:1.8221187E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r2.f90455g = r3
            r3 = 2131301567(0x7f0914bf, float:1.8221196E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r2.f90456h = r3
            android.widget.RelativeLayout r3 = r2.f90455g
            com.ss.android.ugc.aweme.opensdk.share.a.a$1 r0 = new com.ss.android.ugc.aweme.opensdk.share.a.a$1
            r0.<init>()
            r3.setOnClickListener(r0)
            android.widget.RelativeLayout r3 = r2.f90456h
            com.ss.android.ugc.aweme.opensdk.share.a.a$2 r0 = new com.ss.android.ugc.aweme.opensdk.share.a.a$2
            r0.<init>()
            r3.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.opensdk.share.p1450a.C34675a.onCreate(android.os.Bundle):void");
    }

    public C34675a(Activity activity, String str, String str2, C34678a aVar) {
        super(activity, R.style.wl);
        this.f90451c = str;
        this.f90450b = str2;
        this.f90449a = aVar;
    }
}
