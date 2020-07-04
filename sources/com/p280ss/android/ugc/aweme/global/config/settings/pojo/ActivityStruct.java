package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ActivityStruct */
public final class ActivityStruct extends Message<ActivityStruct, Builder> {
    public static final DefaultValueProtoAdapter<ActivityStruct> ADAPTER = new ProtoAdapter_ActivityStruct();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String activity_name;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 10)
    public final List<String> activity_sticker_id_array;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 6)
    public final UrlModel comment_icon;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 4)
    public final UrlModel digg_icon;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 3)
    public final List<String> hash_tags;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean in_activity;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 7)
    public final UrlModel share_icon;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 8)
    public final UrlModel share_tip_icon;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 9)
    public final UrlModel shot_icon;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 5)
    public final UrlModel undigg_icon;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.WatermarkStruct#ADAPTER", tag = 11)
    public final WatermarkStruct watermark_struct;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ActivityStruct$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ActivityStruct, Builder> {
        public String activity_name;
        public List<String> activity_sticker_id_array = Internal.newMutableList();
        public UrlModel comment_icon;
        public UrlModel digg_icon;
        public List<String> hash_tags = Internal.newMutableList();
        public Boolean in_activity;
        public UrlModel share_icon;
        public UrlModel share_tip_icon;
        public UrlModel shot_icon;
        public UrlModel undigg_icon;
        public WatermarkStruct watermark_struct;

        public final ActivityStruct build() {
            ActivityStruct activityStruct = new ActivityStruct(this.activity_name, this.in_activity, this.hash_tags, this.digg_icon, this.undigg_icon, this.comment_icon, this.share_icon, this.share_tip_icon, this.shot_icon, this.activity_sticker_id_array, this.watermark_struct, super.buildUnknownFields());
            return activityStruct;
        }

        public final Builder activity_name(String str) {
            this.activity_name = str;
            return this;
        }

        public final Builder comment_icon(UrlModel urlModel) {
            this.comment_icon = urlModel;
            return this;
        }

        public final Builder digg_icon(UrlModel urlModel) {
            this.digg_icon = urlModel;
            return this;
        }

        public final Builder in_activity(Boolean bool) {
            this.in_activity = bool;
            return this;
        }

        public final Builder share_icon(UrlModel urlModel) {
            this.share_icon = urlModel;
            return this;
        }

        public final Builder share_tip_icon(UrlModel urlModel) {
            this.share_tip_icon = urlModel;
            return this;
        }

        public final Builder shot_icon(UrlModel urlModel) {
            this.shot_icon = urlModel;
            return this;
        }

        public final Builder undigg_icon(UrlModel urlModel) {
            this.undigg_icon = urlModel;
            return this;
        }

        public final Builder watermark_struct(WatermarkStruct watermarkStruct) {
            this.watermark_struct = watermarkStruct;
            return this;
        }

        public final Builder activity_sticker_id_array(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.activity_sticker_id_array = list;
            return this;
        }

        public final Builder hash_tags(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.hash_tags = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ActivityStruct$ProtoAdapter_ActivityStruct */
    static final class ProtoAdapter_ActivityStruct extends DefaultValueProtoAdapter<ActivityStruct> {
        public final ActivityStruct redact(ActivityStruct activityStruct) {
            return activityStruct;
        }

        public ProtoAdapter_ActivityStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, ActivityStruct.class);
        }

        public final ActivityStruct decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (ActivityStruct) null);
        }

        public final int encodedSize(ActivityStruct activityStruct) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, activityStruct.activity_name) + ProtoAdapter.BOOL.encodedSizeWithTag(2, activityStruct.in_activity) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, activityStruct.hash_tags) + UrlModel.ADAPTER.encodedSizeWithTag(4, activityStruct.digg_icon) + UrlModel.ADAPTER.encodedSizeWithTag(5, activityStruct.undigg_icon) + UrlModel.ADAPTER.encodedSizeWithTag(6, activityStruct.comment_icon) + UrlModel.ADAPTER.encodedSizeWithTag(7, activityStruct.share_icon) + UrlModel.ADAPTER.encodedSizeWithTag(8, activityStruct.share_tip_icon) + UrlModel.ADAPTER.encodedSizeWithTag(9, activityStruct.shot_icon) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(10, activityStruct.activity_sticker_id_array) + WatermarkStruct.ADAPTER.encodedSizeWithTag(11, activityStruct.watermark_struct) + activityStruct.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ActivityStruct activityStruct) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, activityStruct.activity_name);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, activityStruct.in_activity);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, activityStruct.hash_tags);
            UrlModel.ADAPTER.encodeWithTag(protoWriter, 4, activityStruct.digg_icon);
            UrlModel.ADAPTER.encodeWithTag(protoWriter, 5, activityStruct.undigg_icon);
            UrlModel.ADAPTER.encodeWithTag(protoWriter, 6, activityStruct.comment_icon);
            UrlModel.ADAPTER.encodeWithTag(protoWriter, 7, activityStruct.share_icon);
            UrlModel.ADAPTER.encodeWithTag(protoWriter, 8, activityStruct.share_tip_icon);
            UrlModel.ADAPTER.encodeWithTag(protoWriter, 9, activityStruct.shot_icon);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 10, activityStruct.activity_sticker_id_array);
            WatermarkStruct.ADAPTER.encodeWithTag(protoWriter, 11, activityStruct.watermark_struct);
            protoWriter.writeBytes(activityStruct.unknownFields());
        }

        public final ActivityStruct decode(ProtoReader protoReader, ActivityStruct activityStruct) throws IOException {
            Builder builder;
            ActivityStruct activityStruct2 = (ActivityStruct) C10938a.m32097a().mo26425a(ActivityStruct.class, activityStruct);
            if (activityStruct2 != null) {
                builder = activityStruct2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<String> newMutableList = Internal.newMutableList();
            List<String> newMutableList2 = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.activity_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.in_activity((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.digg_icon((UrlModel) UrlModel.ADAPTER.decode(protoReader, builder.digg_icon));
                            break;
                        case 5:
                            builder.undigg_icon((UrlModel) UrlModel.ADAPTER.decode(protoReader, builder.undigg_icon));
                            break;
                        case 6:
                            builder.comment_icon((UrlModel) UrlModel.ADAPTER.decode(protoReader, builder.comment_icon));
                            break;
                        case 7:
                            builder.share_icon((UrlModel) UrlModel.ADAPTER.decode(protoReader, builder.share_icon));
                            break;
                        case 8:
                            builder.share_tip_icon((UrlModel) UrlModel.ADAPTER.decode(protoReader, builder.share_tip_icon));
                            break;
                        case 9:
                            builder.shot_icon((UrlModel) UrlModel.ADAPTER.decode(protoReader, builder.shot_icon));
                            break;
                        case 10:
                            newMutableList2.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            builder.watermark_struct((WatermarkStruct) WatermarkStruct.ADAPTER.decode(protoReader, builder.watermark_struct));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (activityStruct2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.hash_tags = newMutableList;
                    }
                    if (!newMutableList2.isEmpty()) {
                        builder.activity_sticker_id_array = newMutableList2;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<String> getActivityStickerIdArray() {
        return this.activity_sticker_id_array;
    }

    public final List<String> getHashTags() {
        return this.hash_tags;
    }

    public final String getActivityName() throws NullValueException {
        if (this.activity_name != null) {
            return this.activity_name;
        }
        throw new NullValueException();
    }

    public final UrlModel getCommentIcon() throws NullValueException {
        if (this.comment_icon != null) {
            return this.comment_icon;
        }
        throw new NullValueException();
    }

    public final UrlModel getDiggIcon() throws NullValueException {
        if (this.digg_icon != null) {
            return this.digg_icon;
        }
        throw new NullValueException();
    }

    public final Boolean getInActivity() throws NullValueException {
        if (this.in_activity != null) {
            return this.in_activity;
        }
        throw new NullValueException();
    }

    public final UrlModel getShareIcon() throws NullValueException {
        if (this.share_icon != null) {
            return this.share_icon;
        }
        throw new NullValueException();
    }

    public final UrlModel getShareTipIcon() throws NullValueException {
        if (this.share_tip_icon != null) {
            return this.share_tip_icon;
        }
        throw new NullValueException();
    }

    public final UrlModel getShotIcon() throws NullValueException {
        if (this.shot_icon != null) {
            return this.shot_icon;
        }
        throw new NullValueException();
    }

    public final UrlModel getUndiggIcon() throws NullValueException {
        if (this.undigg_icon != null) {
            return this.undigg_icon;
        }
        throw new NullValueException();
    }

    public final WatermarkStruct getWatermarkStruct() throws NullValueException {
        if (this.watermark_struct != null) {
            return this.watermark_struct;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.activity_name = this.activity_name;
        builder.in_activity = this.in_activity;
        builder.hash_tags = Internal.copyOf("hash_tags", this.hash_tags);
        builder.digg_icon = this.digg_icon;
        builder.undigg_icon = this.undigg_icon;
        builder.comment_icon = this.comment_icon;
        builder.share_icon = this.share_icon;
        builder.share_tip_icon = this.share_tip_icon;
        builder.shot_icon = this.shot_icon;
        builder.activity_sticker_id_array = Internal.copyOf("activity_sticker_id_array", this.activity_sticker_id_array);
        builder.watermark_struct = this.watermark_struct;
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
        int i9 = this.hashCode;
        if (i9 != 0) {
            return i9;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i10 = 0;
        if (this.activity_name != null) {
            i = this.activity_name.hashCode();
        } else {
            i = 0;
        }
        int i11 = (hashCode + i) * 37;
        if (this.in_activity != null) {
            i2 = this.in_activity.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = (((i11 + i2) * 37) + this.hash_tags.hashCode()) * 37;
        if (this.digg_icon != null) {
            i3 = this.digg_icon.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (hashCode2 + i3) * 37;
        if (this.undigg_icon != null) {
            i4 = this.undigg_icon.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        if (this.comment_icon != null) {
            i5 = this.comment_icon.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        if (this.share_icon != null) {
            i6 = this.share_icon.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        if (this.share_tip_icon != null) {
            i7 = this.share_tip_icon.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        if (this.shot_icon != null) {
            i8 = this.shot_icon.hashCode();
        } else {
            i8 = 0;
        }
        int hashCode3 = (((i16 + i8) * 37) + this.activity_sticker_id_array.hashCode()) * 37;
        if (this.watermark_struct != null) {
            i10 = this.watermark_struct.hashCode();
        }
        int i17 = hashCode3 + i10;
        this.hashCode = i17;
        return i17;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.activity_name != null) {
            sb.append(", activity_name=");
            sb.append(this.activity_name);
        }
        if (this.in_activity != null) {
            sb.append(", in_activity=");
            sb.append(this.in_activity);
        }
        if (!this.hash_tags.isEmpty()) {
            sb.append(", hash_tags=");
            sb.append(this.hash_tags);
        }
        if (this.digg_icon != null) {
            sb.append(", digg_icon=");
            sb.append(this.digg_icon);
        }
        if (this.undigg_icon != null) {
            sb.append(", undigg_icon=");
            sb.append(this.undigg_icon);
        }
        if (this.comment_icon != null) {
            sb.append(", comment_icon=");
            sb.append(this.comment_icon);
        }
        if (this.share_icon != null) {
            sb.append(", share_icon=");
            sb.append(this.share_icon);
        }
        if (this.share_tip_icon != null) {
            sb.append(", share_tip_icon=");
            sb.append(this.share_tip_icon);
        }
        if (this.shot_icon != null) {
            sb.append(", shot_icon=");
            sb.append(this.shot_icon);
        }
        if (!this.activity_sticker_id_array.isEmpty()) {
            sb.append(", activity_sticker_id_array=");
            sb.append(this.activity_sticker_id_array);
        }
        if (this.watermark_struct != null) {
            sb.append(", watermark_struct=");
            sb.append(this.watermark_struct);
        }
        StringBuilder replace = sb.replace(0, 2, "ActivityStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityStruct)) {
            return false;
        }
        ActivityStruct activityStruct = (ActivityStruct) obj;
        if (!unknownFields().equals(activityStruct.unknownFields()) || !Internal.equals(this.activity_name, activityStruct.activity_name) || !Internal.equals(this.in_activity, activityStruct.in_activity) || !this.hash_tags.equals(activityStruct.hash_tags) || !Internal.equals(this.digg_icon, activityStruct.digg_icon) || !Internal.equals(this.undigg_icon, activityStruct.undigg_icon) || !Internal.equals(this.comment_icon, activityStruct.comment_icon) || !Internal.equals(this.share_icon, activityStruct.share_icon) || !Internal.equals(this.share_tip_icon, activityStruct.share_tip_icon) || !Internal.equals(this.shot_icon, activityStruct.shot_icon) || !this.activity_sticker_id_array.equals(activityStruct.activity_sticker_id_array) || !Internal.equals(this.watermark_struct, activityStruct.watermark_struct)) {
            return false;
        }
        return true;
    }

    public ActivityStruct(String str, Boolean bool, List<String> list, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, UrlModel urlModel5, UrlModel urlModel6, List<String> list2, WatermarkStruct watermarkStruct) {
        this(str, bool, list, urlModel, urlModel2, urlModel3, urlModel4, urlModel5, urlModel6, list2, watermarkStruct, ByteString.EMPTY);
    }

    public ActivityStruct(String str, Boolean bool, List<String> list, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, UrlModel urlModel5, UrlModel urlModel6, List<String> list2, WatermarkStruct watermarkStruct, ByteString byteString) {
        super(ADAPTER, byteString);
        this.activity_name = str;
        this.in_activity = bool;
        this.hash_tags = Internal.immutableCopyOf("hash_tags", list);
        this.digg_icon = urlModel;
        this.undigg_icon = urlModel2;
        this.comment_icon = urlModel3;
        this.share_icon = urlModel4;
        this.share_tip_icon = urlModel5;
        this.shot_icon = urlModel6;
        this.activity_sticker_id_array = Internal.immutableCopyOf("activity_sticker_id_array", list2);
        this.watermark_struct = watermarkStruct;
    }
}
