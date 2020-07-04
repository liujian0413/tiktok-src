package com.p280ss.android.ugc.aweme.p313im;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.app.C22977g;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29096c.C29097a;
import com.p280ss.android.ugc.aweme.following.model.C29565b;
import com.p280ss.android.ugc.aweme.following.model.C29567c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30468e;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.notice.api.p1430ws.C34334h;
import com.p280ss.android.ugc.aweme.p1685ug.poloris.C42722c;
import com.p280ss.android.ugc.aweme.p313im.service.C32005c;
import com.p280ss.android.ugc.aweme.p313im.service.C32009e;
import com.p280ss.android.ugc.aweme.p313im.service.C32014g;
import com.p280ss.android.ugc.aweme.p313im.service.C32023i;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.model.C32025c;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C32000a;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C32001c;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C32003d;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.secapi.C37420a;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;
import com.p280ss.android.ugc.aweme.utils.C43077dz;
import java.util.HashMap;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7563m;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.e */
public final class C30557e implements C7103h {
    public final void addImpressionId(int i, String str) {
    }

    public final void bindRecommendContactItemView(C1293v vVar, RecommendContact recommendContact, int i) {
    }

    public final void bindRecommendViewHolder(C1293v vVar, User user, int i, boolean z, int i2) {
    }

    public final boolean canShowInnerNotification() {
        return false;
    }

    public final boolean checkIMInsertRecommendContact() {
        return false;
    }

    public final void checkPluginAndLoadLibrary(Context context, boolean z, String str, C32000a aVar) {
    }

    public final C1293v createRecommendContactItemView(ViewGroup viewGroup, C7563m<RecommendContact, Integer, C7581n> mVar) {
        return null;
    }

    public final C1293v createRecommendViewHolder(Context context, HashMap<String, Boolean> hashMap, C32001c<User> cVar) {
        return null;
    }

    public final void downloadPdf(Context context, String str, String str2) {
    }

    public final void enterAddFriendsActivity(Context context) {
    }

    public final int getAssociativeEmoji() {
        return 0;
    }

    public final Activity getCurrentActivity() {
        return null;
    }

    public final ViewGroup getCurrentDecorView(Activity activity) {
        return null;
    }

    public final String getFriendToFamiliarStr(int i, int i2) {
        return "";
    }

    public final String getInnerPushEnterFrom() {
        return "";
    }

    public final boolean getIsHotSearchBillboardEnable() {
        return true;
    }

    public final C32014g getLiveProxy() {
        return null;
    }

    public final C32023i getPlayerProxy() {
        return null;
    }

    public final int getRecommendContactPosition() {
        return -1;
    }

    public final String getToReportId() {
        return null;
    }

    public final int getXPlanStyle() {
        return 0;
    }

    public final void handleXDownload(Activity activity, String str, C32005c cVar) {
    }

    public final boolean isCheckPlugin() {
        return false;
    }

    public final boolean isEnableShowTeenageTip() {
        return false;
    }

    public final boolean isFFSDKBind() {
        return false;
    }

    public final boolean isInMainFeed() {
        return false;
    }

    public final boolean isInPublishPage() {
        return false;
    }

    public final boolean isMainPage() {
        return false;
    }

    public final boolean isNeedToContinuePlayInAct() {
        return false;
    }

    public final boolean isXPlanRedPacketOpen() {
        return false;
    }

    public final void jumpToLivePage(Context context, String str, String str2, String str3) {
    }

    public final void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4) {
    }

    public final void makePhoneCall(Activity activity, String str, String str2, String str3, String str4) {
    }

    public final void openFFSdkSchema(String str) {
    }

    public final void openLiveUrl(Context context, String str) {
    }

    public final void openPrivacyReminder(Context context) {
    }

    public final void recordLastShareTypeIsIm() {
    }

    public final void saveLogPb(String str, String str2) {
    }

    public final void saveShareCommandToSp(String str) {
    }

    public final void setNeedToContinueToPlay(boolean z) {
    }

    public final void setSharePlayer(Object... objArr) {
    }

    public final void shareToTargetChannel(Context context, String str) {
    }

    public final void showNotification(String str, String str2) {
    }

    public final boolean enableIM() {
        return C30553b.m99785a();
    }

    public final boolean showNewStyle() {
        return C6399b.m19947w();
    }

    public final String getAppLanguage() {
        String c = C30468e.m99511a().mo80143c();
        if (c == null) {
            return "";
        }
        return c;
    }

    public final String getCurrentLocaleLanguage() {
        return (String) SharePrefCache.inst().getCurrentLocaleLanguage().mo59877d();
    }

    public final C32025c getIMSetting() {
        return SettingsManagerProxy.inst().getCommonSettingsWatcher().mo76676a();
    }

    public final String getWsUrl() {
        return C34334h.m111033d().mo87179e();
    }

    public final boolean enableSendPic() {
        if (((Integer) SharePrefCache.inst().getCanImSendPic().mo59877d()).intValue() == 1) {
            return true;
        }
        return false;
    }

    public final long getSpringApiLimitedTime() {
        long c = C22977g.f60742b.mo59968c();
        if (c != 60000) {
            return c;
        }
        return 0;
    }

    public final void logIMShareHeadShow() {
        String c = C6776h.m20949c(C6399b.m19921a());
        if (TextUtils.isEmpty(c) || !c.contains(":miniapp")) {
            C30560g.m99827e();
        } else {
            C7167b.m22380b().mo18647a().remoteMobV3("im_share_head_show", null);
        }
    }

    public final void setIMAwemeProvider(C32009e eVar) {
        C28503s.m93680a(eVar);
    }

    public final void setCurrentLocaleLanguage(String str) {
        SharePrefCache.inst().setCurrentLocaleLanguage(str);
    }

    public final void updateApk(Context context) {
        String str;
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        if (C6399b.m19946v()) {
            str = "https://go.onelink.me/bIdt/409f077";
        } else {
            str = "https://go.onelink.me/BAuo/410a1973";
        }
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
    }

    public final void monitorMsgSendStatus(Map<String, String> map) {
        try {
            int parseInt = Integer.parseInt((String) map.get("success_cnt"));
            while (true) {
                int i = parseInt - 1;
                if (parseInt <= 0) {
                    break;
                }
                C6877n.m21444a("aweme_im_message_error_rate", 0, (JSONObject) null);
                parseInt = i;
            }
            int parseInt2 = Integer.parseInt((String) map.get("fail_cnt"));
            while (true) {
                int i2 = parseInt2 - 1;
                if (parseInt2 > 0) {
                    C6877n.m21444a("aweme_im_message_error_rate", 1, (JSONObject) null);
                    parseInt2 = i2;
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
    }

    public final void feedbackIm(String str, String str2) {
        C29097a.m95452a().mo74528a(str, str2);
    }

    public final C25673a<User, C29567c> getFollowerFetchModel(String str, String str2) {
        return new C29565b(str, str2);
    }

    public final void putSecUidToMap(String str, String str2) {
        C43077dz.m136657a().mo104731a(str, str2);
    }

    public final void popCaptcha(Activity activity, int i, final C32003d dVar) {
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).popCaptcha(activity, i, new C37420a() {
            /* renamed from: a */
            public final void mo80301a(int i) {
                if (dVar != null) {
                    dVar.mo81900a(i);
                }
            }

            /* renamed from: a */
            public final void mo80302a(boolean z, String str) {
                if (dVar != null) {
                    dVar.mo81901a(z, str);
                }
            }
        });
    }

    public final void openUrl(Context context, Uri uri, boolean z) {
        if (!C42722c.m135620a(context, uri.toString(), "IM")) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.setData(uri);
            if (z) {
                intent.putExtra("safeTemplate", true);
            }
            intent.putExtra("enter_from", "chat");
            intent.putExtra("hide_more", false);
            intent.putExtra("use_webview_title", true);
            context.startActivity(intent);
        }
    }

    public final void enterDetailActivity(Context context, String str, String str2, String str3, int i, int i2, String str4, View view) {
        DetailActivity.m86053a(context, str, str2, str3, i, i2, str4, view);
    }
}
