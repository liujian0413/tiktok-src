package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.share.C37974ak;
import com.p280ss.android.ugc.aweme.share.C38251s;
import com.p280ss.android.ugc.aweme.sharer.C38359j;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38307i;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38309j;
import com.p280ss.android.ugc.aweme.shortvideo.C38455ap;
import com.p280ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p280ss.android.ugc.aweme.utils.C42972bf;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.aq */
public final class C41537aq {
    /* renamed from: a */
    public static boolean m132297a(C38455ap apVar, Activity activity) {
        new C41537aq();
        return m132298b(apVar, activity);
    }

    /* renamed from: b */
    private static boolean m132298b(C38455ap apVar, Activity activity) {
        if (apVar == null || !(apVar instanceof CreateAwemeResponse)) {
            return false;
        }
        CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) apVar;
        AVUploadSaveModel aVUploadSaveModel = createAwemeResponse.mSaveModel;
        if (aVUploadSaveModel == null || !aVUploadSaveModel.isSaveLocal() || !new File(aVUploadSaveModel.getLocalFinalPath()).exists()) {
            return false;
        }
        String str = "instagram_story";
        if (aVUploadSaveModel.getSaveType() == 2) {
            str = "instagram";
        }
        if (C38251s.m122194a(createAwemeResponse.aweme, str)) {
            String localFinalPath = aVUploadSaveModel.getLocalFinalPath();
            File file = new File(localFinalPath);
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
            C7276d.m22820d(localFinalPath, sb4);
            int a = C38251s.m122192a(sb4, localFinalPath);
            C7276d.m22816c(sb4);
            if (a != 0) {
                C37974ak.m121279a(Integer.valueOf(a));
                C10761a.m31399c((Context) activity, (int) R.string.a97).mo25750a();
                return false;
            }
        }
        if (aVUploadSaveModel.getSaveType() == 2) {
            C38307i iVar = new C38307i();
            if (iVar.mo95743a(activity)) {
                String localFinalPath2 = aVUploadSaveModel.getLocalFinalPath();
                iVar.mo95746a(new C38359j(C42972bf.m136419a((Context) activity, new File(localFinalPath2)), localFinalPath2), (Context) activity);
                C6907h.m21524a("share_video", (Map) C22984d.m75611a().mo59973a("scene_id", "1013").mo59973a("platform", "instagram").mo59973a("group_id", createAwemeResponse.aweme.getAid()).mo59973a("enter_from", "video_post_page").mo59973a("share_mode", "download_then_share").mo59973a("content_type", "video").f60753a);
            }
            return true;
        }
        C38309j jVar = new C38309j();
        if (aVUploadSaveModel.getSaveType() != 3 || !jVar.mo95743a(activity)) {
            return false;
        }
        new C10741a(activity).mo25649a((int) R.string.ok).mo25657b((int) R.string.oj).mo25658b((int) R.string.ve, (OnClickListener) null).mo25650a((int) R.string.d9_, (OnClickListener) new C41538ar(aVUploadSaveModel, activity, createAwemeResponse, jVar)).mo25656a().mo25637a();
        C6907h.m21524a("share_notice_after_post", (Map) C22984d.m75611a().mo59973a("enter_from", "video_post_page").mo59973a("platform", "instagram_story").f60753a);
        return true;
    }

    /* renamed from: a */
    static final /* synthetic */ void m132296a(AVUploadSaveModel aVUploadSaveModel, Activity activity, CreateAwemeResponse createAwemeResponse, C38309j jVar, DialogInterface dialogInterface, int i) {
        if (aVUploadSaveModel.getSaveType() == 3) {
            String localFinalPath = aVUploadSaveModel.getLocalFinalPath();
            C38359j jVar2 = new C38359j(C42972bf.m136419a((Context) activity, new File(localFinalPath)), localFinalPath);
            jVar2.mo95938a("content_url", createAwemeResponse.aweme.getShareInfo().getShareUrl());
            jVar2.mo95938a("media_type", "video/mp4");
            jVar.mo95746a(jVar2, (Context) activity);
            C6907h.m21524a("share_video", (Map) C22984d.m75611a().mo59973a("scene_id", "1013").mo59973a("platform", "instagram_story").mo59973a("group_id", createAwemeResponse.aweme.getAid()).mo59973a("enter_from", "video_post_page").mo59973a("share_mode", "download_then_share").mo59973a("content_type", "video").f60753a);
        }
    }
}
