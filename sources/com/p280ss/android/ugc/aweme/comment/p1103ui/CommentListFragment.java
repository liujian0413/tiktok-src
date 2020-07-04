package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.view.C1156d;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import bolts.C1592h;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22596c;
import com.p280ss.android.ugc.aweme.app.C22689a;
import com.p280ss.android.ugc.aweme.app.p1029d.C22915b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.comment.C24093d;
import com.p280ss.android.ugc.aweme.comment.C24191m;
import com.p280ss.android.ugc.aweme.comment.CommentViewModelImpl;
import com.p280ss.android.ugc.aweme.comment.abtest.C24033a;
import com.p280ss.android.ugc.aweme.comment.abtest.CommentAutoAddLayoutExperiment;
import com.p280ss.android.ugc.aweme.comment.adapter.CommentAdapter;
import com.p280ss.android.ugc.aweme.comment.adapter.CommentReplyButtonViewHolder;
import com.p280ss.android.ugc.aweme.comment.experiment.CommentKeyboardShowOptimization;
import com.p280ss.android.ugc.aweme.comment.list.C24176b;
import com.p280ss.android.ugc.aweme.comment.list.C24179e;
import com.p280ss.android.ugc.aweme.comment.list.C24181g;
import com.p280ss.android.ugc.aweme.comment.list.C24183i;
import com.p280ss.android.ugc.aweme.comment.list.C24185k;
import com.p280ss.android.ugc.aweme.comment.list.C24187m;
import com.p280ss.android.ugc.aweme.comment.list.ICommerceComtEggLayout;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p280ss.android.ugc.aweme.comment.model.CommentLikeUsersStruct;
import com.p280ss.android.ugc.aweme.comment.model.CommentPrompt;
import com.p280ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24029a;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24030b;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24090a;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24091b;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24103c;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24105d;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24106e;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24108f;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24109g;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24111h;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24117n;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24118o;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24120p;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24121q;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24123s;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24127v;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24128w;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24130a;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24131b;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24132c;
import com.p280ss.android.ugc.aweme.comment.p1100g.C24135a;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24147d;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24150f;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24163l;
import com.p280ss.android.ugc.aweme.comment.param.VideoCommentPageParam;
import com.p280ss.android.ugc.aweme.comment.services.C24219a;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.comment.services.C24222c;
import com.p280ss.android.ugc.aweme.comment.services.C24223d;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.comment.widget.CommentNestedLayout;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24641b;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24655d;
import com.p280ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24560b;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25053a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25268bg;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27536b;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.experiment.ShrinkVideoWhenCommentShowExperiment;
import com.p280ss.android.ugc.aweme.feed.C28201af;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.feed.event.C28311ag;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28321d;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.feed.p1228d.C28292b;
import com.p280ss.android.ugc.aweme.follow.p1260c.C29447a;
import com.p280ss.android.ugc.aweme.forward.p1268b.C29876a;
import com.p280ss.android.ugc.aweme.forward.p1270d.C29895c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.main.p1382d.C32953b;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.p1042as.C23089a.C23090a;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;
import com.p280ss.android.ugc.aweme.store.C41959a;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42980bm;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.Pair;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentListFragment */
public class CommentListFragment extends AmeBaseFragment implements C24090a, C24127v, C24128w, C24176b, C24179e, C24181g, C24185k, C24222c, C24340v, C6905a, C25675c<Comment> {

    /* renamed from: U */
    private static boolean f64027U;

    /* renamed from: X */
    private static long f64028X;

    /* renamed from: ad */
    private static long f64029ad;

    /* renamed from: m */
    public static boolean f64030m;

    /* renamed from: A */
    private View f64031A;

    /* renamed from: B */
    private ViewGroup f64032B;

    /* renamed from: C */
    private CommentAdapter f64033C;

    /* renamed from: D */
    private ICommerceComtEggLayout f64034D;

    /* renamed from: E */
    private TextView f64035E;

    /* renamed from: F */
    private CommerceEggLayout f64036F;

    /* renamed from: G */
    private C24105d f64037G;

    /* renamed from: H */
    private C24120p f64038H;

    /* renamed from: J */
    private C24108f f64039J;

    /* renamed from: K */
    private C24117n f64040K;

    /* renamed from: L */
    private C24336s f64041L;

    /* renamed from: M */
    private C24163l f64042M;

    /* renamed from: N */
    private C28343z<C28318an> f64043N;

    /* renamed from: O */
    private String f64044O;

    /* renamed from: P */
    private String f64045P;

    /* renamed from: Q */
    private boolean f64046Q = false;

    /* renamed from: R */
    private boolean f64047R;

    /* renamed from: S */
    private boolean f64048S;

    /* renamed from: T */
    private boolean f64049T;

    /* renamed from: V */
    private long f64050V;

    /* renamed from: W */
    private long f64051W;

    /* renamed from: Y */
    private WidgetManager f64052Y;

    /* renamed from: Z */
    private Widget f64053Z;

    /* renamed from: aa */
    private Widget f64054aa;

    /* renamed from: ab */
    private FrameLayout f64055ab;

    /* renamed from: ac */
    private ViewGroup f64056ac;

    /* renamed from: ae */
    private int f64057ae;

    /* renamed from: e */
    public VideoCommentPageParam f64058e = new VideoCommentPageParam("");

    /* renamed from: f */
    public Aweme f64059f;

    /* renamed from: g */
    public WrapLinearLayoutManager f64060g;

    /* renamed from: h */
    public C24111h f64061h;

    /* renamed from: i */
    public C24123s f64062i;

    /* renamed from: j */
    public C24093d f64063j;

    /* renamed from: k */
    public DataCenter f64064k;

    /* renamed from: l */
    C28201af f64065l;

    /* renamed from: n */
    private final int f64066n = ((int) C9738o.m28708b(C6399b.m19921a(), 30.0f));

    /* renamed from: o */
    private Comment f64067o;

    /* renamed from: p */
    private Comment f64068p;

    /* renamed from: q */
    private Comment f64069q;

    /* renamed from: r */
    private DmtStatusView f64070r;

    /* renamed from: s */
    private RecyclerView f64071s;

    /* renamed from: t */
    private CommentNestedLayout f64072t;

    /* renamed from: u */
    private TextView f64073u;

    /* renamed from: v */
    private View f64074v;

    /* renamed from: w */
    private MentionEditText f64075w;

    /* renamed from: x */
    private ImageView f64076x;

    /* renamed from: y */
    private ImageView f64077y;

    /* renamed from: z */
    private View f64078z;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo62442a(View view, boolean z, String str) {
    }

    /* renamed from: f */
    public final void mo62451f() {
        m79743ag();
    }

    /* renamed from: j */
    public final Aweme mo63004j() {
        return this.f64059f;
    }

    /* renamed from: k */
    public final Comment mo63005k() {
        return this.f64068p;
    }

    /* renamed from: p */
    public final boolean mo63011p() {
        return C24223d.m79571a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo63078b(boolean z) {
        if (z && C25329c.m83232o(this.f64059f)) {
            if (!C6307b.m19566a((Collection<T>) this.f64033C.mo62312a())) {
                this.f64033C.mo62312a().remove(0);
                this.f64033C.notifyItemRemoved(0);
            }
            LinkData a = C25268bg.m83039a(this.f64059f);
            if (a != null) {
                a.setHasDislike(true);
            }
            C43173w.m136929b(new C24325h(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo63073a(Boolean bool) {
        if (bool.booleanValue() && C25329c.m83232o(this.f64059f)) {
            this.f64064k.mo60134a("comment_dialog_state", (Object) Integer.valueOf(3));
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63075a(View view) {
        m79743ag();
    }

    /* renamed from: a */
    public final void mo63080d(List<Comment> list, boolean z) {
        if (this.f64061h != null && this.f64061h.mo66539h() != null && ((C24109g) this.f64061h.mo66539h()).getData() != null) {
            if (f64028X > 0) {
                C1592h.m7853a((Callable<TResult>) new C24331n<TResult>(this, f64028X));
                f64028X = 0;
            }
            if (this.f64072t == null || !this.f64072t.mo63263b()) {
                if (!m79719V()) {
                    list.clear();
                    ae_();
                }
                if (this.f64063j != null) {
                    this.f64063j.mo62434c();
                }
                m79734a(list);
                m79749b(list);
                int c = m79751c(true);
                if (!CommentKeyboardShowOptimization.showIfWithoutComment() && this.f64057ae == 0) {
                    m79726a(c);
                }
                if (this.f64063j != null) {
                    this.f64063j.mo62426a(((CommentItemList) ((C24109g) this.f64061h.mo66539h()).getData()).replyStyle);
                }
                m79761d(list);
                m79764e(list);
                this.f64041L.mo59099a(list, z);
                m79746b(c);
                this.f64058e.setInsertCids(this.f64061h.mo62529g(), this.f64058e.showReplyWithInsertCid(), this.f64058e.isForceOpenReply());
                m79737aa();
                if (this.f64057ae > 0) {
                    m79730a(((CommentItemList) ((C24109g) this.f64061h.mo66539h()).getData()).commentPrompt);
                }
                return;
            }
            this.f64072t.postDelayed(new C24332o(this, list, z), 100);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo63072a(long j) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            String g = mo63083g();
            String str = "group_id";
            if (g == null) {
                g = "";
            }
            jSONObject.put(str, g);
            C41959a.f109024b = SystemClock.uptimeMillis() - j;
            jSONObject.put("duration", String.valueOf(C41959a.f109024b));
            jSONObject.put("when", C43316v.m137450K().mo104915n() + C24132c.m79290d());
            jSONObject.put("repeat", C24132c.m79291e());
        } catch (JSONException unused) {
        }
        C6759a.m20910a("comment_list", jSONObject);
        return null;
    }

    /* renamed from: a */
    private void m79734a(List<Comment> list) {
        if (this.f64046Q && !C6307b.m19566a((Collection<T>) list)) {
            CommentStruct adCommentStruct = this.f64058e.getAdCommentStruct();
            if (adCommentStruct != null) {
                if (!(list.get(0) instanceof CommentStruct)) {
                    list.add(0, adCommentStruct);
                }
                this.f64064k.mo60134a("comment_ad_struct", (Object) adCommentStruct);
            }
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        this.f64041L.mo59107b(exc);
    }

    /* renamed from: b */
    public final void mo59108b(List<Comment> list, boolean z) {
        this.f64041L.mo59108b(list, z);
        m79746b(m79711N());
    }

    /* renamed from: c */
    public final void mo59110c(List<Comment> list, boolean z) {
        this.f64041L.mo59110c(list, z);
    }

    /* renamed from: a */
    public final void mo62619a(String str) {
        m79752c(-m79762e(str));
        this.f64041L.mo62619a(str);
        C42961az.m136380a(new C24029a(4, new Object[]{mo63083g(), str}));
        if (this.f64059f != null && this.f64067o != null) {
            C24220a.m79551a().tryShowCommentFilterGuide(getActivity(), this.f64059f, this.f64067o);
        }
    }

    /* renamed from: b */
    public final void mo62622b(String str) {
        this.f64041L.mo62622b(str);
        if (!TextUtils.isEmpty(this.f64044O)) {
            C24130a.m79260a(this.f64058e.getEnterFrom(), this.f64059f, str, true, "list", this.f64045P);
        }
    }

    /* renamed from: a */
    public final void mo62448a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            C7195s a = C7195s.m22438a();
            FragmentActivity activity = getActivity();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(str);
            a.mo18679a((Activity) activity, C7203u.m22460a(sb.toString()).mo18694a("enter_from", mo63006l()).mo18694a(C22689a.f60407a, str2).mo18695a());
            C24130a.m79268a(mo63006l(), mo63083g(), m79716S(), str, this.f64058e.getRequestId(), this.f64059f);
            C42961az.m136380a(new C28318an(36));
        }
    }

    /* renamed from: a */
    public final void mo62445a(Comment comment, int i) {
        if (!C24334q.m80007a(getActivity())) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
        } else if (!C6861a.m21337f().isLogin()) {
            C32656f.m105746a((Fragment) this, mo63006l(), "like_comment");
        } else if (comment != null) {
            String str = comment.getUserDigged() == 0 ? "1" : "2";
            if (this.f64039J != null && this.f64039J.ap_()) {
                this.f64039J.mo56976a(comment.getCid(), comment.getAwemeId(), str, this.f64058e.getCommentTag());
            }
            if (TextUtils.equals("1", str)) {
                this.f64044O = comment.getCid();
                this.f64045P = comment.getUser().getUid();
                C24130a.m79267a(mo63006l(), String.valueOf(comment.getLabelType()), this.f64044O, mo63083g(), Comment.getAuthorUid(comment));
                return;
            }
            this.f64044O = "";
            this.f64045P = "";
        }
    }

    /* renamed from: a */
    public final void mo62447a(Emoji emoji) {
        if (isViewValid() && emoji != null) {
            Context context = getContext();
            if (context != null) {
                if (!C6861a.m21337f().isLogin()) {
                    C32656f.m105743a(C6405d.m19984g(), this.f64058e.getEnterFrom(), "like_comment", C42914ab.m136242a().mo104633a("group_id", this.f64058e.getAid()).mo104633a("log_pb", C33230ac.m107234j(this.f64058e.getAid())).f111445a);
                } else if (C27536b.m90251a().mo70762a(emoji)) {
                    C10761a.m31409e(context, (int) R.string.b01).mo25750a();
                } else {
                    UrlModel animateUrl = emoji.getAnimateUrl();
                    C24130a.m79248a();
                    C27536b.m90251a().mo70756a(emoji.getId(), animateUrl.getUri(), (String) animateUrl.getUrlList().get(0), emoji.getResourcesId(), emoji.getStickerType());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62443a(C24187m mVar, Comment comment) {
        if (comment != null && mo62628e()) {
            C24130a.m79274b(this.f64058e.getEnterFrom(), mo63083g(), comment.getCid());
            if (!C24191m.f63849a.mo62632a(comment)) {
                if (!C24220a.m79551a().shouldReplyDirectly()) {
                    m79755c(mVar, comment);
                } else if (!C6861a.m21337f().isLogin()) {
                    C32656f.m105747a((Fragment) this, mo63006l(), "reply_comment", C42914ab.m136242a().mo104633a("login_title", C6399b.m19921a().getString(R.string.a7i)).mo104633a("group_id", mo63083g()).mo104633a("log_pb", C33230ac.m107234j(mo63083g())).f111445a);
                } else if (C22596c.m74673a().mo59240a()) {
                    C10761a.m31409e(C6399b.m19921a(), (int) R.string.e5r).mo25750a();
                } else {
                    mo63084g(comment);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo62450b(String str, String str2) {
        C24220a.m79551a().startUserProfileActivity(getContext(), str, str2, "like_banner");
    }

    /* renamed from: a */
    public final void mo62446a(CommentReplyButtonStruct commentReplyButtonStruct, int i) {
        if (this.f64040K == null) {
            this.f64040K = new C24117n(mo63083g(), mo63006l());
            this.f64040K.mo62533a(this.f64042M);
            this.f64040K.f63758a = m79715R();
            this.f64040K.mo62534a((C24185k) this);
        }
        this.f64040K.mo62536a(commentReplyButtonStruct, (C24183i) (CommentReplyButtonViewHolder) this.f64071s.mo5575f(i));
    }

    /* renamed from: a */
    public final void mo62444a(Comment comment) {
        String text = comment.getText();
        m79729a(C24191m.f63849a.mo62641m(comment), C24191m.f63849a.mo62639k(comment), C27608b.m90500a(text), text, true);
        if (this.f64063j != null) {
            this.f64063j.mo62432b(comment);
        }
    }

    /* renamed from: a */
    private static void m79733a(String str, Aweme aweme, String str2, User user) {
        C6907h.m21524a("click_report", (Map) new C22984d().mo59973a("author_id", user != null ? user.getUid() : "").mo59973a("object_id", str2).mo59973a("object_type", "comment").mo59973a("enter_from", str).mo59973a("enter_method", "click_comment_button").mo59973a("group_id", aweme != null ? aweme.getAid() : "").f60753a);
    }

    /* renamed from: a */
    public final void mo62627a(C28343z<C28318an> zVar) {
        this.f64043N = zVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63074a(int i, List list, Comment comment) {
        if (m79739ac()[1] < i && this.f64060g != null) {
            this.f64060g.mo5417a(Math.max(0, i - 2), -this.f64066n);
        }
        if (this.f64058e.showReplyWithInsertCid()) {
            if ((!C6399b.m19945u() || !this.f64058e.isForceOpenReply()) && (C6399b.m19946v() || list.size() >= 3)) {
                this.f64068p = comment;
                this.f64075w.setHint(C6399b.m19921a().getString(R.string.dem, new Object[]{C43122ff.m136753A(comment.getUser())}));
            } else {
                mo63084g(comment);
            }
        }
    }

    /* renamed from: d */
    public final void mo63000d(boolean z) {
        this.f64051W = System.currentTimeMillis();
        C24130a.m79258a(this.f64058e.getEnterFrom(), this.f64059f, C24130a.m79247a(this.f64068p), "list");
        if (this.f64068p != null) {
            this.f64041L.mo63230a(true, this.f64068p);
        }
    }

    /* renamed from: a */
    public final void mo62994a(int i, int i2, String str) {
        m79728a(this.f64068p, i, i2, str);
    }

    /* renamed from: a */
    public final void mo62995a(Exception exc, int i, Comment comment) {
        if (i == 3) {
            C6903bc.m21485d().mo75951a(this.f64058e.getEnterFrom(), mo63004j(), "list", this.f64047R ? "click_reply_comment" : "click_comment", false);
        }
        int[] ab = m79738ab();
        if (this.f64041L.mo63231a(exc, comment, ab[0], ab[1], i == 3)) {
            String fakeId = comment.getFakeId();
            m79752c(-m79765f(fakeId));
            this.f64041L.mo63234c(fakeId);
            C42961az.m136380a(new C24029a(4, new Object[]{mo63083g()}));
        }
    }

    /* renamed from: a */
    public final void mo62996a(String str, int i) {
        C24130a.m79253a(str, i, this.f64058e.getEnterFrom(), mo63083g(), m79716S());
    }

    /* renamed from: a */
    public final void mo62642a(String str, List<Comment> list) {
        String a = this.f64041L.mo63225a(str, list);
        if (!TextUtils.isEmpty(a)) {
            C24130a.m79278e(this.f64058e.getEnterFrom(), mo63083g(), a);
        }
    }

    /* renamed from: b */
    public final void mo62643b(String str, List<Comment> list) {
        String b = this.f64041L.mo63232b(str, list);
        if (!TextUtils.isEmpty(b)) {
            C24130a.m79277d(this.f64058e.getEnterFrom(), mo63083g(), b);
        }
    }

    /* renamed from: a */
    public static boolean m79736a(Context context) {
        CommentListFragment d = m79758d(context);
        return d != null && d.mo62628e();
    }

    /* renamed from: c */
    public final void mo62543c(String str) {
        if (!TextUtils.isEmpty(str)) {
            C10761a.m31403c((Context) getActivity(), str).mo25750a();
        }
    }

    /* renamed from: a */
    public final void mo62541a(String str, int i, String str2) {
        this.f64070r.mo25939d();
        if (i == 1) {
            f64030m = true;
        } else {
            f64030m = false;
        }
        if (i != 0) {
            C24217a.m79549a().tryStartCommentShareActivity(getActivity(), this.f64059f, this.f64069q, this.f64055ab.getHeight(), mo63006l());
        } else if (!TextUtils.isEmpty(str)) {
            C10761a.m31410e(C6399b.m19921a(), str).mo25750a();
        } else {
            if (!TextUtils.isEmpty(str2)) {
                C10761a.m31410e(C6399b.m19921a(), str).mo25750a();
            }
        }
    }

    /* renamed from: N */
    private int m79711N() {
        return m79751c(false);
    }

    /* renamed from: R */
    private String m79715R() {
        return this.f64058e.getInsertCids();
    }

    /* renamed from: S */
    private String m79716S() {
        return this.f64058e.getAuthorUid();
    }

    /* renamed from: U */
    private boolean m79718U() {
        return this.f64058e.isCommentClose();
    }

    /* renamed from: af */
    private void m79742af() {
        m79741ae();
        m79740ad();
    }

    /* renamed from: r */
    public static void m79769r() {
        f64028X = SystemClock.uptimeMillis();
    }

    /* renamed from: z */
    private static void m79772z() {
        C24135a.m79312a().mo62563b();
    }

    public final void aD_() {
        this.f64041L.aD_();
    }

    public final void aE_() {
        this.f64041L.aE_();
    }

    /* renamed from: g */
    public final String mo63083g() {
        return this.f64058e.getAid();
    }

    /* renamed from: l */
    public final String mo63006l() {
        return this.f64058e.getEventType();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final /* synthetic */ C7581n mo63097u() {
        m79743ag();
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final /* synthetic */ int mo63098v() {
        return this.f64055ab.getHeight();
    }

    /* renamed from: G */
    private void m79704G() {
        this.f64057ae = 0;
        m79706I();
        m79708K();
        m79721X();
    }

    /* renamed from: H */
    private void m79705H() {
        this.f64057ae = 0;
        m79706I();
        m79708K();
    }

    /* renamed from: X */
    private void m79721X() {
        this.f64068p = null;
        this.f64047R = false;
        if (this.f64063j != null) {
            this.f64063j.mo62503k();
        }
    }

    /* renamed from: y */
    private void m79771y() {
        this.f64033C.f63558g = new C24322e(this);
    }

    /* renamed from: m */
    public final int mo63007m() {
        if (this.f64047R) {
            return 4;
        }
        if (this.f64068p != null) {
            return 3;
        }
        return 2;
    }

    /* renamed from: o */
    public final boolean mo63009o() {
        return C6861a.m21337f().isLogin();
    }

    public void onStop() {
        if (mo62628e()) {
            m79766h(false);
        }
        super.onStop();
    }

    /* renamed from: q */
    public final void mo63094q() {
        this.f64064k.mo60134a("comment_ad_view_state", (Object) Integer.valueOf(1));
    }

    /* renamed from: A */
    private void m79699A() {
        int i;
        if (getContext() != null) {
            ViewGroup viewGroup = this.f64056ac;
            if (m79700B()) {
                i = 8;
            } else {
                i = 0;
            }
            viewGroup.setVisibility(i);
        }
    }

    /* renamed from: D */
    private int m79701D() {
        if (this.f64059f == null || this.f64059f.getStatistics() == null) {
            return 0;
        }
        return this.f64059f.getStatistics().getDiggCount();
    }

    /* renamed from: E */
    private void m79702E() {
        if (this.f64052Y != null) {
            this.f64052Y.mo60158b(this.f64053Z).mo60158b(this.f64054aa);
        }
    }

    /* renamed from: M */
    private boolean m79710M() {
        return C24220a.m79551a().isShowBarrageStyle(this.f64058e.getEventType(), this.f64059f);
    }

    /* renamed from: T */
    private boolean m79717T() {
        if (!this.f64058e.isEnableComment() || C25329c.m83220c(this.f64059f)) {
            return false;
        }
        return true;
    }

    /* renamed from: V */
    private boolean m79719V() {
        if (this.f64059f == null || !this.f64059f.getAwemeControl().canShowComment()) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    private boolean m79720W() {
        if (this.f64059f == null || !this.f64059f.getAwemeControl().canComment()) {
            return false;
        }
        return true;
    }

    /* renamed from: Y */
    private void m79722Y() {
        if (this.f64051W > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f64051W;
            this.f64051W = 0;
            C24130a.m79254a(this.f64058e.getEnterFrom(), this.f64059f, currentTimeMillis, "list");
        }
    }

    /* renamed from: Z */
    private void m79723Z() {
        this.f64046Q = false;
        if (this.f64059f != null && this.f64059f.isAd()) {
            AwemeRawAd awemeRawAd = this.f64059f.getAwemeRawAd();
            if (awemeRawAd != null) {
                this.f64046Q = awemeRawAd.isCommentAreaSwitch();
            }
        }
    }

    /* renamed from: ab */
    private int[] m79738ab() {
        int i;
        int i2 = -1;
        if (mo62628e()) {
            i2 = this.f64060g.mo5445j();
            i = this.f64060g.mo5447l();
        } else {
            i = -1;
        }
        return new int[]{i2, i};
    }

    /* renamed from: ac */
    private int[] m79739ac() {
        int i;
        int i2 = -1;
        if (mo62628e()) {
            i2 = this.f64060g.mo5445j();
            i = this.f64060g.mo5448m();
        } else {
            i = -1;
        }
        return new int[]{i2, i};
    }

    /* renamed from: ag */
    private void m79743ag() {
        if (this.f64072t != null) {
            this.f64072t.mo63265d();
            if (C25329c.m83232o(this.f64059f)) {
                this.f64064k.mo60134a("comment_dialog_state", (Object) Integer.valueOf(5));
            }
        }
    }

    /* renamed from: ah */
    private void m79744ah() {
        if (this.f64072t != null) {
            this.f64065l = this.f64058e.getOnShowHeightChangeListener();
            this.f64072t.setMOnShowHeightChangeListener(this.f64065l);
            this.f64072t.mo63264c();
        }
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        this.f64041L.mo59098S_();
        if (this.f64063j != null) {
            this.f64063j.mo62435d();
        }
        this.f64064k.mo60134a("comment_ad_view_state", (Object) Integer.valueOf(0));
    }

    /* renamed from: n */
    public final boolean mo63008n() {
        if (!C6861a.m21337f().isLogin()) {
            return false;
        }
        if (this.f64043N != null) {
            this.f64043N.mo64929a(new C28318an(20));
        }
        return true;
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f64063j != null) {
            this.f64063j.mo62439m();
        }
        m79741ae();
        m79702E();
        this.f64072t.setVisibleChangedListener(null);
    }

    public void onPause() {
        super.onPause();
        this.f64064k.mo60134a("comment_dialog_state", (Object) Integer.valueOf(8));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final /* synthetic */ void mo63099w() {
        try {
            C24220a.m79551a().disLikeAweme(this.f64059f, C25268bg.m83039a(this.f64059f));
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
    }

    /* renamed from: B */
    private boolean m79700B() {
        if (m79710M() || ((TextUtils.equals(this.f64058e.getEventType(), "homepage_familiar") || this.f64058e.isShowLikeUsers()) && (m79701D() > 0 || !C6307b.m19566a((Collection<T>) this.f64058e.getLikeUsers())))) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    private void m79703F() {
        this.f64064k.mo60134a("comment_aweme_and_params", (Object) new Pair(this.f64059f, this.f64058e));
        this.f64064k.mo60134a("comment_aweme_and_link", (Object) new Pair(this.f64059f, C25268bg.m83039a(this.f64059f)));
    }

    /* renamed from: J */
    private Long m79707J() {
        Aweme aweme = this.f64059f;
        if (aweme == null) {
            aweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(mo63083g());
        }
        if (aweme == null || aweme.getAwemeRawAd() == null || C25329c.m83224g(aweme)) {
            return null;
        }
        return aweme.getAwemeRawAd().getCreativeId();
    }

    /* renamed from: L */
    private void m79709L() {
        if (this.f64059f != null) {
            if (!this.f64059f.isAd() || this.f64058e.getAdCommentStruct() == null) {
                if (C25329c.m83232o(this.f64059f)) {
                    m79771y();
                }
                CommentStruct a = C24150f.m79358a(this.f64059f);
                if (a != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(a);
                    this.f64033C.mo58045a(arrayList);
                }
            }
        }
    }

    /* renamed from: P */
    private void m79713P() {
        if (C25329c.m83232o(this.f64059f)) {
            C24219a aVar = (C24219a) ServiceManager.get().getService(C24219a.class);
            Context context = getContext();
            LinkData a = C25268bg.m83039a(this.f64059f);
            if (aVar != null && context != null && a != null) {
                aVar.logAdLink(context, "show", a, this.f64059f, "");
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f64048S) {
            this.f64048S = false;
        } else if (mo62628e()) {
            m79766h(true);
        }
        this.f64064k.mo60134a("comment_dialog_state", (Object) Integer.valueOf(7));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final /* synthetic */ void mo63096t() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C42961az.m136380a(new C28321d(0).mo72000a(this.f64057ae).mo72002b(activity.hashCode()).mo72001a(mo63083g()));
            ((CommentViewModelImpl) C0069x.m159a(m79763e((Context) activity)).mo147a(CommentViewModelImpl.class)).f63521a.mo62821b();
        }
    }

    /* renamed from: I */
    private void m79706I() {
        if (m79717T() && !m79718U()) {
            this.f64061h.mo56976a(Integer.valueOf(1), mo63083g(), Integer.valueOf(2), "", this.f64058e.getInsertCids(), m79707J(), Integer.valueOf(C22915b.m75418a(mo63006l())), C28290d.m93044e());
        }
    }

    /* renamed from: K */
    private void m79708K() {
        this.f64078z.setVisibility(8);
        this.f64031A.setVisibility(8);
        this.f64075w.setVisibility(8);
        this.f64070r.setVisibility(8);
        this.f64032B.setVisibility(8);
        if (!m79717T()) {
            this.f64078z.setVisibility(0);
        } else if (m79718U()) {
            this.f64031A.setVisibility(0);
        } else {
            this.f64075w.setVisibility(0);
            this.f64070r.setVisibility(0);
            this.f64032B.setVisibility(0);
        }
        if (this.f64063j != null) {
            this.f64063j.mo62465a();
        }
        m79699A();
    }

    /* renamed from: O */
    private void m79712O() {
        if (!this.f64049T) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                C42961az.m136380a(new C28321d(1).mo72002b(activity.hashCode()));
                ((CommentViewModelImpl) C0069x.m159a(m79763e(getContext())).mo147a(CommentViewModelImpl.class)).f63521a.mo62820a();
                C23090a.f60962d = "1";
                this.f64049T = true;
                m79713P();
            } else {
                return;
            }
        }
        m79766h(true);
    }

    /* renamed from: aa */
    private void m79737aa() {
        String insertCids = this.f64058e.getInsertCids();
        if (!TextUtils.isEmpty(insertCids)) {
            int i = 0;
            String str = insertCids.split(",")[0];
            List a = this.f64033C.mo62312a();
            int size = a.size();
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                Comment comment = (Comment) a.get(i);
                if (TextUtils.equals(comment.getCid(), str) && comment.getStatus() != 0) {
                    this.f64071s.post(new C24324g(this, this.f64042M.mo62591a(comment), a, comment));
                    break;
                }
                i++;
            }
            if (i < 0) {
                C10761a.m31409e(C6399b.m19921a(), (int) R.string.a7x).mo25750a();
            }
        }
    }

    /* renamed from: ae */
    private void m79741ae() {
        this.f64037G.mo59134U_();
        this.f64037G.mo66535W_();
        this.f64061h.mo59134U_();
        this.f64061h.mo66535W_();
        this.f64039J.mo59134U_();
        this.f64039J.mo66535W_();
        this.f64062i.mo66535W_();
        this.f64062i.mo59134U_();
        this.f64038H.mo66535W_();
        this.f64038H.mo59134U_();
        if (this.f64040K != null) {
            this.f64040K.mo59134U_();
            this.f64040K.mo66535W_();
            this.f64040K = null;
        }
        this.f64047R = false;
    }

    public final void ae_() {
        if (this.f64033C != null) {
            List a = this.f64033C.mo62312a();
            if (m79757c(a)) {
                m79746b(1);
                m79749b((List<Comment>) new ArrayList<Comment>());
                this.f64041L.mo59099a(a, false);
                return;
            }
            if (!CommentKeyboardShowOptimization.showIfWithoutComment() && this.f64057ae == 0) {
                m79726a(this.f64057ae);
            }
            if (this.f64063j != null) {
                this.f64063j.mo62434c();
            }
            ArrayList arrayList = new ArrayList();
            m79761d((List<Comment>) arrayList);
            m79764e((List<Comment>) arrayList);
            m79746b(0);
            this.f64041L.mo63229a((List<Comment>) arrayList);
        }
    }

    public final void bd_() {
        if (this.f64061h != null) {
            this.f64061h.mo56976a(Integer.valueOf(4), mo63083g(), Integer.valueOf(2), "", "", m79707J(), Integer.valueOf(C22915b.m75418a(mo63006l())), C28290d.m93044e());
        }
    }

    /* renamed from: s */
    public final void mo63095s() {
        if (this.f64033C != null) {
            List a = this.f64033C.mo62312a();
            if (a != null) {
                User curUser = C6861a.m21337f().getCurUser();
                int[] iArr = {-1, -1};
                for (int i = 0; i < a.size(); i++) {
                    User user = ((Comment) a.get(i)).getUser();
                    if (user != null && TextUtils.equals(user.getUid(), curUser.getUid())) {
                        user.setNickname(curUser.getNickname());
                        user.setAvatarThumb(curUser.getAvatarThumb());
                        if (iArr[0] == -1) {
                            iArr[0] = i;
                        }
                        iArr[1] = i;
                    }
                }
                if (iArr[0] >= 0) {
                    this.f64033C.notifyItemRangeChanged(iArr[0], (iArr[1] - iArr[0]) + 1);
                }
            }
        }
    }

    /* renamed from: Q */
    private void m79714Q() {
        long j;
        this.f64049T = false;
        if (C24671f.m80869s().booleanValue()) {
            if (this.f64036F != null) {
                this.f64036F.mo64482a();
            }
        } else if (this.f64034D != null) {
            this.f64034D.mo62617a();
        }
        if (C25329c.m83232o(this.f64059f)) {
            this.f64064k.mo60134a("comment_dialog_state", (Object) Integer.valueOf(5));
        }
        C23090a.f60962d = "0";
        if (this.f64046Q && this.f64071s != null) {
            CommentStruct adCommentStruct = this.f64058e.getAdCommentStruct();
            if (adCommentStruct != null) {
                List a = this.f64033C.mo62312a();
                if (!C6307b.m19566a((Collection<T>) a) && !(a.get(0) instanceof CommentStruct)) {
                    a.add(0, adCommentStruct);
                }
            }
        }
        m79766h(false);
        if (C6384b.m19835a().mo15292a(ShrinkVideoWhenCommentShowExperiment.class, true, "enable_comment_video_shrink", C6384b.m19835a().mo15295d().enable_comment_video_shrink, false)) {
            j = 300;
        } else {
            j = 150;
        }
        this.f64071s.postDelayed(new C24333p(this), j - 30);
    }

    /* renamed from: ad */
    private void m79740ad() {
        int i;
        this.f64037G = new C24105d();
        this.f64037G.mo66536a(new C24103c());
        this.f64037G.mo66537a(this);
        this.f64038H = new C24120p();
        this.f64038H.mo66536a(new C24118o());
        this.f64038H.mo66537a(this);
        this.f64061h = new C24111h();
        C24109g gVar = new C24109g();
        if (this.f64059f != null) {
            AwemeStatistics statistics = this.f64059f.getStatistics();
            if (statistics != null) {
                i = statistics.getCommentCount();
                gVar.f63746f = i;
                this.f64061h.mo66536a(gVar);
                this.f64042M.mo62596a(this.f64058e.getInsertCids());
                ((C24109g) this.f64061h.mo66539h()).f63745e = this.f64042M;
                this.f64061h.mo66537a(this);
                this.f64039J = new C24108f();
                this.f64039J.mo66537a(this);
                this.f64039J.mo66536a(new C24106e());
                this.f64062i = new C24123s();
                this.f64062i.mo66537a(this);
                this.f64062i.mo66536a(new C24121q());
            }
        }
        i = 0;
        gVar.f63746f = i;
        this.f64061h.mo66536a(gVar);
        this.f64042M.mo62596a(this.f64058e.getInsertCids());
        ((C24109g) this.f64061h.mo66539h()).f63745e = this.f64042M;
        this.f64061h.mo66537a(this);
        this.f64039J = new C24108f();
        this.f64039J.mo66537a(this);
        this.f64039J.mo66536a(new C24106e());
        this.f64062i = new C24123s();
        this.f64062i.mo66537a(this);
        this.f64062i.mo66536a(new C24121q());
    }

    /* renamed from: x */
    private void m79770x() {
        this.f64033C = new CommentAdapter(this, this.f64058e);
        this.f64033C.mo58045a(new ArrayList());
        this.f64033C.mo62315a(this.f64059f);
        this.f64033C.f63554c = this;
        this.f64033C.f63553b = this.f64058e.getCommentTag();
        this.f64033C.mo66504a((C6905a) this);
        this.f64033C.f63555d = this.f64058e.getRequestId();
        this.f64033C.f67550q = C0683b.m2912c(C6399b.m19921a(), R.color.lz);
        this.f64033C.f63556e = this.f64042M;
        int i = 1;
        if (this.f64059f != null) {
            User author = this.f64059f.getAuthor();
            if (author != null && author.getCommentFilterStatus() == 1) {
                this.f64033C.mo66506d(R.string.bzc);
                this.f64033C.f63557f = true;
            }
        }
        if (this.f64063j != null) {
            this.f64063j.mo62504l();
        }
        this.f64071s.setAdapter(this.f64033C);
        m79709L();
        this.f64033C.f63559h = this.f64064k;
        this.f64041L.f64244a = mo63083g();
        int i2 = 0;
        if (m79717T() && !m79718U() && this.f64059f != null) {
            AwemeStatistics statistics = this.f64059f.getStatistics();
            if (statistics != null) {
                int commentCount = statistics.getCommentCount();
                if (commentCount > 0) {
                    if (this.f64058e.getAdCommentStruct() == null) {
                        i = 0;
                    }
                    i2 = commentCount + i;
                } else {
                    i2 = commentCount;
                }
            }
        }
        m79746b(i2);
        if (CommentKeyboardShowOptimization.showIfWithoutComment() && i2 == 0) {
            m79726a(i2);
        }
        m79704G();
    }

    /* renamed from: e */
    public final boolean mo62628e() {
        if (!isVisible() || this.f64072t == null || !this.f64072t.mo63262a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m79735a(boolean z) {
        f64027U = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo63077b(View view) {
        m79705H();
    }

    /* renamed from: a */
    public static void m79727a(C24187m mVar) {
        if (mVar != null) {
            mVar.mo62644a();
        }
    }

    /* renamed from: b */
    public static void m79748b(C24187m mVar) {
        if (mVar != null) {
            mVar.mo62645b();
        }
    }

    /* renamed from: c */
    private void m79752c(int i) {
        m79746b(this.f64057ae + i);
    }

    /* renamed from: e */
    private int m79762e(String str) {
        return this.f64042M.mo62609f(str);
    }

    /* renamed from: f */
    private int m79765f(String str) {
        return this.f64042M.mo62610g(str);
    }

    @C7709l
    public void onEvent(C28311ag agVar) {
        m79767i(true);
    }

    /* renamed from: b */
    public static void m79747b(Context context) {
        CommentListFragment d = m79758d(context);
        if (d != null) {
            d.m79743ag();
        }
    }

    /* renamed from: c */
    public static void m79753c(Context context) {
        CommentListFragment d = m79758d(context);
        if (d != null) {
            d.m79767i(d.mo62628e());
        }
    }

    /* renamed from: i */
    private void m79767i(boolean z) {
        if (this.f64072t != null) {
            this.f64072t.mo63261a(z);
        }
    }

    /* renamed from: e */
    public final void mo62542e(Exception exc) {
        f64030m = false;
        this.f64070r.mo25939d();
    }

    @C7709l
    public void onAwesomeSplashEvent(C25053a aVar) {
        if (aVar.f66130a != 4) {
            m79767i(true);
        }
    }

    @C7709l
    public void onEvent(C24560b bVar) {
        if (bVar != null && bVar.f64802a == 1) {
            m79743ag();
        }
    }

    public void onHiddenChanged(boolean z) {
        if (z) {
            m79714Q();
        } else {
            m79712O();
        }
        super.onHiddenChanged(z);
    }

    /* renamed from: a */
    private void m79732a(Aweme aweme) {
        this.f64059f = aweme;
        m79723Z();
    }

    /* renamed from: c */
    private static boolean m79757c(List<Comment> list) {
        if (C6307b.m19566a((Collection<T>) list) || !(list.get(0) instanceof CommentStruct)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static CommentListFragment m79758d(Context context) {
        FragmentActivity e = m79763e(context);
        if (e == null) {
            return null;
        }
        Fragment a = e.getSupportFragmentManager().mo2644a("comment");
        if (a instanceof CommentListFragment) {
            return (CommentListFragment) a;
        }
        return null;
    }

    /* renamed from: e */
    private static FragmentActivity m79763e(Context context) {
        while (context != null) {
            if (context instanceof FragmentActivity) {
                return (FragmentActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ C7581n mo63076b(Boolean bool) {
        if (bool.booleanValue()) {
            m79712O();
        } else {
            m79714Q();
        }
        return null;
    }

    /* renamed from: f */
    public final void mo63002f(boolean z) {
        C24130a.m79264a("input", mo63083g(), "0");
        if (z) {
            m79722Y();
        }
    }

    /* renamed from: g */
    public final void mo63003g(boolean z) {
        String str;
        if (z) {
            C29895c d = C6903bc.m21485d();
            String enterFrom = this.f64058e.getEnterFrom();
            Aweme j = mo63004j();
            String str2 = "list";
            if (this.f64068p != null) {
                str = "click_reply";
            } else {
                str = "click_original";
            }
            d.mo75954b(enterFrom, j, str2, str);
        }
    }

    @C7709l
    public void onAntiCrawlerEvent(C23281a aVar) {
        String str = aVar.f61317a;
        if (str == null) {
            return;
        }
        if (str.contains("/aweme/v1/comment/list/?") || str.contains("/aweme/v2/comment/list/?")) {
            C42961az.m136385f(aVar);
            m79705H();
        }
    }

    @C7709l
    public void onEvent(C24030b bVar) {
        if (this.f64071s != null && TextUtils.equals(bVar.f63543a, mo63083g())) {
            this.f64071s.mo5541b(0);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C24033a.m78867a("CommentListFragment onSaveInstanceState");
        bundle.putBoolean("should_hide", true);
        bundle.putSerializable("page_param", this.f64058e);
    }

    /* renamed from: b */
    private void m79746b(int i) {
        int i2;
        this.f64057ae = i;
        if (i == 0) {
            this.f64073u.setText(C6399b.m19921a().getString(R.string.dr));
        } else {
            TextView textView = this.f64073u;
            Context a = C6399b.m19921a();
            if (i > 1) {
                i2 = R.string.a9h;
            } else {
                i2 = R.string.a9i;
            }
            textView.setText(a.getString(i2, new Object[]{C30537o.m99738a((long) i)}));
        }
        C24147d.m79331a(mo63083g(), i);
    }

    /* renamed from: c */
    private int m79751c(boolean z) {
        int f = this.f64061h.mo62528f();
        if (!this.f64046Q) {
            return f;
        }
        List a = this.f64033C.mo62312a();
        if (!C6307b.m19566a((Collection<T>) a)) {
            if (z) {
                f++;
            } else if (!(a.get(0) instanceof CommentStruct)) {
                f++;
            }
        }
        if (this.f64059f == null || this.f64059f.getAdCommentStruct() == null || f <= 0) {
            return f;
        }
        return f + 1;
    }

    /* renamed from: d */
    private static CommentListFragment m79759d(VideoCommentPageParam videoCommentPageParam) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("id", videoCommentPageParam);
        CommentListFragment commentListFragment = new CommentListFragment();
        commentListFragment.setArguments(bundle);
        return commentListFragment;
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        ArrayList arrayList = new ArrayList();
        m79761d((List<Comment>) arrayList);
        m79764e((List<Comment>) arrayList);
        this.f64041L.mo63228a(exc, (List<Comment>) arrayList);
        if (this.f64063j != null) {
            this.f64063j.mo62434c();
        }
        if ((exc instanceof ApiServerException) && C6307b.m19566a((Collection<T>) this.f64042M.mo62592a())) {
            m79746b(0);
        }
    }

    /* renamed from: e */
    public final void mo63001e(boolean z) {
        if (z) {
            this.f64068p = null;
            this.f64047R = false;
        }
        m79722Y();
        this.f64041L.mo63230a(false, (Comment) null);
    }

    /* renamed from: f */
    public final void mo63082f(Comment comment) {
        if (isAdded() && this.f64063j != null) {
            this.f64047R = true;
            this.f64068p = comment;
            this.f64063j.mo62436f();
            C6903bc.m21485d().mo75950a(this.f64058e.getEnterFrom(), mo63004j(), "list", "click_reply_comment");
        }
    }

    /* renamed from: g */
    public final void mo63084g(Comment comment) {
        if (isAdded()) {
            if (this.f64068p == null || !this.f64068p.equals(comment)) {
                this.f64068p = comment;
                if (this.f64063j != null) {
                    this.f64063j.mo62430a(comment.getUser());
                }
            } else {
                this.f64068p = comment;
                this.f64075w.performClick();
            }
        }
    }

    /* renamed from: i */
    public final void mo63086i(Comment comment) {
        Comment comment2;
        int[] ab = m79738ab();
        this.f64041L.mo63233b(comment, ab[0], ab[1]);
        m79752c(1);
        Object[] objArr = new Object[2];
        objArr[0] = mo63083g();
        if (comment == null) {
            comment2 = null;
        } else {
            comment2 = comment.clone();
        }
        objArr[1] = comment2;
        C42961az.m136380a(new C24029a(3, objArr));
    }

    public void onCreate(Bundle bundle) {
        FragmentInstrumentation.onCreate("com.ss.android.ugc.aweme.comment.ui.CommentListFragment");
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f64058e = (VideoCommentPageParam) arguments.getSerializable("id");
        }
        this.f64063j = new C24093d(this, hashCode(), this);
    }

    @C7709l
    public void onEvent(C32953b bVar) {
        m79767i(true);
    }

    /* renamed from: c */
    private boolean m79756c(VideoCommentPageParam videoCommentPageParam) {
        Aweme aweme;
        boolean z;
        if (videoCommentPageParam == null || videoCommentPageParam.getAdCommentStruct() == null) {
            aweme = null;
        } else {
            aweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(videoCommentPageParam.getAdCommentStruct().getAid());
        }
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null || !aweme.getAwemeRawAd().isCommentAreaSwitch()) {
            z = false;
        } else {
            z = true;
        }
        if (this.f64046Q != z) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m79760d(View view) {
        this.f64064k = DataCenter.m75849a(C0069x.m157a((Fragment) this), (C0043i) this);
        this.f64052Y = WidgetManager.m75867a((Fragment) this, view);
        this.f64052Y.mo60153a(this.f64064k);
        C24330m mVar = new C24330m(this);
        this.f64053Z = C24220a.m79551a().getCommentAdWidget(mVar);
        this.f64054aa = C24220a.m79551a().getCommentHeaderWidget(mVar);
        this.f64052Y.mo60151a((int) R.id.a1_, this.f64053Z).mo60151a((int) R.id.a1i, this.f64054aa);
        this.f64063j.f63704g = this.f64064k;
    }

    /* renamed from: j */
    private void m79768j(Comment comment) {
        if (comment != null && comment.getReplyComments() != null) {
            List<TextExtraStruct> textExtra = comment.getTextExtra();
            if (!(textExtra == null || this.f64063j == null)) {
                for (TextExtraStruct textExtraStruct : textExtra) {
                    Iterator it = this.f64063j.f63699b.iterator();
                    while (it.hasNext()) {
                        User user = (User) it.next();
                        if (TextUtils.equals(user.getUid(), textExtraStruct.getUserId())) {
                            String str = null;
                            if (user.getAtType() == 3) {
                                str = "follow";
                            } else if (user.getAtType() == 1) {
                                str = "search";
                            } else if (user.getAtType() == 4) {
                                str = "recent";
                            }
                            if (!TextUtils.isEmpty(str)) {
                                C24130a.m79264a(str, mo63083g(), user.getUid());
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo63081e(Comment comment) {
        FragmentActivity activity = getActivity();
        if (activity != null && comment != null) {
            if (!C24334q.m80007a(activity)) {
                C10761a.m31409e((Context) activity, (int) R.string.cjs).mo25750a();
                return;
            }
            if (this.f64058e.getSource() == 0) {
                C24130a.m79262a("video_page", mo63083g());
            }
            if (this.f64037G != null && !TextUtils.isEmpty(comment.getCid())) {
                ((C24103c) this.f64037G.mo66539h()).f63735c = mo63083g();
                this.f64037G.mo56976a(comment.getCid());
                this.f64067o = comment;
            }
        }
    }

    /* renamed from: h */
    public final void mo63085h(Comment comment) {
        C24130a.m79259a(this.f64058e.getEnterFrom(), this.f64059f, comment.getCid(), "list", "click_report_button");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (C6399b.m19944t() || C6861a.m21337f().isLogin()) {
                C24220a.m79551a().report(activity, comment, m79716S());
                m79733a(this.f64058e.getEnterFrom(), this.f64059f, comment.getCid(), comment.getUser());
                return;
            }
            C32656f.m105742a((Activity) activity, "report", "");
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m79703F();
        this.f64075w.setKeyListener(null);
        this.f64060g = new WrapLinearLayoutManager(getActivity());
        this.f64071s.setLayoutManager(this.f64060g);
        m79740ad();
        if (bundle != null) {
            this.f64048S = bundle.getBoolean("should_hide", false);
            if (this.f64048S) {
                m79767i(false);
            }
            Serializable serializable = bundle.getSerializable("page_param");
            if (serializable instanceof VideoCommentPageParam) {
                this.f64058e = (VideoCommentPageParam) serializable;
                this.f64059f = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(mo63083g());
            }
        }
        m79770x();
    }

    @C7709l
    public void onEvent(C29876a aVar) {
        String str;
        if (aVar != null && aVar.f78475d == 1) {
            if (aVar.f78472a != null) {
                if (hashCode() == aVar.f78476e) {
                    int[] ab = m79738ab();
                    this.f64041L.mo63227a(aVar.f78472a.getComment(), ab[0], ab[1], true);
                }
                m79721X();
                m79752c(1);
            }
            if (aVar.f78476e == hashCode()) {
                C29895c d = C6903bc.m21485d();
                String enterFrom = this.f64058e.getEnterFrom();
                Aweme aweme = aVar.f78474c;
                String str2 = "list";
                if (this.f64047R) {
                    str = "click_reply_comment";
                } else {
                    str = "click_comment";
                }
                d.mo75951a(enterFrom, aweme, str2, str, true);
            }
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onReportCommentEvent(C27994k kVar) {
        if (C6399b.m19944t()) {
            try {
                if (TextUtils.equals("commentReportSuccess", kVar.f73730b.getString("eventName"))) {
                    String string = kVar.f73730b.getJSONObject("data").getString("object_id");
                    m79752c(-m79762e(string));
                    this.f64041L.mo62619a(string);
                    C42961az.m136380a(new C24029a(4, new Object[]{mo63083g(), string}));
                    C24109g gVar = (C24109g) this.f64061h.mo66539h();
                    if (gVar != null) {
                        CommentItemList commentItemList = (CommentItemList) gVar.getData();
                        if (!(commentItemList == null || commentItemList.replyStyle == 2)) {
                            this.f64041L.mo63235d(string);
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    private void m79726a(int i) {
        boolean z;
        if (mo62628e() || CommentKeyboardShowOptimization.showIfWithoutComment()) {
            if (!C24220a.m79551a().isNeedShowKeyboard(i) || !m79720W()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.f64063j != null && !this.f64063j.mo62500e()) {
                    this.f64063j.mo62477a(this.f64075w.getHint(), false);
                }
                C6907h.m21524a("keyboard_open", (Map) C22984d.m75611a().mo59973a("keyboard_open", "1").mo59970a("comment_cnt", i).f60753a);
                return;
            }
            C6907h.m21524a("keyboard_open", (Map) C22984d.m75611a().mo59973a("keyboard_open", "0").mo59970a("comment_cnt", i).f60753a);
        }
    }

    /* renamed from: b */
    private void m79749b(List<Comment> list) {
        if (this.f64059f != null) {
            if (!this.f64059f.isAd() || this.f64058e.getAdCommentStruct() == null) {
                List a = this.f64033C.mo62312a();
                if (m79757c(a)) {
                    list.addAll(0, a);
                }
            }
        }
    }

    /* renamed from: c */
    private void m79754c(View view) {
        this.f64070r = (DmtStatusView) view.findViewById(R.id.dav);
        this.f64071s = (RecyclerView) view.findViewById(R.id.cqd);
        this.f64072t = (CommentNestedLayout) view.findViewById(R.id.cwn);
        this.f64073u = (TextView) view.findViewById(R.id.title);
        this.f64074v = view.findViewById(R.id.jo);
        this.f64075w = (MentionEditText) view.findViewById(R.id.z8);
        this.f64076x = (ImageView) view.findViewById(R.id.ha);
        this.f64077y = (ImageView) view.findViewById(R.id.b8w);
        this.f64078z = view.findViewById(R.id.aog);
        this.f64031A = view.findViewById(R.id.z4);
        this.f64032B = (ViewGroup) view.findViewById(R.id.z9);
        this.f64034D = (ICommerceComtEggLayout) view.findViewById(R.id.a0y);
        this.f64036F = (CommerceEggLayout) view.findViewById(R.id.a0o);
        this.f64055ab = (FrameLayout) view.findViewById(R.id.am1);
        this.f64056ac = (ViewGroup) view.findViewById(R.id.a1i);
        this.f64035E = (TextView) view.findViewById(R.id.zn);
        m79699A();
    }

    /* renamed from: d */
    private void m79761d(List<Comment> list) {
        if (m79700B()) {
            CommentLikeUsersStruct commentLikeUsersStruct = new CommentLikeUsersStruct();
            commentLikeUsersStruct.setCommentType(220);
            commentLikeUsersStruct.setDialogHeight(this.f64055ab.getHeight());
            commentLikeUsersStruct.setEventType(this.f64058e.getEventType());
            commentLikeUsersStruct.setLikeUsers(this.f64058e.getLikeUsers());
            commentLikeUsersStruct.setLikeUsersCount(m79701D());
            commentLikeUsersStruct.setAweme(this.f64059f);
            list.add(0, commentLikeUsersStruct);
        }
    }

    /* renamed from: e */
    private void m79764e(List<Comment> list) {
        if (m79710M()) {
            Comment comment = new Comment();
            comment.setCommentType(221);
            if (this.f64059f != null) {
                comment.setAwemeId(this.f64059f.getAid());
                if (TextUtils.isEmpty(this.f64059f.getDesc())) {
                    comment.setText(getString(R.string.v6));
                } else {
                    comment.setText(this.f64059f.getDesc());
                }
                comment.setTextExtra(this.f64059f.getTextExtra());
                comment.setCreateTime((int) this.f64059f.getCreateTime());
                comment.setUser(this.f64059f.getAuthor());
            }
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    i = -1;
                    break;
                }
                Comment comment2 = (Comment) list.get(i);
                if (((Comment) list.get(i)).getCommentType() != 10 && ((Comment) list.get(i)).getCommentType() != 12 && comment2.getCommentType() != 220) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                list.add(comment);
                return;
            }
            list.add(i, comment);
        }
    }

    /* renamed from: h */
    private void m79766h(boolean z) {
        String insertCids;
        boolean z2 = z;
        if (z2) {
            if (this.f64050V == 0) {
                String enterFrom = this.f64058e.getEnterFrom();
                Aweme aweme = this.f64059f;
                String str = "list";
                int isLongItem = C24220a.m79551a().getIsLongItem(getActivity());
                if (TextUtils.isEmpty(this.f64058e.getInsertCids())) {
                    insertCids = null;
                } else {
                    insertCids = this.f64058e.getInsertCids();
                }
                C24130a.m79257a(enterFrom, aweme, str, isLongItem, insertCids, this.f64058e.getEnterMethod(), this.f64058e.getPlayListType(), this.f64058e.getPlayListIdKey(), this.f64058e.getPlayListId(), this.f64058e.getPreviousPage(), this.f64058e.getTabName(), C33230ac.m107216b(this.f64059f, this.f64058e.getPageType()), this.f64058e.getPoiObjectId(), this.f64058e.getPoiRegionType(), this.f64058e.getCreationId());
                this.f64050V = System.currentTimeMillis();
            }
        } else if (this.f64050V != 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f64050V;
            this.f64050V = 0;
            if (currentTimeMillis >= 0) {
                C24130a.m79263a(this.f64058e.getEnterFrom(), mo63083g(), currentTimeMillis);
            } else {
                return;
            }
        }
        if (this.f64033C != null) {
            this.f64033C.mo62319a(z2);
        }
        if (f64027U && this.f64033C != null && !C6307b.m19566a((Collection<T>) this.f64033C.mo62312a())) {
            this.f64071s.mo5541b(0);
        }
        f64027U = false;
    }

    /* renamed from: b */
    private boolean m79750b(VideoCommentPageParam videoCommentPageParam) {
        if (TextUtils.equals(videoCommentPageParam.getAid(), mo63083g()) && videoCommentPageParam.isCommentClose() == this.f64058e.isCommentClose() && videoCommentPageParam.isCommentLimited() == this.f64058e.isCommentLimited() && videoCommentPageParam.isEnableComment() == this.f64058e.isEnableComment() && !m79756c(videoCommentPageParam)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo63079d(Comment comment) {
        FragmentActivity activity = getActivity();
        if (activity != null && comment != null) {
            if (!C24334q.m80007a(activity)) {
                C10761a.m31409e((Context) activity, (int) R.string.cjs).mo25750a();
                return;
            }
            C6907h.m21524a("click_share_comment_offsite", (Map) C22984d.m75611a().mo59973a("author_id", this.f64059f.getAuthorUid()).mo59973a("group_id", mo63083g()).mo59973a("enter_from", mo63006l()).mo59973a("comment_id", comment.getCid()).f60753a);
            if (this.f64038H != null && !TextUtils.isEmpty(comment.getCid())) {
                ((C24118o) this.f64038H.mo66539h()).f63766c = comment.getAwemeId();
                ((C24118o) this.f64038H.mo66539h()).f63765b = comment.getCid();
                this.f64038H.mo56976a(comment.getCid(), comment.getAwemeId());
            }
            this.f64069q = comment;
            this.f64070r.mo25942f();
        }
    }

    /* renamed from: a */
    private void m79730a(CommentPrompt commentPrompt) {
        if (commentPrompt.getType() > 0) {
            this.f64035E.setVisibility(0);
            this.f64035E.setText(commentPrompt.getContent());
            LayoutParams layoutParams = (LayoutParams) this.f64073u.getLayoutParams();
            layoutParams.setMargins(0, C23486n.m77122a(12.0d), 0, C23486n.m77122a(4.0d));
            this.f64073u.setLayoutParams(layoutParams);
            return;
        }
        this.f64035E.setVisibility(8);
        LayoutParams layoutParams2 = (LayoutParams) this.f64073u.getLayoutParams();
        layoutParams2.setMargins(0, C23486n.m77122a(12.0d), 0, C23486n.m77122a(12.0d));
        this.f64073u.setLayoutParams(layoutParams2);
    }

    /* renamed from: c */
    public final void mo62998c(Comment comment) {
        int[] ab = m79738ab();
        if (this.f64068p != null && (!this.f64047R || !TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId()) || comment.getCommentType() == 0)) {
            comment.setReplyToUserId(Comment.getAuthorUid(this.f64068p));
            if (this.f64047R && comment.getCommentType() != 0) {
                comment.setReplyToUserName(C43122ff.m136753A(this.f64068p.getUser()));
            } else if (comment.getCommentType() == 2 && !TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                comment.setReplyToUserName(C43122ff.m136753A(this.f64068p.getUser()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f64068p);
            comment.setReplyComments(arrayList);
        }
        if (!C24191m.f63849a.mo62635e(comment)) {
            C24191m.f63849a.mo62631a(comment, this.f64068p);
        }
        this.f64041L.mo63226a(comment, ab[0], ab[1]);
        m79721X();
        if (C24671f.m80869s().booleanValue()) {
            if (!(this.f64036F == null || this.f64059f == null)) {
                String text = comment.getText();
                C24641b a = C24655d.m80818a(text);
                this.f64036F.mo64483a(a, C24655d.m80815a(this.f64059f, a, text, mo63006l()));
                this.f64074v.bringToFront();
            }
        } else if (this.f64034D != null) {
            this.f64034D.mo62618a(comment.getText(), this.f64059f, mo63006l());
            this.f64074v.bringToFront();
        }
    }

    /* renamed from: d */
    public final void mo62623d(Exception exc) {
        if (!TextUtils.isEmpty(this.f64044O)) {
            C24130a.m79260a(this.f64058e.getEnterFrom(), this.f64059f, (String) null, false, "list", this.f64045P);
        }
    }

    /* renamed from: a */
    private void m79731a(VideoCommentPageParam videoCommentPageParam) {
        boolean b = m79750b(videoCommentPageParam);
        this.f64058e = videoCommentPageParam;
        if (b || this.f64071s.getChildCount() == 0 || this.f64046Q) {
            m79742af();
            if (this.f64042M != null) {
                this.f64042M.mo62607d();
                this.f64041L.ae_();
            }
            m79770x();
            m79772z();
            m79703F();
            m79730a(new CommentPrompt());
            return;
        }
        if (this.f64058e.isForceRefresh()) {
            m79706I();
        }
        m79708K();
        m79703F();
    }

    /* renamed from: b */
    public final void mo62997b(Comment comment) {
        String str;
        Comment comment2 = null;
        if (this.f64059f != null && this.f64059f.isAd()) {
            if (TextUtils.equals(mo63006l(), "general_search")) {
                C24219a a = C24220a.m79551a();
                Context context = getContext();
                Aweme aweme = this.f64059f;
                if (!C25329c.m83221d(this.f64059f) || this.f64058e == null || !this.f64058e.isEnterFullScreen()) {
                    str = "result_ad";
                } else {
                    str = "draw_ad";
                }
                a.sendAdLog(context, aweme, str, "comment");
            } else {
                C24220a.m79551a().logFeedRawAdComment(getContext(), this.f64059f, null);
            }
        }
        m79768j(comment);
        int[] ab = m79738ab();
        this.f64041L.mo63233b(comment, ab[0], ab[1]);
        if (this.f64059f != null) {
            C28292b.m93052a().mo71978c(mo63083g());
        }
        m79752c(1);
        Object[] objArr = new Object[2];
        objArr[0] = mo63083g();
        if (comment != null) {
            comment2 = comment.clone();
        }
        objArr[1] = comment2;
        C42961az.m136380a(new C24029a(3, objArr));
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
        this.f64041L.mo59109c(exc);
    }

    /* renamed from: d */
    public final void mo62999d(String str) {
        C24130a.m79266a(str, this.f64058e.getEnterFrom(), mo63083g(), m79716S());
    }

    /* renamed from: c */
    private void m79755c(C24187m mVar, Comment comment) {
        boolean z;
        String str;
        boolean z2;
        if (!C6861a.m21337f().isLogin()) {
            C32656f.m105747a((Fragment) this, mo63006l(), "reply_comment", C42914ab.m136242a().mo104633a("login_title", C6399b.m19921a().getString(R.string.a7i)).mo104633a("group_id", mo63083g()).mo104633a("log_pb", C33230ac.m107234j(mo63083g())).f111445a);
            return;
        }
        boolean equals = TextUtils.equals(Comment.getAuthorUid(comment), C6861a.m21337f().getCurUserId());
        if (!equals) {
            String str2 = "reply_comment";
            String l = mo63006l();
            String g = mo63083g();
            if (this.f64068p != null) {
                str = this.f64068p.getCid();
            } else {
                str = "";
            }
            String str3 = str;
            String S = m79716S();
            boolean isMyProfile = this.f64058e.isMyProfile();
            if (this.f64059f == null || this.f64059f.getAwemeType() != 2) {
                z2 = false;
            } else {
                z2 = true;
            }
            C24130a.m79269a(str2, l, g, str3, S, isMyProfile, z2);
        }
        boolean equals2 = TextUtils.equals(this.f64058e.getAuthorUid(), C6861a.m21337f().getCurUserId());
        if (comment.getStickPosition() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f64063j != null) {
            final C24187m mVar2 = mVar;
            final Comment comment2 = comment;
            this.f64063j.mo62427a(comment.getCommentType(), true, z, equals, equals2, !comment.isTranslated(), comment, new C24091b() {
                /* renamed from: a */
                public final void mo62452a() {
                    CommentListFragment.this.mo63079d(comment2);
                }

                /* renamed from: b */
                public final void mo62453b() {
                    CommentListFragment.this.mo63081e(comment2);
                }

                /* renamed from: c */
                public final void mo62454c() {
                    CommentListFragment.this.mo63084g(comment2);
                }

                /* renamed from: d */
                public final void mo62455d() {
                    CommentListFragment.this.mo63082f(comment2);
                }

                /* renamed from: e */
                public final void mo62456e() {
                    CommentListFragment.this.mo63085h(comment2);
                }

                /* renamed from: i */
                public final void mo62460i() {
                    CommentListFragment.m79727a(mVar2);
                }

                /* renamed from: j */
                public final void mo62461j() {
                    CommentListFragment.m79748b(mVar2);
                }

                /* renamed from: h */
                public final void mo62459h() {
                    C24130a.m79252a(CommentListFragment.this.f64058e.getEnterFrom());
                }

                /* renamed from: g */
                public final void mo62458g() {
                    CommentListFragment.this.f64063j.mo62429a(comment2, CommentListFragment.this.f64058e.getEnterFrom());
                }

                /* renamed from: f */
                public final void mo62457f() {
                    CommentListFragment.this.f64063j.mo62428a(comment2);
                    C24130a.m79265a(CommentListFragment.this.f64058e.getEnterFrom(), Comment.getAuthorUid(comment2), comment2.getCid(), CommentListFragment.this.f64059f);
                }

                /* renamed from: k */
                public final void mo62462k() {
                    CommentListFragment.this.f64062i.mo56976a(comment2.getAwemeId(), comment2.getCid(), Boolean.valueOf(true));
                }

                /* renamed from: l */
                public final void mo62463l() {
                    CommentListFragment.this.f64062i.mo56976a(comment2.getAwemeId(), comment2.getCid(), Boolean.valueOf(false));
                }
            });
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m79754c(view);
        Context context = view.getContext();
        int c = C0683b.m2912c(context, R.color.abk);
        DmtTextView dmtTextView = new DmtTextView(new C1156d(context, R.style.ss));
        dmtTextView.setTextColor(c);
        dmtTextView.setText(R.string.c46);
        dmtTextView.setOnClickListener(new C24323f(this));
        DmtTextView dmtTextView2 = new DmtTextView(new C1156d(context, R.style.ss));
        dmtTextView2.setTextColor(c);
        dmtTextView2.setText(R.string.a8q);
        this.f64070r.setBuilder(C10803a.m31631a(context).mo25963b((View) dmtTextView2).mo25966c((View) dmtTextView).mo25965c(0));
        if (this.f64071s instanceof FpsRecyclerView) {
            ((FpsRecyclerView) this.f64071s).setLabel("comment_list");
        }
        C42980bm.m136450a("comment_list").mo104686a(this.f64071s);
        this.f64072t.setVisibleChangedListener(new C24326i(this));
        this.f64072t.setPreScrollChangeListener(new C24327j(this));
        this.f64074v.setOnClickListener(new C24328k(this));
        this.f64042M = new C24163l();
        C24336s sVar = new C24336s(getActivity(), this.f64070r, this.f64071s, this.f64042M, this.f64072t);
        this.f64041L = sVar;
        if (TextUtils.equals("Meizu", Build.BRAND) && TextUtils.equals("m1note", Build.BOARD) && TextUtils.equals("M463C", Build.MODEL) && TextUtils.equals("m1 note", Build.PRODUCT) && VERSION.SDK_INT == 19) {
            this.f64032B.setPadding(this.f64032B.getPaddingLeft(), this.f64032B.getPaddingTop(), this.f64032B.getPaddingRight(), C23482j.m77104e(C6399b.m19921a()));
        }
        this.f64071s.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                int l = CommentListFragment.this.f64060g.mo5447l();
                int A = CommentListFragment.this.f64060g.mo5744A();
                if (l >= 8 && A - l < 8 && ((C24109g) CommentListFragment.this.f64061h.mo66539h()).isHasMore()) {
                    CommentListFragment.this.bd_();
                }
                if (C25329c.m83232o(CommentListFragment.this.f64059f)) {
                    CommentListFragment.this.f64064k.mo60134a("comment_dialog_state", (Object) Integer.valueOf(3));
                }
            }
        });
        this.f64075w.setFocusable(false);
        this.f64063j.mo62431a(this.f64075w, (View) this.f64076x, (View) this.f64077y, mo63083g(), this.f64058e.getEnterFrom());
        this.f64075w.setTextSize(2, 15.0f);
        m79760d(view);
        this.f64063j.f63703f = new C24329l(this);
        m79744ah();
    }

    /* renamed from: b */
    public final void mo62449b(C24187m mVar, Comment comment) {
        if (comment != null && mo62628e()) {
            C24130a.m79276c(this.f64058e.getEnterFrom(), mo63083g(), comment.getCid());
            if (C24220a.m79551a().shouldReplyDirectly() && !C24191m.f63849a.mo62632a(comment)) {
                m79755c(mVar, comment);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ni, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }

    /* renamed from: a */
    private static CommentListFragment m79725a(FragmentActivity fragmentActivity, Aweme aweme, VideoCommentPageParam videoCommentPageParam) {
        C0608j supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        CommentListFragment commentListFragment = (CommentListFragment) supportFragmentManager.mo2644a("comment");
        if (commentListFragment == null) {
            CommentListFragment d = m79759d(videoCommentPageParam);
            d.m79732a(aweme);
            supportFragmentManager.mo2645a().mo2586a(R.id.ase, d, "comment").mo2606d();
            return d;
        }
        commentListFragment.m79732a(aweme);
        commentListFragment.m79731a(videoCommentPageParam);
        if (videoCommentPageParam.isScrollToTop() && commentListFragment.f64071s != null) {
            commentListFragment.f64071s.mo5541b(0);
        }
        commentListFragment.m79744ah();
        return commentListFragment;
    }

    /* renamed from: a */
    public static CommentListFragment m79724a(Activity activity, Aweme aweme, VideoCommentPageParam videoCommentPageParam) {
        Aweme aweme2 = aweme;
        VideoCommentPageParam videoCommentPageParam2 = videoCommentPageParam;
        if (activity == null || aweme2 == null || activity.isFinishing()) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f64029ad <= 300) {
            return null;
        }
        f64029ad = elapsedRealtime;
        try {
            if (C6384b.m19835a().mo15292a(CommentAutoAddLayoutExperiment.class, true, "comment_auto_add_layout", C6384b.m19835a().mo15295d().comment_auto_add_layout, false)) {
                return m79745b((FragmentActivity) activity, aweme2, videoCommentPageParam2);
            }
            return m79725a((FragmentActivity) activity, aweme2, videoCommentPageParam2);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("CommentListFragment.showCommentList() error in try/catch. ErrorMessage: ");
            sb.append(e.getMessage());
            C24033a.m78867a(sb.toString());
            C6921a.m21554a(e);
            return null;
        }
    }

    /* renamed from: b */
    private static CommentListFragment m79745b(FragmentActivity fragmentActivity, Aweme aweme, VideoCommentPageParam videoCommentPageParam) {
        C0608j supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        CommentListFragment commentListFragment = (CommentListFragment) supportFragmentManager.mo2644a("comment");
        View findViewById = fragmentActivity.findViewById(R.id.zf);
        if (commentListFragment == null || findViewById == null) {
            if (commentListFragment != null) {
                supportFragmentManager.mo2645a().mo2587a((Fragment) commentListFragment).mo2606d();
            }
            if (findViewById == null) {
                FrameLayout frameLayout = new FrameLayout(fragmentActivity);
                frameLayout.setId(R.id.zf);
                ((ViewGroup) fragmentActivity.findViewById(16908290)).addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            }
            CommentListFragment d = m79759d(videoCommentPageParam);
            d.m79732a(aweme);
            supportFragmentManager.mo2645a().mo2586a(R.id.zf, d, "comment").mo2606d();
            return d;
        }
        commentListFragment.m79732a(aweme);
        commentListFragment.m79731a(videoCommentPageParam);
        if (videoCommentPageParam.isScrollToTop() && commentListFragment.f64071s != null) {
            commentListFragment.f64071s.mo5541b(0);
        }
        commentListFragment.m79744ah();
        return commentListFragment;
    }

    /* renamed from: a */
    private void m79728a(Comment comment, int i, int i2, String str) {
        m79729a(comment, i, i2, str, false);
    }

    /* renamed from: a */
    private void m79729a(Comment comment, int i, int i2, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z2;
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData("comment");
        if (i == 2) {
            String str7 = "post_reply_comment";
            String l = mo63006l();
            String g = mo63083g();
            if (comment != null) {
                str6 = comment.getCid();
            } else {
                str6 = "";
            }
            String S = m79716S();
            boolean isMyProfile = this.f64058e.isMyProfile();
            if (this.f64059f == null || this.f64059f.getAwemeType() != 2) {
                z2 = false;
            } else {
                z2 = true;
            }
            C24130a.m79269a(str7, l, g, str6, S, isMyProfile, z2);
        }
        if (TextUtils.equals(this.f64058e.getEventType(), "homepage_follow")) {
            C29447a e = C6903bc.m21486e();
            Aweme aweme = this.f64059f;
            String str8 = "homepage_follow";
            String str9 = "list";
            if (comment != null) {
                str5 = comment.getCid();
            } else {
                str5 = "";
            }
            e.mo75374b(aweme, str8, str9, str5);
        }
        if (comment == null || TextUtils.isEmpty(comment.getLabelText())) {
            str2 = "";
        } else {
            str2 = String.valueOf(comment.getLabelType());
        }
        String str10 = str2;
        if (comment == null || comment.getRelationLabel() == null) {
            str3 = "";
        } else {
            str3 = String.valueOf(comment.getRelationLabel().getType());
        }
        String str11 = str3;
        Aweme aweme2 = this.f64059f;
        String enterFrom = this.f64058e.getEnterFrom();
        String a = C24130a.m79247a(comment);
        if (comment != null) {
            str4 = comment.getCid();
        } else {
            str4 = "";
        }
        C24131b.m79281a(aweme2, str, enterFrom, a, str4, "list", String.valueOf(i2), this.f64058e.getIsLongItem(), this.f64058e.getEnterMethod(), this.f64058e.getPlayListType(), this.f64058e.getPlayListIdKey(), this.f64058e.getPlayListId(), z, this.f64058e.isEnterFullScreen(), this.f64058e.getTabName(), C33230ac.m107216b(this.f64059f, this.f64058e.getPageType()), this.f64058e.getPoiObjectId(), this.f64058e.getPoiRegionType(), this.f64058e.getPreviousPage(), str10, str11, this.f64058e.getCreationId());
        if (this.f64043N != null) {
            this.f64043N.mo64929a(new C28318an(7));
        }
    }
}
