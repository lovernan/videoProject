package cn.whxlover.service;

import java.util.List;

import cn.whxlover.pojo.SubClass;
import cn.whxlover.pojo.TopClass;
import cn.whxlover.pojo.User;
import cn.whxlover.pojo.Video;

public interface VideoManagerSer {

	List<User> showUserList();

	List<Video> showNotVerifiedVideoList();

	List<Video> showVerifiedVideoList();

	String cancelVideo(int vid);

	String addTopClass(String classname);

	String deleteTopClass(String cid);

	List<TopClass> showTopClassList();

	String addSubClass(String classname);

	String deleteSubClass(String cid);

	List<SubClass> showSubClassList();

	String passReview(String cid);

}
