package com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1626ui;

import android.app.Application;
import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1622a.C41591b;
import com.p280ss.android.ugc.aweme.tools.C42160b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.SpaceItemDecoration */
public final class SpaceItemDecoration extends C1272h {

    /* renamed from: a */
    public static final C41630a f108189a = new C41630a(null);

    /* renamed from: b */
    private final boolean f108190b;

    /* renamed from: c */
    private List<C41591b> f108191c;

    /* renamed from: d */
    private final int f108192d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.SpaceItemDecoration$a */
    public static final class C41630a {
        private C41630a() {
        }

        public /* synthetic */ C41630a(C7571f fVar) {
            this();
        }
    }

    public SpaceItemDecoration() {
        this(0, 1, null);
    }

    /* renamed from: a */
    private final boolean m132522a(int i) {
        if (i % this.f108192d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m132524b(int i) {
        if ((i + 1) % this.f108192d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m132526c(int i) {
        int i2 = this.f108192d;
        if (i >= 0 && i2 > i) {
            return true;
        }
        return false;
    }

    public SpaceItemDecoration(int i) {
        this.f108192d = i;
        this.f108190b = C42160b.m134123a(C35574k.m114861b());
        this.f108191c = C7525m.m23461a();
    }

    /* renamed from: a */
    public final void mo102249a(List<C41591b> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f108191c = list;
        }
    }

    /* renamed from: a */
    private final int m132520a(int i, int i2) {
        int size = this.f108191c.size();
        boolean z = false;
        if (i < 0 || size <= i) {
            return 0;
        }
        int i3 = ((C41591b) this.f108191c.get(i)).f108089b;
        Object obj = ((C41591b) this.f108191c.get(i)).f108091d;
        switch (((C41591b) this.f108191c.get(i)).f108088a) {
            case 0:
                return m132525c(i3, i2);
            case 1:
                if (obj instanceof Pair) {
                    Object second = ((Pair) obj).getSecond();
                    if (!(second instanceof Boolean)) {
                        second = null;
                    }
                    Boolean bool = (Boolean) second;
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                }
                return m132521a(z, i2);
            case 2:
                return m132523b(i3, i2);
            case 3:
                return 0;
            default:
                StringBuilder sb = new StringBuilder("Unsupported direction, direction = ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static int m132521a(boolean z, int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                if (!z) {
                    return 0;
                }
                Application b = C35574k.m114861b();
                C7573i.m23582a((Object) b, "CameraClient.getApplication()");
                return b.getResources().getDimensionPixelOffset(R.dimen.lw);
            case 2:
                return 0;
            case 3:
                return 0;
            default:
                StringBuilder sb = new StringBuilder("Unsupported direction, direction = ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private final int m132523b(int i, int i2) {
        switch (i2) {
            case 0:
                if (m132522a(i)) {
                    Application b = C35574k.m114861b();
                    C7573i.m23582a((Object) b, "CameraClient.getApplication()");
                    return b.getResources().getDimensionPixelOffset(R.dimen.lu);
                }
                Application b2 = C35574k.m114861b();
                C7573i.m23582a((Object) b2, "CameraClient.getApplication()");
                return b2.getResources().getDimensionPixelOffset(R.dimen.lv);
            case 1:
                Application b3 = C35574k.m114861b();
                C7573i.m23582a((Object) b3, "CameraClient.getApplication()");
                return b3.getResources().getDimensionPixelOffset(R.dimen.lw);
            case 2:
                if (!m132524b(i)) {
                    return 0;
                }
                Application b4 = C35574k.m114861b();
                C7573i.m23582a((Object) b4, "CameraClient.getApplication()");
                return b4.getResources().getDimensionPixelOffset(R.dimen.lu);
            case 3:
                Application b5 = C35574k.m114861b();
                C7573i.m23582a((Object) b5, "CameraClient.getApplication()");
                return b5.getResources().getDimensionPixelOffset(R.dimen.lw);
            default:
                StringBuilder sb = new StringBuilder("Unsupported direction, direction = ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    private final int m132525c(int i, int i2) {
        switch (i2) {
            case 0:
                if (m132522a(i)) {
                    Application b = C35574k.m114861b();
                    C7573i.m23582a((Object) b, "CameraClient.getApplication()");
                    return b.getResources().getDimensionPixelOffset(R.dimen.lu);
                }
                Application b2 = C35574k.m114861b();
                C7573i.m23582a((Object) b2, "CameraClient.getApplication()");
                return b2.getResources().getDimensionPixelOffset(R.dimen.lv);
            case 1:
                if (m132526c(i)) {
                    Application b3 = C35574k.m114861b();
                    C7573i.m23582a((Object) b3, "CameraClient.getApplication()");
                    return b3.getResources().getDimensionPixelOffset(R.dimen.lw);
                }
                Application b4 = C35574k.m114861b();
                C7573i.m23582a((Object) b4, "CameraClient.getApplication()");
                return b4.getResources().getDimensionPixelOffset(R.dimen.lv);
            case 2:
                if (!m132524b(i)) {
                    return 0;
                }
                Application b5 = C35574k.m114861b();
                C7573i.m23582a((Object) b5, "CameraClient.getApplication()");
                return b5.getResources().getDimensionPixelOffset(R.dimen.lu);
            case 3:
                return 0;
            default:
                StringBuilder sb = new StringBuilder("Unsupported direction, direction = ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private /* synthetic */ SpaceItemDecoration(int i, int i2, C7571f fVar) {
        this(3);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i;
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        int g = RecyclerView.m5893g(view);
        int i2 = 0;
        if (this.f108190b) {
            i = 2;
        } else {
            i = 0;
        }
        rect.left = m132520a(g, i);
        if (!this.f108190b) {
            i2 = 2;
        }
        rect.right = m132520a(g, i2);
        rect.top = m132520a(g, 1);
        rect.bottom = m132520a(g, 3);
    }
}
