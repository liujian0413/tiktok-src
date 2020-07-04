package com.p280ss.android.ugc.aweme.p313im.sdk.relations;

import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.AbsRelationListAdapter;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.RelationListAdapter */
public class RelationListAdapter extends AbsRelationListAdapter {
    /* renamed from: a */
    public final String mo82380a(IMContact iMContact) {
        IMUser a = C6961d.m21661a(iMContact);
        if (a == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("@");
        sb.append(a.getUniqueId());
        return sb.toString();
    }
}
