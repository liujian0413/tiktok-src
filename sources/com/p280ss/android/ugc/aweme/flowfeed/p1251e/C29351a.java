package com.p280ss.android.ugc.aweme.flowfeed.p1251e;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.app.AlertDialog;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.comment.abtest.C24033a;
import com.p280ss.android.ugc.aweme.comment.list.C24175a;
import com.p280ss.android.ugc.aweme.comment.list.C24176b;
import com.p280ss.android.ugc.aweme.comment.list.C24178d;
import com.p280ss.android.ugc.aweme.comment.list.C24179e;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1095b.C24088b;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24091b;
import com.p280ss.android.ugc.aweme.comment.param.C24201b.C24202a;
import com.p280ss.android.ugc.aweme.comment.services.C24222c;
import com.p280ss.android.ugc.aweme.comment.services.C24223d;
import com.p280ss.android.ugc.aweme.comment.services.CommentService;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.commercialize.C24551b;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26098c;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26115s;
import com.p280ss.android.ugc.aweme.feed.C28230c;
import com.p280ss.android.ugc.aweme.feed.event.C28308ad;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28321d;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.listener.C28519d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28465q;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28468t;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28470u;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29360a;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29363d;
import com.p280ss.android.ugc.aweme.flowfeed.p1253g.C29364a;
import com.p280ss.android.ugc.aweme.flowfeed.p1255i.C29383a;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21748f;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21749g;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21750a;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21753d;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21754e;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29556e;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.C29777a;
import com.p280ss.android.ugc.aweme.forward.model.C29905a;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29869b;
import com.p280ss.android.ugc.aweme.forward.p1268b.C29876a;
import com.p280ss.android.ugc.aweme.forward.p1269c.C29884d;
import com.p280ss.android.ugc.aweme.forward.p1270d.C29895c;
import com.p280ss.android.ugc.aweme.framework.services.IReportService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33267i;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.e.a */
public abstract class C29351a<M extends C25673a, V extends C29383a> extends C25652b<M, V> implements C24176b, C24179e, C24222c, C26115s, C28343z<C28318an>, C28465q, C28519d, C21749g, C29869b {

    /* renamed from: a */
    protected C28230c f77361a;

    /* renamed from: d */
    protected C24551b f77362d;

    /* renamed from: e */
    protected C28470u f77363e;

    /* renamed from: f */
    protected C29884d f77364f;

    /* renamed from: g */
    protected C24178d f77365g;

    /* renamed from: h */
    protected C24175a f77366h;

    /* renamed from: i */
    protected C24088b f77367i;

    /* renamed from: j */
    protected Aweme f77368j;

    /* renamed from: k */
    protected Comment f77369k;

    /* renamed from: l */
    protected boolean f77370l;

    /* renamed from: m */
    protected boolean f77371m;

    /* renamed from: n */
    public Comment f77372n;

    /* renamed from: b */
    public void mo58088b(Aweme aweme) {
    }

    /* renamed from: c */
    public C25673a mo58090c(Aweme aweme) {
        return C21748f.m72765a(this, aweme);
    }

    /* renamed from: c */
    public final void mo62998c(Comment comment) {
    }

    /* renamed from: d */
    public final void mo62623d(Exception exc) {
    }

    /* renamed from: d */
    public final void mo63000d(boolean z) {
    }

    /* renamed from: e */
    public String mo75068e() {
        return "";
    }

    /* renamed from: e */
    public final void mo67624e(Exception exc) {
    }

    /* renamed from: f */
    public final void mo63002f(boolean z) {
    }

    /* renamed from: j */
    public final Aweme mo63004j() {
        return this.f77368j;
    }

    /* renamed from: k */
    public final Comment mo63005k() {
        return this.f77369k;
    }

    /* renamed from: p */
    public final boolean mo63011p() {
        return C24223d.m79571a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract Fragment mo75080r();

    /* renamed from: a */
    public final void mo66537a(V v) {
        super.mo66537a(v);
        if (this.f77361a != null) {
            this.f77361a.mo71830a();
        }
    }

    /* renamed from: a */
    public final void mo66536a(M m) {
        super.mo66536a(m);
        if (this.f67571b instanceof C26098c) {
            ((C26098c) this.f67571b).f68932a = this;
        }
    }

    /* renamed from: a */
    public void mo57296a(Exception exc) {
        super.mo57296a(exc);
        if (this.f67571b != null && this.f67572c != null && ((C29383a) this.f67572c).isViewValid()) {
            ((C29383a) this.f67572c).mo75153a(false);
            int i = ((C25673a) this.f67571b).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    ((C29383a) this.f67572c).mo75163b(1);
                }
                return;
            }
            ((C29383a) this.f67572c).mo75133a(1);
        }
    }

    /* renamed from: a */
    public final void mo62619a(String str) {
        this.f77371m = true;
        ((C29383a) this.f67572c).mo75150a(this.f77368j.getAid(), str);
        C29363d.m96452b().mo75023a(mo75081s(), this.f77368j, this.f77372n);
    }

    /* renamed from: a */
    public final void mo58082a(View view, TextExtraStruct textExtraStruct, View view2, Aweme aweme) {
        if (C29363d.m96453c().mo75048a(view, textExtraStruct, view2, aweme, mo64928a(true))) {
            C6903bc.m21486e().mo75355a(view.getContext(), textExtraStruct, aweme, mo64928a(true));
        }
    }

    /* renamed from: a */
    public final void mo58084a(Aweme aweme, List<String> list) {
        if (aweme != null && !C6307b.m19566a((Collection<T>) list)) {
            C25712a aVar = new C25712a(mo75081s());
            aVar.mo66614a((CharSequence[]) list.toArray(new String[list.size()]), (OnClickListener) new C29355b(this, aweme, list));
            aVar.mo66615b();
            C29364a.m96456b(mo64928a(true), aweme);
        }
    }

    /* renamed from: a */
    public final void mo58085a(User user, List<String> list, OnShowListener onShowListener, OnDismissListener onDismissListener) {
        if (user != null && !C6307b.m19566a((Collection<T>) list)) {
            C1081a aVar = new C1081a(mo75081s(), R.style.rk);
            aVar.mo4236a((CharSequence[]) list.toArray(new String[list.size()]), (OnClickListener) new C29356c(this, user, list));
            aVar.mo4228a(onDismissListener);
            AlertDialog b = aVar.mo4242b();
            b.setOnShowListener(onShowListener);
            b.show();
            C29364a.m96455a(mo64928a(true), user);
        }
    }

    /* renamed from: a */
    public final void mo75063a(Aweme aweme, List<User> list, Comment comment, String str) {
        if (this.f77361a != null) {
            C24202a b = new C24202a(aweme).mo62901a(comment.getCid()).mo62903a(true).mo62907b(true).mo62908c(str).mo62910d(mo75068e()).mo62913e(false).mo62906b(list);
            if (mo86797t()) {
                b.mo62915f(true);
            }
            this.f77361a.mo62620a(b.mo62904a());
        } else {
            C24033a.m78868b("onExposedCommentClick mDialogController is null");
        }
        ((C29383a) this.f67572c).mo75154a(true, aweme);
    }

    /* renamed from: a */
    public void mo75056a(View view, Aweme aweme) {
        if (!C6861a.m21337f().isLogin()) {
            C32656f.m105743a(mo75081s(), "homepage_hot", "click_comment_emotion", C42914ab.m136242a().mo104633a("login_title", mo75081s().getString(R.string.a7i)).mo104633a("log_pb", C33230ac.m107234j(aweme != null ? aweme.getAid() : "")).f111445a);
            return;
        }
        this.f77368j = aweme;
        mo75079q();
        ((C29383a) this.f67572c).mo75154a(true, aweme);
    }

    /* renamed from: a */
    public final void mo75057a(View view, Aweme aweme, List<User> list, boolean z, String str) {
        if (this.f77361a != null) {
            C24202a b = new C24202a(aweme).mo62909c(z || this.f77371m).mo62908c(str).mo62910d(mo75068e()).mo62913e(false).mo62906b(list);
            if (mo86797t()) {
                b.mo62915f(true);
            }
            this.f77361a.mo62620a(b.mo62904a());
        } else {
            C24033a.m78868b("onExpandCommentClick mDialogController is null");
        }
        ((C29383a) this.f67572c).mo75154a(true, aweme);
        C6903bc.m21486e().mo75373b(aweme, mo64928a(true), "list");
        this.f77371m = false;
    }

    /* renamed from: a */
    public void mo75061a(Aweme aweme, String str, String str2) {
        C29363d.m96453c().mo75046a(aweme, str, str2, mo75081s(), mo64928a(true), "list");
    }

    /* renamed from: a */
    public final void mo75059a(Aweme aweme, Comment comment) {
        m96322b(aweme, comment);
    }

    /* renamed from: a */
    public final void mo75060a(Aweme aweme, Comment comment, int i) {
        if (!C29358e.m96406a(((C29383a) this.f67572c).getContext())) {
            C10761a.m31399c(((C29383a) this.f67572c).getContext(), (int) R.string.cjs).mo25750a();
        } else if (aweme != null && comment != null) {
            this.f77368j = aweme;
            String str = comment.getUserDigged() == 0 ? "1" : "2";
            String uid = comment.getUser() != null ? comment.getUser().getUid() : "";
            if (this.f77365g == null) {
                this.f77365g = C24217a.m79549a().providerCommentDiggPresenter();
                this.f77365g.mo62517a(this);
            }
            this.f77365g.mo62518a(comment.getCid(), comment.getAwemeId(), str, mo63006l());
            if (TextUtils.equals("1", str)) {
                C6903bc.m21486e().mo75364a(this.f77368j, comment.getCid(), uid, comment.getLabelType(), mo64928a(true), "list", i);
            }
        }
    }

    /* renamed from: a */
    public final void mo62995a(Exception exc, int i, Comment comment) {
        C29363d.m96452b().mo75031a(((C29383a) this.f67572c).getContext(), exc, i == 3 ? R.string.b_3 : R.string.a8d, false);
        if (i == 3) {
            C6903bc.m21485d().mo75951a(mo64928a(true), mo63004j(), "list", this.f77370l ? "click_repost_button" : "click_comment", false);
        }
    }

    /* renamed from: a */
    public final void mo62996a(String str, int i) {
        String aid;
        Aweme j = mo63004j();
        C29360a b = C29363d.m96452b();
        String a = mo64928a(true);
        if (j == null) {
            aid = "";
        } else {
            aid = j.getAid();
        }
        b.mo75027a(str, i, a, aid, j == null ? "" : j.getAuthorUid());
    }

    /* renamed from: c */
    public /* synthetic */ C25673a mo58089c() {
        return (C25673a) super.mo66539h();
    }

    /* renamed from: m */
    public final int mo63007m() {
        if (this.f77370l) {
            return 4;
        }
        return 2;
    }

    /* renamed from: t */
    private boolean mo86797t() {
        return TextUtils.equals(mo63006l(), "homepage_familiar");
    }

    /* renamed from: n */
    public final boolean mo63008n() {
        if (!C6861a.m21337f().isLogin()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean mo63009o() {
        if (!C6861a.m21337f().isLogin()) {
            return false;
        }
        return true;
    }

    /* renamed from: W_ */
    public final void mo66535W_() {
        super.mo66535W_();
        if (this.f67571b instanceof C26098c) {
            ((C26098c) this.f67571b).f68932a = null;
        }
    }

    /* renamed from: f */
    public final void mo75069f() {
        if (this.f77361a != null) {
            this.f77361a.mo71836c();
        }
        if (this.f77362d != null) {
            this.f77362d.mo71836c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo75079q() {
        if (this.f77367i == null) {
            this.f77367i = C29363d.m96452b().mo75020a(mo75080r(), hashCode(), (C24222c) this);
        }
        this.f77367i.mo62436f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final Activity mo75081s() {
        if (mo75080r() != null) {
            return mo75080r().getActivity();
        }
        return null;
    }

    /* renamed from: S_ */
    public final void mo57293S_() {
        if (this.f67571b != null && this.f67572c != null && ((C29383a) this.f67572c).isViewValid()) {
            int i = ((C25673a) this.f67571b).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    ((C29383a) this.f67572c).mo75163b(2);
                }
                return;
            }
            ((C29383a) this.f67572c).mo75133a(2);
        }
    }

    /* renamed from: g */
    public final void mo75070g() {
        if (this.f77365g != null) {
            this.f77365g.mo62519c();
        }
        if (this.f77367i != null) {
            this.f77367i.mo62439m();
            this.f77367i = null;
        }
        if (this.f77366h != null) {
            this.f77366h.ao_();
        }
        if (this.f77363e != null) {
            this.f77363e.mo66535W_();
            this.f77363e.mo59134U_();
        }
        if (this.f77364f != null) {
            this.f77364f.mo66535W_();
            this.f77364f.mo59134U_();
        }
        C42961az.m136383d(this);
    }

    /* renamed from: a */
    public final void mo58083a(Aweme aweme) {
        mo75067d(aweme);
    }

    /* renamed from: b */
    public final void mo62622b(String str) {
        ((C29383a) this.f67572c).mo75151a(this.f77368j.getAid(), str, -1);
    }

    /* renamed from: e */
    public final void mo63001e(boolean z) {
        if (z) {
            this.f77370l = false;
            this.f77369k = null;
            ((C29383a) this.f67572c).mo75154a(false, (Aweme) null);
        }
    }

    /* renamed from: b */
    public final void mo62997b(Comment comment) {
        if (this.f77367i != null) {
            this.f77367i.mo62437g();
        }
        ((C29383a) this.f67572c).mo75148a(this.f77368j.getAid(), comment);
        this.f77371m = true;
    }

    /* renamed from: b_ */
    public final void mo67620b_(String str) {
        C42961az.m136380a(new C28318an(2, str));
        ((C29383a) this.f67572c).mo75158b(str);
    }

    /* renamed from: g */
    public final void mo63003g(boolean z) {
        if (z) {
            C6903bc.m21485d().mo75954b(mo64928a(true), mo63004j(), "list", "click_original");
        }
    }

    @C7709l
    public void onDeleteItemEvent(C21750a aVar) {
        if (this.f67572c != null && ((C29383a) this.f67572c).isViewValid()) {
            ((C29383a) this.f67572c).mo75141a(aVar);
        }
    }

    @C7709l
    public void onPrivateModelEvent(C28308ad adVar) {
        if (adVar.f74617b != null && this.f67572c != null && ((C29383a) this.f67572c).isViewValid()) {
            ((C29383a) this.f67572c).mo75137a(adVar);
        }
    }

    @C7709l
    public void onUnFollowUserEvent(C21754e eVar) {
        if (this.f67572c != null && ((C29383a) this.f67572c).isViewValid()) {
            ((C29383a) this.f67572c).mo75142a(eVar);
        }
    }

    /* renamed from: c */
    public final void mo67680c(String str) {
        if (this.f67572c != null && ((C29383a) this.f67572c).isViewValid()) {
            ((C29383a) this.f67572c).mo75158b(str);
        }
    }

    /* renamed from: d */
    public final void mo75067d(Aweme aweme) {
        String str;
        this.f77368j = aweme;
        this.f77370l = true;
        mo75079q();
        ((C29383a) this.f67572c).mo75154a(true, aweme);
        C29895c d = C6903bc.m21485d();
        String a = mo64928a(true);
        Aweme j = mo63004j();
        String str2 = "list";
        if (this.f77369k != null) {
            str = "click_reply_comment";
        } else {
            str = "click_repost_button";
        }
        d.mo75950a(a, j, str2, str);
    }

    @C7709l
    public void onCommentDialogEvent(C28321d dVar) {
        if (this.f67572c != null && ((C29383a) this.f67572c).isViewValid() && dVar.f74645a == 0) {
            ((C29383a) this.f67572c).mo75154a(false, (Aweme) null);
            ((C29383a) this.f67572c).mo75147a(dVar.f74647c, dVar.f74646b);
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onReportCommentEvent(C27994k kVar) {
        if (C6399b.m19944t()) {
            try {
                if (TextUtils.equals("commentReportSuccess", kVar.f73730b.getString("eventName")) && this.f67572c != null) {
                    ((C29383a) this.f67572c).mo75150a(this.f77368j.getAid(), kVar.f73730b.getJSONObject("data").getString("object_id"));
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: d */
    public final void mo62999d(String str) {
        String str2;
        String str3;
        Aweme j = mo63004j();
        C29360a b = C29363d.m96452b();
        String a = mo64928a(true);
        if (j == null) {
            str2 = "";
        } else {
            str2 = j.getAid();
        }
        if (j == null) {
            str3 = "";
        } else {
            str3 = j.getAuthorUid();
        }
        b.mo75030a(str, a, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        return;
     */
    @org.greenrobot.eventbus.C7709l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCommentEvent(com.p280ss.android.ugc.aweme.comment.p1094a.C24029a r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.common.e r0 = r3.f67572c
            if (r0 == 0) goto L_0x005c
            com.ss.android.ugc.aweme.common.e r0 = r3.f67572c
            com.ss.android.ugc.aweme.flowfeed.i.a r0 = (com.p280ss.android.ugc.aweme.flowfeed.p1255i.C29383a) r0
            boolean r0 = r0.isViewValid()
            if (r0 != 0) goto L_0x000f
            goto L_0x005c
        L_0x000f:
            java.lang.Object r0 = r4.f63540b
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            if (r0 == 0) goto L_0x005b
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L_0x001a
            goto L_0x005b
        L_0x001a:
            int r4 = r4.f63539a     // Catch:{ Exception -> 0x005a }
            r1 = 0
            r2 = 1
            switch(r4) {
                case 2: goto L_0x0042;
                case 3: goto L_0x0032;
                case 4: goto L_0x0022;
                default: goto L_0x0021;
            }     // Catch:{ Exception -> 0x005a }
        L_0x0021:
            goto L_0x0059
        L_0x0022:
            com.ss.android.ugc.aweme.common.e r4 = r3.f67572c     // Catch:{ Exception -> 0x005a }
            com.ss.android.ugc.aweme.flowfeed.i.a r4 = (com.p280ss.android.ugc.aweme.flowfeed.p1255i.C29383a) r4     // Catch:{ Exception -> 0x005a }
            r1 = r0[r1]     // Catch:{ Exception -> 0x005a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x005a }
            r0 = r0[r2]     // Catch:{ Exception -> 0x005a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x005a }
            r4.mo75150a(r1, r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x005a
        L_0x0032:
            com.ss.android.ugc.aweme.common.e r4 = r3.f67572c     // Catch:{ Exception -> 0x005a }
            com.ss.android.ugc.aweme.flowfeed.i.a r4 = (com.p280ss.android.ugc.aweme.flowfeed.p1255i.C29383a) r4     // Catch:{ Exception -> 0x005a }
            r1 = r0[r1]     // Catch:{ Exception -> 0x005a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x005a }
            r0 = r0[r2]     // Catch:{ Exception -> 0x005a }
            com.ss.android.ugc.aweme.comment.model.Comment r0 = (com.p280ss.android.ugc.aweme.comment.model.Comment) r0     // Catch:{ Exception -> 0x005a }
            r4.mo75159b(r1, r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x005a
        L_0x0042:
            r4 = r0[r2]     // Catch:{ Exception -> 0x005a }
            com.ss.android.ugc.aweme.comment.model.Comment r4 = (com.p280ss.android.ugc.aweme.comment.model.Comment) r4     // Catch:{ Exception -> 0x005a }
            com.ss.android.ugc.aweme.common.e r2 = r3.f67572c     // Catch:{ Exception -> 0x005a }
            com.ss.android.ugc.aweme.flowfeed.i.a r2 = (com.p280ss.android.ugc.aweme.flowfeed.p1255i.C29383a) r2     // Catch:{ Exception -> 0x005a }
            r0 = r0[r1]     // Catch:{ Exception -> 0x005a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x005a }
            java.lang.String r1 = r4.getCid()     // Catch:{ Exception -> 0x005a }
            int r4 = r4.getDiggCount()     // Catch:{ Exception -> 0x005a }
            r2.mo75151a(r0, r1, r4)     // Catch:{ Exception -> 0x005a }
        L_0x0059:
            return
        L_0x005a:
            return
        L_0x005b:
            return
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.flowfeed.p1251e.C29351a.onCommentEvent(com.ss.android.ugc.aweme.comment.a.a):void");
    }

    @C7709l
    public void onEvent(C29876a aVar) {
        String str;
        if (aVar != null) {
            if (aVar.f78475d == 1) {
                if (aVar.f78476e == hashCode() && mo75080r().isVisible() && mo75080r().isResumed()) {
                    C29895c d = C6903bc.m21485d();
                    String a = mo64928a(true);
                    Aweme aweme = aVar.f78474c;
                    String str2 = "list";
                    if (this.f77370l) {
                        str = "click_repost_button";
                    } else {
                        str = "click_comment";
                    }
                    d.mo75951a(a, aweme, str2, str, true);
                }
                if (this.f77367i != null) {
                    this.f77367i.mo62437g();
                }
                ((C29383a) this.f67572c).mo75149a(aVar.f78473b, aVar.f78472a);
            } else if (aVar.f78475d == 2) {
                ((C29383a) this.f67572c).mo75158b(aVar.f78473b);
            }
            this.f77371m = true;
        }
    }

    @C7709l
    public void onPreloadEvent(C21753d dVar) {
        if (dVar.f58263a != null && this.f67572c != null && ((C29383a) this.f67572c).isViewValid() && ((C29383a) this.f67572c).mo75174k() != 0) {
            Aweme aweme = dVar.f58263a;
            if (aweme.getAwemeType() == 13) {
                aweme = aweme.getForwardItem();
            }
            Aweme b = ((C29383a) this.f67572c).mo75156b(aweme);
            if (b != null) {
                C43305j.m137386g().mo105028b();
                Video video = b.getVideo();
                if (video != null && video.getProperPlayAddr() != null) {
                    video.setRationAndSourceId(b.getAid());
                    C43305j.m137386g().mo105085a(b);
                }
            }
        }
    }

    @C7709l
    public void onVideoEvent(C28318an anVar) {
        if (this.f67572c != null && ((C29383a) this.f67572c).isViewValid()) {
            int i = anVar.f74631a;
            if (i != 13) {
                if (i == 21 && (anVar.f74632b instanceof Aweme)) {
                    Aweme aweme = (Aweme) anVar.f74632b;
                    if (anVar.f74641k) {
                        ((C29383a) this.f67572c).mo75139a(aweme, anVar.f74635e);
                    }
                    ((C29383a) this.f67572c).mo75140a(aweme, !anVar.f74640j, anVar.f74635e, anVar.f74636f);
                }
                return;
            }
            ((C29383a) this.f67572c).mo75146a((String) anVar.f74632b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo64929a(C28318an anVar) {
        if (this.f67571b != null && this.f67572c != null && ((C29383a) this.f67572c).isViewValid()) {
            int i = anVar.f74631a;
            if (i != 28) {
                switch (i) {
                    case 1:
                        if (C6900g.m21454b().mo16943d()) {
                            Aweme aweme = (Aweme) anVar.f74632b;
                            if (aweme != null && aweme.getAuthor() != null && this.f77361a != null) {
                                C29363d.m96451a().mo75042a(aweme, mo75081s(), this.f77361a.mo71843n());
                                break;
                            } else {
                                return;
                            }
                        } else {
                            if (((C29383a) this.f67572c).getContext() != null) {
                                C10761a.m31399c(((C29383a) this.f67572c).getContext(), (int) R.string.cjs).mo25750a();
                            }
                            return;
                        }
                    case 2:
                        if (!C6900g.m21454b().mo16943d()) {
                            C10761a.m31399c(((C29383a) this.f67572c).getContext(), (int) R.string.cjs).mo25750a();
                            return;
                        }
                        Aweme aweme2 = (Aweme) anVar.f74632b;
                        if (aweme2 != null && !TextUtils.isEmpty(aweme2.getAid())) {
                            if (aweme2.getAwemeType() == 13) {
                                if (this.f77364f == null) {
                                    this.f77364f = new C29884d();
                                    this.f77364f.mo66536a(new C29905a());
                                    this.f77364f.mo66537a(this);
                                }
                                this.f77364f.f78505a = aweme2.getAid();
                                this.f77364f.mo56976a(aweme2.getAid());
                                return;
                            }
                            if (this.f77363e == null) {
                                this.f77363e = new C28470u();
                                this.f77363e.mo66536a(new C28468t());
                                this.f77363e.mo66537a(this);
                            }
                            this.f77363e.mo56976a(aweme2.getAid());
                            return;
                        }
                        return;
                }
                return;
            }
            ((C29383a) this.f67572c).mo75154a(false, (Aweme) null);
        }
    }

    /* renamed from: a */
    public void mo58077a(Context context, Aweme aweme) {
        if (this.f77362d != null) {
            this.f77362d.mo64356a(new C28318an(41, aweme), mo64928a(true));
        }
    }

    /* renamed from: a */
    public final void mo75055a(Fragment fragment, int i) {
        this.f77361a = C29363d.m96451a().mo75032a(mo64928a(true), i, (C28343z<C28318an>) this, (C28519d) this);
        this.f77361a.mo71834a(fragment.getActivity(), fragment);
        this.f77362d = new C24551b(mo64928a(true), i);
        this.f77362d.mo71834a(fragment.getActivity(), fragment);
        C42961az.m136382c(this);
    }

    /* renamed from: b */
    private void m96322b(final Aweme aweme, final Comment comment) {
        String str;
        if (aweme != null && comment != null) {
            this.f77368j = aweme;
            if (this.f77367i == null) {
                this.f77367i = C29363d.m96452b().mo75020a(mo75080r(), hashCode(), (C24222c) this);
            }
            if (comment.getUser() != null) {
                str = comment.getUser().getUid();
            } else {
                str = "";
            }
            this.f77367i.mo62427a(comment.getCommentType(), false, false, TextUtils.equals(str, C6861a.m21337f().getCurUserId()), TextUtils.equals(aweme.getAuthorUid(), C6861a.m21337f().getCurUserId()), false, comment, new C24091b() {
                /* renamed from: a */
                public final void mo62452a() {
                }

                /* renamed from: i */
                public final void mo62460i() {
                }

                /* renamed from: j */
                public final void mo62461j() {
                }

                /* renamed from: k */
                public final void mo62462k() {
                }

                /* renamed from: l */
                public final void mo62463l() {
                }

                /* renamed from: c */
                public final void mo62454c() {
                    C29351a.this.mo75063a(aweme, null, comment, "");
                }

                /* renamed from: d */
                public final void mo62455d() {
                    C29351a.this.f77369k = comment;
                    C29351a.this.mo75067d(aweme);
                }

                /* renamed from: g */
                public final void mo62458g() {
                    C29351a.this.f77367i.mo62429a(comment, C29351a.this.mo64928a(true));
                }

                /* renamed from: h */
                public final void mo62459h() {
                    C29363d.m96452b().mo75026a(C29351a.this.mo64928a(true));
                    ((C29383a) C29351a.this.f67572c).mo75154a(false, (Aweme) null);
                }

                /* renamed from: f */
                public final void mo62457f() {
                    C29351a.this.f77367i.mo62428a(comment);
                    C29363d.m96452b().mo75029a(C29351a.this.mo64928a(true), comment.getUser().getUid(), comment.getCid(), C29351a.this.f77368j);
                }

                /* renamed from: b */
                public final void mo62453b() {
                    if (C29351a.this.mo75081s() != null) {
                        if (!C29357d.m96405a(((C29383a) C29351a.this.f67572c).getContext())) {
                            C10761a.m31399c(((C29383a) C29351a.this.f67572c).getContext(), (int) R.string.cjs);
                            return;
                        }
                        if (C29351a.this.f77366h == null) {
                            C29351a.this.f77366h = C24217a.m79549a().providerCommentDeletePresenter();
                            C29351a.this.f77366h.mo62513a(C29351a.this);
                        }
                        if (!TextUtils.isEmpty(comment.getCid())) {
                            C29351a.this.f77366h.mo62514a(comment.getCid(), aweme.getAid());
                            C29351a.this.f77372n = comment;
                        }
                    }
                }

                /* renamed from: e */
                public final void mo62456e() {
                    ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog(C29351a.this.mo75081s(), "comment", comment.getCid(), comment.getUser().getUid(), C29351a.this.f77368j.getAuthorUid(), null);
                    C29363d.m96452b().mo75028a(C29351a.this.mo64928a(true), C29351a.this.mo63004j(), comment.getCid(), "list", "click_report_button");
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo58091c(View view, View view2, Aweme aweme) {
        if (C29363d.m96453c().mo75047a(view, view2, aweme)) {
            C6903bc.m21486e().mo75362a(aweme, mo64928a(true), "list");
        }
    }

    /* renamed from: d */
    public final void mo58092d(View view, View view2, Aweme aweme) {
        if (C29363d.m96453c().mo75052b(view, view2, aweme)) {
            C6903bc.m21486e().mo75362a(aweme, mo64928a(true), "list");
            C29364a.m96454a(mo64928a(true), aweme);
        }
    }

    /* renamed from: a */
    public final void mo62994a(int i, int i2, String str) {
        String str2;
        String str3;
        C6903bc.m21486e().mo75374b(this.f77368j, mo64928a(true), "list", "");
        CommentService a = C24217a.m79549a();
        Aweme aweme = this.f77368j;
        String a2 = mo64928a(true);
        String a3 = C29363d.m96452b().mo75022a(this.f77369k);
        if (this.f77369k != null) {
            str2 = this.f77369k.getCid();
        } else {
            str2 = "";
        }
        String str4 = str2;
        String str5 = "list";
        String valueOf = String.valueOf(i2);
        if (i != 3) {
            str3 = "click_comment_box";
        } else {
            str3 = "repost_comment";
        }
        a.sendPostCommentEvent(aweme, str, a2, a3, str4, str5, valueOf, 0, str3);
    }

    /* renamed from: a */
    public final void mo58078a(View view, View view2, Aweme aweme) {
        if (this.f67572c != null && ((C29383a) this.f67572c).isViewValid() && this.f77361a != null && aweme != null) {
            new C33267i().mo85275k(aweme.getAuthorUid()).mo85268d(mo64928a(true)).mo85269e(mo64928a(true)).mo85071g(aweme).mo85271f("list").mo85252e();
            this.f77361a.mo71983a(mo75081s(), aweme);
            ((C29383a) this.f67572c).mo75154a(true, aweme);
        }
    }

    /* renamed from: b */
    public void mo58086b(View view, View view2, Aweme aweme) {
        if (aweme != null) {
            ((C29383a) this.f67572c).mo75154a(true, aweme);
            if (this.f77362d != null) {
                this.f77362d.mo64358b(new C28318an(24, aweme), "click_shopping_cart", "video_cart_tag", mo64928a(true));
                C6903bc.m21486e().mo75378d(aweme, mo64928a(true));
            }
        }
    }

    /* renamed from: a */
    public final void mo58080a(View view, View view2, User user) {
        C29363d.m96453c().mo75050a(user, mo75081s(), mo64928a(true));
    }

    /* renamed from: b */
    public final void mo75066b(Aweme aweme, String str, String str2) {
        C29363d.m96453c().mo75045a(((C29383a) this.f67572c).getContext(), str, str2, mo64928a(true));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo75065a(User user, List<String> list, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (TextUtils.equals((String) list.get(i), mo75081s().getString(R.string.fll))) {
            new C29548a(new C29777a(mo75081s()), new C29556e() {
                /* renamed from: a */
                public final void mo67853a(int i, User user) {
                }

                /* renamed from: a */
                public final String mo68099a() {
                    return C29351a.this.mo63006l();
                }
            }).mo75558a(user);
            C21754e eVar = new C21754e();
            eVar.f58264a = user.getUid();
            C42961az.m136380a(eVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo75062a(final Aweme aweme, List<String> list, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        String str = (String) list.get(i);
        if (TextUtils.equals(str, mo75081s().getString(R.string.ds3))) {
            mo58078a((View) null, (View) null, aweme);
        } else if (TextUtils.equals(str, mo75081s().getString(R.string.fll))) {
            new C29548a(new C29777a(mo75081s()), new C29556e() {
                /* renamed from: a */
                public final String mo68099a() {
                    return C29351a.this.mo63006l();
                }

                /* renamed from: a */
                public final void mo67853a(int i, User user) {
                    C6903bc.m21486e().mo75370a("follow_cancel", mo68099a(), aweme);
                }
            }).mo75558a(aweme.getAuthor());
            C21754e eVar = new C21754e();
            eVar.f58264a = aweme.getAuthorUid();
            C42961az.m136380a(eVar);
        } else {
            if (TextUtils.equals(str, mo75081s().getString(R.string.b_h))) {
                C29363d.m96451a().mo75036a(mo75081s(), aweme);
            }
        }
    }

    /* renamed from: a */
    public void mo58079a(View view, View view2, Aweme aweme, User user) {
        if (C29363d.m96453c().mo75049a(aweme, user, mo75081s(), mo64928a(true)) && !C21740a.m72684a(user)) {
            C6903bc.m21486e().mo75376c(aweme, mo64928a(true));
            C6903bc.m21486e().mo75366a(aweme, user.getUid(), "head", mo64928a(true), "list");
        }
    }

    /* renamed from: b */
    public void mo58087b(View view, View view2, Aweme aweme, User user) {
        if (C29363d.m96453c().mo75053b(aweme, user, mo75081s(), mo64928a(true))) {
            C6903bc.m21486e().mo75376c(aweme, mo64928a(true));
            C6903bc.m21486e().mo75366a(aweme, user.getUid(), "name", mo64928a(true), "list");
        }
    }

    /* renamed from: a */
    public final void mo58081a(View view, View view2, User user, String str, String str2) {
        C29363d.m96453c().mo75051a(user, mo75081s(), str, str2);
    }
}
