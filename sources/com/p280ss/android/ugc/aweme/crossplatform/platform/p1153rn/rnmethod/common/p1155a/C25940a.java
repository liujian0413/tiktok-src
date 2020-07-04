package com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common.p1155a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.framework.ReactInstance;
import com.p280ss.android.ugc.aweme.framework.activity.C29948b;
import com.p280ss.android.ugc.aweme.framework.bridge.C29953a;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.util.C42893q;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.a.a */
public final class C25940a implements C29953a {
    /* renamed from: a */
    public static void m85251a(final String str, final String str2, final Callback callback) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public final void run() {
                int i;
                C29948b reactViewById = ReactInstance.getReactViewById(str);
                if (TextUtils.isEmpty(str2) || reactViewById == null) {
                    C42893q.m136191a(callback, C29956a.f78751d, "schema is not legal");
                    return;
                }
                if (str2.startsWith("aweme://live/")) {
                    Uri parse = Uri.parse(str2);
                    String queryParameter = parse.getQueryParameter("room_id");
                    String queryParameter2 = parse.getQueryParameter("user_id");
                    if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter2)) {
                        C22912d.f60645e.mo59887a((Context) reactViewById.getActivity(), str2.replace("aweme", C22909c.f60637a), (String) null);
                        C42893q.m136190a(callback, C29956a.f78750c);
                    } else {
                        C42893q.m136190a(callback, C29956a.f78751d);
                    }
                } else {
                    boolean a = C7195s.m22438a().mo18679a(reactViewById.getActivity(), str2);
                    Callback callback = callback;
                    if (a) {
                        i = C29956a.f78750c;
                    } else {
                        i = C29956a.f78751d;
                    }
                    C42893q.m136190a(callback, i);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo67335a(String str, ReadableMap readableMap, Callback callback) {
        m85251a(readableMap.getString("reactId"), readableMap.getString("sheme"), callback);
    }
}
