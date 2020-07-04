package com.p280ss.android.ugc.aweme.movie.p1402a;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.movie.api.MovieDetailAPi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.movie.a.a */
public final class C33642a extends C25673a<Aweme, C33644b> {

    /* renamed from: a */
    private int f87801a;

    /* renamed from: com.ss.android.ugc.aweme.movie.a.a$a */
    static final class C33643a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ String f87802a;

        /* renamed from: b */
        final /* synthetic */ long f87803b;

        C33643a(String str, long j) {
            this.f87802a = str;
            this.f87803b = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C33644b call() {
            return MovieDetailAPi.f87814b.mo86027a(this.f87802a, this.f87803b);
        }
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        return true;
    }

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C33644b) this.mData).f87804a;
    }

    public final boolean isHasMore() {
        boolean z;
        if (this.mData != null) {
            Boolean bool = ((C33644b) this.mData).f87806c;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void setItems(List<? extends Aweme> list) {
        if (this.mData == null) {
            this.mData = new C33644b();
        }
        ((C33644b) this.mData).f87806c = Boolean.valueOf(true);
        ((C33644b) this.mData).f87804a = (ArrayList) list;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean deleteItem(Aweme aweme) {
        C7573i.m23587b(aweme, "deleteItem");
        return C28482e.m93607a(getItems(), aweme, this.mNotifyListeners);
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        C7573i.m23587b(objArr, "params");
        Object obj = objArr[1];
        if (obj != null) {
            String str = (String) obj;
            if (isDataEmpty()) {
                j = 0;
            } else {
                j = ((C33644b) this.mData).f87805b;
            }
            long j2 = j;
            Integer num = objArr[2];
            if (num != null) {
                m108574a(str, j2, 20, num.intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        Object obj = objArr[1];
        if (obj != null) {
            String str = (String) obj;
            Integer num = objArr[2];
            if (num != null) {
                m108574a(str, 0, 20, num.intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C33644b bVar) {
        boolean z;
        Integer num;
        int i;
        Aweme aweme;
        boolean z2 = false;
        if (bVar == null || C6307b.m19566a((Collection<T>) bVar.f87804a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (bVar == null) {
                C7573i.m23580a();
            }
            ArrayList<Aweme> arrayList = bVar.f87804a;
            if (arrayList != null) {
                num = Integer.valueOf(arrayList.size());
            } else {
                num = null;
            }
            int i2 = 0;
            while (true) {
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                if (i2 >= i) {
                    break;
                }
                ArrayList<Aweme> arrayList2 = bVar.f87804a;
                if (arrayList2 != null) {
                    aweme = (Aweme) arrayList2.get(i2);
                } else {
                    aweme = null;
                }
                Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme);
                ArrayList<Aweme> arrayList3 = bVar.f87804a;
                if (arrayList3 != null) {
                    Aweme aweme2 = (Aweme) arrayList3.get(i2);
                    if (aweme2 != null) {
                        int isTop = aweme2.getIsTop();
                        if (updateAweme == null) {
                            C7573i.m23580a();
                        }
                        updateAweme.setIsTop(isTop);
                    }
                }
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                StringBuilder sb = new StringBuilder();
                C7573i.m23582a((Object) updateAweme, "aweme");
                sb.append(updateAweme.getAid());
                sb.append(this.f87801a + 11000);
                iRequestIdService.setRequestIdAndIndex(sb.toString(), bVar.f87807d, i2);
                ArrayList<Aweme> arrayList4 = bVar.f87804a;
                if (arrayList4 != null) {
                    arrayList4.set(i2, updateAweme);
                }
                if (bVar.f87808e != null) {
                    C28199ae.m92689a().mo71792a(bVar.f87807d, bVar.f87808e);
                }
                i2++;
            }
            int i3 = this.mListQueryType;
            if (i3 != 1) {
                if (i3 == 4) {
                    ArrayList<Aweme> arrayList5 = bVar.f87804a;
                    if (arrayList5 != null) {
                        ArrayList<Aweme> arrayList6 = ((C33644b) this.mData).f87804a;
                        if (arrayList6 != null) {
                            arrayList6.addAll(arrayList5);
                        }
                    }
                    ((C33644b) this.mData).f87805b = bVar.f87805b;
                    C33644b bVar2 = (C33644b) this.mData;
                    Boolean bool = bVar.f87806c;
                    if (bool != null) {
                        z2 = bool.booleanValue();
                    }
                    bVar2.f87806c = Boolean.valueOf(z2);
                }
                return;
            }
            this.mData = bVar;
            return;
        }
        if (this.mData != null) {
            ((C33644b) this.mData).f87806c = Boolean.valueOf(false);
        }
    }

    /* renamed from: a */
    private final void m108574a(String str, long j, int i, int i2) {
        this.f87801a = i2;
        C23397p.m76735a().mo60807a(this.mHandler, new C33643a(str, j), 0);
    }
}
