package com.p280ss.android.ugc.aweme.flowfeed.p1257vh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.HollowTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.HollowTextView.C23418a;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23472a;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.commerce.model.SimplePromotion;
import com.p280ss.android.ugc.aweme.commerce.service.logs.C24469e;
import com.p280ss.android.ugc.aweme.commerce.service.logs.C24471f;
import com.p280ss.android.ugc.aweme.commerce.service.logs.C24477i;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.widget.DiggLayout;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.p280ss.android.ugc.aweme.feed.model.AwemeLinkLabel;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.model.SimpleShopSeedingModel;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28511z;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28826b;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LiveCircleView;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LongPressLayout;
import com.p280ss.android.ugc.aweme.feed.widget.C29050c;
import com.p280ss.android.ugc.aweme.feed.widget.C29052e;
import com.p280ss.android.ugc.aweme.feed.widget.C29053f;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedShowCommentAB;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedShowForwardAB;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedVideoCutTypeAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29365a;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29368c;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29370e;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29371f;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29373g;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29382k;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedCommentLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedCommentLayout.C29395a;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedTagLayout2;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29556e;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.FollowUserBtn;
import com.p280ss.android.ugc.aweme.forward.p1271e.C29896a;
import com.p280ss.android.ugc.aweme.forward.p1271e.C29902c;
import com.p280ss.android.ugc.aweme.forward.p1271e.C29903d;
import com.p280ss.android.ugc.aweme.live.feedpage.C32517b;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.poi.widget.RatingBar;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41656f;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42975bi;
import com.p280ss.android.ugc.aweme.utils.C43110ev;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43346d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.vh.BaseFollowViewHolder */
public class BaseFollowViewHolder extends C1293v implements OnAttachStateChangeListener, C6310a, C29433v {

    /* renamed from: A */
    HollowTextView f77485A;

    /* renamed from: B */
    public FollowFeedTagLayout2 f77486B;

    /* renamed from: C */
    protected MentionTextView f77487C;

    /* renamed from: D */
    protected ImageView f77488D;

    /* renamed from: E */
    protected TextView f77489E;

    /* renamed from: F */
    ImageView f77490F;

    /* renamed from: G */
    TextView f77491G;

    /* renamed from: H */
    protected ImageView f77492H;

    /* renamed from: I */
    protected TextView f77493I;

    /* renamed from: J */
    DiggLayout f77494J;

    /* renamed from: K */
    protected TextView f77495K;

    /* renamed from: L */
    protected View f77496L;

    /* renamed from: M */
    protected TextView f77497M;

    /* renamed from: N */
    protected View f77498N;

    /* renamed from: O */
    protected TextView f77499O;

    /* renamed from: P */
    FollowUserBtn f77500P;

    /* renamed from: Q */
    public int f77501Q;

    /* renamed from: R */
    protected FollowFeedCommentLayout f77502R;

    /* renamed from: S */
    LongPressLayout f77503S;

    /* renamed from: T */
    ImageView f77504T;

    /* renamed from: U */
    protected TextView f77505U;

    /* renamed from: V */
    TextView f77506V;

    /* renamed from: W */
    protected ViewGroup f77507W;

    /* renamed from: X */
    protected View f77508X;

    /* renamed from: Y */
    protected ImageView f77509Y;

    /* renamed from: Z */
    public String f77510Z;

    /* renamed from: a */
    private View f77511a;

    /* renamed from: aa */
    public int f77512aa;

    /* renamed from: ab */
    public String f77513ab;

    /* renamed from: ac */
    public String f77514ac;

    /* renamed from: ad */
    public String f77515ad;

    /* renamed from: ae */
    protected boolean f77516ae;

    /* renamed from: af */
    protected C29376j f77517af;

    /* renamed from: ag */
    protected C6309f f77518ag;

    /* renamed from: ah */
    protected C29896a f77519ah;

    /* renamed from: ai */
    protected C21744b f77520ai;

    /* renamed from: aj */
    public boolean f77521aj;

    /* renamed from: ak */
    public boolean f77522ak = true;

    /* renamed from: al */
    public boolean f77523al = true;

    /* renamed from: am */
    public String f77524am;

    /* renamed from: an */
    public String f77525an;

    /* renamed from: ao */
    protected boolean f77526ao = false;

    /* renamed from: ap */
    public String f77527ap;

    /* renamed from: aq */
    protected C29548a f77528aq;

    /* renamed from: ar */
    protected WidgetManager f77529ar;

    /* renamed from: as */
    protected boolean f77530as = false;

    /* renamed from: at */
    protected C29382k f77531at = new C29382k() {
        /* renamed from: a */
        public final void mo75110a() {
            BaseFollowViewHolder.this.mo75244T();
        }

        /* renamed from: b */
        public final void mo75112b() {
            BaseFollowViewHolder.this.mo75245U();
        }

        /* renamed from: d */
        public final Rect mo75129d() {
            return BaseFollowViewHolder.this.mo75246V();
        }

        /* renamed from: e */
        public final void mo75130e() {
            BaseFollowViewHolder.this.mo75242R();
        }

        /* renamed from: f */
        public final void mo75131f() {
            BaseFollowViewHolder.this.mo75243S();
        }

        /* renamed from: g */
        public final void mo75132g() {
            BaseFollowViewHolder.this.mo75262ac();
        }

        /* renamed from: a */
        public final void mo75111a(int i) {
            BaseFollowViewHolder.this.mo75264b(i);
        }

        /* renamed from: b */
        public final void mo75127b(int i) {
            BaseFollowViewHolder.this.mo75251a(i);
        }
    };

    /* renamed from: au */
    protected Runnable f77532au = new Runnable() {
        public final void run() {
            if (BaseFollowViewHolder.this.f77522ak && BaseFollowViewHolder.this.f77502R != null) {
                BaseFollowViewHolder.this.f77502R.mo75185a();
            }
        }
    };

    /* renamed from: av */
    public boolean f77533av = false;

    /* renamed from: aw */
    public MotionEvent f77534aw;

    /* renamed from: ax */
    public MotionEvent f77535ax;

    /* renamed from: ay */
    protected OnTouchListener f77536ay = new OnTouchListener() {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    if (BaseFollowViewHolder.this.f77518ag.hasMessages(0)) {
                        BaseFollowViewHolder.this.f77518ag.removeMessages(0);
                    }
                    if (C29373g.m96484a(BaseFollowViewHolder.this.f77534aw, BaseFollowViewHolder.this.f77535ax, motionEvent, BaseFollowViewHolder.this.mo75261ab())) {
                        BaseFollowViewHolder.this.f77533av = true;
                        BaseFollowViewHolder.this.mo75268c(BaseFollowViewHolder.this.f77546j);
                    } else {
                        BaseFollowViewHolder.this.f77533av = false;
                    }
                    if (BaseFollowViewHolder.this.f77534aw != null) {
                        BaseFollowViewHolder.this.f77534aw.recycle();
                    }
                    BaseFollowViewHolder.this.f77534aw = MotionEvent.obtain(motionEvent);
                    break;
                case 1:
                    if (!BaseFollowViewHolder.this.f77533av && BaseFollowViewHolder.this.f77534aw != null && !C29373g.m96483a(0, BaseFollowViewHolder.this.f77534aw, motionEvent, BaseFollowViewHolder.this.mo75261ab())) {
                        BaseFollowViewHolder.this.f77518ag.sendMessageDelayed(BaseFollowViewHolder.this.f77518ag.obtainMessage(0), (((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime()) + BaseFollowViewHolder.this.f77534aw.getEventTime());
                    }
                    if (BaseFollowViewHolder.this.f77535ax != null) {
                        BaseFollowViewHolder.this.f77535ax.recycle();
                    }
                    BaseFollowViewHolder.this.f77535ax = MotionEvent.obtain(motionEvent);
                    break;
                case 2:
                    if (C29373g.m96483a(0, BaseFollowViewHolder.this.f77534aw, motionEvent, BaseFollowViewHolder.this.mo75261ab())) {
                        BaseFollowViewHolder.this.f77518ag.removeMessages(0);
                        break;
                    }
                    break;
            }
            return false;
        }
    };

    /* renamed from: az */
    private C7326g<C32517b> f77537az;

    /* renamed from: b */
    private View f77538b;

    /* renamed from: c */
    private View f77539c;

    /* renamed from: d */
    private View f77540d;

    /* renamed from: e */
    private Rect f77541e = new Rect();

    /* renamed from: f */
    private int[] f77542f = new int[2];

    /* renamed from: g */
    private boolean f77543g;

    /* renamed from: h */
    protected Aweme f77544h;

    /* renamed from: i */
    public C34145b f77545i;

    /* renamed from: j */
    public Aweme f77546j;

    /* renamed from: k */
    protected List<Comment> f77547k;

    /* renamed from: l */
    protected List<User> f77548l;

    /* renamed from: m */
    public C28826b f77549m;

    /* renamed from: n */
    public C21747e f77550n;

    /* renamed from: o */
    protected RemoteImageView f77551o;

    /* renamed from: p */
    protected View f77552p;

    /* renamed from: q */
    protected FrameLayout f77553q;

    /* renamed from: r */
    public AvatarImageView f77554r;

    /* renamed from: s */
    protected AnimationImageView f77555s;

    /* renamed from: t */
    protected AvatarImageView f77556t;

    /* renamed from: u */
    protected LiveCircleView f77557u;

    /* renamed from: v */
    protected TextView f77558v;

    /* renamed from: w */
    public TextView f77559w;

    /* renamed from: x */
    protected TextView f77560x;

    /* renamed from: y */
    RatingBar f77561y;

    /* renamed from: z */
    LinearLayout f77562z;

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo75240P() {
    }

    /* renamed from: S */
    public void mo75243S() {
    }

    /* renamed from: U */
    public void mo75245U() {
        mo75314al();
    }

    /* renamed from: Y */
    public void mo75249Y() {
    }

    /* renamed from: Z */
    public void mo75250Z() {
        this.f77516ae = false;
    }

    /* renamed from: a */
    public void mo75251a(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo75252a(Context context, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo68500a(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public void mo75260aa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public void mo75262ac() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ad */
    public void mo75263ad() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo75267c(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo68504d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo75276g(String str) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo75278h(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo68530k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo75288p() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo75289q() {
        return false;
    }

    /* renamed from: r */
    public String mo75290r() {
        return this.f77510Z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo75292t() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo75293u() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo75259a(FollowFeedLayout followFeedLayout) {
        this.f77551o = (RemoteImageView) followFeedLayout.findViewById(R.id.b7x);
        this.f77552p = followFeedLayout.findViewById(R.id.bhn);
        this.f77553q = (FrameLayout) followFeedLayout.findViewById(R.id.bgo);
        this.f77554r = (AvatarImageView) followFeedLayout.findViewById(R.id.e8m);
        this.f77555s = (AnimationImageView) followFeedLayout.findViewById(R.id.j6);
        this.f77556t = (AvatarImageView) followFeedLayout.findViewById(R.id.e8s);
        this.f77557u = (LiveCircleView) followFeedLayout.findViewById(R.id.e9k);
        this.f77558v = (TextView) followFeedLayout.findViewById(R.id.dsz);
        this.f77559w = (TextView) followFeedLayout.findViewById(R.id.e4i);
        this.f77560x = (TextView) followFeedLayout.findViewById(R.id.e0c);
        this.f77561y = (RatingBar) followFeedLayout.findViewById(R.id.cnm);
        this.f77562z = (LinearLayout) followFeedLayout.findViewById(R.id.a40);
        this.f77486B = (FollowFeedTagLayout2) followFeedLayout.findViewById(R.id.ano);
        this.f77487C = (MentionTextView) followFeedLayout.findViewById(R.id.dt5);
        this.f77488D = (ImageView) followFeedLayout.findViewById(R.id.a8u);
        this.f77489E = (TextView) followFeedLayout.findViewById(R.id.dtf);
        this.f77490F = (ImageView) followFeedLayout.findViewById(R.id.b7p);
        this.f77491G = (TextView) followFeedLayout.findViewById(R.id.ds6);
        this.f77492H = (ImageView) followFeedLayout.findViewById(R.id.d5a);
        this.f77493I = (TextView) followFeedLayout.findViewById(R.id.e1s);
        this.f77494J = (DiggLayout) followFeedLayout.findViewById(R.id.a8y);
        this.f77495K = (TextView) followFeedLayout.findViewById(R.id.e1w);
        this.f77496L = followFeedLayout.findViewById(R.id.bsh);
        this.f77497M = (TextView) followFeedLayout.findViewById(R.id.d6_);
        this.f77498N = followFeedLayout.findViewById(R.id.d6a);
        this.f77499O = (TextView) followFeedLayout.findViewById(R.id.e1v);
        this.f77500P = (FollowUserBtn) followFeedLayout.findViewById(R.id.anj);
        this.f77502R = (FollowFeedCommentLayout) followFeedLayout.findViewById(R.id.bhj);
        this.f77503S = (LongPressLayout) followFeedLayout.findViewById(R.id.bvy);
        this.f77504T = (ImageView) followFeedLayout.findViewById(R.id.b9h);
        this.f77505U = (TextView) followFeedLayout.findViewById(R.id.e31);
        this.f77506V = (TextView) followFeedLayout.findViewById(R.id.dux);
        this.f77507W = (ViewGroup) followFeedLayout.findViewById(R.id.bhm);
        this.f77508X = followFeedLayout.findViewById(R.id.bm8);
        this.f77511a = followFeedLayout.findViewById(R.id.bgx);
        this.f77538b = followFeedLayout.findViewById(R.id.bh7);
        this.f77539c = followFeedLayout.findViewById(R.id.bjr);
        this.f77540d = followFeedLayout.findViewById(R.id.bgk);
        this.f77509Y = (ImageView) followFeedLayout.findViewById(R.id.b90);
        this.f77501Q = followFeedLayout.getContext().getResources().getDimensionPixelSize(R.dimen.he);
        if (this.f77507W != null) {
            this.f77507W.setOnClickListener(new C29413b(this));
        }
        if (this.f77511a != null) {
            this.f77511a.setOnClickListener(new C29417f(this));
        }
        if (this.f77539c != null) {
            this.f77539c.setOnClickListener(new C29418g(this));
        }
        if (this.f77538b != null) {
            this.f77538b.setOnClickListener(new C29419h(this));
        }
        if (this.f77495K != null) {
            this.f77495K.setOnClickListener(new C29420i(this));
        }
        if (this.f77496L != null) {
            this.f77496L.setOnClickListener(new C29421j(this));
        }
        if (this.f77540d != null) {
            this.f77540d.setOnClickListener(new C29422k(this));
        }
        if (this.f77509Y != null) {
            this.f77509Y.setOnClickListener(new C29423l(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo68535a(C21744b bVar, C21743a aVar) {
        if (this.f77488D != null) {
            C29896a aVar2 = new C29896a(bVar.mo58074c(), this.f77488D, this.f77489E, aVar, mo75289q());
            this.f77519ah = aVar2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo75254a(View view, float f, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = (int) C9738o.m28708b(mo75261ab(), f);
        layoutParams.bottomMargin = (int) C9738o.m28708b(mo75261ab(), f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo75255a(View view, float f, float f2, float f3, float f4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = (int) C9738o.m28708b(mo75261ab(), f);
        layoutParams.bottomMargin = (int) C9738o.m28708b(mo75261ab(), f2);
        layoutParams.leftMargin = (int) C9738o.m28708b(mo75261ab(), f3);
        layoutParams.rightMargin = (int) C9738o.m28708b(mo75261ab(), f4);
    }

    /* renamed from: a */
    public final void mo75257a(Aweme aweme) {
        this.f77544h = aweme;
        this.f77546j.setRepostFromGroupId(this.f77544h.getAid());
        this.f77546j.setRepostFromUserId(this.f77544h.getAuthorUid());
    }

    /* renamed from: a */
    public void mo68518a(Aweme aweme, List<Comment> list, List<User> list2, C21747e eVar) {
        this.f77546j = aweme;
        this.f77530as = C25329c.m83221d(aweme);
        this.itemView.setTag(aweme);
        this.f77547k = list;
        this.f77550n = eVar;
        this.f77548l = list2;
        if (this.f77546j != null) {
            mo75292t();
            mo68499a();
        }
        mo75241Q();
        this.f77543g = false;
    }

    /* renamed from: a */
    public final void mo75258a(AwemeStatus awemeStatus, UrlModel urlModel) {
        if (this.f77546j.getStatus() != null) {
            this.f77546j.getStatus().setPrivateStatus(awemeStatus.getPrivateStatus());
        }
        this.f77546j.setLabelPrivate(urlModel);
        m96621a(urlModel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo75256a(View view, TextExtraStruct textExtraStruct) {
        if (this.f77550n != null) {
            this.f77550n.mo58082a(view, textExtraStruct, this.itemView, this.f77546j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo68503a(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int[] iArr = new int[2];
        int a = C9738o.m28691a(mo75261ab());
        int b = C9738o.m28709b(mo75261ab());
        float b2 = C9738o.m28708b(mo75261ab(), 16.0f);
        float f = ((float) i2) / ((float) i);
        if (C6384b.m19835a().mo15287a(FollowFeedVideoCutTypeAB.class, true, "follow_feed_video_cut_type", C6384b.m19835a().mo15295d().follow_feed_video_cut_type, 1) == 1) {
            m96619a(i, i2, a, b, b2, f, iArr);
        } else {
            mo86991a(a, b, b2, f, iArr);
        }
        layoutParams.width = iArr[0];
        layoutParams.height = iArr[1];
        view.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo75236L() {
        this.f77551o.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void mo75237M() {
        this.f77551o.setVisibility(8);
    }

    /* renamed from: T */
    public void mo75244T() {
        this.f77518ag.removeCallbacks(this.f77532au);
    }

    /* renamed from: ab */
    public final Context mo75261ab() {
        return this.f77520ai.mo58074c();
    }

    /* renamed from: af */
    private boolean mo75307af() {
        if (mo75306ae() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: aj */
    private void mo75312aj() {
        if (this.f77550n != null) {
            this.f77550n.mo58077a(mo75261ab(), this.f77546j);
        }
    }

    /* renamed from: al */
    private void mo75314al() {
        C29370e Q = mo75241Q();
        if (Q != null) {
            Q.mo75092a(mo75290r());
        }
    }

    /* renamed from: am */
    private void mo75315am() {
        C29370e Q = mo75241Q();
        if (Q != null) {
            Q.mo75098b(mo75290r());
        }
    }

    /* renamed from: e */
    private void mo68520e() {
        this.f77529ar = WidgetManager.m75869a((FragmentActivity) mo75261ab(), this.itemView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo75229E() {
        this.f77494J.removeAllViews();
        this.f77519ah.mo75955a(this.f77546j);
    }

    /* renamed from: K */
    public void mo75235K() {
        List J = mo75234J();
        if (this.f77550n != null) {
            this.f77550n.mo58084a(this.f77546j, J);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo75238N() {
        if (this.f77549m != null) {
            this.f77549m.mo74074c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo75239O() {
        if (this.f77549m != null) {
            this.f77549m.mo74075d();
        }
    }

    /* renamed from: R */
    public void mo75242R() {
        if (this.f77486B != null) {
            this.f77486B.mo75211f();
        }
    }

    /* renamed from: X */
    public void mo75248X() {
        this.f77516ae = true;
        if (!mo75247W()) {
            mo75315am();
        }
    }

    /* renamed from: G */
    public final void mo75231G() {
        if (mo75289q() && this.f77502R != null) {
            this.f77502R.mo75193d();
        }
        mo75229E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final boolean mo75232H() {
        if (C25329c.m83221d(this.f77546j) && this.f77546j.getAwemeRawAd().getOutFlowButtonStyle() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final boolean mo75247W() {
        C29370e Q = mo75241Q();
        if (Q == null || !Q.f77398c.mo104684c(16777216)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public void mo68534n() {
        mo75229E();
        if (!mo75289q()) {
            mo75230F();
            mo68531l();
        }
        mo68532m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo75286o() {
        if (!this.f77521aj || !this.f77520ai.mo58072a()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo75291s() {
        if (this.f77546j != null) {
            C29371f.m96475a().mo75104b(C29370e.m96465a(this.f77520ai.mo58075d(), this.f77546j.getAid()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo75298z() {
        if (this.f77492H != null) {
            if (C21740a.m72687c(this.f77546j)) {
                this.f77492H.setImageResource(R.drawable.a7q);
            } else {
                this.f77492H.setImageResource(R.drawable.a7u);
            }
        }
    }

    /* renamed from: ae */
    private int mo75306ae() {
        if (!C25329c.m83221d(this.f77546j) || !TextUtils.equals(mo75290r(), "general_search")) {
            return -1;
        }
        AwemeRawAd awemeRawAd = this.f77546j.getAwemeRawAd();
        if (awemeRawAd.getLinkLabel() == null) {
            return -1;
        }
        return awemeRawAd.getLinkLabel().getStyleType();
    }

    /* renamed from: ah */
    private void mo75310ah() {
        C29365a.m96457a(this.f77490F);
        if (this.f77550n != null) {
            this.f77550n.mo75057a(this.itemView, this.f77546j, this.f77548l, this.f77543g, "click_comment_icon");
        }
        mo75252a(mo75261ab(), 2);
    }

    /* renamed from: ai */
    private void mo75311ai() {
        if (!this.f77519ah.f78523d) {
            mo75252a(mo75261ab(), 1);
        }
        this.f77519ah.mo75957a(mo75290r(), System.currentTimeMillis() - mo75241Q().f77401f);
    }

    /* renamed from: ak */
    private void mo75313ak() {
        if (this.f77550n != null) {
            if (C6903bc.m21484c().mo59240a()) {
                C10761a.m31410e(mo75261ab(), mo75261ab().getString(R.string.e5m)).mo25750a();
                return;
            }
            this.f77550n.mo75056a(this.itemView, this.f77546j);
        }
    }

    /* renamed from: g */
    private void mo68522g() {
        if (this.f77500P.getVisibility() == 0 && this.f77546j != null && this.f77546j.getAuthor() != null) {
            this.f77528aq.mo75558a(this.f77546j.getAuthor());
        }
    }

    /* renamed from: i */
    private boolean mo68524i() {
        if (!C25329c.m83221d(this.f77546j) || mo75232H()) {
            return false;
        }
        if (!mo75307af() && TextUtils.isEmpty(this.f77546j.getAwemeRawAd().getButtonText())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo75227C() {
        if (!this.f77522ak || !this.f77523al) {
            this.f77508X.setVisibility(8);
        } else {
            this.f77508X.setVisibility(0);
        }
        if ("poi_page".equalsIgnoreCase(mo75290r())) {
            if (this.f77523al) {
                this.f77508X.setVisibility(0);
                return;
            }
            this.f77508X.setVisibility(8);
        }
    }

    /* renamed from: F */
    public final void mo75230F() {
        if (!mo75289q()) {
            String d = C21740a.m72688d(this.f77546j);
            if (!TextUtils.isEmpty(d)) {
                this.f77491G.setText(d);
            }
        } else if (this.f77502R != null) {
            this.f77502R.mo75191c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo75233I() {
        if (this.f77554r != null) {
            this.f77554r.setOnClickListener(new C29414c(this));
        }
        if (this.f77556t != null) {
            this.f77556t.setOnClickListener(new C29415d(this));
        }
        if (this.f77559w != null) {
            this.f77559w.setOnClickListener(new C29416e(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public List<String> mo75234J() {
        ArrayList arrayList = new ArrayList();
        if (mo75289q()) {
            arrayList.add(mo75261ab().getString(R.string.ds3));
        }
        if (!C28482e.m93606a(this.f77546j) && C43122ff.m136762a(this.f77546j)) {
            arrayList.add(mo75261ab().getString(R.string.fll));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final C29370e mo75241Q() {
        C29370e eVar;
        if (this.f77546j != null) {
            eVar = C29371f.m96475a().mo75106c(C29370e.m96465a(this.f77520ai.mo58075d(), this.f77546j.getAid()));
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return mo68521f();
        }
        return eVar;
    }

    /* renamed from: V */
    public final Rect mo75246V() {
        this.itemView.getLocationOnScreen(this.f77542f);
        this.f77541e.set(this.f77542f[0], this.f77542f[1], this.f77542f[0] + this.itemView.getWidth(), this.f77542f[1] + this.itemView.getHeight());
        return this.f77541e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo75294v() {
        if (this.f77546j == null || this.f77546j.getAuthor() == null || TextUtils.isEmpty(this.f77546j.getAuthor().getRelationLabel())) {
            this.f77505U.setVisibility(8);
            return;
        }
        this.f77505U.setVisibility(0);
        this.f77505U.setText(this.f77546j.getAuthor().getRelationLabel());
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo75295w() {
        if (C21740a.m72685b(this.f77546j)) {
            this.f77492H.setAlpha(0.5f);
            this.f77492H.setEnabled(false);
            return;
        }
        this.f77492H.setAlpha(1.0f);
        this.f77492H.setEnabled(true);
    }

    /* renamed from: ag */
    private void mo75309ag() {
        if (!C6903bc.m21484c().mo59241a((int) R.string.e5s)) {
            if (this.f77546j == null || !this.f77546j.getAwemeControl().canForward()) {
                C10761a.m31409e(mo75261ab(), (int) R.string.ah6).mo25750a();
            } else if (!C25329c.m83221d(this.f77546j) || C25329c.m83224g(this.f77546j)) {
                C29365a.m96457a(this.f77504T);
                if (this.f77550n != null) {
                    this.f77550n.mo58083a(this.f77546j);
                }
            } else {
                C10761a.m31409e(mo75261ab(), (int) R.string.e3).mo25750a();
            }
        }
    }

    /* renamed from: an */
    private void mo75316an() {
        if (!(this.f77546j == null || this.f77546j.getAuthor() == null || !this.f77546j.getAuthor().isLive())) {
            User author = this.f77546j.getAuthor();
            C41989d.m133490b(mo75261ab(), 0, author.getRequestId(), author.getUid(), author.roomId, mo75290r());
            C41989d.m133483a(author.getUid(), author.roomId, mo75290r(), "video_head", author.getRequestId(), -1, C6399b.m19946v(), this.f77546j.getAid());
        }
    }

    /* renamed from: f */
    private C29370e mo68521f() {
        C29370e eVar = null;
        if (this.f77546j == null) {
            return null;
        }
        String a = C29370e.m96465a(this.f77520ai.mo58075d(), this.f77546j.getAid());
        if (this.f77522ak) {
            if (this.f77546j != null) {
                eVar = new C29370e(this.f77546j, new C42975bi(1), a);
            }
            return eVar;
        }
        eVar = new C29370e(this.f77546j, new C42975bi(256), a);
        if (!TextUtils.isEmpty(this.f77524am)) {
            C29902c a2 = C29903d.m97930a().mo75965a(this.f77524am);
            if (a2 != null) {
                eVar.f77402g = a2.f78544c;
            }
        }
        C29371f.m96475a().mo75103a(a, eVar);
        return eVar;
    }

    /* renamed from: h */
    private HollowTextView mo68523h() {
        C23418a aVar = new C23418a();
        aVar.f61714b = C23486n.m77122a(12.0d);
        aVar.f61715c = C23481i.m77088a(R.color.l8);
        aVar.f61716d = C23486n.m77122a(4.0d);
        aVar.f61719g = true;
        aVar.f61718f = true;
        aVar.f61720h = true;
        aVar.f61717e = true;
        HollowTextView hollowTextView = new HollowTextView(mo75261ab(), aVar);
        hollowTextView.setPadding(C23486n.m77122a(5.0d), C23486n.m77122a(3.5d), C23486n.m77122a(5.0d), C23486n.m77122a(3.5d));
        return hollowTextView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo75226B() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request_id", this.f77546j.getRequestId());
        } catch (JSONException unused) {
        }
        this.f77486B.setVisibility(0);
        this.f77486B.setPageType(this.f77512aa);
        this.f77486B.setFollowPageType(this.f77513ab);
        this.f77486B.mo75207a(this.f77546j, (Activity) mo75261ab(), this.f77510Z, jSONObject);
        if ("poi_page".equalsIgnoreCase(this.f77510Z)) {
            this.f77486B.mo75209d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo68502b() {
        String c = C43110ev.m136734c(mo75261ab(), this.f77546j.getCreateTime() * 1000);
        if (!(this.f77546j.getOpenPlatformStruct() == null || this.f77546j.getOpenPlatformStruct().getRawData() == null || this.f77546j.getOpenPlatformStruct().getRawData().getBase() == null || TextUtils.isEmpty(this.f77546j.getOpenPlatformStruct().getRawData().getBase().getAppName()))) {
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append("  ");
            sb.append(this.f77546j.getOpenPlatformStruct().getRawData().getBase().getAppName());
            c = sb.toString();
        }
        this.f77558v.setText(c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo68536c() {
        if (this.f77502R != null) {
            if (this.f77522ak) {
                this.f77502R.setVisibility(0);
                this.f77502R.setPageType(this.f77512aa);
                this.f77502R.setEventType(this.f77510Z);
                this.f77502R.mo75188a(this.f77546j, this.f77547k, this.f77548l, (C29395a) this.f77550n);
            } else {
                this.f77502R.setVisibility(8);
            }
            if (this.f77519ah != null) {
                this.f77519ah.f78521b = this.f77502R.getLayoutLikes();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo68531l() {
        switch (C21740a.m72692h(this.f77546j)) {
            case 2:
                this.f77493I.setVisibility(0);
                this.f77493I.setTextSize(1, 10.0f);
                this.f77493I.setText(R.string.foy);
                return;
            case 3:
                this.f77493I.setVisibility(0);
                this.f77493I.setTextSize(1, 12.0f);
                this.f77493I.setText(C21740a.m72690f(this.f77546j));
                return;
            default:
                this.f77493I.setVisibility(8);
                return;
        }
    }

    /* renamed from: m */
    public void mo68532m() {
        if (!mo75289q()) {
            if (!C6384b.m19835a().mo15292a(FollowFeedShowForwardAB.class, true, "aweme_follow_show_forward", C6384b.m19835a().mo15295d().aweme_follow_show_forward, false) || (!C25329c.m83221d(this.f77546j) && !C28482e.m93615h(this.f77546j))) {
                this.f77507W.setVisibility(8);
                return;
            }
            this.f77507W.setVisibility(0);
            this.f77506V.setText(C21740a.m72691g(this.f77546j));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo75297y() {
        if (this.f77509Y != null) {
            if (this.f77526ao || C6399b.m19944t()) {
                this.f77509Y.setVisibility(8);
            } else if (!TextUtils.equals(this.f77520ai.mo58075d(), "key_container_follow") && !TextUtils.equals(this.f77520ai.mo58075d(), "key_container_dynamic") && !TextUtils.equals(this.f77520ai.mo58075d(), "key_container_familiar")) {
                this.f77509Y.setVisibility(8);
            } else if (C21740a.m72687c(this.f77546j) || !C43122ff.m136762a(this.f77546j)) {
                this.f77509Y.setVisibility(8);
            } else {
                this.f77509Y.setVisibility(0);
            }
        }
    }

    /* renamed from: D */
    public void mo75228D() {
        if (this.f77485A == null) {
            this.f77485A = mo68523h();
        }
        this.f77562z.removeAllViews();
        this.f77562z.addView(this.f77485A);
        if (C21740a.m72687c(this.f77546j)) {
            if (C43168s.m136912d(this.f77546j)) {
                this.f77562z.setVisibility(0);
                this.f77485A.setVisibility(0);
                this.f77485A.setText(mo75261ab().getString(R.string.e6w));
            } else if (C43168s.m136911c(this.f77546j)) {
                this.f77562z.setVisibility(0);
                this.f77485A.setVisibility(0);
                this.f77485A.setText(mo75261ab().getString(R.string.b_v));
            } else {
                this.f77562z.setVisibility(8);
                this.f77562z.removeAllViews();
            }
        } else if (C43168s.m136911c(this.f77546j)) {
            this.f77562z.setVisibility(0);
            this.f77485A.setVisibility(0);
            this.f77485A.setText(mo75261ab().getString(R.string.b_v));
        } else {
            this.f77485A.setVisibility(8);
            this.f77562z.removeAllViews();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo68525j() {
        if (!C6399b.m19944t() && !this.f77546j.isHashTag()) {
            C21740a.m72693i(this.f77546j);
        }
        this.f77487C.setMaxSize(C28511z.m93720a());
        String desc = this.f77546j.getDesc();
        if (!TextUtils.isEmpty(desc)) {
            SpannableString f = mo75273f(desc);
            this.f77487C.setText(f);
            this.f77487C.setVisibility(0);
            this.f77487C.setSpanSize(C9738o.m28690a(mo75261ab(), 15.0f));
            this.f77487C.setSpanStyle(1);
            this.f77487C.setOnSpanClickListener(new C29424m(this));
            this.f77487C.mo105184a(C29368c.m96459a(this.f77546j), (C43346d) new C41656f(true));
            this.f77487C.setMovementMethod(LinkMovementMethod.getInstance());
            this.f77487C.setHighlightColor(this.f77487C.getResources().getColor(R.color.ac4));
            if (f != null) {
                this.f77487C.setMaxSize(f.length() + C6903bc.m21489h().mo85872b(mo75261ab(), this.f77546j, (TextView) this.f77487C));
            }
            C6903bc.m21489h().mo85869a(mo75261ab(), this.f77546j, (TextView) this.f77487C);
            return;
        }
        this.f77487C.setText("");
        if (C6903bc.m21489h().mo85872b(mo75261ab(), this.f77546j, (TextView) this.f77487C) > 0) {
            C6903bc.m21489h().mo85869a(mo75261ab(), this.f77546j, (TextView) this.f77487C);
            this.f77487C.setVisibility(0);
            return;
        }
        this.f77487C.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo75225A() {
        boolean z;
        if (this.f77546j.getStatus() == null || !this.f77546j.getStatus().isWithGoods() || this.f77546j.getPromotion() == null) {
            z = false;
        } else {
            z = true;
        }
        SimpleShopSeedingModel simpleShopSeedingModel = this.f77546j.getSimpleShopSeedingModel();
        if (z) {
            this.f77495K.setVisibility(0);
            this.f77496L.setVisibility(8);
            this.f77495K.setText(this.f77546j.getPromotion().getShortTitle());
            if (this.f77546j.getPromotion() != null) {
                SimplePromotion promotion = this.f77546j.getPromotion();
                new C24469e().mo63568g(this.f77546j.getAuthorUid()).mo63561a("video_cart_tag").mo63563b(promotion.getPromotionId()).mo63560a(Integer.valueOf(promotion.getPromotionSource())).mo63567f(this.f77510Z).mo63564c(this.f77546j.getAid()).mo63562b(Integer.valueOf(this.f77546j.getFollowStatus())).mo63536a(BusinessComponentServiceUtils.getSearchAllService().mo68310a(mo75261ab(), this.f77546j)).mo63537a();
                new C24471f().mo63576f(this.f77546j.getAuthorUid()).mo63572b("video_cart_tag").mo63573c(promotion.getPromotionId()).mo63569a(Integer.valueOf(promotion.getPromotionSource())).mo63577g(this.f77510Z).mo63574d(this.f77546j.getAid()).mo63575e("video_play").mo63578h(null).mo63570a(this.f77510Z).mo63571b(Integer.valueOf(this.f77546j.getFollowStatus())).mo63536a(BusinessComponentServiceUtils.getSearchAllService().mo68310a(mo75261ab(), this.f77546j)).mo63537a();
            }
        } else if (simpleShopSeedingModel == null || TextUtils.isEmpty(simpleShopSeedingModel.getTitle())) {
            this.f77495K.setVisibility(8);
            this.f77496L.setVisibility(8);
        } else {
            this.f77495K.setVisibility(8);
            this.f77496L.setVisibility(0);
            this.f77499O.setText(simpleShopSeedingModel.getTitle());
            if (!TextUtils.isEmpty(simpleShopSeedingModel.getSeedTag())) {
                this.f77497M.setVisibility(0);
                this.f77498N.setVisibility(0);
                this.f77497M.setText(simpleShopSeedingModel.getSeedTag());
            } else {
                this.f77497M.setVisibility(8);
                this.f77498N.setVisibility(8);
            }
            new C24477i().mo63587a(this.f77546j.getAid()).mo63588b(this.f77546j.getAuthorUid()).mo63589c(simpleShopSeedingModel.getSeedId()).mo63590d(simpleShopSeedingModel.getTitle()).mo63591e(this.f77510Z).mo63537a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo75296x() {
        UrlModel urlModel;
        UrlModel urlModel2;
        boolean z;
        mo75297y();
        mo68522g();
        String str = null;
        if (this.f77546j.getAuthor() != null) {
            mo75298z();
            if (this.f77522ak) {
                this.f77552p.setVisibility(0);
                if (this.f77549m == null) {
                    if (this.f77546j.getAuthor() == null || !this.f77546j.getAuthor().isLive()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f77549m = new C28826b(z, this.f77556t, this.f77554r, this.f77557u);
                }
                if (this.f77537az == null) {
                    this.f77537az = new C7326g<C32517b>() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void accept(C32517b bVar) throws Exception {
                            if (TextUtils.equals(BaseFollowViewHolder.this.f77546j.getAuthor().getUid(), String.valueOf(bVar.f84785a))) {
                                BaseFollowViewHolder.this.f77546j.getAuthor().roomId = bVar.f84786b;
                                if (!BaseFollowViewHolder.this.f77546j.getAuthor().isLive()) {
                                    BaseFollowViewHolder.this.mo75296x();
                                }
                            }
                        }
                    };
                }
                if (C21740a.m72683a(this.f77546j)) {
                    AvatarImageView avatarImageView = this.f77556t;
                    if (this.f77546j.getAuthor() == null) {
                        urlModel2 = null;
                    } else {
                        urlModel2 = this.f77546j.getAuthor().getAvatarThumb();
                    }
                    C23323e.m76506a((RemoteImageView) avatarImageView, urlModel2, this.f77501Q, this.f77501Q);
                    C6903bc.m21486e().mo75356a(this.f77546j);
                } else {
                    AvatarImageView avatarImageView2 = this.f77554r;
                    if (this.f77546j.getAuthor() == null) {
                        urlModel = null;
                    } else {
                        urlModel = this.f77546j.getAuthor().getAvatarThumb();
                    }
                    C23323e.m76506a((RemoteImageView) avatarImageView2, urlModel, this.f77501Q, this.f77501Q);
                }
                this.f77549m.mo74071a(this.f77546j.getAuthor(), getClass(), this.f77537az);
            } else {
                this.f77552p.setVisibility(8);
            }
        }
        if (this.f77546j.getAuthor() != null) {
            if (this.f77546j.getAuthor() != null) {
                str = this.f77546j.getAuthor().getRemarkName();
            }
            if (!TextUtils.isEmpty(str)) {
                this.f77559w.setText(this.f77546j.getAuthor().getRemarkName());
            } else {
                this.f77559w.setText(C23472a.m77059a(this.itemView.getContext(), this.f77546j.getAuthor().getNickname(), this.f77546j.getNicknamePosition()));
            }
        }
        if (this.f77561y != null) {
            if (TextUtils.isEmpty(this.f77546j.getRateScore()) || !"rate".equalsIgnoreCase(this.f77515ad)) {
                this.f77561y.setVisibility(8);
            } else {
                this.f77561y.setVisibility(0);
                this.f77561y.setStar(Float.parseFloat(this.f77546j.getRateScore()));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo68499a() {
        if (this.f77546j != null) {
            mo75293u();
            mo75296x();
            mo75294v();
            mo75295w();
            mo75226B();
            mo68502b();
            mo68525j();
            mo68534n();
            mo75233I();
            mo75228D();
            mo68536c();
            mo75225A();
            mo75227C();
            mo68530k();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo75275g(View view) {
        mo75235K();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo75277h(View view) {
        mo75313ak();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo75279i(View view) {
        mo75312aj();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final /* synthetic */ void mo75283m(View view) {
        mo75310ah();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo75284n(View view) {
        mo75309ag();
    }

    /* renamed from: b */
    public void mo75264b(int i) {
        mo75316an();
        mo75314al();
    }

    public void handleMsg(Message message) {
        if (message.what == 0) {
            mo75260aa();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo75281k(View view) {
        mo75311ai();
    }

    /* renamed from: b */
    public final void mo75265b(Aweme aweme) {
        this.f77519ah.mo75958b(aweme);
    }

    /* renamed from: c */
    public final void mo75266c(int i) {
        if (this.f77502R != null) {
            this.f77502R.mo75186a(0);
            this.f77543g = true;
        }
    }

    /* renamed from: d */
    public final void mo75269d(int i) {
        if (this.f77502R != null) {
            this.f77502R.mo75189b(i);
            this.f77543g = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ void mo75285o(View view) {
        this.f77518ag.sendMessage(this.f77518ag.obtainMessage(0));
    }

    public void onViewAttachedToWindow(View view) {
        this.f77521aj = true;
        this.f77517af.mo75115a(this.f77531at);
        mo75241Q();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo75282l(View view) {
        C29365a.m96457a(this.f77492H);
        if (this.f77550n != null) {
            this.f77550n.mo58078a(view, this.itemView, this.f77546j);
        }
        mo75252a(mo75261ab(), 3);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void mo75280j(View view) {
        C29365a.m96457a(this.f77495K);
        if (this.f77550n != null) {
            this.f77550n.mo58086b(view, this.itemView, this.f77546j);
        }
    }

    /* renamed from: e */
    public final void mo75271e(int i) {
        if (this.f77502R != null) {
            this.f77502R.mo75192c(i);
            this.f77543g = true;
        }
    }

    public void onViewDetachedFromWindow(View view) {
        this.f77521aj = false;
        mo75315am();
        this.f77517af.mo75117b(this.f77531at);
        this.f77518ag.removeCallbacksAndMessages(null);
        if (this.f77494J != null) {
            this.f77494J.removeAllViews();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo75270d(View view) {
        if (!C25329c.m83221d(this.f77546j) || !mo75276g("name")) {
            if (this.f77550n != null) {
                this.f77550n.mo58087b(view, this.itemView, this.f77546j, this.f77546j.getAuthor());
            }
            mo75252a(mo75261ab(), 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo75272e(View view) {
        if (this.f77550n != null) {
            this.f77550n.mo58079a(view, this.itemView, this.f77546j, this.f77546j.getAuthor());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo75274f(View view) {
        if (!C27326a.m89578a(view)) {
            if (!C25329c.m83221d(this.f77546j) || !mo75276g("photo")) {
                if (this.f77550n != null) {
                    this.f77550n.mo58079a(view, this.itemView, this.f77546j, this.f77546j.getAuthor());
                }
                mo75252a(mo75261ab(), 0);
            }
        }
    }

    /* renamed from: c */
    public final void mo75268c(Aweme aweme) {
        String str;
        if (aweme != null && aweme.getStatus() != null) {
            if (!C6861a.m21337f().isLogin()) {
                if (this.f77546j != null) {
                    str = this.f77546j.getAid();
                } else {
                    str = "";
                }
                C32656f.m105743a(C6405d.m19984g(), this.f77510Z, "click_like", C42914ab.m136242a().mo104633a("group_id", str).mo104633a("log_pb", C33230ac.m107234j(str)).f111445a);
                return;
            }
            this.f77519ah.mo75956a(aweme, System.currentTimeMillis() - mo75241Q().f77401f);
            if (!this.f77519ah.f78523d) {
                mo75252a(mo75261ab(), 1);
            }
            if (aweme.getStatus().getPrivateStatus() != 1) {
                this.f77494J.mo66634a(this.f77534aw.getX(), this.f77534aw.getY());
            }
        }
    }

    /* renamed from: a */
    private void m96621a(UrlModel urlModel) {
        AwemeLabelModel awemeLabelModel;
        if (urlModel != null) {
            awemeLabelModel = new AwemeLabelModel();
            awemeLabelModel.setLabelType(1);
            awemeLabelModel.setUrlModels(urlModel);
        } else {
            awemeLabelModel = null;
        }
        if (!(this.f77546j == null || this.f77546j.videoLabels == null)) {
            int i = 0;
            if (this.f77546j.videoLabels.size() != 0) {
                while (i < this.f77546j.videoLabels.size()) {
                    if (((AwemeLabelModel) this.f77546j.videoLabels.get(i)).getLabelType() != 11 && ((AwemeLabelModel) this.f77546j.videoLabels.get(i)).getLabelType() != 1) {
                        i++;
                    } else if (awemeLabelModel == null) {
                        this.f77546j.videoLabels.remove(i);
                        return;
                    } else {
                        this.f77546j.videoLabels.set(i, awemeLabelModel);
                        return;
                    }
                }
            } else if (awemeLabelModel != null) {
                this.f77546j.videoLabels.add(0, awemeLabelModel);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final SpannableString mo75273f(String str) {
        SpannableString spannableString;
        C29053f fVar;
        String str2 = str;
        int length = str.length();
        if (mo68524i()) {
            if (str.length() > C28511z.m93720a()) {
                String substring = str2.substring(0, C28511z.m93720a() - 3);
                StringBuilder sb = new StringBuilder();
                sb.append(substring);
                sb.append("...");
                str2 = sb.toString();
            }
            length = str2.length();
            if (mo75307af()) {
                AwemeLinkLabel linkLabel = this.f77546j.getAwemeRawAd().getLinkLabel();
                C29050c cVar = new C29050c(mo75261ab(), linkLabel.getText(), linkLabel.getColorText(), R.drawable.aoe, linkLabel.getColorIcon());
                fVar = cVar;
            } else {
                C29053f fVar2 = new C29053f(mo75261ab(), R.color.en, this.f77546j.getAwemeRawAd().getButtonText(), R.drawable.aod, 20);
                fVar = fVar2;
            }
            Context context = this.itemView.getContext();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" [t]");
            spannableString = C23472a.m77059a(context, sb2.toString(), this.f77546j.getPosition());
            spannableString.setSpan(new ClickableSpan() {
                public final void onClick(View view) {
                    if (!C27326a.m89578a(view)) {
                        BaseFollowViewHolder.this.mo75263ad();
                    }
                }
            }, str2.length() + 1, str2.length() + 4, 17);
            spannableString.setSpan(fVar, str2.length() + 1, str2.length() + 4, 17);
            this.f77487C.setMaxSize(spannableString.length());
        } else if (mo75232H()) {
            if (str.length() > C28511z.m93720a()) {
                String substring2 = str2.substring(0, C28511z.m93720a() - 3);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(substring2);
                sb3.append("...");
                str2 = sb3.toString();
            }
            length = str2.length();
            spannableString = C23472a.m77059a(this.itemView.getContext(), str2, this.f77546j.getPosition());
            this.f77487C.setMaxSize(spannableString.length());
        } else if (C6903bc.m21487f().mo84746a(this.f77546j)) {
            if (str.length() > C28511z.m93720a()) {
                String substring3 = str2.substring(0, C28511z.m93720a() - 3);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(substring3);
                sb4.append("...");
                str2 = sb4.toString();
            }
            length = str2.length();
            Context context2 = this.itemView.getContext();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            sb5.append(" [r]");
            SpannableString a = C23472a.m77059a(context2, sb5.toString(), this.f77546j.getPosition());
            C29052e eVar = new C29052e(this.itemView.getContext(), R.color.en, C1642a.m8034a(this.itemView.getContext().getString(R.string.bag), new Object[]{C6903bc.m21487f().mo84748c(this.f77546j)}), R.drawable.av1);
            a.setSpan(new ClickableSpan() {
                public final void onClick(View view) {
                    if (!C27326a.m89578a(view)) {
                        C6903bc.m21487f().mo84745a(BaseFollowViewHolder.this.itemView.getContext(), BaseFollowViewHolder.this.f77546j, BaseFollowViewHolder.this.f77510Z, BaseFollowViewHolder.this.f77512aa);
                    }
                }
            }, str2.length() + 1, str2.length() + 4, 17);
            a.setSpan(eVar, str2.length() + 1, str2.length() + 4, 17);
            this.f77487C.setMaxSize(a.length());
            C6907h.m21524a("show_complete_video_entrance", (Map) C22984d.m75611a().mo59973a("log_pb", C28199ae.m92689a().mo71791a(this.f77546j.getAid())).mo59971a("local_time_ms", System.currentTimeMillis()).mo59973a("enter_from", this.f77510Z).mo59973a("group_id", this.f77546j.getAid()).f60753a);
            spannableString = a;
        } else {
            spannableString = C23472a.m77059a(this.itemView.getContext(), str2, this.f77546j.getPosition());
        }
        m96620a(length, spannableString);
        return spannableString;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo68527a(long j) {
        if (C6399b.m19944t() || C6384b.m19835a().mo15287a(FollowFeedShowCommentAB.class, true, "new_follow_feed_comment", C6384b.m19835a().mo15295d().new_follow_feed_comment, 0) == 1) {
            this.f77518ag.postDelayed(this.f77532au, j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo75253a(View view, float f) {
        mo75254a(view, f, 0.0f);
    }

    /* renamed from: a */
    private void m96620a(int i, SpannableString spannableString) {
        if (C25329c.m83221d(this.f77546j) && i > 0 && !TextUtils.isEmpty(spannableString)) {
            if (i > spannableString.length()) {
                i = spannableString.length();
            }
            if (this.f77546j.getAwemeRawAd().getEnableDescClick()) {
                spannableString.setSpan(new ClickableSpan() {
                    public final void onClick(View view) {
                        if (!C27326a.m89578a(view)) {
                            BaseFollowViewHolder.this.mo75278h("title");
                        }
                    }

                    public final void updateDrawState(TextPaint textPaint) {
                        textPaint.setUnderlineText(false);
                        textPaint.setColor(BaseFollowViewHolder.this.mo75261ab().getResources().getColor(R.color.a4z));
                    }
                }, 0, i, 17);
            }
        }
    }

    public BaseFollowViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar) {
        super(followFeedLayout);
        this.f77520ai = bVar;
        this.f77517af = jVar;
        this.f77518ag = new C6309f(Looper.getMainLooper(), this);
        mo75267c((View) followFeedLayout);
        mo68500a((View) followFeedLayout);
        mo75259a(followFeedLayout);
        followFeedLayout.setOnAttachStateChangeListener(this);
        mo68504d();
        this.f77528aq = new C29548a(this.f77500P, new C29556e() {
            /* renamed from: a */
            public final String mo68099a() {
                return BaseFollowViewHolder.this.mo75290r();
            }

            /* renamed from: a */
            public final void mo67853a(int i, User user) {
                if (BaseFollowViewHolder.this.f77550n != null) {
                    BaseFollowViewHolder.this.f77550n.mo58088b(BaseFollowViewHolder.this.f77546j);
                }
            }
        });
        if (this.f77503S != null) {
            this.f77503S.setTapListener(this.f77536ay);
            this.f77503S.setDisabilityOnClickListener(new C29412a(this));
        }
        mo68535a(bVar, aVar);
        mo68520e();
        mo75288p();
    }

    /* renamed from: a */
    private void mo86991a(int i, int i2, float f, float f2, int[] iArr) {
        float f3;
        float f4 = 1.3333334f;
        switch (C6384b.m19835a().mo15287a(FollowFeedVideoCutTypeAB.class, true, "follow_feed_video_cut_type", C6384b.m19835a().mo15295d().follow_feed_video_cut_type, 1)) {
            case 2:
                f3 = ((float) i2) * 0.6f;
                break;
            case 3:
                f3 = ((float) i2) * 0.56f;
                break;
            case 4:
                f4 = 1.25f;
                f3 = ((float) i2) * 0.52f;
                break;
            default:
                f4 = 1.0f;
                f3 = C9738o.m28708b(mo75261ab(), 400.0f);
                break;
        }
        if (f2 > f4) {
            iArr[1] = (int) f3;
            iArr[0] = (int) (((float) iArr[1]) / f4);
            int i3 = (int) ((((float) i) * 0.85f) - f);
            if (iArr[0] > i3) {
                iArr[0] = i3;
            }
        } else {
            iArr[0] = (int) (((float) i) - (f * 2.0f));
            iArr[1] = (int) (((float) iArr[0]) * f2);
            if (((float) iArr[1]) > f3) {
                iArr[1] = (int) f3;
                iArr[0] = (int) (((float) iArr[1]) / f2);
            }
        }
    }

    /* renamed from: a */
    private static void m96619a(int i, int i2, int i3, int i4, float f, float f2, int[] iArr) {
        if (i * 4 > i2 * 3) {
            iArr[0] = (int) (((float) i3) - (f * 2.0f));
            iArr[1] = (int) (((float) iArr[0]) * f2);
        } else {
            iArr[0] = (int) (((float) i3) * 0.72f);
            iArr[1] = (int) (((float) iArr[0]) * f2);
        }
        float f3 = ((float) i4) * 0.72f;
        if (((float) iArr[1]) > f3) {
            iArr[1] = (int) f3;
            iArr[0] = (int) (((float) iArr[1]) / f2);
        }
    }
}
