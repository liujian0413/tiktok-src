package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Dialog;
import android.arch.lifecycle.C0053p;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.chatroom.p204a.C4230a;
import com.bytedance.android.livesdk.chatroom.p204a.p207c.C4251h;
import com.bytedance.android.livesdk.chatroom.viewmodule.p221a.p222a.C5568a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.message.model.C8680m;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p280ss.ugc.live.barrage.p1824a.C46187a;
import com.p280ss.ugc.live.barrage.p1824a.C46196c;
import com.p280ss.ugc.live.barrage.p1825b.C46198a;
import com.p280ss.ugc.live.barrage.p1825b.C46198a.C46200a;
import com.p280ss.ugc.live.barrage.p1825b.C46206d;
import com.p280ss.ugc.live.barrage.view.BarrageLayout;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class OBSBarrageWidget extends LiveWidget implements C0053p<KVData>, OnMessageListener {

    /* renamed from: a */
    private final List<C8680m> f16301a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private IMessageManager f16302b;

    /* renamed from: c */
    private C46198a f16303c;

    /* renamed from: d */
    private C46198a f16304d;

    /* renamed from: e */
    private BarrageLayout f16305e;

    /* renamed from: f */
    private BarrageLayout f16306f;

    /* renamed from: g */
    private C46200a f16307g = new C46200a() {
        /* renamed from: a */
        public final void mo13677a(C46187a aVar) {
            OBSBarrageWidget.this.mo13965a();
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.OBSBarrageWidget$2 */
    static /* synthetic */ class C54902 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16309a = new int[MessageType.values().length];

        static {
            try {
                f16309a[MessageType.CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.OBSBarrageWidget$a */
    class C5491a implements C5739a {

        /* renamed from: b */
        private Dialog f16311b;

        /* renamed from: c */
        private int f16312c;

        /* renamed from: d */
        private View f16313d;

        /* renamed from: e */
        private boolean f16314e = true;

        C5491a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo13966a(boolean z) {
            int i;
            View view = OBSBarrageWidget.this.contentView;
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            view.setVisibility(i);
        }

        public final void onClick(View view) {
            if (this.f16312c == 1) {
                this.f16314e = !this.f16314e;
                if (this.f16314e) {
                    this.f16313d.setBackgroundResource(R.drawable.cfc);
                    C9049ap.m27022a((int) R.string.ehq);
                    OBSBarrageWidget.this.contentView.setVisibility(0);
                } else {
                    this.f16313d.setBackgroundResource(R.drawable.cfb);
                    C9049ap.m27022a((int) R.string.ehp);
                    OBSBarrageWidget.this.contentView.setVisibility(4);
                }
                C8946b.f24445bQ.mo22118a(Boolean.valueOf(this.f16314e));
                return;
            }
            if (this.f16311b == null && this.f16312c != 1) {
                this.f16311b = new C4230a(OBSBarrageWidget.this.context, new C5686ec(this));
            }
            if (!this.f16311b.isShowing()) {
                this.f16311b.show();
            }
        }

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
            if (!this.f16314e) {
                if (aVar instanceof C5568a) {
                    this.f16314e = ((C5568a) aVar).f16621a;
                }
                if (this.f16314e) {
                    this.f16313d.setBackgroundResource(R.drawable.cfc);
                    C9049ap.m27022a((int) R.string.ehq);
                    OBSBarrageWidget.this.contentView.setVisibility(0);
                    return;
                }
                this.f16313d.setBackgroundResource(R.drawable.cfb);
                C9049ap.m27022a((int) R.string.ehp);
                OBSBarrageWidget.this.contentView.setVisibility(4);
            }
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
            if (this.f16311b != null) {
                C5687ed.m18042a(this.f16311b);
            }
            this.f16311b = null;
        }

        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
            this.f16313d = view;
            Room room = (Room) dataCenter.get("data_room", null);
            this.f16314e = ((Boolean) C8946b.f24445bQ.mo22117a()).booleanValue();
            if (room != null && room.isOfficial()) {
                this.f16312c = 1;
                if (this.f16314e) {
                    view.setBackgroundResource(R.drawable.cfc);
                    OBSBarrageWidget.this.contentView.setVisibility(0);
                    return;
                }
                view.setBackgroundResource(R.drawable.cfb);
                OBSBarrageWidget.this.contentView.setVisibility(4);
            }
        }
    }

    /* renamed from: b */
    private void m17737b() {
    }

    public int getLayoutId() {
        return R.layout.au5;
    }

    public void onDestroy() {
        if (this.f16302b != null) {
            this.f16302b.removeMessageListener(this);
        }
        if (this.f16305e != null) {
            this.f16305e.mo114156a();
        }
        if (this.f16306f != null) {
            this.f16306f.mo114156a();
        }
        this.dataCenter.removeObserver(this);
        super.onDestroy();
    }

    /* renamed from: a */
    public final void mo13965a() {
        C46198a aVar;
        if (isViewValid() && ((this.f16305e != null || this.f16306f != null) && this.f16303c != null && this.f16304d != null && this.f16303c.mo11801b() + this.f16304d.mo11801b() < 40 && !this.f16301a.isEmpty())) {
            C46196c cVar = new C4251h(LayoutInflater.from(this.context).inflate(R.layout.atq, null), (((Float) C8946b.f24371W.mo22117a()).floatValue() * 12.0f) + 12.0f, (((Float) C8946b.f24370V.mo22117a()).floatValue() * 0.68f) + 0.32f, (C8680m) this.f16301a.remove(0)).f12413a;
            switch (((Integer) C8946b.f24372X.mo22117a()).intValue()) {
                case 0:
                    aVar = this.f16303c;
                    break;
                case 1:
                    aVar = this.f16304d;
                    break;
                case 2:
                    if (new Random().nextInt(2) != 0) {
                        aVar = this.f16304d;
                        break;
                    } else {
                        aVar = this.f16303c;
                        break;
                    }
                default:
                    return;
            }
            aVar.mo114146a((C46187a) cVar, false);
        }
    }

    public void onCreate() {
        int i;
        int i2;
        int i3;
        super.onCreate();
        ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f16302b = (IMessageManager) this.dataCenter.get("data_message_manager");
        if (this.f16302b != null) {
            this.f16302b.addMessageListener(MessageType.CHAT.getIntType(), this);
        }
        if (!((Room) this.dataCenter.get("data_room", null)).isOfficial()) {
            i2 = ((C3358ac.m12520b() / 2) - C3358ac.m12526d(R.dimen.ri)) / C3358ac.m12526d(R.dimen.rg);
            i = ((C3358ac.m12520b() / 2) - C3358ac.m12526d(R.dimen.rh)) / C3358ac.m12526d(R.dimen.rg);
        } else {
            i2 = (int) ((((((float) C3358ac.m12520b()) * 0.6f) / 2.0f) - ((float) C3358ac.m12526d(R.dimen.ri))) / ((float) C3358ac.m12526d(R.dimen.rg)));
            i = (int) ((((((float) C3358ac.m12520b()) * 0.6f) / 2.0f) - ((float) C3358ac.m12526d(R.dimen.rh))) / ((float) C3358ac.m12526d(R.dimen.rg)));
        }
        this.f16305e = (BarrageLayout) this.contentView.findViewById(R.id.dlv);
        this.f16303c = new C46206d(this.f16305e, C3358ac.m12526d(R.dimen.rg), i2, 7000);
        this.f16303c.mo114147a(this.f16307g);
        this.f16305e.mo114157a(this.f16303c);
        this.f16306f = (BarrageLayout) this.contentView.findViewById(R.id.nq);
        this.f16304d = new C46206d(this.f16306f, C3358ac.m12526d(R.dimen.rg), i, 7000);
        this.f16304d.mo114147a(this.f16307g);
        this.f16306f.mo114157a(this.f16304d);
        View view = this.contentView;
        if (((Boolean) C8946b.f24373Y.mo22117a()).booleanValue()) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        view.setVisibility(i3);
        C5747j.m18103a().mo14165a(ToolbarButton.BARRAGE, (C5739a) new C5491a());
        if (((Integer) LiveSettingKeys.BAN_BARRAGE_SWITCH_SET.mo10240a()).intValue() != 1) {
            this.contentView.setVisibility(4);
        }
        this.dataCenter.observe("cmd_barrage_visibility", this);
        if (((Integer) LiveSettingKeys.BAN_BARRAGE_SWITCH_SET.mo10240a()).intValue() != 1) {
            this.contentView.setVisibility(4);
        }
        m17737b();
    }

    /* renamed from: a */
    private void m17735a(C8680m mVar) {
        if (this.f16301a.size() >= 200) {
            this.f16301a.remove(0);
        }
        this.f16301a.add(mVar);
        mo13965a();
    }

    public void onMessage(IMessage iMessage) {
        if (isViewValid()) {
            C8538c cVar = (C8538c) iMessage;
            if (C54902.f16309a[cVar.getMessageType().ordinal()] == 1) {
                m17735a((C8680m) cVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null) {
            C9738o.m28712b(this.contentView, ((Integer) kVData.getData()).intValue());
        }
    }
}
