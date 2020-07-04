package com.p280ss.android.ugc.aweme.notification.newstyle.delegate;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notification.newstyle.delegate.C34527d.C34528a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.delegate.a */
public final class C34522a extends C34526c {

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.delegate.a$a */
    public static final class C34523a implements C34527d {
        C34523a() {
        }

        /* renamed from: b */
        public final String mo87839b() {
            return C34528a.m111663a(this);
        }

        /* renamed from: c */
        public final String mo87840c() {
            return C34528a.m111664b(this);
        }

        /* renamed from: a */
        public final String mo87836a() {
            String string = C6399b.m19921a().getString(R.string.bpf);
            C7573i.m23582a((Object) string, "AppContextManager.getApp…ing.im_session_ad_helper)");
            return string;
        }

        /* renamed from: a */
        public final List<BaseNotice> mo87837a(List<BaseNotice> list) {
            C7573i.m23587b(list, "list");
            List<BaseNotice> arrayList = new ArrayList<>();
            for (BaseNotice baseNotice : list) {
                if (baseNotice.getAdHelperNotice() != null) {
                    arrayList.add(baseNotice);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        public final C1293v mo87835a(ViewGroup viewGroup, int i) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aeu, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new MusAdHelperDetailHolder(inflate);
        }

        /* renamed from: a */
        public final void mo87838a(C1293v vVar, BaseNotice baseNotice, int i, HashMap<String, BaseNotice> hashMap, boolean z) {
            C7573i.m23587b(vVar, "holder");
            C7573i.m23587b(baseNotice, "notice");
            C7573i.m23587b(hashMap, "readNoticeMap");
            if (vVar instanceof MusAdHelperDetailHolder) {
                ((MusAdHelperDetailHolder) vVar).mo87830a(baseNotice, z);
            }
        }
    }

    /* renamed from: a */
    public final C34527d mo87834a() {
        return new C34523a();
    }
}
