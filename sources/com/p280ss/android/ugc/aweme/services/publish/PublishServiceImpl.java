package com.p280ss.android.ugc.aweme.services.publish;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.publish.IPublishService.OnGetRecoverDraftCallback;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoPublishService;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39502ax;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VEVideoPublishPreviewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.upload.p1621b.C41441b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.tools.C42130a;
import com.p280ss.android.ugc.aweme.utils.C43072du;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.services.publish.PublishServiceImpl */
public class PublishServiceImpl implements IPublishService {
    C41441b mainOnNewIntentMonitor = new C41441b();

    public Class<? extends Service> getShortVideoPublishServiceClass() {
        return ShortVideoPublishService.class;
    }

    public boolean isVideoPublishPreviewActivity(Context context) {
        return context instanceof VEVideoPublishPreviewActivity;
    }

    private void monitorPublishServiceDestroySuccess(long j) {
        C1592h.m7848a(500).mo6875a((C1591g<TResult, TContinuationResult>) new PublishServiceImpl$$Lambda$1<TResult,TContinuationResult>(j));
    }

    public boolean checkIsAlreadyPublished(Context context) {
        return C39360dw.m125725a().mo97930a(context);
    }

    public boolean inPublishPage(Context context) {
        return C39360dw.m125725a().mo97932b(context);
    }

    public boolean isPublishServiceRunning(Context context) {
        return isMyServiceRunning(context, getShortVideoPublishServiceClass());
    }

    public void setUploadRecoverPath(String str) {
        ((C35622l) C25682d.m84426a(C35563c.f93238a, C35622l.class)).mo60358a(str);
    }

    public void cancelSynthetise(Context context) {
        if (isPublishServiceRunning(context)) {
            C41530am.m132285d("PublishServiceImpl cancelSynthetise");
            long j = C39360dw.m125725a().f102252g;
            if (j == -1) {
                C41530am.m132280a("publish_service_destroy_success:publish start and id = -1");
                C6893q.m21444a("publish_service_destroy_success", -2, (JSONObject) null);
            }
            context.stopService(new Intent(context, getShortVideoPublishServiceClass()));
            monitorPublishServiceDestroySuccess(j);
        }
    }

    static final /* synthetic */ void lambda$null$0$PublishServiceImpl(C27311c cVar, OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
        if (cVar != null) {
            onGetRecoverDraftCallback.onSuccess(cVar);
        } else {
            onGetRecoverDraftCallback.onFail();
        }
    }

    public boolean processPublish(FragmentActivity fragmentActivity, Intent intent) {
        if (!intent.getBooleanExtra("synthetise_only", false)) {
            this.mainOnNewIntentMonitor.mo102095c();
        }
        return C35563c.f93257t.mo83281a(fragmentActivity, intent, getShortVideoPublishServiceClass(), "extra_video_publish_args", "photo_movie_publish_args");
    }

    private boolean isMyServiceRunning(Context context, Class<?> cls) {
        if (context == null) {
            return false;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        List<RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
        if (runningServices == null) {
            return false;
        }
        for (RunningServiceInfo runningServiceInfo : runningServices) {
            if (cls.getName().equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    static final /* synthetic */ Object lambda$monitorPublishServiceDestroySuccess$2$PublishServiceImpl(long j, C1592h hVar) throws Exception {
        boolean z;
        int i = 0;
        if (C39360dw.m125725a().f102252g == j) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder("publish_service_destroy_success:");
        sb.append(!z);
        C41530am.m132280a(sb.toString());
        String str = "publish_service_destroy_success";
        if (z) {
            i = -1;
        }
        C6893q.m21444a(str, i, (JSONObject) null);
        return null;
    }

    public void getRecoverDraftIfHave(Context context, OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
        String b = ((C35622l) C25682d.m84426a(context, C35622l.class)).mo60361b();
        if (TextUtils.isEmpty(b)) {
            onGetRecoverDraftCallback.onFail();
        } else {
            C42130a.m134090a().execute(new PublishServiceImpl$$Lambda$0(b, onGetRecoverDraftCallback));
        }
    }

    public void publishFromDraft(FragmentActivity fragmentActivity, C27311c cVar) {
        String str;
        C43072du.m136630a("upload_start");
        Bundle bundle = new Bundle();
        if (cVar.f72026N == 2) {
            PhotoMovieContext photoMovieContext = cVar.f72034c;
            if (photoMovieContext != null && cVar.f72033b != null) {
                photoMovieContext.mOutputVideoPath = C39810eq.m127462b(".mp4");
                if (photoMovieContext.mMusicPath == null) {
                    str = "";
                } else {
                    str = C39810eq.m127462b(".wav");
                }
                photoMovieContext.mInputAudioPath = str;
                photoMovieContext.challenges = cVar.f72033b.f71935c;
                photoMovieContext.title = cVar.f72033b.f71933a;
                photoMovieContext.structList = cVar.f72033b.f71934b;
                photoMovieContext.isPrivate = cVar.f72013A;
                photoMovieContext.poiId = cVar.mo70167I();
                photoMovieContext.mSaveModel = cVar.mo70166H();
                bundle.putInt("video_type", 0);
                bundle.putParcelable("photo_movie_publish_args", photoMovieContext);
                bundle.putString("shoot_way", photoMovieContext.mShootWay);
            } else {
                return;
            }
        } else {
            new C39502ax("PublishServiceImpl");
            VideoPublishEditModel a = C39502ax.m126170a(cVar);
            a.userClickPublishTime = SystemClock.uptimeMillis();
            bundle.putInt("video_type", 0);
            bundle.putSerializable("extra_video_publish_args", a);
            bundle.putString("shoot_way", a.mShootWay);
        }
        bundle.putBoolean("publish_retry", true);
        ((C35622l) C25682d.m84426a(fragmentActivity, C35622l.class)).mo60358a((String) null);
        Intent intent = new Intent();
        if (C35563c.f93231M.mo93305a(Property.UploadOptimizeForPie)) {
            intent.putExtra("publish_bundle", bundle);
        } else {
            intent.putExtras(bundle);
        }
        processPublish(fragmentActivity, intent);
    }

    public void startPublish(FragmentActivity fragmentActivity, Bundle bundle) {
        C41530am.m132285d("PublishServiceImpl startPublish publish");
        if (bundle.getBoolean("enter_record_from_other_platform", false)) {
            Intent intent = new Intent();
            if (C35563c.f93231M.mo93305a(Property.UploadOptimizeForPie)) {
                intent.putExtra("publish_bundle", bundle);
            } else {
                intent.putExtras(bundle);
            }
            if (bundle.getBoolean("review_video_fast_publish", false)) {
                intent.putExtra("review_video_fast_publish", true);
            }
            processPublish(fragmentActivity, intent);
            fragmentActivity.setResult(-1, intent);
            fragmentActivity.finish();
            return;
        }
        Intent intent2 = new Intent(fragmentActivity, C35563c.f93240c.mo83138e());
        intent2.addFlags(603979776);
        if (C35563c.f93231M.mo93305a(Property.EnableOptimizePublishContainerActivityNotInStack) && !C35563c.f93240c.mo83139f()) {
            intent2.putExtra("enable_optimize_main_not_in_stack", true);
        }
        if (C35563c.f93231M.mo93305a(Property.UploadOptimizeForPie)) {
            intent2.putExtra("publish_bundle", bundle);
        } else {
            intent2.putExtras(bundle);
        }
        if (bundle.getBoolean("review_video_fast_publish", false)) {
            intent2.putExtra("review_video_fast_publish", true);
        }
        this.mainOnNewIntentMonitor.mo102093a();
        fragmentActivity.startActivity(intent2);
    }
}
