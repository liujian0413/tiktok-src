package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.event.C4433c;
import com.bytedance.android.livesdk.chatroom.presenter.PromotionStatusPresenter;
import com.bytedance.android.livesdk.chatroom.presenter.PromotionStatusPresenter.C4932a;
import com.bytedance.android.livesdk.chatroom.presenter.PromotionStatusPresenter.PromotionStatus;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.message.model.C8529bs;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9500b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.ttm.player.MediaPlayer;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;
import org.json.JSONObject;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

public class PromotionStatusWidget extends LiveRecyclableWidget implements OnClickListener, C4932a {

    /* renamed from: a */
    private TextView f16423a;

    /* renamed from: b */
    private PromotionStatusPresenter f16424b;

    /* renamed from: c */
    private boolean f16425c;

    /* renamed from: d */
    private Room f16426d;

    /* renamed from: e */
    private boolean f16427e;

    /* renamed from: f */
    private boolean f16428f;

    /* renamed from: g */
    private JSONObject f16429g;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PromotionStatusWidget$a */
    class C5535a implements C5739a {
        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C5535a() {
        }

        public final void onClick(View view) {
            PromotionStatusWidget.this.onClick(view);
        }
    }

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.ayk;
    }

    public void onUnload() {
        this.f16424b.mo8963a();
    }

    public void onInit(Object... objArr) {
        this.f16428f = false;
        this.f16423a = (TextView) this.contentView.findViewById(R.id.e02);
        this.f16424b = new PromotionStatusPresenter(1);
    }

    /* renamed from: a */
    private void m17818a(String str) {
        int i;
        int i2;
        if (this.f16427e) {
            i = C34943c.f91128x;
        } else {
            i = 240;
        }
        if (this.f16427e) {
            i2 = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        } else {
            i2 = 320;
        }
        BaseDialogFragment.m12686a((FragmentActivity) this.context, (DialogFragment) C9178j.m27302j().mo22374c().mo11533a(C3979c.m13951a(str).mo11555a(i).mo11560b(i2).mo11564d(8).mo11558a("promotionCards")));
    }

    public void onClick(View view) {
        C8529bs bsVar = new C8529bs();
        bsVar.f23446a = "buy_card";
        C9500b bVar = new C9500b();
        bVar.f25993c = this.f16426d.getId();
        bsVar.baseMessage = bVar;
        C9097a.m27146a().mo22267a((Object) new C4433c(bsVar));
    }

    public void onEvent(C4433c cVar) {
        C8448g.m25682a(this.context);
        TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        this.f16426d.getId();
        if (isViewValid() && cVar.f12873a != null) {
            String str = cVar.f12873a.f23446a;
            char c = 65535;
            if (str.hashCode() == -984622807 && str.equals("buy_card")) {
                c = 0;
            }
            if (c == 0 && cVar.f12873a.baseMessage != null) {
                m17818a(C9078p.m27101a(Locale.ENGLISH, "https://hotsoon.snssdk.com/falcon/live_inroom/page/promotion_card/index.html?type=promotion&room_id=%1$d&is_anchor=%2$s", Long.valueOf(cVar.f12873a.baseMessage.f25993c), String.valueOf(this.f16425c)));
            }
        }
    }

    /* renamed from: a */
    private void m17819a(boolean z) {
        this.f16428f = !z;
        if (!z) {
            this.f16423a.setVisibility(0);
            this.f16423a.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.c_h, 0);
            this.f16423a.setOnClickListener(null);
        } else if (((Boolean) C5864b.f17270Y.mo10240a()).booleanValue() || !this.f16425c) {
            this.f16423a.setVisibility(4);
            this.f16423a.setOnClickListener(null);
        } else {
            this.f16423a.setVisibility(0);
            this.f16423a.setText(R.string.fa7);
            this.f16423a.setCompoundDrawablesWithIntrinsicBounds(R.drawable.c_s, 0, R.drawable.c_h, 0);
            this.f16423a.setOnClickListener(this);
        }
    }

    public void onLoad(Object... objArr) {
        String str;
        this.f16425c = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f16426d = (Room) this.dataCenter.get("data_room");
        this.f16427e = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f16424b.mo9142a((C4932a) this);
        C9097a.m27146a().mo22266a(C4433c.class).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19325f((C7326g<? super T>) new C7326g<C4433c>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C4433c cVar) throws Exception {
                PromotionStatusWidget.this.onEvent(cVar);
            }
        });
        m17819a(true);
        C5747j.m18103a().mo14165a(ToolbarButton.PROMOTION_CARD, (C5739a) new C5535a());
        if (C7285c.m22838a(this.context, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        String str2 = (String) this.dataCenter.get("data_enter_source");
        this.f16429g = new JSONObject();
        try {
            this.f16429g.put("source", this.f16426d.getUserFrom());
            this.f16429g.put("live_source", str);
            this.f16429g.put("request_id", this.f16426d.getRequestId());
            this.f16429g.put("log_pb", this.f16426d.getLog_pb());
            this.f16429g.put("enter_from", str2);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13992a(long j, View view) {
        m17819a(true);
        mo13993b(view, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo13993b(View view, long j) {
        m17818a(C9078p.m27101a(Locale.ENGLISH, "https://hotsoon.snssdk.com/falcon/live_inroom/page/promotion_card/index.html?type=history&room_id=%1$d&is_anchor=%2$s", Long.valueOf(j), String.valueOf(this.f16425c)));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", this.f16426d.getUserFrom());
            jSONObject.put("request_id", this.f16426d.getRequestId());
            jSONObject.put("log_pb", this.f16426d.getLog_pb());
        } catch (Exception unused) {
        }
        C8448g.m25683a(view);
        this.f16426d.getOwner().getId();
    }

    /* renamed from: a */
    public final void mo12897a(int i, int i2) {
        if (this.f16423a != null) {
            this.f16423a.setText(this.f16423a.getContext().getString(R.string.fa9, new Object[]{Integer.valueOf(i)}));
        }
    }

    /* renamed from: a */
    public final void mo12898a(PromotionStatus promotionStatus, long j) {
        if (this.f16423a != null) {
            switch (promotionStatus) {
                case IDLE:
                    m17819a(true);
                    return;
                case IN_PROGRESS:
                    m17819a(false);
                    this.f16423a.setText(this.f16423a.getContext().getString(R.string.fa9, new Object[]{Integer.valueOf(0)}));
                    this.f16423a.setOnClickListener(new C5696ej(this, j));
                    return;
                case FINISHED:
                    if (this.f16428f) {
                        this.f16423a.setText(R.string.fa8);
                        this.f16423a.setOnClickListener(new C5697ek(this, j));
                        break;
                    }
                    break;
            }
        }
    }
}
