package com.p280ss.android.ugc.aweme.qrcode.p1496b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C6306c;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.p1048ax.C23139a;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.qrcode.p1498d.C37074d;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.utils.C42969bc;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.b.m */
public final class C37045m {

    /* renamed from: a */
    public C37051a f97003a;

    /* renamed from: b */
    public Activity f97004b;

    /* renamed from: c */
    public String f97005c;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.b.m$a */
    public interface C37051a {
        /* renamed from: a */
        View mo93496a();

        /* renamed from: a */
        void mo93497a(String str);

        /* renamed from: b */
        void mo93498b();
    }

    /* renamed from: b */
    public final void mo93491b() {
        this.f97003a = null;
        this.f97004b = null;
    }

    /* renamed from: c */
    private void m119117c() {
        this.f97003a.mo93498b();
        C6726a.m20844b(new Runnable() {
            public final void run() {
                if (TextUtils.isEmpty(C37045m.this.f97005c)) {
                    C37045m mVar = C37045m.this;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(System.currentTimeMillis());
                    sb.append(C6306c.m19561a(sb2.toString()));
                    sb.append(".png");
                    mVar.f97005c = sb.toString();
                }
                if (C37045m.this.f97003a != null) {
                    final String a = C37074d.m119208a(C37045m.this.f97003a.mo93496a(), C23139a.m76055a(C37045m.this.f97004b), C37045m.this.f97005c);
                    C6726a.m20844b(new Runnable() {
                        public final void run() {
                            if (C37045m.this.f97003a != null) {
                                C37045m.this.f97003a.mo93497a(a);
                            }
                        }
                    });
                }
            }
        });
    }

    /* renamed from: d */
    private void m119118d() {
        C22477b.m74364a(this.f97004b, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C22480b() {
            /* renamed from: a */
            public final void mo53549a(String[] strArr, int[] iArr) {
                if (iArr.length > 0 && iArr[0] == -1 && !ActivityCompat.m2242a(C37045m.this.f97004b, strArr[0])) {
                    C42951au.m136341a(C37045m.this.f97004b, R.string.lb, R.string.w_, new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }, R.string.afp, new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C42969bc.m136401a(C37045m.this.f97004b);
                        }
                    }).show();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo93489a() {
        if (C0683b.m2909b((Context) this.f97004b, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            m119117c();
        } else {
            m119118d();
        }
    }

    public C37045m(C37051a aVar, Activity activity) {
        this(aVar, activity, "");
    }

    private C37045m(C37051a aVar, Activity activity, String str) {
        this.f97003a = aVar;
        this.f97004b = activity;
        this.f97005c = str;
    }

    /* renamed from: a */
    public final void mo93490a(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            for (int i2 : iArr) {
                if (i2 == -1) {
                    m119118d();
                    return;
                }
            }
            m119117c();
        }
    }
}
