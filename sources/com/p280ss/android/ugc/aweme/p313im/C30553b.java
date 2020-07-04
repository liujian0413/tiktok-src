package com.p280ss.android.ugc.aweme.p313im;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.experiment.NotificationTabStyleExperiment;
import com.p280ss.android.ugc.aweme.p1286g.C30187a;
import com.p280ss.android.ugc.aweme.p313im.service.C7091a;
import com.p280ss.android.ugc.aweme.p313im.service.C7093b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.C32025c;
import com.p280ss.android.ugc.aweme.p313im.service.model.C7105b;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p280ss.android.ugc.aweme.utils.C43013ch;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.b */
public final class C30553b extends C30556d {
    /* renamed from: b */
    public static boolean m99786b() {
        return m99787c();
    }

    /* renamed from: c */
    public static boolean m99787c() {
        return m99810g().isXPlanB();
    }

    /* renamed from: d */
    public static boolean m99788d() {
        return C7213d.m22500a().mo18803bo().isNotificationTabNewStyle();
    }

    /* renamed from: a */
    public static boolean m99785a() {
        if (((Integer) SharePrefCache.inst().getCanIm().mo59877d()).intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m99789e() {
        if (C6399b.m19946v()) {
            return false;
        }
        Locale b = C43013ch.m136515b();
        if (TextUtils.equals(b.getLanguage(), Locale.CHINESE.getLanguage()) || TextUtils.equals(b.getLanguage(), Locale.ENGLISH.getLanguage())) {
            return C7213d.m22500a().mo18803bo().showNewRelationFragment();
        }
        return false;
    }

    /* renamed from: f */
    public static C32025c m99790f() {
        C32025c a = C32025c.m104002a();
        a.f83738a = SharePrefCache.inst().getOpenImLink();
        a.f83739b = SharePrefCache.inst().getImUrlTemplate();
        a.f83740c = SharePrefCache.inst().getMultiSelectLimit();
        return a;
    }

    /* renamed from: a */
    public static IMUser m99780a(User user) {
        if (user == null) {
            return null;
        }
        return IMUser.fromUser(user);
    }

    /* renamed from: a */
    public static void m99782a(Application application, IIMService iIMService) {
        if (iIMService != null) {
            C7091a aVar = new C7091a();
            aVar.f19937g = (int) C6399b.m19933i();
            aVar.f19936f = C6399b.m19941q();
            aVar.f19935e = "https://api2.musical.ly/aweme/v1/";
            aVar.f19934d = "https://api2.musical.ly/";
            aVar.f19933c = "https://imapi-16.musical.ly/";
            aVar.f19932b = "wss://frontier.musical.ly/ws/v2";
            aVar.f19938h = C6399b.m19929e();
            aVar.f19931a = C7163a.m22363a();
            iIMService.initialize(application, aVar, new C30557e());
            iIMService.setAbInterface(new C7093b() {
                /* renamed from: c */
                public final boolean mo18355c() {
                    return C30553b.m99789e();
                }

                /* renamed from: k */
                public final boolean mo18363k() {
                    return C30187a.m98819b();
                }

                /* renamed from: a */
                public final int mo18353a() {
                    return C7213d.m22500a().mo18723P();
                }

                /* renamed from: b */
                public final boolean mo18354b() {
                    return C7213d.m22500a().mo18776an();
                }

                /* renamed from: e */
                public final boolean mo18357e() {
                    return C7213d.m22500a().mo18742aE();
                }

                /* renamed from: f */
                public final int mo18358f() {
                    return C7213d.m22500a().mo18758aU();
                }

                /* renamed from: h */
                public final boolean mo18360h() {
                    if (C7213d.m22500a().mo18758aU() == 2) {
                        return true;
                    }
                    return false;
                }

                /* renamed from: i */
                public final int mo18361i() {
                    AbTestModel d = C7213d.m22500a().mo18803bo();
                    if (d != null) {
                        return d.mSingleChatHelloMsg;
                    }
                    return 0;
                }

                /* renamed from: j */
                public final int mo18362j() {
                    AbTestModel d = C7213d.m22500a().mo18803bo();
                    if (d != null) {
                        return d.mEnableReadState;
                    }
                    return 0;
                }

                /* renamed from: d */
                public final boolean mo18356d() {
                    if (!C7213d.m22500a().mo18754aQ() || C6399b.m19944t()) {
                        return false;
                    }
                    return true;
                }

                /* renamed from: g */
                public final boolean mo18359g() {
                    if (!C30561h.m99828a().f80266a || C6399b.m19944t()) {
                        return false;
                    }
                    return true;
                }

                /* renamed from: l */
                public final int mo18364l() {
                    return C6384b.m19835a().mo15287a(NotificationTabStyleExperiment.class, true, "i18n_message_page_style", C6384b.m19835a().mo15295d().i18n_message_page_style, 2);
                }
            });
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|4|5|6|7|8|(3:9|10|(1:12)(1:13))|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
    /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|(1:12)(1:13)|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0072 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x007d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0087 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0091 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00c1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[Catch:{ NullValueException -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057 A[Catch:{ NullValueException -> 0x0062 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.ugc.aweme.p313im.service.model.C32025c m99781a(android.content.SharedPreferences.Editor r3, com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r4) {
        /*
            com.ss.android.ugc.aweme.im.service.model.c r0 = new com.ss.android.ugc.aweme.im.service.model.c
            r0.<init>()
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()     // Catch:{ NullValueException -> 0x0014 }
            com.ss.android.ugc.aweme.app.bl r1 = r1.getOpenImLinkItem()     // Catch:{ NullValueException -> 0x0014 }
            java.lang.Integer r2 = r4.getOpenImLink()     // Catch:{ NullValueException -> 0x0014 }
            r1.mo59874b(r3, r2)     // Catch:{ NullValueException -> 0x0014 }
        L_0x0014:
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()     // Catch:{ NullValueException -> 0x0023 }
            com.ss.android.ugc.aweme.app.bl r1 = r1.getImUrlTemplateItem()     // Catch:{ NullValueException -> 0x0023 }
            java.lang.String r2 = r4.getImUrlTemplate()     // Catch:{ NullValueException -> 0x0023 }
            r1.mo59874b(r3, r2)     // Catch:{ NullValueException -> 0x0023 }
        L_0x0023:
            java.lang.Integer r1 = r4.getOpenImLink()     // Catch:{ NullValueException -> 0x002d }
            int r1 = r1.intValue()     // Catch:{ NullValueException -> 0x002d }
            r0.f83738a = r1     // Catch:{ NullValueException -> 0x002d }
        L_0x002d:
            java.lang.String r1 = r4.getImUrlTemplate()     // Catch:{ NullValueException -> 0x0033 }
            r0.f83739b = r1     // Catch:{ NullValueException -> 0x0033 }
        L_0x0033:
            java.lang.Integer r1 = r4.getImContactsMultiSelectLimit()     // Catch:{ NullValueException -> 0x0062 }
            int r1 = r1.intValue()     // Catch:{ NullValueException -> 0x0062 }
            if (r1 <= 0) goto L_0x0057
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()     // Catch:{ NullValueException -> 0x0062 }
            com.ss.android.ugc.aweme.app.bl r1 = r1.getMultiSelectLimitItem()     // Catch:{ NullValueException -> 0x0062 }
            java.lang.Integer r2 = r4.getImContactsMultiSelectLimit()     // Catch:{ NullValueException -> 0x0062 }
            r1.mo59874b(r3, r2)     // Catch:{ NullValueException -> 0x0062 }
            java.lang.Integer r3 = r4.getImContactsMultiSelectLimit()     // Catch:{ NullValueException -> 0x0062 }
            int r3 = r3.intValue()     // Catch:{ NullValueException -> 0x0062 }
            r0.f83740c = r3     // Catch:{ NullValueException -> 0x0062 }
            goto L_0x006c
        L_0x0057:
            com.ss.android.ugc.aweme.app.SharePrefCache r3 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()     // Catch:{ NullValueException -> 0x0062 }
            int r3 = r3.getMultiSelectLimit()     // Catch:{ NullValueException -> 0x0062 }
            r0.f83740c = r3     // Catch:{ NullValueException -> 0x0062 }
            goto L_0x006c
        L_0x0062:
            com.ss.android.ugc.aweme.app.SharePrefCache r3 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()
            int r3 = r3.getMultiSelectLimit()
            r0.f83740c = r3
        L_0x006c:
            com.ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings r3 = r4.getFlipchatSettings()     // Catch:{ NullValueException -> 0x0072 }
            r0.f83741d = r3     // Catch:{ NullValueException -> 0x0072 }
        L_0x0072:
            com.ss.android.ugc.aweme.im.service.model.d r3 = new com.ss.android.ugc.aweme.im.service.model.d     // Catch:{ NullValueException -> 0x007d }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanSetting r1 = r4.getImXDisplayStyleConfig()     // Catch:{ NullValueException -> 0x007d }
            r3.<init>(r1)     // Catch:{ NullValueException -> 0x007d }
            r0.f83742e = r3     // Catch:{ NullValueException -> 0x007d }
        L_0x007d:
            java.lang.Integer r3 = r4.getImXUnreadCountStrategy()     // Catch:{ NullValueException -> 0x0087 }
            int r3 = r3.intValue()     // Catch:{ NullValueException -> 0x0087 }
            r0.f83743f = r3     // Catch:{ NullValueException -> 0x0087 }
        L_0x0087:
            java.lang.Integer r3 = r4.getImXUseEncryptedImage()     // Catch:{ NullValueException -> 0x0091 }
            int r3 = r3.intValue()     // Catch:{ NullValueException -> 0x0091 }
            r0.f83744g = r3     // Catch:{ NullValueException -> 0x0091 }
        L_0x0091:
            com.ss.android.ugc.aweme.global.config.settings.pojo.ImCreateChatBubble r3 = r4.getImCreateChatBubble()     // Catch:{ NullValueException -> 0x00ad }
            java.lang.Integer r3 = r3.getShowFlag()     // Catch:{ NullValueException -> 0x00ad }
            int r3 = r3.intValue()     // Catch:{ NullValueException -> 0x00ad }
            r0.f83746i = r3     // Catch:{ NullValueException -> 0x00ad }
            com.ss.android.ugc.aweme.global.config.settings.pojo.ImCreateChatBubble r3 = r4.getImCreateChatBubble()     // Catch:{ NullValueException -> 0x00ad }
            java.lang.Integer r3 = r3.getTimeInterval()     // Catch:{ NullValueException -> 0x00ad }
            int r3 = r3.intValue()     // Catch:{ NullValueException -> 0x00ad }
            r0.f83747j = r3     // Catch:{ NullValueException -> 0x00ad }
        L_0x00ad:
            java.lang.Integer r3 = r4.getMaxMessageCountForRecommend()     // Catch:{ NullValueException -> 0x00b7 }
            int r3 = r3.intValue()     // Catch:{ NullValueException -> 0x00b7 }
            r0.f83748k = r3     // Catch:{ NullValueException -> 0x00b7 }
        L_0x00b7:
            java.lang.Boolean r3 = r4.getDisableImMessageFullFeedSlide()     // Catch:{ NullValueException -> 0x00c1 }
            boolean r3 = r3.booleanValue()     // Catch:{ NullValueException -> 0x00c1 }
            r0.f83749l = r3     // Catch:{ NullValueException -> 0x00c1 }
        L_0x00c1:
            java.lang.Integer r3 = r4.getEnabledImAsupporterMsgTypes()     // Catch:{ NullValueException -> 0x00cb }
            int r3 = r3.intValue()     // Catch:{ NullValueException -> 0x00cb }
            r0.f83750m = r3     // Catch:{ NullValueException -> 0x00cb }
        L_0x00cb:
            java.lang.Integer r3 = r4.getEnabledImAsupporterFuncs()     // Catch:{ NullValueException -> 0x00d5 }
            int r3 = r3.intValue()     // Catch:{ NullValueException -> 0x00d5 }
            r0.f83751n = r3     // Catch:{ NullValueException -> 0x00d5 }
        L_0x00d5:
            java.util.List r3 = r4.getImImageDomains()
            r0.f83745h = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.C30553b.m99781a(android.content.SharedPreferences$Editor, com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy):com.ss.android.ugc.aweme.im.service.model.c");
    }

    /* renamed from: a */
    public static void m99783a(Context context, RemoteImageView remoteImageView, int i) {
        m99810g().wrapperIMShareIcon(context, remoteImageView, i);
    }

    /* renamed from: a */
    public static void m99784a(Context context, Comment comment, UrlModel urlModel, String str, int i, String str2, String str3) {
        C7105b bVar = new C7105b();
        bVar.f19959a = urlModel;
        bVar.f19966h = m99780a(comment.getUser());
        bVar.f19961c = str;
        bVar.f19960b = comment.getCid();
        bVar.f19964f = i;
        bVar.f19962d = str2;
        bVar.f19963e = str3;
        String text = comment.getText();
        if (comment.getEmoji() != null) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(context.getString(R.string.azw));
            sb.append("]");
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(text)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(text);
                sb3.append(sb2);
                sb2 = sb3.toString();
            }
            text = sb2;
        }
        bVar.f19965g = text;
        m99810g().commentReply(context, bVar);
    }
}
