package com.p280ss.android.ugc.aweme.feed.helper;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p1288h.C30218a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.g */
public class C28419g {

    /* renamed from: a */
    private static final int f74939a = 2131301590;

    /* renamed from: b */
    private static volatile C28419g f74940b;

    /* renamed from: c */
    private C30218a f74941c;

    /* renamed from: d */
    private Context f74942d = C6399b.m19921a();

    /* renamed from: a */
    private static String m93415a(int i) {
        String str = "";
        switch (i) {
            case 0:
                return "like_highlight_click";
            case 1:
                return "comment_highlight_click";
            case 2:
                return "share_highlight_click";
            default:
                return str;
        }
    }

    private C28419g() {
    }

    /* renamed from: b */
    private String m93418b() {
        if (this.f74941c == null) {
            return "";
        }
        return this.f74941c.f79492a;
    }

    /* renamed from: a */
    public static C28419g m93414a() {
        if (f74940b == null) {
            synchronized (C28419g.class) {
                if (f74940b == null) {
                    f74940b = new C28419g();
                }
            }
        }
        return f74940b;
    }

    /* renamed from: a */
    private static boolean m93417a(ImageView imageView) {
        Boolean bool = (Boolean) imageView.getTag(f74939a);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: b */
    public final void mo72155b(ImageView imageView, String str, String str2, String str3) {
        m93416a(imageView, 1, str, str2, str3, null);
    }

    /* renamed from: a */
    public final void mo72154a(ImageView imageView, String str, String str2, String str3) {
        View findViewById = imageView.getRootView().findViewById(R.id.b98);
        boolean z = false;
        if (findViewById != null && findViewById.getVisibility() == 0) {
            z = true;
        }
        m93416a(imageView, 2, str, str2, str3, Boolean.valueOf(z));
        if (z) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m93416a(ImageView imageView, int i, String str, String str2, String str3, Boolean bool) {
        if (m93417a(imageView)) {
            C22984d a = C22984d.m75611a().mo59973a("enter_from", str).mo59973a("group_id", str2).mo59973a("author_id", str3).mo59973a("show_content", m93418b());
            if (i == 2) {
                a.mo59970a("is_pop_up", bool.booleanValue() ? 1 : 0);
            }
            C6907h.m21524a(m93415a(i), (Map) a.f60753a);
        }
    }
}
