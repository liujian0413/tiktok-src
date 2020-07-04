package com.p280ss.android.ugc.aweme.notification.newstyle.delegate;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.delegate.d */
public interface C34527d {

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.delegate.d$a */
    public static final class C34528a {
        /* renamed from: b */
        public static String m111664b(C34527d dVar) {
            return "";
        }

        /* renamed from: a */
        public static String m111663a(C34527d dVar) {
            String string = C6399b.m19921a().getString(R.string.bzv);
            C7573i.m23582a((Object) string, "AppContextManager.getApp…ring(R.string.list_empty)");
            return string;
        }
    }

    /* renamed from: a */
    C1293v mo87835a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    String mo87836a();

    /* renamed from: a */
    List<BaseNotice> mo87837a(List<BaseNotice> list);

    /* renamed from: a */
    void mo87838a(C1293v vVar, BaseNotice baseNotice, int i, HashMap<String, BaseNotice> hashMap, boolean z);

    /* renamed from: b */
    String mo87839b();

    /* renamed from: c */
    String mo87840c();
}
