package com.p280ss.android.ugc.aweme.share;

import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.p280ss.android.ugc.aweme.setting.UgDiffDownloadReportOnlyDiff;
import com.p280ss.android.ugc.aweme.setting.UgDiffDownloadUnreportExtra;
import com.p280ss.android.ugc.aweme.share.AwemeACLStruct.ACLCommonStruct;
import com.p280ss.android.ugc.aweme.share.AwemeACLStruct.ServerExtra;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.utils.C42996by;
import com.p280ss.android.ugc.aweme.utils.C43101el;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.d */
public final class C38024d {

    /* renamed from: a */
    public static final C38024d f98971a = new C38024d();

    /* renamed from: b */
    private static String f98972b = "share_panel";

    /* renamed from: c */
    private static String f98973c = "";

    private C38024d() {
    }

    /* renamed from: a */
    public static final void m121364a(String str) {
        C7573i.m23587b(str, "<set-?>");
        f98972b = str;
    }

    /* renamed from: b */
    public static final void m121368b(String str) {
        C7573i.m23587b(str, "<set-?>");
        f98973c = str;
    }

    /* renamed from: a */
    private static ACLCommonShare m121361a(Aweme aweme) {
        ACLCommonShare aCLCommonShare;
        if (aweme == null) {
            return null;
        }
        AwemeACLShare awemeACLShareInfo = aweme.getAwemeACLShareInfo();
        if (awemeACLShareInfo != null) {
            aCLCommonShare = awemeACLShareInfo.getDownloadSharePanel();
        } else {
            aCLCommonShare = null;
        }
        if (aCLCommonShare != null) {
            return awemeACLShareInfo.getDownloadSharePanel();
        }
        if (awemeACLShareInfo != null) {
            return awemeACLShareInfo.getDownloadGeneral();
        }
        return null;
    }

    /* renamed from: b */
    private static ACLCommonShare m121367b(Aweme aweme) {
        ACLCommonShare aCLCommonShare;
        if (aweme == null) {
            return null;
        }
        AwemeACLShare awemeACLShareInfo = aweme.getAwemeACLShareInfo();
        if (awemeACLShareInfo != null) {
            aCLCommonShare = awemeACLShareInfo.getDownloadMaskPanel();
        } else {
            aCLCommonShare = null;
        }
        if (aCLCommonShare != null) {
            return awemeACLShareInfo.getDownloadMaskPanel();
        }
        if (awemeACLShareInfo != null) {
            return awemeACLShareInfo.getDownloadGeneral();
        }
        return null;
    }

    /* renamed from: a */
    private static void m121362a(ACLCommonStruct aCLCommonStruct) {
        C7573i.m23587b(aCLCommonStruct, "aclCommonStruct");
        aCLCommonStruct.setCode(0);
        aCLCommonStruct.setShowType(2);
        aCLCommonStruct.setToastMsg("");
        aCLCommonStruct.setExtra("");
    }

    /* renamed from: a */
    private static int m121360a(ACLCommonShare aCLCommonShare, ACLCommonStruct aCLCommonStruct) {
        if (aCLCommonShare.getCode() == aCLCommonStruct.getCode() && aCLCommonShare.getShowType() == aCLCommonStruct.getShowType() && C7573i.m23585a((Object) aCLCommonShare.getToastMsg(), (Object) aCLCommonStruct.getToastMsg())) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public static final void m121365a(String str, Aweme aweme) {
        ACLCommonShare aCLCommonShare;
        boolean z;
        boolean z2;
        int i;
        String str2;
        if (aweme != null) {
            if (C7573i.m23585a((Object) f98972b, (Object) "long_press_download")) {
                aCLCommonShare = m121367b(aweme);
            } else {
                aCLCommonShare = m121361a(aweme);
            }
            int i2 = 0;
            if (aCLCommonShare == null) {
                aCLCommonShare = new ACLCommonShare();
                z = true;
            } else {
                z = false;
            }
            ACLCommonStruct a = AwemeACLStruct.m121220a();
            if (C43101el.m136718a(a.getToastMsg()) || a.getShowType() != 2) {
                a.setCode(1);
            }
            int a2 = m121360a(aCLCommonShare, a);
            if (a2 != 0 || !C10292j.m30480a().mo25016a(UgDiffDownloadReportOnlyDiff.class, "ug_diff_download_report_only_diff", C6384b.m19835a().mo15294c().getUgDiffDownloadReportOnlyDiff())) {
                C22984d a3 = C22984d.m75611a();
                String str3 = "enter_from";
                CharSequence charSequence = str;
                if (charSequence == null || charSequence.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    str = f98973c;
                }
                a3.mo59973a(str3, str);
                a3.mo59973a("group_id", aweme.getAid());
                a3.mo59973a("download_method", f98972b);
                String str4 = "downloadable_client";
                if (a.getCode() == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                a3.mo59970a(str4, i);
                String str5 = "downloadable_server";
                if (aCLCommonShare.getCode() == 0) {
                    i2 = 1;
                }
                a3.mo59970a(str5, i2);
                a3.mo59970a("client_diff_result", a2);
                a3.mo59973a("download_client_json", C42996by.m136485a(a));
                if (!C10292j.m30480a().mo25016a(UgDiffDownloadUnreportExtra.class, "ug_diff_download_unreport_extra", C6384b.m19835a().mo15294c().getUgDiffDownloadUnreportExtra())) {
                    String str6 = "download_server_json";
                    if (z) {
                        str2 = null;
                    } else {
                        str2 = C42996by.m136485a(aCLCommonShare);
                    }
                    a3.mo59973a(str6, str2);
                    a3.mo59973a("server_extra_json", C42996by.m136485a(new ServerExtra().buildServerExtraJson(aweme)));
                }
                C6907h.m21524a("ug_diff_download", (Map) a3.f60753a);
            }
        }
    }

    /* renamed from: a */
    public static final void m121363a(C38382b bVar, String str, Aweme aweme) {
        C7573i.m23587b(bVar, "builder");
        m121362a(AwemeACLStruct.m121220a());
        f98972b = "share_panel";
        Iterator it = bVar.f99644b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C38389f fVar = (C38389f) it.next();
            if (C7573i.m23585a((Object) fVar.mo95715b(), (Object) "download")) {
                AwemeACLStruct.m121220a().setCode(0);
                int i = 2;
                if (!fVar.mo95718e()) {
                    i = 1;
                }
                AwemeACLStruct.m121220a().setShowType(i);
            } else {
                AwemeACLStruct.m121220a().setShowType(0);
                AwemeACLStruct.m121220a().setCode(1);
            }
        }
        if (AwemeACLStruct.m121220a().getShowType() == 0) {
            m121365a(str, aweme);
        }
    }

    /* renamed from: a */
    public static final void m121366a(boolean z, String str, Aweme aweme) {
        m121362a(AwemeACLStruct.m121220a());
        if (!z) {
            AwemeACLStruct.m121220a().setShowType(0);
            AwemeACLStruct.m121220a().setCode(1);
            f98972b = "long_press_download";
            m121365a(str, aweme);
        }
    }
}
