package com.p280ss.ugc.aweme.proto;

import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.PoiStructV2 */
public final class PoiStructV2 extends Message<PoiStructV2, Builder> {
    public static final ProtoAdapter<PoiStructV2> ADAPTER = new ProtoAdapter_PoiStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.AddressStructV2#ADAPTER", tag = 12)
    public AddressStructV2 address_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 26)
    public String business_area_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 14)
    public Integer collect_stat;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 42)
    public String collected_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 24)
    public Double cost;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 7)
    public UrlStructV2 cover_hd;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 39)
    public UrlStructV2 cover_item;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 8)
    public UrlStructV2 cover_large;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 9)
    public UrlStructV2 cover_medium;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 10)
    public UrlStructV2 cover_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public String distance;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 17)
    public Integer expand_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 19)
    public UrlStructV2 icon_on_entry;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 20)
    public UrlStructV2 icon_on_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 18)
    public UrlStructV2 icon_on_map;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 13)
    public Integer icon_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 41)
    public Boolean is_admin_area;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 32)
    public Boolean is_candidate;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 27)
    public Boolean is_local_city;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 36)
    public Integer is_show_halfcard;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 40)
    public Boolean is_top_recommend;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer item_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 28)
    public String option_name;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PoiBackendTypeStructV2#ADAPTER", tag = 38)
    public PoiBackendTypeStructV2 poi_backend_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PoiCardStructV2#ADAPTER", tag = 33)
    public PoiCardStructV2 poi_card;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PoiFrontendTypeStructV2#ADAPTER", label = Label.REPEATED, tag = 37)
    public List<PoiFrontendTypeStructV2> poi_frontend_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String poi_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 16)
    public Double poi_latitude;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 15)
    public Double poi_longitude;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String poi_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 25)
    public String poi_rank_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 29)
    public String poi_subtitle;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 34)
    public Integer poi_subtitle_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 21)
    public Integer poi_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 22)
    public String poi_voucher;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 23)
    public Double rating;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ShareStructV2#ADAPTER", tag = 6)
    public ShareStructV2 share_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 31)
    public Integer show_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 30)
    public String sp_source;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String type_code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer user_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 43)
    public String view_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REPEATED, tag = 35)
    public List<String> voucher_release_areas;

    /* renamed from: com.ss.ugc.aweme.proto.PoiStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PoiStructV2, Builder> {
        public AddressStructV2 address_info;
        public String business_area_name;
        public Integer collect_stat;
        public String collected_count;
        public Double cost;
        public UrlStructV2 cover_hd;
        public UrlStructV2 cover_item;
        public UrlStructV2 cover_large;
        public UrlStructV2 cover_medium;
        public UrlStructV2 cover_thumb;
        public String distance;
        public Integer expand_type;
        public UrlStructV2 icon_on_entry;
        public UrlStructV2 icon_on_info;
        public UrlStructV2 icon_on_map;
        public Integer icon_type;
        public Boolean is_admin_area;
        public Boolean is_candidate;
        public Boolean is_local_city;
        public Integer is_show_halfcard;
        public Boolean is_top_recommend;
        public Integer item_count;
        public String option_name;
        public PoiBackendTypeStructV2 poi_backend_type;
        public PoiCardStructV2 poi_card;
        public List<PoiFrontendTypeStructV2> poi_frontend_type = Internal.newMutableList();
        public String poi_id;
        public Double poi_latitude;
        public Double poi_longitude;
        public String poi_name;
        public String poi_rank_desc;
        public String poi_subtitle;
        public Integer poi_subtitle_type;
        public Integer poi_type;
        public String poi_voucher;
        public Double rating;
        public ShareStructV2 share_info;
        public Integer show_type;
        public String sp_source;
        public String type_code;
        public Integer user_count;
        public String view_count;
        public List<String> voucher_release_areas = Internal.newMutableList();

        public final PoiStructV2 build() {
            PoiStructV2 poiStructV2 = new PoiStructV2(this.poi_id, this.poi_name, this.type_code, this.user_count, this.item_count, this.share_info, this.cover_hd, this.cover_large, this.cover_medium, this.cover_thumb, this.distance, this.address_info, this.icon_type, this.collect_stat, this.poi_longitude, this.poi_latitude, this.expand_type, this.icon_on_map, this.icon_on_entry, this.icon_on_info, this.poi_type, this.poi_voucher, this.rating, this.cost, this.poi_rank_desc, this.business_area_name, this.is_local_city, this.option_name, this.poi_subtitle, this.sp_source, this.show_type, this.is_candidate, this.poi_card, this.poi_subtitle_type, this.voucher_release_areas, this.is_show_halfcard, this.poi_frontend_type, this.poi_backend_type, this.cover_item, this.is_top_recommend, this.is_admin_area, this.collected_count, this.view_count, super.buildUnknownFields());
            return poiStructV2;
        }

        public final Builder address_info(AddressStructV2 addressStructV2) {
            this.address_info = addressStructV2;
            return this;
        }

        public final Builder business_area_name(String str) {
            this.business_area_name = str;
            return this;
        }

        public final Builder collect_stat(Integer num) {
            this.collect_stat = num;
            return this;
        }

        public final Builder collected_count(String str) {
            this.collected_count = str;
            return this;
        }

        public final Builder cost(Double d) {
            this.cost = d;
            return this;
        }

        public final Builder cover_hd(UrlStructV2 urlStructV2) {
            this.cover_hd = urlStructV2;
            return this;
        }

        public final Builder cover_item(UrlStructV2 urlStructV2) {
            this.cover_item = urlStructV2;
            return this;
        }

        public final Builder cover_large(UrlStructV2 urlStructV2) {
            this.cover_large = urlStructV2;
            return this;
        }

        public final Builder cover_medium(UrlStructV2 urlStructV2) {
            this.cover_medium = urlStructV2;
            return this;
        }

        public final Builder cover_thumb(UrlStructV2 urlStructV2) {
            this.cover_thumb = urlStructV2;
            return this;
        }

        public final Builder distance(String str) {
            this.distance = str;
            return this;
        }

        public final Builder expand_type(Integer num) {
            this.expand_type = num;
            return this;
        }

        public final Builder icon_on_entry(UrlStructV2 urlStructV2) {
            this.icon_on_entry = urlStructV2;
            return this;
        }

        public final Builder icon_on_info(UrlStructV2 urlStructV2) {
            this.icon_on_info = urlStructV2;
            return this;
        }

        public final Builder icon_on_map(UrlStructV2 urlStructV2) {
            this.icon_on_map = urlStructV2;
            return this;
        }

        public final Builder icon_type(Integer num) {
            this.icon_type = num;
            return this;
        }

        public final Builder is_admin_area(Boolean bool) {
            this.is_admin_area = bool;
            return this;
        }

        public final Builder is_candidate(Boolean bool) {
            this.is_candidate = bool;
            return this;
        }

        public final Builder is_local_city(Boolean bool) {
            this.is_local_city = bool;
            return this;
        }

        public final Builder is_show_halfcard(Integer num) {
            this.is_show_halfcard = num;
            return this;
        }

        public final Builder is_top_recommend(Boolean bool) {
            this.is_top_recommend = bool;
            return this;
        }

        public final Builder item_count(Integer num) {
            this.item_count = num;
            return this;
        }

        public final Builder option_name(String str) {
            this.option_name = str;
            return this;
        }

        public final Builder poi_backend_type(PoiBackendTypeStructV2 poiBackendTypeStructV2) {
            this.poi_backend_type = poiBackendTypeStructV2;
            return this;
        }

        public final Builder poi_card(PoiCardStructV2 poiCardStructV2) {
            this.poi_card = poiCardStructV2;
            return this;
        }

        public final Builder poi_id(String str) {
            this.poi_id = str;
            return this;
        }

        public final Builder poi_latitude(Double d) {
            this.poi_latitude = d;
            return this;
        }

        public final Builder poi_longitude(Double d) {
            this.poi_longitude = d;
            return this;
        }

        public final Builder poi_name(String str) {
            this.poi_name = str;
            return this;
        }

        public final Builder poi_rank_desc(String str) {
            this.poi_rank_desc = str;
            return this;
        }

        public final Builder poi_subtitle(String str) {
            this.poi_subtitle = str;
            return this;
        }

        public final Builder poi_subtitle_type(Integer num) {
            this.poi_subtitle_type = num;
            return this;
        }

        public final Builder poi_type(Integer num) {
            this.poi_type = num;
            return this;
        }

        public final Builder poi_voucher(String str) {
            this.poi_voucher = str;
            return this;
        }

        public final Builder rating(Double d) {
            this.rating = d;
            return this;
        }

        public final Builder share_info(ShareStructV2 shareStructV2) {
            this.share_info = shareStructV2;
            return this;
        }

        public final Builder show_type(Integer num) {
            this.show_type = num;
            return this;
        }

        public final Builder sp_source(String str) {
            this.sp_source = str;
            return this;
        }

        public final Builder type_code(String str) {
            this.type_code = str;
            return this;
        }

        public final Builder user_count(Integer num) {
            this.user_count = num;
            return this;
        }

        public final Builder view_count(String str) {
            this.view_count = str;
            return this;
        }

        public final Builder poi_frontend_type(List<PoiFrontendTypeStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.poi_frontend_type = list;
            return this;
        }

        public final Builder voucher_release_areas(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.voucher_release_areas = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.PoiStructV2$ProtoAdapter_PoiStructV2 */
    static final class ProtoAdapter_PoiStructV2 extends ProtoAdapter<PoiStructV2> {
        public ProtoAdapter_PoiStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, PoiStructV2.class);
        }

        public final int encodedSize(PoiStructV2 poiStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, poiStructV2.poi_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, poiStructV2.poi_name) + ProtoAdapter.STRING.encodedSizeWithTag(3, poiStructV2.type_code) + ProtoAdapter.INT32.encodedSizeWithTag(4, poiStructV2.user_count) + ProtoAdapter.INT32.encodedSizeWithTag(5, poiStructV2.item_count) + ShareStructV2.ADAPTER.encodedSizeWithTag(6, poiStructV2.share_info) + UrlStructV2.ADAPTER.encodedSizeWithTag(7, poiStructV2.cover_hd) + UrlStructV2.ADAPTER.encodedSizeWithTag(8, poiStructV2.cover_large) + UrlStructV2.ADAPTER.encodedSizeWithTag(9, poiStructV2.cover_medium) + UrlStructV2.ADAPTER.encodedSizeWithTag(10, poiStructV2.cover_thumb) + ProtoAdapter.STRING.encodedSizeWithTag(11, poiStructV2.distance) + AddressStructV2.ADAPTER.encodedSizeWithTag(12, poiStructV2.address_info) + ProtoAdapter.INT32.encodedSizeWithTag(13, poiStructV2.icon_type) + ProtoAdapter.INT32.encodedSizeWithTag(14, poiStructV2.collect_stat) + ProtoAdapter.DOUBLE.encodedSizeWithTag(15, poiStructV2.poi_longitude) + ProtoAdapter.DOUBLE.encodedSizeWithTag(16, poiStructV2.poi_latitude) + ProtoAdapter.INT32.encodedSizeWithTag(17, poiStructV2.expand_type) + UrlStructV2.ADAPTER.encodedSizeWithTag(18, poiStructV2.icon_on_map) + UrlStructV2.ADAPTER.encodedSizeWithTag(19, poiStructV2.icon_on_entry) + UrlStructV2.ADAPTER.encodedSizeWithTag(20, poiStructV2.icon_on_info) + ProtoAdapter.INT32.encodedSizeWithTag(21, poiStructV2.poi_type) + ProtoAdapter.STRING.encodedSizeWithTag(22, poiStructV2.poi_voucher) + ProtoAdapter.DOUBLE.encodedSizeWithTag(23, poiStructV2.rating) + ProtoAdapter.DOUBLE.encodedSizeWithTag(24, poiStructV2.cost) + ProtoAdapter.STRING.encodedSizeWithTag(25, poiStructV2.poi_rank_desc) + ProtoAdapter.STRING.encodedSizeWithTag(26, poiStructV2.business_area_name) + ProtoAdapter.BOOL.encodedSizeWithTag(27, poiStructV2.is_local_city) + ProtoAdapter.STRING.encodedSizeWithTag(28, poiStructV2.option_name) + ProtoAdapter.STRING.encodedSizeWithTag(29, poiStructV2.poi_subtitle) + ProtoAdapter.STRING.encodedSizeWithTag(30, poiStructV2.sp_source) + ProtoAdapter.INT32.encodedSizeWithTag(31, poiStructV2.show_type) + ProtoAdapter.BOOL.encodedSizeWithTag(32, poiStructV2.is_candidate) + PoiCardStructV2.ADAPTER.encodedSizeWithTag(33, poiStructV2.poi_card) + ProtoAdapter.INT32.encodedSizeWithTag(34, poiStructV2.poi_subtitle_type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(35, poiStructV2.voucher_release_areas) + ProtoAdapter.INT32.encodedSizeWithTag(36, poiStructV2.is_show_halfcard) + PoiFrontendTypeStructV2.ADAPTER.asRepeated().encodedSizeWithTag(37, poiStructV2.poi_frontend_type) + PoiBackendTypeStructV2.ADAPTER.encodedSizeWithTag(38, poiStructV2.poi_backend_type) + UrlStructV2.ADAPTER.encodedSizeWithTag(39, poiStructV2.cover_item) + ProtoAdapter.BOOL.encodedSizeWithTag(40, poiStructV2.is_top_recommend) + ProtoAdapter.BOOL.encodedSizeWithTag(41, poiStructV2.is_admin_area) + ProtoAdapter.STRING.encodedSizeWithTag(42, poiStructV2.collected_count) + ProtoAdapter.STRING.encodedSizeWithTag(43, poiStructV2.view_count) + poiStructV2.unknownFields().size();
        }

        public final PoiStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.poi_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.poi_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.type_code((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.user_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.item_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.share_info((ShareStructV2) ShareStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.cover_hd((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.cover_large((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.cover_medium((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            builder.cover_thumb((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            builder.distance((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 12:
                            builder.address_info((AddressStructV2) AddressStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 13:
                            builder.icon_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 14:
                            builder.collect_stat((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 15:
                            builder.poi_longitude((Double) ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 16:
                            builder.poi_latitude((Double) ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 17:
                            builder.expand_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 18:
                            builder.icon_on_map((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            builder.icon_on_entry((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 20:
                            builder.icon_on_info((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 21:
                            builder.poi_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 22:
                            builder.poi_voucher((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 23:
                            builder.rating((Double) ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 24:
                            builder.cost((Double) ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 25:
                            builder.poi_rank_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                            builder.business_area_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                            builder.is_local_city((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 28:
                            builder.option_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 29:
                            builder.poi_subtitle((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 30:
                            builder.sp_source((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 31:
                            builder.show_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 32:
                            builder.is_candidate((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 33:
                            builder.poi_card((PoiCardStructV2) PoiCardStructV2.ADAPTER.decode(protoReader));
                            break;
                        case BaseNotice.CHALLENGE /*34*/:
                            builder.poi_subtitle_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 35:
                            builder.voucher_release_areas.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 36:
                            builder.is_show_halfcard((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 37:
                            builder.poi_frontend_type.add(PoiFrontendTypeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 38:
                            builder.poi_backend_type((PoiBackendTypeStructV2) PoiBackendTypeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 39:
                            builder.cover_item((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 40:
                            builder.is_top_recommend((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case BaseNotice.LIKE /*41*/:
                            builder.is_admin_area((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 42:
                            builder.collected_count((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 43:
                            builder.view_count((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, PoiStructV2 poiStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, poiStructV2.poi_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, poiStructV2.poi_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, poiStructV2.type_code);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, poiStructV2.user_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, poiStructV2.item_count);
            ShareStructV2.ADAPTER.encodeWithTag(protoWriter, 6, poiStructV2.share_info);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 7, poiStructV2.cover_hd);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 8, poiStructV2.cover_large);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 9, poiStructV2.cover_medium);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 10, poiStructV2.cover_thumb);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, poiStructV2.distance);
            AddressStructV2.ADAPTER.encodeWithTag(protoWriter, 12, poiStructV2.address_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, poiStructV2.icon_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, poiStructV2.collect_stat);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 15, poiStructV2.poi_longitude);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 16, poiStructV2.poi_latitude);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, poiStructV2.expand_type);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 18, poiStructV2.icon_on_map);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 19, poiStructV2.icon_on_entry);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 20, poiStructV2.icon_on_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 21, poiStructV2.poi_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, poiStructV2.poi_voucher);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 23, poiStructV2.rating);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 24, poiStructV2.cost);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, poiStructV2.poi_rank_desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, poiStructV2.business_area_name);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, poiStructV2.is_local_city);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 28, poiStructV2.option_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 29, poiStructV2.poi_subtitle);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 30, poiStructV2.sp_source);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 31, poiStructV2.show_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 32, poiStructV2.is_candidate);
            PoiCardStructV2.ADAPTER.encodeWithTag(protoWriter, 33, poiStructV2.poi_card);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 34, poiStructV2.poi_subtitle_type);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 35, poiStructV2.voucher_release_areas);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 36, poiStructV2.is_show_halfcard);
            PoiFrontendTypeStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 37, poiStructV2.poi_frontend_type);
            PoiBackendTypeStructV2.ADAPTER.encodeWithTag(protoWriter, 38, poiStructV2.poi_backend_type);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 39, poiStructV2.cover_item);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 40, poiStructV2.is_top_recommend);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 41, poiStructV2.is_admin_area);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 42, poiStructV2.collected_count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 43, poiStructV2.view_count);
            protoWriter.writeBytes(poiStructV2.unknownFields());
        }
    }

    public PoiStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.poi_id = this.poi_id;
        builder.poi_name = this.poi_name;
        builder.type_code = this.type_code;
        builder.user_count = this.user_count;
        builder.item_count = this.item_count;
        builder.share_info = this.share_info;
        builder.cover_hd = this.cover_hd;
        builder.cover_large = this.cover_large;
        builder.cover_medium = this.cover_medium;
        builder.cover_thumb = this.cover_thumb;
        builder.distance = this.distance;
        builder.address_info = this.address_info;
        builder.icon_type = this.icon_type;
        builder.collect_stat = this.collect_stat;
        builder.poi_longitude = this.poi_longitude;
        builder.poi_latitude = this.poi_latitude;
        builder.expand_type = this.expand_type;
        builder.icon_on_map = this.icon_on_map;
        builder.icon_on_entry = this.icon_on_entry;
        builder.icon_on_info = this.icon_on_info;
        builder.poi_type = this.poi_type;
        builder.poi_voucher = this.poi_voucher;
        builder.rating = this.rating;
        builder.cost = this.cost;
        builder.poi_rank_desc = this.poi_rank_desc;
        builder.business_area_name = this.business_area_name;
        builder.is_local_city = this.is_local_city;
        builder.option_name = this.option_name;
        builder.poi_subtitle = this.poi_subtitle;
        builder.sp_source = this.sp_source;
        builder.show_type = this.show_type;
        builder.is_candidate = this.is_candidate;
        builder.poi_card = this.poi_card;
        builder.poi_subtitle_type = this.poi_subtitle_type;
        builder.voucher_release_areas = Internal.copyOf("voucher_release_areas", this.voucher_release_areas);
        builder.is_show_halfcard = this.is_show_halfcard;
        builder.poi_frontend_type = Internal.copyOf("poi_frontend_type", this.poi_frontend_type);
        builder.poi_backend_type = this.poi_backend_type;
        builder.cover_item = this.cover_item;
        builder.is_top_recommend = this.is_top_recommend;
        builder.is_admin_area = this.is_admin_area;
        builder.collected_count = this.collected_count;
        builder.view_count = this.view_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41 = this.hashCode;
        if (i41 != 0) {
            return i41;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i42 = 0;
        if (this.poi_id != null) {
            i = this.poi_id.hashCode();
        } else {
            i = 0;
        }
        int i43 = (hashCode + i) * 37;
        if (this.poi_name != null) {
            i2 = this.poi_name.hashCode();
        } else {
            i2 = 0;
        }
        int i44 = (i43 + i2) * 37;
        if (this.type_code != null) {
            i3 = this.type_code.hashCode();
        } else {
            i3 = 0;
        }
        int i45 = (i44 + i3) * 37;
        if (this.user_count != null) {
            i4 = this.user_count.hashCode();
        } else {
            i4 = 0;
        }
        int i46 = (i45 + i4) * 37;
        if (this.item_count != null) {
            i5 = this.item_count.hashCode();
        } else {
            i5 = 0;
        }
        int i47 = (i46 + i5) * 37;
        if (this.share_info != null) {
            i6 = this.share_info.hashCode();
        } else {
            i6 = 0;
        }
        int i48 = (i47 + i6) * 37;
        if (this.cover_hd != null) {
            i7 = this.cover_hd.hashCode();
        } else {
            i7 = 0;
        }
        int i49 = (i48 + i7) * 37;
        if (this.cover_large != null) {
            i8 = this.cover_large.hashCode();
        } else {
            i8 = 0;
        }
        int i50 = (i49 + i8) * 37;
        if (this.cover_medium != null) {
            i9 = this.cover_medium.hashCode();
        } else {
            i9 = 0;
        }
        int i51 = (i50 + i9) * 37;
        if (this.cover_thumb != null) {
            i10 = this.cover_thumb.hashCode();
        } else {
            i10 = 0;
        }
        int i52 = (i51 + i10) * 37;
        if (this.distance != null) {
            i11 = this.distance.hashCode();
        } else {
            i11 = 0;
        }
        int i53 = (i52 + i11) * 37;
        if (this.address_info != null) {
            i12 = this.address_info.hashCode();
        } else {
            i12 = 0;
        }
        int i54 = (i53 + i12) * 37;
        if (this.icon_type != null) {
            i13 = this.icon_type.hashCode();
        } else {
            i13 = 0;
        }
        int i55 = (i54 + i13) * 37;
        if (this.collect_stat != null) {
            i14 = this.collect_stat.hashCode();
        } else {
            i14 = 0;
        }
        int i56 = (i55 + i14) * 37;
        if (this.poi_longitude != null) {
            i15 = this.poi_longitude.hashCode();
        } else {
            i15 = 0;
        }
        int i57 = (i56 + i15) * 37;
        if (this.poi_latitude != null) {
            i16 = this.poi_latitude.hashCode();
        } else {
            i16 = 0;
        }
        int i58 = (i57 + i16) * 37;
        if (this.expand_type != null) {
            i17 = this.expand_type.hashCode();
        } else {
            i17 = 0;
        }
        int i59 = (i58 + i17) * 37;
        if (this.icon_on_map != null) {
            i18 = this.icon_on_map.hashCode();
        } else {
            i18 = 0;
        }
        int i60 = (i59 + i18) * 37;
        if (this.icon_on_entry != null) {
            i19 = this.icon_on_entry.hashCode();
        } else {
            i19 = 0;
        }
        int i61 = (i60 + i19) * 37;
        if (this.icon_on_info != null) {
            i20 = this.icon_on_info.hashCode();
        } else {
            i20 = 0;
        }
        int i62 = (i61 + i20) * 37;
        if (this.poi_type != null) {
            i21 = this.poi_type.hashCode();
        } else {
            i21 = 0;
        }
        int i63 = (i62 + i21) * 37;
        if (this.poi_voucher != null) {
            i22 = this.poi_voucher.hashCode();
        } else {
            i22 = 0;
        }
        int i64 = (i63 + i22) * 37;
        if (this.rating != null) {
            i23 = this.rating.hashCode();
        } else {
            i23 = 0;
        }
        int i65 = (i64 + i23) * 37;
        if (this.cost != null) {
            i24 = this.cost.hashCode();
        } else {
            i24 = 0;
        }
        int i66 = (i65 + i24) * 37;
        if (this.poi_rank_desc != null) {
            i25 = this.poi_rank_desc.hashCode();
        } else {
            i25 = 0;
        }
        int i67 = (i66 + i25) * 37;
        if (this.business_area_name != null) {
            i26 = this.business_area_name.hashCode();
        } else {
            i26 = 0;
        }
        int i68 = (i67 + i26) * 37;
        if (this.is_local_city != null) {
            i27 = this.is_local_city.hashCode();
        } else {
            i27 = 0;
        }
        int i69 = (i68 + i27) * 37;
        if (this.option_name != null) {
            i28 = this.option_name.hashCode();
        } else {
            i28 = 0;
        }
        int i70 = (i69 + i28) * 37;
        if (this.poi_subtitle != null) {
            i29 = this.poi_subtitle.hashCode();
        } else {
            i29 = 0;
        }
        int i71 = (i70 + i29) * 37;
        if (this.sp_source != null) {
            i30 = this.sp_source.hashCode();
        } else {
            i30 = 0;
        }
        int i72 = (i71 + i30) * 37;
        if (this.show_type != null) {
            i31 = this.show_type.hashCode();
        } else {
            i31 = 0;
        }
        int i73 = (i72 + i31) * 37;
        if (this.is_candidate != null) {
            i32 = this.is_candidate.hashCode();
        } else {
            i32 = 0;
        }
        int i74 = (i73 + i32) * 37;
        if (this.poi_card != null) {
            i33 = this.poi_card.hashCode();
        } else {
            i33 = 0;
        }
        int i75 = (i74 + i33) * 37;
        if (this.poi_subtitle_type != null) {
            i34 = this.poi_subtitle_type.hashCode();
        } else {
            i34 = 0;
        }
        int hashCode2 = (((i75 + i34) * 37) + this.voucher_release_areas.hashCode()) * 37;
        if (this.is_show_halfcard != null) {
            i35 = this.is_show_halfcard.hashCode();
        } else {
            i35 = 0;
        }
        int hashCode3 = (((hashCode2 + i35) * 37) + this.poi_frontend_type.hashCode()) * 37;
        if (this.poi_backend_type != null) {
            i36 = this.poi_backend_type.hashCode();
        } else {
            i36 = 0;
        }
        int i76 = (hashCode3 + i36) * 37;
        if (this.cover_item != null) {
            i37 = this.cover_item.hashCode();
        } else {
            i37 = 0;
        }
        int i77 = (i76 + i37) * 37;
        if (this.is_top_recommend != null) {
            i38 = this.is_top_recommend.hashCode();
        } else {
            i38 = 0;
        }
        int i78 = (i77 + i38) * 37;
        if (this.is_admin_area != null) {
            i39 = this.is_admin_area.hashCode();
        } else {
            i39 = 0;
        }
        int i79 = (i78 + i39) * 37;
        if (this.collected_count != null) {
            i40 = this.collected_count.hashCode();
        } else {
            i40 = 0;
        }
        int i80 = (i79 + i40) * 37;
        if (this.view_count != null) {
            i42 = this.view_count.hashCode();
        }
        int i81 = i80 + i42;
        this.hashCode = i81;
        return i81;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.poi_id != null) {
            sb.append(", poi_id=");
            sb.append(this.poi_id);
        }
        if (this.poi_name != null) {
            sb.append(", poi_name=");
            sb.append(this.poi_name);
        }
        if (this.type_code != null) {
            sb.append(", type_code=");
            sb.append(this.type_code);
        }
        if (this.user_count != null) {
            sb.append(", user_count=");
            sb.append(this.user_count);
        }
        if (this.item_count != null) {
            sb.append(", item_count=");
            sb.append(this.item_count);
        }
        if (this.share_info != null) {
            sb.append(", share_info=");
            sb.append(this.share_info);
        }
        if (this.cover_hd != null) {
            sb.append(", cover_hd=");
            sb.append(this.cover_hd);
        }
        if (this.cover_large != null) {
            sb.append(", cover_large=");
            sb.append(this.cover_large);
        }
        if (this.cover_medium != null) {
            sb.append(", cover_medium=");
            sb.append(this.cover_medium);
        }
        if (this.cover_thumb != null) {
            sb.append(", cover_thumb=");
            sb.append(this.cover_thumb);
        }
        if (this.distance != null) {
            sb.append(", distance=");
            sb.append(this.distance);
        }
        if (this.address_info != null) {
            sb.append(", address_info=");
            sb.append(this.address_info);
        }
        if (this.icon_type != null) {
            sb.append(", icon_type=");
            sb.append(this.icon_type);
        }
        if (this.collect_stat != null) {
            sb.append(", collect_stat=");
            sb.append(this.collect_stat);
        }
        if (this.poi_longitude != null) {
            sb.append(", poi_longitude=");
            sb.append(this.poi_longitude);
        }
        if (this.poi_latitude != null) {
            sb.append(", poi_latitude=");
            sb.append(this.poi_latitude);
        }
        if (this.expand_type != null) {
            sb.append(", expand_type=");
            sb.append(this.expand_type);
        }
        if (this.icon_on_map != null) {
            sb.append(", icon_on_map=");
            sb.append(this.icon_on_map);
        }
        if (this.icon_on_entry != null) {
            sb.append(", icon_on_entry=");
            sb.append(this.icon_on_entry);
        }
        if (this.icon_on_info != null) {
            sb.append(", icon_on_info=");
            sb.append(this.icon_on_info);
        }
        if (this.poi_type != null) {
            sb.append(", poi_type=");
            sb.append(this.poi_type);
        }
        if (this.poi_voucher != null) {
            sb.append(", poi_voucher=");
            sb.append(this.poi_voucher);
        }
        if (this.rating != null) {
            sb.append(", rating=");
            sb.append(this.rating);
        }
        if (this.cost != null) {
            sb.append(", cost=");
            sb.append(this.cost);
        }
        if (this.poi_rank_desc != null) {
            sb.append(", poi_rank_desc=");
            sb.append(this.poi_rank_desc);
        }
        if (this.business_area_name != null) {
            sb.append(", business_area_name=");
            sb.append(this.business_area_name);
        }
        if (this.is_local_city != null) {
            sb.append(", is_local_city=");
            sb.append(this.is_local_city);
        }
        if (this.option_name != null) {
            sb.append(", option_name=");
            sb.append(this.option_name);
        }
        if (this.poi_subtitle != null) {
            sb.append(", poi_subtitle=");
            sb.append(this.poi_subtitle);
        }
        if (this.sp_source != null) {
            sb.append(", sp_source=");
            sb.append(this.sp_source);
        }
        if (this.show_type != null) {
            sb.append(", show_type=");
            sb.append(this.show_type);
        }
        if (this.is_candidate != null) {
            sb.append(", is_candidate=");
            sb.append(this.is_candidate);
        }
        if (this.poi_card != null) {
            sb.append(", poi_card=");
            sb.append(this.poi_card);
        }
        if (this.poi_subtitle_type != null) {
            sb.append(", poi_subtitle_type=");
            sb.append(this.poi_subtitle_type);
        }
        if (!this.voucher_release_areas.isEmpty()) {
            sb.append(", voucher_release_areas=");
            sb.append(this.voucher_release_areas);
        }
        if (this.is_show_halfcard != null) {
            sb.append(", is_show_halfcard=");
            sb.append(this.is_show_halfcard);
        }
        if (!this.poi_frontend_type.isEmpty()) {
            sb.append(", poi_frontend_type=");
            sb.append(this.poi_frontend_type);
        }
        if (this.poi_backend_type != null) {
            sb.append(", poi_backend_type=");
            sb.append(this.poi_backend_type);
        }
        if (this.cover_item != null) {
            sb.append(", cover_item=");
            sb.append(this.cover_item);
        }
        if (this.is_top_recommend != null) {
            sb.append(", is_top_recommend=");
            sb.append(this.is_top_recommend);
        }
        if (this.is_admin_area != null) {
            sb.append(", is_admin_area=");
            sb.append(this.is_admin_area);
        }
        if (this.collected_count != null) {
            sb.append(", collected_count=");
            sb.append(this.collected_count);
        }
        if (this.view_count != null) {
            sb.append(", view_count=");
            sb.append(this.view_count);
        }
        StringBuilder replace = sb.replace(0, 2, "PoiStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoiStructV2)) {
            return false;
        }
        PoiStructV2 poiStructV2 = (PoiStructV2) obj;
        if (!unknownFields().equals(poiStructV2.unknownFields()) || !Internal.equals(this.poi_id, poiStructV2.poi_id) || !Internal.equals(this.poi_name, poiStructV2.poi_name) || !Internal.equals(this.type_code, poiStructV2.type_code) || !Internal.equals(this.user_count, poiStructV2.user_count) || !Internal.equals(this.item_count, poiStructV2.item_count) || !Internal.equals(this.share_info, poiStructV2.share_info) || !Internal.equals(this.cover_hd, poiStructV2.cover_hd) || !Internal.equals(this.cover_large, poiStructV2.cover_large) || !Internal.equals(this.cover_medium, poiStructV2.cover_medium) || !Internal.equals(this.cover_thumb, poiStructV2.cover_thumb) || !Internal.equals(this.distance, poiStructV2.distance) || !Internal.equals(this.address_info, poiStructV2.address_info) || !Internal.equals(this.icon_type, poiStructV2.icon_type) || !Internal.equals(this.collect_stat, poiStructV2.collect_stat) || !Internal.equals(this.poi_longitude, poiStructV2.poi_longitude) || !Internal.equals(this.poi_latitude, poiStructV2.poi_latitude) || !Internal.equals(this.expand_type, poiStructV2.expand_type) || !Internal.equals(this.icon_on_map, poiStructV2.icon_on_map) || !Internal.equals(this.icon_on_entry, poiStructV2.icon_on_entry) || !Internal.equals(this.icon_on_info, poiStructV2.icon_on_info) || !Internal.equals(this.poi_type, poiStructV2.poi_type) || !Internal.equals(this.poi_voucher, poiStructV2.poi_voucher) || !Internal.equals(this.rating, poiStructV2.rating) || !Internal.equals(this.cost, poiStructV2.cost) || !Internal.equals(this.poi_rank_desc, poiStructV2.poi_rank_desc) || !Internal.equals(this.business_area_name, poiStructV2.business_area_name) || !Internal.equals(this.is_local_city, poiStructV2.is_local_city) || !Internal.equals(this.option_name, poiStructV2.option_name) || !Internal.equals(this.poi_subtitle, poiStructV2.poi_subtitle) || !Internal.equals(this.sp_source, poiStructV2.sp_source) || !Internal.equals(this.show_type, poiStructV2.show_type) || !Internal.equals(this.is_candidate, poiStructV2.is_candidate) || !Internal.equals(this.poi_card, poiStructV2.poi_card) || !Internal.equals(this.poi_subtitle_type, poiStructV2.poi_subtitle_type) || !this.voucher_release_areas.equals(poiStructV2.voucher_release_areas) || !Internal.equals(this.is_show_halfcard, poiStructV2.is_show_halfcard) || !this.poi_frontend_type.equals(poiStructV2.poi_frontend_type) || !Internal.equals(this.poi_backend_type, poiStructV2.poi_backend_type) || !Internal.equals(this.cover_item, poiStructV2.cover_item) || !Internal.equals(this.is_top_recommend, poiStructV2.is_top_recommend) || !Internal.equals(this.is_admin_area, poiStructV2.is_admin_area) || !Internal.equals(this.collected_count, poiStructV2.collected_count) || !Internal.equals(this.view_count, poiStructV2.view_count)) {
            return false;
        }
        return true;
    }

    public PoiStructV2(String str, String str2, String str3, Integer num, Integer num2, ShareStructV2 shareStructV2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, String str4, AddressStructV2 addressStructV2, Integer num3, Integer num4, Double d, Double d2, Integer num5, UrlStructV2 urlStructV25, UrlStructV2 urlStructV26, UrlStructV2 urlStructV27, Integer num6, String str5, Double d3, Double d4, String str6, String str7, Boolean bool, String str8, String str9, String str10, Integer num7, Boolean bool2, PoiCardStructV2 poiCardStructV2, Integer num8, List<String> list, Integer num9, List<PoiFrontendTypeStructV2> list2, PoiBackendTypeStructV2 poiBackendTypeStructV2, UrlStructV2 urlStructV28, Boolean bool3, Boolean bool4, String str11, String str12) {
        this(str, str2, str3, num, num2, shareStructV2, urlStructV2, urlStructV22, urlStructV23, urlStructV24, str4, addressStructV2, num3, num4, d, d2, num5, urlStructV25, urlStructV26, urlStructV27, num6, str5, d3, d4, str6, str7, bool, str8, str9, str10, num7, bool2, poiCardStructV2, num8, list, num9, list2, poiBackendTypeStructV2, urlStructV28, bool3, bool4, str11, str12, ByteString.EMPTY);
    }

    public PoiStructV2(String str, String str2, String str3, Integer num, Integer num2, ShareStructV2 shareStructV2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, String str4, AddressStructV2 addressStructV2, Integer num3, Integer num4, Double d, Double d2, Integer num5, UrlStructV2 urlStructV25, UrlStructV2 urlStructV26, UrlStructV2 urlStructV27, Integer num6, String str5, Double d3, Double d4, String str6, String str7, Boolean bool, String str8, String str9, String str10, Integer num7, Boolean bool2, PoiCardStructV2 poiCardStructV2, Integer num8, List<String> list, Integer num9, List<PoiFrontendTypeStructV2> list2, PoiBackendTypeStructV2 poiBackendTypeStructV2, UrlStructV2 urlStructV28, Boolean bool3, Boolean bool4, String str11, String str12, ByteString byteString) {
        super(ADAPTER, byteString);
        this.poi_id = str;
        this.poi_name = str2;
        this.type_code = str3;
        this.user_count = num;
        this.item_count = num2;
        this.share_info = shareStructV2;
        this.cover_hd = urlStructV2;
        this.cover_large = urlStructV22;
        this.cover_medium = urlStructV23;
        this.cover_thumb = urlStructV24;
        this.distance = str4;
        this.address_info = addressStructV2;
        this.icon_type = num3;
        this.collect_stat = num4;
        this.poi_longitude = d;
        this.poi_latitude = d2;
        this.expand_type = num5;
        this.icon_on_map = urlStructV25;
        this.icon_on_entry = urlStructV26;
        this.icon_on_info = urlStructV27;
        this.poi_type = num6;
        this.poi_voucher = str5;
        this.rating = d3;
        this.cost = d4;
        this.poi_rank_desc = str6;
        this.business_area_name = str7;
        this.is_local_city = bool;
        this.option_name = str8;
        this.poi_subtitle = str9;
        this.sp_source = str10;
        this.show_type = num7;
        this.is_candidate = bool2;
        this.poi_card = poiCardStructV2;
        this.poi_subtitle_type = num8;
        this.voucher_release_areas = Internal.immutableCopyOf("voucher_release_areas", list);
        this.is_show_halfcard = num9;
        this.poi_frontend_type = Internal.immutableCopyOf("poi_frontend_type", list2);
        this.poi_backend_type = poiBackendTypeStructV2;
        this.cover_item = urlStructV28;
        this.is_top_recommend = bool3;
        this.is_admin_area = bool4;
        this.collected_count = str11;
        this.view_count = str12;
    }
}
