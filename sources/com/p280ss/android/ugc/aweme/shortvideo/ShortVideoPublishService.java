package com.p280ss.android.ugc.aweme.shortvideo;

import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import bolts.C1592h;
import com.C1642a;
import com.google.common.base.C17462u;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.photo.publish.C34788e;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39777p;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C39604b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractTrackPage;
import com.p280ss.android.ugc.aweme.shortvideo.p1582m.C40054a;
import com.p280ss.android.ugc.aweme.shortvideo.p1582m.C40055b;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40232d;
import com.p280ss.android.ugc.aweme.shortvideo.upload.UploadException;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.utils.C43072du;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishService */
public class ShortVideoPublishService extends Service implements C40023l<C38455ap> {

    /* renamed from: a */
    C40054a f99798a;

    /* renamed from: b */
    ArrayList<C40023l> f99799b = new ArrayList<>();

    /* renamed from: c */
    Object f99800c;

    /* renamed from: d */
    int f99801d;

    /* renamed from: e */
    String f99802e;

    /* renamed from: f */
    boolean f99803f;

    /* renamed from: g */
    boolean f99804g;

    /* renamed from: h */
    public String f99805h;

    /* renamed from: i */
    public int f99806i;

    /* renamed from: j */
    public boolean f99807j;

    /* renamed from: k */
    Factory f99808k = ((Factory) ServiceManager.get().getService(Factory.class));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishService$Factory */
    public interface Factory {
        Object buildArgs(int i, Bundle bundle);

        C40023l<? extends C38455ap> buildCallback(int i, Object obj);

        C39825f buildFutureFactory(int i, int i2, Bundle bundle);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishService$a */
    public class C38406a extends Binder implements C40232d {
        /* renamed from: a */
        public final Object mo96190a() {
            return ShortVideoPublishService.this.f99800c;
        }

        /* renamed from: b */
        public final int mo96192b() {
            return ShortVideoPublishService.this.f99801d;
        }

        /* renamed from: c */
        public final Bitmap mo96194c() {
            if (ShortVideoPublishService.this.f99798a != null) {
                return ShortVideoPublishService.this.f99798a.mo99497c(ShortVideoPublishService.this.f99800c);
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final /* synthetic */ Object mo96195d() throws Exception {
            ShortVideoPublishService.this.onError(new VideoPublishException(new Throwable("Video has failed to upload")));
            return null;
        }

        private C38406a() {
        }

        /* renamed from: b */
        public final void mo96193b(C40023l lVar) {
            C41530am.m132285d("ShortVideoPublishService unregisterCallback");
            ShortVideoPublishService.this.f99799b.remove(lVar);
        }

        /* renamed from: a */
        public final void mo96191a(C40023l lVar) {
            if (lVar != null) {
                C41530am.m132285d("ShortVideoPublishService registerCallback");
                ShortVideoPublishService.this.f99799b.add(lVar);
                if (ShortVideoPublishService.this.f99804g) {
                    C1592h.m7855a((Callable<TResult>) new C39862fd<TResult>(this), C1592h.f5958b);
                    return;
                }
                if (ShortVideoPublishService.this.f99806i > 0) {
                    lVar.onProgressUpdate(ShortVideoPublishService.this.f99806i, ShortVideoPublishService.this.f99807j);
                }
            }
        }
    }

    /* renamed from: a */
    private Bundle m122735a() {
        Bundle bundle = new Bundle();
        bundle.putString("shoot_way", this.f99802e);
        return bundle;
    }

    public void onDestroy() {
        C41530am.m132285d("ShortVideoPublishService onDestroy");
        if (this.f99798a != null) {
            this.f99798a.mo99494a();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private static String m122736a(Intent intent) {
        return intent.getStringExtra("shoot_way");
    }

    /* renamed from: b */
    private boolean m122741b(VideoPublishException videoPublishException) {
        if (this.f99801d == 6 || this.f99801d == 0) {
            return true;
        }
        return false;
    }

    public IBinder onBind(Intent intent) {
        C41530am.m132285d("ShortVideoPublishService onBind");
        return new C38406a();
    }

    public void onSynthetiseSuccess(String str) {
        Iterator it = new ArrayList(this.f99799b).iterator();
        while (it.hasNext()) {
            ((C40023l) it.next()).onSynthetiseSuccess(str);
        }
    }

    /* renamed from: a */
    private void m122738a(Serializable serializable) {
        if (serializable instanceof VideoPublishEditModel) {
            final VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializable;
            if (videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isMultiVideoEdit()) {
                this.f99805h = C39777p.m127353a();
                C1592h.m7853a((Callable<TResult>) new Callable<Object>() {
                    public final Object call() throws Exception {
                        String str;
                        if (videoPublishEditModel.isMvThemeVideoType()) {
                            str = videoPublishEditModel.mvCreateVideoData.videoCoverImgPath;
                        } else {
                            str = videoPublishEditModel.multiEditVideoRecordData.coverImagePath;
                        }
                        C7276d.m22820d(str, ShortVideoPublishService.this.f99805h);
                        return null;
                    }
                });
            } else if (videoPublishEditModel.isStatusVideoType()) {
                this.f99805h = C39777p.m127353a();
                C1592h.m7853a((Callable<TResult>) new Callable<Object>() {
                    public final Object call() throws Exception {
                        C7276d.m22820d(videoPublishEditModel.statusCreateVideoData.getVideoCoverImgPath(), ShortVideoPublishService.this.f99805h);
                        return null;
                    }
                });
            } else {
                this.f99805h = videoPublishEditModel.getValidVideoCoverPath();
            }
        }
    }

    /* renamed from: a */
    private void m122737a(C38455ap apVar) {
        if (apVar != null && apVar.mSaveModel != null && apVar.mSaveModel.isSaveLocal()) {
            String str = "";
            AVAweme a = C35563c.f93221C.mo83254a(apVar);
            if (a != null) {
                str = a.aid;
            }
            String str2 = "";
            if (this.f99801d == 0 && this.f99800c != null && (this.f99800c instanceof VideoPublishEditModel)) {
                str2 = C39500av.m126133a((VideoPublishEditModel) this.f99800c);
            } else if (this.f99801d == 6) {
                str2 = "slideshow";
            }
            C6907h.m21524a("download_publish_finish", (Map) new C22984d().mo59970a("scene_id", (int) LiveRoomStruct.ROOM_LONGTIME_NO_NET).mo59973a("group_id", str).mo59973a("content_type", str2).mo59973a("download_type", "self").mo59973a("download_method", "download_with_publish").f60753a);
        }
    }

    /* renamed from: a */
    private static boolean m122740a(VideoPublishException videoPublishException) {
        Throwable cause = videoPublishException.getCause();
        if ((cause instanceof SynthetiseException) && ((SynthetiseException) cause).getCode() == SynthetiseException.SYNTHETIC_CANCEL_CODE) {
            return true;
        }
        if (!(cause instanceof UploadException) || ((UploadException) cause).getErrorCode() != -39993) {
            return false;
        }
        return true;
    }

    public void onError(VideoPublishException videoPublishException) {
        StringBuilder sb = new StringBuilder("ShortVideoPublishService onError ");
        sb.append(videoPublishException.getMessage());
        C41530am.m132285d(sb.toString());
        boolean a = m122740a(videoPublishException);
        if (!a && m122741b(videoPublishException)) {
            videoPublishException.setRecover(true);
        }
        C6893q.m21452b("aweme_movie_publish_log", "publish_error", new C6909j().mo16966a("exception", C17462u.m58024b(videoPublishException)).mo16967a());
        if (this.f99801d == 0) {
            m122739a(((VideoPublishEditModel) this.f99800c).creationId, false);
        } else if (this.f99801d == 6) {
            m122739a(((PhotoMovieContext) this.f99800c).creationId, false);
        }
        Iterator it = new ArrayList(this.f99799b).iterator();
        while (it.hasNext()) {
            ((C40023l) it.next()).onError(videoPublishException);
        }
        if (!a) {
            ShareContext a2 = C35563c.f93259v.mo83145a(this.f99800c);
            if (C35563c.f93259v.mo83150a(a2)) {
                C35563c.f93259v.mo83147a(null, a2, "", 20016);
            }
        }
        if (videoPublishException.isFJ()) {
            C43072du.m136632a("upload_error", "FJ", videoPublishException.getMessage());
        } else if (a) {
            C43072du.m136641c("compose_cancel");
        } else if ("合成".equals(videoPublishException.getStage())) {
            C43072du.m136632a("compose_error", "1", videoPublishException.getMessage());
        } else {
            C43072du.m136633a("upload_error", "1", videoPublishException.getMessage(), videoPublishException.getStage());
        }
        this.f99804g = true;
        stopSelf();
    }

    /* renamed from: a */
    private void m122739a(String str, boolean z) {
        if (this.f99803f) {
            C6907h.m21524a("publish_retry_status", (Map) C22984d.m75611a().mo59970a("is_success", z ? 1 : 0).mo59973a("creation_id", str).f60753a);
        }
    }

    public void onProgressUpdate(int i, boolean z) {
        this.f99806i = i;
        this.f99807j = z;
        Iterator it = new ArrayList(this.f99799b).iterator();
        while (it.hasNext()) {
            ((C40023l) it.next()).onProgressUpdate(i, z);
        }
    }

    public void onSuccess(C38455ap apVar, boolean z) {
        StringBuilder sb = new StringBuilder("service args is ");
        sb.append(this.f99800c);
        sb.append(" videoType is ");
        sb.append(this.f99801d);
        sb.append(" onSuccess start ");
        sb.append(this.f99799b.size());
        C6921a.m21555a(sb.toString());
        if (this.f99801d == 0) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.f99800c;
            C35563c.f93257t.mo83277a((BaseResponse) apVar, videoPublishEditModel.getVideoLength());
            C35563c.f93257t.mo83278a((BaseResponse) apVar, C39604b.m126718b(videoPublishEditModel.getMainBusinessContext(), InteractTrackPage.TRACK_PAGE_EDIT));
            apVar.videoCoverPath = this.f99805h;
        }
        Iterator it = new ArrayList(this.f99799b).iterator();
        while (it.hasNext()) {
            ((C40023l) it.next()).onSuccess(apVar, z);
        }
        m122737a(apVar);
        C6909j jVar = new C6909j();
        if (this.f99801d == 0) {
            VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) this.f99800c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(videoPublishEditModel2.videoWidth());
            sb2.append("x");
            sb2.append(videoPublishEditModel2.videoHeight());
            jVar.mo16966a("bitrate", String.valueOf(C36964i.m118929e())).mo16966a("duration", String.valueOf(videoPublishEditModel2.getVideoLength())).mo16966a("resolution", sb2.toString()).mo16966a("shoot_way", this.f99802e);
            m122739a(videoPublishEditModel2.creationId, true);
        } else if (this.f99801d == 6) {
            PhotoMovieContext photoMovieContext = (PhotoMovieContext) this.f99800c;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(photoMovieContext.mWidth);
            sb3.append("x");
            sb3.append(photoMovieContext.mHeight);
            jVar.mo16966a("bitrate", String.valueOf(C36964i.m118929e())).mo16966a("duration", String.valueOf(photoMovieContext.getVideoLength())).mo16966a("resolution", sb3.toString()).mo16966a("shoot_way", this.f99802e);
            m122739a(photoMovieContext.creationId, true);
        }
        C35563c.f93259v.mo83152b(this.f99800c);
        C6907h.onEvent(MobClick.obtain().setEventName("publish").setLabelName("finish").setJsonObject(jVar.mo16967a()));
        C43072du.m136637b("upload_success");
        StringBuilder sb4 = new StringBuilder("service args is ");
        sb4.append(this.f99800c);
        sb4.append(" videoType is ");
        sb4.append(this.f99801d);
        sb4.append(" before stop");
        C6921a.m21555a(sb4.toString());
        stopSelf();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        C41530am.m132285d("ShortVideoPublishService onStartCommand");
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (intent == null) {
            return onStartCommand;
        }
        this.f99802e = m122736a(intent);
        this.f99803f = intent.getBooleanExtra("publish_retry", false);
        Bundle a = m122735a();
        if (intent.hasExtra("extra_photo_publish_args")) {
            a.putSerializable("args", (PhotoContext) intent.getSerializableExtra("extra_photo_publish_args"));
            a.putInt("video_type", 5);
        } else if (intent.hasExtra("extra_video_publish_args")) {
            Serializable serializableExtra = intent.getSerializableExtra("extra_video_publish_args");
            m122738a(serializableExtra);
            a.putSerializable("args", serializableExtra);
            a.putInt("video_type", 0);
            if (intent.getBooleanExtra("review_video_fast_publish", false)) {
                a.putBoolean("review_video_fast_publish", true);
            }
        } else if (intent.hasExtra("photo_movie_publish_args")) {
            a.putParcelable("args", intent.getParcelableExtra("photo_movie_publish_args"));
            a.putInt("video_type", 6);
        } else if (intent.hasExtra("story_args")) {
            int intExtra = intent.getIntExtra("story_type", -1);
            if (C34788e.m112192d(intExtra)) {
                a.putSerializable("args", intent.getSerializableExtra("story_args"));
                a.putInt("video_type", intExtra);
            } else {
                StringBuilder sb = new StringBuilder("publish service not supported this publish ");
                sb.append(intExtra);
                throw new AssertionError(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("publish service not supported this publish ");
            sb2.append(intent);
            throw new AssertionError(sb2.toString());
        }
        if (intent.getBooleanExtra("synthetise_only", false)) {
            a.putBoolean("synthetise_only", true);
        }
        if (intent.getBooleanExtra("parallel_synthesize_upload", false)) {
            a.putBoolean("parallel_synthesize_upload", true);
            i3 = 1;
        } else {
            i3 = 0;
        }
        this.f99801d = a.getInt("video_type");
        this.f99800c = this.f99808k.buildArgs(this.f99801d, a);
        C39825f buildFutureFactory = this.f99808k.buildFutureFactory(this.f99801d, i3, a);
        C41530am.m132280a(C1642a.m8035a(Locale.US, "Publisher VideoType:%d UploadType:%d factory:%s", new Object[]{Integer.valueOf(this.f99801d), Integer.valueOf(i3), buildFutureFactory.getClass().getCanonicalName()}));
        C40023l buildCallback = this.f99808k.buildCallback(this.f99801d, this.f99800c);
        if (buildCallback != null) {
            this.f99799b.add(buildCallback);
        }
        if (this.f99798a == null) {
            C40055b bVar = new C40055b(buildFutureFactory, this.f99801d, i3, a.getString("shoot_way"), this);
            this.f99798a = bVar;
        }
        if (!C35563c.f93230L.mo93342a(Property.ReviewVideoFastPublish) || !a.getBoolean("review_video_fast_publish") || this.f99803f) {
            if (!a.getBoolean("synthetise_only")) {
                this.f99798a.mo99496b(this.f99800c);
            } else {
                this.f99798a.mo99495a(this.f99800c);
            }
        } else if (!a.getBoolean("synthetise_only")) {
            this.f99798a.mo99498d(this.f99800c);
        } else {
            C41530am.m132280a("disable prePublish for review video fast publish");
        }
        return 2;
    }
}
