package com.teleca.jamendo.adapter;

import java.io.Serializable;
import java.util.List;

public class Song implements Serializable {

    private static final long serialVersionUID = 240024038459276255L;
    public String id;
    public String userName;// 用户名
    public String portrait;// 用户名头像
    public String songName;//歌曲名
    public String image; // 歌曲背景图片
    public String commentCount; // 评论数量
    public String shareCount; // 分享数量
    public String praiseCount; // 点赞数量
    public String collectCount; //喜欢（收藏）数量
    public String fanCount; //粉丝数量
    public String currCount;//串烧已经加入人次
    public String maxCount;//串烧参与歌曲总人次
    public String listenCount;//歌曲收听数量
    public String description; // 歌曲描述
    public String distance; // 距离
    public String songUrl;
    public int songDuration;
    public String createTime;
    public String lyric; //歌词
    public int hasCollect;
    public int hasPraise;
    public int hasFocus;
    public String category; //歌曲类型：4种，吐槽；说唱；串烧；battle
    public List<String> images; //歌曲背景
    public int status;//歌曲状态，如合成中、失败等等

    /**
     * battle
     */
    public String senderIcon; // 发起者头像
    public String senderName; // 发起者用户名
    public String senderScore; // 发起者支持人数
    public String senderDescription;//发起者宣言
    public String senderSongUrl; // 发起者音乐url地址
    public int senderDuration; // 发起者音乐时长
    public String senderLyric; // 发起者歌词
    public String userId; // 发起者ID
    public String tag;  //新旧标签


    public String challengerIcon; //挑战者头像
    public String challengerName; // 挑战者用户名
    public String challengerScore; // 挑战者支持人数
    public String challengerDescription; // 挑战者宣言
    public String challengerSongUrl; // 挑战者音乐url地址
    public int challengerDuration; //挑战者音乐时长
    public String challengerLyric; // 挑战者歌词

    public String songFilePath;
    public String parentId;
    public String  shareHtmlUrl;//分享url
}
