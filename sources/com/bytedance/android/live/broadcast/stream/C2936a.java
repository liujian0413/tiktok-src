package com.bytedance.android.live.broadcast.stream;

import android.os.Bundle;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3363ah;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.C8947c;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedString;
import com.p280ss.avframework.livestreamv2.ILiveStream.CatchVideoCallback;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.broadcast.stream.a */
public final class C2936a implements CatchVideoCallback {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f9161a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C2936a.class), "originVideoPath", "getOriginVideoPath()Ljava/lang/String;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C2936a.class), "effectVideoPath", "getEffectVideoPath()Ljava/lang/String;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C2936a.class), "compositeDisposable", "getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;"))};

    /* renamed from: d */
    public static final C2937a f9162d = new C2937a(null);

    /* renamed from: b */
    public final C2429a f9163b;

    /* renamed from: c */
    public final boolean f9164c;

    /* renamed from: e */
    private final C7541d f9165e = C7546e.m23569a(C2942e.f9175a);

    /* renamed from: f */
    private final C7541d f9166f = C7546e.m23569a(C2939c.f9172a);

    /* renamed from: g */
    private final C7541d f9167g = C7546e.m23569a(C2938b.f9171a);

    /* renamed from: h */
    private int f9168h;

    /* renamed from: i */
    private final int f9169i;

    /* renamed from: j */
    private final int f9170j;

    /* renamed from: com.bytedance.android.live.broadcast.stream.a$a */
    public static final class C2937a {
        private C2937a() {
        }

        public /* synthetic */ C2937a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.a$b */
    static final class C2938b extends Lambda implements C7561a<C47562b> {

        /* renamed from: a */
        public static final C2938b f9171a = new C2938b();

        C2938b() {
            super(0);
        }

        /* renamed from: a */
        private static C47562b m11420a() {
            return new C47562b();
        }

        public final /* synthetic */ Object invoke() {
            return m11420a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.a$c */
    static final class C2939c extends Lambda implements C7561a<String> {

        /* renamed from: a */
        public static final C2939c f9172a = new C2939c();

        C2939c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m11421a();
        }

        /* renamed from: a */
        private static String m11421a() {
            StringBuilder sb = new StringBuilder();
            File dir = C3358ac.m12528e().getDir("live_capture_video", 0);
            C7573i.m23582a((Object) dir, "ResUtil.getContext().get…RY, Context.MODE_PRIVATE)");
            sb.append(dir.getAbsolutePath());
            sb.append(File.separator);
            sb.append("effect_video.h264");
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.a$d */
    static final class C2940d extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C2936a f9173a;

        C2940d(C2936a aVar) {
            this.f9173a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m11422a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m11422a() {
            C3166a.m11961b("CaptureVideoUploadController", "origin file update success");
            this.f9173a.mo9671a(new File(this.f9173a.mo9672b()), "2", C29411.f9174a);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.a$e */
    static final class C2942e extends Lambda implements C7561a<String> {

        /* renamed from: a */
        public static final C2942e f9175a = new C2942e();

        C2942e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m11424a();
        }

        /* renamed from: a */
        private static String m11424a() {
            StringBuilder sb = new StringBuilder();
            File dir = C3358ac.m12528e().getDir("live_capture_video", 0);
            C7573i.m23582a((Object) dir, "ResUtil.getContext().get…RY, Context.MODE_PRIVATE)");
            sb.append(dir.getAbsolutePath());
            sb.append(File.separator);
            sb.append("origin_video.h264");
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.a$f */
    static final class C2943f<T> implements C7326g<Integer> {

        /* renamed from: a */
        final /* synthetic */ C2936a f9176a;

        C2943f(C2936a aVar) {
            this.f9176a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Integer num) {
            C3166a.m11961b("CaptureVideoUploadController", "catchVideo");
            Bundle bundle = new Bundle();
            bundle.putInt("mode", 0);
            bundle.putString("outputPathOrigin", this.f9176a.mo9670a());
            bundle.putString("outputPathWithEffect", this.f9176a.mo9672b());
            bundle.putBoolean("hardwareEncode", this.f9176a.f9164c);
            C3338l<Float> lVar = LiveConfigSettingKeys.LIVE_CAPTURE_VIDEO_RECORD_DURATION;
            C7573i.m23582a((Object) lVar, "LiveConfigSettingKeys.LI…URE_VIDEO_RECORD_DURATION");
            Object a = lVar.mo10240a();
            C7573i.m23582a(a, "LiveConfigSettingKeys.LI…DEO_RECORD_DURATION.value");
            bundle.putFloat("duration", ((Number) a).floatValue());
            this.f9176a.f9163b.mo8918a(bundle, (CatchVideoCallback) this.f9176a);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.a$g */
    static final class C2944g<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C2944g f9177a = new C2944g();

        C2944g() {
        }

        /* renamed from: a */
        private static void m11426a(Throwable th) {
            C3166a.m11963b("CaptureVideoUploadController", th);
        }

        public final /* synthetic */ void accept(Object obj) {
            m11426a((Throwable) obj);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.a$h */
    static final class C2945h<T> implements C7326g<C3479d<Object>> {

        /* renamed from: a */
        final /* synthetic */ C7561a f9178a;

        /* renamed from: b */
        final /* synthetic */ File f9179b;

        C2945h(C7561a aVar, File file) {
            this.f9178a = aVar;
            this.f9179b = file;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<Object> dVar) {
            this.f9178a.invoke();
            this.f9179b.delete();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.a$i */
    static final class C2946i<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ File f9180a;

        C2946i(File file) {
            this.f9180a = file;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C3166a.m11963b("CaptureVideoUploadController", th);
            this.f9180a.delete();
        }
    }

    /* renamed from: e */
    private final C47562b m11414e() {
        return (C47562b) this.f9167g.getValue();
    }

    /* renamed from: a */
    public final String mo9670a() {
        return (String) this.f9165e.getValue();
    }

    /* renamed from: b */
    public final String mo9672b() {
        return (String) this.f9166f.getValue();
    }

    public final void onComplete() {
        C3166a.m11961b("CaptureVideoUploadController", "onComplete");
        mo9671a(new File(mo9670a()), "1", new C2940d(this));
    }

    /* renamed from: d */
    public final void mo9674d() {
        C3166a.m11961b("CaptureVideoUploadController", "stop");
        if (!m11414e().isDisposed()) {
            m11414e().dispose();
        }
        try {
            new File(mo9670a()).delete();
            new File(mo9672b()).delete();
        } catch (Throwable th) {
            C3166a.m11963b("CaptureVideoUploadController", th);
        }
    }

    /* renamed from: c */
    public final void mo9673c() {
        C3338l<Float> lVar = LiveConfigSettingKeys.LIVE_CAPTURE_VIDEO_RECORD_DURATION;
        C7573i.m23582a((Object) lVar, "LiveConfigSettingKeys.LI…URE_VIDEO_RECORD_DURATION");
        if (((Number) lVar.mo10240a()).floatValue() <= 0.0f) {
            C8947c<Long> cVar = C8946b.f24496z;
            C7573i.m23582a((Object) cVar, "LivePluginProperties.LIV…M_VIDEO_CAPTURE_LAST_TIME");
            cVar.mo22118a(Long.valueOf(0));
            return;
        }
        C8947c<Long> cVar2 = C8946b.f24496z;
        C7573i.m23582a((Object) cVar2, "LivePluginProperties.LIV…M_VIDEO_CAPTURE_LAST_TIME");
        Object a = cVar2.mo22117a();
        C7573i.m23582a(a, "LivePluginProperties.LIV…O_CAPTURE_LAST_TIME.value");
        if (!C3363ah.m12542a(((Number) a).longValue())) {
            this.f9168h = 0;
            m11414e().mo119661a(C7492s.m23301b(Integer.valueOf(1)).mo19320e(60, TimeUnit.SECONDS).mo19280a((C7326g<? super T>) new C2943f<Object>(this), (C7326g<? super Throwable>) C2944g.f9177a));
        }
    }

    public final void onError(int i, String str) {
        StringBuilder sb = new StringBuilder("error code:");
        sb.append(i);
        sb.append(" error msg:");
        sb.append(str);
        C3166a.m11966e("CaptureVideoUploadController", sb.toString());
    }

    /* renamed from: a */
    public final void mo9671a(File file, String str, C7561a<C7581n> aVar) {
        if (file.exists() && file.isFile()) {
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            multipartTypedOutput.addPart("video_type", new TypedString(str));
            multipartTypedOutput.addPart("file_type", new TypedString("4"));
            multipartTypedOutput.addPart("pixel_x", new TypedString(String.valueOf(this.f9169i)));
            multipartTypedOutput.addPart("pixel_y", new TypedString(String.valueOf(this.f9170j)));
            multipartTypedOutput.addPart("data_size", new TypedString(String.valueOf(file.length())));
            multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", file));
            m11414e().mo119661a(C2515f.m10417f().mo9076c().mo9169d().updateCaptureVideo(multipartTypedOutput).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C2945h<Object>(aVar, file), (C7326g<? super Throwable>) new C2946i<Object>(file)));
        }
    }

    public C2936a(C2429a aVar, int i, int i2, boolean z) {
        C7573i.m23587b(aVar, "liveStream");
        this.f9163b = aVar;
        this.f9169i = i;
        this.f9170j = i2;
        this.f9164c = z;
    }
}
