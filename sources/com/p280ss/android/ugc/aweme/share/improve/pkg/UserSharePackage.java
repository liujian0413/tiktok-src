package com.p280ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.experiment.HidePushSettingsExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28442a;
import com.p280ss.android.ugc.aweme.metrics.C33228ab;
import com.p280ss.android.ugc.aweme.metrics.C33228ab.C33229a;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.improve.CommonShareDialog;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38071ab;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38076af;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38090d;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38096f;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38129t;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38136x;
import com.p280ss.android.ugc.aweme.share.improve.p1539b.C38142a;
import com.p280ss.android.ugc.aweme.share.improve.p1539b.C38144b;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d.C38387a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage.C7219a;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage */
public final class UserSharePackage extends SharePackage {
    public static final Creator<UserSharePackage> CREATOR = new C38230c();

    /* renamed from: b */
    public static final C38228b f99381b = new C38228b(null);

    /* renamed from: a */
    public final User f99382a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage$a */
    public static final class C38227a extends C7219a<UserSharePackage> {

        /* renamed from: a */
        public User f99383a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public UserSharePackage mo18866a() {
            return new UserSharePackage(this);
        }

        /* renamed from: a */
        public final C38227a mo95814a(User user) {
            C7573i.m23587b(user, "user");
            this.f99383a = user;
            return this;
        }

        /* renamed from: a */
        public final C38227a mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            super.mo18867b(parcel);
            Serializable readSerializable = parcel.readSerializable();
            if (!(readSerializable instanceof User)) {
                readSerializable = null;
            }
            this.f99383a = (User) readSerializable;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage$b */
    public static final class C38228b {

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage$b$a */
        public static final class C38229a implements C38386d {

            /* renamed from: a */
            final /* synthetic */ UserSharePackage f99384a;

            /* renamed from: b */
            final /* synthetic */ String f99385b;

            /* renamed from: c */
            final /* synthetic */ Activity f99386c;

            /* renamed from: d */
            final /* synthetic */ User f99387d;

            /* renamed from: e */
            final /* synthetic */ Handler f99388e;

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
                    C38228b.m122130a("copy", this.f99387d);
                    m122132a(fVar.mo95715b(), true, sharePackage, context, this.f99387d);
                    return;
                }
                if (fVar instanceof C38076af) {
                    C38228b.m122130a("report", this.f99387d);
                }
            }

            /* renamed from: a */
            public final void mo67216a(C38343b bVar, boolean z, SharePackage sharePackage, Context context) {
                C7573i.m23587b(bVar, "channel");
                C7573i.m23587b(context, "context");
                m122132a(bVar.mo95739b(), z, sharePackage, context, this.f99387d);
                if (bVar instanceof C38142a) {
                    C38228b.m122130a("copy", this.f99387d);
                }
            }

            C38229a(UserSharePackage userSharePackage, String str, Activity activity, User user, Handler handler) {
                this.f99384a = userSharePackage;
                this.f99385b = str;
                this.f99386c = activity;
                this.f99387d = user;
                this.f99388e = handler;
            }

            /* renamed from: a */
            private static void m122132a(String str, boolean z, SharePackage sharePackage, Context context, User user) {
                C7573i.m23587b(str, "channelKey");
                C7573i.m23587b(context, "context");
                if (z && C6399b.m19944t() && user != null) {
                    C25652b bVar = new C25652b();
                    bVar.mo66536a(new C28442a());
                    bVar.mo56976a(user.getUid(), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(4), str);
                }
            }
        }

        private C38228b() {
        }

        public /* synthetic */ C38228b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m122130a(String str, User user) {
            String str2;
            C7573i.m23587b(str, "type");
            if (user != null) {
                C33229a b = C33228ab.m107200a("share_person").mo85057b("platform", str).mo85057b("target_id", user.getUid());
                String str3 = "enter_from";
                if (C43122ff.m136787r(user)) {
                    str2 = "personal_homepage";
                } else {
                    str2 = "others_homepage";
                }
                b.mo85057b(str3, str2).mo85252e();
            }
        }

        /* renamed from: a */
        private static UserSharePackage m122129a(User user, Context context, List<? extends Aweme> list) {
            boolean z;
            String str;
            C7573i.m23587b(user, "user");
            C7573i.m23587b(context, "context");
            C38227a a = new C38227a().mo95814a(user);
            String uid = user.getUid();
            C7573i.m23582a((Object) uid, "user.uid");
            String string = context.getString(R.string.jf);
            C7573i.m23582a((Object) string, "context.getString(R.string.app_name)");
            C7219a a2 = a.mo18869e(uid).mo18865a("app_name", string);
            ShareInfo shareInfo = user.getShareInfo();
            C7573i.m23582a((Object) shareInfo, "user.shareInfo");
            String shareTitle = shareInfo.getShareTitle();
            C7573i.m23582a((Object) shareTitle, "user.shareInfo.shareTitle");
            C7219a f = a2.mo18870f(shareTitle);
            ShareInfo shareInfo2 = user.getShareInfo();
            C7573i.m23582a((Object) shareInfo2, "user.shareInfo");
            String shareWeiboDesc = shareInfo2.getShareWeiboDesc();
            C7573i.m23582a((Object) shareWeiboDesc, "user.shareInfo.shareWeiboDesc");
            C7219a g = f.mo18871g(shareWeiboDesc);
            ShareInfo shareInfo3 = user.getShareInfo();
            C7573i.m23582a((Object) shareInfo3, "user.shareInfo");
            String b = C38157b.m121908b(C38157b.m121905a(shareInfo3.getShareUrl()));
            if (b == null) {
                b = "";
            }
            String uid2 = user.getUid();
            C7573i.m23582a((Object) uid2, "user.uid");
            C7219a a3 = g.mo18872h(b).mo18868d("user").mo18865a("uid", uid2);
            String str2 = "sec_user_id";
            String secUid = user.getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            String nickname = user.getNickname();
            C7573i.m23582a((Object) nickname, "user.nickname");
            C7219a a4 = a3.mo18865a(str2, secUid).mo18865a("name", nickname);
            String str3 = "desc";
            CharSequence uniqueId = user.getUniqueId();
            int i = 0;
            if (uniqueId == null || uniqueId.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = user.getShortId();
            } else {
                str = user.getUniqueId();
            }
            C7573i.m23582a((Object) str, "if (user.uniqueId.isNull…hortId else user.uniqueId");
            C7219a a5 = a4.mo18865a(str3, str);
            if (!C43122ff.m136769b(user, C43122ff.m136787r(user)) && list != null && list.size() >= 3) {
                List arrayList = new ArrayList();
                for (Aweme aweme : list) {
                    if (aweme.getAwemeType() == 2) {
                        UrlModel a6 = C38159c.m121913a(aweme);
                        if (a6 != null) {
                            arrayList.add(a6);
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
                    String jSONString = JSON.toJSONString(arrayList);
                    C7573i.m23582a((Object) jSONString, "JSON.toJSONString(models)");
                    a5.mo18865a("aweme_cover_list", jSONString);
                }
            }
            UserSharePackage userSharePackage = (UserSharePackage) a5.mo18866a();
            userSharePackage.f20186l.putSerializable("video_cover", user.getAvatarMedium());
            return userSharePackage;
        }

        /* renamed from: a */
        public final void mo95815a(Handler handler, Activity activity, User user, List<? extends Aweme> list, boolean z) {
            String str;
            String str2;
            Handler handler2 = handler;
            Activity activity2 = activity;
            User user2 = user;
            C7573i.m23587b(activity2, "activity");
            if (user2 != null && user.getShareInfo() != null) {
                UserSharePackage a = m122129a(user2, activity2, list);
                if (C43122ff.m136787r(user)) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                String str3 = str;
                C38382b bVar = new C38382b();
                SharePackage sharePackage = a;
                C38144b bVar2 = new C38144b(sharePackage, str3, 0, 4, null);
                bVar.mo95963a((C38343b) bVar2);
                C37984ap.m121301a().injectUniversalConfig(bVar, activity, true);
                GeneralPermission generalPermission = user.getGeneralPermission();
                if (generalPermission != null) {
                    str2 = generalPermission.getShareProfileToast();
                } else {
                    str2 = null;
                }
                boolean z2 = false;
                if (!TextUtils.isEmpty(str2)) {
                    bVar.mo95977b(false);
                }
                if (C6861a.m21337f().isMe(user.getUid()) || !user.isSecret()) {
                    bVar.mo95963a((C38343b) new C38142a());
                } else {
                    bVar.mo95974b();
                    bVar.mo95977b(false);
                }
                if (C6399b.m19946v() && !C43122ff.m136787r(user) && C6384b.m19835a().mo15287a(HidePushSettingsExperiment.class, true, "m_post_push_group", C6384b.m19835a().mo15295d().m_post_push_group, 1) != 3) {
                    if (C43122ff.m136769b(user2, C6861a.m21337f().isMe(user.getUid()))) {
                        if (C43122ff.m136761a(user.getFollowStatus())) {
                            if (user.getWatchwStatus() == 1) {
                                z2 = true;
                            }
                            bVar.mo95967a((C38389f) new C38136x(user2, z2));
                        }
                    } else if (!user.isBlock()) {
                        if (user.getWatchwStatus() == 1) {
                            z2 = true;
                        }
                        bVar.mo95967a((C38389f) new C38136x(user2, z2));
                    }
                }
                if (handler2 != null) {
                    bVar.mo95967a((C38389f) new C38076af(user2));
                    IAccountUserService a2 = C21115b.m71197a();
                    C7573i.m23582a((Object) a2, "AccountUserProxyService.get()");
                    if (a2.isLogin()) {
                        bVar.mo95967a((C38389f) new C38096f(user2, handler2));
                    }
                    if (!user2.isBlock && C30553b.m99785a() && !C43122ff.m136767b()) {
                        bVar.mo95967a((C38389f) new C38129t(handler2));
                    }
                    SharePrefCache inst = SharePrefCache.inst();
                    C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
                    C22903bl removeFollowerSwitch = inst.getRemoveFollowerSwitch();
                    C7573i.m23582a((Object) removeFollowerSwitch, "SharePrefCache.inst().removeFollowerSwitch");
                    Object d = removeFollowerSwitch.mo59877d();
                    C7573i.m23582a(d, "SharePrefCache.inst().removeFollowerSwitch.cache");
                    if (((Boolean) d).booleanValue() && user.getFollowerStatus() == 1) {
                        bVar.mo95967a((C38389f) new C38071ab(handler2));
                    }
                }
                bVar.mo95964a(sharePackage);
                C38229a aVar = new C38229a(a, str3, activity, user, handler);
                bVar.mo95966a((C38386d) aVar);
                C38380c a3 = bVar.mo95972a();
                if (!activity.isFinishing()) {
                    CommonShareDialog commonShareDialog = new CommonShareDialog(activity, a3, 0, 4, null);
                    commonShareDialog.show();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage$c */
    public static final class C38230c implements Creator<UserSharePackage> {
        C38230c() {
        }

        /* renamed from: a */
        private static UserSharePackage[] m122138a(int i) {
            return new UserSharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122137a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122138a(i);
        }

        /* renamed from: a */
        private static UserSharePackage m122137a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new UserSharePackage(parcel);
        }
    }

    /* renamed from: a */
    public static final void m122120a(Handler handler, Activity activity, User user, List<? extends Aweme> list, boolean z) {
        f99381b.mo95815a(handler, activity, user, list, z);
    }

    public final int describeContents() {
        return 0;
    }

    public UserSharePackage(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(new C38227a().mo18867b(parcel));
    }

    /* renamed from: a */
    public final C38354f mo18860a(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        return new C38356g(C38159c.m121914a(this.f20185k, bVar), this.f20183i, this.f20184j);
    }

    public UserSharePackage(C38227a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar);
        User user = aVar.f99383a;
        if (user == null) {
            C7573i.m23580a();
        }
        this.f99382a = user;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        if (parcel != null) {
            parcel.writeSerializable(this.f99382a);
        }
    }

    /* renamed from: a */
    public final boolean mo18862a(C38389f fVar, Context context) {
        CharSequence charSequence;
        C7573i.m23587b(fVar, "action");
        C7573i.m23587b(context, "context");
        if (fVar instanceof C38090d) {
            GeneralPermission generalPermission = this.f99382a.getGeneralPermission();
            String str = null;
            if (generalPermission != null) {
                charSequence = generalPermission.getShareProfileToast();
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                GeneralPermission generalPermission2 = this.f99382a.getGeneralPermission();
                if (generalPermission2 != null) {
                    str = generalPermission2.getShareProfileToast();
                }
                C10761a.m31403c(context, str).mo25750a();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo18861a(C38343b bVar, Context context) {
        CharSequence charSequence;
        C7573i.m23587b(bVar, "channel");
        C7573i.m23587b(context, "context");
        GeneralPermission generalPermission = this.f99382a.getGeneralPermission();
        String str = null;
        if (generalPermission != null) {
            charSequence = generalPermission.getShareProfileToast();
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            GeneralPermission generalPermission2 = this.f99382a.getGeneralPermission();
            if (generalPermission2 != null) {
                str = generalPermission2.getShareProfileToast();
            }
            C10761a.m31403c(context, str).mo25750a();
            return true;
        }
        C37984ap.m121302b().addShareRecord(bVar.mo95739b(), 2);
        return false;
    }
}
