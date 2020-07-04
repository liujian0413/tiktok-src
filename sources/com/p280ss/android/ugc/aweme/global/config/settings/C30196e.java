package com.p280ss.android.ugc.aweme.global.config.settings;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.global.config.settings.C6925d.C6926a;
import com.p280ss.android.ugc.aweme.global.config.settings.SettingsUtil.C30191b;
import com.p280ss.android.ugc.aweme.global.config.settings._default.AVEnvSettingsGroup;
import com.p280ss.android.ugc.aweme.global.config.settings._default.AbstractSettingsGroup;
import com.p280ss.android.ugc.aweme.global.config.settings._default.LiveEnvSettingsGroup;
import com.p280ss.android.ugc.aweme.global.config.settings._default.SettingsGroup;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.e */
final class C30196e {

    /* renamed from: a */
    public IESSettingsProxy f79451a;

    /* renamed from: b */
    private final Object f79452b = new Object();

    /* renamed from: c */
    private final CopyOnWriteArrayList<C6925d> f79453c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private final C30198g f79454d = new C30198g();

    /* renamed from: e */
    private final IESSettings f79455e;

    /* renamed from: f */
    private C6600e f79456f;

    /* renamed from: a */
    public final IESSettings mo76679a() {
        return this.f79455e;
    }

    /* renamed from: b */
    public final C6600e mo76685b() {
        return this.f79456f;
    }

    /* renamed from: a */
    public final void mo76680a(C6925d dVar) {
        synchronized (this.f79452b) {
            this.f79453c.remove(dVar);
        }
    }

    C30196e(Application application) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(new AVEnvSettingsGroup());
        copyOnWriteArrayList.add(new SettingsGroup());
        copyOnWriteArrayList.add(new LiveEnvSettingsGroup());
        new C30190a();
        IESSettings a = C30190a.m98832a((List<AbstractSettingsGroup>) copyOnWriteArrayList);
        m98845a(a, (List<AbstractSettingsGroup>) copyOnWriteArrayList);
        this.f79455e = C30190a.m98830a(application, a);
        m98844a(this.f79455e);
    }

    /* renamed from: a */
    private void m98844a(IESSettings iESSettings) {
        synchronized (this.f79452b) {
            if (iESSettings == null) {
                try {
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                this.f79451a = new IESSettingsProxy(iESSettings, this.f79454d);
                Iterator it = this.f79453c.iterator();
                while (it.hasNext()) {
                    C6925d dVar = (C6925d) it.next();
                    dVar.change(this.f79451a);
                    if (dVar instanceof C6926a) {
                        this.f79453c.remove(dVar);
                    }
                }
                new Handler(Looper.getMainLooper()).post(C30197f.f79457a);
            }
        }
    }

    /* renamed from: a */
    public final void mo76684a(boolean z) {
        this.f79454d.mo76687a(z);
    }

    /* renamed from: a */
    private void m98845a(IESSettings iESSettings, List<AbstractSettingsGroup> list) {
        this.f79456f = new C30191b(iESSettings, list).f79444a;
    }

    /* renamed from: a */
    public final void mo76681a(C6925d dVar, boolean z) {
        synchronized (this.f79452b) {
            CopyOnWriteArrayList<C6925d> copyOnWriteArrayList = this.f79453c;
            if (z) {
                dVar = new C6926a(dVar);
            }
            copyOnWriteArrayList.add(dVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <T> void mo76682a(String str, Class<T> cls, T t) {
        this.f79454d.mo76688b(str, cls, t);
    }

    /* renamed from: a */
    public final void mo76683a(Throwable th, IESSettings iESSettings, String str) {
        if (th != null) {
            SettingsUtil.m98824a(th);
        }
        if (!TextUtils.isEmpty(str)) {
            SettingsUtil.m98825a(th, iESSettings, "SettingsManager", str);
        }
        m98844a(iESSettings);
    }
}
