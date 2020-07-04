package com.p280ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.service.C9515c;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.C21780t;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22763aa.C22765b;
import com.p280ss.android.ugc.aweme.app.C22880at.C22881a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.p1128im.C24758a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.discover.p1185ui.DiscoverActivity;
import com.p280ss.android.ugc.aweme.experiment.FAQExperiment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.PushLandingFollowExperiment;
import com.p280ss.android.ugc.aweme.feedback.FeedbackActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.p1285ui.ContactsActivity;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.live.C32430a;
import com.p280ss.android.ugc.aweme.live.LiveFeedActivity;
import com.p280ss.android.ugc.aweme.main.C32904bi;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.experiment.C33003b;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.mix.MixDetailActivity;
import com.p280ss.android.ugc.aweme.mix.MixDetailActivity.C33478a;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.music.p1410ui.MusicDetailActivity;
import com.p280ss.android.ugc.aweme.p1070bb.C23524a;
import com.p280ss.android.ugc.aweme.poi.model.C35109e;
import com.p280ss.android.ugc.aweme.poi.p335ui.PoiDetailActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileEditActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1585o.C40202a;
import com.p280ss.android.ugc.aweme.story.live.C41990e;
import com.p280ss.android.ugc.aweme.utils.ActivityStack;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43077dz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.a */
public class C22689a {

    /* renamed from: a */
    public static final String f60407a = f60407a;

    /* renamed from: b */
    public static final C22709f f60408b = new C22709f(null);

    /* renamed from: com.ss.android.ugc.aweme.app.a$a */
    public static final class C22690a extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return "friend_recommend";
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C7573i.m23585a((Object) sb.toString(), (Object) "user/find_friends");
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            String queryParameter = uri.getQueryParameter("inviteType");
            String queryParameter2 = uri.getQueryParameter("puid");
            String a = C22709f.m75045a(queryParameter2, uri);
            IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
            Context context = activity;
            Integer valueOf = Integer.valueOf(queryParameter);
            C7573i.m23582a((Object) valueOf, "Integer.valueOf(inviteType)");
            Intent addFriendsActivityIntent = iBridgeService.getAddFriendsActivityIntent(context, 0, valueOf.intValue(), "", "push");
            if (C6399b.m19944t()) {
                addFriendsActivityIntent.putExtra("bundle_puid", queryParameter2);
                addFriendsActivityIntent.putExtra("bundle_sec_puid", a);
            } else {
                addFriendsActivityIntent.putExtra("bundle_recommend_user_type", queryParameter2);
            }
            return addFriendsActivityIntent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$aa */
    public static final class C22691aa extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return "poi_page";
        }

        /* renamed from: a */
        private static boolean m74984a(String str) {
            CharSequence charSequence = str;
            if (TextUtils.equals("/", charSequence) || TextUtils.equals("/detail", charSequence)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) "poi");
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            if (C6399b.m19944t()) {
                String queryParameter = uri.getQueryParameter("id");
                Intent intent = new Intent(activity, PoiDetailActivity.class);
                intent.putExtra("poi_bundle", new C35109e().mo89342c(queryParameter).mo89331a());
                return intent;
            } else if (!m74984a(str2)) {
                return SmartRouter.buildRoute((Context) activity, uri.toString()).buildIntent();
            } else {
                String queryParameter2 = uri.getQueryParameter("id");
                String queryParameter3 = uri.getQueryParameter("attached_activity_id");
                String queryParameter4 = uri.getQueryParameter("enter_from");
                String queryParameter5 = uri.getQueryParameter("to_user_id");
                String queryParameter6 = uri.getQueryParameter("from_user_id");
                String queryParameter7 = uri.getQueryParameter("coupon_id");
                String queryParameter8 = uri.getQueryParameter("enter_method");
                if (queryParameter8 == null) {
                    queryParameter8 = "";
                }
                Intent intent2 = new Intent(activity, PoiDetailActivity.class);
                String str4 = "poi_bundle";
                C35109e q = new C35109e().mo89342c(queryParameter2).mo89350k("").mo89344e(queryParameter3).mo89345f(queryParameter7).mo89337a(queryParameter5).mo89340b(queryParameter6).mo89356q(queryParameter8);
                if (z) {
                    str3 = "push";
                } else if (!TextUtils.isEmpty(queryParameter4)) {
                    str3 = queryParameter4;
                }
                intent2.putExtra(str4, q.mo89352m(str3).mo89331a());
                return intent2;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ab */
    public static final class C22692ab extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return "others_homepage";
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) "profile");
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            C22887b.f60603b.mo59852a("personal_homepage", uri, z);
            Intent intent = new Intent(activity, UserProfileActivity.class);
            intent.putExtra("uid", uri.getQueryParameter("id"));
            intent.putExtra("sec_user_id", C22709f.m75045a(uri.getQueryParameter("id"), uri));
            intent.putExtra("poi_id", uri.getQueryParameter("poi_id"));
            intent.putExtra("enter_from", uri.getQueryParameter("enter_from"));
            if (!C6399b.m19944t()) {
                String stringExtra = activity.getIntent().getStringExtra("token_request_id");
                if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(str3)) {
                    ((C33276r) new C33276r().mo85310b(str3).mo85048a("click_button")).mo85322o(uri.getLastPathSegment()).mo85323p(stringExtra).mo85252e();
                }
            }
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ac */
    public static final class C22693ac extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return "profile_edit";
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) "profileEdit");
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            return new Intent(activity, ProfileEditActivity.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ad */
    public static final class C22694ad extends C22708e {
        /* renamed from: a */
        public final String mo59799a() {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).recordActivityService().getVideoPublishActivityClass().getName();
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) "publishVideo");
        }

        /* renamed from: a */
        public final void mo59800a(Activity activity, Uri uri, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C40202a.m128508c(activity, uri);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ae */
    public static final class C22695ae extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return TextUtils.equals(str, "diamond2020");
        }

        /* renamed from: a */
        public final void mo59800a(Activity activity, Uri uri, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C21780t.m72807a().mo57894a(C6399b.m19921a(), uri);
            if (!C21780t.f58291a) {
                C7195s.m22438a().mo18679a(activity, "aweme://main");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$af */
    public static final class C22696af extends C22708e {
        /* renamed from: a */
        public final String mo59799a() {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).recordActivityService().getVideoRecordActivityClass().getName();
        }

        /* renamed from: a */
        private static void m74999a(Activity activity) {
            if (activity.getIntent().getBooleanExtra("from_tile_service", false)) {
                C22995i a = C22995i.m75637a();
                C7573i.m23582a((Object) a, "AppLifeCircleCacheManager.getInstance()");
                C6907h.m21524a("launch_from_notificationbar", (Map) C22984d.m75611a().mo59973a("launch_method", "click_shoot_notificationbar").mo59970a("is_cold_launch", a.f60774b ? 1 : 0).f60753a);
            }
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            if (!C7573i.m23585a((Object) str, (Object) "openRecord")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                if (!C7634n.m23721b(sb.toString(), "studio/task/create", false)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(str2);
                    if (!C7634n.m23721b(sb2.toString(), "studio/create", false)) {
                        return false;
                    }
                }
            }
            return true;
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            m74999a(activity);
            if (!z) {
                return C40202a.f104498a.mo100000a(activity, uri);
            }
            Intent b = C40202a.f104498a.mo100001b(activity, uri);
            if (b != null) {
                b.putExtra("shoot_way", "push");
                b.putExtra("enter_from", "push");
            }
            return b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ag */
    public static final class C22697ag extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return "prop_detail";
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) "stickers");
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00ac  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent mo59796a(android.app.Activity r4, android.net.Uri r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9) {
            /*
                r3 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.C7573i.m23587b(r4, r0)
                java.lang.String r0 = "uri"
                kotlin.jvm.internal.C7573i.m23587b(r5, r0)
                java.lang.String r0 = "host"
                kotlin.jvm.internal.C7573i.m23587b(r6, r0)
                java.lang.String r6 = "path"
                kotlin.jvm.internal.C7573i.m23587b(r7, r6)
                java.lang.String r6 = "fromTokenType"
                kotlin.jvm.internal.C7573i.m23587b(r8, r6)
                boolean r6 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                r0 = 0
                if (r6 == 0) goto L_0x00cd
                r6 = r7
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                r8 = 1
                r1 = 0
                if (r6 != 0) goto L_0x0036
                java.lang.String r6 = "/detail/"
                r2 = 2
                boolean r6 = kotlin.text.C7634n.m23721b(r7, r6, false)
                if (r6 == 0) goto L_0x0036
                r6 = 1
                goto L_0x0037
            L_0x0036:
                r6 = 0
            L_0x0037:
                if (r6 == 0) goto L_0x00cc
                java.lang.String r6 = r5.getLastPathSegment()
                r7 = r6
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                boolean r2 = android.text.TextUtils.isEmpty(r7)
                if (r2 != 0) goto L_0x00b4
                if (r6 != 0) goto L_0x004b
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x004b:
                java.lang.String r6 = ","
                kotlin.text.Regex r0 = new kotlin.text.Regex
                r0.<init>(r6)
                java.util.List r6 = r0.split(r7, r1)
                boolean r7 = r6.isEmpty()
                if (r7 != 0) goto L_0x0089
                int r7 = r6.size()
                java.util.ListIterator r7 = r6.listIterator(r7)
            L_0x0064:
                boolean r0 = r7.hasPrevious()
                if (r0 == 0) goto L_0x0089
                java.lang.Object r0 = r7.previous()
                java.lang.String r0 = (java.lang.String) r0
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 != 0) goto L_0x007a
                r0 = 1
                goto L_0x007b
            L_0x007a:
                r0 = 0
            L_0x007b:
                if (r0 != 0) goto L_0x0064
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                int r7 = r7.nextIndex()
                int r7 = r7 + r8
                java.util.List r6 = kotlin.collections.C7525m.m23505c(r6, r7)
                goto L_0x008d
            L_0x0089:
                java.util.List r6 = kotlin.collections.C7525m.m23461a()
            L_0x008d:
                java.util.Collection r6 = (java.util.Collection) r6
                java.lang.String[] r7 = new java.lang.String[r1]
                java.lang.Object[] r6 = r6.toArray(r7)
                if (r6 == 0) goto L_0x00ac
                java.lang.String[] r6 = (java.lang.String[]) r6
                int r7 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
                java.lang.String[] r6 = (java.lang.String[]) r6
                java.util.List r6 = java.util.Arrays.asList(r6)
                java.util.Collection r6 = (java.util.Collection) r6
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
                goto L_0x00b4
            L_0x00ac:
                kotlin.TypeCastException r4 = new kotlin.TypeCastException
                java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
                r4.<init>(r5)
                throw r4
            L_0x00b4:
                android.content.Intent r6 = new android.content.Intent
                android.content.Context r4 = (android.content.Context) r4
                java.lang.Class<com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity> r7 = com.p280ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity.class
                r6.<init>(r4, r7)
                java.lang.String r4 = "extra_stickers"
                java.io.Serializable r0 = (java.io.Serializable) r0
                r6.putExtra(r4, r0)
                com.ss.android.ugc.aweme.app.b$a r4 = com.p280ss.android.ugc.aweme.app.C22887b.f60603b
                java.lang.String r7 = "prop_detail"
                r4.mo59852a(r7, r5, r9)
                return r6
            L_0x00cc:
                return r0
            L_0x00cd:
                android.content.Intent r6 = new android.content.Intent
                android.content.Context r4 = (android.content.Context) r4
                java.lang.Class<com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity> r7 = com.p280ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity.class
                r6.<init>(r4, r7)
                java.lang.String r4 = "id"
                java.lang.String r4 = r5.getQueryParameter(r4)
                r7 = r4
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 == 0) goto L_0x00e9
                java.lang.String r4 = r5.getLastPathSegment()
            L_0x00e9:
                java.lang.String r7 = "detail"
                boolean r7 = kotlin.jvm.internal.C7573i.m23585a(r7, r4)
                if (r7 != 0) goto L_0x00f9
                java.lang.String r7 = "0"
                boolean r7 = kotlin.jvm.internal.C7573i.m23585a(r7, r4)
                if (r7 == 0) goto L_0x00fa
            L_0x00f9:
                r4 = r0
            L_0x00fa:
                if (r4 == 0) goto L_0x0117
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                r7.add(r4)
                java.lang.String r4 = "extra_stickers"
                java.io.Serializable r7 = (java.io.Serializable) r7
                r6.putExtra(r4, r7)
                java.lang.String r4 = "from_token"
                r6.putExtra(r4, r8)
                com.ss.android.ugc.aweme.app.b$a r4 = com.p280ss.android.ugc.aweme.app.C22887b.f60603b
                java.lang.String r7 = "prop_page"
                r4.mo59852a(r7, r5, r9)
            L_0x0117:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.app.C22689a.C22697ag.mo59796a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ah */
    public static final class C22698ah extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return "others_homepage";
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C7634n.m23721b(sb.toString(), "user/profile/", false);
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            String queryParameter = uri.getQueryParameter("gd_label");
            String queryParameter2 = uri.getQueryParameter("multi_account_push_uid");
            String lastPathSegment = uri.getLastPathSegment();
            String a = C22709f.m75045a(lastPathSegment, uri);
            CharSequence charSequence = queryParameter;
            if (TextUtils.equals(charSequence, "click_push_fr")) {
                C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "push").mo59973a("enter_method", "click_push").mo59973a("to_user_id", lastPathSegment).f60753a);
            }
            if (TextUtils.equals(charSequence, "user_recommend")) {
                C6907h.m21524a("follow_card", (Map) C22984d.m75611a().mo59973a("enter_from", "follow_card_push").mo59973a("event_type", "enter_profile").mo59973a("rec_uid", lastPathSegment).f60753a);
                C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "follow_card_push").mo59973a("to_user_id", lastPathSegment).f60753a);
            }
            CharSequence charSequence2 = lastPathSegment;
            IAccountUserService a2 = C21115b.m71197a();
            C7573i.m23582a((Object) a2, "AccountUserProxyService.get()");
            if (TextUtils.equals(charSequence2, a2.getCurUserId())) {
                C22887b.f60603b.mo59852a("personal_homepage", uri, z);
            } else {
                C22887b.f60603b.mo59852a("others_homepage", uri, z);
            }
            Intent intent = new Intent(activity, UserProfileActivity.class);
            String queryParameter3 = uri.getQueryParameter("from");
            intent.putExtra("uid", lastPathSegment);
            intent.putExtra("sec_user_id", a);
            intent.putExtra("type", uri.getQueryParameter("type"));
            intent.putExtra("source_aid", uri.getQueryParameter("source_aid"));
            intent.putExtra("from_micro_app", queryParameter3);
            if (!C6399b.m19944t()) {
                if (TextUtils.equals(charSequence, "user_recommend")) {
                    intent.putExtra("enter_from", "follow_card_push");
                } else {
                    intent.putExtra("enter_from", uri.getQueryParameter("enter_from"));
                }
                if (TextUtils.equals(uri.getQueryParameter("profile_type"), "1")) {
                    intent.putExtra("profile_enterprise_type", 1);
                }
                String stringExtra = activity.getIntent().getStringExtra("token_request_id");
                if (TextUtils.isEmpty(stringExtra)) {
                    IAccountUserService a3 = C21115b.m71197a();
                    C7573i.m23582a((Object) a3, "AccountUserProxyService.get()");
                    if (a3.isLogin() || !C7573i.m23585a((Object) "click_push_follow_approve", (Object) queryParameter)) {
                        return intent;
                    }
                    return C22881a.m75349a(activity, intent, queryParameter2);
                } else if (!TextUtils.isEmpty(str3)) {
                    ((C33276r) new C33276r().mo85310b(str3).mo85048a("click_button")).mo85322o(uri.getLastPathSegment()).mo85323p(stringExtra).mo85252e();
                }
            }
            IAccountUserService a4 = C21115b.m71197a();
            C7573i.m23582a((Object) a4, "AccountUserProxyService.get()");
            if (a4.isLogin() || !C7573i.m23585a((Object) "click_push_follow_approve", (Object) queryParameter)) {
                return intent;
            }
            return C22881a.m75349a(activity, intent, queryParameter2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ai */
    public static final class C22699ai extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return "others_homepage";
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            if (C7573i.m23585a((Object) sb.toString(), (Object) "user/profile") || (C6399b.m19944t() && C7573i.m23585a((Object) str, (Object) "profile"))) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            String queryParameter = uri.getQueryParameter("id");
            if (queryParameter == null) {
                queryParameter = uri.getQueryParameter("uid");
            }
            String queryParameter2 = uri.getQueryParameter("unique_id");
            String a = C22709f.m75045a(queryParameter, uri);
            Intent intent = new Intent(activity, UserProfileActivity.class);
            intent.putExtra("uid", queryParameter);
            intent.putExtra("sec_user_id", a);
            intent.putExtra("unique_id", queryParameter2);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$aj */
    public static final class C22700aj extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) "verify");
        }

        /* renamed from: a */
        public final void mo59800a(Activity activity, Uri uri, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C42961az.m136380a(new C23524a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ak */
    public static final class C22701ak extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return C22704b.f60415d;
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C7573i.m23585a((Object) sb.toString(), (Object) "user/video");
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            Intent intent = new Intent(activity, DetailActivity.class);
            intent.putExtra("enter_from", "push");
            intent.putExtra("refer", "push");
            intent.putExtra("id", uri.getQueryParameter("id"));
            intent.putExtra("cid", uri.getQueryParameter("commentId"));
            C22887b.f60603b.mo59852a(C22704b.f60415d, uri, z);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$al */
    public static final class C22702al extends C22708e {

        /* renamed from: a */
        private final int f60409a = 3;

        /* renamed from: b */
        private final long f60410b = -1;

        /* renamed from: c */
        private boolean f60411c;

        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return "live";
        }

        /* renamed from: b */
        private static void m75019b(HashMap<String, String> hashMap) {
            String str = (String) hashMap.get("gd_label");
            Map hashMap2 = new HashMap();
            hashMap2.put("enter_from_merge", "inner_ad");
            hashMap2.put("_param_live_platform", "live");
            if (str != null) {
                hashMap2.put("gd_label", str);
            }
            C6907h.m21524a("livesdk_enter_live_merge", hashMap2);
        }

        /* renamed from: a */
        private static void m75017a(HashMap<String, String> hashMap) {
            if (C9469i.m27992d() != null) {
                C9515c d = C9469i.m27992d();
                if (d == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) d, "TTLiveSDK.getLiveService()!!");
                if (d.mo22024j() != null) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("intercept", "new_style");
                    String str = (String) hashMap.get("gd_label");
                    if (str != null) {
                        hashMap2.put("gd_label", str);
                    }
                    String str2 = (String) hashMap.get("enter_from_merge");
                    if (str2 != null) {
                        hashMap2.put("enter_from_merge", str2);
                    }
                    C9515c d2 = C9469i.m27992d();
                    if (d2 == null) {
                        C7573i.m23580a();
                    }
                    C7573i.m23582a((Object) d2, "TTLiveSDK.getLiveService()!!");
                    d2.mo22024j().mo11445a(hashMap2);
                }
            }
        }

        /* renamed from: a */
        private final boolean m75018a(boolean z) {
            int i;
            if (C32430a.m105068e() == null) {
                return false;
            }
            if (C9469i.m27993e() != null && C9469i.m27993e().mo14577q() != null) {
                String str = null;
                Map a = C9469i.m27993e().mo14577q().mo23191a(this.f60410b);
                if (a == null) {
                    return false;
                }
                if (a.get("feed_url") instanceof String) {
                    Object obj = a.get("feed_url");
                    if (obj != null) {
                        str = (String) obj;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                if (a.get("feed_style") instanceof Integer) {
                    Object obj2 = a.get("feed_style");
                    if (obj2 != null) {
                        i = ((Integer) obj2).intValue();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                    }
                } else {
                    i = 0;
                }
                if (!C6319n.m19593a(str) && i == this.f60409a && C9469i.m27992d() != null) {
                    C9515c d = C9469i.m27992d();
                    if (d == null) {
                        C7573i.m23580a();
                    }
                    C7573i.m23582a((Object) d, "TTLiveSDK.getLiveService()!!");
                    if (d.mo22024j() == null) {
                        return false;
                    }
                    return true;
                }
                return false;
            } else if (this.f60411c) {
                return false;
            } else {
                this.f60411c = true;
                return true;
            }
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            if (C7573i.m23585a((Object) str, (Object) "sign") || C7573i.m23585a((Object) str, (Object) "webcast_room") || C7573i.m23585a((Object) str, (Object) "webcast_profile") || C7573i.m23585a((Object) str, (Object) "webcast_webview") || C7573i.m23585a((Object) str, (Object) "webcast_feed")) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo59800a(Activity activity, Uri uri, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            if (C7573i.m23585a((Object) uri.getHost(), (Object) "webcast_feed")) {
                HashMap hashMap = new HashMap();
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null) {
                    for (String str : queryParameterNames) {
                        hashMap.put(str, uri.getQueryParameter(str));
                    }
                }
                try {
                    if (m75018a(hashMap.containsKey("gd_label"))) {
                        m75019b(hashMap);
                        m75017a(hashMap);
                        return;
                    }
                } catch (Exception unused) {
                }
                LiveFeedActivity.m105014a(activity, hashMap);
                return;
            }
            try {
                Uri build = Uri.parse(uri.toString()).buildUpon().appendQueryParameter("is_from_push", String.valueOf(z)).build();
                C7573i.m23582a((Object) build, "Uri.parse(uri.toString()…ation.toString()).build()");
                uri = build;
            } catch (Throwable th) {
                C2077a.m9160a(th);
            }
            try {
                C9515c e = C32430a.m105068e();
                if (e != null) {
                    e.mo22014a((Context) activity, uri);
                }
            } catch (Throwable th2) {
                C2077a.m9160a(th2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$am */
    public static final class C22703am extends C22708e {
        /* renamed from: b */
        private static boolean m75023b(Uri uri) {
            String str;
            if (uri != null) {
                str = uri.getQueryParameter("url");
            } else {
                str = null;
            }
            if (str != null) {
                String queryParameter = uri.getQueryParameter("url");
                if (queryParameter == null) {
                    C7573i.m23580a();
                }
                if (C7634n.m23776c((CharSequence) queryParameter, (CharSequence) "referral", false)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) C22912d.f60641a);
        }

        /* renamed from: a */
        public final void mo59800a(Activity activity, Uri uri, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            if (!((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).tryOpenPolarisPage(activity, uri.toString()) && !TextUtils.isEmpty(uri.getQueryParameter("rn_schema"))) {
                String uri2 = uri.toString();
                C7573i.m23582a((Object) uri2, "uri.toString()");
                String uri3 = C33786f.m108941a(C7634n.m23711a(uri2, C22909c.f60640d.mo59883b(), "aweme", false)).mo86194a().toString();
                C7573i.m23582a((Object) uri3, "RnSchemeHelper.parseRnSc…mpUrl).build().toString()");
                C7195s.m22438a().mo18682a(uri3);
            }
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            if (((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).judgeIsPolarisUrl(uri.toString()) || !TextUtils.isEmpty(uri.getQueryParameter("rn_schema"))) {
                return null;
            }
            Intent a = C22912d.f60645e.mo59886a((Context) activity, uri, !z);
            if (z) {
                if (!m75023b(uri) && a != null) {
                    a.putExtra("hide_more", false);
                }
                if (a != null) {
                    a.putExtra("enter_from", "notification");
                }
            }
            C22887b.f60603b.mo59852a("h5", uri, z);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$b */
    public static final class C22704b extends C22708e {

        /* renamed from: a */
        public static final String f60412a = f60412a;

        /* renamed from: b */
        public static final String f60413b = f60413b;

        /* renamed from: c */
        public static final String f60414c = f60414c;

        /* renamed from: d */
        public static final String f60415d = f60415d;

        /* renamed from: e */
        public static final String f60416e = f60416e;

        /* renamed from: f */
        public static final C22705a f60417f = new C22705a(null);

        /* renamed from: com.ss.android.ugc.aweme.app.a$b$a */
        public static final class C22705a {
            private C22705a() {
            }

            public /* synthetic */ C22705a(C7571f fVar) {
                this();
            }
        }

        /* renamed from: a */
        private static Intent m75027a(Activity activity) {
            C7573i.m23587b(activity, "activity");
            Intent intent = new Intent(activity, MainActivity.class);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            intent.putExtra("tab", 1);
            return intent;
        }

        /* renamed from: a */
        private static Intent m75028a(Activity activity, Uri uri) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            Intent intent = new Intent(activity, DetailActivity.class);
            intent.putExtra("from_adsapp_activity", true);
            intent.putExtra("from_uid", uri.getQueryParameter("from_uid"));
            return intent;
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C7573i.m23585a((Object) sb.toString(), (Object) "aweme/push_detail");
        }

        /* renamed from: a */
        private static void m75029a(Intent intent, Uri uri, String str) {
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "fromTokenType");
            if (intent != null) {
                String queryParameter = uri.getQueryParameter(f60416e);
                if (!TextUtils.isEmpty(queryParameter)) {
                    intent.putExtra("ids", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("from");
                CharSequence charSequence = queryParameter2;
                if (!TextUtils.isEmpty(charSequence)) {
                    intent.putExtra("from_micro_app", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("label");
                if (TextUtils.isEmpty(queryParameter3)) {
                    queryParameter3 = "web";
                }
                if (TextUtils.isEmpty(str)) {
                    str = queryParameter3;
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    str = "mp_page";
                }
                intent.putExtra("refer", str);
                intent.putExtra("gd_label", uri.getQueryParameter("gd_label"));
                String queryParameter4 = uri.getQueryParameter("push_params");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    intent.putExtra("push_params", queryParameter4);
                }
            }
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            Intent intent;
            String str4;
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            JSONObject jSONObject = new JSONObject();
            C23018p a = C23018p.m75672a();
            C7573i.m23582a((Object) a, "AwemeRuntime.inst()");
            if (a.mo59990c()) {
                if (TextUtils.equals(uri.getQueryParameter(f60412a), f60414c)) {
                    intent = m75027a(activity);
                } else {
                    intent = m75028a(activity, uri);
                }
            } else if (TextUtils.equals(uri.getQueryParameter(f60413b), f60414c)) {
                intent = m75027a(activity);
            } else {
                intent = m75028a(activity, uri);
            }
            m75029a(intent, uri, str3);
            String str5 = "is_cold_launch";
            try {
                C23018p a2 = C23018p.m75672a();
                C7573i.m23582a((Object) a2, "AwemeRuntime.inst()");
                jSONObject.put(str5, a2.mo59990c() ^ true ? 1 : 0);
                String str6 = "landing_page";
                C23018p a3 = C23018p.m75672a();
                C7573i.m23582a((Object) a3, "AwemeRuntime.inst()");
                if (a3.mo59990c()) {
                    str4 = f60412a;
                } else {
                    str4 = f60413b;
                }
                jSONObject.put(str6, uri.getQueryParameter(str4));
                String str7 = "rule_id";
                String queryParameter = uri.getQueryParameter("push_id");
                if (queryParameter == null) {
                    queryParameter = "";
                }
                jSONObject.put(str7, queryParameter);
                String str8 = "group_id";
                String queryParameter2 = uri.getQueryParameter(f60416e);
                if (queryParameter2 == null) {
                    queryParameter2 = "";
                }
                jSONObject.put(str8, queryParameter2);
                Activity[] activityStack = ActivityStack.getActivityStack();
                if (activityStack == null || activityStack.length <= 1) {
                    jSONObject.put("last_page_path", "");
                } else {
                    jSONObject.put("last_page_path", activityStack[activityStack.length - 1].getClass().getSimpleName());
                }
                String str9 = "push_label";
                String queryParameter3 = uri.getQueryParameter("gd_label");
                if (queryParameter3 == null) {
                    queryParameter3 = "";
                }
                jSONObject.put(str9, queryParameter3);
                C6907h.m21525a("hot_search_video_push", jSONObject);
            } catch (Exception unused) {
            }
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$c */
    public static final class C22706c extends C22708e {
        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            return null;
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            if (C7573i.m23585a((Object) str, (Object) "mobile") || C7573i.m23585a((Object) str, (Object) "bind_phone")) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo59800a(Activity activity, Uri uri, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C6861a.m21335d().bindMobile(activity, "", null, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$d */
    public static final class C22707d extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return "challenge_detail";
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) "challenge");
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent mo59796a(android.app.Activity r9, android.net.Uri r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14) {
            /*
                r8 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.C7573i.m23587b(r9, r0)
                java.lang.String r0 = "uri"
                kotlin.jvm.internal.C7573i.m23587b(r10, r0)
                java.lang.String r0 = "host"
                kotlin.jvm.internal.C7573i.m23587b(r11, r0)
                java.lang.String r11 = "path"
                kotlin.jvm.internal.C7573i.m23587b(r12, r11)
                java.lang.String r11 = "fromTokenType"
                kotlin.jvm.internal.C7573i.m23587b(r13, r11)
                java.lang.String r11 = "is_commerce"
                java.lang.String r11 = r10.getQueryParameter(r11)
                java.lang.String r0 = "show_tab"
                java.lang.String r0 = r10.getQueryParameter(r0)
                r1 = 0
                if (r0 == 0) goto L_0x0033
                java.lang.Integer r0 = kotlin.text.C7634n.m23706d(r0)
                if (r0 == 0) goto L_0x0033
                int r0 = r0.intValue()
                goto L_0x0034
            L_0x0033:
                r0 = 0
            L_0x0034:
                r2 = 1
                int r0 = r0 - r2
                java.lang.String r3 = "enter_from"
                java.lang.String r3 = r10.getQueryParameter(r3)
                java.lang.String r4 = "extra_challenge_from"
                java.lang.String r4 = r10.getQueryParameter(r4)
                r5 = r11
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                java.lang.String r6 = "1"
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r5 = android.text.TextUtils.equals(r5, r6)
                if (r5 != 0) goto L_0x0057
                java.lang.String r5 = "true"
                boolean r11 = kotlin.text.C7634n.m23717a(r5, r11, r2)
                if (r11 == 0) goto L_0x0060
            L_0x0057:
                java.lang.String r11 = "id"
                java.lang.String r11 = r10.getQueryParameter(r11)
                com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao.m82974a(r11)
            L_0x0060:
                java.lang.String r11 = "group"
                java.lang.String r11 = r10.getQueryParameter(r11)
                r5 = r12
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                r6 = 0
                if (r5 != 0) goto L_0x007a
                java.lang.String r5 = "/detail/"
                r7 = 2
                boolean r12 = kotlin.text.C7634n.m23721b(r12, r5, false)
                if (r12 == 0) goto L_0x007a
                r1 = 1
            L_0x007a:
                java.lang.String r12 = "0"
                boolean r11 = kotlin.jvm.internal.C7573i.m23585a(r12, r11)
                if (r11 != 0) goto L_0x0086
                if (r1 == 0) goto L_0x0085
                goto L_0x0086
            L_0x0085:
                return r6
            L_0x0086:
                if (r1 == 0) goto L_0x008d
                java.lang.String r11 = r10.getLastPathSegment()
                goto L_0x0093
            L_0x008d:
                java.lang.String r11 = "id"
                java.lang.String r11 = r10.getQueryParameter(r11)
            L_0x0093:
                com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao.m82971a(r10, r11)
                android.content.Intent r12 = new android.content.Intent
                android.content.Context r9 = (android.content.Context) r9
                java.lang.Class<com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity> r5 = com.p280ss.android.ugc.aweme.challenge.p1086ui.ChallengeDetailActivity.class
                r12.<init>(r9, r5)
                java.lang.String r9 = "id"
                if (r1 == 0) goto L_0x00a8
                java.lang.String r5 = r10.getLastPathSegment()
                goto L_0x00ae
            L_0x00a8:
                java.lang.String r5 = "id"
                java.lang.String r5 = r10.getQueryParameter(r5)
            L_0x00ae:
                r12.putExtra(r9, r5)
                java.lang.String r9 = "from_token"
                r12.putExtra(r9, r13)
                java.lang.String r9 = "show_tab_index"
                r12.putExtra(r9, r0)
                java.lang.String r9 = "enter_from"
                r12.putExtra(r9, r3)
                java.lang.String r9 = "extra_challenge_from"
                r12.putExtra(r9, r4)
                java.lang.String r9 = "cid"
                kotlin.jvm.internal.C7573i.m23582a(r11, r9)     // Catch:{ NumberFormatException -> 0x00ce }
                java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x00ce }
                goto L_0x00d3
            L_0x00ce:
                java.lang.String r9 = "extra_challenge_is_hashtag"
                r12.putExtra(r9, r2)
            L_0x00d3:
                com.ss.android.ugc.aweme.app.b$a r9 = com.p280ss.android.ugc.aweme.app.C22887b.f60603b
                java.lang.String r11 = "challenge_detail"
                r9.mo59852a(r11, r10, r14)
                boolean r9 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                if (r9 != 0) goto L_0x00f5
                if (r1 == 0) goto L_0x00f5
                java.lang.String r9 = r10.getLastPathSegment()
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                java.lang.String r10 = "1610938614632477"
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                boolean r9 = android.text.TextUtils.equals(r9, r10)
                if (r9 == 0) goto L_0x00f5
                com.p280ss.android.ugc.aweme.p1500r.p1501a.C37124b.m119335a()
            L_0x00f5:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.app.C22689a.C22707d.mo59796a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$e */
    public static abstract class C22708e {
        /* renamed from: a */
        public Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            return null;
        }

        /* renamed from: a */
        public String mo59799a() {
            return null;
        }

        /* renamed from: a */
        public void mo59800a(Activity activity, Uri uri, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
        }

        /* renamed from: a */
        public boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return false;
        }

        /* renamed from: a */
        public String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            if (TextUtils.isEmpty(uri.getHost())) {
                return "homepage_hot";
            }
            String host = uri.getHost();
            C7573i.m23582a((Object) host, "uri.host");
            return host;
        }

        /* renamed from: a */
        public boolean mo59802a(String str, String str2, String str3) {
            C7573i.m23587b(str, "scheme");
            C7573i.m23587b(str2, "host");
            C7573i.m23587b(str3, "path");
            return mo59798a(str2, str3);
        }

        /* renamed from: a */
        public Intent mo59801a(Activity activity, Uri uri, String str, String str2, String str3, boolean z, boolean z2) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            return mo59796a(activity, uri, str, str2, str3, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$f */
    public static final class C22709f {
        private C22709f() {
        }

        /* renamed from: a */
        public static List<C22708e> m75046a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C22727x());
            arrayList.add(new C22717n());
            arrayList.add(new C22714k());
            arrayList.add(new C22695ae());
            arrayList.add(new C22725v());
            arrayList.add(new C22710g());
            arrayList.add(new C22726w());
            arrayList.add(new C22698ah());
            arrayList.add(new C22699ai());
            arrayList.add(new C22701ak());
            arrayList.add(new C22690a());
            arrayList.add(new C22704b());
            arrayList.add(new C22720q());
            arrayList.add(new C22721r());
            arrayList.add(new C22692ab());
            arrayList.add(new C22707d());
            arrayList.add(new C22723t());
            arrayList.add(new C22697ag());
            arrayList.add(new C22693ac());
            arrayList.add(new C22715l());
            arrayList.add(new C22716m());
            arrayList.add(new C22722s());
            arrayList.add(new C22711h());
            arrayList.add(new C22713j());
            arrayList.add(new C22691aa());
            arrayList.add(new C22724u());
            arrayList.add(new C22703am());
            arrayList.add(new C22712i());
            arrayList.add(new C22706c());
            arrayList.add(new C22700aj());
            arrayList.add(new C22696af());
            arrayList.add(new C22694ad());
            arrayList.add(new C22718o());
            arrayList.add(new C22702al());
            arrayList.add(new C22728y());
            arrayList.add(new C22729z());
            arrayList.add(new C22719p());
            return arrayList;
        }

        public /* synthetic */ C22709f(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m75045a(String str, Uri uri) {
            String str2;
            if (uri != null) {
                str2 = uri.getQueryParameter(C22689a.f60407a);
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                C43077dz.m136657a().mo104731a(str, str2);
            }
            return str2;
        }

        /* renamed from: a */
        public static void m75048a(Uri uri, String str) {
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "clazz");
            if (TextUtils.equals(uri.getQueryParameter("gd_label"), "retarget")) {
                String queryParameter = uri.getQueryParameter("toast");
                if (queryParameter != null) {
                    C22765b.m75144a(str, queryParameter);
                }
            }
        }

        /* renamed from: a */
        public static void m75047a(Uri uri, Intent intent, boolean z) {
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(intent, "intent");
            try {
                int parseInt = Integer.parseInt(uri.getQueryParameter("tab"));
                intent.putExtra("tab", parseInt);
                if (parseInt == 1) {
                    C22887b.f60603b.mo59852a("discovery", uri, z);
                    return;
                }
                if (parseInt == 5) {
                    C22887b.f60603b.mo59852a("follow", uri, z);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$g */
    public static final class C22710g extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            if (C7573i.m23585a((Object) sb.toString(), (Object) "user/addressbook/list") || (C6399b.m19946v() && (C7573i.m23585a((Object) str, (Object) "friendRecommend") || C7573i.m23585a((Object) str, (Object) "newFriendRecommend")))) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            return ContactsActivity.m98571a(activity, null, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$h */
    public static final class C22711h extends C22708e {

        /* renamed from: a */
        private final String f60418a = "click_push_videoat";

        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return C22704b.f60415d;
        }

        /* renamed from: b */
        private static boolean m75051b() {
            if (!C6399b.m19944t()) {
                return C32904bi.m106500e();
            }
            if (!C6384b.m19835a().mo15292a(PushLandingFollowExperiment.class, true, "post_push_landing_following", C6384b.m19835a().mo15295d().post_push_landing_following, false) || C33003b.m106651a()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            if (!C7634n.m23721b(sb.toString(), "aweme/detail/", false)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                if (!C7634n.m23721b(sb2.toString(), "tuwen/detail/", false)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            Intent intent;
            boolean z2;
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            String queryParameter = uri.getQueryParameter("gd_label");
            if (C6399b.m19944t() || !TextUtils.equals(queryParameter, this.f60418a)) {
                int i = 0;
                if (m75051b() && activity.isTaskRoot() && TextUtils.equals(queryParameter, "click_push_newvideo")) {
                    Intent intent2 = new Intent(activity, MainActivity.class);
                    String queryParameter2 = uri.getQueryParameter("label");
                    if (TextUtils.isEmpty(queryParameter2)) {
                        queryParameter2 = "web";
                    }
                    intent2.putExtra("id", uri.getLastPathSegment());
                    intent2.putExtra("refer", queryParameter2);
                    intent2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                    if (!TextUtils.equals(uri.getQueryParameter("is_friend"), "1") || !C32904bi.m106501f()) {
                        intent2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                    } else {
                        intent2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FAMILIAR");
                    }
                    intent2.putExtra("tab", 0);
                    intent2.putExtra("gd_label", queryParameter);
                    intent = intent2;
                } else if (!C6399b.m19947w() || !TextUtils.equals(queryParameter, this.f60418a)) {
                    Context context = activity;
                    Intent intent3 = new Intent(context, DetailActivity.class);
                    String queryParameter3 = uri.getQueryParameter("label");
                    String queryParameter4 = uri.getQueryParameter("from");
                    if (TextUtils.isEmpty(queryParameter3)) {
                        queryParameter3 = "web";
                    }
                    intent3.putExtra("refer", queryParameter3);
                    intent3.putExtra("id", uri.getLastPathSegment());
                    CharSequence queryParameter5 = uri.getQueryParameter("is_friend");
                    if (TextUtils.isEmpty(queryParameter5) || !TextUtils.equals("1", queryParameter5)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2 && z) {
                        C7213d a = C7213d.m22500a();
                        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
                        if (a.mo18803bo() != null) {
                            C7213d a2 = C7213d.m22500a();
                            C7573i.m23582a((Object) a2, "AbTestManager.getInstance()");
                            AbTestModel d = a2.mo18803bo();
                            C7573i.m23582a((Object) d, "AbTestManager.getInstance().abTestSettingModel");
                            if (d.getUsePushStyle() && (!C7573i.m23585a((Object) "tuwen", (Object) str))) {
                                C22995i a3 = C22995i.m75637a();
                                C7573i.m23582a((Object) a3, "AppLifeCircleCacheManager.getInstance()");
                                if (a3.f60773a || activity.isTaskRoot()) {
                                    intent = new Intent(context, MainActivity.class);
                                    intent.putExtra("id", uri.getLastPathSegment());
                                    intent.putExtra("extra_story_is_friend", 0);
                                }
                            }
                        }
                    }
                    intent = new Intent(context, DetailActivity.class);
                    String queryParameter6 = uri.getQueryParameter("label");
                    if (TextUtils.isEmpty(queryParameter6)) {
                        queryParameter6 = "web";
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        queryParameter6 = str3;
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        queryParameter6 = "mp_page";
                    }
                    intent.putExtra("from_micro_app", queryParameter4);
                    intent.putExtra("from_adsapp_activity", true);
                    intent.putExtra("refer", queryParameter6);
                    intent.putExtra("id", uri.getLastPathSegment());
                    intent.putExtra("from_uid", uri.getQueryParameter("from_uid"));
                    String queryParameter7 = uri.getQueryParameter("pop_type");
                    if (queryParameter7 != null && queryParameter7.hashCode() == 403708324 && queryParameter7.equals("share_panel")) {
                        i = 3;
                    }
                    intent.putExtra("task_type", i);
                    if (z2) {
                        C22995i a4 = C22995i.m75637a();
                        C7573i.m23582a((Object) a4, "AppLifeCircleCacheManager.getInstance()");
                        if (a4.f60773a) {
                            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "DISCOVER");
                            intent.putExtra("extra_story_is_friend", 1);
                        }
                    }
                } else {
                    intent = SmartRouter.buildRoute((Context) activity, "//notification").withParam("from_where", 2).buildIntent();
                    C7573i.m23582a((Object) intent, "SmartRouter.buildRoute(a…           .buildIntent()");
                }
            } else {
                intent = SmartRouter.buildRoute((Context) activity, "//notification").withParam("from_where", 2).buildIntent();
                C7573i.m23582a((Object) intent, "SmartRouter.buildRoute(a…           .buildIntent()");
            }
            C22887b.f60603b.mo59852a(C22704b.f60415d, uri, z);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$i */
    public static final class C22712i extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) C22704b.f60415d);
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            String str4;
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            Intent intent = new Intent(activity, DetailActivity.class);
            if (!TextUtils.isEmpty(str3)) {
                str4 = str3;
            } else {
                str4 = "web";
            }
            intent.putExtra("refer", str4);
            intent.putExtra("from_token", str3);
            intent.putExtra("id", uri.getQueryParameter("id"));
            C22887b.f60603b.mo59852a(C22704b.f60415d, uri, z);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$j */
    public static final class C22713j extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return C22704b.f60415d;
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            if (!C7634n.m23721b(sb.toString(), "aweme/detail_list", false)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                if (!C7634n.m23721b(sb2.toString(), "tuwen/detail_list", false)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00b7  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent mo59796a(android.app.Activity r5, android.net.Uri r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
            /*
                r4 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.C7573i.m23587b(r5, r0)
                java.lang.String r0 = "uri"
                kotlin.jvm.internal.C7573i.m23587b(r6, r0)
                java.lang.String r0 = "host"
                kotlin.jvm.internal.C7573i.m23587b(r7, r0)
                java.lang.String r0 = "path"
                kotlin.jvm.internal.C7573i.m23587b(r8, r0)
                java.lang.String r8 = "fromTokenType"
                kotlin.jvm.internal.C7573i.m23587b(r9, r8)
                java.lang.String r8 = "label"
                java.lang.String r8 = r6.getQueryParameter(r8)
                r0 = r8
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x002a
                java.lang.String r8 = "web"
            L_0x002a:
                java.lang.String r0 = "gids"
                java.lang.String r0 = r6.getQueryParameter(r0)
                java.lang.String r1 = "push_params"
                java.lang.String r1 = r6.getQueryParameter(r1)
                java.lang.String r2 = "tuwen"
                boolean r7 = kotlin.jvm.internal.C7573i.m23585a(r2, r7)
                r2 = 1
                r7 = r7 ^ r2
                if (r7 == 0) goto L_0x005d
                com.ss.android.ugc.aweme.app.i r7 = com.p280ss.android.ugc.aweme.app.C22995i.m75637a()
                java.lang.String r3 = "AppLifeCircleCacheManager.getInstance()"
                kotlin.jvm.internal.C7573i.m23582a(r7, r3)
                boolean r7 = r7.f60773a
                if (r7 != 0) goto L_0x0053
                boolean r7 = r5.isTaskRoot()
                if (r7 == 0) goto L_0x005d
            L_0x0053:
                android.content.Intent r7 = new android.content.Intent
                android.content.Context r5 = (android.content.Context) r5
                java.lang.Class<com.ss.android.ugc.aweme.main.MainActivity> r8 = com.p280ss.android.ugc.aweme.main.MainActivity.class
                r7.<init>(r5, r8)
                goto L_0x0085
            L_0x005d:
                android.content.Intent r7 = new android.content.Intent
                android.content.Context r5 = (android.content.Context) r5
                java.lang.Class<com.ss.android.ugc.aweme.detail.ui.DetailActivity> r3 = com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity.class
                r7.<init>(r5, r3)
                r5 = r9
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                if (r5 != 0) goto L_0x0070
                r8 = r9
            L_0x0070:
                java.lang.String r5 = "from_adsapp_activity"
                r7.putExtra(r5, r2)
                java.lang.String r5 = "refer"
                r7.putExtra(r5, r8)
                java.lang.String r5 = "from_uid"
                java.lang.String r8 = "from_uid"
                java.lang.String r8 = r6.getQueryParameter(r8)
                r7.putExtra(r5, r8)
            L_0x0085:
                r5 = r0
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r8 = android.text.TextUtils.isEmpty(r5)
                if (r8 != 0) goto L_0x00ae
                java.lang.String r8 = "from"
                java.lang.String r8 = r6.getQueryParameter(r8)
                r9 = r8
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                boolean r9 = android.text.TextUtils.isEmpty(r9)
                if (r9 != 0) goto L_0x00a9
                java.lang.String r9 = "from_micro_app"
                r7.putExtra(r9, r8)
                java.lang.String r8 = "refer"
                java.lang.String r9 = "mp_page"
                r7.putExtra(r8, r9)
            L_0x00a9:
                java.lang.String r8 = "ids"
                r7.putExtra(r8, r0)
            L_0x00ae:
                r8 = r1
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                boolean r9 = android.text.TextUtils.isEmpty(r8)
                if (r9 != 0) goto L_0x00bc
                java.lang.String r9 = "push_params"
                r7.putExtra(r9, r1)
            L_0x00bc:
                java.lang.String r9 = "push_id"
                r6.getQueryParameter(r9)
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                if (r5 == 0) goto L_0x00d7
                boolean r5 = android.text.TextUtils.isEmpty(r8)
                if (r5 != 0) goto L_0x00d7
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d7 }
                r5.<init>(r1)     // Catch:{ JSONException -> 0x00d7 }
                java.lang.String r8 = "gids"
                r5.getString(r8)     // Catch:{ JSONException -> 0x00d7 }
            L_0x00d7:
                com.ss.android.ugc.aweme.app.b$a r5 = com.p280ss.android.ugc.aweme.app.C22887b.f60603b
                java.lang.String r8 = "detail"
                r5.mo59852a(r8, r6, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.app.C22689a.C22713j.mo59796a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$k */
    public static final class C22714k extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) "discovery", (Object) str);
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            if (C6399b.m19944t()) {
                Intent intent = new Intent(activity, MainActivity.class);
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "DISCOVER");
                C22709f.m75047a(uri, intent, z);
                return intent;
            }
            Intent intent2 = new Intent(activity, DiscoverActivity.class);
            C22709f.m75047a(uri, intent2, z);
            return intent2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$l */
    public static final class C22715l extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) "feedback_input");
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            String str4;
            boolean z2;
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            String queryParameter = uri.getQueryParameter("feedback_id");
            String queryParameter2 = uri.getQueryParameter("enter_from");
            String queryParameter3 = uri.getQueryParameter("img_url");
            String str5 = "";
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                FeedbackConf feedbackConf = a.getFeedbackConf();
                C7573i.m23582a((Object) feedbackConf, "SettingsReader.get().feedbackConf");
                str4 = feedbackConf.getFeHelp();
                C7573i.m23582a((Object) str4, "SettingsReader.get().feedbackConf.feHelp");
                z2 = true;
            } catch (NullValueException unused) {
                str4 = str5;
                z2 = false;
            }
            if (!z2 || C6384b.m19835a().mo15287a(FAQExperiment.class, true, "feedback_post_page_style", C6384b.m19835a().mo15295d().feedback_post_page_style, 0) == 0) {
                Object service = ServiceManager.get().getService(IBridgeService.class);
                C7573i.m23582a(service, "ServiceManager.get().get…ridgeService::class.java)");
                Intent intent = new Intent(activity, ((IBridgeService) service).getSubmitFeedbackActivity());
                if (!TextUtils.isEmpty(queryParameter)) {
                    intent.putExtra("feedback_id", queryParameter);
                    intent.putExtra("enter_from", queryParameter2);
                }
                intent.putExtra("img_url", queryParameter3);
                return intent;
            }
            if (!TextUtils.isEmpty(queryParameter)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append("%26feedback_id%3D");
                sb.append(queryParameter);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("%26enter_from%3D");
                sb3.append(queryParameter2);
                str4 = sb3.toString();
            }
            return C22912d.f60645e.mo59886a((Context) activity, Uri.parse(str4), false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$m */
    public static final class C22716m extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) "feedback_record");
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            return new Intent(activity, FeedbackActivity.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$n */
    public static final class C22717n extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) "modern_feed", (Object) str);
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            Intent intent = new Intent(activity, MainActivity.class);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "DISCOVER");
            C22709f.m75047a(uri, intent, z);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$o */
    public static final class C22718o extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return "live";
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C7634n.m23721b(sb.toString(), "hotlive/feed", false);
        }

        /* renamed from: a */
        public final void mo59800a(Activity activity, Uri uri, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            Bundle bundle = new Bundle();
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (!C6307b.m19566a((Collection<T>) queryParameterNames)) {
                for (String str : queryParameterNames) {
                    bundle.putString(str, uri.getQueryParameter(str));
                }
            }
            C41990e.m133500a(activity, bundle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$p */
    public static final class C22719p extends C22708e {
        /* renamed from: a */
        public final boolean mo59802a(String str, String str2, String str3) {
            C7573i.m23587b(str, "scheme");
            C7573i.m23587b(str2, "host");
            C7573i.m23587b(str3, "path");
            if (C7573i.m23585a((Object) str, (Object) WebKitApi.SCHEME_HTTP) || C7573i.m23585a((Object) str, (Object) WebKitApi.SCHEME_HTTPS)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            Intent a = C22912d.f60645e.mo59886a((Context) activity, uri, !z);
            if (z) {
                if (a != null) {
                    a.putExtra("hide_more", false);
                }
                if (a != null) {
                    a.putExtra("enter_from", "notification");
                }
            }
            C22887b.f60603b.mo59852a("h5", uri, z);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$q */
    public static final class C22720q extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return "notification";
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C7573i.m23585a((Object) sb.toString(), (Object) "user/imfans");
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            return SmartRouter.buildRoute((Context) activity, "//notification").withParam("from_where", 0).buildIntent();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$r */
    public static final class C22721r extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return C22704b.f60415d;
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            if (C7573i.m23585a((Object) str, (Object) "item") || (C6399b.m19946v() && C7573i.m23585a((Object) str, (Object) "musical"))) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            Intent intent = new Intent(activity, DetailActivity.class);
            intent.putExtra("refer", "web");
            intent.putExtra("id", uri.getQueryParameter("id"));
            C22887b.f60603b.mo59852a(C22704b.f60415d, uri, z);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$s */
    public static final class C22722s extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) "login");
        }

        /* renamed from: a */
        public final void mo59800a(Activity activity, Uri uri, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            if (!a.isLogin()) {
                C23018p a2 = C23018p.m75672a();
                C7573i.m23582a((Object) a2, "AwemeRuntime.inst()");
                if (a2.mo59990c()) {
                    activity.startActivity(new Intent(activity, PushLoginActivity.class));
                    return;
                }
                Context context = activity;
                activity.startActivities(new Intent[]{new Intent(context, MainActivity.class), new Intent(context, PushLoginActivity.class)});
                return;
            }
            activity.startActivity(new Intent(activity, MainActivity.class));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$t */
    public static final class C22723t extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return "music_detail";
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            if (C7573i.m23585a((Object) str, (Object) "music") || (C6399b.m19946v() && C7573i.m23585a((Object) str, (Object) "song"))) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            if (!C7573i.m23585a((Object) str, (Object) "song") || !C6399b.m19946v()) {
                String queryParameter = uri.getQueryParameter("group");
                boolean z2 = false;
                if (!TextUtils.isEmpty(str2) && C7634n.m23721b(str2, "/detail/", false)) {
                    z2 = true;
                }
                if (!C7573i.m23585a((Object) "0", (Object) queryParameter) && !z2) {
                    return null;
                }
                Intent intent = new Intent(activity, MusicDetailActivity.class);
                String queryParameter2 = uri.getQueryParameter("id");
                if (TextUtils.isEmpty(queryParameter2)) {
                    queryParameter2 = uri.getLastPathSegment();
                }
                if (C7573i.m23585a((Object) C22704b.f60415d, (Object) queryParameter2) || C7573i.m23585a((Object) "0", (Object) queryParameter2)) {
                    queryParameter2 = null;
                }
                intent.putExtra("id", queryParameter2);
                intent.putExtra("from_token", str3);
                intent.putExtra("partnerName", uri.getQueryParameter("partnerName"));
                intent.putExtra("partnerMusicId", uri.getQueryParameter("partnerMusicId"));
                C22887b.f60603b.mo59852a("music_detail", uri, z);
                return intent;
            }
            Intent intent2 = new Intent(activity, MusicDetailActivity.class);
            intent2.putExtra("id", uri.getQueryParameter("trackId"));
            C22887b.f60603b.mo59852a("music_detail", uri, z);
            return intent2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$u */
    public static final class C22724u extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) "collection");
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            if (C7573i.m23585a((Object) "0", (Object) uri.getQueryParameter("group"))) {
                return SmartRouter.buildRoute((Context) activity, "aweme://music/category/").withParam("mc_id", uri.getQueryParameter("id")).withParam("title_name", uri.getQueryParameter("collection_name")).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1).buildIntent();
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$v */
    public static final class C22725v extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return "personal_homepage";
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            if (!C7573i.m23585a((Object) "mine", (Object) str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                if (!C7573i.m23585a((Object) sb.toString(), (Object) "user/homepage")) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        public final Intent mo59801a(Activity activity, Uri uri, String str, String str2, String str3, boolean z, boolean z2) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            if (!a.isLogin() && !z2) {
                return new Intent(activity, MainActivity.class);
            }
            Intent intent = new Intent(activity, MainActivity.class);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
            C22887b.f60603b.mo59852a("mine", uri, z);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$w */
    public static final class C22726w extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return "nearby";
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) "nearby", (Object) str);
        }

        /* renamed from: a */
        public final Intent mo59801a(Activity activity, Uri uri, String str, String str2, String str3, boolean z, boolean z2) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            Intent intent = new Intent(activity, MainActivity.class);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NEARBY");
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$x */
    public static final class C22727x extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            if (!C7634n.m23717a("chatting", str, true) || !C7634n.m23717a("/message", str2, true)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo59800a(Activity activity, Uri uri, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C24758a.m81247a(activity, uri.getQueryParameter("uid"), uri.getQueryParameter("ext"), null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$y */
    public static final class C22728y extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            if (!C7634n.m23717a("mix_video", str, true) || !C7634n.m23721b(str2, "/detail", true)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo59800a(Activity activity, Uri uri, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            String queryParameter = uri.getQueryParameter("mix_id");
            if (queryParameter == null) {
                queryParameter = uri.getLastPathSegment();
            }
            if (queryParameter == null) {
                queryParameter = "";
            }
            C33478a.m108256a(MixDetailActivity.f87435a, activity, queryParameter, "", "", "", "direct_click", null, null, null, 448, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$z */
    public static final class C22729z extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            if (!C7634n.m23717a("user", str, true) || !C7634n.m23717a("/favorite/", str2, true)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo59800a(Activity activity, Uri uri, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            String queryParameter = uri.getQueryParameter("tab_name");
            if (queryParameter == null) {
                queryParameter = "";
            }
            String queryParameter2 = uri.getQueryParameter("mix_ids");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            StringBuilder sb = new StringBuilder("aweme://favorite?");
            sb.append("tab_name=");
            sb.append(queryParameter);
            sb.append("&push_ids=");
            sb.append(queryParameter2);
            C7195s.m22438a().mo18682a(sb.toString());
        }
    }

    /* renamed from: a */
    public static final String m74979a(String str, Uri uri) {
        return C22709f.m75045a(str, uri);
    }

    /* renamed from: a */
    public static final void m74980a(Uri uri, String str) {
        C22709f.m75048a(uri, str);
    }
}
