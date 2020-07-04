package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0053p;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.bytedance.android.livesdk.chatroom.model.C4902e;
import com.bytedance.android.livesdk.chatroom.model.C4902e.C4903a;
import com.bytedance.android.livesdk.chatroom.p204a.p205a.C4232a;
import com.bytedance.android.livesdk.chatroom.p204a.p206b.C4236a;
import com.bytedance.android.livesdk.chatroom.p204a.p207c.C4241a;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8548cj;
import com.bytedance.android.livesdk.message.model.C8695y;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdk.utils.p426b.C9058c;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.ugc.live.barrage.p1824a.C46187a;
import com.p280ss.ugc.live.barrage.p1825b.C46198a;
import com.p280ss.ugc.live.barrage.p1825b.C46198a.C46200a;
import com.p280ss.ugc.live.barrage.p1825b.C46204b;
import com.p280ss.ugc.live.barrage.p1825b.C46205c;
import com.p280ss.ugc.live.barrage.view.BarrageLayout;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

public class BarrageWidget extends LiveRecyclableWidget implements C0053p<KVData>, C5595at, OnMessageListener {

    /* renamed from: f */
    private static final TypedArray f15684f;

    /* renamed from: g */
    private static final Bitmap[] f15685g;

    /* renamed from: a */
    public int f15686a = 0;

    /* renamed from: b */
    public boolean f15687b = false;

    /* renamed from: c */
    public String f15688c;

    /* renamed from: d */
    public Room f15689d;

    /* renamed from: e */
    public String f15690e = null;

    /* renamed from: h */
    private final List<Bitmap> f15691h = new ArrayList();

    /* renamed from: i */
    private final Random f15692i = new Random();

    /* renamed from: j */
    private final List<C8548cj> f15693j = new CopyOnWriteArrayList();

    /* renamed from: k */
    private IMessageManager f15694k;

    /* renamed from: l */
    private C46198a f15695l;

    /* renamed from: m */
    private C4236a f15696m;

    /* renamed from: n */
    private BarrageLayout f15697n;

    /* renamed from: o */
    private BarrageLayout f15698o;

    /* renamed from: p */
    private boolean f15699p;

    /* renamed from: q */
    private Runnable f15700q = new Runnable() {
        public final void run() {
            if (BarrageWidget.this.isViewValid()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("live_source", BarrageWidget.this.f15688c);
                    jSONObject.put("request_id", BarrageWidget.this.f15689d.getRequestId());
                    jSONObject.put("log_pb", BarrageWidget.this.f15689d.getLog_pb());
                    jSONObject.put("source", BarrageWidget.this.f15689d.getUserFrom());
                } catch (JSONException unused) {
                }
                C8443c.m25663a().mo21607a("like", new C8438j().mo21599b("live_interact"), Room.class);
                if (BarrageWidget.this.f15689d != null && !BarrageWidget.this.f15689d.isOfficial()) {
                    C4275g.m14444a((Handler) null, BarrageWidget.this.f15689d.getId(), BarrageWidget.this.f15686a, (int) AdError.SERVER_ERROR_CODE, BarrageWidget.this.f15689d.getLabels(), BarrageWidget.this.f15690e);
                }
                BarrageWidget.this.f15690e = null;
                BarrageWidget.this.f15686a = 0;
                BarrageWidget.this.f15687b = false;
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.BarrageWidget$3 */
    static /* synthetic */ class C53803 {

        /* renamed from: a */
        static final /* synthetic */ int[] f15703a = new int[MessageType.values().length];

        static {
            try {
                f15703a[MessageType.DIGG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    interface BarrageResourceApi {
        @C6457h(mo15740a = "/webcast/room/digg/icon/list/")
        C7492s<C3479d<C4902e>> fetchResource(@C6474y(mo15757a = "room_id") long j);
    }

    public int getLayoutId() {
        return R.layout.atr;
    }

    /* renamed from: e */
    public final String mo9125e() {
        return getClass().getName();
    }

    static {
        TypedArray obtainTypedArray = C3358ac.m12513a().obtainTypedArray(R.array.ah);
        f15684f = obtainTypedArray;
        f15685g = new Bitmap[obtainTypedArray.length()];
    }

    public void onClear() {
        Bitmap[] bitmapArr;
        super.onClear();
        for (Bitmap bitmap : f15685g) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }

    /* renamed from: b */
    private void m17119b() {
        ((C9057b) ((BarrageResourceApi) C9178j.m27302j().mo22373b().mo10440a(BarrageResourceApi.class)).fetchResource(this.f15689d.getId()).mo19304b(C7333a.m23044b()).mo19297a((C7494t<T, ? extends R>) C9058c.m27059a())).mo22249a(2).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C5602b<Object>(this), C5629c.f16700a);
    }

    /* renamed from: a */
    public final void mo13672a() {
        int i;
        if (isViewValid() && this.f15698o != null && this.f15695l != null && this.f15695l.mo11801b() < 10 && !this.f15693j.isEmpty()) {
            C8548cj cjVar = (C8548cj) this.f15693j.remove(0);
            boolean a = C3519c.m12965a(this.context);
            LayoutInflater from = LayoutInflater.from(this.context);
            if (a) {
                i = R.layout.atp;
            } else {
                i = R.layout.ato;
            }
            this.f15695l.mo114146a((C46187a) new C4241a(from.inflate(i, null), cjVar, this).f12392b, cjVar.mo21674a());
        }
    }

    public void onUnload() {
        this.dataCenter.removeObserver(this);
        if (this.f15694k != null) {
            this.f15694k.removeMessageListener(this);
        }
        if (this.f15698o != null) {
            this.f15698o.mo114156a();
        }
        if (this.f15698o != null) {
            this.f15697n.mo114156a();
        }
        this.f15686a = 0;
        this.f15687b = false;
        this.f15693j.clear();
        this.f15699p = false;
        for (Bitmap bitmap : this.f15691h) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        this.f15691h.clear();
    }

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C3166a.m11961b(mo9125e(), th.toString());
    }

    public void onLoad(Object... objArr) {
        this.f15694k = (IMessageManager) this.dataCenter.get("data_message_manager");
        if (this.f15694k != null) {
            this.f15694k.addMessageListener(MessageType.DIGG.getIntType(), this);
        }
        this.dataCenter.observe("data_screen_message", this);
        this.dataCenter.observe("data_xt_landscape_tab_change", this);
        m17119b();
    }

    public void onMessage(IMessage iMessage) {
        if (isViewValid() && (iMessage instanceof C8695y)) {
            C8695y yVar = (C8695y) iMessage;
            if (!yVar.mo21694b() && C53803.f15703a[yVar.getMessageType().ordinal()] == 1) {
                mo13674a(true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -2104158356) {
                if (hashCode == -369217431 && key.equals("data_screen_message")) {
                    c = 0;
                }
            } else if (key.equals("data_xt_landscape_tab_change")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    C8548cj cjVar = (C8548cj) kVData.getData();
                    if (this.f15693j.size() >= 200) {
                        Iterator it = this.f15693j.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C8548cj cjVar2 = (C8548cj) it.next();
                                if (!cjVar2.mo21674a()) {
                                    this.f15693j.remove(cjVar2);
                                }
                            }
                        }
                    }
                    if (this.f15693j.size() >= 200) {
                        this.f15693j.remove(this.f15693j.size() - 1);
                    }
                    if (cjVar.mo21674a()) {
                        this.f15693j.add(0, cjVar);
                    } else {
                        this.f15693j.add(cjVar);
                    }
                    mo13672a();
                    return;
                case 1:
                    if (((Integer) kVData.getData()).intValue() == 0) {
                        C9738o.m28712b(this.contentView, 0);
                        break;
                    } else {
                        C9738o.m28712b(this.contentView, 8);
                        return;
                    }
            }
        }
    }

    public void onInit(Object... objArr) {
        String str;
        this.f15689d = (Room) this.dataCenter.get("data_room");
        if (C7285c.m22838a(this.context, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.f15688c = str;
        this.f15698o = (BarrageLayout) this.contentView.findViewById(R.id.km);
        if (C3519c.m12965a(this.context)) {
            this.f15695l = new C46204b(this.f15698o, C3358ac.m12526d(R.dimen.r3), 2, 7000);
        } else {
            this.f15695l = new C46205c(this.f15698o, C3358ac.m12526d(R.dimen.r3), 2, 7000);
        }
        this.f15695l.mo114147a((C46200a) new C46200a() {
            /* renamed from: a */
            public final void mo13677a(C46187a aVar) {
                BarrageWidget.this.mo13672a();
            }
        });
        this.f15698o.mo114157a(this.f15695l);
        this.f15697n = (BarrageLayout) this.contentView.findViewById(R.id.a90);
        this.f15696m = new C4236a(this.f15697n, 1400);
        this.f15697n.mo114157a(this.f15696m);
        for (int i = 0; i < 10; i++) {
            Path path = new Path();
            path.moveTo((float) C3358ac.m12510a(94.0f), (float) C3358ac.m12510a(150.0f));
            float f = (float) (((i - 5) * 8) + 94);
            path.quadTo((float) C3358ac.m12510a(f), (float) C3358ac.m12510a(150.0f), (float) C3358ac.m12510a(f), (float) C3358ac.m12510a(40.0f));
            this.f15696m.mo11798a(path);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13673a(C3479d dVar) throws Exception {
        if (C6311g.m19573a(((C4902e) dVar.data).f14019a)) {
            this.f15699p = false;
            return;
        }
        this.f15699p = true;
        for (C4903a aVar : ((C4902e) dVar.data).f14019a) {
            C7492s a = C5343e.m17028a(aVar.f14021b).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer());
            List<Bitmap> list = this.f15691h;
            list.getClass();
            a.mo19280a(C5656d.m18033a(list), (C7326g<? super Throwable>) new C5683e<Object>(this));
        }
    }

    /* renamed from: a */
    public final boolean mo13674a(boolean z) {
        if (((Boolean) C3912d.m13795a().f11699b).booleanValue() || !isViewValid()) {
            return false;
        }
        if (this.f15696m.mo11801b() < 24) {
            Bitmap bitmap = null;
            if (this.f15699p && !C6311g.m19573a(this.f15691h)) {
                bitmap = (Bitmap) this.f15691h.get(this.f15692i.nextInt(this.f15691h.size()));
            } else if (f15684f.length() > 0) {
                int nextInt = this.f15692i.nextInt(f15684f.length());
                if (f15685g[nextInt] == null || f15685g[nextInt].isRecycled()) {
                    f15685g[nextInt] = BitmapFactory.decodeResource(this.context.getResources(), f15684f.getResourceId(nextInt, 0));
                }
                Bitmap bitmap2 = f15685g[nextInt];
                if (!z && this.f15690e == null) {
                    this.f15690e = String.valueOf(nextInt);
                }
                bitmap = bitmap2;
            }
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f15696m.mo114146a((C46187a) new C4232a(bitmap, this.f15692i.nextDouble()), false);
            }
        }
        if (z || !TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            return false;
        }
        this.f15686a++;
        if (!this.f15687b) {
            this.f15687b = true;
            this.contentView.postDelayed(this.f15700q, 2000);
        }
        return true;
    }
}
