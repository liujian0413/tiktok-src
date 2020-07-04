package com.p280ss.android.ugc.aweme.share.improve.business;

import android.arch.lifecycle.C0042h;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1095b.C24088b;
import com.p280ss.android.ugc.aweme.comment.services.C24222c;
import com.p280ss.android.ugc.aweme.comment.services.C24223d;
import com.p280ss.android.ugc.aweme.comment.services.CommentService;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.discover.hitrank.C26682g;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p280ss.android.ugc.aweme.forward.p1268b.C29876a;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38343b.C38344a;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.C38357h;
import com.p280ss.android.ugc.aweme.sharer.C38358i;
import com.p280ss.android.ugc.aweme.sharer.C38359j;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7585d;

/* renamed from: com.ss.android.ugc.aweme.share.improve.business.AwemeForwardChannel */
public final class AwemeForwardChannel implements C0042h, C24222c, C38343b {

    /* renamed from: b */
    public static final C38149a f99258b = new C38149a(null);

    /* renamed from: a */
    public C24088b f99259a;

    /* renamed from: c */
    private final Aweme f99260c;

    /* renamed from: d */
    private final Fragment f99261d;

    /* renamed from: e */
    private final String f99262e;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.business.AwemeForwardChannel$a */
    public static final class C38149a {
        private C38149a() {
        }

        public /* synthetic */ C38149a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.business.AwemeForwardChannel$b */
    static final /* synthetic */ class C38150b extends FunctionReference implements C7561a<C7581n> {
        C38150b(AwemeForwardChannel awemeForwardChannel) {
            super(0, awemeForwardChannel);
        }

        public final String getName() {
            return "forwardAweme";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(AwemeForwardChannel.class);
        }

        public final String getSignature() {
            return "forwardAweme()V";
        }

        /* renamed from: a */
        private void m121897a() {
            ((AwemeForwardChannel) this.receiver).mo95749d();
        }

        public final /* synthetic */ Object invoke() {
            m121897a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: a */
    public final int mo95736a() {
        return R.drawable.at6;
    }

    /* renamed from: a */
    public final void mo62994a(int i, int i2, String str) {
    }

    /* renamed from: a */
    public final boolean mo95737a(Context context, C38354f fVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(fVar, C38347c.f99553h);
        return true;
    }

    /* renamed from: a */
    public final boolean mo95738a(C38356g gVar, Context context) {
        C7573i.m23587b(gVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        return false;
    }

    /* renamed from: a */
    public final boolean mo95744a(C38357h hVar, Context context) {
        C7573i.m23587b(hVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        return false;
    }

    /* renamed from: a */
    public final boolean mo95745a(C38358i iVar, Context context) {
        C7573i.m23587b(iVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        return false;
    }

    /* renamed from: a */
    public final boolean mo95746a(C38359j jVar, Context context) {
        C7573i.m23587b(jVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        return false;
    }

    /* renamed from: b */
    public final String mo95739b() {
        return "forward";
    }

    /* renamed from: c */
    public final void mo62998c(Comment comment) {
    }

    /* renamed from: d */
    public final void mo95749d() {
        m121864h();
    }

    /* renamed from: d */
    public final void mo63000d(boolean z) {
    }

    /* renamed from: e */
    public final int mo95742e() {
        return R.drawable.at6;
    }

    /* renamed from: e */
    public final void mo63001e(boolean z) {
    }

    /* renamed from: f */
    public final float mo95747f() {
        return 0.34f;
    }

    /* renamed from: f */
    public final void mo63002f(boolean z) {
    }

    /* renamed from: g */
    public final void mo63003g(boolean z) {
    }

    /* renamed from: g */
    public final boolean mo95748g() {
        return false;
    }

    /* renamed from: j */
    public final Aweme mo63004j() {
        return this.f99260c;
    }

    /* renamed from: k */
    public final Comment mo63005k() {
        return null;
    }

    /* renamed from: l */
    public final String mo63006l() {
        return this.f99262e;
    }

    /* renamed from: m */
    public final int mo63007m() {
        return 4;
    }

    /* renamed from: n */
    public final boolean mo63008n() {
        return true;
    }

    /* renamed from: o */
    public final boolean mo63009o() {
        return true;
    }

    /* renamed from: p */
    public final boolean mo63011p() {
        return C24223d.m79571a(this);
    }

    /* renamed from: c */
    public final String mo95740c() {
        String string = C6399b.m19921a().getString(R.string.b9u);
        C7573i.m23582a((Object) string, "AppContextManager.getApp…tString(R.string.forward)");
        return string;
    }

    /* renamed from: h */
    private final void m121864h() {
        if (this.f99259a == null) {
            this.f99259a = C24217a.m79549a().providerCommentInputManager(this.f99261d, hashCode(), this);
        }
        C24088b bVar = this.f99259a;
        if (bVar == null) {
            C7573i.m23583a("commentInputManager");
        }
        bVar.mo62436f();
    }

    /* renamed from: a */
    private final void m121863a(String str) {
        C6903bc.m21485d().mo75954b(str, this.f99260c, C22704b.f60415d, "click_share_button");
    }

    /* renamed from: b */
    public final void mo62997b(Comment comment) {
        C24088b bVar = this.f99259a;
        if (bVar == null) {
            C7573i.m23583a("commentInputManager");
        }
        bVar.mo62437g();
        C26682g.f70355a.mo68414a(this.f99260c, 3);
    }

    /* renamed from: d */
    public final void mo62999d(String str) {
        C24217a.m79549a().sendEmojiToKeyboardEvent(str, this.f99262e, this.f99260c.getAid(), this.f99260c.getAuthorUid());
    }

    public final void onEvent(C29876a aVar) {
        if (aVar != null && aVar.f78475d == 1 && this.f99259a != null) {
            if (aVar.f78476e == hashCode()) {
                C6903bc.m21485d().mo75951a(this.f99262e, aVar.f78474c, C22704b.f60415d, "click_share_button", true);
                Context context = this.f99261d.getContext();
                if (!(context == null || aVar.f78472a == null)) {
                    ForwardDetail forwardDetail = aVar.f78472a;
                    C7573i.m23582a((Object) forwardDetail, "event.forwardDetail");
                    if (forwardDetail.getComment() != null) {
                        CommentService a = C24217a.m79549a();
                        C7573i.m23582a((Object) context, "this");
                        ForwardDetail forwardDetail2 = aVar.f78472a;
                        C7573i.m23582a((Object) forwardDetail2, "event.forwardDetail");
                        Comment comment = forwardDetail2.getComment();
                        C7573i.m23582a((Object) comment, "event.forwardDetail.comment");
                        a.handleCommentInputPublishSuccess(context, comment);
                    }
                }
            }
            C10761a.m31383a(C6399b.m19921a(), (int) R.string.b_4).mo25750a();
            C24088b bVar = this.f99259a;
            if (bVar == null) {
                C7573i.m23583a("commentInputManager");
            }
            bVar.mo62437g();
        }
    }

    /* renamed from: a */
    public final boolean mo95743a(Context context) {
        C7573i.m23587b(context, "context");
        return C38344a.m122505a(this, context);
    }

    /* renamed from: a */
    public final void mo95741a(RemoteImageView remoteImageView, boolean z) {
        C7573i.m23587b(remoteImageView, "imageView");
        C38344a.m122504a(this, remoteImageView, z);
    }

    /* renamed from: a */
    public final void mo62996a(String str, int i) {
        C24217a.m79549a().sendEmojiClickEvent(str, i, this.f99262e, this.f99260c.getAid(), this.f99260c.getAuthorUid());
    }

    /* renamed from: a */
    public final boolean mo71406a(C38354f fVar, Context context) {
        C7573i.m23587b(fVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        if (C6903bc.m21484c().mo59241a((int) R.string.e5s) || !this.f99260c.getAwemeControl().canShare() || !this.f99260c.getAwemeControl().canForward()) {
            return false;
        }
        m121863a(this.f99262e);
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (!f.isLogin()) {
            C32656f.m105744a(C6405d.m19984g(), this.f99262e, "click_repost_button", (Bundle) null, (C23305g) new C38151a(new C38150b(this)));
        } else {
            mo95749d();
        }
        return true;
    }

    public AwemeForwardChannel(Aweme aweme, Fragment fragment, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(str, "enterFrom");
        this.f99260c = aweme;
        this.f99261d = fragment;
        this.f99262e = str;
    }

    /* renamed from: a */
    public final void mo62995a(Exception exc, int i, Comment comment) {
        int i2;
        int i3 = i;
        CommentService a = C24217a.m79549a();
        Context a2 = C6399b.m19921a();
        if (i3 == 3) {
            i2 = R.string.b_3;
        } else {
            i2 = R.string.a8d;
        }
        a.handleException(a2, exc, i2, false);
        if (i3 == 3) {
            C6903bc.m21485d().mo75951a(this.f99262e, this.f99260c, C22704b.f60415d, "click_share_button", false);
        }
    }
}
