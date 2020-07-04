package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.chatroom.event.C4445o;
import com.bytedance.android.livesdk.chatroom.event.C4446p;
import com.bytedance.android.livesdk.chatroom.model.C4923s;
import com.bytedance.android.livesdk.chatroom.p209bl.PlatformMessageHelper;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C8691v;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.rank.C8804a;
import com.bytedance.android.livesdk.rank.C8851m;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class TopRankWidget extends LiveRecyclableWidget implements OnMessageListener {

    /* renamed from: a */
    public View f16497a;

    /* renamed from: b */
    public TextView f16498b;

    /* renamed from: c */
    public View f16499c;

    /* renamed from: d */
    public View f16500d;

    /* renamed from: e */
    public View f16501e;

    /* renamed from: f */
    public View f16502f;

    /* renamed from: g */
    public Animator f16503g;

    /* renamed from: h */
    public Animator f16504h;

    /* renamed from: i */
    private TextView f16505i;

    /* renamed from: j */
    private TextView f16506j;

    /* renamed from: k */
    private ImageView f16507k;

    /* renamed from: l */
    private ImageView f16508l;

    /* renamed from: m */
    private TextView f16509m;

    /* renamed from: n */
    private Animator f16510n;

    /* renamed from: o */
    private AnimatorSet f16511o;

    /* renamed from: p */
    private AnimatorSet f16512p;

    /* renamed from: q */
    private AnimatorSet f16513q;

    /* renamed from: r */
    private Animator f16514r;

    /* renamed from: s */
    private IMessageManager f16515s;

    /* renamed from: t */
    private Room f16516t;

    /* renamed from: u */
    private int f16517u;

    /* renamed from: v */
    private boolean f16518v;

    /* renamed from: w */
    private boolean f16519w;

    /* renamed from: x */
    private C47562b f16520x;

    public int getLayoutId() {
        return R.layout.aw9;
    }

    /* renamed from: a */
    private void m17900a() {
        this.f16520x = new C47562b();
        this.f16520x.mo119661a(C9097a.m27146a().mo22266a(C4446p.class).mo19325f((C7326g<? super T>) new C7326g<C4446p>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C4446p pVar) throws Exception {
                if (pVar != null && pVar.f12902a != null) {
                    C4445o oVar = pVar.f12902a;
                    if (oVar.f12900c == null) {
                        oVar.f12900c = new Bundle();
                    }
                    oVar.f12900c.putInt("back_source", 1);
                    C8804a.m26400c(TopRankWidget.this.dataCenter, oVar.f12900c);
                    C9097a.m27146a().mo22267a((Object) new C4445o(oVar.f12898a, "live_detail", oVar.f12900c));
                }
            }
        }));
    }

    /* renamed from: b */
    private boolean m17902b() {
        if (C8851m.m26480c(this.f16518v)) {
            return true;
        }
        C4923s sVar = (C4923s) LiveSettingKeys.LIVE_RANK_CONFIG.mo10240a();
        if (sVar == null || !sVar.f14075b) {
            return false;
        }
        return true;
    }

    public void onUnload() {
        if (this.f16515s != null) {
            this.f16515s.removeMessageListener(this);
        }
        if (this.f16510n != null && this.f16510n.isRunning()) {
            this.f16510n.cancel();
        }
        if (this.f16503g != null && this.f16503g.isRunning()) {
            this.f16503g.cancel();
        }
        if (this.f16511o != null && this.f16511o.isRunning()) {
            this.f16511o.cancel();
        }
        if (this.f16512p != null && this.f16512p.isRunning()) {
            this.f16512p.cancel();
        }
        if (this.f16513q != null && this.f16513q.isRunning()) {
            this.f16513q.cancel();
        }
        if (this.f16514r != null && this.f16514r.isRunning()) {
            this.f16514r.cancel();
        }
        if (this.f16504h != null && this.f16504h.isRunning()) {
            this.f16504h.cancel();
        }
        if (this.f16520x != null) {
            this.f16520x.dispose();
        }
    }

    public void onInit(Object... objArr) {
        m17901a(this.contentView);
    }

    public void onMessage(IMessage iMessage) {
        if (iMessage.getIntType() == MessageType.DAILY_RANK.getIntType()) {
            C8691v vVar = (C8691v) iMessage;
            if (2 == vVar.f23684f || 3 == vVar.f23684f || 4 == vVar.f23684f) {
                PlatformMessageHelper.INSTANCE.add(vVar);
            }
        }
    }

    public void onLoad(Object... objArr) {
        this.f16516t = (Room) this.dataCenter.get("data_room");
        this.f16518v = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f16519w = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f16515s = (IMessageManager) this.dataCenter.get("data_message_manager");
        if (this.f16515s != null) {
            this.f16515s.addMessageListener(MessageType.DAILY_RANK.getIntType(), this);
        }
        m17900a();
    }

    /* renamed from: a */
    private void m17901a(View view) {
        this.f16497a = view.findViewById(R.id.bpm);
        this.f16498b = (TextView) view.findViewById(R.id.bpn);
        this.f16499c = view.findViewById(R.id.bph);
        this.f16500d = view.findViewById(R.id.bpk);
        this.f16505i = (TextView) view.findViewById(R.id.bpl);
        this.f16506j = (TextView) view.findViewById(R.id.bpj);
        this.f16507k = (ImageView) view.findViewById(R.id.bpg);
        this.f16501e = view.findViewById(R.id.bpi);
        if (m17902b()) {
            this.f16502f = view.findViewById(R.id.buy);
            this.f16509m = (TextView) this.f16502f.findViewById(R.id.buz);
            this.f16508l = (ImageView) this.f16502f.findViewById(R.id.buu);
        } else {
            this.f16502f = view.findViewById(R.id.bux);
            this.f16509m = (TextView) this.f16502f.findViewById(R.id.buz);
            this.f16508l = (ImageView) this.f16502f.findViewById(R.id.buu);
        }
        this.f16517u = view.getWidth();
        if (!this.f16519w) {
            LayoutParams layoutParams = this.f16497a.getLayoutParams();
            layoutParams.width = C3358ac.m12510a(400.0f);
            this.f16497a.setLayoutParams(layoutParams);
        }
    }
}
