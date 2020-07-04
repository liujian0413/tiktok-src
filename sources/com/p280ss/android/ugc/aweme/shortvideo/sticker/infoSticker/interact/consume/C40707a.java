package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.google.gson.C6600e;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p280ss.android.ugc.aweme.sticker.data.StickerAttrStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a */
public final class C40707a {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$a */
    public static final class C40708a extends C6597a<List<? extends NormalTrackTimeStamp>> {
        C40708a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$b */
    public static final class C40709b extends C6597a<List<? extends NormalTrackTimeStamp>> {
        C40709b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$c */
    public static final class C40710c extends C6597a<List<? extends NormalTrackTimeStamp>> {
        C40710c() {
        }
    }

    /* renamed from: a */
    public static final boolean m130163a(Context context) {
        C7573i.m23587b(context, "context");
        return C7285c.m22838a(context, "test_data", 0).getBoolean("sp_interact_stickers_test", false);
    }

    /* renamed from: c */
    public static final Aweme m130166c(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.getAwemeType() == 13) {
            aweme = aweme.getForwardItem();
        }
        return aweme;
    }

    /* renamed from: a */
    public static final String m130158a(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getAwemeType() != 13 || aweme.getForwardItem() == null) {
            return aweme.getAid();
        }
        Aweme forwardItem = aweme.getForwardItem();
        C7573i.m23582a((Object) forwardItem, "aweme.forwardItem");
        return forwardItem.getAid();
    }

    /* renamed from: b */
    public static final User m130164b(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.getAwemeType() != 13 || aweme.getForwardItem() == null) {
            return aweme.getAuthor();
        }
        Aweme forwardItem = aweme.getForwardItem();
        C7573i.m23582a((Object) forwardItem, "aweme.forwardItem");
        return forwardItem.getAuthor();
    }

    /* renamed from: c */
    public static final StickerAttrStruct m130167c(InteractStickerStruct interactStickerStruct) {
        StickerAttrStruct stickerAttrStruct;
        if (interactStickerStruct == null) {
            return null;
        }
        try {
            stickerAttrStruct = (StickerAttrStruct) C10944e.m32113a().mo15974a(interactStickerStruct.getAttr(), StickerAttrStruct.class);
        } catch (JsonSyntaxException unused) {
            stickerAttrStruct = null;
        }
        return stickerAttrStruct;
    }

    /* renamed from: a */
    public static final String m130159a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        if (parse != null) {
            str2 = parse.getHost();
        } else {
            str2 = null;
        }
        if (TextUtils.equals(str2, C22912d.f60641a)) {
            return "web_url";
        }
        return C22912d.f60642b;
    }

    /* renamed from: b */
    public static final NormalTrackTimeStamp m130165b(InteractStickerStruct interactStickerStruct) {
        List list;
        String str;
        if (interactStickerStruct != null && !interactStickerStruct.isPoiSticker()) {
            return null;
        }
        try {
            C6600e a = C10944e.m32113a();
            if (interactStickerStruct != null) {
                str = interactStickerStruct.getTrackList();
            } else {
                str = null;
            }
            list = (List) a.mo15975a(str, new C40709b().type);
        } catch (JsonSyntaxException unused) {
            list = null;
        }
        if (C6307b.m19566a((Collection<T>) list)) {
            return null;
        }
        if (list == null) {
            C7573i.m23580a();
        }
        NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) list.get(0);
        if (!normalTrackTimeStamp.isFullTrack()) {
            return null;
        }
        return normalTrackTimeStamp;
    }

    /* renamed from: a */
    public static final List<NormalTrackTimeStamp> m130162a(InteractStickerStruct interactStickerStruct) {
        List<NormalTrackTimeStamp> list;
        String str;
        try {
            C6600e a = C10944e.m32113a();
            if (interactStickerStruct != null) {
                str = interactStickerStruct.getTrackList();
            } else {
                str = null;
            }
            list = (List) a.mo15975a(str, new C40710c().type);
        } catch (JsonSyntaxException unused) {
            list = null;
        }
        if (C6307b.m19566a((Collection<T>) list)) {
            return null;
        }
        return list;
    }

    /* renamed from: a */
    public static final List<NormalTrackTimeStamp> m130160a(long j, InteractStickerStruct interactStickerStruct) {
        Iterable iterable;
        long j2;
        boolean z;
        String str;
        try {
            C6600e a = C10944e.m32113a();
            if (interactStickerStruct != null) {
                str = interactStickerStruct.getTrackList();
            } else {
                str = null;
            }
            iterable = (List) a.mo15975a(str, new C40708a().type);
        } catch (JsonSyntaxException unused) {
            iterable = null;
        }
        if (iterable == null) {
            return null;
        }
        Iterable iterable2 = iterable;
        Collection arrayList = new ArrayList();
        for (Object next : iterable2) {
            NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) next;
            if (normalTrackTimeStamp != null) {
                j2 = (long) normalTrackTimeStamp.getPts();
            } else {
                j2 = 0;
            }
            long j3 = j - j2;
            if (-160 <= j3 && 160 >= j3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    public static final List<NormalTrackTimeStamp> m130161a(long j, List<? extends NormalTrackTimeStamp> list) {
        long j2;
        boolean z;
        if (list == null) {
            return null;
        }
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) next;
            if (normalTrackTimeStamp != null) {
                j2 = (long) normalTrackTimeStamp.getPts();
            } else {
                j2 = 0;
            }
            long j3 = j - j2;
            if (-160 <= j3 && 160 >= j3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }
}
