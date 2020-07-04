package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31857ac;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.GroupNoticeContent */
public final class GroupNoticeContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @C6593c(mo15949a = "active_users")
    private List<? extends IMUser> activeUsers;
    private boolean hasShow;
    @C6593c(mo15949a = "locale_resources")
    private List<NoticeTemplate> noticeTemplates;
    @C6593c(mo15949a = "passive_users")
    private List<? extends IMUser> passiveUsers;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.GroupNoticeContent$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    public final List<IMUser> getActiveUsers() {
        return this.activeUsers;
    }

    public final boolean getHasShow() {
        return this.hasShow;
    }

    public final List<NoticeTemplate> getNoticeTemplates() {
        return this.noticeTemplates;
    }

    public final List<IMUser> getPassiveUsers() {
        return this.passiveUsers;
    }

    public final String getMsgHint() {
        return getNoticeText();
    }

    public final boolean isDefinedType() {
        if (this.type <= 100106) {
            return true;
        }
        return false;
    }

    public final boolean isActive() {
        User c = C7074e.m22071c();
        if (c == null) {
            return false;
        }
        List<? extends IMUser> list = this.activeUsers;
        if (list != null) {
            return list.contains(IMUser.fromUser(c));
        }
        return false;
    }

    public final boolean isPassive() {
        User c = C7074e.m22071c();
        if (c == null) {
            return false;
        }
        List<? extends IMUser> list = this.passiveUsers;
        if (list != null) {
            return list.contains(IMUser.fromUser(c));
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getTemplateText() {
        /*
            r11 = this;
            boolean r0 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31857ac.m103404c()
            boolean r1 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31857ac.m103404c()
            r2 = 0
            if (r1 == 0) goto L_0x0099
            java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.model.NoticeTemplate> r1 = r11.noticeTemplates
            if (r1 == 0) goto L_0x0099
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003c
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.ss.android.ugc.aweme.im.sdk.chat.model.NoticeTemplate r4 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.NoticeTemplate) r4
            if (r0 == 0) goto L_0x002f
            java.lang.String r4 = r4.getLanguage()
            java.lang.String r5 = "zh-Hans"
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r4, r5)
            goto L_0x0039
        L_0x002f:
            java.lang.String r4 = r4.getLanguage()
            java.lang.String r5 = "en"
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r4, r5)
        L_0x0039:
            if (r4 == 0) goto L_0x0015
            goto L_0x003d
        L_0x003c:
            r3 = r2
        L_0x003d:
            com.ss.android.ugc.aweme.im.sdk.chat.model.NoticeTemplate r3 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.NoticeTemplate) r3
            if (r3 == 0) goto L_0x0099
            int r0 = r11.type
            r1 = 100106(0x1870a, float:1.40278E-40)
            r4 = 0
            if (r0 != r1) goto L_0x0073
            boolean r0 = r11.isActive()
            if (r0 == 0) goto L_0x0073
            java.lang.String r5 = r3.getText()
            if (r5 == 0) goto L_0x0087
            java.lang.String r6 = "{0}"
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131823728(0x7f110c70, float:1.9280264E38)
            java.lang.String r7 = r0.getString(r1)
            java.lang.String r0 = "AppContextManager.getApp…up_notice_edit_name_host)"
            kotlin.jvm.internal.C7573i.m23582a(r7, r0)
            r8 = 0
            r9 = 4
            r10 = 0
            java.lang.String r0 = kotlin.text.C7634n.m23711a(r5, r6, r7, false)
            goto L_0x0088
        L_0x0073:
            java.lang.String r5 = r3.getText()
            if (r5 == 0) goto L_0x0087
            java.lang.String r6 = "{0}"
            java.lang.String r7 = r11.getActiveText(r4)
            r8 = 0
            r9 = 4
            r10 = 0
            java.lang.String r0 = kotlin.text.C7634n.m23711a(r5, r6, r7, false)
            goto L_0x0088
        L_0x0087:
            r0 = r2
        L_0x0088:
            r5 = r0
            if (r5 == 0) goto L_0x0099
            java.lang.String r6 = "{1}"
            java.lang.String r7 = r11.getPassiveText(r4)
            r8 = 0
            r9 = 4
            r10 = 0
            java.lang.String r0 = kotlin.text.C7634n.m23711a(r5, r6, r7, false)
            r2 = r0
        L_0x0099:
            if (r2 != 0) goto L_0x009d
            java.lang.String r2 = ""
        L_0x009d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.GroupNoticeContent.getTemplateText():java.lang.String");
    }

    public final boolean isNormalOrder() {
        Object obj;
        int i;
        int i2;
        boolean z;
        if (!isDefinedType()) {
            boolean c = C31857ac.m103404c();
            List<NoticeTemplate> list = this.noticeTemplates;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    NoticeTemplate noticeTemplate = (NoticeTemplate) obj;
                    if (c) {
                        z = C7573i.m23585a((Object) noticeTemplate.getLanguage(), (Object) "zh-Hans");
                        continue;
                    } else {
                        z = C7573i.m23585a((Object) noticeTemplate.getLanguage(), (Object) "en");
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                NoticeTemplate noticeTemplate2 = (NoticeTemplate) obj;
                if (noticeTemplate2 != null) {
                    String text = noticeTemplate2.getText();
                    if (text != null) {
                        i = C7634n.m23730a((CharSequence) text, "{0}", 0, false, 6, (Object) null);
                    } else {
                        i = 0;
                    }
                    String text2 = noticeTemplate2.getText();
                    if (text2 != null) {
                        i2 = C7634n.m23730a((CharSequence) text2, "{1}", 0, false, 6, (Object) null);
                    } else {
                        i2 = 0;
                    }
                    if (i <= i2) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        } else if (this.type == 100101 || this.type == 100102) {
            return false;
        } else {
            return true;
        }
    }

    public final String getNoticeText() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        int i = this.type;
        boolean z2 = true;
        switch (i) {
            case 100100:
                if (!isActive()) {
                    if (isPassive()) {
                        if (!TextUtils.isEmpty(getPassiveText$default(this, false, 1, null))) {
                            Context a = C6399b.m19921a();
                            StringBuilder sb2 = new StringBuilder(", ");
                            sb2.append(getPassiveText$default(this, false, 1, null));
                            sb.append(a.getString(R.string.bl0, new Object[]{getActiveText$default(this, false, 1, null), sb2.toString()}));
                            break;
                        } else {
                            sb.append(C6399b.m19921a().getString(R.string.bl0, new Object[]{getActiveText$default(this, false, 1, null), getPassiveText$default(this, false, 1, null)}));
                            break;
                        }
                    } else {
                        sb.append(C6399b.m19921a().getString(R.string.bl2, new Object[]{getActiveText$default(this, false, 1, null), getPassiveText$default(this, false, 1, null)}));
                        break;
                    }
                } else {
                    sb.append(C6399b.m19921a().getString(R.string.bl1, new Object[]{getPassiveText$default(this, false, 1, null)}));
                    break;
                }
            case 100101:
                if (!isActive()) {
                    if (!isPassive()) {
                        sb.append(C6399b.m19921a().getString(R.string.bl6, new Object[]{getPassiveText$default(this, false, 1, null), getActiveText$default(this, false, 1, null)}));
                        break;
                    } else {
                        sb.append(C6399b.m19921a().getString(R.string.bl4, new Object[]{getActiveText$default(this, false, 1, null)}));
                        break;
                    }
                } else {
                    sb.append(C6399b.m19921a().getString(R.string.bl5, new Object[]{getPassiveText$default(this, false, 1, null)}));
                    break;
                }
            case 100102:
                if (!isActive()) {
                    if (!isPassive()) {
                        sb.append(C6399b.m19921a().getString(R.string.bld, new Object[]{getPassiveText$default(this, false, 1, null), getActiveText$default(this, false, 1, null)}));
                        break;
                    } else {
                        sb.append(C6399b.m19921a().getString(R.string.blb, new Object[]{getActiveText$default(this, false, 1, null)}));
                        break;
                    }
                } else {
                    sb.append(C6399b.m19921a().getString(R.string.blc, new Object[]{getPassiveText$default(this, false, 1, null)}));
                    break;
                }
            case 100103:
                sb.append(C6399b.m19921a().getString(R.string.blf));
                break;
            case 100104:
                if (!isActive()) {
                    if (isPassive()) {
                        sb.append(C6399b.m19921a().getString(R.string.bon));
                        break;
                    }
                } else {
                    sb.append(C6399b.m19921a().getString(R.string.ble, new Object[]{getPassiveText$default(this, false, 1, null)}));
                    break;
                }
                break;
            case 100105:
                sb.append(C6399b.m19921a().getString(R.string.bla, new Object[]{getActiveText$default(this, false, 1, null)}));
                break;
            case 100106:
                sb.append(getTemplateText());
                break;
            default:
                switch (i) {
                    case 100120:
                        sb.append(C6399b.m19921a().getString(R.string.blg));
                        break;
                    case 100121:
                        sb.append(C6399b.m19921a().getString(R.string.bl_));
                        break;
                    default:
                        sb.append(getTemplateText());
                        break;
                }
        }
        z2 = false;
        if (z2) {
            try {
                IESSettingsProxy a2 = C30199h.m98861a();
                C7573i.m23582a((Object) a2, "SettingsReader.get()");
                Boolean groupNewMemberCanPullOldMsg = a2.getGroupNewMemberCanPullOldMsg();
                C7573i.m23582a((Object) groupNewMemberCanPullOldMsg, "SettingsReader.get().groupNewMemberCanPullOldMsg");
                z = groupNewMemberCanPullOldMsg.booleanValue();
            } catch (NullValueException unused) {
                z = false;
            }
            if (z) {
                sb.append(C6399b.m19921a().getString(R.string.a1v));
            }
        }
        String sb3 = sb.toString();
        C7573i.m23582a((Object) sb3, "builder.toString()");
        return sb3;
    }

    public final void setActiveUsers(List<? extends IMUser> list) {
        this.activeUsers = list;
    }

    public final void setHasShow(boolean z) {
        this.hasShow = z;
    }

    public final void setNoticeTemplates(List<NoticeTemplate> list) {
        this.noticeTemplates = list;
    }

    public final void setPassiveUsers(List<? extends IMUser> list) {
        this.passiveUsers = list;
    }

    public final String getActiveText(boolean z) {
        boolean z2;
        StringBuilder sb = new StringBuilder();
        User c = C7074e.m22071c();
        C7573i.m23582a((Object) c, "AppUtil.getCurrentUser()");
        List<? extends IMUser> list = this.activeUsers;
        boolean z3 = false;
        if (list != null) {
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                IMUser iMUser = (IMUser) next;
                if (!z || (!C7573i.m23585a((Object) iMUser.getUid(), (Object) c.getUid()))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            for (IMUser iMUser2 : (List) arrayList) {
                if (!this.hasShow) {
                    IMUser a = C6961d.m21657a().mo18019a(iMUser2.getUid());
                    if (a != null) {
                        iMUser2.setNickName(a.getNickName());
                        iMUser2.setRemarkName(a.getRemarkName());
                    }
                }
                String displayName = iMUser2.getDisplayName();
                if (displayName != null) {
                    sb.append(displayName);
                    sb.append("、");
                }
            }
        }
        if (sb.length() > 0) {
            z3 = true;
        }
        if (z3) {
            sb.setLength(sb.length() - 1);
        }
        String sb2 = sb.toString();
        C7573i.m23582a((Object) sb2, "activeText.also {\n      …UNT)\n        }.toString()");
        return sb2;
    }

    public final String getPassiveText(boolean z) {
        boolean z2;
        StringBuilder sb = new StringBuilder();
        User c = C7074e.m22071c();
        C7573i.m23582a((Object) c, "AppUtil.getCurrentUser()");
        List<? extends IMUser> list = this.passiveUsers;
        boolean z3 = false;
        if (list != null) {
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                IMUser iMUser = (IMUser) next;
                if (!z || (!C7573i.m23585a((Object) iMUser.getUid(), (Object) c.getUid()))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            for (IMUser iMUser2 : (List) arrayList) {
                if (!this.hasShow) {
                    IMUser a = C6961d.m21657a().mo18019a(iMUser2.getUid());
                    if (a != null) {
                        iMUser2.setNickName(a.getNickName());
                        iMUser2.setRemarkName(a.getRemarkName());
                    }
                }
                String displayName = iMUser2.getDisplayName();
                if (displayName != null) {
                    sb.append(displayName);
                    sb.append("、");
                }
            }
        }
        if (sb.length() > 0) {
            z3 = true;
        }
        if (z3) {
            sb.setLength(sb.length() - 1);
        }
        String sb2 = sb.toString();
        C7573i.m23582a((Object) sb2, "passiveText.also {\n     …UNT)\n        }.toString()");
        return sb2;
    }

    public static /* synthetic */ String getActiveText$default(GroupNoticeContent groupNoticeContent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return groupNoticeContent.getActiveText(z);
    }

    public static /* synthetic */ String getPassiveText$default(GroupNoticeContent groupNoticeContent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return groupNoticeContent.getPassiveText(z);
    }
}
