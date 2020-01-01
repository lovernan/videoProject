package cn.whxlover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.whxlover.mapper.CommentMapper;
import cn.whxlover.mapper.ComplaintMapper;
import cn.whxlover.mapper.HistoryMapper;
import cn.whxlover.mapper.UserMapper;
import cn.whxlover.mapper.VideoMapper;
import cn.whxlover.pojo.Comment;
import cn.whxlover.pojo.CommentExample;
import cn.whxlover.pojo.Complaint;
import cn.whxlover.pojo.History;
import cn.whxlover.pojo.HistoryExample;
import cn.whxlover.pojo.User;
import cn.whxlover.pojo.UserExample;
import cn.whxlover.pojo.UserExample.Criteria;
import cn.whxlover.pojo.Video;
import cn.whxlover.pojo.VideoExample;

@Service
public class VideoUserSerImp implements VideoUserSer {

	@Autowired
	private VideoMapper vm;
	@Autowired
	private UserMapper um;
	@Autowired
	private CommentMapper cm;
	@Autowired
	ComplaintMapper com;
	@Autowired
	HistoryMapper hm;



	@Override
	public Video searchVideo(String vid) {
		// TODO Auto-generated method stub
		VideoExample example = new VideoExample();
//		

		cn.whxlover.pojo.VideoExample.Criteria critera = example.createCriteria();
		critera.andVidEqualTo(Integer.valueOf(vid));
		List<Video> list = vm.selectByExample(example);
		return list.get(0);
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		
		int i = um.insert(user);
		return i;
	}

	@Override
	public User searchUser(String avator) {
		// TODO Auto-generated method stub
		
		UserExample example = new UserExample();
		Criteria critera = example.createCriteria();
		critera.andAvatorEqualTo(avator);
		List<User> list = um.selectByExample(example);
		return list.get(0);
	}

	@Override
	public int insertVideo(Video video) {
		// TODO Auto-generated method stub
		int i = vm.insert(video);
		return i;
	}

	@Override
	public User selectid(String avator) {
		// TODO Auto-generated method stub
		
		UserExample example = new UserExample();
		Criteria critera = example.createCriteria();
		critera.andAvatorEqualTo(avator);
		List<User> list = um.selectByExample(example);
		return list.get(0);
	}

	@Override
	public List<Video> searchAllvideo() {
		// TODO Auto-generated method stub
		VideoExample example = new VideoExample();
		List<Video> list = vm.selectByExample(example);
		return list;
	}



	@Override
	public int insertComent(Comment coment) {
		// TODO Auto-generated method stub
		int i = cm.insert(coment);
		return i;
	}


	
	
	
	@Override
	public String insertHistory(History history) {
		// ����һ����ʷ��¼
		
		int i = hm.insert(history);
		if(i>0) {
			return "success";
		}else {
			return "fail";
		}
		
	}


	@Override
	public String deleteHistory(String vid, String uid) {
		// ɾ��ĳ����ʷ��¼�����سɹ���ʧ��
		HistoryExample example = new HistoryExample();
		cn.whxlover.pojo.HistoryExample.Criteria critera = example.createCriteria();
		critera.andHidEqualTo(Integer.valueOf(vid));
		critera.andUidEqualTo(Integer.valueOf(uid));
		
		int i = hm.deleteByExample(example);
		if(i > 0) {
			return "success";
		}
		else {
			return "fail";
		}
	}

	@Override
	public String addComment(Comment comment) {
		// ���һ�����ۼ�¼
		int success = cm.insert(comment);
		if(success > 0) {
			return "success";
		}else
			return "fail";
	}

	@Override
	public String addComplaint(Complaint complaint) {
		// ���һ��Ͷ�߼�¼
		System.out.println("complain");
		int success = com.insert(complaint);
		return (success == 0)? "fail" : "success";
	}

	@Override
	public String addReply(Comment comment) {
		// ���һ��Ͷ�߼�¼
		int success = cm.insert(comment);
		return (success == 0)? "fail" : "success";
	}

	@Override
	public List<Video> showUserVideos(String uid) {
		// TODO Auto-generated method stub
		VideoExample example = new VideoExample();
		cn.whxlover.pojo.VideoExample.Criteria critera = example.createCriteria();
		critera.andUidEqualTo(Integer.valueOf(uid));
		List<Video> list = vm.selectByExample(example);
		return list;
	}

	@Override
	public List<Comment> getAllComment(String vid) {
		// TODO Auto-generated method stub
		CommentExample example = new CommentExample();
		cn.whxlover.pojo.CommentExample.Criteria critera = example.createCriteria();
		critera.andVidEqualTo(Integer.parseInt(vid));
		List<Comment> list = cm.selectByExample(example);
		return list;
	}

	@Override
	public List<History> searchHistory(String uid) {
		// TODO Auto-generated method stub
		HistoryExample example = new HistoryExample();
		example.setOrderByClause("hid desc");
		cn.whxlover.pojo.HistoryExample.Criteria critera = example.createCriteria();
		critera.andUidEqualTo(Integer.parseInt(uid));
		List<History> list = hm.selectByExample(example);
		
		
		return list;
	}

	@Override
	public List<Video> searchClassVideo(String id) {
		// TODO Auto-generated method stub
		VideoExample example = new VideoExample();
		cn.whxlover.pojo.VideoExample.Criteria critera = example.createCriteria();
		critera.andSubclassEqualTo(Integer.parseInt(id));
		List<Video> list = vm.selectByExample(example);
		return list;
	}

	@Override
	public List<Video> searchByVideoName(String videoname) {
		// TODO Auto-generated method stub
		VideoExample example = new VideoExample();
		cn.whxlover.pojo.VideoExample.Criteria critera = example.createCriteria();
		critera.andVideonameLike("%"+videoname+"%");
		List<Video> list = vm.selectByExample(example);
		return list;
	}

	@Override
	public int updataUserScore(String vid, String score) {
		// TODO Auto-generated method stub
		User example = new User();
		example.setUid(Integer.valueOf(vid));
		example.setScore(Integer.valueOf(score));
		int i = um.updateByPrimaryKeySelective(example);
		
		return i;
	}




	
}
