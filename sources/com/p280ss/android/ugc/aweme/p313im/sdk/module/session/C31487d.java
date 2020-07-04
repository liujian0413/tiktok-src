package com.p280ss.android.ugc.aweme.p313im.sdk.module.session;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.adapter.NewSessionListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C31511a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C31521c;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.d */
public final class C31487d {
    /* renamed from: a */
    public static void m102389a(RecyclerView recyclerView, NewSessionListAdapter newSessionListAdapter) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        List a = newSessionListAdapter.mo62312a();
        if (a != null && a.size() != 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager != null) {
                int j = linearLayoutManager.mo5445j();
                int l = linearLayoutManager.mo5447l();
                int f = newSessionListAdapter.mo82187f();
                int i = (j + 1) - f;
                int i2 = -1;
                while (true) {
                    if (i < 0 || i >= a.size()) {
                        break;
                    }
                    Object obj = a.get(i);
                    if (obj instanceof C7102a) {
                        C7102a aVar = (C7102a) obj;
                        Conversation a2 = C6417a.m20015a().mo15530a(aVar.bf_());
                        int i3 = aVar.f19946j;
                        int b = aVar.mo18115b();
                        if (a2 == null || !a2.isMute()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        boolean a3 = m102390a(i3, b, z);
                        if (i2 == -1) {
                            if (aVar.mo18115b() == 10) {
                                int f2 = ((C31521c) aVar).mo82229f();
                                int b2 = aVar.mo18115b();
                                if (a2 == null || !a2.isMute()) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                z2 = m102391b(f2, b2, z5);
                            } else if (aVar.mo18115b() == 17) {
                                int i4 = ((C31511a) aVar).f82509a;
                                int b3 = aVar.mo18115b();
                                if (a2 == null || !a2.isMute()) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                z2 = m102391b(i4, b3, z4);
                            } else {
                                int i5 = aVar.f19946j;
                                int b4 = aVar.mo18115b();
                                if (a2 == null || !a2.isMute()) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                z2 = m102391b(i5, b4, z3);
                            }
                            if (z2) {
                                i2 = i;
                            }
                        }
                        if (!a3) {
                            int i6 = j - f;
                            if (i == i6 || (i == a.size() - 1 && i6 == -1)) {
                                break;
                            } else if (i != a.size() - 1) {
                                i++;
                            }
                        } else {
                            break;
                        }
                    } else {
                        int i7 = j - f;
                        if (i == i7 || (i == a.size() - 1 && i7 == -1)) {
                            break;
                        } else if (i != a.size() - 1) {
                            i++;
                        }
                    }
                    i = 0;
                }
                i = -1;
                int i8 = l - j;
                if ((i == -1 || i + f > j) && !(recyclerView.getChildAt(i8) != null && recyclerView.getHeight() == recyclerView.getChildAt(i8).getBottom() && l - f == a.size())) {
                    int i9 = i + f;
                    if (i9 > j) {
                        m102388a(recyclerView, f, j, l, i9);
                    } else if ((i2 == -1 || i2 + f > j) && !(recyclerView.getChildAt(i8) != null && recyclerView.getHeight() == recyclerView.getChildAt(i8).getBottom() && l - f == a.size())) {
                        int i10 = i2 + f;
                        if (i10 > j) {
                            m102388a(recyclerView, f, j, l, i10);
                        } else {
                            m102388a(recyclerView, f, j, l, 0);
                        }
                    } else {
                        m102388a(recyclerView, f, j, l, 0);
                    }
                } else {
                    m102388a(recyclerView, f, j, l, 0);
                }
            }
        }
    }

    /* renamed from: b */
    private static boolean m102391b(int i, int i2, boolean z) {
        if (i <= 0 || m102390a(i, i2, z)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m102390a(int i, int i2, boolean z) {
        if (C31915n.m103673c()) {
            if (i <= 0 || z || (i2 != 0 && i2 != 3 && i2 != 24 && i2 != 4 && i2 != 7)) {
                return false;
            }
            return true;
        } else if (i <= 0 || z || (i2 != 0 && i2 != 17 && i2 != 20)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private static void m102388a(RecyclerView recyclerView, int i, int i2, int i3, int i4) {
        int i5;
        if (i2 != i3) {
            int i6 = i4 - i2;
            int height = recyclerView.getChildAt(1).getHeight();
            if (i == 1 && i2 == 0 && i4 > 0) {
                i5 = (recyclerView.getChildAt(1).getTop() - recyclerView.getChildAt(0).getTop()) - height;
            } else if (i == 1 && i2 > 0 && i4 == 0) {
                i5 = -1073741823;
            } else {
                i5 = 0;
            }
            recyclerView.mo5521a(0, (height * i6) + recyclerView.getChildAt(0).getTop() + i5);
        }
    }
}
