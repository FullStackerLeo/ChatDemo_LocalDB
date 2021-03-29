package com.maxi.chatdemo.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Transcript {
    @PrimaryKey(autoGenerate = true)
    int id;

    String UserId;
    String UserName;
    String UserHeadIcon;
    String UserContent;
    String time;
    int type;
    int messagetype;
    float UserVoiceTime;
    String UserVoicePath;
    String UserVoiceUrl;
    int sendState;
    String imageUrl;
    String imageIconUrl;
    String imageLocal;

    public int  getId()       { return this.id; }
    public void setId(int id) {        this.id = id;    }
    public String getUserId() {        return this.UserId;    }
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }
    public String getUserName() {
        return this.UserName;
    }
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    public String getUserHeadIcon() {
        return this.UserHeadIcon;
    }
    public void setUserHeadIcon(String UserHeadIcon) {
        this.UserHeadIcon = UserHeadIcon;
    }
    public String getUserContent() {
        return this.UserContent;
    }
    public void setUserContent(String UserContent) {
        this.UserContent = UserContent;
    }
    public String getTime() {
        return this.time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public int getType() {
        return this.type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getMessagetype() {
        return this.messagetype;
    }
    public void setMessagetype(int messagetype) {
        this.messagetype = messagetype;
    }
    public float getUserVoiceTime() {
        return this.UserVoiceTime;
    }
    public void setUserVoiceTime(float UserVoiceTime) {
        this.UserVoiceTime = UserVoiceTime;
    }
    public String getUserVoicePath() {
        return this.UserVoicePath;
    }
    public void setUserVoicePath(String UserVoicePath) {
        this.UserVoicePath = UserVoicePath;
    }
    public String getUserVoiceUrl() {
        return this.UserVoiceUrl;
    }
    public void setUserVoiceUrl(String UserVoiceUrl) {
        this.UserVoiceUrl = UserVoiceUrl;
    }
    public int getSendState() {
        return this.sendState;
    }
    public void setSendState(int sendState) {
        this.sendState = sendState;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getImageIconUrl() {
        return this.imageIconUrl;
    }
    public void setImageIconUrl(String imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
    }
    public String getImageLocal() {
        return this.imageLocal;
    }
    public void setImageLocal(String imageLocal) {
        this.imageLocal = imageLocal;
    }
}