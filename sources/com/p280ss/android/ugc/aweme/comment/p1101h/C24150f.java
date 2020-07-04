package com.p280ss.android.ugc.aweme.comment.p1101h;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25268bg;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.experiment.LinkMigrationExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeNationalTask;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.p280ss.android.ugc.aweme.feed.model.NationalTaskLink;
import com.p280ss.android.ugc.aweme.feed.model.StarAtlasLink;

/* renamed from: com.ss.android.ugc.aweme.comment.h.f */
public final class C24150f {
    /* renamed from: a */
    private static boolean m79359a() {
        if (C6384b.m19835a().mo15292a(LinkMigrationExperiment.class, true, "enable_link_ad_migration", C6384b.m19835a().mo15295d().enable_link_ad_migration, true)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static CommentStruct m79358a(Aweme aweme) {
        LinkData a = C25268bg.m83039a(aweme);
        CommentStruct commentStruct = null;
        if (a == null || a.linkType != 0) {
            AwemeStarAtlas starAtlasInfo = aweme.getStarAtlasInfo();
            if (starAtlasInfo != null) {
                StarAtlasLink starAtlasLink = starAtlasInfo.getStarAtlasLink();
                if (starAtlasLink != null) {
                    if (!m79359a()) {
                        return null;
                    }
                    commentStruct = new CommentStruct();
                    commentStruct.setAid(aweme.getAid());
                    commentStruct.setAvatarIcon(starAtlasLink.getAvatarIcon());
                    commentStruct.setCommentInfo(starAtlasLink.getTitle());
                    commentStruct.setCommentNickName(aweme.getAuthor().getNickname());
                    commentStruct.setCommentTime(aweme.getCreateTime());
                    commentStruct.setUser(aweme.getAuthor());
                    commentStruct.setCommentType(10);
                }
                return commentStruct;
            }
            AwemeNationalTask awemeNationalTask = aweme.getAwemeNationalTask();
            if (awemeNationalTask != null) {
                NationalTaskLink nationalTaskLink = awemeNationalTask.getNationalTaskLink();
                if (nationalTaskLink != null) {
                    if (!m79359a()) {
                        return null;
                    }
                    commentStruct = new CommentStruct();
                    commentStruct.setAid(aweme.getAid());
                    commentStruct.setCommentTime(aweme.getCreateTime());
                    commentStruct.setAvatarIcon(nationalTaskLink.getAvatarIcon());
                    commentStruct.setCommentInfo(nationalTaskLink.getTitle());
                    commentStruct.setCommentNickName(aweme.getAuthor().getNickname());
                    commentStruct.setUser(aweme.getAuthor());
                    commentStruct.setCommentType(10);
                }
                return commentStruct;
            } else if (a == null || a.linkType != 1 || !C25329c.m83232o(aweme)) {
                return null;
            } else {
                CommentStruct commentStruct2 = new CommentStruct();
                commentStruct2.setCommentTime(aweme.getCreateTime());
                commentStruct2.setCommentType(12);
                return commentStruct2;
            }
        } else if (!m79359a()) {
            return null;
        } else {
            CommentStruct commentStruct3 = new CommentStruct();
            commentStruct3.setAid(aweme.getAid());
            commentStruct3.setAvatarIcon(a.avatarIcon);
            commentStruct3.setButtonText(a.buttonText);
            commentStruct3.setCommentTime(aweme.getCreateTime());
            commentStruct3.setCommentInfo(a.title);
            commentStruct3.setTitle(a.title);
            commentStruct3.setCommentNickName(aweme.getAuthor().getNickname());
            commentStruct3.setUser(aweme.getAuthor());
            commentStruct3.setCommentType(10);
            return commentStruct3;
        }
    }
}
