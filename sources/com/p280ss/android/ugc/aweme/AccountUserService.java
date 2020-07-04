package com.p280ss.android.ugc.aweme;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12709d;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.account.C18892b.C18893a;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.ugc.aweme.IAccountUserService.C6856a;
import com.p280ss.android.ugc.aweme.account.login.C21578r;
import com.p280ss.android.ugc.aweme.account.network.C22203a;
import com.p280ss.android.ugc.aweme.account.p950k.C21225a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.model.VideoCover;
import com.p280ss.android.ugc.aweme.user.C42800a;
import com.p280ss.android.ugc.aweme.user.C42811c;
import com.p280ss.android.ugc.aweme.user.C42813d;
import com.p280ss.android.ugc.aweme.user.C42813d.C42814a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p346io.reactivex.C47556ac;
import p346io.reactivex.C47558ae;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7320af;
import p346io.reactivex.C7329e;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.AccountUserService */
public class AccountUserService implements IAccountUserService {
    private volatile boolean mHastInitialized;

    static final /* synthetic */ C7320af lambda$logoutAllBackgroundUser$6$AccountUserService(C7319aa aaVar, Object obj) throws Exception {
        return aaVar;
    }

    static final /* synthetic */ String lambda$refreshPassportUserInfo$1$AccountUserService(Throwable th) throws Exception {
        return "";
    }

    public void accountUserClear() {
        C21683bp.m72590d();
    }

    public List<String> allUidList() {
        C42811c.m135845a();
        return C42811c.m135873f();
    }

    public User getCurUser() {
        C42811c.m135845a();
        return C42811c.m135859b();
    }

    public String getCurUserId() {
        C42811c.m135845a();
        return C42811c.m135870e();
    }

    public String getLastUid() {
        C42811c.m135845a();
        return C42811c.m135878s();
    }

    public boolean hasUpdated() {
        return C42811c.m135845a().f111263a;
    }

    public boolean isLogin() {
        C42811c.m135845a();
        return C42811c.m135867c();
    }

    public boolean isNewUser() {
        return C21683bp.m72589c();
    }

    public void updateFbExpireTime() {
        C42811c.m135845a().mo104499p();
    }

    public void checkIn() {
        init();
        C42811c.m135845a().mo104488i();
    }

    public boolean getAuthGoods() {
        return C42811c.m135845a().mo104496m();
    }

    public int getVerifyStatus() {
        return C42811c.m135845a().mo104495l();
    }

    public boolean hasCommerceVideoRights() {
        return C42811c.m135845a().mo104498o();
    }

    public boolean isOldUser() {
        return C42811c.m135845a().mo104474d();
    }

    public boolean isOnCommerceWhiteList() {
        return C42811c.m135845a().mo104497n();
    }

    public void setUserBanned() {
        init();
        C42811c.m135845a().mo104491j();
    }

    public boolean shouldRefresh() {
        return C42811c.m135845a().mo104484g();
    }

    public void updateTwExpireTime() {
        init();
        C42811c.m135845a().mo104500q();
    }

    public void updateYoutubeExpireTime() {
        init();
        C42811c.m135845a().mo104501r();
    }

    public String getAvatarUrl() {
        C42800a d = C42813d.f111272b.mo104512d(C42813d.m135935e());
        if (d != null) {
            return d.f111248e;
        }
        return "";
    }

    public String getNickName() {
        C42800a d = C42813d.f111272b.mo104512d(C42813d.m135935e());
        if (d != null) {
            return d.f111247d;
        }
        return "";
    }

    public String getPhoneCountryCode() {
        C42814a c = C42813d.f111272b.mo104510c(C42813d.m135935e());
        if (c == null) {
            return "";
        }
        return c.f111285e;
    }

    public String getSessionKey() {
        C42814a c = C42813d.f111272b.mo104510c(C42813d.m135935e());
        if (c != null) {
            return c.f111282b;
        }
        return "";
    }

    public void init() {
        if (!this.mHastInitialized) {
            this.mHastInitialized = true;
            C21683bp.m72586a(new C21679bl());
            addUserChangeListener(C21084a.f56605e);
        }
    }

    public void queryUser() {
        init();
        C42811c.m135845a().mo104485h();
    }

    public boolean isChildrenMode() {
        if (!C6399b.m19946v()) {
            return false;
        }
        User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
        if (currentUser == null || currentUser.getUserMode() != 2) {
            return false;
        }
        return true;
    }

    public void refreshPassportUserInfo() {
        if (isLogin()) {
            init();
            C7329e.m22975a(C21685c.f58093a).mo19162c(C21686d.f58094a).mo19159b(C7333a.m23044b()).mo19142a(C21687e.f58095a, C21688f.f58096a);
        }
    }

    public C7319aa<C12709d> logoutAllBackgroundUser() {
        C42811c.m135845a();
        List f = C42811c.m135873f();
        if (f.size() < 2) {
            return null;
        }
        C42811c.m135845a();
        String e = C42811c.m135870e();
        StringBuilder sb = new StringBuilder("?uids=");
        for (int size = f.size() - 1; size >= 0; size--) {
            if (!TextUtils.equals((CharSequence) f.get(size), e)) {
                C42811c.m135845a();
                C42811c.m135876h((String) f.get(size));
                sb.append((String) f.get(size));
                sb.append(",");
            }
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        return C7319aa.m22932a((Callable<? extends T>) new C21756h<Object>(sb)).mo19135b(C7333a.m23044b()).mo19126a((C7327h<? super T, ? extends C7320af<? extends R>>) new C21757i<Object,Object>(C7319aa.m22925a((C47558ae<T>) new C21755g<T>(this)))).mo19127a(C47549a.m148327a());
    }

    public void addUserChangeListener(C6856a aVar) {
        C21683bp.m72584a(aVar);
    }

    public void removeUserChangeListener(C6856a aVar) {
        C21683bp.m72588b(aVar);
    }

    public void setNetworkProxyInstance(C22203a aVar) {
        C21683bp.m72585a(aVar);
    }

    public C42800a findSignificanUserInfo(String str) {
        return C42813d.f111272b.mo104512d(str);
    }

    public boolean isNullUid(String str) {
        return C42813d.m135936f(str);
    }

    public boolean isUserEmpty(User user) {
        C42811c.m135845a();
        return C42811c.m135858a(user);
    }

    static final /* synthetic */ void lambda$refreshPassportUserInfo$3$AccountUserService(Throwable th) throws Exception {
        if (C7163a.m22363a()) {
            throw new RuntimeException("This is a debug-mode crash, unhandled RxJava onError", th);
        }
    }

    public FollowerDetail getCurUserFollowDetail(String str) {
        return C42811c.m135845a().mo104481g(str);
    }

    public boolean isMe(String str) {
        return C6319n.m19594a(str, getCurUserId());
    }

    public void queryUserSync(User user) {
        init();
        C42811c.m135845a().mo104471d(user);
    }

    public void setCurUser(User user) {
        init();
        C42811c.m135845a().mo104462b(user);
    }

    public void setUserLogicDelete(String str) {
        init();
        C42811c.m135845a().mo104476e(str);
    }

    public void setWithCommerceNewbieTask(boolean z) {
        init();
        C42811c.m135845a().mo104480f(z);
    }

    public void updateCurAllowStatus(int i) {
        init();
        C42811c.m135845a().mo104475e(i);
    }

    public void updateCurAwemeCount(int i) {
        init();
        C42811c.m135845a().mo104466c(i);
    }

    public void updateCurCanChangeSchoolInfo(boolean z) {
        init();
        C42811c.m135845a().mo104477e(z);
    }

    public void updateCurCover(List<UrlModel> list) {
        init();
        C42811c.m135845a().mo104459a(list);
    }

    public void updateCurDongtaiCount(int i) {
        init();
        C42811c.m135845a().mo104470d(i);
    }

    public void updateCurFavoritingCount(int i) {
        init();
        C42811c.m135845a().mo104482g(i);
    }

    public void updateCurFollowerCount(int i) {
        init();
        C42811c.m135845a().mo104461b(i);
    }

    public void updateCurFollowingCount(int i) {
        init();
        C42811c.m135845a().mo104450a(i);
    }

    public void updateCurHideFollowingFollowerList(int i) {
        init();
        C42811c.m135845a().mo104478f(i);
    }

    public void updateCurHideSearch(boolean z) {
        init();
        C42811c.m135845a().mo104473d(z);
    }

    public void updateCurNickname(String str) {
        init();
        C42811c.m135845a().mo104463b(str);
    }

    public void updateCurSecret(boolean z) {
        init();
        C42811c.m135845a().mo104465b(z);
    }

    public void updateCurSignature(String str) {
        init();
        C42811c.m135845a().mo104472d(str);
    }

    public void updateCurUser(User user) {
        init();
        C42811c.m135845a().mo104467c(user);
    }

    public void updateCurUserId(String str) {
        init();
        C42811c.m135845a().mo104468c(str);
    }

    public void updateCurVideoCover(VideoCover videoCover) {
        init();
        C42811c.m135845a().mo104454a(videoCover);
    }

    public void updateHasFacebookToken(boolean z) {
        init();
        C42811c.m135845a().mo104483g(z);
    }

    public void updateHasTwitterToken(boolean z) {
        init();
        C42811c.m135845a().mo104487h(z);
    }

    public void updateHasYoutubeToken(boolean z) {
        init();
        C42811c.m135845a().mo104490i(z);
    }

    public void updateLeaveTime(long j) {
        init();
        C42811c.m135845a().mo104452a(j);
    }

    public void updateMinor(boolean z) {
        init();
        C42811c.m135845a().mo104469c(z);
    }

    public void updateNotifyPrivateAccount(int i) {
        init();
        C42811c.m135845a().mo104486h(i);
    }

    public void updateShieldCommentNotice(int i) {
        init();
        C42811c.m135845a().mo104494k(i);
    }

    public void updateShieldDiggNotice(int i) {
        init();
        C42811c.m135845a().mo104489i(i);
    }

    public void updateShieldFollowNotice(int i) {
        init();
        C42811c.m135845a().mo104492j(i);
    }

    public void updateWeiboBindStatus(boolean z) {
        init();
        C42811c.m135845a().mo104460a(z);
    }

    public void updateWeiboName(String str) {
        init();
        C42811c.m135845a().mo104455a(str);
    }

    static final /* synthetic */ void lambda$refreshPassportUserInfo$2$AccountUserService(String str) throws Exception {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            new C18893a();
            C21683bp.m72583a(C18893a.m61663b(jSONObject), "refresh passport user info");
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$logoutAllBackgroundUser$4$AccountUserService(final C47556ac acVar) throws Exception {
        C12798d.m37186a(C6399b.m19921a()).mo31178a((C12706a<C12709d>) new C12706a<C12709d>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onResponse(C12709d dVar) {
                if (!dVar.f33701a) {
                    StringBuilder sb = new StringBuilder("account/logout_others fail, error code: ");
                    sb.append(dVar.f33702b);
                    sb.append(", error msg: ");
                    sb.append(dVar.f33703c);
                    C6921a.m21555a(sb.toString());
                }
                acVar.mo119654a(dVar);
            }
        });
    }

    public void updateInsId(String str) {
        init();
        C42811c.m135845a().mo104479f(str);
    }

    public void updateUserInfo(C12898b bVar) {
        init();
        C21683bp.m72583a(bVar, "service update user info");
    }

    static final /* synthetic */ Object lambda$logoutAllBackgroundUser$5$AccountUserService(StringBuilder sb) throws Exception {
        C22203a a = C21683bp.m72581a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C21578r.f57915c);
        sb2.append(sb.toString());
        return a.mo58585b(Integer.MAX_VALUE, sb2.toString());
    }

    public void clear(String str) {
        init();
        StringBuilder sb = new StringBuilder();
        sb.append(C21225a.m71436a());
        sb.append("|clear:");
        sb.append(str);
        C21225a.m71440b(sb.toString());
        C42811c.m135845a().mo104493k();
    }

    public void queryUser(Handler handler) {
        init();
        C42811c.m135845a();
        C42811c.m135846a(handler);
    }

    public User queryUser(String str, boolean z) throws Exception {
        init();
        C42811c.m135845a();
        return C42811c.m135844a(str, z);
    }

    public void registerNotice(String str, int i) {
        init();
        C42811c.m135845a().mo104464b(str, i);
    }

    public void updateCurBirthday(String str, int i) {
        init();
        C42811c.m135845a().mo104456a(str, i);
    }

    public void updateCurGender(int i, int i2) {
        init();
        C42811c.m135845a().mo104451a(i, i2);
    }

    public void updateGender(Handler handler, Map<String, String> map) {
        init();
        C42811c.m135845a();
        C42811c.m135854a(handler, map);
    }

    public void updateLocation(Handler handler, Map<String, String> map) {
        init();
        C42811c.m135845a();
        C42811c.m135863b(handler, map);
    }

    public void updateSchool(Handler handler, Map<String, String> map) {
        init();
        C42811c.m135845a();
        C42811c.m135866c(handler, map);
    }

    public void updateUserInfo(Handler handler, Map<String, String> map) {
        init();
        C42811c.m135845a();
        C42811c.m135869d(handler, map);
    }

    public void delete(String str, String str2) {
        init();
        StringBuilder sb = new StringBuilder();
        sb.append(C21225a.m71436a());
        sb.append("|delete:");
        sb.append(str2);
        C21225a.m71440b(sb.toString());
        C42811c.m135845a();
        C42811c.m135876h(str);
    }

    public void syncWeiboBindStatus(Handler handler, boolean z, int i) {
        init();
        C42811c.m135845a();
        C42811c.m135864b(handler, z, i);
    }

    public void updateAllowStatus(Handler handler, int i, int i2) {
        init();
        C42811c.m135845a();
        C42811c.m135847a(handler, i, i2);
    }

    public void updateAvatarUri(Handler handler, String str, int i) {
        init();
        C42811c.m135845a();
        C42811c.m135871e(handler, str, i);
    }

    public void updateCurAvatar(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3) {
        init();
        C42811c.m135845a().mo104453a(urlModel, urlModel2, urlModel3);
    }

    public void updateId(Handler handler, String str, int i) {
        init();
        C42811c.m135845a();
        C42811c.m135868d(handler, str, i);
    }

    public void updateInsId(Handler handler, String str, int i) {
        init();
        C42811c.m135845a();
        C42811c.m135874f(handler, str, i);
    }

    public void updateLanguage(Handler handler, String str, int i) {
        init();
        C42811c.m135845a();
        C42811c.m135865c(handler, str, i);
    }

    public void updateNickName(Handler handler, String str, int i) {
        init();
        C42811c.m135845a();
        C42811c.m135848a(handler, str, i);
    }

    public void updateSecret(Handler handler, boolean z, int i) {
        init();
        C42811c.m135845a();
        C42811c.m135855a(handler, z, i);
    }

    public void updateSignature(Handler handler, String str, int i) {
        init();
        C42811c.m135845a();
        C42811c.m135860b(handler, str, i);
    }

    public void updateBirthday(Handler handler, String str, int i, int i2) {
        init();
        C42811c.m135845a();
        C42811c.m135849a(handler, str, i, i2);
    }

    public void updateCoverUri(Handler handler, String str, int i, int i2) {
        init();
        C42811c.m135845a();
        C42811c.m135861b(handler, str, i, i2);
    }

    public void uploadCover(Handler handler, String str, int i, String str2) {
        init();
        C42811c.m135845a();
        C42811c.m135862b(handler, str, i, str2);
    }

    public void uploadVideoAvatar(Handler handler, String str, int i, String str2) {
        init();
        C42811c.m135845a();
        C42811c.m135850a(handler, str, i, str2);
    }

    public void updateCurSchoolInfo(String str, String str2, String str3, int i, int i2) {
        init();
        C42811c.m135845a().mo104457a(str, str2, str3, i, i2);
    }

    public void updateVideoCoverUri(Handler handler, String str, String str2, int i, int i2) {
        init();
        C42811c.m135845a();
        C42811c.m135853a(handler, str, str2, i, i2);
    }

    public void uploadAvatar(Handler handler, String str, int i, String str2, List<C19565e> list) {
        init();
        C42811c.m135845a();
        C42811c.m135852a(handler, str, i, str2, list);
    }

    public void uploadCommerceHeadImage(Handler handler, String str, int i, String str2, String str3) {
        init();
        C42811c.m135845a();
        C42811c.m135851a(handler, str, i, str2, str3);
    }

    public void updateCurLocation(String str, String str2, String str3, String str4, String str5, boolean z) {
        init();
        C42811c.m135845a().mo104458a(str, str2, str3, str4, str5, z);
    }
}
