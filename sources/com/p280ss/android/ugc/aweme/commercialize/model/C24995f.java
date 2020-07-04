package com.p280ss.android.ugc.aweme.commercialize.model;

import android.os.Build.VERSION;
import android.util.ArrayMap;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.model.AvatarDecoration;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.f */
public final class C24995f {

    /* renamed from: d */
    public static final C24996a f65904d = new C24996a(null);
    @C6593c(mo15949a = "id")

    /* renamed from: a */
    public String f65905a;
    @C6593c(mo15949a = "name")

    /* renamed from: b */
    public String f65906b;
    @C6593c(mo15949a = "image")

    /* renamed from: c */
    public UrlModel f65907c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.f$a */
    public static final class C24996a {
        private C24996a() {
        }

        /* renamed from: a */
        private static boolean m82312a() {
            C25000i a = CommerceSettingsApi.m80550a();
            if (a == null || !a.f65921e) {
                return false;
            }
            return true;
        }

        public /* synthetic */ C24996a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static boolean m82313a(UrlModel urlModel) {
            if (urlModel == null) {
                return false;
            }
            List urlList = urlModel.getUrlList();
            if (urlList == null || urlList.isEmpty()) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final Long mo65425b(User user) {
            if (user != null) {
                AvatarDecoration c = m82315c(user);
                if (c != null) {
                    return Long.valueOf(c.getId());
                }
            }
            return null;
        }

        /* renamed from: a */
        private static boolean m82314a(AvatarDecoration avatarDecoration) {
            CharSequence charSequence;
            boolean z;
            UrlModel urlModel = null;
            if (avatarDecoration != null) {
                charSequence = avatarDecoration.getName();
            } else {
                charSequence = null;
            }
            CharSequence charSequence2 = charSequence;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (avatarDecoration != null) {
                    urlModel = avatarDecoration.getSourceUrl();
                }
                if (m82313a(urlModel)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        private static AvatarDecoration m82315c(User user) {
            String str;
            IAccountUserService userService = C6861a.m21332a().userService();
            C7573i.m23582a((Object) userService, "AccountProxyService.get().userService()");
            User curUser = userService.getCurUser();
            String uid = user.getUid();
            if (curUser != null) {
                str = curUser.getUid();
            } else {
                str = null;
            }
            if (C7573i.m23585a((Object) uid, (Object) str)) {
                user = curUser;
            }
            C7573i.m23582a((Object) user, "u");
            return user.getAvatarDecoration();
        }

        /* renamed from: a */
        public final boolean mo65424a(User user) {
            AvatarDecoration avatarDecoration;
            if (m82312a()) {
                if (user != null) {
                    avatarDecoration = m82315c(user);
                } else {
                    avatarDecoration = null;
                }
                if (m82314a(avatarDecoration)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0017 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo65422a(com.p280ss.android.ugc.aweme.profile.model.User r3, com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView r4) {
            /*
                r2 = this;
                if (r4 != 0) goto L_0x0003
                return
            L_0x0003:
                if (r3 == 0) goto L_0x0010
                com.ss.android.ugc.aweme.profile.model.AvatarDecoration r3 = m82315c(r3)
                if (r3 == 0) goto L_0x0010
                com.ss.android.ugc.aweme.base.model.UrlModel r3 = r3.getSourceUrl()
                goto L_0x0011
            L_0x0010:
                r3 = 0
            L_0x0011:
                boolean r0 = m82313a(r3)
                if (r0 != 0) goto L_0x0018
                return
            L_0x0018:
                com.facebook.drawee.c.b r0 = r4.getHierarchy()
                com.facebook.drawee.generic.a r0 = (com.facebook.drawee.generic.C13438a) r0
                r1 = 17170445(0x106000d, float:2.461195E-38)
                if (r0 == 0) goto L_0x0026
                r0.mo32898b(r1)
            L_0x0026:
                com.facebook.drawee.c.b r0 = r4.getHierarchy()
                com.facebook.drawee.generic.a r0 = (com.facebook.drawee.generic.C13438a) r0
                if (r0 == 0) goto L_0x0031
                r0.mo32902c(r1)
            L_0x0031:
                com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r4, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.model.C24995f.C24996a.mo65422a(com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.base.ui.RemoteImageView):void");
        }

        /* renamed from: a */
        public final void mo65423a(User user, String str) {
            String str2;
            C24996a aVar = this;
            Long b = aVar.mo65425b(user);
            if (user != null) {
                str2 = user.getUid();
            } else {
                str2 = null;
            }
            m82311a(b, str, str2, null);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static void m82311a(Long l, String str, String str2, String str3) {
            Map map;
            if (l != null) {
                l.longValue();
                if (str != null && str2 != null) {
                    if (VERSION.SDK_INT >= 19) {
                        map = new ArrayMap(4);
                    } else {
                        map = new HashMap();
                    }
                    map.put("dec_id", String.valueOf(l.longValue()));
                    map.put("enter_from", str);
                    map.put("author_id", str2);
                    if (str3 != null) {
                        map.put("group_id", str3);
                    }
                    C6907h.m21524a("show_head_decoration", map);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m82306a(User user, RemoteImageView remoteImageView) {
        f65904d.mo65422a(user, remoteImageView);
    }

    /* renamed from: a */
    public static final void m82307a(User user, String str) {
        f65904d.mo65423a(user, str);
    }

    /* renamed from: a */
    public static final boolean m82308a(User user) {
        return f65904d.mo65424a(user);
    }

    /* renamed from: b */
    public static final Long m82309b(User user) {
        return f65904d.mo65425b(user);
    }
}
