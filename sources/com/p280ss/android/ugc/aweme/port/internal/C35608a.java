package com.p280ss.android.ugc.aweme.port.internal;

import android.app.Activity;
import android.content.Intent;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.hitrank.C26678c;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.festival.christmas.C29135b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p280ss.android.ugc.aweme.shortvideo.VideoPublishException;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39328f;
import com.p280ss.android.ugc.aweme.story.model.C42001b;
import com.p280ss.android.ugc.aweme.utils.C42960ay;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.port.internal.a */
public final class C35608a {

    /* renamed from: a */
    private FragmentActivity f93296a;

    /* renamed from: b */
    private boolean f93297b;

    /* renamed from: a */
    public static void m115033a() {
        C42961az.m136380a(new C39328f(2));
    }

    public C35608a(FragmentActivity fragmentActivity) {
        boolean z;
        this.f93296a = fragmentActivity;
        if (!(fragmentActivity instanceof MainActivity)) {
            z = true;
        } else {
            z = false;
        }
        this.f93297b = z;
    }

    /* renamed from: a */
    private void m115035a(Aweme aweme, C39328f fVar) {
        if (C29135b.m95583a((Activity) this.f93296a, aweme)) {
            fVar.f102155i = true;
        }
    }

    /* renamed from: a */
    private static void m115036a(CreateAwemeResponse createAwemeResponse, Object obj, Aweme aweme) {
        LocalVideoPlayerManager.m137195a().mo104993a(((PhotoMovieContext) obj).mOutputVideoPath, aweme);
        C39328f fVar = new C39328f(10, 100, aweme);
        fVar.f102154h = createAwemeResponse;
        C42961az.m136380a(fVar);
    }

    /* renamed from: c */
    private void m115038c(CreateAwemeResponse createAwemeResponse, Object obj, Aweme aweme) {
        PhotoContext photoContext = (PhotoContext) obj;
        Intent intent = new Intent(this.f93296a, ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService().mo83137d());
        intent.setFlags(335544320);
        intent.putExtra("aweme", aweme);
        intent.putExtra("aweme_response", createAwemeResponse);
        intent.putExtra("photoContext", photoContext);
        intent.putExtra("video_type", 5);
        this.f93296a.startActivity(intent);
    }

    /* renamed from: a */
    private void m115034a(FragmentActivity fragmentActivity, int i, VideoPublishException videoPublishException) {
        String str;
        String string;
        C42961az.m136380a(new C42001b(1, null, null, null));
        if (videoPublishException.isCauseByApiServerException()) {
            str = ((ApiServerException) videoPublishException.getCause()).getErrorMsg();
        } else {
            str = null;
        }
        if (i != 5) {
            if (videoPublishException.isCauseByNoSpaceLeft()) {
                string = fragmentActivity.getString(R.string.at0);
            } else {
                if (TextUtils.isEmpty(str)) {
                    string = fragmentActivity.getString(R.string.d9c);
                }
                C39328f fVar = new C39328f(9, 99, null, str);
                fVar.f102152f = videoPublishException.isRecover();
                fVar.f102153g = videoPublishException.isCauseByApiServerException();
                C42961az.m136380a(fVar);
            }
            str = string;
            C39328f fVar2 = new C39328f(9, 99, null, str);
            fVar2.f102152f = videoPublishException.isRecover();
            fVar2.f102153g = videoPublishException.isCauseByApiServerException();
            C42961az.m136380a(fVar2);
        } else if (TextUtils.isEmpty(str)) {
            str = fragmentActivity.getString(R.string.fky);
        }
        if (this.f93297b) {
            C10761a.m31396b(fragmentActivity.getApplicationContext(), str, 0).mo25750a();
        }
    }

    /* renamed from: b */
    private void m115037b(CreateAwemeResponse createAwemeResponse, Object obj, Aweme aweme) {
        String str;
        LocalVideoPlayerManager.m137195a().mo104993a(((IAVService) ServiceManager.get().getService(IAVService.class)).videoModelCoverService().converToExposureData(obj).getOutPutFile(), aweme);
        C39328f fVar = new C39328f(10, 100, aweme);
        fVar.f102154h = createAwemeResponse;
        m115035a(aweme, fVar);
        fVar.f102156j = ((IAVService) ServiceManager.get().getService(IAVService.class)).videoModelCoverService().converToExposureData(obj).getShootWay();
        if (fVar.f102155i) {
            C42961az.m136381b(fVar);
        } else {
            C42961az.m136380a(fVar);
        }
        if (this.f93297b) {
            C10761a.m31392b(this.f93296a.getApplicationContext(), (int) R.string.fku, 0).mo25750a();
        }
        String str2 = "video_publish_done";
        C22984d a = C22984d.m75611a().mo59973a("creation_id", ((IAVService) ServiceManager.get().getService(IAVService.class)).videoModelCoverService().converToExposureData(obj).getCreationId());
        String str3 = "group_id";
        if (createAwemeResponse.aweme == null) {
            str = "";
        } else {
            str = createAwemeResponse.aweme.getAid();
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
    }

    /* renamed from: a */
    public final void mo90419a(CreateAwemeResponse createAwemeResponse, int i, Object obj) {
        StringBuilder sb = new StringBuilder("onSuccess ");
        sb.append(i);
        sb.append(" and response is ");
        sb.append(createAwemeResponse.status_code);
        sb.append(" extra is ");
        sb.append(createAwemeResponse.extra);
        C6921a.m21555a(sb.toString());
        Aweme aweme = createAwemeResponse.aweme;
        C42961az.m136380a(new C42001b(0, null, null, null));
        C42001b bVar = new C42001b(2, null, null, aweme);
        bVar.f109103g = createAwemeResponse.notify;
        bVar.f109104h = createAwemeResponse.notifyExtra;
        boolean z = obj instanceof BaseShortVideoContext;
        if (z) {
            bVar.f109102f = ((BaseShortVideoContext) obj).mSyncPlatforms;
        } else if (obj instanceof PhotoContext) {
            bVar.f109102f = ((PhotoContext) obj).mSyncPlatforms;
        }
        if (createAwemeResponse.isReviewVideo == 1 || createAwemeResponse.hasStickerRedPacket) {
            bVar.f109103g = new String[0];
            bVar.f109102f = null;
            bVar.f109104h = null;
        }
        C42961az.m136380a(bVar);
        C42961az.m136381b(new C28318an(15, aweme));
        C24436a.m80356a().feedbackQueryAweme(aweme, "publish");
        C42960ay.m136379a();
        StringBuilder sb2 = new StringBuilder("result is ");
        sb2.append(aweme);
        C6921a.m21555a(sb2.toString());
        if (aweme == null) {
            StringBuilder sb3 = new StringBuilder("videoType:");
            sb3.append(i);
            sb3.append("response: ");
            sb3.append(createAwemeResponse.status_code);
            sb3.append(" ");
            sb3.append(createAwemeResponse.extra);
            C6877n.m21447a("aweme_publish_error", C6869c.m21381a().mo16887a("user_info", sb3.toString()).mo16888b());
        }
        if (z) {
            C26678c.m87647a((BaseShortVideoContext) obj);
        }
        if (i != 0) {
            switch (i) {
                case 5:
                    m115038c(createAwemeResponse, obj, aweme);
                    return;
                case 6:
                    m115036a(createAwemeResponse, obj, aweme);
                    break;
            }
            return;
        }
        m115037b(createAwemeResponse, obj, aweme);
    }

    /* renamed from: a */
    public final void mo90420a(VideoPublishException videoPublishException, int i, Object obj) {
        StringBuilder sb = new StringBuilder("onError ");
        sb.append(i);
        sb.append(" and args is ");
        sb.append(obj);
        C6921a.m21555a(sb.toString());
        m115034a(this.f93296a, i, videoPublishException);
    }
}
