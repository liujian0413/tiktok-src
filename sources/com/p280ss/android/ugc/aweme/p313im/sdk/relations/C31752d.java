package com.p280ss.android.ugc.aweme.p313im.sdk.relations;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C6425b;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.p280ss.android.ugc.aweme.p313im.sdk.C30588b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6928b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6943d;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.ChatRoomActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.OnlyPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SharePoiContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.TextContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30963v;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30981y;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.EncryptUrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31085i;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6959c;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.providedservices.IImplService;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.AbsRelationListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.AbsRelationListAdapter.C31713a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.C31702f;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b.C7053a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31891bc;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31912l;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7063bg;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar.C31980a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.d */
public class C31752d extends C30588b<C31732b> implements OnTouchListener {

    /* renamed from: d */
    private C31713a f83077d;

    /* renamed from: e */
    private String f83078e;

    /* renamed from: g */
    protected SharePackage f83079g;

    /* renamed from: h */
    public BaseContent f83080h;

    /* renamed from: i */
    protected boolean f83081i;

    /* renamed from: j */
    protected EditText f83082j;

    /* renamed from: k */
    protected ImageView f83083k;

    /* renamed from: l */
    protected DmtStatusView f83084l;

    /* renamed from: m */
    protected AbsRelationListAdapter f83085m;

    /* renamed from: n */
    protected RecyclerView f83086n;

    /* renamed from: o */
    protected ImTextTitleBar f83087o;

    /* renamed from: p */
    protected TextWatcher f83088p;

    /* renamed from: q */
    protected OnClickListener f83089q;

    /* renamed from: r */
    public String f83090r;

    /* renamed from: s */
    public C6892b<Boolean> f83091s;

    /* renamed from: t */
    View f83092t;

    /* renamed from: u */
    View f83093u;

    /* renamed from: a */
    public final void mo82552a(LinkedHashSet<IMContact> linkedHashSet) {
        if (linkedHashSet != null) {
            this.f83085m.f82951f = linkedHashSet;
            mo82558i();
            mo82557h();
            this.f83085m.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo82393a(List<IMContact> list) {
        if (mo80364d() != null && !mo80364d().isFinishing()) {
            this.f83081i = false;
            this.f83085m.mo82477a(list);
            mo82396f();
        }
    }

    /* renamed from: a */
    public void mo82394a(List<IMContact> list, CharSequence charSequence) {
        if (mo80364d() != null && !mo80364d().isFinishing()) {
            this.f83081i = true;
            this.f83085m.mo82478a(list, charSequence);
            mo82396f();
        }
    }

    /* renamed from: a */
    public final boolean mo82553a(IMContact iMContact) {
        IMUser a = C6961d.m21661a(iMContact);
        if (a != null) {
            return m103098b(a);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo82550a(final String str) {
        final BaseContent b = this.f83080h != null ? this.f83080h : C7052b.m21961b(this.f83079g);
        if (b instanceof StoryPictureContent) {
            ((StoryPictureContent) b).setMassMsg(1);
        } else if (b instanceof StoryVideoContent) {
            ((StoryVideoContent) b).setMassMsg(1);
        }
        C30963v.m100755a();
        String a = C30963v.m100756a(b);
        if (!TextUtils.isEmpty(a)) {
            C30963v.m100755a().mo81334a(a, b, (C30981y) new C30981y() {
                /* renamed from: a */
                public final void mo18257a() {
                }

                /* renamed from: a */
                public final void mo18258a(double d) {
                }

                /* renamed from: a */
                public final void mo18261a(Throwable th) {
                }

                /* renamed from: a */
                public final void mo18259a(String str) {
                    C31752d.this.mo82551a(str, b);
                }

                /* renamed from: a */
                public final void mo18260a(String str, UrlModel urlModel) {
                    if (b instanceof SharePoiContent) {
                        ((SharePoiContent) b).setMapUrl(urlModel);
                    } else if (b instanceof OnlyPictureContent) {
                        ((OnlyPictureContent) b).setUrl(urlModel);
                    } else if (b instanceof StoryPictureContent) {
                        ((StoryPictureContent) b).setUrl((EncryptUrlModel) urlModel);
                    }
                    C31752d.this.mo82551a(str, b);
                }
            });
        } else {
            mo82551a(str, b);
        }
    }

    /* renamed from: a */
    public final void mo82551a(String str, BaseContent baseContent) {
        C31858ad.m103406a();
        C31858ad.m103407a(this.f83085m.mo82481b());
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseContent);
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(TextContent.obtain(str));
        }
        IMContact[] a = this.f83085m.mo82480a();
        C7058be.m21980a().mo18271b(C6959c.m21651a(a), (List<BaseContent>) arrayList);
        boolean z = false;
        IMContact iMContact = a[0];
        if (a.length > 1) {
            z = true;
        }
        m103094a(iMContact, z);
        mo80364d().finish();
    }

    /* renamed from: m */
    public final void mo82562m() {
        this.f83083k.performClick();
    }

    /* renamed from: q */
    private void m103103q() {
        if (this.f83089q == null) {
            this.f83089q = new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (view.equals(C31752d.this.f83083k)) {
                        C31752d.this.f83082j.setText("");
                        C31752d.this.f83082j.clearFocus();
                        InputMethodManager inputMethodManager = (InputMethodManager) C6399b.m19921a().getSystemService("input_method");
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(C31752d.this.f83082j.getWindowToken(), 0);
                        }
                    }
                }
            };
        }
    }

    /* renamed from: r */
    private void m103104r() {
        if (this.f83088p == null) {
            this.f83088p = new TextWatcher() {
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    String obj = editable.toString();
                    if (!TextUtils.isEmpty(obj)) {
                        ((C31732b) C31752d.this.f80317c).mo82522a((CharSequence) obj);
                        return;
                    }
                    C31702f fVar = ((C31732b) C31752d.this.f80317c).f83044b;
                    if (fVar != null) {
                        C31752d.this.mo82393a(fVar.mo82404c());
                    }
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (TextUtils.isEmpty(charSequence) || C31752d.this.f83083k.getVisibility() != 8) {
                        if (TextUtils.isEmpty(charSequence) && C31752d.this.f83083k.getVisibility() == 0) {
                            C31752d.this.f83083k.setVisibility(8);
                        }
                        return;
                    }
                    C31752d.this.f83083k.setVisibility(0);
                }
            };
        }
    }

    /* renamed from: s */
    private void m103105s() {
        if (this.f83077d == null) {
            this.f83077d = new C31713a() {
                /* renamed from: a */
                public final void mo82497a(View view, int i) {
                    final IMContact iMContact = (IMContact) view.getTag(83886080);
                    final Integer num = (Integer) view.getTag(50331648);
                    if (num != null && iMContact != null) {
                        if (num.intValue() != 50331648 && num.intValue() != 50331649) {
                            if (num.intValue() == 100663296) {
                                C6959c.m21655b(C31752d.this.mo80363c(), iMContact, new C7561a<C7581n>() {
                                    /* access modifiers changed from: private */
                                    /* renamed from: a */
                                    public C7581n invoke() {
                                        final IMUser a = C6961d.m21661a(iMContact);
                                        if (a != null) {
                                            C7063bg.m22034a(C31752d.this.mo80364d(), a, 4, (Runnable) new Runnable() {
                                                public final void run() {
                                                    String a = C6425b.m20076a(Long.valueOf(a.getUid()).longValue());
                                                    C31858ad.m103406a();
                                                    C31858ad.m103432a(a, a.getUid(), "private", "click_contact_card", "contact_list");
                                                    ChatRoomActivity.m21589a(C31752d.this.f80315a, a, 4);
                                                }
                                            });
                                        }
                                        return null;
                                    }
                                });
                            }
                        } else if (C6956a.m21632a().mo18009f().showNewStyle() && C31752d.this.f83079g == null) {
                            C6959c.m21653a(C31752d.this.mo80363c(), iMContact, (C7561a<C7581n>) new C7561a<C7581n>() {
                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public C7581n invoke() {
                                    IMUser a = C6961d.m21661a(iMContact);
                                    if (a != null) {
                                        String uid = a.getUid();
                                        C31085i.f81578a.mo81571c(uid);
                                        C31891bc.m103605a(uid);
                                        C31858ad.m103406a();
                                        C31858ad.m103473f(uid, "chat_list");
                                        if (num.intValue() == 50331649) {
                                            C31858ad.m103406a();
                                            C31858ad.m103469e(uid, "message", "click_contact_head");
                                        }
                                    }
                                    return null;
                                }
                            });
                        } else if (C31752d.this.f83085m.f82949d) {
                            int i2 = C6956a.m21632a().mo18009f().getIMSetting().f83740c;
                            if (C31752d.this.f83085m.mo82481b() >= i2 && !C31752d.this.f83085m.mo82486c(iMContact)) {
                                C10761a.m31405c(C31752d.this.mo80363c(), C31752d.this.mo80363c().getString(R.string.br4, new Object[]{Integer.valueOf(i2)}), 0, 2).mo25750a();
                            } else if (C31752d.this.mo82553a(iMContact)) {
                                boolean b = C31752d.this.f83085m.mo82484b(iMContact);
                                C31752d.this.f83085m.mo82474a(i);
                                if (b) {
                                    C31752d.this.mo82554b(iMContact);
                                }
                                C31752d.this.mo82557h();
                            }
                        } else if (C31752d.this.f83079g == null) {
                            C6959c.m21655b(C31752d.this.mo80363c(), iMContact, new C7561a<C7581n>() {
                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public C7581n invoke() {
                                    IMUser a = C6961d.m21661a(iMContact);
                                    if (a != null) {
                                        C31752d.this.mo82548a(a);
                                        String uid = a.getUid();
                                        if (TextUtils.equals(uid, C7074e.m22069b())) {
                                            C31858ad.m103406a();
                                            C31858ad.m103449b("", "to_myself");
                                        } else {
                                            String a2 = C6425b.m20076a(Long.valueOf(uid).longValue());
                                            C31858ad.m103406a();
                                            C31858ad.m103432a(a2, uid, "private", "click_contact", "contact_list");
                                        }
                                        ChatRoomActivity.m21589a(C31752d.this.mo80363c(), a, 4);
                                    }
                                    return null;
                                }
                            });
                        } else if (C31752d.this.mo82553a(iMContact)) {
                            C31752d.this.mo82554b(iMContact);
                            C7052b.m21948a(C31752d.this.mo80363c(), C31752d.this.f83079g, new IMContact[]{iMContact}, C31752d.this.f83090r, (C7053a) new C7053a() {
                                public final void onShare(final String str) {
                                    new C6928b(C31752d.this.mo80363c(), new C6943d() {
                                        public final void sendMsg() {
                                            C31752d.this.mo82546a(iMContact, str);
                                            if (C31752d.this.f83091s != null) {
                                                C31752d.this.f83091s.run(Boolean.valueOf(true));
                                            }
                                        }
                                    }).sendMsg();
                                    C31752d.this.mo82555c(iMContact);
                                }
                            }, (C7053a) new C7053a() {
                                public final void onShare(String str) {
                                    if (C31752d.this.f83091s != null) {
                                        C31752d.this.f83091s.run(Boolean.valueOf(false));
                                    }
                                }
                            });
                        }
                    }
                }
            };
        }
    }

    /* renamed from: g */
    public final void mo82556g() {
        if (this.f83085m != null) {
            this.f83085m.notifyDataSetChanged();
        }
    }

    /* renamed from: l */
    public final void mo82561l() {
        C25713b.m84474a(mo80364d(), (View) this.f83082j);
    }

    /* renamed from: k */
    public final void mo82560k() {
        if (this.f83085m == null || !this.f83085m.f82949d) {
            mo80364d().finish();
        } else {
            mo82559j();
        }
    }

    /* renamed from: n */
    private void m103100n() {
        if (this.f83079g != null) {
            this.f83090r = this.f83079g.f20186l.getString("multi_share_msg");
            this.f83078e = this.f83079g.f20186l.getString("aid");
            this.f83079g.f20186l.remove("multi_share_msg");
            this.f83079g.f20186l.remove("aid");
        }
        if (this.f83078e == null) {
            this.f83078e = "";
        }
    }

    /* renamed from: b */
    public final void mo80362b() {
        super.mo80362b();
        m103103q();
        m103104r();
        m103105s();
        this.f83087o.setOnTitlebarClickListener(new C31980a() {
            /* renamed from: b */
            public final void mo18097b() {
            }

            /* renamed from: a */
            public final void mo18096a() {
                C25713b.m84474a(C31752d.this.mo80364d(), (View) C31752d.this.f83082j);
                C31752d.this.mo80364d().finish();
            }
        });
        this.f83083k.setOnClickListener(this.f83089q);
        this.f83082j.addTextChangedListener(this.f83088p);
        this.f83082j.setOnKeyListener(new OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 66) {
                    return false;
                }
                C25713b.m84474a(C31752d.this.mo80364d(), (View) C31752d.this.f83082j);
                return true;
            }
        });
        this.f83082j.setOnTouchListener(this);
        mo82395e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo82395e() {
        boolean z;
        IImplService b = C6956a.m21633b();
        if (this.f83079g != null) {
            z = true;
        } else {
            z = false;
        }
        this.f83085m = b.getRelationListAdapter(z);
        this.f83085m.f82955j = new Runnable() {
            public final void run() {
                ((C31732b) C31752d.this.f80317c).mo82521a();
            }
        };
        this.f83085m.f82956k = this.f83077d;
        this.f83085m.f82947b = C31912l.m103665a(this.f83079g);
        this.f83086n.setAdapter(this.f83085m);
    }

    /* renamed from: o */
    private void m103101o() {
        if (this.f83092t == null) {
            if (C31915n.m103671a()) {
                MtEmptyView a = MtEmptyView.m31657a(this.f80315a);
                a.setStatus(new C10806a(this.f80315a).mo25990b((int) R.string.bp0).mo25993c(R.string.boz).mo25985a((int) R.drawable.ax3).f29135a);
                this.f83092t = a;
                return;
            }
            DmtDefaultView dmtDefaultView = new DmtDefaultView(this.f80315a);
            dmtDefaultView.setStatus(new C10806a(this.f80315a).mo25990b((int) R.string.bp0).mo25993c(R.string.boz).mo25985a((int) R.drawable.b7c).f29135a);
            this.f83092t = dmtDefaultView;
        }
    }

    /* renamed from: p */
    private void m103102p() {
        if (this.f83093u == null) {
            if (C31915n.m103671a()) {
                MtEmptyView a = MtEmptyView.m31657a(this.f80315a);
                a.setStatus(new C10806a(this.f80315a).mo25990b((int) R.string.bok).mo25993c(R.string.boj).mo25985a((int) R.drawable.ax1).f29135a);
                this.f83093u = a;
                return;
            }
            DmtDefaultView dmtDefaultView = new DmtDefaultView(this.f80315a);
            dmtDefaultView.setStatus(new C10806a(this.f80315a).mo25990b((int) R.string.bok).mo25993c(R.string.boj).mo25985a((int) R.drawable.b7d).f29135a);
            this.f83093u = dmtDefaultView;
        }
    }

    /* renamed from: t */
    private void m103106t() {
        if (this.f83087o != null) {
            if (this.f83079g != null) {
                mo82395e();
            }
            if (this.f83079g == null) {
                if (C31915n.m103672b()) {
                    this.f83087o.setTitle((int) R.string.bp7);
                } else {
                    this.f83087o.setTitle((int) R.string.bi_);
                }
                this.f83087o.getRightView().setVisibility(8);
                this.f83087o.setLeftText((int) R.string.bhv);
                return;
            }
            this.f83087o.setTitle((int) R.string.bp8);
            this.f83087o.getRightView().setVisibility(0);
            mo82559j();
        }
    }

    /* renamed from: a */
    public void mo80360a() {
        super.mo80360a();
        this.f83087o = (ImTextTitleBar) this.f80316b.findViewById(R.id.djz);
        this.f83084l = (DmtStatusView) this.f80316b.findViewById(R.id.dav);
        this.f83082j = (EditText) this.f80316b.findViewById(R.id.d0s);
        this.f83082j.setTag("relation_search_tag");
        if (C31915n.m103672b()) {
            this.f83082j.setHint(R.string.be2);
        }
        this.f83083k = (ImageView) this.f80316b.findViewById(R.id.pw);
        this.f83086n = (RecyclerView) this.f80316b.findViewById(R.id.cqb);
        this.f83086n.setLayoutManager(new LinearLayoutManager(mo80363c()));
        this.f83086n.mo5528a((C1281m) new FrescoRecycleViewScrollListener(this.f80315a) {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                C25713b.m84474a(C31752d.this.mo80364d(), (View) C31752d.this.f83082j);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo82396f() {
        this.f83084l.mo25939d();
        if (this.f83085m.getItemCount() == 0) {
            if (this.f83081i) {
                m103101o();
                this.f83084l.setBuilder(new C10803a(mo80364d()).mo25963b(this.f83092t));
            } else {
                m103102p();
                this.f83084l.setBuilder(new C10803a(mo80364d()).mo25963b(this.f83093u));
            }
            this.f83084l.mo25943g();
            this.f83084l.setVisibility(0);
            return;
        }
        this.f83084l.setVisibility(8);
    }

    /* renamed from: i */
    public final void mo82558i() {
        this.f83087o.getRightTexView().getPaint().setFakeBoldText(false);
        this.f83087o.setLeftText((int) R.string.w_);
        this.f83087o.setRightText((int) R.string.bjh);
        this.f83087o.setTitle((int) R.string.bp6);
        this.f83087o.setRightTextColor(mo80364d().getResources().getColor(R.color.a7b));
        this.f83087o.getRightView().setEnabled(false);
        this.f83085m.mo82479a(true);
        this.f83087o.setOnTitlebarClickListener(new C31980a() {
            /* renamed from: a */
            public final void mo18096a() {
                C31752d.this.mo82559j();
            }

            /* renamed from: b */
            public final void mo18097b() {
                if (C31752d.this.f83085m.mo82481b() > 0) {
                    C7052b.m21948a(C31752d.this.mo80363c(), C31752d.this.f83079g, C31752d.this.f83085m.mo82480a(), C31752d.this.f83090r, (C7053a) new C7053a() {
                        public final void onShare(final String str) {
                            new C6928b(C31752d.this.mo80363c(), new C6943d() {
                                public final void sendMsg() {
                                    C31752d.this.mo82550a(str);
                                    if (C31752d.this.f83091s != null) {
                                        C31752d.this.f83091s.run(Boolean.valueOf(true));
                                    }
                                }
                            }).sendMsg();
                            C31752d.m103095a(C31752d.this.f83079g, C31752d.this.f83080h, C31752d.this.f83085m.mo82480a().length);
                        }
                    }, (C7053a) new C7053a() {
                        public final void onShare(String str) {
                            if (C31752d.this.f83091s != null) {
                                C31752d.this.f83091s.run(Boolean.valueOf(false));
                            }
                        }
                    });
                }
            }
        });
    }

    /* renamed from: j */
    public final void mo82559j() {
        this.f83087o.getRightTexView().getPaint().setFakeBoldText(false);
        this.f83087o.setLeftText((int) R.string.bhv);
        this.f83087o.setTitle((int) R.string.bp8);
        this.f83087o.setRightText((int) R.string.bp5);
        this.f83087o.setRightTextColor(mo80364d().getResources().getColor(R.color.a5e));
        this.f83087o.getRightView().setEnabled(true);
        this.f83085m.mo82479a(false);
        this.f83087o.setOnTitlebarClickListener(new C31980a() {
            /* renamed from: b */
            public final void mo18097b() {
                C31858ad.m103406a();
                C31858ad.m103475g();
                C31752d.this.mo82558i();
            }

            /* renamed from: a */
            public final void mo18096a() {
                C25713b.m84474a(C31752d.this.mo80364d(), (View) C31752d.this.f83082j);
                C31752d.this.mo80364d().finish();
            }
        });
    }

    /* renamed from: h */
    public final void mo82557h() {
        if (this.f83085m.mo82481b() > 0) {
            ImTextTitleBar imTextTitleBar = this.f83087o;
            StringBuilder sb = new StringBuilder();
            sb.append(mo80363c().getString(R.string.bi8));
            sb.append("(");
            sb.append(this.f83085m.mo82481b());
            sb.append(")");
            imTextTitleBar.setRightText(sb.toString());
            this.f83087o.getRightView().setEnabled(true);
            this.f83087o.getRightTexView().getPaint().setFakeBoldText(true);
            this.f83087o.setRightTextColor(mo80364d().getResources().getColor(R.color.a79));
            return;
        }
        this.f83087o.setRightText((int) R.string.bi8);
        this.f83087o.getRightView().setEnabled(false);
        this.f83087o.getRightTexView().getPaint().setFakeBoldText(false);
        this.f83087o.setRightTextColor(mo80364d().getResources().getColor(R.color.a7b));
    }

    /* renamed from: c */
    public final void mo82555c(IMContact iMContact) {
        if (C31915n.m103672b() && this.f83079g.f20181g.equals("aweme")) {
            m103099d(iMContact);
        }
    }

    /* renamed from: b */
    private boolean m103098b(IMUser iMUser) {
        if (iMUser == null) {
            return false;
        }
        if (!TextUtils.equals(iMUser.getUid(), C7074e.m22069b()) && iMUser.getFollowStatus() != 2) {
            int i = this.f83079g.f20186l.getInt("aweme_type");
            if (TextUtils.equals(this.f83079g.f20181g, "pic")) {
                C9738o.m28693a(C6399b.m19921a(), (int) R.string.bnq);
                return false;
            } else if (TextUtils.equals(this.f83079g.f20181g, "gif") && (i == 501 || i == 502)) {
                C9738o.m28693a(C6399b.m19921a(), (int) R.string.bj6);
                return false;
            } else if (TextUtils.equals(this.f83079g.f20181g, "story_video")) {
                C9738o.m28693a(C6399b.m19921a(), (int) R.string.bnr);
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private void m103099d(IMContact iMContact) {
        String string = this.f83079g.f20186l.getString("author_id");
        String string2 = this.f83079g.f20186l.getString("enter_from");
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "chat");
        hashMap.put("group_id", this.f83078e);
        String str = "author_id";
        if (string == null) {
            string = "";
        }
        hashMap.put(str, string);
        String str2 = "enter_from";
        if (string2 == null) {
            string2 = "";
        }
        hashMap.put(str2, string2);
        if (iMContact instanceof IMUser) {
            hashMap.put("to_user_id", ((IMUser) iMContact).getUid());
        }
        C6907h.m21524a("share_video_success", (Map) hashMap);
    }

    /* renamed from: b */
    public final void mo82554b(IMContact iMContact) {
        m103096a(this.f83079g, iMContact);
        if (iMContact instanceof IMUser) {
            String uid = ((IMUser) iMContact).getUid();
            m103097a(C6425b.m20076a(Long.valueOf(uid).longValue()), uid);
            return;
        }
        if (iMContact instanceof IMConversation) {
            m103097a(((IMConversation) iMContact).getConversationId(), "");
        }
    }

    /* renamed from: a */
    public final void mo82548a(IMUser iMUser) {
        String str;
        C31858ad.m103406a();
        String uid = iMUser.getUid();
        if (this.f83081i) {
            str = "search_result";
        } else if (iMUser.getType() == 1) {
            str = "recent";
        } else {
            str = "follow";
        }
        C31858ad.m103429a(uid, str, this.f83082j.getText().toString());
    }

    /* renamed from: a */
    public final void mo82549a(SharePackage sharePackage) {
        this.f83079g = sharePackage;
        m103100n();
        m103106t();
    }

    /* renamed from: a */
    private static void m103096a(SharePackage sharePackage, IMContact iMContact) {
        C31858ad.m103406a().mo82716a(sharePackage, iMContact, false);
    }

    /* renamed from: a */
    private void m103097a(String str, String str2) {
        if (this.f83080h != null) {
            String a = C31863ai.m103528a(this.f83080h.generateSharePackage().f20181g);
            if (!TextUtils.isEmpty(a)) {
                C31858ad.m103406a();
                C31858ad.m103430a(a, str, str2, this.f83080h);
            }
        }
    }

    /* renamed from: a */
    private void m103094a(IMContact iMContact, boolean z) {
        if (TextUtils.equals(this.f83079g.f20181g, "game")) {
            C10761a.m31383a(mo80363c(), (int) R.string.bpe).mo25750a();
            return;
        }
        C7705c a = C7705c.m23799a();
        ShareCompleteEvent shareCompleteEvent = new ShareCompleteEvent(iMContact, z, this.f83079g.f20181g, this.f83079g.f20186l.getString("enter_from"), this.f83078e);
        a.mo20394d(shareCompleteEvent);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        if (view.equals(this.f83082j) && motionEvent.getAction() == 1) {
            if (this.f83080h != null) {
                str = "forward";
            } else if (this.f83079g != null) {
                str = "share";
            } else {
                str = "contact";
            }
            C31858ad.m103406a();
            C31858ad.m103503q(str);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo82546a(final IMContact iMContact, final String str) {
        final BaseContent baseContent;
        if (this.f83080h == null) {
            baseContent = C7052b.m21961b(this.f83079g);
        } else if (this.f83080h instanceof TextContent) {
            baseContent = TextContent.obtain((TextContent) this.f83080h);
        } else {
            baseContent = this.f83080h;
        }
        C30963v.m100755a();
        String a = C30963v.m100756a(baseContent);
        if (!TextUtils.isEmpty(a)) {
            C30963v.m100755a().mo81334a(a, baseContent, (C30981y) new C30981y() {
                /* renamed from: a */
                public final void mo18257a() {
                }

                /* renamed from: a */
                public final void mo18258a(double d) {
                }

                /* renamed from: a */
                public final void mo18261a(Throwable th) {
                }

                /* renamed from: a */
                public final void mo18259a(String str) {
                    C31752d.this.mo82547a(iMContact, str, baseContent);
                }

                /* renamed from: a */
                public final void mo18260a(String str, UrlModel urlModel) {
                    if (baseContent instanceof SharePoiContent) {
                        ((SharePoiContent) baseContent).setMapUrl(urlModel);
                    } else if (baseContent instanceof OnlyPictureContent) {
                        ((OnlyPictureContent) baseContent).setUrl(urlModel);
                    } else if (baseContent instanceof StoryPictureContent) {
                        ((StoryPictureContent) baseContent).setUrl((EncryptUrlModel) urlModel);
                    }
                    C31752d.this.mo82547a(iMContact, str, baseContent);
                }
            });
        } else {
            mo82547a(iMContact, str, baseContent);
        }
    }

    /* renamed from: a */
    public static void m103095a(SharePackage sharePackage, BaseContent baseContent, int i) {
        C31858ad.m103406a();
        C31858ad.m103418a(sharePackage, baseContent, i);
    }

    public C31752d(Context context, View view, boolean z) {
        super(context, view);
        if (z) {
            this.f83087o.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo82547a(IMContact iMContact, String str, BaseContent baseContent) {
        C31858ad.m103406a();
        C31858ad.m103407a(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseContent);
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(TextContent.obtain(str));
        }
        C7058be.m21980a().mo18273c(C6959c.m21649a(iMContact), arrayList);
        m103094a(iMContact, false);
        mo80364d().finish();
    }
}
