package com.p280ss.android.common.applog.p286a;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.common.applog.TaskSessionDao;
import com.p280ss.android.common.applog.TeaThread;
import com.p280ss.android.deviceregister.p289a.C6778a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.common.applog.a.b */
public final class C19270b {

    /* renamed from: a */
    private Context f52159a;

    /* renamed from: b */
    public final void mo51148b() {
        m63139a("");
    }

    /* renamed from: a */
    public final C19272d mo51146a() {
        return C19272d.m63145a(C7285c.m22838a(this.f52159a, C6778a.m20960a(), 0).getString("key_task_session", ""));
    }

    C19270b(Context context) {
        m63138a(context);
    }

    /* renamed from: a */
    public final void mo51147a(C19272d dVar) {
        TaskSessionDao.inst(this.f52159a).saveTaskSession(dVar);
    }

    /* renamed from: a */
    private void m63138a(Context context) {
        this.f52159a = context.getApplicationContext();
        TaskSessionDao.inst(context);
        TeaThread.getInst().ensureTeaThreadLite(new Runnable() {
            public final void run() {
                C19272d a = C19270b.this.mo51146a();
                if (a != null) {
                    C19270b.this.mo51147a(a);
                }
                C19270b.this.mo51148b();
            }
        });
    }

    /* renamed from: b */
    public final void mo51149b(C19272d dVar) {
        if (dVar != null) {
            new StringBuilder("saveTaskSessionToSp : ").append(dVar);
            m63139a(dVar.mo51155c());
        }
    }

    /* renamed from: a */
    private void m63139a(String str) {
        if (str == null) {
            str = "";
        }
        try {
            Editor edit = C7285c.m22838a(this.f52159a, C6778a.m20960a(), 0).edit();
            edit.putString("key_task_session", str);
            edit.apply();
        } catch (Throwable unused) {
        }
    }
}
