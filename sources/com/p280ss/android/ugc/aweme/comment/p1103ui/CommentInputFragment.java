package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.app.Activity;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.AppCompatCheckBox;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.livedata.SlideData;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.comment.C24093d;
import com.p280ss.android.ugc.aweme.comment.api.C24084a;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24029a;
import com.p280ss.android.ugc.aweme.comment.p1095b.C24087a;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24092c;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24130a;
import com.p280ss.android.ugc.aweme.comment.services.C24219a;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.comment.services.C24221b;
import com.p280ss.android.ugc.aweme.comment.services.C24222c;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.C25572q;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.detail.p1167ui.FadeImageView;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28324g;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28463p;
import com.p280ss.android.ugc.aweme.forward.p1268b.C29876a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.p1052b.C23147b;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.p931a.C21085a.C21089c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41540at;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentInputFragment */
public class CommentInputFragment extends AbsFragment implements C24087a, C24222c {

    /* renamed from: e */
    public C28463p f64009e;

    /* renamed from: f */
    public C24092c f64010f;

    /* renamed from: g */
    public String f64011g;

    /* renamed from: h */
    private View f64012h;

    /* renamed from: i */
    private C24221b f64013i;
    FadeImageView ivAt;
    FadeImageView ivEmoji;

    /* renamed from: j */
    private C24093d f64014j;

    /* renamed from: k */
    private boolean f64015k;

    /* renamed from: l */
    private boolean f64016l;

    /* renamed from: m */
    private boolean f64017m;
    AppCompatCheckBox mCbForward;
    MentionEditText mEditCommentView;
    View mEditContainerView;
    View mLayout;
    ImageView mSendCommentView;
    FadeImageView report;
    View tabDivider;

    /* renamed from: c */
    public final void mo62998c(Comment comment) {
    }

    /* renamed from: k */
    public final Comment mo63005k() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63066a(Float f) {
        float f2;
        if (this.mLayout != null) {
            if (f == null) {
                f2 = 0.0f;
            } else {
                f2 = f.floatValue();
            }
            this.mLayout.setTranslationX(((float) C23482j.m77098b(getContext())) * f2);
            this.mLayout.setAlpha(1.0f - f2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63065a(Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            this.mEditCommentView.setEnabled(true);
        } else {
            this.mEditCommentView.setEnabled(false);
        }
    }

    /* renamed from: a */
    public final void mo62415a(boolean z) {
        if (isViewValid()) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mLayout.getLayoutParams();
            if (!z || this.mEditContainerView.getVisibility() != 8) {
                if (!z && this.mEditContainerView.getVisibility() == 0) {
                    this.mEditContainerView.setVisibility(8);
                    this.tabDivider.setVisibility(8);
                    marginLayoutParams.height = 1;
                    this.mLayout.setLayoutParams(marginLayoutParams);
                    mo62422e();
                }
                return;
            }
            this.mEditContainerView.setVisibility(0);
            if (!C6399b.m19945u() || !C21085a.m71129c()) {
                C23487o.m77140a(this.tabDivider, 0);
            } else {
                C23487o.m77140a(this.tabDivider, 8);
            }
            marginLayoutParams.height = getContext().getResources().getDimensionPixelOffset(R.dimen.g1);
            if (C21085a.m71129c()) {
                marginLayoutParams.height += C21085a.f56610a;
            }
            this.mLayout.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public final void mo62995a(Exception exc, int i, Comment comment) {
        C24084a.m79026a(this.mEditCommentView.getContext(), exc, i == 3 ? R.string.b_3 : R.string.a8d);
        if (i == 3) {
            C6903bc.m21485d().mo75951a(mo63006l(), m79661i(), C22704b.f60415d, "click_comment", false);
        }
    }

    /* renamed from: a */
    public final void mo62996a(String str, int i) {
        String str2;
        Aweme i2 = m79661i();
        String str3 = this.f64011g;
        String aid = i2 == null ? "" : i2.getAid();
        if (i2 == null) {
            str2 = "";
        } else {
            str2 = i2.getAuthorUid();
        }
        C24130a.m79253a(str, i, str3, aid, str2);
    }

    /* renamed from: a */
    public final boolean mo62416a(KeyEvent keyEvent) {
        if (!isAdded()) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 25 || keyCode == 24) {
            if (keyEvent.getAction() == 0) {
                return getActivity().onKeyDown(keyCode, keyEvent);
            }
            return false;
        } else if (keyEvent.getAction() == 0) {
            this.f64017m = true;
            return false;
        } else if (4 != keyCode || !this.f64017m) {
            return false;
        } else {
            m79657a(10);
            this.f64017m = false;
            return true;
        }
    }

    /* renamed from: j */
    public final Aweme mo63004j() {
        return m79661i();
    }

    public void onPause() {
        super.onPause();
        this.f18760c_ = false;
    }

    /* renamed from: p */
    public final boolean mo63011p() {
        return C42961az.m136384e(this);
    }

    /* renamed from: h */
    private void m79660h() {
        this.ivAt.setVisibility(8);
        this.ivEmoji.setVisibility(8);
    }

    /* renamed from: i */
    private Aweme m79661i() {
        if (this.f64013i != null) {
            return this.f64013i.mo62993e();
        }
        return null;
    }

    /* renamed from: q */
    private String m79662q() {
        Aweme i = m79661i();
        if (i != null) {
            return i.getAid();
        }
        return "";
    }

    public boolean isViewValid() {
        if (!super.isViewValid() || getContext() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final String mo63006l() {
        if (this.f64013i != null) {
            return this.f64013i.aw_();
        }
        return "";
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f64013i = null;
        C42961az.m136383d(this);
    }

    public void onResume() {
        super.onResume();
        mo62417b();
        m79657a(9);
    }

    /* renamed from: s */
    private String m79664s() {
        if (this.f64013i == null || this.f64013i.mo62993e() == null) {
            return "";
        }
        return this.f64013i.mo62993e().getAid();
    }

    /* renamed from: a */
    public final void mo62413a() {
        if (this.mEditCommentView != null) {
            mo62422e();
            if (this.f64014j != null) {
                this.f64014j.mo62465a();
                this.f64014j.mo62438j();
            }
        }
    }

    /* renamed from: c */
    public final void mo62419c() {
        this.f64015k = true;
        if (this.mLayout != null) {
            this.mLayout.setVisibility(4);
            this.mLayout.setEnabled(false);
        }
    }

    /* renamed from: d */
    public final void mo62421d() {
        int i = 0;
        this.f64015k = false;
        if (this.mLayout != null) {
            View view = this.mLayout;
            if (this.f64016l) {
                i = 4;
            }
            view.setVisibility(i);
            this.mLayout.setEnabled(true);
        }
    }

    /* renamed from: e */
    public final void mo62422e() {
        if (isViewValid() && this.f64014j != null) {
            this.f64014j.mo62437g();
        }
    }

    /* renamed from: g */
    public final void mo62424g() {
        C0612l lVar = this.mFragmentManager;
        if (lVar != null) {
            Fragment a = lVar.mo2644a("comment_input_tag");
            if (a != null) {
                lVar.mo2645a().mo2587a(a).mo2606d();
            }
        }
    }

    /* renamed from: m */
    public final int mo63007m() {
        Aweme i = m79661i();
        if (i != null && i.isAwemeFromXiGua()) {
            return 5;
        }
        if (i == null || !i.isAwemeFromDongCheDi()) {
            return 1;
        }
        return 6;
    }

    /* renamed from: b */
    public final void mo62417b() {
        if (isViewValid()) {
            if (!C6861a.m21337f().isLogin()) {
                this.mEditCommentView.setFocusable(false);
            } else {
                this.mEditCommentView.setFocusable(true);
                this.mEditCommentView.setFocusableInTouchMode(true);
                this.mEditCommentView.requestFocus();
            }
            if (this.f64014j != null) {
                this.f64014j.mo62465a();
            }
        }
    }

    /* renamed from: f */
    public final void mo62423f() {
        if (this.f64012h != null && this.mEditCommentView != null && this.f64012h.getVisibility() == 0) {
            this.f64012h.setVisibility(8);
            this.mEditCommentView.setEnabled(true);
            this.mEditCommentView.setFocusable(true);
        }
    }

    /* renamed from: o */
    public final boolean mo63009o() {
        if (!C6861a.m21337f().isLogin()) {
            return false;
        }
        Aweme i = m79661i();
        if (i != null && !i.isCanPlay()) {
            if (i.isImage()) {
                C9738o.m28693a(getContext(), (int) R.string.bsx);
            } else {
                C9738o.m28693a(getContext(), (int) R.string.fp_);
            }
            return false;
        } else if (!m79663r()) {
            return true;
        } else {
            m79659a(i);
            return false;
        }
    }

    /* renamed from: r */
    private boolean m79663r() {
        if (this.f64013i == null || this.f64013i.mo62993e() == null) {
            return false;
        }
        Aweme e = this.f64013i.mo62993e();
        if (e == null || e.getStatus() == null || e.getStatus().getPrivateStatus() != 1 || e.getAuthor() == null || !TextUtils.equals(e.getAuthor().getUid(), C6861a.m21337f().getCurUser().getUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final boolean mo63008n() {
        if (!isViewValid()) {
            return false;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || !C6861a.m21337f().isLogin()) {
            return false;
        }
        Aweme i = m79661i();
        if (C32698a.m105818a(i)) {
            C10761a.m31403c(getContext(), C32698a.m105817a(i, R.string.fp_)).mo25750a();
            return false;
        } else if (i != null && !i.isCanPlay()) {
            if (i.isImage()) {
                C9738o.m28693a(getContext(), (int) R.string.bsx);
            } else {
                C9738o.m28693a(getContext(), (int) R.string.fp_);
            }
            return false;
        } else if (i != null && i.getStatus() != null && i.getStatus().isDelete()) {
            C9738o.m28693a((Context) activity, (int) R.string.fo2);
            return false;
        } else if (i != null && i.getStatus() != null && !i.getStatus().isAllowComment()) {
            C9738o.m28693a((Context) activity, (int) R.string.w5);
            return false;
        } else if (C43168s.m136911c(i) && !C43168s.m136913e(i) && (i.getAuthor() == null || !TextUtils.equals(i.getAuthor().getUid(), C6861a.m21337f().getCurUser().getUid()))) {
            C9738o.m28693a((Context) activity, (int) R.string.b_r);
            return false;
        } else if (m79663r()) {
            m79659a(i);
            return false;
        } else if (i == null || !i.isAwemeFromXiGua()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo63063a(C24221b bVar) {
        this.f64013i = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo63067h(boolean z) {
        mo62415a(!z);
    }

    /* renamed from: a */
    private void m79657a(int i) {
        if (this.f64013i != null) {
            this.f64013i.mo64929a(new C28318an(i));
        }
    }

    /* renamed from: e */
    public final void mo63001e(boolean z) {
        this.mLayout.setVisibility(0);
        m79657a(9);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f64014j = new C24093d(this, hashCode(), this);
    }

    /* renamed from: f */
    public final void mo63002f(boolean z) {
        C6907h.m21518a(getContext(), "comment_at", "click", m79664s(), 0);
    }

    /* renamed from: a */
    private void m79659a(final Aweme aweme) {
        if (aweme != null) {
            this.f64009e.mo72198a(aweme, 0);
            new C10741a(getContext()).mo25657b((int) R.string.d55).mo25658b((int) R.string.w_, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C6907h.onEvent(new MobClick().setEventName("private_permission").setLabelName("cancel").setValue(aweme.getAid()));
                }
            }).mo25650a((int) R.string.bxq, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    CommentInputFragment.this.f64009e.mo56976a(aweme.getAid(), Integer.valueOf(1));
                    C6907h.onEvent(new MobClick().setEventName("private_permission").setLabelName("confirm").setValue(aweme.getAid()));
                }
            }).mo25656a().mo25637a();
        }
    }

    /* renamed from: c */
    public final void mo62420c(boolean z) {
        int i;
        if (!(this.f64012h == null || this.mEditCommentView == null)) {
            View view = this.f64012h;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            this.mEditCommentView.setEnabled(!z);
            this.mEditCommentView.setFocusable(!z);
            Aweme i2 = m79661i();
            if (i2 != null && this.f64012h.getVisibility() == 0) {
                this.f64012h.setOnClickListener(new C24321d(this, i2));
            }
        }
    }

    /* renamed from: d */
    public final void mo62999d(String str) {
        String str2;
        String str3;
        Aweme i = m79661i();
        String str4 = this.f64011g;
        if (i == null) {
            str2 = "";
        } else {
            str2 = i.getAid();
        }
        if (i == null) {
            str3 = "";
        } else {
            str3 = i.getAuthorUid();
        }
        C24130a.m79266a(str, str4, str2, str3);
    }

    /* renamed from: g */
    public final void mo63003g(boolean z) {
        if (z) {
            C6903bc.m21485d().mo75954b(mo63006l(), m79661i(), C22704b.f60415d, "click_original");
        }
    }

    @C7709l
    public void onCommentEvent(C24029a aVar) {
        if (aVar.f63539a == 8) {
            String str = (String) aVar.f63540b;
            Aweme i = m79661i();
            if (i != null && i.getAid() != null && i.getAid().equals(str) && this.f64014j != null) {
                this.f64014j.mo62465a();
            }
        }
    }

    @C7709l
    public void onDislikeAwemeEvent(C28324g gVar) {
        float f;
        if (getActivity() != null && gVar.f74654e == getActivity().hashCode() && gVar.f74651b == 2) {
            if (gVar.f74650a) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            C41540at.m132301a(this.mEditContainerView, this.mEditContainerView.getAlpha(), f);
            C41540at.m132301a(this.tabDivider, this.tabDivider.getAlpha(), f);
        }
    }

    /* renamed from: b */
    public final void mo62997b(Comment comment) {
        if (isViewValid() && getActivity() != null) {
            C9738o.m28693a((Context) getActivity(), (int) R.string.a9f);
            mo62413a();
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).increaseCommentCount(m79664s());
            Aweme i = m79661i();
            if (i != null && i.isAd()) {
                ((C24219a) ServiceManager.get().getService(C24219a.class)).logFeedRawAdComment(getContext(), i, "comment_sign");
            }
            m79658a(comment);
            C42961az.m136380a(new C24029a(3, new Object[]{m79664s(), comment.clone()}));
        }
    }

    /* renamed from: d */
    public final void mo63000d(boolean z) {
        this.mLayout.setVisibility(4);
        m79657a(8);
        if (this.f64010f != null) {
            this.f64010f.mo62464a_(z);
        }
    }

    @C7709l
    public void onEvent(C29876a aVar) {
        if (!(!isViewValid() || getActivity() == null || aVar == null || aVar.f78475d != 1 || aVar.f78472a == null)) {
            if (aVar.f78476e == hashCode()) {
                C6903bc.m21485d().mo75951a(mo63006l(), aVar.f78474c, C22704b.f60415d, "click_comment", true);
            }
            if (isViewValid() && getActivity() != null) {
                mo62413a();
                ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).increaseCommentCount(m79664s());
            }
        }
    }

    /* renamed from: a */
    private void m79658a(Comment comment) {
        List<TextExtraStruct> textExtra = comment.getTextExtra();
        if (textExtra != null && this.f64014j != null) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                Iterator it = this.f64014j.f63699b.iterator();
                while (it.hasNext()) {
                    User user = (User) it.next();
                    if (TextUtils.equals(user.getUid(), textExtraStruct.getUserId())) {
                        int atType = user.getAtType();
                        if (atType == 3) {
                            C6907h.m21520a(getContext(), "comment_at", "follow", m79664s(), user.getUid());
                        } else if (atType == 1) {
                            C6907h.m21520a(getContext(), "comment_at", "search", m79664s(), user.getUid());
                        } else if (atType == 4) {
                            C6907h.m21520a(getContext(), "comment_at", "recent", m79664s(), user.getUid());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo62418b(boolean z) {
        float f;
        if (this.mLayout == null) {
            this.f64016l = z;
            return;
        }
        View view = this.mLayout;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        view.setAlpha(f);
        if (z) {
            this.mLayout.setVisibility(4);
        }
        this.mLayout.post(new C24320c(this, z));
    }

    /* renamed from: a */
    public final void mo62414a(float f) {
        int i;
        if (this.mLayout != null) {
            this.mLayout.setAlpha(f);
            View view = this.mLayout;
            boolean z = false;
            if (f > 0.0f) {
                i = 0;
            } else {
                i = 4;
            }
            view.setVisibility(i);
            if (f > 0.0f) {
                z = true;
            }
            mo62415a(z);
        }
    }

    /* renamed from: a */
    public static CommentInputFragment m79656a(View view, C0608j jVar) {
        if (view == null || jVar == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.cvb);
        Fragment a = jVar.mo2644a("comment_input_tag");
        if (a != null) {
            if (viewGroup2 != null) {
                return (CommentInputFragment) a;
            }
            jVar.mo2645a().mo2587a(a).mo2606d();
        }
        if (viewGroup2 == null) {
            RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext());
            relativeLayout.setId(R.id.cvb);
            viewGroup.addView(relativeLayout, new LayoutParams(-1, -1));
        }
        CommentInputFragment commentInputFragment = new CommentInputFragment();
        jVar.mo2645a().mo2586a(R.id.cvb, commentInputFragment, "comment_input_tag").mo2606d();
        return commentInputFragment;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f64014j != null) {
            this.f64014j.mo62474a(this.mEditCommentView, (View) this.ivAt, (View) this.ivEmoji, m79662q(), this.f64011g, (View) this.report);
        }
        this.mEditCommentView.setCursorVisible(false);
        this.mSendCommentView.setVisibility(8);
        this.mCbForward.setVisibility(8);
        C21085a.m71117a().mo56925a(2, this.mEditContainerView, this.tabDivider, this.f64012h, (C21089c) null);
        m79660h();
        if (this.f64015k) {
            mo62419c();
        }
        mo62418b(this.f64016l);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            SlideData slideData = (SlideData) C0069x.m159a(activity).mo147a(SlideData.class);
            slideData.mo60648a().observe(this, new C24301a(this));
            slideData.mo60649b().observe(this, new C24319b(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63064a(Aweme aweme, View view) {
        if (aweme.isAd()) {
            C24220a.m79551a().logDetailAdMaskClickReplay(getContext(), aweme.getAwemeRawAd().getCreativeIdStr(), "background", aweme.getAwemeRawAd().getLogExtra());
        }
        C42961az.m136380a(new C25572q(true, aweme.getAid()));
        mo62423f();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = C23147b.f61094a.mo60289a((Activity) getActivity(), (int) R.layout.fragment_input_detail, layoutInflater, viewGroup);
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C9738o.m28691a((Context) getActivity()), -2);
            layoutParams.addRule(12);
            a.setLayoutParams(layoutParams);
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C9738o.m28691a((Context) getActivity()), -2);
            layoutParams2.gravity = 80;
            a.setLayoutParams(layoutParams2);
        } else {
            a.setLayoutParams(new LayoutParams(C9738o.m28691a((Context) getActivity()), -2));
        }
        this.f64012h = a.findViewById(R.id.ca);
        C42961az.m136382c(this);
        ButterKnife.bind((Object) this, a);
        this.f64009e = C24220a.m79551a().getFeedStatusPresenter(getContext());
        return a;
    }

    /* renamed from: a */
    public final void mo62994a(int i, int i2, String str) {
        if (this.f64013i != null) {
            this.f64013i.mo62991a(i2);
        }
        m79657a(11);
    }
}
