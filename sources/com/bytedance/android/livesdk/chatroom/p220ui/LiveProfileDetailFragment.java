package com.bytedance.android.livesdk.chatroom.p220ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.C2341d;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.C2371c;
import com.bytedance.android.live.base.model.user.C2372d;
import com.bytedance.android.live.base.model.user.C2380l;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.setting.C3332f;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.event.C4431aw;
import com.bytedance.android.livesdk.chatroom.event.C4439i;
import com.bytedance.android.livesdk.chatroom.event.C4445o;
import com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileNotificationSetting.C5133a;
import com.bytedance.android.livesdk.chatroom.presenter.C4953ao;
import com.bytedance.android.livesdk.chatroom.presenter.C4953ao.C4954a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8445e.C8446a;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.rank.C8804a;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.utils.C9032ab;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9074l;
import com.bytedance.android.livesdk.utils.C9094x;
import com.bytedance.android.livesdk.widget.C9252i;
import com.bytedance.android.livesdk.widget.C9252i.C9253a;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p439b.C9298a;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7498y;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileDetailFragment */
public class LiveProfileDetailFragment extends BaseFragment implements OnClickListener, C4954a, C5133a {

    /* renamed from: A */
    private ImageView f14837A;

    /* renamed from: B */
    private View f14838B;

    /* renamed from: C */
    private ImageView f14839C;

    /* renamed from: D */
    private View f14840D;

    /* renamed from: E */
    private TextView f14841E;

    /* renamed from: F */
    private TextView f14842F;

    /* renamed from: G */
    private View f14843G;

    /* renamed from: H */
    private View f14844H;

    /* renamed from: I */
    private View f14845I;

    /* renamed from: J */
    private View f14846J;

    /* renamed from: K */
    private Activity f14847K;

    /* renamed from: L */
    private DataCenter f14848L;

    /* renamed from: M */
    private HSImageView f14849M;

    /* renamed from: N */
    private TextView f14850N;

    /* renamed from: O */
    private HSImageView f14851O;

    /* renamed from: P */
    private TextView f14852P;

    /* renamed from: Q */
    private HSImageView f14853Q;

    /* renamed from: R */
    private View f14854R;

    /* renamed from: S */
    private TextView f14855S;

    /* renamed from: T */
    private HSImageView f14856T;

    /* renamed from: U */
    private View f14857U;

    /* renamed from: V */
    private TextView f14858V;

    /* renamed from: W */
    private View f14859W;

    /* renamed from: X */
    private HSImageView f14860X;

    /* renamed from: Y */
    private TextView f14861Y;

    /* renamed from: Z */
    private TextView f14862Z;

    /* renamed from: a */
    public View f14863a;

    /* renamed from: aA */
    private C4953ao f14864aA;

    /* renamed from: aB */
    private int f14865aB;

    /* renamed from: aC */
    private boolean f14866aC;

    /* renamed from: aD */
    private boolean f14867aD;

    /* renamed from: aE */
    private FansClubData f14868aE;

    /* renamed from: aF */
    private boolean f14869aF;

    /* renamed from: aG */
    private boolean f14870aG = true;

    /* renamed from: aH */
    private boolean f14871aH = true;

    /* renamed from: aI */
    private boolean f14872aI = true;

    /* renamed from: aa */
    private View f14873aa;

    /* renamed from: ab */
    private TextView f14874ab;

    /* renamed from: ac */
    private RecyclerView f14875ac;

    /* renamed from: ad */
    private UserFeatureLabelListAdapter f14876ad;

    /* renamed from: ae */
    private LinearLayout f14877ae;

    /* renamed from: af */
    private TextView f14878af;

    /* renamed from: ag */
    private LinearLayout f14879ag;

    /* renamed from: ah */
    private View f14880ah;

    /* renamed from: ai */
    private LinearLayout f14881ai;

    /* renamed from: aj */
    private ImageView f14882aj;

    /* renamed from: ak */
    private ImageView f14883ak;

    /* renamed from: al */
    private View f14884al;

    /* renamed from: am */
    private ImageView f14885am;

    /* renamed from: an */
    private View f14886an;

    /* renamed from: ao */
    private Animator[] f14887ao = {null, null};

    /* renamed from: ap */
    private Animator[] f14888ap = {null, null};

    /* renamed from: aq */
    private Animator f14889aq;

    /* renamed from: ar */
    private Animator f14890ar;

    /* renamed from: as */
    private User f14891as;

    /* renamed from: at */
    private boolean f14892at;

    /* renamed from: au */
    private int f14893au;

    /* renamed from: av */
    private boolean f14894av;

    /* renamed from: aw */
    private long f14895aw;

    /* renamed from: ax */
    private Room f14896ax;

    /* renamed from: ay */
    private C9032ab f14897ay;

    /* renamed from: az */
    private boolean f14898az;

    /* renamed from: b */
    public View f14899b;

    /* renamed from: c */
    public View f14900c;

    /* renamed from: d */
    public View f14901d;

    /* renamed from: e */
    public View f14902e;

    /* renamed from: f */
    public String f14903f;

    /* renamed from: g */
    public String f14904g;

    /* renamed from: h */
    public List<C2341d> f14905h;

    /* renamed from: i */
    private TextView f14906i;

    /* renamed from: j */
    private TextView f14907j;

    /* renamed from: k */
    private TextView f14908k;

    /* renamed from: l */
    private TextView f14909l;

    /* renamed from: m */
    private TextView f14910m;

    /* renamed from: q */
    private TextView f14911q;

    /* renamed from: r */
    private TextView f14912r;

    /* renamed from: s */
    private TextView f14913s;

    /* renamed from: t */
    private TextView f14914t;

    /* renamed from: u */
    private TextView f14915u;

    /* renamed from: v */
    private TextView f14916v;

    /* renamed from: w */
    private View f14917w;

    /* renamed from: x */
    private View f14918x;

    /* renamed from: y */
    private ImageView f14919y;

    /* renamed from: z */
    private View f14920z;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo13308a(View view) {
        ((ClipboardManager) this.f14847K.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("special_id", this.f14891as.getSpecialId()));
        C9049ap.m27022a((int) R.string.edy);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13307a(String str, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f14891as.getFollowInfo() != null) {
            this.f14864aA.mo12934a(this.f14847K, (int) this.f14891as.getFollowInfo().getFollowStatus(), this.f14895aw, str, this.f14896ax.getId());
            this.f14897ay.mo22233a(false, this.f14895aw, this.f14903f, this.f14894av, this.f14893au, this.f14904g, LinkCrossRoomDataHolder.m13782a().f11667e == this.f14891as.getId());
        }
    }

    /* renamed from: a */
    public final void mo12951a(FollowPair followPair) {
        if (this.f14866aC && this.f14891as != null && this.f14891as.getFollowInfo() != null && ((int) this.f14891as.getFollowInfo().getFollowStatus()) != followPair.mo22844a()) {
            this.f14891as.setFollowStatus(followPair.mo22844a());
            m16572c(this.f14891as);
        }
    }

    /* renamed from: a */
    public final void mo12952a(Throwable th) {
        if (this.f14866aC) {
            if (th instanceof ApiServerException) {
                C9049ap.m27028a(((ApiServerException) th).getPrompt());
            } else {
                C9049ap.m27022a((int) R.string.ezj);
            }
        }
    }

    /* renamed from: g */
    private void m16573g() {
        this.f14870aG = false;
        this.f14871aH = false;
        this.f14872aI = false;
        this.f14869aF = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13309b() {
        LayoutParams layoutParams = this.f14857U.getLayoutParams();
        layoutParams.width = 0;
        this.f14857U.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo13312c() {
        LayoutParams layoutParams = this.f14854R.getLayoutParams();
        layoutParams.width = 0;
        this.f14854R.setLayoutParams(layoutParams);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f14866aC = false;
        m16566a(this.f14887ao[0]);
        m16566a(this.f14887ao[1]);
        m16566a(this.f14888ap[0]);
        m16566a(this.f14888ap[1]);
        m16566a(this.f14889aq);
        m16566a(this.f14890ar);
    }

    /* renamed from: h */
    private void m16574h() {
        this.f14881ai = (LinearLayout) this.f14846J.findViewById(R.id.a8m);
        this.f14879ag = (LinearLayout) this.f14846J.findViewById(R.id.dj2);
        this.f14877ae = (LinearLayout) this.f14846J.findViewById(R.id.bm1);
        this.f14878af = (TextView) this.f14846J.findViewById(R.id.bm0);
        C9738o.m28712b((View) this.f14877ae, 0);
        C9738o.m28712b((View) this.f14879ag, 8);
        C9738o.m28712b((View) this.f14881ai, 8);
        C9738o.m28712b(this.f14844H, 8);
        C9738o.m28712b(this.f14873aa, 8);
    }

    /* renamed from: j */
    private void m16576j() {
        if (this.f14892at || this.f14868aE == null) {
            if (this.f14892at && this.f14848L != null) {
                this.f14864aA.mo12947d();
                C4439i iVar = new C4439i();
                iVar.f12887a = this.f14868aE;
                iVar.f12888b = this.f14905h;
                this.f14848L.lambda$put$1$DataCenter("cmd_show_fans_club_setting", iVar);
            }
            return;
        }
        long b = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        if ((this.f14896ax == null || this.f14896ax.getOwner() == null || this.f14896ax.getOwner().getId() != b) && this.f14868aE.anchorId > 0) {
            C9178j.m27302j().mo22380i().showUserProfile(this.f14868aE.anchorId);
        }
    }

    /* renamed from: m */
    private void m16578m() {
        if (!TTLiveSDKContext.getHostService().mo22367h().mo22178a(LiveInteractFunction.AT)) {
            this.f14897ay.mo22230a();
            this.f14864aA.mo12947d();
            if (this.f14896ax == null || this.f14896ax.getOrientation() != 2 || this.f14848L.get("data_is_portrait") == null || ((Boolean) this.f14848L.get("data_is_portrait")).booleanValue()) {
                String str = this.f14891as.displayId;
                C9097a.m27146a().mo22267a((Object) new C4431aw(1, str));
                this.f14848L.lambda$put$1$DataCenter("cmd_wanna_send_message", new C4431aw(1, str));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void mo13315f() {
        int width = this.f14901d.getWidth();
        C2380l userHonor = this.f14891as.getUserHonor();
        float h = ((float) ((userHonor.mo8704h() - userHonor.mo8715s()) + 1)) / ((float) ((userHonor.mo8714r() - userHonor.mo8715s()) + 1));
        if (h >= 1.0f) {
            h = 0.99f;
        }
        m16566a(this.f14889aq);
        this.f14889aq = ValueAnimator.ofInt(new int[]{0, (int) (((float) width) * h)});
        ((ValueAnimator) this.f14889aq).addUpdateListener(new C5231by(this));
        this.f14889aq.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                LiveProfileDetailFragment.this.f14899b.setClickable(true);
                LiveProfileDetailFragment.this.f14901d.setClickable(true);
            }

            public final void onAnimationStart(Animator animator, boolean z) {
                LiveProfileDetailFragment.this.f14899b.setClickable(false);
                LiveProfileDetailFragment.this.f14901d.setClickable(false);
            }
        });
        this.f14889aq.setInterpolator(new LinearInterpolator());
        this.f14889aq.setDuration(1000);
        this.f14889aq.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void mo13314e() {
        int width = this.f14902e.getWidth();
        C2371c anchorLevel = this.f14891as.getAnchorLevel();
        float b = ((float) ((anchorLevel.mo8686b() - anchorLevel.mo8687c()) + 1)) / ((float) ((anchorLevel.mo8688d() - anchorLevel.mo8687c()) + 1));
        if (b >= 1.0f) {
            b = 0.99f;
        }
        m16566a(this.f14890ar);
        this.f14890ar = ValueAnimator.ofInt(new int[]{0, (int) (((float) width) * b)});
        ((ValueAnimator) this.f14890ar).addUpdateListener(new C5232bz(this));
        this.f14890ar.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                LiveProfileDetailFragment.this.f14900c.setClickable(true);
                LiveProfileDetailFragment.this.f14902e.setClickable(true);
            }

            public final void onAnimationStart(Animator animator, boolean z) {
                LiveProfileDetailFragment.this.f14900c.setClickable(false);
                LiveProfileDetailFragment.this.f14902e.setClickable(false);
            }
        });
        this.f14890ar.setInterpolator(new LinearInterpolator());
        this.f14890ar.setDuration(1000);
        this.f14890ar.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo13313d() {
        ObjectAnimator objectAnimator;
        if (mo8989l() && !this.f14867aD) {
            this.f14867aD = true;
            this.f14863a.setVisibility(0);
            float x = this.f14909l.getX() + ((float) this.f14909l.getWidth());
            if (C3519c.m12965a(getContext())) {
                objectAnimator = ObjectAnimator.ofFloat(this.f14863a, "translationX", new float[]{x, this.f14909l.getX()});
            } else {
                objectAnimator = ObjectAnimator.ofFloat(this.f14863a, "translationX", new float[]{this.f14909l.getX(), x});
            }
            objectAnimator.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    LiveProfileDetailFragment.this.f14863a.setVisibility(8);
                }
            });
            objectAnimator.setDuration(1000);
            objectAnimator.start();
        }
    }

    /* renamed from: i */
    private void m16575i() {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live_view");
        hashMap.put("event_type", "core");
        hashMap.put("event_page", "live_detail");
        hashMap.put("action_type", "click");
        hashMap.put("event_module", "right_anchor");
        hashMap.put("enter_from_merge", "live_detail");
        hashMap.put("enter_method", "right_anchor");
        hashMap.put("anchor_id", String.valueOf(this.f14891as.getId()));
        hashMap.put("room_id", String.valueOf(this.f14891as.getLiveRoomId()));
        hashMap.put("right_user_id", String.valueOf(this.f14891as.getId()));
        String str3 = "live_type";
        if (this.f14896ax.isLiveTypeAudio()) {
            str = "voice_live";
        } else {
            str = "video_live";
        }
        hashMap.put(str3, str);
        if (LinkCrossRoomDataHolder.m13782a().f11665c > 0) {
            hashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.m13782a().f11665c));
            hashMap.put("pk_id", String.valueOf(LinkCrossRoomDataHolder.m13782a().f11666d));
            String str4 = "connection_type";
            if (LinkCrossRoomDataHolder.m13782a().f11672j == 0) {
                str2 = "anchor";
            } else {
                str2 = "pk";
            }
            hashMap.put(str4, str2);
        }
        C8443c.m25663a().mo21606a("live_show", hashMap, Room.class, new C8438j());
    }

    /* renamed from: k */
    private void m16577k() {
        String str;
        boolean z;
        if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "live_detail");
            bundle.putString("action_type", "follow");
            bundle.putString("source", "live");
            bundle.putString("v1_source", "follow");
            TTLiveSDKContext.getHostService().mo22367h().mo22167a(this.f14847K, C8987h.m26865a().mo22189a(C3332f.m12427a()).mo22191b(C3332f.m12428b()).mo22193d("live_detail").mo22194e("follow").mo22192c("live").mo22188a(-1).mo22190a()).mo19189a((C7498y<? super T>) new C8986g<Object>());
        } else if (!C5242ci.m16886a(getContext())) {
            C9049ap.m27022a((int) R.string.efp);
        } else {
            if (this.f14894av) {
                str = "live_anchor_c_audience";
            } else if (this.f14893au == 0) {
                str = "live_audience_c_anchor";
            } else if (this.f14893au == 2) {
                str = "right_anchor";
            } else {
                str = "live_audience_c_audience";
            }
            String str2 = str;
            if (!this.f14891as.isFollowing()) {
                this.f14864aA.mo12939a(this.f14896ax.getRequestId(), this.f14895aw, str2, this.f14896ax.getId(), this.f14896ax.getLabels());
                if (C9074l.m27086b(this.f14848L) && this.f14896ax.getOwner() != null && this.f14895aw == this.f14896ax.getOwner().getId()) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("anchor_id", String.valueOf(this.f14896ax.getOwner().getId()));
                        jSONObject.put("room_id", String.valueOf(this.f14896ax.getId()));
                    } catch (JSONException unused) {
                    }
                    C3596c.m13172a(C9295a.class);
                    C8446a.m25675a().mo21611a(jSONObject).mo21610a(C9074l.m27087c(this.f14848L));
                }
                if (C9074l.m27089d(this.f14848L) && this.f14896ax.getOwner() != null && this.f14895aw == this.f14896ax.getOwner().getId()) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("anchor_id", String.valueOf(this.f14896ax.getOwner().getId()));
                        jSONObject2.put("room_id", String.valueOf(this.f14896ax.getId()));
                    } catch (JSONException unused2) {
                    }
                    C3596c.m13172a(C9295a.class);
                    C8446a.m25675a().mo21611a(jSONObject2).mo21610a(C9074l.m27090e(this.f14848L));
                }
                C9032ab abVar = this.f14897ay;
                long j = this.f14895aw;
                String str3 = this.f14903f;
                boolean z2 = this.f14894av;
                int i = this.f14893au;
                String str4 = this.f14904g;
                if (LinkCrossRoomDataHolder.m13782a().f11667e == this.f14891as.getId()) {
                    z = true;
                } else {
                    z = false;
                }
                abVar.mo22233a(true, j, str3, z2, i, str4, z);
                return;
            }
            C9252i.m27529a();
            C9253a a = C9252i.m27528a(getContext());
            a.mo22726c((int) R.string.f0b);
            a.mo22722b(0, (int) R.string.f96, (DialogInterface.OnClickListener) new C5240cg(this, str2)).mo22722b(1, (int) R.string.ecm, C5241ch.f15341a).mo22729d();
        }
    }

    /* renamed from: a */
    public final void mo13303a() {
        if (getActivity() != null && getActivity().getSupportFragmentManager() != null) {
            C0633q a = getActivity().getSupportFragmentManager().mo2645a();
            Fragment fragment = this.mParentFragment;
            if (fragment != null) {
                a.mo2605c(fragment);
            }
            a.mo2605c(this);
            a.mo2604c();
        }
    }

    /* renamed from: a */
    private static void m16566a(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            if (animator.isRunning()) {
                animator.cancel();
            }
        }
    }

    /* renamed from: c */
    private void m16571c(View view) {
        view.setCameraDistance(getResources().getDisplayMetrics().density * 16000.0f);
    }

    /* renamed from: a */
    public final void mo13304a(int i) {
        m16569b(i);
        this.f14891as.getFollowInfo().setPushStatus((long) i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13310b(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LayoutParams layoutParams = this.f14854R.getLayoutParams();
        layoutParams.width = intValue;
        this.f14854R.setLayoutParams(layoutParams);
    }

    public void onEvent(C9298a aVar) {
        FollowPair followPair = aVar.f25478a;
        if (followPair != null && followPair.f25593a == this.f14895aw) {
            mo12951a(followPair);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ boolean mo13311b(View view) {
        ((ClipboardManager) this.f14847K.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("hotsoon_id", String.valueOf(this.f14891as.displayId)));
        C9049ap.m27022a((int) R.string.edx);
        return true;
    }

    /* renamed from: b */
    private void m16569b(int i) {
        switch (i) {
            case 0:
            case 2:
                this.f14883ak.setImageDrawable(getResources().getDrawable(R.drawable.bzm));
                return;
            case 1:
                this.f14883ak.setImageDrawable(getResources().getDrawable(R.drawable.bze));
                return;
            case 3:
                this.f14883ak.setImageDrawable(getResources().getDrawable(R.drawable.bzl));
                break;
        }
    }

    /* renamed from: b */
    private void m16570b(User user) {
        if (((Integer) C3913e.m13800a().f11699b).intValue() == 2) {
            C9049ap.m27022a((int) R.string.euo);
            return;
        }
        if (this.f14893au == 0) {
            this.f14897ay.mo22232a("live_audience_c_anchor", user.getId());
        } else if (this.f14893au == 2) {
            this.f14897ay.mo22232a("right_anchor", user.getId());
        } else {
            this.f14897ay.mo22232a("live_audience_c_audience", user.getId());
        }
        C9032ab.m26984a(user.getIdStr());
        HashMap hashMap = new HashMap(1);
        hashMap.put("log_enter_live_source", this.f14848L.get("log_enter_live_source"));
        hashMap.put("sec_user_id", user.getSecUid());
        C9178j.m27302j().mo22380i().showUserProfile(user.getId(), null, hashMap);
    }

    /* renamed from: c */
    private void m16572c(User user) {
        if (user != null) {
            if (!user.isFollowing()) {
                C9738o.m28712b((View) this.f14841E, 0);
                C9738o.m28712b((View) this.f14842F, 8);
                this.f14891as.getFollowInfo().setPushStatus(2);
                m16569b(2);
                this.f14884al.setVisibility(8);
                return;
            }
            C9738o.m28712b((View) this.f14841E, 8);
            C9738o.m28712b((View) this.f14842F, 0);
            String string = getResources().getString(R.string.ezo);
            if (user.getFollowInfo() != null && user.getFollowInfo().getFollowStatus() == 2) {
                string = getResources().getString(R.string.eiu);
            }
            if (this.f14842F != null) {
                this.f14842F.setText(string);
            }
            boolean booleanValue = ((Boolean) LiveSettingKeys.LIVE_MT_NOTIFICATION_AB.mo10240a()).booleanValue();
            if (this.f14892at || this.f14893au != 0 || !user.isFollowing() || !booleanValue) {
                this.f14884al.setVisibility(8);
            } else {
                this.f14884al.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13305a(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LayoutParams layoutParams = this.f14857U.getLayoutParams();
        layoutParams.width = intValue;
        this.f14857U.setLayoutParams(layoutParams);
    }

    public void onClick(View view) {
        int i;
        int id = view.getId();
        if (id == R.id.dlk || id == R.id.dlm || id == R.id.dlo) {
            if (!this.f14894av && (view.getTag(R.id.ic) instanceof User)) {
                m16570b((User) view.getTag(R.id.ic));
            }
        } else if (id == R.id.avt) {
            if (!this.f14894av && this.f14891as != null) {
                m16570b(this.f14891as);
            }
        } else if (id == R.id.anj || id == R.id.ao2) {
            m16577k();
        } else if (id == R.id.h8) {
            m16578m();
        } else if (id == R.id.ask) {
            Bundle bundle = new Bundle();
            bundle.putString("enter_from_merge", "live_detail");
            bundle.putString("enter_method", "right_anchor");
            bundle.putString("enter_from", "live_detail");
            bundle.putString("source", "right_anchor");
            bundle.putString("enter_method", "right_anchor");
            bundle.putLong("from_room_id", this.f14896ax.getId());
            bundle.putString("superior_page_from", this.f14904g);
            bundle.putLong("anchor_id", this.f14891as.getId());
            bundle.putInt("back_source", 2);
            C8804a.m26400c(this.f14848L, bundle);
            C9097a.m27146a().mo22267a((Object) new C4445o(this.f14891as.getLiveRoomId(), "live_detail", bundle));
        } else if (id == R.id.ai2) {
            m16576j();
        } else if (id == R.id.e9f || id == R.id.e9g) {
            m16568a(this.f14887ao, this.f14899b, this.f14901d, new C5236cc(this));
        } else if (id == R.id.g2 || id == R.id.g3) {
            m16568a(this.f14888ap, this.f14900c, this.f14902e, new C5237cd(this));
        } else if (id == R.id.e95 || id == R.id.e96) {
            m16568a(this.f14887ao, this.f14901d, this.f14899b, new C5238ce(this));
        } else if (id == R.id.ft || id == R.id.fu) {
            m16568a(this.f14888ap, this.f14902e, this.f14900c, new C5239cf(this));
        } else if (id == this.f14884al.getId() && this.f14896ax != null && this.f14891as != null) {
            if (this.f14891as.getFollowInfo() != null) {
                i = (int) this.f14891as.getFollowInfo().getPushStatus();
            } else {
                i = 0;
            }
            LiveProfileNotificationSetting a = LiveProfileNotificationSetting.m16627a(String.valueOf(this.f14896ax.getId()), i, this, this.f14891as.getSecUid(), String.valueOf(this.f14895aw));
            if (this.mFragmentManager != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "message");
                hashMap.put("enter_method", "live_cell");
                hashMap.put("anchor_id", String.valueOf(this.f14895aw));
                hashMap.put("room_id", String.valueOf(this.f14896ax.getId()));
                C8443c.m25663a().mo21606a("livesdk_live_notification_button_click", hashMap, new C8438j().mo21603f("click").mo21599b("live").mo21598a("anchor_profile"));
                a.show((C0608j) this.mFragmentManager, "LiveProfileNotificationSetting");
                if (!(getActivity() == null || getActivity().getSupportFragmentManager() == null)) {
                    C0633q a2 = getActivity().getSupportFragmentManager().mo2645a();
                    a2.mo2601b(this);
                    Fragment fragment = this.mParentFragment;
                    if (fragment != null) {
                        a2.mo2601b(fragment);
                    }
                    a2.mo2604c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13306a(User user) {
        boolean z;
        boolean z2;
        ImageModel imageModel;
        int i;
        if (!this.f14866aC || user == null || user.getId() <= 0) {
            if (this.f14846J != null) {
                this.f14846J.setVisibility(8);
            }
            return;
        }
        if (this.f14846J.getVisibility() == 8) {
            this.f14846J.setVisibility(0);
        }
        if (this.f14897ay == null) {
            this.f14897ay = new C9032ab(this.f14847K, this.f14896ax, user.getId());
        }
        this.f14891as = user;
        this.f14895aw = this.f14891as.getId();
        long b = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        if (b == this.f14895aw) {
            z = true;
        } else {
            z = false;
        }
        this.f14892at = z;
        if (this.f14896ax.getOwnerUserId() == this.f14895aw) {
            this.f14893au = 0;
        } else if (LinkCrossRoomDataHolder.m13782a().f11667e == this.f14895aw) {
            this.f14893au = 2;
        } else {
            this.f14893au = 1;
        }
        if (b == this.f14896ax.getOwnerUserId()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f14894av = z2;
        boolean booleanValue = ((Boolean) LiveSettingKeys.LIVE_MT_NOTIFICATION_AB.mo10240a()).booleanValue();
        if (!this.f14892at && this.f14893au == 0 && (this.f14891as.getFollowInfo().getFollowStatus() == 1 || this.f14891as.getFollowInfo().getFollowStatus() == 2)) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", "message");
            hashMap.put("enter_method", "live_cell");
            hashMap.put("anchor_id", String.valueOf(this.f14896ax.getOwner().getId()));
            hashMap.put("room_id", String.valueOf(this.f14896ax.getId()));
            if (booleanValue) {
                this.f14884al.setVisibility(0);
                if (this.f14891as == null || this.f14891as.getFollowInfo() == null) {
                    i = 0;
                } else {
                    i = (int) this.f14891as.getFollowInfo().getPushStatus();
                }
                m16569b(i);
                hashMap.put("is_setting", "1");
            } else {
                hashMap.put("is_setting", "0");
            }
            C8443c.m25663a().mo21606a("livesdk_click_user_following_show", hashMap, new C8438j().mo21603f("show").mo21599b("live").mo21598a("anchor_profile"));
        }
        C2372d authenticationInfo = this.f14891as.getAuthenticationInfo();
        FansClubData fansClubData = null;
        if (authenticationInfo == null) {
            imageModel = null;
        } else {
            imageModel = authenticationInfo.f7811c;
        }
        this.f14876ad.mo13425a(Arrays.asList(new ImageModel[]{imageModel}));
        this.f14876ad.f15198a = new OnClickListener() {
            public final void onClick(View view) {
            }
        };
        this.f14906i.setText(this.f14891as.displayId);
        if (!(this.f14891as.getGender() == 1 || this.f14891as.getGender() == 2)) {
            C9738o.m28712b((View) this.f14874ab, 8);
            C9738o.m28712b((View) this.f14885am, 8);
        }
        if (TextUtils.isEmpty(this.f14891as.getCity())) {
            this.f14907j.setText(R.string.f70);
        } else {
            this.f14907j.setText(this.f14891as.getCity());
        }
        if (!TextUtils.isEmpty(this.f14891as.getSpecialId())) {
            this.f14908k.setVisibility(8);
            this.f14909l.setVisibility(0);
            this.f14909l.setText(C3358ac.m12517a((int) R.string.egk, this.f14891as.getSpecialId()));
            this.f14909l.postDelayed(new C5235cb(this), 1000);
        } else {
            this.f14908k.setVisibility(0);
            this.f14909l.setVisibility(8);
            this.f14863a.setVisibility(8);
            this.f14908k.setText(C3358ac.m12517a((int) R.string.ezs, this.f14891as.displayId));
        }
        if (!this.f14891as.isVerified() || TextUtils.isEmpty(this.f14891as.getVerifiedReason())) {
            this.f14910m.setVisibility(8);
        } else {
            this.f14910m.setText(this.f14891as.getVerifiedReason());
            this.f14910m.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.f14891as.getSignature())) {
            this.f14911q.setText(R.string.ehx);
        } else {
            this.f14911q.setText(this.f14891as.getSignature());
        }
        this.f14911q.setMaxLines(2);
        this.f14914t.setText(m16564a(C9094x.m27135a(this.f14891as.getFanTicketCount()), 17));
        FollowInfo followInfo = this.f14891as.getFollowInfo();
        if (followInfo != null) {
            this.f14912r.setText(m16564a(C9094x.m27135a(followInfo.getFollowingCount()), 17));
            this.f14913s.setText(m16564a(C9094x.m27135a(followInfo.getFollowerCount()), 17));
        } else {
            this.f14912r.setText("0");
        }
        if (followInfo != null) {
            this.f14913s.setText(m16564a(C9094x.m27135a(followInfo.getFollowerCount()), 17));
        } else {
            this.f14913s.setText("0");
        }
        if (this.f14891as.getUserHonor() != null) {
            this.f14915u.setText(m16564a(C9094x.m27135a(this.f14891as.getUserHonor().mo8703g()), 17));
        } else {
            this.f14915u.setText("0");
        }
        this.f14916v.setText(R.string.f07);
        if (C6307b.m19566a((Collection<T>) this.f14891as.getTopFans()) || C9290a.f25466a) {
            this.f14917w.setVisibility(8);
        } else {
            int size = this.f14891as.getTopFans().size();
            int i2 = 1;
            for (int i3 = 0; i3 < size; i3++) {
                User user2 = (User) this.f14891as.getTopFans().get(i3);
                if (user2 != null) {
                    if (i2 == 1) {
                        C5343e.m17045b(this.f14919y, user2.getAvatarThumb(), this.f14919y.getWidth(), this.f14919y.getHeight(), 0);
                        this.f14918x.setVisibility(0);
                        this.f14918x.setTag(R.id.ic, user2);
                        this.f14918x.setOnClickListener(this);
                    } else if (i2 == 2) {
                        C5343e.m17045b(this.f14837A, user2.getAvatarThumb(), this.f14837A.getWidth(), this.f14837A.getHeight(), 0);
                        this.f14920z.setVisibility(0);
                        this.f14920z.setTag(R.id.ic, user2);
                        this.f14920z.setOnClickListener(this);
                    } else if (i2 == 3) {
                        C5343e.m17045b(this.f14839C, user2.getAvatarThumb(), this.f14839C.getWidth(), this.f14839C.getHeight(), 0);
                        this.f14838B.setVisibility(0);
                        this.f14838B.setTag(R.id.ic, user2);
                        this.f14838B.setOnClickListener(this);
                    }
                    i2++;
                }
            }
            if (this.f14871aH) {
                this.f14917w.setVisibility(0);
            }
        }
        if (this.f14892at && this.f14894av) {
            this.f14840D.setVisibility(8);
        } else if (this.f14892at) {
            this.f14841E.setVisibility(8);
            this.f14842F.setVisibility(8);
            this.f14843G.setVisibility(8);
            if (this.f14870aG) {
                C9738o.m28712b(this.f14844H, 0);
                this.f14844H.setTag(this.f14891as);
            }
            this.f14840D.setVisibility(8);
        } else {
            m16572c(this.f14891as);
            this.f14841E.setOnClickListener(this);
            this.f14842F.setOnClickListener(this);
            if (LinkCrossRoomDataHolder.m13782a().f11667e == this.f14891as.getId() || this.f14865aB == 2) {
                this.f14843G.setVisibility(8);
            } else {
                this.f14843G.setVisibility(0);
                this.f14843G.setOnClickListener(this);
            }
            if (this.f14894av) {
                C9738o.m28712b(this.f14844H, 8);
                C9738o.m28712b(this.f14845I, 8);
            } else if (LinkCrossRoomDataHolder.m13782a().f11667e == this.f14891as.getId()) {
                C9738o.m28712b(this.f14844H, 0);
                C9738o.m28712b(this.f14845I, 0);
                this.f14845I.setOnClickListener(this);
                m16575i();
            } else {
                C9738o.m28712b(this.f14845I, 8);
                if (this.f14870aG) {
                    C9738o.m28712b(this.f14844H, 0);
                    this.f14844H.setTag(this.f14891as);
                }
            }
            this.f14840D.setVisibility(0);
        }
        FansClubMember fansClub = this.f14891as.getFansClub();
        if (fansClub != null) {
            if (fansClub.getPreferData() != null && fansClub.getPreferData().size() > 0) {
                fansClubData = (FansClubData) fansClub.getPreferData().get(Integer.valueOf(0));
            }
            if (FansClubData.isValid(fansClubData) && fansClubData.userFansClubStatus == 1 && fansClubData.badge != null && fansClubData.badge.icons != null) {
                ImageModel imageModel2 = (ImageModel) fansClubData.badge.icons.get(Integer.valueOf(1));
                if (imageModel2 != null) {
                    C5343e.m17038a(this.f14860X, imageModel2);
                    this.f14861Y.setText(fansClubData.clubName);
                    this.f14862Z.setText(C3358ac.m12517a((int) R.string.ejt, String.valueOf(fansClubData.level)));
                    if (this.f14872aI) {
                        this.f14859W.setVisibility(0);
                    }
                }
                this.f14868aE = fansClubData;
            }
        }
        if (this.f14878af != null) {
            if (this.f14891as == null || this.f14891as.getAuthorInfo() == null) {
                this.f14878af.setText("0");
            } else {
                this.f14878af.setText(m16564a(C9094x.m27135a(this.f14891as.getAuthorInfo().f7817f), 17));
            }
        }
        if (this.f14869aF) {
            C2380l userHonor = this.f14891as.getUserHonor();
            if (userHonor == null || userHonor.mo8710n() <= 0) {
                this.f14899b.setVisibility(8);
                this.f14901d.setVisibility(8);
            } else {
                C5343e.m17030a((ImageView) this.f14849M, userHonor.mo8716t());
                this.f14850N.setText(String.valueOf(userHonor.mo8710n()));
                C5343e.m17030a((ImageView) this.f14853Q, userHonor.mo8717u());
                this.f14855S.setText(String.valueOf(userHonor.mo8714r() - userHonor.mo8704h()));
                this.f14899b.setVisibility(0);
                this.f14901d.setVisibility(4);
            }
            C2371c anchorLevel = this.f14891as.getAnchorLevel();
            if (anchorLevel == null || anchorLevel.mo8685a() <= 0) {
                this.f14900c.setVisibility(8);
                this.f14902e.setVisibility(8);
                return;
            }
            C5343e.m17030a((ImageView) this.f14851O, anchorLevel.mo8694j());
            this.f14852P.setText(String.valueOf(anchorLevel.mo8685a()));
            C5343e.m17030a((ImageView) this.f14856T, anchorLevel.mo8695k());
            this.f14858V.setText(String.valueOf(anchorLevel.mo8688d() - anchorLevel.mo8686b()));
            this.f14900c.setVisibility(0);
            this.f14902e.setVisibility(4);
        }
    }

    /* renamed from: a */
    private static Spannable m16564a(String str, int i) {
        SpannableString spannableString = new SpannableString(str);
        int length = str.length() - 1;
        int length2 = str.length() - 1;
        while (true) {
            if (length2 >= str.length()) {
                break;
            } else if (Character.isDigit(str.charAt(length2))) {
                length = length2 + 1;
                break;
            } else {
                length2--;
            }
        }
        if (length != 0 && length <= str.length() - 1) {
            spannableString.setSpan(new AbsoluteSizeSpan(17, true), length, str.length(), 33);
        }
        return spannableString;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f14866aC = true;
        ((C3245ad) C9097a.m27146a().mo22266a(C9298a.class).mo19293a(C3303k.m12369a((Fragment) this)).mo19297a((C7494t<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10182a((C7326g<? super T>) new C5229bw<Object>(this));
        m16573g();
        this.f14846J = layoutInflater.inflate(R.layout.aql, viewGroup, false);
        this.f14906i = (TextView) this.f14846J.findViewById(R.id.c33);
        this.f14875ac = (RecyclerView) this.f14846J.findViewById(R.id.e99);
        this.f14907j = (TextView) this.f14846J.findViewById(R.id.buj);
        this.f14908k = (TextView) this.f14846J.findViewById(R.id.awi);
        this.f14909l = (TextView) this.f14846J.findViewById(R.id.d93);
        this.f14863a = this.f14846J.findViewById(R.id.d7u);
        this.f14910m = (TextView) this.f14846J.findViewById(R.id.egm);
        this.f14911q = (TextView) this.f14846J.findViewById(R.id.d6r);
        this.f14912r = (TextView) this.f14846J.findViewById(R.id.ao8);
        this.f14913s = (TextView) this.f14846J.findViewById(R.id.ao3);
        this.f14914t = (TextView) this.f14846J.findViewById(R.id.diz);
        this.f14915u = (TextView) this.f14846J.findViewById(R.id.a8j);
        this.f14916v = (TextView) this.f14846J.findViewById(R.id.d2z);
        this.f14917w = this.f14846J.findViewById(R.id.dm0);
        this.f14918x = this.f14846J.findViewById(R.id.dlk);
        this.f14919y = (ImageView) this.f14846J.findViewById(R.id.dlj);
        this.f14920z = this.f14846J.findViewById(R.id.dlm);
        this.f14837A = (ImageView) this.f14846J.findViewById(R.id.dll);
        this.f14838B = this.f14846J.findViewById(R.id.dlo);
        this.f14839C = (ImageView) this.f14846J.findViewById(R.id.dln);
        this.f14840D = this.f14846J.findViewById(R.id.ac);
        this.f14841E = (TextView) this.f14846J.findViewById(R.id.anj);
        this.f14842F = (TextView) this.f14846J.findViewById(R.id.ao2);
        this.f14883ak = (ImageView) this.f14846J.findViewById(R.id.l7);
        this.f14884al = this.f14846J.findViewById(R.id.l8);
        this.f14843G = this.f14846J.findViewById(R.id.h8);
        this.f14844H = this.f14846J.findViewById(R.id.avt);
        this.f14845I = this.f14846J.findViewById(R.id.ask);
        this.f14859W = this.f14846J.findViewById(R.id.ai2);
        this.f14860X = (HSImageView) this.f14846J.findViewById(R.id.ai1);
        this.f14861Y = (TextView) this.f14846J.findViewById(R.id.ai_);
        this.f14862Z = (TextView) this.f14846J.findViewById(R.id.ai5);
        this.f14873aa = this.f14846J.findViewById(R.id.buo);
        this.f14874ab = (TextView) this.f14846J.findViewById(R.id.aq6);
        this.f14880ah = this.f14846J.findViewById(R.id.bup);
        this.f14882aj = (ImageView) this.f14846J.findViewById(R.id.buq);
        this.f14885am = (ImageView) this.f14846J.findViewById(R.id.aq5);
        this.f14886an = this.f14846J.findViewById(R.id.b0w);
        if (this.f14869aF) {
            this.f14899b = this.f14846J.findViewById(R.id.e9f);
            this.f14849M = (HSImageView) this.f14846J.findViewById(R.id.e9e);
            this.f14850N = (TextView) this.f14846J.findViewById(R.id.e9d);
            this.f14900c = this.f14846J.findViewById(R.id.g2);
            this.f14851O = (HSImageView) this.f14846J.findViewById(R.id.g1);
            this.f14852P = (TextView) this.f14846J.findViewById(R.id.g0);
            this.f14901d = this.f14846J.findViewById(R.id.e95);
            this.f14853Q = (HSImageView) this.f14846J.findViewById(R.id.e94);
            this.f14854R = this.f14846J.findViewById(R.id.e97);
            this.f14855S = (TextView) this.f14846J.findViewById(R.id.e93);
            this.f14902e = this.f14846J.findViewById(R.id.ft);
            this.f14856T = (HSImageView) this.f14846J.findViewById(R.id.fs);
            this.f14857U = this.f14846J.findViewById(R.id.fv);
            this.f14858V = (TextView) this.f14846J.findViewById(R.id.fr);
            this.f14846J.findViewById(R.id.fu).setOnClickListener(this);
            this.f14846J.findViewById(R.id.e96).setOnClickListener(this);
            this.f14846J.findViewById(R.id.g3).setOnClickListener(this);
            this.f14846J.findViewById(R.id.e9g).setOnClickListener(this);
            m16571c(this.f14899b);
            m16571c(this.f14901d);
            m16571c(this.f14900c);
            m16571c(this.f14902e);
        }
        this.f14859W.setOnClickListener(this);
        this.f14908k.setLongClickable(true);
        this.f14908k.setOnLongClickListener(new C5230bx(this));
        this.f14909l.setLongClickable(true);
        this.f14909l.setOnLongClickListener(new C5234ca(this));
        this.f14876ad = new UserFeatureLabelListAdapter();
        this.f14875ac.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f14875ac.setAdapter(this.f14876ad);
        this.f14844H.setOnClickListener(this);
        this.f14884al.setOnClickListener(this);
        m16574h();
        mo13306a(this.f14891as);
        return this.f14846J;
    }

    /* renamed from: a */
    private void m16568a(final Animator[] animatorArr, final View view, final View view2, final Runnable runnable) {
        m16566a(this.f14889aq);
        m16566a(this.f14890ar);
        m16566a(animatorArr[0]);
        m16566a(animatorArr[1]);
        animatorArr[0] = ObjectAnimator.ofFloat(view, "rotationX", new float[]{0.0f, -90.0f});
        animatorArr[1] = ObjectAnimator.ofFloat(view2, "rotationX", new float[]{90.0f, 0.0f});
        animatorArr[0].addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                view.setVisibility(4);
                animatorArr[1].start();
            }

            public final void onAnimationStart(Animator animator) {
                view.setClickable(false);
                view2.setClickable(false);
                view2.setVisibility(4);
            }
        });
        animatorArr[1].addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                view2.setVisibility(0);
            }

            public final void onAnimationEnd(Animator animator) {
                view2.setClickable(true);
                view2.setClickable(true);
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        animatorArr[0].start();
    }

    /* renamed from: a */
    public static LiveProfileDetailFragment m16565a(Activity activity, User user, Room room, boolean z, int i, C4953ao aoVar, DataCenter dataCenter) {
        LiveProfileDetailFragment liveProfileDetailFragment = new LiveProfileDetailFragment();
        liveProfileDetailFragment.f14891as = user;
        if (user != null) {
            liveProfileDetailFragment.f14895aw = user.getId();
            liveProfileDetailFragment.f14897ay = new C9032ab(activity, room, user.getId());
        }
        liveProfileDetailFragment.f14896ax = room;
        liveProfileDetailFragment.f14865aB = i;
        liveProfileDetailFragment.f14898az = z;
        liveProfileDetailFragment.f14864aA = aoVar;
        liveProfileDetailFragment.f14847K = activity;
        liveProfileDetailFragment.f14848L = dataCenter;
        boolean z2 = true;
        if (C9290a.f25466a || ((Integer) LiveSettingKeys.SHOW_ANCHOR_LEVEL.mo10240a()).intValue() != 1) {
            z2 = false;
        }
        liveProfileDetailFragment.f14869aF = z2;
        return liveProfileDetailFragment;
    }
}
