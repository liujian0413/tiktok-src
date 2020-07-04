package com.p280ss.android.ugc.aweme.longvideo.p1375b;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LongVideo;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.longvideo.C32745g;
import com.p280ss.android.ugc.aweme.longvideo.C32747i;
import com.p280ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel;
import com.p280ss.android.ugc.aweme.longvideonew.LongVideoActivity;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.b.a */
public final class C32718a {

    /* renamed from: a */
    public static final C32719a f85294a = new C32719a(null);

    /* renamed from: com.ss.android.ugc.aweme.longvideo.b.a$a */
    public static final class C32719a {
        private C32719a() {
        }

        public /* synthetic */ C32719a(C7571f fVar) {
            this();
        }

        /* renamed from: b */
        public final boolean mo84194b(Context context) {
            if (m105911a(context) == 1 || (context instanceof LoftPlayActivity)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static int m105911a(Context context) {
            if (context instanceof FragmentActivity) {
                C32745g gVar = ((LongVideoMobViewModel) C0069x.m159a((FragmentActivity) context).mo147a(LongVideoMobViewModel.class)).f85426a;
                if (gVar != null) {
                    return gVar.f85377c;
                }
            }
            return 0;
        }

        /* renamed from: a */
        public static LongVideoMobViewModel m105912a(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "activity");
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(LongVideoMobViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…MobViewModel::class.java)");
            return (LongVideoMobViewModel) a;
        }

        /* renamed from: a */
        public static boolean m105915a(Aweme aweme) {
            Video video;
            if (aweme == null) {
                return false;
            }
            LongVideo a = C32747i.m106010a(aweme);
            if (a != null) {
                video = a.getVideo();
            } else {
                video = null;
            }
            if (video != null) {
                Video video2 = a.getVideo();
                C7573i.m23582a((Object) video2, "longVideo.video");
                if (video2.getDownloadAddr() != null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public static LongVideoMobViewModel m105913a(FragmentActivity fragmentActivity, Aweme aweme, String str, int i, int i2) {
            C7573i.m23587b(fragmentActivity, "activity");
            C7573i.m23587b(str, "eventType");
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(LongVideoMobViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…MobViewModel::class.java)");
            LongVideoMobViewModel longVideoMobViewModel = (LongVideoMobViewModel) a;
            longVideoMobViewModel.f85427b = aweme;
            longVideoMobViewModel.f85426a = new C32745g(str, i, i2);
            return longVideoMobViewModel;
        }

        /* renamed from: a */
        public static LongVideoMobViewModel m105914a(LongVideoActivity longVideoActivity, Aweme aweme, String str, int i, int i2) {
            C7573i.m23587b(longVideoActivity, "longVideoPlayActivity");
            C7573i.m23587b(str, "eventType");
            C0063u a = C0069x.m159a((FragmentActivity) longVideoActivity).mo147a(LongVideoMobViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(lo…MobViewModel::class.java)");
            LongVideoMobViewModel longVideoMobViewModel = (LongVideoMobViewModel) a;
            longVideoMobViewModel.f85427b = aweme;
            longVideoMobViewModel.f85426a = new C32745g(str, i, 1);
            return longVideoMobViewModel;
        }
    }

    /* renamed from: a */
    public static final int m105909a(Context context) {
        return C32719a.m105911a(context);
    }

    /* renamed from: b */
    public static final boolean m105910b(Context context) {
        return f85294a.mo84194b(context);
    }
}
