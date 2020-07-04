package com.bytedance.android.livesdk.gift.effect.doodle;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3247af;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3387g;
import com.bytedance.android.live.core.utils.C3390j;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.linkpk.C3440a;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.DoodleGiftApi;
import com.bytedance.android.livesdk.chatroom.event.C4423ao;
import com.bytedance.android.livesdk.chatroom.p220ui.RtlViewPagerShower;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.C8283t;
import com.bytedance.android.livesdk.gift.DoodleCanvasView;
import com.bytedance.android.livesdk.gift.DoodleCanvasView.C7856a;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.effect.doodle.adapter.DoodleGiftAdapter;
import com.bytedance.android.livesdk.gift.effect.doodle.adapter.DoodleTemplateAdapter;
import com.bytedance.android.livesdk.gift.effect.doodle.view.CustomConstraintLayout;
import com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.model.DoodleTemplate;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.p390a.C8139f;
import com.bytedance.android.livesdk.gift.mvp.SendGiftFailException;
import com.bytedance.android.livesdk.gift.p374d.C7895a;
import com.bytedance.android.livesdk.gift.panel.p391a.C8169b;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.SendToType;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8437i;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8441m;
import com.bytedance.android.livesdk.p417q.C8791d;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C47555ab;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;

public class DoodleGiftDialogFragment extends LiveDialogFragment implements OnClickListener, C7997o {

    /* renamed from: A */
    private View f21568A;

    /* renamed from: B */
    private TextView f21569B;

    /* renamed from: C */
    private TextView f21570C;

    /* renamed from: D */
    private ImageView f21571D;

    /* renamed from: E */
    private RtlViewPagerShower f21572E;

    /* renamed from: F */
    private Button f21573F;

    /* renamed from: G */
    private HSImageView f21574G;

    /* renamed from: H */
    private View f21575H;

    /* renamed from: I */
    private C8791d f21576I;

    /* renamed from: J */
    private DoodleGiftAdapter f21577J;

    /* renamed from: K */
    private C8169b f21578K;

    /* renamed from: L */
    private boolean f21579L;

    /* renamed from: M */
    private boolean f21580M;

    /* renamed from: N */
    private SendToType f21581N;

    /* renamed from: O */
    private String f21582O;

    /* renamed from: P */
    private int f21583P;

    /* renamed from: Q */
    private int f21584Q;

    /* renamed from: R */
    private long f21585R;

    /* renamed from: S */
    private boolean f21586S;

    /* renamed from: T */
    private AnimatorSet f21587T = new AnimatorSet();

    /* renamed from: U */
    private AnimatorSet f21588U = new AnimatorSet();

    /* renamed from: V */
    private C8986g<IUser> f21589V = new C8986g<IUser>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(IUser iUser) {
            super.onNext(iUser);
            ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
            DoodleGiftDialogFragment.this.mo20853b();
        }
    };

    /* renamed from: a */
    public ImageView f21590a;

    /* renamed from: b */
    public HSImageView f21591b;

    /* renamed from: c */
    public RecyclerView f21592c;

    /* renamed from: d */
    public DoodleTemplateAdapter f21593d;

    /* renamed from: e */
    public int f21594e;

    /* renamed from: f */
    public int f21595f;

    /* renamed from: g */
    private Activity f21596g;

    /* renamed from: h */
    private boolean f21597h;

    /* renamed from: i */
    private boolean f21598i;

    /* renamed from: k */
    private boolean f21599k;

    /* renamed from: l */
    private long f21600l;

    /* renamed from: m */
    private DataCenter f21601m;

    /* renamed from: n */
    private Room f21602n;

    /* renamed from: o */
    private User f21603o;

    /* renamed from: p */
    private User f21604p;

    /* renamed from: q */
    private View f21605q;

    /* renamed from: r */
    private View f21606r;

    /* renamed from: s */
    private View f21607s;

    /* renamed from: t */
    private DoodleGiftView f21608t;

    /* renamed from: u */
    private DoodleCanvasView f21609u;

    /* renamed from: v */
    private TextView f21610v;

    /* renamed from: w */
    private ImageView f21611w;

    /* renamed from: x */
    private ImageView f21612x;

    /* renamed from: y */
    private ImageView f21613y;

    /* renamed from: z */
    private RecyclerView f21614z;

    /* renamed from: p */
    private void m24445p() {
        m24448s();
    }

    /* renamed from: q */
    private void m24446q() {
        m24447r();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo20855c() throws Exception {
        this.f21580M = false;
    }

    /* renamed from: a */
    public final void mo20844a(int i) {
        int i2 = i / 4;
        if (i2 >= 0 && i2 < this.f21583P) {
            this.f21584Q = i2;
            this.f21572E.mo13410a(this.f21584Q);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20846a(View view) {
        this.f21609u.mo20579a();
        mo20849a((C8169b) null, false);
    }

    /* renamed from: a */
    public final void mo20843a() {
        if (this.f21576I != null && this.f21576I.mo21856c()) {
            this.f21576I.dismiss();
        }
    }

    /* renamed from: a */
    private void m24423a(List<C8139f> list) {
        if (list != null && !list.isEmpty()) {
            this.f21577J.mo20879a(m24451v());
            this.f21577J.notifyDataSetChanged();
            m24428b(list.size());
        }
    }

    /* renamed from: a */
    public final void mo20849a(C8169b bVar, boolean z) {
        boolean z2 = true;
        if (bVar == null || bVar.f22362a.isEmpty()) {
            this.f21578K = null;
            this.f21586S = false;
            this.f21611w.setEnabled(false);
            this.f21612x.setEnabled(false);
            m24425a(false, m24416a(0, 0));
            if (z) {
                m24445p();
                if (this.f21593d != null && this.f21593d.f21649b == null) {
                    m24424a(true);
                }
            }
            if (!this.f21579L) {
                C9738o.m28712b(this.f21607s, 0);
            }
            return;
        }
        boolean z3 = this.f21578K == null || bVar.f22365d > this.f21578K.f22365d;
        this.f21586S = true;
        this.f21578K = bVar;
        this.f21611w.setEnabled(true);
        this.f21612x.setEnabled(true);
        C9738o.m28712b(this.f21607s, 8);
        int size = bVar.f22362a.size();
        if (size < ((Integer) C5864b.f17250E.mo10240a()).intValue()) {
            z2 = false;
        }
        m24425a(z2, m24416a(size, bVar.f22365d));
        if (z3) {
            m24446q();
        }
    }

    /* renamed from: a */
    private void m24425a(boolean z, CharSequence charSequence) {
        this.f21610v.setText(charSequence);
        if (z) {
            this.f21573F.setTextColor(C3358ac.m12521b((int) R.color.as5));
            this.f21573F.setBackground(C3358ac.m12524c(R.drawable.bp2));
            return;
        }
        this.f21573F.setTextColor(C3358ac.m12521b((int) R.color.ade));
        this.f21573F.setBackground(C3358ac.m12524c(R.drawable.bp3));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20850a(Long l) throws Exception {
        m24443n();
    }

    /* renamed from: a */
    public final void mo20851a(Object obj, boolean z) {
        if (obj instanceof C8139f) {
            if (this.f21614z != null) {
                C8139f fVar = (C8139f) obj;
                fVar.f22204b = z;
                int b = this.f21577J.mo20880b(fVar.mo21275p());
                if (b != -1) {
                    this.f21600l = fVar.mo21275p();
                    C1293v f = this.f21614z.mo5575f(b);
                    if (f instanceof DoodleGiftViewHolder) {
                        ((DoodleGiftViewHolder) f).mo20869a(z);
                    } else {
                        this.f21577J.notifyItemChanged(b);
                    }
                }
                if (z) {
                    C8149d r = fVar.mo21277r();
                    this.f21609u.mo20580a(r.f22233d, r.f22235f, r.f22231b);
                }
            }
        } else if ((obj instanceof DoodleTemplate) && this.f21592c != null) {
            DoodleTemplate doodleTemplate = (DoodleTemplate) obj;
            doodleTemplate.setSelected(z);
            int a = this.f21593d.mo20881a(doodleTemplate.getId());
            if (a != -1) {
                C1293v f2 = this.f21592c.mo5575f(a);
                if (f2 instanceof DoodleTemplateViewHolder) {
                    ((DoodleTemplateViewHolder) f2).mo20871a(z);
                    m24419a(doodleTemplate);
                    if (z) {
                        m24424a(false);
                    }
                } else {
                    this.f21593d.notifyItemChanged(a);
                }
            }
        }
    }

    /* renamed from: a */
    private void m24424a(boolean z) {
        if (z) {
            this.f21593d.mo20882a();
            m24449t();
            if (!this.f21586S) {
                C9738o.m28712b(this.f21607s, 0);
            }
            this.f21591b.setBackground(C3358ac.m12524c(R.drawable.bp8));
            this.f21591b.setAlpha(1.0f);
            return;
        }
        this.f21591b.setBackground(C3358ac.m12524c(R.drawable.bp9));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20848a(C8169b bVar, long j, C3479d dVar) throws Exception {
        C8158m mVar = (C8158m) dVar.data;
        mVar.f22305i = bVar.f22362a.size();
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11154a(mVar.f22299c);
        m24417a(mVar.f22305i, bVar);
        C8282s.m25314a(998, this.f21602n.getId(), SystemClock.uptimeMillis() - j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20852a(Throwable th) throws Exception {
        this.f21580M = false;
        if (th instanceof Exception) {
            m24421a((Exception) th);
            C8282s.m25315a(998, this.f21602n.getId(), th);
        }
    }

    /* renamed from: a */
    private void m24422a(String str, int i, long j, C8169b bVar, long j2) {
        C8169b bVar2 = bVar;
        if (this.f21602n != null && bVar2 != null) {
            String str2 = SendToType.GUEST == this.f21581N ? "guest_tuya_gift" : "tuya_gift";
            HashSet hashSet = new HashSet();
            try {
                JSONObject C = m24414C();
                int i2 = 0;
                for (C8283t tVar : this.f21578K.f22362a) {
                    hashSet.add(Long.valueOf(tVar.f22755c));
                    i2 += tVar.f22756d;
                }
                C.put("gift_id", hashSet);
                if (this.f21581N == SendToType.GUEST) {
                    C.put("UID", this.f21603o.getId());
                }
                C.put("enter_from", str);
                C.put("event_page", this.f21597h ? "live_take_detail" : "live_detail");
                HashMap hashMap = new HashMap();
                long j3 = 0;
                if (j != 0) {
                    hashMap.put("team_id", String.valueOf(j));
                    hashMap.put("top_anchor_id", this.f21603o == null ? "" : this.f21603o.getIdStr());
                }
                hashMap.put("request_id", this.f21602n.getRequestId());
                hashMap.put("log_pb", this.f21602n.getLog_pb());
                hashMap.put("gift_cnt", String.valueOf(i));
                HashMap hashMap2 = new HashMap();
                if (bVar2 == null || C6311g.m19573a(bVar2.f22362a)) {
                    hashMap2.put(Long.valueOf(998), Integer.valueOf(1));
                } else {
                    for (C8283t tVar2 : bVar2.f22362a) {
                        if (!hashMap2.containsKey(Long.valueOf(tVar2.f22755c))) {
                            hashMap2.put(Long.valueOf(tVar2.f22755c), Integer.valueOf(1));
                        } else {
                            hashMap2.put(Long.valueOf(tVar2.f22755c), Integer.valueOf(((Integer) hashMap2.get(Long.valueOf(tVar2.f22755c))).intValue() + 1));
                        }
                    }
                }
                hashMap.put("gift_info", C7895a.m24190a(hashMap2));
                hashMap.put("is_first_consume", String.valueOf(((IWalletService) C3596c.m13172a(IWalletService.class)).isFirstConsume(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a())));
                hashMap.put("growth_deepevent", "1");
                hashMap.put("template_id", String.valueOf(j2));
                C8443c a = C8443c.m25663a();
                String str3 = "send_gift";
                Object[] objArr = new Object[4];
                String obj = hashSet.toString();
                int i3 = this.f21581N == SendToType.GUEST ? C8437i.f23078b : C8437i.f23077a;
                if (this.f21603o != null) {
                    j3 = this.f21603o.getId();
                }
                C8441m mVar = new C8441m(str2, obj, i2, i3, j3);
                objArr[0] = mVar;
                objArr[1] = new C8438j().mo21598a(this.f21597h ? "live_take_detail" : "live_detail").mo21600c("bottom_tab").mo21599b("live_interact").mo21603f("other");
                objArr[2] = Room.class;
                objArr[3] = ((C3440a) C3596c.m13172a(C3440a.class)).getLinkCrossRoomLog();
                a.mo21606a(str3, hashMap, objArr);
            } catch (Exception e) {
                C3166a.m11966e("DoodleGiftDialogFragment", e.toString());
            }
        }
    }

    /* renamed from: t */
    private void m24449t() {
        C9738o.m28712b((View) this.f21574G, 8);
    }

    /* renamed from: u */
    private static List<DoodleTemplate> m24450u() {
        return GiftManager.inst().getDoodleTemplates();
    }

    /* renamed from: f */
    private void m24437f() {
        C79757 r0 = new GridPagerSnapHelper() {
            /* renamed from: a */
            public final View mo20745a(C1273i iVar) {
                View a = super.mo20745a(iVar);
                if (a == null) {
                    return null;
                }
                DoodleGiftDialogFragment.this.f21595f = C1273i.m6060c(a);
                DoodleGiftDialogFragment.this.mo20844a(DoodleGiftDialogFragment.this.f21595f);
                return a;
            }

            /* renamed from: a */
            public final int mo20744a(C1273i iVar, int i, int i2) {
                DoodleGiftDialogFragment.this.f21595f = super.mo20744a(iVar, i, i2);
                DoodleGiftDialogFragment.this.mo20844a(DoodleGiftDialogFragment.this.f21595f);
                return DoodleGiftDialogFragment.this.f21595f;
            }
        };
        r0.mo22743a(1).mo22746b(4);
        r0.mo22748a(this.f21614z);
        this.f21614z.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i != 0) {
                    DoodleGiftDialogFragment.this.mo20844a(DoodleGiftDialogFragment.this.f21595f);
                    super.onScrollStateChanged(recyclerView, i);
                }
            }
        });
    }

    /* renamed from: i */
    private void m24438i() {
        this.f21609u.setDoodleCanvasBackground(0);
        this.f21609u.setDrawDoodleGiftView(this.f21608t);
        this.f21609u.setDoodleCanvasListener(new C7856a() {
            /* renamed from: a */
            public final void mo20592a(List<C8283t> list, int i, int i2, int i3) {
                if (list == null || list.isEmpty()) {
                    DoodleGiftDialogFragment.this.mo20849a((C8169b) null, false);
                    return;
                }
                DoodleGiftDialogFragment.this.mo20849a(new C8169b(list, i, i2, i3), false);
            }
        });
    }

    /* renamed from: n */
    private void m24443n() {
        m24418a(((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11155b());
    }

    public void onResume() {
        super.onResume();
        m24413B();
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
    }

    /* renamed from: B */
    private static void m24413B() {
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()));
        C8443c.m25663a().mo21606a("livesdk_doodling_gift_canvas_opend_show", hashMap, Room.class, new C8438j());
    }

    /* renamed from: j */
    private void m24439j() {
        m24425a(false, m24416a(0, 0));
        this.f21611w.setEnabled(false);
        this.f21612x.setEnabled(false);
        this.f21611w.setOnClickListener(new C7985c(this));
        this.f21612x.setOnClickListener(new C7986d(this));
    }

    /* renamed from: l */
    private void m24441l() {
        if (this.f21603o == null || this.f21602n == null || this.f21603o.getId() == this.f21602n.getOwnerUserId()) {
            this.f21581N = SendToType.ANCHOR;
        } else {
            this.f21581N = SendToType.GUEST;
        }
        if (this.f21605q instanceof CustomConstraintLayout) {
            ((CustomConstraintLayout) this.f21605q).setDispatchTouchEventCallback(new Runnable() {
                public final void run() {
                    DoodleGiftDialogFragment.this.mo20843a();
                }
            });
        }
    }

    /* renamed from: m */
    private void m24442m() {
        m24418a(((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11155b());
        ((C3245ad) ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11152a().mo19297a((C7494t<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10183a(new C7988f(this), C3303k.m12377b());
    }

    /* renamed from: C */
    private JSONObject m24414C() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.f21602n != null) {
            jSONObject.put("UID", ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b());
            jSONObject.put("room_id", this.f21602n.getId());
            jSONObject.put("source", this.f21602n.getUserFrom());
            jSONObject.put("request_id", this.f21602n.getRequestId());
            jSONObject.put("log_pb", this.f21602n.getLog_pb());
            if (!TextUtils.isEmpty(this.f21602n.getSourceType())) {
                jSONObject.put("moment_room_source", this.f21602n.getSourceType());
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void mo20857d() {
        if (!((Boolean) C8946b.f24354F.mo22117a()).booleanValue()) {
            mo20843a();
            this.f21576I = (C8791d) ((C8791d) ((C8791d) ((C8791d) C8791d.m26348b(getContext()).mo21845a(LayoutInflater.from(getContext()).inflate(R.layout.ay8, null))).mo21854c(C3358ac.m12510a(44.0f))).mo21855c(true)).mo21842a();
            this.f21576I.mo21849a(this.f21575H, 1, 3, C3358ac.m12510a(8.0f), -C3358ac.m12510a(6.0f));
            C8946b.f24354F.mo22118a(Boolean.valueOf(true));
        }
    }

    /* renamed from: o */
    private void m24444o() {
        boolean z;
        List u = m24450u();
        if (u == null || u.isEmpty() || !C7979a.m24480a()) {
            z = false;
        } else {
            z = true;
        }
        this.f21579L = z;
        if (this.f21579L) {
            this.f21593d.mo20883a(u);
            C9738o.m28712b((View) this.f21574G, 0);
            C9738o.m28712b(this.f21575H, 0);
            LayoutParams layoutParams = this.f21574G.getLayoutParams();
            layoutParams.width = (int) (((float) C9051ar.m27033a((Context) this.f21596g)) * 0.85f);
            layoutParams.height = layoutParams.width;
            this.f21574G.setLayoutParams(layoutParams);
            m24424a(true);
            if (this.f21605q != null) {
                this.f21605q.post(new C7989g(this));
            }
        }
    }

    /* renamed from: v */
    private List<C8139f> m24451v() {
        List<C8149d> arrayList = new ArrayList<>();
        if (GiftManager.inst().isGiftListLoaded()) {
            int currentStrategyByLiveType = GiftManager.inst().getCurrentStrategyByLiveType();
            if (currentStrategyByLiveType == 0) {
                arrayList = m24452w();
            } else if (currentStrategyByLiveType == 1) {
                arrayList = m24453x();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C8149d dVar : arrayList) {
            if (dVar != null && dVar.f22238i && dVar.f22245p) {
                arrayList2.add(new C8139f(dVar));
            }
        }
        return arrayList2;
    }

    /* renamed from: w */
    private List<C8149d> m24452w() {
        ArrayList arrayList = new ArrayList();
        List<C8149d> giftList = GiftManager.inst().getGiftList();
        if (giftList != null && !giftList.isEmpty()) {
            for (C8149d dVar : giftList) {
                if (dVar != null && dVar.f22238i) {
                    if (dVar.f22253x) {
                        if (m24434c(dVar)) {
                            arrayList.add(dVar);
                        }
                    } else if (dVar.mo21280c()) {
                        if (m24426a(dVar)) {
                            arrayList.add(dVar);
                        }
                    } else if (!dVar.mo21281d()) {
                        arrayList.add(dVar);
                    } else if (m24432b(dVar)) {
                        arrayList.add(dVar);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: x */
    private List<C8149d> m24453x() {
        ArrayList arrayList = new ArrayList();
        List<GiftPage> giftPageList = GiftManager.inst().getGiftPageList();
        if (giftPageList != null && !giftPageList.isEmpty()) {
            for (GiftPage giftPage : giftPageList) {
                if (!(giftPage == null || giftPage.gifts == null || giftPage.gifts.isEmpty())) {
                    if (giftPage.pageType == 1) {
                        arrayList.addAll(giftPage.gifts);
                    } else if (giftPage.pageType == 2) {
                        arrayList.addAll(m24427b(giftPage.gifts));
                    } else if (giftPage.pageType == 3) {
                        arrayList.addAll(m24433c(giftPage.gifts));
                    } else if (giftPage.pageType == 4) {
                        arrayList.addAll(m24435d(giftPage.gifts));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    private void m24454y() {
        if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            ((C3245ad) ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22167a(this.f21596g, C8987h.m26865a().mo22190a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10185a((C7498y<? super T>) this.f21589V);
        } else if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22178a(LiveInteractFunction.RECHARGE)) {
            if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.mo10240a()).intValue() == 1) {
                m24455z();
            } else {
                ((IWalletService) C3596c.m13172a(IWalletService.class)).openWallet(this.f21596g);
            }
        }
    }

    /* renamed from: z */
    private void m24455z() {
        if (this.f21596g instanceof FragmentActivity) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(IWalletService.KEY_BUNDLE_IS_ANCHOR, this.f21597h);
            bundle.putString(IWalletService.KEY_BUNDLE_CHARGE_REASON, "click");
            if (((IWalletService) C3596c.m13172a(IWalletService.class)).getRechargeType() != 3) {
                ((IWalletService) C3596c.m13172a(IWalletService.class)).showRechargeDialog((FragmentActivity) this.f21596g, bundle, this.f21601m, new C7990h(this));
                m24431b(true);
                return;
            }
            ((IWalletService) C3596c.m13172a(IWalletService.class)).showRechargeDialog((FragmentActivity) this.f21596g, bundle, this.f21601m, null);
        }
    }

    /* renamed from: A */
    private void m24412A() {
        if (this.f21578K != null && this.f21578K.f22365d > 0 && !this.f21580M && this.f21602n != null) {
            if (!((IHostContext) C3596c.m13172a(IHostContext.class)).isLocalTest() && this.f21585R < ((long) this.f21578K.f22365d)) {
                m24454y();
                C9049ap.m27022a((int) R.string.fc7);
            } else if (!C7994l.m24505a(this.f21596g)) {
                C3517a.m12960a((Context) this.f21596g, (int) R.string.efp);
            } else if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
                ((C3245ad) ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22167a(this.f21596g, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f68)).mo22188a(1001).mo22193d("live_detail").mo22194e("gift_send").mo22192c("enableGift").mo22190a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10185a((C7498y<? super T>) this.f21589V);
            } else if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22178a(LiveInteractFunction.GIFT)) {
                if (((IHostContext) C3596c.m13172a(IHostContext.class)).isNeedProtectUnderage()) {
                    C9049ap.m27022a((int) R.string.f0i);
                    return;
                }
                m24420a(this.f21578K);
                dismiss();
            }
        }
    }

    /* renamed from: r */
    private void m24447r() {
        if (this.f21592c != null && !this.f21588U.isRunning() && this.f21590a.getVisibility() != 0) {
            if (this.f21587T.isRunning()) {
                this.f21587T.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21592c, "translationX", new float[]{0.0f, -240.0f, -240.0f});
            ofFloat.setDuration(333);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f21592c, "alpha", new float[]{1.0f, 0.0f});
            ofFloat2.setDuration(167);
            ofFloat2.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    C9738o.m28712b((View) DoodleGiftDialogFragment.this.f21592c, 8);
                }
            });
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f21591b, "scaleX", new float[]{1.0f, 0.65f});
            ofFloat3.setStartDelay(167);
            ofFloat3.setDuration(166);
            this.f21591b.setPivotX(0.0f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f21591b, "alpha", new float[]{1.0f, 0.0f});
            ofFloat4.setStartDelay(167);
            ofFloat4.setDuration(166);
            ofFloat4.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    C9738o.m28712b((View) DoodleGiftDialogFragment.this.f21591b, 8);
                }
            });
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f21590a, "alpha", new float[]{0.0f, 1.0f});
            ofFloat5.setStartDelay(300);
            ofFloat5.setDuration(166);
            ofFloat5.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    C9738o.m28712b((View) DoodleGiftDialogFragment.this.f21590a, 0);
                }
            });
            this.f21588U.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5});
            this.f21588U.setInterpolator(new LinearInterpolator());
            this.f21588U.start();
        }
    }

    /* renamed from: s */
    private void m24448s() {
        if (this.f21592c != null && !this.f21587T.isRunning() && this.f21590a.getVisibility() != 8) {
            if (this.f21588U.isRunning()) {
                this.f21588U.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21590a, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.setDuration(167);
            ofFloat.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    C9738o.m28712b((View) DoodleGiftDialogFragment.this.f21590a, 8);
                }
            });
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f21591b, "scaleX", new float[]{0.65f, 1.0f});
            ofFloat2.setDuration(167);
            this.f21591b.setPivotX(0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f21591b, "alpha", new float[]{0.0f, 1.0f});
            ofFloat3.setStartDelay(67);
            ofFloat3.setDuration(66);
            ofFloat3.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    C9738o.m28712b((View) DoodleGiftDialogFragment.this.f21591b, 0);
                }
            });
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f21592c, "translationX", new float[]{-240.0f, 0.0f, 0.0f});
            ofFloat4.setStartDelay(167);
            ofFloat4.setDuration(333);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f21592c, "alpha", new float[]{0.0f, 1.0f});
            ofFloat5.setStartDelay(167);
            ofFloat5.setDuration(166);
            ofFloat5.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    C9738o.m28712b((View) DoodleGiftDialogFragment.this.f21592c, 0);
                }
            });
            this.f21587T.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5});
            this.f21587T.setInterpolator(new LinearInterpolator());
            this.f21587T.start();
        }
    }

    /* renamed from: e */
    private void m24436e() {
        this.f21605q = getView();
        if (this.f21605q != null) {
            this.f21606r = this.f21605q.findViewById(R.id.a_g);
            this.f21607s = this.f21605q.findViewById(R.id.a_h);
            this.f21608t = (DoodleGiftView) this.f21605q.findViewById(R.id.abg);
            this.f21609u = (DoodleCanvasView) this.f21605q.findViewById(R.id.a_b);
            this.f21610v = (TextView) this.f21605q.findViewById(R.id.djm);
            this.f21613y = (ImageView) this.f21605q.findViewById(R.id.xh);
            this.f21613y.setOnClickListener(this);
            this.f21611w = (ImageView) this.f21605q.findViewById(R.id.a_i);
            this.f21612x = (ImageView) this.f21605q.findViewById(R.id.a_c);
            this.f21568A = this.f21605q.findViewById(R.id.a8m);
            this.f21569B = (TextView) this.f21605q.findViewById(R.id.a8r);
            this.f21570C = (TextView) this.f21605q.findViewById(R.id.coy);
            this.f21571D = (ImageView) this.f21605q.findViewById(R.id.cot);
            this.f21568A.setOnClickListener(new C7982b(this));
            this.f21572E = (RtlViewPagerShower) this.f21605q.findViewById(R.id.c_2);
            this.f21573F = (Button) this.f21605q.findViewById(R.id.as9);
            this.f21573F.setOnClickListener(this);
            this.f21614z = (RecyclerView) this.f21605q.findViewById(R.id.ar9);
            this.f21577J = new DoodleGiftAdapter(this.f21596g);
            this.f21577J.f21643a = this;
            this.f21614z.setAdapter(this.f21577J);
            this.f21614z.setLayoutManager(new LinearLayoutManager(this.f21596g, 0, false));
            this.f21605q.findViewById(R.id.a_0).setVisibility(8);
            this.f21605q.findViewById(R.id.a8n).setVisibility(8);
            this.f21574G = (HSImageView) this.f21605q.findViewById(R.id.dh0);
            this.f21590a = (ImageView) this.f21605q.findViewById(R.id.dgz);
            this.f21590a.setOnClickListener(this);
            this.f21591b = (HSImageView) this.f21605q.findViewById(R.id.c4p);
            this.f21591b.setOnClickListener(this);
            this.f21575H = this.f21605q.findViewById(R.id.dh2);
            this.f21592c = (RecyclerView) this.f21605q.findViewById(R.id.dh3);
            this.f21593d = new DoodleTemplateAdapter(this.f21596g);
            this.f21593d.f21648a = this;
            this.f21592c.setAdapter(this.f21593d);
            this.f21592c.setLayoutManager(new LinearLayoutManager(this.f21596g, 0, false));
            this.f21592c.mo5525a((C1272h) new C1272h() {
                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
                    rect.left = C3358ac.m12510a(8.0f);
                    if (RecyclerView.m5892f(view) == DoodleGiftDialogFragment.this.f21593d.getItemCount() - 1) {
                        rect.right = C3358ac.m12510a(8.0f);
                    }
                }
            });
            if (this.f21601m != null) {
                this.f21604p = (User) this.f21601m.get("data_user_in_room", null);
            }
            m24437f();
            m24423a(m24451v());
            m24444o();
            m24438i();
            m24439j();
            m24441l();
            m24429b(this.f21600l);
        }
    }

    /* renamed from: b */
    public final void mo20853b() {
        if (((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c() && this.f21602n != null && this.f21602n.getOwner() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("target_uid", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()));
            hashMap.put("sec_target_uid", ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a().getSecUid());
            hashMap.put("packed_level", "2");
            hashMap.put("request_from", "admin");
            hashMap.put("current_room_id", String.valueOf(this.f21602n.getId()));
            hashMap.put("anchor_id", String.valueOf(this.f21602n.getOwner().getId()));
            hashMap.put("sec_anchor_id", this.f21602n.getOwner().getSecUid());
            ((C3247af) ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22166a(hashMap).mo19131a((C47555ab<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10187a(new C7987e(this), C3303k.m12377b());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20845a(DialogInterface dialogInterface) {
        m24431b(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo20856c(View view) {
        m24454y();
    }

    /* renamed from: a */
    private boolean m24426a(C8149d dVar) {
        return GiftManager.inst().canSendHonorGift(this.f21604p, dVar);
    }

    /* renamed from: b */
    private boolean m24432b(C8149d dVar) {
        return GiftManager.inst().canSendNobleGift(this.f21604p, dVar);
    }

    /* renamed from: a */
    private void m24419a(DoodleTemplate doodleTemplate) {
        C9738o.m28712b((View) this.f21574G, 0);
        C5343e.m17038a(this.f21574G, doodleTemplate.image);
        this.f21574G.setAlpha(0.2f);
        C9738o.m28712b(this.f21607s, 8);
    }

    /* renamed from: b */
    private List<C8149d> m24427b(List<C8149d> list) {
        ArrayList arrayList = new ArrayList();
        for (C8149d dVar : list) {
            if (m24434c(dVar)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private List<C8149d> m24433c(List<C8149d> list) {
        ArrayList arrayList = new ArrayList();
        for (C8149d dVar : list) {
            if (m24426a(dVar)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private List<C8149d> m24435d(List<C8149d> list) {
        ArrayList arrayList = new ArrayList();
        for (C8149d dVar : list) {
            if (m24432b(dVar)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f21599k) {
            i = R.style.yt;
        } else {
            i = R.style.yr;
        }
        setStyle(1, i);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C9097a.m27146a().mo22267a((Object) new C4423ao(false));
        super.onDismiss(dialogInterface);
        mo20843a();
    }

    /* renamed from: b */
    private void m24429b(long j) {
        if (j != 0) {
            int b = this.f21577J.mo20880b(j);
            if (b != -1) {
                this.f21577J.mo20878a(this.f21577J.mo20876a(j));
                mo20844a(b);
                this.f21614z.mo5541b((b / 4) * 4);
            }
        }
    }

    /* renamed from: c */
    private boolean m24434c(C8149d dVar) {
        if (this.f21602n == null || this.f21602n.getOwner() == null) {
            return false;
        }
        return GiftManager.inst().canSendFansClubGift(this.f21602n.getOwner(), this.f21604p, dVar);
    }

    /* renamed from: b */
    private void m24428b(int i) {
        this.f21583P = ((i - 1) / 4) + 1;
        if (this.f21583P == 1) {
            C9738o.m28712b((View) this.f21572E, 8);
            return;
        }
        Drawable drawable = this.f21596g.getResources().getDrawable(R.drawable.bp4);
        Drawable drawable2 = this.f21596g.getResources().getDrawable(R.drawable.bp5);
        int a = C3358ac.m12510a(60.0f) / this.f21583P;
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setSize(a, C3358ac.m12510a(1.0f));
            ((GradientDrawable) drawable2).setSize(a, C3358ac.m12510a(1.0f));
        }
        this.f21572E.setMargin(0);
        this.f21572E.mo13412a(drawable, drawable2);
        this.f21572E.mo13411a(this.f21583P, this.f21584Q);
    }

    public void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            if (!this.f21598i || (!this.f21597h && !C3387g.m12599a(getContext()))) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            } else {
                window.clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            if (this.f21598i) {
                window.setGravity(80);
            } else {
                window.setGravity(8388613);
            }
            window.setSoftInputMode(48);
            if (this.f21599k) {
                window.setLayout(-1, -2);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = C3358ac.m12523c();
                attributes.height = C3358ac.m12520b() - C3358ac.m12525d();
                window.setAttributes(attributes);
                return;
            }
            window.setLayout(-1, -1);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.xh) {
            dismiss();
        } else if (view.getId() == R.id.as9) {
            if (this.f21578K == null || this.f21578K.f22362a.size() < ((Integer) C5864b.f17250E.mo10240a()).intValue()) {
                C9049ap.m27028a(C3390j.m12609a(C3358ac.m12515a((int) R.string.em2), C5864b.f17250E.mo10240a()));
                return;
            }
            m24412A();
        } else if (view.getId() == R.id.c4p) {
            m24424a(true);
        } else {
            if (view.getId() == R.id.dgz) {
                m24445p();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo20847a(User user) {
        if (this.f21577J != null && user != null) {
            this.f21604p = user;
            m24423a(m24451v());
            m24429b(this.f21600l);
        }
    }

    /* renamed from: a */
    private void m24418a(long j) {
        this.f21585R = j;
        if (this.f21569B != null) {
            boolean c = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c();
            TextView textView = this.f21569B;
            if (!c) {
                j = 0;
            }
            textView.setText(String.valueOf(j));
        }
    }

    /* renamed from: b */
    private void m24431b(final boolean z) {
        final View view = getView();
        if (view != null) {
            if (z) {
                this.f21594e = view.getHeight();
            }
            view.post(new Runnable() {
                public final void run() {
                    float f;
                    float f2;
                    if (z) {
                        f = 0.0f;
                    } else {
                        f = (float) DoodleGiftDialogFragment.this.f21594e;
                    }
                    if (z) {
                        f2 = (float) DoodleGiftDialogFragment.this.f21594e;
                    } else {
                        f2 = 0.0f;
                    }
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f, f2);
                    translateAnimation.setDuration(300);
                    translateAnimation.setFillAfter(true);
                    view.startAnimation(translateAnimation);
                }
            });
        }
    }

    /* renamed from: a */
    private void m24420a(C8169b bVar) {
        long j;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < bVar.f22362a.size(); i++) {
            C8283t tVar = (C8283t) bVar.f22362a.get(i);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("id", tVar.f22755c);
                jSONObject2.put("x", tVar.f22753a);
                jSONObject2.put("y", tVar.f22754b);
                jSONArray.put(jSONObject2);
            } catch (Exception unused) {
            }
        }
        try {
            jSONObject.put("points", jSONArray);
            jSONObject.put("origin_width", bVar.f22363b);
            jSONObject.put("origin_height", bVar.f22364c);
        } catch (Exception unused2) {
        }
        this.f21580M = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f21581N != SendToType.GUEST || this.f21603o == null) {
            j = this.f21602n.getOwnerUserId();
        } else {
            j = this.f21603o.getId();
        }
        ((DoodleGiftApi) C3458e.m12798a().mo10440a(DoodleGiftApi.class)).sendDoodleGift(998, this.f21602n.getId(), jSONObject.toString(), j).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19281a((C7326g<? super T>) new C7991i<Object>(this, bVar, uptimeMillis), (C7326g<? super Throwable>) new C7992j<Object>(this), (C7323a) new C7993k(this));
    }

    /* renamed from: a */
    private void m24421a(Exception exc) {
        if (!(exc instanceof SendGiftFailException)) {
            boolean z = exc instanceof ApiServerException;
            if (!z || ((ApiServerException) exc).getErrorCode() != 40001) {
                if (z) {
                    C9049ap.m27028a(((ApiServerException) exc).getPrompt());
                    return;
                } else {
                    C9049ap.m27022a((int) R.string.fcb);
                    return;
                }
            }
        }
        C9049ap.m27022a((int) R.string.fc7);
        m24454y();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo20854b(View view) {
        if (this.f21609u.mo20582c()) {
            this.f21609u.mo20581b();
            if (C6311g.m19573a(this.f21609u.getMoveActions())) {
                mo20849a((C8169b) null, true);
                return;
            }
            mo20849a(new C8169b(this.f21609u.getMoveActions(), this.f21609u.getWidth(), this.f21609u.getHeight(), this.f21609u.getTotalCostDiamondCount()), false);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f21602n == null) {
            dismiss();
            return;
        }
        m24436e();
        m24442m();
    }

    /* renamed from: a */
    private static CharSequence m24416a(int i, int i2) {
        if (i < ((Integer) C5864b.f17250E.mo10240a()).intValue()) {
            return C3390j.m12609a(C3358ac.m12515a((int) R.string.em2), C5864b.f17250E.mo10240a());
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.valueOf(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C3358ac.m12521b((int) R.color.aic)), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.insert(0, C3358ac.m12515a((int) R.string.eih));
        spannableStringBuilder.append(C3358ac.m12515a((int) R.string.ei1));
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private void m24417a(int i, C8169b bVar) {
        long j = 0;
        long longValue = ((Long) this.f21601m.get("data_gift_group_id", Long.valueOf(0))).longValue();
        if (!(this.f21593d == null || this.f21593d.f21649b == null)) {
            j = this.f21593d.f21649b.getId();
        }
        m24422a(this.f21582O, i, longValue, bVar, j);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.anh, viewGroup, false);
    }

    /* renamed from: a */
    public static DoodleGiftDialogFragment m24415a(Activity activity, User user, boolean z, boolean z2, DataCenter dataCenter, Room room, long j, String str) {
        boolean z3;
        DoodleGiftDialogFragment doodleGiftDialogFragment = new DoodleGiftDialogFragment();
        doodleGiftDialogFragment.f21596g = activity;
        doodleGiftDialogFragment.f21603o = user;
        doodleGiftDialogFragment.f21597h = z;
        doodleGiftDialogFragment.f21598i = z2;
        doodleGiftDialogFragment.f21601m = dataCenter;
        doodleGiftDialogFragment.f21602n = room;
        doodleGiftDialogFragment.f21600l = j;
        doodleGiftDialogFragment.f21582O = str;
        if (!z2 || (!z && !C3387g.m12599a(activity))) {
            z3 = false;
        } else {
            z3 = true;
        }
        doodleGiftDialogFragment.f21599k = z3;
        return doodleGiftDialogFragment;
    }
}
