package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a;

import android.util.Pair;
import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.b */
public final class C39700b {

    /* renamed from: a */
    public static final C39700b f103201a = new C39700b();

    /* renamed from: b */
    private static String f103202b;

    /* renamed from: c */
    private static String f103203c;

    /* renamed from: d */
    private static String f103204d;

    /* renamed from: e */
    private static String f103205e;

    /* renamed from: f */
    private static String f103206f;

    private C39700b() {
    }

    /* renamed from: a */
    public final void mo99062a() {
        C6907h.m21524a("cancel_video_trim", (Map) m127032c().f60753a);
    }

    /* renamed from: b */
    public final void mo99068b() {
        C6907h.m21524a("exit_video_trim", (Map) m127032c().f60753a);
    }

    /* renamed from: c */
    private static C22984d m127032c() {
        C22984d a = C22984d.m75611a().mo59973a("shoot_way", f103203c).mo59973a("creation_id", f103202b).mo59973a("enter_from", f103204d).mo59973a("content_type", f103205e).mo59973a("content_source", f103206f).mo59973a("enter_from", "video_edit_page");
        C7573i.m23582a((Object) a, "EventMapBuilder.newBuild…from\", \"video_edit_page\")");
        return a;
    }

    /* renamed from: a */
    public static void m127031a(ShortVideoContext shortVideoContext) {
        if (shortVideoContext != null) {
            f103202b = shortVideoContext.f99787w;
            f103203c = shortVideoContext.f99788x;
            f103204d = shortVideoContext.f99789y;
            f103205e = "video";
            f103206f = "shoot";
        }
    }

    /* renamed from: c */
    public static final void m127033c(int i) {
        C6907h.m21524a("back_to_video_trim", (Map) m127032c().mo59970a("segment", i).f60753a);
    }

    /* renamed from: b */
    public final void mo99069b(int i) {
        C6907h.m21524a("reshoot_video_section", (Map) m127032c().mo59973a(POIService.KEY_ORDER, String.valueOf(i + 1)).f60753a);
    }

    /* renamed from: d */
    public final void mo99071d(int i) {
        C6907h.m21524a("delete_video_section", (Map) m127032c().mo59973a(POIService.KEY_ORDER, String.valueOf(i + 1)).f60753a);
    }

    /* renamed from: a */
    public final void mo99063a(int i) {
        C6907h.m21524a("select_video_section", (Map) m127032c().mo59973a(POIService.KEY_ORDER, String.valueOf(i + 1)).f60753a);
    }

    /* renamed from: a */
    public final void mo99066a(boolean z) {
        String str;
        String str2 = "click_video_trim";
        C22984d c = m127032c();
        String str3 = "segment_type";
        if (z) {
            str = "single";
        } else {
            str = "mutiple";
        }
        C6907h.m21524a(str2, (Map) c.mo59973a(str3, str).f60753a);
    }

    /* renamed from: b */
    public final void mo99070b(int i, int i2) {
        C6907h.m21524a("confirm_video_trim", (Map) m127032c().mo59973a("from_video_length", String.valueOf(i)).mo59973a("to_video_length", String.valueOf(i2)).f60753a);
    }

    /* renamed from: a */
    public final void mo99064a(int i, int i2) {
        C6907h.m21524a("edit_segment_order", (Map) m127032c().mo59973a("from_order", String.valueOf(i + 1)).mo59973a("to_order", String.valueOf(i2 + 1)).f60753a);
    }

    /* renamed from: a */
    public final void mo99065a(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        MultiEditVideoRecordData multiEditVideoRecordData3 = multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData4 = multiEditVideoRecordData2;
        if (multiEditVideoRecordData3 != null && multiEditVideoRecordData4 != null && !C6292i.m19525a(multiEditVideoRecordData3.segmentDataList) && !C6292i.m19525a(multiEditVideoRecordData4.segmentDataList)) {
            Pair playInOutTime = multiEditVideoRecordData2.getPlayInOutTime();
            if (playInOutTime != null) {
                List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData4.segmentDataList;
                C7573i.m23582a((Object) list, "restoreRecordData.segmentDataList");
                long j = 0;
                long j2 = 0;
                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                    j2 += multiEditVideoSegmentRecordData.endTime - multiEditVideoSegmentRecordData.startTime;
                }
                int intValue = ((Number) playInOutTime.second).intValue();
                Object obj = playInOutTime.first;
                C7573i.m23582a(obj, "restoreTimeSec.first");
                long min = Math.min(j2, (long) (intValue - ((Number) obj).intValue()));
                Iterator it = multiEditVideoRecordData4.segmentDataList.iterator();
                int i = 0;
                long j3 = 0;
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = (MultiEditVideoSegmentRecordData) it.next();
                    long j4 = (multiEditVideoSegmentRecordData2.endTime - multiEditVideoSegmentRecordData2.startTime) + j3;
                    Object obj2 = playInOutTime.first;
                    C7573i.m23582a(obj2, "restoreTimeSec.first");
                    if (j3 >= ((Number) obj2).longValue()) {
                        Object obj3 = playInOutTime.second;
                        C7573i.m23582a(obj3, "restoreTimeSec.second");
                        if (j4 <= ((Number) obj3).longValue()) {
                            i2++;
                            j3 = j4;
                        }
                    }
                    Object obj4 = playInOutTime.first;
                    C7573i.m23582a(obj4, "restoreTimeSec.first");
                    if (j3 >= ((Number) obj4).longValue()) {
                        Object obj5 = playInOutTime.second;
                        C7573i.m23582a(obj5, "restoreTimeSec.second");
                        if (j3 <= ((Number) obj5).longValue()) {
                            Object obj6 = playInOutTime.second;
                            C7573i.m23582a(obj6, "restoreTimeSec.second");
                            if (j4 >= ((Number) obj6).longValue()) {
                                i2++;
                                break;
                            }
                        }
                    }
                    Object obj7 = playInOutTime.first;
                    C7573i.m23582a(obj7, "restoreTimeSec.first");
                    if (j3 <= ((Number) obj7).longValue()) {
                        Object obj8 = playInOutTime.first;
                        C7573i.m23582a(obj8, "restoreTimeSec.first");
                        if (j4 >= ((Number) obj8).longValue()) {
                            Object obj9 = playInOutTime.second;
                            C7573i.m23582a(obj9, "restoreTimeSec.second");
                            if (j4 <= ((Number) obj9).longValue()) {
                                i2++;
                                j3 = j4;
                            }
                        }
                    }
                    Object obj10 = playInOutTime.first;
                    C7573i.m23582a(obj10, "restoreTimeSec.first");
                    if (j3 <= ((Number) obj10).longValue()) {
                        Object obj11 = playInOutTime.second;
                        C7573i.m23582a(obj11, "restoreTimeSec.second");
                        if (j4 >= ((Number) obj11).longValue()) {
                            i2++;
                            break;
                        }
                    } else {
                        continue;
                    }
                    j3 = j4;
                }
                Pair playInOutTime2 = multiEditVideoRecordData.getPlayInOutTime();
                if (playInOutTime2 != null) {
                    List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData3.segmentDataList;
                    C7573i.m23582a((Object) list2, "curRecordData.segmentDataList");
                    long j5 = 0;
                    for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData3 : list2) {
                        j5 += multiEditVideoSegmentRecordData3.endTime - multiEditVideoSegmentRecordData3.startTime;
                    }
                    int intValue2 = ((Number) playInOutTime2.second).intValue();
                    Object obj12 = playInOutTime2.first;
                    C7573i.m23582a(obj12, "curTimeSec.first");
                    long min2 = Math.min(j5, (long) (intValue2 - ((Number) obj12).intValue()));
                    Iterator it2 = multiEditVideoRecordData3.segmentDataList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData4 = (MultiEditVideoSegmentRecordData) it2.next();
                        long j6 = (multiEditVideoSegmentRecordData4.endTime - multiEditVideoSegmentRecordData4.startTime) + j;
                        Object obj13 = playInOutTime2.first;
                        C7573i.m23582a(obj13, "curTimeSec.first");
                        if (j >= ((Number) obj13).longValue()) {
                            Object obj14 = playInOutTime2.second;
                            C7573i.m23582a(obj14, "curTimeSec.second");
                            if (j6 <= ((Number) obj14).longValue()) {
                                i++;
                                j = j6;
                            }
                        }
                        Object obj15 = playInOutTime2.first;
                        C7573i.m23582a(obj15, "curTimeSec.first");
                        if (j >= ((Number) obj15).longValue()) {
                            Object obj16 = playInOutTime2.second;
                            C7573i.m23582a(obj16, "curTimeSec.second");
                            if (j <= ((Number) obj16).longValue()) {
                                Object obj17 = playInOutTime2.second;
                                C7573i.m23582a(obj17, "curTimeSec.second");
                                if (j6 >= ((Number) obj17).longValue()) {
                                    i++;
                                    break;
                                }
                            }
                        }
                        Object obj18 = playInOutTime2.first;
                        C7573i.m23582a(obj18, "curTimeSec.first");
                        if (j <= ((Number) obj18).longValue()) {
                            Object obj19 = playInOutTime2.first;
                            C7573i.m23582a(obj19, "curTimeSec.first");
                            if (j6 >= ((Number) obj19).longValue()) {
                                Object obj20 = playInOutTime2.second;
                                C7573i.m23582a(obj20, "curTimeSec.second");
                                if (j6 <= ((Number) obj20).longValue()) {
                                    i++;
                                    j = j6;
                                }
                            }
                        }
                        Object obj21 = playInOutTime2.first;
                        C7573i.m23582a(obj21, "curTimeSec.first");
                        if (j <= ((Number) obj21).longValue()) {
                            Object obj22 = playInOutTime2.second;
                            C7573i.m23582a(obj22, "curTimeSec.second");
                            if (j6 >= ((Number) obj22).longValue()) {
                                i++;
                                break;
                            }
                        } else {
                            continue;
                        }
                        j = j6;
                    }
                    C6907h.m21524a("save_video_trim", (Map) m127032c().mo59973a("from_video_length", String.valueOf(min)).mo59973a("to_video_length", String.valueOf(min2)).mo59973a("from_video_segments", String.valueOf(i2)).mo59973a("to_video_segments", String.valueOf(i)).f60753a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo99067a(boolean z, boolean z2, int i, int i2, int i3) {
        String str = "multi_entire";
        if (z2) {
            str = "single";
        } else if (z) {
            str = "multi_part";
        }
        C6907h.m21524a("edit_video_length", (Map) m127032c().mo59973a("trimType", str).mo59973a(POIService.KEY_ORDER, String.valueOf(i + 1)).mo59973a("from_length", String.valueOf(i2)).mo59973a("to_length", String.valueOf(i3)).f60753a);
    }
}
