package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.p028a.C0945c;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.utils.ff */
public class C43122ff {

    /* renamed from: a */
    private static User f111742a;

    /* renamed from: b */
    private static boolean f111743b;

    /* renamed from: a */
    public static void m136757a() {
        f111742a = null;
    }

    /* renamed from: a */
    public static boolean m136761a(int i) {
        return (i == 0 || i == 4) ? false : true;
    }

    /* renamed from: b */
    public static boolean m136767b() {
        return C6861a.m21337f().isChildrenMode();
    }

    /* renamed from: c */
    public static boolean m136771c() {
        User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
        if (currentUser == null || !currentUser.isContentLanguageDialogShown()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static String m136774e(User user) {
        return m136756a(user, false);
    }

    /* renamed from: f */
    public static boolean m136775f(User user) {
        if (user == null || !user.isSecret()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static UrlModel m136778i(User user) {
        UrlModel j = m136779j(user);
        if (j != null) {
            return j;
        }
        return m136780k(user);
    }

    /* renamed from: q */
    public static boolean m136786q(User user) {
        if (user == null) {
            return false;
        }
        return m136761a(user.getFollowStatus());
    }

    /* renamed from: s */
    public static String m136788s(User user) {
        if (user == null) {
            return "";
        }
        return user.getUid();
    }

    /* renamed from: t */
    public static String m136789t(User user) {
        if (user == null) {
            return "";
        }
        return user.getNickname();
    }

    /* renamed from: u */
    public static String m136790u(User user) {
        if (user == null) {
            return "";
        }
        return user.getSignature();
    }

    /* renamed from: w */
    public static boolean m136792w(User user) {
        if (user == null || (!user.isBlock && !user.isBlocked())) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public static boolean m136755C(User user) {
        if (user == null || !TextUtils.equals("unique_id", user.getNameField())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m136765b(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return "";
        }
        return aweme.getAuthor().getNickname();
    }

    /* renamed from: c */
    public static String m136770c(User user) {
        String str;
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            str = user.getRemarkName();
        } else {
            str = m136773d(user);
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    /* renamed from: g */
    public static int m136776g(User user) {
        if (m136769b(user, TextUtils.equals(user.getUid(), C6861a.m21337f().getCurUserId()))) {
            return 0;
        }
        return user.getTabType();
    }

    /* renamed from: k */
    public static UrlModel m136780k(User user) {
        if (user == null) {
            return null;
        }
        UrlModel avatarLarger = user.getAvatarLarger();
        if (avatarLarger == null) {
            avatarLarger = user.getAvatarMedium();
        }
        if (avatarLarger == null) {
            avatarLarger = user.getAvatarThumb();
        }
        return avatarLarger;
    }

    /* renamed from: l */
    public static String m136781l(User user) {
        if (user == null) {
            return "";
        }
        if (C6399b.m19946v()) {
            return m136777h(user);
        }
        return user.getNickname();
    }

    /* renamed from: m */
    public static boolean m136782m(User user) {
        if (user != null && !TextUtils.isEmpty(user.getCustomVerify())) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m136785p(User user) {
        if (m136783n(user) || user.getVideoCover() == null || user.getVideoCover().getVideo() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public static String m136753A(User user) {
        if (user == null) {
            return "";
        }
        if (!C6399b.m19946v()) {
            return user.getNickname();
        }
        if (TextUtils.isEmpty(user.getUniqueId())) {
            return user.getShortId();
        }
        return user.getUniqueId();
    }

    /* renamed from: d */
    public static String m136773d(User user) {
        if (user == null) {
            return "";
        }
        if (!C6399b.m19946v()) {
            return user.getNickname();
        }
        if (TextUtils.isEmpty(user.getUniqueId())) {
            return user.getShortId();
        }
        return user.getUniqueId();
    }

    /* renamed from: h */
    public static String m136777h(User user) {
        if (user == null) {
            return "";
        }
        if (!TextUtils.isEmpty(user.getUniqueId())) {
            return user.getUniqueId();
        }
        if (user.getShortId() == null) {
            return "";
        }
        return user.getShortId();
    }

    /* renamed from: j */
    public static UrlModel m136779j(User user) {
        if (user == null) {
            return null;
        }
        if (!C6399b.m19946v()) {
            return user.getAvatarLarger();
        }
        UrlModel avatarVideoUri = user.getAvatarVideoUri();
        if (avatarVideoUri == null || !C23477d.m77083b(avatarVideoUri.getUrlList()) || TextUtils.isEmpty((CharSequence) avatarVideoUri.getUrlList().get(0))) {
            return null;
        }
        return avatarVideoUri;
    }

    /* renamed from: n */
    public static boolean m136783n(User user) {
        if (user == null) {
            return false;
        }
        if (C6399b.m19944t()) {
            if (user.getCommerceUserLevel() <= 0 || TextUtils.isEmpty(user.getEnterpriseVerifyReason())) {
                return false;
            }
            return true;
        } else if (user.getCommercePermission() != null) {
            if (user.getCommercePermission().enterprise == 1) {
                return true;
            }
            return false;
        } else if (user.getCommerceUserLevel() <= 0 || TextUtils.isEmpty(user.getEnterpriseVerifyReason())) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: o */
    public static boolean m136784o(User user) {
        if (!m136783n(user)) {
            return false;
        }
        if (C6399b.m19944t()) {
            return true;
        }
        if (user == null || user.getCommercePermission() == null || user.getCommercePermission().headImage != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m136787r(User user) {
        if (user == null) {
            return false;
        }
        if (user == f111742a) {
            return f111743b;
        }
        f111743b = TextUtils.equals(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID(), user.getUid());
        f111742a = user;
        return f111743b;
    }

    /* renamed from: v */
    public static boolean m136791v(User user) {
        if (user == null || C6399b.m19944t()) {
            return false;
        }
        if (m136787r(user)) {
            return user.isHasStory();
        }
        if (!user.isHasStory() || user.getStoryBlockInfo() == null || user.getStoryBlockInfo().isBlocked()) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public static boolean m136794y(User user) {
        if (!C6399b.m19944t() && user != null && user.getGeneralPermission() != null && !TextUtils.equals(user.getUid(), C6861a.m21337f().getCurUserId()) && user.getGeneralPermission().getFollowingFollowerListToast() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public static boolean m136795z(User user) {
        if (user == null || TextUtils.isEmpty(user.getRecommendReasonRelation())) {
            return false;
        }
        return Pattern.compile("<b>").matcher(user.getRecommendReasonRelation()).find();
    }

    /* renamed from: B */
    public static String m136754B(User user) {
        StringBuilder sb = new StringBuilder();
        sb.append(" user: ");
        if (user == null) {
            sb.append(" ");
        } else {
            sb.append("{ ");
            sb.append(" uid: ");
            sb.append(user.getUid());
            sb.append(',');
            sb.append(" following_count: ");
            sb.append(user.getFollowingCount());
            sb.append(',');
            sb.append(" follower_count: ");
            sb.append(user.getFollowerCount());
            sb.append(" }");
        }
        sb.append(" time: ");
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    /* renamed from: x */
    public static boolean m136793x(User user) {
        if (C6399b.m19944t()) {
            return false;
        }
        if (user != null && m136787r(user)) {
            user = C6861a.m21337f().getCurUser();
        }
        if (user != null && user.getrFansGroupInfo() != null && !TextUtils.isEmpty(user.getrFansGroupInfo().getSchema()) && !TextUtils.isEmpty(user.getrFansGroupInfo().getDownloadUrl())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m136768b(User user) {
        boolean z;
        if (user == null) {
            return true;
        }
        String str = "1594805258216454";
        if ((user.getAvatarThumb() == null || C23477d.m77081a((Collection<T>) user.getAvatarThumb().getUrlList())) && ((user.getAvatarMedium() == null || C23477d.m77081a((Collection<T>) user.getAvatarMedium().getUrlList())) && (user.getAvatarLarger() == null || C23477d.m77081a((Collection<T>) user.getAvatarLarger().getUrlList())))) {
            z = true;
        } else {
            z = false;
        }
        if (z || user.getAvatarThumb() == null || C23477d.m77081a((Collection<T>) user.getAvatarThumb().getUrlList()) || !((String) user.getAvatarThumb().getUrlList().get(0)).contains(str)) {
            return z;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m136762a(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        return m136761a(aweme.getAuthor().getFollowStatus());
    }

    /* renamed from: a */
    public static boolean m136763a(String str) {
        return TextUtils.equals(C6861a.m21337f().getCurUserId(), str);
    }

    /* renamed from: a */
    public static String[] m136764a(UrlModel urlModel) {
        if (urlModel == null || C23477d.m77081a((Collection<T>) urlModel.getUrlList())) {
            return null;
        }
        return (String[]) urlModel.getUrlList().toArray(new String[urlModel.getUrlList().size()]);
    }

    /* renamed from: a */
    public static void m136759a(View view, final String str) {
        if (view != null && str != null) {
            C0991u.m4187a(view, (C0939a) new C0939a() {
                /* renamed from: a */
                public final void mo1148a(View view, C0945c cVar) {
                    super.mo1148a(view, cVar);
                    cVar.mo3656b((CharSequence) DmtTextView.class.getName());
                    if (!TextUtils.isEmpty(str)) {
                        view.setContentDescription(str);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static String m136756a(User user, boolean z) {
        String str;
        String str2;
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            str = user.getRemarkName();
        } else {
            str = m136773d(user);
        }
        if (z) {
            str2 = "@";
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m136769b(User user, boolean z) {
        if (user == null || z || user.getFollowStatus() == 1 || user.getFollowStatus() == 2 || !user.isSecret()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m136760a(View view, boolean z) {
        if (view != null) {
            StringBuilder sb = new StringBuilder();
            if (z) {
                sb.append(C6399b.m19921a().getString(R.string.b7q));
            } else {
                sb.append(C6399b.m19921a().getString(R.string.b2o));
            }
            sb.append(C6399b.m19921a().getString(R.string.c7k));
            final String sb2 = sb.toString();
            C0991u.m4187a(view, (C0939a) new C0939a() {
                /* renamed from: a */
                public final void mo1148a(View view, C0945c cVar) {
                    super.mo1148a(view, cVar);
                    cVar.mo3656b((CharSequence) ImageView.class.getName());
                    if (!TextUtils.isEmpty(sb2)) {
                        view.setContentDescription(sb2);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public static boolean m136772c(User user, boolean z) {
        if (user != null && !user.isBlock() && (z || !user.isSecret() || (user.getFollowStatus() != 0 && user.getFollowStatus() != 4))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m136758a(final Context context, ImageView imageView, final User user) {
        if (imageView != null && user != null) {
            C0991u.m4187a((View) imageView, (C0939a) new C0939a() {
                /* renamed from: a */
                public final void mo1148a(View view, C0945c cVar) {
                    super.mo1148a(view, cVar);
                    if (!TextUtils.isEmpty(user.getRemarkName())) {
                        view.setContentDescription(context.getResources().getString(R.string.c6, new Object[]{user.getRemarkName()}));
                    } else if (!TextUtils.isEmpty(user.getNickname())) {
                        view.setContentDescription(context.getResources().getString(R.string.c6, new Object[]{user.getNickname()}));
                    }
                    cVar.mo3656b((CharSequence) DmtTextView.class.getName());
                }
            });
        }
    }

    /* renamed from: b */
    public static void m136766b(Context context, ImageView imageView, User user) {
        if (imageView != null && user != null) {
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                imageView.setContentDescription(context.getResources().getString(R.string.c6, new Object[]{user.getRemarkName()}));
                return;
            }
            if (!TextUtils.isEmpty(user.getNickname())) {
                imageView.setContentDescription(context.getResources().getString(R.string.c6, new Object[]{user.getNickname()}));
            }
        }
    }
}
