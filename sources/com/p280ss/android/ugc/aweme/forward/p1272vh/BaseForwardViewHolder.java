package com.p280ss.android.ugc.aweme.forward.p1272vh;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.facebook.drawee.p694b.C13364a.C13365a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.common.widget.DiggLayout;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28826b;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LiveCircleView;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LongPressLayout;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedShowForwardAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29363d;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29365a;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29368c;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29373g;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedCommentLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedCommentLayout.C29395a;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.C29433v;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21745c;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29556e;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.FollowUserBtn;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29870c.C29871a;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29870c.C29872b;
import com.p280ss.android.ugc.aweme.forward.p1269c.C29881c;
import com.p280ss.android.ugc.aweme.forward.p1269c.C29885e;
import com.p280ss.android.ugc.aweme.forward.p1271e.C29896a;
import com.p280ss.android.ugc.aweme.live.feedpage.C32517b;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41656f;
import com.p280ss.android.ugc.aweme.utils.C42975bi;
import com.p280ss.android.ugc.aweme.utils.C43110ev;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43346d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.forward.vh.BaseForwardViewHolder */
public abstract class BaseForwardViewHolder extends C1293v implements OnAttachStateChangeListener, C6310a, C21745c, C29433v, C29872b {

    /* renamed from: A */
    TextView f78547A;

    /* renamed from: B */
    protected ImageView f78548B;

    /* renamed from: C */
    protected C42975bi f78549C = new C42975bi(1);

    /* renamed from: D */
    public C21747e f78550D;

    /* renamed from: E */
    public C34145b f78551E;

    /* renamed from: F */
    public Aweme f78552F;

    /* renamed from: G */
    protected C6309f f78553G;

    /* renamed from: H */
    protected List<User> f78554H;

    /* renamed from: I */
    public boolean f78555I;

    /* renamed from: J */
    protected C29896a f78556J;

    /* renamed from: K */
    public String f78557K;

    /* renamed from: L */
    protected boolean f78558L;

    /* renamed from: M */
    protected WidgetManager f78559M;

    /* renamed from: N */
    public C29871a f78560N = new C29885e();

    /* renamed from: O */
    public boolean f78561O = false;

    /* renamed from: P */
    public MotionEvent f78562P;

    /* renamed from: Q */
    public MotionEvent f78563Q;

    /* renamed from: R */
    protected OnTouchListener f78564R = new OnTouchListener() {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    if (BaseForwardViewHolder.this.f78553G.hasMessages(0)) {
                        BaseForwardViewHolder.this.f78553G.removeMessages(0);
                    }
                    if (C29373g.m96484a(BaseForwardViewHolder.this.f78562P, BaseForwardViewHolder.this.f78563Q, motionEvent, BaseForwardViewHolder.this.mo75888b())) {
                        BaseForwardViewHolder.this.f78561O = true;
                        BaseForwardViewHolder.this.mo76030c(BaseForwardViewHolder.this.f78552F);
                    } else {
                        BaseForwardViewHolder.this.f78561O = false;
                    }
                    if (BaseForwardViewHolder.this.f78562P != null) {
                        BaseForwardViewHolder.this.f78562P.recycle();
                    }
                    BaseForwardViewHolder.this.f78562P = MotionEvent.obtain(motionEvent);
                    break;
                case 1:
                    if (!BaseForwardViewHolder.this.f78561O && BaseForwardViewHolder.this.f78562P != null && !C29373g.m96483a(0, BaseForwardViewHolder.this.f78562P, motionEvent, BaseForwardViewHolder.this.mo75888b())) {
                        BaseForwardViewHolder.this.f78553G.sendMessageDelayed(BaseForwardViewHolder.this.f78553G.obtainMessage(0), (((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime()) + BaseForwardViewHolder.this.f78562P.getEventTime());
                    }
                    if (BaseForwardViewHolder.this.f78563Q != null) {
                        BaseForwardViewHolder.this.f78563Q.recycle();
                    }
                    BaseForwardViewHolder.this.f78563Q = MotionEvent.obtain(motionEvent);
                    break;
                case 2:
                    if (C29373g.m96483a(0, BaseForwardViewHolder.this.f78562P, motionEvent, BaseForwardViewHolder.this.mo75888b())) {
                        BaseForwardViewHolder.this.f78553G.removeMessages(0);
                        break;
                    }
                    break;
            }
            return false;
        }
    };

    /* renamed from: S */
    private Context f78565S;

    /* renamed from: T */
    private Rect f78566T = new Rect();

    /* renamed from: U */
    private int[] f78567U = new int[2];

    /* renamed from: V */
    private C28826b f78568V;

    /* renamed from: W */
    private List<Comment> f78569W;

    /* renamed from: X */
    private boolean f78570X;

    /* renamed from: Y */
    private C21744b f78571Y;

    /* renamed from: Z */
    private boolean f78572Z = true;

    /* renamed from: a */
    protected ViewGroup f78573a;

    /* renamed from: aa */
    private C29548a f78574aa;

    /* renamed from: ab */
    private C7326g<C32517b> f78575ab;

    /* renamed from: b */
    ViewGroup f78576b;

    /* renamed from: c */
    protected AvatarImageView f78577c;

    /* renamed from: d */
    protected TextView f78578d;

    /* renamed from: e */
    DiggLayout f78579e;

    /* renamed from: f */
    LongPressLayout f78580f;

    /* renamed from: g */
    AnimationImageView f78581g;

    /* renamed from: h */
    AvatarImageView f78582h;

    /* renamed from: i */
    LiveCircleView f78583i;

    /* renamed from: j */
    protected TextView f78584j;

    /* renamed from: k */
    TextView f78585k;

    /* renamed from: l */
    MentionTextView f78586l;

    /* renamed from: m */
    protected TextView f78587m;

    /* renamed from: n */
    ImageView f78588n;

    /* renamed from: o */
    TextView f78589o;

    /* renamed from: p */
    ImageView f78590p;

    /* renamed from: q */
    TextView f78591q;

    /* renamed from: r */
    protected ViewGroup f78592r;

    /* renamed from: s */
    ImageView f78593s;

    /* renamed from: t */
    TextView f78594t;

    /* renamed from: u */
    public ImageView f78595u;

    /* renamed from: v */
    protected TextView f78596v;

    /* renamed from: w */
    public FollowFeedCommentLayout f78597w;

    /* renamed from: x */
    FollowUserBtn f78598x;

    /* renamed from: y */
    protected View f78599y;

    /* renamed from: z */
    int f78600z;

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo76006B() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract void mo76011J();

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo76012K() {
    }

    /* renamed from: a */
    public final C21744b mo75887a() {
        return this.f78571Y;
    }

    /* renamed from: b */
    public final Context mo75888b() {
        return this.f78565S;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo76026b(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo76029c(View view) {
    }

    /* renamed from: i */
    public void mo75894i() {
    }

    /* renamed from: m */
    public final C42975bi mo75896m() {
        return this.f78549C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo76040r() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo76041s() {
        return false;
    }

    /* renamed from: t */
    public String mo76044t() {
        return this.f78557K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo76049y() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo76023a(MentionTextView mentionTextView, Aweme aweme) {
        if (aweme != null) {
            if (!C6399b.m19944t() && !aweme.isHashTag()) {
                C21740a.m72693i(aweme);
            }
            if (!TextUtils.isEmpty(aweme.getDesc())) {
                mentionTextView.setText(aweme.getDesc());
                mentionTextView.setVisibility(0);
                C29363d.m96451a().mo75040a((TextView) mentionTextView);
                mentionTextView.setSpanSize(C9738o.m28690a(this.f78565S, 15.0f));
                mentionTextView.setSpanStyle(1);
                mentionTextView.setHighlightColor(mentionTextView.getResources().getColor(R.color.ac4));
                mentionTextView.setOnSpanClickListener(new C29921c(this));
                mentionTextView.mo105184a(C29368c.m96459a(this.f78552F), (C43346d) new C41656f(true));
                mentionTextView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            mentionTextView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo75258a(AwemeStatus awemeStatus, UrlModel urlModel) {
        if (this.f78552F.getAwemeType() == 13 && this.f78552F.getForwardItem() != null) {
            if (this.f78552F.getForwardItem().getStatus() != null) {
                this.f78552F.getForwardItem().getStatus().setPrivateStatus(awemeStatus.getPrivateStatus());
            }
            this.f78552F.getForwardItem().setLabelPrivate(urlModel);
            m97935a(urlModel);
        }
    }

    public void aW_() {
        this.f78560N.mo75882c();
    }

    /* renamed from: d */
    public final boolean mo75890d() {
        return this.f78571Y.mo58073b();
    }

    /* renamed from: j */
    public void mo58064j() {
        this.f78560N.mo75883d();
    }

    /* renamed from: n */
    private void mo76057n() {
        this.f78559M = WidgetManager.m75869a((FragmentActivity) mo75888b(), this.itemView);
    }

    public void clickExtra() {
        List L = mo76013L();
        if (this.f78550D != null) {
            this.f78550D.mo58084a(this.f78552F, L);
        }
    }

    /* renamed from: g */
    public final void mo75892g() {
        if (this.f78549C.mo104684c(1)) {
            this.f78597w.mo75185a();
        }
    }

    /* renamed from: h */
    public void mo75893h() {
        if (this.f78568V != null) {
            this.f78568V.mo74074c();
        }
    }

    /* renamed from: l */
    public void mo75895l() {
        if (this.f78568V != null) {
            this.f78568V.mo74075d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo76007C() {
        if (this.f78579e != null) {
            this.f78579e.removeAllViews();
        }
        this.f78556J.mo75955a(this.f78552F);
    }

    /* renamed from: G */
    public final void mo75231G() {
        if (mo76041s() && this.f78597w != null) {
            this.f78597w.mo75193d();
        }
        mo76007C();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public final /* synthetic */ boolean mo76014M() {
        this.f78550D.mo58087b(this.f78584j, this.itemView, this.f78552F, this.f78552F.getAuthor());
        return false;
    }

    /* renamed from: c */
    public final boolean mo75889c() {
        if (!this.f78555I || !this.f78571Y.mo58072a()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo76047w() {
        this.f78587m.setText(C43110ev.m136733b(this.f78565S, this.f78552F.getCreateTime() * 1000));
    }

    /* renamed from: x */
    public void mo76048x() {
        mo76007C();
        if (!mo76041s()) {
            mo76009H();
            mo75230F();
        }
        mo76008E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo76050z() {
        if (!this.f78549C.mo104684c(1) || !this.f78572Z) {
            this.f78599y.setVisibility(8);
        } else {
            this.f78599y.setVisibility(0);
        }
    }

    /* renamed from: o */
    private void mo76058o() {
        if (this.f78552F == null || this.f78552F.getAuthor() == null || TextUtils.isEmpty(this.f78552F.getAuthor().getRelationLabel())) {
            this.f78578d.setVisibility(8);
            return;
        }
        this.f78578d.setVisibility(0);
        this.f78578d.setText(this.f78552F.getAuthor().getRelationLabel());
    }

    /* renamed from: p */
    private void mo76059p() {
        if (this.f78598x != null && this.f78598x.getVisibility() == 0 && this.f78552F != null && this.f78552F.getAuthor() != null) {
            this.f78574aa.mo75558a(this.f78552F.getAuthor());
        }
    }

    /* renamed from: q */
    private void mo76060q() {
        if (this.f78549C.mo104684c(1)) {
            this.f78597w.setVisibility(0);
            this.f78597w.setEventType(this.f78557K);
            this.f78597w.mo75188a(this.f78552F, this.f78569W, this.f78554H, (C29395a) this.f78550D);
        } else {
            this.f78597w.setVisibility(8);
        }
        if (this.f78556J != null) {
            this.f78556J.f78521b = this.f78597w.getLayoutLikes();
        }
    }

    /* renamed from: E */
    public void mo76008E() {
        if (!C28482e.m93615h(this.f78552F) || !C6384b.m19835a().mo15292a(FollowFeedShowForwardAB.class, true, "aweme_follow_show_forward", C6384b.m19835a().mo15295d().aweme_follow_show_forward, false)) {
            this.f78592r.setVisibility(8);
            return;
        }
        this.f78592r.setVisibility(0);
        this.f78594t.setText(C21740a.m72691g(this.f78552F));
    }

    /* renamed from: F */
    public final void mo75230F() {
        if (!mo76041s()) {
            String d = C21740a.m72688d(this.f78552F);
            if (!TextUtils.isEmpty(d)) {
                this.f78591q.setText(d);
            }
        } else if (this.f78597w != null) {
            this.f78597w.mo75191c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public List<String> mo76013L() {
        ArrayList arrayList = new ArrayList();
        if (mo76041s()) {
            arrayList.add(mo75888b().getString(R.string.ds3));
        }
        if (!C28482e.m93606a(this.f78552F) && C43122ff.m136762a(this.f78552F)) {
            arrayList.add(mo75888b().getString(R.string.fll));
        }
        return arrayList;
    }

    public void addComment() {
        if (this.f78550D != null) {
            if (C6903bc.m21484c().mo59240a()) {
                C10761a.m31409e(mo75888b(), (int) R.string.e5m).mo25750a();
                return;
            }
            this.f78550D.mo75056a(this.itemView, this.f78552F);
        }
    }

    /* renamed from: e */
    public final Rect mo75891e() {
        this.itemView.getLocationOnScreen(this.f78567U);
        this.f78566T.set(this.f78567U[0], this.f78567U[1], this.f78567U[0] + this.itemView.getWidth(), this.f78567U[1] + this.itemView.getHeight());
        return this.f78566T;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo76045u() {
        mo76047w();
        mo76060q();
        mo76005A();
        mo76058o();
        mo76046v();
        mo76006B();
        mo76048x();
        mo75228D();
        mo76050z();
        mo76059p();
        mo76049y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public String mo76010I() {
        String str;
        if (this.f78552F.getForwardItem() == null || this.f78552F.getForwardItem().getAuthor() == null) {
            return "";
        }
        if (!TextUtils.isEmpty(this.f78552F.getForwardItem().getAuthor().getRemarkName())) {
            StringBuilder sb = new StringBuilder("@");
            sb.append(this.f78552F.getForwardItem().getAuthor().getRemarkName());
            sb.append(": ");
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("@");
            sb2.append(this.f78552F.getForwardItem().getAuthor().getNickname());
            sb2.append(": ");
            str = sb2.toString();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo76046v() {
        if (this.f78548B != null) {
            if (this.f78558L || C6399b.m19944t()) {
                this.f78548B.setVisibility(8);
            } else if (!TextUtils.equals(mo75887a().mo58075d(), "key_container_follow") && !TextUtils.equals(mo75887a().mo58075d(), "key_container_dynamic") && !TextUtils.equals(mo75887a().mo58075d(), "key_container_familiar")) {
                this.f78548B.setVisibility(8);
            } else if (C21740a.m72687c(this.f78552F) || !C43122ff.m136762a(this.f78552F)) {
                this.f78548B.setVisibility(8);
            } else {
                this.f78548B.setVisibility(0);
            }
        }
    }

    /* renamed from: D */
    public void mo75228D() {
        if (this.f78547A != null) {
            if (this.f78552F.getAwemeType() != 13 || this.f78552F.getForwardItem() == null) {
                this.f78547A.setVisibility(8);
            } else if (C21740a.m72687c(this.f78552F.getForwardItem())) {
                if (C43168s.m136912d(this.f78552F.getForwardItem())) {
                    this.f78547A.setVisibility(0);
                    this.f78547A.setText(mo75888b().getString(R.string.e6w));
                } else if (C43168s.m136911c(this.f78552F.getForwardItem())) {
                    this.f78547A.setVisibility(0);
                    this.f78547A.setText(mo75888b().getString(R.string.b_v));
                } else {
                    this.f78547A.setVisibility(8);
                }
            } else if (!C43168s.m136911c(this.f78552F.getForwardItem()) || !C43168s.m136913e(this.f78552F.getForwardItem())) {
                this.f78547A.setVisibility(8);
            } else {
                this.f78547A.setVisibility(0);
                this.f78547A.setText(mo75888b().getString(R.string.b_v));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo76009H() {
        if (this.f78595u != null && this.f78552F.getAuthor() != null) {
            if (C21740a.m72687c(this.f78552F)) {
                this.f78595u.setImageResource(R.drawable.auv);
            } else {
                this.f78595u.setImageResource(R.drawable.a8t);
            }
            if (C21740a.m72685b(this.f78552F)) {
                this.f78595u.setAlpha(0.5f);
                this.f78595u.setEnabled(false);
            } else {
                this.f78595u.setAlpha(1.0f);
                this.f78595u.setEnabled(true);
            }
            switch (C21740a.m72692h(this.f78552F)) {
                case 2:
                    this.f78596v.setVisibility(0);
                    this.f78596v.setTextSize(1, 10.0f);
                    this.f78596v.setText(R.string.foy);
                    return;
                case 3:
                    this.f78596v.setVisibility(0);
                    this.f78596v.setTextSize(1, 12.0f);
                    this.f78596v.setText(C21740a.m72690f(this.f78552F));
                    return;
                default:
                    this.f78596v.setVisibility(8);
                    return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo76005A() {
        boolean z = true;
        if (this.f78549C.mo104684c(1)) {
            this.f78576b.setVisibility(0);
            if (this.f78568V == null) {
                if (this.f78552F.getAuthor() == null || !this.f78552F.getAuthor().isLive()) {
                    z = false;
                }
                this.f78568V = new C28826b(z, this.f78582h, this.f78577c, this.f78583i);
            }
            if (C21740a.m72683a(this.f78552F)) {
                if (this.f78552F.getAuthor() != null) {
                    C23323e.m76506a((RemoteImageView) this.f78582h, this.f78552F.getAuthor().getAvatarThumb(), this.f78600z, this.f78600z);
                }
                C6903bc.m21486e().mo75356a(this.f78552F);
            } else if (this.f78552F.getAuthor() != null) {
                C23323e.m76506a((RemoteImageView) this.f78577c, this.f78552F.getAuthor().getAvatarThumb(), this.f78600z, this.f78600z);
            }
            if (this.f78575ab == null) {
                this.f78575ab = new C7326g<C32517b>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(C32517b bVar) throws Exception {
                        if (TextUtils.equals(BaseForwardViewHolder.this.f78552F.getAuthor().getUid(), String.valueOf(bVar.f84785a))) {
                            BaseForwardViewHolder.this.f78552F.getAuthor().roomId = bVar.f84786b;
                            if (!BaseForwardViewHolder.this.f78552F.getAuthor().isLive()) {
                                BaseForwardViewHolder.this.mo76005A();
                            }
                        }
                    }
                };
            }
            this.f78568V.mo74071a(this.f78552F.getAuthor(), getClass(), this.f78575ab);
            if (this.f78552F.getAuthor() != null) {
                if (TextUtils.isEmpty(this.f78552F.getAuthor().getRemarkName())) {
                    this.f78584j.setText(this.f78552F.getAuthor().getNickname());
                } else {
                    this.f78584j.setText(this.f78552F.getAuthor().getRemarkName());
                }
                if (TextUtils.equals(mo76044t(), "homepage_follow")) {
                    C29920b bVar = new C29920b(this);
                    if (this.f78552F.getAuthor() != null) {
                        C29363d.m96451a().mo75041a(this.f78584j, this.f78552F.getAuthor().getStarBillboardRank(), 4, mo76044t(), (C13365a) bVar);
                    }
                }
            }
        } else {
            this.f78573a.setVisibility(8);
        }
        mo76023a(this.f78586l, this.f78552F);
    }

    /* renamed from: b */
    public final void mo76025b(int i) {
        this.f78549C.mo104682a(2);
    }

    /* renamed from: f */
    public final void mo76035f(int i) {
        this.f78549C.mo104683b(1);
    }

    public void handleMsg(Message message) {
        if (message.what == 0) {
            mo76012K();
        }
    }

    /* renamed from: c */
    public final void mo75266c(int i) {
        this.f78597w.mo75186a(0);
        this.f78570X = true;
    }

    /* renamed from: d */
    public final void mo75269d(int i) {
        this.f78597w.mo75189b(i);
        this.f78570X = true;
    }

    /* renamed from: e */
    public final void mo75271e(int i) {
        this.f78597w.mo75192c(i);
        this.f78570X = true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f78555I = true;
        this.f78560N.mo75884e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo76033d(View view) {
        this.f78553G.sendMessage(this.f78553G.obtainMessage(0));
    }

    public void onClickAuthorAvatar(View view) {
        if (this.f78550D != null && this.f78552F != null) {
            this.f78550D.mo58079a(view, this.itemView, this.f78552F, this.f78552F.getAuthor());
        }
    }

    public void onClickAuthorName(View view) {
        if (this.f78550D != null && this.f78552F != null) {
            this.f78550D.mo58087b(view, this.itemView, this.f78552F, this.f78552F.getAuthor());
        }
    }

    public void onViewDetachedFromWindow(View view) {
        this.f78555I = false;
        this.f78560N.mo75885f();
        if (this.f78579e != null) {
            this.f78579e.removeAllViews();
        }
    }

    public void showCreateForward(View view) {
        C29365a.m96457a(this.f78593s);
        if (this.f78550D != null) {
            this.f78550D.mo58083a(this.f78552F);
        }
    }

    public void showShare(View view) {
        C29365a.m96457a(this.f78595u);
        if (this.f78550D != null) {
            this.f78550D.mo58078a(view, this.itemView, this.f78552F);
        }
    }

    /* renamed from: a */
    private void m97935a(UrlModel urlModel) {
        AwemeLabelModel awemeLabelModel;
        if (urlModel != null) {
            awemeLabelModel = new AwemeLabelModel();
            awemeLabelModel.setLabelType(1);
            awemeLabelModel.setUrlModels(urlModel);
        } else {
            awemeLabelModel = null;
        }
        Aweme forwardItem = this.f78552F.getForwardItem();
        if (!(forwardItem == null || forwardItem.videoLabels == null)) {
            if (forwardItem.videoLabels.size() == 0) {
                forwardItem.videoLabels.add(0, awemeLabelModel);
                return;
            }
            forwardItem.videoLabels.set(0, awemeLabelModel);
        }
    }

    /* renamed from: b */
    public final void mo75265b(Aweme aweme) {
        this.f78556J.mo75958b(aweme);
    }

    public void clickLike(View view) {
        C29871a aVar = this.f78560N;
        long currentTimeMillis = System.currentTimeMillis();
        if (aVar instanceof C29881c) {
            currentTimeMillis = ((C29881c) aVar).mo75927j().f77401f;
        }
        this.f78556J.mo75957a(mo76044t(), System.currentTimeMillis() - currentTimeMillis);
    }

    public void expandComment(View view) {
        if (this.f78552F != null) {
            if (view.getId() == R.id.bgx) {
                C29365a.m96457a(this.f78590p);
            }
            if (this.f78550D != null) {
                this.f78550D.mo75057a(this.itemView, this.f78552F, this.f78554H, this.f78570X, "click_comment_icon");
            }
        }
    }

    /* renamed from: a */
    public final List<TextExtraStruct> mo76015a(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        int length = mo76010I().length();
        ArrayList arrayList = new ArrayList();
        List<TextExtraStruct> a = C29368c.m96459a(aweme);
        if (!C6307b.m19566a((Collection<T>) a)) {
            for (TextExtraStruct textExtraStruct : a) {
                TextExtraStruct clone = textExtraStruct.clone();
                clone.setStart(textExtraStruct.getStart() + length);
                clone.setEnd(textExtraStruct.getEnd() + length);
                arrayList.add(clone);
            }
        }
        TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.setStart(0);
        textExtraStruct2.setEnd(length);
        textExtraStruct2.setType(2);
        textExtraStruct2.setUserId(aweme.getAuthorUid());
        arrayList.add(0, textExtraStruct2);
        return arrayList;
    }

    /* renamed from: c */
    public final void mo76030c(Aweme aweme) {
        if (aweme != null && aweme.getStatus() != null) {
            if (!C6861a.m21337f().isLogin()) {
                C32656f.m105742a(C6405d.m19984g(), this.f78557K, "click_like");
                return;
            }
            C29871a aVar = this.f78560N;
            long currentTimeMillis = System.currentTimeMillis();
            if (aVar instanceof C29881c) {
                currentTimeMillis = ((C29881c) aVar).mo75927j().f77401f;
            }
            this.f78556J.mo75959b(aweme, System.currentTimeMillis() - currentTimeMillis);
            if (!(this.f78579e == null || aweme.getStatus().getPrivateStatus() == 1)) {
                this.f78579e.mo66634a(this.f78562P.getX(), this.f78562P.getY());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo76016a(View view) {
        this.f78573a = (ViewGroup) view.findViewById(R.id.bhn);
        this.f78576b = (ViewGroup) view.findViewById(R.id.bgo);
        this.f78577c = (AvatarImageView) view.findViewById(R.id.e8m);
        this.f78578d = (TextView) view.findViewById(R.id.e31);
        this.f78579e = (DiggLayout) view.findViewById(R.id.a8y);
        this.f78580f = (LongPressLayout) view.findViewById(R.id.bvy);
        this.f78581g = (AnimationImageView) view.findViewById(R.id.j6);
        this.f78582h = (AvatarImageView) view.findViewById(R.id.e8s);
        this.f78583i = (LiveCircleView) view.findViewById(R.id.e9k);
        this.f78584j = (TextView) view.findViewById(R.id.e4i);
        this.f78585k = (TextView) view.findViewById(R.id.e0c);
        this.f78586l = (MentionTextView) view.findViewById(R.id.dt5);
        this.f78587m = (TextView) view.findViewById(R.id.dsz);
        this.f78588n = (ImageView) view.findViewById(R.id.a8u);
        this.f78589o = (TextView) view.findViewById(R.id.dtf);
        this.f78590p = (ImageView) view.findViewById(R.id.b7p);
        this.f78591q = (TextView) view.findViewById(R.id.ds6);
        this.f78592r = (ViewGroup) view.findViewById(R.id.bhm);
        this.f78593s = (ImageView) view.findViewById(R.id.b9h);
        this.f78594t = (TextView) view.findViewById(R.id.dux);
        this.f78595u = (ImageView) view.findViewById(R.id.d5a);
        this.f78596v = (TextView) view.findViewById(R.id.e1s);
        this.f78597w = (FollowFeedCommentLayout) view.findViewById(R.id.bhj);
        this.f78598x = (FollowUserBtn) view.findViewById(R.id.anj);
        this.f78599y = view.findViewById(R.id.bm8);
        this.f78547A = (TextView) view.findViewById(R.id.dqp);
        this.f78548B = (ImageView) view.findViewById(R.id.b90);
        this.f78600z = view.getContext().getResources().getDimensionPixelSize(R.dimen.he);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo76017a(View view, float f) {
        mo76018a(view, f, 0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo76021a(View view, TextExtraStruct textExtraStruct) {
        if (this.f78550D != null) {
            this.f78550D.mo58082a(view, textExtraStruct, this.itemView, this.f78552F);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo76027b(View view, TextExtraStruct textExtraStruct) {
        if (this.f78550D != null) {
            this.f78550D.mo58082a(view, textExtraStruct, this.itemView, this.f78552F);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo76028b(MentionTextView mentionTextView, Aweme aweme) {
        if (aweme != null) {
            if (!C6399b.m19944t() && !aweme.isHashTag()) {
                C21740a.m72693i(aweme);
            }
            if (C6903bc.m21487f().mo84746a(aweme)) {
                Aweme aweme2 = aweme;
                mentionTextView.setText(C6903bc.m21487f().mo84743a(this.f78565S, C1642a.m8034a("%s%s", new Object[]{mo76010I(), aweme.getDesc()}), aweme2, this.f78557K, 0));
            } else {
                mentionTextView.setText(C1642a.m8034a("%s%s", new Object[]{mo76010I(), aweme.getDesc()}));
            }
            mentionTextView.setVisibility(0);
            C29363d.m96451a().mo75040a((TextView) mentionTextView);
            mentionTextView.setSpanSize(C9738o.m28690a(this.f78565S, 15.0f));
            mentionTextView.setSpanStyle(1);
            mentionTextView.setOnSpanClickListener(new C29922d(this));
            mentionTextView.mo105184a(mo76015a(aweme), (C43346d) new C41656f(true));
            mentionTextView.setMovementMethod(LinkMovementMethod.getInstance());
            C6903bc.m21489h().mo85869a(this.f78565S, this.f78552F.getForwardItem(), (TextView) mentionTextView);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo76018a(View view, float f, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = (int) C9738o.m28708b(mo75888b(), f);
        layoutParams.bottomMargin = (int) C9738o.m28708b(mo75888b(), f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo76020a(View view, int i, int i2) {
        int[] iArr = new int[2];
        float f = ((float) i) / ((float) i2);
        int a = C9738o.m28691a(this.f78565S);
        float b = C9738o.m28708b(this.f78565S, 16.0f);
        if (i > i2) {
            iArr[0] = (int) (((float) a) - (b * 2.0f));
            iArr[1] = (int) (((float) iArr[0]) / f);
        } else {
            iArr[0] = (int) (((float) a) - (b * 2.0f));
            iArr[1] = iArr[0];
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.width = iArr[0];
        marginLayoutParams.height = iArr[1];
        marginLayoutParams.setMargins(0, 0, 0, 0);
        view.setLayoutParams(marginLayoutParams);
    }

    public BaseForwardViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C21747e eVar, C21743a aVar) {
        super(followFeedLayout);
        this.f78571Y = bVar;
        this.f78565S = bVar.mo58074c();
        this.f78550D = eVar;
        this.f78553G = new C6309f(Looper.getMainLooper(), this);
        mo76026b((View) followFeedLayout);
        mo76029c((View) followFeedLayout);
        ButterKnife.bind((Object) this, (View) followFeedLayout);
        mo76016a((View) followFeedLayout);
        followFeedLayout.setOnAttachStateChangeListener(this);
        mo76011J();
        C29896a aVar2 = new C29896a(this.f78565S, this.f78588n, this.f78589o, aVar, mo76041s());
        this.f78556J = aVar2;
        if (this.f78580f != null) {
            this.f78580f.setTapListener(this.f78564R);
            this.f78580f.setDisabilityOnClickListener(new C29919a(this));
        }
        this.f78574aa = new C29548a(this.f78598x, new C29556e() {
            /* renamed from: a */
            public final String mo68099a() {
                return BaseForwardViewHolder.this.mo76044t();
            }

            /* renamed from: a */
            public final void mo67853a(int i, User user) {
                if (BaseForwardViewHolder.this.f78550D != null) {
                    BaseForwardViewHolder.this.f78550D.mo58088b(BaseForwardViewHolder.this.f78552F);
                }
            }
        });
        mo76057n();
        mo76040r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo76019a(View view, float f, float f2, float f3, float f4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = (int) C9738o.m28708b(mo75888b(), 12.0f);
        layoutParams.bottomMargin = (int) C9738o.m28708b(mo75888b(), 0.0f);
        layoutParams.leftMargin = (int) C9738o.m28708b(mo75888b(), 0.0f);
        layoutParams.rightMargin = (int) C9738o.m28708b(mo75888b(), f4);
    }

    /* renamed from: a */
    public void mo76022a(Aweme aweme, List<Comment> list, List<User> list2, String str, String str2) {
        if (aweme != null && !TextUtils.isEmpty(str)) {
            this.f78557K = str;
            this.f78552F = aweme;
            this.f78569W = list;
            this.f78554H = list2;
            this.f78560N.mo75881a(aweme, str, str2);
            mo76045u();
            this.f78570X = false;
        }
    }
}
