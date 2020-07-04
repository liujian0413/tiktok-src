package com.p280ss.android.ugc.aweme.p313im.sdk.relations;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.SearchHeadListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.BaseMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.SearchHeadListView */
public final class SearchHeadListView extends LinearLayout {

    /* renamed from: a */
    public final RecyclerView f82785a;

    /* renamed from: b */
    public final ImageView f82786b;

    /* renamed from: c */
    public BaseMemberListViewModel<?> f82787c;

    /* renamed from: d */
    private final View f82788d;

    /* renamed from: e */
    private final ImageView f82789e;

    /* renamed from: f */
    private final EditText f82790f;

    /* renamed from: g */
    private final SearchHeadListAdapter f82791g;

    /* renamed from: h */
    private final int f82792h;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.SearchHeadListView$a */
    static final class C31611a extends Lambda implements C7562b<IMContact, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchHeadListView f82797a;

        C31611a(SearchHeadListView searchHeadListView) {
            this.f82797a = searchHeadListView;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102739a((IMContact) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102739a(IMContact iMContact) {
            C7573i.m23587b(iMContact, "it");
            BaseMemberListViewModel<?> baseMemberListViewModel = this.f82797a.f82787c;
            if (baseMemberListViewModel != null) {
                baseMemberListViewModel.mo82586a(iMContact);
            }
            this.f82797a.mo82385b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.SearchHeadListView$b */
    static final class C31612b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchHeadListView f82798a;

        C31612b(SearchHeadListView searchHeadListView) {
            this.f82798a = searchHeadListView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m102740a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102740a() {
            this.f82798a.f82785a.mo5541b(0);
        }
    }

    public SearchHeadListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SearchHeadListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo82383a() {
        this.f82790f.setText("");
    }

    /* renamed from: b */
    public final void mo82385b() {
        this.f82790f.clearFocus();
        Context context = getContext();
        if (context != null) {
            C25713b.m84474a((Activity) context, (View) this.f82790f);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    public final void setListViewModel(BaseMemberListViewModel<?> baseMemberListViewModel) {
        this.f82787c = baseMemberListViewModel;
    }

    /* renamed from: a */
    public final void mo82384a(List<? extends IMContact> list) {
        boolean z;
        Collection collection = list;
        boolean z2 = false;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f82789e.setVisibility(0);
            this.f82785a.setVisibility(8);
            mo82385b();
        } else {
            this.f82789e.setVisibility(8);
            this.f82785a.setVisibility(0);
            BaseMemberListViewModel<?> baseMemberListViewModel = this.f82787c;
            if (baseMemberListViewModel != null) {
                z2 = baseMemberListViewModel.mo82589n();
            }
            if (z2 && list.size() > this.f82791g.getItemCount()) {
                mo82383a();
            }
        }
        this.f82791g.mo80343a(list, new C31612b(this));
    }

    public SearchHeadListView(final Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        View inflate = View.inflate(context, R.layout.a_p, this);
        C7573i.m23582a((Object) inflate, "View.inflate(context, R.…t_search_head_list, this)");
        this.f82788d = inflate;
        View findViewById = this.f82788d.findViewById(R.id.aug);
        C7573i.m23582a((Object) findViewById, "mRootView.findViewById(R.id.head_list)");
        this.f82785a = (RecyclerView) findViewById;
        View findViewById2 = this.f82788d.findViewById(R.id.bbw);
        C7573i.m23582a((Object) findViewById2, "mRootView.findViewById(R.id.iv_search)");
        this.f82789e = (ImageView) findViewById2;
        View findViewById3 = this.f82788d.findViewById(R.id.d0s);
        C7573i.m23582a((Object) findViewById3, "mRootView.findViewById(R.id.search_et)");
        this.f82790f = (EditText) findViewById3;
        View findViewById4 = this.f82788d.findViewById(R.id.pw);
        C7573i.m23582a((Object) findViewById4, "mRootView.findViewById(R.id.btn_clear)");
        this.f82786b = (ImageView) findViewById4;
        this.f82791g = new SearchHeadListAdapter((C0043i) context, new C31611a(this));
        this.f82792h = C9738o.m28691a(context) - ((int) C9738o.m28708b(context, 95.0f));
        RecyclerView recyclerView = this.f82785a;
        FixedSizeLinearLayoutManager fixedSizeLinearLayoutManager = new FixedSizeLinearLayoutManager(context, 0, true);
        fixedSizeLinearLayoutManager.f82722a = this.f82792h;
        recyclerView.setLayoutManager(fixedSizeLinearLayoutManager);
        recyclerView.setAdapter(this.f82791g);
        recyclerView.setHorizontalScrollBarEnabled(true);
        recyclerView.setScrollBarStyle(33554432);
        this.f82790f.setOnKeyListener(new OnKeyListener(this) {

            /* renamed from: a */
            final /* synthetic */ SearchHeadListView f82793a;

            {
                this.f82793a = r1;
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                String str;
                boolean z;
                switch (i) {
                    case 66:
                        this.f82793a.mo82385b();
                        return true;
                    case 67:
                        C7573i.m23582a((Object) keyEvent, "event");
                        if (keyEvent.getAction() == 1) {
                            BaseMemberListViewModel<?> baseMemberListViewModel = this.f82793a.f82787c;
                            if (baseMemberListViewModel != null) {
                                str = baseMemberListViewModel.mo82592q();
                            } else {
                                str = null;
                            }
                            CharSequence charSequence = str;
                            if (charSequence == null || charSequence.length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                BaseMemberListViewModel<?> baseMemberListViewModel2 = this.f82793a.f82787c;
                                if (baseMemberListViewModel2 != null) {
                                    baseMemberListViewModel2.mo82593r();
                                }
                                return true;
                            }
                        }
                        return false;
                    default:
                        return false;
                }
            }
        });
        this.f82790f.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z;
                Context context = context;
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity != null) {
                    Window window = activity.getWindow();
                    if (window != null) {
                        if (motionEvent == null || motionEvent.getAction() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            window = null;
                        }
                        if (window != null) {
                            window.setSoftInputMode(48);
                        }
                    }
                }
                return false;
            }
        });
        this.f82790f.addTextChangedListener(new TextWatcher(this) {

            /* renamed from: a */
            final /* synthetic */ SearchHeadListView f82795a;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C7573i.m23587b(charSequence, "s");
            }

            {
                this.f82795a = r1;
            }

            public final void afterTextChanged(Editable editable) {
                String str;
                boolean z;
                if (editable != null) {
                    str = editable.toString();
                } else {
                    str = null;
                }
                CharSequence charSequence = str;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    BaseMemberListViewModel<?> baseMemberListViewModel = this.f82795a.f82787c;
                    if (baseMemberListViewModel != null) {
                        baseMemberListViewModel.mo82587b(0);
                    }
                    BaseMemberListViewModel<?> baseMemberListViewModel2 = this.f82795a.f82787c;
                    if (baseMemberListViewModel2 != null) {
                        baseMemberListViewModel2.mo81882a();
                    }
                } else {
                    BaseMemberListViewModel<?> baseMemberListViewModel3 = this.f82795a.f82787c;
                    if (baseMemberListViewModel3 != null) {
                        baseMemberListViewModel3.mo82587b(1);
                    }
                    BaseMemberListViewModel<?> baseMemberListViewModel4 = this.f82795a.f82787c;
                    if (baseMemberListViewModel4 != null) {
                        baseMemberListViewModel4.mo81883a(str);
                    }
                }
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C7573i.m23587b(charSequence, "s");
                if (TextUtils.isEmpty(charSequence) || this.f82795a.f82786b.getVisibility() != 8) {
                    if (TextUtils.isEmpty(charSequence) && this.f82795a.f82786b.getVisibility() == 0) {
                        this.f82795a.f82786b.setVisibility(8);
                    }
                    return;
                }
                this.f82795a.f82786b.setVisibility(0);
            }
        });
        this.f82786b.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ SearchHeadListView f82796a;

            {
                this.f82796a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f82796a.mo82383a();
            }
        });
    }

    public /* synthetic */ SearchHeadListView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
