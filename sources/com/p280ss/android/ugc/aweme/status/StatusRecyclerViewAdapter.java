package com.p280ss.android.ugc.aweme.status;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.status.p1632b.C41809a;
import com.p280ss.android.ugc.aweme.status.viewholder.CreateStatusViewHolder;
import com.p280ss.android.ugc.aweme.status.viewholder.StatusViewHolder;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.status.StatusRecyclerViewAdapter */
public final class StatusRecyclerViewAdapter extends C1262a<C1293v> {

    /* renamed from: l */
    public static final C41779a f108689l = new C41779a(null);

    /* renamed from: a */
    public LayoutInflater f108690a;

    /* renamed from: b */
    public ArrayList<C41809a> f108691b = new ArrayList<>();

    /* renamed from: c */
    public RecordStatusViewModel f108692c;

    /* renamed from: d */
    public CategoryPageModel f108693d;

    /* renamed from: e */
    public ArrayList<StatusViewHolder> f108694e = new ArrayList<>();

    /* renamed from: f */
    public boolean f108695f;

    /* renamed from: g */
    public boolean f108696g;

    /* renamed from: h */
    public FragmentActivity f108697h;

    /* renamed from: i */
    public String f108698i;

    /* renamed from: j */
    public int f108699j;

    /* renamed from: k */
    public String f108700k;

    /* renamed from: com.ss.android.ugc.aweme.status.StatusRecyclerViewAdapter$a */
    public static final class C41779a {
        private C41779a() {
        }

        public /* synthetic */ C41779a(C7571f fVar) {
            this();
        }
    }

    public final int getItemCount() {
        return this.f108691b.size();
    }

    public final int getItemViewType(int i) {
        return ((C41809a) this.f108691b.get(i)).f108753b;
    }

    public final void onViewAttachedToWindow(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof StatusViewHolder) {
            StatusViewHolder statusViewHolder = (StatusViewHolder) vVar;
            if (statusViewHolder.f108825c != null && this.f108696g) {
                C0052o o = this.f108692c.mo102544o();
                C41809a aVar = statusViewHolder.f108825c;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                o.setValue(aVar.f108754c.getEffectId());
            }
        }
    }

    /* renamed from: a */
    public static String[] m132995a(Effect effect) {
        String str;
        C7573i.m23587b(effect, "effect");
        String str2 = "";
        String str3 = "";
        try {
            JSONObject jSONObject = new JSONObject(effect.getExtra());
            str = jSONObject.optString("status_template_cover_picture", "");
            C7573i.m23582a((Object) str, "jsonObject.optString(\"st…plate_cover_picture\", \"\")");
            try {
                String optString = jSONObject.optString("status_template_cover_video", "");
                C7573i.m23582a((Object) optString, "jsonObject.optString(\"st…emplate_cover_video\", \"\")");
                return new String[]{str, optString};
            } catch (Exception unused) {
                return new String[]{str, str3};
            } catch (Throwable unused2) {
                return new String[]{str, str3};
            }
        } catch (Exception unused3) {
            str = str2;
            return new String[]{str, str3};
        } catch (Throwable unused4) {
            str = str2;
            return new String[]{str, str3};
        }
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "vh");
        if (!(vVar instanceof CreateStatusViewHolder) && (vVar instanceof StatusViewHolder)) {
            StatusViewHolder statusViewHolder = (StatusViewHolder) vVar;
            Object obj = this.f108691b.get(i);
            C7573i.m23582a(obj, "effectList.get(position)");
            statusViewHolder.mo102602a((C41809a) obj);
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "vg");
        if (i != 1) {
            View inflate = this.f108690a.inflate(R.layout.a3b, null);
            RecordStatusViewModel recordStatusViewModel = this.f108692c;
            C7573i.m23582a((Object) inflate, "view");
            C1293v statusViewHolder = new StatusViewHolder(recordStatusViewModel, inflate, this.f108697h, this.f108699j);
            this.f108694e.add(statusViewHolder);
            return statusViewHolder;
        }
        View inflate2 = this.f108690a.inflate(R.layout.a3a, null);
        C7573i.m23582a((Object) inflate2, "view");
        RecordStatusViewModel recordStatusViewModel2 = this.f108692c;
        FragmentActivity fragmentActivity = this.f108697h;
        Object obj = this.f108691b.get(0);
        C7573i.m23582a(obj, "effectList.get(0)");
        return new CreateStatusViewHolder(inflate2, recordStatusViewModel2, fragmentActivity, (C41809a) obj);
    }

    public StatusRecyclerViewAdapter(FragmentActivity fragmentActivity, String str, int i, String str2) {
        C7573i.m23587b(fragmentActivity, "context");
        C7573i.m23587b(str, "category");
        C7573i.m23587b(str2, "tabName");
        this.f108697h = fragmentActivity;
        this.f108698i = str;
        this.f108699j = i;
        this.f108700k = str2;
        FragmentActivity fragmentActivity2 = this.f108697h;
        if (fragmentActivity2 != null) {
            LayoutInflater from = LayoutInflater.from(fragmentActivity2);
            C7573i.m23582a((Object) from, "LayoutInflater.from(context as Context)");
            this.f108690a = from;
            C0063u a = C0069x.m159a(this.f108697h).mo147a(RecordStatusViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(co…tusViewModel::class.java)");
            this.f108692c = (RecordStatusViewModel) a;
            this.f108695f = C35563c.f93231M.mo93305a(Property.EnableRecordStatusRandomAll);
            this.f108692c.mo102533d().observe(this.f108697h, new C0053p<CategoryPageModel>(this) {

                /* renamed from: a */
                final /* synthetic */ StatusRecyclerViewAdapter f108701a;

                {
                    this.f108701a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(CategoryPageModel categoryPageModel) {
                    String str;
                    if (categoryPageModel != null && categoryPageModel.category_effects != null) {
                        CategoryEffectModel categoryEffectModel = categoryPageModel.category_effects;
                        C7573i.m23582a((Object) categoryEffectModel, "it.categoryEffects");
                        if (categoryEffectModel.effects != null) {
                            CategoryEffectModel categoryEffectModel2 = categoryPageModel.category_effects;
                            C7573i.m23582a((Object) categoryEffectModel2, "it.categoryEffects");
                            if (C7573i.m23585a((Object) categoryEffectModel2.category_key, (Object) this.f108701a.f108698i)) {
                                this.f108701a.f108693d = categoryPageModel;
                                this.f108701a.f108691b.clear();
                                CategoryEffectModel categoryEffectModel3 = categoryPageModel.category_effects;
                                C7573i.m23582a((Object) categoryEffectModel3, "it.categoryEffects");
                                List<Effect> list = categoryEffectModel3.effects;
                                int size = list.size();
                                for (int i = 0; i < size; i++) {
                                    Effect effect = (Effect) list.get(i);
                                    C7573i.m23582a((Object) effect, "effect");
                                    String[] a = StatusRecyclerViewAdapter.m132995a(effect);
                                    CategoryPageModel categoryPageModel2 = this.f108701a.f108693d;
                                    if (categoryPageModel2 != null) {
                                        List<String> list2 = categoryPageModel2.url_prefix;
                                        if (list2 != null) {
                                            str = (String) list2.get(0);
                                            ArrayList<C41809a> arrayList = this.f108701a.f108691b;
                                            C41809a aVar = new C41809a(2, effect, C7573i.m23577a(str, (Object) a[0]), C7573i.m23577a(str, (Object) a[1]), a[1]);
                                            arrayList.add(aVar);
                                        }
                                    }
                                    str = null;
                                    ArrayList<C41809a> arrayList2 = this.f108701a.f108691b;
                                    C41809a aVar2 = new C41809a(2, effect, C7573i.m23577a(str, (Object) a[0]), C7573i.m23577a(str, (Object) a[1]), a[1]);
                                    arrayList2.add(aVar2);
                                }
                                if (C7573i.m23585a((Object) this.f108701a.f108698i, (Object) "all") && this.f108701a.f108691b.size() > 0) {
                                    if (this.f108701a.f108695f) {
                                        Collections.shuffle(this.f108701a.f108691b);
                                    }
                                    Object obj = this.f108701a.f108691b.get(0);
                                    C7573i.m23582a(obj, "effectList.get(0)");
                                    C41809a aVar3 = (C41809a) obj;
                                    ArrayList<C41809a> arrayList3 = this.f108701a.f108691b;
                                    C41809a aVar4 = new C41809a(1, aVar3.f108754c, aVar3.f108755d, aVar3.f108756e, aVar3.f108757f);
                                    arrayList3.add(0, aVar4);
                                }
                                this.f108701a.notifyDataSetChanged();
                            }
                        }
                    }
                }
            });
            this.f108692c.mo102546q().observe(this.f108697h, new C0053p<String>(this) {

                /* renamed from: a */
                final /* synthetic */ StatusRecyclerViewAdapter f108702a;

                {
                    this.f108702a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(String str) {
                    Effect effect;
                    if (str != null) {
                        if (C7573i.m23585a((Object) this.f108702a.f108700k, (Object) str)) {
                            this.f108702a.f108696g = true;
                            for (StatusViewHolder statusViewHolder : this.f108702a.f108694e) {
                                C41809a aVar = statusViewHolder.f108825c;
                                if (aVar == null || aVar.f108753b != 1) {
                                    C0052o o = this.f108702a.f108692c.mo102544o();
                                    C41809a aVar2 = statusViewHolder.f108825c;
                                    if (aVar2 != null) {
                                        effect = aVar2.f108754c;
                                    } else {
                                        effect = null;
                                    }
                                    if (effect == null) {
                                        C7573i.m23580a();
                                    }
                                    o.setValue(effect.getEffectId());
                                }
                            }
                        } else {
                            this.f108702a.f108696g = false;
                        }
                    }
                }
            });
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
    }
}
