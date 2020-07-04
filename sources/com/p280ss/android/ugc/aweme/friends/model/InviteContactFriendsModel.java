package com.p280ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import android.util.Base64;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.api.C30029a;
import com.p280ss.android.ugc.aweme.friends.api.FriendApi;
import com.p280ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.p280ss.android.ugc.aweme.friends.invite.ShortenUrlModel;
import com.p280ss.android.ugc.aweme.friends.invite.SmgSettingsModel;
import com.p280ss.android.ugc.aweme.friends.p1282b.C30036a;
import com.p280ss.android.ugc.aweme.friends.p1283c.C30039a;
import com.p280ss.android.ugc.aweme.friends.p1284d.C30051b;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.utils.C42918af;
import com.p280ss.android.ugc.aweme.utils.C42924al;
import com.p280ss.android.ugc.aweme.utils.C42925am;
import com.p280ss.android.ugc.aweme.utils.C43013ch;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel */
public class InviteContactFriendsModel extends C30039a<Friend> {
    private final FriendApi friendApi = ((FriendApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(FriendApi.class));
    private HashMap<String, ContactModel> hashContactsMap = new HashMap<>();
    public List<Integer> mIndexCounts = new ArrayList();
    public List<String> mIndexLetters = new ArrayList();
    private InvitedContactCacher sInvitedContactCacher = new InvitedContactCacher(604800000);

    /* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$ContactFriend */
    public static class ContactFriend extends Friend {
        String firstName;
        String lastName;
        public int originIndex;
        public String section;
        String url;

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getOriginIndex() {
            return this.originIndex;
        }

        public String getSection() {
            return this.section;
        }

        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public ContactFriend(String str) {
            super(str);
        }

        public void setFirstName(String str) {
            this.firstName = str;
        }

        public void setLastName(String str) {
            this.lastName = str;
        }

        public void setOriginIndex(int i) {
            this.originIndex = i;
        }

        public void setSection(String str) {
            this.section = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ContactFriend) {
                ContactFriend contactFriend = (ContactFriend) obj;
                if (TextUtils.equals(getSocialName(), contactFriend.getSocialName()) && TextUtils.equals(getNickname(), contactFriend.getNickname())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$IFetchShareConfigCallback */
    public interface IFetchShareConfigCallback {
        void onFailed();

        void onSuccess(SmgSettingsModel smgSettingsModel);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$InviteFriendsCallback */
    public interface InviteFriendsCallback {
        void onFailed(String str);

        void onSuccess();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$InvitedContactCacher */
    static class InvitedContactCacher {
        private Map<String, Long> invited;
        private final long mExpiredTime;
        private final Object mLock = new Object();
        private Runnable mSaveRunnable = new InviteContactFriendsModel$InvitedContactCacher$$Lambda$0(this);

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void lambda$new$1$InviteContactFriendsModel$InvitedContactCacher() {
            C1592h.m7853a((Callable<TResult>) new InviteContactFriendsModel$InvitedContactCacher$$Lambda$1<TResult>(this));
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|(4:10|(4:13|(2:19|32)|20|11)|31|21)|22|23|(1:25)) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0061 */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void delayInit() {
            /*
                r11 = this;
                java.lang.Object r0 = r11.mLock
                monitor-enter(r0)
                java.util.Map<java.lang.String, java.lang.Long> r1 = r11.invited     // Catch:{ all -> 0x006e }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x006e }
                return
            L_0x0009:
                com.ss.android.ugc.aweme.friends.b.a r1 = com.p280ss.android.ugc.aweme.friends.p1282b.C30036a.m98493b()     // Catch:{ Exception -> 0x0061 }
                java.lang.String r1 = r1.mo76281a()     // Catch:{ Exception -> 0x0061 }
                boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0061 }
                if (r2 != 0) goto L_0x0061
                java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Exception -> 0x0061 }
                r2.<init>()     // Catch:{ Exception -> 0x0061 }
                r11.invited = r2     // Catch:{ Exception -> 0x0061 }
                org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x0061 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x0061 }
                r1 = 0
            L_0x0024:
                int r3 = r2.length()     // Catch:{ Exception -> 0x0061 }
                if (r1 >= r3) goto L_0x005c
                org.json.JSONObject r3 = r2.optJSONObject(r1)     // Catch:{ Exception -> 0x0061 }
                java.lang.String r4 = "social_name"
                java.lang.String r4 = r3.optString(r4)     // Catch:{ Exception -> 0x0061 }
                java.lang.String r5 = "invited_time"
                long r5 = r3.optLong(r5)     // Catch:{ Exception -> 0x0061 }
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0061 }
                boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r4)     // Catch:{ Exception -> 0x0061 }
                if (r3 != 0) goto L_0x0059
                r9 = 0
                int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r3 <= 0) goto L_0x0059
                boolean r3 = r11.hasExpired(r5, r7)     // Catch:{ Exception -> 0x0061 }
                if (r3 != 0) goto L_0x0059
                java.util.Map<java.lang.String, java.lang.Long> r3 = r11.invited     // Catch:{ Exception -> 0x0061 }
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0061 }
                r3.put(r4, r5)     // Catch:{ Exception -> 0x0061 }
            L_0x0059:
                int r1 = r1 + 1
                goto L_0x0024
            L_0x005c:
                java.lang.Runnable r1 = r11.mSaveRunnable     // Catch:{ Exception -> 0x0061 }
                r1.run()     // Catch:{ Exception -> 0x0061 }
            L_0x0061:
                java.util.Map<java.lang.String, java.lang.Long> r1 = r11.invited     // Catch:{ all -> 0x006e }
                if (r1 != 0) goto L_0x006c
                java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x006e }
                r1.<init>()     // Catch:{ all -> 0x006e }
                r11.invited = r1     // Catch:{ all -> 0x006e }
            L_0x006c:
                monitor-exit(r0)     // Catch:{ all -> 0x006e }
                return
            L_0x006e:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x006e }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.InvitedContactCacher.delayInit():void");
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ Object lambda$null$0$InviteContactFriendsModel$InvitedContactCacher() throws Exception {
            if (this.invited == null) {
                SharePrefCache.inst().setInvitedContacts("");
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.invited.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (hasExpired(((Long) entry.getValue()).longValue(), currentTimeMillis)) {
                    it.remove();
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("social_name", entry.getKey());
                    jSONObject.put("invited_time", entry.getValue());
                    jSONArray.put(jSONObject);
                }
            }
            C30036a.m98493b().mo76283a(jSONArray.toString());
            return null;
        }

        InvitedContactCacher(long j) {
            this.mExpiredTime = j;
        }

        public void add(String str) {
            delayInit();
            synchronized (this.mLock) {
                this.invited.put(str, Long.valueOf(System.currentTimeMillis()));
                this.mSaveRunnable.run();
            }
        }

        private boolean hasExpired(long j, long j2) {
            if (j + this.mExpiredTime <= j2) {
                return true;
            }
            return false;
        }

        public boolean contains(String str, long j) {
            delayInit();
            if (!this.invited.containsKey(str) || hasExpired(((Long) this.invited.get(str)).longValue(), j)) {
                return false;
            }
            return true;
        }
    }

    public void buildFriendItems(FriendList<Friend> friendList) {
    }

    private C1592h<FriendList<ContactFriend>> uploadContacts() {
        AtomicReference atomicReference = new AtomicReference();
        return C1592h.m7853a((Callable<TResult>) new InviteContactFriendsModel$$Lambda$1<TResult>(this, atomicReference)).mo6885c((C1591g<TResult, TContinuationResult>) new InviteContactFriendsModel$$Lambda$2<TResult,TContinuationResult>(this, atomicReference));
    }

    public void addInvitedContact(String str) {
        if (this.sInvitedContactCacher != null) {
            this.sInvitedContactCacher.add(str);
        }
    }

    public void fetchShareConfig(IFetchShareConfigCallback iFetchShareConfigCallback) {
        C1592h.m7853a((Callable<TResult>) new InviteContactFriendsModel$$Lambda$6<TResult>(this, iFetchShareConfigCallback));
    }

    public ShortenUrlModel shortenUrl(String str) throws ExecutionException, InterruptedException {
        return (ShortenUrlModel) C30029a.m98491a().shortenUrl(str).get();
    }

    public static Key getKey(String str) {
        try {
            return new SecretKeySpec(str.getBytes(), "AES");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static final /* synthetic */ C1592h lambda$fetchList$0$InviteContactFriendsModel(C1592h hVar) throws Exception {
        if (!hVar.mo6889d()) {
            hVar.getClass();
            return C1592h.m7853a(InviteContactFriendsModel$$Lambda$9.get$Lambda(hVar));
        }
        throw hVar.mo6891f();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object lambda$fetchShareConfig$8$InviteContactFriendsModel(IFetchShareConfigCallback iFetchShareConfigCallback) throws Exception {
        SmgSettingsModel smgSettingsModel;
        try {
            smgSettingsModel = (SmgSettingsModel) C30029a.m98491a().getInviteContactFriendsSettings().get();
        } catch (Throwable unused) {
            smgSettingsModel = null;
        }
        if (smgSettingsModel != null) {
            this.mHandler.post(new InviteContactFriendsModel$$Lambda$7(iFetchShareConfigCallback, smgSettingsModel));
        }
        return null;
    }

    public InviteContactFriendsModel(String str) {
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ UploadContactsResult lambda$uploadContacts$1$InviteContactFriendsModel(AtomicReference atomicReference) throws Exception {
        atomicReference.set(C42925am.m136269a(C6399b.m19921a(), "sort_key", true));
        List<DouyinContactModel> list = ((C42924al) atomicReference.get()).f111453a;
        filterInvalidVal(list);
        if (C6307b.m19566a((Collection<T>) list)) {
            return new UploadContactsResult();
        }
        encodeAndAddToCache((C42924al) atomicReference.get());
        if (C6307b.m19566a((Collection<T>) list)) {
            return new UploadContactsResult();
        }
        return UploadContactsApi.m98489a(list, 1);
    }

    private void encodeAndAddToCache(C42924al alVar) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        this.hashContactsMap.clear();
        int i = 0;
        for (DouyinContactModel douyinContactModel : alVar.f111453a) {
            for (String str : douyinContactModel.phoneNumber) {
                if (!TextUtils.isEmpty(str)) {
                    String str2 = douyinContactModel.name;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    ContactModel contactModel = new ContactModel(str, str2);
                    contactModel.url = douyinContactModel.mImageUrl;
                    contactModel.firstName = douyinContactModel.givenName;
                    contactModel.lastName = douyinContactModel.familyName;
                    contactModel.originIndex = i;
                    contactModel.mSection = douyinContactModel.section;
                    HashMap<String, ContactModel> hashMap = this.hashContactsMap;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C6306c.m19562a(instance.digest(douyinContactModel.nationalNumber(str).getBytes("UTF-8"))));
                    sb.append(C6306c.m19562a(instance.digest(str2.getBytes("UTF-8"))));
                    hashMap.put(sb.toString(), contactModel);
                }
            }
            i++;
        }
    }

    private void filterInvalidVal(List<DouyinContactModel> list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DouyinContactModel douyinContactModel = (DouyinContactModel) it.next();
            if (C6319n.m19593a(douyinContactModel.name) || douyinContactModel.phoneNumber.isEmpty()) {
                it.remove();
            } else if (!C6319n.m19593a(douyinContactModel.familyName) || !C6319n.m19593a(douyinContactModel.givenName)) {
                Iterator it2 = douyinContactModel.phoneNumber.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    try {
                        if (C6319n.m19593a(str)) {
                            it2.remove();
                        } else if (str.charAt(0) == '+') {
                            if (!C30051b.m98521a(str, null)) {
                                it2.remove();
                            }
                        } else if (str.length() < 2 || str.length() > 17 || !str.matches("[0-9.-]+")) {
                            it2.remove();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (douyinContactModel.phoneNumber.isEmpty()) {
                    it.remove();
                }
            } else {
                it.remove();
            }
        }
    }

    private void sortWithContactIndex(List<ContactFriend> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            ContactFriend contactFriend = (ContactFriend) it.next();
            if (!TextUtils.equals(contactFriend.section, "#") && !TextUtils.equals(contactFriend.section, "…") && contactFriend.section != null && !TextUtils.isEmpty(contactFriend.section.trim())) {
                z = false;
            }
            if (z) {
                it.remove();
                contactFriend.setSection("#");
                arrayList.add(contactFriend);
            }
        }
        Collections.sort(arrayList, InviteContactFriendsModel$$Lambda$3.$instance);
        Collections.sort(list, InviteContactFriendsModel$$Lambda$4.$instance);
        list.addAll(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ContactFriend contactFriend2 : list) {
            if (contactFriend2 != null) {
                String section = contactFriend2.getSection();
                if (!linkedHashMap.containsKey(section)) {
                    linkedHashMap.put(section, Integer.valueOf(1));
                } else {
                    linkedHashMap.put(section, Integer.valueOf(((Integer) linkedHashMap.get(section)).intValue() + 1));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str : linkedHashMap.keySet()) {
            arrayList2.add(str);
            arrayList3.add(linkedHashMap.get(str));
        }
        this.mIndexLetters = arrayList2;
        this.mIndexCounts = arrayList3;
    }

    static final /* synthetic */ int lambda$sortWithContactIndex$4$InviteContactFriendsModel(ContactFriend contactFriend, ContactFriend contactFriend2) {
        return contactFriend.originIndex - contactFriend2.originIndex;
    }

    static final /* synthetic */ void lambda$null$7$InviteContactFriendsModel(IFetchShareConfigCallback iFetchShareConfigCallback, SmgSettingsModel smgSettingsModel) {
        if (iFetchShareConfigCallback != null) {
            if (smgSettingsModel != null) {
                iFetchShareConfigCallback.onSuccess(smgSettingsModel);
                return;
            }
            iFetchShareConfigCallback.onFailed();
        }
    }

    private static String encryptAES(String str, String str2) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException {
        byte[] bytes = str.getBytes("UTF-8");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
        try {
            instance.init(1, getKey(str2), new IvParameterSpec(str2.getBytes("UTF-8")));
            return Base64.encodeToString(instance.doFinal(bytes), 2);
        } catch (InvalidAlgorithmParameterException unused) {
            return "";
        }
    }

    private void sort(C42924al alVar, List<ContactFriend> list) {
        boolean z;
        if (!C6307b.m19566a((Collection<T>) list)) {
            if (alVar.f111455c == null || alVar.f111454b == null) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (C43013ch.m136516c()) {
                    for (ContactFriend contactFriend : list) {
                        contactFriend.setSection(C42918af.m136255a(contactFriend.getNickname(), true));
                    }
                }
            }
            sortWithContactIndex(list);
        }
    }

    static final /* synthetic */ int lambda$sortWithContactIndex$3$InviteContactFriendsModel(ContactFriend contactFriend, ContactFriend contactFriend2) {
        char charAt = contactFriend.getNickname().toLowerCase().charAt(0);
        char charAt2 = contactFriend2.getNickname().toLowerCase().charAt(0);
        if (charAt < 'a' || charAt > 'z') {
            if (charAt2 >= 'a' && charAt2 <= 'z') {
                return 1;
            }
            if (charAt < '0' || charAt > '9') {
                if (charAt2 < '0' || charAt2 > '9') {
                    return contactFriend.originIndex - contactFriend2.originIndex;
                }
                return 1;
            } else if (charAt2 < '0' || charAt2 > '9') {
                return -1;
            } else {
                return charAt - charAt2;
            }
        } else if (charAt2 < 'a' || charAt2 > 'z') {
            return -1;
        } else {
            return contactFriend.originIndex - contactFriend2.originIndex;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FriendList lambda$uploadContacts$2$InviteContactFriendsModel(AtomicReference atomicReference, C1592h hVar) throws Exception {
        ArrayList arrayList;
        List<ContactModel> list = ((UploadContactsResult) hVar.mo6890e()).contacts;
        if (!C6307b.m19566a((Collection<T>) list)) {
            arrayList = new ArrayList(list.size());
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            for (ContactModel contactModel : list) {
                HashMap<String, ContactModel> hashMap = this.hashContactsMap;
                StringBuilder sb = new StringBuilder();
                sb.append(contactModel.phoneNumber);
                sb.append(contactModel.name);
                ContactModel contactModel2 = (ContactModel) hashMap.get(sb.toString());
                if (contactModel2 != null) {
                    contactModel.phoneNumber = contactModel2.phoneNumber;
                    contactModel.name = contactModel2.name;
                }
                ContactFriend contactFriend = new ContactFriend(contactModel.phoneNumber);
                contactFriend.setNickname(contactModel.name);
                if (contactModel2 != null) {
                    contactFriend.setFirstName(contactModel2.firstName);
                    contactFriend.setLastName(contactModel2.lastName);
                    contactFriend.setOriginIndex(contactModel2.originIndex);
                    contactFriend.setSection(contactModel2.mSection);
                    String str = contactModel2.url;
                    if (!C6319n.m19593a(str)) {
                        UrlModel urlModel = new UrlModel();
                        urlModel.setHeight(-1);
                        urlModel.setWidth(-1);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(str);
                        urlModel.setUrlList(arrayList2);
                        contactFriend.setAvatarThumb(urlModel);
                    }
                }
                if (!arrayList.contains(contactFriend)) {
                    if (this.sInvitedContactCacher.contains(contactModel.phoneNumber, currentTimeMillis)) {
                        contactFriend.setInvited(true);
                        arrayList.add(contactFriend);
                    } else {
                        arrayList.add(i, contactFriend);
                        i++;
                    }
                }
            }
        } else {
            arrayList = null;
        }
        FriendList friendList = new FriendList();
        sort((C42924al) atomicReference.get(), arrayList);
        friendList.friends = arrayList;
        return friendList;
    }

    public void inviteFriends(String str, List<ContactModel> list, InviteFriendsCallback inviteFriendsCallback) {
        inviteFriends(str, list, null, inviteFriendsCallback);
    }

    static final /* synthetic */ void lambda$null$5$InviteContactFriendsModel(boolean z, InviteFriendsCallback inviteFriendsCallback, String str) {
        if (z) {
            inviteFriendsCallback.onSuccess();
        } else {
            inviteFriendsCallback.onFailed(str);
        }
    }

    public void fetchList(int i, int i2, int i3) {
        uploadContacts().mo6879b(InviteContactFriendsModel$$Lambda$0.$instance).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
    }

    public void inviteFriends(String str, List<ContactModel> list, String str2, InviteFriendsCallback inviteFriendsCallback) {
        if (!C6319n.m19593a(str) && !C6307b.m19566a((Collection<T>) list)) {
            try {
                InviteContactFriendsModel$$Lambda$5 inviteContactFriendsModel$$Lambda$5 = new InviteContactFriendsModel$$Lambda$5(this, list, str, str2, inviteFriendsCallback);
                C1592h.m7853a((Callable<TResult>) inviteContactFriendsModel$$Lambda$5);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.friends.model.ContactModel>, for r6v0, types: [java.util.List, java.util.List<com.ss.android.ugc.aweme.friends.model.ContactModel>] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object lambda$inviteFriends$6$InviteContactFriendsModel(java.util.List<com.p280ss.android.ugc.aweme.friends.model.ContactModel> r6, java.lang.String r7, java.lang.String r8, com.p280ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.InviteFriendsCallback r9) throws java.lang.Exception {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            boolean r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()     // Catch:{ Exception -> 0x008b }
            if (r3 == 0) goto L_0x004e
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x008b }
            r3.<init>()     // Catch:{ Exception -> 0x008b }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x008b }
        L_0x0012:
            boolean r4 = r6.hasNext()     // Catch:{ Exception -> 0x008b }
            if (r4 == 0) goto L_0x0026
            java.lang.Object r4 = r6.next()     // Catch:{ Exception -> 0x008b }
            com.ss.android.ugc.aweme.friends.model.ContactModel r4 = (com.p280ss.android.ugc.aweme.friends.model.ContactModel) r4     // Catch:{ Exception -> 0x008b }
            if (r4 == 0) goto L_0x0012
            java.lang.String r4 = r4.phoneNumber     // Catch:{ Exception -> 0x008b }
            r3.put(r4)     // Catch:{ Exception -> 0x008b }
            goto L_0x0012
        L_0x0026:
            java.lang.String r6 = r3.toString()     // Catch:{ Exception -> 0x008b }
            java.lang.String r3 = "J?I7iAd=3j9AM1P="
            java.lang.String r6 = encryptAES(r6, r3)     // Catch:{ Exception -> 0x008b }
            com.ss.android.ugc.aweme.friends.api.FriendApi r3 = com.p280ss.android.ugc.aweme.friends.api.C30029a.m98491a()     // Catch:{ Exception -> 0x008b }
            com.google.common.util.concurrent.l r6 = r3.inviteBySms(r7, r8, r6)     // Catch:{ Exception -> 0x008b }
            java.lang.Object r6 = r6.get()     // Catch:{ Exception -> 0x008b }
            com.ss.android.ugc.aweme.friends.api.c r6 = (com.p280ss.android.ugc.aweme.friends.api.C30031c) r6     // Catch:{ Exception -> 0x008b }
            if (r6 == 0) goto L_0x004b
            java.lang.String r7 = "success"
            java.lang.String r6 = r6.f79000a     // Catch:{ Exception -> 0x008b }
            boolean r6 = android.text.TextUtils.equals(r7, r6)     // Catch:{ Exception -> 0x008b }
            if (r6 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            r6 = r1
            goto L_0x008d
        L_0x004e:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x008b }
            r8.<init>()     // Catch:{ Exception -> 0x008b }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x008b }
        L_0x0057:
            boolean r3 = r6.hasNext()     // Catch:{ Exception -> 0x008b }
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r6.next()     // Catch:{ Exception -> 0x008b }
            com.ss.android.ugc.aweme.friends.model.ContactModel r3 = (com.p280ss.android.ugc.aweme.friends.model.ContactModel) r3     // Catch:{ Exception -> 0x008b }
            if (r3 == 0) goto L_0x0057
            java.lang.String r3 = r3.phoneNumber     // Catch:{ NumberFormatException -> 0x0057 }
            r8.add(r3)     // Catch:{ NumberFormatException -> 0x0057 }
            goto L_0x0057
        L_0x006b:
            com.ss.android.ugc.aweme.friends.api.FriendApi r6 = com.p280ss.android.ugc.aweme.friends.api.C30029a.m98491a()     // Catch:{ Exception -> 0x008b }
            java.lang.String r3 = ","
            java.lang.String r8 = android.text.TextUtils.join(r3, r8)     // Catch:{ Exception -> 0x008b }
            com.google.common.util.concurrent.l r6 = r6.inviteBySmsDouyin(r7, r8)     // Catch:{ Exception -> 0x008b }
            java.lang.Object r6 = r6.get()     // Catch:{ Exception -> 0x008b }
            com.ss.android.ugc.aweme.friends.api.c r6 = (com.p280ss.android.ugc.aweme.friends.api.C30031c) r6     // Catch:{ Exception -> 0x008b }
            if (r6 == 0) goto L_0x0086
            int r7 = r6.f79003d     // Catch:{ Exception -> 0x008b }
            if (r7 != 0) goto L_0x0086
            goto L_0x004c
        L_0x0086:
            if (r6 == 0) goto L_0x008b
            java.lang.String r6 = r6.f79000a     // Catch:{ Exception -> 0x008b }
            goto L_0x008c
        L_0x008b:
            r6 = r1
        L_0x008c:
            r0 = 0
        L_0x008d:
            if (r9 != 0) goto L_0x0090
            return r1
        L_0x0090:
            com.bytedance.common.utility.collection.f r7 = r5.mHandler
            com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$8 r8 = new com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$8
            r8.<init>(r0, r9, r6)
            r7.post(r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.lambda$inviteFriends$6$InviteContactFriendsModel(java.util.List, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$InviteFriendsCallback):java.lang.Object");
    }
}
