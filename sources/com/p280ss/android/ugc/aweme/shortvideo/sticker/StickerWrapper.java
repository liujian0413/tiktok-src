package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41363h;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper */
public class StickerWrapper implements Parcelable {
    public static final Creator<StickerWrapper> CREATOR = new Creator<StickerWrapper>() {
        /* renamed from: a */
        private static StickerWrapper[] m129081a(int i) {
            return new StickerWrapper[i];
        }

        /* renamed from: a */
        private static StickerWrapper m129080a(Parcel parcel) {
            return new StickerWrapper(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m129080a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m129081a(i);
        }
    };

    /* renamed from: a */
    public Effect f104908a;

    /* renamed from: b */
    public String f104909b;

    /* renamed from: c */
    public int f104910c;

    /* renamed from: d */
    public boolean f104911d;

    /* renamed from: e */
    public int f104912e;

    /* renamed from: f */
    public boolean f104913f;

    public StickerWrapper() {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    private static boolean m129071a(FragmentActivity fragmentActivity, Effect effect) {
        if (effect == null) {
            return false;
        }
        return C35574k.m114859a().mo70098m().filterPinnedSticker(fragmentActivity, effect);
    }

    /* renamed from: a */
    public static boolean m129072a(StickerWrapper stickerWrapper) {
        try {
            if (Integer.parseInt(stickerWrapper.f104908a.getEffectId()) < 0) {
                return true;
            }
            return false;
        } catch (NullPointerException | NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m129074a(Effect effect, C27481e eVar) {
        return m129075a(effect, eVar, false);
    }

    /* renamed from: a */
    public static boolean m129073a(Effect effect) {
        if (effect != null) {
            return !C40496bh.m129472q(effect) || m129079c(effect) != null;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m129075a(Effect effect, C27481e eVar, boolean z) {
        return z ? effect != null && C7276d.m22812b(effect.getUnzipPath()) : (eVar == null || effect == null || (!eVar.mo70640a(effect) && effect.getEffectType() == 0 && !effect.getTags().contains("hw_beauty"))) ? false : true;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: c */
    private static String m129079c(Effect effect) {
        if (effect == null || effect.getMusic().size() <= 0) {
            return null;
        }
        return C40374af.m129112a((String) effect.getMusic().get(0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f104908a.equals(((StickerWrapper) obj).f104908a);
    }

    protected StickerWrapper(Parcel parcel) {
        boolean z;
        this.f104908a = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.f104909b = parcel.readString();
        this.f104910c = parcel.readInt();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f104911d = z;
        this.f104912e = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f104913f = z2;
    }

    /* renamed from: a */
    public static List<Effect> m129068a(List<StickerWrapper> list) {
        if (C6307b.m19566a((Collection<T>) list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (StickerWrapper stickerWrapper : list) {
            arrayList.add(stickerWrapper.f104908a);
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m129078b(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (!C35574k.m114859a().mo70073G().mo57090c() && C40496bh.m129464i(effect)) {
            return false;
        }
        if (!C35574k.m114859a().mo70073G().mo57088a() || !C40496bh.m129464i(effect)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static List<StickerWrapper> m129067a(LinkedHashMap<String, CategoryEffectModel> linkedHashMap) {
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Entry entry : linkedHashMap.entrySet()) {
            List<Effect> list = ((CategoryEffectModel) entry.getValue()).effects;
            if (!C6311g.m19573a(list)) {
                for (Effect effect : list) {
                    if ((C35574k.m114859a().mo70073G().mo57090c() || !C40496bh.m129464i(effect)) && (!C35574k.m114859a().mo70073G().mo57088a() || !C40496bh.m129464i(effect))) {
                        arrayList.add(new StickerWrapper(effect, (String) entry.getKey(), 3));
                    }
                }
                Effect effect2 = new Effect();
                effect2.setEffectId("-1");
                effect2.setName("");
                arrayList.add(new StickerWrapper(effect2, "", 3));
            }
        }
        if (!arrayList.isEmpty() && m129072a((StickerWrapper) arrayList.get(arrayList.size() - 1))) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static StickerWrapper m129065a(Effect effect, boolean z) {
        return new StickerWrapper(effect, null, 1);
    }

    /* renamed from: a */
    public static StickerWrapper m129062a(StickerWrapper stickerWrapper, C27481e eVar) {
        return new StickerWrapper(stickerWrapper.f104908a, stickerWrapper.f104909b, m129076b(stickerWrapper.f104908a, eVar));
    }

    /* renamed from: b */
    public static StickerWrapper m129077b(StickerWrapper stickerWrapper, C27481e eVar) {
        stickerWrapper.f104910c = m129076b(stickerWrapper.f104908a, eVar);
        return stickerWrapper;
    }

    /* renamed from: a */
    public static StickerWrapper m129063a(Effect effect, String str) {
        boolean z;
        int i = 1;
        if (effect == null || (!C7276d.m22812b(effect.getUnzipPath()) && effect.getEffectType() == 0 && !effect.getTags().contains("hw_beauty"))) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i = 3;
        }
        return new StickerWrapper(effect, str, i);
    }

    /* renamed from: b */
    private static int m129076b(Effect effect, C27481e eVar) {
        if (!m129074a(effect, eVar)) {
            return 3;
        }
        if (!C40496bh.m129472q(effect) || C41363h.m131939d(effect.getEffectId()) || m129079c(effect) != null) {
            return 1;
        }
        return 3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f104908a, i);
        parcel.writeString(this.f104909b);
        parcel.writeInt(this.f104910c);
        parcel.writeByte(this.f104911d ? (byte) 1 : 0);
        parcel.writeInt(this.f104912e);
        parcel.writeByte(this.f104913f ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public static List<StickerWrapper> m129069a(List<Effect> list, String str) {
        if (C6307b.m19566a((Collection<T>) list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Effect effect : list) {
            if (m129078b(effect)) {
                arrayList.add(new StickerWrapper(effect, str, 3));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m129070a(StickerWrapper stickerWrapper, StickerWrapper stickerWrapper2) {
        if (stickerWrapper != null && stickerWrapper2 != null) {
            stickerWrapper2.f104910c = stickerWrapper.f104910c;
        }
    }

    private StickerWrapper(Effect effect, String str, int i) {
        this.f104908a = effect;
        this.f104909b = str;
        this.f104910c = i;
    }

    /* renamed from: a */
    public static StickerWrapper m129064a(Effect effect, String str, C27481e eVar) {
        boolean z;
        int i = 1;
        if (!m129074a(effect, eVar) || !m129073a(effect)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i = 3;
        }
        return new StickerWrapper(effect, str, i);
    }

    /* renamed from: a */
    public static List<StickerWrapper> m129066a(FragmentActivity fragmentActivity, Collection<Effect> collection, Collection<Effect> collection2, String str) {
        if (C6307b.m19566a(collection)) {
            return new ArrayList();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Effect effect = (Effect) it.next();
            for (Effect effectId : collection2) {
                if (TextUtils.equals(effectId.getEffectId(), effect.getEffectId())) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Effect effect2 : collection2) {
            if (m129078b(effect2) && m129071a(fragmentActivity, effect2)) {
                arrayList.add(new StickerWrapper(effect2, str, 3));
            }
        }
        for (Effect effect3 : collection) {
            if (m129078b(effect3)) {
                arrayList.add(new StickerWrapper(effect3, str, 3));
            }
        }
        return arrayList;
    }
}
