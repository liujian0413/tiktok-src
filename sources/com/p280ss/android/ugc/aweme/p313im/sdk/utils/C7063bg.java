package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.socialbase.appdownloader.AppDownloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.TextContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.C31485c.C31486a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p315g.C6993a;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b;
import com.p280ss.android.ugc.aweme.p313im.service.C32005c;
import com.p280ss.android.ugc.aweme.p313im.service.model.C32026d;
import com.p280ss.android.ugc.aweme.p313im.service.model.C32027e;
import com.p280ss.android.ugc.aweme.p313im.service.model.C7106f;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C7092b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bg */
public final class C7063bg {
    /* renamed from: a */
    public static boolean m22048a() {
        return C6993a.m21772a().isXPlanOpen();
    }

    /* renamed from: a */
    public static boolean m22049a(Context context) {
        return C6776h.m20948b(context, "my.maya.android");
    }

    /* renamed from: a */
    private static void m22033a(Activity activity, int i, boolean z, String str, Object obj, C7092b bVar, C32005c cVar) {
        if (activity != null) {
            if (i == 6) {
                m22030a(activity, i, obj, (C32005c) null);
            } else if (m22049a((Context) activity)) {
                C31858ad.m103409a(i, "open", "duoshan_banner_click");
                m22040a((Context) activity, i, obj);
            } else {
                C31858ad.m103409a(i, "install", "duoshan_banner_click");
                if (m22055c()) {
                    C6956a.m21632a().mo18009f().handleXDownload(activity, m22026a(i), null);
                    return;
                }
                m22032a(activity, i, false, str, bVar, null);
            }
        }
    }

    /* renamed from: a */
    private static void m22037a(final Activity activity, String str, final int i, final C7092b bVar, final C32005c cVar) {
        m22038a((Dialog) new C1081a(activity, R.style.m2).mo4240b((CharSequence) str).mo4235a(false).mo4226a((int) R.string.bi8, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C6956a.m21632a().mo18009f().handleXDownload(activity, C7063bg.m22026a(i), cVar);
                if (bVar != null) {
                    bVar.mo18284a(dialogInterface, i);
                }
                C31858ad.m103408a(i, "confirm");
            }
        }).mo4238b((int) R.string.bhe, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (bVar != null) {
                    bVar.mo18284a(dialogInterface, i);
                }
                C31858ad.m103408a(i, "cancel");
            }
        }).mo4242b(), bVar);
    }

    /* renamed from: a */
    private static void m22038a(Dialog dialog, C7092b bVar) {
        if (!(dialog == null || bVar == null)) {
            bVar.getClass();
            dialog.setOnCancelListener(C31898bi.m103630a(bVar));
            bVar.getClass();
            dialog.setOnDismissListener(C31899bj.m103631a(bVar));
            bVar.getClass();
            dialog.setOnShowListener(C31900bk.m103632a(bVar));
        }
        if (dialog != null) {
            dialog.show();
        }
    }

    /* renamed from: a */
    public static void m22039a(Context context, int i) {
        m22040a(context, i, (Object) null);
    }

    /* renamed from: a */
    public static void m22040a(Context context, int i, Object obj) {
        Intent intent = new Intent("android.intent.action.VIEW");
        C19290j a = m22025a(i, obj);
        User c = C7074e.m22071c();
        if (c != null) {
            a.mo51188a("uid", c.getUid());
            a.mo51188a("nick_name", c.getNickname());
            if (c.getAvatarMedium() != null && !C6307b.m19566a((Collection<T>) c.getAvatarMedium().getUrlList())) {
                a.mo51188a("image_url", (String) c.getAvatarMedium().getUrlList().get(0));
            }
        }
        intent.setData(Uri.parse(a.mo51184a()));
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m22045a(Context context, boolean z, final OnClickListener onClickListener) {
        String string = context.getString(R.string.bhb);
        if (!m22048a() || !z || !C7076p.m22077a().mo18311d() || !C7076p.m22077a().mo18312d(3)) {
            new C10741a(context).mo25660b(string).mo25650a((int) R.string.bi8, (OnClickListener) new C31901bl(onClickListener)).mo25658b((int) R.string.bhe, (OnClickListener) new C31902bm(onClickListener)).mo25656a().mo25638b();
            return;
        }
        C10741a aVar = new C10741a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.bqp));
        sb.append("，");
        sb.append(string);
        aVar.mo25660b(sb.toString()).mo25650a((int) R.string.bi8, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C7076p.m22077a().mo18305c(3);
                if (onClickListener != null) {
                    onClickListener.onClick(dialogInterface, -1);
                }
            }
        }).mo25658b((int) R.string.bhe, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C7076p.m22077a().mo18305c(3);
                if (onClickListener != null) {
                    onClickListener.onClick(dialogInterface, -2);
                }
            }
        }).mo25656a().mo25638b();
    }

    /* renamed from: a */
    static final /* synthetic */ void m22046a(OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -2);
        }
    }

    /* renamed from: a */
    public static void m22041a(Context context, int i, boolean z, Runnable runnable) {
        m22042a(context, i, z, runnable, (C7092b) null);
    }

    /* renamed from: a */
    public static void m22042a(Context context, int i, boolean z, Runnable runnable, C7092b bVar) {
        boolean z2 = true;
        if (i == 1 || z) {
            if (!m22048a() || !C7076p.m22077a().mo18311d() || !C7076p.m22077a().mo18312d(i)) {
                z2 = false;
            }
            if (z2) {
                String string = context.getString(R.string.bqs);
                switch (i) {
                    case 1:
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append(context.getString(R.string.bqq));
                        string = sb.toString();
                        break;
                    case 2:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(string);
                        sb2.append(context.getString(R.string.bqr));
                        string = sb2.toString();
                        break;
                    case 3:
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(string);
                        sb3.append(context.getString(R.string.bqp));
                        string = sb3.toString();
                        break;
                }
                C31903bn bnVar = new C31903bn(i, bVar, runnable);
                m22038a((Dialog) new C1081a(context, R.style.m2).mo4240b((CharSequence) string).mo4226a((int) R.string.bi8, (OnClickListener) bnVar).mo4238b((int) R.string.bhe, (OnClickListener) bnVar).mo4242b(), bVar);
                return;
            }
            if (runnable != null) {
                runnable.run();
            }
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static boolean m22050a(Message message, BaseContent baseContent) {
        if (message.isSelf() || !C31863ai.m103538e(message)) {
            return false;
        }
        if (!(baseContent instanceof TextContent) || !((TextContent) baseContent).isDefault()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x007e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m22047a(com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView r5, int r6) {
        /*
            com.ss.android.ugc.aweme.im.sdk.d.a r0 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a.m21632a()
            com.ss.android.ugc.aweme.im.service.h r0 = r0.mo18009f()
            boolean r0 = r0.enableIM()
            r1 = 8
            if (r0 != 0) goto L_0x0014
            r5.setVisibility(r1)
            return
        L_0x0014:
            boolean r0 = m22048a()
            r2 = 13
            r3 = 0
            if (r0 == 0) goto L_0x0084
            r5.setVisibility(r3)
            com.ss.android.ugc.aweme.im.sdk.d.a r0 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a.m21632a()
            com.ss.android.ugc.aweme.im.service.h r0 = r0.mo18009f()
            com.ss.android.ugc.aweme.im.service.model.c r0 = r0.getIMSetting()
            com.ss.android.ugc.aweme.im.service.model.d r0 = r0.f83742e
            r3 = 2131233273(0x7f0809f9, float:1.8082679E38)
            r4 = 0
            if (r6 == r2) goto L_0x0067
            switch(r6) {
                case 2: goto L_0x005a;
                case 3: goto L_0x004d;
                case 4: goto L_0x0039;
                default: goto L_0x0037;
            }
        L_0x0037:
            r6 = r4
            goto L_0x007b
        L_0x0039:
            boolean r6 = m22053b()
            if (r6 == 0) goto L_0x0049
            if (r0 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.im.service.model.e r6 = r0.f83769o
            goto L_0x0045
        L_0x0044:
            r6 = r4
        L_0x0045:
            m22052b(r5, r3)
            goto L_0x007b
        L_0x0049:
            r5.setVisibility(r1)
            goto L_0x0037
        L_0x004d:
            if (r0 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.im.service.model.e r6 = r0.f83761g
            goto L_0x0053
        L_0x0052:
            r6 = r4
        L_0x0053:
            r0 = 2131233282(0x7f080a02, float:1.8082697E38)
            m22052b(r5, r0)
            goto L_0x007b
        L_0x005a:
            if (r0 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.im.service.model.e r6 = r0.f83760f
            goto L_0x0060
        L_0x005f:
            r6 = r4
        L_0x0060:
            r0 = 2131233283(0x7f080a03, float:1.80827E38)
            m22052b(r5, r0)
            goto L_0x007b
        L_0x0067:
            boolean r6 = m22053b()
            if (r6 == 0) goto L_0x0077
            if (r0 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.im.service.model.e r6 = r0.f83779y
            goto L_0x0073
        L_0x0072:
            r6 = r4
        L_0x0073:
            m22052b(r5, r3)
            goto L_0x007b
        L_0x0077:
            r5.setVisibility(r1)
            goto L_0x0037
        L_0x007b:
            if (r6 != 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r6.f83781a
        L_0x0080:
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r5, r4)
            return
        L_0x0084:
            r0 = 4
            if (r6 == r0) goto L_0x008a
            if (r6 == r2) goto L_0x008a
            goto L_0x0093
        L_0x008a:
            r5.setVisibility(r3)
            r6 = 2131233319(0x7f080a27, float:1.8082772E38)
            m22052b(r5, r6)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7063bg.m22047a(com.ss.android.ugc.aweme.base.ui.RemoteImageView, int):void");
    }

    /* renamed from: a */
    public static void m22034a(Activity activity, IMUser iMUser, int i, final Runnable runnable) {
        if (activity != null && iMUser != null) {
            if (!m22048a() || iMUser.getCommerceUserLevel() != 0) {
                runnable.run();
            } else if (!m22053b()) {
                m22028a(activity, i, (Object) iMUser);
            } else if (!C7076p.m22077a().mo18319f(i) || m22049a((Context) activity)) {
                runnable.run();
            } else {
                C7076p.m22077a().mo18314e(i);
                m22029a(activity, i, (Object) iMUser, (C7092b) new C7092b() {
                    /* renamed from: a */
                    public final void mo18284a(DialogInterface dialogInterface, int i) {
                        if (i == -2 && runnable != null) {
                            runnable.run();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m22036a(Activity activity, Object obj, int i, C7092b bVar) {
        if (activity != null && obj != null) {
            m22029a(activity, i, obj, bVar);
        }
    }

    /* renamed from: a */
    public static void m22044a(Context context, RemoteImageView remoteImageView, int i, boolean z) {
        remoteImageView.setVisibility(0);
        C32026d dVar = C6956a.m21632a().mo18009f().getIMSetting().f83742e;
        C32027e eVar = null;
        switch (i) {
            case 0:
            case 2:
                if (dVar != null) {
                    eVar = dVar.f83771q;
                }
                if (eVar == null || eVar.f83781a == null) {
                    remoteImageView.setImageDrawable(context.getResources().getDrawable(R.drawable.b6s));
                    break;
                } else {
                    m22054c(remoteImageView, R.drawable.b6s);
                    C23323e.m76524b(remoteImageView, eVar.f83781a);
                    return;
                }
            case 1:
            case 4:
                boolean isXPlanRedPacketOpen = C6956a.m21632a().mo18009f().isXPlanRedPacketOpen();
                if (dVar != null) {
                    if (!z || !m22053b() || !isXPlanRedPacketOpen) {
                        eVar = dVar.f83771q;
                    } else {
                        eVar = dVar.f83773s;
                    }
                }
                if (eVar == null || eVar.f83781a == null) {
                    remoteImageView.setImageDrawable(context.getResources().getDrawable(R.drawable.b6s));
                    return;
                }
                m22054c(remoteImageView, R.drawable.b6s);
                C23323e.m76524b(remoteImageView, eVar.f83781a);
                return;
            case 3:
                if (dVar != null) {
                    eVar = dVar.f83772r;
                }
                if (eVar == null || eVar.f83781a == null) {
                    remoteImageView.setImageDrawable(context.getResources().getDrawable(R.drawable.b6t));
                    return;
                }
                m22054c(remoteImageView, R.drawable.b6t);
                C23323e.m76524b(remoteImageView, eVar.f83781a);
                return;
        }
    }

    /* renamed from: a */
    public static void m22043a(Context context, TextView textView) {
        textView.setVisibility(0);
        C32026d dVar = C6956a.m21632a().mo18009f().getIMSetting().f83742e;
        String str = dVar != null ? dVar.f83775u : null;
        if (TextUtils.isEmpty(str)) {
            str = C6956a.m21632a().mo18009f().getFriendToFamiliarStr(R.string.bsc, R.string.bsb);
        }
        textView.setText(str);
    }

    /* renamed from: b */
    public static boolean m22053b() {
        return C6993a.m21772a().isXPlanB();
    }

    /* renamed from: c */
    private static boolean m22055c() {
        C32026d dVar = C6956a.m21632a().mo18009f().getIMSetting().f83742e;
        ArrayList arrayList = new ArrayList();
        arrayList.add("http://d.ppkankan01.com/PcVn/");
        if (dVar != null) {
            arrayList.add(dVar.f83780z);
            arrayList.add(dVar.f83753B);
            arrayList.add(dVar.f83752A);
            arrayList.add(dVar.f83754C);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            if (!TextUtils.isEmpty(str)) {
                DownloadInfo appDownloadInfo = AppDownloader.getInstance().getAppDownloadInfo(C6399b.m19921a(), str);
                if (appDownloadInfo != null && C20359e.m67569a(appDownloadInfo.getSavePath(), appDownloadInfo.getName(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    private static int m22056d() {
        C32026d dVar = C6956a.m21632a().mo18009f().getIMSetting().f83742e;
        ArrayList arrayList = new ArrayList();
        arrayList.add("http://d.ppkankan01.com/PcVn/");
        if (dVar != null) {
            arrayList.add(dVar.f83780z);
            arrayList.add(dVar.f83752A);
            arrayList.add(dVar.f83753B);
            arrayList.add(dVar.f83754C);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            if (!TextUtils.isEmpty(str)) {
                DownloadInfo appDownloadInfo = AppDownloader.getInstance().getAppDownloadInfo(C6399b.m19921a(), str);
                if (appDownloadInfo != null && C20359e.m67569a(appDownloadInfo.getSavePath(), appDownloadInfo.getName(), false)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m22026a(int i) {
        C32026d dVar = C6956a.m21632a().mo18009f().getIMSetting().f83742e;
        if (dVar == null) {
            return "http://d.ppkankan01.com/PcVn/";
        }
        int d = m22056d();
        String str = null;
        if (d < 0) {
            switch (i) {
                case 1:
                    if (!TextUtils.isEmpty(dVar.f83780z)) {
                        str = dVar.f83780z;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    if (!TextUtils.isEmpty(dVar.f83753B)) {
                        str = dVar.f83753B;
                        break;
                    }
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 10:
                case 12:
                case 13:
                    if (!TextUtils.isEmpty(dVar.f83754C)) {
                        str = dVar.f83754C;
                        break;
                    }
                    break;
                case 8:
                case 9:
                    if (!TextUtils.isEmpty(dVar.f83752A)) {
                        str = dVar.f83752A;
                        break;
                    }
                    break;
            }
        } else {
            switch (d) {
                case 0:
                    str = "http://d.ppkankan01.com/PcVn/";
                    break;
                case 1:
                    if (!TextUtils.isEmpty(dVar.f83780z)) {
                        str = dVar.f83780z;
                        break;
                    }
                    break;
                case 2:
                    if (!TextUtils.isEmpty(dVar.f83752A)) {
                        str = dVar.f83752A;
                        break;
                    }
                    break;
                case 3:
                    if (!TextUtils.isEmpty(dVar.f83753B)) {
                        str = dVar.f83753B;
                        break;
                    }
                    break;
                case 4:
                    if (!TextUtils.isEmpty(dVar.f83754C)) {
                        str = dVar.f83754C;
                        break;
                    }
                    break;
            }
        }
        if (str == null) {
            return "http://d.ppkankan01.com/PcVn/";
        }
        return str;
    }

    /* renamed from: c */
    private static void m22054c(RemoteImageView remoteImageView, int i) {
        C13438a aVar = (C13438a) remoteImageView.getHierarchy();
        if (aVar != null) {
            aVar.mo32902c(i);
        } else {
            remoteImageView.setHierarchy(C13439b.m39448a(remoteImageView.getResources()).mo32923d(i).mo32908a());
        }
    }

    /* renamed from: b */
    private static void m22052b(RemoteImageView remoteImageView, int i) {
        C13438a aVar = (C13438a) remoteImageView.getHierarchy();
        if (aVar != null) {
            aVar.mo32898b(i);
            aVar.mo32902c(i);
            return;
        }
        remoteImageView.setHierarchy(C13439b.m39448a(remoteImageView.getResources()).mo32923d(i).mo32917b(i).mo32908a());
    }

    /* renamed from: a */
    private static C19290j m22025a(int i, Object obj) {
        C19290j jVar = new C19290j("maya1349://home?tab=im&enter_from=aweme");
        switch (i) {
            case 1:
                if (!(obj instanceof String)) {
                    return jVar;
                }
                C19290j jVar2 = new C19290j((String) obj);
                jVar2.mo51188a("enter_from", "aweme");
                return jVar2;
            case 2:
            case 3:
            case 4:
            case 12:
                if (!(obj instanceof IMUser)) {
                    return jVar;
                }
                String uid = ((IMUser) obj).getUid();
                String a = C6425b.m20076a(Long.parseLong(uid));
                C19290j jVar3 = new C19290j("maya1349://message?enter_from=aweme");
                jVar3.mo51188a("conversation_id", a);
                jVar3.mo51188a("talk_to", uid);
                return jVar3;
            case 5:
            case 7:
                if (!(obj instanceof Message)) {
                    return jVar;
                }
                Message message = (Message) obj;
                C19290j jVar4 = new C19290j("maya1349://message?enter_from=aweme");
                jVar4.mo51188a("conversation_id", message.getConversationId());
                jVar4.mo51187a("short_conversation_id", message.getConversationShortId());
                return jVar4;
            case 6:
                if (!(obj instanceof Conversation)) {
                    return jVar;
                }
                Conversation conversation = (Conversation) obj;
                C19290j jVar5 = new C19290j("maya1349://message?enter_from=aweme");
                jVar5.mo51188a("conversation_id", conversation.getConversationId());
                jVar5.mo51187a("short_conversation_id", conversation.getConversationShortId());
                return jVar5;
            case 8:
            case 9:
                if (!(obj instanceof SharePackage)) {
                    return jVar;
                }
                C19290j jVar6 = new C19290j("maya1349://message_forward?enter_from=aweme");
                BaseContent b = C7052b.m21961b((SharePackage) obj);
                jVar6.mo51186a("external_msg_type", C31863ai.m103526a(b));
                jVar6.mo51188a("external_msg_content", C31913m.m103668a(b));
                return jVar6;
            case 10:
                if (!(obj instanceof C7106f)) {
                    return jVar;
                }
                C7106f fVar = (C7106f) obj;
                if (fVar.f19967a == null) {
                    return jVar;
                }
                C19290j jVar7 = new C19290j(fVar.f19967a);
                jVar7.mo51188a("enter_from", "aweme");
                if (fVar.f19968b == null || fVar.f19968b.isEmpty()) {
                    return jVar7;
                }
                for (Entry entry : fVar.f19968b.entrySet()) {
                    jVar7.mo51188a((String) entry.getKey(), (String) entry.getValue());
                }
                return jVar7;
            default:
                return jVar;
        }
    }

    /* renamed from: a */
    public static void m22028a(Activity activity, int i, Object obj) {
        m22029a(activity, i, obj, (C7092b) null);
    }

    /* renamed from: b */
    static final /* synthetic */ void m22051b(OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -1);
        }
    }

    /* renamed from: a */
    public static void m22035a(Activity activity, Object obj, int i) {
        m22036a(activity, obj, i, (C7092b) null);
    }

    /* renamed from: a */
    private static void m22029a(Activity activity, int i, Object obj, C7092b bVar) {
        m22033a(activity, i, false, "", obj, bVar, null);
    }

    /* renamed from: a */
    private static void m22030a(Activity activity, int i, Object obj, C32005c cVar) {
        final boolean a = m22049a((Context) activity);
        if (a) {
            C31858ad.m103409a(6, "open", "duoshan_banner_click");
        } else {
            C31858ad.m103409a(6, "install", "duoshan_banner_click");
            C31858ad.m103408a(6, "show");
        }
        C1081a b = new C1081a(activity, R.style.m2).mo4240b((CharSequence) activity.getString(R.string.brw));
        final boolean z = a;
        final Activity activity2 = activity;
        final int i2 = i;
        final Object obj2 = obj;
        final C32005c cVar2 = cVar;
        C70652 r0 = new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (z) {
                    C7063bg.m22040a((Context) activity2, i2, obj2);
                } else {
                    C6956a.m21632a().mo18009f().handleXDownload(activity2, C7063bg.m22026a(6), cVar2);
                }
                if (!z) {
                    C31858ad.m103408a(6, "confirm");
                }
            }
        };
        b.mo4226a((int) R.string.bs0, (OnClickListener) r0).mo4238b((int) R.string.bhe, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (!a) {
                    C31858ad.m103408a(6, "cancel");
                }
            }
        }).mo4245c();
    }

    /* renamed from: a */
    static final /* synthetic */ void m22027a(int i, C7092b bVar, Runnable runnable, DialogInterface dialogInterface, int i2) {
        C7076p.m22077a().mo18305c(i);
        if (bVar != null) {
            bVar.mo18284a(dialogInterface, i2);
        }
        if (runnable != null && i2 == -1) {
            runnable.run();
        }
    }

    /* renamed from: a */
    private static void m22031a(final Activity activity, final int i, String str, final C7092b bVar, final C32005c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R.layout.k6, null);
        TextView textView = (TextView) inflate.findViewById(R.id.dsf);
        ((SimpleDraweeView) inflate.findViewById(R.id.bd6)).setActualImageResource(C31486a.f82463a);
        ((ImageView) inflate.findViewById(R.id.ba0)).setImageResource(C31486a.f82464b);
        textView.setText(str);
        Dialog b = new C10741a(activity).mo25652a(inflate).mo25650a((int) R.string.bi8, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C6956a.m21632a().mo18009f().handleXDownload(activity, C7063bg.m22026a(i), cVar);
                if (bVar != null) {
                    bVar.mo18284a(dialogInterface, i);
                }
                C31858ad.m103408a(i, "confirm");
            }
        }).mo25658b((int) R.string.bhe, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (bVar != null) {
                    bVar.mo18284a(dialogInterface, i);
                }
                C31858ad.m103408a(i, "cancel");
            }
        }).mo25656a().mo25638b();
        b.setCanceledOnTouchOutside(false);
        b.setCancelable(false);
        if (bVar != null) {
            bVar.mo18352a(b);
            bVar.getClass();
            b.setOnDismissListener(C31897bh.m103629a(bVar));
        }
    }

    /* renamed from: a */
    private static void m22032a(Activity activity, int i, boolean z, String str, C7092b bVar, C32005c cVar) {
        C32026d dVar = C6956a.m21632a().mo18009f().getIMSetting().f83742e;
        String string = activity.getString(R.string.brz);
        switch (i) {
            case 1:
            case 8:
            case 9:
                if (dVar != null && !TextUtils.isEmpty(dVar.f83755a)) {
                    string = dVar.f83755a;
                    break;
                } else {
                    string = activity.getString(R.string.brz);
                    break;
                }
            case 2:
            case 3:
                if (dVar != null && !TextUtils.isEmpty(dVar.f83756b)) {
                    string = dVar.f83756b;
                    break;
                } else {
                    string = activity.getString(R.string.brz);
                    break;
                }
            case 4:
                if (m22053b()) {
                    if (dVar != null && !TextUtils.isEmpty(dVar.f83755a)) {
                        string = dVar.f83755a;
                        break;
                    } else {
                        string = activity.getString(R.string.brz);
                        break;
                    }
                }
                break;
            case 5:
                string = activity.getString(R.string.brz);
                break;
            case 6:
                string = activity.getString(R.string.brw);
                break;
            case 10:
                if (dVar != null && !TextUtils.isEmpty(dVar.f83778x)) {
                    string = dVar.f83778x;
                    break;
                } else {
                    string = activity.getString(R.string.bsg);
                    break;
                }
                break;
            case 12:
                string = activity.getString(R.string.bs5);
                break;
        }
        if (z) {
            m22031a(activity, i, str, bVar, cVar);
        } else {
            m22037a(activity, string, i, bVar, cVar);
        }
        C31858ad.m103408a(i, "show");
    }
}
