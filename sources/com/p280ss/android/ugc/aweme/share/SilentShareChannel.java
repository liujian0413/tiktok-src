package com.p280ss.android.ugc.aweme.share;

import android.app.Activity;
import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.ShareChannelSettings;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.share.improve.C38065a.C38066a;
import com.p280ss.android.ugc.aweme.share.improve.expr.WhatsappStatusExperiment;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.SilentShareChannel */
public enum SilentShareChannel {
    INSTAGRAM("instagram", "Instagram", R.drawable.t1, 2),
    INSTAGRAM_STORY("instagram_story", "Instagram", R.drawable.t5, 3),
    WHATSAPP("whatsapp", "Whatsapp", R.drawable.t7, 5),
    WHATSAPP_STATUS("whatsapp_status", "Whatspp Status", R.drawable.t8, 14),
    FACEBOOK("facebook", "Facebook", R.drawable.t0, 6),
    SMS("sms", "Sms", R.drawable.t3, 13),
    MESSENGER("messenger", "Messenger", R.drawable.t2, 7),
    VK("vk", "VK", R.drawable.t6, 9),
    SNAPCHAT("snapchat", "Snapchat", R.drawable.t4, 8);
    
    public static final C37953a Companion = null;
    private final int iconRes;
    private final String key;
    private final String label;
    private final int saveType;

    /* renamed from: com.ss.android.ugc.aweme.share.SilentShareChannel$a */
    public static final class C37953a {
        private C37953a() {
        }

        public /* synthetic */ C37953a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static List<SilentShareChannel> m121242a(Activity activity) {
            List list;
            Object obj;
            C7573i.m23587b(activity, "activity");
            if (!((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableSaveUploadVideo()) {
                return C7525m.m23461a();
            }
            List c = C7525m.m23466c(SilentShareChannel.WHATSAPP, SilentShareChannel.WHATSAPP_STATUS, SilentShareChannel.INSTAGRAM, SilentShareChannel.INSTAGRAM_STORY, SilentShareChannel.FACEBOOK, SilentShareChannel.SMS, SilentShareChannel.MESSENGER, SilentShareChannel.VK, SilentShareChannel.SNAPCHAT);
            if (!WhatsappStatusExperiment.INSTANCE.isStyle2()) {
                c.remove(SilentShareChannel.WHATSAPP_STATUS);
            }
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                List<ShareChannelSettings> silentShareList = a.getSilentShareList();
                list = new ArrayList();
                for (ShareChannelSettings shareChannelSettings : silentShareList) {
                    Iterator it = c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        String key = ((SilentShareChannel) obj).getKey();
                        C7573i.m23582a((Object) shareChannelSettings, "channel");
                        if (C7573i.m23585a((Object) key, (Object) shareChannelSettings.getId())) {
                            break;
                        }
                    }
                    SilentShareChannel silentShareChannel = (SilentShareChannel) obj;
                    if (silentShareChannel != null) {
                        list.add(silentShareChannel);
                    }
                }
            } catch (NullValueException unused) {
                list = C7525m.m23505c((Iterable<? extends T>) c, 4);
            }
            List<SilentShareChannel> d = C7525m.m23509d((Collection<? extends T>) list);
            Iterator it2 = d.iterator();
            while (it2.hasNext()) {
                C38343b a2 = C38066a.m121469a(((SilentShareChannel) it2.next()).getKey(), activity);
                if (a2 == null || !a2.mo95743a(activity)) {
                    it2.remove();
                }
            }
            return d;
        }
    }

    public static final List<SilentShareChannel> supportChannels(Activity activity) {
        return C37953a.m121242a(activity);
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getSaveType() {
        return this.saveType;
    }

    static {
        Companion = new C37953a(null);
    }

    private SilentShareChannel(String str, String str2, int i, int i2) {
        this.key = str;
        this.label = str2;
        this.iconRes = i;
        this.saveType = i2;
    }
}
