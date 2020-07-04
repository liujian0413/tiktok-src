package com.p280ss.android.ugc.aweme.feedback;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.keva.Keva;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.C22999k;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.io.File;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feedback.n */
public final class C29086n implements Callback {

    /* renamed from: a */
    public Handler f76815a = new Handler(this.f76816b.getMainLooper(), this);

    /* renamed from: b */
    public Context f76816b;

    /* renamed from: c */
    private static boolean m95433c() {
        if (C22999k.m75642a() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo74523a() {
        if (this.f76815a != null) {
            C6726a.m20842a(new Runnable() {
                public final void run() {
                    try {
                        long a = C29072e.m95401a(C29086n.this.f76816b).mo74505a(true);
                        if (C29086n.this.f76816b.getFilesDir() != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(C29086n.this.f76816b.getFilesDir().getParent());
                            sb.append("/shared_prefs");
                            File file = new File(sb.toString(), "feedback_last_time.xml");
                            if (file.exists()) {
                                if (a <= 0) {
                                    SharedPreferences a2 = C7285c.m22838a(C29086n.this.f76816b, "feedback_last_time", 0);
                                    if (a2.contains("key_last_time")) {
                                        a = a2.getLong("key_last_time", -1);
                                    }
                                }
                                file.delete();
                            }
                        }
                        long j = a;
                        if (j > 0) {
                            C29091r rVar = new C29091r(0, j, 50, 0, 2);
                            new FeedbackThread2(C29086n.this.f76815a, C29086n.this.f76816b, rVar).start();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private void m95432b() {
        Activity g = C6405d.m19984g();
        if (!(g instanceof FeedbackActivity) && (g instanceof AbsActivity) && ((AbsActivity) g).isActive() && m95433c()) {
            C42961az.m136380a(new C29074f());
        }
    }

    /* renamed from: a */
    public static C29086n m95429a(Context context) {
        return new C29086n(context);
    }

    private C29086n(Context context) {
        this.f76816b = context.getApplicationContext();
    }

    /* renamed from: a */
    private boolean m95430a(C29091r rVar) {
        if (rVar == null) {
            return false;
        }
        List<C29075g> list = rVar.f76837g;
        boolean z = !C6307b.m19566a((Collection<T>) list);
        if (!z || !m95431a(list)) {
            return z;
        }
        m95432b();
        return z;
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 10 || !(message.obj instanceof C29091r)) {
            return false;
        }
        m95430a((C29091r) message.obj);
        return false;
    }

    /* renamed from: a */
    private static boolean m95431a(List<C29075g> list) {
        long j = 0;
        for (int i = 0; i < list.size(); i++) {
            if (((C29075g) list.get(i)).f76752b > j && ((C29075g) list.get(i)).f76760j == 1) {
                j = ((C29075g) list.get(i)).f76752b;
            }
        }
        Keva repo = Keva.getRepo("feedback");
        if (j <= repo.getLong("last_alert_time", 0)) {
            return false;
        }
        repo.storeLong("last_alert_time", j);
        return true;
    }
}
