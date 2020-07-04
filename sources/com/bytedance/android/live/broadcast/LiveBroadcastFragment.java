package com.bytedance.android.live.broadcast;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.telephony.TelephonyManager;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.commerce.DouPlusEntry;
import com.bytedance.android.live.broadcast.PhoneStateReceiver.C2402a;
import com.bytedance.android.live.broadcast.api.C2412a;
import com.bytedance.android.live.broadcast.api.C2412a.C2413a;
import com.bytedance.android.live.broadcast.api.C2412a.C2414b;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.model.C2438c;
import com.bytedance.android.live.broadcast.api.model.C2439d;
import com.bytedance.android.live.broadcast.api.p126b.C2421c;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.api.p127c.C2430b;
import com.bytedance.android.live.broadcast.dialog.IllegalReviewDialog;
import com.bytedance.android.live.broadcast.dutygift.DutyGiftControlWidget;
import com.bytedance.android.live.broadcast.effect.C2581a;
import com.bytedance.android.live.broadcast.effect.C2619g;
import com.bytedance.android.live.broadcast.effect.C2624k;
import com.bytedance.android.live.broadcast.effect.C2636q;
import com.bytedance.android.live.broadcast.effect.LiveBeautyDialogFragment;
import com.bytedance.android.live.broadcast.effect.LiveBeautyFragment.C2576a;
import com.bytedance.android.live.broadcast.effect.LiveFilterDialogFragment;
import com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter.C2585a;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.broadcast.effect.sticker.C2673n;
import com.bytedance.android.live.broadcast.monitor.BroadcastMonitor;
import com.bytedance.android.live.broadcast.monitor.C2760c;
import com.bytedance.android.live.broadcast.monitor.C2761d;
import com.bytedance.android.live.broadcast.monitor.C2762e;
import com.bytedance.android.live.broadcast.p129b.C2442a;
import com.bytedance.android.live.broadcast.p129b.C2442a.C2443a;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.broadcast.p133d.C2517a;
import com.bytedance.android.live.broadcast.p133d.C2518b;
import com.bytedance.android.live.broadcast.stream.C2967c;
import com.bytedance.android.live.broadcast.stream.C2977d.C2978a;
import com.bytedance.android.live.broadcast.stream.monitor.C2980a;
import com.bytedance.android.live.broadcast.stream.p141a.C2958f;
import com.bytedance.android.live.broadcast.stream.p143b.C2965a;
import com.bytedance.android.live.broadcast.stream.p143b.C2966b;
import com.bytedance.android.live.broadcast.stream.p144c.C2976b;
import com.bytedance.android.live.broadcast.widget.AbsCaptureWidget;
import com.bytedance.android.live.broadcast.widget.AudioWidget;
import com.bytedance.android.live.broadcast.widget.C3111g;
import com.bytedance.android.live.broadcast.widget.VideoWidget2;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.performance.C3222b;
import com.bytedance.android.live.core.performance.TimeCostUtil;
import com.bytedance.android.live.core.performance.TimeCostUtil.Tag;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3387g;
import com.bytedance.android.live.core.utils.SlideFinishUtil;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.C3435e;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.room.C3486d;
import com.bytedance.android.live.room.C3486d.C3487a;
import com.bytedance.android.live.room.C3489f;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.p175c.C3511a;
import com.bytedance.android.live.uikit.p175c.C3516d;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.C3850ab;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.event.C4448r;
import com.bytedance.android.livesdk.chatroom.event.C4450t;
import com.bytedance.android.livesdk.chatroom.event.C4452v;
import com.bytedance.android.livesdk.chatroom.interact.C4487am;
import com.bytedance.android.livesdk.chatroom.p220ui.C5290du;
import com.bytedance.android.livesdk.chatroom.p220ui.C5290du.C5296b;
import com.bytedance.android.livesdk.chatroom.p220ui.C5290du.C5297c;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C8164p;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.alog.TTLiveALogTag;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p404a.C8423n;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.message.model.C8540cb;
import com.bytedance.android.livesdk.p368g.p369a.C7852a;
import com.bytedance.android.livesdk.p368g.p370b.C7853a;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9074l;
import com.bytedance.android.livesdk.utils.C9092w;
import com.bytedance.android.livesdk.widget.C9252i;
import com.bytedance.android.livesdk.widget.C9252i.C9253a;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.android.livesdkapi.depend.model.live.C9383t;
import com.bytedance.android.livesdkapi.depend.model.live.C9386v;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9348c;
import com.bytedance.android.livesdkapi.depend.p439b.C9300c;
import com.bytedance.android.livesdkapi.p447e.C9394a;
import com.bytedance.android.livesdkapi.p447e.C9399d;
import com.bytedance.android.livesdkapi.plugin.PluginType;
import com.bytedance.android.message.IMessageService;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.facebook.imagepipeline.request.C13842b;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.p280ss.avframework.engine.MediaEngineFactory;
import com.p280ss.avframework.livestreamv2.ILiveStream.CatchVideoCallback;
import com.p280ss.avframework.utils.AVLog;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class LiveBroadcastFragment extends BaseFragment implements C0053p<KVData>, C2402a, C2412a, C2430b, C2443a, C2517a, C2958f, C6310a {

    /* renamed from: M */
    private static final int[][] f7876M = {new int[]{C34943c.f91127w, VETransitionFilterParam.TransitionDuration_DEFAULT, 800, 1}, new int[]{C34943c.f91127w, 800, 1200, 3}};

    /* renamed from: A */
    private boolean f7877A;

    /* renamed from: B */
    private C3489f f7878B;

    /* renamed from: C */
    private C2976b f7879C;

    /* renamed from: D */
    private C2429a f7880D;

    /* renamed from: E */
    private String f7881E;

    /* renamed from: F */
    private CharSequence f7882F;

    /* renamed from: G */
    private CharSequence f7883G;

    /* renamed from: H */
    private CharSequence f7884H;

    /* renamed from: I */
    private PhoneStateReceiver f7885I;

    /* renamed from: J */
    private C2518b f7886J;

    /* renamed from: K */
    private DutyGiftControlWidget f7887K;

    /* renamed from: L */
    private C3435e f7888L = new C3435e() {
        /* renamed from: a */
        public final void mo8799a(List<C8149d> list) {
            if (LiveBroadcastFragment.this.f7890a != null && !LiveBroadcastFragment.this.f7890a.isLiveTypeAudio()) {
                C2673n.m10880a(LiveBroadcastFragment.this.f7890a.getId());
            }
        }

        /* renamed from: b */
        public final void mo8800b(List<GiftPage> list) {
            if (LiveBroadcastFragment.this.f7890a != null && !LiveBroadcastFragment.this.f7890a.isLiveTypeAudio()) {
                C2673n.m10880a(LiveBroadcastFragment.this.f7890a.getId());
            }
        }
    };

    /* renamed from: N */
    private boolean f7889N;

    /* renamed from: a */
    public Room f7890a;

    /* renamed from: b */
    public DataCenter f7891b;

    /* renamed from: c */
    public C5290du f7892c;

    /* renamed from: d */
    public C2442a f7893d;

    /* renamed from: e */
    public LiveDialogFragment f7894e;

    /* renamed from: f */
    public LiveFilterDialogFragment f7895f;

    /* renamed from: g */
    public AbsCaptureWidget f7896g;

    /* renamed from: h */
    C47562b f7897h = new C47562b();

    /* renamed from: i */
    C47562b f7898i = new C47562b();

    /* renamed from: j */
    public C2585a f7899j = new C2585a() {
        /* renamed from: a */
        public final void mo8810a(int i) {
            boolean z;
            if (LiveBroadcastFragment.this.f7896g instanceof C3111g) {
                C2619g g = ((C3111g) LiveBroadcastFragment.this.f7896g).mo9882g();
                if (g == null) {
                    C3166a.m11966e("LiveBroadcastFragment", "filterHelper is null!");
                    return;
                }
                int b = g.mo9250b();
                float a = C2619g.m10718a(C2624k.m10736a().f8419b, i);
                if (!((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.mo10240a()).booleanValue()) {
                    C2581a h = ((C3111g) LiveBroadcastFragment.this.f7896g).mo9883h();
                    if (h.f8290d > (((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21217a.f21222a * a) / 100.0f) {
                        h.mo9201d(a / 100.0f);
                    }
                } else if (!C6311g.m19573a(C2624k.m10736a().f8419b) && i >= 0 && i < C2624k.m10736a().f8419b.size()) {
                    C9355c b2 = C2515f.m10417f().mo9075b().mo9212a().mo9322b(C2663f.m10856a("beautyTag", (FilterModel) C2624k.m10736a().f8419b.get(i)));
                    if (!(b2 == null || b2.f25570i == null)) {
                        C2421c a2 = C2515f.m10417f().mo9074a();
                        a2.mo8892a(C2418b.f7953d, b2);
                        Float c = a2.mo8899c(b2.f25570i.f25589b);
                        if (c == null) {
                            c = Float.valueOf(C2636q.m10771a(b2, b2.f25570i.f25588a));
                        }
                        int i2 = (int) a;
                        if (c.floatValue() > C2636q.m10771a(b2, i2)) {
                            a2.mo8891a(b2.f25570i.f25589b, C2636q.m10771a(b2, i2));
                        }
                    }
                }
                g.mo9244a(i);
                C3111g gVar = (C3111g) LiveBroadcastFragment.this.f7896g;
                if (i < b) {
                    z = true;
                } else {
                    z = false;
                }
                gVar.mo9880a(z);
            }
            String str = "";
            List<FilterModel> list = C2624k.m10736a().f8419b;
            if (i < list.size()) {
                str = ((FilterModel) list.get(i)).getFilterId();
            }
            if (!C6319n.m19593a(str) && !str.equals("0")) {
                LiveBroadcastFragment.this.f7891b.lambda$put$1$DataCenter("cmd_toolbar_click_filter", str);
                HashMap hashMap = new HashMap();
                hashMap.put("action_type", "click");
                hashMap.put("filter_id", str);
                C8443c.m25663a().mo21606a("live_take_filter_select", LiveBroadcastFragment.this.mo8763a(hashMap), new C8438j().mo21598a("live_take_detail").mo21603f("click").mo21599b("live_take"), new C8439k());
            }
            C2619g.m10719a(LiveBroadcastFragment.this.f7890a.getId());
            C9097a.m27146a().mo22267a((Object) new C2438c(3));
        }
    };

    /* renamed from: k */
    private boolean f7900k = true;

    /* renamed from: l */
    private C9348c f7901l;

    /* renamed from: m */
    private C9383t f7902m;

    /* renamed from: q */
    private boolean f7903q;

    /* renamed from: r */
    private C3486d f7904r;

    /* renamed from: s */
    private C6309f f7905s = new C6309f(this);

    /* renamed from: t */
    private Handler f7906t = new Handler(Looper.getMainLooper());

    /* renamed from: u */
    private Queue<KVData> f7907u = new LinkedList();

    /* renamed from: v */
    private boolean f7908v = false;

    /* renamed from: w */
    private FrameLayout f7909w;

    /* renamed from: x */
    private FrameLayout f7910x;

    /* renamed from: y */
    private HSImageView f7911y;

    /* renamed from: z */
    private IllegalReviewDialog f7912z;

    /* renamed from: com.bytedance.android.live.broadcast.LiveBroadcastFragment$a */
    class C2399a {

        /* renamed from: a */
        int f7929a;

        private C2399a() {
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.LiveBroadcastFragment$b */
    class C2400b implements C5739a {
        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C2400b() {
        }

        public final void onClick(View view) {
            C8443c.m25663a().mo21606a("live_take_beauty_click", LiveBroadcastFragment.this.mo8763a(new HashMap<>()), new C8438j().mo21598a("live_take_detail").mo21603f("click").mo21599b("live_take"), new C8439k());
            if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.mo10240a()).booleanValue()) {
                C2515f.m10417f().mo9075b().mo9213a(LiveBroadcastFragment.this.getActivity(), Boolean.valueOf(false));
                return;
            }
            if (LiveBroadcastFragment.this.f7894e == null) {
                LiveBroadcastFragment.this.f7894e = LiveBeautyDialogFragment.m10554a((C2576a) LiveBroadcastFragment.this.f7896g, LiveBroadcastFragment.this.f7899j, false, 1);
            }
            if (LiveBroadcastFragment.this.f7894e.getDialog() == null || !LiveBroadcastFragment.this.f7894e.getDialog().isShowing()) {
                LiveBroadcastFragment.this.f7894e.show(LiveBroadcastFragment.this.getActivity().getSupportFragmentManager(), "beautyDialogTag");
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.LiveBroadcastFragment$c */
    class C2401c implements C0053p<KVData>, C5739a {

        /* renamed from: a */
        View f7932a;

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        private C2401c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(KVData kVData) {
            if (kVData != null) {
                String key = kVData.getKey();
                char c = 65535;
                if (key.hashCode() == 982604344 && key.equals("cmd_toolbar_click_filter")) {
                    c = 0;
                }
                if (c == 0 && !C2624k.m10736a().mo9270c()) {
                    this.f7932a.setVisibility(8);
                }
            }
        }

        public final void onClick(View view) {
            C8443c.m25663a().mo21606a("live_take_filter_click", LiveBroadcastFragment.this.mo8763a(new HashMap<>()), new C8438j().mo21598a("live_take_detail").mo21603f("click").mo21599b("live_take"), new C8439k());
            if (LiveBroadcastFragment.this.f7895f == null || LiveBroadcastFragment.this.f7895f.getDialog() == null || !LiveBroadcastFragment.this.f7895f.getDialog().isShowing()) {
                LiveBroadcastFragment.this.f7895f = LiveFilterDialogFragment.m10593a(LiveBroadcastFragment.this.f7899j, C2624k.m10736a().f8419b, false);
                LiveBroadcastFragment.this.f7895f.show(LiveBroadcastFragment.this.getActivity().getSupportFragmentManager(), "filterDialogTag");
            }
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
            dataCenter.removeObserver(this);
        }

        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
            this.f7932a = view.findViewById(R.id.cqx);
            if (C2624k.m10736a().mo9270c()) {
                this.f7932a.setVisibility(0);
            }
            dataCenter.observe("cmd_toolbar_click_filter", this);
        }
    }

    public void onEvent(C2439d dVar) {
    }

    /* renamed from: a */
    private void m10053a(Object obj) {
        if (obj instanceof C9394a) {
            final C9394a aVar = (C9394a) obj;
            try {
                final String str = (String) aVar.mo23109a();
                Bundle bundle = new Bundle();
                bundle.putInt("mode", 1);
                bundle.putString("outputPathOrigin", "");
                bundle.putString("outputPathWithEffect", str);
                bundle.putInt("interval", 0);
                bundle.putInt("frameCount", 1);
                this.f7880D.mo8918a(bundle, (CatchVideoCallback) new CatchVideoCallback() {
                    public final void onComplete() {
                    }

                    public final void onError(int i, String str) {
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo8764a() {
        this.f7906t.removeCallbacksAndMessages(null);
        this.f7880D.mo8917a();
        if (this.f7890a != null && this.f7890a.isLiveTypeAudio()) {
            this.f7880D.mo8931f();
        }
    }

    /* renamed from: a */
    public final void mo8766a(int i) {
        String str = "";
        int i2 = BaseNotice.HASHTAG;
        int i3 = 1;
        switch (i) {
            case 1:
                str = "stream push failed";
                i3 = 6;
                break;
            case 2:
                i2 = 104;
                str = "enter background timeout";
                break;
            case 3:
                C3517a.m12960a(getContext(), (int) R.string.f0m);
                str = "broadcast error";
                break;
            default:
                i2 = 0;
                break;
        }
        if (i > 0) {
            C3517a.m12962a(getContext(), getString(R.string.f0k));
            BroadcastMonitor.m11030a(false, i2, str);
            StringBuilder sb = new StringBuilder("room close onStreamEnd code:");
            sb.append(i);
            C3166a.m11961b("LiveBroadcastFragment", sb.toString());
            m10065u();
            this.f7879C.mo9746a(i3);
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("errCode", String.valueOf(i2));
        hashMap.put("errMsg", str);
        TimeCostUtil.m12200a(Tag.CreateLive, hashMap);
    }

    /* renamed from: a */
    public final void mo8768a(CharSequence charSequence) {
        if (mo8989l()) {
            m10043A();
            this.f7892c.mo13556a(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo8774a(boolean z, String str) {
        if (mo8989l()) {
            m10043A();
            this.f7892c.mo13558a(z, str);
        }
    }

    /* renamed from: a */
    public final void mo8773a(boolean z, CharSequence charSequence, String str) {
        if (mo8989l()) {
            m10043A();
            this.f7892c.mo13557a(false, null, new OnClickListener(null) {
                public final void onClick(View view) {
                    ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(LiveBroadcastFragment.this.getContext(), C3979c.m13952b(null).mo11551a(true));
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo8771a(boolean z) {
        if (mo8989l() && this.f7892c != null) {
            m10043A();
            if (z) {
                this.f7892c.setCancelable(false);
                this.f7892c.show();
                this.f7892c.mo13555a((OnClickListener) new OnClickListener() {
                    public final void onClick(View view) {
                        if (LiveBroadcastFragment.this.f7893d != null) {
                            LiveBroadcastFragment.this.f7893d.mo8968b();
                            LiveBroadcastFragment.this.f7892c.dismiss();
                        }
                    }
                });
                this.f7892c.f15465a = new C5296b() {
                    /* renamed from: a */
                    public final void mo8803a() {
                        C3517a.m12963a(LiveBroadcastFragment.this.getContext(), C3358ac.m12515a((int) R.string.ezh), 1);
                    }
                };
                this.f7892c.f15466b = new C5297c() {
                    /* renamed from: a */
                    public final void mo8804a() {
                        C3517a.m12963a(LiveBroadcastFragment.this.getContext(), C3358ac.m12515a((int) R.string.ezh), 1);
                    }
                };
                return;
            }
            this.f7892c.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo8772a(boolean z, CharSequence charSequence, CharSequence charSequence2) {
        if (mo8989l() && this.f7904r != null) {
            this.f7904r.mo10480a(z, charSequence, charSequence2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo8767a(SurfaceView surfaceView) {
        if (!this.f10104p) {
            this.f7910x.removeAllViews();
            LayoutParams layoutParams = new LayoutParams(((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).linkCrossRoomWidget().mo10491a(), ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).linkCrossRoomWidget().mo10492b());
            if (C3387g.m12599a(getActivity())) {
                layoutParams.topMargin = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).linkCrossRoomWidget().mo10493c() + C3358ac.m12525d();
            } else {
                layoutParams.topMargin = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).linkCrossRoomWidget().mo10493c();
            }
            layoutParams.leftMargin = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).linkCrossRoomWidget().mo10491a();
            surfaceView.setLayoutParams(layoutParams);
            this.f7910x.addView(surfaceView);
        }
    }

    /* renamed from: a */
    public final void mo8769a(String str) {
        if (TelephonyManager.EXTRA_STATE_IDLE.equals(str)) {
            this.f7880D.mo8927b();
            return;
        }
        if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(str)) {
            this.f7880D.mo8928c();
        }
    }

    /* renamed from: a */
    public final HashMap<String, String> mo8763a(HashMap<String, String> hashMap) {
        hashMap.put("room_id", String.valueOf(this.f7890a != null ? this.f7890a.getId() : 0));
        return hashMap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo8785h() {
        this.f7911y.setVisibility(8);
    }

    /* renamed from: A */
    private void m10043A() {
        if (this.f7892c == null) {
            this.f7892c = C5290du.m16945a((Context) getActivity(), 1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d_ */
    public final /* synthetic */ void mo8781d_() {
        m10058c(1);
        m10065u();
        BroadcastMonitor.m11030a(true, 0, null);
    }

    /* renamed from: e */
    public final void mo8782e() {
        if (mo8989l()) {
            m10044B();
        }
    }

    /* renamed from: f */
    public final void mo8783f() {
        C3517a.m12960a(getContext(), (int) R.string.f34);
    }

    /* renamed from: g */
    public final void mo8784g() {
        m10058c(8);
        C3166a.m11961b("LiveBroadcastFragment", "room close forceEndLive");
        m10065u();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo8787i() {
        if (!this.f10104p) {
            this.f7910x.removeAllViews();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ boolean mo8791n() {
        getActivity().finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        this.f7901l.mo22811a(this.f7885I);
        this.f7880D.mo8928c();
    }

    /* renamed from: v */
    private boolean m10066v() {
        if (!((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_USE_NEW_BROADCAST_END.mo10240a()).booleanValue() || TextUtils.isEmpty(this.f7890a.finish_url)) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    private void m10067w() {
        if (this.f10102n && !this.f7877A && !this.f7908v) {
            m10068x();
        }
    }

    /* renamed from: z */
    private void m10070z() {
        m10058c(1);
        C3517a.m12961a(getContext(), (int) R.string.f5g, 1);
        getActivity().finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo8788j() {
        if (!this.f10104p) {
            LayoutParams layoutParams = (LayoutParams) this.f7909w.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            this.f7909w.setLayoutParams(layoutParams);
        }
    }

    public void onStop() {
        super.onStop();
        this.f7898i.mo119660a();
        if (!this.f7877A && this.f7879C != null) {
            this.f7879C.mo9748c();
        }
    }

    /* renamed from: B */
    private void m10044B() {
        if (this.f7912z == null) {
            this.f7912z = IllegalReviewDialog.m10429a(getContext(), this.f7893d);
            this.f7893d.f7979c = this.f7912z;
        }
        if (getActivity() != null) {
            this.f7912z.show(getActivity().getSupportFragmentManager(), "IllegalReviewDialog");
        }
    }

    /* renamed from: C */
    private void m10045C() {
        if (this.f7909w != null && ((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_FIX_LIVE_END.mo10240a()).booleanValue()) {
            LayoutParams layoutParams = (LayoutParams) this.f7909w.getLayoutParams();
            layoutParams.leftMargin = 1;
            layoutParams.rightMargin = 1;
            this.f7909w.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: q */
    private int[] m10061q() {
        int intValue = ((Integer) LiveSettingKeys.STREAM_DEFINITION_LEVEL.mo10240a()).intValue();
        if (intValue > 0 && intValue <= f7876M.length) {
            return f7876M[intValue - 1];
        }
        return new int[]{this.f7902m.mo23063c(), this.f7902m.mo23064d(), this.f7902m.mo23065e(), this.f7902m.f25784h};
    }

    /* renamed from: r */
    private void m10062r() {
        int i = this.f7890a.getStreamUrl().f25604c;
        String str = this.f7902m.f25777a;
        if (2 == i && !C6319n.m19593a(str)) {
            ((C3495l) C3596c.m13172a(C3495l.class)).roomManager().mo10515a((Handler) this.f7905s, str);
            this.f7903q = true;
        }
    }

    /* renamed from: t */
    private void m10064t() {
        if (this.f7904r != null) {
            if (this.f7896g != null) {
                this.f7896g.mo9785e();
            }
            this.f7904r.mo10482d();
            getActivity().getSupportFragmentManager().mo2645a().mo2587a((Fragment) this.f7904r).mo2610f();
            this.f7904r = null;
            C3850ab.m13691a().mo11396b();
        }
    }

    /* renamed from: u */
    private void m10065u() {
        this.f7877A = true;
        if (mo8989l()) {
            if (this.f7895f != null) {
                this.f7895f.dismiss();
            }
            if (this.f7894e != null) {
                this.f7894e.dismiss();
            }
            if (this.f7887K != null) {
                this.f7887K.mo9121c();
            }
            C3596c.m13172a(C9399d.class);
            this.f7905s.post(new C2731g(this));
        }
    }

    /* renamed from: d */
    public final void mo8780d() {
        C3517a.m12960a(getContext(), (int) R.string.f30);
        HashMap hashMap = new HashMap();
        hashMap.put("error_type", "2");
        C8443c.m25663a().mo21606a("livesdk_anchor_network_error", hashMap, new Object[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ void mo8792o() {
        if (this.f7904r != null) {
            ((C3111g) this.f7896g).mo9881f();
            if (this.f7904r != null && (this.f7896g instanceof VideoWidget2)) {
                ((VideoWidget2) this.f7896g).mo9877a(this.f7904r.mo10483e(), this.f7904r.getChildFragmentManager());
            }
        }
    }

    /* renamed from: x */
    private void m10068x() {
        if (this.f7890a != null && this.f7906t != null && this.f7880D != null && this.f7905s != null) {
            this.f7906t.removeCallbacksAndMessages(null);
            if (!this.f7877A) {
                if (TextUtils.isEmpty(this.f7890a.getStreamUrl().f25618q)) {
                    this.f7890a.getStreamUrl().f25618q = this.f7890a.getStreamUrl().mo23050a();
                }
                if (this.f7890a != null && this.f7890a.isLiveTypeAudio()) {
                    this.f7880D.mo8930e();
                }
                if (((Boolean) LiveConfigSettingKeys.LIVE_STREAM_ENABLE_URL_LIST.mo10240a()).booleanValue()) {
                    this.f7880D.mo8924a(this.f7890a.getStreamUrl().f25606e);
                } else {
                    this.f7880D.mo8923a(this.f7890a.getStreamUrl().f25618q);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo8779c() {
        if (mo8989l() && this.f7904r != null) {
            this.f7904r.mo10474a(0.0f);
        }
        if (!this.f7877A) {
            C3517a.m12960a(getContext(), (int) R.string.f0l);
            HashMap hashMap = new HashMap();
            hashMap.put("error_type", "1");
            C8443c.m25663a().mo21606a("livesdk_anchor_network_error", hashMap, new Object[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo8789k() {
        if (!this.f10104p) {
            LayoutParams layoutParams = (LayoutParams) this.f7909w.getLayoutParams();
            layoutParams.width = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).linkCrossRoomWidget().mo10491a();
            layoutParams.height = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).linkCrossRoomWidget().mo10492b();
            layoutParams.gravity = 3;
            if (C3387g.m12599a(getContext())) {
                layoutParams.topMargin = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).linkCrossRoomWidget().mo10493c() + C3358ac.m12525d();
            } else {
                layoutParams.topMargin = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).linkCrossRoomWidget().mo10493c();
            }
            this.f7909w.setLayoutParams(layoutParams);
            if (this.f7887K != null) {
                this.f7887K.mo9119a(true);
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.f7898i.mo119660a();
        m10054b(C8164p.class);
        m10054b(C4452v.class);
        m10054b(C9300c.class);
        m10054b(C7852a.class);
        this.f7901l.mo22812a(this.f7885I, new IntentFilter("android.intent.action.PHONE_STATE"));
        if (this.f7877A) {
            this.f7905s.removeCallbacksAndMessages(null);
            return;
        }
        this.f7880D.mo8927b();
        this.f7879C.mo9747b();
        while (!this.f7907u.isEmpty()) {
            onChanged((KVData) this.f7907u.poll());
        }
    }

    /* renamed from: s */
    private void m10063s() {
        Bundle bundle;
        LiveMode liveMode;
        TimeCostUtil.m12208b(Tag.ShowBInteractionFirstWidget);
        C3222b.m12218a().mo10137a(Tag.ShowBInteractionFirstWidget.name(), (C0043i) this, getContext());
        C3222b.m12218a().mo10146b(Tag.ShowBInteractionFirstWidget.name(), (C0043i) this, getContext());
        C0608j supportFragmentManager = getActivity().getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2644a("AbsInteractionFragment");
        if (a != null) {
            supportFragmentManager.mo2645a().mo2587a(a).mo2606d();
        }
        if (getArguments() != null) {
            bundle = getArguments().getBundle("extra");
        } else {
            bundle = null;
        }
        this.f7904r = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).createInteractionFragment(1);
        this.f7904r.setArguments(bundle);
        this.f7904r.mo10475a(this.f7880D);
        this.f7891b.lambda$put$1$DataCenter("data_room", this.f7890a);
        this.f7904r.mo10478a(this.f7891b, true, new C3487a() {
            /* renamed from: a */
            public final void mo8807a(C8540cb cbVar) {
                if (LiveBroadcastFragment.this.f7893d != null) {
                    LiveBroadcastFragment.this.f7893d.mo8965a(cbVar);
                }
            }
        }, null);
        if (!this.f7890a.isLiveTypeAudio()) {
            this.f7904r.mo10476a((C4487am) this.f7896g);
            ((C3111g) this.f7896g).mo9879a((C2414b) this.f7904r);
            ((C3111g) this.f7896g).mo9878a((C2413a) this.f7904r);
            this.f7904r.mo10479a((Runnable) new C2516d(this));
        }
        C3486d dVar = this.f7904r;
        if (this.f7890a.isLiveTypeAudio()) {
            liveMode = LiveMode.AUDIO;
        } else {
            liveMode = LiveMode.VIDEO;
        }
        dVar.mo10477a(liveMode);
        this.f7904r.show(getActivity().getSupportFragmentManager(), "AbsInteractionFragment");
    }

    /* renamed from: y */
    private void m10069y() {
        Object obj;
        int i;
        String str;
        CharSequence charSequence = 0;
        if (this.f7891b != null) {
            obj = this.f7891b.get("data_member_count");
        } else {
            obj = null;
        }
        if (obj == null || !(obj instanceof Integer)) {
            i = 0;
        } else {
            i = ((Integer) obj).intValue();
        }
        if (i <= 0) {
            str = getResources().getString(R.string.epi);
        } else {
            str = getResources().getQuantityString(R.plurals.a4, i, new Object[]{Integer.valueOf(i)});
        }
        if (!TextUtils.isEmpty(str) && i > 0) {
            String valueOf = String.valueOf(i);
            int indexOf = str.indexOf(valueOf);
            if (indexOf != -1) {
                Spannable spannableString = new SpannableString(str);
                spannableString.setSpan(new ForegroundColorSpan(-56832), indexOf, valueOf.length() + indexOf, 34);
                charSequence = spannableString;
            }
        }
        long j = 0;
        if (this.f7890a != null) {
            j = this.f7890a.getId();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(j));
        C8443c.m25663a().mo21606a("anchor_close_live_popup", hashMap, new C8438j().mo21598a("live_take_detail").mo21603f("click").mo21599b("live_take"), new C8439k());
        C9252i.m27529a();
        C9253a d = C9252i.m27528a(getContext()).mo22730d((int) R.string.fez);
        if (charSequence == 0) {
            charSequence = str;
        }
        d.mo22727c(charSequence).mo22722b(0, (int) R.string.f96, (DialogInterface.OnClickListener) new C2743h(this, hashMap)).mo22722b(1, (int) R.string.ecm, (DialogInterface.OnClickListener) new C2744i(this, hashMap)).mo22729d();
    }

    public void onDestroy() {
        this.f7891b.removeObserver(this);
        m10064t();
        this.f7891b.removeObserver(this);
        if (this.f7886J != null) {
            this.f7886J.mo9084a();
        }
        if (this.f7893d != null) {
            this.f7893d.mo8963a();
            this.f7893d = null;
        }
        if (this.f7892c != null) {
            this.f7892c.dismiss();
            this.f7892c = null;
        }
        if (this.f7880D != null) {
            this.f7880D.mo8929d();
        }
        if (this.f7891b != null) {
            this.f7891b.removeObserver(this);
        }
        if (this.f7897h != null) {
            this.f7897h.mo119660a();
        }
        if (this.f7890a != null) {
            ((IMessageService) C3596c.m13172a(IMessageService.class)).release(this.f7890a.getId());
            LinkCrossRoomDataHolder.m13784a(this.f7890a.getId());
        }
        this.f7905s.removeCallbacksAndMessages(null);
        ((C3495l) C3596c.m13172a(C3495l.class)).setCurrentRoom(null);
        C3596c.m13172a(C9399d.class);
        C3912d.m13795a().mo11456b();
        if (this.f7890a != null) {
            this.f7890a.getId();
        }
        ((C3450b) C3596c.m13172a(C3450b.class)).getLivePlayController().mo10509c();
        try {
            ((IGiftService) C3596c.m13172a(IGiftService.class)).clearAssets("effects");
        } catch (IllegalStateException unused) {
        }
        super.onDestroy();
        BroadcastMonitor.m11032b(false);
    }

    /* renamed from: b */
    public final void mo8775b() {
        if (this.f7904r != null) {
            this.f7904r.mo10484f();
        }
        TimeCostUtil.m12209c(Tag.CreateLive);
        C3222b.m12218a().mo10134a(Tag.CreateLive.name());
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0106 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo8790m() {
        /*
            r6 = this;
            boolean r0 = r6.mo8989l()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r6.f7891b
            if (r0 == 0) goto L_0x0017
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r6.f7891b
            java.lang.String r1 = "cmd_dismiss_dialog_end"
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r0.lambda$put$1$DataCenter(r1, r2)
        L_0x0017:
            r6.m10064t()
            com.bytedance.android.live.room.f r0 = r6.f7878B
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = "LiveBroadcastFragment"
            java.lang.String r1 = "room close new LiveBroadcastEndFragment"
            com.bytedance.android.live.core.p147c.C3166a.m11961b(r0, r1)
            java.lang.Class<com.bytedance.android.live.room.ILiveSDKService> r0 = com.bytedance.android.live.room.ILiveSDKService.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.C3596c.m13172a(r0)
            com.bytedance.android.live.room.ILiveSDKService r0 = (com.bytedance.android.live.room.ILiveSDKService) r0
            boolean r1 = r6.m10066v()
            com.bytedance.android.live.room.f r0 = r0.createLiveBroadcastEndFragment(r1)
            r6.f7878B = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "live_end_banned_url"
            java.lang.String r2 = r6.f7881E
            r0.putString(r1, r2)
            java.lang.String r1 = "live_end_banned_title"
            java.lang.CharSequence r2 = r6.f7882F
            r0.putCharSequence(r1, r2)
            java.lang.String r1 = "live_end_banned_reason"
            java.lang.CharSequence r2 = r6.f7883G
            r0.putCharSequence(r1, r2)
            java.lang.String r1 = "live_end_banned_content"
            java.lang.CharSequence r2 = r6.f7884H
            r0.putCharSequence(r1, r2)
            com.bytedance.android.live.room.f r1 = r6.f7878B
            r1.setArguments(r0)
            goto L_0x0082
        L_0x005e:
            com.bytedance.android.live.room.f r0 = r6.f7878B
            android.os.Bundle r0 = r0.getArguments()
            if (r0 == 0) goto L_0x0082
            java.lang.String r1 = "live_end_banned_url"
            java.lang.String r2 = r6.f7881E
            r0.putString(r1, r2)
            java.lang.String r1 = "live_end_banned_title"
            java.lang.CharSequence r2 = r6.f7882F
            r0.putCharSequence(r1, r2)
            java.lang.String r1 = "live_end_banned_reason"
            java.lang.CharSequence r2 = r6.f7883G
            r0.putCharSequence(r1, r2)
            java.lang.String r1 = "live_end_banned_content"
            java.lang.CharSequence r2 = r6.f7884H
            r0.putCharSequence(r1, r2)
        L_0x0082:
            com.bytedance.android.live.room.f r0 = r6.f7878B
            r0.mo10495a(r6)
            com.bytedance.android.live.room.f r0 = r6.f7878B
            android.support.v4.app.FragmentActivity r1 = r6.getActivity()
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r6.f7890a
            com.bytedance.android.live.broadcast.f r3 = new com.bytedance.android.live.broadcast.f
            r3.<init>(r6)
            java.lang.String r4 = ""
            r0.mo10494a(r1, r2, r3, r4)
            android.support.v4.app.FragmentActivity r0 = r6.getActivity()
            android.support.v4.app.j r0 = r0.getSupportFragmentManager()
            android.view.View r1 = r6.getView()
            r2 = 2131297826(0x7f090622, float:1.8213608E38)
            android.view.View r1 = r1.findViewById(r2)
            r3 = 0
            r1.setVisibility(r3)
            android.support.v4.app.Fragment r1 = r0.mo2642a(r2)
            if (r1 != 0) goto L_0x0120
            boolean r1 = r6.f7900k
            if (r1 == 0) goto L_0x0120
            r6.f7900k = r3
            java.lang.Class r1 = r0.getClass()     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x0106, Exception -> 0x00ee }
            java.lang.String r3 = "mAdded"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x0106, Exception -> 0x00ee }
            r3 = 1
            r1.setAccessible(r3)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x0106, Exception -> 0x00ee }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x0106, Exception -> 0x00ee }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x0106, Exception -> 0x00ee }
            if (r1 == 0) goto L_0x0106
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x0106, Exception -> 0x00ee }
        L_0x00d6:
            boolean r3 = r1.hasNext()     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x0106, Exception -> 0x00ee }
            if (r3 == 0) goto L_0x0106
            java.lang.Object r3 = r1.next()     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x0106, Exception -> 0x00ee }
            android.support.v4.app.Fragment r3 = (android.support.p022v4.app.Fragment) r3     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x0106, Exception -> 0x00ee }
            boolean r3 = r3 instanceof com.bytedance.android.live.room.C3489f     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x0106, Exception -> 0x00ee }
            if (r3 == 0) goto L_0x00d6
            java.lang.String r1 = "LiveBroadcastFragment"
            java.lang.String r3 = "multiple LiveBroadcastEndFragment found."
            com.bytedance.android.live.core.p147c.C3166a.m11966e(r1, r3)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x0106, Exception -> 0x00ee }
            return
        L_0x00ee:
            r1 = move-exception
            java.lang.String r3 = "LiveBroadcastFragment"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "showLiveEndDialog:"
            r4.<init>(r5)
            java.lang.String r1 = r1.toString()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.bytedance.android.live.core.p147c.C3166a.m11966e(r3, r1)
        L_0x0106:
            android.support.v4.app.q r0 = r0.mo2645a()     // Catch:{ Throwable -> 0x0116 }
            com.bytedance.android.live.room.f r1 = r6.f7878B     // Catch:{ Throwable -> 0x0116 }
            android.support.v4.app.Fragment r1 = (android.support.p022v4.app.Fragment) r1     // Catch:{ Throwable -> 0x0116 }
            android.support.v4.app.q r0 = r0.mo2585a(r2, r1)     // Catch:{ Throwable -> 0x0116 }
            r0.mo2610f()     // Catch:{ Throwable -> 0x0116 }
            return
        L_0x0116:
            r0 = move-exception
            java.lang.String r1 = "LiveBroadcastFragmentadd LiveBroadcastEndFragment"
            java.lang.String r0 = r0.toString()
            com.bytedance.android.live.core.p147c.C3166a.m11966e(r1, r0)
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.LiveBroadcastFragment.mo8790m():void");
    }

    /* renamed from: p */
    private void m10060p() {
        boolean z;
        String str;
        int i;
        int i2;
        this.f7886J = new C2518b(this.f7890a);
        this.f7886J.f8105a = this;
        this.f7879C = new C2976b(this.f7886J);
        this.f7879C.mo9745a();
        boolean isLiveTypeAudio = this.f7890a.isLiveTypeAudio();
        int[] q = m10061q();
        int intValue = ((Integer) LiveSettingKeys.STREAM_HARDWARE_ENCODE.mo10240a()).intValue();
        int i3 = 2;
        boolean z2 = true;
        if (intValue <= 0) {
            z = this.f7902m.f25785i;
        } else if (intValue == 2) {
            z = true;
        } else {
            z = false;
        }
        int b = this.f7902m.mo23062b();
        int a = this.f7902m.mo23061a();
        if (((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.mo10240a()).length == 2) {
            b = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.mo10240a())[0].intValue();
            a = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.mo10240a())[1].intValue();
        }
        int i4 = q[0];
        int i5 = q[1];
        int i6 = q[2];
        int i7 = q[3];
        if (((Integer) LiveConfigSettingKeys.LIVE_STREAM_PROFILE.mo10240a()).intValue() >= 0) {
            i7 = ((Integer) LiveConfigSettingKeys.LIVE_STREAM_PROFILE.mo10240a()).intValue();
        }
        if (((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.mo10240a()).length == 3) {
            i5 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.mo10240a())[0].intValue();
            i4 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.mo10240a())[1].intValue();
            i6 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.mo10240a())[2].intValue();
        }
        int intValue2 = ((Integer) LiveConfigSettingKeys.LIVE_STREAM_BITRATE_ADAPT.mo10240a()).intValue();
        if (intValue2 < 0) {
            intValue2 = this.f7902m.f25786j;
        }
        boolean z3 = this.f7902m.f25794r;
        if (((Boolean) LiveConfigSettingKeys.LIVE_STREAM_HW_ROI.mo10240a()).booleanValue()) {
            z3 = true;
        }
        boolean z4 = this.f7902m.f25795s;
        if (((Boolean) LiveConfigSettingKeys.LIVE_STREAM_SW_ROI.mo10240a()).booleanValue()) {
            z4 = true;
        }
        C2978a h = new C2978a(getContext()).mo9751a(isLiveTypeAudio ? 1 : 0).mo9773f(b).mo9774g(a).mo9766c(i4).mo9763b(i5).mo9769d(i6).mo9775h(i7);
        if (((Boolean) LiveConfigSettingKeys.LIVE_STREAM_ENABLE_SDK_PARAMS.mo10240a()).booleanValue()) {
            str = this.f7890a.getStreamUrl().f25615n;
        } else {
            str = "";
        }
        C2978a l = h.mo9764b(str).mo9771e(this.f7902m.mo23066f()).mo9760a(z).mo9759a(C3358ac.m12515a((int) R.string.fdg)).mo9755a((C2965a) new C2761d()).mo9756a((C2966b) new C2762e()).mo9757a((C2980a) new C2760c()).mo9779l(intValue2);
        if (this.f7902m.f25791o) {
            i = 2;
        } else {
            i = 1;
        }
        C2978a d = l.mo9780m(i).mo9750a(this.f7902m.f25792p).mo9765b(this.f7902m.f25793q).mo9768c(z3).mo9761a(z4, LiveCameraResManager.INST.getROIResPath()).mo9770d(((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_BACKGROUND_STOP_MIC.mo10240a()).booleanValue());
        if (((Integer) LiveSettingKeys.LIVE_USE_NEW_AUDIO_CODEC.mo10240a()).intValue() == 1) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        C2978a i8 = d.mo9776i(i2);
        if (C9074l.m27084a(this.f7890a, this.f7891b)) {
            i8.mo9753a(300000);
        } else {
            i8.mo9753a((long) ((Integer) LiveConfigSettingKeys.LIVE_MAX_ENTER_BACKGROUND_TIME.mo10240a()).intValue());
        }
        int intValue3 = ((Integer) LiveConfigSettingKeys.LIVE_PUSH_STREAM_LOG_LEVEL.mo10240a()).intValue();
        C3166a.m11966e("LiveBroadcastFragment", "setLogLevel");
        MediaEngineFactory.setLogLevel(intValue3);
        AVLog.setupLogIODevice(new C2502c(C8444d.m25673b(), TTLiveALogTag.PushStream.info));
        if (((Integer) C8946b.f24477g.mo22119b()).intValue() != 0) {
            i3 = 1;
        }
        if (this.f7890a.isLiveTypeAudio()) {
            i3 = 4;
        }
        i8.mo9777j(i3).mo9767c(LiveCameraResManager.INST.getModelFilePath()).mo9758a((Object) LiveCameraResManager.INST.getResourceFinder(getContext())).mo9752a(this.f7902m.mo23067g(), this.f7902m.mo23068h());
        if (((Integer) LiveConfigSettingKeys.LIVE_USE_EFFECT_ALGORITHM_mAB.mo10240a()).intValue() != 1) {
            z2 = false;
        }
        i8.mo9772e(z2);
        this.f7880D = new C2967c(i8.mo9762a());
        this.f7880D.mo8920a((C2430b) this);
    }

    /* renamed from: a */
    public final void mo8765a(float f) {
        if (mo8989l() && this.f7904r != null) {
            this.f7904r.mo10474a(f);
        }
    }

    /* renamed from: b */
    public final void mo8777b(CharSequence charSequence) {
        if (mo8989l()) {
            m10043A();
            this.f7892c.mo13559b(charSequence);
        }
    }

    /* renamed from: b */
    private <T> void m10054b(Class<T> cls) {
        this.f7898i.mo119661a(C9097a.m27146a().mo22266a(cls).mo19325f((C7326g<? super T>) new C7326g<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C8164p) {
                    LiveBroadcastFragment.this.onEvent((C8164p) t);
                } else if (t instanceof C4452v) {
                    LiveBroadcastFragment.this.onEvent((C4452v) t);
                } else if (t instanceof C9300c) {
                    LiveBroadcastFragment.this.onEvent((C9300c) t);
                } else {
                    if (t instanceof C7852a) {
                        LiveBroadcastFragment.this.onEvent((C7852a) t);
                    }
                }
            }
        }));
    }

    public void onEvent(C9300c cVar) {
        if (cVar.f25479a == 1) {
            C3517a.m12960a(getContext(), (int) R.string.ey7);
            return;
        }
        if (cVar.f25479a == 0) {
            C3517a.m12960a(getContext(), (int) R.string.eyf);
        }
    }

    /* renamed from: a */
    private <T> void m10052a(Class<T> cls) {
        this.f7897h.mo119661a(C9097a.m27146a().mo22266a(cls).mo19325f((C7326g<? super T>) new C7326g<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C2439d) {
                    LiveBroadcastFragment.this.onEvent((C2439d) t);
                }
            }
        }));
    }

    /* renamed from: b */
    private void m10055b(Object obj) {
        C2399a aVar = new C2399a();
        if (obj instanceof ApiServerException) {
            aVar.f7929a = ((ApiServerException) obj).getErrorCode();
        }
        if (aVar.f7929a == 30001 || aVar.f7929a == 50002 || aVar.f7929a == 30003) {
            StringBuilder sb = new StringBuilder("room close handleUpdateRoomStatusResult errorCode:");
            sb.append(aVar.f7929a);
            C3166a.m11961b("LiveBroadcastFragment", sb.toString());
            m10057b(false);
        }
    }

    /* renamed from: c */
    private void m10058c(int i) {
        if (this.f7904r != null) {
            this.f7904r.mo10481c();
        }
        this.f7879C.mo9746a(i);
        this.f7905s.removeCallbacksAndMessages(null);
        if (this.f7893d != null) {
            this.f7893d.mo8973f();
        }
        mo8764a();
        this.f7877A = true;
        TimeCostUtil.m12209c(Tag.CreateLive);
        C3222b.m12218a().mo10134a(Tag.CreateLive.name());
    }

    public void onActivityCreated(Bundle bundle) {
        SlideFinishUtil.m12463a(getActivity());
        super.onActivityCreated(bundle);
        C0608j supportFragmentManager = getActivity().getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2644a("AbsInteractionFragment");
        if (a != null) {
            try {
                supportFragmentManager.mo2645a().mo2587a(a).mo2610f();
            } catch (Exception e) {
                C8444d.m25673b();
                C8444d.m11969a(6, e.getStackTrace());
            }
        }
    }

    public void onEvent(C7852a aVar) {
        C8443c.m25663a().mo21607a(aVar.f21216a, new C8438j().mo21598a("live_take_detail").mo21603f("click").mo21599b("live_take"), Room.class);
    }

    /* renamed from: a */
    private void m10047a(C4448r rVar) {
        if (rVar.f12904a == 0) {
            this.f7909w.post(new C2746k(this));
        } else if (rVar.f12904a == 1) {
            this.f7909w.post(new C2747l(this));
        } else if (rVar.f12904a != 2) {
            if (rVar.f12904a == 3) {
                this.f7909w.post(new C2763n(this));
            }
        } else if (rVar.f12905b instanceof SurfaceView) {
            this.f7909w.post(new C2748m(this, (SurfaceView) rVar.f12905b));
        }
    }

    /* renamed from: b */
    private void m10056b(HashMap hashMap) {
        C8443c.m25663a().mo21606a("anchor_close_live_cancel", hashMap, new C8438j().mo21598a("live_take_detail").mo21603f("click").mo21599b("live_take"), new C8439k());
        C8448g.m25682a(getContext());
        this.f7890a.getId();
    }

    public void handleMsg(Message message) {
        int i = message.what;
        if (3 == i) {
            m10055b(message.obj);
        } else if (message.obj instanceof Exception) {
            if (13 == i) {
                this.f7903q = false;
                m10067w();
            }
        } else {
            if (13 == i) {
                this.f7903q = false;
                String str = (String) message.obj;
                StreamUrl streamUrl = this.f7890a.getStreamUrl();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f7902m.f25778b);
                streamUrl.f25617p = sb.toString();
                m10067w();
            }
            if (35 == i) {
                m10050a((C9386v) message.obj);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        BroadcastMonitor.m11032b(true);
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        this.f7891b = DataCenter.create(C0069x.m157a((Fragment) this), this);
        PluginType.LiveResource.preload();
        C2404a.m10120a().mo8841b();
        ((C3450b) C3596c.m13172a(C3450b.class)).getLivePlayController().mo10506b();
        this.f7897h.mo119660a();
        m10052a(C2439d.class);
        this.f7891b.observeForever("cmd_interact_state_change", this).observeForever("cmd_pk_state_change", this).observeForever("cmd_screenshot_live_room", this).observeForever("cmd_show_illegal_dialog", this);
    }

    public void onEvent(C8164p pVar) {
        if (this.f7890a != null && !this.f7890a.isLiveTypeAudio()) {
            long j = pVar.f22328a;
            for (C8149d dVar : ((IGiftService) C3596c.m13172a(IGiftService.class)).getStickerGifts()) {
                if (dVar.f22247r == j) {
                    C2673n.m10880a(this.f7890a.getId());
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m10048a(C4450t tVar) {
        if (tVar.f12909a == 7) {
            this.f7908v = true;
            this.f7879C.mo9745a();
        } else if (tVar.f12909a == 8) {
            this.f7908v = false;
        } else if (tVar.f12909a == 10) {
            this.f7910x.removeAllViews();
            SurfaceView surfaceView = (SurfaceView) tVar.f12910b;
            surfaceView.setLayoutParams(new WindowManager.LayoutParams(-1, -1));
            this.f7910x.addView(surfaceView);
        } else {
            if (tVar.f12909a == 11) {
                this.f7910x.removeAllViews();
            }
        }
    }

    /* renamed from: b */
    private void m10057b(boolean z) {
        String str;
        if (!this.f7877A) {
            m10058c(1);
        }
        String str2 = "LiveBroadcastFragment";
        StringBuilder sb = new StringBuilder("room close onLiveEnd endByBanned:");
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        sb.append(str);
        C3166a.m11961b(str2, sb.toString());
        m10065u();
        if (z) {
            BroadcastMonitor.m11030a(false, 103, "room banned");
        } else {
            BroadcastMonitor.m11030a(true, 0, null);
        }
    }

    /* renamed from: c */
    private void m10059c(HashMap hashMap) {
        String str;
        String str2;
        C8443c.m25663a().mo21606a("anchor_close_live_confirm", hashMap, new C8438j().mo21598a("live_take_detail").mo21603f("click").mo21599b("live_take"), new C8439k());
        if (((Boolean) C3912d.m13795a().f11699b).booleanValue()) {
            this.f7911y.postDelayed(new C2745j(this), 1000);
        } else {
            m10058c(1);
            m10065u();
            BroadcastMonitor.m11030a(true, 0, null);
        }
        HashMap hashMap2 = new HashMap();
        String str3 = "use_status";
        if (Boolean.TRUE.equals(this.f7891b.get("data_has_sticker_effective"))) {
            str = "use";
        } else {
            str = "unused";
        }
        hashMap2.put(str3, str);
        C8443c.m25663a().mo21606a("pm_live_sticker_use", mo8763a(hashMap2), new C8438j().mo21598a("anchor_live_ending").mo21603f("other").mo21599b("live_take"), new C8439k());
        HashMap hashMap3 = new HashMap();
        String str4 = "use_status";
        if (Boolean.TRUE.equals(this.f7891b.get("data_has_filter_effective"))) {
            str2 = "use";
        } else {
            str2 = "unused";
        }
        hashMap3.put(str4, str2);
        C8443c.m25663a().mo21606a("pm_live_filter_use", mo8763a(hashMap3), new C8438j().mo21598a("anchor_live_ending").mo21603f("other").mo21599b("live_take"), new C8439k());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onEvent(com.bytedance.android.livesdk.chatroom.event.C4452v r3) {
        /*
            r2 = this;
            int r0 = r3.f12912a
            r1 = 3
            if (r0 == r1) goto L_0x0066
            r1 = 11
            if (r0 == r1) goto L_0x0062
            r1 = 17
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 5: goto L_0x005a;
                case 6: goto L_0x0056;
                case 7: goto L_0x0011;
                case 8: goto L_0x0056;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0059
        L_0x0011:
            com.bytedance.android.livesdk.message.model.c r3 = r3.f12914c
            boolean r0 = r3 instanceof com.bytedance.android.livesdk.message.model.C8688t
            if (r0 == 0) goto L_0x0051
            com.bytedance.android.livesdk.message.model.t r3 = (com.bytedance.android.livesdk.message.model.C8688t) r3
            int r0 = r3.f23670a
            r1 = 4
            if (r0 != r1) goto L_0x0051
            com.bytedance.android.livesdk.message.model.t$a r0 = r3.f23672c
            if (r0 == 0) goto L_0x004c
            com.bytedance.android.livesdk.message.model.t$a r0 = r3.f23672c
            java.lang.String r0 = r0.f23673a
            r2.f7881E = r0
            com.bytedance.android.livesdk.message.model.t$a r0 = r3.f23672c
            com.bytedance.android.livesdkapi.message.f r0 = r0.f23675c
            java.lang.String r1 = ""
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.p212e.C4374z.m14749a(r0, r1)
            r2.f7882F = r0
            com.bytedance.android.livesdk.message.model.t$a r0 = r3.f23672c
            com.bytedance.android.livesdkapi.message.f r0 = r0.f23676d
            java.lang.String r1 = ""
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.p212e.C4374z.m14749a(r0, r1)
            r2.f7883G = r0
            com.bytedance.android.livesdk.message.model.t$a r3 = r3.f23672c
            com.bytedance.android.livesdkapi.message.f r3 = r3.f23677e
            java.lang.String r0 = ""
            android.text.Spannable r3 = com.bytedance.android.livesdk.chatroom.p212e.C4374z.m14749a(r3, r0)
            r2.f7884H = r3
        L_0x004c:
            r3 = 1
            r2.m10057b(r3)
            return
        L_0x0051:
            r3 = 0
            r2.m10057b(r3)
            return
        L_0x0056:
            r2.m10069y()
        L_0x0059:
            return
        L_0x005a:
            android.support.v4.app.FragmentActivity r3 = r2.getActivity()
            r3.finish()
            return
        L_0x0062:
            r2.m10070z()
            return
        L_0x0066:
            boolean r3 = r2.f7903q
            if (r3 == 0) goto L_0x006b
            return
        L_0x006b:
            com.bytedance.android.live.core.widget.HSImageView r3 = r2.f7911y
            r0 = 8
            r3.setVisibility(r0)
            r2.m10067w()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.LiveBroadcastFragment.onEvent(com.bytedance.android.livesdk.chatroom.event.v):void");
    }

    /* renamed from: a */
    private void m10050a(final C9386v vVar) {
        boolean z;
        if (vVar != null) {
            double d = vVar.f25805b;
            long j = vVar.f25808e;
            if (((Double) C8946b.f24455bi.mo22117a()).doubleValue() < 9.0d || d >= 9.0d) {
                z = false;
            } else {
                z = true;
            }
            if (C9386v.f25804a == vVar.f25807d && ((Long) C8946b.f24456bj.mo22117a()).longValue() != j) {
                z = true;
            }
            if (z) {
                new C3511a(getContext()).mo10594a(48).mo10595a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo10600b(true).mo10596a(false).mo10597a((int) R.layout.apq, (C3516d) new C3516d() {
                    /* renamed from: a */
                    public final void mo8808a(View view) {
                        view.setOnClickListener(new OnClickListener() {
                            public final void onClick(View view) {
                                if (!TextUtils.isEmpty(vVar.f25809f)) {
                                    ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(LiveBroadcastFragment.this.getContext(), C3979c.m13952b(vVar.f25809f).mo11551a(true));
                                }
                            }
                        });
                    }
                });
            }
            C8946b.f24455bi.mo22118a(Double.valueOf(d));
            C8946b.f24456bj.mo22118a(Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public final void mo8776b(int i) {
        if (i == 30001 || i == 50002 || i == 30003) {
            StringBuilder sb = new StringBuilder("room close onStatusResult errorCode:");
            sb.append(i);
            C3166a.m11961b("LiveBroadcastFragment", sb.toString());
            m10057b(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (mo8989l() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            if (!this.f10102n) {
                this.f7907u.offer(kVData);
                return;
            }
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1540323875) {
                if (hashCode != -1180299966) {
                    if (hashCode != -553175398) {
                        if (hashCode == 562756910 && key.equals("cmd_show_illegal_dialog")) {
                            c = 2;
                        }
                    } else if (key.equals("cmd_screenshot_live_room")) {
                        c = 3;
                    }
                } else if (key.equals("cmd_interact_state_change")) {
                    c = 0;
                }
            } else if (key.equals("cmd_pk_state_change")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    m10048a((C4450t) kVData.getData());
                    return;
                case 1:
                    m10047a((C4448r) kVData.getData());
                    return;
                case 2:
                    m10044B();
                    this.f7893d.f7978b = false;
                    return;
                case 3:
                    m10053a(kVData.getData());
                    break;
            }
        }
    }

    /* renamed from: a */
    public static LiveBroadcastFragment m10046a(C9348c cVar, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra", bundle);
        LiveBroadcastFragment liveBroadcastFragment = new LiveBroadcastFragment();
        liveBroadcastFragment.setArguments(bundle2);
        liveBroadcastFragment.f7901l = cVar;
        return liveBroadcastFragment;
    }

    public void onViewCreated(View view, Bundle bundle) {
        DouPlusEntry douPlusEntry;
        super.onViewCreated(view, bundle);
        WidgetManager dataCenter = WidgetManager.m32095of((Fragment) this, getView()).setDataCenter(this.f7891b);
        this.f7911y = (HSImageView) getView().findViewById(R.id.bnh);
        this.f7910x = (FrameLayout) getView().findViewById(R.id.fy);
        this.f7909w = (FrameLayout) getView().findViewById(R.id.cj_);
        m10045C();
        this.f7890a = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        this.f7891b.lambda$put$1$DataCenter("data_room", this.f7890a);
        if (getArguments() != null) {
            Bundle bundle2 = getArguments().getBundle("extra");
            if (bundle2 == null) {
                douPlusEntry = null;
            } else {
                douPlusEntry = (DouPlusEntry) bundle2.getSerializable("data_dou_plus_promote_entry");
            }
            C9074l.m27082a(douPlusEntry, this.f7890a, this.f7891b);
        }
        if (!Room.isValid(this.f7890a) || this.f7890a.getStreamUrl() == null) {
            getActivity().finish();
            return;
        }
        C8416g a = C8443c.m25663a().mo21605a(Room.class);
        if (a instanceof C8423n) {
            ((C8423n) a).mo21573a(this.f7890a);
        }
        LinkCrossRoomDataHolder.m13783a(this.f7890a.getId(), C0069x.m157a((Fragment) this), this);
        this.f7902m = this.f7890a.getStreamUrlExtraSafely();
        if (this.f7890a.isLiveTypeAudio()) {
            HSImageView hSImageView = (HSImageView) getView().findViewById(R.id.cmu);
            View findViewById = getView().findViewById(R.id.cmv);
            hSImageView.setVisibility(0);
            findViewById.setVisibility(0);
            C5343e.m17039a(hSImageView, this.f7890a.getOwner().getAvatarLarge(), (C13842b) new C9092w(5, ((float) C9738o.m28691a(getContext())) / ((float) C9738o.m28709b(getContext())), null));
        }
        this.f7893d = new C2442a(this.f7890a.getId(), getContext());
        this.f7893d.mo9142a(this);
        m10060p();
        if (this.f7890a.isLiveTypeAudio()) {
            this.f7911y.setBackgroundResource(R.drawable.bsa);
            this.f7896g = new AudioWidget(this, this.f7880D);
        } else {
            C5343e.m17039a(this.f7911y, this.f7890a.getOwner().getAvatarThumb(), (C13842b) new C9092w(5, (float) (C3358ac.m12523c() / C3358ac.m12520b()), null));
            this.f7896g = new VideoWidget2(this, this.f7902m, this.f7880D);
        }
        dataCenter.load(R.id.cj_, this.f7896g);
        m10062r();
        this.f7891b.lambda$put$1$DataCenter("data_message_manager", ((IMessageService) C3596c.m13172a(IMessageService.class)).messageManagerProvider(this.f7890a.getId(), true, getContext()));
        m10063s();
        if (this.f7890a != null && !this.f7890a.isLiveTypeAudio()) {
            C2673n.m10880a(this.f7890a.getId());
        }
        this.f7885I = new PhoneStateReceiver(this);
        ((IGiftService) C3596c.m13172a(IGiftService.class)).syncGiftList(this.f7888L, this.f7890a.getId(), 2, true);
        C5738d b = C5747j.m18104b();
        b.mo14165a(ToolbarButton.FILTER, (C5739a) new C2401c());
        b.mo14165a(ToolbarButton.BEAUTY, (C5739a) new C2400b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo8770a(HashMap hashMap, DialogInterface dialogInterface, int i) {
        m10056b(hashMap);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo8778b(HashMap hashMap, DialogInterface dialogInterface, int i) {
        m10059c(hashMap);
        dialogInterface.dismiss();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f7904r != null) {
            this.f7904r.onActivityResult(i, i2, intent);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.aqg, viewGroup, false);
        inflate.setBackgroundColor(Color.parseColor("#303342"));
        return inflate;
    }

    public void onFrameAvailable(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        if (!this.f7889N) {
            this.f7889N = true;
            this.f7911y.post(new C2558e(this));
        }
        this.f7880D.mo8925a(eGLContext, i, i2, i3, i4, j);
    }

    /* renamed from: a */
    static final /* synthetic */ void m10049a(C8444d dVar, String str, int i, String str2, String str3, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdktag", str2);
            jSONObject.put("sdkmsg", str3);
            if (th != null) {
                jSONObject.put("throwable", th);
            }
            switch (i) {
                case 2:
                case 3:
                    dVar.mo10002b(str, jSONObject);
                    return;
                case 4:
                    dVar.mo10000a(str, jSONObject);
                    return;
                case 5:
                    dVar.mo10005d(str, jSONObject);
                    return;
                case 6:
                case 7:
                    dVar.mo10004c(str, jSONObject);
                    break;
            }
        } catch (JSONException e) {
            HashMap hashMap = new HashMap();
            hashMap.put("errtag", e.getClass());
            hashMap.put("AVLog.ILogFilter", e.getMessage());
            dVar.mo10003c("LiveBroadcastFragment", (Map) hashMap);
        }
    }
}
