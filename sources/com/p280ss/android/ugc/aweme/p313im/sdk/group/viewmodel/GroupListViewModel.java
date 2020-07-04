package com.p280ss.android.ugc.aweme.p313im.sdk.group.viewmodel;

import android.arch.lifecycle.C0052o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.ConversationCoreInfo;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6959c;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C7048a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.BaseMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48007r;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel */
public final class GroupListViewModel extends BaseMemberListViewModel<IMContact> {

    /* renamed from: i */
    public static final C31302a f82041i = new C31302a(null);

    /* renamed from: b */
    public int f82042b = 1;

    /* renamed from: c */
    public long f82043c;

    /* renamed from: d */
    public boolean f82044d;

    /* renamed from: e */
    public boolean f82045e;

    /* renamed from: f */
    public SharePackage f82046f;

    /* renamed from: g */
    public BaseContent f82047g;

    /* renamed from: h */
    public int f82048h = 10;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel$a */
    public static final class C31302a {
        private C31302a() {
        }

        public /* synthetic */ C31302a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel$b */
    static final class C31303b extends Lambda implements C48007r<List<Conversation>, Long, Boolean, C11438g, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupListViewModel f82049a;

        /* renamed from: b */
        final /* synthetic */ long f82050b;

        C31303b(GroupListViewModel groupListViewModel, long j) {
            this.f82049a = groupListViewModel;
            this.f82050b = j;
            super(4);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m101960a((List) obj, ((Number) obj2).longValue(), ((Boolean) obj3).booleanValue(), (C11438g) obj4);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101960a(List<Conversation> list, long j, boolean z, C11438g gVar) {
            String str;
            String str2;
            Object obj;
            String str3;
            Collection collection;
            List list2;
            List list3;
            List list4;
            this.f82049a.f82044d = false;
            StringBuilder sb = new StringBuilder("loadDataFromNet: cursor ");
            sb.append(j);
            sb.append(", hasMore ");
            sb.append(z);
            sb.append(", result is ");
            List list5 = null;
            if (list != null) {
                str = list.toString();
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(", error is ");
            if (gVar != null) {
                str2 = gVar.f30958c;
            } else {
                str2 = null;
            }
            sb.append(str2);
            sb.append(", errorCode is ");
            if (gVar != null) {
                obj = Integer.valueOf(gVar.f30956a);
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(", checkMsg is ");
            if (gVar != null) {
                str3 = gVar.f30960e;
            } else {
                str3 = null;
            }
            sb.append(str3);
            if (list != null) {
                Iterable<Conversation> iterable = list;
                Collection arrayList = new ArrayList();
                for (Conversation a : iterable) {
                    IMContact a2 = C6959c.m21648a(a);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                collection = (List) arrayList;
            } else {
                collection = null;
            }
            Collection collection2 = collection;
            if (!C6307b.m19566a(collection2)) {
                if (this.f82050b == 0) {
                    C0052o<List<IMContact>> oVar = this.f82049a.f83143k;
                    if (collection != null) {
                        list3 = C7525m.m23509d(collection2);
                    } else {
                        list3 = null;
                    }
                    oVar.setValue(GroupListViewModel.m101955b(list3));
                    GroupListViewModel groupListViewModel = this.f82049a;
                    List list6 = (List) this.f82049a.f83143k.getValue();
                    if (list6 != null) {
                        list4 = C7525m.m23509d((Collection<? extends T>) list6);
                    } else {
                        list4 = null;
                    }
                    groupListViewModel.mo81551d(list4, z);
                }
                if (this.f82050b > 0 && this.f82049a.f82045e) {
                    List list7 = (List) this.f82049a.f83143k.getValue();
                    if (list7 != null) {
                        list2 = C7525m.m23509d((Collection<? extends T>) list7);
                    } else {
                        list2 = new ArrayList();
                    }
                    if (collection == null) {
                        collection2 = new ArrayList();
                    }
                    list2.addAll(collection2);
                    this.f82049a.f83143k.setValue(GroupListViewModel.m101955b(list2));
                    GroupListViewModel groupListViewModel2 = this.f82049a;
                    List list8 = (List) this.f82049a.f83143k.getValue();
                    if (list8 != null) {
                        list5 = C7525m.m23509d((Collection<? extends T>) list8);
                    }
                    groupListViewModel2.mo81553e(list5, z);
                }
                this.f82049a.f82045e = z;
                this.f82049a.f82043c = j;
            } else if (gVar == null && this.f82050b == 0) {
                this.f82049a.mo81551d(new ArrayList(), false);
                this.f82049a.f82043c = 0;
                this.f82049a.f82045e = false;
            } else if (gVar == null && this.f82050b > 0) {
                this.f82049a.mo81553e(new ArrayList(), false);
                this.f82049a.f82043c = j;
                this.f82049a.f82045e = false;
            } else if (gVar != null && this.f82050b == 0) {
                this.f82049a.mo81549a_(null);
                StringBuilder sb2 = new StringBuilder("GroupListViewModel getGroupListFromNet failed: ");
                sb2.append(gVar.f30956a);
                sb2.append(", ");
                sb2.append(gVar.f30957b);
                sb2.append(", ");
                sb2.append(gVar.f30958c);
                sb2.append(", ");
                sb2.append(gVar.f30959d);
                sb2.append(", ");
                sb2.append(gVar.f30960e);
                C6921a.m21555a(sb2.toString());
            } else if (gVar != null && this.f82050b > 0) {
                this.f82049a.mo81550b_(null);
                StringBuilder sb3 = new StringBuilder("GroupListViewModel getGroupListFromNet failed: ");
                sb3.append(gVar.f30956a);
                sb3.append(", ");
                sb3.append(gVar.f30957b);
                sb3.append(", ");
                sb3.append(gVar.f30958c);
                sb3.append(", ");
                sb3.append(gVar.f30959d);
                sb3.append(", ");
                sb3.append(gVar.f30960e);
                C6921a.m21555a(sb3.toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel$c */
    static final class C31304c<T> implements Comparator<Conversation> {

        /* renamed from: a */
        public static final C31304c f82051a = new C31304c();

        C31304c() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m101961a((Conversation) obj, (Conversation) obj2);
        }

        /* renamed from: a */
        private static int m101961a(Conversation conversation, Conversation conversation2) {
            String str;
            if (conversation.compareTo(conversation2) != 0) {
                return conversation.compareTo(conversation2);
            }
            C7573i.m23582a((Object) conversation, "o1");
            ConversationCoreInfo coreInfo = conversation.getCoreInfo();
            String str2 = null;
            if (coreInfo != null) {
                str = coreInfo.getName();
            } else {
                str = null;
            }
            String d = C7048a.m21932d(C7048a.m21930c(str));
            C7573i.m23582a((Object) conversation2, "o2");
            ConversationCoreInfo coreInfo2 = conversation2.getCoreInfo();
            if (coreInfo2 != null) {
                str2 = coreInfo2.getName();
            }
            String d2 = C7048a.m21932d(C7048a.m21930c(str2));
            C7573i.m23582a((Object) d2, "CharacterUtil.hashCode(C…inyin(o2.coreInfo?.name))");
            return d.compareTo(d2);
        }
    }

    /* renamed from: a */
    public final void mo81883a(String str) {
    }

    /* renamed from: b */
    public final void mo81885b() {
        if (this.f82042b == 1) {
            m101954a(this.f82043c);
        }
    }

    public final void onCleared() {
        super.onCleared();
        this.f82043c = 0;
        this.f82045e = false;
        this.f82044d = false;
    }

    /* renamed from: a */
    public final void mo81882a() {
        boolean z;
        List list;
        switch (this.f82042b) {
            case 0:
                C31244a.m101818a();
                List a = C7525m.m23494a((Iterable<? extends T>) C31243a.m101793a(), (Comparator<? super T>) C31304c.f82051a);
                C0052o<List<IMContact>> oVar = this.f83143k;
                Iterable<Conversation> iterable = a;
                Collection arrayList = new ArrayList();
                for (Conversation a2 : iterable) {
                    IMContact a3 = C6959c.m21648a(a2);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
                oVar.postValue((List) arrayList);
                return;
            case 1:
                Collection collection = (Collection) this.f83143k.getValue();
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f83143k.postValue(this.f83143k.getValue());
                    List list2 = (List) this.f83143k.getValue();
                    if (list2 != null) {
                        list = C7525m.m23509d((Collection<? extends T>) list2);
                    } else {
                        list = null;
                    }
                    mo81551d(list, this.f82045e);
                    break;
                } else {
                    m101954a(0);
                    return;
                }
        }
    }

    /* renamed from: a */
    private final void m101954a(long j) {
        if (!this.f82044d) {
            this.f82044d = true;
            if (j <= 0) {
                mo81558j();
            } else if (j > 0 && this.f82045e) {
                mo81559k();
            }
            C31244a.m101818a();
            C31243a.m101795a(j, (C48007r<? super List<Conversation>, ? super Long, ? super Boolean, ? super C11438g, C7581n>) new C31303b<Object,Object,Object,Object,C7581n>(this, j));
        }
    }

    /* renamed from: b */
    public static List<IMContact> m101955b(List<IMContact> list) {
        if (C6307b.m19566a((Collection<T>) list)) {
            return new ArrayList<>();
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        List<IMContact> arrayList = new ArrayList<>();
        for (IMContact iMContact : list) {
            if (!arrayList.contains(iMContact)) {
                arrayList.add(iMContact);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo81884a(List<? extends IMContact> list) {
        C7573i.m23587b(list, "contactList");
        List d = C7525m.m23509d((Collection<? extends T>) mo82590o());
        for (IMContact iMContact : list) {
            if (d.contains(iMContact)) {
                d.remove(iMContact);
            } else {
                d.add(iMContact);
            }
        }
        this.f83148p.postValue(d);
    }
}
