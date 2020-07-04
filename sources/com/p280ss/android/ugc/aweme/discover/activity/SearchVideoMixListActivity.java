package com.p280ss.android.ugc.aweme.discover.activity;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.favorites.p1215ui.MediaMixListFragment;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.discover.activity.SearchVideoMixListActivity */
public final class SearchVideoMixListActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C26367a f69399a = new C26367a(null);

    /* renamed from: com.ss.android.ugc.aweme.discover.activity.SearchVideoMixListActivity$a */
    public static final class C26367a {
        private C26367a() {
        }

        public /* synthetic */ C26367a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.activity.SearchVideoMixListActivity$b */
    static final class C26368b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchVideoMixListActivity f69400a;

        C26368b(SearchVideoMixListActivity searchVideoMixListActivity) {
            this.f69400a = searchVideoMixListActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f69400a.finish();
        }
    }

    public final int getStatusBarColor() {
        return getResources().getColor(R.color.ayd);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.eo);
        findViewById(R.id.jo).setOnClickListener(new C26368b(this));
        MediaMixListFragment mediaMixListFragment = new MediaMixListFragment();
        mediaMixListFragment.mo92305g(true);
        C42914ab a = C42914ab.m136242a().mo104633a("enter_from", "general_search").mo104633a("enter_method", "general_search_aladdin_more");
        Serializable serializableExtra = getIntent().getSerializableExtra("mix_more");
        if (serializableExtra != null) {
            String str = "mix_ids";
            if (serializableExtra != null) {
                a.mo104632a(str, (Serializable) (ArrayList) serializableExtra);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Long>");
            }
        }
        String stringExtra = getIntent().getStringExtra("search_keyword");
        if (stringExtra != null) {
            a.mo104633a("search_keyword", stringExtra);
        }
        mediaMixListFragment.setArguments(a.f111445a);
        getSupportFragmentManager().mo2645a().mo2585a((int) R.id.aoy, (Fragment) mediaMixListFragment).mo2604c();
    }
}
