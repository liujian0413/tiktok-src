package com.bytedance.android.livesdk.chatroom.presenter;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.C4229a;
import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.model.C4883ap;
import com.bytedance.android.livesdk.chatroom.model.DecorationTextAuditResult;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.message.model.C8540cb;
import com.bytedance.android.livesdk.message.model.C8693x;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9079q;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.C9379p;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.google.gson.p277b.C6597a;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.m */
public class C5029m extends C5017ci<C5032a> implements C6310a, OnMessageListener {

    /* renamed from: b */
    private static final String f14301b = "m";

    /* renamed from: a */
    public boolean f14302a;

    /* renamed from: c */
    private C6309f f14303c = new C6309f(this);

    /* renamed from: d */
    private boolean f14304d;

    /* renamed from: e */
    private long f14305e;

    /* renamed from: f */
    private long f14306f;

    /* renamed from: i */
    private String f14307i;

    /* renamed from: j */
    private String f14308j;

    /* renamed from: k */
    private int f14309k = ((Integer) C5864b.f17258M.mo10240a()).intValue();

    /* renamed from: l */
    private int f14310l;

    /* renamed from: m */
    private boolean f14311m = true;

    /* renamed from: n */
    private C4229a f14312n;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.m$a */
    public interface C5032a extends C5595at {
        /* renamed from: a */
        void mo13056a();

        /* renamed from: a */
        void mo13057a(C4883ap apVar);

        /* renamed from: a */
        void mo13058a(String str);

        /* renamed from: a */
        void mo13059a(List<C9379p> list);

        /* renamed from: b */
        void mo13060b();

        /* renamed from: b */
        void mo13061b(String str);

        /* renamed from: b */
        void mo13062b(List<C9379p> list);

        /* renamed from: c */
        int[] mo13063c();
    }

    /* renamed from: a */
    public final void mo13051a(String str) {
        if (mo13055b() && !TextUtils.isEmpty(str) && !this.f14302a) {
            this.f14308j = str;
            this.f14302a = true;
            C4275g.m14449a((Handler) this.f14303c, this.f14305e, TTLiveSDKContext.getHostService().mo22367h().mo22179b(), str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13052a(Throwable th) throws Exception {
        this.f14312n.mo11786a(1, th.getMessage());
        m16130a((C4883ap) null);
    }

    /* renamed from: b */
    public final boolean mo13055b() {
        if (this.f14310l < this.f14309k) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m16135e() {
        this.f14312n.mo11785a();
        ((DecorationApi) C3458e.m12798a().mo10440a(DecorationApi.class)).getRoomDecorationList().mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C5034o<Object>(this), (C7326g<? super Throwable>) new C5035p<Object>(this));
    }

    /* renamed from: d */
    private List<C9379p> m16134d() {
        long longValue = ((Long) C8946b.f24381aF.mo22117a()).longValue();
        if (longValue != this.f14306f || longValue == 0) {
            C8946b.f24381aF.mo22118a(Long.valueOf(0));
            C8946b.f24382aG.mo22118a("");
            C8946b.f24379aD.mo22118a("");
            C8946b.f24380aE.mo22118a(Integer.valueOf(31));
            return null;
        }
        String str = (String) C8946b.f24382aG.mo22117a();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            List<C9379p> list = (List) C9178j.m27302j().mo22372a().mo15975a(str, new C6597a<List<C9379p>>() {
            }.type);
            if (!C6311g.m19573a(list)) {
                int[] c = ((C5032a) mo9140c()).mo13063c();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C9379p pVar = (C9379p) it.next();
                    if (pVar.f25756k != c[0] || pVar.f25757l != c[1]) {
                        it.remove();
                    }
                }
            }
            return list;
        } catch (Exception unused) {
            C8946b.f24382aG.mo22118a("");
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13049a(C3479d dVar) throws Exception {
        this.f14312n.mo11787b();
        m16130a((C4883ap) dVar.data);
    }

    /* renamed from: a */
    private static C9379p m16127a(List<C9379p> list) {
        if (list != null && list.size() > 0) {
            for (C9379p pVar : list) {
                if (pVar.f25759n == 1) {
                    return pVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m16128a(int i) {
        Context context = TTLiveSDKContext.getHostService().mo22360a().context();
        if (context == null) {
            return "";
        }
        String string = context.getString(i);
        if (TextUtils.isEmpty(string)) {
            string = "";
        }
        return string;
    }

    /* renamed from: b */
    private void m16132b(C4883ap apVar) {
        this.f14307i = (String) C8946b.f24379aD.mo22117a();
        m16133c(apVar);
        if (!TextUtils.isEmpty(this.f14307i) && ((Integer) C8946b.f24380aE.mo22117a()).intValue() != 33) {
            this.f14311m = false;
            mo13051a(this.f14307i);
        }
    }

    /* renamed from: a */
    private void m16130a(C4883ap apVar) {
        if (mo9140c() != null) {
            ((C5032a) mo9140c()).mo13057a(apVar);
            m16132b(apVar);
        }
    }

    /* renamed from: c */
    private void m16133c(C4883ap apVar) {
        List d = m16134d();
        if (apVar != null) {
            C9379p a = m16127a(apVar.f13991a);
            C9379p a2 = m16127a(apVar.f13992b);
            if (!(a == null && a2 == null)) {
                if (d == null) {
                    d = new ArrayList();
                }
                if (a != null && !m16131a(d, a)) {
                    d.add(a);
                }
                if (a2 != null && !m16131a(d, a2)) {
                    d.add(a2);
                }
            }
        }
        if (d != null && d.size() > 0) {
            ((C5032a) mo9140c()).mo13062b(d);
        }
    }

    /* renamed from: b */
    public final void mo13053b(String str) {
        ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).setDecoration(this.f14305e, new C9079q().mo22259a("deco_list", String.valueOf(str)).f24734a).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a(C3303k.m12378c(), (C7326g<? super Throwable>) new C5033n<Object>(this));
    }

    public void handleMsg(Message message) {
        if (message != null && mo9140c() != null) {
            if (26 == message.what) {
                this.f14302a = false;
            }
            if (26 == message.what) {
                if (message.obj instanceof DecorationTextAuditResult) {
                    m16129a((DecorationTextAuditResult) message.obj);
                } else if (message.obj instanceof ApiServerException) {
                    ((C5032a) mo9140c()).mo13058a(((ApiServerException) message.obj).getPrompt());
                } else {
                    ((C5032a) mo9140c()).mo13058a(m16128a((int) R.string.ehw));
                }
            }
        }
    }

    public void onMessage(IMessage iMessage) {
        C8538c cVar = (C8538c) iMessage;
        switch (cVar.getMessageType()) {
            case REMIND:
                C8540cb cbVar = (C8540cb) iMessage;
                if (cbVar.f23495b == 1 && mo9140c() != null) {
                    this.f14307i = "";
                    C8946b.f24380aE.mo22118a(Integer.valueOf(31));
                    C8946b.f24379aD.mo22118a("");
                    ((C5032a) mo9140c()).mo13060b();
                    ((C5032a) mo9140c()).mo13058a(cbVar.f23494a);
                    return;
                }
            case MODIFY_DECORATION:
                if (mo9140c() != null) {
                    ((C5032a) mo9140c()).mo13059a(((C8693x) iMessage).mo21693a());
                    break;
                } else {
                    return;
                }
        }
    }

    /* renamed from: a */
    private void m16129a(DecorationTextAuditResult decorationTextAuditResult) {
        if (mo9140c() != null && decorationTextAuditResult != null) {
            if (31 == decorationTextAuditResult.getAuditStatus()) {
                this.f14307i = "";
                C8946b.f24380aE.mo22118a(Integer.valueOf(31));
                C8946b.f24379aD.mo22118a("");
                ((C5032a) mo9140c()).mo13060b();
                String auditNotPassWarnText = decorationTextAuditResult.getAuditNotPassWarnText();
                if (TextUtils.isEmpty(auditNotPassWarnText)) {
                    auditNotPassWarnText = m16128a((int) R.string.ehv);
                }
                ((C5032a) mo9140c()).mo13058a(auditNotPassWarnText);
                this.f14311m = true;
                return;
            }
            if (this.f14311m) {
                this.f14310l++;
                this.f14307i = this.f14308j;
                ((C5032a) mo9140c()).mo13061b(this.f14307i);
                ((C5032a) mo9140c()).mo13056a();
            } else {
                this.f14311m = true;
            }
            C8946b.f24380aE.mo22118a(Integer.valueOf(decorationTextAuditResult.getAuditStatus()));
            C8946b.f24379aD.mo22118a(this.f14307i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13054b(Throwable th) throws Exception {
        if (th instanceof Exception) {
            String str = null;
            if (th instanceof ApiServerException) {
                str = ((ApiServerException) th).getPrompt();
            }
            if (TextUtils.isEmpty(str)) {
                str = m16128a((int) R.string.ehu);
            }
            if (mo9140c() != null) {
                ((C5032a) mo9140c()).mo13058a(str);
            }
        }
    }

    /* renamed from: a */
    public final String mo13048a(C9379p pVar) {
        if (!TextUtils.isEmpty(this.f14307i)) {
            return this.f14307i;
        }
        if (pVar != null) {
            return pVar.f25749d;
        }
        return "";
    }

    /* renamed from: a */
    public final void mo9142a(C5032a aVar) {
        super.mo9142a(aVar);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.MODIFY_DECORATION.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.REMIND.getIntType(), this);
        }
        if (this.f14304d) {
            m16135e();
        }
    }

    /* renamed from: a */
    private static boolean m16131a(List<C9379p> list, C9379p pVar) {
        if (!(pVar == null || list == null || list.size() <= 0)) {
            for (C9379p pVar2 : list) {
                if (pVar.f25753h == pVar2.f25753h) {
                    return true;
                }
            }
        }
        return false;
    }

    public C5029m(long j, long j2, boolean z) {
        this.f14305e = j;
        this.f14306f = j2;
        this.f14304d = z;
        this.f14312n = new C4229a();
    }
}
