package com.p280ss.android.ugc.aweme.favorites.p1210a;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.j */
public final class C27707j {

    /* renamed from: a */
    public String f73043a;

    /* renamed from: b */
    public long f73044b;

    /* renamed from: c */
    public List<UrlModel> f73045c;

    /* renamed from: d */
    public int f73046d;

    /* renamed from: e */
    public List<String> f73047e;

    /* renamed from: f */
    public List<String> f73048f;

    /* renamed from: g */
    public List<Object> f73049g;

    /* renamed from: h */
    public boolean f73050h;

    public C27707j() {
        this(null, 0, null, 0, null, null, null, false, NormalGiftView.ALPHA_255, null);
    }

    public C27707j(String str, long j, List<UrlModel> list, int i, List<String> list2, List<String> list3, List<Object> list4, boolean z) {
        C7573i.m23587b(str, "title");
        C7573i.m23587b(list, "coverList");
        C7573i.m23587b(list2, "ids");
        C7573i.m23587b(list3, "itemTitles");
        C7573i.m23587b(list4, "mObjects");
        this.f73043a = str;
        this.f73044b = j;
        this.f73045c = list;
        this.f73046d = i;
        this.f73047e = list2;
        this.f73048f = list3;
        this.f73049g = list4;
        this.f73050h = z;
    }

    public /* synthetic */ C27707j(String str, long j, List list, int i, List list2, List list3, List list4, boolean z, int i2, C7571f fVar) {
        String str2;
        long j2;
        List list5;
        int i3;
        List list6;
        List list7;
        List list8;
        if ((i2 & 1) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        if ((i2 & 2) != 0) {
            j2 = 0;
        } else {
            j2 = j;
        }
        if ((i2 & 4) != 0) {
            list5 = new ArrayList();
        } else {
            list5 = list;
        }
        if ((i2 & 8) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            list6 = new ArrayList();
        } else {
            list6 = list2;
        }
        if ((i2 & 32) != 0) {
            list7 = new ArrayList();
        } else {
            list7 = list3;
        }
        if ((i2 & 64) != 0) {
            list8 = new ArrayList();
        } else {
            list8 = list4;
        }
        this(str2, j2, list5, i3, list6, list7, list8, false);
    }
}
