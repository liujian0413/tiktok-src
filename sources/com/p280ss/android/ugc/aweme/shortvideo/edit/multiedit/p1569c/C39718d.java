package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1569c;

import android.util.Pair;
import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39701c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39702d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1568b.C39708a;
import com.p280ss.android.ugc.aweme.utils.C43021cp;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.VEEditor.SCALE_MODE;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.p280ss.android.vesdk.VEEditor.VEState;
import com.p280ss.android.vesdk.VERecordData;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.d */
public final class C39718d {

    /* renamed from: a */
    public C39708a f103245a;

    /* renamed from: b */
    private C15389d f103246b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.d$a */
    static final class C39719a implements C45329l {

        /* renamed from: a */
        final /* synthetic */ C39718d f103247a;

        C39719a(C39718d dVar) {
            this.f103247a = dVar;
        }

        public final void onCallback(int i, int i2, float f, String str) {
            if (i == 4101) {
                C39708a aVar = this.f103247a.f103245a;
                if (aVar != null) {
                    aVar.mo99082c();
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo99111a() {
        if (this.f103246b != null) {
            C15389d dVar = this.f103246b;
            if (dVar == null) {
                C7573i.m23580a();
            }
            if (dVar.mo38850h() == VEState.STARTED) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo99109a(MultiEditVideoRecordData multiEditVideoRecordData, VideoSegment videoSegment, Pair<Integer, Integer> pair, boolean z, boolean z2) {
        C7573i.m23587b(pair, "pair");
        if (multiEditVideoRecordData != null && videoSegment != null && !C6292i.m19525a(multiEditVideoRecordData.segmentDataList)) {
            m127102a(multiEditVideoRecordData, pair, !z && !z2);
        }
    }

    /* renamed from: a */
    public final void mo99110a(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        if (multiEditVideoRecordData != null && multiEditVideoRecordData2 != null) {
            Pair playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
            Integer num = (Integer) playInOutTime.first;
            Integer num2 = (Integer) playInOutTime.second;
            C15389d dVar = this.f103246b;
            if (dVar != null) {
                dVar.mo38873r();
            }
            C15389d dVar2 = this.f103246b;
            if (dVar2 != null) {
                dVar2.mo38775a(multiEditVideoRecordData2.convertData(), false);
            }
            m127103b(multiEditVideoRecordData);
            int intValue = num.intValue();
            C7573i.m23582a((Object) num2, "endTime");
            mo99106a(multiEditVideoRecordData, intValue, num2.intValue());
            C15389d dVar3 = this.f103246b;
            if (dVar3 != null) {
                dVar3.mo38832c(true);
            }
            m127104e();
            C15389d dVar4 = this.f103246b;
            if (dVar4 != null) {
                dVar4.mo38868p();
            }
            m127105f();
            C15389d dVar5 = this.f103246b;
            if (dVar5 != null) {
                dVar5.mo38812b(num.intValue(), num2.intValue());
            }
            C15389d dVar6 = this.f103246b;
            if (dVar6 != null) {
                dVar6.mo38880w();
            }
            mo99102a((long) num.intValue(), SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    /* renamed from: c */
    public final void mo99113c() {
        C15389d dVar = this.f103246b;
        if (dVar != null) {
            dVar.mo38879v();
        }
        C39708a aVar = this.f103245a;
        if (aVar != null) {
            aVar.mo99080a();
        }
    }

    /* renamed from: d */
    public final void mo99114d() {
        C15389d dVar = this.f103246b;
        if (dVar != null) {
            dVar.mo38880w();
        }
        C39708a aVar = this.f103245a;
        if (aVar != null) {
            aVar.mo99081b();
        }
    }

    /* renamed from: b */
    public final long mo99112b() {
        if (this.f103246b == null) {
            return 0;
        }
        C15389d dVar = this.f103246b;
        if (dVar == null) {
            C7573i.m23580a();
        }
        return (long) dVar.mo38862m();
    }

    /* renamed from: e */
    private final void m127104e() {
        C15389d dVar = this.f103246b;
        if (dVar != null) {
            dVar.mo38773a(SCALE_MODE.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
        }
        if (C39701c.f103207a.mo99072k()) {
            C15389d dVar2 = this.f103246b;
            if (dVar2 != null) {
                dVar2.mo38830c(C39701c.m127051e(), C39701c.m127052f());
            }
        }
    }

    /* renamed from: f */
    private final void m127105f() {
        if (C39701c.f103207a.mo99073l()) {
            C15389d dVar = this.f103246b;
            if (dVar != null) {
                dVar.mo38798a(C39701c.m127044a(), C39701c.m127047b(), C39701c.m127049c(), C39701c.m127050d());
            }
        }
    }

    /* renamed from: a */
    public final void mo99103a(C15389d dVar) {
        this.f103246b = dVar;
        if (dVar != null) {
            dVar.mo38824b((C45329l) new C39719a(this));
        }
    }

    /* renamed from: b */
    private final void m127103b(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            if (!C7276d.m22812b(multiEditVideoRecordData.musicPath)) {
                C15389d dVar = this.f103246b;
                if (dVar != null) {
                    dVar.mo38803a(0, 0, multiEditVideoRecordData.originVolume);
                    return;
                }
                return;
            }
            multiEditVideoRecordData.musicDuration = C43021cp.m136536a(multiEditVideoRecordData.musicPath, true);
            C15389d dVar2 = this.f103246b;
            if (dVar2 != null) {
                String str = multiEditVideoRecordData.musicPath;
                C7573i.m23582a((Object) str, "recordData.musicPath");
                int a = dVar2.mo38783a(str, multiEditVideoRecordData.musicTrimIn, multiEditVideoRecordData.musicDuration, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
                C15389d dVar3 = this.f103246b;
                if (dVar3 != null) {
                    dVar3.mo38803a(a, 1, multiEditVideoRecordData.musicVolume);
                }
                if (a > 0) {
                    C15389d dVar4 = this.f103246b;
                    if (dVar4 != null) {
                        dVar4.mo38803a(0, 0, multiEditVideoRecordData.originVolume);
                    }
                }
                multiEditVideoRecordData.musicIndex = a;
            }
        }
    }

    /* renamed from: a */
    public final void mo99104a(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            C15389d dVar = this.f103246b;
            if (dVar != null) {
                dVar.mo38873r();
            }
            VERecordData convertData = multiEditVideoRecordData.convertData();
            Pair playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
            convertData.mo108048a(((long) ((Integer) playInOutTime.first).intValue()) * 1000, ((long) ((Integer) playInOutTime.second).intValue()) * 1000);
            C15389d dVar2 = this.f103246b;
            if (dVar2 != null) {
                dVar2.mo38775a(convertData, false);
            }
            m127103b(multiEditVideoRecordData);
            C15389d dVar3 = this.f103246b;
            if (dVar3 != null) {
                dVar3.mo38832c(true);
            }
            m127104e();
            C15389d dVar4 = this.f103246b;
            if (dVar4 != null) {
                dVar4.mo38868p();
            }
            m127105f();
            C15389d dVar5 = this.f103246b;
            if (dVar5 != null) {
                dVar5.mo38763a(0, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
            }
        }
    }

    /* renamed from: a */
    public final void mo99102a(long j, SEEK_MODE seek_mode) {
        C7573i.m23587b(seek_mode, "seekMode");
        C15389d dVar = this.f103246b;
        if (dVar != null) {
            dVar.mo38763a((int) j, seek_mode);
        }
    }

    /* renamed from: a */
    public final void mo99105a(MultiEditVideoRecordData multiEditVideoRecordData, int i) {
        if (multiEditVideoRecordData != null) {
            C15389d dVar = this.f103246b;
            if (dVar != null) {
                dVar.mo38873r();
            }
            VERecordData convertData = multiEditVideoRecordData.convertData();
            C15389d dVar2 = this.f103246b;
            if (dVar2 != null) {
                dVar2.mo38775a(convertData, false);
            }
            m127103b(multiEditVideoRecordData);
            C15389d dVar3 = this.f103246b;
            if (dVar3 != null) {
                dVar3.mo38832c(true);
            }
            m127104e();
            C15389d dVar4 = this.f103246b;
            if (dVar4 != null) {
                dVar4.mo38868p();
            }
            m127105f();
            C15389d dVar5 = this.f103246b;
            if (dVar5 != null) {
                dVar5.mo38763a(i, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
            }
        }
    }

    /* renamed from: a */
    private final void m127102a(MultiEditVideoRecordData multiEditVideoRecordData, Pair<Integer, Integer> pair, boolean z) {
        if (multiEditVideoRecordData != null) {
            C15389d dVar = this.f103246b;
            if (dVar != null) {
                dVar.mo38873r();
            }
            VERecordData convertData = multiEditVideoRecordData.convertData();
            Integer num = (Integer) pair.first;
            Integer num2 = (Integer) pair.second;
            if (!z) {
                convertData.mo108048a(((long) num.intValue()) * 1000, ((long) num2.intValue()) * 1000);
            }
            C15389d dVar2 = this.f103246b;
            if (dVar2 != null) {
                dVar2.mo38775a(convertData, false);
            }
            m127103b(multiEditVideoRecordData);
            C15389d dVar3 = this.f103246b;
            if (dVar3 != null) {
                dVar3.mo38832c(true);
            }
            m127104e();
            C15389d dVar4 = this.f103246b;
            if (dVar4 != null) {
                dVar4.mo38868p();
            }
            m127105f();
            if (z) {
                C15389d dVar5 = this.f103246b;
                if (dVar5 != null) {
                    C7573i.m23582a((Object) num, "startTime");
                    int intValue = num.intValue();
                    C7573i.m23582a((Object) num2, "endTime");
                    dVar5.mo38812b(intValue, num2.intValue());
                }
                C15389d dVar6 = this.f103246b;
                if (dVar6 != null) {
                    C7573i.m23582a((Object) num, "startTime");
                    dVar6.mo38763a(num.intValue(), SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                }
            } else {
                C15389d dVar7 = this.f103246b;
                if (dVar7 != null) {
                    dVar7.mo38763a(0, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo99106a(MultiEditVideoRecordData multiEditVideoRecordData, int i, int i2) {
        if (multiEditVideoRecordData != null && multiEditVideoRecordData.musicIndex != -1) {
            int i3 = i2 - i;
            if (i3 > multiEditVideoRecordData.musicDuration) {
                i3 = multiEditVideoRecordData.musicDuration;
            }
            C15389d dVar = this.f103246b;
            if (dVar != null) {
                dVar.mo38753a(multiEditVideoRecordData.musicIndex, multiEditVideoRecordData.musicTrimIn, multiEditVideoRecordData.musicTrimIn + i3, i, i + i3, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
            }
        }
    }

    /* renamed from: a */
    public final void mo99107a(MultiEditVideoRecordData multiEditVideoRecordData, int i, int i2, int i3) {
        if (multiEditVideoRecordData != null && multiEditVideoRecordData.musicIndex != -1) {
            int i4 = i + multiEditVideoRecordData.musicTrimIn;
            if (i4 > multiEditVideoRecordData.musicDuration) {
                i4 %= multiEditVideoRecordData.musicDuration;
            }
            int i5 = i4;
            C15389d dVar = this.f103246b;
            if (dVar != null) {
                dVar.mo38753a(multiEditVideoRecordData.musicIndex, i5, i5 + i3, i2, i2 + i3, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
            }
        }
    }

    /* renamed from: a */
    public final void mo99108a(MultiEditVideoRecordData multiEditVideoRecordData, VideoSegment videoSegment, int i, int i2) {
        if (videoSegment != null && multiEditVideoRecordData != null && !C6292i.m19525a(multiEditVideoRecordData.segmentDataList)) {
            MultiEditVideoRecordData a = C39702d.m127059a(multiEditVideoRecordData, (MultiEditVideoRecordData) null);
            a.resetTimeData();
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) a.segmentDataList.get(i);
            a.segmentDataList.clear();
            a.segmentDataList.add(multiEditVideoSegmentRecordData);
            long i3 = videoSegment.mo96910i() - videoSegment.mo96909h();
            C15389d dVar = this.f103246b;
            if (dVar != null) {
                dVar.mo38873r();
            }
            C15389d dVar2 = this.f103246b;
            if (dVar2 != null) {
                dVar2.mo38775a(a.convertData(), false);
            }
            if (multiEditVideoRecordData.isPlaySingleSegmentMusic()) {
                m127103b(multiEditVideoRecordData);
                mo99107a(multiEditVideoRecordData, i2, 0, (int) i3);
            }
            C15389d dVar3 = this.f103246b;
            if (dVar3 != null) {
                dVar3.mo38832c(true);
            }
            m127104e();
            C15389d dVar4 = this.f103246b;
            if (dVar4 != null) {
                dVar4.mo38868p();
            }
            m127105f();
            C15389d dVar5 = this.f103246b;
            if (dVar5 != null) {
                dVar5.mo38812b((int) videoSegment.mo96909h(), (int) videoSegment.mo96910i());
            }
            C15389d dVar6 = this.f103246b;
            if (dVar6 != null) {
                dVar6.mo38763a((int) videoSegment.mo96909h(), SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
            }
        }
    }
}
