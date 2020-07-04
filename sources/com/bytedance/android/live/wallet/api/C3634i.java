package com.bytedance.android.live.wallet.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.wallet.api.i */
public interface C3634i {

    /* renamed from: com.bytedance.android.live.wallet.api.i$a */
    public interface C3635a {
        /* renamed from: a */
        void mo11097a();

        /* renamed from: a */
        void mo11098a(Bundle bundle);
    }

    /* renamed from: com.bytedance.android.live.wallet.api.i$b */
    public interface C3636b {
        /* renamed from: a */
        void mo11099a(String str, String str2);
    }

    /* renamed from: com.bytedance.android.live.wallet.api.i$c */
    public interface C3637c {
    }

    /* renamed from: com.bytedance.android.live.wallet.api.i$d */
    public interface C3638d {
        /* renamed from: a */
        void mo11100a(boolean z);
    }

    /* renamed from: com.bytedance.android.live.wallet.api.i$e */
    public static class C3639e {

        /* renamed from: a */
        public static int f10853a = 0;

        /* renamed from: b */
        public static int f10854b = 0;

        /* renamed from: c */
        public static int f10855c = 1;

        /* renamed from: d */
        public static int f10856d = 2;

        /* renamed from: e */
        public static int f10857e = 3;

        /* renamed from: f */
        public static int f10858f = 4;

        /* renamed from: g */
        public static int f10859g = 5;
    }

    /* renamed from: com.bytedance.android.live.wallet.api.i$f */
    public static class C3640f {

        /* renamed from: a */
        public static String f10860a = "pay_result_code";

        /* renamed from: b */
        public static String f10861b = "pay_result_extra";

        /* renamed from: c */
        public static String f10862c = "pay_result_detail_code";

        /* renamed from: d */
        public static String f10863d = "pay_result_msg";
    }

    /* renamed from: a */
    void mo11044a();

    /* renamed from: a */
    void mo11045a(Activity activity, String str, Map<String, String> map, int i, Bundle bundle);

    /* renamed from: a */
    void mo11046a(Context context);

    /* renamed from: a */
    void mo11047a(Context context, String str);

    /* renamed from: a */
    void mo11048a(Context context, ArrayList<String> arrayList, C3637c cVar);

    /* renamed from: a */
    void mo11049a(Context context, List<String> list, String str, C3635a aVar);

    /* renamed from: a */
    void mo11050a(C3636b bVar);

    /* renamed from: a */
    void mo11051a(C3638d dVar);

    /* renamed from: b */
    void mo11052b();

    /* renamed from: c */
    void mo11053c();
}
