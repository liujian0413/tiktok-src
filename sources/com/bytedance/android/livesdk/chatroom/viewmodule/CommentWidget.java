package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Toast;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.core.network.p150b.C3176a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.LiveTextView;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C4421am;
import com.bytedance.android.livesdk.chatroom.event.C4422an;
import com.bytedance.android.livesdk.chatroom.event.C4425aq;
import com.bytedance.android.livesdk.chatroom.event.C4431aw;
import com.bytedance.android.livesdk.chatroom.event.C4438h;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent.Sender;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.p209bl.C4270b;
import com.bytedance.android.livesdk.chatroom.p220ui.LiveInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.p220ui.LiveInputDialogFragment.C5099a;
import com.bytedance.android.livesdk.chatroom.p220ui.LiveInputDialogFragment.C5100b;
import com.bytedance.android.livesdk.chatroom.p220ui.LiveInputDialogFragment.C5101c;
import com.bytedance.android.livesdk.chatroom.presenter.C4967b;
import com.bytedance.android.livesdk.chatroom.presenter.C4967b.C4969a;
import com.bytedance.android.livesdk.chatroom.presenter.C5022h;
import com.bytedance.android.livesdk.chatroom.utils.C5335a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.message.model.C8541cc;
import com.bytedance.android.livesdk.message.model.C8548cj;
import com.bytedance.android.livesdk.message.model.C8680m;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdk.viewmodel.C9143f;
import com.bytedance.android.livesdk.viewmodel.LotteryWaiting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C9467i;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p348d.C7326g;

public class CommentWidget extends LiveRecyclableWidget implements C0053p<KVData>, OnClickListener, C4969a {

    /* renamed from: d */
    public static final int f15731d = C3358ac.m12510a(200.0f);

    /* renamed from: e */
    public static final int f15732e = C3358ac.m12510a(128.0f);

    /* renamed from: a */
    public boolean f15733a;

    /* renamed from: b */
    public Room f15734b;

    /* renamed from: c */
    public boolean f15735c;

    /* renamed from: f */
    public LiveInputDialogFragment f15736f;

    /* renamed from: g */
    public C5100b f15737g = new C5100b();

    /* renamed from: h */
    public Runnable f15738h = new Runnable() {
        public final void run() {
            if (CommentWidget.this.isViewValid()) {
                CommentWidget.this.dataCenter.lambda$put$1$DataCenter("cmd_show_recharge_dialog", new C4425aq(1, "live_detail"));
            }
        }
    };

    /* renamed from: i */
    private View f15739i;

    /* renamed from: j */
    private View f15740j;

    /* renamed from: k */
    private View f15741k;

    /* renamed from: l */
    private Activity f15742l;

    /* renamed from: m */
    private String f15743m;

    /* renamed from: n */
    private String f15744n;

    /* renamed from: o */
    private boolean f15745o;

    /* renamed from: p */
    private boolean f15746p = true;

    /* renamed from: q */
    private C4967b f15747q;

    /* renamed from: r */
    private String f15748r;

    /* renamed from: s */
    private boolean f15749s;

    /* renamed from: t */
    private boolean f15750t;

    /* renamed from: u */
    private C8541cc f15751u;

    /* renamed from: v */
    private C5101c f15752v = new C5101c() {
        /* renamed from: a */
        public final void mo13256a(C5100b bVar) {
            CommentWidget.this.f15736f = null;
            CommentWidget.this.f15737g = bVar;
        }

        /* renamed from: a */
        public final void mo13257a(String str, boolean z) {
            CommentWidget.this.mo13693a(str, z, false);
        }
    };

    /* renamed from: w */
    private C5099a f15753w = new C5099a() {
        /* renamed from: a */
        public final void mo13255a() {
            CommentWidget.this.containerView.post(CommentWidget.this.f15738h);
        }
    };

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.aw6;
    }

    /* renamed from: a */
    public final void mo12968a(Exception exc) {
        if (exc instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) exc;
            int errorCode = apiServerException.getErrorCode();
            if (50001 == errorCode) {
                mo13695b(true);
            } else if (50004 == errorCode || 50014 == errorCode || 80074 == errorCode) {
                m17164f();
                mo13694b();
                C3517a.m12962a((Context) this.f15742l, apiServerException.getPrompt());
            } else if (40001 == errorCode) {
                C3517a.m12962a((Context) this.f15742l, apiServerException.getPrompt());
                if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.mo10240a()).intValue() == 1) {
                    this.dataCenter.lambda$put$1$DataCenter("cmd_show_recharge_dialog", new C4425aq(1, "live_detail"));
                }
            } else if (errorCode == 50019) {
                mo13694b();
                C5335a.m17013a(this.f15742l, "send_barrage", new C9467i() {
                });
            } else {
                C9076n.m27095a(getContext(), apiServerException);
            }
            m17159a(apiServerException);
            return;
        }
        C5734t.m18061a(Toast.makeText(this.context, R.string.eq6, 0));
    }

    /* renamed from: a */
    public final void mo13693a(String str, boolean z, boolean z2) {
        this.f15748r = str;
        this.f15749s = z;
        this.f15750t = z2;
        if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            TTLiveSDKContext.getHostService().mo22367h().mo22167a(this.context, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.efb)).mo22192c("comment_live").mo22188a(-1).mo22190a()).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19189a((C7498y<? super T>) new C8986g<Object>());
        } else if (!TTLiveSDKContext.getHostService().mo22367h().mo22178a(LiveInteractFunction.COMMENT)) {
            if (this.f15746p) {
                C9097a.m27146a().mo22267a((Object) new C4422an(true, 0));
                this.f15746p = false;
            }
            if (!z) {
                this.f15747q.mo12964a(str, Sender.CommentWidget, this.f15744n);
            } else if (str.length() > 15) {
                C3517a.m12960a(this.context, (int) R.string.eq7);
            } else {
                this.f15747q.mo12965b(str, Sender.CommentWidget, this.f15744n);
            }
        }
    }

    public void onPause() {
        super.onPause();
        C8444d.m25673b();
        C8444d.m11971b("ttlive_comment", "CommentWidget onPause");
    }

    public void onResume() {
        super.onResume();
        C8444d.m25673b();
        C8444d.m11971b("ttlive_comment", "CommentWidget onResume");
    }

    /* renamed from: d */
    private void m17163d() {
        final LayoutParams layoutParams = this.contentView.getLayoutParams();
        layoutParams.width = -1;
        this.contentView.setLayoutParams(layoutParams);
        this.contentView.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                int width = CommentWidget.this.contentView.getWidth();
                if (CommentWidget.this.f15735c) {
                    if (width > CommentWidget.f15732e) {
                        layoutParams.width = CommentWidget.f15732e;
                    }
                } else if (width > CommentWidget.f15731d) {
                    layoutParams.width = CommentWidget.f15731d;
                }
                CommentWidget.this.contentView.setLayoutParams(layoutParams);
                if (VERSION.SDK_INT >= 16) {
                    CommentWidget.this.contentView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    CommentWidget.this.contentView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            }
        });
    }

    /* renamed from: f */
    private void m17164f() {
        if (this.f15736f != null) {
            this.f15736f.mo13246a("");
            return;
        }
        this.f15737g.f14719d = "";
    }

    /* renamed from: b */
    public final void mo13694b() {
        if (this.f15736f != null && isViewValid()) {
            this.f15736f.mo13241a();
            this.dataCenter.lambda$put$1$DataCenter("data_pre_show_keyboard", Boolean.valueOf(false));
        }
    }

    public void onUnload() {
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
        this.f15747q.mo8963a();
        this.f15745o = false;
        this.f15746p = true;
        this.f15748r = null;
        this.f15749s = false;
        this.f15750t = false;
        this.f15751u = null;
        if (this.f15736f != null) {
            this.f15736f.dismissAllowingStateLoss();
            this.f15736f = null;
        }
        C8444d.m25673b();
        C8444d.m11971b("ttlive_comment", "CommentWidget onUnload");
    }

    /* renamed from: c */
    private void m17162c() {
        String str;
        this.f15739i = this.contentView.findViewById(R.id.ac2);
        this.f15740j = this.contentView.findViewById(R.id.ac1);
        this.f15741k = this.containerView.findViewById(R.id.dot);
        if (this.f15739i != null) {
            this.f15739i.setOnClickListener(this);
        }
        this.f15737g.f14717b = this.f15733a;
        if (C7285c.m22838a(this.f15742l, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.f15743m = str;
        m17163d();
    }

    /* renamed from: a */
    public final void mo13692a() {
        if (this.f15736f == null && this.isViewValid && !TTLiveSDKContext.getHostService().mo22367h().mo22178a(LiveInteractFunction.COMMENT)) {
            if (!this.f15737g.f14718c) {
                this.f15745o = true;
                this.dataCenter.lambda$put$1$DataCenter("data_pre_show_keyboard", Boolean.valueOf(true));
                if (!(this.f15734b == null || this.f15734b.mRoomAuthStatus == null)) {
                    this.f15737g.f14720e = this.f15734b.mRoomAuthStatus.enableDanmaku;
                }
                if (this.f15734b != null && this.f15734b.isOfficial()) {
                    this.f15737g.f14721f = true;
                }
                this.f15736f = LiveInputDialogFragment.m16443a(this.f15737g, this.f15753w);
                this.f15736f.f14694h = this.f15752v;
                try {
                    this.f15736f.show(((FragmentActivity) this.f15742l).getSupportFragmentManager(), "INPUT");
                } catch (IllegalStateException unused) {
                    this.f15736f = null;
                }
            } else {
                C3517a.m12960a((Context) this.f15742l, (int) R.string.f5u);
            }
        }
    }

    public void onEvent(C4431aw awVar) {
        m17160a(awVar);
    }

    /* renamed from: a */
    public final void mo12969a(boolean z) {
        this.f15737g.f14720e = z;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ac1 || id == R.id.ac2 || id == R.id.ac2 || id == R.id.dot) {
            mo13692a();
        }
    }

    /* renamed from: a */
    private void m17159a(ApiServerException apiServerException) {
        if (C3176a.m12019a((Exception) apiServerException) && ((Boolean) LiveSettingKeys.ENABLE_COMMENT_BIND_PHONE.mo10240a()).booleanValue()) {
            TTLiveSDKContext.getHostService().mo22362c().startBindPhoneDialogFragment(this.f15742l, "live_detail", "live_detail", new C5733s(this));
        }
    }

    /* renamed from: b */
    public final void mo13695b(boolean z) {
        if (isViewValid() && !this.f15733a) {
            if (this.f15736f != null) {
                this.f15736f.mo13247a(z);
            } else {
                this.f15737g.f14718c = z;
            }
        }
    }

    /* renamed from: a */
    private void m17160a(final C4431aw awVar) {
        if (awVar.f12869a == 1) {
            this.contentView.postDelayed(new Runnable() {
                public final void run() {
                    if (CommentWidget.this.isViewValid()) {
                        String a = C9078p.m27100a("@%s ", awVar.f12870b);
                        if (CommentWidget.this.f15736f != null) {
                            CommentWidget.this.f15736f.mo13246a(a);
                            return;
                        }
                        CommentWidget.this.f15737g.f14719d = a;
                        CommentWidget.this.mo13692a();
                    }
                }
            }, 500);
        } else if (awVar.f12869a == 2) {
            this.contentView.postDelayed(new Runnable() {
                public final void run() {
                    if (CommentWidget.this.isViewValid()) {
                        if (CommentWidget.this.f15736f != null) {
                            CommentWidget.this.f15736f.mo13250b(awVar.f12871c);
                            return;
                        }
                        CommentWidget.this.f15737g.f14716a = awVar.f12871c;
                        CommentWidget.this.mo13692a();
                    }
                }
            }, 500);
        } else {
            mo13692a();
        }
    }

    /* renamed from: b */
    public final void mo12970b(Exception exc) {
        if (exc instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) exc;
            int errorCode = apiServerException.getErrorCode();
            if (50001 == errorCode) {
                mo13695b(true);
            } else {
                if (50004 == errorCode) {
                    m17164f();
                    mo13694b();
                } else if (errorCode == 50019) {
                    mo13694b();
                    C5335a.m17013a(this.f15742l, "send_message", new C9467i() {
                    });
                }
                C3517a.m12962a((Context) this.f15742l, apiServerException.getPrompt());
            }
            m17159a(apiServerException);
            return;
        }
        C9049ap.m27022a((int) R.string.epk);
    }

    public void onInit(Object... objArr) {
        this.f15733a = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f15734b = (Room) this.dataCenter.get("data_room");
        this.f15735c = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f15744n = (String) this.dataCenter.get("log_enter_live_source");
        this.f15742l = (Activity) this.context;
        this.f15747q = new C4967b();
        m17162c();
        C8444d.m25673b();
        C8444d.m11971b("ttlive_comment", "CommentWidget onInit");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (isViewValid() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            boolean z = true;
            int i = 4;
            switch (key.hashCode()) {
                case -1755796428:
                    if (key.equals("cmd_hide_other_toolbar")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1679741667:
                    if (key.equals("cmd_wanna_send_message")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1548871708:
                    if (key.equals("cmd_hide_in_douyin_commerce")) {
                        c = 4;
                        break;
                    }
                    break;
                case -657921921:
                    if (key.equals("cmd_do_send_message")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1060055221:
                    if (key.equals("data_keyboard_status")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1939188655:
                    if (key.equals("data_screen_record_is_open")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m17160a((C4431aw) kVData.getData());
                    return;
                case 1:
                    C4438h hVar = (C4438h) kVData.getData();
                    if (hVar != null) {
                        if (hVar.f12885b) {
                            this.f15751u = (C8541cc) hVar.f12886c;
                        }
                        mo13693a(hVar.f12884a, false, hVar.f12885b);
                        return;
                    }
                    break;
                case 2:
                    if (!((Boolean) kVData.getData()).booleanValue() && !this.f15745o) {
                        i = 0;
                    }
                    this.contentView.setVisibility(i);
                    C8444d.m25673b();
                    String str = "ttlive_comment";
                    StringBuilder sb = new StringBuilder("CommentWidget contentView status changed, visible:");
                    if (this.contentView.getVisibility() != 0) {
                        z = false;
                    }
                    sb.append(z);
                    sb.append(", reason: DATA_SCREEN_RECORD_IS_OPEN");
                    C8444d.m11971b(str, sb.toString());
                    return;
                case 3:
                    if (((Boolean) kVData.getData()).booleanValue()) {
                        this.contentView.setVisibility(4);
                    } else {
                        this.contentView.setVisibility(0);
                        this.f15745o = false;
                    }
                    C8444d.m25673b();
                    String str2 = "ttlive_comment";
                    StringBuilder sb2 = new StringBuilder("CommentWidget contentView status changed, visible:");
                    if (this.contentView.getVisibility() != 0) {
                        z = false;
                    }
                    sb2.append(z);
                    sb2.append(", reason: DATA_KEYBOARD_STATUS");
                    C8444d.m11971b(str2, sb2.toString());
                    return;
                case 4:
                    if (((Boolean) kVData.getData()).booleanValue()) {
                        this.contentView.setVisibility(4);
                    } else {
                        this.contentView.setVisibility(0);
                    }
                    C8444d.m25673b();
                    String str3 = "ttlive_comment";
                    StringBuilder sb3 = new StringBuilder("CommentWidget contentView status changed, visible:");
                    if (this.contentView.getVisibility() != 0) {
                        z = false;
                    }
                    sb3.append(z);
                    sb3.append(", reason: CMD_VISIBILITY_IN_DOUYIN_COMMERCE");
                    C8444d.m11971b(str3, sb3.toString());
                    return;
                case 5:
                    if (((Boolean) kVData.getData(Boolean.valueOf(false))).booleanValue()) {
                        this.contentView.setVisibility(4);
                    } else {
                        this.contentView.setVisibility(0);
                    }
                    C8444d.m25673b();
                    String str4 = "ttlive_comment";
                    StringBuilder sb4 = new StringBuilder("CommentWidget contentView status changed, visible:");
                    if (this.contentView.getVisibility() != 0) {
                        z = false;
                    }
                    sb4.append(z);
                    sb4.append(", reason: CMD_HIDE_OTHER_TOOLBARBUTTON");
                    C8444d.m11971b(str4, sb4.toString());
                    break;
            }
        }
    }

    public void onLoad(Object... objArr) {
        C9097a.m27146a().mo22266a(C4431aw.class).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19325f((C7326g<? super T>) new C7326g<C4431aw>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C4431aw awVar) throws Exception {
                CommentWidget.this.onEvent(awVar);
            }
        });
        if (this.f15734b != null && this.contentView != null) {
            this.f15733a = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
            this.f15734b = (Room) this.dataCenter.get("data_room");
            this.f15735c = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
            this.f15744n = (String) this.dataCenter.get("log_enter_live_source");
            this.f15742l = (Activity) this.context;
            this.f15747q.mo9142a((C4969a) this);
            this.dataCenter.observe("cmd_do_send_message", this).observe("data_screen_record_is_open", this).observe("cmd_wanna_send_message", this).observeForever("data_keyboard_status", this).observeForever("cmd_hide_other_toolbar", this).observeForever("cmd_hide_in_douyin_commerce", this);
            if (!this.f15735c) {
                C9738o.m28712b(this.f15739i, 0);
            } else if (this.f15733a) {
                this.f15740j.setOnClickListener(this);
                this.f15740j.setVisibility(0);
                this.f15739i.setVisibility(8);
            } else {
                if (this.f15740j != null) {
                    this.f15740j.setVisibility(8);
                }
                this.f15739i.setVisibility(0);
            }
            m17163d();
            if (this.f15734b != null && this.f15734b.isOfficial()) {
                View findViewById = this.contentView.findViewById(R.id.ac2);
                if (findViewById != null && (findViewById instanceof LiveTextView)) {
                    LiveTextView liveTextView = (LiveTextView) findViewById;
                    if (!this.f15735c) {
                        liveTextView.setBackgroundResource(R.drawable.bpb);
                        liveTextView.setTextColor(-1);
                    } else if (!(getContext() == null || getContext().getResources() == null)) {
                        liveTextView.setBackgroundResource(R.drawable.bph);
                        liveTextView.setTextColor(getContext().getResources().getColor(R.color.ap8));
                    }
                }
            }
            C8444d.m25673b();
            C8444d.m11971b("ttlive_comment", "CommentWidget onLoad");
        }
    }

    /* renamed from: a */
    public final void mo12966a(Barrage barrage) {
        if (isViewValid()) {
            m17164f();
            if (TextUtils.isEmpty(barrage.getOrderId())) {
                C9049ap.m27022a((int) R.string.eq6);
                return;
            }
            ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11154a((long) barrage.getLeftDiamond());
            if (((Boolean) LiveSettingKeys.LIVE_ENABLE_NORMAL_GIFT_AND_BARRAGE_SELF_FIRSTLY.mo10240a()).booleanValue() && ((C3495l) C3596c.m13172a(C3495l.class)).messageManagerHelper().mo10513a() != null && isViewValid()) {
                C8548cj a = C4270b.m14423a(barrage);
                if (a != null) {
                    a.isLocalInsertMsg = true;
                    ((C3495l) C3596c.m13172a(C3495l.class)).messageManagerHelper().mo10513a().insertMessage(a);
                }
            }
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("live_source", this.f15743m);
                if (!TextUtils.isEmpty(this.f15734b.getSourceType())) {
                    hashMap.put("moment_room_source", this.f15734b.getSourceType());
                }
            } catch (Exception unused) {
            }
            C8443c.m25663a().mo21606a("send_barrage", hashMap, new C8438j().mo21599b("live_interact"), Room.class);
        }
    }

    /* renamed from: a */
    public final void mo12967a(C8680m mVar) {
        if (isViewValid()) {
            m17164f();
            if (this.f15742l instanceof FragmentActivity) {
                TTLiveSDKContext.getHostService().mo22362c().checkBindHelpShow((FragmentActivity) this.f15742l, UserProfileEvent.SOURCE_COMMENT);
            }
            IMessageManager iMessageManager = (IMessageManager) this.dataCenter.get("data_message_manager");
            if (iMessageManager != null) {
                iMessageManager.insertMessage(mVar, true);
            }
            C9097a.m27146a().mo22267a((Object) new C4421am(mVar));
            if (!this.f15733a) {
                HashMap hashMap = new HashMap();
                C9143f fVar = (C9143f) this.dataCenter.get("data_lottery_data_model", null);
                if (fVar != null && (fVar.f24846a instanceof LotteryWaiting)) {
                    hashMap.put("lottery_id", String.valueOf(((LotteryWaiting) fVar.f24846a).getLotteryId()));
                }
                if (this.f15748r == null || !this.f15748r.equals(mVar.f23625b) || !this.f15750t || this.f15751u == null) {
                    try {
                        hashMap.put("comment_id", String.valueOf(mVar.f23624a));
                        hashMap.put("to_user_id", String.valueOf(this.f15734b.getOwner().getId()));
                        hashMap.put("live_source", this.f15743m);
                        if (!TextUtils.isEmpty(this.f15734b.getSourceType())) {
                            hashMap.put("moment_room_source", this.f15734b.getSourceType());
                        }
                    } catch (Exception unused) {
                    }
                    C8443c.m25663a().mo21606a("audience_live_message", hashMap, new C8438j().mo21599b("live_interact"), Room.class, new C8439k());
                    return;
                }
                C5022h.m16105a(this.f15751u, (Map<String, String>) hashMap);
                this.f15751u = null;
            }
        }
    }
}
