package com.bytedance.p263im.core.internal.queue;

import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.p263im.core.internal.queue.p597a.C11380a;
import com.bytedance.p263im.core.internal.queue.p597a.C11381b;
import com.bytedance.p263im.core.internal.queue.p597a.C11381b.C11383a;
import com.bytedance.p263im.core.internal.queue.p597a.C11384c;
import com.bytedance.p263im.core.internal.utils.C11403c;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.internal.utils.C11429g;
import com.bytedance.p263im.core.internal.utils.C11433k;
import com.bytedance.p263im.core.internal.utils.C11433k.C11434a;
import com.bytedance.p263im.core.p584a.C11193a;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p586b.C11208c;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.Request;
import com.bytedance.p263im.core.proto.Response;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.queue.c */
final class C11388c implements C11387b, C11434a {

    /* renamed from: a */
    private C11433k f30843a;

    /* renamed from: b */
    private C11433k f30844b;

    /* renamed from: c */
    private C11433k f30845c;

    /* renamed from: d */
    private final ConcurrentLinkedQueue<C11391e> f30846d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    private Map<Long, C11391e> f30847e = new ConcurrentHashMap();

    /* renamed from: b */
    private synchronized void m33492b() {
        if (this.f30846d != null) {
            this.f30846d.clear();
        }
        if (this.f30847e != null) {
            this.f30847e.clear();
        }
    }

    C11388c() {
        HandlerThread handlerThread = new HandlerThread("IM-CORE-QUEUE");
        handlerThread.start();
        this.f30843a = new C11433k(handlerThread.getLooper(), this);
        this.f30844b = new C11433k(handlerThread.getLooper(), this);
    }

    /* renamed from: a */
    public final void mo27415a() {
        this.f30843a.removeMessages(BaseNotice.HASHTAG);
        this.f30844b.removeMessages(102);
        this.f30843a.removeMessages(103);
        this.f30843a.removeMessages(105);
        this.f30843a.sendEmptyMessage(104);
    }

    /* renamed from: a */
    public final void mo27417a(C11433k kVar) {
        this.f30845c = kVar;
    }

    /* renamed from: e */
    private void m33499e(Message message) {
        C11391e eVar = (C11391e) message.obj;
        if (!this.f30846d.isEmpty() && this.f30846d.contains(eVar)) {
            mo27416a(eVar);
        }
    }

    /* renamed from: f */
    private void m33501f(C11391e eVar) {
        if (!this.f30846d.isEmpty()) {
            this.f30846d.remove(eVar);
            m33502g(eVar);
        }
    }

    /* renamed from: g */
    private void m33502g(C11391e eVar) {
        if (this.f30845c != null) {
            Message obtain = Message.obtain(this.f30845c, eVar.mo27428d());
            obtain.obj = eVar;
            this.f30845c.sendMessage(obtain);
        }
    }

    /* renamed from: a */
    public final void mo27418a(Response response) {
        if (response != null) {
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.obj = response;
            obtain.arg1 = 1;
            this.f30844b.sendMessage(obtain);
        }
    }

    /* renamed from: b */
    private C11391e m33491b(Response response) {
        if (response == null) {
            return null;
        }
        Iterator it = this.f30846d.iterator();
        while (it.hasNext()) {
            C11391e eVar = (C11391e) it.next();
            if (eVar.f30857f != null && eVar.f30853b == response.sequence_id.longValue()) {
                return eVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m33494c(Message message) {
        if (message.obj instanceof C11391e) {
            C11391e eVar = (C11391e) message.obj;
            eVar.f30862k = SystemClock.uptimeMillis();
            eVar.mo27425b();
            StringBuilder sb = new StringBuilder("request sendNextRequest ");
            sb.append(eVar.f30852a);
            C11404d.m33582a(sb.toString());
            if (eVar.mo27429e()) {
                m33498d(eVar);
            } else {
                m33495c(eVar);
            }
        }
    }

    /* renamed from: d */
    private void m33497d(Message message) {
        long longValue = ((Long) message.obj).longValue();
        if (!this.f30847e.isEmpty() && this.f30847e.containsKey(Long.valueOf(longValue))) {
            mo27416a((C11391e) this.f30847e.get(Long.valueOf(longValue)));
            this.f30847e.remove(Long.valueOf(longValue));
        }
    }

    /* renamed from: e */
    private void m33500e(C11391e eVar) {
        this.f30846d.add(eVar);
        Message obtain = Message.obtain();
        obtain.what = 103;
        obtain.obj = eVar;
        this.f30843a.sendMessageDelayed(obtain, (long) C11198c.m32777a().mo27248b().f30413m);
    }

    /* renamed from: c */
    private static boolean m33496c(Response response) {
        int[] iArr;
        if (response == null) {
            return false;
        }
        for (int i : C11198c.m32777a().mo27248b().f30415o) {
            if (response.inbox_type == null || i == response.inbox_type.intValue()) {
                return true;
            }
        }
        int[] iArr2 = C11198c.m32777a().mo27248b().f30416p;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                if (response.inbox_type == null || i2 == response.inbox_type.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo27309a(Message message) {
        switch (message.what) {
            case BaseNotice.HASHTAG /*101*/:
                m33494c(message);
                return;
            case 102:
                m33493b(message);
                return;
            case 103:
                m33499e(message);
                return;
            case 104:
                m33492b();
                return;
            case 105:
                m33497d(message);
                break;
        }
    }

    /* renamed from: b */
    public final void mo27420b(C11391e eVar) {
        if (eVar != null) {
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.obj = eVar;
            obtain.arg1 = 2;
            this.f30844b.sendMessage(obtain);
        }
    }

    /* renamed from: c */
    private void m33495c(C11391e eVar) {
        try {
            Request request = eVar.f30857f;
            StringBuilder sb = new StringBuilder("Start Send Request By WS: cmd:");
            sb.append(request.cmd);
            sb.append("sequenceId=");
            sb.append(request.sequence_id);
            sb.append(",path=");
            sb.append(C11395h.m33559a(request.cmd.intValue()));
            C11429g.m33683a(sb.toString(), request);
            Pair a = C11392f.m33536a(request);
            C11198c.m32777a().f30372b.mo27232a(request.cmd.intValue(), request.sequence_id.longValue(), (String) a.first, (byte[]) a.second);
            eVar.mo27421a();
            m33500e(eVar);
        } catch (CoderException e) {
            if (e.getErrorCode() == -2004) {
                eVar.f30854c = true;
                m33498d(eVar);
            } else {
                eVar.f30860i = e.getErrorCode();
                m33501f(eVar);
                StringBuilder sb2 = new StringBuilder("sendByWs cmd:");
                sb2.append(eVar.mo27428d());
                C11404d.m33585a(sb2.toString(), (Throwable) e);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(eVar.mo27428d());
                C11209d.m32826a("im_pb_encode_error", sb3.toString(), 1.0f);
            }
            C11208c.m32815a().mo27256a("network").mo27258b("ws").mo27257a("duration", Long.valueOf(SystemClock.uptimeMillis() - eVar.f30862k)).mo27257a("error", e).mo27257a("error_stack", C11209d.m32831b(e)).mo27257a("cmd", Integer.valueOf(eVar.mo27428d())).mo27260b();
        }
    }

    /* renamed from: d */
    private void m33498d(C11391e eVar) {
        Request request = eVar.f30857f;
        StringBuilder sb = new StringBuilder("Start Send Request By HTTP: cmd:");
        sb.append(request.cmd);
        sb.append("sequenceId=");
        sb.append(request.sequence_id);
        sb.append(",path=");
        sb.append(C11395h.m33559a(request.cmd.intValue()));
        C11429g.m33683a(sb.toString(), request);
        C11383a a = new C11383a().mo27408a(C11395h.m33559a(request.cmd.intValue()));
        if (C11198c.m32777a().mo27248b().f30411k == 0) {
            a.mo27410b("application/x-protobuf");
            if (C11198c.m32777a().mo27248b().f30418r == 0) {
                a.mo27409a(request.encode());
            } else {
                a.mo27407a(request);
            }
        } else {
            a.mo27410b("application/json");
            if (C11198c.m32777a().mo27248b().f30418r == 0) {
                a.mo27409a(C11403c.f30887a.mo15979b((Object) request).getBytes());
            } else {
                a.mo27407a(request);
            }
        }
        this.f30846d.add(eVar);
        C11381b bVar = a.f30837a;
        final long currentTimeMillis = System.currentTimeMillis();
        C11193a aVar = C11198c.m32777a().f30372b;
        final C11391e eVar2 = eVar;
        final C11381b bVar2 = bVar;
        C113891 r2 = new C11380a() {
            /* renamed from: a */
            public final void mo27405a(C11384c cVar, String str, String str2, int i) {
                C11384c cVar2 = cVar;
                eVar2.mo27423a(cVar);
                C11388c.this.mo27420b(eVar2);
                long uptimeMillis = SystemClock.uptimeMillis();
                C11209d.m32822a(uptimeMillis - eVar2.f30862k, currentTimeMillis, bVar2.f30833a, str, str2, C34943c.f91127w, null);
                C11208c.m32815a().mo27256a("network").mo27258b(WebKitApi.SCHEME_HTTP).mo27257a("duration", Long.valueOf(uptimeMillis - eVar2.f30862k)).mo27257a("cmd", Integer.valueOf(eVar2.mo27428d())).mo27257a("url", bVar2.f30833a).mo27257a("success", Integer.valueOf(1)).mo27260b();
            }

            /* renamed from: a */
            public final void mo27406a(Exception exc, String str, String str2, int i) {
                String str3;
                Exception exc2 = exc;
                C11391e eVar = eVar2;
                if (exc2 == null) {
                    str3 = "";
                } else {
                    str3 = exc.getMessage();
                }
                eVar.mo27422a(-1000, str3);
                C11198c.m32777a();
                C11388c.this.mo27420b(eVar2);
                StringBuilder sb = new StringBuilder("sendByHttp cmd:");
                sb.append(eVar2.mo27428d());
                sb.append(" url:");
                sb.append(bVar2.f30833a);
                C11404d.m33585a(sb.toString(), (Throwable) exc2);
                long uptimeMillis = SystemClock.uptimeMillis();
                C11209d.m32832b(uptimeMillis - eVar2.f30862k, currentTimeMillis, bVar2.f30833a, str, str2, -1000, null);
                C11208c.m32815a().mo27256a("network").mo27258b(WebKitApi.SCHEME_HTTP).mo27257a("duration", Long.valueOf(uptimeMillis - eVar2.f30862k)).mo27257a("error", exc2).mo27257a("error_stack", C11209d.m32831b(exc)).mo27257a("cmd", Integer.valueOf(eVar2.mo27428d())).mo27257a("url", bVar2.f30833a).mo27257a("success", Integer.valueOf(0)).mo27260b();
            }
        };
        aVar.mo27233a(bVar, r2);
    }

    /* renamed from: a */
    public final void mo27416a(C11391e eVar) {
        if (eVar != null && eVar.f30857f != null && eVar.f30857f.cmd.intValue() > IMCMD.IMCMD_NOT_USED.getValue()) {
            Message obtain = Message.obtain();
            obtain.what = BaseNotice.HASHTAG;
            obtain.obj = eVar;
            this.f30843a.sendMessage(obtain);
        }
    }

    /* renamed from: b */
    private void m33493b(Message message) {
        C11391e eVar;
        Response response;
        String str;
        if (message.obj instanceof Response) {
            response = (Response) message.obj;
            eVar = null;
        } else if (message.obj instanceof C11391e) {
            C11391e eVar2 = (C11391e) message.obj;
            eVar = eVar2;
            response = eVar2.f30858g;
        } else {
            response = null;
            eVar = null;
        }
        if (m33496c(response)) {
            C11391e b = C11391e.m33519b(response);
            if (b != null) {
                StringBuilder sb = new StringBuilder("On Get Notify By WS: ");
                sb.append(response.cmd);
                C11429g.m33683a(sb.toString(), response);
                m33502g(b);
                return;
            }
            StringBuilder sb2 = new StringBuilder("On Get Response By NetType (");
            if (message.arg1 == 2) {
                str = "HTTP";
            } else {
                str = "WS";
            }
            sb2.append(str);
            sb2.append("): cmd:");
            sb2.append(response.cmd);
            sb2.append("sequence_id=");
            sb2.append(response.sequence_id);
            sb2.append(",path=");
            sb2.append(C11395h.m33559a(response.cmd.intValue()));
            C11429g.m33683a(sb2.toString(), response);
            if (eVar == null) {
                eVar = m33491b(response);
                if (eVar != null) {
                    StringBuilder sb3 = new StringBuilder("find local waiting request item sequence_id: ");
                    sb3.append(eVar.f30853b);
                    C11404d.m33582a(sb3.toString());
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", SystemClock.uptimeMillis() - eVar.f30862k);
                        jSONObject.put("retry", eVar.f30863l - 1);
                    } catch (JSONException unused) {
                    }
                    C11209d.m32830a("im_ws_duration", jSONObject, (JSONObject) null);
                    C11208c.m32815a().mo27256a("network").mo27258b("ws").mo27257a("duration", Long.valueOf(SystemClock.uptimeMillis() - eVar.f30862k)).mo27257a("cmd", Integer.valueOf(eVar.mo27428d())).mo27257a("retry", Integer.valueOf(eVar.f30863l - 1)).mo27260b();
                }
            }
            if (eVar != null) {
                eVar.mo27424a(response);
                m33501f(eVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo27419a(List<Long> list) {
        if (list != null && !list.isEmpty() && !this.f30846d.isEmpty()) {
            for (Long l : list) {
                Iterator it = this.f30846d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C11391e eVar = (C11391e) it.next();
                    if (l.longValue() == eVar.f30852a) {
                        eVar.f30855d = null;
                        break;
                    }
                }
            }
        }
    }
}
