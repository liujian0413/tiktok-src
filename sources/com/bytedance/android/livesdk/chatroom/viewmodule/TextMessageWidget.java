package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0053p;
import android.os.Looper;
import android.os.Message;
import android.support.p029v7.widget.DefaultItemAnimator;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1279k;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.C4412ad;
import com.bytedance.android.livesdk.chatroom.event.C4435e;
import com.bytedance.android.livesdk.chatroom.event.C4438h;
import com.bytedance.android.livesdk.chatroom.event.C4451u;
import com.bytedance.android.livesdk.chatroom.interact.C4483ai;
import com.bytedance.android.livesdk.chatroom.p220ui.MessageListAdapter;
import com.bytedance.android.livesdk.chatroom.p220ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.p220ui.SpaceItemDecoration;
import com.bytedance.android.livesdk.chatroom.presenter.C5003ca;
import com.bytedance.android.livesdk.chatroom.presenter.C5003ca.C5007a;
import com.bytedance.android.livesdk.chatroom.widget.LiveMessageRecyclerView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.message.model.C8487am;
import com.bytedance.android.livesdk.message.model.C8541cc;
import com.bytedance.android.livesdk.message.model.C8548cj;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9499a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

public class TextMessageWidget extends LiveRecyclableWidget implements C0053p<KVData>, C5007a, C6310a {

    /* renamed from: g */
    private static final String f16469g = "TextMessageWidget";

    /* renamed from: a */
    public LiveMessageRecyclerView f16470a;

    /* renamed from: b */
    public SmoothLinearLayoutManager f16471b;

    /* renamed from: c */
    public C5003ca f16472c;

    /* renamed from: d */
    public int f16473d;

    /* renamed from: e */
    public int f16474e;

    /* renamed from: f */
    public boolean f16475f;

    /* renamed from: h */
    private int f16476h = 100;

    /* renamed from: i */
    private View f16477i;

    /* renamed from: j */
    private TextView f16478j;

    /* renamed from: k */
    private MessageListAdapter f16479k;

    /* renamed from: l */
    private C5543a f16480l = C5543a.NORMAL;

    /* renamed from: m */
    private Room f16481m;

    /* renamed from: n */
    private boolean f16482n;

    /* renamed from: o */
    private final C6309f f16483o = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TextMessageWidget$a */
    enum C5543a {
        NORMAL,
        FOCUS
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
        return R.layout.avb;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo14013a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.f16470a.canScrollVertically(1)) {
                mo14012a(C5543a.NORMAL);
            } else {
                mo14012a(C5543a.FOCUS);
                int l = this.f16471b.mo5447l();
                if (l > this.f16474e) {
                    mo14014b(this.f16473d - (l - this.f16474e));
                    this.f16474e = l;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo13011a(C8548cj cjVar) {
        if (this.dataCenter != null) {
            this.dataCenter.lambda$put$1$DataCenter("data_screen_message", cjVar);
        }
    }

    public void onClear() {
        super.onClear();
        this.f16470a.setAdapter(null);
        this.f16483o.removeCallbacksAndMessages(null);
    }

    public void onUnload() {
        m17874a("onUnload");
        this.dataCenter.removeObserver(this);
        if (this.f16472c != null) {
            this.f16472c.mo8963a();
        }
    }

    /* renamed from: a */
    public final void mo13009a(int i) {
        this.f16479k.notifyItemRangeRemoved(0, 70);
    }

    public void handleMsg(Message message) {
        if (message != null && 1 == message.what) {
            this.f16482n = true;
        }
    }

    public void onEvent(C4451u uVar) {
        this.f16480l = C5543a.NORMAL;
        mo14012a(C5543a.NORMAL);
    }

    /* renamed from: a */
    private <T> void m17873a(Class<T> cls) {
        C9097a.m27146a().mo22266a(cls).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19325f((C7326g<? super T>) new C7326g<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C4435e) {
                    TextMessageWidget.this.onEvent((C4435e) t);
                } else if (t instanceof C4451u) {
                    TextMessageWidget.this.onEvent((C4451u) t);
                } else {
                    if (t instanceof C4483ai) {
                        TextMessageWidget.this.onEvent((C4483ai) t);
                    }
                }
            }
        });
    }

    public void onEvent(C4483ai aiVar) {
        this.f16480l = C5543a.NORMAL;
        mo14012a(C5543a.NORMAL);
    }

    /* renamed from: a */
    private void m17871a(C4412ad adVar) {
        if (isViewValid() && adVar != null) {
            User user = adVar.f12820a;
            String str = adVar.f12821b;
            long j = adVar.f12822c;
            if (str != null && user != null) {
                C8487am amVar = new C8487am();
                amVar.f23245a = user;
                amVar.f23247c = str;
                amVar.f23246b = j;
                amVar.f23248d = ((Long) this.dataCenter.get("data_room_id")).longValue();
                amVar.baseMessage = adVar.f12823d;
                if (this.f16472c != null) {
                    this.f16472c.onMessage(amVar);
                }
            }
        }
    }

    public void onEvent(C4435e eVar) {
        C8541cc ccVar = eVar.f12879a;
        if (ccVar != null && "6".equals(ccVar.f23507f)) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_do_send_message", new C4438h(ccVar.f23506e));
            if (this.f16472c != null) {
                this.f16472c.mo13004a((C9499a) ccVar);
            }
        }
    }

    /* renamed from: a */
    private void m17874a(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "TEXT_MESSAGE_WIDGET_STATUS");
        hashMap.put("reason", str);
        String str3 = "view_status";
        if (this.contentView.getVisibility() == 0) {
            str2 = "visible";
        } else {
            str2 = "gone";
        }
        hashMap.put(str3, str2);
        C8444d.m25673b().mo10001b("ttlive_msg", (Map<String, ?>) hashMap);
    }

    /* renamed from: b */
    public final void mo14014b(int i) {
        String str;
        if (isViewValid()) {
            if (C5543a.NORMAL == this.f16480l || i <= 0) {
                this.f16477i.setVisibility(4);
                this.f16473d = 0;
                return;
            }
            this.f16473d = i;
            if (i < 100) {
                str = String.valueOf(i);
            } else {
                str = "99+";
            }
            this.f16478j.setText(this.context.getResources().getString(R.string.eda, new Object[]{str}));
            if (this.f16477i.getVisibility() != 0) {
                C8448g.m25682a(this.context);
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                translateAnimation.setDuration(100);
                this.f16477i.startAnimation(translateAnimation);
            }
            this.f16477i.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey()) && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1833053846) {
                if (hashCode != -1548871708) {
                    if (hashCode == -1357019912 && key.equals("data_pre_show_keyboard")) {
                        c = 2;
                    }
                } else if (key.equals("cmd_hide_in_douyin_commerce")) {
                    c = 1;
                }
            } else if (key.equals("data_normal_gift_end_event")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    m17871a((C4412ad) kVData.getData());
                    return;
                case 1:
                    if (((Boolean) kVData.getData()).booleanValue()) {
                        this.contentView.setVisibility(4);
                    } else {
                        this.contentView.setVisibility(0);
                    }
                    m17874a("onChanged");
                    return;
                case 2:
                    this.f16470a.clearFocus();
                    break;
            }
        }
    }

    public void onInit(Object... objArr) {
        if (((Boolean) LiveSettingKeys.ENABLE_LIVE_TEXT_SCROLL_OPTIMIZE.mo10240a()).booleanValue()) {
            this.f16476h = ((Integer) LiveSettingKeys.LIVE_TEXT_WIDGET_SCROLL_SPEED.mo10240a()).intValue();
        }
        this.f16470a = (LiveMessageRecyclerView) this.contentView.findViewById(R.id.bye);
        this.f16477i = this.contentView.findViewById(R.id.byc);
        this.f16478j = (TextView) this.contentView.findViewById(R.id.byd);
        this.f16479k = new MessageListAdapter();
        this.f16471b = new SmoothLinearLayoutManager(this.context, 1, false);
        this.f16471b.f15194a = 1.0f;
        this.f16470a.setLayoutManager(this.f16471b);
        this.f16470a.mo5525a((C1272h) new SpaceItemDecoration(1, (int) C9738o.m28708b(this.context, 4.0f)));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.f4940i = 0;
        defaultItemAnimator.f4942k = 0;
        defaultItemAnimator.f4941j = 0;
        this.f16470a.setItemAnimator(null);
        this.f16470a.setAdapter(this.f16479k);
        this.f16470a.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    TextMessageWidget.this.f16475f = false;
                    return;
                }
                if (i == 0 && TextMessageWidget.this.f16475f) {
                    TextMessageWidget.this.mo14012a(C5543a.NORMAL);
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (!recyclerView.canScrollVertically(1)) {
                    TextMessageWidget.this.mo14012a(C5543a.NORMAL);
                } else if (!TextMessageWidget.this.f16475f) {
                    int l = TextMessageWidget.this.f16471b.mo5447l();
                    if (l > TextMessageWidget.this.f16474e) {
                        TextMessageWidget.this.mo14014b(TextMessageWidget.this.f16473d - (l - TextMessageWidget.this.f16474e));
                        TextMessageWidget.this.f16474e = l;
                    }
                }
            }
        });
        this.f16470a.setOnTouchListener(new C5708ev(this));
        this.f16470a.setOnFlingListener(new C1279k() {
            /* renamed from: a */
            public final boolean mo5816a(int i, int i2) {
                if (i2 == 0) {
                    if (!TextMessageWidget.this.f16470a.canScrollVertically(1)) {
                        TextMessageWidget.this.mo14012a(C5543a.NORMAL);
                    } else {
                        TextMessageWidget.this.mo14012a(C5543a.FOCUS);
                        int l = TextMessageWidget.this.f16471b.mo5447l();
                        if (l > TextMessageWidget.this.f16474e) {
                            TextMessageWidget.this.mo14014b(TextMessageWidget.this.f16473d - (l - TextMessageWidget.this.f16474e));
                            TextMessageWidget.this.f16474e = l;
                        }
                    }
                }
                return false;
            }
        });
        this.f16477i.setOnClickListener(new C5709ew(this));
    }

    public void onLoad(Object... objArr) {
        if (this.dataCenter.get("data_room_id") != null) {
            this.f16472c = new C5003ca(((Long) this.dataCenter.get("data_room_id")).longValue());
            this.f16481m = (Room) this.dataCenter.get("data_room");
            this.f16479k.f15108a = LayoutInflater.from(this.context);
            this.f16479k.f15109b = this.f16472c.mo13005b();
            this.f16479k.f15110c = this.f16481m;
            this.f16479k.notifyDataSetChanged();
            this.f16470a.mo5561d(this.f16479k.getItemCount());
            this.f16472c.mo9142a((C5007a) this);
            m17873a(C4435e.class);
            m17873a(C4451u.class);
            m17873a(C4483ai.class);
            this.dataCenter.observeForever("data_normal_gift_end_event", this).observeForever("cmd_hide_in_douyin_commerce", this).observe("data_pre_show_keyboard", this);
            mo14014b(0);
            this.f16481m.getOrientation();
            if (this.f16481m.getStreamType().isStreamingBackground) {
                this.dataCenter.lambda$put$1$DataCenter("data_room_text_message_presenter", this.f16472c);
            }
            this.f16482n = true;
            m17874a("onLoad");
            this.dataCenter.lambda$put$1$DataCenter("text_msg_widget_ready", "");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14011a(View view) {
        if (isViewValid()) {
            C8448g.m25682a(this.context);
            mo14012a(C5543a.NORMAL);
        }
    }

    /* renamed from: a */
    public final void mo14012a(C5543a aVar) {
        if (this.f16480l != aVar) {
            this.f16480l = aVar;
            if (C5543a.NORMAL == aVar) {
                mo14014b(0);
                this.f16471b.f15194a = 1.0f;
                this.f16470a.mo5561d(this.f16479k.getItemCount() - 1);
                this.f16474e = this.f16479k.getItemCount() - 1;
            }
        }
    }

    /* renamed from: c */
    public final void mo13013c(int i, boolean z) {
        float f;
        SmoothLinearLayoutManager smoothLinearLayoutManager = this.f16471b;
        if (this.f16482n) {
            f = (float) this.f16476h;
        } else {
            f = 1.0f;
        }
        smoothLinearLayoutManager.f15194a = f;
        this.f16479k.notifyItemChanged(i);
        if (C5543a.NORMAL == this.f16480l || this.f16475f) {
            this.f16475f = true;
            this.f16470a.mo5561d(this.f16479k.getItemCount() - 1);
            this.f16474e = this.f16479k.getItemCount() - 1;
        }
    }

    /* renamed from: b */
    public final void mo13012b(int i, boolean z) {
        float f;
        SmoothLinearLayoutManager smoothLinearLayoutManager = this.f16471b;
        if (this.f16482n) {
            f = (float) this.f16476h;
        } else {
            f = 1.0f;
        }
        smoothLinearLayoutManager.f15194a = f;
        this.f16479k.notifyItemInserted(i);
        mo14014b(this.f16473d + 1);
        if (this.f16473d >= 300) {
            this.f16480l = C5543a.NORMAL;
            mo14014b(0);
            this.f16471b.f15194a = 1.0f;
            this.f16470a.mo5561d(this.f16479k.getItemCount());
            this.f16474e = this.f16479k.getItemCount() - 1;
        }
        if (C5543a.NORMAL == this.f16480l || this.f16475f) {
            this.f16475f = true;
            this.f16470a.mo5561d(this.f16479k.getItemCount() - 1);
            this.f16474e = this.f16479k.getItemCount() - 1;
        }
    }

    /* renamed from: a */
    public final void mo13010a(int i, boolean z) {
        this.f16479k.notifyItemRemoved(i);
        if (i != this.f16479k.getItemCount()) {
            MessageListAdapter messageListAdapter = this.f16479k;
            messageListAdapter.notifyItemRangeChanged(i, messageListAdapter.getItemCount() - i);
        }
        if (z) {
            this.f16470a.mo5561d(this.f16479k.getItemCount() - 1);
            this.f16474e = this.f16479k.getItemCount() - 1;
        }
    }
}
