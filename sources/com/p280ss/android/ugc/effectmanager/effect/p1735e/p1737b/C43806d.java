package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.C43743j;
import com.p280ss.android.ugc.effectmanager.common.C43743j.C43744a;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43719a;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43787d;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43788e;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.d */
public final class C43806d extends C43727d implements C43744a {

    /* renamed from: a */
    private static Field f113346a;

    /* renamed from: b */
    private C43719a f113347b;

    /* renamed from: g */
    private C43680a f113348g;

    /* renamed from: h */
    private C43834g f113349h = this.f113348g.f113068a;

    /* renamed from: i */
    private Queue<Effect> f113350i;

    /* renamed from: j */
    private List<Effect> f113351j;

    /* renamed from: k */
    private Handler f113352k;

    /* renamed from: l */
    private DownloadEffectExtra f113353l;

    /* renamed from: a */
    public final void mo105685a() {
        Looper.prepare();
        Looper myLooper = Looper.myLooper();
        try {
            this.f113352k = new C43743j(myLooper, this);
            Effect effect = (Effect) this.f113350i.poll();
            if (effect != null) {
                m138729b(effect);
                Looper.loop();
            }
        } catch (Throwable th) {
            myLooper.quit();
            m138728a(Thread.currentThread());
            throw th;
        }
        myLooper.quit();
        m138728a(Thread.currentThread());
    }

    /* renamed from: b */
    private void m138729b(final Effect effect) {
        this.f113352k.post(new Runnable() {
            public final void run() {
                C43806d.this.mo105842a(effect);
            }
        });
    }

    /* renamed from: a */
    private static void m138728a(Thread thread) {
        Field field;
        try {
            if (f113346a != null) {
                field = f113346a;
            } else {
                if (VERSION.SDK_INT >= 24) {
                    field = Thread.class.getDeclaredField("threadLocals");
                } else {
                    field = Thread.class.getDeclaredField("localValues");
                }
                f113346a = field;
            }
            field.setAccessible(true);
            field.set(thread, null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo105789a(Message message) {
        if (message.what == 15) {
            C43788e eVar = (C43788e) message.obj;
            Effect effect = eVar.f113292b;
            C43726c cVar = eVar.f113293c;
            if (cVar != null) {
                mo105769a(17, new C43787d(this.f113351j, cVar));
                Looper.myLooper().quit();
                return;
            }
            this.f113351j.add(effect);
            if (!this.f113350i.isEmpty()) {
                m138729b((Effect) this.f113350i.poll());
            } else {
                mo105769a(17, new C43787d(this.f113351j, null));
                Looper.myLooper().quit();
            }
        }
    }

    /* renamed from: a */
    public final void mo105842a(Effect effect) {
        if (TextUtils.isEmpty(effect.getZipPath()) || TextUtils.isEmpty(effect.getUnzipPath())) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f113349h.f113519j);
            sb.append(File.separator);
            sb.append(effect.getId());
            sb.append(".zip");
            effect.setZipPath(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f113349h.f113519j);
            sb2.append(File.separator);
            sb2.append(effect.getId());
            effect.setUnzipPath(sb2.toString());
        }
        if (!this.f113347b.mo105737d(effect.getId())) {
            try {
                C43808e eVar = new C43808e(effect, this.f113348g, this.f113227d, this.f113352k, this.f113353l);
                eVar.mo105685a();
            } catch (RuntimeException e) {
                throw e;
            }
        } else {
            C43788e eVar2 = new C43788e(effect, null);
            Message obtainMessage = this.f113352k.obtainMessage(15);
            obtainMessage.obj = eVar2;
            obtainMessage.sendToTarget();
        }
    }

    public C43806d(C43680a aVar, List<Effect> list, String str, Handler handler, DownloadEffectExtra downloadEffectExtra) {
        super(handler, str, "NETWORK");
        this.f113348g = aVar;
        this.f113347b = aVar.f113068a.f113528s;
        this.f113350i = new ArrayDeque(list);
        this.f113351j = new ArrayList();
        this.f113353l = downloadEffectExtra;
    }
}
