package com.p280ss.android.ugc.aweme.p313im.sdk.p314d;

import android.support.p022v4.util.C0894f;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareAwemeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareLiveContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareUserContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C31479j;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.UserStruct;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C7048a;
import com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.d */
public class C6961d {

    /* renamed from: b */
    private static C6961d f19670b;

    /* renamed from: a */
    public Set<String> f19671a;

    /* renamed from: c */
    private C0894f<String, IMUser> f19672c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.d$a */
    public interface C6966a {
        /* renamed from: a */
        void mo18035a(IMUser iMUser);
    }

    /* renamed from: a */
    private void m21666a(final String str, String str2, final C6966a aVar) {
        if (!this.f19671a.contains(str) && !IMUser.isInvalidUser(str)) {
            this.f19671a.add(str);
            C7077s.m22138a(str, str2, (C1591g<UserStruct, Boolean>) new C1591g<UserStruct, Boolean>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Boolean then(C1592h<UserStruct> hVar) {
                    if (hVar.mo6889d()) {
                        if ((hVar.mo6891f() instanceof ApiServerException) && ((ApiServerException) hVar.mo6891f()).getErrorCode() == 2065) {
                            C31850a.m103357a();
                            C31850a.m103359a(str);
                        }
                    } else if (hVar.mo6882b() && hVar.mo6890e() != null) {
                        User user = ((UserStruct) hVar.mo6890e()).getUser();
                        if (user != null && !TextUtils.isEmpty(user.getUid())) {
                            C6961d.this.mo18026a(IMUser.fromUser(user));
                            return Boolean.valueOf(true);
                        }
                    }
                    return Boolean.valueOf(false);
                }
            }).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<Boolean, Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(C1592h<Boolean> hVar) {
                    C6961d.this.f19671a.remove(str);
                    if (hVar.mo6882b() && ((Boolean) hVar.mo6890e()).booleanValue()) {
                        C7705c.m23799a().mo20394d(new C31090n(str));
                        if (aVar != null) {
                            aVar.mo18035a(C6961d.this.mo18019a(str));
                        }
                    }
                    return null;
                }
            }, C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public final void mo18028a(Map<String, String> map, C31089m mVar) {
        if (!map.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Entry entry : map.entrySet()) {
                if (entry.getKey() != null && !this.f19671a.contains(entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    this.f19671a.add(entry.getKey());
                    sb.append("\"");
                    sb.append((String) entry.getValue());
                    sb.append("\",");
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                StringBuilder sb3 = new StringBuilder("[");
                sb3.append(sb2.substring(0, sb2.lastIndexOf(",")));
                sb3.append("]");
                m21667a(sb3.toString(), map, true, mVar);
            }
        }
    }

    /* renamed from: a */
    private void m21667a(String str, Map<String, String> map, boolean z, C31089m mVar) {
        C31081e eVar = new C31081e(this, z, str, map, mVar);
        C7077s.m22136a(str, (C1591g<C31479j, List<IMUser>>) eVar).mo6876a(C31082f.f81574a, C1592h.f5958b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ List mo18025a(boolean z, String str, Map map, C31089m mVar, C1592h hVar) throws Exception {
        if (!hVar.mo6889d() || !z) {
            for (Entry entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    this.f19671a.remove(entry.getKey());
                }
            }
            if (!hVar.mo6882b() || hVar.mo6890e() == null) {
                return null;
            }
            List<? extends IMUser> list = ((C31479j) hVar.mo6890e()).f82432a;
            if (list != null && list.size() > 0) {
                for (IMUser a : list) {
                    mo18026a(a);
                }
            }
            if (mVar != null) {
                mVar.mo81575a((C31479j) hVar.mo6890e());
            }
            return list;
        }
        m21667a(str, map, false, mVar);
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ Void m21664a(C1592h hVar) throws Exception {
        List<IMUser> list = (List) hVar.mo6890e();
        if (hVar.mo6882b() && list != null && list.size() > 0) {
            for (IMUser iMUser : list) {
                if (iMUser != null && !TextUtils.isEmpty(iMUser.getUid())) {
                    C7705c.m23799a().mo20394d(new C31090n(iMUser.getUid()));
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final IMUser mo18021a(String str, String str2) {
        return m21663a(str, str2, true, (C6966a) null);
    }

    /* renamed from: a */
    public final IMUser mo18022a(String str, boolean z) {
        return m21663a(str, "", z, (C6966a) null);
    }

    /* renamed from: a */
    public final IMUser mo18020a(String str, C6966a aVar) {
        return m21663a(str, "", true, aVar);
    }

    /* renamed from: a */
    public final void mo18026a(IMUser iMUser) {
        if (iMUser != null) {
            C31850a.m103357a().mo82683a(iMUser);
            m21669b(iMUser);
        }
    }

    /* renamed from: a */
    public final void mo18027a(IMUser iMUser, boolean z) {
        if (iMUser != null && !TextUtils.isEmpty(iMUser.getUid())) {
            String uid = iMUser.getUid();
            if (((IMUser) this.f19672c.mo3341a(uid)) != null) {
                if (iMUser.getFollowStatus() == 0 && iMUser.isHasUnreadStory()) {
                    iMUser.setHasUnreadStory(false);
                }
                this.f19672c.mo3347b(uid);
                this.f19672c.mo3342a(uid, iMUser);
                m21670b(iMUser, z);
            }
        }
    }

    /* renamed from: a */
    public final List<IMUser> mo18023a(List<IMUser> list, String str) {
        return mo18024a(list, str, false);
    }

    /* renamed from: a */
    public final List<IMUser> mo18024a(List<IMUser> list, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty() && !TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    break;
                } else if (C7048a.m21926a(str.charAt(i))) {
                    str = C7048a.m21930c(str).toLowerCase();
                    break;
                } else {
                    i++;
                }
            }
            for (IMUser iMUser : list) {
                if (z || iMUser.getType() == 0 || iMUser.getType() == 3) {
                    if (C6399b.m19944t()) {
                        if (!C7074e.m22067a(iMUser)) {
                            if (!TextUtils.isEmpty(iMUser.getUniqueId())) {
                                if (m21671b(iMUser.getUniqueId(), lowerCase)) {
                                    iMUser.setSearchType(1);
                                    arrayList.add(iMUser);
                                }
                            } else if (m21671b(iMUser.getShortId(), lowerCase)) {
                                iMUser.setSearchType(1);
                                arrayList.add(iMUser);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(iMUser.getRemarkName()) && (m21671b(iMUser.getRemarkName(), lowerCase) || (!C31915n.m103671a() && (m21671b(iMUser.getRemarkInitial(), lowerCase) || m21668a(iMUser.getRemarkName(), iMUser.getRemarkPinyin(), lowerCase, str))))) {
                        iMUser.setSearchType(5);
                        arrayList.add(iMUser);
                    } else if (!TextUtils.isEmpty(iMUser.getNickName()) && (m21671b(iMUser.getNickName(), lowerCase) || (!C31915n.m103671a() && (m21671b(iMUser.getNickNameInitial(), lowerCase) || m21668a(iMUser.getNickName(), iMUser.getNickNamePinyin(), lowerCase, str))))) {
                        iMUser.setSearchType(3);
                        arrayList.add(iMUser);
                    } else if (!TextUtils.isEmpty(iMUser.getContactName()) && (m21671b(iMUser.getContactName(), lowerCase) || ((!C31915n.m103671a() && m21671b(iMUser.getContactNameInitial(), lowerCase)) || m21668a(iMUser.getContactName(), iMUser.getContactNamePinyin(), lowerCase, str)))) {
                        iMUser.setSearchType(2);
                        arrayList.add(iMUser);
                    } else if (C6399b.m19945u()) {
                        if (!TextUtils.isEmpty(iMUser.getUniqueId())) {
                            if (m21671b(iMUser.getUniqueId(), lowerCase)) {
                                iMUser.setSearchType(1);
                                arrayList.add(iMUser);
                            }
                        } else if (m21671b(iMUser.getShortId(), lowerCase)) {
                            iMUser.setSearchType(1);
                            arrayList.add(iMUser);
                        }
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new Comparator<IMUser>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return m21692a((IMUser) obj, (IMUser) obj2);
                }

                /* renamed from: a */
                private static int m21692a(IMUser iMUser, IMUser iMUser2) {
                    if (iMUser == null && iMUser2 == null) {
                        return 0;
                    }
                    if (iMUser == null || iMUser2 == null) {
                        if (iMUser == null) {
                            return -1;
                        }
                        return 1;
                    } else if (C6399b.m19944t()) {
                        return Integer.compare(iMUser.getSearchType(), iMUser2.getSearchType());
                    } else {
                        return Integer.compare(iMUser2.getSearchType(), iMUser.getSearchType());
                    }
                }
            });
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m21668a(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str4)) {
            return false;
        }
        if (str2.contains(str3)) {
            return true;
        }
        if (!str2.contains(str4)) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        for (char a : str3.toCharArray()) {
            if (C7048a.m21926a(a)) {
                if (i > i2 && !str.contains(str3.substring(i2, i))) {
                    return false;
                }
                i++;
                i2 = i;
            } else if (i != str3.length() - 1) {
                i++;
            } else if (!str.contains(str3.substring(i2, i + 1))) {
                return false;
            }
        }
        return true;
    }

    private C6961d() {
        m21674f();
    }

    /* renamed from: c */
    public static List<IMUser> m21672c() {
        return C31850a.m103357a().mo82685c(C31850a.m103370i());
    }

    /* renamed from: d */
    public static List<IMUser> m21673d() {
        return C31850a.m103357a().mo82685c(C31850a.m103366e());
    }

    /* renamed from: a */
    public static C6961d m21657a() {
        if (f19670b == null) {
            synchronized (C6961d.class) {
                if (f19670b == null) {
                    f19670b = new C6961d();
                }
            }
        }
        return f19670b;
    }

    /* renamed from: f */
    private void m21674f() {
        this.f19672c = new C0894f<>(1000);
        this.f19671a = new HashSet();
    }

    /* renamed from: b */
    public final void mo18030b() {
        this.f19672c.mo3343a();
    }

    /* renamed from: e */
    public final List<IMUser> mo18032e() {
        ArrayList arrayList = new ArrayList();
        List<Conversation> b = C6417a.m20015a().mo15539b();
        if (b == null) {
            return arrayList;
        }
        Iterator it = b.iterator();
        while (it.hasNext()) {
            Conversation conversation = (Conversation) it.next();
            Message lastMessage = conversation.getLastMessage();
            long a = C6425b.m20074a(conversation.getConversationId());
            if (conversation.getConversationType() != C11203a.f30380a || lastMessage == null || lastMessage.getMsgType() == 15 || a <= 0) {
                it.remove();
            }
        }
        if (b.size() > 10) {
            b = b.subList(0, 10);
        }
        for (Conversation conversationId : b) {
            IMUser b2 = mo18029b(String.valueOf(C6425b.m20074a(conversationId.getConversationId())));
            if (b2 != null) {
                b2.setType(1);
                arrayList.add(b2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private void m21669b(IMUser iMUser) {
        mo18027a(iMUser, iMUser.isHasUnreadStory());
    }

    /* renamed from: a */
    public final IMUser mo18019a(String str) {
        return mo18022a(str, false);
    }

    /* renamed from: b */
    public final IMUser mo18029b(String str) {
        return mo18022a(str, true);
    }

    /* renamed from: c */
    public final void mo18031c(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (((IMUser) this.f19672c.mo3341a(str)) != null) {
                this.f19672c.mo3347b(str);
            }
            C31850a.m103357a();
            C31850a.m103359a(str);
        }
    }

    /* renamed from: a */
    public static IMUser m21658a(ShareAwemeContent shareAwemeContent) {
        IMUser iMUser = new IMUser();
        iMUser.setNickName(shareAwemeContent.getContentName());
        iMUser.setAvatarThumb(shareAwemeContent.getContentThumb());
        iMUser.setSignature("");
        iMUser.setUid(shareAwemeContent.getUser());
        return iMUser;
    }

    /* renamed from: a */
    public static IMUser m21659a(ShareLiveContent shareLiveContent) {
        IMUser iMUser = new IMUser();
        iMUser.setNickName(shareLiveContent.getRoomOwnerName());
        iMUser.setAvatarThumb(shareLiveContent.getRoomOwnerAvatar());
        iMUser.setSignature("");
        iMUser.setUid(shareLiveContent.getRoomOwnerId());
        return iMUser;
    }

    /* renamed from: a */
    public static IMUser m21660a(ShareUserContent shareUserContent) {
        IMUser iMUser = new IMUser();
        iMUser.setNickName(shareUserContent.getName());
        iMUser.setAvatarThumb(shareUserContent.getAvatar());
        iMUser.setSignature("");
        iMUser.setUid(shareUserContent.getUid());
        return iMUser;
    }

    /* renamed from: a */
    public static IMUser m21661a(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return (IMUser) iMContact;
        }
        if (iMContact instanceof IMConversation) {
            return m21662a((IMConversation) iMContact);
        }
        return null;
    }

    /* renamed from: a */
    private static IMUser m21662a(IMConversation iMConversation) {
        if (iMConversation.getConversationType() != C11203a.f30380a) {
            return null;
        }
        return m21657a().mo18029b(String.valueOf(C6425b.m20074a(iMConversation.getConversationId())));
    }

    /* renamed from: a */
    private void m21665a(String str, IMUser iMUser) {
        if (!TextUtils.isEmpty(str) && iMUser != null) {
            this.f19672c.mo3342a(str, iMUser);
        }
    }

    /* renamed from: b */
    private void m21670b(final IMUser iMUser, boolean z) {
        if (iMUser.isHasUnreadStory() != z) {
            C1592h.m7855a((Callable<TResult>) new Callable<Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    C7705c.m23799a().mo20394d(new C31090n(iMUser.getUid()));
                    return null;
                }
            }, C1592h.f5958b);
        }
    }

    /* renamed from: b */
    public static boolean m21671b(String str, String str2) {
        if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(str2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private IMUser m21663a(String str, String str2, boolean z, C6966a aVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        IMUser iMUser = (IMUser) this.f19672c.mo3341a(str);
        if (iMUser == null) {
            iMUser = C31850a.m103357a().mo82684b(str);
            if (iMUser != null) {
                m21665a(str, iMUser);
            } else if (z) {
                String b = C31085i.m101389b(str);
                if (!TextUtils.isEmpty(b) || TextUtils.isEmpty(str2)) {
                    str2 = b;
                }
                m21666a(str, str2, aVar);
            }
        }
        return iMUser;
    }
}
