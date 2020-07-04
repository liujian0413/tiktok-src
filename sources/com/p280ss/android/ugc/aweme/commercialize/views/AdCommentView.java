package com.p280ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24559a;
import com.p280ss.android.ugc.aweme.commercialize.p1121d.C24613b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.p984ad.common.C22437a;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a;
import com.p280ss.android.ugc.aweme.p984ad.p986b.C22385a;
import com.p280ss.android.ugc.aweme.p984ad.p989e.C22452a;
import com.p280ss.android.ugc.aweme.p984ad.p989e.C22458f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41656f;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43346d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdCommentView */
public class AdCommentView extends LinearLayout {

    /* renamed from: a */
    protected String f66819a;

    /* renamed from: b */
    protected Aweme f66820b;

    /* renamed from: c */
    protected WeakReference<C22385a> f66821c;
    LinearLayout contentll;

    /* renamed from: d */
    C24613b f66822d;

    /* renamed from: e */
    private CommentStruct f66823e;

    /* renamed from: f */
    private C24723e f66824f;

    /* renamed from: g */
    private C7561a<C7581n> f66825g;
    CircleImageView mAvatarView;
    View mCommentContainer;
    TextView mCommentStyleView;
    TextView mCommentTimeView;
    MentionTextView mContentView;
    RelativeLayout mDiggLayout;
    ImageView mDiggView;
    ImageView mMenuItem;
    TextView mReplyCommentStyleView;
    View mReplyContainer;
    MentionTextView mReplyContentView;
    View mReplyDivider;
    TextView mReplyTitleView;
    DmtTextView mTitleView;
    int size;

    public CommentStruct getData() {
        return this.f66823e;
    }

    public String getEventType() {
        return this.f66819a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65959a() {
        m83558h();
        m83559i();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo65959a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo65963e() {
        return C22375a.m74074a().f59708b.mo58864b();
    }

    /* renamed from: i */
    private void m83559i() {
        C22375a.m74074a().f59713g.mo58848a(this.f66819a, "show_comment_link", this.f66820b, false);
    }

    /* renamed from: j */
    private void m83560j() {
        int a = C22437a.m74284a().mo59001a(getDiggSpKey(), -1);
        if (a != -1) {
            this.f66823e.setUserDigged(a);
        }
    }

    /* renamed from: m */
    private void m83563m() {
        if (this.f66821c.get() != null) {
            ((C22385a) this.f66821c.get()).mo58876a();
        }
    }

    /* access modifiers changed from: protected */
    public String getDiggSpKey() {
        StringBuilder sb = new StringBuilder("COMMENT_DIGG");
        sb.append(this.f66823e.getAwemeId());
        return sb.toString();
    }

    /* renamed from: h */
    private void m83558h() {
        if (this.f66820b != null && this.f66820b.isAd()) {
            C22375a.m74074a().f59713g.mo58854d(getContext(), this.f66820b.getAwemeRawAd());
        }
    }

    /* renamed from: k */
    private void m83561k() {
        if (this.f66820b != null && this.f66820b.getAdCommentStruct() == null && C22375a.m74074a().f59708b.mo58861a(this.f66820b)) {
            C22375a.m74074a().f59714h.mo58873a(getContext(), this.f66820b.getAuthor());
        }
    }

    /* renamed from: l */
    private void m83562l() {
        if (this.f66823e != null && this.f66820b != null && this.f66820b.getAdCommentStruct() == null) {
            C22375a.m74074a().f59708b.mo58858a(getContext(), this.f66820b);
            m83563m();
            C22375a.m74074a().f59713g.mo58848a(this.f66819a, "click_comment_link", this.f66820b, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo65962d() {
        boolean e = mo65963e();
        if (this.f66823e.getUserDigged() == 1) {
            this.mDiggView.setSelected(true);
            this.mDiggView.setImageDrawable(this.mDiggView.getResources().getDrawable(R.drawable.a5l));
            return;
        }
        this.mDiggView.setSelected(false);
        if (e) {
            this.mDiggView.setImageDrawable(this.mDiggView.getResources().getDrawable(R.drawable.a5n));
        } else {
            this.mDiggView.setImageDrawable(this.mDiggView.getResources().getDrawable(R.drawable.a5m));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo65964f() {
        int i;
        if (this.f66823e != null && this.f66820b != null && this.f66820b.isAd()) {
            if (!this.f66824f.mo64705a()) {
                this.f66824f.mo64699a(getContext(), this.f66820b);
            }
            if (C22452a.m74322c(getEventType())) {
                i = 22;
            } else {
                i = 4;
            }
            if (C22375a.m74074a().f59708b.mo58860a(getContext(), this.f66820b, this.f66824f, i, this.f66822d)) {
                m83563m();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo65960b() {
        String str;
        if (((C13438a) this.mAvatarView.getHierarchy()).f35619a != null) {
            ((C13438a) this.mAvatarView.getHierarchy()).f35619a.mo32886c((float) C23486n.m77122a(0.5d));
            ((C13438a) this.mAvatarView.getHierarchy()).f35619a.mo32885b(this.mAvatarView.getResources().getColor(R.color.li));
        }
        User user = this.f66823e.getUser();
        if (user != null) {
            UrlModel avatarThumb = user.getAvatarThumb();
            if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                C23323e.m76503a((RemoteImageView) this.mAvatarView, (int) R.drawable.a_j);
            } else {
                C23323e.m76508a(this.mAvatarView, avatarThumb, this.size, this.size, null, this.mAvatarView.getControllerListener());
            }
        }
        mo65961c();
        this.mCommentTimeView.setVisibility(8);
        this.mDiggLayout.setVisibility(0);
        m83560j();
        mo65962d();
        if (!C6399b.m19944t()) {
            this.mCommentStyleView.setVisibility(0);
        } else {
            this.mCommentStyleView.setVisibility(8);
        }
        this.mCommentStyleView.setText(getResources().getText(R.string.mj));
        this.mCommentStyleView.setBackgroundResource(R.drawable.xl);
        DmtTextView dmtTextView = this.mTitleView;
        if (TextUtils.isEmpty(this.f66823e.getCommentNickName())) {
            str = "";
        } else {
            str = this.f66823e.getCommentNickName();
        }
        dmtTextView.setText(str);
        if (C22375a.m74074a().f59708b.mo58859a()) {
            this.mTitleView.setFontType(C10834d.f29332b);
            this.mTitleView.getPaint().setFakeBoldText(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo65961c() {
        boolean z;
        List list;
        String commentInfo = this.f66823e.getCommentInfo();
        if (this.f66820b != null && !TextUtils.isEmpty(commentInfo)) {
            boolean isAd = this.f66820b.isAd();
            if (this.f66820b.getAdCommentStruct() != null) {
                z = true;
            } else {
                z = false;
            }
            if (isAd && z) {
                if (!C22452a.m74322c(getEventType()) || TextUtils.isEmpty(this.f66823e.getTagText())) {
                    list = C22375a.m74074a().f59708b.mo58856a(this.f66823e);
                } else {
                    list = C22375a.m74074a().f59708b.mo58857a(this.f66823e, this.f66825g);
                }
                this.mContentView.setText(C22375a.m74074a().f59708b.mo58863b(this.f66823e));
                this.mContentView.mo105184a(list, (C43346d) new C41656f(true));
                this.mContentView.setMovementMethod(LinkMovementMethod.getInstance());
                C43081e.m136670a(this.contentll);
                return;
            }
            List a = C22375a.m74074a().f59708b.mo58855a(getContext(), this.f66820b, this.f66823e);
            this.mContentView.setText(C22375a.m74074a().f59708b.mo58863b(this.f66823e));
            if (a != null) {
                this.mContentView.mo105184a(a, (C43346d) new C41656f(true));
                this.mContentView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ C7581n mo65965g() {
        if (this.f66823e == null || this.f66820b == null || !this.f66820b.isAd()) {
            return null;
        }
        AwemeRawAd awemeRawAd = this.f66820b.getAwemeRawAd();
        if (!this.f66820b.isAppAd() || C6776h.m20948b(getContext(), C22452a.m74318a(this.f66820b)) || C22375a.m74074a().f59707a.mo58870a().mo51673b(C22452a.m74321b(this.f66820b))) {
            C22375a.m74074a().f59713g.mo58843a(getContext(), awemeRawAd);
        }
        mo65964f();
        if (this.f66820b.isAppAd() && !C22375a.m74074a().f59707a.mo58870a().mo51673b(C22452a.m74321b(this.f66820b))) {
            C22375a.m74074a().f59707a.mo58870a().mo51670a(C22452a.m74321b(this.f66820b), this.f66820b.getAwemeRawAd().getAdId().longValue(), 2, C22375a.m74074a().f59707a.mo58868a("comment_first_ad", this.f66820b.getAwemeRawAd()), C22375a.m74074a().f59707a.mo58865a(this.f66820b.getAwemeRawAd()));
        }
        return null;
    }

    public void setEventType(String str) {
        this.f66819a = str;
    }

    public AdCommentView(Context context) {
        this(context, null);
    }

    public void setOnInternalEventListener(C22385a aVar) {
        this.f66821c = new WeakReference<>(aVar);
    }

    public void setData(CommentStruct commentStruct) {
        this.f66823e = commentStruct;
        this.f66820b = C22452a.m74323d(commentStruct.getAid());
        mo65960b();
    }

    /* renamed from: a */
    private boolean m83556a(int i) {
        if (!C22452a.m74322c(getEventType()) || (i != R.id.zt && i != R.id.z5)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m83555a(String str) {
        AwemeRawAd awemeRawAd = this.f66820b.getAwemeRawAd();
        if (awemeRawAd != null) {
            String openUrl = awemeRawAd.getOpenUrl();
            if (C22452a.m74322c(getEventType())) {
                C22375a.m74074a().f59713g.mo58843a(getContext(), this.f66820b.getAwemeRawAd());
                return;
            }
            C22375a.m74074a().f59713g.mo58844a(getContext(), this.f66820b.getAwemeRawAd(), str);
            if (C22375a.m74074a().f59708b.mo58862a(openUrl)) {
                C22375a.m74074a().f59713g.mo58842a(getContext(), this.f66820b);
            } else {
                C22375a.m74074a().f59713g.mo58850b(getContext(), awemeRawAd);
            }
        }
    }

    /* renamed from: b */
    private void m83557b(String str) {
        AwemeRawAd awemeRawAd = this.f66820b.getAwemeRawAd();
        if (awemeRawAd != null) {
            String openUrl = awemeRawAd.getOpenUrl();
            if (C22452a.m74322c(getEventType())) {
                C22375a.m74074a().f59713g.mo58843a(getContext(), awemeRawAd);
                return;
            }
            C22375a.m74074a().f59713g.mo58844a(getContext(), awemeRawAd, str);
            if (C22375a.m74074a().f59708b.mo58862a(openUrl)) {
                C22375a.m74074a().f59713g.mo58849b(getContext(), this.f66820b);
            } else {
                C22375a.m74074a().f59713g.mo58853c(getContext(), awemeRawAd);
            }
        }
    }

    public void onClick(View view) {
        String str;
        String str2;
        if (this.f66823e != null && this.f66820b != null) {
            int id = view.getId();
            if (id == R.id.bh7) {
                CommentStruct commentStruct = this.f66823e;
                int i = 1;
                if (this.f66823e.getUserDigged() == 1) {
                    i = 0;
                }
                commentStruct.setUserDigged(i);
                mo65962d();
                C22437a.m74284a().mo59002b(getDiggSpKey(), this.f66823e.getUserDigged());
                C42961az.m136380a(new C24559a());
            } else if (id == R.id.title || id == R.id.ic) {
                if (id == R.id.title) {
                    str = "name";
                } else {
                    str = "photo";
                }
                m83555a(str);
                mo65964f();
                m83561k();
            } else if (id == R.id.a29 || m83556a(id)) {
                if (id == R.id.a29) {
                    str2 = "title";
                } else {
                    str2 = null;
                }
                m83557b(str2);
                mo65964f();
                m83562l();
            } else {
                if (id == R.id.zt) {
                    m83562l();
                }
            }
        }
    }

    public AdCommentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdCommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f66819a = "";
        this.f66824f = new C24723e();
        this.f66822d = new C24613b() {
            /* renamed from: a */
            public final void mo58895a() {
            }
        };
        this.f66825g = new C25511a(this);
        LayoutInflater.from(context).inflate(R.layout.sk, this);
        setLayoutParams(new LayoutParams(-1, -2));
        ButterKnife.bind((View) this);
        setOrientation(1);
        C22458f.m74330a(this.mContentView);
        C22458f.m74330a(this.mReplyContentView);
    }
}
