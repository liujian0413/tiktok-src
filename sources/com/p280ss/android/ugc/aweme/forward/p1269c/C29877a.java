package com.p280ss.android.ugc.aweme.forward.p1269c;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.comment.list.C24178d;
import com.p280ss.android.ugc.aweme.comment.list.C24184j;
import com.p280ss.android.ugc.aweme.comment.list.C24187m;
import com.p280ss.android.ugc.aweme.comment.list.C24190p;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24090a;
import com.p280ss.android.ugc.aweme.comment.services.CommentService;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.commercialize.C24551b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27536b;
import com.p280ss.android.ugc.aweme.feed.C28297e;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.listener.C28519d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28468t;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28470u;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21748f;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21749g;
import com.p280ss.android.ugc.aweme.forward.model.C29905a;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29866a.C29867a;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29866a.C29868b;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33267i;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.p1418a.C34110a;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.forward.c.a */
public class C29877a implements C28343z<C28318an>, C28519d, C29867a {

    /* renamed from: a */
    public C28297e f78477a;

    /* renamed from: b */
    public C24551b f78478b;

    /* renamed from: c */
    public C29868b f78479c;

    /* renamed from: d */
    public C24178d f78480d;

    /* renamed from: e */
    public C24184j f78481e;

    /* renamed from: f */
    public final boolean f78482f = C7213d.m22500a().mo18713F();

    /* renamed from: g */
    public String f78483g;

    /* renamed from: h */
    public int f78484h;

    /* renamed from: i */
    public String f78485i;

    /* renamed from: j */
    public C24190p f78486j;

    /* renamed from: k */
    private C28470u f78487k;

    /* renamed from: l */
    private C29884d f78488l;

    /* renamed from: m */
    private C21747e f78489m = new C21749g() {
        /* renamed from: a */
        public final void mo58080a(View view, View view2, User user) {
        }

        /* renamed from: a */
        public final void mo58081a(View view, View view2, User user, String str, String str2) {
        }

        /* renamed from: a */
        public final void mo75056a(View view, Aweme aweme) {
        }

        /* renamed from: a */
        public final void mo75059a(Aweme aweme, Comment comment) {
        }

        /* renamed from: a */
        public final void mo75060a(Aweme aweme, Comment comment, int i) {
        }

        /* renamed from: a */
        public final void mo75061a(Aweme aweme, String str, String str2) {
        }

        /* renamed from: a */
        public final void mo58084a(Aweme aweme, List<String> list) {
        }

        /* renamed from: a */
        public final void mo75063a(Aweme aweme, List<User> list, Comment comment, String str) {
        }

        /* renamed from: a */
        public final void mo58085a(User user, List list, OnShowListener onShowListener, OnDismissListener onDismissListener) {
        }

        /* renamed from: b */
        public final void mo58088b(Aweme aweme) {
        }

        /* renamed from: b */
        public final void mo75066b(Aweme aweme, String str, String str2) {
        }

        /* renamed from: c */
        public final C25673a mo58089c() {
            return null;
        }

        /* renamed from: c */
        public final C25673a mo58090c(Aweme aweme) {
            return C21748f.m72765a(this, aweme);
        }

        /* renamed from: a */
        public final void mo58083a(Aweme aweme) {
            C29877a.this.f78479c.mo75871a(true);
        }

        /* renamed from: a */
        public final void mo58077a(Context context, Aweme aweme) {
            if (C29877a.this.f78478b != null) {
                C29877a.this.f78478b.mo64356a(new C28318an(41, aweme), C29877a.this.f78483g);
            }
        }

        /* renamed from: c */
        public final void mo58091c(View view, View view2, Aweme aweme) {
            if (C34110a.m109792a(view, view2, aweme)) {
                C34138b.m110004c(aweme, C29877a.this.f78483g, C22704b.f60415d);
            }
        }

        /* renamed from: d */
        public final void mo58092d(View view, View view2, Aweme aweme) {
            if (C34110a.m109799b(view, view2, aweme)) {
                C34138b.m110004c(aweme, C29877a.this.f78483g, C22704b.f60415d);
            }
        }

        /* renamed from: b */
        public final void mo58086b(View view, View view2, Aweme aweme) {
            if (C29877a.this.f78478b != null) {
                C29877a.this.f78478b.mo64358b(new C28318an(24, aweme), "click_follow", "video_cart_tag", C29877a.this.mo64928a(true));
                C34138b.m110015e(aweme, C29877a.this.f78483g);
            }
        }

        /* renamed from: a */
        public final void mo58078a(View view, View view2, Aweme aweme) {
            if (C29877a.this.f78479c != null && C29877a.this.f78479c.isViewValid() && C29877a.this.f78477a != null) {
                if (C21740a.m72687c(aweme) || !C43168s.m136911c(aweme)) {
                    new C33267i().mo85275k(aweme.getAuthorUid()).mo85268d(C29877a.this.f78483g).mo85269e(C29877a.this.f78483g).mo85071g(aweme).mo85271f(C22704b.f60415d).mo85252e();
                    C29877a.this.f78477a.mo71983a((Activity) null, aweme);
                    return;
                }
                C10761a.m31409e((Context) C29877a.this.f78479c.mo75874f(), (int) R.string.fsr).mo25750a();
            }
        }

        /* renamed from: a */
        public final void mo58079a(View view, View view2, Aweme aweme, User user) {
            if (C34110a.m109794a(aweme, user, C29877a.this.f78479c.mo75874f(), C29877a.this.f78483g) && !C21740a.m72684a(user)) {
                C34138b.m110010d(aweme, C29877a.this.f78483g);
                C34138b.m109976a(aweme, user.getUid(), "head", C29877a.this.f78483g, C22704b.f60415d);
            }
        }

        /* renamed from: b */
        public final void mo58087b(View view, View view2, Aweme aweme, User user) {
            if (C34110a.m109800b(aweme, user, C29877a.this.f78479c.mo75874f(), C29877a.this.f78483g)) {
                C34138b.m110010d(aweme, C29877a.this.f78483g);
                C34138b.m109976a(aweme, user.getUid(), "name", C29877a.this.f78483g, C22704b.f60415d);
            }
        }

        /* renamed from: a */
        public final void mo58082a(View view, TextExtraStruct textExtraStruct, View view2, Aweme aweme) {
            if (C34110a.m109793a(view, textExtraStruct, view2, aweme, "homepage_follow")) {
                C34138b.m109965a(view.getContext(), textExtraStruct, aweme, "homepage_follow");
            }
        }

        /* renamed from: a */
        public final void mo75057a(View view, Aweme aweme, List<User> list, boolean z, String str) {
            C29877a.this.f78479c.mo75871a(false);
            C24217a.m79549a().sendEnterCommentEvent(C29877a.this.mo64928a(true), aweme, C22704b.f60415d, 0, "", str);
        }
    };

    /* renamed from: n */
    private C24090a f78490n = new C24090a() {
        /* renamed from: a */
        public final void mo62442a(View view, boolean z, String str) {
        }

        /* renamed from: f */
        public final void mo62451f() {
        }

        /* renamed from: a */
        public final void mo62444a(Comment comment) {
            if (C29877a.this.f78479c != null) {
                C29877a.this.f78479c.mo75869a(comment);
            }
        }

        /* renamed from: a */
        public final void mo62447a(Emoji emoji) {
            String str;
            if (emoji != null) {
                Aweme t = C29877a.this.f78479c.mo75880t();
                if (t == null) {
                    str = "";
                } else {
                    str = t.getAid();
                }
                if (!C6861a.m21337f().isLogin()) {
                    C32656f.m105743a(C6405d.m19984g(), C29877a.this.f78483g, "like_comment", C42914ab.m136242a().mo104633a("group_id", str).mo104633a("log_pb", C33230ac.m107234j(str)).f111445a);
                } else if (C27536b.m90251a().mo70762a(emoji)) {
                    C10761a.m31409e((Context) C29877a.this.f78479c.mo75874f(), (int) R.string.b01).mo25750a();
                } else {
                    UrlModel animateUrl = emoji.getAnimateUrl();
                    C24217a.m79549a().sendCollectEmojiEvent();
                    C27536b.m90251a().mo70756a(emoji.getId(), animateUrl.getUri(), (String) animateUrl.getUrlList().get(0), emoji.getResourcesId(), emoji.getStickerType());
                }
            }
        }

        /* renamed from: b */
        public final void mo62450b(String str, String str2) {
            UserProfileActivity.m117394a((Context) C29877a.this.f78479c.mo75874f(), str, str2, "like_banner");
        }

        /* renamed from: b */
        public final void mo62449b(C24187m mVar, Comment comment) {
            if (C29877a.this.f78482f && C29877a.this.f78479c != null) {
                C29877a.this.f78479c.mo75868a(mVar, comment);
            }
        }

        /* renamed from: a */
        public final void mo62443a(C24187m mVar, Comment comment) {
            if (C29877a.this.f78482f) {
                if (C29877a.this.f78479c != null) {
                    C29877a.this.f78479c.mo75872d(comment);
                }
            } else if (C29877a.this.f78479c != null) {
                C29877a.this.f78479c.mo75868a(mVar, comment);
            }
        }

        /* renamed from: a */
        public final void mo62446a(CommentReplyButtonStruct commentReplyButtonStruct, int i) {
            String str;
            if (C29877a.this.f78481e == null) {
                C29877a aVar = C29877a.this;
                CommentService a = C24217a.m79549a();
                if (C29877a.this.f78479c.mo75880t() != null) {
                    str = C29877a.this.f78479c.mo75880t().getAid();
                } else {
                    str = "";
                }
                aVar.f78481e = a.providerCommentReplyListPresenter(str);
                C29877a.this.f78481e.mo62535a(C29877a.this.f78486j);
                C29877a.this.f78481e.mo62534a(C29877a.this.f78479c.mo75879s());
            }
            C29877a.this.f78481e.mo62536a(commentReplyButtonStruct, C29877a.this.f78479c.mo75867a(i));
        }

        /* renamed from: a */
        public final void mo62445a(Comment comment, int i) {
            String str;
            if (!C29880b.m97788a(C29877a.this.f78479c.mo75874f())) {
                C10761a.m31399c((Context) C29877a.this.f78479c.mo75874f(), (int) R.string.cjs).mo25750a();
            } else if (!C21115b.m71197a().isLogin()) {
                C32656f.m105742a(C29877a.this.f78479c.mo75874f(), C29877a.this.f78483g, "like_comment");
            } else if (comment != null) {
                if (comment.getUserDigged() == 0) {
                    str = "1";
                } else {
                    str = "2";
                }
                if (C29877a.this.f78480d == null) {
                    C29877a.this.f78480d = C24217a.m79549a().providerCommentDiggPresenter();
                    C29877a.this.f78480d.mo62517a(C29877a.this.f78479c.mo75878r());
                }
                if (C29877a.this.f78480d != null && C29877a.this.f78480d.ap_()) {
                    C29877a.this.f78480d.mo62518a(comment.getCid(), comment.getAwemeId(), str, C29877a.this.f78483g);
                }
                if ("1".equals(str)) {
                    C29877a.this.f78485i = comment.getCid();
                    return;
                }
                C29877a.this.f78485i = "";
            }
        }

        /* renamed from: a */
        public final void mo62448a(String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                C7195s a = C7195s.m22438a();
                Activity f = C29877a.this.f78479c.mo75874f();
                StringBuilder sb = new StringBuilder("aweme://user/profile/");
                sb.append(str);
                a.mo18679a(f, C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", str2).mo18695a());
            }
        }
    };

    /* renamed from: a */
    public final C21747e mo75861a() {
        return this.f78489m;
    }

    /* renamed from: b */
    public final C24090a mo75862b() {
        return this.f78490n;
    }

    /* renamed from: c */
    public final C28297e mo75863c() {
        return this.f78477a;
    }

    /* renamed from: f */
    public final String mo75866f() {
        return this.f78485i;
    }

    /* renamed from: e */
    public final void mo75865e() {
        if (this.f78477a != null) {
            this.f78477a.mo71836c();
        }
        if (this.f78478b != null) {
            this.f78478b.mo71836c();
        }
        if (this.f78487k != null) {
            this.f78487k.mo66535W_();
            this.f78487k.mo59134U_();
        }
        C42961az.m136383d(this);
    }

    /* renamed from: d */
    public final void mo75864d() {
        if (this.f78477a != null) {
            this.f78477a.mo71830a();
        }
        this.f78477a = new C28297e(this.f78483g, this.f78484h, this, this);
        this.f78477a.mo71834a(this.f78479c.mo75874f(), this.f78479c.mo75873e());
        this.f78478b = new C24551b(this.f78483g, this.f78484h);
        this.f78478b.mo71834a(this.f78479c.mo75874f(), this.f78479c.mo75873e());
        C42961az.m136382c(this);
    }

    /* renamed from: a */
    public final String mo64928a(boolean z) {
        return this.f78483g;
    }

    @C7709l
    public void onVideoEvent(C28318an anVar) {
        if (this.f78479c != null && this.f78479c.isViewValid() && anVar.f74631a == 13) {
            this.f78479c.mo75870a((String) anVar.f74632b, TextUtils.equals(anVar.f74634d, this.f78483g));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo64929a(C28318an anVar) {
        if (this.f78479c != null && this.f78479c.isViewValid()) {
            int i = anVar.f74631a;
            if (i != 28) {
                switch (i) {
                    case 1:
                        if (C6900g.m21454b().mo16943d()) {
                            Aweme aweme = (Aweme) anVar.f74632b;
                            if (aweme != null && aweme.getAuthor() != null && this.f78477a != null) {
                                C37950a.m121238a().showReportDialog(aweme, this.f78477a.mo71843n(), C6405d.m19984g(), "");
                                break;
                            } else {
                                return;
                            }
                        } else {
                            if (this.f78479c.mo75874f() != null) {
                                C10761a.m31399c((Context) this.f78479c.mo75874f(), (int) R.string.cjs).mo25750a();
                            }
                            return;
                        }
                    case 2:
                        if (!C6900g.m21454b().mo16943d()) {
                            C10761a.m31399c((Context) this.f78479c.mo75874f(), (int) R.string.cjs).mo25750a();
                            return;
                        }
                        Aweme aweme2 = (Aweme) anVar.f74632b;
                        if (aweme2 != null && !TextUtils.isEmpty(aweme2.getAid())) {
                            if (aweme2.getAwemeType() == 13) {
                                if (this.f78488l == null) {
                                    this.f78488l = new C29884d();
                                    this.f78488l.mo66536a(new C29905a());
                                    this.f78488l.mo66537a(this.f78479c.mo75877q());
                                }
                                this.f78488l.f78505a = aweme2.getAid();
                                this.f78488l.mo56976a(aweme2.getAid());
                                return;
                            }
                            if (this.f78487k == null) {
                                this.f78487k = new C28470u();
                                this.f78487k.mo66536a(new C28468t());
                                this.f78487k.mo66537a(this.f78479c.mo75875g());
                            }
                            this.f78487k.mo56976a(aweme2.getAid());
                            return;
                        }
                        return;
                }
            }
        }
    }

    public C29877a(C29868b bVar, String str, C24190p pVar) {
        this.f78479c = bVar;
        this.f78483g = str;
        this.f78486j = pVar;
    }
}
