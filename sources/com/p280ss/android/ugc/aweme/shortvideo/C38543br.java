package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.LogPbBean;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35584s.C35585a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35584s.C35586b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35584s.C35587c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35584s.C35588d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35584s.C35589e;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.p280ss.android.ugc.aweme.shortvideo.p1579j.C40017a;
import com.p280ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.p280ss.android.ugc.aweme.video.hashtag.C43226a;
import com.p280ss.android.ugc.aweme.video.hashtag.C43228b;
import com.p280ss.android.ugc.aweme.video.hashtag.C43230c;
import com.p280ss.android.ugc.aweme.video.hashtag.C43231d;
import com.p280ss.android.ugc.aweme.video.hashtag.C43232e;
import com.p280ss.android.ugc.aweme.video.hashtag.HashTagListAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.br */
public final class C38543br implements C25675c<AVChallenge>, C35588d, C43232e {

    /* renamed from: a */
    public static String f100166a = "video_challenge";

    /* renamed from: b */
    public static String f100167b = "photo_publish";

    /* renamed from: c */
    public String f100168c;

    /* renamed from: d */
    public boolean f100169d;

    /* renamed from: e */
    public HashTagListAdapter f100170e;

    /* renamed from: f */
    private RecyclerView f100171f;

    /* renamed from: g */
    private ViewGroup f100172g;

    /* renamed from: h */
    private DmtStatusView f100173h;

    /* renamed from: i */
    private C39955gf f100174i;

    /* renamed from: j */
    private C35587c f100175j;

    /* renamed from: k */
    private C35586b f100176k;

    /* renamed from: l */
    private C35585a f100177l;

    /* renamed from: m */
    private ArrayList<C43228b> f100178m = new ArrayList<>();

    /* renamed from: n */
    private String f100179n = f100166a;

    /* renamed from: o */
    private C35589e f100180o;

    /* renamed from: S_ */
    public final void mo59098S_() {
    }

    public final void aD_() {
    }

    public final void aE_() {
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
    }

    /* renamed from: b */
    public final void mo59108b(List<AVChallenge> list, boolean z) {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<AVChallenge> list, boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96527a(View view) {
        mo96529a(this.f100168c.substring(this.f100168c.lastIndexOf(35) + 1, this.f100168c.length()));
    }

    /* renamed from: a */
    public final void mo96529a(String str) {
        if (!C35563c.f93260w.mo57088a()) {
            this.f100172g.setVisibility(0);
            if (TextUtils.isEmpty(str)) {
                this.f100177l.mo83257a(Integer.valueOf(1));
                return;
            }
            this.f100176k.mo83256a(str, this.f100179n);
        }
    }

    /* renamed from: a */
    public final void mo90396a(AVSearchChallengeList aVSearchChallengeList) {
        List<C39321d> list;
        if (aVSearchChallengeList != null) {
            m123193a(aVSearchChallengeList.keyword, aVSearchChallengeList.logPb);
        }
        if (aVSearchChallengeList == null) {
            list = null;
        } else {
            list = aVSearchChallengeList.items;
        }
        this.f100178m.clear();
        if (C6311g.m19573a(list) || (aVSearchChallengeList.isDisabled && !C6399b.m19944t())) {
            this.f100173h.setVisibility(0);
            this.f100171f.setVisibility(8);
            this.f100173h.mo25943g();
        } else {
            this.f100170e.mo104954a(aVSearchChallengeList.keyword, aVSearchChallengeList.logPb);
            for (C39321d dVar : list) {
                C43228b bVar = new C43228b();
                bVar.f111901b = 2;
                bVar.f111905f = "search";
                bVar.f111900a = dVar.f102138a;
                this.f100178m.add(bVar);
            }
            this.f100173h.mo25939d();
            this.f100173h.setVisibility(8);
            this.f100171f.setVisibility(0);
        }
        this.f100170e.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo96528a(AVChallenge aVChallenge) {
        mo96530f();
        this.f100169d = false;
        HashTagMentionEditText hashTagMentionEditText = this.f100174i.f103766b;
        int selectionStart = hashTagMentionEditText.getSelectionStart();
        String substring = hashTagMentionEditText.getText().toString().substring(0, selectionStart);
        if (C43230c.m137141b(substring, C6399b.m19944t()) || substring.endsWith("#")) {
            C43226a a = C43230c.m137136a(substring, aVChallenge.getChallengeName());
            hashTagMentionEditText.getText().replace(substring.lastIndexOf("#"), selectionStart, a.f111899c);
            hashTagMentionEditText.mo102272a(true);
            String trim = a.f111899c.trim();
            if (!C43230c.m137141b(trim, C6399b.m19944t())) {
                hashTagMentionEditText.f112357j.add(trim);
            }
        }
    }

    /* renamed from: a */
    private static void m123196a(List<C43228b> list, List<AVChallenge> list2, List<C38504b> list3) {
        HashSet hashSet = new HashSet();
        if (list3 != null) {
            for (C38504b bVar : list3) {
                hashSet.add(bVar.f100104c.challengeName);
            }
        }
        for (AVChallenge aVChallenge : list2) {
            C43228b bVar2 = new C43228b();
            bVar2.f111901b = 2;
            bVar2.f111905f = "history";
            bVar2.f111900a = aVChallenge;
            bVar2.f111902c = R.drawable.ask;
            bVar2.f111903d = true;
            if (!hashSet.contains(aVChallenge.getChallengeName())) {
                list.add(bVar2);
            }
        }
    }

    public final void ae_() {
        m123194a(null);
    }

    /* renamed from: h */
    private void m123199h() {
        final HashTagMentionEditText hashTagMentionEditText = this.f100174i.f103766b;
        hashTagMentionEditText.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
                if (!C38543br.this.f100169d) {
                    C38543br.this.mo96530f();
                } else if (C38543br.this.f100168c.endsWith("#")) {
                    C38543br.this.mo96529a("");
                } else {
                    C38543br.this.mo96529a(C38543br.this.f100168c.substring(C38543br.this.f100168c.lastIndexOf(35) + 1, C38543br.this.f100168c.length()));
                }
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (i3 <= 0) {
                    ArrayList starAtlasExtraList = hashTagMentionEditText.getStarAtlasExtraList();
                    if (starAtlasExtraList != null) {
                        Iterator it = starAtlasExtraList.iterator();
                        while (it.hasNext()) {
                            if (i == ((TextExtraStruct) it.next()).getEnd() && hashTagMentionEditText.getText() != null) {
                                hashTagMentionEditText.getText().insert(i, " ");
                            }
                        }
                    }
                }
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Editable text = hashTagMentionEditText.getText();
                if (text != null) {
                    C38543br.this.f100168c = text.toString();
                } else {
                    C38543br.this.f100168c = "";
                }
                if (C43230c.m137141b(C38543br.this.f100168c, C6399b.m19944t())) {
                    C38543br.this.f100169d = true;
                } else if (C38543br.this.f100168c.endsWith("#")) {
                    C38543br.this.f100169d = true;
                    C38543br.m123190a(i3);
                } else {
                    if (C38543br.this.f100169d && !C38543br.this.f100168c.isEmpty() && C38543br.this.f100170e != null) {
                        C38543br.this.f100170e.mo104952a();
                    }
                    C38543br.this.f100169d = false;
                    C38543br.this.mo96530f();
                }
                ArrayList starAtlasExtraList = hashTagMentionEditText.getStarAtlasExtraList();
                if (starAtlasExtraList != null) {
                    Iterator it = starAtlasExtraList.iterator();
                    while (it.hasNext()) {
                        if (i == ((TextExtraStruct) it.next()).getEnd() && hashTagMentionEditText.getText() != null) {
                            C38543br.this.f100169d = false;
                        }
                    }
                }
            }
        });
    }

    /* renamed from: g */
    private void m123198g() {
        this.f100177l = C35563c.f93241d.mo83160a((C25675c<AVChallenge>) this);
        this.f100176k = C35563c.f93241d.mo83161a((C35588d) this);
    }

    /* renamed from: e */
    public final void mo90398e() {
        this.f100173h.setVisibility(0);
        this.f100171f.setVisibility(8);
        this.f100173h.mo25942f();
    }

    /* renamed from: f */
    public final void mo96530f() {
        this.f100172g.setVisibility(8);
        this.f100178m.clear();
        this.f100170e.notifyDataSetChanged();
    }

    /* renamed from: b */
    private void m123197b(Fragment fragment) {
        this.f100175j = C35563c.f93241d.mo83162a(fragment);
        this.f100175j.mo83168a(this.f100180o);
    }

    /* renamed from: a */
    public static void m123190a(int i) {
        String str;
        if (i == 0) {
            str = "clear_to_sharp";
        } else {
            str = "input_sharp";
        }
        new C40017a().mo99455a(str).mo99456a();
    }

    /* renamed from: d */
    public final void mo90397d(Exception exc) {
        this.f100173h.setVisibility(0);
        this.f100171f.setVisibility(8);
        this.f100173h.mo25944h();
    }

    /* renamed from: a */
    private void m123192a(Fragment fragment) {
        m123191a(fragment.getContext());
        m123198g();
        this.f100174i.mo99377a();
        m123199h();
        m123197b(fragment);
    }

    /* renamed from: a */
    private void m123191a(Context context) {
        if (this.f100171f != null) {
            this.f100170e = new HashTagListAdapter(context, this.f100178m, this);
            this.f100171f.setLayoutManager(new LinearLayoutManager(context));
            this.f100171f.setAdapter(this.f100170e);
        }
        if (this.f100173h != null) {
            DmtDefaultView dmtDefaultView = new DmtDefaultView(context);
            dmtDefaultView.setStatus(new C10806a(context).mo25993c(R.string.cjm).f29135a);
            dmtDefaultView.setOnClickListener(new C38545bs(this));
            this.f100173h.setBuilder(C10803a.m31631a(context).mo25954a((int) R.string.cmt).mo25966c((View) dmtDefaultView));
        }
    }

    /* renamed from: a */
    private void m123194a(List<AVChallenge> list) {
        m123193a("", (LogPbBean) null);
        List a = m123189a(list, this.f100175j.mo83167a());
        if (a.isEmpty()) {
            this.f100173h.setVisibility(0);
            this.f100171f.setVisibility(8);
            this.f100173h.mo25943g();
            return;
        }
        this.f100173h.setVisibility(8);
        this.f100171f.setVisibility(0);
        this.f100178m.clear();
        this.f100178m.addAll(a);
        this.f100170e.f111887c = true;
        this.f100170e.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo59099a(List<AVChallenge> list, boolean z) {
        m123194a(list);
    }

    /* renamed from: a */
    public static C38543br m123188a(C39955gf gfVar, View view) {
        return new C38543br(gfVar, view);
    }

    private C38543br(C39955gf gfVar, View view) {
        this.f100174i = gfVar;
        this.f100171f = (RecyclerView) view.findViewById(R.id.au3);
        this.f100172g = (ViewGroup) view.findViewById(R.id.au7);
        this.f100173h = (DmtStatusView) view.findViewById(R.id.dav);
    }

    /* renamed from: a */
    private List<C43228b> m123189a(List<AVChallenge> list, C38553c cVar) {
        boolean z;
        boolean z2;
        List<? extends C38504b> list2;
        LinkedList linkedList = new LinkedList();
        if (cVar != null) {
            list2 = cVar.f100195a;
            z2 = cVar.f100196b;
            z = cVar.f100197c;
        } else {
            list2 = null;
            z = false;
            z2 = true;
        }
        if (list != null && z2) {
            m123196a(linkedList, list, list2);
        }
        m123195a((List<C43228b>) linkedList, list2);
        int i = 20;
        if (list2 != null && !list2.isEmpty() && !z) {
            i = ((C38504b) list2.get(list2.size() - 1)).f100103b + 1;
        }
        if (i <= linkedList.size() - 1) {
            return linkedList.subList(0, i);
        }
        return linkedList;
    }

    /* renamed from: a */
    private static void m123193a(String str, LogPbBean logPbBean) {
        String str2;
        String str3 = "search_tag";
        C6909j jVar = new C6909j();
        String str4 = "search_keyword";
        if (str == null) {
            str = "";
        }
        C6909j a = jVar.mo16966a(str4, str);
        String str5 = "log_pb";
        if (logPbBean == null) {
            str2 = "";
        } else {
            str2 = C35563c.f93239b.mo15979b((Object) logPbBean);
        }
        C6907h.m21528b(str3, a.mo16966a(str5, str2).mo16967a());
    }

    /* renamed from: a */
    private static void m123195a(List<C43228b> list, List<C38504b> list2) {
        if (list2 != null) {
            for (C38504b bVar : list2) {
                C43228b bVar2 = new C43228b();
                bVar2.f111901b = 2;
                if (bVar.f100102a == 0) {
                    bVar2.f111905f = "recommendation";
                } else {
                    bVar2.f111905f = "commercial";
                }
                bVar2.f111900a = bVar.f100104c;
                bVar2.f111902c = C43231d.m137143a(bVar.f100102a);
                bVar2.f111904e = bVar.f100105d;
                if (bVar.f100103b > list.size()) {
                    list.add(bVar2);
                } else if (bVar.f100103b < 0) {
                    list.add(0, bVar2);
                } else {
                    list.add(bVar.f100103b, bVar2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo96526a(Fragment fragment, boolean z, String str, C35589e eVar) {
        this.f100179n = str;
        this.f100180o = eVar;
        m123192a(fragment);
    }
}
