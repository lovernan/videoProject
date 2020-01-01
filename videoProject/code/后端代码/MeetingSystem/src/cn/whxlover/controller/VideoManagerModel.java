package cn.whxlover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.whxlover.pojo.SubClass;
import cn.whxlover.pojo.TopClass;
import cn.whxlover.pojo.User;
import cn.whxlover.pojo.Video;
import cn.whxlover.service.VideoManagerSer;

@Controller
public class VideoManagerModel {

	@Autowired
	private VideoManagerSer vms;
	
	//1.显示所有用户信息
		@RequestMapping(value = "/index.action",produces = "application/json;charset=utf-8")
		public String  index() {
			List<User> userList = vms.showUserList();
			return "/admin/index";
		}
	
	
	//1.显示所有用户信息
	@RequestMapping(value = "/getAllUser.action",produces = "application/json;charset=utf-8")
	public @ResponseBody List<User> getAllUser() {
		List<User> userList = vms.showUserList();
		return userList;
	}
	//2.未审核通过的视频
	// verified = 0 为未通过(修改了返回类型为List)
	@RequestMapping(value = "/notVerified.action",produces = "application/json;charset=utf-8")
	public @ResponseBody List<Video> notVerified() {
		List<Video> videoList = vms.showNotVerifiedVideoList();
		return videoList;
	}
	//3.通过的视频
	// verified = 1 为通过(修改了返回类型为List)
	@RequestMapping(value = "/passVideo.action",produces = "application/json;charset=utf-8")
	public @ResponseBody List<Video> passVideo(String vid) {
		List<Video> videoList = vms.showVerifiedVideoList();
		return videoList;
	}
	//4.下架视频
	//返回下架是否成功
	@RequestMapping(value = "/cancelVideo.action",produces = "application/json;charset=utf-8")
	public @ResponseBody String cancelVideo(String vid) {
		String isSuccess = vms.cancelVideo(Integer.valueOf(vid));
		return isSuccess;
	}
	
	//5.审核评论
	@RequestMapping(value = "/passReview.action",produces = "application/json;charset=utf-8")
	public @ResponseBody String passReview(String cid) {
		String isSuccess = vms.passReview(cid);
		return isSuccess;
	}
	
	//6.一级分类增加
	@RequestMapping(value = "/addTopClass.action",produces = "application/json;charset=utf-8")
	public @ResponseBody String addTopClass(String classname) {
		String isSuccess = vms.addTopClass(classname);
		return isSuccess;
	}
	
	//7.一级分类的删除
	@RequestMapping(value = "/deleteTopClass.action",produces = "application/json;charset=utf-8")
	public @ResponseBody String deleteTopClass(String cid) {
		//删除sub_class表中所有顶级分类为cid的记录
		String isSuccess = vms.deleteTopClass(cid);
		return isSuccess;
	}
	
	//8.显示所有一级分类
	@RequestMapping(value = "/getAllTopClass.action",produces = "application/json;charset=utf-8")
	public @ResponseBody List<TopClass> getAllClass() {
		//返回一级分类的List(修改了参数)
		List<TopClass> topClassList = vms.showTopClassList();
		return topClassList;
	}
	//9.二级分类增加
	@RequestMapping(value = "/addSubClass.action",produces = "application/json;charset=utf-8")
	public @ResponseBody String addSubClass(String classname) {
		String isSuccess = vms.addSubClass(classname);
		return isSuccess;
	}
	//10.二级分类删除
	@RequestMapping(value = "/deleteSubClass.action",produces = "application/json;charset=utf-8")
	public @ResponseBody String deleteSubClass(String cid) {
		String isSuccess = vms.deleteSubClass(cid);
		return isSuccess;
	}
	//11.二级分类显示
	@RequestMapping(value = "/getAllSubClass.action",produces = "application/json;charset=utf-8")
	public @ResponseBody List<SubClass> getAllSubClass(String TopCid) {
		List<SubClass> subClassList = vms.showSubClassList();
		return subClassList;
	}

	
	
	
}
