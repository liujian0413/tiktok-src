package com.p280ss.ugc.aweme.proto;

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

/* renamed from: com.ss.ugc.aweme.proto.CommentStructV2 */
final class CommentStructV2 extends Message<CommentStructV2, Builder> {
    public static final ProtoAdapter<CommentStructV2> ADAPTER = new ProtoAdapter_CommentStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String cid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long create_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer digg_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public String forward_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 20)
    public Boolean is_author_digged;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 12)
    public String label_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 13)
    public Integer label_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.RelationDynamicLableStructV2#ADAPTER", tag = 14)
    public RelationDynamicLableStructV2 relation_label;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CommentStructV2#ADAPTER", label = Label.REPEATED, tag = 10)
    public List<CommentStructV2> reply_comment;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 16)
    public Integer reply_comment_total;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public String reply_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 17)
    public String reply_to_reply_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 19)
    public String reply_to_userid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 18)
    public String reply_to_username;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public Integer status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String text;
    @WireField(adapter = "com.ss.ugc.aweme.proto.TextExtraStructV2#ADAPTER", label = Label.REPEATED, tag = 11)
    public List<TextExtraStructV2> text_extra;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UserStructV2#ADAPTER", tag = 7)
    public UserStructV2 user;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public Integer user_digged;

    /* renamed from: com.ss.ugc.aweme.proto.CommentStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CommentStructV2, Builder> {
        public String aweme_id;
        public String cid;
        public Long create_time;
        public Integer digg_count;
        public String forward_id;
        public Boolean is_author_digged;
        public String label_text;
        public Integer label_type;
        public RelationDynamicLableStructV2 relation_label;
        public List<CommentStructV2> reply_comment = Internal.newMutableList();
        public Integer reply_comment_total;
        public String reply_id;
        public String reply_to_reply_id;
        public String reply_to_userid;
        public String reply_to_username;
        public Integer status;
        public String text;
        public List<TextExtraStructV2> text_extra = Internal.newMutableList();
        public UserStructV2 user;
        public Integer user_digged;

        public final CommentStructV2 build() {
            CommentStructV2 commentStructV2 = new CommentStructV2(this.cid, this.text, this.aweme_id, this.create_time, this.digg_count, this.status, this.user, this.reply_id, this.user_digged, this.reply_comment, this.text_extra, this.label_text, this.label_type, this.relation_label, this.forward_id, this.reply_comment_total, this.reply_to_reply_id, this.reply_to_username, this.reply_to_userid, this.is_author_digged, super.buildUnknownFields());
            return commentStructV2;
        }

        public final Builder aweme_id(String str) {
            this.aweme_id = str;
            return this;
        }

        public final Builder cid(String str) {
            this.cid = str;
            return this;
        }

        public final Builder create_time(Long l) {
            this.create_time = l;
            return this;
        }

        public final Builder digg_count(Integer num) {
            this.digg_count = num;
            return this;
        }

        public final Builder forward_id(String str) {
            this.forward_id = str;
            return this;
        }

        public final Builder is_author_digged(Boolean bool) {
            this.is_author_digged = bool;
            return this;
        }

        public final Builder label_text(String str) {
            this.label_text = str;
            return this;
        }

        public final Builder label_type(Integer num) {
            this.label_type = num;
            return this;
        }

        public final Builder relation_label(RelationDynamicLableStructV2 relationDynamicLableStructV2) {
            this.relation_label = relationDynamicLableStructV2;
            return this;
        }

        public final Builder reply_comment_total(Integer num) {
            this.reply_comment_total = num;
            return this;
        }

        public final Builder reply_id(String str) {
            this.reply_id = str;
            return this;
        }

        public final Builder reply_to_reply_id(String str) {
            this.reply_to_reply_id = str;
            return this;
        }

        public final Builder reply_to_userid(String str) {
            this.reply_to_userid = str;
            return this;
        }

        public final Builder reply_to_username(String str) {
            this.reply_to_username = str;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }

        public final Builder user(UserStructV2 userStructV2) {
            this.user = userStructV2;
            return this;
        }

        public final Builder user_digged(Integer num) {
            this.user_digged = num;
            return this;
        }

        public final Builder reply_comment(List<CommentStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.reply_comment = list;
            return this;
        }

        public final Builder text_extra(List<TextExtraStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.text_extra = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.CommentStructV2$ProtoAdapter_CommentStructV2 */
    static final class ProtoAdapter_CommentStructV2 extends ProtoAdapter<CommentStructV2> {
        public ProtoAdapter_CommentStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CommentStructV2.class);
        }

        public final int encodedSize(CommentStructV2 commentStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, commentStructV2.cid) + ProtoAdapter.STRING.encodedSizeWithTag(2, commentStructV2.text) + ProtoAdapter.STRING.encodedSizeWithTag(3, commentStructV2.aweme_id) + ProtoAdapter.INT64.encodedSizeWithTag(4, commentStructV2.create_time) + ProtoAdapter.INT32.encodedSizeWithTag(5, commentStructV2.digg_count) + ProtoAdapter.INT32.encodedSizeWithTag(6, commentStructV2.status) + UserStructV2.ADAPTER.encodedSizeWithTag(7, commentStructV2.user) + ProtoAdapter.STRING.encodedSizeWithTag(8, commentStructV2.reply_id) + ProtoAdapter.INT32.encodedSizeWithTag(9, commentStructV2.user_digged) + CommentStructV2.ADAPTER.asRepeated().encodedSizeWithTag(10, commentStructV2.reply_comment) + TextExtraStructV2.ADAPTER.asRepeated().encodedSizeWithTag(11, commentStructV2.text_extra) + ProtoAdapter.STRING.encodedSizeWithTag(12, commentStructV2.label_text) + ProtoAdapter.INT32.encodedSizeWithTag(13, commentStructV2.label_type) + RelationDynamicLableStructV2.ADAPTER.encodedSizeWithTag(14, commentStructV2.relation_label) + ProtoAdapter.STRING.encodedSizeWithTag(15, commentStructV2.forward_id) + ProtoAdapter.INT32.encodedSizeWithTag(16, commentStructV2.reply_comment_total) + ProtoAdapter.STRING.encodedSizeWithTag(17, commentStructV2.reply_to_reply_id) + ProtoAdapter.STRING.encodedSizeWithTag(18, commentStructV2.reply_to_username) + ProtoAdapter.STRING.encodedSizeWithTag(19, commentStructV2.reply_to_userid) + ProtoAdapter.BOOL.encodedSizeWithTag(20, commentStructV2.is_author_digged) + commentStructV2.unknownFields().size();
        }

        public final CommentStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.cid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.aweme_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.create_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.digg_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.user((UserStructV2) UserStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.reply_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.user_digged((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 10:
                            builder.reply_comment.add(CommentStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            builder.text_extra.add(TextExtraStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 12:
                            builder.label_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 13:
                            builder.label_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 14:
                            builder.relation_label((RelationDynamicLableStructV2) RelationDynamicLableStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            builder.forward_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 16:
                            builder.reply_comment_total((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 17:
                            builder.reply_to_reply_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 18:
                            builder.reply_to_username((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 19:
                            builder.reply_to_userid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 20:
                            builder.is_author_digged((Boolean) ProtoAdapter.BOOL.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, CommentStructV2 commentStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, commentStructV2.cid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, commentStructV2.text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, commentStructV2.aweme_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, commentStructV2.create_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, commentStructV2.digg_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, commentStructV2.status);
            UserStructV2.ADAPTER.encodeWithTag(protoWriter, 7, commentStructV2.user);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, commentStructV2.reply_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, commentStructV2.user_digged);
            CommentStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, commentStructV2.reply_comment);
            TextExtraStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, commentStructV2.text_extra);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, commentStructV2.label_text);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, commentStructV2.label_type);
            RelationDynamicLableStructV2.ADAPTER.encodeWithTag(protoWriter, 14, commentStructV2.relation_label);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, commentStructV2.forward_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, commentStructV2.reply_comment_total);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, commentStructV2.reply_to_reply_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, commentStructV2.reply_to_username);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, commentStructV2.reply_to_userid);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, commentStructV2.is_author_digged);
            protoWriter.writeBytes(commentStructV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.cid = this.cid;
        builder.text = this.text;
        builder.aweme_id = this.aweme_id;
        builder.create_time = this.create_time;
        builder.digg_count = this.digg_count;
        builder.status = this.status;
        builder.user = this.user;
        builder.reply_id = this.reply_id;
        builder.user_digged = this.user_digged;
        builder.reply_comment = Internal.copyOf("reply_comment", this.reply_comment);
        builder.text_extra = Internal.copyOf("text_extra", this.text_extra);
        builder.label_text = this.label_text;
        builder.label_type = this.label_type;
        builder.relation_label = this.relation_label;
        builder.forward_id = this.forward_id;
        builder.reply_comment_total = this.reply_comment_total;
        builder.reply_to_reply_id = this.reply_to_reply_id;
        builder.reply_to_username = this.reply_to_username;
        builder.reply_to_userid = this.reply_to_userid;
        builder.is_author_digged = this.is_author_digged;
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
        int i18 = this.hashCode;
        if (i18 != 0) {
            return i18;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i19 = 0;
        if (this.cid != null) {
            i = this.cid.hashCode();
        } else {
            i = 0;
        }
        int i20 = (hashCode + i) * 37;
        if (this.text != null) {
            i2 = this.text.hashCode();
        } else {
            i2 = 0;
        }
        int i21 = (i20 + i2) * 37;
        if (this.aweme_id != null) {
            i3 = this.aweme_id.hashCode();
        } else {
            i3 = 0;
        }
        int i22 = (i21 + i3) * 37;
        if (this.create_time != null) {
            i4 = this.create_time.hashCode();
        } else {
            i4 = 0;
        }
        int i23 = (i22 + i4) * 37;
        if (this.digg_count != null) {
            i5 = this.digg_count.hashCode();
        } else {
            i5 = 0;
        }
        int i24 = (i23 + i5) * 37;
        if (this.status != null) {
            i6 = this.status.hashCode();
        } else {
            i6 = 0;
        }
        int i25 = (i24 + i6) * 37;
        if (this.user != null) {
            i7 = this.user.hashCode();
        } else {
            i7 = 0;
        }
        int i26 = (i25 + i7) * 37;
        if (this.reply_id != null) {
            i8 = this.reply_id.hashCode();
        } else {
            i8 = 0;
        }
        int i27 = (i26 + i8) * 37;
        if (this.user_digged != null) {
            i9 = this.user_digged.hashCode();
        } else {
            i9 = 0;
        }
        int hashCode2 = (((((i27 + i9) * 37) + this.reply_comment.hashCode()) * 37) + this.text_extra.hashCode()) * 37;
        if (this.label_text != null) {
            i10 = this.label_text.hashCode();
        } else {
            i10 = 0;
        }
        int i28 = (hashCode2 + i10) * 37;
        if (this.label_type != null) {
            i11 = this.label_type.hashCode();
        } else {
            i11 = 0;
        }
        int i29 = (i28 + i11) * 37;
        if (this.relation_label != null) {
            i12 = this.relation_label.hashCode();
        } else {
            i12 = 0;
        }
        int i30 = (i29 + i12) * 37;
        if (this.forward_id != null) {
            i13 = this.forward_id.hashCode();
        } else {
            i13 = 0;
        }
        int i31 = (i30 + i13) * 37;
        if (this.reply_comment_total != null) {
            i14 = this.reply_comment_total.hashCode();
        } else {
            i14 = 0;
        }
        int i32 = (i31 + i14) * 37;
        if (this.reply_to_reply_id != null) {
            i15 = this.reply_to_reply_id.hashCode();
        } else {
            i15 = 0;
        }
        int i33 = (i32 + i15) * 37;
        if (this.reply_to_username != null) {
            i16 = this.reply_to_username.hashCode();
        } else {
            i16 = 0;
        }
        int i34 = (i33 + i16) * 37;
        if (this.reply_to_userid != null) {
            i17 = this.reply_to_userid.hashCode();
        } else {
            i17 = 0;
        }
        int i35 = (i34 + i17) * 37;
        if (this.is_author_digged != null) {
            i19 = this.is_author_digged.hashCode();
        }
        int i36 = i35 + i19;
        this.hashCode = i36;
        return i36;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cid != null) {
            sb.append(", cid=");
            sb.append(this.cid);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.aweme_id != null) {
            sb.append(", aweme_id=");
            sb.append(this.aweme_id);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.digg_count != null) {
            sb.append(", digg_count=");
            sb.append(this.digg_count);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.reply_id != null) {
            sb.append(", reply_id=");
            sb.append(this.reply_id);
        }
        if (this.user_digged != null) {
            sb.append(", user_digged=");
            sb.append(this.user_digged);
        }
        if (!this.reply_comment.isEmpty()) {
            sb.append(", reply_comment=");
            sb.append(this.reply_comment);
        }
        if (!this.text_extra.isEmpty()) {
            sb.append(", text_extra=");
            sb.append(this.text_extra);
        }
        if (this.label_text != null) {
            sb.append(", label_text=");
            sb.append(this.label_text);
        }
        if (this.label_type != null) {
            sb.append(", label_type=");
            sb.append(this.label_type);
        }
        if (this.relation_label != null) {
            sb.append(", relation_label=");
            sb.append(this.relation_label);
        }
        if (this.forward_id != null) {
            sb.append(", forward_id=");
            sb.append(this.forward_id);
        }
        if (this.reply_comment_total != null) {
            sb.append(", reply_comment_total=");
            sb.append(this.reply_comment_total);
        }
        if (this.reply_to_reply_id != null) {
            sb.append(", reply_to_reply_id=");
            sb.append(this.reply_to_reply_id);
        }
        if (this.reply_to_username != null) {
            sb.append(", reply_to_username=");
            sb.append(this.reply_to_username);
        }
        if (this.reply_to_userid != null) {
            sb.append(", reply_to_userid=");
            sb.append(this.reply_to_userid);
        }
        if (this.is_author_digged != null) {
            sb.append(", is_author_digged=");
            sb.append(this.is_author_digged);
        }
        StringBuilder replace = sb.replace(0, 2, "CommentStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommentStructV2)) {
            return false;
        }
        CommentStructV2 commentStructV2 = (CommentStructV2) obj;
        if (!unknownFields().equals(commentStructV2.unknownFields()) || !Internal.equals(this.cid, commentStructV2.cid) || !Internal.equals(this.text, commentStructV2.text) || !Internal.equals(this.aweme_id, commentStructV2.aweme_id) || !Internal.equals(this.create_time, commentStructV2.create_time) || !Internal.equals(this.digg_count, commentStructV2.digg_count) || !Internal.equals(this.status, commentStructV2.status) || !Internal.equals(this.user, commentStructV2.user) || !Internal.equals(this.reply_id, commentStructV2.reply_id) || !Internal.equals(this.user_digged, commentStructV2.user_digged) || !this.reply_comment.equals(commentStructV2.reply_comment) || !this.text_extra.equals(commentStructV2.text_extra) || !Internal.equals(this.label_text, commentStructV2.label_text) || !Internal.equals(this.label_type, commentStructV2.label_type) || !Internal.equals(this.relation_label, commentStructV2.relation_label) || !Internal.equals(this.forward_id, commentStructV2.forward_id) || !Internal.equals(this.reply_comment_total, commentStructV2.reply_comment_total) || !Internal.equals(this.reply_to_reply_id, commentStructV2.reply_to_reply_id) || !Internal.equals(this.reply_to_username, commentStructV2.reply_to_username) || !Internal.equals(this.reply_to_userid, commentStructV2.reply_to_userid) || !Internal.equals(this.is_author_digged, commentStructV2.is_author_digged)) {
            return false;
        }
        return true;
    }

    public CommentStructV2(String str, String str2, String str3, Long l, Integer num, Integer num2, UserStructV2 userStructV2, String str4, Integer num3, List<CommentStructV2> list, List<TextExtraStructV2> list2, String str5, Integer num4, RelationDynamicLableStructV2 relationDynamicLableStructV2, String str6, Integer num5, String str7, String str8, String str9, Boolean bool) {
        this(str, str2, str3, l, num, num2, userStructV2, str4, num3, list, list2, str5, num4, relationDynamicLableStructV2, str6, num5, str7, str8, str9, bool, ByteString.EMPTY);
    }

    public CommentStructV2(String str, String str2, String str3, Long l, Integer num, Integer num2, UserStructV2 userStructV2, String str4, Integer num3, List<CommentStructV2> list, List<TextExtraStructV2> list2, String str5, Integer num4, RelationDynamicLableStructV2 relationDynamicLableStructV2, String str6, Integer num5, String str7, String str8, String str9, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cid = str;
        this.text = str2;
        this.aweme_id = str3;
        this.create_time = l;
        this.digg_count = num;
        this.status = num2;
        this.user = userStructV2;
        this.reply_id = str4;
        this.user_digged = num3;
        List<CommentStructV2> list3 = list;
        this.reply_comment = Internal.immutableCopyOf("reply_comment", list);
        List<TextExtraStructV2> list4 = list2;
        this.text_extra = Internal.immutableCopyOf("text_extra", list2);
        this.label_text = str5;
        this.label_type = num4;
        this.relation_label = relationDynamicLableStructV2;
        this.forward_id = str6;
        this.reply_comment_total = num5;
        this.reply_to_reply_id = str7;
        this.reply_to_username = str8;
        this.reply_to_userid = str9;
        this.is_author_digged = bool;
    }
}
