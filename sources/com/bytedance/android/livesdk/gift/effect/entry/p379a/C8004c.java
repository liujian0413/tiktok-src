package com.bytedance.android.livesdk.gift.effect.entry.p379a;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8026a;
import com.bytedance.android.livesdk.message.model.C8514bj;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.gift.effect.entry.a.c */
public final class C8004c {
    /* renamed from: a */
    public static C8026a m24540a(C8514bj bjVar) {
        ImageModel imageModel;
        ImageModel imageModel2;
        int i;
        int i2;
        ImageModel imageModel3;
        int i3;
        String str;
        int i4;
        String str2;
        ImageModel imageModel4;
        C8514bj bjVar2 = bjVar;
        String d = bjVar.mo21662d();
        String c = bjVar.mo21660c();
        User user = bjVar2.f23390b;
        if (user == null) {
            return new C8026a(0, "", "");
        }
        long id = user.getId();
        String nickName = user.getNickName();
        int level = user.getLevel();
        ImageModel avatarThumb = user.getAvatarThumb();
        String str3 = "";
        if (avatarThumb == null || C6307b.m19566a((Collection<T>) avatarThumb.getUrls())) {
            imageModel = null;
        } else {
            str3 = (String) avatarThumb.getUrls().get(0);
            imageModel = user.getAvatarThumb();
        }
        String str4 = "";
        if (user.getUserHonor() == null || user.getUserHonor().mo8707k() == null || C6311g.m19573a(user.getUserHonor().mo8707k().getUrls())) {
            i = 0;
            imageModel2 = null;
        } else {
            str4 = (String) user.getUserHonor().mo8707k().getUrls().get(0);
            i = user.getUserHonor().mo8710n();
            imageModel2 = user.getUserHonor().mo8707k();
        }
        int i5 = -1;
        if (bjVar2.f23397i > 100) {
            int i6 = bjVar2.f23397i;
            i5 = i6 % 10;
            i2 = (i6 / 1000) % 10;
        } else {
            i2 = 0;
        }
        String str5 = "";
        if (user.getFansClub() != null) {
            FansClubData data = user.getFansClub().getData();
            Map preferData = user.getFansClub().getPreferData();
            if (FansClubData.isValid(data) || preferData == null || preferData.isEmpty()) {
                str2 = str5;
            } else {
                str2 = str5;
                data = (FansClubData) preferData.get(Integer.valueOf(1));
            }
            FansClubData fansClubData = data;
            if (FansClubData.isValid(fansClubData)) {
                int i7 = fansClubData.level;
                String str6 = fansClubData.clubName;
                if (fansClubData.badge != null && fansClubData.badge.icons != null && !fansClubData.badge.icons.isEmpty()) {
                    Iterator it = fansClubData.badge.icons.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Iterator it2 = it;
                        ImageModel imageModel5 = (ImageModel) fansClubData.badge.icons.get((Integer) it.next());
                        if (imageModel5 != null) {
                            imageModel4 = imageModel5;
                            break;
                        }
                        it = it2;
                        C8514bj bjVar3 = bjVar;
                    }
                    i3 = fansClubData.userFansClubStatus;
                    imageModel3 = imageModel4;
                    i4 = i7;
                    str = str6;
                    return new C8026a(id, nickName, str3).mo20934b(level).mo20940c(d).mo20935b(imageModel).mo20939c(imageModel2).mo20943d(str4).mo20938c(i).mo20946e(c).mo20942d(i5).mo20945e(i2).mo20929a((long) i4).mo20932a(str).mo20930a(imageModel3).mo20928a(i3).mo20931a(bjVar.f23399k);
                }
                imageModel4 = null;
                i3 = fansClubData.userFansClubStatus;
                imageModel3 = imageModel4;
                i4 = i7;
                str = str6;
                return new C8026a(id, nickName, str3).mo20934b(level).mo20940c(d).mo20935b(imageModel).mo20939c(imageModel2).mo20943d(str4).mo20938c(i).mo20946e(c).mo20942d(i5).mo20945e(i2).mo20929a((long) i4).mo20932a(str).mo20930a(imageModel3).mo20928a(i3).mo20931a(bjVar.f23399k);
            }
        } else {
            str2 = str5;
        }
        str = str2;
        i4 = 0;
        i3 = 0;
        imageModel3 = null;
        return new C8026a(id, nickName, str3).mo20934b(level).mo20940c(d).mo20935b(imageModel).mo20939c(imageModel2).mo20943d(str4).mo20938c(i).mo20946e(c).mo20942d(i5).mo20945e(i2).mo20929a((long) i4).mo20932a(str).mo20930a(imageModel3).mo20928a(i3).mo20931a(bjVar.f23399k);
    }
}
