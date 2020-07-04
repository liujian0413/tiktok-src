package com.p280ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.alibaba.fastjson.JSON;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28442a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams.C36995a;
import com.p280ss.android.ugc.aweme.qrcode.p1499v2.QRCodeActivityV2;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.improve.CommonShareDialog;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38090d;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38137y;
import com.p280ss.android.ugc.aweme.share.improve.p1539b.C38142a;
import com.p280ss.android.ugc.aweme.share.improve.p1539b.C38144b;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c;
import com.p280ss.android.ugc.aweme.share.p1536f.C38037a;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d.C38387a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage.C7219a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage */
public final class ChallengeSharePackage extends SharePackage {
    public static final Creator<ChallengeSharePackage> CREATOR = new C38189c();

    /* renamed from: f */
    public static final C38187b f99319f = new C38187b(null);

    /* renamed from: a */
    public final Challenge f99320a;

    /* renamed from: b */
    public final boolean f99321b;

    /* renamed from: c */
    public final String f99322c;

    /* renamed from: d */
    public final String f99323d;

    /* renamed from: e */
    public final String f99324e;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage$a */
    public static final class C38186a extends C7219a<ChallengeSharePackage> {

        /* renamed from: a */
        public Challenge f99325a;

        /* renamed from: b */
        public boolean f99326b;

        /* renamed from: c */
        public String f99327c;

        /* renamed from: d */
        public String f99328d = "";

        /* renamed from: e */
        public String f99329e = "";

        /* access modifiers changed from: private */
        /* renamed from: b */
        public ChallengeSharePackage mo18866a() {
            return new ChallengeSharePackage(this);
        }

        /* renamed from: a */
        public final C38186a mo95765a(String str) {
            this.f99327c = str;
            return this;
        }

        /* renamed from: b */
        public final C38186a mo95767b(String str) {
            this.f99328d = str;
            return this;
        }

        /* renamed from: c */
        public final C38186a mo95768c(String str) {
            this.f99329e = str;
            return this;
        }

        /* renamed from: a */
        public final C38186a mo95764a(Challenge challenge) {
            C7573i.m23587b(challenge, "challenge");
            this.f99325a = challenge;
            return this;
        }

        /* renamed from: a */
        public final C38186a mo95766a(boolean z) {
            this.f99326b = z;
            return this;
        }

        /* renamed from: a */
        public final C38186a mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            super.mo18867b(parcel);
            Serializable readSerializable = parcel.readSerializable();
            if (!(readSerializable instanceof Challenge)) {
                readSerializable = null;
            }
            this.f99325a = (Challenge) readSerializable;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage$b */
    public static final class C38187b {

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage$b$a */
        public static final class C38188a implements C38386d {

            /* renamed from: a */
            final /* synthetic */ Challenge f99330a;

            C38188a(Challenge challenge) {
                this.f99330a = challenge;
            }

            /* renamed from: a */
            public final void mo67217a(SharePackage sharePackage, Context context) {
                C7573i.m23587b(sharePackage, "sharePackage");
                C7573i.m23587b(context, "context");
                C38387a.m122614b(this, sharePackage, context);
            }

            /* renamed from: b */
            public final void mo67219b(SharePackage sharePackage, Context context) {
                C7573i.m23587b(sharePackage, "sharePackage");
                C7573i.m23587b(context, "context");
                C38387a.m122613a(this, sharePackage, context);
            }

            /* renamed from: a */
            public final void mo67218a(C38389f fVar, SharePackage sharePackage, Context context) {
                C7573i.m23587b(fVar, "action");
                C7573i.m23587b(sharePackage, "sharePackage");
                C7573i.m23587b(context, "context");
                if (fVar instanceof C38090d) {
                    m121981a(fVar.mo95715b(), true, sharePackage, context, this.f99330a);
                    return;
                }
                if (fVar instanceof C38137y) {
                    m121981a(fVar.mo95715b(), true, sharePackage, context, this.f99330a);
                }
            }

            /* renamed from: a */
            public final void mo67216a(C38343b bVar, boolean z, SharePackage sharePackage, Context context) {
                C7573i.m23587b(bVar, "channel");
                C7573i.m23587b(context, "context");
                m121981a(bVar.mo95739b(), z, sharePackage, context, this.f99330a);
            }

            /* renamed from: a */
            private static void m121981a(String str, boolean z, SharePackage sharePackage, Context context, Challenge challenge) {
                if (z && challenge != null) {
                    C25652b bVar = new C25652b();
                    bVar.mo66536a(new C28442a());
                    bVar.mo56976a(challenge.getCid(), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(3), str);
                }
            }
        }

        private C38187b() {
        }

        public /* synthetic */ C38187b(C7571f fVar) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void m121979a(com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b r3, com.p280ss.android.ugc.aweme.discover.model.Challenge r4) {
            /*
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
                java.lang.String r1 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                java.lang.String r0 = r0.getCurUserId()
                if (r4 == 0) goto L_0x001a
                com.ss.android.ugc.aweme.profile.model.User r1 = r4.getAuthor()
                if (r1 == 0) goto L_0x001a
                java.lang.String r1 = r1.getUid()
                goto L_0x001b
            L_0x001a:
                r1 = 0
            L_0x001b:
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 != 0) goto L_0x0032
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 != 0) goto L_0x0032
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 == 0) goto L_0x0032
                return
            L_0x0032:
                com.ss.android.ugc.aweme.share.improve.a.ad r0 = new com.ss.android.ugc.aweme.share.improve.a.ad
                r0.<init>(r4)
                com.ss.android.ugc.aweme.sharer.ui.f r0 = (com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f) r0
                r3.mo95967a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage.C38187b.m121979a(com.ss.android.ugc.aweme.sharer.ui.c$b, com.ss.android.ugc.aweme.discover.model.Challenge):void");
        }

        /* renamed from: a */
        public final void mo95769a(Activity activity, Challenge challenge, List<? extends Aweme> list, String str, boolean z, String str2, String str3) {
            C7573i.m23587b(activity, "activity");
            if (challenge != null && challenge.getShareInfo() != null) {
                ChallengeSharePackage a = m121978a(challenge, (Context) activity, list, str, z, str2, str3);
                C38188a aVar = new C38188a(challenge);
                C38382b bVar = new C38382b();
                SharePackage sharePackage = a;
                C38144b bVar2 = new C38144b(sharePackage, null, 0, 6, null);
                bVar.mo95963a((C38343b) bVar2);
                C37984ap.m121301a().injectUniversalConfig(bVar, activity, true);
                bVar.mo95963a((C38343b) new C38142a());
                m121979a(bVar, challenge);
                bVar.mo95967a((C38389f) new C38137y("challenge", true));
                bVar.mo95966a((C38386d) aVar);
                bVar.mo95964a(sharePackage);
                CommonShareDialog commonShareDialog = new CommonShareDialog(activity, bVar.mo95972a(), 0, 4, null);
                commonShareDialog.show();
            }
        }

        /* renamed from: a */
        private static ChallengeSharePackage m121978a(Challenge challenge, Context context, List<? extends Aweme> list, String str, boolean z, String str2, String str3) {
            boolean z2;
            C7573i.m23587b(challenge, "challenge");
            C7573i.m23587b(context, "context");
            C7219a d = new C38186a().mo95764a(challenge).mo95766a(z).mo95767b(str2).mo95768c(str3).mo95765a(str).mo18868d("challenge");
            String cid = challenge.getCid();
            C7573i.m23582a((Object) cid, "challenge.cid");
            C7219a e = d.mo18869e(cid);
            ShareInfo shareInfo = challenge.getShareInfo();
            C7573i.m23582a((Object) shareInfo, "challenge.shareInfo");
            String shareTitle = shareInfo.getShareTitle();
            C7573i.m23582a((Object) shareTitle, "challenge.shareInfo.shareTitle");
            C7219a f = e.mo18870f(shareTitle);
            ShareInfo shareInfo2 = challenge.getShareInfo();
            C7573i.m23582a((Object) shareInfo2, "challenge.shareInfo");
            String shareDesc = shareInfo2.getShareDesc();
            C7573i.m23582a((Object) shareDesc, "challenge.shareInfo.shareDesc");
            C7219a g = f.mo18871g(shareDesc);
            ShareInfo shareInfo3 = challenge.getShareInfo();
            C7573i.m23582a((Object) shareInfo3, "challenge.shareInfo");
            String b = C38157b.m121908b(shareInfo3.getShareUrl());
            if (b == null) {
                b = "";
            }
            ChallengeSharePackage challengeSharePackage = (ChallengeSharePackage) g.mo18872h(b).mo18866a();
            Bundle bundle = challengeSharePackage.f20186l;
            bundle.putString("app_name", context.getString(R.string.jf));
            User author = challenge.getAuthor();
            C7573i.m23582a((Object) author, "challenge.author");
            bundle.putString("uid_for_share", author.getUid());
            bundle.putString("challenge_id", challenge.getCid());
            bundle.putString("process_id", str3);
            bundle.putString("challenge_name", challenge.getChallengeName());
            bundle.putLong("view_count", challenge.getDisplayCount());
            Collection collection = list;
            int i = 0;
            if (collection == null || collection.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                List arrayList = new ArrayList();
                for (Aweme aweme : list) {
                    if (aweme.getAwemeType() == 2) {
                        UrlModel a = C38159c.m121913a(aweme);
                        if (a != null) {
                            arrayList.add(a);
                        }
                    } else {
                        Video video = aweme.getVideo();
                        C7573i.m23582a((Object) video, "aweme.video");
                        UrlModel cover = video.getCover();
                        C7573i.m23582a((Object) cover, "aweme.video.cover");
                        arrayList.add(cover);
                    }
                    i++;
                    if (i >= 3) {
                        break;
                    }
                }
                if (arrayList.size() >= 3) {
                    bundle.putString("cover_thumb", JSON.toJSONString(arrayList));
                }
            }
            return challengeSharePackage;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage$c */
    public static final class C38189c implements Creator<ChallengeSharePackage> {
        C38189c() {
        }

        /* renamed from: a */
        private static ChallengeSharePackage[] m121987a(int i) {
            return new ChallengeSharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m121986a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m121987a(i);
        }

        /* renamed from: a */
        private static ChallengeSharePackage m121986a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new ChallengeSharePackage(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public ChallengeSharePackage(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(new C38186a().mo18867b(parcel));
    }

    /* renamed from: a */
    public final C38354f mo18860a(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        return new C38356g(C38159c.m121914a(this.f20185k, bVar), this.f20183i, this.f20184j);
    }

    public ChallengeSharePackage(C38186a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar);
        Challenge challenge = aVar.f99325a;
        if (challenge == null) {
            C7573i.m23580a();
        }
        this.f99320a = challenge;
        this.f99321b = aVar.f99326b;
        this.f99322c = aVar.f99327c;
        this.f99323d = aVar.f99328d;
        this.f99324e = aVar.f99329e;
    }

    /* renamed from: a */
    private final void m121965a(Context context) {
        int i;
        C6907h.m21524a("click_qr_code", (Map) C22984d.m75611a().mo59973a("tag_id", this.f99320a.getCid()).mo59973a("platform", "scan").mo59973a("qr_code_type", "shaped").mo59973a("enter_from", "challenge").f60753a);
        if (!C38037a.m121403a()) {
            C10761a.m31410e(context, context.getString(R.string.ae8, new Object[]{C38037a.m121404b()})).mo25750a();
            return;
        }
        if (C25242ao.m82976b(this.f99320a)) {
            i = 23;
        } else {
            i = 2;
        }
        QRCodeActivityV2.m119235a(C38157b.m121903a(context), new C36995a().mo93429a(i, this.f99320a.getCid(), this.f99321b, this.f99320a.getChallengeName(), "challenge").mo93431a(this.f99320a.getChallengeName(), (long) this.f99320a.getUserCount()).f96920a);
        C6907h.onEvent(new MobClick().setEventName("share_challenge").setLabelName("qr_code").setExtValueString(this.f99320a.getCid()).setJsonObject(new C6909j().mo16966a("request_id", this.f99323d).mo16966a("challenge_id", this.f99322c).mo16966a("process_id", this.f99324e).mo16967a()));
        C6907h.m21524a("share_tag", (Map) C22984d.m75611a().mo59973a("tag_id", this.f99322c).mo59973a("platform", "qr_code").mo59973a("share_mode", "normal_share").mo59973a("process_id", this.f99324e).f60753a);
        C37984ap.m121302b().addShareRecord("qr_code", 1);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        if (parcel != null) {
            parcel.writeSerializable(this.f99320a);
        }
    }

    /* renamed from: a */
    public final boolean mo18861a(C38343b bVar, Context context) {
        C7573i.m23587b(bVar, "channel");
        C7573i.m23587b(context, "context");
        C37984ap.m121302b().addShareRecord(bVar.mo95739b(), 2);
        return false;
    }

    /* renamed from: a */
    public final boolean mo18862a(C38389f fVar, Context context) {
        C7573i.m23587b(fVar, "action");
        C7573i.m23587b(context, "context");
        if (!(fVar instanceof C38137y)) {
            return false;
        }
        m121965a(context);
        return true;
    }
}
