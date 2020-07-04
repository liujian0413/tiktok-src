package com.p280ss.android.ugc.aweme.image;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import bolts.C1592h;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12091a;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12131l;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.p610a.C12092a;
import com.bytedance.lighten.core.p612c.C12105c;
import com.bytedance.lighten.core.p612c.C12107e;
import com.bytedance.lighten.core.p612c.C12112j;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1062f.C23332a;
import com.p280ss.android.ugc.aweme.experiment.DynamicCoverOptimizeExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.framework.p1275d.C29958a;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.image.b */
public final class C32029b {

    /* renamed from: a */
    public static final C32029b f83787a = new C32029b();

    /* renamed from: com.ss.android.ugc.aweme.image.b$a */
    static final class C32030a implements C12107e {

        /* renamed from: a */
        final /* synthetic */ boolean f83788a;

        /* renamed from: b */
        final /* synthetic */ C12092a f83789b;

        /* renamed from: c */
        final /* synthetic */ Video f83790c;

        C32030a(boolean z, C12092a aVar, Video video) {
            this.f83788a = z;
            this.f83789b = aVar;
            this.f83790c = video;
        }

        /* renamed from: a */
        public final void mo29805a(final int i, int[] iArr) {
            C1592h.m7855a((Callable<TResult>) new Callable(this) {

                /* renamed from: a */
                final /* synthetic */ C32030a f83791a;

                {
                    this.f83791a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    if (this.f83791a.f83788a && i >= 6 && !this.f83791a.f83789b.mo29784a() && this.f83791a.f83790c.getPlayAddr() != null) {
                        VideoUrlModel playAddr = this.f83791a.f83790c.getPlayAddr();
                        C7573i.m23582a((Object) playAddr, "video.playAddr");
                        if (!TextUtils.isEmpty(playAddr.getUri())) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("frames", i);
                                VideoUrlModel playAddr2 = this.f83791a.f83790c.getPlayAddr();
                                C7573i.m23582a((Object) playAddr2, "video.playAddr");
                                jSONObject.put("vid", playAddr2.getUri());
                                jSONObject.put("url", this.f83791a.f83789b.f32193a.get(0));
                                C6893q.m21447a("aweme_animated_image_frames_error", jSONObject);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    return null;
                }
            }, (Executor) C7258h.m22732e());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.image.b$b */
    public static final class C32032b extends C12105c {

        /* renamed from: a */
        final /* synthetic */ SmartImageView f83793a;

        /* renamed from: b */
        final /* synthetic */ boolean f83794b;

        /* renamed from: c */
        final /* synthetic */ C12092a f83795c;

        /* renamed from: d */
        final /* synthetic */ Video f83796d;

        /* renamed from: a */
        public final void mo29812a(Uri uri, View view, Throwable th) {
            String str;
            if (this.f83794b && !this.f83795c.mo29784a() && this.f83796d.getPlayAddr() != null) {
                VideoUrlModel playAddr = this.f83796d.getPlayAddr();
                C7573i.m23582a((Object) playAddr, "video.playAddr");
                if (!TextUtils.isEmpty(playAddr.getUri())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("frames", -1);
                        VideoUrlModel playAddr2 = this.f83796d.getPlayAddr();
                        C7573i.m23582a((Object) playAddr2, "video.playAddr");
                        jSONObject.put("vid", playAddr2.getUri());
                        jSONObject.put("url", this.f83795c.f32193a.get(0));
                        String str2 = "errMsg";
                        if (th != null) {
                            str = th.getMessage();
                        } else {
                            str = null;
                        }
                        jSONObject.put(str2, str);
                        C6893q.m21447a("aweme_animated_image_frames_error", jSONObject);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        C32032b(SmartImageView smartImageView, boolean z, C12092a aVar, Video video) {
            this.f83793a = smartImageView;
            this.f83794b = z;
            this.f83795c = aVar;
            this.f83796d = video;
        }

        /* renamed from: a */
        public final void mo29811a(Uri uri, View view, C12131l lVar, Animatable animatable) {
            this.f83793a.setUserVisibleHint(true);
            this.f83793a.mo29861b();
        }
    }

    private C32029b() {
    }

    /* renamed from: a */
    private static boolean m104006a() {
        boolean z;
        if (VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        return C23332a.m76559b("aweme_app", "use_dynamic_cover", z);
    }

    /* renamed from: a */
    private final boolean m104007a(Context context) {
        if ((!C6399b.m19944t() || !C7188c.m22428a()) && ((!C32033c.m104014a(context) || C29958a.m98225a(context)) && m104006a())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m104008a(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        }
        for (String isEmpty : urlModel.getUrlList()) {
            if (!TextUtils.isEmpty(isEmpty)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo83005a(SmartImageView smartImageView, Video video, String str) {
        C7573i.m23587b(smartImageView, "coverView");
        C7573i.m23587b(video, "video");
        C7573i.m23587b(str, "sceneTag");
        if (!m104007a(C6399b.m19921a())) {
            return false;
        }
        int a = C6384b.m19835a().mo15287a(DynamicCoverOptimizeExperiment.class, true, "dynamic_cover_style", C6384b.m19835a().mo15295d().dynamic_cover_style, 0);
        if (a == 0 && m104008a(video.getDynamicCover())) {
            UrlModel dynamicCover = video.getDynamicCover();
            C7573i.m23582a((Object) dynamicCover, "video.dynamicCover");
            m104005a(smartImageView, dynamicCover, video, false, str, "");
            return true;
        } else if (a != 1 || !m104008a(video.getDynamicCover())) {
            if (a == 2) {
                if (m104008a(video.getAnimatedCover())) {
                    UrlModel animatedCover = video.getAnimatedCover();
                    C7573i.m23582a((Object) animatedCover, "video.animatedCover");
                    m104005a(smartImageView, animatedCover, video, true, str, "6frames");
                    return true;
                } else if (m104008a(video.getDynamicCover())) {
                    UrlModel dynamicCover2 = video.getDynamicCover();
                    C7573i.m23582a((Object) dynamicCover2, "video.dynamicCover");
                    m104005a(smartImageView, dynamicCover2, video, false, str, "9frames_test");
                    return true;
                }
            }
            return false;
        } else {
            UrlModel dynamicCover3 = video.getDynamicCover();
            C7573i.m23582a((Object) dynamicCover3, "video.dynamicCover");
            m104005a(smartImageView, dynamicCover3, video, false, str, "9frames");
            return true;
        }
    }

    /* renamed from: a */
    private static void m104005a(SmartImageView smartImageView, UrlModel urlModel, Video video, boolean z, String str, String str2) {
        int i;
        String str3;
        if (z) {
            i = C32055q.f83841e.f32190b;
        } else {
            C12091a aVar = C12091a.f32189a;
            C7573i.m23582a((Object) aVar, "AnimationFrameScheduler.DEFAULT_FRAME_SCHEDULER");
            i = aVar.f32190b;
        }
        C12092a a = C23400r.m76741a(urlModel);
        C7573i.m23582a((Object) a, "UrlModelConverter.convert(model)");
        if (!TextUtils.isEmpty(str2) && !a.mo29784a()) {
            List<String> list = a.f32193a;
            C7573i.m23582a((Object) list, "convertedUrlModel.urls");
            Iterable<String> iterable = list;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (String str4 : iterable) {
                C7573i.m23582a((Object) str4, "it");
                if (C7634n.m23776c((CharSequence) str4, (CharSequence) "?", false)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    sb.append("&ilog=");
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append(str2);
                    str3 = sb3.toString();
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str4);
                    sb4.append("?ilog=");
                    String sb5 = sb4.toString();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(sb5);
                    sb6.append(str2);
                    str3 = sb6.toString();
                }
                arrayList.add(str3);
            }
            a.f32193a = (List) arrayList;
        }
        C12133n.m35299a(a).mo29844a((C12128i) smartImageView).mo29845a(str).mo29837a(i, (C12107e) new C32030a(z, a, video)).mo29852b(true).mo29849a((C12112j) new C32032b(smartImageView, z, a, video));
    }
}
