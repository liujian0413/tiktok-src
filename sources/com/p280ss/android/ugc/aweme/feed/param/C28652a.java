package com.p280ss.android.ugc.aweme.feed.param;

import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.feed.param.a */
public final class C28652a {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x02e8 A[Catch:{ JSONException -> 0x02fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0433  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.ugc.aweme.feed.param.FeedParam m94276a(android.app.Activity r99) {
        /*
            android.content.Intent r0 = r99.getIntent()
            java.lang.String r1 = "refer"
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.String r2 = "id"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.String r3 = "cid"
            java.lang.String r3 = r0.getStringExtra(r3)
            java.lang.String r4 = "ids"
            java.lang.String r4 = r0.getStringExtra(r4)
            java.lang.String r5 = "userid"
            java.lang.String r5 = r0.getStringExtra(r5)
            java.lang.String r6 = "video_from"
            java.lang.String r6 = r0.getStringExtra(r6)
            java.lang.String r7 = "video_challenge_profile_from"
            java.lang.String r7 = r0.getStringExtra(r7)
            java.lang.String r8 = "music_id"
            java.lang.String r8 = r0.getStringExtra(r8)
            java.lang.String r9 = "sticker_id"
            java.lang.String r9 = r0.getStringExtra(r9)
            java.lang.String r10 = "challenge_id"
            java.lang.String r10 = r0.getStringExtra(r10)
            java.lang.String r11 = "movie_id"
            java.lang.String r11 = r0.getStringExtra(r11)
            java.lang.String r12 = "extra_tutorial_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            java.lang.String r13 = "creation_id"
            java.lang.String r13 = r0.getStringExtra(r13)
            java.lang.String r14 = "channel_id"
            r15 = 0
            int r14 = r0.getIntExtra(r14, r15)
            java.lang.String r15 = "enter_method"
            java.lang.String r15 = r0.getStringExtra(r15)
            r16 = r14
            java.lang.String r14 = "poi_id"
            java.lang.String r14 = r0.getStringExtra(r14)
            r17 = r13
            java.lang.String r13 = "spu_id"
            java.lang.String r13 = r0.getStringExtra(r13)
            r18 = r12
            java.lang.String r12 = "page_size"
            r19 = r11
            r11 = 20
            int r11 = r0.getIntExtra(r12, r11)
            java.lang.String r12 = "promotion_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            r20 = r12
            java.lang.String r12 = "product_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            r21 = r12
            java.lang.String r12 = "carrier_type"
            java.lang.String r12 = r0.getStringExtra(r12)
            r22 = r12
            java.lang.String r12 = "refer_seed_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            r23 = r12
            java.lang.String r12 = "refer_seed_name"
            java.lang.String r12 = r0.getStringExtra(r12)
            r24 = r12
            java.lang.String r12 = "data_type"
            java.lang.String r12 = r0.getStringExtra(r12)
            r25 = r12
            java.lang.String r12 = "video_type"
            r26 = r11
            r11 = -1
            int r12 = r0.getIntExtra(r12, r11)
            java.lang.String r11 = "from_uid"
            java.lang.String r11 = r0.getStringExtra(r11)
            r27 = r11
            java.lang.String r11 = "from_token"
            r0.getStringExtra(r11)
            java.lang.String r11 = "query_aweme_mode"
            java.lang.String r11 = r0.getStringExtra(r11)
            r28 = r11
            java.lang.String r11 = "account_type"
            java.lang.String r11 = r0.getStringExtra(r11)
            r29 = r11
            java.lang.String r11 = "tab_name"
            java.lang.String r11 = r0.getStringExtra(r11)
            r30 = r11
            java.lang.String r11 = "push_params"
            java.lang.String r11 = r0.getStringExtra(r11)
            r31 = r11
            java.lang.String r11 = "like_enter_method"
            java.lang.String r11 = r0.getStringExtra(r11)
            r32 = r11
            java.lang.String r11 = "content_source"
            java.lang.String r11 = r0.getStringExtra(r11)
            r33 = r11
            java.lang.String r11 = "enter_from_request_id"
            java.lang.String r11 = r0.getStringExtra(r11)
            r34 = r11
            java.lang.String r11 = "previous_page"
            java.lang.String r11 = r0.getStringExtra(r11)
            r35 = r11
            java.lang.String r11 = "search_keyword"
            java.lang.String r11 = r0.getStringExtra(r11)
            r36 = r11
            java.lang.String r11 = "extra_previous_page_position"
            java.lang.String r11 = r0.getStringExtra(r11)
            r37 = r11
            java.lang.String r11 = "from_adsapp_activity"
            r38 = r12
            r12 = 0
            boolean r11 = r0.getBooleanExtra(r11, r12)
            r39 = r11
            java.lang.String r11 = "from_post_list"
            int r11 = r0.getIntExtra(r11, r12)
            java.lang.String r12 = "related_gid"
            java.lang.String r12 = r0.getStringExtra(r12)
            r40 = r12
            java.lang.String r12 = "type"
            r41 = r11
            r11 = 0
            int r12 = r0.getIntExtra(r12, r11)
            r42 = r12
            java.lang.String r12 = "is_recommend"
            boolean r12 = r0.getBooleanExtra(r12, r11)
            java.lang.String r11 = "cell_id"
            java.lang.String r11 = r0.getStringExtra(r11)
            r43 = r11
            java.lang.String r11 = "task_type"
            r44 = r12
            r12 = 0
            int r11 = r0.getIntExtra(r11, r12)
            java.lang.String r12 = "micro_game_station_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            r45 = r12
            java.lang.String r12 = "micro_game_station_hashtag"
            java.lang.String r12 = r0.getStringExtra(r12)
            r46 = r12
            java.lang.String r12 = "feeds_aweme_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            r47 = r12
            java.lang.String r12 = "hot_search_key"
            java.lang.String r12 = r0.getStringExtra(r12)
            r48 = r12
            java.lang.String r12 = "item_id_list"
            java.lang.String r12 = r0.getStringExtra(r12)
            r49 = r12
            java.lang.String r12 = "is_hot_search_key"
            r50 = r11
            r11 = 0
            boolean r12 = r0.getBooleanExtra(r12, r11)
            r51 = r12
            java.lang.String r12 = "hot_is_ad"
            boolean r12 = r0.getBooleanExtra(r12, r11)
            java.lang.String r11 = "outer_aweme_id"
            java.lang.String r11 = r0.getStringExtra(r11)
            r52 = r11
            java.lang.String r11 = "micro_game_station_count"
            r53 = r12
            r12 = 10
            int r11 = r0.getIntExtra(r11, r12)
            java.lang.String r12 = "micro_game_station_cursor"
            r54 = r11
            r11 = 0
            int r12 = r0.getIntExtra(r12, r11)
            java.lang.String r11 = "activity_id"
            java.lang.String r11 = r0.getStringExtra(r11)
            r55 = r11
            java.lang.String r11 = "new_source_type"
            java.lang.String r11 = r0.getStringExtra(r11)
            r56 = r11
            java.lang.String r11 = "new_source_id"
            java.lang.String r11 = r0.getStringExtra(r11)
            r57 = r11
            java.lang.String r11 = "comment_deleted"
            r58 = r12
            r12 = 0
            int r11 = r0.getIntExtra(r11, r12)
            java.lang.String r12 = "react_session_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            r59 = r12
            java.lang.String r12 = "poi_leaderboard"
            r60 = r11
            r11 = 0
            boolean r12 = r0.getBooleanExtra(r12, r11)
            java.lang.String r11 = "city_code"
            java.lang.String r11 = r0.getStringExtra(r11)
            r61 = r12
            java.lang.String r12 = "poi_class_code"
            r62 = r11
            r11 = 0
            int r12 = r0.getIntExtra(r12, r11)
            java.lang.String r11 = "district_code"
            java.lang.String r11 = r0.getStringExtra(r11)
            r63 = r11
            java.lang.String r11 = "sub_class"
            java.lang.String r11 = r0.getStringExtra(r11)
            r64 = r11
            java.lang.String r11 = "backend_type_code"
            java.lang.String r11 = r0.getStringExtra(r11)
            r65 = r11
            java.lang.String r11 = "page_poi_id"
            java.lang.String r11 = r0.getStringExtra(r11)
            r66 = r11
            java.lang.String r11 = "poi_street_id"
            java.lang.String r11 = r0.getStringExtra(r11)
            r67 = r11
            java.lang.String r11 = "poi_street_name"
            java.lang.String r11 = r0.getStringExtra(r11)
            r68 = r11
            java.lang.String r11 = "poi_cover_aweme_id"
            r70 = r12
            r69 = r13
            r12 = 0
            long r71 = r0.getLongExtra(r11, r12)
            java.lang.Long r11 = java.lang.Long.valueOf(r71)
            java.lang.String r12 = "poi_street_longitude"
            r73 = r14
            r13 = 0
            r74 = r11
            double r11 = r0.getDoubleExtra(r12, r13)
            r75 = r11
            java.lang.String r11 = "poi_street_latidute"
            double r11 = r0.getDoubleExtra(r11, r13)
            java.lang.String r13 = "poi_news"
            r14 = 0
            boolean r13 = r0.getBooleanExtra(r13, r14)
            java.lang.String r14 = "card_type"
            java.lang.String r14 = r0.getStringExtra(r14)
            r77 = r14
            java.lang.String r14 = "object_id"
            java.lang.String r14 = r0.getStringExtra(r14)
            r78 = r14
            java.lang.String r14 = "is_trending"
            r79 = r13
            r13 = 0
            boolean r14 = r0.getBooleanExtra(r14, r13)
            java.lang.String r13 = "mix_from_order"
            java.lang.String r13 = r0.getStringExtra(r13)
            r80 = r14
            java.lang.String r14 = "cur_poi_lat"
            java.lang.String r14 = r0.getStringExtra(r14)
            r81 = r13
            java.lang.String r13 = "cur_poi_lng"
            java.lang.String r13 = r0.getStringExtra(r13)
            r82 = r13
            java.lang.String r13 = "process_id"
            java.lang.String r13 = r0.getStringExtra(r13)
            r83 = r13
            java.lang.String r13 = "level1_comment_deleted"
            r84 = r14
            r14 = 0
            int r13 = r0.getIntExtra(r13, r14)
            java.lang.String r14 = "show_vote"
            java.lang.String r14 = r0.getStringExtra(r14)     // Catch:{ Exception -> 0x0291 }
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ Exception -> 0x0291 }
            r85 = r11
            r11 = 1
            if (r14 != r11) goto L_0x0294
            r12 = 1
            goto L_0x0295
        L_0x0291:
            r85 = r11
            r11 = 1
        L_0x0294:
            r12 = 0
        L_0x0295:
            java.lang.String r14 = "comment_force_open_reply"
            r87 = r12
            r12 = 0
            int r14 = r0.getIntExtra(r14, r12)
            if (r14 != r11) goto L_0x02a2
            r12 = 1
            goto L_0x02a3
        L_0x02a2:
            r12 = 0
        L_0x02a3:
            java.lang.String r14 = "show_vote"
            java.lang.String r14 = r0.getStringExtra(r14)     // Catch:{ Exception -> 0x02b3 }
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ Exception -> 0x02b3 }
            if (r14 != r11) goto L_0x02b1
            r11 = 1
            goto L_0x02b5
        L_0x02b1:
            r11 = 0
            goto L_0x02b5
        L_0x02b3:
            r11 = r87
        L_0x02b5:
            java.lang.String r14 = "from_group_id"
            java.lang.String r14 = r0.getStringExtra(r14)
            r88 = r12
            java.lang.String r12 = "refer_commodity_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            r89 = r13
            java.lang.String r13 = "video_current_position"
            r90 = r11
            r91 = r12
            r11 = 0
            long r11 = r0.getLongExtra(r13, r11)
            java.lang.String r13 = "tracker_data"
            java.lang.String r13 = r0.getStringExtra(r13)
            r92 = r14
            java.lang.String r14 = "isChain"
            r93 = r11
            r11 = 0
            boolean r12 = r0.getBooleanExtra(r14, r11)
            boolean r11 = android.text.TextUtils.isEmpty(r13)     // Catch:{ JSONException -> 0x02fc }
            if (r11 != 0) goto L_0x02fc
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02fc }
            r11.<init>(r13)     // Catch:{ JSONException -> 0x02fc }
            java.lang.String r14 = "previous_page"
            boolean r14 = r11.has(r14)     // Catch:{ JSONException -> 0x02fc }
            if (r14 == 0) goto L_0x02fc
            java.lang.String r14 = "previous_page"
            java.lang.String r11 = r11.getString(r14)     // Catch:{ JSONException -> 0x02fc }
            goto L_0x02fe
        L_0x02fc:
            r11 = r35
        L_0x02fe:
            java.lang.String r14 = "enter_from"
            java.lang.String r14 = r0.getStringExtra(r14)
            if (r14 != 0) goto L_0x0308
            java.lang.String r14 = ""
        L_0x0308:
            r95 = r12
            java.lang.String r12 = "tab_text"
            java.lang.String r12 = r0.getStringExtra(r12)
            r96 = r12
            java.lang.String r12 = "detail_cell_type"
            r97 = r13
            r13 = 0
            int r12 = r0.getIntExtra(r12, r13)
            java.lang.String r13 = "poi_tab_type"
            java.lang.String r13 = r0.getStringExtra(r13)
            java.lang.String r1 = m94277a(r1, r14)
            r98 = r14
            com.ss.android.ugc.aweme.feed.param.FeedParam r14 = new com.ss.android.ugc.aweme.feed.param.FeedParam
            r14.<init>()
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r14.setEventType(r1)
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setAid(r2)
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setCid(r3)
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setIds(r4)
            if (r5 != 0) goto L_0x0340
            java.lang.String r5 = ""
        L_0x0340:
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setUid(r5)
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setFrom(r6)
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setChallengeProfileFrom(r7)
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setMusicId(r8)
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setStickerId(r9)
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setChallengeId(r10)
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setEnterMethodValue(r15)
            r2 = r73
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setPoiId(r2)
            r2 = r69
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setSpuId(r2)
            r2 = r26
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setPageSize(r2)
            r2 = r19
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setMvId(r2)
            r2 = r18
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setTutorialId(r2)
            r2 = r17
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setCreationId(r2)
            r2 = r16
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setChannelId(r2)
            r2 = r21
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setProductId(r2)
            r2 = r20
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setPromotionId(r2)
            r2 = r22
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setCarrierType(r2)
            r2 = r23
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setReferSeedId(r2)
            r2 = r24
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setReferSeedName(r2)
            r2 = r25
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setDataType(r2)
            r2 = r38
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setVideoType(r2)
            r2 = r27
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setShareUserId(r2)
            r2 = r28
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setQueryAwemeMode(r2)
            r2 = r29
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setAccountType(r2)
            r2 = r30
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setTabName(r2)
            r2 = r31
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setPushParams(r2)
            r2 = r32
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setLikeEnterMethod(r2)
            r2 = r33
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setContentSource(r2)
            r2 = r34
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setEnterFromRequestId(r2)
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setPreviousPage(r11)
            r2 = r36
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setSearchKeyword(r2)
            r2 = r37
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setPreviousPagePosition(r2)
            r2 = r39
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setFromAdsActivity(r2)
            r2 = r44
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setRecommend(r2)
            r2 = r42
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setType(r2)
            r2 = r43
            com.ss.android.ugc.aweme.feed.param.FeedParam r1 = r1.setCellId(r2)
            java.lang.String r2 = "index"
            r3 = -1
            int r0 = r0.getIntExtra(r2, r3)
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r1.setIndex(r0)
            r1 = r41
            r11 = 1
            if (r1 != r11) goto L_0x041a
            r1 = 1
            goto L_0x041b
        L_0x041a:
            r1 = 0
        L_0x041b:
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setFromPostList(r1)
            r1 = r50
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setTaskType(r1)
            r2 = 2
            if (r1 != r2) goto L_0x042a
            r2 = 1
            goto L_0x042b
        L_0x042a:
            r2 = 0
        L_0x042b:
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setShowCommentAfterOpen(r2)
            r2 = 3
            if (r1 != r2) goto L_0x0433
            goto L_0x0434
        L_0x0433:
            r11 = 0
        L_0x0434:
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setShowShareAfterOpen(r11)
            r1 = r40
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setRelatedId(r1)
            r1 = r45
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setMicroAppId(r1)
            r1 = r46
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setHashTagName(r1)
            r1 = r54
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setCount(r1)
            r1 = r47
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setFeedsAwemeId(r1)
            r1 = r48
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setHotSearch(r1)
            r1 = r49
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setItemIdList(r1)
            r1 = r51
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setFromHotSearchRanking(r1)
            r1 = r58
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setCursor(r1)
            r11 = r90
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setShowVote(r11)
            r1 = r53
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setAdSpot(r1)
            r1 = r52
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setOutAwemeId(r1)
            r1 = r93
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setVideoCurrentPosition(r1)
            r1 = r55
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setActivityId(r1)
            r1 = r56
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setNewSourceType(r1)
            r1 = r57
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setNewSourceId(r1)
            r1 = r60
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setCommentDeleted(r1)
            r1 = r92
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setFromGroupId(r1)
            r1 = r91
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setReferCommodityId(r1)
            r1 = r59
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setReactSessionId(r1)
            r1 = r62
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setCityCode(r1)
            r1 = r70
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setPoiClassCode(r1)
            r1 = r61
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setShowVideoRank(r1)
            r1 = r63
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setDistrictCode(r1)
            r1 = r64
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setSubClass(r1)
            r1 = r97
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setTracker(r1)
            r1 = r89
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setLevel1CommentDeleted(r1)
            r11 = r88
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setCommentForceOpenReply(r11)
            r1 = r95
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setChain(r1)
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setPoiTabType(r13)
            r1 = r96
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setTabText(r1)
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setCellDetailType(r12)
            r1 = r65
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setBackendType(r1)
            r1 = r66
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setPagePoiId(r1)
            r1 = r67
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setStreetId(r1)
            r1 = r85
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setStreetLatitude(r1)
            r1 = r75
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setStreetLongitude(r1)
            r1 = r84
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setCurPoiLat(r1)
            r1 = r82
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setCurPoiLng(r1)
            r1 = r68
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setStreetName(r1)
            r1 = r74
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setStreetAwemeId(r1)
            r1 = r79
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setShowPoiNews(r1)
            r14 = r98
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setHotEnterMethod(r14)
            r1 = r77
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setCardType(r1)
            r1 = r78
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setObjectId(r1)
            r1 = r81
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setMixFromOrder(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r80)
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setTrending(r1)
            r1 = r83
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setProcessId(r1)
            r1 = r99
            com.p280ss.android.ugc.aweme.feed.param.FeedParamProvider.C28651a.m94275a(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.param.C28652a.m94276a(android.app.Activity):com.ss.android.ugc.aweme.feed.param.FeedParam");
    }

    /* renamed from: a */
    private static String m94277a(String str, String str2) {
        if (TextUtils.equals(str, "page_challenge_mention")) {
            if (TextUtils.isEmpty(str2)) {
                return str;
            }
        } else if (str != null) {
            return str;
        }
        return str2;
    }
}
