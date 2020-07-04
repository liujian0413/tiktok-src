package com.p280ss.android.ugc.aweme.shortvideo.sticker.tabguide.p1616b;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p1288h.C30221c;
import com.p280ss.android.ugc.aweme.p1288h.C30221c.C30222a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.tabguide.C40938a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.tabguide.C40942b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.tabguide.b.a */
public final class C40943a implements C40946b {

    /* renamed from: c */
    public static final C40944a f106451c = new C40944a(null);

    /* renamed from: a */
    public View f106452a;

    /* renamed from: b */
    public boolean f106453b;

    /* renamed from: e */
    private RemoteImageView f106454e;

    /* renamed from: f */
    private DmtTextView f106455f;

    /* renamed from: g */
    private Runnable f106456g;

    /* renamed from: h */
    private final C40942b f106457h;

    /* renamed from: i */
    private final UrlModel f106458i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.tabguide.b.a$a */
    public static final class C40944a {
        private C40944a() {
        }

        public /* synthetic */ C40944a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.tabguide.b.a$b */
    static final class C40945b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40943a f106459a;

        C40945b(C40943a aVar) {
            this.f106459a = aVar;
        }

        public final void run() {
            View view = this.f106459a.f106452a;
            if (view != null) {
                view.setVisibility(8);
            }
            C40938a.m130779b();
            this.f106459a.f106453b = false;
        }
    }

    /* renamed from: a */
    public final boolean mo101234a() {
        return false;
    }

    /* renamed from: b */
    public final int mo101235b() {
        return 1;
    }

    /* renamed from: f */
    private final Runnable m130790f() {
        return new C40945b(this);
    }

    /* renamed from: c */
    private static long m130787c() {
        C30222a aVar;
        long j;
        C30221c c = C35574k.m114859a().mo70072F().mo83154c();
        if (c != null) {
            aVar = c.f79525o;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            j = (long) aVar.f79531a;
        } else {
            j = 5;
        }
        return j * 1000;
    }

    /* renamed from: d */
    private static String m130788d() {
        boolean z;
        C30221c c = C35574k.m114859a().mo70072F().mo83154c();
        if (c == null || c.f79527q != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            String string = C35574k.m114861b().getString(R.string.atn);
            C7573i.m23582a((Object) string, "CameraClient.getApplicat…ate_campaign_shoot_popup)");
            return string;
        }
        String string2 = C35574k.m114861b().getString(R.string.rr);
        C7573i.m23582a((Object) string2, "CameraClient.getApplicat…tir_campaign_shoot_popup)");
        return string2;
    }

    /* renamed from: e */
    private final void m130789e() {
        UrlModel urlModel = this.f106458i;
        List urlList = this.f106458i.getUrlList();
        C7573i.m23582a((Object) urlList, "url.urlList");
        Iterable<String> iterable = urlList;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (String str : iterable) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f106457h.f106450a);
            arrayList.add(sb.toString());
        }
        urlModel.setUrlList((List) arrayList);
    }

    /* renamed from: a */
    public final void mo101233a(boolean z) {
        View view = this.f106452a;
        if (view != null) {
            view.removeCallbacks(this.f106456g);
        }
        View view2 = this.f106452a;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        if (!z) {
            C40938a.m130779b();
        }
        this.f106453b = false;
    }

    /* renamed from: a */
    public final void mo101232a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "root");
        if (!this.f106453b && m130787c() > 0 && C40938a.m130778a()) {
            this.f106453b = true;
            this.f106452a = viewGroup.findViewById(R.id.dbf);
            View view = this.f106452a;
            if (view != null) {
                view.setVisibility(0);
            }
            this.f106454e = (RemoteImageView) viewGroup.findViewById(R.id.dbg);
            this.f106455f = (DmtTextView) viewGroup.findViewById(R.id.dbh);
            DmtTextView dmtTextView = this.f106455f;
            if (dmtTextView != null) {
                dmtTextView.setText(m130788d());
            }
            m130789e();
            C23323e.m76524b(this.f106454e, this.f106458i);
            this.f106456g = m130790f();
            View view2 = this.f106452a;
            if (view2 != null) {
                view2.postDelayed(this.f106456g, m130787c());
            }
        }
    }

    public C40943a(C40942b bVar, UrlModel urlModel) {
        C7573i.m23587b(bVar, "param");
        C7573i.m23587b(urlModel, "url");
        this.f106457h = bVar;
        this.f106458i = urlModel;
    }
}
