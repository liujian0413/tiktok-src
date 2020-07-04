package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27746c;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.g */
public final class C38098g implements C38389f {

    /* renamed from: c */
    public static final C38099a f99168c = new C38099a(null);

    /* renamed from: a */
    public C27743a f99169a;

    /* renamed from: b */
    public final Aweme f99170b;

    /* renamed from: d */
    private final String f99171d;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.g$a */
    public static final class C38099a {
        private C38099a() {
        }

        public /* synthetic */ C38099a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.g$b */
    static final class C38100b implements C23305g {

        /* renamed from: a */
        final /* synthetic */ C38098g f99172a;

        C38100b(C38098g gVar) {
            this.f99172a = gVar;
        }

        /* renamed from: a */
        public final void mo58664a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo58663a() {
            this.f99172a.mo95728f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.g$c */
    public static final class C38101c implements C27746c {

        /* renamed from: a */
        final /* synthetic */ C38098g f99173a;

        /* renamed from: a */
        public final void mo61805a(Exception exc) {
        }

        C38101c(C38098g gVar) {
            this.f99173a = gVar;
        }

        /* renamed from: a */
        public final void mo61803a(BaseResponse baseResponse) {
            if (!this.f99173a.f99170b.isCollected()) {
                this.f99173a.f99170b.setCollectStatus(1);
                ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateCollectStatus(this.f99173a.f99170b.getAid(), 1);
                return;
            }
            this.f99173a.f99170b.setCollectStatus(0);
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateCollectStatus(this.f99173a.f99170b.getAid(), 0);
        }
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "favorite";
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        return true;
    }

    /* renamed from: a */
    public final int mo95710a() {
        if (this.f99170b.isCollected()) {
            return R.drawable.asw;
        }
        return R.drawable.aud;
    }

    /* renamed from: c */
    public final int mo95716c() {
        if (this.f99170b.isCollected()) {
            if (C6399b.m19944t()) {
                return R.string.iq;
            }
            return R.string.wc;
        } else if (C6399b.m19944t()) {
            return R.string.ip;
        } else {
            return R.string.e1m;
        }
    }

    /* renamed from: f */
    public final void mo95728f() {
        if (this.f99169a == null) {
            this.f99169a = new C27743a();
        }
        C27743a aVar = this.f99169a;
        if (aVar == null) {
            C7573i.m23583a("collectActionPresenter");
        }
        aVar.mo66537a(new C38101c(this));
        C27743a aVar2 = this.f99169a;
        if (aVar2 == null) {
            C7573i.m23583a("collectActionPresenter");
        }
        aVar2.mo56976a(Integer.valueOf(2), this.f99170b.getAid(), Integer.valueOf(this.f99170b.isCollected() ^ true ? 1 : 0));
    }

    /* renamed from: g */
    private final void m121633g() {
        String str;
        if (!this.f99170b.isCollected()) {
            C22984d a = C22984d.m75611a();
            a.mo59973a("enter_from", this.f99171d).mo59973a("group_id", this.f99170b.getAid()).mo59973a("author_id", this.f99170b.getAuthorUid()).mo59973a("enter_method", "click_share_button").mo59974a(C6903bc.m21485d().mo75947a(this.f99170b, C22704b.f60415d));
            if (C7573i.m23585a((Object) "homepage_country", (Object) this.f99171d) && this.f99170b.getAuthor() != null) {
                String str2 = "country_name";
                if (this.f99170b.getAuthor() == null) {
                    str = "";
                } else {
                    User author = this.f99170b.getAuthor();
                    C7573i.m23582a((Object) author, "aweme.author");
                    str = author.getRegion();
                }
                a.mo59973a(str2, str);
            }
            if (C33230ac.m107222d(this.f99171d)) {
                a.mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(this.f99170b)));
                C6907h.m21525a("favourite_video", C33230ac.m107211a(a.f60753a));
            } else {
                C6907h.m21524a("favourite_video", (Map) a.f60753a);
            }
            C28580o.m93830a(PAGE.SHARE);
            return;
        }
        C6907h.m21524a("cancel_favourite_video", (Map) C22984d.m75611a().mo59973a("enter_from", this.f99171d).mo59973a("group_id", this.f99170b.getAid()).mo59973a("author_id", this.f99170b.getAuthorUid()).mo59973a("enter_method", "click_share_button").mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(this.f99170b))).mo59974a(C6903bc.m21485d().mo75947a(this.f99170b, C22704b.f60415d)).f60753a);
    }

    /* renamed from: a */
    public final void mo95711a(Context context) {
        C7573i.m23587b(context, "context");
        C38390a.m122628a((C38389f) this, context);
    }

    /* renamed from: a */
    public final void mo95713a(ImageView imageView) {
        C7573i.m23587b(imageView, "iconView");
        C38390a.m122629a((C38389f) this, imageView);
    }

    /* renamed from: a */
    public final void mo95714a(TextView textView) {
        C7573i.m23587b(textView, "textView");
        C38390a.m122630a((C38389f) this, textView);
    }

    public C38098g(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "enterFrom");
        this.f99170b = aweme;
        this.f99171d = str;
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        m121633g();
        if (C25329c.m83220c(this.f99170b)) {
            C10761a.m31399c(context, (int) R.string.e4).mo25750a();
            return;
        }
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (!f.isLogin()) {
            String aid = this.f99170b.getAid();
            C32656f.m105744a(C38157b.m121903a(context), this.f99171d, "click_favorite_video", C42914ab.m136242a().mo104633a("group_id", aid).mo104633a("log_pb", C33230ac.m107234j(aid)).f111445a, (C23305g) new C38100b(this));
            return;
        }
        mo95728f();
    }
}
