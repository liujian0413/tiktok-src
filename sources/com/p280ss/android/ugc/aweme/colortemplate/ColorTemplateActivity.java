package com.p280ss.android.ugc.aweme.colortemplate;

import android.os.Bundle;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;

/* renamed from: com.ss.android.ugc.aweme.colortemplate.ColorTemplateActivity */
public final class ColorTemplateActivity extends AppCompatActivity {

    /* renamed from: a */
    private HashMap f63516a;

    /* renamed from: com.ss.android.ugc.aweme.colortemplate.ColorTemplateActivity$a */
    static final class C24020a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ObjectRef f63517a;

        C24020a(ObjectRef objectRef) {
            this.f63517a = objectRef;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((ColorAdapter) this.f63517a.element).mo62286a();
        }
    }

    /* renamed from: a */
    private View m78835a(int i) {
        if (this.f63516a == null) {
            this.f63516a = new HashMap();
        }
        View view = (View) this.f63516a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f63516a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.colortemplate.ColorTemplateActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.colortemplate.ColorTemplateActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.colortemplate.ColorTemplateActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.colortemplate.ColorTemplateActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ax);
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = new ColorAdapter(this);
        RecyclerView recyclerView = (RecyclerView) m78835a(R.id.bn1);
        C7573i.m23582a((Object) recyclerView, "list");
        recyclerView.setAdapter((ColorAdapter) objectRef.element);
        ((FrameLayout) m78835a(R.id.dn8)).setOnClickListener(new C24020a(objectRef));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.colortemplate.ColorTemplateActivity", "onCreate", false);
    }
}
