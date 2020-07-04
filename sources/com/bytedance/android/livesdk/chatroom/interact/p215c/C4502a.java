package com.bytedance.android.livesdk.chatroom.interact.p215c;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.p280ss.avframework.livestreamv2.core.Anchor.Region;
import com.p280ss.avframework.livestreamv2.core.Anchor.StreamMixer;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoQuality;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.c.a */
public final class C4502a implements StreamMixer {

    /* renamed from: a */
    private double f13105a;

    /* renamed from: b */
    private double f13106b;

    /* renamed from: c */
    private double f13107c;

    /* renamed from: d */
    private double f13108d;

    /* renamed from: e */
    private double f13109e;

    /* renamed from: f */
    private C4503a f13110f;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.c.a$a */
    public interface C4503a {
        /* renamed from: a */
        boolean mo12169a(int i);

        /* renamed from: b */
        int mo12170b(int i);

        /* renamed from: c */
        long mo12174c(int i);
    }

    public C4502a(VideoQuality videoQuality, C4503a aVar) {
        this.f13110f = aVar;
        int width = videoQuality.getWidth();
        int height = videoQuality.getHeight();
        double d = (double) ((((float) width) * 1.0f) / 360.0f);
        Double.isNaN(d);
        double d2 = 120.0d * d;
        double d3 = (double) width;
        Double.isNaN(d3);
        this.f13105a = d2 / d3;
        Double.isNaN(d);
        double d4 = 160.0d * d;
        double d5 = (double) height;
        Double.isNaN(d5);
        this.f13106b = d4 / d5;
        Double.isNaN(d);
        double d6 = 12.0d * d;
        Double.isNaN(d3);
        this.f13107c = (1.0d - this.f13105a) - (d6 / d3);
        Double.isNaN(d);
        double d7 = 60.0d * d;
        Double.isNaN(d5);
        this.f13108d = d7 / d5;
        Double.isNaN(d);
        double d8 = d * 4.0d;
        Double.isNaN(d5);
        this.f13109e = d8 / d5;
    }

    public final List<Region> mixStream(int i, int i2, int i3, List<Integer> list) {
        List<Integer> list2 = list;
        int i4 = C3912d.m13795a().f11713h;
        long b = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        ArrayList arrayList = new ArrayList();
        Region region = new Region();
        double d = 1.0d;
        com.p280ss.avframework.livestreamv2.interact.model.Region userId = region.mediaType(1).size(1.0d, 1.0d).position(0.0d, 0.0d).interactId(i4).userId(b);
        int i5 = 0;
        userId.status(0);
        arrayList.add(region);
        if (list2 != null && !list.isEmpty()) {
            i5 = list.size();
        }
        int i6 = 1;
        while (i6 <= i5) {
            int i7 = i6 - 1;
            int intValue = ((Integer) list2.get(i7)).intValue();
            double d2 = d - this.f13108d;
            double d3 = (double) i6;
            double d4 = this.f13106b;
            Double.isNaN(d3);
            double d5 = d2 - (d3 * d4);
            if (i6 > 1) {
                double d6 = (double) i7;
                double d7 = this.f13109e;
                Double.isNaN(d6);
                d5 -= d6 * d7;
            }
            Region region2 = new Region();
            region2.mediaType(this.f13110f.mo12170b(intValue)).size(this.f13105a, this.f13106b).position(this.f13107c, d5).interactId(intValue).userId(this.f13110f.mo12174c(intValue)).status(this.f13110f.mo12169a(intValue) ^ true ? 1 : 0);
            arrayList.add(region2);
            i6++;
            d = 1.0d;
        }
        return arrayList;
    }
}
