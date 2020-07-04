package com.bytedance.android.livesdk.chatroom.p220ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.widget.DrawerLayout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.user.C2378j;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.C2440e;
import com.bytedance.android.live.broadcast.api.model.DutyGiftInfo;
import com.bytedance.android.live.broadcast.api.p125a.C2415a;
import com.bytedance.android.live.broadcast.api.p125a.C2415a.C2416a;
import com.bytedance.android.live.broadcast.api.p128d.C2431a;
import com.bytedance.android.live.broadcast.api.p128d.C2435d;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.p146b.C3164a;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.p148d.C3168a;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.live.core.performance.C3222b;
import com.bytedance.android.live.core.performance.TimeCostUtil;
import com.bytedance.android.live.core.performance.TimeCostUtil.Tag;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3384d;
import com.bytedance.android.live.core.utils.p159b.C3377b;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.p164b.C3430a;
import com.bytedance.android.live.gift.p164b.C3431b;
import com.bytedance.android.live.gift.p164b.C3432c;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.room.C3486d;
import com.bytedance.android.live.room.C3486d.C3487a;
import com.bytedance.android.live.room.C3496m;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.C3777e;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.IWalletService.C3597a;
import com.bytedance.android.live.wallet.model.FirstChargeCheck;
import com.bytedance.android.livesdk.C3850ab;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.banner.InRoomBannerManager;
import com.bytedance.android.livesdk.browser.fragment.WebDialogFragment;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4159bo;
import com.bytedance.android.livesdk.browser.jsbridge.p199a.C4033c;
import com.bytedance.android.livesdk.browser.jsbridge.p199a.C4034d;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.detail.C4329h;
import com.bytedance.android.livesdk.chatroom.event.C4411ac;
import com.bytedance.android.livesdk.chatroom.event.C4413ae;
import com.bytedance.android.livesdk.chatroom.event.C4414af;
import com.bytedance.android.livesdk.chatroom.event.C4422an;
import com.bytedance.android.livesdk.chatroom.event.C4423ao;
import com.bytedance.android.livesdk.chatroom.event.C4425aq;
import com.bytedance.android.livesdk.chatroom.event.C4426ar;
import com.bytedance.android.livesdk.chatroom.event.C4432b;
import com.bytedance.android.livesdk.chatroom.event.C4435e;
import com.bytedance.android.livesdk.chatroom.event.C4436f;
import com.bytedance.android.livesdk.chatroom.event.C4439i;
import com.bytedance.android.livesdk.chatroom.event.C4440j;
import com.bytedance.android.livesdk.chatroom.event.C4444n;
import com.bytedance.android.livesdk.chatroom.event.C4448r;
import com.bytedance.android.livesdk.chatroom.event.C4452v;
import com.bytedance.android.livesdk.chatroom.event.C4453w;
import com.bytedance.android.livesdk.chatroom.event.C4454x;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.interact.C4490ao;
import com.bytedance.android.livesdk.chatroom.model.C4901d;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.chatroom.p208b.C4261a;
import com.bytedance.android.livesdk.chatroom.p209bl.C4270b;
import com.bytedance.android.livesdk.chatroom.p209bl.PlatformMessageHelper;
import com.bytedance.android.livesdk.chatroom.p209bl.PlatformMessageHelper.C4265a;
import com.bytedance.android.livesdk.chatroom.p212e.C4374z;
import com.bytedance.android.livesdk.chatroom.presenter.C4990bq;
import com.bytedance.android.livesdk.chatroom.presenter.C5008cb;
import com.bytedance.android.livesdk.chatroom.presenter.C5024i;
import com.bytedance.android.livesdk.chatroom.utils.C5346g;
import com.bytedance.android.livesdk.chatroom.view.C5371a;
import com.bytedance.android.livesdk.chatroom.view.C5372b;
import com.bytedance.android.livesdk.chatroom.viewmodule.BarrageWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentPromotionWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommonGuideWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommonToastWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget.C5412a;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.EnterAnimWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.FirstRechargeWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.GameQuizWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.PopularCardWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.PrivateDebugInfoWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.PromotionStatusWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.RadioWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.RechargeWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.RoomPushWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.TextMessageWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.UserPermissionCheckWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.DutyGiftToolbarWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.LiveToolbarWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.chatroom.widget.AnimationLayer;
import com.bytedance.android.livesdk.chatroom.widget.CountDownView;
import com.bytedance.android.livesdk.chatroom.widget.DebugInfoView;
import com.bytedance.android.livesdk.chatroom.widget.LiveRoomTopBelowWidget;
import com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.chatroom.widget.LiveRoomWatchUserWidget;
import com.bytedance.android.livesdk.commerce.C5839a;
import com.bytedance.android.livesdk.commerce.C5840b;
import com.bytedance.android.livesdk.common.ViewModuleManager;
import com.bytedance.android.livesdk.commonpop.CommonPopupMessageWidget;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.p374d.C7895a;
import com.bytedance.android.livesdk.kickout.p398a.C8369b;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.C8445e.C8446a;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p404a.C8420k;
import com.bytedance.android.livesdk.log.p404a.C8423n;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.message.model.C8481ah;
import com.bytedance.android.livesdk.message.model.C8493as;
import com.bytedance.android.livesdk.message.model.C8497aw;
import com.bytedance.android.livesdk.message.model.C8514bj;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.message.model.C8540cb;
import com.bytedance.android.livesdk.message.model.C8541cc;
import com.bytedance.android.livesdk.message.model.C8544cf;
import com.bytedance.android.livesdk.message.model.C8683p;
import com.bytedance.android.livesdk.message.model.C8686r;
import com.bytedance.android.livesdk.message.model.C8688t;
import com.bytedance.android.livesdk.p203c.C4228a;
import com.bytedance.android.livesdk.p393h.C8296e;
import com.bytedance.android.livesdk.p401l.C8379a;
import com.bytedance.android.livesdk.p417q.C8791d;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.p431y.p433b.C9281a;
import com.bytedance.android.livesdk.rank.BackToPreRoomWidget;
import com.bytedance.android.livesdk.rank.C8804a;
import com.bytedance.android.livesdk.share.C8940a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.user.C8976b.C8977a;
import com.bytedance.android.livesdk.user.C8976b.C8978b;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdk.user.C8985f;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.utils.C9038ag;
import com.bytedance.android.livesdk.utils.C9043ak;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9074l;
import com.bytedance.android.livesdk.utils.C9079q;
import com.bytedance.android.livesdk.utils.p425a.C9023a;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.C9289b;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p438a.C9297a;
import com.bytedance.android.livesdkapi.depend.p439b.C9300c;
import com.bytedance.android.livesdkapi.depend.share.C9388a;
import com.bytedance.android.livesdkapi.depend.share.C9389b;
import com.bytedance.android.livesdkapi.depend.share.C9389b.C9391a;
import com.bytedance.android.livesdkapi.host.C9439a;
import com.bytedance.android.livesdkapi.message.C9499a;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.android.livesdkapi.p447e.C9400e;
import com.bytedance.android.livesdkapi.p451g.C9409a;
import com.bytedance.android.livesdkapi.p452h.C9420h;
import com.bytedance.android.livesdkapi.p458j.C9496c;
import com.bytedance.android.livesdkapi.p458j.p459a.C9494e;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.p533a.C10290a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.Widget;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.ttm.player.MediaPlayer;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment */
public abstract class AbsInteractionFragment extends DialogFragment implements C0053p<KVData>, C2416a, C3432c, C3486d, C4265a, C5371a, C5372b, C5412a, C9297a, C6310a, C10290a {

    /* renamed from: A */
    public CommentWidget f14352A;

    /* renamed from: B */
    protected LiveRoomTopBelowWidget f14353B;

    /* renamed from: C */
    public BarrageWidget f14354C;

    /* renamed from: D */
    public C8984e f14355D;

    /* renamed from: E */
    public LinearLayout f14356E;

    /* renamed from: F */
    public boolean f14357F = false;

    /* renamed from: G */
    C3431b f14358G = new C3431b() {
        /* renamed from: b */
        public final void mo10397b() {
            C9049ap.m27022a((int) R.string.es1);
        }

        /* renamed from: a */
        public final void mo10394a() {
            C9049ap.m27022a((int) R.string.fc7);
            AbsInteractionFragment.this.f14472v.lambda$put$1$DataCenter("cmd_show_recharge_dialog", new C4425aq(0, "live_detail"));
        }

        /* renamed from: a */
        public final void mo10396a(String str) {
            C9049ap.m27028a(str);
        }

        /* renamed from: a */
        public final void mo10395a(C8158m mVar) {
            AbsInteractionFragment.this.mo10398b();
            if (C9038ag.m26996a() != null) {
                C9038ag.m26996a().insertMessage(((IGiftService) C3596c.m13172a(IGiftService.class)).getGiftMessage(AbsInteractionFragment.this.f14378a.getId(), mVar, AbsInteractionFragment.this.f14468r));
            }
            AbsInteractionFragment.this.f14472v.get("log_enter_live_source");
            String str = (String) AbsInteractionFragment.this.f14472v.get("log_action_type");
            C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
            String str2 = "";
            String str3 = "";
            if (a.mo21568a().containsKey("source")) {
                str3 = (String) a.mo21568a().get("source");
            }
            if (a.mo21568a().containsKey("enter_from")) {
                str2 = (String) a.mo21568a().get("enter_from");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_type", "core");
            hashMap.put("event_belong", "live_interact");
            hashMap.put("event_page", "live_detail");
            hashMap.put("room_id", String.valueOf(AbsInteractionFragment.this.f14378a.getId()));
            hashMap.put("enter_from", str2);
            hashMap.put("anchor_id", String.valueOf(AbsInteractionFragment.this.f14378a.getOwner().getId()));
            hashMap.put("gift_id", String.valueOf(mVar.f22301e));
            hashMap.put("live_type", "video_live");
            hashMap.put("gift_type", "convenient_gift");
            hashMap.put("source", str3);
            hashMap.put("request_page", "shortcut");
            hashMap.put("event_type", "other");
            hashMap.put("event_module", "bottom_tab");
            hashMap.put("money", "1");
            hashMap.put("gift_cnt", "1");
            hashMap.put("action_type", str);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(Long.valueOf(mVar.f22301e), Integer.valueOf(1));
            hashMap.put("gift_info", C7895a.m24190a(hashMap2));
            hashMap.put("is_first_consume", String.valueOf(C9281a.m27615a(TTLiveSDKContext.getHostService().mo22367h().mo22165a())));
            hashMap.put("growth_deepevent", "1");
            C8443c.m25663a().mo21606a("send_gift", hashMap, new Object[0]);
        }
    };

    /* renamed from: H */
    private C5064a f14359H = C5064a.NORMAL;

    /* renamed from: I */
    private C5064a f14360I = this.f14359H;

    /* renamed from: J */
    private String f14361J;

    /* renamed from: K */
    private EnterRoomExtra f14362K;

    /* renamed from: L */
    private boolean f14363L;

    /* renamed from: M */
    private boolean f14364M;

    /* renamed from: N */
    private View f14365N;

    /* renamed from: O */
    private CountDownView f14366O;

    /* renamed from: P */
    private AnimationLayer f14367P;

    /* renamed from: Q */
    private Chronometer f14368Q;

    /* renamed from: R */
    private TextView f14369R;

    /* renamed from: S */
    private View f14370S;

    /* renamed from: T */
    private View f14371T;

    /* renamed from: U */
    private View f14372U;

    /* renamed from: V */
    private View f14373V;

    /* renamed from: W */
    private LayoutParams f14374W;

    /* renamed from: X */
    private LayoutParams f14375X;

    /* renamed from: Y */
    private DialogFragment f14376Y;

    /* renamed from: Z */
    private boolean f14377Z;

    /* renamed from: a */
    protected Room f14378a;

    /* renamed from: aA */
    private RoomPushWidget f14379aA;

    /* renamed from: aB */
    private BottomRightBannerWidget f14380aB;

    /* renamed from: aC */
    private BottomRightBannerContainerWidget f14381aC;

    /* renamed from: aD */
    private RechargeWidget f14382aD;

    /* renamed from: aE */
    private LiveShareWidget f14383aE;

    /* renamed from: aF */
    private C2431a f14384aF;

    /* renamed from: aG */
    private FirstRechargeWidget f14385aG;

    /* renamed from: aH */
    private CommonToastWidget f14386aH;

    /* renamed from: aI */
    private FollowGuideWidget f14387aI;

    /* renamed from: aJ */
    private UserPermissionCheckWidget f14388aJ;

    /* renamed from: aK */
    private EndWidget f14389aK;

    /* renamed from: aL */
    private PopularCardWidget f14390aL;

    /* renamed from: aM */
    private CommonGuideWidget f14391aM;

    /* renamed from: aN */
    private View f14392aN;

    /* renamed from: aO */
    private int f14393aO;

    /* renamed from: aP */
    private FrameLayout f14394aP;

    /* renamed from: aQ */
    private boolean f14395aQ;

    /* renamed from: aR */
    private TextView f14396aR;

    /* renamed from: aS */
    private TextView f14397aS;

    /* renamed from: aT */
    private LottieAnimationView f14398aT;

    /* renamed from: aU */
    private C2415a f14399aU;

    /* renamed from: aV */
    private C2435d f14400aV;

    /* renamed from: aW */
    private int f14401aW;

    /* renamed from: aX */
    private long f14402aX = 0;

    /* renamed from: aY */
    private DebugInfoView f14403aY;

    /* renamed from: aZ */
    private View f14404aZ;

    /* renamed from: aa */
    private GestureDetectLayout f14405aa;

    /* renamed from: ab */
    private View f14406ab;

    /* renamed from: ac */
    private FrameLayout f14407ac;

    /* renamed from: ad */
    private View f14408ad;

    /* renamed from: ae */
    private C5024i f14409ae;

    /* renamed from: af */
    private C4990bq f14410af;

    /* renamed from: ag */
    private C5008cb f14411ag;

    /* renamed from: ah */
    private C8379a f14412ah;

    /* renamed from: ai */
    private boolean f14413ai = false;

    /* renamed from: aj */
    private InRoomBannerManager f14414aj;

    /* renamed from: ak */
    private LiveProfileDialogV2 f14415ak;

    /* renamed from: al */
    private LiveProfileSettingDialog f14416al;

    /* renamed from: am */
    private C5288dt f14417am;

    /* renamed from: an */
    private Dialog f14418an;

    /* renamed from: ao */
    private Widget f14419ao;

    /* renamed from: ap */
    private EnterAnimWidget f14420ap;

    /* renamed from: aq */
    private GameQuizWidget f14421aq;

    /* renamed from: ar */
    private DecorationWrapperWidget f14422ar;

    /* renamed from: as */
    private LiveRoomNotifyWidget f14423as;

    /* renamed from: at */
    private LiveToolbarWidget f14424at;

    /* renamed from: au */
    private DutyGiftToolbarWidget f14425au;

    /* renamed from: av */
    private LiveRoomUserInfoWidget f14426av;

    /* renamed from: aw */
    private LiveRoomWatchUserWidget f14427aw;

    /* renamed from: ax */
    private PromotionStatusWidget f14428ax;

    /* renamed from: ay */
    private RadioWidget f14429ay;

    /* renamed from: az */
    private CommentPromotionWidget f14430az;

    /* renamed from: b */
    public boolean f14431b;

    /* renamed from: ba */
    private C8791d f14432ba;

    /* renamed from: bb */
    private C9400e f14433bb;

    /* renamed from: bc */
    private OnKeyListener f14434bc = new OnKeyListener() {

        /* renamed from: b */
        private boolean f14478b;

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                this.f14478b = true;
                return false;
            } else if (4 != i || !this.f14478b) {
                return false;
            } else {
                AbsInteractionFragment.this.mo9067a();
                this.f14478b = false;
                return true;
            }
        }
    };

    /* renamed from: bd */
    private C47557ad<IUser> f14435bd = new C47557ad<IUser>() {
        public final void onError(Throwable th) {
            AbsInteractionFragment.this.mo13118a(th);
        }

        public final void onSubscribe(C7321c cVar) {
            AbsInteractionFragment.this.f14464n.mo119661a(cVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(IUser iUser) {
            boolean z;
            if (AbsInteractionFragment.this.mo13138o() && iUser != null) {
                AbsInteractionFragment.this.f14468r = (User) iUser;
                AbsInteractionFragment.this.f14472v.lambda$put$1$DataCenter("data_user_in_room", AbsInteractionFragment.this.f14468r);
                C8946b.f24374Z.mo22118a(Boolean.valueOf(AbsInteractionFragment.this.f14468r.getRoomAutoGiftThanks()));
                C2378j userAttr = AbsInteractionFragment.this.f14468r.getUserAttr();
                if (!(userAttr == null || AbsInteractionFragment.this.f14352A == null)) {
                    AbsInteractionFragment.this.f14352A.mo13695b(userAttr.f7829a);
                }
                if (userAttr == null || !userAttr.f7829a) {
                    z = false;
                } else {
                    z = true;
                }
                C4159bo.f12203a = z;
            }
        }
    };

    /* renamed from: be */
    private Dialog f14436be = null;

    /* renamed from: bf */
    private C3430a f14437bf;

    /* renamed from: bg */
    private boolean f14438bg = true;

    /* renamed from: bh */
    private int f14439bh;

    /* renamed from: bi */
    private int f14440bi;

    /* renamed from: bj */
    private int f14441bj;

    /* renamed from: bk */
    private int f14442bk;

    /* renamed from: bl */
    private boolean f14443bl = false;

    /* renamed from: bm */
    private C4490ao f14444bm;

    /* renamed from: bn */
    private OnClickListener f14445bn = new C5174a(this);

    /* renamed from: bo */
    private Runnable f14446bo;

    /* renamed from: bp */
    private long f14447bp;

    /* renamed from: bq */
    private Runnable f14448bq = new Runnable() {
        public final void run() {
            if (AbsInteractionFragment.this.f14431b && TTLiveSDKContext.getHostService().mo22367h().mo22182c() && !AbsInteractionFragment.this.f14453c) {
                if (!AbsInteractionFragment.this.f14378a.getOwner().isFollowing()) {
                    AbsInteractionFragment.this.mo13124b(true);
                    AbsInteractionFragment.this.f14454d = true;
                }
                AbsInteractionFragment.this.mo13109a(120000);
            }
        }
    };

    /* renamed from: br */
    private Runnable f14449br = new C5206b(this);

    /* renamed from: bs */
    private boolean f14450bs = false;

    /* renamed from: bt */
    private OnTouchListener f14451bt = new OnTouchListener() {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (!AbsInteractionFragment.this.f14467q.mo13605a(motionEvent)) {
                AbsInteractionFragment.this.f14466p.onTouchEvent(motionEvent);
            }
            return false;
        }
    };

    /* renamed from: bu */
    private C3487a f14452bu;

    /* renamed from: c */
    protected boolean f14453c;

    /* renamed from: d */
    public boolean f14454d;

    /* renamed from: e */
    protected boolean f14455e;

    /* renamed from: f */
    public boolean f14456f;

    /* renamed from: g */
    protected int f14457g;

    /* renamed from: h */
    protected View f14458h;

    /* renamed from: i */
    protected View f14459i;

    /* renamed from: j */
    protected View f14460j;

    /* renamed from: k */
    protected View f14461k;

    /* renamed from: l */
    protected FrameLayout f14462l;

    /* renamed from: m */
    protected View f14463m;

    /* renamed from: n */
    public final C47562b f14464n = new C47562b();

    /* renamed from: o */
    protected C6309f f14465o = new C6309f(this);

    /* renamed from: p */
    public GestureDetector f14466p;

    /* renamed from: q */
    public C5325s f14467q;

    /* renamed from: r */
    public User f14468r;

    /* renamed from: s */
    public LiveMode f14469s;

    /* renamed from: t */
    public List<C4228a> f14470t = new ArrayList();

    /* renamed from: u */
    public C4329h f14471u;

    /* renamed from: v */
    protected DataCenter f14472v;

    /* renamed from: w */
    public ViewModuleManager f14473w;

    /* renamed from: x */
    public BaseDialogFragment f14474x;

    /* renamed from: y */
    protected RecyclableWidgetManager f14475y;

    /* renamed from: z */
    public TextMessageWidget f14476z;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a */
    enum C5064a {
        NORMAL,
        RADIO,
        RADIO_INTERACT,
        PK
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$b */
    final class C5065b extends SimpleOnGestureListener {
        private C5065b() {
        }

        public final boolean onDown(MotionEvent motionEvent) {
            AbsInteractionFragment.this.mo13135l();
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            if (AbsInteractionFragment.this.f14378a != null) {
                C9097a.m27146a().mo22267a((Object) new C4452v(26, AbsInteractionFragment.this.f14378a));
            }
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (!AbsInteractionFragment.this.f14453c && !((Boolean) C3912d.m13795a().f11699b).booleanValue() && AbsInteractionFragment.this.f14354C != null && AbsInteractionFragment.this.f14354C.mo13674a(false)) {
                return true;
            }
            return false;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if ((AbsInteractionFragment.this.f14469s.isStreamingBackground && AbsInteractionFragment.this.f14453c) || motionEvent == null || motionEvent2 == null) {
                return false;
            }
            if (!AbsInteractionFragment.this.f14453c) {
                C3596c.m13172a(C9439a.class);
            }
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) <= 200.0f || Math.abs(f) <= 100.0f) {
                return false;
            }
            if (AbsInteractionFragment.this.f14453c) {
                AbsInteractionFragment.this.mo13121b(x);
            } else {
                AbsInteractionFragment.this.mo13126c(x);
            }
            return true;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$c */
    public interface C5066c {
        /* renamed from: a */
        void mo13174a(long j, long j2);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$d */
    class C5067d implements C5739a {
        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C5067d() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo13176a(C3479d dVar) throws Exception {
            AbsInteractionFragment.this.mo13114a((ShareReportResult) dVar.data);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0058 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x005b A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x005c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x005d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x005e A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static int m16327a(java.lang.String r7) {
            /*
                int r0 = r7.hashCode()
                r1 = -791575966(0xffffffffd0d18262, float:-2.81198633E10)
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = -1
                if (r0 == r1) goto L_0x004a
                r1 = 3616(0xe20, float:5.067E-42)
                if (r0 == r1) goto L_0x0040
                r1 = 108102557(0x671839d, float:4.5423756E-35)
                if (r0 == r1) goto L_0x0036
                r1 = 113011944(0x6bc6ce8, float:7.0877763E-35)
                if (r0 == r1) goto L_0x002c
                r1 = 1355475581(0x50caea7d, float:2.72349204E10)
                if (r0 == r1) goto L_0x0022
                goto L_0x0054
            L_0x0022:
                java.lang.String r0 = "weixin_moment"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x0054
                r7 = 3
                goto L_0x0055
            L_0x002c:
                java.lang.String r0 = "weibo"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x0054
                r7 = 4
                goto L_0x0055
            L_0x0036:
                java.lang.String r0 = "qzone"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x0054
                r7 = 1
                goto L_0x0055
            L_0x0040:
                java.lang.String r0 = "qq"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x0054
                r7 = 0
                goto L_0x0055
            L_0x004a:
                java.lang.String r0 = "weixin"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x0054
                r7 = 2
                goto L_0x0055
            L_0x0054:
                r7 = -1
            L_0x0055:
                switch(r7) {
                    case 0: goto L_0x005e;
                    case 1: goto L_0x005d;
                    case 2: goto L_0x005c;
                    case 3: goto L_0x005b;
                    case 4: goto L_0x0059;
                    default: goto L_0x0058;
                }
            L_0x0058:
                return r6
            L_0x0059:
                r7 = 5
                return r7
            L_0x005b:
                return r2
            L_0x005c:
                return r3
            L_0x005d:
                return r4
            L_0x005e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.C5067d.m16327a(java.lang.String):int");
        }

        public final void onClick(View view) {
            String str;
            long j;
            if (C9043ak.m27009a()) {
                String str2 = (String) AbsInteractionFragment.this.f14472v.get("log_action_type");
                HashMap hashMap = new HashMap();
                hashMap.put("position", "detail_bottom_bar");
                C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
                if (a != null) {
                    hashMap.putAll(a.mo21568a());
                }
                C8416g a2 = C8443c.m25663a().mo21605a(Room.class);
                if (a2 != null) {
                    hashMap.putAll(a2.mo21568a());
                }
                if (AbsInteractionFragment.this.getActivity() != null) {
                    C9391a a3 = C9389b.m27848a(AbsInteractionFragment.this.f14378a);
                    a3.mo23097a(AbsInteractionFragment.this.f14355D.mo22179b());
                    a3.f25869v = AbsInteractionFragment.this.f14378a.getId();
                    a3.f25870w = AbsInteractionFragment.this.f14378a.getOwnerUserId();
                    if (!(a3.f25867t != null || C8443c.m25663a().mo21605a(Room.class) == null || C8443c.m25663a().mo21605a(Room.class).mo21568a() == null || C8443c.m25663a().mo21605a(Room.class).mo21568a().get("request_id") == null)) {
                        a3.f25867t = (String) C8443c.m25663a().mo21605a(Room.class).mo21568a().get("request_id");
                    }
                    if (AbsInteractionFragment.this.f14378a.getOwner() == null || AbsInteractionFragment.this.f14378a.getOwner().getSecret() != 1) {
                        C8940a e = TTLiveSDKContext.getHostService().mo22364e();
                        FragmentActivity activity = AbsInteractionFragment.this.getActivity();
                        if (AbsInteractionFragment.this.f14453c) {
                            str = AbsInteractionFragment.this.f14378a.getAnchorShareText();
                        } else {
                            str = AbsInteractionFragment.this.f14378a.getUserShareText();
                        }
                        e.mo22110a((Activity) activity, a3.mo23104b(str).mo23101a(AbsInteractionFragment.this.f14453c).mo23100a((Map<String, String>) hashMap).mo23098a(C9074l.m27081a(AbsInteractionFragment.this.f14472v)).mo23107e(str2).mo23102a(), (C9388a) new C9388a() {
                            /* renamed from: a */
                            public final void mo11627a(Throwable th) {
                            }

                            /* renamed from: a */
                            public final void mo11626a(String str, String str2) {
                                C5067d.this.mo13175a(AbsInteractionFragment.this.f14378a.getId(), str2, 1, AbsInteractionFragment.this.f14378a.getLabels());
                                C5067d.m16328a(str, str2);
                                if (C9074l.m27086b(AbsInteractionFragment.this.f14472v) && AbsInteractionFragment.this.f14378a.author() != null && !TextUtils.equals(str, "chat_merge")) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("anchor_id", String.valueOf(AbsInteractionFragment.this.f14378a.author().getId()));
                                        jSONObject.put("room_id", String.valueOf(AbsInteractionFragment.this.f14378a.getId()));
                                    } catch (JSONException unused) {
                                    }
                                    C3596c.m13172a(C9295a.class);
                                    C8446a.m25675a().mo21611a(jSONObject).mo21610a(C9074l.m27087c(AbsInteractionFragment.this.f14472v));
                                }
                                if (C9074l.m27089d(AbsInteractionFragment.this.f14472v) && AbsInteractionFragment.this.f14378a.author() != null && !TextUtils.equals(str, "chat_merge")) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    try {
                                        jSONObject2.put("anchor_id", String.valueOf(AbsInteractionFragment.this.f14378a.author().getId()));
                                        jSONObject2.put("room_id", String.valueOf(AbsInteractionFragment.this.f14378a.getId()));
                                    } catch (JSONException unused2) {
                                    }
                                    C3596c.m13172a(C9295a.class);
                                    C8446a.m25675a().mo21611a(jSONObject2).mo21610a(C9074l.m27090e(AbsInteractionFragment.this.f14472v));
                                }
                            }
                        });
                        return;
                    }
                    C9391a a4 = C9389b.m27847a(AbsInteractionFragment.this.f14378a.getId(), AbsInteractionFragment.this.f14378a.getOwnerUserId());
                    if (AbsInteractionFragment.this.f14378a == null) {
                        j = 0;
                    } else {
                        j = AbsInteractionFragment.this.f14378a.getId();
                    }
                    a4.f25849b = j;
                    TTLiveSDKContext.getHostService().mo22364e().mo22111a((Activity) AbsInteractionFragment.this.getActivity(), a4.mo23102a(), "live");
                }
            }
        }

        /* renamed from: a */
        public static void m16328a(String str, String str2) {
            HashMap hashMap = new HashMap();
            hashMap.put("share_platform", str);
            hashMap.put("is_pyramid_sale", "0");
            hashMap.put("type", str2);
            hashMap.put("share_type", str2);
            C8443c.m25663a().mo21606a("share", hashMap, new C8438j(), Room.class);
        }

        /* renamed from: a */
        public final void mo13175a(long j, String str, int i, String str2) {
            ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).sendShare(j, new C9079q().mo22259a("target_id", String.valueOf(m16327a(str))).mo22259a("share_type", "1").mo22259a("common_label_list", String.valueOf(str2)).f24734a).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C5321o<Object>(this), C3303k.m12377b());
        }
    }

    /* renamed from: A */
    private void m16215A() {
    }

    /* renamed from: z */
    private void m16268z() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13113a(View view, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo13121b(float f) {
    }

    /* renamed from: e */
    public final FrameLayout mo10483e() {
        return this.f14394aP;
    }

    /* renamed from: g */
    public abstract boolean mo13130g();

    /* renamed from: h */
    public View mo13131h() {
        return null;
    }

    /* renamed from: n */
    public final Room mo13137n() {
        return this.f14378a;
    }

    /* renamed from: o */
    public final boolean mo13138o() {
        return this.f14431b;
    }

    public void onStop() {
        super.onStop();
    }

    /* renamed from: p */
    public final boolean mo13156p() {
        return this.f14453c;
    }

    /* renamed from: q */
    public final LiveMode mo13157q() {
        return this.f14469s;
    }

    /* renamed from: r */
    public final C4490ao mo13158r() {
        return this.f14444bm;
    }

    /* renamed from: a */
    public final void mo10478a(DataCenter dataCenter, boolean z, C3487a aVar, EnterRoomExtra enterRoomExtra) {
        this.f14472v = dataCenter;
        this.f14378a = (Room) dataCenter.get("data_room");
        this.f14362K = enterRoomExtra;
        mo13400x();
        if (this.f14361J == null) {
            this.f14361J = "";
        }
        this.f14453c = z;
        this.f14452bu = aVar;
    }

    /* renamed from: a */
    public final void mo10477a(LiveMode liveMode) {
        this.f14469s = liveMode;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13119a(boolean z, int i) {
        this.f14455e = z;
        this.f14457g = i;
        mo13220w();
    }

    /* renamed from: a */
    private <T> void m16245a(Class<T> cls) {
        ((C3245ad) C9097a.m27146a().mo22266a(cls).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10182a((C7326g<? super T>) new C5315i<Object>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13117a(Object obj) throws Exception {
        if (obj instanceof C4435e) {
            onEvent((C4435e) obj);
        } else if (obj instanceof C9409a) {
            onEvent((C9409a) obj);
        } else if (obj instanceof C4453w) {
            onEvent((C4453w) obj);
        } else if (obj instanceof C4454x) {
            onEvent((C4454x) obj);
        } else if (obj instanceof C9300c) {
            onEvent((C9300c) obj);
        } else if (obj instanceof C4413ae) {
            onEvent((C4413ae) obj);
        } else if (obj instanceof C4414af) {
            onEvent((C4414af) obj);
        } else if (obj instanceof C8296e) {
            onEvent((C8296e) obj);
        } else if (obj instanceof C4422an) {
            onEvent((C4422an) obj);
        } else if (obj instanceof C8369b) {
            onEvent((C8369b) obj);
        } else if (obj instanceof UserProfileEvent) {
            onEvent((UserProfileEvent) obj);
        } else if (obj instanceof C4033c) {
            onEvent((C4033c) obj);
        } else if (obj instanceof C4411ac) {
            onEvent((C4411ac) obj);
        } else if (obj instanceof C4034d) {
            onEvent((C4034d) obj);
        } else if (obj instanceof C4444n) {
            onEvent((C4444n) obj);
        } else if (obj instanceof C4423ao) {
            onEvent((C4423ao) obj);
        } else {
            if (obj instanceof C4436f) {
                onEvent((C4436f) obj);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13112a(View view) {
        this.f14405aa = (GestureDetectLayout) view;
        this.f14365N = view.findViewById(R.id.b2k);
        this.f14408ad = view.findViewById(R.id.ld);
        this.f14368Q = (Chronometer) view.findViewById(R.id.bnp);
        this.f14366O = (CountDownView) view.findViewById(R.id.a3k);
        this.f14367P = (AnimationLayer) view.findViewById(R.id.ge);
        this.f14461k = view.findViewById(R.id.jn);
        if (this.f14461k != null) {
            this.f14461k.setOnClickListener(this.f14445bn);
        }
        this.f14458h = view.findViewById(R.id.x_);
        this.f14460j = view.findViewById(R.id.aaf);
        this.f14369R = (TextView) view.findViewById(R.id.bpd);
        this.f14458h.setOnClickListener(this.f14445bn);
        this.f14406ab = view.findViewById(R.id.b2m);
        this.f14407ac = (FrameLayout) view.findViewById(R.id.c_e);
        this.f14462l = (FrameLayout) view.findViewById(R.id.o7);
        this.f14375X = (LayoutParams) this.f14462l.getLayoutParams();
        this.f14370S = view.findViewById(R.id.dmo);
        this.f14371T = view.findViewById(R.id.cqz);
        this.f14372U = view.findViewById(R.id.dmb);
        this.f14373V = view.findViewById(R.id.dma);
        this.f14392aN = view.findViewById(R.id.bpt);
        this.f14394aP = (FrameLayout) view.findViewById(R.id.day);
        this.f14398aT = (LottieAnimationView) view.findViewById(R.id.ay3);
        this.f14356E = (LinearLayout) view.findViewById(R.id.d81);
        this.f14396aR = (TextView) view.findViewById(R.id.d82);
        this.f14397aS = (TextView) view.findViewById(R.id.d80);
        if (this.f14378a != null && this.f14378a.getMosaicStatus() == 1) {
            this.f14369R.setVisibility(0);
        }
        this.f14459i = view.findViewById(R.id.d4e);
        this.f14404aZ = view.findViewById(R.id.asr);
        if (this.f14378a != null && this.f14378a.isOfficial()) {
            C9738o.m28712b(this.f14458h, 8);
            C9738o.m28712b(this.f14461k, 8);
            if (getActivity() != null && (getActivity() instanceof C9289b)) {
                DrawerLayout a = ((C9289b) getActivity()).mo22775a();
                if (a != null) {
                    a.setDrawerLockMode(1);
                }
            }
        }
    }

    /* renamed from: a */
    private void m16242a(DataCenter dataCenter) {
        if (mo13137n() != null && mo13137n().getOwner() != null && TTLiveSDKContext.getHostService().mo22369j() != null) {
            this.f14433bb = new C5319m(this, dataCenter);
            boolean booleanValue = ((Boolean) dataCenter.get("data_is_anchor")).booleanValue();
            Room n = mo13137n();
            if (n != null) {
                C5839a aVar = new C5839a(n);
                aVar.mo14339a(C5346g.m17049a());
                aVar.mo14341b(C5346g.m17051b());
                aVar.mo14343c(C5346g.m17052c());
                aVar.mo14345d(C5346g.m17053d());
                C8416g a = C8443c.m25663a().mo21605a(Room.class);
                if (a != null) {
                    aVar.mo14340a(a.mo21568a());
                }
                if (C9074l.m27086b(dataCenter)) {
                    aVar.mo14342b(C9074l.m27087c(dataCenter));
                }
                if (C9074l.m27089d(dataCenter)) {
                    aVar.mo14344c(C9074l.m27090e(dataCenter));
                }
                String.valueOf(n.getOwner().getId());
                String.valueOf(n.getId());
                new C5840b(booleanValue, mo13130g(), dataCenter, n, aVar, (C9400e) C9496c.m28034a(this.f14433bb));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ boolean mo13125b(Runnable runnable, boolean z) {
        if (z) {
            return false;
        }
        if (this.f14454d || !this.f14413ai || !TTLiveSDKContext.getHostService().mo22367h().mo22182c() || this.f14378a.getOwner().isFollowing() || SystemClock.elapsedRealtime() - this.f14471u.f12608e <= 30000) {
            m16215A();
            return false;
        }
        long id = this.f14378a.getId();
        long id2 = this.f14378a.getOwner().getId();
        String labels = this.f14378a.getLabels();
        C9249a b = new C9249a(getContext()).mo22716a(true).mo22710a((int) R.string.etg).mo22718b((int) R.string.ezd);
        C5316j jVar = new C5316j(this, id2, id, labels, runnable);
        b.mo22722b(0, (int) R.string.ezc, (DialogInterface.OnClickListener) jVar).mo22722b(1, (int) R.string.eza, (DialogInterface.OnClickListener) new C5317k(runnable)).mo22720b().show();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13110a(long j, long j2, String str, Runnable runnable, DialogInterface dialogInterface, int i) {
        TTLiveSDKContext.getHostService().mo22367h().mo22168a(((C8978b) ((C8978b) ((C8978b) ((C8978b) ((C8978b) ((C8977a) C8985f.m26861a().mo22153a(j)).mo22154a(this.f14378a.getRequestId())).mo22157b("live_detail")).mo22158c("live")).mo22156b(j2)).mo22159d(str)).mo22160c()).mo19189a((C7498y<? super T>) new C8986g<FollowPair>() {
            public final void onSubscribe(C7321c cVar) {
                super.onSubscribe(cVar);
                AbsInteractionFragment.this.f14464n.mo119661a(cVar);
            }
        });
        if (C9074l.m27086b(this.f14472v) && this.f14378a.author() != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("anchor_id", String.valueOf(this.f14378a.author().getId()));
                jSONObject.put("room_id", String.valueOf(this.f14378a.getId()));
            } catch (JSONException unused) {
            }
            C3596c.m13172a(C9295a.class);
            C8446a.m25675a().mo21611a(jSONObject).mo21610a(C9074l.m27087c(this.f14472v));
        }
        if (C9074l.m27089d(this.f14472v) && this.f14378a.author() != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("anchor_id", String.valueOf(this.f14378a.author().getId()));
                jSONObject2.put("room_id", String.valueOf(this.f14378a.getId()));
            } catch (JSONException unused2) {
            }
            C3596c.m13172a(C9295a.class);
            C8446a.m25675a().mo21611a(jSONObject2).mo21610a(C9074l.m27090e(this.f14472v));
        }
        dialogInterface.dismiss();
        runnable.run();
        this.f14471u.mo12038l();
        m16215A();
    }

    /* renamed from: a */
    static final /* synthetic */ void m16246a(Runnable runnable, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        runnable.run();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChanged(com.bytedance.ies.sdk.widgets.KVData r8) {
        /*
            r7 = this;
            boolean r0 = r7.mo13138o()
            if (r0 == 0) goto L_0x0259
            if (r8 == 0) goto L_0x0259
            java.lang.String r0 = r8.getKey()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0259
            java.lang.Object r0 = r8.getData()
            if (r0 != 0) goto L_0x001a
            goto L_0x0259
        L_0x001a:
            java.lang.String r0 = r8.getKey()
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 8
            r4 = -1
            r5 = 0
            r6 = 1
            switch(r1) {
                case -1989081898: goto L_0x00dc;
                case -1836833765: goto L_0x00d2;
                case -1540323875: goto L_0x00c8;
                case -1130046128: goto L_0x00be;
                case -993227351: goto L_0x00b3;
                case -797556114: goto L_0x00a8;
                case -479478831: goto L_0x009d;
                case -424351287: goto L_0x0092;
                case -271145422: goto L_0x0088;
                case -81738768: goto L_0x007d;
                case 506917167: goto L_0x0071;
                case 1008814090: goto L_0x0065;
                case 1631824572: goto L_0x005a;
                case 1722450802: goto L_0x004f;
                case 1896837901: goto L_0x0044;
                case 1939188655: goto L_0x0039;
                case 2002249609: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x00e7
        L_0x002d:
            java.lang.String r1 = "cmd_sticker_is_selected"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 11
            goto L_0x00e8
        L_0x0039:
            java.lang.String r1 = "data_screen_record_is_open"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 0
            goto L_0x00e8
        L_0x0044:
            java.lang.String r1 = "cmd_live_radio"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 4
            goto L_0x00e8
        L_0x004f:
            java.lang.String r1 = "cmd_show_user_profile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 1
            goto L_0x00e8
        L_0x005a:
            java.lang.String r1 = "cmd_video_orientation_changed"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 7
            goto L_0x00e8
        L_0x0065:
            java.lang.String r1 = "cmd_refresh_user_in_room"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 9
            goto L_0x00e8
        L_0x0071:
            java.lang.String r1 = "data_login_event"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 10
            goto L_0x00e8
        L_0x007d:
            java.lang.String r1 = "cmd_adjust_video_interact_stream_bottom"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 13
            goto L_0x00e8
        L_0x0088:
            java.lang.String r1 = "cmd_interact_audio"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 2
            goto L_0x00e8
        L_0x0092:
            java.lang.String r1 = "cmd_show_fans_club_setting"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 12
            goto L_0x00e8
        L_0x009d:
            java.lang.String r1 = "cmd_official_hide"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 16
            goto L_0x00e8
        L_0x00a8:
            java.lang.String r1 = "cmd_close_h5_dialog"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 14
            goto L_0x00e8
        L_0x00b3:
            java.lang.String r1 = "cmd_duty_gift_changed"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 15
            goto L_0x00e8
        L_0x00be:
            java.lang.String r1 = "cmd_interact_player_view_change"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 3
            goto L_0x00e8
        L_0x00c8:
            java.lang.String r1 = "cmd_pk_state_change"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 5
            goto L_0x00e8
        L_0x00d2:
            java.lang.String r1 = "cmd_widget_loaded"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 6
            goto L_0x00e8
        L_0x00dc:
            java.lang.String r1 = "cmd_enter_widget_layout_change"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            r0 = 8
            goto L_0x00e8
        L_0x00e7:
            r0 = -1
        L_0x00e8:
            switch(r0) {
                case 0: goto L_0x022f;
                case 1: goto L_0x0225;
                case 2: goto L_0x01eb;
                case 3: goto L_0x01c4;
                case 4: goto L_0x01b1;
                case 5: goto L_0x019e;
                case 6: goto L_0x019a;
                case 7: goto L_0x0169;
                case 8: goto L_0x015f;
                case 9: goto L_0x014d;
                case 10: goto L_0x013f;
                case 11: goto L_0x0135;
                case 12: goto L_0x012b;
                case 13: goto L_0x011d;
                case 14: goto L_0x0113;
                case 15: goto L_0x0105;
                case 16: goto L_0x00ed;
                default: goto L_0x00eb;
            }
        L_0x00eb:
            goto L_0x0258
        L_0x00ed:
            boolean r8 = r7 instanceof com.bytedance.android.livesdk.chatroom.p220ui.LandscapeInteractionFragment
            if (r8 == 0) goto L_0x0258
            com.bytedance.android.livesdkapi.depend.model.live.Room r8 = r7.f14378a
            if (r8 == 0) goto L_0x0258
            com.bytedance.android.livesdkapi.depend.model.live.Room r8 = r7.f14378a
            boolean r8 = r8.isOfficial()
            if (r8 == 0) goto L_0x0258
            r8 = r7
            com.bytedance.android.livesdk.chatroom.ui.LandscapeInteractionFragment r8 = (com.bytedance.android.livesdk.chatroom.p220ui.LandscapeInteractionFragment) r8
            r8.mo13217b(r3)
            goto L_0x0258
        L_0x0105:
            java.lang.Object r8 = r8.getData()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r7.m16264h(r8)
            return
        L_0x0113:
            android.support.v4.app.DialogFragment r8 = r7.f14376Y
            if (r8 == 0) goto L_0x0258
            android.support.v4.app.DialogFragment r8 = r7.f14376Y
            r8.dismissAllowingStateLoss()
            return
        L_0x011d:
            java.lang.Object r8 = r8.getData()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.m16255c(r8)
            return
        L_0x012b:
            java.lang.Object r8 = r8.getData()
            com.bytedance.android.livesdk.chatroom.event.i r8 = (com.bytedance.android.livesdk.chatroom.event.C4439i) r8
            r7.m16234a(r8)
            return
        L_0x0135:
            java.lang.Object r8 = r8.getData()
            com.bytedance.android.live.broadcast.api.model.e r8 = (com.bytedance.android.live.broadcast.api.model.C2440e) r8
            r7.m16232a(r8)
            return
        L_0x013f:
            java.lang.Object r8 = r8.getData()
            com.bytedance.android.livesdk.chatroom.event.x r8 = (com.bytedance.android.livesdk.chatroom.event.C4454x) r8
            boolean r8 = r8.f12917a
            if (r8 == 0) goto L_0x0258
            r7.m16219E()
            return
        L_0x014d:
            com.bytedance.android.livesdk.w.e r8 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r8 = r8.mo22367h()
            boolean r8 = r8.mo22182c()
            if (r8 == 0) goto L_0x0258
            r7.m16219E()
            return
        L_0x015f:
            java.lang.Object r8 = r8.getData()
            com.bytedance.android.livesdk.message.model.aw r8 = (com.bytedance.android.livesdk.message.model.C8497aw) r8
            r7.m16239a(r8)
            return
        L_0x0169:
            java.lang.Object r8 = r8.getData()
            com.bytedance.android.livesdk.chatroom.event.as r8 = (com.bytedance.android.livesdk.chatroom.event.C4427as) r8
            boolean r0 = r8.f12860a
            int r1 = r8.f12861b
            r7.mo13119a(r0, r1)
            boolean r8 = r8.f12860a
            if (r8 == 0) goto L_0x0258
            android.support.v4.app.FragmentActivity r8 = r7.getActivity()
            if (r8 == 0) goto L_0x0258
            android.support.v4.app.FragmentActivity r8 = r7.getActivity()
            int r8 = r8.getRequestedOrientation()
            if (r8 != r6) goto L_0x0258
            r8 = 1090519040(0x41000000, float:8.0)
            int r8 = com.bytedance.android.live.core.utils.C3358ac.m12510a(r8)
            r0 = 1125515264(0x43160000, float:150.0)
            int r0 = com.bytedance.android.live.core.utils.C3358ac.m12510a(r0)
            r7.m16248a(r6, r8, r0, r5)
            return
        L_0x019a:
            r7.mo13132i()
            return
        L_0x019e:
            java.lang.Object r0 = r8.getData()
            com.bytedance.android.livesdk.chatroom.event.r r0 = (com.bytedance.android.livesdk.chatroom.event.C4448r) r0
            r7.m16254b(r0)
            java.lang.Object r8 = r8.getData()
            com.bytedance.android.livesdk.chatroom.event.r r8 = (com.bytedance.android.livesdk.chatroom.event.C4448r) r8
            r7.m16235a(r8)
            return
        L_0x01b1:
            java.lang.Object r8 = r8.getData()
            com.bytedance.android.livesdk.chatroom.event.u r8 = (com.bytedance.android.livesdk.chatroom.event.C4451u) r8
            boolean r0 = r8.f12911a
            r7.m16249a(r0, r5)
            boolean r8 = r8.f12911a
            if (r8 == 0) goto L_0x0258
            r7.m16216B()
            return
        L_0x01c4:
            java.lang.Object r8 = r8.getData()
            com.bytedance.android.livesdk.chatroom.interact.ai r8 = (com.bytedance.android.livesdk.chatroom.interact.C4483ai) r8
            boolean r0 = r8.f13071a
            r0 = r0 ^ r6
            r7.f14438bg = r0
            boolean r0 = r8.f13071a
            if (r0 == 0) goto L_0x01d6
            java.lang.String r0 = "video_interact_on"
            goto L_0x01d8
        L_0x01d6:
            java.lang.String r0 = "video_interact_off"
        L_0x01d8:
            boolean r1 = r8.f13071a
            if (r1 == 0) goto L_0x01df
            int r1 = r7.f14440bi
            goto L_0x01e1
        L_0x01df:
            int r1 = r7.f14439bh
        L_0x01e1:
            r7.m16228a(r4, r1, r0)
            boolean r8 = r8.f13071a
            r8 = r8 ^ r6
            r7.mo13128c(r8)
            return
        L_0x01eb:
            java.lang.Object r8 = r8.getData()
            com.bytedance.android.livesdk.chatroom.event.u r8 = (com.bytedance.android.livesdk.chatroom.event.C4451u) r8
            boolean r0 = r8.f12911a
            r7.m16249a(r0, r6)
            boolean r0 = r8.f12911a
            if (r0 == 0) goto L_0x01fd
            java.lang.String r0 = "audio_interact_on"
            goto L_0x01ff
        L_0x01fd:
            java.lang.String r0 = "audio_interact_off"
        L_0x01ff:
            boolean r1 = r8.f12911a
            if (r1 == 0) goto L_0x0206
            int r1 = r7.f14442bk
            goto L_0x0208
        L_0x0206:
            int r1 = r7.f14441bj
        L_0x0208:
            r7.m16228a(r1, r4, r0)
            boolean r8 = r8.f12911a
            if (r8 == 0) goto L_0x0221
            r8 = 2131165902(0x7f0702ce, float:1.7946034E38)
            int r8 = com.bytedance.android.live.core.utils.C3358ac.m12526d(r8)
            r0 = 2131165901(0x7f0702cd, float:1.7946032E38)
            int r0 = com.bytedance.android.live.core.utils.C3358ac.m12526d(r0)
            r7.m16248a(r6, r8, r0, r5)
            return
        L_0x0221:
            r7.m16248a(r5, r5, r5, r6)
            return
        L_0x0225:
            java.lang.Object r8 = r8.getData()
            com.bytedance.android.livesdk.chatroom.event.UserProfileEvent r8 = (com.bytedance.android.livesdk.chatroom.event.UserProfileEvent) r8
            r7.m16233a(r8)
            return
        L_0x022f:
            java.lang.Object r8 = r8.getData()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            boolean r0 = r7.f14431b
            if (r0 == 0) goto L_0x0258
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.f14472v
            java.lang.String r1 = "data_keyboard_status"
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r8 != 0) goto L_0x0250
            if (r0 != 0) goto L_0x0250
            goto L_0x0251
        L_0x0250:
            r6 = 0
        L_0x0251:
            if (r6 == 0) goto L_0x0254
            r2 = 0
        L_0x0254:
            r7.m16260f(r2)
            return
        L_0x0258:
            return
        L_0x0259:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.onChanged(com.bytedance.ies.sdk.widgets.KVData):void");
    }

    /* renamed from: a */
    private void m16234a(C4439i iVar) {
        if (this.f14416al == null) {
            this.f14416al = LiveProfileSettingDialog.m16638a(this.f14468r, mo13130g(), this.f14472v, iVar.f12888b, iVar.f12887a);
        } else {
            this.f14416al.mo13348a(iVar.f12888b, iVar.f12887a);
        }
        this.f14416al.show(getChildFragmentManager(), LiveProfileSettingDialog.f15005a);
    }

    /* renamed from: a */
    private void m16241a(C9355c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("sticker_id", String.valueOf(cVar.f25566e));
        C8443c.m25663a().mo21606a("live_take_sticker_effective_use", m16226a(hashMap), new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_detail"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r4 = com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.C5064a.f14492c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r4 = com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.C5064a.f14491b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r3.f14359H = r4;
        r4 = (android.widget.RelativeLayout.LayoutParams) r3.f14462l.getLayoutParams();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r5 == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r5 = com.bytedance.android.live.core.utils.C3358ac.m12526d(com.zhiliaoapp.musically.df_live_zego_link.R.dimen.nr);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = com.bytedance.android.live.core.utils.C3358ac.m12526d(com.zhiliaoapp.musically.df_live_zego_link.R.dimen.ta);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r4.bottomMargin = r5;
        r4.rightMargin = com.bytedance.android.live.core.utils.C3358ac.m12526d(com.zhiliaoapp.musically.df_live_zego_link.R.dimen.ns);
        r3.f14462l.setLayoutParams(r4);
        m16221G();
        r3.f14370S.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r3.f14360I = r3.f14359H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r5 == false) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16249a(boolean r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
        L_0x0001:
            if (r4 == 0) goto L_0x0053
            if (r5 == 0) goto L_0x000b
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r1 = r3.f14359H
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r2 = com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.C5064a.RADIO_INTERACT
            if (r1 == r2) goto L_0x0053
        L_0x000b:
            if (r5 != 0) goto L_0x0013
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r1 = r3.f14359H
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r2 = com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.C5064a.RADIO
            if (r1 == r2) goto L_0x0053
        L_0x0013:
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r4 = r3.f14359H
            r3.f14360I = r4
            if (r5 == 0) goto L_0x001c
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r4 = com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.C5064a.RADIO_INTERACT
            goto L_0x001e
        L_0x001c:
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r4 = com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.C5064a.RADIO
        L_0x001e:
            r3.f14359H = r4
            android.widget.FrameLayout r4 = r3.f14462l
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            if (r5 == 0) goto L_0x0032
            r5 = 2131165719(0x7f070217, float:1.7945663E38)
            int r5 = com.bytedance.android.live.core.utils.C3358ac.m12526d(r5)
            goto L_0x0039
        L_0x0032:
            r5 = 2131165924(0x7f0702e4, float:1.7946079E38)
            int r5 = com.bytedance.android.live.core.utils.C3358ac.m12526d(r5)
        L_0x0039:
            r4.bottomMargin = r5
            r5 = 2131165720(0x7f070218, float:1.7945665E38)
            int r5 = com.bytedance.android.live.core.utils.C3358ac.m12526d(r5)
            r4.rightMargin = r5
            android.widget.FrameLayout r5 = r3.f14462l
            r5.setLayoutParams(r4)
            r3.m16221G()
            android.view.View r4 = r3.f14370S
            r5 = 4
            r4.setVisibility(r5)
            return
        L_0x0053:
            if (r4 != 0) goto L_0x0083
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r4 = r3.f14359H
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r5 = com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.C5064a.NORMAL
            if (r4 == r5) goto L_0x0083
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r4 = r3.f14360I
            r3.f14359H = r4
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r4 = r3.f14359H
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r5 = com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.C5064a.NORMAL
            if (r4 != r5) goto L_0x0075
            android.widget.FrameLayout r4 = r3.f14462l
            android.widget.RelativeLayout$LayoutParams r5 = r3.f14375X
            r4.setLayoutParams(r5)
            r3.m16221G()
            android.view.View r4 = r3.f14370S
            r4.setVisibility(r0)
            return
        L_0x0075:
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r4 = r3.f14359H
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r5 = com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.C5064a.RADIO
            if (r4 != r5) goto L_0x0083
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r4 = com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.C5064a.NORMAL
            r3.f14359H = r4
            r4 = 1
            r5 = 0
            goto L_0x0001
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.m16249a(boolean, boolean):void");
    }

    /* renamed from: a */
    private void m16248a(boolean z, int i, int i2, boolean z2) {
        if (!z) {
            if (this.f14374W != null) {
                this.f14371T.setLayoutParams(this.f14374W);
                this.f14374W = null;
            }
        } else if (this.f14374W == null) {
            this.f14374W = (LayoutParams) this.f14371T.getLayoutParams();
            LayoutParams layoutParams = new LayoutParams(this.f14374W.width, this.f14374W.height);
            if (VERSION.SDK_INT < 17 || !C3519c.m12965a(getContext())) {
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = i2;
                layoutParams.rightMargin = i;
            } else {
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = i2;
                if (z2) {
                    layoutParams.addRule(21);
                    layoutParams.setMarginEnd(i);
                } else {
                    layoutParams.rightMargin = i;
                }
            }
            this.f14371T.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo10479a(Runnable runnable) {
        if (this.f14473w != null) {
            this.f14446bo = null;
            runnable.run();
            return;
        }
        this.f14446bo = runnable;
    }

    /* renamed from: a */
    public final void mo13109a(long j) {
        C9097a.m27146a().mo22267a((Object) new C4422an(false, 2));
        if (this.f14465o.hasMessages(C34943c.f91127w)) {
            this.f14465o.removeMessages(C34943c.f91127w);
        }
        this.f14465o.sendEmptyMessageDelayed(C34943c.f91127w, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13124b(boolean z) {
        if (!z) {
            if (this.f14417am != null && this.f14417am.isShowing()) {
                this.f14417am.dismiss();
            }
            this.f14417am = null;
        } else if (mo13138o() && (this.f14417am == null || !this.f14417am.isShowing())) {
            if (this.f14417am == null) {
                this.f14417am = new C5288dt(getActivity(), mo13130g(), this.f14378a, this.f14361J);
            }
            this.f14417am.f15459e = this.f14472v;
            this.f14417am.show();
            if (this.f14447bp > 0) {
                this.f14465o.removeCallbacks(this.f14449br);
                this.f14465o.postDelayed(this.f14449br, this.f14447bp);
                this.f14447bp = 0;
            }
            C8443c.m25663a().mo21607a("follow_popup_show", C8438j.class, Room.class);
        }
    }

    /* renamed from: a */
    public final void mo13118a(Throwable th) {
        if (th instanceof ApiServerException) {
            int errorCode = ((ApiServerException) th).getErrorCode();
            if (30003 == errorCode) {
                mo13217b(7);
            } else if (50001 == errorCode) {
                if (this.f14352A != null) {
                    this.f14352A.mo13695b(true);
                }
            } else if (50002 == errorCode) {
                mo13217b(10);
            } else if (30005 == errorCode) {
                m16223I();
            } else if (30006 == errorCode && !this.f14453c) {
                C9097a.m27146a().mo22267a((Object) new C4452v(20));
            }
        }
    }

    /* renamed from: a */
    public final void mo13114a(ShareReportResult shareReportResult) {
        if (shareReportResult != null && shareReportResult.getDeltaIntimacy() > 0 && this.f14378a != null) {
            IMessageManager iMessageManager = (IMessageManager) this.f14472v.get("data_message_manager");
            if (iMessageManager != null) {
                iMessageManager.insertMessage(C4270b.m14424a(this.f14378a.getId(), shareReportResult.getDisplayText(), this.f14468r), true);
            }
        }
    }

    /* renamed from: a */
    public final void mo13116a(C8688t tVar) {
        if (this.f14431b) {
            int i = tVar.f23670a;
            if (3 == i) {
                mo13217b(7);
            } else if (4 == i) {
                C4452v vVar = new C4452v(7);
                vVar.f12914c = tVar;
                m16236a(vVar);
                if (!C6319n.m19593a(tVar.f23671b)) {
                    C9049ap.m27029a(tVar.f23671b, 1);
                }
                JSONObject jSONObject = new JSONObject();
                C3168a.m11983a(jSONObject, "error_code", 0);
                C3168a.m11984a(jSONObject, "error_msg", tVar.f23671b);
                C3172e.m12002a("ttlive_anchor_close_room", 0, jSONObject);
            } else if (1 != i) {
                if (2 == i) {
                    this.f14395aQ = false;
                    if (this.f14452bu != null) {
                        this.f14452bu.mo10490a(2);
                    }
                    if (this.f14378a.getMosaicStatus() == 0) {
                        this.f14369R.setVisibility(8);
                        if (!mo13156p()) {
                            C3517a.m12960a((Context) getActivity(), (int) R.string.f2z);
                            C9097a.m27146a().mo22267a((Object) new C4452v(31));
                        }
                    }
                }
            } else if (!this.f14453c && !this.f14378a.isThirdParty && !this.f14378a.isScreenshot) {
                this.f14395aQ = true;
                if (this.f14452bu != null) {
                    this.f14452bu.mo10490a(3);
                }
                if (this.f14369R.getVisibility() == 8) {
                    if (!mo13156p() && !((Boolean) this.f14472v.get("data_link_cross_load", Boolean.valueOf(false))).booleanValue()) {
                        C9097a.m27146a().mo22267a((Object) new C4452v(30));
                    }
                    this.f14369R.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13115a(C8538c cVar) {
        if (this.f14431b && cVar != null) {
            switch (cVar.getMessageType()) {
                case MEMBER:
                    if (cVar.isCurrentRoom(this.f14378a.getId())) {
                        C8514bj bjVar = (C8514bj) cVar;
                        this.f14472v.lambda$put$1$DataCenter("data_member_message", bjVar);
                        User user = bjVar.f23390b;
                        if (user != null && user.getId() == TTLiveSDKContext.getHostService().mo22367h().mo22179b()) {
                            if (3 == bjVar.mo21658a() || 9 == bjVar.mo21658a()) {
                                if (this.f14352A != null) {
                                    this.f14352A.mo13695b(true);
                                }
                                m16261f(true);
                                return;
                            } else if (4 == bjVar.mo21658a() || 10 == bjVar.mo21658a()) {
                                if (this.f14352A != null) {
                                    this.f14352A.mo13695b(false);
                                }
                                m16261f(false);
                                return;
                            } else if (5 == bjVar.mo21658a()) {
                                m16259e(true);
                                return;
                            } else if (6 == bjVar.mo21658a()) {
                                m16259e(false);
                                return;
                            } else if (7 == bjVar.mo21658a()) {
                                mo13217b(11);
                                return;
                            } else if (11 == bjVar.mo21658a() && !this.f14453c) {
                                C9097a.m27146a().mo22267a((Object) new C4452v(20));
                                return;
                            }
                        }
                    }
                    break;
                case ROOM_NOTIFY:
                case COMMON_TOAST:
                case GUIDE_MESSAGE:
                case COMMON_GUIDE:
                    if (this.f14378a == null || !this.f14378a.isOfficial()) {
                        PlatformMessageHelper.INSTANCE.add(cVar);
                        return;
                    }
                case FOLLOW_GUIDE:
                    if (this.f14378a == null || !this.f14378a.isOfficial()) {
                        if (this.f14387aI == null) {
                            this.f14387aI = new FollowGuideWidget(mo13130g());
                            this.f14475y.load(this.f14387aI);
                        }
                        PlatformMessageHelper.INSTANCE.lambda$addFollowGuideMessage$1$PlatformMessageHelper(mo13137n(), cVar);
                        return;
                    }
                case REMIND:
                    m16240a((C8540cb) cVar);
                    return;
                case DOU_PLUS_MESSAGE:
                    this.f14472v.lambda$put$1$DataCenter("data_dou_plus_promote_message", cVar);
                    return;
                case LIVE_ECOM_MESSAGE:
                    this.f14472v.lambda$put$1$DataCenter("data_live_ecom_message", cVar);
                    return;
                case FRATERNITY_MESSAGE:
                    this.f14472v.lambda$put$1$DataCenter("data_hs_fraternity_bubble", cVar);
                    break;
                case CEREMONY_MESSAGE:
                    break;
            }
            this.f14472v.lambda$put$1$DataCenter("data_d_live_message", cVar);
        }
    }

    /* renamed from: a */
    public final void mo11955a(C9499a aVar) {
        if (aVar == null) {
            PlatformMessageHelper.INSTANCE.onMessageFinish();
        } else if (aVar instanceof C8544cf) {
            this.f14423as.mo13900a((C8544cf) aVar);
        } else if (aVar instanceof C8686r) {
            this.f14386aH.mo13705a((C8686r) aVar);
        } else if (aVar instanceof C8481ah) {
            this.f14387aI.mo13755a(this.f14378a, (C8481ah) aVar);
        } else if (aVar instanceof C8493as) {
            m16238a((C8493as) aVar);
        } else if (aVar instanceof C8683p) {
            this.f14391aM.mo13702a((C8683p) aVar);
        } else {
            PlatformMessageHelper.INSTANCE.onMessageFinish();
        }
    }

    /* renamed from: a */
    public final boolean mo9067a() {
        if (mo8870a(true)) {
            return true;
        }
        mo13217b(8);
        return true;
    }

    /* renamed from: a */
    private static boolean mo8870a(boolean z) {
        C3496m mVar = (C3496m) C9178j.m27302j().mo22378g().mo22355a(C3496m.class);
        if (mVar == null || !mVar.mo10529b()) {
            return false;
        }
        mVar.mo10527a();
        return true;
    }

    public void onEvent(C8296e eVar) {
        int i = eVar.f22777b;
        User user = (User) this.f14472v.get("data_user_in_room");
        if (user != null) {
            user.setPayScores(user.getPayScores() + ((long) i));
            user.setNeverRecharge(false);
        }
        this.f14472v.lambda$put$1$DataCenter("data_first_charge_in_room", new FirstChargeCheck());
        this.f14472v.lambda$put$1$DataCenter("data_user_in_room", user);
    }

    public void onEvent(C4453w wVar) {
        float f;
        if (getView() != null) {
            if (wVar.f12916b) {
                this.f14406ab.setVisibility(0);
                this.f14406ab.setOnClickListener(new C5233c(this));
                View view = this.f14365N;
                if (mo13130g()) {
                    f = (float) (-wVar.f12915a);
                } else {
                    f = (float) (-(wVar.f12915a + C3358ac.m12510a(48.0f)));
                }
                view.setTranslationY(f);
                this.f14465o.post(new C5267d(this));
            } else {
                this.f14406ab.setVisibility(8);
                this.f14365N.setTranslationY(0.0f);
                this.f14465o.post(new C5306e(this));
            }
            String str = wVar.f12916b ? "input_event" : "input_close";
            StringBuilder sb = new StringBuilder("translateY:");
            sb.append(String.valueOf(wVar.f12915a));
            m16247a(str, sb.toString());
        }
    }

    /* renamed from: a */
    private void m16238a(C8493as asVar) {
        if (this.f14378a != null && this.f14378a.isOfficial()) {
            return;
        }
        if (asVar.f23276a == 1 || asVar.f23276a == 3) {
            PlatformMessageHelper.INSTANCE.onMessageFinish();
            return;
        }
        if (asVar.f23276a == 2) {
            this.f14447bp = asVar.f23279d;
            this.f14465o.post(this.f14448bq);
            PlatformMessageHelper.INSTANCE.onMessageFinish();
        }
    }

    /* renamed from: a */
    private void m16240a(C8540cb cbVar) {
        if (this.f14431b && cbVar != null) {
            switch (cbVar.f23495b) {
                case 1:
                    return;
                case 2:
                    if (!this.f14453c) {
                        this.f14369R.setVisibility(0);
                    } else {
                        this.f14398aT.setVisibility(0);
                        this.f14398aT.mo7078b();
                    }
                    this.f14378a.setMosaicStatus(1);
                    if (this.f14452bu != null) {
                        this.f14452bu.mo8807a(cbVar);
                    }
                    this.f14472v.lambda$put$1$DataCenter("cmd_force_close_linkin", Boolean.valueOf(true));
                    return;
                case 3:
                    if (!this.f14395aQ) {
                        this.f14369R.setVisibility(8);
                    }
                    this.f14398aT.setVisibility(8);
                    this.f14398aT.mo7085f();
                    this.f14378a.setMosaicStatus(0);
                    if (this.f14452bu != null) {
                        this.f14452bu.mo8807a(cbVar);
                        return;
                    }
                    break;
                case 4:
                    Spannable spannable = C4374z.f12668a;
                    if (cbVar.supportDisplayText()) {
                        spannable = C4374z.m14749a(cbVar.baseMessage.f26000j, "");
                    }
                    if (spannable == C4374z.f12668a && !TextUtils.isEmpty(cbVar.f23494a)) {
                        spannable = new SpannableString(cbVar.f23494a);
                    }
                    C4374z.m14749a(cbVar.f23497d, "");
                    C4374z.m14749a(cbVar.f23498e, "");
                    C4374z.m14749a(cbVar.f23499f, "");
                    C4374z.m14749a(cbVar.f23500g, "");
                    if (!TextUtils.isEmpty(spannable)) {
                        new C9249a(getActivity(), 0).mo22716a(false).mo22710a((int) R.string.eng).mo22727c((CharSequence) spannable).mo22722b(0, (int) R.string.etn, (DialogInterface.OnClickListener) new C5312f(this)).mo22729d();
                        C8448g.m25682a((Context) getActivity());
                        return;
                    }
                    return;
                case 5:
                    if (this.f14400aV == null) {
                        this.f14400aV = ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).createCoverController(this, this.f14378a);
                    }
                    this.f14400aV.mo8941a(cbVar);
                    break;
            }
        }
    }

    public void onEvent(C4454x xVar) {
        this.f14472v.lambda$put$1$DataCenter("data_login_event", xVar);
    }

    public void onEvent(C8369b bVar) {
        if (bVar.f22935a && bVar.f22936b > 0 && bVar.f22936b >= 0) {
            if (this.f14427aw != null) {
                this.f14427aw.mo14254a(bVar.f22936b);
            }
            if (this.f14353B != null) {
                this.f14353B.mo14226a(bVar.f22936b);
            }
        }
    }

    public void onEvent(C9300c cVar) {
        if (!this.f14431b) {
            boolean z = false;
            boolean z2 = 1 == cVar.f25479a;
            if (cVar.f25479a == 0) {
                z = true;
            }
            if (!z2 && z) {
                C3517a.m12960a((Context) getActivity(), (int) R.string.eyf);
            }
        }
    }

    public void onEvent(C4435e eVar) {
        if (this.f14431b) {
            C8541cc ccVar = eVar.f12879a;
            if (ccVar != null) {
                try {
                    new JSONObject().put("trace_id", ccVar.f23504c);
                    IUser a = TTLiveSDKContext.getHostService().mo22367h().mo22165a();
                    C8448g.m25682a((Context) getActivity());
                    if (a != null) {
                        a.getId();
                    }
                    this.f14378a.getId();
                } catch (JSONException unused) {
                }
                if (this.f14379aA != null) {
                    this.f14379aA.mo14007a(ccVar.f23507f, ccVar.f23506e);
                }
            }
        }
    }

    public void onEvent(C9409a aVar) {
        if (this.f14431b && aVar.f25901b == 3 && !mo13130g()) {
            this.f14472v.lambda$put$1$DataCenter("cmd_clear_gift_message", new C4901d());
        }
    }

    /* renamed from: a */
    private void m16235a(C4448r rVar) {
        if (this.f14431b) {
            if (rVar.f12904a == 0) {
                mo13134k();
                if (!this.f14453c) {
                    this.f14408ad.setBackgroundColor(Color.parseColor("#303342"));
                    C9738o.m28712b(this.f14408ad, 0);
                }
            } else if (rVar.f12904a == 1) {
                m16222H();
                if (!this.f14453c) {
                    C9738o.m28712b(this.f14408ad, 8);
                }
            }
        }
    }

    /* renamed from: a */
    protected static void m16247a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "on_adjust_text_message_widget");
        if (str != null) {
            hashMap.put("adjust_reason", str);
        }
        if (str2 != null) {
            hashMap.put("adjust_param", str2);
        }
        C8444d.m25673b().mo9999a("ttlive_room", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    private void m16239a(C8497aw awVar) {
        if (getView() != null && mo13138o() && getContext() != null) {
            this.f14393aO = awVar.f23284a;
            View findViewById = ((ViewGroup) getView().findViewById(R.id.af1)).findViewById(R.id.aex);
            if (findViewById instanceof EnterAnimationView) {
                ((EnterAnimationView) findViewById).setChildMarginBottom(awVar.f23284a);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo13120a(Runnable runnable, boolean z) {
        for (C4228a a : this.f14470t) {
            if (a.mo11784a(runnable, z)) {
                return true;
            }
        }
        return false;
    }

    public void onEvent(C4436f fVar) {
        if (fVar.f12880a) {
            C9420h.m27937a(C3384d.m12589a(getContext()), this.f14378a, true);
        } else {
            C9420h.m27937a(C3384d.m12589a(getContext()), this.f14378a, false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13111a(DialogInterface dialogInterface) {
        mo13217b(8);
    }

    /* renamed from: a */
    public final void mo13108a(int i) {
        if (this.f14426av != null) {
            this.f14426av.mo14236a();
        }
    }

    /* renamed from: a */
    public final void mo10474a(float f) {
        if (this.f14384aF != null) {
            this.f14384aF.mo8935a(f);
        }
        if (C4261a.m14409a()) {
            this.f14403aY.mo14202a(f);
        }
    }

    /* renamed from: a */
    public final void mo10480a(boolean z, CharSequence charSequence, CharSequence charSequence2) {
        if (z) {
            this.f14356E.setVisibility(0);
            this.f14396aR.setText(charSequence);
            this.f14397aS.setText(charSequence2);
            if ((this.f14381aC != null && this.f14381aC.mo13680a()) || (this.f14380aB != null && this.f14380aB.f15713a)) {
                LayoutParams layoutParams = (LayoutParams) this.f14462l.getLayoutParams();
                LayoutParams layoutParams2 = new LayoutParams(layoutParams.width, layoutParams.height);
                layoutParams2.addRule(11);
                layoutParams2.rightMargin = C3358ac.m12526d(R.dimen.tc);
                layoutParams2.addRule(2, this.f14356E.getId());
                layoutParams2.bottomMargin = C3358ac.m12510a(8.0f);
                this.f14462l.setLayoutParams(layoutParams2);
            }
        } else {
            mo13128c(true);
            this.f14356E.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo8873a(DutyGiftInfo dutyGiftInfo) {
        if (dutyGiftInfo == null) {
            return;
        }
        if (dutyGiftInfo.isStarted() || dutyGiftInfo.isPlaying()) {
            C8149d findGiftById = ((IGiftService) C3596c.m13172a(IGiftService.class)).findGiftById(dutyGiftInfo.getGiftId());
            if (findGiftById != null) {
                C9097a.m27146a().mo22267a((Object) new C4440j(findGiftById, 2, true));
            }
        }
    }

    /* renamed from: a */
    private static void m16244a(LiveWidget liveWidget, int i) {
        if (liveWidget != null && liveWidget.contentView != null) {
            liveWidget.contentView.setVisibility(i);
        }
    }

    /* renamed from: F */
    private void m16220F() {
        mo13217b(6);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final /* synthetic */ void mo13161u() {
        mo13124b(false);
    }

    /* renamed from: J */
    private boolean m16224J() {
        if (this.f14469s == LiveMode.AUDIO) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void mo13133j() {
        this.f14470t.add(new C5320n(this));
        m16268z();
    }

    public void onPause() {
        super.onPause();
        if (this.f14412ah != null) {
            this.f14412ah.mo21535b();
        }
        this.f14364M = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final /* synthetic */ void mo13159s() {
        this.f14472v.lambda$put$1$DataCenter("data_keyboard_status", Boolean.valueOf(false));
        m16260f(0);
    }

    /* renamed from: C */
    private void m16217C() {
        if (!(this.f14378a == null || this.f14378a.getOwner() == null || this.f14377Z)) {
            this.f14377Z = true;
        }
    }

    /* renamed from: H */
    private void m16222H() {
        if (this.f14359H != C5064a.NORMAL) {
            this.f14359H = this.f14360I;
            this.f14370S.setVisibility(0);
        }
    }

    /* renamed from: K */
    private void m16225K() {
        this.f14356E.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                AbsInteractionFragment.this.f14356E.setVisibility(8);
                AbsInteractionFragment.this.mo13128c(true);
                AbsInteractionFragment.this.f14472v.lambda$put$1$DataCenter("cmd_show_illegal_dialog", new Object());
            }
        });
        this.f14398aT.setImageAssetsFolder("images/");
        this.f14398aT.setAnimation("illegal_live_shadow_loading.json");
        this.f14398aT.mo7082c(true);
    }

    /* renamed from: b */
    public final void mo10398b() {
        if (this.f14436be != null && this.f14436be.isShowing()) {
            C5322p.m16986a(this.f14436be);
            this.f14436be = null;
        }
    }

    /* renamed from: c */
    public final void mo10481c() {
        if (this.f14412ah != null) {
            this.f14412ah.f22967a = true;
            this.f14412ah.mo21535b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo13134k() {
        if (getContext() != null && this.f14359H != C5064a.PK) {
            this.f14360I = this.f14359H;
            this.f14359H = C5064a.PK;
            this.f14370S.setVisibility(4);
        }
    }

    /* renamed from: l */
    public final void mo13135l() {
        if (mo13138o()) {
            try {
                ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f14365N.getWindowToken(), 0);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: m */
    public final void mo13136m() {
        if (this.f14431b && this.f14475y != null) {
            this.f14472v.lambda$put$1$DataCenter("cmd_stop_special_gift", Boolean.valueOf(true));
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f14412ah != null) {
            this.f14412ah.mo21534a();
        }
        if (this.f14363L) {
            mo13217b(3);
            this.f14363L = false;
        }
        this.f14364M = false;
        m16218D();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final /* synthetic */ void mo13160t() {
        this.f14472v.lambda$put$1$DataCenter("data_keyboard_status", Boolean.valueOf(true));
        m16260f(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final /* synthetic */ void mo13162v() {
        if (!this.f14364M) {
            mo13217b(3);
        } else {
            this.f14363L = true;
        }
        if (this.f14414aj != null) {
            this.f14414aj.mo11474a(this.f14378a.getId(), this.f14453c);
        }
    }

    /* renamed from: B */
    private void m16216B() {
        LayoutParams layoutParams = (LayoutParams) this.f14371T.getLayoutParams();
        LayoutParams layoutParams2 = new LayoutParams(layoutParams.width, layoutParams.height);
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.bottomMargin = C3358ac.m12510a(140.0f);
        layoutParams2.rightMargin = C3358ac.m12510a(8.0f);
        this.f14371T.setLayoutParams(layoutParams2);
    }

    /* renamed from: D */
    private void m16218D() {
        if (mo13156p() && getDialog() != null) {
            Window window = getDialog().getWindow();
            if (window != null && VERSION.SDK_INT >= 21 && window.getStatusBarColor() != -16777216) {
                window.setStatusBarColor(-16777216);
            }
        }
    }

    /* renamed from: I */
    private void m16223I() {
        if (this.f14431b) {
            new C9249a(getActivity(), 0).mo22710a((int) R.string.f4z).mo22718b((int) R.string.epj).mo22722b(0, (int) R.string.etn, C5313g.f15551a).mo22713a((OnDismissListener) new C5314h(this)).mo22729d();
        }
    }

    /* renamed from: w */
    private void mo13220w() {
        if (this.f14392aN != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f14392aN.getLayoutParams();
            if (this.f14457g > 0) {
                marginLayoutParams.topMargin = this.f14457g - C3358ac.m12510a(36.0f);
            } else {
                marginLayoutParams.topMargin = C3358ac.m12520b() / 2;
            }
            this.f14392aN.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: x */
    private void mo13400x() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            Bundle bundle = arguments.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            if (bundle != null) {
                this.f14402aX = bundle.getLong("live.intent.extra.ENTER_LIVE_TIME", 0);
            }
            this.f14361J = arguments.getString("live.intent.extra.ENTER_LIVE_SOURCE", "");
        }
    }

    /* renamed from: d */
    public final void mo10482d() {
        if (this.f14352A != null) {
            this.f14352A.mo13694b();
        }
        if (this.f14376Y != null) {
            this.f14376Y.dismissAllowingStateLoss();
        }
        if (this.f14400aV != null) {
            this.f14400aV.mo8939a();
        }
        if (getActivity() != null) {
            Fragment a = getActivity().getSupportFragmentManager().mo2644a(WebDialogFragment.class.getCanonicalName());
            if (a instanceof DialogFragment) {
                ((DialogFragment) a).dismissAllowingStateLoss();
            }
        }
    }

    /* renamed from: G */
    private void m16221G() {
        if (getView() != null && mo13138o() && getContext() != null) {
            LayoutParams layoutParams = (LayoutParams) this.f14462l.getLayoutParams();
            layoutParams.width = C3358ac.m12526d(R.dimen.tf);
            layoutParams.height = C3358ac.m12526d(R.dimen.te);
            this.f14462l.setLayoutParams(layoutParams);
            if (this.f14438bg) {
                FrameLayout frameLayout = (FrameLayout) getView().findViewById(R.id.byb);
                LayoutParams layoutParams2 = (LayoutParams) frameLayout.getLayoutParams();
                m16231a(layoutParams2);
                frameLayout.setLayoutParams(layoutParams2);
                m16247a("adjust_right_bottom_banner", (String) null);
            }
        }
    }

    public void onDestroy() {
        this.f14413ai = false;
        if (this.f14368Q != null) {
            this.f14368Q.stop();
        }
        mo10481c();
        this.f14452bu = null;
        if (this.f14410af != null) {
            this.f14410af.mo12993a();
        }
        if (this.f14415ak != null && this.f14415ak.mo11345g()) {
            this.f14415ak.dismiss();
        }
        if (this.f14416al != null && this.f14416al.mo11345g()) {
            this.f14416al.dismiss();
        }
        mo13124b(false);
        if (this.f14409ae != null) {
            this.f14409ae.mo13038a();
        }
        if (this.f14411ag != null) {
            this.f14411ag.mo8963a();
        }
        this.f14465o.removeCallbacksAndMessages(null);
        if (this.f14399aU != null) {
            this.f14399aU.mo8872a();
        }
        if (this.f14399aU != null) {
            this.f14399aU.mo8872a();
        }
        super.onDestroy();
    }

    public void onDestroyView() {
        if (C9038ag.m26996a() != null) {
            C9038ag.m26996a().stopMessage(true);
        }
        PlatformMessageHelper.INSTANCE.stop();
        this.f14464n.mo119660a();
        if (this.f14472v != null) {
            this.f14472v.removeObserver(this);
        }
        this.f14431b = false;
        if (this.f14437bf != null) {
            this.f14437bf.mo8963a();
        }
        this.f14465o.removeMessages(100);
        super.onDestroyView();
        this.f14446bo = null;
        if (this.f14432ba != null) {
            this.f14432ba.dismiss();
            this.f14432ba = null;
        }
    }

    /* renamed from: E */
    private void m16219E() {
        HashMap hashMap = new HashMap();
        hashMap.put("target_uid", String.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b()));
        hashMap.put("sec_target_uid", TTLiveSDKContext.getHostService().mo22367h().mo22165a().getSecUid());
        hashMap.put("packed_level", "2");
        hashMap.put("request_from", "admin");
        hashMap.put("current_room_id", String.valueOf(this.f14378a.getId()));
        hashMap.put("anchor_id", String.valueOf(this.f14378a.getOwner().getId()));
        hashMap.put("sec_anchor_id", TTLiveSDKContext.getHostService().mo22367h().mo22172a(this.f14378a.getOwner().getId()));
        TTLiveSDKContext.getHostService().mo22367h().mo22166a(hashMap).mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19137b(this.f14435bd);
    }

    /* renamed from: y */
    private void m16267y() {
        if (m16224J() && !this.f14378a.isWithLinkMic()) {
            C8497aw awVar = new C8497aw();
            awVar.f23284a = (int) (getContext().getResources().getDimension(R.dimen.t6) + getContext().getResources().getDimension(R.dimen.sj));
            this.f14472v.lambda$put$1$DataCenter("cmd_normal_gift_layout_bottom_margin_update", Integer.valueOf(awVar.f23284a));
            C8497aw awVar2 = new C8497aw();
            awVar2.f23284a = (int) (getContext().getResources().getDimension(R.dimen.t6) + getContext().getResources().getDimension(R.dimen.sj));
            m16239a(awVar2);
            m16227a((int) getContext().getResources().getDimension(R.dimen.sk), (int) getContext().getResources().getDimension(R.dimen.sj));
        } else if (!m16224J() || !this.f14378a.isWithLinkMic()) {
            this.f14476z.containerView.post(new Runnable() {
                public final void run() {
                    if (AbsInteractionFragment.this.mo13138o() && AbsInteractionFragment.this.f14476z != null && AbsInteractionFragment.this.f14476z.containerView != null) {
                        ViewGroup.LayoutParams layoutParams = AbsInteractionFragment.this.f14476z.containerView.getLayoutParams();
                        StringBuilder sb = new StringBuilder("height: ");
                        sb.append(layoutParams.height);
                        sb.append(", width: ");
                        sb.append(layoutParams.width);
                        AbsInteractionFragment.m16247a("init", sb.toString());
                    }
                }
            });
        } else {
            C8497aw awVar3 = new C8497aw();
            awVar3.f23284a = (int) (getContext().getResources().getDimension(R.dimen.t6) + getContext().getResources().getDimension(R.dimen.si));
            this.f14472v.lambda$put$1$DataCenter("cmd_normal_gift_layout_bottom_margin_update", Integer.valueOf(awVar3.f23284a));
            C8497aw awVar4 = new C8497aw();
            awVar4.f23284a = (int) (getContext().getResources().getDimension(R.dimen.t6) + getContext().getResources().getDimension(R.dimen.si));
            m16239a(awVar4);
            m16227a(-1, (int) getContext().getResources().getDimension(R.dimen.si));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo13132i() {
        if (this.f14446bo != null) {
            this.f14458h.post(this.f14446bo);
            this.f14446bo = null;
        }
        mo13133j();
        IMessageManager a = C9038ag.m26996a();
        if (a != null) {
            a.startMessage();
        }
        if (this.f14378a.getOwner() != null && !this.f14377Z) {
            this.f14377Z = true;
        }
        long j = 0;
        if (this.f14453c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long longValue = ((Long) C8946b.f24493w.mo22117a()).longValue();
            if (this.f14378a.getId() <= 0 || this.f14378a.getId() != ((Long) C8946b.f24492v.mo22117a()).longValue() || longValue <= 0 || longValue >= elapsedRealtime) {
                C8946b.f24492v.mo22118a(Long.valueOf(this.f14378a.getId()));
                C8946b.f24493w.mo22118a(Long.valueOf(elapsedRealtime));
                j = elapsedRealtime;
            } else {
                j = longValue;
            }
        }
        if (!this.f14453c) {
            this.f14368Q.stop();
            m16258e(8);
        } else if (C9290a.f25466a) {
            View view = getView();
            if (view != null) {
                View findViewById = view.findViewById(R.id.bnm);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
            }
        } else {
            this.f14368Q.setBase(j);
            m16258e(0);
            this.f14368Q.start();
        }
        this.f14467q = new C5325s(getContext());
        this.f14466p = new GestureDetector(getContext(), new C5065b());
        this.f14405aa.mo22438a(this.f14451bt);
        this.f14409ae = new C5024i(this.f14472v);
        this.f14409ae.mo13039a(this);
        this.f14410af = new C4990bq();
        this.f14410af.mo12994a(this);
        this.f14411ag = new C5008cb(this.f14472v);
        this.f14411ag.mo9142a(this);
        this.f14437bf = ((IGiftService) C3596c.m13172a(IGiftService.class)).getGiftGuidePresenter(this.f14472v);
        this.f14437bf.mo9142a(this);
        PlatformMessageHelper.INSTANCE.start(this);
        m16217C();
        if (TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            m16219E();
        }
        ((Boolean) LiveSettingKeys.VIGO_FLAME_DIAMOND_GUIDE_SWITCH.mo10240a()).booleanValue();
        if (this.f14378a != null && this.f14378a.getStatus() == 3 && !this.f14453c) {
            C8688t a2 = C4270b.m14426a(this.f14378a.getId(), false);
            if (C9038ag.m26996a() != null) {
                C9038ag.m26996a().insertMessage(a2, true);
            }
        }
        TimeCostUtil.m12209c(Tag.ShowBInteractionFirstWidget);
        C3222b.m12218a().mo10134a(Tag.ShowBInteractionFirstWidget.name());
        TimeCostUtil.m12209c(Tag.ShowCInteractionFirstWidget);
        C3222b.m12218a().mo10134a(Tag.ShowCInteractionFirstWidget.name());
        mo13109a(((long) ((Integer) C5864b.f17248C.mo10240a()).intValue()) * 1000);
    }

    /* renamed from: g */
    private void m16262g(int i) {
        getView();
    }

    /* renamed from: a */
    private static void m16236a(C4452v vVar) {
        C9097a.m27146a().mo22267a((Object) vVar);
    }

    public void onEvent(C4444n nVar) {
        m16263g(nVar.f12897a);
    }

    /* renamed from: a */
    private void m16237a(C4490ao aoVar) {
        this.f14444bm = aoVar;
    }

    /* renamed from: b */
    private void mo13217b(int i) {
        m16236a(new C4452v(i));
    }

    /* renamed from: d */
    private void m16257d(int i) {
        this.f14472v.lambda$put$1$DataCenter("cmd_update_sticker_position", new C4426ar(i));
    }

    /* renamed from: e */
    private void m16258e(int i) {
        if (i == 0) {
            this.f14368Q.setVisibility(0);
        } else {
            this.f14368Q.setVisibility(i);
        }
    }

    public void onEvent(C4411ac acVar) {
        if (acVar != null && acVar.f12819a != null) {
            mo13114a(acVar.f12819a);
        }
    }

    /* renamed from: a */
    private HashMap<String, String> m16226a(HashMap<String, String> hashMap) {
        long j;
        if (this.f14378a != null) {
            j = this.f14378a.getId();
        } else {
            j = 0;
        }
        hashMap.put("room_id", String.valueOf(j));
        return hashMap;
    }

    /* renamed from: f */
    private void m16260f(int i) {
        if (this.f14378a == null || !this.f14378a.isOfficial()) {
            C9738o.m28712b(this.f14458h, i);
        }
    }

    public void onEvent(C4423ao aoVar) {
        if (aoVar == null || !aoVar.f12850a) {
            this.f14404aZ.setVisibility(8);
        } else {
            this.f14404aZ.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m16231a(LayoutParams layoutParams) {
        if (this.f14438bg && mo13130g()) {
            layoutParams.width = -1;
            layoutParams.rightMargin = C3358ac.m12526d(R.dimen.t5);
        }
    }

    /* renamed from: c */
    private void m16255c(int i) {
        if (this.f14408ad != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f14408ad.getLayoutParams();
            layoutParams.topMargin = i;
            int c = C3358ac.m12523c();
            if (C3377b.m12564b() && C3377b.m12562a() == 0) {
                c = 0;
            }
            layoutParams.width = c;
            layoutParams.gravity |= 1;
            this.f14408ad.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: e */
    private void m16259e(boolean z) {
        int i;
        TTLiveSDKContext.getHostService().mo22367h().mo22173a(z ? 1 : 0);
        if (this.f14468r == null) {
            m16219E();
            return;
        }
        if (this.f14468r.getUserAttr() == null) {
            this.f14468r.setUserAttr(new C2378j());
        }
        this.f14468r.getUserAttr().f7830b = z;
        if (z) {
            i = R.string.fbx;
        } else {
            i = R.string.fbw;
        }
        C9049ap.m27022a(i);
    }

    /* renamed from: f */
    private void m16261f(boolean z) {
        C4159bo.f12203a = z;
        if (this.f14468r == null) {
            m16219E();
            return;
        }
        if (this.f14468r.getUserAttr() == null) {
            this.f14468r.setUserAttr(new C2378j());
        }
        this.f14468r.getUserAttr().f7829a = z;
    }

    /* renamed from: h */
    private void m16264h(boolean z) {
        int i;
        int i2;
        LiveToolbarWidget liveToolbarWidget = this.f14424at;
        int i3 = 0;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        m16244a((LiveWidget) liveToolbarWidget, i);
        CommentWidget commentWidget = this.f14352A;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        m16244a((LiveWidget) commentWidget, i2);
        DutyGiftToolbarWidget dutyGiftToolbarWidget = this.f14425au;
        if (!z) {
            i3 = 8;
        }
        m16244a((LiveWidget) dutyGiftToolbarWidget, i3);
        C8444d.m25673b();
        StringBuilder sb = new StringBuilder("CommentWidget status Changed, isShow:");
        sb.append(!z);
        C8444d.m11971b("ttlive_comment", sb.toString());
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m16230a(bundle);
        if (this.f14453c && !this.f14469s.isStreamingBackground) {
            this.f14366O.setVisibility(0);
            this.f14366O.setCountDownListener(new C5318l(this));
            this.f14366O.mo14194a();
        }
    }

    public void onEvent(C4422an anVar) {
        if (this.f14471u != null && (anVar.f12849b == 2 || SystemClock.elapsedRealtime() - this.f14471u.f12608e <= ((long) ((Integer) C5864b.f17248C.mo10240a()).intValue()) * 1000)) {
            if (this.f14378a.isOfficial()) {
                this.f14413ai = false;
            } else {
                this.f14413ai = anVar.f12848a;
            }
        }
    }

    /* renamed from: g */
    private void m16263g(boolean z) {
        if (!(this instanceof LandscapeInteractionFragment)) {
            this.f14456f = z;
            boolean a = C3519c.m12965a(getContext());
            int width = this.f14365N.getWidth();
            if (a) {
                width = -width;
            }
            this.f14365N.setVisibility(8);
            if (z) {
                this.f14365N.setX((float) width);
                this.f14472v.lambda$put$1$DataCenter("cmd_show_screen", Boolean.valueOf(false));
                C9097a.m27146a().mo22267a((Object) new C4432b(true));
                return;
            }
            this.f14365N.setX(0.0f);
            this.f14365N.setVisibility(0);
            this.f14472v.lambda$put$1$DataCenter("cmd_show_screen", Boolean.valueOf(true));
            C9097a.m27146a().mo22267a((Object) new C4432b(false));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo13126c(float f) {
        boolean z;
        if (!(this instanceof LandscapeInteractionFragment)) {
            boolean a = C3519c.m12965a(getContext());
            if ((!a || f >= 0.0f) && (a || f <= 0.0f)) {
                z = false;
            } else {
                z = true;
            }
            int width = this.f14365N.getWidth();
            if (a) {
                width = -width;
            }
            if (z) {
                C8448g.m25682a((Context) getActivity());
                this.f14378a.getId();
                this.f14365N.animate().x((float) width).setListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C9097a.m27146a().mo22267a((Object) new C4432b(true));
                    }
                }).start();
                m16262g(0);
                return;
            }
            C8448g.m25682a((Context) getActivity());
            this.f14378a.getId();
            this.f14365N.animate().x(0.0f).setListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    C9097a.m27146a().mo22267a((Object) new C4432b(false));
                }
            }).start();
            m16262g(8);
        }
    }

    /* renamed from: d */
    public final void mo13129d(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        m16256c(R.id.dn3, i);
        m16256c(R.id.ck1, i);
        m16256c(R.id.cli, i);
        m16256c(R.id.a5v, i);
        m16256c(R.id.cby, i);
        m16256c(R.id.ai3, i);
        m16256c(R.id.awd, i);
        m16258e(i);
        m16260f(i);
    }

    public void handleMsg(Message message) {
        if (this.f14431b) {
            if (message.obj instanceof ApiServerException) {
                mo13118a((Throwable) (Exception) message.obj);
            } else if (message.obj instanceof Exception) {
                Object obj = message.obj;
            } else if (message.what == 100) {
                m16241a((C9355c) message.obj);
                this.f14472v.lambda$put$1$DataCenter("data_has_sticker_effective", Boolean.valueOf(true));
            } else {
                if (message.what == 200) {
                    C9097a.m27146a().mo22267a((Object) new C4422an(true, 2));
                }
            }
        }
    }

    public void onEvent(C4033c cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!TextUtils.isEmpty(cVar.f12009a)) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            int i5 = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
            int i6 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
            if (mo13130g()) {
                if (cVar.f12010b > 0) {
                    i4 = cVar.f12010b;
                } else {
                    i4 = i6 / 2;
                }
                i = i4;
                i2 = i5;
            } else {
                i2 = i6;
                i = i2;
            }
            String str = cVar.f12009a;
            String str2 = "";
            if (mo13130g()) {
                i3 = 80;
            } else {
                i3 = 8388613;
            }
            C4414af afVar = new C4414af(str, str2, i3, i2, i, 0);
            onEvent(afVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13123b(View view) {
        this.f14352A.mo13694b();
        if (this.f14422ar != null) {
            this.f14422ar.mo13056a();
        }
        this.f14406ab.setVisibility(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo13127c(View view) {
        int id = view.getId();
        if (id == R.id.x_ || id == R.id.jn) {
            m16220F();
        }
    }

    public void onEvent(C4034d dVar) {
        if (this.f14418an == null || !this.f14418an.isShowing()) {
            JSONObject jSONObject = dVar.f12012b;
            try {
                jSONObject.put("anchor_id", this.f14378a.getOwner().getId());
            } catch (Exception e) {
                C3166a.m11963b("AbsInteractionFragment", (Throwable) e);
            }
            Bundle bundle = new Bundle();
            bundle.putString(IWalletService.KEY_BUNDLE_REQUEST_PAGE, "live_detail");
            this.f14418an = ((IWalletService) C3596c.m13172a(IWalletService.class)).getConsumeDialog(getActivity(), bundle, jSONObject, new C3597a() {
                /* renamed from: a */
                public final void mo11022a(Dialog dialog, C3777e eVar) {
                    if (eVar != null) {
                        switch (eVar.mo11042b()) {
                            case 10001:
                                C9049ap.m27022a((int) R.string.f9e);
                                if (AbsInteractionFragment.this.f14474x != null) {
                                    AbsInteractionFragment.this.f14474x.dismissAllowingStateLoss();
                                }
                                if (AbsInteractionFragment.this.f14472v != null) {
                                    AbsInteractionFragment.this.f14472v.lambda$put$1$DataCenter("cmd_purchase_success", "");
                                    return;
                                }
                                break;
                            case 10002:
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("status", "success");
                                    jSONObject.put("code", "1");
                                } catch (Exception e) {
                                    C3166a.m11963b("AbsInteractionFragment", (Throwable) e);
                                }
                                C9178j.m27302j().mo22374c().mo11543a("H5_payStatus", jSONObject);
                                break;
                        }
                    }
                }
            }, dVar.f12011a);
            this.f14418an.show();
        }
    }

    /* renamed from: a */
    private void m16230a(Bundle bundle) {
        View view = getView();
        if (view != null) {
            if (C9038ag.m26996a() != null) {
                C9038ag.m26996a().startMessage();
            }
            this.f14401aW = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 3;
            if (this.f14472v != null) {
                this.f14472v.observe("cmd_show_user_profile", this).observeForever("data_user_in_room", this).observeForever("data_screen_record_is_open", this).observeForever("data_is_followed", this).observe("cmd_interact_audio", this).observe("cmd_live_radio", this).observeForever("cmd_widget_loaded", this).observe("cmd_video_orientation_changed", this, true).observeForever("cmd_pk_state_change", this).observe("cmd_normal_gift_widget_layout_change", this, true).observe("cmd_enter_widget_layout_change", this, true).observeForever("cmd_refresh_user_in_room", this).observe("cmd_sticker_is_selected", this).observeForever("data_login_event", this).observe("cmd_interact_player_view_change", this).observe("cmd_show_fans_club_setting", this).observe("cmd_adjust_video_interact_stream_bottom", this).observeForever("cmd_duty_gift_changed", this).observe("cmd_close_h5_dialog", this).observe("cmd_official_hide", this);
                m16253b(view, bundle);
                m16267y();
                if (getDialog() != null) {
                    Window window = getDialog().getWindow();
                    if (window != null) {
                        window.setBackgroundDrawable(new ColorDrawable(0));
                        window.setSoftInputMode(50);
                    }
                    getDialog().setOnKeyListener(this.f14434bc);
                }
                if (C4261a.m14409a()) {
                    this.f14403aY = (DebugInfoView) ((ViewStub) view.findViewById(R.id.a6h)).inflate();
                }
                if (this.f14446bo != null) {
                    view.post(this.f14446bo);
                    this.f14446bo = null;
                }
                mo13133j();
                C5747j.m18105c().mo14165a(ToolbarButton.SHARE, (C5739a) new C5067d());
                m16225K();
            }
        }
    }

    /* renamed from: b */
    private void m16254b(C4448r rVar) {
        if (getView() != null && mo13138o() && getContext() != null) {
            ViewGroup viewGroup = (ViewGroup) getView().findViewById(R.id.byb);
            LayoutParams layoutParams = (LayoutParams) viewGroup.getLayoutParams();
            if (rVar.f12904a == 0) {
                if (rVar.f12905b instanceof Integer) {
                    int intValue = ((Integer) rVar.f12905b).intValue() + ((int) C9738o.m28708b(getContext(), 10.0f));
                    int height = getView().getHeight();
                    if (height <= 0) {
                        height = C9738o.m28709b(getContext());
                        C3166a.m11965d("AbsInteractionFragment.adjustTextMessage", "failed to obtain iaHeight");
                    }
                    int i = (height - intValue) - layoutParams.bottomMargin;
                    StringBuilder sb = new StringBuilder("iaHeight:");
                    sb.append(height);
                    sb.append(" height:");
                    sb.append(i);
                    sb.append(" topMargin:");
                    sb.append(intValue);
                    sb.append(" bottomMargin:");
                    sb.append(layoutParams.bottomMargin);
                    String sb2 = sb.toString();
                    if (i < 200) {
                        i = Math.max((int) C9738o.m28708b(getContext(), 160.0f), C34943c.f91127w);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(sb2);
                        sb3.append(" fallback_height: ");
                        sb3.append(i);
                        sb2 = sb3.toString();
                    }
                    layoutParams.height = i;
                    m16247a("pk_on", sb2);
                }
            } else if (rVar.f12904a == 1) {
                layoutParams.height = (int) C9738o.m28708b(getContext(), 169.0f);
                StringBuilder sb4 = new StringBuilder("height:");
                sb4.append(layoutParams.height);
                m16247a("pk_off", sb4.toString());
            }
            m16231a(layoutParams);
            viewGroup.setLayoutParams(layoutParams);
            m16252b(layoutParams.height, layoutParams.bottomMargin);
            if (this.f14420ap != null) {
                this.f14420ap.mo13751a(rVar);
            }
            m16257d(layoutParams.height + layoutParams.bottomMargin);
        }
    }

    /* renamed from: c */
    public final void mo13128c(boolean z) {
        LayoutParams layoutParams = (LayoutParams) this.f14462l.getLayoutParams();
        LayoutParams layoutParams2 = new LayoutParams(layoutParams.width, layoutParams.height);
        if (z) {
            layoutParams2.addRule(12);
            layoutParams2.bottomMargin = C3358ac.m12526d(R.dimen.ta);
            layoutParams2.addRule(11);
            layoutParams2.rightMargin = C3358ac.m12526d(R.dimen.tc);
        } else {
            layoutParams2.addRule(10);
            layoutParams2.topMargin = C3358ac.m12526d(R.dimen.td);
            layoutParams2.addRule(9);
            layoutParams2.leftMargin = C3358ac.m12526d(R.dimen.tb);
        }
        this.f14462l.setLayoutParams(layoutParams2);
    }

    public void onCreate(Bundle bundle) {
        int i;
        String str;
        super.onCreate(null);
        setStyle(1, R.style.yp);
        setCancelable(false);
        m16245a(C4435e.class);
        m16245a(C9409a.class);
        m16245a(C4453w.class);
        m16245a(C4454x.class);
        m16245a(C9300c.class);
        m16245a(C4413ae.class);
        m16245a(C4034d.class);
        m16245a(C4414af.class);
        m16245a(C8296e.class);
        m16245a(C4422an.class);
        m16245a(C8369b.class);
        m16245a(UserProfileEvent.class);
        m16245a(C4033c.class);
        m16245a(C4411ac.class);
        m16245a(C4444n.class);
        m16245a(C4423ao.class);
        m16245a(C4436f.class);
        C3913e.m13800a().mo11452a(Integer.valueOf(0));
        if (this.f14469s == null) {
            this.f14469s = LiveMode.VIDEO;
        }
        if (TTLiveSDKContext.getHostService() != null) {
            this.f14355D = TTLiveSDKContext.getHostService().mo22367h();
        }
        mo13400x();
        this.f14439bh = getContext().getResources().getDimensionPixelSize(R.dimen.rb);
        this.f14440bi = getContext().getResources().getDimensionPixelSize(R.dimen.rc);
        this.f14441bj = (int) getContext().getResources().getDimension(R.dimen.sj);
        this.f14442bk = (int) getContext().getResources().getDimension(R.dimen.si);
        if (mo13130g()) {
            i = C3358ac.m12526d(R.dimen.rp);
        } else {
            i = 0;
        }
        this.f14393aO = i;
        if (this.f14472v != null) {
            this.f14472v.lambda$put$1$DataCenter("log_enter_live_source", this.f14361J);
            if (C7285c.m22838a(getActivity(), "feed_live_span", 0).getInt("span_count", 0) > 1) {
                str = "live_small_picture";
            } else {
                str = "live_big_picture";
            }
            this.f14472v.lambda$put$1$DataCenter("log_live_feed_layout", str);
            this.f14472v.lambda$put$1$DataCenter("log_streaming_type", this.f14469s.logStreamingType);
        }
        C9023a.m26970a(getContext());
    }

    public void onEvent(UserProfileEvent userProfileEvent) {
        long j;
        boolean z;
        boolean z2;
        String str;
        if (this.f14431b && ((this.f14415ak == null || !this.f14415ak.mo11345g()) && getActivity() != null)) {
            if (this.f14378a == null || !this.f14378a.isOfficial()) {
                if (userProfileEvent.user != null) {
                    j = userProfileEvent.user.getId();
                    this.f14415ak = LiveProfileDialogV2.m16597a(getActivity(), mo13130g(), userProfileEvent.user.getId(), this.f14378a, this.f14468r, userProfileEvent.mSource);
                } else {
                    j = userProfileEvent.userId;
                    this.f14415ak = LiveProfileDialogV2.m16597a(getActivity(), mo13130g(), userProfileEvent.userId, this.f14378a, this.f14468r, userProfileEvent.mSource);
                }
                this.f14415ak.mo13330a(userProfileEvent.interactLogLabel);
                this.f14415ak.mo13332b(this.f14361J);
                this.f14415ak.f14972y = this.f14472v;
                this.f14415ak.show((C0608j) this.mFragmentManager, LiveProfileDialogV2.f14932a);
                if (Room.isValid(this.f14378a)) {
                    User user = (User) this.f14472v.get("data_user_in_room");
                    long id = this.f14378a.getOwner().getId();
                    if (user == null || user.getId() == 0 || user.getId() != id) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (j == 0 || j != id) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z) {
                        if (z2) {
                            str = "anchor_c_anchor";
                        } else {
                            str = "anchor_c_audience";
                        }
                    } else if (z2) {
                        str = "audience_c_anchor";
                    } else {
                        str = "audience_c_audience";
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("click_type", str);
                    hashMap.put("request_page", str);
                    hashMap.put("to_user_id", String.valueOf(j));
                    if (!TextUtils.isEmpty(userProfileEvent.mEventModule)) {
                        hashMap.put("event_module", userProfileEvent.mEventModule);
                    }
                    if (!TextUtils.isEmpty(userProfileEvent.mClickUserPosition)) {
                        hashMap.put("click_user_position", userProfileEvent.mClickUserPosition);
                    }
                    C8443c.m25663a().mo21606a("livesdk_live_click_user", hashMap, Room.class, new C8438j().mo21598a("live_detail").mo21599b("live_interact"), new C8439k());
                }
            }
        }
    }

    /* renamed from: a */
    private void m16232a(C2440e eVar) {
        if (mo13138o()) {
            this.f14465o.removeMessages(100);
            if (eVar.f7973a != null && !TextUtils.equals("", eVar.f7973a.f25577p)) {
                HashMap hashMap = new HashMap();
                hashMap.put("sticker_id", String.valueOf(eVar.f7973a.f25566e));
                C8443c.m25663a().mo21606a("live_take_sticker_select", m16226a(hashMap), new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_detail"));
                Message message = new Message();
                message.obj = eVar.f7973a;
                message.what = 100;
                this.f14465o.sendMessageDelayed(message, ((Long) LiveSettingKeys.LIVE_FACE_STICKER_EFFECTIVELY_USE_TIME.mo10240a()).longValue() * 1000);
            }
        }
    }

    public void onEvent(C4413ae aeVar) {
        if (!TextUtils.isEmpty(aeVar.f12824a)) {
            int e = (int) C3358ac.m12527e((int) (((float) C3358ac.m12523c()) * 0.8f));
            this.f14474x = ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11533a(C3979c.m13951a(aeVar.f12824a).mo11555a(e).mo11560b((e * 4) / 3).mo11564d(5).mo11566e(17).mo11559a(true));
            if (this.mFragmentManager != null) {
                this.f14474x.show((C0608j) this.mFragmentManager, "PackagePurchase");
            }
        }
    }

    /* renamed from: a */
    private void m16233a(UserProfileEvent userProfileEvent) {
        if (userProfileEvent != null) {
            userProfileEvent.interactLogLabel = (String) this.f14472v.get("Log_interact_lable");
            onEvent(userProfileEvent);
        }
    }

    /* renamed from: b */
    public final void mo8874b(DutyGiftInfo dutyGiftInfo) {
        if (dutyGiftInfo != null) {
            if (dutyGiftInfo.isStarted()) {
                C8149d findGiftById = ((IGiftService) C3596c.m13172a(IGiftService.class)).findGiftById(dutyGiftInfo.getGiftId());
                if (findGiftById != null) {
                    C9097a.m27146a().mo22267a((Object) new C4440j(findGiftById, 2, true));
                }
            } else if (dutyGiftInfo.isFinished()) {
                C8149d fastGift = ((IGiftService) C3596c.m13172a(IGiftService.class)).getFastGift();
                if (fastGift != null) {
                    C9097a.m27146a().mo22267a((Object) new C4440j(fastGift, 2));
                }
            }
        }
    }

    public void onEvent(C4414af afVar) {
        String str;
        if (afVar != null && !TextUtils.isEmpty(afVar.f12825a)) {
            int i = afVar.f12828d;
            if (i <= 0) {
                if (mo13130g()) {
                    i = C34943c.f91128x;
                } else {
                    i = 240;
                }
            }
            int i2 = afVar.f12829e;
            if (i2 <= 0) {
                if (mo13130g()) {
                    i2 = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
                } else {
                    i2 = 320;
                }
            }
            String str2 = "";
            String str3 = "";
            String str4 = "";
            String str5 = "";
            String str6 = "";
            C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
            if (a != null && (a instanceof C8420k)) {
                C8420k kVar = (C8420k) a;
                if (kVar.mo21568a().containsKey("enter_from")) {
                    str2 = (String) kVar.mo21568a().get("enter_from");
                }
                if (kVar.mo21568a().containsKey("source")) {
                    str3 = (String) kVar.mo21568a().get("source");
                }
            }
            C8416g a2 = C8443c.m25663a().mo21605a(Room.class);
            if (a2 != null && (a2 instanceof C8423n)) {
                C8423n nVar = (C8423n) a2;
                if (nVar.mo21568a().containsKey("anchor_id")) {
                    str4 = (String) nVar.mo21568a().get("anchor_id");
                }
                if (nVar.mo21568a().containsKey("log_pb")) {
                    str5 = (String) nVar.mo21568a().get("log_pb");
                }
                if (nVar.mo21568a().containsKey("request_id")) {
                    str6 = (String) nVar.mo21568a().get("request_id");
                }
            }
            String a3 = C3164a.m11945a();
            C9494e eVar = new C9494e(afVar.f12825a);
            eVar.mo23525a("language", a3);
            eVar.mo23525a("enter_from", str2);
            eVar.mo23525a("source_v3", str3);
            eVar.mo23525a("anchor_id", str4);
            eVar.mo23525a("log_pb", str5);
            eVar.mo23525a("request_id", str6);
            String str7 = "event_page";
            if (this.f14453c) {
                str = "live_take_detail";
            } else {
                str = "live_detail";
            }
            eVar.mo23525a(str7, str);
            eVar.mo23525a("event_belong", "live_interact");
            this.f14376Y = C9178j.m27302j().mo22374c().mo11533a(C3979c.m13951a(eVar.mo23522a()).mo11555a(i).mo11560b(i2).mo11564d(afVar.f12830f).mo11562c(afVar.f12831g).mo11566e(afVar.f12827c).mo11568f(afVar.f12833i).mo11558a(afVar.f12826b).mo11565d(afVar.f12834j).mo11559a(afVar.f12832h));
            BaseDialogFragment.m12686a(getActivity(), this.f14376Y);
        }
    }

    /* renamed from: c */
    private void m16256c(int i, int i2) {
        if (this.f14365N != null) {
            View findViewById = this.f14365N.findViewById(i);
            if (findViewById != null) {
                findViewById.setVisibility(i2);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f14431b = true;
        view.setFitsSystemWindows(true);
        mo13112a(view);
    }

    /* renamed from: b */
    private void m16252b(int i, int i2) {
        C8497aw awVar = new C8497aw();
        int i3 = i + i2;
        awVar.f23284a = ((int) getContext().getResources().getDimension(R.dimen.pp)) + i3;
        this.f14472v.lambda$put$1$DataCenter("cmd_normal_gift_layout_bottom_margin_update", Integer.valueOf(awVar.f23284a));
        C8497aw awVar2 = new C8497aw();
        awVar2.f23284a = i3;
        m16239a(awVar2);
    }

    /* renamed from: a */
    private void m16227a(int i, int i2) {
        if (getView() != null && mo13138o() && getContext() != null) {
            ViewGroup viewGroup = (ViewGroup) getView().findViewById(R.id.byb);
            LayoutParams layoutParams = (LayoutParams) viewGroup.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            m16231a(layoutParams);
            viewGroup.setLayoutParams(layoutParams);
            m16252b(layoutParams.height, layoutParams.bottomMargin);
            m16257d(layoutParams.height + layoutParams.bottomMargin);
            StringBuilder sb = new StringBuilder("width:");
            sb.append(i);
            sb.append(" height:");
            sb.append(i2);
            m16247a("audio_live_mode", sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13122b(DialogInterface dialogInterface, int i) {
        C8448g.m25682a((Context) getActivity());
        dialogInterface.dismiss();
    }

    /* renamed from: b */
    private void m16253b(View view, Bundle bundle) {
        String str;
        String str2 = "";
        C8444d.m25673b();
        C8444d.m11971b("ttlive_room", "prepare load widget");
        C8416g a = C8443c.m25663a().mo21605a(C8420k.class);
        if (a != null) {
            Map a2 = a.mo21568a();
            if (a2 != null && a2.containsKey("source")) {
                str2 = (String) a2.get("source");
            }
        }
        this.f14473w = ViewModuleManager.m18323a((Fragment) this, view, bundle);
        this.f14475y = RecyclableWidgetManager.m32093of((Fragment) this, view);
        this.f14475y.setWidgetProvider(C3850ab.m13691a());
        this.f14475y.setDataCenter(this.f14472v);
        this.f14414aj = new InRoomBannerManager(this);
        if (!this.f14453c || this.f14469s.isStreamingBackground) {
            this.f14414aj.mo11474a(this.f14378a.getId(), this.f14453c);
        }
        this.f14472v.lambda$put$1$DataCenter("data_room", this.f14378a).lambda$put$1$DataCenter("data_room_id", Long.valueOf(this.f14378a.getId())).lambda$put$1$DataCenter("data_is_anchor", Boolean.valueOf(this.f14453c)).lambda$put$1$DataCenter("data_is_portrait", Boolean.valueOf(mo13130g())).lambda$put$1$DataCenter("data_live_mode", this.f14469s).lambda$put$1$DataCenter("data_user_center", this.f14355D).lambda$put$1$DataCenter("data_in_room_banner_manager", this.f14414aj).lambda$put$1$DataCenter("data_enter_source", str2);
        this.f14382aD = new RechargeWidget();
        if (C9290a.f25466a) {
            this.f14385aG = new FirstRechargeWidget();
        }
        ((Integer) this.f14472v.get("data_xt_broadcast_type", Integer.valueOf(-1))).intValue();
        m16242a(this.f14472v);
        this.f14386aH = new CommonToastWidget();
        if ((this.f14378a.isThirdParty || this.f14378a.isScreenshot) && ((Boolean) LiveSettingKeys.LIVE_SHOW_GAME_QUIZ.mo10240a()).booleanValue()) {
            this.f14421aq = new GameQuizWidget();
        }
        String channel = TTLiveSDKContext.getHostService().mo22360a().getChannel();
        this.f14389aK = new EndWidget();
        this.f14424at = (LiveToolbarWidget) this.f14475y.load((int) R.id.dl9, LiveToolbarWidget.class, false);
        this.f14419ao = ((IGiftService) C3596c.m13172a(IGiftService.class)).getGiftWidget();
        this.f14475y.load(R.id.ea7, this.f14419ao, false);
        this.f14476z = (TextMessageWidget) this.f14475y.load((int) R.id.byb, TextMessageWidget.class);
        if (!this.f14378a.isOfficial() || mo13130g()) {
            if (((Integer) LiveConfigSettingKeys.LIVE_ENABLE_PACKUP_BANNER.mo10240a()).intValue() == 1) {
                this.f14381aC = (BottomRightBannerContainerWidget) this.f14475y.load((int) R.id.o7, BottomRightBannerContainerWidget.class, false);
            } else {
                this.f14380aB = (BottomRightBannerWidget) this.f14475y.load((int) R.id.o7, BottomRightBannerWidget.class, false);
            }
        }
        this.f14475y.load((int) R.id.dmo, TopRightBannerWidget.class);
        this.f14423as = (LiveRoomNotifyWidget) this.f14475y.load((int) R.id.asf, LiveRoomNotifyWidget.class);
        this.f14379aA = (RoomPushWidget) this.f14475y.load((int) R.id.cwd, RoomPushWidget.class);
        if (this.f14453c) {
            this.f14475y.load((int) R.id.aqa, ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).getWidgetClass(1));
        }
        this.f14354C = new BarrageWidget();
        if (this.f14378a != null && !this.f14378a.isOfficial()) {
            this.f14475y.load(R.id.kl, this.f14354C);
        }
        this.f14420ap = (EnterAnimWidget) this.f14475y.load((int) R.id.af1, EnterAnimWidget.class, true, new Object[]{Integer.valueOf(this.f14393aO)});
        if (this.f14378a.getRoomAuthStatus() == null || this.f14378a.getRoomAuthStatus().isEnableChat()) {
            this.f14352A = (CommentWidget) this.f14475y.load((int) R.id.zd, CommentWidget.class);
            C8444d.m25673b();
            C8444d.m11971b("ttlive_comment", "CommentWidget is load.");
        } else {
            C8444d.m25673b();
            C8444d.m11971b("ttlive_comment", "CommentWidget is not load, chat is disabled.");
        }
        if (this.f14378a != null && !this.f14378a.isOfficial()) {
            C9738o.m28712b(this.f14461k, 8);
            C9738o.m28712b(this.f14458h, 0);
            this.f14427aw = (LiveRoomWatchUserWidget) this.f14475y.load((int) R.id.dmp, LiveRoomWatchUserWidget.class);
            this.f14426av = (LiveRoomUserInfoWidget) this.f14475y.load((int) R.id.e9a, LiveRoomUserInfoWidget.class);
        }
        if (!C9290a.f25466a) {
            this.f14428ax = (PromotionStatusWidget) this.f14475y.load((int) R.id.cli, PromotionStatusWidget.class);
        }
        View findViewById = this.f14475y.contentView.findViewById(R.id.cby);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        if (this.f14453c && mo13130g() && !this.f14378a.isStar()) {
            this.f14390aL = (PopularCardWidget) this.f14475y.load((int) R.id.cic, PopularCardWidget.class);
            IBroadcastService iBroadcastService = (IBroadcastService) C3596c.m13172a(IBroadcastService.class);
            if (!(this.f14475y == null || iBroadcastService == null)) {
                C9738o.m28712b(view.findViewById(R.id.g7), 0);
                this.f14475y.load((int) R.id.g7, iBroadcastService.getWidgetClass(2));
            }
        }
        if (!this.f14453c && !C9290a.f25466a && (this.f14378a.getRoomAuthStatus() == null || this.f14378a.getRoomAuthStatus().isEnableChat())) {
            this.f14430az = (CommentPromotionWidget) this.f14475y.load((int) R.id.zk, CommentPromotionWidget.class);
        }
        if (m16224J()) {
            this.f14429ay = (RadioWidget) this.f14475y.load((int) R.id.cn3, RadioWidget.class);
        }
        if (channel == null) {
            str = null;
        } else {
            str = channel.toLowerCase();
        }
        if (TextUtils.equals(str, "local_test") && !this.f14453c && !C6319n.m19593a(this.f14378a.getPrivateInfo())) {
            this.f14475y.load((int) R.id.ck1, PrivateDebugInfoWidget.class);
        }
        if (C8804a.m26395a(this.f14472v, getArguments())) {
            this.f14475y.load((int) R.id.k3, BackToPreRoomWidget.class);
        }
        this.f14388aJ = (UserPermissionCheckWidget) this.f14475y.load(UserPermissionCheckWidget.class);
        this.f14383aE = new LiveShareWidget();
        this.f14391aM = new CommonGuideWidget();
        this.f14475y.load(this.f14382aD).load(this.f14385aG).load(R.id.bo5, this.f14422ar).load(this.f14386aH).load(this.f14383aE).load(R.id.a0s, this.f14391aM);
        mo13113a(view, bundle);
        this.f14475y.load(R.id.aeu, this.f14389aK);
        m16237a((C4490ao) this.f14429ay);
        m16264h(false);
        this.f14475y.load(CommonPopupMessageWidget.class);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f14429ay != null) {
            this.f14429ay.onActivityResult(i, i2, intent);
        }
        if (this.f14400aV != null) {
            this.f14400aV.mo8940a(i, i2, intent);
        }
    }

    /* renamed from: a */
    private void m16228a(int i, int i2, String str) {
        if (getView() != null && mo13138o() && getContext() != null) {
            ViewGroup viewGroup = (ViewGroup) getView().findViewById(R.id.byb);
            LayoutParams layoutParams = (LayoutParams) viewGroup.getLayoutParams();
            if (i >= 0) {
                layoutParams.height = i;
            }
            if (i2 >= 0) {
                layoutParams.rightMargin = i2;
            }
            m16231a(layoutParams);
            viewGroup.setLayoutParams(layoutParams);
            m16252b(layoutParams.height, layoutParams.bottomMargin);
            m16257d(layoutParams.height + layoutParams.bottomMargin);
            StringBuilder sb = new StringBuilder("height:");
            sb.append(i);
            sb.append(", rightMargin:");
            sb.append(i2);
            m16247a(str, sb.toString());
        }
    }
}
