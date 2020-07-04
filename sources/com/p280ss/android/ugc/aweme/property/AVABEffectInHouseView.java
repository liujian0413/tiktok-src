package com.p280ss.android.ugc.aweme.property;

import android.content.Context;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemBase.C10813a;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemSwitch;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.property.AVABEffectInHouseView */
public class AVABEffectInHouseView extends LinearLayout {

    /* renamed from: a */
    private SettingItemSwitch f96788a;

    /* renamed from: b */
    private List<RadioButton> f96789b;

    /* renamed from: c */
    private RadioGroup f96790c;

    /* renamed from: d */
    private final int f96791d;

    /* renamed from: com.ss.android.ugc.aweme.property.AVABEffectInHouseView$a */
    static final class C36935a implements C10813a {

        /* renamed from: a */
        final /* synthetic */ AVABEffectInHouseView f96792a;

        /* renamed from: b */
        final /* synthetic */ SettingItemSwitch f96793b;

        /* renamed from: c */
        final /* synthetic */ RadioGroup f96794c;

        C36935a(AVABEffectInHouseView aVABEffectInHouseView, SettingItemSwitch settingItemSwitch, RadioGroup radioGroup) {
            this.f96792a = aVABEffectInHouseView;
            this.f96793b = settingItemSwitch;
            this.f96794c = radioGroup;
        }

        public final void OnSettingItemClick(View view) {
            if (!this.f96793b.isChecked()) {
                this.f96792a.mo93324b();
                this.f96794c.check(0);
            } else {
                this.f96792a.mo93323a();
                this.f96794c.clearCheck();
            }
            this.f96793b.toggle();
            AVABEffectInHouseView.m118844a(this.f96793b.isChecked());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABEffectInHouseView$b */
    static final class C36936b implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C36956b f96795a;

        C36936b(C36956b bVar) {
            this.f96795a = bVar;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            for (C36992w a : this.f96795a.f96847a) {
                a.mo93416a(false);
            }
            if (i != -1) {
                ((C36992w) this.f96795a.f96847a.get(i)).mo93416a(true);
            }
        }
    }

    public final int getCHILD_PADDING() {
        return this.f96791d;
    }

    /* renamed from: b */
    public final void mo93324b() {
        for (RadioButton visibility : this.f96789b) {
            visibility.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo93323a() {
        for (RadioButton visibility : this.f96789b) {
            visibility.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static void m118844a(boolean z) {
        Object service = ServiceManager.get().getService(IAVService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
        ((IAVService) service).setUsingOnline(!z);
    }

    public final void setABDetailItem(C36956b bVar) {
        C7573i.m23587b(bVar, "abEffectInHouseItemBean");
        if (this.f96788a == null) {
            this.f96788a = new SettingItemSwitch(getContext());
            addView(this.f96788a, -1, -2);
        }
        SettingItemSwitch settingItemSwitch = this.f96788a;
        if (settingItemSwitch == null) {
            C7573i.m23580a();
        }
        if (this.f96790c == null) {
            this.f96790c = new RadioGroup(getContext());
            addView(this.f96790c);
        }
        RadioGroup radioGroup = this.f96790c;
        if (radioGroup == null) {
            C7573i.m23580a();
        }
        int size = this.f96789b.size();
        int size2 = bVar.f96847a.size();
        boolean z = true;
        if (size < size2) {
            int i = size2 - size;
            for (int i2 = 0; i2 < i; i2++) {
                RadioButton radioButton = new RadioButton(getContext());
                this.f96789b.add(radioButton);
                radioButton.setId(this.f96789b.size() - 1);
                View view = radioButton;
                C0991u.m4202b(view, this.f96791d, 0, 0, 0);
                radioGroup.addView(view, -1, -2);
            }
        }
        for (int i3 = 0; i3 < size2; i3++) {
            ((RadioButton) this.f96789b.get(i3)).setVisibility(0);
        }
        if (size > size2 && size2 <= size) {
            while (true) {
                ((RadioButton) this.f96789b.get(size2)).setVisibility(8);
                if (size2 == size) {
                    break;
                }
                size2++;
            }
        }
        settingItemSwitch.setStartText(bVar.f96849c);
        int i4 = 0;
        for (Object next : this.f96789b) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                C7525m.m23465b();
            }
            ((RadioButton) next).setText(((C36992w) bVar.f96847a.get(i4)).key());
            i4 = i5;
        }
        settingItemSwitch.setOnSettingItemClickListener(new C36935a(this, settingItemSwitch, radioGroup));
        Iterable iterable = bVar.f96847a;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C36992w) it.next()).mo93417a()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        settingItemSwitch.setChecked(z);
        if (!settingItemSwitch.isChecked()) {
            mo93323a();
        }
        int childCount = radioGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            ((RadioButton) this.f96789b.get(i6)).setChecked(((C36992w) bVar.f96847a.get(i6)).mo93417a());
        }
        radioGroup.setOnCheckedChangeListener(new C36936b(bVar));
    }

    public AVABEffectInHouseView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f96789b = new ArrayList();
        this.f96791d = (int) C9738o.m28708b(context, 24.0f);
        setOrientation(1);
    }

    public /* synthetic */ AVABEffectInHouseView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
