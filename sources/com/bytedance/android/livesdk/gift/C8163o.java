package com.bytedance.android.livesdk.gift;

import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.i18n.C3439a;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.gift.assets.C7872f;
import com.bytedance.android.livesdk.gift.effect.p376b.C7963a;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8153h;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.model.C8159n;
import com.bytedance.android.livesdk.log.p405b.C8442n;
import com.bytedance.android.livesdk.message.C8471f;
import com.bytedance.android.livesdk.message.model.C8472a;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdkapi.message.C9500b;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.android.livesdkapi.message.C9507h;
import com.bytedance.common.utility.collection.C6307b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.o */
public final class C8163o {
    /* renamed from: a */
    public static C8442n m24997a(C8158m mVar) {
        int i;
        C8158m mVar2 = mVar;
        C8149d findGiftById = GiftManager.inst().findGiftById(mVar2.f22301e);
        if (findGiftById == null) {
            i = 0;
        } else {
            i = findGiftById.f22235f;
        }
        C8442n nVar = new C8442n(mVar2.f22301e, findGiftById, mVar2.f22308l, mVar2.f22317u, mVar2.f22318v, mVar2.f22306j, mVar2.f22304h, mVar2.f22302f, (long) i);
        return nVar;
    }

    /* renamed from: a */
    public static C7963a m24995a(C8472a aVar) {
        String str;
        if (aVar == null || aVar.getMessageId() == 0) {
            return null;
        }
        String b = C7872f.m24128a("effects").mo20660b(aVar.f23186a);
        Spannable spannableString = new SpannableString("");
        if (aVar.f23187b != null) {
            if (aVar.f23187b.f26013a == null || TextUtils.isEmpty(((C3439a) C3596c.m13172a(C3439a.class)).getI18nString(aVar.f23187b.f26013a))) {
                str = aVar.f23187b.f26014b;
            } else {
                str = ((C3439a) C3596c.m13172a(C3439a.class)).getI18nString(aVar.f23187b.f26013a);
            }
            spannableString = ((C3495l) C3596c.m13172a(C3495l.class)).parsePatternAndGetSpannable(str, aVar.f23187b);
        }
        return new C7963a().mo20826a(aVar.getMessageId()).mo20833b(aVar.f23186a).mo20830a(b).mo20831a(true).mo20828a(aVar.f23191f).mo20834b(aVar.f23190e).mo20836b(aVar.f23188c).mo20838c(aVar.f23189d).mo20827a(spannableString);
    }

    /* renamed from: a */
    private static boolean m25001a(User user, long j) {
        if (user.getId() == j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C7963a m24996a(C8489ao aoVar, User user) {
        String str;
        String str2;
        if (aoVar == null || aoVar.getMessageId() == 0 || aoVar.f23252a == null) {
            return null;
        }
        C8149d findGiftById = GiftManager.inst().findGiftById(aoVar.f23254c);
        if (findGiftById == null) {
            return null;
        }
        String b = C7872f.m24128a("effects").mo20660b(findGiftById.f22247r);
        if (aoVar.f23253b == null || aoVar.f23253b.getId() <= 0 || (user != null && aoVar.f23253b.getId() == user.getId())) {
            str = findGiftById.f22232c;
        } else {
            Resources a = C3358ac.m12513a();
            Object[] objArr = new Object[1];
            if (C8471f.m25743a(aoVar.f23253b) == null) {
                str2 = "";
            } else {
                str2 = C8471f.m25743a(aoVar.f23253b);
            }
            objArr[0] = str2;
            str = a.getString(R.string.emo, objArr);
        }
        return new C7963a().mo20826a(aoVar.getMessageId()).mo20833b(findGiftById.f22247r).mo20825a(findGiftById.f22235f).mo20830a(b).mo20831a(aoVar.f23264m).mo20828a(aoVar.f23253b).mo20834b(aoVar.f23252a).mo20835b(str).mo20829a(aoVar.f23262k).mo20837c(findGiftById.f22233d).mo20832b(aoVar.f23255d);
    }

    /* renamed from: a */
    public static C8489ao m24998a(long j, C8158m mVar, User user) {
        return m24999a(j, mVar, null, user);
    }

    /* renamed from: a */
    public static C8489ao m25000a(long j, C8159n nVar, User user) {
        C8489ao aoVar = new C8489ao();
        C9500b bVar = new C9500b();
        bVar.f25993c = j;
        bVar.f25994d = nVar.f22321a;
        bVar.f25997g = true;
        aoVar.baseMessage = bVar;
        aoVar.f23260i = 1;
        if (user != null) {
            aoVar.f23252a = user;
        } else {
            aoVar.f23252a = User.from(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a());
        }
        aoVar.f23259h = nVar.f22323c;
        aoVar.f23256e = 0;
        aoVar.f23254c = nVar.f22325e;
        aoVar.f23265n = true;
        return aoVar;
    }

    /* renamed from: b */
    public static List<C8489ao> m25002b(long j, C8158m mVar, User user, User user2) {
        ArrayList arrayList = new ArrayList();
        if (mVar == null) {
            return arrayList;
        }
        List<C8153h> list = mVar.f22316t;
        if (list == null) {
            return arrayList;
        }
        for (C8153h hVar : list) {
            C8489ao aoVar = new C8489ao();
            C9500b bVar = new C9500b();
            bVar.f25993c = j;
            bVar.f25994d = hVar.f22274g;
            bVar.f25997g = true;
            bVar.f25996f = hVar.f22269b;
            bVar.f26000j = hVar.f22268a;
            aoVar.baseMessage = bVar;
            C9505f fVar = hVar.f22268a;
            User user3 = null;
            if (fVar != null && !C6307b.m19566a((Collection<T>) fVar.f26016d)) {
                Iterator it = fVar.f26016d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C9507h hVar2 = (C9507h) it.next();
                    if (hVar2.f26023d != null && hVar2.f26023d.f26032a != null && m25001a(hVar2.f26023d.f26032a, ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b())) {
                        user3 = hVar2.f26023d.f26032a;
                        break;
                    }
                }
            }
            if (user3 != null) {
                aoVar.f23252a = user3;
            } else if (user2 != null) {
                aoVar.f23252a = user2;
            } else {
                aoVar.f23252a = User.from(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a());
            }
            aoVar.f23255d = hVar.f22272e;
            aoVar.f23256e = mVar.f22298b;
            aoVar.f23254c = hVar.f22270c;
            aoVar.f23253b = user;
            aoVar.f23259h = hVar.f22273f;
            aoVar.f23260i = hVar.f22271d;
            aoVar.f23261j = mVar.f22303g;
            aoVar.f23265n = true;
            aoVar.isLocalInsertMsg = true;
            arrayList.add(aoVar);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.android.livesdk.message.model.C8483aj m25003c(long r5, com.bytedance.android.livesdk.gift.model.C8158m r7, com.bytedance.android.live.base.model.user.User r8, com.bytedance.android.live.base.model.user.User r9) {
        /*
            com.bytedance.android.livesdk.message.model.aj r0 = new com.bytedance.android.livesdk.message.model.aj
            r0.<init>()
            com.bytedance.android.livesdkapi.message.b r1 = new com.bytedance.android.livesdkapi.message.b
            r1.<init>()
            r1.f25993c = r5
            long r5 = r7.f22307k
            r1.f25994d = r5
            r5 = 1
            r1.f25997g = r5
            java.lang.String r6 = r7.f22300d
            r1.f25996f = r6
            com.bytedance.android.livesdkapi.message.f r6 = r7.f22297a
            r1.f26000j = r6
            r0.baseMessage = r1
            com.bytedance.android.livesdkapi.message.f r6 = r7.f22297a
            if (r6 == 0) goto L_0x0064
            java.util.List<com.bytedance.android.livesdkapi.message.h> r1 = r6.f26016d
            boolean r1 = com.bytedance.common.utility.collection.C6307b.m19566a(r1)
            if (r1 != 0) goto L_0x0064
            java.util.List<com.bytedance.android.livesdkapi.message.h> r6 = r6.f26016d
            java.util.Iterator r6 = r6.iterator()
        L_0x002f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r6.next()
            com.bytedance.android.livesdkapi.message.h r1 = (com.bytedance.android.livesdkapi.message.C9507h) r1
            com.bytedance.android.livesdkapi.message.l r2 = r1.f26023d
            if (r2 == 0) goto L_0x002f
            com.bytedance.android.livesdkapi.message.l r2 = r1.f26023d
            com.bytedance.android.live.base.model.user.User r2 = r2.f26032a
            if (r2 == 0) goto L_0x002f
            com.bytedance.android.livesdkapi.message.l r2 = r1.f26023d
            com.bytedance.android.live.base.model.user.User r2 = r2.f26032a
            java.lang.Class<com.bytedance.android.live.user.a> r3 = com.bytedance.android.live.user.C3592a.class
            com.bytedance.android.live.base.b r3 = com.bytedance.android.live.utility.C3596c.m13172a(r3)
            com.bytedance.android.live.user.a r3 = (com.bytedance.android.live.user.C3592a) r3
            com.bytedance.android.livesdk.user.e r3 = r3.user()
            long r3 = r3.mo22179b()
            boolean r2 = m25001a(r2, r3)
            if (r2 == 0) goto L_0x002f
            com.bytedance.android.livesdkapi.message.l r6 = r1.f26023d
            com.bytedance.android.live.base.model.user.User r6 = r6.f26032a
            goto L_0x0065
        L_0x0064:
            r6 = 0
        L_0x0065:
            if (r6 == 0) goto L_0x006a
            r0.f23229f = r6
            goto L_0x0085
        L_0x006a:
            if (r9 == 0) goto L_0x006f
            r0.f23229f = r9
            goto L_0x0085
        L_0x006f:
            java.lang.Class<com.bytedance.android.live.user.a> r6 = com.bytedance.android.live.user.C3592a.class
            com.bytedance.android.live.base.b r6 = com.bytedance.android.live.utility.C3596c.m13172a(r6)
            com.bytedance.android.live.user.a r6 = (com.bytedance.android.live.user.C3592a) r6
            com.bytedance.android.livesdk.user.e r6 = r6.user()
            com.bytedance.android.live.base.model.user.IUser r6 = r6.mo22165a()
            com.bytedance.android.live.base.model.user.User r6 = com.bytedance.android.live.base.model.user.User.from(r6)
            r0.f23229f = r6
        L_0x0085:
            int r6 = r7.f22304h
            long r1 = (long) r6
            r0.f23227d = r1
            int r6 = r7.f22298b
            long r1 = (long) r6
            r0.f23225b = r1
            long r1 = r7.f22301e
            r0.f23224a = r1
            r0.f23230g = r8
            int r6 = r7.f22306j
            long r8 = (long) r6
            r0.f23228e = r8
            int r6 = r7.f22302f
            long r8 = (long) r6
            r0.f23226c = r8
            com.bytedance.android.livesdk.gift.relay.a.a r6 = r7.f22312p
            r0.f23231h = r6
            r0.f23232i = r5
            r0.isLocalInsertMsg = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.C8163o.m25003c(long, com.bytedance.android.livesdk.gift.model.m, com.bytedance.android.live.base.model.user.User, com.bytedance.android.live.base.model.user.User):com.bytedance.android.livesdk.message.model.aj");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.android.livesdk.message.model.C8489ao m24999a(long r5, com.bytedance.android.livesdk.gift.model.C8158m r7, com.bytedance.android.live.base.model.user.User r8, com.bytedance.android.live.base.model.user.User r9) {
        /*
            com.bytedance.android.livesdk.message.model.ao r0 = new com.bytedance.android.livesdk.message.model.ao
            r0.<init>()
            com.bytedance.android.livesdkapi.message.b r1 = new com.bytedance.android.livesdkapi.message.b
            r1.<init>()
            r1.f25993c = r5
            long r5 = r7.f22307k
            r1.f25994d = r5
            r5 = 1
            r1.f25997g = r5
            java.lang.String r6 = r7.f22300d
            r1.f25996f = r6
            com.bytedance.android.livesdkapi.message.f r6 = r7.f22297a
            r1.f26000j = r6
            r0.baseMessage = r1
            com.bytedance.android.livesdkapi.message.f r6 = r7.f22297a
            if (r6 == 0) goto L_0x0064
            java.util.List<com.bytedance.android.livesdkapi.message.h> r1 = r6.f26016d
            boolean r1 = com.bytedance.common.utility.collection.C6307b.m19566a(r1)
            if (r1 != 0) goto L_0x0064
            java.util.List<com.bytedance.android.livesdkapi.message.h> r6 = r6.f26016d
            java.util.Iterator r6 = r6.iterator()
        L_0x002f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r6.next()
            com.bytedance.android.livesdkapi.message.h r1 = (com.bytedance.android.livesdkapi.message.C9507h) r1
            com.bytedance.android.livesdkapi.message.l r2 = r1.f26023d
            if (r2 == 0) goto L_0x002f
            com.bytedance.android.livesdkapi.message.l r2 = r1.f26023d
            com.bytedance.android.live.base.model.user.User r2 = r2.f26032a
            if (r2 == 0) goto L_0x002f
            com.bytedance.android.livesdkapi.message.l r2 = r1.f26023d
            com.bytedance.android.live.base.model.user.User r2 = r2.f26032a
            java.lang.Class<com.bytedance.android.live.user.a> r3 = com.bytedance.android.live.user.C3592a.class
            com.bytedance.android.live.base.b r3 = com.bytedance.android.live.utility.C3596c.m13172a(r3)
            com.bytedance.android.live.user.a r3 = (com.bytedance.android.live.user.C3592a) r3
            com.bytedance.android.livesdk.user.e r3 = r3.user()
            long r3 = r3.mo22179b()
            boolean r2 = m25001a(r2, r3)
            if (r2 == 0) goto L_0x002f
            com.bytedance.android.livesdkapi.message.l r6 = r1.f26023d
            com.bytedance.android.live.base.model.user.User r6 = r6.f26032a
            goto L_0x0065
        L_0x0064:
            r6 = 0
        L_0x0065:
            if (r6 == 0) goto L_0x006a
            r0.f23252a = r6
            goto L_0x0085
        L_0x006a:
            if (r9 == 0) goto L_0x006f
            r0.f23252a = r9
            goto L_0x0085
        L_0x006f:
            java.lang.Class<com.bytedance.android.live.user.a> r6 = com.bytedance.android.live.user.C3592a.class
            com.bytedance.android.live.base.b r6 = com.bytedance.android.live.utility.C3596c.m13172a(r6)
            com.bytedance.android.live.user.a r6 = (com.bytedance.android.live.user.C3592a) r6
            com.bytedance.android.livesdk.user.e r6 = r6.user()
            com.bytedance.android.live.base.model.user.IUser r6 = r6.mo22165a()
            com.bytedance.android.live.base.model.user.User r6 = com.bytedance.android.live.base.model.user.User.from(r6)
            r0.f23252a = r6
        L_0x0085:
            int r6 = r7.f22304h
            r0.f23255d = r6
            int r6 = r7.f22298b
            r0.f23256e = r6
            long r1 = r7.f22301e
            r0.f23254c = r1
            r0.f23253b = r8
            int r6 = r7.f22306j
            r0.f23259h = r6
            int r6 = r7.f22302f
            r0.f23260i = r6
            long r6 = r7.f22303g
            r0.f23261j = r6
            r0.f23265n = r5
            r0.isLocalInsertMsg = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.C8163o.m24999a(long, com.bytedance.android.livesdk.gift.model.m, com.bytedance.android.live.base.model.user.User, com.bytedance.android.live.base.model.user.User):com.bytedance.android.livesdk.message.model.ao");
    }
}
