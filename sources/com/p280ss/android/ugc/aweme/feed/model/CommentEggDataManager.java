package com.p280ss.android.ugc.aweme.feed.model;

import android.net.Uri;
import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25354g;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25354g.C25356a;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.CommentEggDataManager */
public class CommentEggDataManager {
    private static HashMap<String, CommentEggDataNode> eggDataMap = new HashMap<>(10);

    /* renamed from: com.ss.android.ugc.aweme.feed.model.CommentEggDataManager$CommentEggDataNode */
    static class CommentEggDataNode {
        public boolean avaliable;
        public int eggCount;
        public ItemCommentEggGroup itemCommentEggGroup;
        public Set<String> preloadSet;

        private void preLoadEggSource() {
            for (int i = 0; i < this.eggCount; i++) {
                C1592h.m7853a((Callable<TResult>) new CommentEggDataManager$CommentEggDataNode$$Lambda$0<TResult>(this, ((ItemCommentEggData) this.itemCommentEggGroup.commentEggData.get(i)).materialUrl));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CommentEggDataNode{itemCommentEggGroup=");
            sb.append(this.itemCommentEggGroup);
            sb.append(", eggCount=");
            sb.append(this.eggCount);
            sb.append(", avaliable=");
            sb.append(this.avaliable);
            sb.append('}');
            return sb.toString();
        }

        private CommentEggDataNode(ItemCommentEggGroup itemCommentEggGroup2) {
            this.preloadSet = Collections.synchronizedSet(new HashSet());
            this.itemCommentEggGroup = itemCommentEggGroup2;
            this.eggCount = itemCommentEggGroup2.commentEggData.size();
            preLoadEggSource();
            this.avaliable = true;
        }

        private boolean checkEggData(ItemCommentEggData itemCommentEggData) {
            if (itemCommentEggData == null) {
                return false;
            }
            String[] strArr = {itemCommentEggData.eggId, itemCommentEggData.fileType, itemCommentEggData.materialUrl, itemCommentEggData.regex};
            for (int i = 0; i < 4; i++) {
                if (TextUtils.isEmpty(strArr[i])) {
                    return false;
                }
            }
            return true;
        }

        public String getHint(String str) {
            if (!this.avaliable || TextUtils.isEmpty(str)) {
                return null;
            }
            for (int i = 0; i < this.itemCommentEggGroup.editintist.size(); i++) {
                if (str.equals(((EditHint) this.itemCommentEggGroup.editintist.get(i)).language)) {
                    return ((EditHint) this.itemCommentEggGroup.editintist.get(i)).hint;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: lambda$preLoadEggSource$0$CommentEggDataManager$CommentEggDataNode */
        public final /* synthetic */ Object mo72758xd28361bd(final String str) throws Exception {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (C25354g.m83380a(Uri.parse(str))) {
                this.preloadSet.add(str);
                return null;
            }
            C25354g.m83379a(str, (C25356a) new C25356a() {
                public void onFailureImpl() {
                }

                public void onNewResultImpl() {
                    CommentEggDataNode.this.preloadSet.add(str);
                }
            });
            return null;
        }

        public ItemCommentEggData getEggData(String str) {
            if (!this.avaliable || TextUtils.isEmpty(str)) {
                return null;
            }
            for (int i = 0; i < this.eggCount; i++) {
                if (str.matches(((ItemCommentEggData) this.itemCommentEggGroup.commentEggData.get(i)).regex)) {
                    ItemCommentEggData itemCommentEggData = (ItemCommentEggData) this.itemCommentEggGroup.commentEggData.get(i);
                    if (checkEggData(itemCommentEggData) && this.preloadSet.contains(itemCommentEggData.materialUrl)) {
                        return itemCommentEggData;
                    }
                }
            }
            return null;
        }
    }

    public static void deleteCommentEggGroup(String str) {
        eggDataMap.remove(str);
    }

    private static boolean hasEggDataNode(String str) {
        if (((CommentEggDataNode) eggDataMap.get(str)) == null) {
            return false;
        }
        return true;
    }

    public static ItemCommentEggGroup getCommentEggGroup(String str) {
        if (TextUtils.isEmpty(str) || !hasEggDataNode(str)) {
            return null;
        }
        return ((CommentEggDataNode) eggDataMap.get(str)).itemCommentEggGroup;
    }

    private static boolean checkEggGroup(ItemCommentEggGroup itemCommentEggGroup) {
        if (itemCommentEggGroup == null || itemCommentEggGroup.editintist == null || itemCommentEggGroup.commentEggData == null || itemCommentEggGroup.editintist.isEmpty() || itemCommentEggGroup.commentEggData.isEmpty()) {
            return false;
        }
        return true;
    }

    public static ItemCommentEggData getEggData(String str, String str2) {
        if (TextUtils.isEmpty(str) || !hasEggDataNode(str)) {
            return null;
        }
        return ((CommentEggDataNode) eggDataMap.get(str)).getEggData(str2);
    }

    public static String getHint(String str, String str2) {
        if (TextUtils.isEmpty(str) || !hasEggDataNode(str)) {
            return null;
        }
        return ((CommentEggDataNode) eggDataMap.get(str)).getHint(str2);
    }

    public static void putCommentEggGroup(String str, ItemCommentEggGroup itemCommentEggGroup) {
        if (!TextUtils.isEmpty(str) && !hasEggDataNode(str) && checkEggGroup(itemCommentEggGroup)) {
            eggDataMap.put(str, new CommentEggDataNode(itemCommentEggGroup));
        }
    }
}
