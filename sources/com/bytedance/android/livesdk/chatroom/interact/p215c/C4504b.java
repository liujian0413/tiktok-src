package com.bytedance.android.livesdk.chatroom.interact.p215c;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.p280ss.avframework.livestreamv2.core.Anchor.Region;
import com.p280ss.avframework.livestreamv2.core.Anchor.StreamMixer;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoQuality;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.c.b */
public final class C4504b implements StreamMixer {

    /* renamed from: a */
    public boolean f13111a = true;

    /* renamed from: b */
    public boolean f13112b = true;

    /* renamed from: c */
    private double f13113c;

    /* renamed from: d */
    private double f13114d;

    public C4504b(VideoQuality videoQuality) {
        int width = videoQuality.getWidth();
        int height = videoQuality.getHeight();
        double d = (double) ((((float) width) * 1.0f) / 360.0f);
        Double.isNaN(d);
        double d2 = 108.0d * d;
        double d3 = (double) height;
        Double.isNaN(d3);
        this.f13113c = d2 / d3;
        Double.isNaN(d);
        double d4 = d * 260.0d;
        Double.isNaN(d3);
        this.f13114d = d4 / d3;
    }

    public final List<Region> mixStream(int i, int i2, int i3, List<Integer> list) {
        boolean z;
        int i4 = LinkCrossRoomDataHolder.m13782a().f11677o;
        long b = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        if (list.size() <= 0 || LinkCrossRoomDataHolder.m13782a().f11670h > 0) {
            List<Integer> list2 = list;
        } else {
            LinkCrossRoomDataHolder.m13782a().f11670h = ((Integer) list.get(0)).intValue();
        }
        int i5 = LinkCrossRoomDataHolder.m13782a().f11670h;
        long j = LinkCrossRoomDataHolder.m13782a().f11667e;
        ArrayList arrayList = new ArrayList();
        if (list.size() <= 0 || i5 <= 0 || i5 == i3) {
            z = true;
        } else {
            Region region = new Region();
            z = true;
            region.mediaType(1).size(0.5d, this.f13114d).position(0.5d, this.f13113c).interactId(i5).userId(j).status(this.f13112b ^ true ? 1 : 0);
            arrayList.add(region);
        }
        Region region2 = new Region();
        region2.mediaType(z ? 1 : 0).interactId(i4).userId(b).status(this.f13111a ^ z ? 1 : 0).writeToSei(false);
        if (list.size() <= 0) {
            region2.size(1.0d, 1.0d).position(0.0d, 0.0d);
        } else {
            region2.size(0.5d, this.f13114d).position(0.0d, this.f13113c);
        }
        arrayList.add(region2);
        return arrayList;
    }
}
