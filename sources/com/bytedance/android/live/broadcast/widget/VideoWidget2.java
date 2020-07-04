package com.bytedance.android.live.broadcast.widget;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.live.broadcast.api.C2412a.C2413a;
import com.bytedance.android.live.broadcast.api.C2412a.C2414b;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.model.C2438c;
import com.bytedance.android.live.broadcast.api.model.C2440e;
import com.bytedance.android.live.broadcast.api.p126b.C2420b;
import com.bytedance.android.live.broadcast.api.p126b.C2421c;
import com.bytedance.android.live.broadcast.api.p126b.C2421c.C2422a;
import com.bytedance.android.live.broadcast.api.p126b.C2421c.C2423b;
import com.bytedance.android.live.broadcast.api.p126b.C2427e.C2428a;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.dutygift.C2556m;
import com.bytedance.android.live.broadcast.dutygift.C2557n;
import com.bytedance.android.live.broadcast.effect.C2581a;
import com.bytedance.android.live.broadcast.effect.C2615d;
import com.bytedance.android.live.broadcast.effect.C2619g;
import com.bytedance.android.live.broadcast.effect.C2624k;
import com.bytedance.android.live.broadcast.effect.C2636q;
import com.bytedance.android.live.broadcast.effect.C2651r;
import com.bytedance.android.live.broadcast.effect.LiveBeautyFragment.C2576a;
import com.bytedance.android.live.broadcast.effect.LiveBroadcastGameControlWidget.C2578a;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.sticker.C2659b;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.broadcast.effect.sticker.C2664g;
import com.bytedance.android.live.broadcast.effect.sticker.p137a.C2653a;
import com.bytedance.android.live.broadcast.effect.sticker.p138ui.C2684a;
import com.bytedance.android.live.broadcast.effect.sticker.p138ui.C2686c;
import com.bytedance.android.live.broadcast.effect.sticker.p138ui.C2715i;
import com.bytedance.android.live.broadcast.effect.sticker.p138ui.gestureV2.LiveGestureMagicDialogFragment;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.broadcast.stream.C2936a;
import com.bytedance.android.live.broadcast.stream.monitor.C2980a;
import com.bytedance.android.live.broadcast.stream.p141a.C2947a;
import com.bytedance.android.live.broadcast.stream.p141a.C2953b;
import com.bytedance.android.live.broadcast.stream.p141a.C2954c.C2955a;
import com.bytedance.android.live.broadcast.stream.p141a.C2958f;
import com.bytedance.android.live.broadcast.stream.p141a.p142a.C2948a;
import com.bytedance.android.live.broadcast.stream.p141a.p142a.C2951d;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.p159b.C3377b;
import com.bytedance.android.live.room.C3496m;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PKPenalStickerState;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkResult;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState;
import com.bytedance.android.livesdk.chatroom.event.C4452v;
import com.bytedance.android.livesdk.chatroom.event.C4456z;
import com.bytedance.android.livesdk.chatroom.interact.C4487am;
import com.bytedance.android.livesdk.chatroom.viewmodule.p221a.p222a.C5570c;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p405b.C8432d;
import com.bytedance.android.livesdk.log.p405b.C8433e;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.p368g.p370b.C7853a;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.android.livesdkapi.depend.model.live.C9383t;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C9468j;
import com.bytedance.android.livesdkapi.p458j.C9496c;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.avframework.livestreamv2.core.Client;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p280ss.avframework.livestreamv2.effectcamera.render.EffectRender.OnRefreshFaceDataListener;
import com.p280ss.avframework.opengl.GlUtil;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

public class VideoWidget2 extends CaptureWidget2 implements C0053p<KVData>, C2557n, C2576a, C2578a, C2659b, C2980a, C3111g, C4487am, C6310a {

    /* renamed from: e */
    public static final String f9493e = "VideoWidget2";

    /* renamed from: A */
    public long f9494A;

    /* renamed from: B */
    public long f9495B;

    /* renamed from: C */
    private C2619g f9496C;

    /* renamed from: D */
    private C2581a f9497D;

    /* renamed from: E */
    private C2664g f9498E;

    /* renamed from: F */
    private C2414b f9499F;

    /* renamed from: G */
    private C9383t f9500G;

    /* renamed from: H */
    private OnRefreshFaceDataListener f9501H;

    /* renamed from: I */
    private LinkCrossRoomDataHolder f9502I;

    /* renamed from: J */
    private String f9503J = null;

    /* renamed from: K */
    private C2936a f9504K;

    /* renamed from: L */
    private C2651r f9505L;

    /* renamed from: M */
    private C2955a f9506M;

    /* renamed from: N */
    private C2420b f9507N = new C2420b() {
        /* renamed from: a */
        public final int mo8878a() {
            VideoWidget2.this.f9511g.mo9706a();
            return 1;
        }

        /* renamed from: a */
        public final int mo8881a(boolean z) {
            VideoWidget2.this.f9511g.mo9711a(z);
            return 1;
        }

        /* renamed from: a */
        public final int mo8882a(String[] strArr) {
            VideoWidget2.this.f9511g.mo9712a(strArr);
            return 1;
        }

        /* renamed from: a */
        public final int mo8880a(String str, boolean z) {
            try {
                VideoWidget2.this.f9511g.mo9710a(str, z);
                return 1;
            } catch (FileNotFoundException e) {
                C3166a.m11963b(VideoWidget2.f9493e, (Throwable) e);
                return -1;
            }
        }

        /* renamed from: a */
        public final int mo8879a(String str, String str2, float f) {
            try {
                VideoWidget2.this.f9511g.mo9708a(str, str2, f);
                return 1;
            } catch (FileNotFoundException e) {
                C3166a.m11963b(VideoWidget2.f9493e, (Throwable) e);
                return -1;
            }
        }
    };

    /* renamed from: O */
    private C2423b f9508O = new C2423b() {
        /* renamed from: a */
        public final void mo8902a(boolean z, String str, C9355c cVar) {
            if (C2418b.f7950a.equals(str) && z && cVar != null) {
                C8443c.m25663a().mo21607a("live_take_gesture_select", new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_detail"), new C8439k(), new C8432d().mo21581a(cVar.f25566e), Room.class);
            }
            if (C6319n.m19593a(str) || "beauty".equals(str) || C2418b.f7953d.equals(str) || C2418b.f7951b.equals(str)) {
                C2515f.m10417f().mo9078e().mo8844a(VideoWidget2.this.f9516l.getId());
            }
            Map a = C2515f.m10417f().mo9074a().mo8885a();
            if (!a.containsKey(C2418b.f7951b) || ((Map) a.get(C2418b.f7951b)).size() <= 0) {
                VideoWidget2.this.f9518n = false;
                VideoWidget2.this.dataCenter.lambda$put$1$DataCenter("cmd_sticker_is_selected", new C2440e(C2418b.f7951b, new C9355c()));
                VideoWidget2.this.f9517m.removeMessages(BaseNotice.HASHTAG);
                if (VideoWidget2.this.f9512h != null) {
                    VideoWidget2.this.f9512h.mo8870a(false);
                }
            } else {
                VideoWidget2.this.f9518n = true;
                VideoWidget2.this.dataCenter.lambda$put$1$DataCenter("cmd_sticker_is_selected", new C2440e(C2418b.f7951b, (C9355c) ((Map) a.get(C2418b.f7951b)).values().iterator().next()));
            }
            if (!C2418b.f7950a.equals(str)) {
                return;
            }
            if (VideoWidget2.this.f9514j == null || !VideoWidget2.this.f9514j.isShowing()) {
                VideoWidget2.this.mo9884i();
            }
        }
    };

    /* renamed from: P */
    private C2422a f9509P = new C2422a() {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo9893a(String str) {
            if (VideoWidget2.this.f9522r != null) {
                VideoWidget2.this.f9522r.add(str);
            }
            VideoWidget2.this.f9526v = true;
            HashMap hashMap = new HashMap();
            hashMap.put("beauty_type", str);
            C8443c.m25663a().mo21606a("livesdk_live_take_beauty_effective_use", hashMap, new C8438j().mo21598a("live_take_detail"), Room.class);
        }

        /* renamed from: a */
        public final void mo8901a(String str, C9355c cVar, String str2, float f) {
            if (C6319n.m19593a(str) || "beauty".equals(str) || C2418b.f7953d.equals(str) || C2418b.f7951b.equals(str)) {
                C2515f.m10417f().mo9078e().mo8844a(VideoWidget2.this.f9516l.getId());
            }
            if (!VideoWidget2.this.f9522r.contains(str2)) {
                if (VideoWidget2.this.f9521q.containsKey(str2)) {
                    if (f == 0.0f) {
                        VideoWidget2.this.f9517m.removeCallbacks((Runnable) VideoWidget2.this.f9521q.remove(str2));
                    }
                } else if (f != 0.0f) {
                    C3098aq aqVar = new C3098aq(this, str2);
                    VideoWidget2.this.f9521q.put(str2, aqVar);
                    VideoWidget2.this.f9517m.postDelayed(aqVar, 30000);
                }
            }
        }
    };

    /* renamed from: f */
    public C2947a f9510f;

    /* renamed from: g */
    public C2951d f9511g;

    /* renamed from: h */
    public C2413a f9512h;

    /* renamed from: i */
    public Dialog f9513i;

    /* renamed from: j */
    public C2684a f9514j;

    /* renamed from: k */
    public boolean f9515k;

    /* renamed from: l */
    public Room f9516l;

    /* renamed from: m */
    public C6309f f9517m = new C6309f(this);

    /* renamed from: n */
    public volatile boolean f9518n;

    /* renamed from: o */
    public long f9519o;

    /* renamed from: p */
    public List<Long> f9520p = new ArrayList();

    /* renamed from: q */
    public Map<String, Runnable> f9521q = new HashMap();

    /* renamed from: r */
    public List<String> f9522r = new ArrayList();

    /* renamed from: s */
    public C7321c f9523s;

    /* renamed from: t */
    public C3078c f9524t = new C3078c();

    /* renamed from: u */
    public boolean f9525u = false;

    /* renamed from: v */
    public boolean f9526v = false;

    /* renamed from: w */
    public FrameLayout f9527w;

    /* renamed from: x */
    public C0608j f9528x;

    /* renamed from: y */
    public boolean f9529y;

    /* renamed from: z */
    public boolean f9530z = false;

    /* renamed from: com.bytedance.android.live.broadcast.widget.VideoWidget2$a */
    class C3075a implements C5739a {

        /* renamed from: b */
        private View f9541b;

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C3075a() {
        }

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
            if ((aVar instanceof C5570c) && this.f9541b != null) {
                this.f9541b.setVisibility(((C5570c) aVar).mo14077a());
            }
        }

        public final void onClick(View view) {
            if (VideoWidget2.this.f9514j == null) {
                if (((Boolean) LiveSettingKeys.LIVE_ENABLE_NEW_GESTURE_DIALOG.mo10240a()).booleanValue()) {
                    VideoWidget2.this.f9514j = LiveGestureMagicDialogFragment.m10927a(VideoWidget2.this.dataCenter);
                } else {
                    VideoWidget2.this.f9514j = new C2686c(VideoWidget2.this.context, C2515f.m10417f().mo9075b().mo9212a(), VideoWidget2.this.dataCenter);
                }
                VideoWidget2.this.f9514j.setOnDismissListener(new OnDismissListener() {
                    public final void onDismiss(DialogInterface dialogInterface) {
                        String str;
                        C8443c a = C8443c.m25663a();
                        String str2 = "gesture_switch";
                        Object[] objArr = new Object[4];
                        objArr[0] = new C8438j().mo21598a("live_take_detail").mo21599b("live_take");
                        if (((Boolean) C8946b.f24417ap.mo22117a()).booleanValue()) {
                            str = "on";
                        } else {
                            str = "off";
                        }
                        objArr[1] = new C8433e(str);
                        objArr[2] = new C8439k();
                        objArr[3] = Room.class;
                        a.mo21607a(str2, objArr);
                        VideoWidget2.this.mo9884i();
                    }
                });
            }
            if (!VideoWidget2.this.f9514j.isShowing()) {
                VideoWidget2.this.f9514j.show(VideoWidget2.this.f9528x, C2686c.class.getSimpleName());
                if (VideoWidget2.this.f9523s != null && !VideoWidget2.this.f9523s.isDisposed()) {
                    VideoWidget2.this.f9523s.dispose();
                }
                C8443c.m25663a().mo21607a("anchor_more_function_click_gesture", new C8438j().mo21598a("live_take_detail").mo21599b("live_take"), new C8439k(), Room.class);
            }
        }

        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
            this.f9541b = view.findViewById(R.id.cqx);
            if (((Boolean) C8946b.f24414am.mo22117a()).booleanValue() && !((Boolean) LiveSettingKeys.LIVE_ENABLE_NEW_GESTURE_DIALOG.mo10240a()).booleanValue()) {
                this.f9541b.setVisibility(0);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.VideoWidget2$b */
    class C3077b implements C5739a {

        /* renamed from: b */
        private boolean f9544b;

        /* renamed from: c */
        private long f9545c;

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C3077b() {
        }

        public final void onClick(View view) {
            if (C3377b.m12564b()) {
                C3517a.m12960a(C3358ac.m12528e(), (int) R.string.el_);
            }
            if (this.f9545c == 0) {
                this.f9545c = SystemClock.elapsedRealtime();
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime >= this.f9545c + 1500) {
                    this.f9545c = elapsedRealtime;
                } else {
                    return;
                }
            }
            this.f9544b = !this.f9544b;
            if (VideoWidget2.this.f9515k) {
                VideoWidget2.this.f9510f.mo9683c();
            }
            VideoWidget2.this.f9510f.mo9681b();
            VideoWidget2.this.f9524t.mo9897a(this.f9544b);
            C8946b.f24477g.mo22120b(Integer.valueOf(this.f9544b ? 1 : 0));
            C8448g.m25682a(VideoWidget2.this.getContext());
            C8443c.m25663a().mo21607a("pm_live_switch_camera_click", new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_detail"), new C8439k());
        }

        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
            boolean z = true;
            if (((Integer) C8946b.f24477g.mo22119b()).intValue() != 1) {
                z = false;
            }
            this.f9544b = z;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.VideoWidget2$c */
    class C3078c implements C5739a {

        /* renamed from: b */
        private View f9547b;

        /* renamed from: c */
        private View f9548c;

        /* renamed from: d */
        private boolean f9549d;

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        private C3078c() {
        }

        /* renamed from: b */
        private void m11772b(boolean z) {
            this.f9549d = z;
            if (!this.f9549d) {
                VideoWidget2.this.f9515k = false;
                m11773c(true);
                return;
            }
            m11773c(false);
        }

        /* renamed from: a */
        public final void mo9897a(boolean z) {
            if (this.f9547b != null) {
                this.f9549d = z;
                if (!this.f9549d) {
                    VideoWidget2.this.f9515k = false;
                }
                m11773c(true);
            }
        }

        /* renamed from: a */
        private void m11771a(View... viewArr) {
            float f;
            for (int i = 0; i <= 0; i++) {
                View view = viewArr[0];
                String str = "alpha";
                float[] fArr = new float[2];
                float f2 = 1.0f;
                if (this.f9549d) {
                    f = 0.4f;
                } else {
                    f = 1.0f;
                }
                fArr[0] = f;
                if (!this.f9549d) {
                    f2 = 0.4f;
                }
                fArr[1] = f2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
                ofFloat.setDuration(100);
                ofFloat.start();
            }
        }

        /* renamed from: c */
        private void m11773c(boolean z) {
            if (this.f9547b != null) {
                boolean z2 = VideoWidget2.this.f9529y;
                int i = R.drawable.cgj;
                if (z2 && !this.f9549d) {
                    this.f9548c.setBackgroundResource(R.drawable.cgj);
                }
                View view = this.f9548c;
                if (!VideoWidget2.this.f9515k) {
                    i = R.drawable.cgk;
                }
                view.setBackgroundResource(i);
                if (z) {
                    m11771a(this.f9548c);
                }
            }
        }

        public final void onClick(View view) {
            String str;
            if (this.f9549d) {
                VideoWidget2.this.f9515k = !VideoWidget2.this.f9515k;
                VideoWidget2.this.f9510f.mo9683c();
                Context context = VideoWidget2.this.context;
                if (VideoWidget2.this.f9515k) {
                    str = VideoWidget2.this.context.getResources().getString(R.string.f31);
                } else {
                    str = VideoWidget2.this.context.getResources().getString(R.string.f32);
                }
                C3517a.m12962a(context, str);
                C8448g.m25682a(VideoWidget2.this.context);
                ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b();
                VideoWidget2.this.f9516l.getId();
                C8443c.m25663a().mo21607a("pm_live_mirror_click", new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_detail"), new C8439k());
                m11773c(false);
            }
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
            this.f9547b = null;
        }

        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
            this.f9547b = view;
            this.f9548c = this.f9547b.findViewById(R.id.ax9);
            boolean z = true;
            if (((Integer) C8946b.f24477g.mo22119b()).intValue() != 1) {
                z = false;
            }
            m11772b(z);
            if (VideoWidget2.this.f9529y && !z && this.f9548c != null) {
                this.f9548c.setBackgroundResource(R.drawable.cgj);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.VideoWidget2$d */
    class C3079d implements C5739a {
        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C3079d() {
        }

        public final void onClick(View view) {
            C3496m hostStickerViewService = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).hostStickerViewService();
            if (hostStickerViewService != null) {
                hostStickerViewService.mo10528a((AppCompatActivity) VideoWidget2.this.getContext(), VideoWidget2.this.f9528x, "livestreaming", VideoWidget2.this.f9527w, new C9468j() {
                    /* renamed from: b */
                    public final void mo9901b(C9355c cVar) {
                        VideoWidget2.this.dataCenter.lambda$put$1$DataCenter("cmd_sticker_tip", "");
                        C2515f.m10417f().mo9074a().mo8897b(C2418b.f7951b);
                        if (VideoWidget2.this.f9494A > 0) {
                            VideoWidget2.this.mo9886k();
                        }
                        VideoWidget2.this.f9494A = 0;
                    }

                    /* renamed from: a */
                    public final void mo9900a(C9355c cVar) {
                        VideoWidget2.this.dataCenter.lambda$put$1$DataCenter("cmd_sticker_tip", cVar.f25584w);
                        C2515f.m10417f().mo9074a().mo8897b(C2418b.f7951b);
                        C2515f.m10417f().mo9074a().mo8892a(C2418b.f7951b, cVar);
                        if (VideoWidget2.this.f9494A > 0) {
                            VideoWidget2.this.mo9886k();
                        }
                        VideoWidget2.this.f9494A = cVar.f25566e;
                        VideoWidget2.this.f9495B = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                if (VideoWidget2.this.f9513i == null) {
                    VideoWidget2.this.f9513i = new C2715i(VideoWidget2.this.context, VideoWidget2.this.dataCenter, C2515f.m10417f().mo9075b().mo9212a());
                    VideoWidget2.this.f9513i.setOnDismissListener(C3099ar.f9572a);
                }
                if (!VideoWidget2.this.f9513i.isShowing()) {
                    VideoWidget2.this.f9513i.show();
                } else {
                    return;
                }
            }
            C8443c.m25663a().mo21606a("pm_live_sticker_click", VideoWidget2.this.mo9876a(new HashMap<>()), new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_detail"), new C8439k());
        }
    }

    /* renamed from: g */
    public final C2619g mo9882g() {
        return this.f9496C;
    }

    /* renamed from: h */
    public final C2581a mo9883h() {
        return this.f9497D;
    }

    public void onPause() {
        super.onPause();
    }

    /* renamed from: a */
    public final void mo9880a(boolean z) {
        String d = this.f9496C.mo9253d();
        if (this.f9499F != null) {
            this.f9499F.mo8871a(d, z);
        }
    }

    /* renamed from: a */
    public final void mo9323a(C9355c cVar, boolean z) {
        C2515f.m10417f().mo9074a().mo8892a("effect_gift", cVar);
    }

    /* renamed from: a */
    public final void mo9151a(C9355c cVar) {
        this.dataCenter.lambda$put$1$DataCenter("cmd_duty_gift_changed", Boolean.valueOf(true));
        this.f9510f.mo9684d();
        C2515f.m10417f().mo9074a().mo8892a("livegame", cVar);
    }

    /* renamed from: a */
    public final void mo9150a(C2556m mVar) {
        m11719c(mVar);
    }

    /* renamed from: a */
    public final void mo9152a(String str, String str2, boolean z) {
        this.f9511g.mo9709a(str, str2, false);
    }

    /* renamed from: a */
    public final C2653a mo9149a() {
        return C2515f.m10417f().mo9075b().mo9212a();
    }

    /* renamed from: b */
    public final void mo9192b() {
        if (this.f9510f != null) {
            this.f9510f.mo9685e();
        }
    }

    /* renamed from: f */
    public final void mo9881f() {
        if (this.f9498E != null) {
            this.f9498E.mo9336c();
        }
    }

    public void onResume() {
        super.onResume();
        this.f9498E.mo9336c();
    }

    /* renamed from: c */
    public final void mo9193c() {
        if (this.f9510f != null) {
            this.f9510f.mo9684d();
        }
    }

    /* renamed from: d */
    public final void mo9325d() {
        if (this.f9502I.f11662D == PKPenalStickerState.SHOW) {
            this.f9502I.f11662D = PKPenalStickerState.HIDE;
        }
        C2515f.m10417f().mo9074a().mo8897b("effect_gift");
    }

    /* renamed from: o */
    private void m11724o() {
        C2515f.m10417f().mo9074a().mo8888a(new C2428a().mo8913a(Arrays.asList(new String[]{C2418b.f7950a, C2418b.f7953d, "beauty"})).mo8915b(Collections.singletonList("effect_gift")).mo8912a(this.f9507N).mo8914a());
    }

    /* renamed from: n */
    private void m11723n() {
        if (this.f9496C.mo9250b() != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("filter_id", String.valueOf(this.f9496C.mo9250b()));
            C8443c.m25663a().mo21606a("live_take_filter_select", mo9876a(hashMap), new C8438j().mo21599b("live_take").mo21598a("live_take_detail").mo21604g("click").mo21603f("click"));
        }
    }

    /* renamed from: i */
    public final void mo9884i() {
        if (this.f9523s != null && !this.f9523s.isDisposed()) {
            this.f9523s.dispose();
        }
        this.f9523s = C7492s.m23295b(30, TimeUnit.SECONDS).mo19304b(C7333a.m23044b()).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C7326g<Long>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Long l) throws Exception {
                VideoWidget2.this.f9525u = true;
                for (C9355c cVar : C2515f.m10417f().mo9074a().mo8884a(C2418b.f7950a)) {
                    if (!VideoWidget2.this.f9520p.contains(Long.valueOf(cVar.f25566e))) {
                        VideoWidget2.this.f9520p.add(Long.valueOf(cVar.f25566e));
                        C8443c.m25663a().mo21607a("live_take_gesture_effective_use", new C8438j().mo21599b("live_take").mo21603f("other").mo21598a("live_take_detail"), new C8439k(), new C8432d().mo21581a(cVar.f25566e), Room.class);
                    }
                }
            }
        }, (C7326g<? super Throwable>) new C7326g<Throwable>() {
            public final /* bridge */ /* synthetic */ void accept(Object obj) throws Exception {
            }
        });
    }

    /* renamed from: k */
    public final void mo9886k() {
        HashMap hashMap = new HashMap();
        hashMap.put("sticker_id", String.valueOf(this.f9494A));
        hashMap.put("use_time", String.valueOf((SystemClock.elapsedRealtime() - this.f9495B) / 1000));
        C8443c.m25663a().mo21606a("live_sticker_use_time", mo9876a(hashMap), new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_detail"), Room.class);
    }

    public void onCreate() {
        super.onCreate();
        m11716a(C2438c.class);
        m11716a(C4452v.class);
        m11716a(C4456z.class);
        this.f9516l = (Room) this.dataCenter.get("data_room");
        this.f9529y = false;
        m11722m();
        this.f9498E = new C2664g(this);
        this.dataCenter.lambda$put$1$DataCenter("data_sticker_message_manager", this.f9498E);
        this.f9502I = LinkCrossRoomDataHolder.m13782a();
        this.f9502I.observe("data_pk_state", this);
        C5738d b = C5747j.m18104b();
        b.mo14165a(ToolbarButton.GESTURE_MAGIC, (C5739a) new C3075a());
        b.mo14165a(ToolbarButton.STICKER, (C5739a) new C3079d());
        b.mo14165a(ToolbarButton.REVERSE_CAMERA, (C5739a) new C3077b());
        b.mo14165a(ToolbarButton.REVERSE_MIRROR, (C5739a) this.f9524t);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f9502I.removeObserver(this);
        C8946b.f24421at.mo22118a(Integer.valueOf(0));
        this.f9510f.mo9676a();
        this.f9510f.mo9682b(this.f9501H);
        this.f9510f.f9182b = null;
        if (this.f9496C != null) {
            this.f9496C.mo9256g();
        }
        this.f9498E.mo9339f();
        GlUtil.nativeDetachThreadToOpenGl();
        this.f9517m.removeCallbacksAndMessages(null);
        if (this.f9504K != null) {
            this.f9504K.mo9674d();
            this.f9504K = null;
        }
    }

    /* renamed from: m */
    private void m11722m() {
        boolean z;
        this.f9510f = new C2953b(this.f9340d, this.f9325b);
        this.f9510f.mo9679a(this.f9339c);
        this.f9501H = new OnRefreshFaceDataListener() {
            public final void onRefreshFaceData(int i) {
                if (VideoWidget2.this.f9518n && System.currentTimeMillis() - VideoWidget2.this.f9519o > 100) {
                    VideoWidget2.this.f9519o = System.currentTimeMillis();
                    VideoWidget2.this.f9517m.removeMessages(BaseNotice.HASHTAG);
                    Message obtain = Message.obtain();
                    obtain.what = BaseNotice.HASHTAG;
                    obtain.obj = Integer.valueOf(i);
                    VideoWidget2.this.f9517m.sendMessage(obtain);
                }
            }
        };
        this.f9510f.mo9680a(this.f9501H);
        this.f9506M = new C2955a() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo9891a() {
                VideoWidget2.this.mo9885j();
            }

            /* renamed from: b */
            public final void mo9574b(int i, int i2, String str) {
                if (!VideoWidget2.this.f9530z) {
                    VideoWidget2.this.f9517m.post(new C3097ap(this));
                }
            }

            /* renamed from: a */
            public final void mo9572a(int i, int i2, String str) {
                String str2 = VideoWidget2.f9493e;
                StringBuilder sb = new StringBuilder("CameraState onError status: ");
                sb.append(i);
                sb.append(", ret: ");
                sb.append(i2);
                sb.append(", msg: ");
                sb.append(null);
                C3166a.m11966e(str2, sb.toString());
            }
        };
        this.f9510f.mo9678a((C2955a) C9496c.m28034a(this.f9506M));
        if (C3377b.m12564b() && C3377b.m12562a() == 0) {
            LayoutParams layoutParams = (LayoutParams) this.contentView.getLayoutParams();
            layoutParams.width = (int) (((float) C3358ac.m12520b()) * 0.5625f);
            layoutParams.gravity = 17;
        }
        int intValue = ((Integer) LiveSettingKeys.STREAM_HARDWARE_ENCODE.mo10240a()).intValue();
        if (intValue <= 0) {
            z = this.f9500G.f25785i;
        } else if (intValue == 2) {
            z = true;
        } else {
            z = false;
        }
        this.f9504K = new C2936a(this.f9325b, this.f9500G.mo23062b(), this.f9500G.mo23061a(), z);
        this.f9504K.mo9673c();
    }

    /* renamed from: e */
    public final void mo9785e() {
        String str;
        String str2;
        super.mo9785e();
        if (this.f9523s != null && !this.f9523s.isDisposed()) {
            this.f9523s.dispose();
        }
        for (Runnable removeCallbacks : this.f9521q.values()) {
            this.f9517m.removeCallbacks(removeCallbacks);
        }
        HashMap hashMap = new HashMap();
        String str3 = "use_status";
        if (this.f9525u) {
            str = "use";
        } else {
            str = "unused";
        }
        hashMap.put(str3, str);
        C8443c.m25663a().mo21606a("pm_live_gesture_use", hashMap, new C8438j().mo21599b("live_take").mo21603f("other").mo21598a("live_take_detail"), new C8439k(), Room.class);
        HashMap hashMap2 = new HashMap();
        String str4 = "use_status";
        if (this.f9526v) {
            str2 = "use";
        } else {
            str2 = "unused";
        }
        hashMap2.put(str4, str2);
        C8443c.m25663a().mo21606a("livesdk_live_beauty_use", hashMap2, new C8438j().mo21598a("anchor_live_ending"), Room.class);
        C2515f.m10417f().mo9075b().mo9216d();
        C2515f.m10417f().mo9078e().mo8846b();
        C2515f.m10417f().mo9074a().mo8896b(this.f9508O);
        C2515f.m10417f().mo9074a().mo8895b(this.f9509P);
        this.f9517m.post(C3095an.f9567a);
        if (this.f9513i != null) {
            C3100as.m11785a(this.f9513i);
            this.f9513i = null;
        }
        if (this.f9514j != null) {
            this.f9514j.dismiss();
            this.f9514j = null;
        }
        mo9886k();
    }

    /* renamed from: j */
    public final void mo9885j() {
        this.f9530z = true;
        if (this.f9511g == null) {
            this.f9511g = new C2951d();
            this.f9510f.mo9677a((C2948a) this.f9511g);
        }
        this.f9511g.mo9707a(((Integer) LiveConfigSettingKeys.LIVE_USER_NEW_COMPOSER_MODEL.mo10240a()).intValue(), 0);
        C2515f.m10417f().mo9074a().mo8887a(this.f9508O);
        C2515f.m10417f().mo9074a().mo8886a(this.f9509P);
        m11724o();
        C2515f.m10417f().mo9075b().mo9212a().mo9319a(C2418b.f7950a);
        C2515f.m10417f().mo9075b().mo9212a().mo9319a(C2418b.f7951b);
        if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.mo10240a()).booleanValue()) {
            C2515f.m10417f().mo9075b().mo9214b().mo9313a((FragmentActivity) this.context);
            C2515f.m10417f().mo9075b().mo9212a().mo9319a(C2418b.f7953d);
        } else if (this.f9497D == null) {
            this.f9497D = new C2615d();
        }
        if (this.f9496C == null) {
            this.f9496C = C2515f.m10417f().mo9075b().mo9215c();
            this.f9496C.mo9246a(this.f9510f);
            if (this.f9496C.mo9250b() > 0) {
                m11723n();
                m11718b(false);
            }
        }
        this.f9505L = new C2651r(this.f9510f);
    }

    /* renamed from: a */
    public final void mo9878a(C2413a aVar) {
        this.f9512h = aVar;
    }

    /* renamed from: b */
    public final void mo9153b(C2556m mVar) {
        m11719c(mVar);
    }

    /* renamed from: c */
    private void m11719c(C2556m mVar) {
        this.f9510f.mo9675a(mVar.f8210a, mVar.f8211b, mVar.f8212c, mVar.f8213d);
    }

    /* renamed from: d */
    public final void mo9190d(float f) {
        if (this.f9497D != null) {
            this.f9497D.mo9200c(f);
        }
    }

    public void onEvent(C4456z zVar) {
        if (this.f9505L != null) {
            this.f9505L.onEvent(zVar);
        }
    }

    /* renamed from: a */
    private <T> void m11716a(Class<T> cls) {
        C9097a.m27146a().mo22266a(cls).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19325f((C7326g<? super T>) new C7326g<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C4452v) {
                    VideoWidget2.this.onEvent((C4452v) t);
                } else if (t instanceof C2438c) {
                    VideoWidget2.this.onEvent((C2438c) t);
                } else {
                    if (t instanceof C4456z) {
                        VideoWidget2.this.onEvent((C4456z) t);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo9188b(float f) {
        if (this.f9497D != null) {
            this.f9497D.mo9196a(f);
        }
    }

    /* renamed from: b */
    public final void mo9154b(C9355c cVar) {
        this.dataCenter.lambda$put$1$DataCenter("cmd_duty_gift_changed", Boolean.valueOf(false));
        this.f9510f.mo9685e();
        C2515f.m10417f().mo9074a().mo8897b("livegame");
    }

    /* renamed from: c */
    public final void mo9189c(float f) {
        if (this.f9497D != null) {
            this.f9497D.mo9199b(f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == 1505611330 && key.equals("data_pk_state")) {
                c = 0;
            }
            if (c == 0 && ((PkState) kVData.getData()) == PkState.PENAL && ((PkResult) this.f9502I.get("data_pk_result")) == PkResult.RIGHT_WON) {
                if (this.f9513i != null && this.f9513i.isShowing()) {
                    C3100as.m11785a(this.f9513i);
                }
                if (this.f9514j != null && this.f9514j.isShowing()) {
                    this.f9514j.dismiss();
                }
            }
        }
    }

    /* renamed from: b */
    private void m11718b(boolean z) {
        String str;
        this.f9517m.removeMessages(100);
        if (this.f9496C.mo9250b() != 0) {
            Message message = new Message();
            message.what = 100;
            message.obj = this.f9496C.mo9252c();
            Bundle bundle = new Bundle();
            String str2 = "action_type";
            if (z) {
                str = "click";
            } else {
                str = "draw";
            }
            bundle.putString(str2, str);
            message.setData(bundle);
            this.f9517m.sendMessageDelayed(message, ((Long) LiveSettingKeys.LIVE_FILTER_EFFECTIVELY_USE_TIME.mo10240a()).longValue() * 1000);
        }
    }

    public void handleMsg(Message message) {
        if (isViewValid()) {
            boolean z = true;
            if (message.what == 100) {
                m11717a((String) message.obj, message.getData().getString("action_type"));
                this.dataCenter.lambda$put$1$DataCenter("data_has_filter_effective", Boolean.valueOf(true));
                return;
            }
            if (message.what == 101 && this.f9512h != null) {
                C2413a aVar = this.f9512h;
                if (!(message.obj instanceof Integer) || ((Integer) message.obj).intValue() != 0) {
                    z = false;
                }
                aVar.mo8870a(z);
            }
        }
    }

    /* renamed from: a */
    public final HashMap<String, String> mo9876a(HashMap<String, String> hashMap) {
        long j;
        if (this.f9516l != null) {
            j = this.f9516l.getId();
        } else {
            j = 0;
        }
        hashMap.put("room_id", String.valueOf(j));
        return hashMap;
    }

    /* renamed from: a */
    public final void mo9187a(float f) {
        if (this.f9497D != null) {
            this.f9497D.mo9201d(f);
        }
    }

    public void onEvent(C2438c cVar) {
        if (cVar.f7971a == 1) {
            this.f9496C.mo9251b("live_take_detail", mo9876a(new HashMap<>()));
            mo9880a(true);
            m11718b(false);
        } else if (cVar.f7971a == 2) {
            this.f9496C.mo9248a("live_take_detail", mo9876a(new HashMap<>()));
            mo9880a(false);
            m11718b(false);
        } else if (cVar.f7971a == 3) {
            m11718b(true);
            return;
        }
        float a = C2619g.m10718a(C2624k.m10736a().f8419b, this.f9496C.mo9250b());
        if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.mo10240a()).booleanValue()) {
            if (!C6311g.m19573a(C2624k.m10736a().f8419b) && this.f9496C.mo9250b() >= 0 && this.f9496C.mo9250b() < C2624k.m10736a().f8419b.size()) {
                C9355c b = C2515f.m10417f().mo9075b().mo9212a().mo9322b(C2663f.m10856a("beautyTag", (FilterModel) C2624k.m10736a().f8419b.get(this.f9496C.mo9250b())));
                if (!(b == null || b.f25570i == null)) {
                    C2421c a2 = C2515f.m10417f().mo9074a();
                    a2.mo8892a(C2418b.f7953d, b);
                    Float c = a2.mo8899c(b.f25570i.f25589b);
                    if (c == null) {
                        c = Float.valueOf(C2636q.m10771a(b, b.f25570i.f25588a));
                    }
                    int i = (int) a;
                    if (c.floatValue() > C2636q.m10771a(b, i)) {
                        a2.mo8891a(b.f25570i.f25589b, C2636q.m10771a(b, i));
                    }
                }
            }
        } else if (this.f9497D.f8290d > (((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21217a.f21222a * a) / 100.0f) {
            this.f9497D.mo9201d(a / 100.0f);
        }
        C2619g.m10719a(this.f9516l.getId());
    }

    public void onEvent(C4452v vVar) {
        String str;
        int i = vVar.f12912a;
        if (i != 2) {
            if (i != 28) {
                switch (i) {
                    case 21:
                        if (this.f9502I.f11662D == PKPenalStickerState.SHOW) {
                            C9049ap.m27022a((int) R.string.ez8);
                            return;
                        }
                        if (this.f9513i == null) {
                            this.f9513i = new C2715i(this.context, this.dataCenter, C2515f.m10417f().mo9075b().mo9212a());
                            this.f9513i.setOnDismissListener(C3096ao.f9568a);
                        }
                        if (!this.f9513i.isShowing()) {
                            this.f9513i.show();
                            return;
                        }
                        return;
                    case 22:
                        this.f9515k = !this.f9515k;
                        this.f9510f.mo9683c();
                        if (!this.f9529y) {
                            Context context = this.context;
                            if (this.f9515k) {
                                str = this.context.getResources().getString(R.string.f31);
                            } else {
                                str = this.context.getResources().getString(R.string.f32);
                            }
                            C3517a.m12962a(context, str);
                        }
                        C8448g.m25682a(this.context);
                        ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b();
                        this.f9516l.getId();
                        return;
                }
            } else if (this.f9502I.f11662D == PKPenalStickerState.SHOW) {
                C9049ap.m27022a((int) R.string.ez7);
                return;
            } else {
                if (this.f9514j == null) {
                    if (((Boolean) LiveSettingKeys.LIVE_ENABLE_NEW_GESTURE_DIALOG.mo10240a()).booleanValue()) {
                        this.f9514j = LiveGestureMagicDialogFragment.m10927a(this.dataCenter);
                    } else {
                        this.f9514j = new C2686c(this.context, C2515f.m10417f().mo9075b().mo9212a(), this.dataCenter);
                    }
                    this.f9514j.setOnDismissListener(new OnDismissListener() {
                        public final void onDismiss(DialogInterface dialogInterface) {
                            String str;
                            C8443c a = C8443c.m25663a();
                            String str2 = "gesture_switch";
                            Object[] objArr = new Object[4];
                            objArr[0] = new C8438j().mo21598a("live_take_detail").mo21599b("live_take");
                            if (((Boolean) C8946b.f24417ap.mo22117a()).booleanValue()) {
                                str = "on";
                            } else {
                                str = "off";
                            }
                            objArr[1] = new C8433e(str);
                            objArr[2] = new C8439k();
                            objArr[3] = Room.class;
                            a.mo21607a(str2, objArr);
                            VideoWidget2.this.mo9884i();
                        }
                    });
                }
                if (!this.f9514j.isShowing()) {
                    this.f9514j.show(this.f9528x, C2686c.class.getSimpleName());
                    if (this.f9523s != null && !this.f9523s.isDisposed()) {
                        this.f9523s.dispose();
                    }
                    C8443c.m25663a().mo21607a("anchor_more_function_click_gesture", new C8438j().mo21598a("live_take_detail").mo21599b("live_take"), new C8439k(), Room.class);
                } else {
                    return;
                }
            }
            return;
        }
        this.f9510f.mo9681b();
        this.f9515k = false;
    }

    /* renamed from: a */
    public final void mo9879a(C2414b bVar) {
        this.f9499F = bVar;
    }

    /* renamed from: a */
    public final Client mo9795a(InteractConfig interactConfig, Boolean bool) {
        return this.f9325b.mo8916a(interactConfig, bool);
    }

    /* renamed from: a */
    private void m11717a(String str, String str2) {
        HashMap hashMap = new HashMap();
        String str3 = "filter_id";
        if (str == null) {
            str = "";
        }
        hashMap.put(str3, str);
        C8443c.m25663a().mo21606a("live_take_filter_effective_use", mo9876a(hashMap), new C8438j().mo21599b("live_take").mo21598a("live_take_detail").mo21604g(str2).mo21603f("click"));
    }

    /* renamed from: a */
    public final void mo9877a(FrameLayout frameLayout, C0608j jVar) {
        this.f9527w = frameLayout;
        this.f9528x = jVar;
    }

    /* renamed from: c */
    private void m11720c(String str, String str2, boolean z) {
        this.f9511g.mo9709a(str, str2, z);
    }

    /* renamed from: b */
    public final void mo9324b(String str, String str2, boolean z) {
        m11720c(str, str2, z);
    }

    public VideoWidget2(C2958f fVar, C9383t tVar, C2429a aVar) {
        super(fVar, aVar);
        this.f9500G = tVar;
    }
}
