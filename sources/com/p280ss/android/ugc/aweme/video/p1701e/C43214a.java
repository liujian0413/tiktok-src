package com.p280ss.android.ugc.aweme.video.p1701e;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.aweme.video.C43268o;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.video.experiment.C43220a;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.toutiao.proxyserver.C46534r;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.video.e.a */
public class C43214a implements C43216b {

    /* renamed from: b */
    private static final String f111852b = "a";

    /* renamed from: a */
    public volatile boolean f111853a;

    /* renamed from: c */
    private C43215a f111854c;

    /* renamed from: d */
    private C43217c f111855d;

    /* renamed from: e */
    private SparseArray<View> f111856e = new SparseArray<>();

    /* renamed from: f */
    private long f111857f = 0;

    /* renamed from: g */
    private int f111858g = 0;

    /* renamed from: h */
    private int f111859h = 0;

    /* renamed from: i */
    private long f111860i;

    /* renamed from: j */
    private boolean f111861j;

    /* renamed from: k */
    private int f111862k;

    /* renamed from: l */
    private int f111863l = -1;

    /* renamed from: m */
    private long f111864m = -1;

    /* renamed from: n */
    private int f111865n;

    /* renamed from: o */
    private float f111866o;

    /* renamed from: p */
    private double f111867p;

    /* renamed from: q */
    private String f111868q;

    /* renamed from: r */
    private String f111869r;

    /* renamed from: s */
    private String f111870s;

    /* renamed from: t */
    private boolean f111871t;

    /* renamed from: u */
    private String f111872u;

    /* renamed from: v */
    private boolean f111873v;

    /* renamed from: w */
    private String f111874w;

    /* renamed from: x */
    private String f111875x;

    /* renamed from: y */
    private String f111876y;

    /* renamed from: z */
    private double f111877z;

    /* renamed from: com.ss.android.ugc.aweme.video.e.a$a */
    static class C43215a extends Handler {

        /* renamed from: a */
        private WeakReference<C43214a> f111878a;

        C43215a(C43214a aVar) {
            this.f111878a = new WeakReference<>(aVar);
        }

        public final void handleMessage(Message message) {
            C43214a aVar;
            if (this.f111878a != null) {
                aVar = (C43214a) this.f111878a.get();
            } else {
                aVar = null;
            }
            if (aVar != null && message.what == 1) {
                aVar.mo104870a();
                removeMessages(1);
                if (!aVar.f111853a) {
                    sendEmptyMessageDelayed(1, 1000);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo104878b() {
        this.f111859h = 0;
        this.f111857f = 0;
        this.f111858g = 0;
        this.f111860i = 0;
        this.f111861j = false;
        this.f111863l = -1;
        this.f111864m = -1;
        this.f111875x = null;
        this.f111874w = null;
        this.f111872u = null;
        this.f111867p = 0.0d;
        this.f111873v = false;
    }

    /* renamed from: a */
    public final void mo104870a() {
        String str;
        C43222g K = C43316v.m137450K();
        m137016a(R.string.dvk, this.f111870s);
        if (this.f111869r == null || this.f111869r.length() <= 25) {
            m137016a(R.string.fl3, this.f111869r);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f111869r.substring(0, 25));
            sb.append("\n");
            sb.append(this.f111869r.substring(25, this.f111869r.length()));
            m137016a(R.string.fl3, sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f111860i));
        sb2.append("ms");
        m137016a(R.string.b7h, sb2.toString());
        m137016a(R.string.uw, String.valueOf(this.f111858g));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(String.valueOf(this.f111857f));
        sb3.append("ms");
        m137016a(R.string.ux, sb3.toString());
        m137016a(R.string.c75, String.valueOf(this.f111859h));
        m137016a(R.string.vo, String.valueOf(this.f111863l));
        m137016a(R.string.fp4, String.valueOf(this.f111864m));
        m137016a(R.string.dvw, this.f111874w);
        m137016a(R.string.bvm, String.valueOf(this.f111861j));
        m137016a(R.string.an8, String.valueOf(this.f111875x));
        m137016a(R.string.dv6, String.valueOf(this.f111876y));
        m137016a(R.string.dv7, String.valueOf(this.f111877z));
        m137016a(R.string.cuu, String.valueOf(K.mo104901a()));
        m137016a(R.string.flj, String.valueOf(C46534r.f119902i));
        m137016a(R.string.cuj, String.valueOf(this.f111866o));
        m137016a(R.string.vq, String.valueOf(this.f111867p));
        StringBuilder sb4 = new StringBuilder();
        sb4.append(String.valueOf(this.f111862k));
        sb4.append("KBps");
        m137016a(R.string.buw, sb4.toString());
        m137016a(R.string.t9, String.valueOf(this.f111865n));
        if (this.f111868q != null) {
            m137016a(R.string.ta, this.f111868q);
        }
        m137016a(R.string.e43, String.valueOf(K.mo104920s()));
        m137016a(R.string.can, String.valueOf(C43268o.f112004a));
        m137016a(R.string.flf, String.valueOf(this.f111873v));
        if (this.f111872u == null || this.f111872u.length() <= 120) {
            str = this.f111872u;
        } else {
            str = this.f111872u.substring(0, 120);
        }
        m137016a(R.string.cuy, str);
        m137016a(R.string.cuv, K.mo104903b());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(C43220a.m137073b());
        sb5.append(C43305j.m137386g().mo105091i().getClass().getSimpleName());
        m137016a(R.string.d3o, sb5.toString());
    }

    /* renamed from: a */
    public final void mo104871a(double d) {
        this.f111877z = d;
    }

    /* renamed from: b */
    public final void mo104879b(float f) {
        this.f111867p = (double) f;
    }

    /* renamed from: c */
    public final void mo104884c(int i) {
        this.f111863l = i;
    }

    /* renamed from: d */
    public final void mo104888d(int i) {
        this.f111865n = i;
    }

    /* renamed from: e */
    public final void mo104890e(int i) {
        this.f111862k = i;
    }

    /* renamed from: f */
    public final void mo104893f(String str) {
        this.f111876y = str;
    }

    /* renamed from: a */
    public final void mo104872a(float f) {
        this.f111866o = f;
    }

    /* renamed from: b */
    public final void mo104880b(int i) {
        this.f111859h = i;
    }

    /* renamed from: c */
    public final void mo104885c(long j) {
        this.f111864m = j;
    }

    /* renamed from: d */
    public final void mo104889d(String str) {
        this.f111872u = str;
    }

    /* renamed from: e */
    public final void mo104891e(String str) {
        this.f111874w = str;
    }

    /* renamed from: f */
    public final void mo104892f(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.f111873v = z;
    }

    /* renamed from: a */
    public final void mo104873a(int i) {
        this.f111858g = i;
    }

    /* renamed from: b */
    public final void mo104881b(long j) {
        this.f111860i = j;
    }

    /* renamed from: c */
    public final void mo104886c(String str) {
        this.f111870s = str;
    }

    /* renamed from: b */
    public final void mo104882b(String str) {
        this.f111869r = str;
    }

    /* renamed from: c */
    public final void mo104887c(boolean z) {
        this.f111871t = z;
    }

    /* renamed from: a */
    public final void mo104874a(long j) {
        this.f111857f = j;
    }

    /* renamed from: a */
    public final void mo104875a(Object obj) {
        if (obj != null) {
            this.f111868q = obj.toString();
        }
    }

    /* renamed from: b */
    public final void mo104883b(boolean z) {
        this.f111861j = z;
    }

    /* renamed from: a */
    public final void mo104876a(String str) {
        this.f111875x = str;
    }

    /* renamed from: a */
    public final void mo104877a(boolean z) {
        this.f111853a = !z;
        if (z) {
            this.f111854c.sendEmptyMessageDelayed(1, 1000);
        } else {
            this.f111854c.removeMessages(1);
        }
    }

    /* renamed from: a */
    private void m137016a(int i, String str) {
        View view = (View) this.f111856e.get(i);
        if (view == null) {
            this.f111856e.put(i, this.f111855d.mo104895a(i, str));
            return;
        }
        this.f111855d.mo104896a(view, str);
    }

    public C43214a(Context context, FrameLayout frameLayout) {
        this.f111855d = new C43217c(context);
        frameLayout.addView(this.f111855d.f111879a, new LayoutParams(-1, -1));
        this.f111854c = new C43215a(this);
    }
}
