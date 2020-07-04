package com.p280ss.android.ugc.aweme.p313im.sdk.group.viewmodel;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.p263im.core.model.Member;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C31741e;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.BaseMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1877a.C47886a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel */
public final class GroupMemberListViewModel extends BaseMemberListViewModel<Object> {

    /* renamed from: b */
    public String f82089b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel$a */
    static final class C31320a extends Lambda implements C7562b<List<? extends IMMember>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberListViewModel f82090a;

        C31320a(GroupMemberListViewModel groupMemberListViewModel) {
            this.f82090a = groupMemberListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102004a((List) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102004a(List<IMMember> list) {
            Object obj;
            if (list != null) {
                Iterable<IMMember> iterable = list;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                for (IMMember iMMember : iterable) {
                    IMUser user = iMMember.getUser();
                    if (user == null) {
                        user = new IMUser();
                        Member member = iMMember.getMember();
                        String str = null;
                        if (member != null) {
                            obj = Long.valueOf(member.getUid());
                        } else {
                            obj = null;
                        }
                        user.setUid(String.valueOf(obj));
                        Member member2 = iMMember.getMember();
                        if (member2 != null) {
                            str = member2.getAlias();
                        }
                        user.setNickName(str);
                    }
                    arrayList.add(user);
                }
                Iterable iterable2 = (List) arrayList;
                Collection arrayList2 = new ArrayList();
                for (Object next : iterable2) {
                    if (!C7573i.m23585a((Object) ((IMUser) next).getUid(), (Object) C7074e.m22069b())) {
                        arrayList2.add(next);
                    }
                }
                List a = C7525m.m23494a((Iterable<? extends T>) (List) arrayList2, (Comparator<? super T>) new Comparator<T>() {
                    public final int compare(T t, T t2) {
                        return C47886a.m148819a(((IMUser) t).getSortWeight(), ((IMUser) t2).getSortWeight());
                    }
                });
                this.f82090a.f83143k.postValue(a);
                this.f82090a.f83145m.postValue(C31741e.m103077a(a));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel$b */
    static final class C31322b extends Lambda implements C7562b<List<? extends IMMember>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberListViewModel f82091a;

        C31322b(GroupMemberListViewModel groupMemberListViewModel) {
            this.f82091a = groupMemberListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102005a((List) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102005a(List<IMMember> list) {
            if (list != null) {
                List arrayList = new ArrayList();
                for (IMMember iMMember : list) {
                    IMUser user = iMMember.getUser();
                    if (user == null || !user.equals(IMUser.fromUser(C7074e.m22071c()))) {
                        GroupMemberListViewModel.m101999a(arrayList, iMMember);
                    }
                }
                if (arrayList.size() > 1) {
                    C7525m.m23474a(arrayList, new Comparator<T>() {
                        public final int compare(T t, T t2) {
                            return C47886a.m148819a(((IMUser) t).getSortWeight(), ((IMUser) t2).getSortWeight());
                        }
                    });
                }
                this.f82091a.f83143k.postValue(arrayList);
                this.f82091a.f83145m.postValue(C31741e.m103077a(arrayList));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel$c */
    static final class C31324c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ List f82092a;

        /* renamed from: b */
        final /* synthetic */ GroupMemberListViewModel f82093b;

        /* renamed from: c */
        final /* synthetic */ String f82094c;

        C31324c(List list, GroupMemberListViewModel groupMemberListViewModel, String str) {
            this.f82092a = list;
            this.f82093b = groupMemberListViewModel;
            this.f82094c = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<IMUser> call() {
            return C6961d.m21657a().mo18024a(this.f82092a, this.f82094c, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel$d */
    static final class C31325d<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberListViewModel f82095a;

        /* renamed from: b */
        final /* synthetic */ String f82096b;

        C31325d(GroupMemberListViewModel groupMemberListViewModel, String str) {
            this.f82095a = groupMemberListViewModel;
            this.f82096b = str;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m102007a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102007a(C1592h<List<IMUser>> hVar) {
            C7573i.m23582a((Object) hVar, "task");
            if (!hVar.mo6882b() || hVar.mo6890e() == null) {
                this.f82095a.f83144l.postValue(C7525m.m23461a());
            } else {
                this.f82095a.f83144l.postValue(hVar.mo6890e());
            }
        }
    }

    /* renamed from: b */
    private final void m102000b() {
        String str = this.f82089b;
        if (str != null) {
            C31244a.m101818a().mo81792a(str, (C7562b<? super List<IMMember>, C7581n>) new C31322b<Object,C7581n>(this));
        }
    }

    /* renamed from: c */
    private final void m102001c() {
        String str = this.f82089b;
        if (str != null) {
            C31244a.m101818a().mo81792a(str, (C7562b<? super List<IMMember>, C7581n>) new C31320a<Object,C7581n>(this));
        }
    }

    /* renamed from: a */
    public final void mo81882a() {
        switch (this.f83142j) {
            case 5:
                m102000b();
                return;
            case 6:
                m102001c();
                break;
        }
    }

    /* renamed from: a */
    public final void mo81883a(String str) {
        List list;
        if (str != null) {
            this.f83149q.postValue(str);
            List list2 = (List) this.f83143k.getValue();
            if (list2 != null) {
                Iterable<IMContact> iterable = list2;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                for (IMContact iMContact : iterable) {
                    if (iMContact != null) {
                        arrayList.add((IMUser) iMContact);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                    }
                }
                list = (List) arrayList;
            } else {
                list = null;
            }
            if (list != null) {
                C1592h.m7853a((Callable<TResult>) new C31324c<TResult>(list, this, str)).mo6875a((C1591g<TResult, TContinuationResult>) new C31325d<TResult,TContinuationResult>(this, str));
            }
            if (str != null) {
                return;
            }
        }
        GroupMemberListViewModel groupMemberListViewModel = this;
        groupMemberListViewModel.f83149q.postValue("");
        groupMemberListViewModel.f83144l.postValue(C7525m.m23461a());
    }

    /* renamed from: a */
    public static void m101999a(List<IMUser> list, IMMember iMMember) {
        Object obj;
        IMUser user = iMMember.getUser();
        if (user == null) {
            user = new IMUser();
            Member member = iMMember.getMember();
            String str = null;
            if (member != null) {
                obj = Long.valueOf(member.getUid());
            } else {
                obj = null;
            }
            user.setUid(String.valueOf(obj));
            Member member2 = iMMember.getMember();
            if (member2 != null) {
                str = member2.getAlias();
            }
            user.setNickName(str);
        }
        list.add(user);
    }
}
