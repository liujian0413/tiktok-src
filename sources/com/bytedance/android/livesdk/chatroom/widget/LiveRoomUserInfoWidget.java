package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.Animator;
import android.arch.lifecycle.C0053p;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.C2437b;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.setting.C3332f;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.C3916b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3975b;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.event.C4454x;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.p209bl.C4270b;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.chatroom.utils.C5357o;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.fans.FansService;
import com.bytedance.android.livesdk.fansclub.C5900c;
import com.bytedance.android.livesdk.floatwindow.C7849h;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8445e.C8446a;
import com.bytedance.android.livesdk.log.p405b.C8431c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8514bj;
import com.bytedance.android.livesdk.message.model.C8545cg;
import com.bytedance.android.livesdk.p417q.C8791d;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.p431y.p433b.C9281a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.user.C8976b.C8977a;
import com.bytedance.android.livesdk.user.C8980d.C8983b;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdk.user.C8985f;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdk.utils.C9074l;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.utils.C9094x;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.p534b.C10296b;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C47559ag;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

public class LiveRoomUserInfoWidget extends LiveRecyclableWidget implements C0053p<KVData>, C6310a {

    /* renamed from: a */
    public static final String f16946a = "https://webcast.huoshan.com/falcon/webcast_huoshan/page/fansclub/index.html?room_id=%s&anchor_id=%s&user_id=%s&enter_from=%s&source=%s&event_module=%s&isFans=%s&is_first_consume=%s";

    /* renamed from: b */
    public static final String f16947b;

    /* renamed from: g */
    private static final String f16948g = "com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget";

    /* renamed from: h */
    private static final int f16949h = C3358ac.m12510a(34.0f);

    /* renamed from: A */
    private String f16950A;

    /* renamed from: B */
    private View f16951B;

    /* renamed from: C */
    private TextView f16952C;

    /* renamed from: D */
    private TextView f16953D;

    /* renamed from: E */
    private View f16954E;

    /* renamed from: F */
    private long f16955F;

    /* renamed from: G */
    private long f16956G;

    /* renamed from: H */
    private long f16957H;

    /* renamed from: I */
    private boolean f16958I = true;

    /* renamed from: J */
    private boolean f16959J = false;

    /* renamed from: K */
    private boolean f16960K;

    /* renamed from: L */
    private boolean f16961L;

    /* renamed from: M */
    private C10296b f16962M;

    /* renamed from: N */
    private User f16963N;

    /* renamed from: O */
    private boolean f16964O;

    /* renamed from: P */
    private RecyclableWidgetManager f16965P;

    /* renamed from: Q */
    private BaseDialogFragment f16966Q;

    /* renamed from: R */
    private C8791d f16967R;

    /* renamed from: S */
    private ViewStub f16968S;

    /* renamed from: T */
    private List<Animator> f16969T;

    /* renamed from: U */
    private boolean f16970U;

    /* renamed from: c */
    public Room f16971c;

    /* renamed from: d */
    public View f16972d;

    /* renamed from: e */
    public View f16973e;

    /* renamed from: f */
    public ProgressBar f16974f;

    /* renamed from: i */
    private final C47562b f16975i = new C47562b();

    /* renamed from: j */
    private C8984e f16976j;

    /* renamed from: k */
    private boolean f16977k;

    /* renamed from: l */
    private String f16978l;

    /* renamed from: m */
    private View f16979m;

    /* renamed from: n */
    private View f16980n;

    /* renamed from: o */
    private View f16981o;

    /* renamed from: p */
    private View f16982p;

    /* renamed from: q */
    private ImageView f16983q;

    /* renamed from: r */
    private VHeadView f16984r;

    /* renamed from: s */
    private HSImageView f16985s;

    /* renamed from: t */
    private ImageView f16986t;

    /* renamed from: u */
    private TextView f16987u;

    /* renamed from: v */
    private TextView f16988v;

    /* renamed from: w */
    private TextView f16989w;

    /* renamed from: x */
    private int f16990x;

    /* renamed from: y */
    private FragmentActivity f16991y;

    /* renamed from: z */
    private C6309f f16992z;

    public int getLayoutId() {
        return R.layout.aun;
    }

    public void handleMsg(Message message) {
    }

    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14240a(User user) throws Exception {
        if (isViewValid()) {
            User from = User.from(user);
            ((Room) this.dataCenter.get("data_room")).getOwner().setFollowInfo(from.getFollowInfo());
            this.dataCenter.lambda$put$1$DataCenter("data_is_followed", Boolean.valueOf(from.isFollowing()));
            if (from.isFollowing()) {
                this.f16981o.setVisibility(8);
                if (this.f16960K) {
                    m18171c((int) C9738o.m28708b(getContext(), 6.0f));
                    this.f16973e.setVisibility(0);
                    if (this.f16961L && from.getFansClub() != null && !((Boolean) C8946b.f24413al.mo22117a()).booleanValue()) {
                        this.contentView.postDelayed(new C5825x(this), 1000);
                    }
                } else {
                    m18171c((int) C9738o.m28708b(getContext(), 12.0f));
                }
            } else if (this.f16959J) {
                m18177g();
            } else {
                m18171c((int) C9738o.m28708b(getContext(), 6.0f));
                mo14237a(0);
                this.f16974f.setVisibility(8);
                this.f16987u.setVisibility(0);
                this.f16981o.setVisibility(0);
                this.f16973e.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14243a(Long l) throws Exception {
        m18172c(C3358ac.m12515a((int) R.string.eri));
        C8946b.f24412ak.mo22118a(Boolean.valueOf(true));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14241a(C2437b bVar) throws Exception {
        if (this.f16954E != null) {
            if (bVar.f7970a) {
                this.f16954E.setVisibility(0);
                C8443c.m25663a().mo21607a("no_beauty_icon_show", Room.class);
                return;
            }
            this.f16954E.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo14247b(FollowPair followPair) {
        if (isViewValid()) {
            ((Room) this.dataCenter.get("data_room")).getOwner().setFollowStatus(followPair.mo22844a());
            boolean z = true;
            this.dataCenter.lambda$put$1$DataCenter("data_is_followed", Boolean.valueOf(followPair.mo22844a() != 0));
            if (followPair.mo22844a() == 0) {
                this.f16973e.setVisibility(8);
                this.f16981o.setVisibility(0);
                if (this.f16960K) {
                    m18171c((int) C9738o.m28708b(getContext(), 6.0f));
                }
                return;
            }
            mo14237a(0);
            this.f16974f.setVisibility(8);
            this.f16981o.setVisibility(8);
            if (this.f16960K) {
                m18171c((int) C9738o.m28708b(getContext(), 6.0f));
                this.f16973e.setVisibility(0);
                User user = (User) this.dataCenter.get("data_user_in_room");
                if (!(user == null || user.getFansClub() == null)) {
                    FansClubData fansClubData = FansClubData.isValid(user.getFansClub().getData()) ? user.getFansClub().getData() : user.getFansClub().getPreferData() != null ? (FansClubData) user.getFansClub().getPreferData().get(Integer.valueOf(1)) : null;
                    if (FansClubData.isValid(fansClubData) && fansClubData.level > 0) {
                        z = false;
                    }
                }
                if (z && this.f16970U && m18181k()) {
                    m18180j();
                }
                return;
            }
            m18171c((int) C9738o.m28708b(getContext(), 12.0f));
        }
    }

    public void onPause() {
        super.onPause();
        if (C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW) == null) {
        }
    }

    /* renamed from: f */
    private boolean m18176f() {
        if (!this.f16977k) {
            ((Integer) LiveSettingKeys.LIVE_ANCHOR_INFO_ABTEST.mo10240a()).intValue();
        }
        return false;
    }

    /* renamed from: h */
    private void m18178h() {
        C9097a.m27146a().mo22267a((Object) new UserProfileEvent(this.f16971c.getOwner().getId()));
    }

    /* renamed from: l */
    private void m18182l() {
        if (isViewValid() && this.f16988v != null) {
            m18176f();
            m18162a(this.f16971c.getOwner().getFanTicketCount());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo14244b() {
        if (this.f16991y != null && !this.f16991y.isFinishing() && this.f16967R.mo21856c() && isViewValid()) {
            this.f16967R.dismiss();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo14251d() {
        if (isViewValid()) {
            m18169b(C3358ac.m12515a((int) R.string.erj));
            C8946b.f24413al.mo22118a(Boolean.valueOf(true));
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append((String) LiveSettingKeys.LIVE_FANS_GROUP_URL.mo10240a());
        sb.append("?room_id=%s&anchor_id=%s&user_id=%s&enter_from=%s&source=%s&event_module=%s&isFans=%s");
        f16947b = sb.toString();
    }

    /* renamed from: k */
    private boolean m18181k() {
        String valueOf = String.valueOf(this.f16971c.getOwner().getId());
        if (this.f16962M.mo25019a(valueOf, 0) == 1 || this.f16973e == null) {
            return false;
        }
        this.f16962M.mo25025b(valueOf, Integer.valueOf(1));
        return true;
    }

    /* renamed from: a */
    public final void mo14236a() {
        if (this.f16991y != null && !this.f16991y.isFinishing() && this.f16967R != null && this.f16967R.mo21856c()) {
            this.f16967R.dismiss();
        }
    }

    /* renamed from: e */
    private void m18175e() {
        this.f16983q = new ImageView(getContext());
        this.f16983q.setImageResource(R.drawable.c54);
        LayoutParams layoutParams = new LayoutParams((int) C9738o.m28708b(getContext(), 28.0f), (int) C9738o.m28708b(getContext(), 28.0f));
        layoutParams.gravity = 17;
        ((FrameLayout) this.f16981o).addView(this.f16983q, layoutParams);
        C9738o.m28712b(this.f16982p, 8);
        this.f16983q.setOnClickListener(new C5819r(this));
    }

    /* renamed from: j */
    private void m18180j() {
        int a = C3358ac.m12510a(2.0f);
        if (this.f16967R == null || !this.f16967R.mo21856c()) {
            this.f16967R = (C8791d) ((C8791d) ((C8791d) ((C8791d) ((C8791d) C8791d.m26348b(this.context).mo21843a((int) R.layout.awe)).mo21854c(C3358ac.m12510a(38.0f))).mo21846a(false)).mo21853b(false)).mo21862a(C5820s.f17154a).mo21842a();
            C5357o.m17078a(this.f16967R.mo21851b(), this.dataCenter);
        } else {
            this.f16967R.dismiss();
        }
        this.f16973e.post(new C5821t(this, a));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo14249c() {
        if (isViewValid()) {
            m18169b(C3358ac.m12515a((int) R.string.erj));
            C8946b.f24413al.mo22118a(Boolean.valueOf(true));
        }
    }

    public void onUnload() {
        if (this.f16954E != null) {
            this.f16954E.setVisibility(8);
        }
        this.f16975i.mo119660a();
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
        this.f16965P = null;
        this.f16955F = 0;
        this.f16956G = 0;
        this.f16957H = 0;
        this.f16959J = false;
        this.f16963N = null;
        if (this.f16969T != null) {
            for (Animator cancel : this.f16969T) {
                cancel.cancel();
            }
        }
        if (this.f16992z != null) {
            this.f16992z.removeCallbacksAndMessages(null);
        }
        if (this.f16966Q != null && this.f16966Q.mo10323a()) {
            this.f16966Q.dismissAllowingStateLoss();
        }
        this.f16966Q = null;
    }

    /* renamed from: i */
    private void m18179i() {
        if (isViewValid()) {
            User owner = this.f16971c.getOwner();
            if (owner != null) {
                this.f16984r.setVAble(false);
                C5343e.m17031a((ImageView) this.f16984r, owner.getAvatarThumb(), (int) R.drawable.c4_);
                C9738o.m28712b((View) this.f16986t, 8);
                if (owner.getBorder() != null) {
                    C3393m.m12633b(this.f16985s, owner.getBorder().f7818a);
                } else {
                    this.f16985s.setImageDrawable(null);
                }
                this.f16987u.setText(owner.displayId);
                if (owner.isFollowing()) {
                    this.f16981o.setVisibility(8);
                    if (this.f16960K) {
                        this.f16973e.setVisibility(0);
                    } else {
                        m18171c((int) C9738o.m28708b(getContext(), 12.0f));
                    }
                }
                if (TTLiveSDKContext.getHostService().mo22367h().mo22179b() == owner.getId()) {
                    this.f16981o.setVisibility(8);
                }
            }
            m18174d(this.f16971c.getUserCount());
        }
    }

    /* renamed from: g */
    private void m18177g() {
        if (isViewValid()) {
            if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
                Bundle bundle = new Bundle();
                bundle.putString("enter_from", "live_detail");
                bundle.putString("action_type", "follow");
                bundle.putString("source", "live");
                bundle.putString("v1_source", "follow");
                this.f16959J = true;
                TTLiveSDKContext.getHostService().mo22367h().mo22167a(this.context, C8987h.m26865a().mo22189a(C3332f.m12427a()).mo22191b(C3332f.m12428b()).mo22193d("live_detail").mo22194e("follow").mo22192c("live").mo22188a(1).mo22190a()).mo19189a((C7498y<? super T>) new C8986g<Object>());
                return;
            }
            if (this.f16991y != null) {
                TTLiveSDKContext.getHostService().mo22362c().checkAndShowGuide(this.f16991y, "live", this.context.getResources().getString(R.string.fab));
            }
            User owner = this.f16971c.getOwner();
            if (C9074l.m27086b(this.dataCenter) && this.f16971c.author() != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("anchor_id", String.valueOf(this.f16971c.author().getId()));
                    jSONObject.put("room_id", String.valueOf(this.f16971c.getId()));
                } catch (JSONException unused) {
                }
                C3596c.m13172a(C9295a.class);
                C8446a.m25675a().mo21611a(jSONObject).mo21610a(C9074l.m27087c(this.dataCenter));
            }
            if (C9074l.m27089d(this.dataCenter) && this.f16971c.author() != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("anchor_id", String.valueOf(this.f16971c.author().getId()));
                    jSONObject2.put("room_id", String.valueOf(this.f16971c.getId()));
                } catch (JSONException unused2) {
                }
                C3596c.m13172a(C9295a.class);
                C8446a.m25675a().mo21611a(jSONObject2).mo21610a(C9074l.m27090e(this.dataCenter));
            }
            TTLiveSDKContext.getHostService().mo22367h().mo22169a(((C8983b) ((C8983b) ((C8983b) ((C8983b) ((C8983b) ((C8983b) ((C8983b) ((C8983b) ((C8977a) C8985f.m26862b().mo22153a(owner.getId())).mo22154a(this.f16971c.getRequestId())).mo22157b(this.f16978l)).mo22158c("live")).mo22156b(this.f16971c.getId())).mo22159d(this.f16971c.getLabels())).mo22161a(this.f16991y)).mo22162e("live_detail")).mo22163f("follow")).mo22164c()).mo19294a(C47549a.m148327a()).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19189a((C7498y<? super T>) new C7498y<FollowPair>() {
                public final void onComplete() {
                }

                public final void onSubscribe(C7321c cVar) {
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNext(FollowPair followPair) {
                    LiveRoomUserInfoWidget.this.mo14247b(followPair);
                }

                public final void onError(Throwable th) {
                    if (LiveRoomUserInfoWidget.this.isViewValid()) {
                        LiveRoomUserInfoWidget.this.mo14237a(0);
                        LiveRoomUserInfoWidget.this.f16974f.setVisibility(8);
                        C9076n.m27095a(LiveRoomUserInfoWidget.this.context, th);
                    }
                }
            });
            mo14237a(8);
            this.f16974f.setVisibility(0);
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("growth_deepevent", "1");
                C8443c.m25663a().mo21606a("follow", hashMap, new C8431c("live", owner.getId()), new C8438j().mo21599b("live_interact").mo21598a("live_detail"), Room.class);
            } catch (Exception unused3) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo14246b(View view) {
        m18178h();
    }

    /* renamed from: a */
    private void m18162a(long j) {
        if (this.f16955F <= j) {
            m18176f();
        }
    }

    /* renamed from: b */
    private void m18168b(long j) {
        if (this.f16956G <= j) {
            m18176f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo14250c(View view) {
        this.f16970U = true;
        m18177g();
    }

    /* renamed from: c */
    private void m18171c(int i) {
        ViewGroup.LayoutParams layoutParams = this.f16972d.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = i;
            this.f16972d.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    private void m18169b(String str) {
        C8545cg a = C4270b.m14422a(this.f16971c.getId(), null, "", 5, str, "#FF8533", "7", "");
        a.f23534l = R.drawable.c6x;
        IMessageManager iMessageManager = (IMessageManager) this.dataCenter.get("data_message_manager");
        if (iMessageManager != null) {
            iMessageManager.insertMessage(a, true);
        }
    }

    /* renamed from: c */
    private void m18172c(String str) {
        C8545cg a = C4270b.m14422a(this.f16971c.getId(), null, "", 5, str, "#FF8533", "9", "");
        a.f23534l = R.drawable.c6x;
        IMessageManager iMessageManager = (IMessageManager) this.dataCenter.get("data_message_manager");
        if (iMessageManager != null) {
            iMessageManager.insertMessage(a, true);
        }
    }

    /* renamed from: d */
    private void m18174d(int i) {
        if (isViewValid()) {
            this.f16988v.setText(this.context.getString(R.string.f7s, new Object[]{C9094x.m27135a((long) i)}));
        }
    }

    /* renamed from: a */
    public final void mo14237a(int i) {
        C9738o.m28712b((View) this.f16983q, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo14245b(int i) {
        if (isViewValid()) {
            this.f16967R.mo21848a(this.f16973e, (-i) * 2, i);
            this.f16992z.postDelayed(new C5822u(this), DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo14252d(View view) {
        m18166a("fans_club_button");
        if (this.f16966Q != null) {
            C8443c.m25663a().mo21607a("livesdk_fans_club_audience_open", new Object[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14238a(View view) {
        m18177g();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (isViewValid() && kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            boolean z = true;
            int i = 0;
            switch (key.hashCode()) {
                case -1741164106:
                    if (key.equals("data_user_in_room")) {
                        c = 5;
                        break;
                    }
                    break;
                case -407049065:
                    if (key.equals("data_member_message")) {
                        c = 3;
                        break;
                    }
                    break;
                case 506917167:
                    if (key.equals("data_login_event")) {
                        c = 2;
                        break;
                    }
                    break;
                case 519380817:
                    if (key.equals("data_anchor_ticket_count")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1060055221:
                    if (key.equals("data_keyboard_status")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1102839345:
                    if (key.equals("data_xt_followed_change")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1247726949:
                    if (key.equals("data_current_room_ticket_count")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2143307222:
                    if (key.equals("cmd_wanna_follow_anchor")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m18162a(((Long) kVData.getData()).longValue());
                    return;
                case 1:
                    m18168b(((Long) kVData.getData()).longValue());
                    return;
                case 2:
                    if (((C4454x) kVData.getData()).f12917a) {
                        TTLiveSDKContext.getHostService().mo22367h().mo22180b(this.f16971c.getOwner().getId()).mo19127a(C47549a.m148327a()).mo19124a((C47559ag<? super T, ? extends R>) getAutoUnbindTransformer()).mo19129a((C7326g<? super T>) new C5811j<Object>(this), C5812k.f17146a);
                        return;
                    }
                    break;
                case 3:
                    C8514bj bjVar = (C8514bj) kVData.getData();
                    if (bjVar != null) {
                        int i2 = bjVar.f23389a;
                        if (i2 > 0) {
                            m18174d(i2);
                        }
                        return;
                    }
                    break;
                case 4:
                    boolean booleanValue = ((Boolean) kVData.getData()).booleanValue();
                    View view = this.f16979m;
                    if (booleanValue) {
                        i = 8;
                    }
                    view.setVisibility(i);
                    return;
                case 5:
                    Object data = kVData.getData();
                    boolean z2 = data instanceof User;
                    if (z2) {
                        this.f16963N = (User) data;
                    }
                    if (z2 && !this.f16977k) {
                        if (this.f16963N.getFansClub() == null || this.f16963N.getFansClub().getData() == null || this.f16963N.getFansClub().getData().anchorId != this.f16971c.getOwnerUserId()) {
                            z = false;
                        }
                        this.f16964O = z;
                        if (this.f16964O && this.f16961L && !((Boolean) C8946b.f24413al.mo22117a()).booleanValue()) {
                            this.contentView.postDelayed(new C5823v(this), 1000);
                            return;
                        }
                    }
                case 6:
                    long longValue = ((Long) kVData.getData()).longValue();
                    this.f16957H = longValue;
                    this.f16989w.setText(this.context.getString(R.string.ejx, new Object[]{C3385e.m12593c(longValue)}));
                    break;
                case 7:
                    break;
            }
            if (this.f16982p.getVisibility() == 0 || (this.f16983q != null && this.f16983q.getVisibility() == 0)) {
                m18177g();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo14248b(Long l) throws Exception {
        m18169b(C3358ac.m12515a((int) R.string.ern));
        C8946b.f24411aj.mo22118a(Boolean.valueOf(true));
    }

    public void onInit(Object... objArr) {
        String str;
        this.f16960K = !C9290a.f25466a;
        this.f16961L = ((Boolean) LiveSettingKeys.LIVE_SHOW_FANS_CLUB_RENEWAL.mo10240a()).booleanValue();
        this.f16979m = this.contentView.findViewById(R.id.fx);
        this.f16980n = this.contentView.findViewById(R.id.fx);
        this.f16968S = (ViewStub) this.contentView.findViewById(R.id.aie);
        this.f16972d = this.contentView.findViewById(R.id.c36);
        this.f16981o = this.contentView.findViewById(R.id.anr);
        this.f16982p = this.contentView.findViewById(R.id.anj);
        this.f16974f = (ProgressBar) this.contentView.findViewById(R.id.anw);
        this.f16973e = this.contentView.findViewById(R.id.ahw);
        this.f16984r = (VHeadView) this.contentView.findViewById(R.id.au8);
        this.f16985s = (HSImageView) this.contentView.findViewById(R.id.b70);
        this.f16986t = (ImageView) this.containerView.findViewById(R.id.e_5);
        this.f16987u = (TextView) this.contentView.findViewById(R.id.e9m);
        this.f16988v = (TextView) this.contentView.findViewById(R.id.dj3);
        this.f16989w = (TextView) this.containerView.findViewById(R.id.ail);
        this.f16951B = this.contentView.findViewById(R.id.dj5);
        this.f16952C = (TextView) this.contentView.findViewById(R.id.dj4);
        this.f16953D = (TextView) this.contentView.findViewById(R.id.dj6);
        this.f16954E = this.containerView.findViewById(R.id.e9v);
        if (C9738o.m28691a(this.context) < 500) {
            this.f16987u.setMaxWidth(100);
        }
        this.f16973e.setOnClickListener(new C5826y(this));
        this.f16990x = this.context.getResources().getDimensionPixelOffset(R.dimen.r5);
        this.f16982p.setOnClickListener(new C5827z(this));
        try {
            this.f16982p.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.bso));
        } catch (Exception unused) {
        }
        this.f16980n.setOnClickListener(new C5778aa(this));
        if (C7285c.m22838a(this.context, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.f16950A = str;
        C5357o.m17079a(this.f16982p, this.context.getString(R.string.elf), this.dataCenter);
    }

    /* renamed from: a */
    private void m18166a(String str) {
        String str2;
        boolean z;
        int i;
        int i2;
        int i3;
        String str3;
        String str4;
        Map map;
        String str5 = f16946a;
        if (C5900c.m18433a(this.f16977k)) {
            str5 = f16947b;
        }
        Locale locale = Locale.US;
        int i4 = 8;
        Object[] objArr = new Object[8];
        objArr[0] = Long.valueOf(this.f16971c.getId());
        boolean z2 = true;
        objArr[1] = Long.valueOf(this.f16971c.getOwner().getId());
        objArr[2] = Long.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b());
        objArr[3] = this.f16978l;
        objArr[4] = "";
        objArr[5] = "top";
        if (this.f16964O) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        objArr[6] = str2;
        objArr[7] = Integer.valueOf(C9281a.m27615a(TTLiveSDKContext.getHostService().mo22367h().mo22165a()));
        String a = C1642a.m8035a(locale, str5, objArr);
        if (C5900c.m18433a(this.f16977k)) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("&web_bg_color=%2300000000");
            a = sb.toString();
        }
        Uri build = Uri.parse(a).buildUpon().appendQueryParameter("request_page", str).build();
        if (C9074l.m27089d(this.dataCenter) || C9074l.m27086b(this.dataCenter)) {
            if (C9074l.m27086b(this.dataCenter)) {
                map = C9074l.m27087c(this.dataCenter);
            } else {
                map = C9074l.m27090e(this.dataCenter);
            }
            build = build.buildUpon().appendQueryParameter("live_ad", new JSONObject(map).toString()).build();
        }
        String uri = build.toString();
        if (this.dataCenter != null) {
            z = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        } else {
            z = true;
        }
        DisplayMetrics displayMetrics = this.context.getResources().getDisplayMetrics();
        int i5 = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
        int i6 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (!z) {
            i5 = C9738o.m28714c(getContext(), (float) C9051ar.m27033a(getContext()));
        } else if (C5900c.m18433a(this.f16977k)) {
            i6 = (int) (((float) i6) * 0.85f);
        } else {
            i6 = FansService.FANS_GROUP_DIALOG_HEIGHT;
        }
        if (this.f16966Q != null) {
            this.f16966Q.dismissAllowingStateLoss();
            this.f16966Q = null;
        }
        C3975b b = C3979c.m13951a(uri).mo11555a(i5).mo11560b(i6);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C3975b a2 = b.mo11556a(8, 8, i, i2);
        if (z) {
            z2 = false;
        }
        C3975b b2 = a2.mo11561b(z2);
        if (z) {
            i4 = 0;
        }
        C3975b c = b2.mo11562c(i4);
        if (z) {
            i3 = 80;
        } else {
            i3 = 8388613;
        }
        C3975b e = c.mo11566e(i3);
        if (C5900c.m18433a(this.f16977k)) {
            e.mo11568f(0);
            e.mo11565d(false);
        }
        this.f16966Q = C9178j.m27302j().mo22374c().mo11533a(e);
        HashMap hashMap = new HashMap();
        String str6 = "anchor_id";
        if (this.f16971c != null) {
            str3 = String.valueOf(this.f16971c.getOwnerUserId());
        } else {
            str3 = "0";
        }
        hashMap.put(str6, str3);
        String str7 = "room_id";
        if (this.f16971c != null) {
            str4 = String.valueOf(this.f16971c.getId());
        } else {
            str4 = "0";
        }
        hashMap.put(str7, str4);
        C8443c.m25663a().mo21606a("livesdk_fans_club_entrance_click", hashMap, new Object[0]);
        if (this.f16966Q != null) {
            C3916b.m13813a().mo11465b();
            BaseDialogFragment.m12686a((FragmentActivity) this.context, (DialogFragment) this.f16966Q);
            this.f16966Q.f10227d = new OnDismissListener() {
                public final void onDismiss(DialogInterface dialogInterface) {
                    C3916b.m13813a().mo11466c();
                }
            };
        }
    }

    public void onLoad(Object... objArr) {
        this.f16971c = (Room) this.dataCenter.get("data_room");
        this.f16977k = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f16958I = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f16978l = (String) this.dataCenter.get("log_enter_live_source");
        this.f16976j = (C8984e) this.dataCenter.get("data_user_center");
        this.f16991y = (FragmentActivity) this.context;
        this.f16973e.setVisibility(8);
        this.f16981o.setVisibility(0);
        if (this.f16954E != null) {
            if (this.f16971c.isUnusedEffect()) {
                this.f16954E.setVisibility(0);
                C8443c.m25663a().mo21607a("no_beauty_icon_show", Room.class);
            } else {
                this.f16954E.setVisibility(8);
            }
        }
        this.f16974f.setVisibility(8);
        if (!this.f16977k) {
            try {
                String[] strArr = {"money", "fans", "nothing", "room_money"};
                HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder();
                sb.append(this.f16971c.getOwnerUserId());
                hashMap.put("anchor_id", sb.toString());
                hashMap.put("room_id", this.f16971c.getIdStr());
                hashMap.put("rank_type", strArr[((Integer) LiveSettingKeys.LIVE_ANCHOR_INFO_ABTEST.mo10240a()).intValue()]);
                TTLiveSDKContext.getHostService().mo22363d().mo23269a("livesdk_live_room_info", hashMap);
            } catch (Exception e) {
                C6312h.m19577a((Throwable) e);
            }
        }
        m18175e();
        if (this.f16977k) {
            m18171c((int) C9738o.m28708b(getContext(), 6.0f));
            this.f16981o.setVisibility(8);
            if (this.f16960K) {
                this.f16973e.setVisibility(0);
                if (!((Boolean) C8946b.f24411aj.mo22117a()).booleanValue()) {
                    C7492s.m23295b(1, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19280a((C7326g<? super T>) new C5779ab<Object>(this), C5780ac.f17028a);
                }
                if (this.f16961L && !((Boolean) C8946b.f24412ak.mo22117a()).booleanValue()) {
                    C7492s.m23295b(1, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19280a((C7326g<? super T>) new C5781ad<Object>(this), C5782ae.f17030a);
                }
            } else {
                m18171c((int) C9738o.m28708b(getContext(), 12.0f));
            }
        }
        m18182l();
        if (this.f16989w != null) {
            this.f16957H = this.f16971c.getOwner().getFollowInfo().getFollowerCount();
            this.f16989w.setText(this.context.getString(R.string.ejx, new Object[]{C3385e.m12593c(this.f16957H)}));
        }
        if (this.f16977k) {
            this.f16975i.mo119661a(((C3245ad) C9097a.m27146a().mo22266a(C2437b.class).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10183a(new C5813l(this), C5814m.f17148a));
        } else {
            this.f16975i.mo119661a(this.f16976j.mo22184d(this.f16971c.getOwner().getId()).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C5815n<Object>(this), C5816o.f17150a));
        }
        m18176f();
        this.f16975i.mo119661a(this.f16976j.mo22181c(this.f16971c.getOwnerUserId()).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C5817p<Object>(this), C5818q.f17152a));
        m18179i();
        this.f16992z = new C6309f(this.context.getMainLooper(), this);
        this.f16962M = C10296b.m30494a(this.context, "live_fans_club_tips");
        this.dataCenter.observeForever("data_anchor_ticket_count", this).observeForever("data_current_room_ticket_count", this).observeForever("data_login_event", this).observe("data_member_message", this).observe("cmd_send_gift", this).observeForever("data_keyboard_status", this).observe("data_user_in_room", this).observe("cmd_dismiss_dialog_end", this).observe("data_xt_followed_change", this).observe("cmd_wanna_follow_anchor", this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14239a(IUser iUser) throws Exception {
        this.dataCenter.lambda$put$1$DataCenter("data_anchor_ticket_count", Long.valueOf(iUser.getFanTicketCount()));
    }
}
