package com.p280ss.android.ugc.aweme.friends.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.activity.C23267h;
import com.p280ss.android.ugc.aweme.base.widget.HeaderHolder;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.LoadMoreViewHolder;
import com.p280ss.android.ugc.aweme.familiar.p966b.C21718a;
import com.p280ss.android.ugc.aweme.friends.C29998a;
import com.p280ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder.C30016a;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.friends.p1285ui.C30151ab;
import com.p280ss.android.ugc.aweme.friends.p1285ui.C30179z;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendContactItemView;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendContactViewHolder;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendFriendItemViewV2Holder;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendFriendsTitleHolder;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7563m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.RecommendListAdapter */
public class RecommendListAdapter extends BaseAdapter<User> {

    /* renamed from: k */
    private static final String f78949k = "com.ss.android.ugc.aweme.friends.adapter.RecommendListAdapter";

    /* renamed from: A */
    private final boolean f78950A;

    /* renamed from: B */
    private HashMap<String, Boolean> f78951B = new HashMap<>();

    /* renamed from: C */
    private boolean f78952C = false;

    /* renamed from: a */
    public View f78953a;

    /* renamed from: b */
    public View f78954b;

    /* renamed from: c */
    public int f78955c = 0;

    /* renamed from: d */
    public int f78956d = -1;

    /* renamed from: e */
    public boolean f78957e;

    /* renamed from: f */
    public C30016a f78958f;

    /* renamed from: g */
    public C23267h<User> f78959g;

    /* renamed from: h */
    public String f78960h = "find_friends";

    /* renamed from: i */
    public String f78961i;

    /* renamed from: j */
    public String f78962j;

    /* renamed from: w */
    private Set<Integer> f78963w = new HashSet();

    /* renamed from: x */
    private Context f78964x;

    /* renamed from: y */
    private List<User> f78965y = Collections.emptyList();

    /* renamed from: z */
    private int f78966z = 0;

    /* renamed from: j */
    private int m98448j() {
        return m98449k() + 1;
    }

    /* renamed from: f */
    private int m98446f() {
        return m98449k() + 1 + this.f78966z + 1;
    }

    /* renamed from: k */
    private int m98449k() {
        if (this.f78965y.isEmpty()) {
            return 0;
        }
        return Math.min(this.f78965y.size(), 3) + 1;
    }

    /* renamed from: c */
    public final int mo60557c() {
        int i;
        if (this.f78953a != null) {
            i = 1;
        } else {
            i = 0;
        }
        int c = super.mo60557c() + Math.min(this.f78965y.size(), 3);
        if (c > 0) {
            int i2 = i + 1;
            if (this.f78966z > 0) {
                i2++;
            }
            if (!this.f78965y.isEmpty()) {
                i++;
            }
        }
        return c + i;
    }

    /* renamed from: c */
    public final void mo76234c(View view) {
        this.f78953a = view;
        notifyItemInserted(0);
    }

    /* renamed from: e */
    public final void mo76236e(List<User> list) {
        mo61577b(m98447f(list));
    }

    /* renamed from: e */
    private int m98445e(int i) {
        if (this.f78966z <= 0 || i <= this.f78966z + 2) {
            return i - 2;
        }
        return i - 3;
    }

    /* renamed from: d */
    public final void mo76235d(View view) {
        this.f78954b = view;
        notifyItemInserted(getItemCount() - 1);
    }

    /* renamed from: b */
    private boolean m98443b(int i) {
        int i2;
        if (this.f67539l == null) {
            i2 = 0;
        } else {
            i2 = this.f67539l.size();
        }
        if (i < 0 || i >= i2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private int m98442b(User user) {
        int i;
        int k = m98449k();
        if (this.f78966z <= 0) {
            i = 0;
        } else {
            i = this.f78966z + 1;
        }
        int a = C29998a.m98352a(this.f67539l, user);
        if (a < this.f78966z) {
            return k + 1 + 1 + a;
        }
        return ((((k + 1) + i) + 1) + a) - Math.max(0, this.f78966z);
    }

    /* renamed from: c */
    private int m98444c(int i) {
        boolean z;
        if (this.f78966z > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !this.f78965y.isEmpty();
        int min = Math.min(this.f78965y.size(), 3);
        if (z2) {
            i = (i - min) - 1;
        }
        if (z) {
            i = (i - this.f78966z) - 1;
        }
        if (this.f78953a != null) {
            i--;
        }
        return i - 1;
    }

    /* renamed from: f */
    private static List<User> m98447f(List<User> list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (User user : list) {
            if (hashSet.add(user.getUid())) {
                arrayList.add(user);
            }
        }
        list.clear();
        list.addAll(arrayList);
        return list;
    }

    /* renamed from: a */
    public final void mo76233a(User user) {
        if (C29998a.m98354a((Collection<User>) this.f67539l, user)) {
            int b = m98442b(user);
            if (this.f78966z > 0 && b < m98446f()) {
                this.f78966z--;
                if (this.f78966z == 0) {
                    notifyItemRemoved(m98448j());
                }
            }
            C29998a.m98355b(this.f67539l, user);
            notifyItemRemoved(b);
        }
        if (C29998a.m98354a((Collection<User>) this.f78965y, user)) {
            int a = C29998a.m98352a(this.f78965y, user);
            C29998a.m98355b(this.f78965y, user);
            if (a < 3) {
                notifyItemRemoved(a + 2);
                if (this.f78965y.size() >= 3) {
                    notifyItemInserted(4);
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        boolean z;
        if (this.f78966z > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !this.f78965y.isEmpty();
        int min = Math.min(this.f78965y.size(), 3);
        if (this.f78953a == null) {
            if (i == 0) {
                if (z2) {
                    return 5;
                }
                if (z) {
                    this.f78956d = i;
                }
                if (z) {
                    return 3;
                }
                return 4;
            } else if (z2) {
                if (i == min + 1) {
                    if (z) {
                        return 3;
                    }
                    return 4;
                }
            } else if (z && i == this.f78966z + 1) {
                return 4;
            }
        } else if (i == 0) {
            return 0;
        } else {
            if (i == 1) {
                if (z2) {
                    return 5;
                }
                if (z) {
                    this.f78956d = i;
                }
                if (z) {
                    return 3;
                }
                return 4;
            } else if (z2) {
                if (z) {
                    int i2 = min + 2;
                    if (i == i2) {
                        return 3;
                    }
                    if (i == i2 + 1 + this.f78966z) {
                        return 4;
                    }
                } else if (i == min + 2) {
                    return 4;
                }
            } else if (z && i == this.f78966z + 2) {
                return 4;
            }
        }
        if (this.f78954b != null && i == getItemCount() - 1) {
            return 1;
        }
        int e = m98445e(i);
        if (!m98443b(e) || !(this.f67539l.get(e) instanceof RecommendContact)) {
            return 2;
        }
        return 6;
    }

    /* renamed from: c */
    public final void mo62323c(List<User> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            if (this.f67539l == null) {
                this.f67539l = new ArrayList();
            }
            this.f67539l.addAll(list);
            this.f67539l = m98447f(this.f67539l);
            notifyDataSetChanged();
        }
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof RecommendFriendItemViewV2Holder) {
            User a = ((RecommendFriendItemViewV2Holder) vVar).mo76579a();
            if (this.f78965y != null && this.f78965y.contains(a) && this.f78965y.indexOf(a) < 3) {
                str = "recent_fans";
            } else if (a == null) {
                str = "";
            } else if (a.isNewRecommend()) {
                str = "new";
            } else {
                str = "past";
            }
            int indexOf = this.f67539l.indexOf(a);
            if (!this.f78963w.contains(Integer.valueOf(indexOf))) {
                this.f78963w.add(Integer.valueOf(indexOf));
                C34202f a2 = C34202f.m110435a();
                if (a == null) {
                    str2 = "";
                } else {
                    str2 = a.getUid();
                }
                a2.mo86948a(3, str2);
                JSONObject jSONObject = new JSONObject();
                String str6 = "rec_uid";
                if (a == null) {
                    str3 = "";
                } else {
                    try {
                        str3 = a.getUid();
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put(str6, str3);
                jSONObject.put("enter_from", this.f78960h);
                jSONObject.put("event_type", "impression");
                jSONObject.put("previous_page", this.f78961i);
                jSONObject.put("impr_order", indexOf);
                String str7 = "req_id";
                if (a != null) {
                    str4 = a.getRequestId();
                } else {
                    str4 = "";
                }
                jSONObject.put(str7, str4);
                jSONObject.put("is_direct", 1);
                jSONObject.put("page_status", "nonempty");
                jSONObject.put("trigger_reason", "friend_rec_message");
                String str8 = "rec_reason";
                if (a == null) {
                    str5 = "";
                } else {
                    str5 = a.getRecommendReason();
                }
                jSONObject.put(str8, str5);
                jSONObject.put("card_type", str);
                jSONObject.put("rec_user_type", C21718a.m72637a(a));
                if ("others_homepage".equals(this.f78960h)) {
                    jSONObject.put("profile_uid", this.f78962j);
                }
                C6907h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject));
                C6907h.m21525a("follow_card", jSONObject);
            }
            return;
        }
        if ((vVar instanceof RecommendContactViewHolder) && !this.f78952C) {
            ((RecommendContactViewHolder) vVar).mo76571a();
            this.f78952C = true;
        }
    }

    public RecommendListAdapter(Context context, boolean z) {
        this.f78964x = context;
        mo66506d(R.string.am0);
        this.f78950A = z;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C30179z zVar;
        switch (i) {
            case 0:
                return new HeaderHolder(this.f78953a);
            case 1:
                return mo61886a_(viewGroup);
            case 2:
                if (C6399b.m19944t()) {
                    zVar = new C30179z(viewGroup.getContext(), this.f78951B, this.f78950A);
                } else {
                    zVar = new C30151ab(viewGroup.getContext(), this.f78951B, this.f78950A);
                }
                zVar.setEnterFrom(this.f78960h);
                zVar.setListener(this.f78959g);
                zVar.setRecommendUserType(this.f78955c);
                zVar.setRecommendAwemeClickListener(this.f78958f);
                return new RecommendFriendItemViewV2Holder(zVar);
            case 3:
            case 4:
            case 5:
                return new RecommendFriendsTitleHolder(LayoutInflater.from(this.f78964x).inflate(R.layout.w7, viewGroup, false));
            case 6:
                RecommendContactItemView recommendContactItemView = new RecommendContactItemView(viewGroup.getContext());
                recommendContactItemView.setEnterFrom(this.f78960h);
                recommendContactItemView.setDislikeListener(new C7563m<RecommendContact, Integer, C7581n>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public C7581n invoke(RecommendContact recommendContact, Integer num) {
                        RecommendListAdapter.this.f78959g.mo60535a(102, recommendContact, num.intValue(), null, "");
                        return null;
                    }
                });
                return new RecommendContactViewHolder(recommendContactItemView);
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        switch (getItemViewType(i)) {
            case 0:
                return;
            case 1:
                if (vVar instanceof LoadMoreViewHolder) {
                    ((LoadMoreViewHolder) vVar).mo66509a();
                    return;
                }
                break;
            case 2:
                if (vVar instanceof RecommendFriendItemViewV2Holder) {
                    boolean z = false;
                    if (!this.f78965y.isEmpty()) {
                        int min = Math.min(this.f78965y.size(), 3) + 1;
                        if (2 <= i && i < min + 2) {
                            int i2 = i - 2;
                            ((RecommendFriendItemViewV2Holder) vVar).mo76581a((User) this.f78965y.get(i2), i2, false, this.f78955c);
                            break;
                        } else {
                            int e = m98445e(i - min);
                            if (m98443b(e)) {
                                if (this.f78966z > 0) {
                                    int i3 = min + 2;
                                    if (i < this.f78966z + i3 && i >= i3) {
                                        z = true;
                                    }
                                }
                                ((RecommendFriendItemViewV2Holder) vVar).mo76581a((User) this.f67539l.get(e), e, z, this.f78955c);
                                return;
                            }
                            return;
                        }
                    } else {
                        int e2 = m98445e(i);
                        if (m98443b(e2)) {
                            if ((this.f78966z <= 0 || i <= this.f78966z + 2) && this.f78966z > 0) {
                                z = true;
                            }
                            ((RecommendFriendItemViewV2Holder) vVar).mo76581a((User) this.f67539l.get(e2), e2, z, this.f78955c);
                            return;
                        }
                        return;
                    }
                }
                break;
            case 3:
                if (vVar instanceof RecommendFriendsTitleHolder) {
                    RecommendFriendsTitleHolder recommendFriendsTitleHolder = (RecommendFriendsTitleHolder) vVar;
                    recommendFriendsTitleHolder.mo76584a(true, this.f78955c, this.f78966z, false, "");
                    if (this.f78957e) {
                        recommendFriendsTitleHolder.mo76583a();
                    }
                    return;
                }
                break;
            case 4:
                if (vVar instanceof RecommendFriendsTitleHolder) {
                    ((RecommendFriendsTitleHolder) vVar).mo76584a(false, this.f78955c, this.f78966z, false, "");
                    return;
                }
                break;
            case 5:
                if (vVar instanceof RecommendFriendsTitleHolder) {
                    RecommendFriendsTitleHolder recommendFriendsTitleHolder2 = (RecommendFriendsTitleHolder) vVar;
                    recommendFriendsTitleHolder2.mo76584a(true, this.f78955c, this.f78966z, true, "");
                    if (this.f78957e) {
                        recommendFriendsTitleHolder2.mo76583a();
                    }
                    return;
                }
                break;
            case 6:
                if (vVar instanceof RecommendContactViewHolder) {
                    int c = m98444c(i);
                    if (m98443b(c)) {
                        ((RecommendContactViewHolder) vVar).mo76572a((RecommendContact) this.f67539l.get(c), i);
                        break;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
