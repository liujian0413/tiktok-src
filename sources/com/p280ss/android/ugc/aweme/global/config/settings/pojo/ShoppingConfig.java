package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.C10939b;
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
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShoppingConfig */
public final class ShoppingConfig extends Message<ShoppingConfig, Builder> {
    public static final DefaultValueProtoAdapter<ShoppingConfig> ADAPTER = new ProtoAdapter_ShoppingConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 10)
    public final Integer card_show_duration;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 9)
    public final Boolean disable_card;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 7)
    public final Boolean disable_want;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean enable;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean enable_float_video;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean enable_user;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean law_window;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.ShoppingLiveConfig#ADAPTER", tag = 6)
    public final ShoppingLiveConfig live;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.ShoppingNewbieHelp#ADAPTER", tag = 8)
    public final ShoppingNewbieHelp newbie_help;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String order_share_intro_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 11)
    public final Integer preload_data_wait_duration;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShoppingConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ShoppingConfig, Builder> {
        public Integer card_show_duration;
        public Boolean disable_card;
        public Boolean disable_want;
        public Boolean enable;
        public Boolean enable_float_video;
        public Boolean enable_user;
        public Boolean law_window;
        public ShoppingLiveConfig live;
        public ShoppingNewbieHelp newbie_help;
        public String order_share_intro_url;
        public Integer preload_data_wait_duration = Integer.valueOf(3);

        public final ShoppingConfig build() {
            if (this.preload_data_wait_duration != null) {
                ShoppingConfig shoppingConfig = new ShoppingConfig(this.enable, this.enable_user, this.order_share_intro_url, this.enable_float_video, this.law_window, this.live, this.disable_want, this.newbie_help, this.disable_card, this.card_show_duration, this.preload_data_wait_duration, super.buildUnknownFields());
                return shoppingConfig;
            }
            throw C10939b.m32101a(this.preload_data_wait_duration, "preload_data_wait_duration");
        }

        public final Builder card_show_duration(Integer num) {
            this.card_show_duration = num;
            return this;
        }

        public final Builder disable_card(Boolean bool) {
            this.disable_card = bool;
            return this;
        }

        public final Builder disable_want(Boolean bool) {
            this.disable_want = bool;
            return this;
        }

        public final Builder enable(Boolean bool) {
            this.enable = bool;
            return this;
        }

        public final Builder enable_float_video(Boolean bool) {
            this.enable_float_video = bool;
            return this;
        }

        public final Builder enable_user(Boolean bool) {
            this.enable_user = bool;
            return this;
        }

        public final Builder law_window(Boolean bool) {
            this.law_window = bool;
            return this;
        }

        public final Builder live(ShoppingLiveConfig shoppingLiveConfig) {
            this.live = shoppingLiveConfig;
            return this;
        }

        public final Builder newbie_help(ShoppingNewbieHelp shoppingNewbieHelp) {
            this.newbie_help = shoppingNewbieHelp;
            return this;
        }

        public final Builder order_share_intro_url(String str) {
            this.order_share_intro_url = str;
            return this;
        }

        public final Builder preload_data_wait_duration(Integer num) {
            this.preload_data_wait_duration = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShoppingConfig$ProtoAdapter_ShoppingConfig */
    static final class ProtoAdapter_ShoppingConfig extends DefaultValueProtoAdapter<ShoppingConfig> {
        public final ShoppingConfig redact(ShoppingConfig shoppingConfig) {
            return shoppingConfig;
        }

        public ProtoAdapter_ShoppingConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, ShoppingConfig.class);
        }

        public final ShoppingConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (ShoppingConfig) null);
        }

        public final int encodedSize(ShoppingConfig shoppingConfig) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, shoppingConfig.enable) + ProtoAdapter.BOOL.encodedSizeWithTag(2, shoppingConfig.enable_user) + ProtoAdapter.STRING.encodedSizeWithTag(3, shoppingConfig.order_share_intro_url) + ProtoAdapter.BOOL.encodedSizeWithTag(4, shoppingConfig.enable_float_video) + ProtoAdapter.BOOL.encodedSizeWithTag(5, shoppingConfig.law_window) + ShoppingLiveConfig.ADAPTER.encodedSizeWithTag(6, shoppingConfig.live) + ProtoAdapter.BOOL.encodedSizeWithTag(7, shoppingConfig.disable_want) + ShoppingNewbieHelp.ADAPTER.encodedSizeWithTag(8, shoppingConfig.newbie_help) + ProtoAdapter.BOOL.encodedSizeWithTag(9, shoppingConfig.disable_card) + ProtoAdapter.INT32.encodedSizeWithTag(10, shoppingConfig.card_show_duration) + ProtoAdapter.INT32.encodedSizeWithTag(11, shoppingConfig.preload_data_wait_duration) + shoppingConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ShoppingConfig shoppingConfig) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, shoppingConfig.enable);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, shoppingConfig.enable_user);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, shoppingConfig.order_share_intro_url);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, shoppingConfig.enable_float_video);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, shoppingConfig.law_window);
            ShoppingLiveConfig.ADAPTER.encodeWithTag(protoWriter, 6, shoppingConfig.live);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, shoppingConfig.disable_want);
            ShoppingNewbieHelp.ADAPTER.encodeWithTag(protoWriter, 8, shoppingConfig.newbie_help);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, shoppingConfig.disable_card);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, shoppingConfig.card_show_duration);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, shoppingConfig.preload_data_wait_duration);
            protoWriter.writeBytes(shoppingConfig.unknownFields());
        }

        public final ShoppingConfig decode(ProtoReader protoReader, ShoppingConfig shoppingConfig) throws IOException {
            Builder builder;
            ShoppingConfig shoppingConfig2 = (ShoppingConfig) C10938a.m32097a().mo26425a(ShoppingConfig.class, shoppingConfig);
            if (shoppingConfig2 != null) {
                builder = shoppingConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.enable((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.enable_user((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.order_share_intro_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.enable_float_video((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 5:
                            builder.law_window((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 6:
                            builder.live((ShoppingLiveConfig) ShoppingLiveConfig.ADAPTER.decode(protoReader, builder.live));
                            break;
                        case 7:
                            builder.disable_want((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 8:
                            builder.newbie_help((ShoppingNewbieHelp) ShoppingNewbieHelp.ADAPTER.decode(protoReader, builder.newbie_help));
                            break;
                        case 9:
                            builder.disable_card((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 10:
                            builder.card_show_duration((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 11:
                            builder.preload_data_wait_duration((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (shoppingConfig2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final Integer getPreloadDataWaitDuration() {
        return this.preload_data_wait_duration;
    }

    public final Integer getCardShowDuration() throws NullValueException {
        if (this.card_show_duration != null) {
            return this.card_show_duration;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableCard() throws NullValueException {
        if (this.disable_card != null) {
            return this.disable_card;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableWant() throws NullValueException {
        if (this.disable_want != null) {
            return this.disable_want;
        }
        throw new NullValueException();
    }

    public final Boolean getEnable() throws NullValueException {
        if (this.enable != null) {
            return this.enable;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableFloatVideo() throws NullValueException {
        if (this.enable_float_video != null) {
            return this.enable_float_video;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableUser() throws NullValueException {
        if (this.enable_user != null) {
            return this.enable_user;
        }
        throw new NullValueException();
    }

    public final Boolean getLawWindow() throws NullValueException {
        if (this.law_window != null) {
            return this.law_window;
        }
        throw new NullValueException();
    }

    public final ShoppingLiveConfig getLive() throws NullValueException {
        if (this.live != null) {
            return this.live;
        }
        throw new NullValueException();
    }

    public final ShoppingNewbieHelp getNewbieHelp() throws NullValueException {
        if (this.newbie_help != null) {
            return this.newbie_help;
        }
        throw new NullValueException();
    }

    public final String getOrderShareIntroUrl() throws NullValueException {
        if (this.order_share_intro_url != null) {
            return this.order_share_intro_url;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.enable = this.enable;
        builder.enable_user = this.enable_user;
        builder.order_share_intro_url = this.order_share_intro_url;
        builder.enable_float_video = this.enable_float_video;
        builder.law_window = this.law_window;
        builder.live = this.live;
        builder.disable_want = this.disable_want;
        builder.newbie_help = this.newbie_help;
        builder.disable_card = this.disable_card;
        builder.card_show_duration = this.card_show_duration;
        builder.preload_data_wait_duration = this.preload_data_wait_duration;
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
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i11 = 0;
        if (this.enable != null) {
            i = this.enable.hashCode();
        } else {
            i = 0;
        }
        int i12 = (hashCode + i) * 37;
        if (this.enable_user != null) {
            i2 = this.enable_user.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (i12 + i2) * 37;
        if (this.order_share_intro_url != null) {
            i3 = this.order_share_intro_url.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 37;
        if (this.enable_float_video != null) {
            i4 = this.enable_float_video.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 37;
        if (this.law_window != null) {
            i5 = this.law_window.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 37;
        if (this.live != null) {
            i6 = this.live.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 37;
        if (this.disable_want != null) {
            i7 = this.disable_want.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 37;
        if (this.newbie_help != null) {
            i8 = this.newbie_help.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 37;
        if (this.disable_card != null) {
            i9 = this.disable_card.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 37;
        if (this.card_show_duration != null) {
            i11 = this.card_show_duration.hashCode();
        }
        int hashCode2 = ((i20 + i11) * 37) + this.preload_data_wait_duration.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.enable != null) {
            sb.append(", enable=");
            sb.append(this.enable);
        }
        if (this.enable_user != null) {
            sb.append(", enable_user=");
            sb.append(this.enable_user);
        }
        if (this.order_share_intro_url != null) {
            sb.append(", order_share_intro_url=");
            sb.append(this.order_share_intro_url);
        }
        if (this.enable_float_video != null) {
            sb.append(", enable_float_video=");
            sb.append(this.enable_float_video);
        }
        if (this.law_window != null) {
            sb.append(", law_window=");
            sb.append(this.law_window);
        }
        if (this.live != null) {
            sb.append(", live=");
            sb.append(this.live);
        }
        if (this.disable_want != null) {
            sb.append(", disable_want=");
            sb.append(this.disable_want);
        }
        if (this.newbie_help != null) {
            sb.append(", newbie_help=");
            sb.append(this.newbie_help);
        }
        if (this.disable_card != null) {
            sb.append(", disable_card=");
            sb.append(this.disable_card);
        }
        if (this.card_show_duration != null) {
            sb.append(", card_show_duration=");
            sb.append(this.card_show_duration);
        }
        sb.append(", preload_data_wait_duration=");
        sb.append(this.preload_data_wait_duration);
        StringBuilder replace = sb.replace(0, 2, "ShoppingConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShoppingConfig)) {
            return false;
        }
        ShoppingConfig shoppingConfig = (ShoppingConfig) obj;
        if (!unknownFields().equals(shoppingConfig.unknownFields()) || !Internal.equals(this.enable, shoppingConfig.enable) || !Internal.equals(this.enable_user, shoppingConfig.enable_user) || !Internal.equals(this.order_share_intro_url, shoppingConfig.order_share_intro_url) || !Internal.equals(this.enable_float_video, shoppingConfig.enable_float_video) || !Internal.equals(this.law_window, shoppingConfig.law_window) || !Internal.equals(this.live, shoppingConfig.live) || !Internal.equals(this.disable_want, shoppingConfig.disable_want) || !Internal.equals(this.newbie_help, shoppingConfig.newbie_help) || !Internal.equals(this.disable_card, shoppingConfig.disable_card) || !Internal.equals(this.card_show_duration, shoppingConfig.card_show_duration) || !this.preload_data_wait_duration.equals(shoppingConfig.preload_data_wait_duration)) {
            return false;
        }
        return true;
    }

    public ShoppingConfig(Boolean bool, Boolean bool2, String str, Boolean bool3, Boolean bool4, ShoppingLiveConfig shoppingLiveConfig, Boolean bool5, ShoppingNewbieHelp shoppingNewbieHelp, Boolean bool6, Integer num, Integer num2) {
        this(bool, bool2, str, bool3, bool4, shoppingLiveConfig, bool5, shoppingNewbieHelp, bool6, num, num2, ByteString.EMPTY);
    }

    public ShoppingConfig(Boolean bool, Boolean bool2, String str, Boolean bool3, Boolean bool4, ShoppingLiveConfig shoppingLiveConfig, Boolean bool5, ShoppingNewbieHelp shoppingNewbieHelp, Boolean bool6, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable = bool;
        this.enable_user = bool2;
        this.order_share_intro_url = str;
        this.enable_float_video = bool3;
        this.law_window = bool4;
        this.live = shoppingLiveConfig;
        this.disable_want = bool5;
        this.newbie_help = shoppingNewbieHelp;
        this.disable_card = bool6;
        this.card_show_duration = num;
        this.preload_data_wait_duration = num2;
    }
}
