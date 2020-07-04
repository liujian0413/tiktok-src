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

/* renamed from: com.bytedance.im.core.internal.queue.g */
final class C11393g implements C11387b, C11434a {

    /* renamed from: a */
    private C11433k f30865a;

    /* renamed from: b */
    private C11433k f30866b;

    /* renamed from: c */
    private C11433k f30867c;

    /* renamed from: d */
    private final ConcurrentLinkedQueue<C11391e> f30868d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    private C11391e f30869e;

    /* renamed from: f */
    private Map<Long, C11391e> f30870f = new ConcurrentHashMap();

    /* renamed from: b */
    private synchronized void m33539b() {
        if (this.f30868d != null) {
            this.f30868d.clear();
        }
        if (this.f30870f != null) {
            this.f30870f.clear();
        }
    }

    C11393g() {
        HandlerThread handlerThread = new HandlerThread("IM-CORE-QUEUE");
        handlerThread.start();
        this.f30865a = new C11433k(handlerThread.getLooper(), this);
        this.f30866b = new C11433k(handlerThread.getLooper(), this);
    }

    /* renamed from: d */
    private void m33545d() {
        if (!this.f30865a.hasMessages(103) && !this.f30868d.isEmpty()) {
            this.f30865a.sendEmptyMessageDelayed(103, (long) C11198c.m32777a().mo27248b().f30413m);
        }
    }

    /* renamed from: a */
    public final void mo27415a() {
        this.f30865a.removeMessages(BaseNotice.HASHTAG);
        this.f30865a.removeMessages(102);
        this.f30865a.removeMessages(103);
        this.f30865a.removeMessages(105);
        this.f30866b.removeMessages(102);
        this.f30865a.sendEmptyMessage(104);
    }

    /* renamed from: c */
    private void m33541c() {
        C11391e eVar;
        if (!this.f30868d.isEmpty()) {
            if (this.f30869e != null) {
                if (this.f30869e.mo27430f()) {
                    StringBuilder sb = new StringBuilder("request sendNextRequest timeout: ");
                    sb.append(this.f30869e.f30852a);
                    C11404d.m33591d(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f30869e.mo27428d());
                    C11209d.m32826a("im_ws_timeout", sb2.toString(), 1.0f);
                }
                eVar = this.f30869e;
            } else {
                eVar = (C11391e) this.f30868d.peek();
                this.f30869e = eVar;
                if (eVar != null) {
                    eVar.f30862k = SystemClock.uptimeMillis();
                    StringBuilder sb3 = new StringBuilder("request sendNextRequest ");
                    sb3.append(eVar.f30852a);
                    C11404d.m33582a(sb3.toString());
                }
            }
            if (eVar != null) {
                eVar.mo27425b();
                eVar.mo27426c();
                if (eVar.mo27429e()) {
                    m33547d(eVar);
                    return;
                }
                m33543c(eVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo27417a(C11433k kVar) {
        this.f30867c = kVar;
    }

    /* renamed from: f */
    private void m33549f(C11391e eVar) {
        if (this.f30867c != null) {
            Message obtain = Message.obtain(this.f30867c, eVar.mo27428d());
            obtain.obj = eVar;
            this.f30867c.sendMessage(obtain);
        }
    }

    /* renamed from: a */
    public final void mo27418a(Response response) {
        if (response != null) {
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.obj = response;
            obtain.arg1 = 1;
            this.f30866b.sendMessage(obtain);
        }
    }

    /* renamed from: b */
    private C11391e m33538b(Response response) {
        if (response == null) {
            return null;
        }
        Iterator it = this.f30868d.iterator();
        while (it.hasNext()) {
            C11391e eVar = (C11391e) it.next();
            if (eVar.f30857f != null && eVar.f30853b == response.sequence_id.longValue()) {
                return eVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    private void m33548e(C11391e eVar) {
        if (!this.f30868d.isEmpty()) {
            this.f30868d.remove(eVar);
            this.f30869e = null;
            m33549f(eVar);
            this.f30865a.removeMessages(103);
            if (!this.f30868d.isEmpty()) {
                m33541c();
            }
        }
    }

    /* renamed from: b */
    private void m33540b(Message message) {
        if (message.obj instanceof C11391e) {
            C11391e eVar = (C11391e) message.obj;
            this.f30868d.add(eVar);
            if (!this.f30865a.hasMessages(103) && (((C11391e) this.f30868d.peek()).f30852a == eVar.f30852a || (this.f30869e != null && this.f30869e.mo27430f()))) {
                this.f30865a.sendEmptyMessage(103);
            }
        }
    }

    /* renamed from: c */
    private static boolean m33544c(Response response) {
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

    /* renamed from: d */
    private void m33546d(Message message) {
        long longValue = ((Long) message.obj).longValue();
        if (!this.f30870f.isEmpty() && this.f30870f.containsKey(Long.valueOf(longValue))) {
            mo27416a((C11391e) this.f30870f.get(Long.valueOf(longValue)));
            this.f30870f.remove(Long.valueOf(longValue));
        }
    }

    /* renamed from: a */
    public final void mo27309a(Message message) {
        switch (message.what) {
            case BaseNotice.HASHTAG /*101*/:
                m33540b(message);
                return;
            case 102:
                m33542c(message);
                return;
            case 103:
                m33541c();
                return;
            case 104:
                m33539b();
                return;
            case 105:
                m33546d(message);
                break;
        }
    }

    /* renamed from: d */
    private void m33547d(C11391e eVar) {
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
        C11381b bVar = a.f30837a;
        final long currentTimeMillis = System.currentTimeMillis();
        C11193a aVar = C11198c.m32777a().f30372b;
        final C11391e eVar2 = eVar;
        final C11381b bVar2 = bVar;
        C113941 r2 = new C11380a() {
            /* renamed from: a */
            public final void mo27405a(C11384c cVar, String str, String str2, int i) {
                C11384c cVar2 = cVar;
                eVar2.mo27423a(cVar);
                C11393g.this.mo27437b(eVar2);
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
                C11393g.this.mo27437b(eVar2);
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
            this.f30865a.sendMessage(obtain);
        }
    }

    /* renamed from: b */
    public final void mo27437b(C11391e eVar) {
        if (eVar != null) {
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.obj = eVar;
            obtain.arg1 = 2;
            this.f30865a.sendMessage(obtain);
        }
    }

    /* renamed from: c */
    private void m33542c(Message message) {
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
        if (m33544c(response)) {
            C11391e b = C11391e.m33519b(response);
            if (b != null) {
                StringBuilder sb = new StringBuilder("On Get Notify By WS: ");
                sb.append(response.cmd);
                C11429g.m33683a(sb.toString(), response);
                m33549f(b);
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
                eVar = m33538b(response);
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
                m33548e(eVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo27419a(List<Long> list) {
        if (list != null && !list.isEmpty() && !this.f30868d.isEmpty()) {
            for (Long l : list) {
                Iterator it = this.f30868d.iterator();
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

    /* renamed from: c */
    private void m33543c(C11391e eVar) {
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
            m33545d();
        } catch (CoderException e) {
            if (e.getErrorCode() == -2004) {
                eVar.f30854c = true;
                m33547d(eVar);
            } else {
                eVar.f30860i = e.getErrorCode();
                m33548e(eVar);
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
}
