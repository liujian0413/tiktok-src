package com.p280ss.android.ugc.aweme.share;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.share.C37974ak.C37975a;
import com.p280ss.android.ugc.aweme.share.improve.C38065a.C38066a;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.C38359j;
import com.p280ss.android.ugc.aweme.sharer.ShareException;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38301f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.trill.share.base.C45083a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.at */
public final class C37992at {

    /* renamed from: a */
    public static final C37993a f98920a = new C37993a(null);

    /* renamed from: com.ss.android.ugc.aweme.share.at$a */
    public static final class C37993a {
        private C37993a() {
        }

        public /* synthetic */ C37993a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m121309a(Aweme aweme, SilentShareChannel silentShareChannel, String str, AbsActivity absActivity) {
            SharePackage sharePackage;
            Context context;
            Aweme aweme2 = aweme;
            String str2 = str;
            AbsActivity absActivity2 = absActivity;
            C7573i.m23587b(aweme2, "aweme");
            C7573i.m23587b(silentShareChannel, "channel");
            C7573i.m23587b(str2, "downloadedFilePath");
            C7573i.m23587b(absActivity2, "activity");
            C38343b a = C38066a.m121469a(silentShareChannel.getKey(), absActivity2);
            if (a != null) {
                if (C38251s.m122194a(aweme2, silentShareChannel.getKey())) {
                    File file = new File(str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(File.separator);
                    sb.append("temp");
                    sb.append(File.separator);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(file.getParent());
                    sb3.append(sb2);
                    sb3.append(file.getName());
                    String sb4 = sb3.toString();
                    C7276d.m22820d(str2, sb4);
                    int a2 = C38251s.m122192a(sb4, str2);
                    C7276d.m22816c(sb4);
                    if (a2 != 0) {
                        C37975a.m121285a(Integer.valueOf(a2));
                        C10761a.m31399c((Context) absActivity2, (int) R.string.a97).mo25750a();
                        return;
                    }
                }
                switch (C37994au.f98921a[silentShareChannel.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        C38343b bVar = a;
                        Context context2 = absActivity2;
                        C38359j jVar = new C38359j(C38159c.m121911a(str2, context2), str, null, null, null, null, 60, null);
                        String str3 = "content_url";
                        String str4 = jVar.f99580g;
                        if (str4 == null) {
                            str4 = "";
                        }
                        jVar.mo95938a(str3, str4);
                        jVar.mo95938a("media_type", "video/mp4");
                        bVar.mo95746a(jVar, context2);
                        break;
                    case 4:
                        C38343b bVar2 = a;
                        if (!C45083a.m142202b(aweme)) {
                            Context context3 = absActivity2;
                            C38359j jVar2 = new C38359j(C38159c.m121911a(str2, context3), str, null, null, null, null, 60, null);
                            String str5 = "content_url";
                            String str6 = jVar2.f99580g;
                            if (str6 == null) {
                                str6 = "";
                            }
                            jVar2.mo95938a(str5, str6);
                            jVar2.mo95938a("media_type", "video/mp4");
                            bVar2.mo95746a(jVar2, context3);
                            break;
                        } else {
                            ShareInfo shareInfo = aweme.getShareInfo();
                            C7573i.m23582a((Object) shareInfo, "aweme.shareInfo");
                            String shareUrl = shareInfo.getShareUrl();
                            C7573i.m23582a((Object) shareUrl, "aweme.shareInfo.shareUrl");
                            C38356g gVar = new C38356g(C38159c.m121914a(shareUrl, bVar2), null, null, 6, null);
                            bVar2.mo95738a(gVar, (Context) absActivity2);
                            break;
                        }
                    case 5:
                        C38343b bVar3 = a;
                        C38301f fVar = new C38301f();
                        C7213d a3 = C7213d.m22500a();
                        C7573i.m23582a((Object) a3, "AbTestManager.getInstance()");
                        if (!a3.mo18708A()) {
                            C7213d a4 = C7213d.m22500a();
                            C7573i.m23582a((Object) a4, "AbTestManager.getInstance()");
                            if (a4.mo18826z()) {
                                Context context4 = absActivity2;
                                if (fVar.mo95743a(context4)) {
                                    C38301f fVar2 = new C38301f();
                                    C38359j jVar3 = new C38359j(C38159c.m121911a(str2, context4), null, null, null, null, null, 62, null);
                                    String str7 = "content_url";
                                    String str8 = jVar3.f99580g;
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    jVar3.mo95938a(str7, str8);
                                    jVar3.mo95938a("fb_app_id", "597615686992125");
                                    jVar3.mo95938a("media_type", "video/mp4");
                                    fVar2.mo71406a((C38354f) jVar3, context4);
                                    break;
                                }
                            }
                            Context context5 = absActivity2;
                            C38359j jVar4 = new C38359j(C38159c.m121911a(str2, context5), str, null, null, null, null, 60, null);
                            bVar3.mo95746a(jVar4, context5);
                            break;
                        } else {
                            ShareInfo shareInfo2 = aweme.getShareInfo();
                            C7573i.m23582a((Object) shareInfo2, "aweme.shareInfo");
                            String shareUrl2 = shareInfo2.getShareUrl();
                            C7573i.m23582a((Object) shareUrl2, "aweme.shareInfo.shareUrl");
                            C38356g gVar2 = new C38356g(C38159c.m121914a(shareUrl2, bVar3), null, null, 6, null);
                            bVar3.mo95738a(gVar2, (Context) absActivity2);
                            break;
                        }
                    case 6:
                    case 7:
                    case 8:
                        C38343b bVar4 = a;
                        ShareInfo shareInfo3 = aweme.getShareInfo();
                        C7573i.m23582a((Object) shareInfo3, "aweme.shareInfo");
                        String shareUrl3 = shareInfo3.getShareUrl();
                        C7573i.m23582a((Object) shareUrl3, "aweme.shareInfo.shareUrl");
                        C38356g gVar3 = new C38356g(C38159c.m121914a(shareUrl3, bVar4), null, null, 6, null);
                        bVar4.mo95738a(gVar3, (Context) absActivity2);
                        break;
                    case 9:
                        File file2 = new File(str2);
                        Context context6 = absActivity2;
                        SharePackage parseAweme = C37984ap.m121301a().parseAweme(context6, aweme, 0, "", "");
                        if (C38157b.m121907a(file2)) {
                            ShareInfo shareInfo4 = aweme.getShareInfo();
                            C7573i.m23582a((Object) shareInfo4, "aweme.shareInfo");
                            String shareUrl4 = shareInfo4.getShareUrl();
                            C7573i.m23582a((Object) shareUrl4, "aweme.shareInfo.shareUrl");
                            try {
                                r9 = r9;
                                sharePackage = parseAweme;
                                context = context6;
                                C38343b bVar5 = a;
                                try {
                                    C38359j jVar5 = new C38359j(C38159c.m121911a(str2, C38159c.m121910a()), str, null, null, null, C38159c.m121914a(shareUrl4, a), 28, null);
                                    bVar5.mo71406a((C38354f) jVar5, (Context) absActivity2);
                                } catch (ShareException e) {
                                    e = e;
                                }
                            } catch (ShareException e2) {
                                e = e2;
                                sharePackage = parseAweme;
                                context = context6;
                                String message = e.getMessage();
                                int hashCode = message.hashCode();
                                if (hashCode == 1212011917) {
                                    Context context7 = context;
                                    SharePackage sharePackage2 = sharePackage;
                                    if (message.equals("file_too_large")) {
                                        C10761a.m31399c(context7, (int) R.string.foz).mo25750a();
                                        C37984ap.m121302b().getCopyAwemeAction(aweme, "", true, 0).mo95712a(context7, sharePackage2);
                                    }
                                } else if (hashCode == 1703438795 && message.equals("video_too_long")) {
                                    C10761a.m31399c(context, (int) R.string.fp0).mo25750a();
                                    Context context8 = context;
                                    SharePackage sharePackage3 = sharePackage;
                                    C37984ap.m121302b().getCopyAwemeAction(aweme, "", true, 0).mo95712a(context8, sharePackage3);
                                }
                                C23338f.m76562a().mo60629b("key_pop_up_window_share_count", C23338f.m76562a().mo60620a("key_pop_up_window_share_count", 0) + 1);
                                C6907h.m21524a("share_video", (Map) C22984d.m75611a().mo59973a("scene_id", "1013").mo59973a("platform", silentShareChannel.getKey()).mo59973a("group_id", aweme.getAid()).mo59973a("enter_from", "video_post_page").mo59973a("share_mode", "download_then_share").mo59973a("content_type", "video").f60753a);
                            }
                        } else {
                            SharePackage sharePackage4 = parseAweme;
                            Context context9 = context6;
                            C6907h.onEventV3("share_snapchat_oversized");
                            C10761a.m31399c(context9, (int) R.string.foz).mo25750a();
                            C37984ap.m121302b().getCopyAwemeAction(aweme, "", true, 0).mo95712a(context9, sharePackage4);
                        }
                }
                C23338f.m76562a().mo60629b("key_pop_up_window_share_count", C23338f.m76562a().mo60620a("key_pop_up_window_share_count", 0) + 1);
                C6907h.m21524a("share_video", (Map) C22984d.m75611a().mo59973a("scene_id", "1013").mo59973a("platform", silentShareChannel.getKey()).mo59973a("group_id", aweme.getAid()).mo59973a("enter_from", "video_post_page").mo59973a("share_mode", "download_then_share").mo59973a("content_type", "video").f60753a);
            }
        }
    }

    /* renamed from: a */
    public static final void m121308a(Aweme aweme, SilentShareChannel silentShareChannel, String str, AbsActivity absActivity) {
        C37993a.m121309a(aweme, silentShareChannel, str, absActivity);
    }
}
