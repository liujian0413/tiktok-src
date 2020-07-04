package com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.p1623a;

import android.app.Application;
import com.p280ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.api.C41608a;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.api.C41608a.C41609a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7519g;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.a.a */
public final class C41597a {

    /* renamed from: a */
    public static final C41597a f108098a = new C41597a();

    private C41597a() {
    }

    /* renamed from: a */
    public static List<VideoCategoryParam> m132444a() {
        Application b = C35574k.m114861b();
        C7573i.m23582a((Object) b, "CameraClient.getApplication()");
        String[] stringArray = b.getResources().getStringArray(R.array.p);
        C7573i.m23582a((Object) stringArray, "CameraClient.getApplicat…n_builtin_video_category)");
        List h = C7525m.m23516h((Iterable<? extends T>) C7519g.m23444c((T[]) stringArray));
        C41608a aVar = (C41608a) C35574k.m114859a().mo70095j().convertJsonToObject("douyin_video_category_builtin.json", C41608a.class);
        if (aVar != null) {
            List<C41609a> list = aVar.f108114c;
            if (list != null) {
                Iterable iterable = list;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                int i = 0;
                for (Object next : iterable) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C7525m.m23465b();
                    }
                    arrayList.add(new VideoCategoryParam(m132443a(h, i), ((C41609a) next).f108115a));
                    i = i2;
                }
                return (List) arrayList;
            }
        }
        return C7525m.m23461a();
    }

    /* renamed from: a */
    private static String m132443a(List<String> list, int i) {
        int size = list.size();
        if (i >= 0 && size > i) {
            return (String) list.get(i);
        }
        return "";
    }
}
