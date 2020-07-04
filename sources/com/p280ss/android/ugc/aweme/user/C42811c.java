package com.p280ss.android.ugc.aweme.user;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.ugc.aweme.C21084a;
import com.p280ss.android.ugc.aweme.C21683bp;
import com.p280ss.android.ugc.aweme.account.login.loginlog.C21558a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a;
import com.p280ss.android.ugc.aweme.account.p950k.C21227b;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.main.p1385g.C33014a;
import com.p280ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p280ss.android.ugc.aweme.profile.model.PlatformInfo;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.model.VideoCover;
import com.p280ss.android.ugc.aweme.user.p1686a.C42802a;
import com.p280ss.android.ugc.aweme.user.p1687b.C42804a;
import com.p280ss.android.ugc.aweme.user.p1689d.C42828a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.user.c */
public class C42811c implements C6310a {

    /* renamed from: b */
    private static volatile C42811c f111262b;

    /* renamed from: a */
    public boolean f111263a = false;

    /* renamed from: c */
    private C42802a f111264c = new C42802a();

    /* renamed from: d */
    private boolean f111265d = false;

    /* renamed from: e */
    private long f111266e = -1;

    /* renamed from: f */
    private C6309f f111267f = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: a */
    public static boolean m135858a(User user) {
        return C42828a.m135984a(user);
    }

    /* renamed from: a */
    public final void mo104455a(String str) {
        if (!TextUtils.equals(m135859b().getWeiboNickname(), str)) {
            m135859b().setWeiboNickname(str);
            this.f111263a = true;
            C42813d.m135938h();
        }
    }

    /* renamed from: a */
    public final void mo104460a(boolean z) {
        m135859b().setBindedWeibo(z);
        C42813d.m135938h();
    }

    /* renamed from: a */
    public final void mo104456a(String str, int i) {
        if (!TextUtils.equals(m135859b().getBirthday(), str) || i != m135859b().getBirthdayHideLevel()) {
            m135859b().setBirthday(str);
            m135859b().setBirthdayHideLevel(i);
            this.f111263a = true;
            C42813d.m135938h();
        }
    }

    /* renamed from: b */
    public final void mo104465b(boolean z) {
        if (m135859b().isSecret() != z) {
            m135859b().setSecret(z);
            this.f111263a = true;
            C42813d.m135938h();
        }
    }

    /* renamed from: a */
    public final void mo104451a(int i, int i2) {
        if (m135859b().getGender() != i2) {
            m135859b().setGender(i2);
            m135859b().setShowGenderStrategy(i);
            this.f111263a = true;
            C42813d.m135938h();
        }
    }

    /* renamed from: a */
    public final void mo104453a(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3) {
        User b = m135859b();
        if (b.getAvatarThumb() == null || b.getAvatarMedium() == null || b.getAvatarLarger() == null || (urlModel != null && !TextUtils.equals(b.getAvatarThumb().getUri(), urlModel.getUri()) && urlModel2 != null && !TextUtils.equals(b.getAvatarMedium().getUri(), urlModel2.getUri()) && urlModel3 != null && !TextUtils.equals(b.getAvatarLarger().getUri(), urlModel3.getUri()))) {
            b.setAvatarThumb(urlModel);
            b.setAvatarMedium(urlModel2);
            b.setAvatarLarger(urlModel3);
            C42813d.m135938h();
            C21683bp.m72582a(7, null, b, null);
        }
    }

    /* renamed from: a */
    public final void mo104459a(List<UrlModel> list) {
        m135859b().setCoverUrls(list);
        C42813d.m135938h();
    }

    /* renamed from: a */
    public final void mo104454a(VideoCover videoCover) {
        m135859b().setVideoCover(videoCover);
        C42813d.m135938h();
    }

    /* renamed from: a */
    public final void mo104450a(int i) {
        int followingCount = m135859b().getFollowingCount() + i;
        if (followingCount < 0) {
            followingCount = 0;
        }
        m135859b().setFollowingCount(followingCount);
        C42813d.m135938h();
    }

    /* renamed from: a */
    public final void mo104457a(String str, String str2, String str3, int i, int i2) {
        m135859b().setSchoolName(str);
        m135859b().setCollegeName(str2);
        m135859b().setEnrollYear(str3);
        m135859b().setEducation(i);
        m135859b().setSchoolInfoShowRange(i2);
        this.f111263a = true;
        C42813d.m135938h();
    }

    /* renamed from: a */
    public final void mo104458a(String str, String str2, String str3, String str4, String str5, boolean z) {
        m135859b().setIsoCountryCode(str);
        m135859b().setCountry(str2);
        m135859b().setProvince(str3);
        m135859b().setCityName(str4);
        m135859b().setDistrict(str5);
        m135859b().setHideCity(z);
        this.f111263a = true;
        C42813d.m135938h();
    }

    /* renamed from: a */
    public final void mo104452a(long j) {
        if (this.f111266e != -1) {
            j = this.f111266e;
        }
        this.f111266e = j;
    }

    /* renamed from: a */
    public static void m135854a(Handler handler, Map<String, String> map) {
        C42804a.m135843a(handler, map, 1);
    }

    /* renamed from: a */
    public static void m135855a(Handler handler, boolean z, int i) {
        C42804a.m135841a(handler, "secret", z ? "1" : "0", i, 122);
    }

    /* renamed from: a */
    public static void m135853a(Handler handler, String str, String str2, int i, int i2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("cover_video_id", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("cover_item_id", str2);
        }
        hashMap.put("cover_video_offset", String.valueOf(i));
        hashMap.put("page_from", String.valueOf(i2));
        C42804a.m135843a(handler, (Map<String, String>) hashMap, 11);
    }

    /* renamed from: b */
    public final void mo104464b(String str, int i) {
        C42804a.m135838a((Handler) this.f111267f, str, i, 114);
    }

    /* renamed from: a */
    private static void m135857a(Object obj) throws Exception {
        if (!(obj instanceof ApiServerException)) {
            C21683bp.m72582a(11, null, null, null);
        } else {
            ((ApiServerException) obj).getErrorCode();
            throw new Exception("user check in fails");
        }
    }

    /* renamed from: a */
    private void m135856a(Message message) {
        try {
            m135857a(message.obj);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static User m135859b() {
        return C42813d.f111272b.mo104504a(false);
    }

    /* renamed from: e */
    public static String m135870e() {
        return C42813d.m135935e();
    }

    /* renamed from: f */
    public static List<String> m135873f() {
        return C42813d.m135937g();
    }

    /* renamed from: s */
    public static String m135878s() {
        return C42813d.f111272b.mo104515f();
    }

    /* renamed from: l */
    public final int mo104495l() {
        return m135859b().verifyStatus;
    }

    /* renamed from: m */
    public final boolean mo104496m() {
        return m135872e(m135859b());
    }

    /* renamed from: n */
    public final boolean mo104497n() {
        return m135859b().isWithCommerceEntry();
    }

    /* renamed from: o */
    public final boolean mo104498o() {
        return m135859b().isWithItemCommerceEntry();
    }

    private C42811c() {
    }

    /* renamed from: c */
    public static boolean m135867c() {
        return C42813d.f111272b.mo104513d();
    }

    /* renamed from: t */
    private void m135879t() {
        C42813d.m135938h();
        m135875f(m135859b());
        C21683bp.m72582a(5, null, m135859b(), null);
    }

    /* renamed from: h */
    public final void mo104485h() {
        C42804a.m135842a((Handler) this.f111267f, ((C33014a) C21084a.m71113a(C33014a.class)).mo59997a(), false, 112);
    }

    /* renamed from: i */
    public final void mo104488i() {
        C42804a.m135837a((Handler) this.f111267f, "https://api2.musical.ly/aweme/v1/check/in/", 113);
    }

    /* renamed from: k */
    public final void mo104493k() {
        this.f111263a = false;
        m135876h(C42813d.m135935e());
        this.f111265d = false;
        this.f111266e = -1;
    }

    /* renamed from: p */
    public final void mo104499p() {
        m135859b().setFbExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        C42813d.m135938h();
    }

    /* renamed from: q */
    public final void mo104500q() {
        m135859b().setTwExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        C42813d.m135938h();
    }

    /* renamed from: r */
    public final void mo104501r() {
        m135859b().setYoutubeExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        C42813d.m135938h();
    }

    /* renamed from: a */
    public static final C42811c m135845a() {
        if (f111262b == null) {
            synchronized (C42811c.class) {
                if (f111262b == null) {
                    f111262b = new C42811c();
                }
            }
        }
        return f111262b;
    }

    /* renamed from: g */
    public final boolean mo104484g() {
        if (!this.f111263a || ((this.f111266e >= 0 && System.currentTimeMillis() - this.f111266e >= 180000) || this.f111265d)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo104491j() {
        C21558a a = C21558a.m72263a();
        StringBuilder sb = new StringBuilder("last_uid = ");
        sb.append(AppLog.getUserId());
        m135845a();
        a.mo57698a(sb.toString(), "", false, "user_login_out", m135867c());
        m135845a();
        m135877i(AppLog.getUserId());
        C21227b.m71451a("aweme_user_logout", "", C21101a.m71159a().mo56942a("errorDesc", "user_banned").mo56943b());
        m135845a();
        C21558a.m72263a().mo57698a("user_banned", "", false, "user_login_out", m135867c());
        C21683bp.m72582a(8, null, m135859b(), null);
    }

    /* renamed from: d */
    public final boolean mo104474d() {
        return C42828a.m135985b(m135859b());
    }

    /* renamed from: h */
    public static void m135876h(String str) {
        if (!C42813d.m135936f(str)) {
            C42813d.f111272b.mo104514e(str);
        }
    }

    /* renamed from: i */
    private static void m135877i(String str) {
        if (!C6399b.m19944t()) {
            C42813d.f111272b.mo104509b(str);
        }
    }

    /* renamed from: g */
    public final void mo104483g(boolean z) {
        m135859b().setHasFacebookToken(z);
        C42813d.m135938h();
    }

    /* renamed from: j */
    public final void mo104492j(int i) {
        m135859b().setShieldFollowNotice(i);
        C42813d.m135938h();
    }

    /* renamed from: k */
    public final void mo104494k(int i) {
        m135859b().setShieldCommentNotice(i);
        C42813d.m135938h();
    }

    /* renamed from: e */
    private static boolean m135872e(User user) {
        if (((user.getAuthorityStatus() >> 1) & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo104470d(int i) {
        int dongtaiCount = m135859b().getDongtaiCount() + i;
        if (dongtaiCount < 0) {
            dongtaiCount = 0;
        }
        m135859b().setDongtaiCount(dongtaiCount);
        C42813d.m135938h();
    }

    /* renamed from: f */
    public final void mo104478f(int i) {
        m135859b().setHideFollowingFollowerList(i);
        C42813d.m135938h();
    }

    /* renamed from: g */
    public final void mo104482g(int i) {
        m135859b().setFavoritingCount(m135859b().getFavoritingCount() + i);
        C42813d.m135938h();
    }

    /* renamed from: f */
    private static void m135875f(User user) {
        if (user != null) {
            C22345t.m73957a(user.getIsSyncToutiao() ? 1 : 0);
            PlatformInfo[] platformInfos = user.getPlatformInfos();
            boolean z = false;
            if (platformInfos != null && platformInfos.length > 0) {
                int length = platformInfos.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (TextUtils.equals("hotsoon", platformInfos[i].getPatformName())) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            C22345t.m73967c(z);
        }
    }

    /* renamed from: c */
    public final void mo104466c(int i) {
        int awemeCount = m135859b().getAwemeCount() + i;
        if (awemeCount < 0) {
            awemeCount = 0;
        }
        m135859b().setAwemeCount(awemeCount);
        C42813d.m135938h();
    }

    /* renamed from: d */
    public final void mo104471d(User user) {
        mo104467c(user);
        C21683bp.m72582a(10, null, user, null);
    }

    /* renamed from: e */
    public final void mo104475e(int i) {
        m135859b().setAllowStatus(i);
        C42813d.m135938h();
    }

    /* renamed from: g */
    public final FollowerDetail mo104481g(String str) {
        if (m135859b().getFollowerDetailList() != null) {
            for (FollowerDetail followerDetail : m135859b().getFollowerDetailList()) {
                if (TextUtils.equals(followerDetail.getPackageName(), str)) {
                    return followerDetail;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public final void mo104486h(int i) {
        m135859b().setNotifyPrivateAccount(i);
        C42813d.m135938h();
    }

    /* renamed from: i */
    public final void mo104489i(int i) {
        m135859b().setShieldDiggNotice(i);
        C42813d.m135938h();
    }

    /* renamed from: a */
    public static void m135846a(Handler handler) {
        C42804a.m135842a(handler, ((C33014a) C21084a.m71113a(C33014a.class)).mo59997a(), false, 112);
    }

    /* renamed from: c */
    public final void mo104467c(User user) {
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            User b = m135859b();
            this.f111265d = false;
            this.f111266e = -1;
            this.f111263a = true;
            if (!TextUtils.isEmpty(user.getUid()) && !TextUtils.equals(C42813d.f111272b.mo104515f(), user.getUid())) {
                C42813d.f111272b.mo104509b(user.getUid());
            }
            C21683bp.m72582a(4, b, user, null);
            C42813d.f111272b.mo104505a(user);
            C42813d.m135933a(user.getUid());
            m135879t();
            m135870e();
        }
    }

    /* renamed from: d */
    public final void mo104472d(String str) {
        if (!TextUtils.equals(m135859b().getSignature(), str)) {
            m135859b().setSignature(str);
            this.f111263a = true;
            C42813d.m135938h();
        }
    }

    /* renamed from: e */
    public final void mo104476e(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        C21683bp.m72582a(9, null, m135859b(), bundle);
    }

    /* renamed from: f */
    public final void mo104479f(String str) {
        m135859b().setInsId(str);
        C42813d.m135938h();
    }

    /* renamed from: h */
    public final void mo104487h(boolean z) {
        m135859b().setHasTwitterToken(z);
        C42813d.m135938h();
    }

    public void handleMsg(Message message) {
        if (message.obj instanceof Exception) {
            if (message.obj instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) message.obj;
                int errorCode = apiServerException.getErrorCode();
                if (errorCode != 14) {
                    switch (errorCode) {
                        case 8:
                            return;
                        case 9:
                            mo104491j();
                            return;
                    }
                } else {
                    mo104476e(apiServerException.getErrorMsg());
                }
            }
            return;
        }
        switch (message.what) {
            case 112:
                mo104467c((User) message.obj);
                break;
            case 113:
                m135856a(message);
                return;
            case 114:
                return;
        }
    }

    /* renamed from: i */
    public final void mo104490i(boolean z) {
        m135859b().setHasYoutubeToken(z);
        C42813d.m135938h();
    }

    /* renamed from: c */
    public final void mo104468c(String str) {
        if (!TextUtils.equals(m135859b().getUniqueId(), str)) {
            m135859b().setUniqueId(str);
            this.f111263a = true;
            C42813d.m135938h();
        }
    }

    /* renamed from: d */
    public final void mo104473d(boolean z) {
        m135859b().setHideSearch(z);
        C42813d.m135938h();
    }

    /* renamed from: e */
    public final void mo104477e(boolean z) {
        m135859b().setCanModifySchoolInfo(z);
        this.f111263a = true;
        C42813d.m135938h();
    }

    /* renamed from: f */
    public final void mo104480f(boolean z) {
        m135859b().setWithCommerceNewbieTask(z);
        C42813d.m135938h();
    }

    /* renamed from: b */
    public final void mo104461b(int i) {
        m135859b().setFollowerCount(m135859b().getFollowerCount() + i);
        C42813d.m135938h();
    }

    /* renamed from: c */
    public final void mo104469c(boolean z) {
        m135859b().setMinor(z);
        C42813d.m135938h();
    }

    /* renamed from: b */
    public final void mo104462b(User user) {
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            C42813d.f111272b.mo104505a(user);
            this.f111263a = true;
            this.f111265d = false;
            this.f111266e = -1;
            C42813d.f111272b.mo104509b(user.getUid());
            m135879t();
        }
    }

    /* renamed from: b */
    public final void mo104463b(String str) {
        if (!TextUtils.equals(m135859b().getNickname(), str)) {
            m135859b().setNickname(str);
            this.f111263a = true;
            C42813d.m135938h();
            C21683bp.m72582a(6, null, m135859b(), null);
        }
    }

    /* renamed from: c */
    public static void m135866c(Handler handler, Map<String, String> map) {
        C42804a.m135843a(handler, map, 8);
    }

    /* renamed from: d */
    public static void m135869d(Handler handler, Map<String, String> map) {
        C42804a.m135843a(handler, map, 112);
    }

    /* renamed from: a */
    public static User m135844a(String str, boolean z) throws Exception {
        if (TextUtils.isEmpty(str)) {
            str = ((C33014a) C21084a.m71113a(C33014a.class)).mo59997a();
        }
        return C42803b.m135833a(str, z);
    }

    /* renamed from: b */
    public static void m135863b(Handler handler, Map<String, String> map) {
        C42804a.m135843a(handler, map, 7);
    }

    /* renamed from: a */
    public static void m135848a(Handler handler, String str, int i) {
        C42804a.m135841a(handler, "nickname", str, i, 0);
    }

    /* renamed from: c */
    public static void m135865c(Handler handler, String str, int i) {
        C42804a.m135841a(handler, "language_change", str, i, 124);
    }

    /* renamed from: d */
    public static void m135868d(Handler handler, String str, int i) {
        C42804a.m135841a(handler, "unique_id", str, i, 116);
    }

    /* renamed from: a */
    public static void m135847a(Handler handler, int i, int i2) {
        C42804a.m135841a(handler, "allow_status", String.valueOf(i), i2, 5);
    }

    /* renamed from: b */
    public static void m135860b(Handler handler, String str, int i) {
        C42804a.m135841a(handler, "signature", str, i, 2);
    }

    /* renamed from: e */
    public static void m135871e(Handler handler, String str, int i) {
        C42804a.m135841a(handler, "avatar_uri", str, i, 4);
    }

    /* renamed from: f */
    public static void m135874f(Handler handler, String str, int i) {
        C42804a.m135841a(handler, "ins_id", str, i, 6);
    }

    /* renamed from: b */
    public static void m135864b(Handler handler, boolean z, int i) {
        C42804a.m135841a(handler, "is_binded_weibo", String.valueOf(z ? 1 : 0), i, 119);
    }

    /* renamed from: b */
    public static void m135862b(Handler handler, String str, int i, String str2) {
        C42804a.m135839a(handler, str, i, str2, 126);
    }

    /* renamed from: b */
    public static void m135861b(Handler handler, String str, int i, int i2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("cover_uri", str);
        hashMap.put("cover_source", String.valueOf(i));
        hashMap.put("page_from", String.valueOf(i2));
        C42804a.m135843a(handler, (Map<String, String>) hashMap, 10);
    }

    /* renamed from: a */
    public static void m135849a(Handler handler, String str, int i, int i2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("birthday", str);
        hashMap.put("birthday_hide_level", String.valueOf(i));
        hashMap.put("page_from", String.valueOf(i2));
        C42804a.m135843a(handler, (Map<String, String>) hashMap, 3);
    }

    /* renamed from: a */
    public static void m135850a(Handler handler, String str, int i, String str2) {
        C42804a.m135839a(handler, str, i, str2, 121);
    }

    /* renamed from: a */
    public static void m135851a(Handler handler, String str, int i, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C19565e("source", str3));
        C42804a.m135840a(handler, str, i, str2, arrayList, 125);
    }

    /* renamed from: a */
    public static void m135852a(Handler handler, String str, int i, String str2, List<C19565e> list) {
        C42804a.m135840a(handler, str, i, str2, list, 111);
    }
}
