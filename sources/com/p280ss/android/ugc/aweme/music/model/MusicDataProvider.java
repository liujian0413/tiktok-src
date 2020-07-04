package com.p280ss.android.ugc.aweme.music.model;

import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.p1716b.p1718b.C43658b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicDataProvider */
public class MusicDataProvider {
    public static ArrayList<MusicModel> getMusicModel(ArrayList<C43658b> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList<MusicModel> arrayList2 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C43658b bVar = (C43658b) it.next();
            MusicModel musicModel = new MusicModel();
            musicModel.setAlbum(bVar.f112980i);
            musicModel.setAllRate(bVar.f112982k);
            musicModel.setCollectionType(CollectionType.NOT_COLLECTED);
            musicModel.setDuration(bVar.f112984m);
            musicModel.setMusicId(bVar.f112981j);
            musicModel.setName(bVar.f112974c);
            musicModel.setPath(bVar.f112973b);
            musicModel.setMusicType(MusicType.BAIDU);
            musicModel.setPicBig(bVar.f112978g);
            musicModel.setPicHuge(bVar.f112977f);
            musicModel.setPicPremium(bVar.f112976e);
            musicModel.setPicSmall(bVar.f112979h);
            musicModel.setSinger(bVar.f112975d);
            musicModel.setSongId(bVar.f112972a);
            musicModel.setSourcePlatform(bVar.f112983l);
            arrayList2.add(musicModel);
        }
        return arrayList2;
    }
}
