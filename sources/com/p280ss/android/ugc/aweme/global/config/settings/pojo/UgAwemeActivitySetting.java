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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting */
public final class UgAwemeActivitySetting extends Message<UgAwemeActivitySetting, Builder> {
    public static final DefaultValueProtoAdapter<UgAwemeActivitySetting> ADAPTER = new ProtoAdapter_UgAwemeActivitySetting();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long activity_end_time;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String activity_id;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long activity_start_time;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks#ADAPTER", label = 2, tag = 10)
    public final List<UgActivityTasks> activity_tasks;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup#ADAPTER", tag = 7)
    public final UgChannelPopup channel_popup;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean is_new_user;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgLoginBanner#ADAPTER", tag = 8)
    public final UgLoginBanner login_banner;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant#ADAPTER", tag = 6)
    public final UgNewFeedPendant new_feed_pendant;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean overall_switch;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton#ADAPTER", tag = 11)
    public final UgProfileActivityButton profile_activity_button;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileTabGuide#ADAPTER", tag = 9)
    public final UgProfileTabGuide profile_tab_guide;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UgAwemeActivitySetting, Builder> {
        public Long activity_end_time;
        public String activity_id;
        public Long activity_start_time;
        public List<UgActivityTasks> activity_tasks = Internal.newMutableList();
        public UgChannelPopup channel_popup;
        public Boolean is_new_user;
        public UgLoginBanner login_banner;
        public UgNewFeedPendant new_feed_pendant;
        public Boolean overall_switch;
        public UgProfileActivityButton profile_activity_button;
        public UgProfileTabGuide profile_tab_guide;

        public final UgAwemeActivitySetting build() {
            UgAwemeActivitySetting ugAwemeActivitySetting = new UgAwemeActivitySetting(this.activity_id, this.activity_start_time, this.activity_end_time, this.overall_switch, this.is_new_user, this.new_feed_pendant, this.channel_popup, this.login_banner, this.profile_tab_guide, this.activity_tasks, this.profile_activity_button, super.buildUnknownFields());
            return ugAwemeActivitySetting;
        }

        public final Builder activity_end_time(Long l) {
            this.activity_end_time = l;
            return this;
        }

        public final Builder activity_id(String str) {
            this.activity_id = str;
            return this;
        }

        public final Builder activity_start_time(Long l) {
            this.activity_start_time = l;
            return this;
        }

        public final Builder channel_popup(UgChannelPopup ugChannelPopup) {
            this.channel_popup = ugChannelPopup;
            return this;
        }

        public final Builder is_new_user(Boolean bool) {
            this.is_new_user = bool;
            return this;
        }

        public final Builder login_banner(UgLoginBanner ugLoginBanner) {
            this.login_banner = ugLoginBanner;
            return this;
        }

        public final Builder new_feed_pendant(UgNewFeedPendant ugNewFeedPendant) {
            this.new_feed_pendant = ugNewFeedPendant;
            return this;
        }

        public final Builder overall_switch(Boolean bool) {
            this.overall_switch = bool;
            return this;
        }

        public final Builder profile_activity_button(UgProfileActivityButton ugProfileActivityButton) {
            this.profile_activity_button = ugProfileActivityButton;
            return this;
        }

        public final Builder profile_tab_guide(UgProfileTabGuide ugProfileTabGuide) {
            this.profile_tab_guide = ugProfileTabGuide;
            return this;
        }

        public final Builder activity_tasks(List<UgActivityTasks> list) {
            Internal.checkElementsNotNull(list);
            this.activity_tasks = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting$ProtoAdapter_UgAwemeActivitySetting */
    static final class ProtoAdapter_UgAwemeActivitySetting extends DefaultValueProtoAdapter<UgAwemeActivitySetting> {
        public final UgAwemeActivitySetting redact(UgAwemeActivitySetting ugAwemeActivitySetting) {
            return ugAwemeActivitySetting;
        }

        public ProtoAdapter_UgAwemeActivitySetting() {
            super(FieldEncoding.LENGTH_DELIMITED, UgAwemeActivitySetting.class);
        }

        public final UgAwemeActivitySetting decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UgAwemeActivitySetting) null);
        }

        public final int encodedSize(UgAwemeActivitySetting ugAwemeActivitySetting) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, ugAwemeActivitySetting.activity_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, ugAwemeActivitySetting.activity_start_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, ugAwemeActivitySetting.activity_end_time) + ProtoAdapter.BOOL.encodedSizeWithTag(4, ugAwemeActivitySetting.overall_switch) + ProtoAdapter.BOOL.encodedSizeWithTag(5, ugAwemeActivitySetting.is_new_user) + UgNewFeedPendant.ADAPTER.encodedSizeWithTag(6, ugAwemeActivitySetting.new_feed_pendant) + UgChannelPopup.ADAPTER.encodedSizeWithTag(7, ugAwemeActivitySetting.channel_popup) + UgLoginBanner.ADAPTER.encodedSizeWithTag(8, ugAwemeActivitySetting.login_banner) + UgProfileTabGuide.ADAPTER.encodedSizeWithTag(9, ugAwemeActivitySetting.profile_tab_guide) + UgActivityTasks.ADAPTER.asRepeated().encodedSizeWithTag(10, ugAwemeActivitySetting.activity_tasks) + UgProfileActivityButton.ADAPTER.encodedSizeWithTag(11, ugAwemeActivitySetting.profile_activity_button) + ugAwemeActivitySetting.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UgAwemeActivitySetting ugAwemeActivitySetting) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, ugAwemeActivitySetting.activity_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, ugAwemeActivitySetting.activity_start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, ugAwemeActivitySetting.activity_end_time);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, ugAwemeActivitySetting.overall_switch);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, ugAwemeActivitySetting.is_new_user);
            UgNewFeedPendant.ADAPTER.encodeWithTag(protoWriter, 6, ugAwemeActivitySetting.new_feed_pendant);
            UgChannelPopup.ADAPTER.encodeWithTag(protoWriter, 7, ugAwemeActivitySetting.channel_popup);
            UgLoginBanner.ADAPTER.encodeWithTag(protoWriter, 8, ugAwemeActivitySetting.login_banner);
            UgProfileTabGuide.ADAPTER.encodeWithTag(protoWriter, 9, ugAwemeActivitySetting.profile_tab_guide);
            UgActivityTasks.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, ugAwemeActivitySetting.activity_tasks);
            UgProfileActivityButton.ADAPTER.encodeWithTag(protoWriter, 11, ugAwemeActivitySetting.profile_activity_button);
            protoWriter.writeBytes(ugAwemeActivitySetting.unknownFields());
        }

        public final UgAwemeActivitySetting decode(ProtoReader protoReader, UgAwemeActivitySetting ugAwemeActivitySetting) throws IOException {
            Builder builder;
            UgAwemeActivitySetting ugAwemeActivitySetting2 = (UgAwemeActivitySetting) C10938a.m32097a().mo26425a(UgAwemeActivitySetting.class, ugAwemeActivitySetting);
            if (ugAwemeActivitySetting2 != null) {
                builder = ugAwemeActivitySetting2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<UgActivityTasks> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.activity_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.activity_start_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.activity_end_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.overall_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 5:
                            builder.is_new_user((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 6:
                            builder.new_feed_pendant((UgNewFeedPendant) UgNewFeedPendant.ADAPTER.decode(protoReader, builder.new_feed_pendant));
                            break;
                        case 7:
                            builder.channel_popup((UgChannelPopup) UgChannelPopup.ADAPTER.decode(protoReader, builder.channel_popup));
                            break;
                        case 8:
                            builder.login_banner((UgLoginBanner) UgLoginBanner.ADAPTER.decode(protoReader, builder.login_banner));
                            break;
                        case 9:
                            builder.profile_tab_guide((UgProfileTabGuide) UgProfileTabGuide.ADAPTER.decode(protoReader, builder.profile_tab_guide));
                            break;
                        case 10:
                            newMutableList.add(UgActivityTasks.ADAPTER.decode(protoReader, C10938a.m32097a().mo26424a(UgActivityTasks.class)));
                            break;
                        case 11:
                            builder.profile_activity_button((UgProfileActivityButton) UgProfileActivityButton.ADAPTER.decode(protoReader, builder.profile_activity_button));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (ugAwemeActivitySetting2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.activity_tasks = newMutableList;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<UgActivityTasks> getActivityTasks() {
        return this.activity_tasks;
    }

    public final Long getActivityEndTime() throws NullValueException {
        if (this.activity_end_time != null) {
            return this.activity_end_time;
        }
        throw new NullValueException();
    }

    public final String getActivityId() throws NullValueException {
        if (this.activity_id != null) {
            return this.activity_id;
        }
        throw new NullValueException();
    }

    public final Long getActivityStartTime() throws NullValueException {
        if (this.activity_start_time != null) {
            return this.activity_start_time;
        }
        throw new NullValueException();
    }

    public final UgChannelPopup getChannelPopup() throws NullValueException {
        if (this.channel_popup != null) {
            return this.channel_popup;
        }
        throw new NullValueException();
    }

    public final Boolean getIsNewUser() throws NullValueException {
        if (this.is_new_user != null) {
            return this.is_new_user;
        }
        throw new NullValueException();
    }

    public final UgLoginBanner getLoginBanner() throws NullValueException {
        if (this.login_banner != null) {
            return this.login_banner;
        }
        throw new NullValueException();
    }

    public final UgNewFeedPendant getNewFeedPendant() throws NullValueException {
        if (this.new_feed_pendant != null) {
            return this.new_feed_pendant;
        }
        throw new NullValueException();
    }

    public final Boolean getOverallSwitch() throws NullValueException {
        if (this.overall_switch != null) {
            return this.overall_switch;
        }
        throw new NullValueException();
    }

    public final UgProfileActivityButton getProfileActivityButton() throws NullValueException {
        if (this.profile_activity_button != null) {
            return this.profile_activity_button;
        }
        throw new NullValueException();
    }

    public final UgProfileTabGuide getProfileTabGuide() throws NullValueException {
        if (this.profile_tab_guide != null) {
            return this.profile_tab_guide;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.activity_id = this.activity_id;
        builder.activity_start_time = this.activity_start_time;
        builder.activity_end_time = this.activity_end_time;
        builder.overall_switch = this.overall_switch;
        builder.is_new_user = this.is_new_user;
        builder.new_feed_pendant = this.new_feed_pendant;
        builder.channel_popup = this.channel_popup;
        builder.login_banner = this.login_banner;
        builder.profile_tab_guide = this.profile_tab_guide;
        builder.activity_tasks = Internal.copyOf("activity_tasks", this.activity_tasks);
        builder.profile_activity_button = this.profile_activity_button;
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
        if (this.activity_id != null) {
            i = this.activity_id.hashCode();
        } else {
            i = 0;
        }
        int i12 = (hashCode + i) * 37;
        if (this.activity_start_time != null) {
            i2 = this.activity_start_time.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (i12 + i2) * 37;
        if (this.activity_end_time != null) {
            i3 = this.activity_end_time.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 37;
        if (this.overall_switch != null) {
            i4 = this.overall_switch.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 37;
        if (this.is_new_user != null) {
            i5 = this.is_new_user.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 37;
        if (this.new_feed_pendant != null) {
            i6 = this.new_feed_pendant.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 37;
        if (this.channel_popup != null) {
            i7 = this.channel_popup.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 37;
        if (this.login_banner != null) {
            i8 = this.login_banner.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 37;
        if (this.profile_tab_guide != null) {
            i9 = this.profile_tab_guide.hashCode();
        } else {
            i9 = 0;
        }
        int hashCode2 = (((i19 + i9) * 37) + this.activity_tasks.hashCode()) * 37;
        if (this.profile_activity_button != null) {
            i11 = this.profile_activity_button.hashCode();
        }
        int i20 = hashCode2 + i11;
        this.hashCode = i20;
        return i20;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.activity_id != null) {
            sb.append(", activity_id=");
            sb.append(this.activity_id);
        }
        if (this.activity_start_time != null) {
            sb.append(", activity_start_time=");
            sb.append(this.activity_start_time);
        }
        if (this.activity_end_time != null) {
            sb.append(", activity_end_time=");
            sb.append(this.activity_end_time);
        }
        if (this.overall_switch != null) {
            sb.append(", overall_switch=");
            sb.append(this.overall_switch);
        }
        if (this.is_new_user != null) {
            sb.append(", is_new_user=");
            sb.append(this.is_new_user);
        }
        if (this.new_feed_pendant != null) {
            sb.append(", new_feed_pendant=");
            sb.append(this.new_feed_pendant);
        }
        if (this.channel_popup != null) {
            sb.append(", channel_popup=");
            sb.append(this.channel_popup);
        }
        if (this.login_banner != null) {
            sb.append(", login_banner=");
            sb.append(this.login_banner);
        }
        if (this.profile_tab_guide != null) {
            sb.append(", profile_tab_guide=");
            sb.append(this.profile_tab_guide);
        }
        if (!this.activity_tasks.isEmpty()) {
            sb.append(", activity_tasks=");
            sb.append(this.activity_tasks);
        }
        if (this.profile_activity_button != null) {
            sb.append(", profile_activity_button=");
            sb.append(this.profile_activity_button);
        }
        StringBuilder replace = sb.replace(0, 2, "UgAwemeActivitySetting{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UgAwemeActivitySetting)) {
            return false;
        }
        UgAwemeActivitySetting ugAwemeActivitySetting = (UgAwemeActivitySetting) obj;
        if (!unknownFields().equals(ugAwemeActivitySetting.unknownFields()) || !Internal.equals(this.activity_id, ugAwemeActivitySetting.activity_id) || !Internal.equals(this.activity_start_time, ugAwemeActivitySetting.activity_start_time) || !Internal.equals(this.activity_end_time, ugAwemeActivitySetting.activity_end_time) || !Internal.equals(this.overall_switch, ugAwemeActivitySetting.overall_switch) || !Internal.equals(this.is_new_user, ugAwemeActivitySetting.is_new_user) || !Internal.equals(this.new_feed_pendant, ugAwemeActivitySetting.new_feed_pendant) || !Internal.equals(this.channel_popup, ugAwemeActivitySetting.channel_popup) || !Internal.equals(this.login_banner, ugAwemeActivitySetting.login_banner) || !Internal.equals(this.profile_tab_guide, ugAwemeActivitySetting.profile_tab_guide) || !this.activity_tasks.equals(ugAwemeActivitySetting.activity_tasks) || !Internal.equals(this.profile_activity_button, ugAwemeActivitySetting.profile_activity_button)) {
            return false;
        }
        return true;
    }

    public UgAwemeActivitySetting(String str, Long l, Long l2, Boolean bool, Boolean bool2, UgNewFeedPendant ugNewFeedPendant, UgChannelPopup ugChannelPopup, UgLoginBanner ugLoginBanner, UgProfileTabGuide ugProfileTabGuide, List<UgActivityTasks> list, UgProfileActivityButton ugProfileActivityButton) {
        this(str, l, l2, bool, bool2, ugNewFeedPendant, ugChannelPopup, ugLoginBanner, ugProfileTabGuide, list, ugProfileActivityButton, ByteString.EMPTY);
    }

    public UgAwemeActivitySetting(String str, Long l, Long l2, Boolean bool, Boolean bool2, UgNewFeedPendant ugNewFeedPendant, UgChannelPopup ugChannelPopup, UgLoginBanner ugLoginBanner, UgProfileTabGuide ugProfileTabGuide, List<UgActivityTasks> list, UgProfileActivityButton ugProfileActivityButton, ByteString byteString) {
        super(ADAPTER, byteString);
        this.activity_id = str;
        this.activity_start_time = l;
        this.activity_end_time = l2;
        this.overall_switch = bool;
        this.is_new_user = bool2;
        this.new_feed_pendant = ugNewFeedPendant;
        this.channel_popup = ugChannelPopup;
        this.login_banner = ugLoginBanner;
        this.profile_tab_guide = ugProfileTabGuide;
        this.activity_tasks = Internal.immutableCopyOf("activity_tasks", list);
        this.profile_activity_button = ugProfileActivityButton;
    }
}
