package com.p280ss.android.ugc.aweme.p313im.sdk.module.session;

import android.support.p029v7.widget.AppCompatTextView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.AppImageUri;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.p1336a.C31494a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C31511a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C31517b;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C31521c;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.p1338a.C31514a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.p1338a.C31515b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31083h;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31087k;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31090n;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31852a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31869ao;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31877aw;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.BadgeTextView;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.C31994i;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.SessionStatusImageView;
import com.p280ss.android.ugc.aweme.p313im.service.model.C32025c;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collections;
import java.util.List;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.SessionListViewHolder */
public class SessionListViewHolder extends C1293v {

    /* renamed from: a */
    private final AvatarImageView f82444a;

    /* renamed from: b */
    private final AnimationImageView f82445b;

    /* renamed from: c */
    private final AppCompatTextView f82446c;

    /* renamed from: d */
    private final AppCompatTextView f82447d;

    /* renamed from: e */
    private final AppCompatTextView f82448e;

    /* renamed from: f */
    private final AppCompatTextView f82449f;

    /* renamed from: g */
    private final BadgeTextView f82450g;

    /* renamed from: h */
    private final SessionStatusImageView f82451h;

    /* renamed from: i */
    private final ImageView f82452i;

    /* renamed from: j */
    private final ImageView f82453j;

    /* renamed from: k */
    private final ImageView f82454k;

    /* renamed from: l */
    private final View f82455l;

    /* renamed from: m */
    private final C31994i f82456m = new C31994i();

    /* renamed from: n */
    private String f82457n;

    /* renamed from: o */
    private C7102a f82458o;

    /* renamed from: p */
    private int f82459p;

    /* renamed from: b */
    public final void mo82175b() {
        if (C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20393c((Object) this);
        }
    }

    /* renamed from: a */
    public final void mo82173a() {
        if (!C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20389a((Object) this);
        }
    }

    /* renamed from: a */
    private static C31514a m102368a(C7102a aVar) {
        return new C31515b(aVar);
    }

    @C7709l
    public void onSessionUpdate(C31087k kVar) {
        if (TextUtils.equals(this.f82458o.bf_(), kVar.f81582a)) {
            String str = kVar.f81583b;
            if ((this.f82458o instanceof C31517b) && !TextUtils.isEmpty(str)) {
                this.f82458o.f19944h = str;
                this.f82448e.setText(((C31517b) this.f82458o).mo82227e());
            }
        }
    }

    @C7709l
    public void onUserUpdate(C31090n nVar) {
        if (TextUtils.equals(this.f82457n, nVar.f81584a)) {
            IMUser b = C6961d.m21657a().mo18029b(nVar.f81584a);
            if (b != null) {
                UrlModel avatarThumb = b.getAvatarThumb();
                if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                    C23323e.m76503a((RemoteImageView) this.f82444a, (int) R.drawable.a_j);
                } else {
                    C23323e.m76524b(this.f82444a, avatarThumb);
                }
                if (this.f82458o != null && !TextUtils.isEmpty(this.f82458o.bf_())) {
                    m102371a(b, this.f82458o.bf_());
                    this.f82458o.bf_();
                }
                this.f82446c.setText(b.getDisplayName());
                this.f82456m.mo82924a(b);
                if (C6399b.m19944t()) {
                    if (b != null) {
                        C43126fg.m136801a(this.itemView.getContext(), b.getCustomVerify(), b.getEnterpriseVerifyReason(), this.f82446c);
                        return;
                    }
                    C43126fg.m136801a(this.itemView.getContext(), "", "", this.f82446c);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m102371a(IMUser iMUser, String str) {
        if (iMUser != null && TextUtils.isEmpty(iMUser.getSecUid())) {
            C31083h.m101380a(str);
        }
    }

    /* renamed from: a */
    private void m102369a(View view, C31494a aVar) {
        view.setOnClickListener(new C31491h(this, aVar));
        view.setOnLongClickListener(new C31492i(this, aVar));
        this.f82444a.setOnClickListener(new C31493j(this, aVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo82177c(C31494a aVar, View view) {
        if (this.f82458o != null && aVar != null) {
            aVar.mo82171a(view.getContext(), this.f82459p, this.f82458o, 1);
        }
    }

    /* renamed from: a */
    private void m102370a(AvatarImageView avatarImageView, C7102a aVar) {
        if (aVar.f19942f instanceof UrlModel) {
            C23323e.m76524b(avatarImageView, (UrlModel) aVar.f19942f);
        } else if (aVar.f19942f instanceof AppImageUri) {
            C23323e.m76504a((RemoteImageView) avatarImageView, (AppImageUri) aVar.f19942f);
        }
        if (!TextUtils.isEmpty(aVar.f19943g)) {
            C31852a.m103394a((View) this.f82444a, aVar.f19943g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ boolean mo82176b(C31494a aVar, View view) {
        if (!(this.f82458o == null || aVar == null)) {
            aVar.mo82171a(view.getContext(), this.f82459p, this.f82458o, 0);
        }
        return true;
    }

    public SessionListViewHolder(View view, C31494a aVar) {
        super(view);
        this.f82444a = (AvatarImageView) view.findViewById(R.id.j0);
        this.f82445b = (AnimationImageView) view.findViewById(R.id.j6);
        this.f82446c = (AppCompatTextView) view.findViewById(R.id.e9m);
        this.f82447d = (AppCompatTextView) view.findViewById(R.id.at1);
        this.f82448e = (AppCompatTextView) view.findViewById(R.id.bg6);
        this.f82449f = (AppCompatTextView) view.findViewById(R.id.bg7);
        this.f82450g = (BadgeTextView) view.findViewById(R.id.cr2);
        this.f82453j = (ImageView) view.findViewById(R.id.cr3);
        this.f82454k = (ImageView) view.findViewById(R.id.c2d);
        this.f82451h = (SessionStatusImageView) view.findViewById(R.id.bc4);
        this.f82452i = (ImageView) view.findViewById(R.id.cvx);
        this.f82455l = view.findViewById(R.id.d3i);
        m102369a(view, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82174a(C31494a aVar, View view) {
        if (this.f82458o != null && aVar != null) {
            aVar.mo82171a(view.getContext(), this.f82459p, this.f82458o, 2);
        }
    }

    /* renamed from: a */
    public void mo82172a(C7102a aVar, int i) {
        boolean z;
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        this.f82458o = aVar;
        this.f82459p = i;
        C31514a a = m102368a(aVar);
        this.f82451h.setImageDrawable(a.mo82226d());
        this.f82456m.mo82923a(aVar);
        this.f82453j.setVisibility(8);
        this.f82447d.setVisibility(8);
        this.f82450g.setBadgeCount(0);
        UrlModel urlModel = null;
        this.f82457n = null;
        ((C13438a) this.f82444a.getHierarchy()).mo32898b((int) R.drawable.a_j);
        Conversation a2 = C6417a.m20015a().mo15530a(aVar.bf_());
        if (!aVar.mo18371h() || a2 == null || !a2.isMute()) {
            z = false;
        } else {
            z = true;
        }
        int b = aVar.mo18115b();
        if (b == 10) {
            m102370a(this.f82444a, aVar);
            int f = ((C31521c) aVar).mo82229f();
            ImageView imageView = this.f82453j;
            if (f > 0) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            if (!aVar.f19950n) {
                C31858ad.m103406a();
                C31858ad.m103423a("message_assistant", i, f, false);
                aVar.f19950n = true;
            }
        } else if (b == 14) {
            m102370a(this.f82444a, aVar);
            this.f82450g.setBadgeCount(aVar.f19946j);
            if (!aVar.f19950n) {
                C31858ad.m103406a();
                C31858ad.m103502p("ad_order_assistant_message");
                aVar.f19950n = true;
            }
        } else if (b != 20) {
            switch (b) {
                case 0:
                    long a3 = C6425b.m20074a(aVar.bf_());
                    IMUser b2 = C6961d.m21657a().mo18029b(String.valueOf(a3));
                    this.f82457n = String.valueOf(a3);
                    if (b2 != null) {
                        urlModel = b2.getAvatarThumb();
                        m102371a(b2, aVar.bf_());
                        aVar.bf_();
                        C31852a.m103395a((ImageView) this.f82444a, b2);
                    }
                    if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
                        C23323e.m76503a((RemoteImageView) this.f82444a, (int) R.drawable.a_j);
                    } else {
                        C23323e.m76524b(this.f82444a, urlModel);
                    }
                    if (z) {
                        ImageView imageView2 = this.f82453j;
                        if (aVar.f19946j > 0) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        imageView2.setVisibility(i4);
                        this.f82450g.setVisibility(8);
                    } else {
                        this.f82453j.setVisibility(8);
                        this.f82450g.setBadgeCount(aVar.f19946j);
                    }
                    if (!aVar.f19950n) {
                        C31858ad.m103406a();
                        C31858ad.m103494k(String.valueOf(a3), "message");
                        C31858ad.m103406a();
                        C31858ad.m103448b("chat_notice_show", aVar.f19946j);
                        aVar.f19950n = true;
                        break;
                    }
                    break;
                case 1:
                    if (aVar.f19942f instanceof UrlModel) {
                        C23323e.m76524b(this.f82444a, (UrlModel) aVar.f19942f);
                    }
                    C31852a.m103394a((View) this.f82444a, aVar.f19943g);
                    this.f82450g.setBadgeCount(aVar.f19946j);
                    break;
                case 2:
                    C23323e.m76503a((RemoteImageView) this.f82444a, (int) R.drawable.bic);
                    C31852a.m103394a((View) this.f82444a, C6399b.m19921a().getString(R.string.bgf));
                    ImageView imageView3 = this.f82453j;
                    if (aVar.f19946j > 0) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    imageView3.setVisibility(i5);
                    break;
                case 3:
                    m102370a(this.f82444a, aVar);
                    ImageView imageView4 = this.f82453j;
                    if (aVar.f19946j > 0) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    imageView4.setVisibility(i6);
                    if (!aVar.f19950n) {
                        C31858ad.m103406a();
                        C31858ad.m103423a("douyin_assistant", i, aVar.f19946j, false);
                        aVar.f19950n = true;
                        break;
                    }
                    break;
                case 4:
                    m102370a(this.f82444a, aVar);
                    this.f82450g.setBadgeCount(aVar.f19946j);
                    if (!aVar.f19950n) {
                        C31858ad.m103406a();
                        C31858ad.m103423a("official_info", i, aVar.f19946j, true);
                        aVar.f19950n = true;
                        break;
                    }
                    break;
                case 5:
                    m102370a(this.f82444a, aVar);
                    this.f82450g.setBadgeCount(aVar.f19946j);
                    if (!aVar.f19950n) {
                        C31858ad.m103406a();
                        C31858ad.m103502p("shopping_assistant_message");
                        aVar.f19950n = true;
                        break;
                    }
                    break;
                default:
                    switch (b) {
                        case 17:
                            C32025c iMSetting = C6956a.m21632a().mo18009f().getIMSetting();
                            if (!(iMSetting == null || iMSetting.f83741d == null)) {
                                FlipChatSettings flipChatSettings = iMSetting.f83741d;
                                try {
                                    if (!TextUtils.isEmpty(flipChatSettings.getMsgCellAvatarUrl())) {
                                        ((C13438a) this.f82444a.getHierarchy()).mo32898b((int) R.drawable.b6g);
                                        List singletonList = Collections.singletonList(flipChatSettings.getMsgCellAvatarUrl());
                                        UrlModel urlModel2 = new UrlModel();
                                        urlModel2.setUrlList(singletonList);
                                        aVar.f19942f = urlModel2;
                                    }
                                    if (!TextUtils.isEmpty(flipChatSettings.getMsgCellName())) {
                                        aVar.f19943g = flipChatSettings.getMsgCellName();
                                    }
                                } catch (NullValueException unused) {
                                }
                            }
                            m102370a(this.f82444a, aVar);
                            C31511a aVar2 = (C31511a) aVar;
                            int i11 = aVar2.f82509a;
                            int i12 = aVar2.f19946j;
                            this.f82450g.setBadgeCount(i12);
                            ImageView imageView5 = this.f82453j;
                            if (i12 != 0 || i11 <= 0) {
                                i7 = 8;
                            } else {
                                i7 = 0;
                            }
                            imageView5.setVisibility(i7);
                            if (!aVar.f19950n) {
                                C31858ad.m103406a();
                                C31858ad.m103453c();
                                aVar.f19950n = true;
                                break;
                            }
                            break;
                        case 18:
                            m102370a(this.f82444a, aVar);
                            this.f82450g.setBadgeCount(aVar.f19946j);
                            if (!aVar.f19950n) {
                                aVar.f19950n = true;
                                break;
                            }
                            break;
                        default:
                            switch (b) {
                                case 22:
                                    m102370a(this.f82444a, aVar);
                                    this.f82450g.setBadgeCount(aVar.f19946j);
                                    if (!aVar.f19950n) {
                                        C31858ad.m103406a();
                                        C31858ad.m103496l("dou_plus_message", "1001");
                                        aVar.f19950n = true;
                                        break;
                                    }
                                    break;
                                case 23:
                                    m102370a(this.f82444a, aVar);
                                    ImageView imageView6 = this.f82453j;
                                    if (aVar.f19946j > 0) {
                                        i8 = 0;
                                    } else {
                                        i8 = 8;
                                    }
                                    imageView6.setVisibility(i8);
                                    this.f82450g.setVisibility(8);
                                    if (!aVar.f19950n) {
                                        C31858ad.m103406a();
                                        C31858ad.m103423a("urge_update_info", i, aVar.f19946j, false);
                                        aVar.f19950n = true;
                                        break;
                                    }
                                    break;
                                case 24:
                                    m102370a(this.f82444a, aVar);
                                    if (z) {
                                        ImageView imageView7 = this.f82453j;
                                        if (aVar.f19946j > 0) {
                                            i9 = 0;
                                        } else {
                                            i9 = 8;
                                        }
                                        imageView7.setVisibility(i9);
                                        this.f82450g.setVisibility(8);
                                    } else {
                                        this.f82453j.setVisibility(8);
                                        this.f82450g.setBadgeCount(aVar.f19946j);
                                    }
                                    if (!aVar.f19950n) {
                                        aVar.f19950n = true;
                                        break;
                                    }
                                    break;
                                case 25:
                                    if (aVar.f19946j <= 0) {
                                        this.f82449f.setVisibility(0);
                                        break;
                                    } else {
                                        this.f82449f.setVisibility(8);
                                        break;
                                    }
                            }
                            m102370a(this.f82444a, aVar);
                            if (!C31915n.m103671a()) {
                                this.f82450g.setBadgeCount(aVar.f19946j);
                                break;
                            } else {
                                ImageView imageView8 = this.f82453j;
                                if (aVar.f19946j > 0) {
                                    i10 = 0;
                                } else {
                                    i10 = 8;
                                }
                                imageView8.setVisibility(i10);
                                break;
                            }
                            break;
                    }
            }
        } else {
            if (TextUtils.isEmpty((String) aVar.f19942f)) {
                C23323e.m76503a((RemoteImageView) this.f82444a, (int) R.drawable.b5p);
            } else {
                C23323e.m76514a((RemoteImageView) this.f82444a, (String) aVar.f19942f);
            }
            if (z) {
                ImageView imageView9 = this.f82453j;
                if (aVar.f19946j > 0) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                imageView9.setVisibility(i3);
                this.f82450g.setVisibility(8);
            } else {
                this.f82453j.setVisibility(8);
                this.f82450g.setBadgeCount(aVar.f19946j);
            }
            if (!aVar.f19950n) {
                aVar.f19950n = true;
            }
            if (a2 != null) {
                this.f82447d.setText(C6399b.m19921a().getResources().getString(R.string.bkr, new Object[]{Integer.valueOf(a2.getMemberCount())}));
                this.f82447d.setVisibility(0);
            }
        }
        if (z) {
            this.f82454k.setVisibility(0);
        } else {
            this.f82454k.setVisibility(8);
        }
        String a4 = a.mo82223a();
        AppCompatTextView appCompatTextView = this.f82446c;
        if (TextUtils.isEmpty(a4)) {
            a4 = "";
        }
        appCompatTextView.setText(a4);
        if (C6399b.m19944t()) {
            IMUser b3 = C6961d.m21657a().mo18029b(String.valueOf(C6425b.m20074a(aVar.bf_())));
            if (b3 != null) {
                C43126fg.m136801a(this.itemView.getContext(), b3.getCustomVerify(), b3.getEnterpriseVerifyReason(), this.f82446c);
            } else {
                C43126fg.m136801a(this.itemView.getContext(), "", "", this.f82446c);
            }
        }
        if (TextUtils.isEmpty(a.mo82224b()) || a.mo82224b().length() <= 300) {
            str = a.mo82224b();
            if (str == null) {
                str = "";
            }
        } else {
            str = a.mo82224b().substring(0, C34943c.f91128x);
        }
        if (aVar.mo18115b() == 20) {
            this.f82448e.setText(((C31517b) aVar).mo82227e());
        } else {
            this.f82448e.setText(str);
        }
        if (aVar.f19951o) {
            C27608b.m90502a((TextView) this.f82448e);
        }
        if (a2 == null || a2.getLastMessage() == null) {
            this.f82449f.setText(a.mo82225c());
        } else {
            this.f82449f.setText(C31877aw.m103572a(C6399b.m19921a(), a2.getLastMessage().getCreatedAt()));
        }
        if (aVar.f19948l > 0) {
            C31869ao.m103556a(this.f82455l, R.drawable.n0, R.color.v5);
        } else {
            C31869ao.m103555a(this.f82455l);
        }
    }
}
