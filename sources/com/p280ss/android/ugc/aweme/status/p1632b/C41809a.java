package com.p280ss.android.ugc.aweme.status.p1632b;

import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.status.b.a */
public final class C41809a {

    /* renamed from: g */
    public static final C41810a f108751g = new C41810a(null);

    /* renamed from: a */
    public Video f108752a = new Video();

    /* renamed from: b */
    public int f108753b;

    /* renamed from: c */
    public Effect f108754c;

    /* renamed from: d */
    public String f108755d;

    /* renamed from: e */
    public String f108756e;

    /* renamed from: f */
    public String f108757f;

    /* renamed from: com.ss.android.ugc.aweme.status.b.a$a */
    public static final class C41810a {
        private C41810a() {
        }

        public /* synthetic */ C41810a(C7571f fVar) {
            this();
        }
    }

    public C41809a(int i, Effect effect, String str, String str2, String str3) {
        C7573i.m23587b(effect, "effect");
        C7573i.m23587b(str, "imageUrl");
        C7573i.m23587b(str2, "videoUrl");
        C7573i.m23587b(str3, "videoMd5");
        this.f108753b = i;
        this.f108754c = effect;
        this.f108755d = str;
        this.f108756e = str2;
        this.f108757f = str3;
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setH265(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f108756e);
        videoUrlModel.setUrlList(arrayList);
        videoUrlModel.setUrlKey(this.f108757f);
        videoUrlModel.setUri(this.f108757f);
        this.f108752a.setPlayAddr(videoUrlModel);
        this.f108752a.setSourceId(this.f108754c.getId());
    }
}
