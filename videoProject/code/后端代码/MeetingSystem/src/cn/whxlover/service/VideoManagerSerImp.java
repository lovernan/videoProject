package cn.whxlover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.whxlover.mapper.CommentMapper;
import cn.whxlover.mapper.SubClassMapper;
import cn.whxlover.mapper.TopClassMapper;
import cn.whxlover.mapper.UserMapper;
import cn.whxlover.mapper.VideoMapper;
import cn.whxlover.pojo.Comment;
import cn.whxlover.pojo.CommentExample;
import cn.whxlover.pojo.SubClass;
import cn.whxlover.pojo.SubClassExample;
import cn.whxlover.pojo.TopClass;
import cn.whxlover.pojo.TopClassExample;
import cn.whxlover.pojo.User;
import cn.whxlover.pojo.UserExample;
import cn.whxlover.pojo.Video;
import cn.whxlover.pojo.VideoExample;

@Service
public class VideoManagerSerImp implements VideoManagerSer{

	@Autowired
	UserMapper um;
	
	@Autowired
	VideoMapper vm;
	
	@Autowired
	TopClassMapper tpm;
	
	@Autowired
	SubClassMapper sbm;
	
	@Autowired
	CommentMapper cm;
	
	//1
	@Override
	public List<User> showUserList() {
		// 返回所有用户列表
		
		UserExample example = new UserExample();
//		cn.whxlover.pojo.UserExample.Criteria criteria = example.createCriteria();
		List<User> users = um.selectByExample(example);
		return users;
	}

	//2
	@Override
	public List<Video> showNotVerifiedVideoList() {
		// 返回所有未通过的视频列表
		VideoExample example = new VideoExample(); 
		cn.whxlover.pojo.VideoExample.Criteria criteria = example.createCriteria();
		criteria.andVerifiedEqualTo(0);
		List<Video> videos = vm.selectByExample(example);
		return videos;
	}

	//3
	@Override
	public List<Video> showVerifiedVideoList() {
		// 返回所有已通过的视频列表
		VideoExample example = new VideoExample(); 
		cn.whxlover.pojo.VideoExample.Criteria criteria = example.createCriteria();
		criteria.andVerifiedEqualTo(1);
		List<Video> videos = vm.selectByExample(example);
		return videos;
	}

	//4
	@Override
	public String cancelVideo(int vid) {
		// 删除指定vid的视频
		VideoExample example = new VideoExample();
		cn.whxlover.pojo.VideoExample.Criteria criteria = example.createCriteria();
		criteria.andVidEqualTo(vid);
		int success = vm.deleteByExample(example);
		return (success == 0) ? "fail" : "success";
	}
	
	//5
	@Override
	public String passReview(String cid) {
		//读取需要更新的评论，并将评论的verified修改为1
		CommentExample example = new CommentExample();
		cn.whxlover.pojo.CommentExample.Criteria criteria = example.createCriteria();
		criteria.andVidEqualTo(Integer.valueOf(cid));
		Comment comment = cm.selectByPrimaryKey(Integer.valueOf(cid));
		comment.setVerified(1);
		int success = cm.updateByExample(comment, example);
		return (success == 0) ? "fail" : "success";
	}
	//6
	@Override
	public String addTopClass(String classname) {
		// 添加顶级分类
		TopClass topClass = new TopClass();
		topClass.setClassName(classname);
		int success = tpm.insert(topClass);
		return (success == 0) ? "fail" : "success";
	}

	//7
	@Override
	public String deleteTopClass(String cid) {
		// 删除顶级分类
		TopClassExample example = new TopClassExample();
		cn.whxlover.pojo.TopClassExample.Criteria criteria = example.createCriteria();
		criteria.andTopIdEqualTo(Integer.valueOf(cid));
		int success = tpm.deleteByExample(example);
		return (success == 0) ? "fail" : "success";
	}

	//8
	@Override
	public List<TopClass> showTopClassList() {
		// TODO Auto-generated method stub
		TopClassExample example = new TopClassExample();
		List<TopClass> list = tpm.selectByExample(example);
		return list;
	}

	//9
	@Override
	public String addSubClass(String classname) {
		// TODO Auto-generated method stub
		SubClass subClass = new SubClass();
		subClass.setClassName(classname);
		int success = sbm.insert(subClass);
		return (success == 0) ? "fail" : "success";
	}

	//10
	@Override
	public String deleteSubClass(String cid) {
		// TODO Auto-generated method stub
		SubClassExample example = new SubClassExample();
		cn.whxlover.pojo.SubClassExample.Criteria criteria = example.createCriteria();
		criteria.andSubIdEqualTo(Integer.valueOf(cid));
		int success = sbm.deleteByExample(example);
		return (success == 0) ? "fail" : "success";
	}

	//11
	@Override
	public List<SubClass> showSubClassList() {
		// TODO Auto-generated method stub
		SubClassExample example = new SubClassExample();
		List<SubClass> list = sbm.selectByExample(example);
		return list;
	}
	

}
