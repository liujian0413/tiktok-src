package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.beauty.C23531b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39377i;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41253ah;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41558k;
import com.p280ss.android.ugc.aweme.tools.C42150aq;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fl */
public final class C39892fl implements C42161ba {

    /* renamed from: a */
    public final VideoRecordNewActivity f103647a;

    /* renamed from: b */
    public final ASCameraView f103648b;

    /* renamed from: c */
    public final ShortVideoContext f103649c;

    /* renamed from: a */
    public static String m127645a(int i) {
        switch (i) {
            case 1:
                return "click";
            case 2:
                return "press";
            case 3:
                return "countdown";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public final String mo99309a() {
        switch (this.f103649c.f99719X) {
            case 0:
                return "click";
            case 1:
                return "press";
            case 8:
                return "video";
            case 10:
                return "video_15";
            case 11:
                return "video_60";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42150aq.class) {
            return null;
        }
        final C42159az a = awVar.mo103592a((C42161ba) this, type);
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                String str;
                String str2;
                String str3;
                Object obj2;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                long j;
                if (a != null) {
                    a.mo96096a(obj, t);
                }
                if (C39892fl.this.f103647a.f107286a.f99777m < C39892fl.this.f103647a.f107286a.f99767c) {
                    C42150aq aqVar = (C42150aq) t;
                    JSONObject n = C39892fl.this.f103647a.mo101854n();
                    String str9 = "prop_id";
                    try {
                        if (C39892fl.this.f103647a.f107324j.mo100301b() != null) {
                            j = C39892fl.this.f103647a.f107324j.mo100301b().getStickerId();
                        } else {
                            j = 0;
                        }
                        n.put(str9, j);
                    } catch (JSONException unused) {
                    }
                    C19282c.m63184a(C39892fl.this.f103647a, "record", "shoot_page", 0, 0, n);
                    boolean z = !C6399b.m19946v();
                    C22984d a = C22984d.m75611a().mo59973a("creation_id", C39892fl.this.f103649c.f99787w).mo59973a("enter_from", "video_shoot_page").mo59973a("content_type", C39892fl.this.f103649c.mo96148i().getContentType()).mo59973a("content_source", C39892fl.this.f103649c.mo96148i().getContentSource()).mo59973a("shoot_way", C39892fl.this.f103649c.f99788x).mo59970a("draft_id", C39892fl.this.f103649c.f99790z);
                    String str10 = "camera";
                    if (C39892fl.this.f103647a.f107327m.mo100087f() == 1) {
                        str = "front";
                    } else {
                        str = "back";
                    }
                    C22984d a2 = a.mo59973a(str10, str).mo59972a("speed", (Object) RecordingSpeed.fromValue((float) C39892fl.this.f103647a.f107316b)).mo59973a("filter_name", ((C39377i) C39892fl.this.f103647a.f107326l.mo74909j()).mo74906g().f77268c).mo59970a("filter_id", ((C39377i) C39892fl.this.f103647a.f107326l.mo74909j()).mo74906g().f77266a).mo59973a("record_mode", C39892fl.this.mo99309a()).mo59973a("record_type", C39892fl.m127645a(aqVar.f109677b));
                    String str11 = "prop_id";
                    if (C39892fl.this.f103647a.f107324j.mo100301b() == null) {
                        str2 = "";
                    } else {
                        str2 = String.valueOf(C39892fl.this.f103647a.f107324j.mo100301b().getStickerId());
                    }
                    C22984d a3 = a2.mo59973a(str11, str2);
                    String str12 = "prop_index";
                    if (C39892fl.this.f103647a.f107324j.mo100301b() == null) {
                        str3 = "";
                    } else {
                        str3 = C39892fl.this.f103647a.f107324j.mo100301b().getGradeKey();
                    }
                    C22984d a4 = a3.mo59973a(str12, str3);
                    if (C39892fl.this.f103647a.f107328n != null) {
                        ReactionWindowInfo b = C39892fl.this.f103647a.f107328n.mo100110b();
                        C39892fl.this.f103649c.f99705J.addReactionWindowInfo(b);
                        StringBuilder sb = new StringBuilder();
                        sb.append(b.getAngle());
                        C22984d a5 = a4.mo59970a("height", b.getHeight()).mo59970a("width", b.getWidth()).mo59973a("angle", sb.toString());
                        String str13 = "window_type";
                        if (b.getType() == 1) {
                            str8 = "round";
                        } else {
                            str8 = "square";
                        }
                        a5.mo59973a(str13, str8);
                    }
                    boolean z2 = false;
                    if (z) {
                        a4.mo59970a("smooth", C39892fl.this.f103647a.f107269J.mo96490a()).mo59970a("shape", C39892fl.this.f103647a.f107269J.mo96499b()).mo59970a("eyes", C39892fl.this.f103647a.f107269J.mo96504c()).mo59970a("tanning", 0);
                    } else {
                        a4.mo59970a("smooth", (int) (C36964i.m118916a(C39892fl.this.f103647a.f107269J.mo96490a()) * 100.0f)).mo59970a("eyes", (int) (C36964i.m118924b(C39892fl.this.f103647a.f107269J.mo96499b()) * 100.0f));
                    }
                    if (C35563c.f93231M.mo93305a(Property.EnableFilterIntensityJust)) {
                        float v = C39892fl.this.f103647a.mo101866v();
                        a4.mo59972a("filter_value", (Object) Float.valueOf(v));
                        C29296g g = ((C39377i) C39892fl.this.f103647a.f107326l.mo74909j()).mo74906g();
                        if (((double) Math.abs(g.f77275j - v)) < 0.01d || g.f77275j == -1.0f) {
                            z2 = true;
                        }
                        String str14 = "is_original_filter";
                        if (z2) {
                            str7 = "1";
                        } else {
                            str7 = "0";
                        }
                        a4.mo59973a(str14, str7);
                    }
                    a4.mo59973a("camera_type", C41558k.m132345b(C39892fl.this.f103648b.getCurrentCameraType()));
                    a4.mo59970a("camera_level", C35563c.f93230L.mo93343b(AVSettings.Property.RecordCameraCompatLevel));
                    String str15 = "countdown_type";
                    if (aqVar.f109676a == 0) {
                        obj2 = "";
                    } else {
                        obj2 = Integer.valueOf(aqVar.f109676a);
                    }
                    a4.mo59972a(str15, obj2);
                    if (C39892fl.this.f103649c.f99737aO != 0) {
                        String str16 = "picture_source";
                        if (C39892fl.this.f103649c.f99737aO == 1) {
                            str6 = "upload";
                        } else {
                            str6 = "shoot";
                        }
                        a4.mo59973a(str16, str6);
                    }
                    if (C39892fl.this.f103649c.f99779o) {
                        a4.mo59973a("action_type", "reshoot");
                    }
                    if (!TextUtils.isEmpty(C41253ah.m131873b())) {
                        a4.mo59973a("tutorial_item_id", C41253ah.m131873b());
                    }
                    C6907h.m21524a("record_video", (Map) a4.f60753a);
                    if (C39892fl.this.f103649c.f99737aO == 0) {
                        C39892fl.this.f103649c.f99738aP.add("");
                    } else {
                        ArrayList<String> arrayList = C39892fl.this.f103649c.f99738aP;
                        if (C39892fl.this.f103649c.f99737aO == 1) {
                            str5 = "upload";
                        } else {
                            str5 = "shoot";
                        }
                        arrayList.add(str5);
                    }
                    C23531b.m77287c();
                    if (C35574k.m114859a().mo70072F().mo83155c(C6399b.m19921a())) {
                        str4 = "on";
                    } else {
                        str4 = "off";
                    }
                    C6907h.m21524a("earphone_status", (Map) C22984d.m75611a().mo59973a("plugin_type", "record_video").mo59973a("to_status", str4).f60753a);
                }
            }
        };
    }

    public C39892fl(VideoRecordNewActivity videoRecordNewActivity, ASCameraView aSCameraView) {
        this.f103647a = videoRecordNewActivity;
        this.f103648b = aSCameraView;
        this.f103649c = ((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) videoRecordNewActivity).mo147a(ShortVideoContextViewModel.class)).f99791a;
    }
}
