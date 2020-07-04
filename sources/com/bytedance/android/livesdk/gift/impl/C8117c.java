package com.bytedance.android.livesdk.gift.impl;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3387g;
import com.bytedance.android.live.linkpk.C3440a;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.gift.C8163o;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.C8284u;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.dialog.view.LiveGiftComboView;
import com.bytedance.android.livesdk.gift.domain.api.PropApi;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.p374d.C7895a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p405b.C8437i;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.widget.SpecialCombView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a.C9302a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.impl.c */
public final class C8117c extends Dialog implements OnClickListener, C9302a {

    /* renamed from: a */
    public DataCenter f22146a;

    /* renamed from: b */
    public C8123c f22147b;

    /* renamed from: c */
    public final C47562b f22148c;

    /* renamed from: d */
    public long f22149d;

    /* renamed from: e */
    public boolean f22150e;

    /* renamed from: f */
    private Activity f22151f;

    /* renamed from: g */
    private RelativeLayout f22152g;

    /* renamed from: h */
    private SpecialCombView f22153h;

    /* renamed from: i */
    private LiveGiftComboView f22154i;

    /* renamed from: j */
    private User f22155j;

    /* renamed from: k */
    private Room f22156k;

    /* renamed from: l */
    private boolean f22157l;

    /* renamed from: m */
    private boolean f22158m;

    /* renamed from: n */
    private C8158m f22159n;

    /* renamed from: o */
    private int f22160o;

    /* renamed from: p */
    private String f22161p;

    /* renamed from: q */
    private String f22162q;

    /* renamed from: r */
    private Handler f22163r;

    /* renamed from: s */
    private ObjectAnimator f22164s;

    /* renamed from: t */
    private AnimatorSet f22165t;

    /* renamed from: u */
    private AnimatorSet f22166u;

    /* renamed from: v */
    private int f22167v;

    /* renamed from: w */
    private boolean f22168w;

    /* renamed from: x */
    private int f22169x;

    /* renamed from: com.bytedance.android.livesdk.gift.impl.c$a */
    enum C8121a {
        enter,
        exit
    }

    /* renamed from: com.bytedance.android.livesdk.gift.impl.c$b */
    class C8122b implements AnimatorListener {

        /* renamed from: b */
        private C8121a f22177b;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            switch (this.f22177b) {
                case enter:
                    C8117c.this.f22150e = true;
                    C8117c.this.mo21241a(true);
                    return;
                case exit:
                    C8117c.this.dismiss();
                    break;
            }
        }

        C8122b(C8121a aVar) {
            this.f22177b = aVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.impl.c$c */
    public interface C8123c {
        /* renamed from: a */
        void mo14094a(Exception exc, Runnable runnable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21240a(long j, Throwable th) throws Exception {
        if (th instanceof Exception) {
            m24901a((Exception) th);
        }
        C8282s.m25315a(j, this.f22156k.getId(), th);
    }

    /* renamed from: a */
    public final void mo21241a(boolean z) {
        if (!this.f22168w) {
            if (this.f22164s != null && this.f22164s.isStarted()) {
                this.f22164s.cancel();
            }
            this.f22164s = ObjectAnimator.ofFloat(this.f22153h, "progress", new float[]{360.0f, 0.0f}).setDuration(((long) this.f22169x) * 1000);
            this.f22164s.start();
            this.f22153h.startScaleAnim(((long) this.f22169x) * 1000, null);
        } else if (z) {
            this.f22154i.mo20720a(null);
        } else {
            this.f22154i.mo20721b(null);
        }
        if (this.f22163r.hasMessages(OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED)) {
            this.f22163r.removeMessages(OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED);
        }
        this.f22163r.sendEmptyMessageDelayed(OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, ((long) this.f22169x) * 1000);
    }

    /* renamed from: a */
    public final void mo12403a(Message message) {
        if (message.what == 110) {
            m24904c();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22148c.mo119660a();
    }

    public final void show() {
        super.show();
        m24902b();
        m24903b(this.f22159n);
    }

    /* renamed from: a */
    private void m24896a() {
        this.f22152g = (RelativeLayout) findViewById(R.id.d8z);
        this.f22152g.setOnClickListener(this);
        this.f22153h = (SpecialCombView) findViewById(R.id.d90);
        this.f22153h.setOnClickListener(this);
        this.f22153h.setVisibility(4);
        this.f22153h.setCountDownTime(this.f22169x);
        this.f22154i = (LiveGiftComboView) findViewById(R.id.d91);
        this.f22154i.setOnClickListener(this);
        this.f22154i.setVisibility(8);
        this.f22154i.setCountDownTime(((long) this.f22169x) * 1000);
    }

    /* renamed from: b */
    private void m24902b() {
        View view;
        if (this.f22168w) {
            this.f22153h.setVisibility(8);
            view = this.f22154i;
        } else {
            this.f22154i.setVisibility(8);
            view = this.f22153h;
        }
        view.setVisibility(0);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "scaleX", new float[]{0.0f, 1.0f}).setDuration(200);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{0.0f, 1.0f}).setDuration(200);
        this.f22165t = new AnimatorSet();
        this.f22165t.playTogether(new Animator[]{duration, duration2});
        this.f22165t.addListener(new C8122b(C8121a.enter));
        this.f22165t.start();
    }

    /* renamed from: c */
    private void m24904c() {
        Object obj;
        if (this.f22168w) {
            obj = this.f22154i;
        } else {
            obj = this.f22153h;
        }
        this.f22150e = false;
        ObjectAnimator duration = ObjectAnimator.ofFloat(obj, "scaleX", new float[]{1.0f, 0.0f}).setDuration(200);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(obj, "scaleY", new float[]{1.0f, 0.0f}).setDuration(200);
        this.f22166u = new AnimatorSet();
        this.f22166u.playTogether(new Animator[]{duration, duration2});
        this.f22166u.addListener(new C8122b(C8121a.exit));
        this.f22166u.start();
    }

    public final void dismiss() {
        this.f22163r.removeCallbacksAndMessages(null);
        if (this.f22165t != null && this.f22165t.isStarted()) {
            this.f22165t.removeAllListeners();
            this.f22165t.cancel();
        }
        if (this.f22164s != null && this.f22164s.isStarted()) {
            this.f22164s.removeAllListeners();
            this.f22164s.cancel();
        }
        if (this.f22166u != null && this.f22166u.isStarted()) {
            this.f22166u.removeAllListeners();
            this.f22166u.cancel();
        }
        C8128h.m24914a((Dialog) this);
    }

    /* renamed from: d */
    private void m24906d(C8158m mVar) {
        m24900a(mVar);
    }

    /* renamed from: a */
    private void m24901a(Exception exc) {
        if (this.f22147b != null) {
            this.f22147b.mo14094a(exc, new Runnable() {
                public final void run() {
                    if (C8117c.this.isShowing()) {
                        C8117c.this.dismiss();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m24900a(C8158m mVar) {
        IMessageManager iMessageManager = (IMessageManager) this.f22146a.get("data_message_manager");
        User user = (User) this.f22146a.get("data_user_in_room");
        if (iMessageManager != null) {
            iMessageManager.insertMessage(C8163o.m24999a(this.f22156k.getId(), mVar, this.f22155j, user));
        }
        m24905c(mVar);
        mo21241a(false);
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.d8z) {
            dismiss();
            return;
        }
        if ((view.getId() != R.id.d90 && view.getId() != R.id.d91) || !this.f22150e) {
            return;
        }
        if (this.f22159n.f22308l > 0) {
            m24897a(this.f22156k.getId(), this.f22159n.f22308l, 1);
            return;
        }
        m24898a(this.f22156k.getId(), this.f22159n.f22301e, this.f22156k.getLabels(), 1);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setLayout(-1, -1);
            window.setGravity(80);
            window.setDimAmount(0.0f);
        }
        setContentView(LayoutInflater.from(this.f22151f).inflate(R.layout.ap4, null));
        if (window != null) {
            if (!this.f22158m || (!this.f22157l && !C3387g.m12599a(getContext()))) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            } else {
                window.clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            window.setLayout(-1, -1);
        }
        m24896a();
        if (C7285c.m22838a(this.f22151f, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.f22161p = str;
    }

    /* renamed from: b */
    private void m24903b(C8158m mVar) {
        String str;
        String str2;
        String str3;
        String str4;
        if (mVar != null && mVar.f22301e != -1 && mVar.f22304h > 0) {
            if (mVar.f22308l <= 0) {
                this.f22156k.getId();
                long userFrom = this.f22156k.getUserFrom();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("live_source", this.f22161p);
                    jSONObject.put("source", userFrom);
                    jSONObject.put("gift_id", mVar.f22301e);
                    jSONObject.put("request_id", this.f22156k.getRequestId());
                    jSONObject.put("log_pb", this.f22156k.getLog_pb());
                    jSONObject.put("gift_cnt", mVar.f22304h);
                    jSONObject.put("group_cnt", mVar.f22302f);
                    jSONObject.put("combo_cnt", mVar.f22306j);
                    jSONObject.put("enter_from", this.f22162q);
                    String str5 = "event_page";
                    if (this.f22157l) {
                        str4 = "live_take_detail";
                    } else {
                        str4 = "live_detail";
                    }
                    jSONObject.put(str5, str4);
                    if (!TextUtils.isEmpty(this.f22156k.getSourceType())) {
                        jSONObject.put("moment_room_source", this.f22156k.getSourceType());
                    }
                } catch (Exception unused) {
                }
                if (mVar.f22304h > 1) {
                    C8448g.m25682a((Context) this.f22151f);
                    new StringBuilder("running_gift_").append(userFrom);
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("is_combo", "first_combo");
            if (this.f22149d != 0) {
                hashMap.put("team_id", String.valueOf(this.f22149d));
                String str6 = "top_anchor_id";
                if (this.f22155j == null) {
                    str3 = "";
                } else {
                    str3 = this.f22155j.getIdStr();
                }
                hashMap.put(str6, str3);
            }
            HashMap hashMap2 = new HashMap();
            if (mVar.f22308l <= 0) {
                hashMap.put("growth_deepevent", "1");
                hashMap.put("gift_position", String.valueOf(this.f22167v));
                hashMap2.put(Long.valueOf(mVar.f22301e), Integer.valueOf(1));
                hashMap.put("gift_info", C7895a.m24190a(hashMap2));
            } else {
                hashMap2.put(Long.valueOf(mVar.f22308l), Integer.valueOf(1));
                hashMap.put("prop_info", C7895a.m24190a(hashMap2));
            }
            hashMap.put("is_first_consume", String.valueOf(((IWalletService) C3596c.m13172a(IWalletService.class)).isFirstConsume(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a())));
            if (!(this.f22155j == null || this.f22155j.getId() == this.f22156k.getOwnerUserId())) {
                hashMap.put("to_user_id", String.valueOf(this.f22155j.getId()));
            }
            C8443c a = C8443c.m25663a();
            if (mVar.f22308l > 0) {
                str = "send_prop";
            } else {
                str = "send_gift";
            }
            Object[] objArr = new Object[4];
            C8438j jVar = new C8438j();
            if (this.f22157l) {
                str2 = "live_take_detail";
            } else {
                str2 = "live_detail";
            }
            objArr[0] = jVar.mo21598a(str2).mo21600c("bottom_tab").mo21599b("live_interact").mo21603f("other");
            objArr[1] = Room.class;
            objArr[2] = C8163o.m24997a(mVar);
            objArr[3] = ((C3440a) C3596c.m13172a(C3440a.class)).getLinkCrossRoomLog();
            a.mo21606a(str, hashMap, objArr);
        }
    }

    /* renamed from: c */
    private void m24905c(C8158m mVar) {
        long j;
        long j2;
        String str;
        String str2;
        String str3;
        if (mVar != null && mVar.f22301e != -1 && mVar.f22304h > 0) {
            if (mVar.f22308l <= 0) {
                this.f22156k.getId();
                long userFrom = this.f22156k.getUserFrom();
                if (mVar.f22304h > 1) {
                    C8448g.m25682a((Context) this.f22151f);
                    new StringBuilder("running_gift_").append(userFrom);
                }
            }
            mVar.f22318v = this.f22160o;
            if (this.f22155j == null) {
                j = 0;
            } else {
                j = this.f22155j.getId();
            }
            mVar.f22319w = j;
            HashMap hashMap = new HashMap();
            hashMap.put("is_combo", "click_combo");
            if (this.f22149d != 0) {
                hashMap.put("team_id", String.valueOf(this.f22149d));
                String str4 = "top_anchor_id";
                if (this.f22155j == null) {
                    str3 = "";
                } else {
                    str3 = this.f22155j.getIdStr();
                }
                hashMap.put(str4, str3);
            }
            HashMap hashMap2 = new HashMap();
            if (mVar.f22308l <= 0) {
                hashMap.put("gift_position", String.valueOf(this.f22167v));
                hashMap2.put(Long.valueOf(mVar.f22301e), Integer.valueOf(1));
                hashMap.put("gift_info", C7895a.m24190a(hashMap2));
            } else {
                hashMap2.put(Long.valueOf(mVar.f22308l), Integer.valueOf(1));
                hashMap.put("prop_info", C7895a.m24190a(hashMap2));
            }
            hashMap.put("gift_cnt", "1");
            hashMap.put("money", String.valueOf(GiftManager.inst().findGiftById(mVar.f22301e).f22235f));
            if (!(this.f22155j == null || this.f22155j.getId() == this.f22156k.getOwnerUserId())) {
                hashMap.put("to_user_id", String.valueOf(this.f22155j.getId()));
            }
            if (mVar.f22308l > 0) {
                hashMap2.put(Long.valueOf(mVar.f22308l), Integer.valueOf(1));
                hashMap.put("prop_info", C7895a.m24190a(hashMap2));
                C8443c a = C8443c.m25663a();
                String str5 = "send_prop";
                Object[] objArr = new Object[5];
                C8438j jVar = new C8438j();
                if (this.f22157l) {
                    str2 = "live_take_detail";
                } else {
                    str2 = "live_detail";
                }
                objArr[0] = jVar.mo21598a(str2).mo21600c("bottom_tab").mo21599b("live_interact").mo21603f("other");
                objArr[1] = Room.class;
                objArr[2] = C8163o.m24997a(mVar);
                objArr[3] = ((C3440a) C3596c.m13172a(C3440a.class)).getLinkCrossRoomLog();
                objArr[4] = new C8439k();
                a.mo21606a(str5, hashMap, objArr);
                return;
            }
            hashMap.put("gift_position", String.valueOf(this.f22167v));
            hashMap2.put(Long.valueOf(mVar.f22301e), Integer.valueOf(1));
            hashMap.put("gift_info", C7895a.m24190a(hashMap2));
            hashMap.put("is_first_consume", String.valueOf(((IWalletService) C3596c.m13172a(IWalletService.class)).isFirstConsume(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a())));
            hashMap.put("growth_deepevent", "1");
            String str6 = "to_user_id";
            if (this.f22155j != null) {
                j2 = this.f22155j.getId();
            } else {
                j2 = this.f22156k.getOwnerUserId();
            }
            hashMap.put(str6, String.valueOf(j2));
            C8443c a2 = C8443c.m25663a();
            String str7 = "send_gift";
            Object[] objArr2 = new Object[4];
            C8438j jVar2 = new C8438j();
            if (this.f22157l) {
                str = "live_take_detail";
            } else {
                str = "live_detail";
            }
            objArr2[0] = jVar2.mo21598a(str).mo21600c("bottom_tab").mo21599b("live_interact").mo21603f("other");
            objArr2[1] = Room.class;
            objArr2[2] = C8163o.m24997a(mVar);
            objArr2[3] = ((C3440a) C3596c.m13172a(C3440a.class)).getLinkCrossRoomLog();
            a2.mo21606a(str7, hashMap, objArr2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21238a(long j, long j2, C3479d dVar) throws Exception {
        m24906d((C8158m) dVar.data);
        C8282s.m25314a(j, this.f22156k.getId(), SystemClock.uptimeMillis() - j2);
    }

    /* renamed from: a */
    private void m24897a(long j, long j2, int i) {
        long id;
        long uptimeMillis = SystemClock.uptimeMillis();
        Prop a = C8284u.m25332a().mo21433a(j2);
        if (a != null) {
            PropApi propApi = (PropApi) C3458e.m12798a().mo10440a(PropApi.class);
            long j3 = a.f22201id;
            if (this.f22155j == null) {
                id = this.f22156k.getOwnerUserId();
            } else {
                id = this.f22155j.getId();
            }
            C7492s a2 = propApi.sendProp(j3, j, 1, id, a.isAwemeFreeGift).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
            long j4 = j2;
            long j5 = j;
            C8124d dVar = new C8124d(this, j4, j5, uptimeMillis);
            C8125e eVar = new C8125e(this, j4, j5);
            a2.mo19280a((C7326g<? super T>) dVar, (C7326g<? super Throwable>) eVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21239a(long j, long j2, Throwable th) throws Exception {
        if (th instanceof Exception) {
            m24901a((Exception) th);
        }
        C8282s.m25328c(j, j2, th);
    }

    /* renamed from: a */
    private void m24898a(long j, long j2, String str, int i) {
        long ownerUserId;
        long j3 = j2;
        if (GiftManager.inst().findGiftById(j3) != null) {
            if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
                ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22167a(this.f22151f, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f68)).mo22188a(1001).mo22193d("live_detail").mo22194e("gift_send").mo22192c("gift").mo22190a()).mo19189a((C7498y<? super T>) new C8986g<IUser>() {
                    public final void onSubscribe(C7321c cVar) {
                        super.onSubscribe(cVar);
                        C8117c.this.f22148c.mo119661a(cVar);
                    }
                });
            } else if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22178a(LiveInteractFunction.GIFT)) {
                if (!C8128h.m24915a(getContext())) {
                    C3517a.m12960a(getContext(), (int) R.string.efp);
                    return;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                GiftRetrofitApi giftRetrofitApi = (GiftRetrofitApi) C3458e.m12798a().mo10440a(GiftRetrofitApi.class);
                if (this.f22155j != null) {
                    ownerUserId = this.f22155j.getId();
                } else {
                    ownerUserId = this.f22156k.getOwnerUserId();
                }
                C7492s a = giftRetrofitApi.send(j2, j, ownerUserId, 1).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
                long j4 = j3;
                C8126f fVar = new C8126f(this, j2, uptimeMillis);
                a.mo19280a((C7326g<? super T>) fVar, (C7326g<? super Throwable>) new C8127g<Object>(this, j4));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21237a(long j, long j2, long j3, C3479d dVar) throws Exception {
        C3479d dVar2 = dVar;
        C8158m mVar = (C8158m) dVar2.data;
        long j4 = dVar2.extra.now;
        long currentTimeMillis = System.currentTimeMillis();
        for (Prop nowTimeDiff : mVar.f22311o) {
            nowTimeDiff.setNowTimeDiff((j4 - currentTimeMillis) / 1000);
        }
        m24906d(mVar);
        C8282s.m25327c(j, j2, SystemClock.uptimeMillis() - j3);
    }

    public C8117c(Activity activity, Room room, User user, boolean z, boolean z2, C8158m mVar, String str, int i) {
        int i2;
        int i3;
        if (!z2 || (!z && !C3387g.m12599a(activity))) {
            i2 = R.style.zj;
        } else {
            i2 = R.style.zk;
        }
        super(activity, i2);
        this.f22148c = new C47562b();
        this.f22163r = new C9301a(this);
        this.f22150e = false;
        this.f22169x = ((Integer) C5864b.f17253H.mo10240a()).intValue();
        this.f22151f = activity;
        this.f22156k = room;
        this.f22155j = user;
        this.f22157l = z;
        this.f22158m = z2;
        this.f22159n = mVar;
        if (user == null) {
            i3 = C8437i.f23077a;
        } else {
            i3 = C8437i.f23078b;
        }
        this.f22160o = i3;
        this.f22162q = str;
        this.f22167v = i;
        boolean z3 = true;
        if ((((Integer) LiveConfigSettingKeys.LIVE_GIFT_PANEL_FUNCTION.mo10240a()).intValue() & 1) != 1) {
            z3 = false;
        }
        this.f22168w = z3;
    }
}
