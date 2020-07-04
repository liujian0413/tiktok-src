package com.p280ss.android.ugc.aweme.p1500r.p1501a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25354g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.xigua.XiGuaTaskStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.r.a.b */
public final class C37124b {
    /* renamed from: a */
    public static void m119335a() {
        C6907h.m21524a("launch_log", (Map) C22984d.m75611a().mo59973a("launch_method", "click_join_mission").f60753a);
    }

    /* renamed from: b */
    private static boolean m119342b(XiGuaTaskStruct xiGuaTaskStruct) {
        if (!xiGuaTaskStruct.isXiGuaTask() || C7213d.m22500a().mo18816p() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m119344c(XiGuaTaskStruct xiGuaTaskStruct) {
        if (!xiGuaTaskStruct.isXiGuaTask() || C7213d.m22500a().mo18816p() != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m119341b(Aweme aweme) {
        if (aweme == null || aweme.getXiGuaTask() == null || !aweme.getXiGuaTask().isXiGuaTask() || !m119342b(aweme.getXiGuaTask()) || C25352e.m83221d(aweme) || C6399b.m19944t()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static UrlModel m119343c(Aweme aweme) {
        if (aweme == null || aweme.getXiGuaTask() == null || !aweme.getXiGuaTask().isXiGuaTask()) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add(aweme.getXiGuaTask().getIconUrl());
        urlModel.setUri(aweme.getXiGuaTask().getIconUrl());
        urlModel.setUrlList(arrayList);
        return urlModel;
    }

    /* renamed from: d */
    private static UrlModel m119345d(Aweme aweme) {
        if (aweme == null || aweme.getXiGuaTask() == null || !aweme.getXiGuaTask().isXiGuaTask()) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add(aweme.getXiGuaTask().getEntranceUrl());
        urlModel.setUri(aweme.getXiGuaTask().getEntranceUrl());
        urlModel.setUrlList(arrayList);
        return urlModel;
    }

    /* renamed from: a */
    public static boolean m119338a(Aweme aweme) {
        if (aweme == null || aweme.getPoiStruct() != null || C25352e.m83221d(aweme) || C6399b.m19944t() || aweme.getXiGuaTask() == null || !aweme.getXiGuaTask().isXiGuaTask() || !m119340a(aweme.getXiGuaTask())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m119340a(XiGuaTaskStruct xiGuaTaskStruct) {
        if (!xiGuaTaskStruct.isXiGuaTask() || C7213d.m22500a().mo18816p() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m119336a(Context context, Aweme aweme) {
        if (context != null && aweme != null && aweme.getXiGuaTask() != null) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.setData(Uri.parse(aweme.getXiGuaTask().getJumpUrl()));
            intent.putExtra("use_webview_title", true);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    private static boolean m119339a(Aweme aweme, Context context) {
        boolean z;
        if (aweme == null || aweme.getXiGuaTask() == null || !aweme.getXiGuaTask().isXiGuaTask() || !m119344c(aweme.getXiGuaTask()) || C25352e.m83221d(aweme) || C6399b.m19944t()) {
            z = false;
        } else {
            z = true;
        }
        return z ? false : false;
    }

    /* renamed from: a */
    public static void m119337a(Aweme aweme, RemoteImageView remoteImageView, String str, Context context) {
        String str2;
        if (m119339a(aweme, context)) {
            UrlModel d = m119345d(aweme);
            if (d != null) {
                C25354g.m83373a(remoteImageView, d);
                remoteImageView.setVisibility(0);
                User author = aweme.getAuthor();
                String str3 = "show_mission_icon";
                C22984d a = C22984d.m75611a().mo59973a("enter_from", str).mo59973a("group_id", aweme.getAid());
                String str4 = "author_id";
                if (author != null) {
                    str2 = author.getUid();
                } else {
                    str2 = "";
                }
                C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).mo59973a("entrance_location", "activity_entrance").f60753a);
                return;
            }
            return;
        }
        remoteImageView.setVisibility(8);
    }
}
